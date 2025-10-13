package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AppTest {

    @Test
    void testAdviceGeneration() {
        GoogleStudioAIClient client = new GoogleStudioAIClient();
        AIMotivationalQuoteAgent agent = new AIMotivationalQuoteAgent(client);
        String advice = agent.generateAdvice("Veeresh", "MERN");
        assertNotNull(advice, "Advice should not be null");
    }

    private void assertNotNull(String advice, String advice_should_not_be_null) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}