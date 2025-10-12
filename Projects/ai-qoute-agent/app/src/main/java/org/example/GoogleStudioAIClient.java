package org.example;

import okhttp3.*;
import org.json.JSONObject;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Thin wrapper around Google Studio AI / Gemini API for text generation.
 */
public class GoogleStudioAIClient {
    private static final Logger LOG = Logger.getLogger(GoogleStudioAIClient.class.getName());

    private static final String API_KEY = System.getenv("GOOGLE_API_KEY");
    private static final String MODEL = "models/gemini-2.5-flash";
    private static final String API_URL =
            "https://generativelanguage.googleapis.com/v1beta/" + MODEL + ":generateContent?key=" + API_KEY;

    private final OkHttpClient client;

    public GoogleStudioAIClient() {
        if (API_KEY == null) {
            throw new RuntimeException("GOOGLE_API_KEY is not set in environment variables.");
        }
        this.client = new OkHttpClient.Builder()
                .callTimeout(java.time.Duration.ofSeconds(60))
                .build();
    }

    public String complete(String prompt, Long maxTokens) {
        try {
            JSONObject requestJson = new JSONObject()
                    .put("input", new JSONObject()
                            .put("text", prompt)
                            .put("maxOutputTokens", maxTokens != null ? maxTokens : 200));

            RequestBody body = RequestBody.create(
                    requestJson.toString(),
                    MediaType.get("application/json; charset=utf-8")
            );

            Request request = new Request.Builder()
                    .url(API_URL)
                    .post(body)
                    .build();

            try (Response response = client.newCall(request).execute()) {
                if (!response.isSuccessful()) {
                    throw new RuntimeException("Google Studio API request failed: " +
                            response.code() + " " + response.message());
                }

                String responseBody = response.body().string();
                JSONObject json = new JSONObject(responseBody);

                // Extract generated text (adjust if actual API differs)
                return json.optString("output_text", "No response from Google Studio AI").trim();
            }

        } catch (IOException ex) {
            LOG.log(Level.SEVERE, "Google Studio AI request failed: " + ex.getMessage(), ex);
            throw new RuntimeException(
                    "Failed to get a response from Google Studio AI. Check GOOGLE_API_KEY, network, and model access.", ex);
        }
    }
}