package com.example.interpreter.Word;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.Scanner;

@Service
public class CardService {

    @Autowired
    private CardRepository repository;
    //    Раньше было:
    //    private SortedMap<String, Definition> dictionary;

    public CardService() {

    }

    public CardRepository getRepository() {
        return repository;
    }

//    public List<Card> getAllCards() {
//        return this.repository.findAll();
//    }
//
//    public Card getCard(String RuWord) {
//        return this.repository.findByWord(RuWord).get(0);
//    }

    public Card addCard(Card c) {
        return this.repository.save(c);
    }

    public Card markViewed(Card c, boolean answeredCorrect) {
        // TODO: if card was shown, we need to remember answer and if it was answered correctly
        Date d = new Date();
        // c.answers.add
        //d.
        return c;
    }

    public String[] translate(String s) {

        try {

            URL url = new URL("https://api.reverso.net/translate/v1/translation");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            conn.setRequestProperty("Accept", "*/*");
            conn.setRequestProperty("Connection", "keep-alive");
            conn.setRequestProperty("User-Agent", "Firefox 31");
            conn.setRequestProperty("Content-Type", "application/json");

            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            OutputStream os = conn.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
            osw.write("{\n" +
                    "  format: 'text',\n" +
                    "  from: 'rus',\n" +
                    "  input: '" + s + "',\n" +
                    "  options: {\n" +
                    "    contextResults: true,\n" +
                    "    languageDetection: true,\n" +
                    "    origin: 'reversomobile',\n" +
                    "    sentenceSplitter: false,\n" +
                    "  },\n" +
                    "  to: 'eng',\n" +
                    "}");
            osw.flush();
            osw.close();
            os.close();

            conn.connect();

            int responsecode = conn.getResponseCode();

            if (responsecode != 200) {
                throw new RuntimeException("HttpResponseCode: " + responsecode);
            } else {

                String inline = "";
                Scanner scanner = new Scanner(conn.getInputStream());
                while (scanner.hasNext()) {
                    inline += scanner.nextLine();
                }
                scanner.close();
                JSONObject response = new JSONObject(inline);

                System.out.println(inline);
                JSONArray translations = response.getJSONArray("translation");

                for (Object translation:
                     translations) {
                    System.out.println(translation);
                }
            }

            conn.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return new String[]{};

    }


}
