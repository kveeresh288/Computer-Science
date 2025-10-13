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
        String studentName = (args.length >= 1 && !args[0].isBlank()) ? 
        args[0] : "Karan";
        String focusArea = (args.length >= 2 && !args[1].isBlank()) ? 
        args[1] : "MERN Stack";

        GoogleStudioAIClient client = new GoogleStudioAIClient();
        AIMotivationalQuoteAgent agent = new AIMotivationalQuoteAgent(client);

        try {
            String advice = agent.generateAdvice(studentName, focusArea);
            Path out = Paths.get("gpt_output.txt");
            writeUtf8(out, studentName, focusArea, advice);

            LOG.info(() -> "Advice generated and written to: " + out.toAbsolutePath());
            System.out.println("SUCCESS: Wrote advice to " + out.toAbsolutePath());

            
            openFile(out);

        } catch (Exception ex) {
            LOG.log(Level.SEVERE, "AI generation failed: " + ex.getMessage(), ex);
            System.err.println("ERROR: " + ex.getMessage());
            System.exit(1);
        }
    }

    private static void writeUtf8(Path path, String studentName, String focusArea, String content) throws IOException {
        String header = """
                =========================
                AI Motivational Quote Agent
                Timestamp: %s
                Student: %s
                Focus Area: %s
                =========================

                """.formatted(LocalDateTime.now(), studentName, focusArea);

        Files.writeString(path, header + content + System.lineSeparator(), StandardCharsets.UTF_8,
                StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.WRITE);
    }

    // Opens the file automatically using the default text editor
    private static void openFile(Path path) {
        try {
            String os = System.getProperty("os.name").toLowerCase();
            if (os.contains("mac")) {
                new ProcessBuilder("open", path.toString()).start();
            } else if (os.contains("win")) {
                new ProcessBuilder("cmd", "/c", "start", path.toString()).start();
            } else if (os.contains("nux")) {
                new ProcessBuilder("xdg-open", path.toString()).start();
            } else {
                System.out.println("⚠️  Unsupported OS — cannot auto-open file.");
            }
        } catch (IOException e) {
            System.err.println("⚠️  Could not open the output file automatically: " + e.getMessage());
        }
    }
}