package API;

import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class MotivationalAgent {

    private static final String API_KEY = System.getenv("GOOGLE_API_KEY"); //Use Your Own Api Key 
    private static final String MODEL = "models/gemini-2.5-flash"; 
    private static final String API_URL =
        "https://generativelanguage.googleapis.com/v1beta/" + MODEL + ":generateContent?key=" + API_KEY;

    public static void main(String[] args) {
        try {
            URI uri = new URI(API_URL);
            HttpURLConnection conn = (HttpURLConnection) uri.toURL().openConnection();

            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
            conn.setDoOutput(true);

            String prompt = "{ \"contents\": [{ \"parts\": [{ \"text\": \"give me a short , powerful motivational quote in Kannada.\" }] }] }";

            try (OutputStream os = conn.getOutputStream()) {
                os.write(prompt.getBytes(StandardCharsets.UTF_8));
            }

            int status = conn.getResponseCode();
            InputStream inputStream = (status < 400) ? conn.getInputStream() : conn.getErrorStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));

            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            // 🌟 Extract quote text manually
            String res = response.toString();
            String quote = "";

            int idx = res.indexOf("\"text\":");
            if (idx != -1) {
                int start = res.indexOf("\"", idx + 7) + 1;
                int end = res.indexOf("\"", start);
                quote = res.substring(start, end);
            }

            System.out.println("\n🌟 Motivational Quote From API 🌟\n");
            System.out.println(quote);
            System.out.println("API Responsed");

        } catch (Exception e) {
            System.err.println("❌ Error fetching quote:");
            e.printStackTrace();
        }
    }
}


//Output Sample 

// (base) kveeresh@Ks-MacBook-Air-2 API % javac -Xlint MotivationalAgent.java
// (base) kveeresh@Ks-MacBook-Air-2 API % java MotivationalAgent.java        

// 🌟 Motivational Quote From API 🌟

// **ಸಾಧ್ಯವಿದೆ, ಸಾಧಿಸು!**\n\n(Sādhyavide, Sādhisu!)\n\n**Meaning:** It is possible, achieve!
// API Responsed

// (base) kveeresh@Ks-MacBook-Air-2 API % 