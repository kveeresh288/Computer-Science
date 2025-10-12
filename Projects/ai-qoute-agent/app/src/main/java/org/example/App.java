package org.example;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * CLI entry point
 */
public class App {
    private static final Logger LOG = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        String studentName = (args.length >= 1 && !args[0].isBlank()) ? args[0] : "student";
        String focusArea = (args.length >= 2 && !args[1].isBlank()) ? args[1] : "DSA and System Design";

        GoogleStudioAIClient client = new GoogleStudioAIClient();
        AIMotivationalQuoteAgent agent = new AIMotivationalQuoteAgent(client);

        try {
            String advice = agent.generateAdvice(studentName, focusArea);
            Path out = Paths.get("gpt_output.txt");
            writeUtf8(out, advice);
            LOG.info(() -> "Advice generated and written to: " + out.toAbsolutePath());
            System.out.println("SUCCESS: Wrote advice to " + out.toAbsolutePath());

        } catch (Exception ex) {
            LOG.log(Level.SEVERE, "AI generation failed: " + ex.getMessage(), ex);
            System.err.println("ERROR: " + ex.getMessage());
            System.exit(1);
        }
    }

    private static void writeUtf8(Path path, String content) throws IOException {
        String header = """
                =========================
                AI Motivational Quote Agent
                Timestamp: %s
                =========================

                """.formatted(LocalDateTime.now());

        Files.writeString(path, header + content + System.lineSeparator(), StandardCharsets.UTF_8,
                StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.WRITE);
    }
}