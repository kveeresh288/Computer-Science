package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AppTest {
//AIzaSyDJC40UGAaO4wP0Pe6lJLM83xw4N7S_UU8
    @Test
    void testAdviceGeneration() {
        GoogleStudioAIClient client = new GoogleStudioAIClient();
        AIMotivationalQuoteAgent agent = new AIMotivationalQuoteAgent(client);
        String advice = agent.generateAdvice("K Veeresh", "DSA");
        assertNotNull(advice, "Advice should not be null");
    }
}