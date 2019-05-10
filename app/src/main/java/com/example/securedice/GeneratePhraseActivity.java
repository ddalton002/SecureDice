package com.example.securedice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.SecureRandom;
import java.util.HashMap;


public class GeneratePhraseActivity extends AppCompatActivity {

    HashMap<Integer, HashMap<Integer, HashMap<Integer,String>>> wordMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generate_phrase);
        Bundle extras = getIntent().getExtras();
        String totalWords = extras.getString("WordCount");
        String flags = extras.getString("Flags");
        String selection = extras.getString("Selection");
        wordMap = wordList(selection);
        int words = Integer.parseInt(totalWords);
        if (words <= 0) {
            words = 1;
        }
        String phrase = "";
        for (int i = 0; i < 5; i ++) {
            phrase += (returnPhrase(words, flags, wordMap) + "\n\n");
        }
        /*
        boolean stuff = false;
        String Hat;
        if (String.valueOf(selection).equals("Game of Thrones")) {
            stuff = String.valueOf(selection).equals("Game of Thrones");
            Hat = String.valueOf(stuff);
            phrase += Hat;
            phrase += "GoT";
        } else if (String.valueOf(selection).equals("Star Trek")) {
            stuff = String.valueOf(selection).equals("Star Trek");
            Hat = String.valueOf(stuff);
            phrase += Hat;
            phrase += "STK";
        } else if (String.valueOf(selection).equals("Harry Potter")) {
            stuff = String.valueOf(selection).equals("Harry Potter");
            Hat = String.valueOf(stuff);
            phrase += Hat;
            phrase += "HP";
        } else if (String.valueOf(selection).equals("Star Wars")){
            stuff = String.valueOf(selection).equals("Star Wars");
            Hat = String.valueOf(stuff);
            phrase += Hat;
            phrase += "STW";
        }*/

        final TextView outputList = findViewById(R.id.listOutput);
        outputList.setText(phrase);
    }

    public void generatePhrase(View view) {
        Bundle extras = getIntent().getExtras();
        String totalWords = extras.getString("WordCount");
        String flags = extras.getString("Flags");
        int words = Integer.parseInt(totalWords);
        if (words <= 0) {
            words = 1;
        }
        String phrase = "";
        for (int i = 0; i < 5; i ++) {
            phrase += (returnPhrase(words, flags, wordMap) + "\n\n");
        }
        final TextView outputList = findViewById(R.id.listOutput);
        outputList.setText(phrase);
    }

    int randomGenerator(int range) {
        SecureRandom rand = new SecureRandom();
        return rand.nextInt(range);
    }

    String returnPhrase(int words, String flags, HashMap map) {
        HashMap<Integer, HashMap<Integer, HashMap<Integer,String>>> list = map;
        String phrase = "";
        for (int i = 0; i < words; i++) {
            int index1 = (randomGenerator(10) + 1);
            int index2 = (randomGenerator(20) + 1);
            int index3 = (randomGenerator(20) + 1);
            phrase += list.get(index1).get(index2).get(index3);
            //phrase += index1 + " ";
            //phrase += index2 + " ";
            //phrase += index3 + " ";
        }
        String character = "";

        if (flags.equals("CharNum") || flags.equals("Char")) {
            int specChar = randomGenerator(8);
            if (specChar == 0) {
                character = "!";
            } else if (specChar == 1) {
                character = "@";
            } else if (specChar == 2) {
                character = "#";
            } else if (specChar == 3) {
                character = "$";
            } else if (specChar == 4) {
                character = "%";
            } else if (specChar == 5) {
                character = "^";
            } else if (specChar == 6) {
                character = "&";
            } else {
                character = "*";
            }
            int special = randomGenerator(2);
            if (special == 0) {
                character += phrase;
                phrase = character;
            } else {
                phrase += "@";
            }
        }
        if (flags.equals("CharNum") || flags.equals("Num")) {
            int num = randomGenerator(2);
            if (num == 0) {
                int number = (randomGenerator(9) + 1);
                String add = Integer.toString(number);
                add += phrase;
                return add;
            } else {
                int number = (randomGenerator(9) + 1);
                String add = Integer.toString(number);
                phrase += add;
            }
        }
        return phrase;
    }

    HashMap wordList(String selection) {
        HashMap<Integer, HashMap<Integer, HashMap<Integer,String>>> wordList = new HashMap<>();

        HashMap<Integer, HashMap<Integer,String>> subList1 = new HashMap<>();
        HashMap<Integer, HashMap<Integer,String>> subList2 = new HashMap<>();
        HashMap<Integer, HashMap<Integer,String>> subList3 = new HashMap<>();
        HashMap<Integer, HashMap<Integer,String>> subList4 = new HashMap<>();
        HashMap<Integer, HashMap<Integer,String>> subList5 = new HashMap<>();
        HashMap<Integer, HashMap<Integer,String>> subList6 = new HashMap<>();
        HashMap<Integer, HashMap<Integer,String>> subList7 = new HashMap<>();
        HashMap<Integer, HashMap<Integer,String>> subList8 = new HashMap<>();
        HashMap<Integer, HashMap<Integer,String>> subList9 = new HashMap<>();
        HashMap<Integer, HashMap<Integer,String>> subList10 = new HashMap<>();

        HashMap<Integer,String> actualList1 = new HashMap<>();
        HashMap<Integer,String> actualList2 = new HashMap<>();
        HashMap<Integer,String> actualList3 = new HashMap<>();
        HashMap<Integer,String> actualList4 = new HashMap<>();
        HashMap<Integer,String> actualList5 = new HashMap<>();
        HashMap<Integer,String> actualList6 = new HashMap<>();
        HashMap<Integer,String> actualList7 = new HashMap<>();
        HashMap<Integer,String> actualList8 = new HashMap<>();
        HashMap<Integer,String> actualList9 = new HashMap<>();
        HashMap<Integer,String> actualList10 = new HashMap<>();
        HashMap<Integer,String> actualList11 = new HashMap<>();
        HashMap<Integer,String> actualList12 = new HashMap<>();
        HashMap<Integer,String> actualList13 = new HashMap<>();
        HashMap<Integer,String> actualList14 = new HashMap<>();
        HashMap<Integer,String> actualList15 = new HashMap<>();
        HashMap<Integer,String> actualList16 = new HashMap<>();
        HashMap<Integer,String> actualList17 = new HashMap<>();
        HashMap<Integer,String> actualList18 = new HashMap<>();
        HashMap<Integer,String> actualList19 = new HashMap<>();
        HashMap<Integer,String> actualList20 = new HashMap<>();
        HashMap<Integer,String> actualList21 = new HashMap<>();
        HashMap<Integer,String> actualList22 = new HashMap<>();
        HashMap<Integer,String> actualList23 = new HashMap<>();
        HashMap<Integer,String> actualList24 = new HashMap<>();
        HashMap<Integer,String> actualList25 = new HashMap<>();
        HashMap<Integer,String> actualList26 = new HashMap<>();
        HashMap<Integer,String> actualList27 = new HashMap<>();
        HashMap<Integer,String> actualList28 = new HashMap<>();
        HashMap<Integer,String> actualList29 = new HashMap<>();
        HashMap<Integer,String> actualList30 = new HashMap<>();
        HashMap<Integer,String> actualList31 = new HashMap<>();
        HashMap<Integer,String> actualList32 = new HashMap<>();
        HashMap<Integer,String> actualList33 = new HashMap<>();
        HashMap<Integer,String> actualList34 = new HashMap<>();
        HashMap<Integer,String> actualList35 = new HashMap<>();
        HashMap<Integer,String> actualList36 = new HashMap<>();
        HashMap<Integer,String> actualList37 = new HashMap<>();
        HashMap<Integer,String> actualList38 = new HashMap<>();
        HashMap<Integer,String> actualList39 = new HashMap<>();
        HashMap<Integer,String> actualList40 = new HashMap<>();
        HashMap<Integer,String> actualList41 = new HashMap<>();
        HashMap<Integer,String> actualList42 = new HashMap<>();
        HashMap<Integer,String> actualList43 = new HashMap<>();
        HashMap<Integer,String> actualList44 = new HashMap<>();
        HashMap<Integer,String> actualList45 = new HashMap<>();
        HashMap<Integer,String> actualList46 = new HashMap<>();
        HashMap<Integer,String> actualList47 = new HashMap<>();
        HashMap<Integer,String> actualList48 = new HashMap<>();
        HashMap<Integer,String> actualList49 = new HashMap<>();
        HashMap<Integer,String> actualList50 = new HashMap<>();
        HashMap<Integer,String> actualList51 = new HashMap<>();
        HashMap<Integer,String> actualList52 = new HashMap<>();
        HashMap<Integer,String> actualList53 = new HashMap<>();
        HashMap<Integer,String> actualList54 = new HashMap<>();
        HashMap<Integer,String> actualList55 = new HashMap<>();
        HashMap<Integer,String> actualList56 = new HashMap<>();
        HashMap<Integer,String> actualList57 = new HashMap<>();
        HashMap<Integer,String> actualList58 = new HashMap<>();
        HashMap<Integer,String> actualList59 = new HashMap<>();
        HashMap<Integer,String> actualList60 = new HashMap<>();
        HashMap<Integer,String> actualList61 = new HashMap<>();
        HashMap<Integer,String> actualList62 = new HashMap<>();
        HashMap<Integer,String> actualList63 = new HashMap<>();
        HashMap<Integer,String> actualList64 = new HashMap<>();
        HashMap<Integer,String> actualList65 = new HashMap<>();
        HashMap<Integer,String> actualList66 = new HashMap<>();
        HashMap<Integer,String> actualList67 = new HashMap<>();
        HashMap<Integer,String> actualList68 = new HashMap<>();
        HashMap<Integer,String> actualList69 = new HashMap<>();
        HashMap<Integer,String> actualList70 = new HashMap<>();
        HashMap<Integer,String> actualList71 = new HashMap<>();
        HashMap<Integer,String> actualList72 = new HashMap<>();
        HashMap<Integer,String> actualList73 = new HashMap<>();
        HashMap<Integer,String> actualList74 = new HashMap<>();
        HashMap<Integer,String> actualList75 = new HashMap<>();
        HashMap<Integer,String> actualList76 = new HashMap<>();
        HashMap<Integer,String> actualList77 = new HashMap<>();
        HashMap<Integer,String> actualList78 = new HashMap<>();
        HashMap<Integer,String> actualList79 = new HashMap<>();
        HashMap<Integer,String> actualList80 = new HashMap<>();
        HashMap<Integer,String> actualList81 = new HashMap<>();
        HashMap<Integer,String> actualList82 = new HashMap<>();
        HashMap<Integer,String> actualList83 = new HashMap<>();
        HashMap<Integer,String> actualList84 = new HashMap<>();
        HashMap<Integer,String> actualList85 = new HashMap<>();
        HashMap<Integer,String> actualList86 = new HashMap<>();
        HashMap<Integer,String> actualList87 = new HashMap<>();
        HashMap<Integer,String> actualList88 = new HashMap<>();
        HashMap<Integer,String> actualList89 = new HashMap<>();
        HashMap<Integer,String> actualList90 = new HashMap<>();
        HashMap<Integer,String> actualList91 = new HashMap<>();
        HashMap<Integer,String> actualList92 = new HashMap<>();
        HashMap<Integer,String> actualList93 = new HashMap<>();
        HashMap<Integer,String> actualList94 = new HashMap<>();
        HashMap<Integer,String> actualList95 = new HashMap<>();
        HashMap<Integer,String> actualList96 = new HashMap<>();
        HashMap<Integer,String> actualList97 = new HashMap<>();
        HashMap<Integer,String> actualList98 = new HashMap<>();
        HashMap<Integer,String> actualList99 = new HashMap<>();
        HashMap<Integer,String> actualList100 = new HashMap<>();
        HashMap<Integer,String> actualList101 = new HashMap<>();
        HashMap<Integer,String> actualList102 = new HashMap<>();
        HashMap<Integer,String> actualList103 = new HashMap<>();
        HashMap<Integer,String> actualList104 = new HashMap<>();
        HashMap<Integer,String> actualList105 = new HashMap<>();
        HashMap<Integer,String> actualList106 = new HashMap<>();
        HashMap<Integer,String> actualList107 = new HashMap<>();
        HashMap<Integer,String> actualList108 = new HashMap<>();
        HashMap<Integer,String> actualList109 = new HashMap<>();
        HashMap<Integer,String> actualList110 = new HashMap<>();
        HashMap<Integer,String> actualList111 = new HashMap<>();
        HashMap<Integer,String> actualList112 = new HashMap<>();
        HashMap<Integer,String> actualList113 = new HashMap<>();
        HashMap<Integer,String> actualList114 = new HashMap<>();
        HashMap<Integer,String> actualList115 = new HashMap<>();
        HashMap<Integer,String> actualList116 = new HashMap<>();
        HashMap<Integer,String> actualList117 = new HashMap<>();
        HashMap<Integer,String> actualList118 = new HashMap<>();
        HashMap<Integer,String> actualList119 = new HashMap<>();
        HashMap<Integer,String> actualList120 = new HashMap<>();
        HashMap<Integer,String> actualList121 = new HashMap<>();
        HashMap<Integer,String> actualList122 = new HashMap<>();
        HashMap<Integer,String> actualList123 = new HashMap<>();
        HashMap<Integer,String> actualList124 = new HashMap<>();
        HashMap<Integer,String> actualList125 = new HashMap<>();
        HashMap<Integer,String> actualList126 = new HashMap<>();
        HashMap<Integer,String> actualList127 = new HashMap<>();
        HashMap<Integer,String> actualList128 = new HashMap<>();
        HashMap<Integer,String> actualList129 = new HashMap<>();
        HashMap<Integer,String> actualList130 = new HashMap<>();
        HashMap<Integer,String> actualList131 = new HashMap<>();
        HashMap<Integer,String> actualList132 = new HashMap<>();
        HashMap<Integer,String> actualList133 = new HashMap<>();
        HashMap<Integer,String> actualList134 = new HashMap<>();
        HashMap<Integer,String> actualList135 = new HashMap<>();
        HashMap<Integer,String> actualList136 = new HashMap<>();
        HashMap<Integer,String> actualList137 = new HashMap<>();
        HashMap<Integer,String> actualList138 = new HashMap<>();
        HashMap<Integer,String> actualList139 = new HashMap<>();
        HashMap<Integer,String> actualList140 = new HashMap<>();
        HashMap<Integer,String> actualList141 = new HashMap<>();
        HashMap<Integer,String> actualList142 = new HashMap<>();
        HashMap<Integer,String> actualList143 = new HashMap<>();
        HashMap<Integer,String> actualList144 = new HashMap<>();
        HashMap<Integer,String> actualList145 = new HashMap<>();
        HashMap<Integer,String> actualList146 = new HashMap<>();
        HashMap<Integer,String> actualList147 = new HashMap<>();
        HashMap<Integer,String> actualList148 = new HashMap<>();
        HashMap<Integer,String> actualList149 = new HashMap<>();
        HashMap<Integer,String> actualList150 = new HashMap<>();
        HashMap<Integer,String> actualList151 = new HashMap<>();
        HashMap<Integer,String> actualList152 = new HashMap<>();
        HashMap<Integer,String> actualList153 = new HashMap<>();
        HashMap<Integer,String> actualList154 = new HashMap<>();
        HashMap<Integer,String> actualList155 = new HashMap<>();
        HashMap<Integer,String> actualList156 = new HashMap<>();
        HashMap<Integer,String> actualList157 = new HashMap<>();
        HashMap<Integer,String> actualList158 = new HashMap<>();
        HashMap<Integer,String> actualList159 = new HashMap<>();
        HashMap<Integer,String> actualList160 = new HashMap<>();
        HashMap<Integer,String> actualList161 = new HashMap<>();
        HashMap<Integer,String> actualList162 = new HashMap<>();
        HashMap<Integer,String> actualList163 = new HashMap<>();
        HashMap<Integer,String> actualList164 = new HashMap<>();
        HashMap<Integer,String> actualList165 = new HashMap<>();
        HashMap<Integer,String> actualList166 = new HashMap<>();
        HashMap<Integer,String> actualList167 = new HashMap<>();
        HashMap<Integer,String> actualList168 = new HashMap<>();
        HashMap<Integer,String> actualList169 = new HashMap<>();
        HashMap<Integer,String> actualList170 = new HashMap<>();
        HashMap<Integer,String> actualList171 = new HashMap<>();
        HashMap<Integer,String> actualList172 = new HashMap<>();
        HashMap<Integer,String> actualList173 = new HashMap<>();
        HashMap<Integer,String> actualList174 = new HashMap<>();
        HashMap<Integer,String> actualList175 = new HashMap<>();
        HashMap<Integer,String> actualList176 = new HashMap<>();
        HashMap<Integer,String> actualList177 = new HashMap<>();
        HashMap<Integer,String> actualList178 = new HashMap<>();
        HashMap<Integer,String> actualList179 = new HashMap<>();
        HashMap<Integer,String> actualList180 = new HashMap<>();
        HashMap<Integer,String> actualList181 = new HashMap<>();
        HashMap<Integer,String> actualList182 = new HashMap<>();
        HashMap<Integer,String> actualList183 = new HashMap<>();
        HashMap<Integer,String> actualList184 = new HashMap<>();
        HashMap<Integer,String> actualList185 = new HashMap<>();
        HashMap<Integer,String> actualList186 = new HashMap<>();
        HashMap<Integer,String> actualList187 = new HashMap<>();
        HashMap<Integer,String> actualList188 = new HashMap<>();
        HashMap<Integer,String> actualList189 = new HashMap<>();
        HashMap<Integer,String> actualList190 = new HashMap<>();
        HashMap<Integer,String> actualList191 = new HashMap<>();
        HashMap<Integer,String> actualList192 = new HashMap<>();
        HashMap<Integer,String> actualList193 = new HashMap<>();
        HashMap<Integer,String> actualList194 = new HashMap<>();
        HashMap<Integer,String> actualList195 = new HashMap<>();
        HashMap<Integer,String> actualList196 = new HashMap<>();
        HashMap<Integer,String> actualList197 = new HashMap<>();
        HashMap<Integer,String> actualList198 = new HashMap<>();
        HashMap<Integer,String> actualList199 = new HashMap<>();
        HashMap<Integer,String> actualList200 = new HashMap<>();

        BufferedReader reader;
        int listIndex = 1;
        try {
            String filename = String.valueOf(selection);
            if (String.valueOf(filename).equals("Game of Thrones")) {
                reader = new BufferedReader((new InputStreamReader(getAssets().open("gameofthrones.txt"))));
            } else if (String.valueOf(filename).equals("Star Trek")) {
                reader = new BufferedReader((new InputStreamReader(getAssets().open("startrek.txt"))));
            } else if (String.valueOf(filename).equals("Harry Potter")) {
                reader = new BufferedReader((new InputStreamReader(getAssets().open("harrypotter.txt"))));
            } else {
                reader = new BufferedReader((new InputStreamReader(getAssets().open("starwars.txt"))));
            }
            String word;
            while((word = reader.readLine()) != null) {
                if (listIndex <= 20) {
                    actualList1.put(listIndex, word);
                } else if (listIndex > 20 && listIndex < 41) {
                    actualList2.put((listIndex - 20), word);
                } else if (listIndex > 40 && listIndex < 61) {
                    actualList3.put((listIndex - 40), word);
                } else if (listIndex > 60 && listIndex < 81) {
                    actualList4.put((listIndex - 60), word);
                } else if (listIndex > 80 && listIndex < 101){
                    actualList5.put((listIndex - 80), word);
                } else if (listIndex > 100 && listIndex < 121) {
                    actualList6.put((listIndex - 100), word);
                } else if (listIndex > 120 && listIndex < 141) {
                    actualList7.put((listIndex - 120), word);
                } else if (listIndex > 140 && listIndex < 161) {
                    actualList8.put((listIndex - 140), word);
                } else if (listIndex > 160 && listIndex < 181) {
                    actualList9.put((listIndex - 160), word);
                } else if (listIndex > 180 && listIndex < 201) {
                    actualList10.put((listIndex - 180), word);
                } else if (listIndex > 200 && listIndex < 221) {
                    actualList11.put((listIndex - 200), word);
                } else if (listIndex > 220 && listIndex < 241) {
                    actualList12.put((listIndex - 220), word);
                } else if (listIndex > 240 && listIndex < 261) {
                    actualList13.put((listIndex - 240), word);
                } else if (listIndex > 260 && listIndex < 281) {
                    actualList14.put((listIndex - 260), word);
                } else if (listIndex > 280 && listIndex < 301) {
                    actualList15.put((listIndex - 280), word);
                } else if (listIndex > 300 && listIndex < 321) {
                    actualList16.put((listIndex - 300), word);
                } else if (listIndex > 320 && listIndex < 341) {
                    actualList17.put((listIndex - 320), word);
                } else if (listIndex > 340 && listIndex < 361) {
                    actualList18.put((listIndex - 340), word);
                } else if (listIndex > 360 && listIndex < 381) {
                    actualList19.put((listIndex - 360), word);
                } else if (listIndex > 380 && listIndex < 401) {
                    actualList20.put((listIndex - 380), word);
                } else if (listIndex > 400 && listIndex < 421) {
                    actualList21.put((listIndex - 400), word);
                } else if (listIndex > 420 && listIndex < 441) {
                    actualList22.put((listIndex - 420), word);
                } else if (listIndex > 440 && listIndex < 461) {
                    actualList23.put((listIndex - 440), word);
                } else if (listIndex > 460 && listIndex < 481) {
                    actualList24.put((listIndex - 460), word);
                } else if (listIndex > 480 && listIndex < 501) {
                    actualList25.put((listIndex - 480), word);
                } else if (listIndex > 500 && listIndex < 521) {
                    actualList26.put((listIndex - 500), word);
                } else if (listIndex > 520 && listIndex < 541) {
                    actualList27.put((listIndex - 520), word);
                } else if (listIndex > 540 && listIndex < 561) {
                    actualList28.put((listIndex - 540), word);
                } else if (listIndex > 560 && listIndex < 581) {
                    actualList29.put((listIndex - 560), word);
                } else if (listIndex > 580 && listIndex < 601) {
                    actualList30.put((listIndex - 580), word);
                } else if (listIndex > 600 && listIndex < 621) {
                    actualList31.put((listIndex - 600), word);
                } else if (listIndex > 620 && listIndex < 641) {
                    actualList32.put((listIndex - 620), word);
                } else if (listIndex > 640 && listIndex < 661) {
                    actualList33.put((listIndex - 640), word);
                } else if (listIndex > 660 && listIndex < 681) {
                    actualList34.put((listIndex - 660), word);
                } else if (listIndex > 680 && listIndex < 701) {
                    actualList35.put((listIndex - 680), word);
                } else if (listIndex > 700 && listIndex < 721) {
                    actualList36.put((listIndex - 700), word);
                } else if (listIndex > 720 && listIndex < 741) {
                    actualList37.put((listIndex - 720), word);
                } else if (listIndex > 740 && listIndex < 761) {
                    actualList38.put((listIndex - 740), word);
                } else if (listIndex > 760 && listIndex < 781) {
                    actualList39.put((listIndex - 760), word);
                } else if (listIndex > 780 && listIndex < 801) {
                    actualList40.put((listIndex - 780), word);
                } else if (listIndex > 801 && listIndex < 821) {
                    actualList41.put((listIndex - 800), word);
                } else if (listIndex > 820 && listIndex < 841) {
                    actualList42.put((listIndex - 820), word);
                } else if (listIndex > 840 && listIndex < 861) {
                    actualList43.put((listIndex - 840), word);
                } else if (listIndex > 860 && listIndex < 881) {
                    actualList44.put((listIndex - 860), word);
                } else if (listIndex > 880 && listIndex < 901) {
                    actualList45.put((listIndex - 880), word);
                } else if (listIndex > 900 && listIndex < 921) {
                    actualList46.put((listIndex - 900), word);
                } else if (listIndex > 920 && listIndex < 941) {
                    actualList47.put((listIndex - 920), word);
                } else if (listIndex > 940 && listIndex < 961) {
                    actualList48.put((listIndex - 940), word);
                } else if (listIndex > 960 && listIndex < 981) {
                    actualList49.put((listIndex - 960), word);
                } else if (listIndex > 980 && listIndex < 1001) {
                    actualList50.put((listIndex - 980), word);
                } else if (listIndex > 1000 && listIndex < 1021) {
                    actualList51.put((listIndex - 1000), word);
                } else if (listIndex > 1020 && listIndex < 1041) {
                    actualList52.put((listIndex - 1020), word);
                } else if (listIndex > 1040 && listIndex < 1061) {
                    actualList53.put((listIndex - 1040), word);
                } else if (listIndex > 1060 && listIndex < 1081) {
                    actualList54.put((listIndex - 1060), word);
                } else if (listIndex > 1080 && listIndex < 1101) {
                    actualList55.put((listIndex - 1080), word);
                } else if (listIndex > 1100 && listIndex < 1121) {
                    actualList56.put((listIndex - 1100), word);
                } else if (listIndex > 1120 && listIndex < 1141) {
                    actualList57.put((listIndex - 1120), word);
                } else if (listIndex > 1140 && listIndex < 1161) {
                    actualList58.put((listIndex - 1140), word);
                } else if (listIndex > 1160 && listIndex < 1181) {
                    actualList59.put((listIndex - 1160), word);
                } else if (listIndex > 1180 && listIndex < 1201) {
                    actualList60.put((listIndex - 1180), word);
                } else if (listIndex > 1200 && listIndex < 1221) {
                    actualList61.put((listIndex - 1200), word);
                } else if (listIndex > 1220 && listIndex < 1241) {
                    actualList62.put((listIndex - 1220), word);
                } else if (listIndex > 1240 && listIndex < 1261) {
                    actualList63.put((listIndex - 1240), word);
                } else if (listIndex > 1260 && listIndex < 1281) {
                    actualList64.put((listIndex - 1260), word);
                } else if (listIndex > 1280 && listIndex < 1301) {
                    actualList65.put((listIndex - 1280), word);
                } else if (listIndex > 1300 && listIndex < 1321) {
                    actualList66.put((listIndex - 1300), word);
                } else if (listIndex > 1320 && listIndex < 1341) {
                    actualList67.put((listIndex - 1320), word);
                } else if (listIndex > 1340 && listIndex < 1361) {
                    actualList68.put((listIndex - 1340), word);
                } else if (listIndex > 1360 && listIndex < 1381) {
                    actualList69.put((listIndex - 1360), word);
                } else if (listIndex > 1381 && listIndex < 1401) {
                    actualList70.put((listIndex - 1380), word);
                } else if (listIndex > 1400 && listIndex < 1421) {
                    actualList71.put((listIndex - 1400), word);
                } else if (listIndex > 1420 && listIndex < 1441) {
                    actualList72.put((listIndex - 1420), word);
                } else if (listIndex > 1440 && listIndex < 1461) {
                    actualList73.put((listIndex - 1440), word);
                } else if (listIndex > 1460 && listIndex < 1481) {
                    actualList74.put((listIndex - 1460), word);
                } else if (listIndex > 1480 && listIndex < 1501) {
                    actualList75.put((listIndex - 1480), word);
                } else if (listIndex > 1500 && listIndex < 1521) {
                    actualList76.put((listIndex - 1500), word);
                } else if (listIndex > 1520 && listIndex < 1541) {
                    actualList77.put((listIndex - 1520), word);
                } else if (listIndex > 1540 && listIndex < 1561) {
                    actualList78.put((listIndex - 1540), word);
                } else if (listIndex > 1560 && listIndex < 1581) {
                    actualList79.put((listIndex - 1560), word);
                } else if (listIndex > 1580 && listIndex < 1601) {
                    actualList80.put((listIndex - 1580), word);
                } else if (listIndex > 1600 && listIndex < 1621) {
                    actualList81.put((listIndex - 1600), word);
                } else if (listIndex > 1620 && listIndex < 1641) {
                    actualList82.put((listIndex - 1620), word);
                } else if (listIndex > 1640 && listIndex < 1661) {
                    actualList83.put((listIndex - 1640), word);
                } else if (listIndex > 1660 && listIndex < 1681) {
                    actualList84.put((listIndex - 1660), word);
                } else if (listIndex > 1680 && listIndex < 1701) {
                    actualList85.put((listIndex - 1680), word);
                } else if (listIndex > 1700 && listIndex < 1721) {
                    actualList86.put((listIndex - 1700), word);
                } else if (listIndex > 1720 && listIndex < 1741) {
                    actualList87.put((listIndex - 1720), word);
                } else if (listIndex > 1740 && listIndex < 1761) {
                    actualList88.put((listIndex - 1740), word);
                } else if (listIndex > 1760 && listIndex < 1781) {
                    actualList89.put((listIndex - 1760), word);
                } else if (listIndex > 1780 && listIndex < 1801) {
                    actualList90.put((listIndex - 1780), word);
                } else if (listIndex > 1800 && listIndex < 1821) {
                    actualList91.put((listIndex - 1800), word);
                } else if (listIndex > 1820 && listIndex < 1841) {
                    actualList92.put((listIndex - 1820), word);
                } else if (listIndex > 1840 && listIndex < 1861) {
                    actualList93.put((listIndex - 1840), word);
                } else if (listIndex > 1860 && listIndex < 1881) {
                    actualList94.put((listIndex - 1860), word);
                } else if (listIndex > 1880 && listIndex < 1901) {
                    actualList95.put((listIndex - 1880), word);
                } else if (listIndex > 1900 && listIndex < 1921) {
                    actualList96.put((listIndex - 1900), word);
                } else if (listIndex > 1920 && listIndex < 1941) {
                    actualList97.put((listIndex - 1920), word);
                } else if (listIndex > 1940 && listIndex < 1961) {
                    actualList98.put((listIndex - 1940), word);
                } else if (listIndex > 1960 && listIndex < 1981) {
                    actualList99.put((listIndex - 1960), word);
                } else if (listIndex > 1980 && listIndex < 2001) {
                    actualList100.put((listIndex - 1980), word);
                } else if (listIndex > 2000 && listIndex < 2021) {
                    actualList101.put((listIndex - 2000), word);
                } else if (listIndex > 2020 && listIndex < 2041) {
                    actualList102.put((listIndex - 2020), word);
                } else if (listIndex > 2040 && listIndex < 2061) {
                    actualList103.put((listIndex - 2040), word);
                } else if (listIndex > 2060 && listIndex < 2081) {
                    actualList104.put((listIndex - 2060), word);
                } else if (listIndex > 2080 && listIndex < 2100) {
                    actualList105.put((listIndex - 2080), word);
                } else if (listIndex > 2100 && listIndex < 2121) {
                    actualList106.put((listIndex - 2100), word);
                } else if (listIndex > 2120 && listIndex < 2141) {
                    actualList107.put((listIndex - 2120), word);
                } else if (listIndex > 2140 && listIndex < 2161) {
                    actualList108.put((listIndex - 2140), word);
                } else if (listIndex > 2160 && listIndex < 2181) {
                    actualList109.put((listIndex - 2160), word);
                } else if (listIndex > 2180 && listIndex < 2201) {
                    actualList110.put((listIndex - 2180), word);
                } else if (listIndex > 2200 && listIndex < 2221) {
                    actualList111.put((listIndex - 2200), word);
                } else if (listIndex > 2220 && listIndex < 2241) {
                    actualList112.put((listIndex - 2220), word);
                } else if (listIndex > 2240 && listIndex < 2261) {
                    actualList113.put((listIndex - 2240), word);
                } else if (listIndex > 2260 && listIndex < 2281) {
                    actualList114.put((listIndex - 2260), word);
                } else if (listIndex > 2280 && listIndex < 2301) {
                    actualList115.put((listIndex - 2280), word);
                } else if (listIndex > 2300 && listIndex < 2321) {
                    actualList116.put((listIndex - 2300), word);
                } else if (listIndex > 2320 && listIndex < 2341) {
                    actualList117.put((listIndex - 2320), word);
                } else if (listIndex > 2340 && listIndex < 2361) {
                    actualList118.put((listIndex - 2340), word);
                } else if (listIndex > 2360 && listIndex < 2381) {
                    actualList119.put((listIndex - 2360), word);
                } else if (listIndex > 2380 && listIndex < 2401) {
                    actualList120.put((listIndex - 2380), word);
                } else if (listIndex > 2400 && listIndex < 2421) {
                    actualList121.put((listIndex - 2400), word);
                } else if (listIndex > 2420 && listIndex < 2441) {
                    actualList122.put((listIndex - 2420), word);
                } else if (listIndex > 2440 && listIndex < 2461) {
                    actualList123.put((listIndex - 2440), word);
                } else if (listIndex > 2460 && listIndex < 2481) {
                    actualList124.put((listIndex - 2460), word);
                } else if (listIndex > 2480 && listIndex < 2501) {
                    actualList125.put((listIndex - 2480), word);
                } else if (listIndex > 2500 && listIndex < 2521) {
                    actualList126.put((listIndex - 2500), word);
                } else if (listIndex > 2520 && listIndex < 2541) {
                    actualList127.put((listIndex - 2520), word);
                } else if (listIndex > 2540 && listIndex < 2561) {
                    actualList128.put((listIndex - 2540), word);
                } else if (listIndex > 2560 && listIndex < 2581) {
                    actualList129.put((listIndex - 2560), word);
                } else if (listIndex > 2580 && listIndex < 2601) {
                    actualList130.put((listIndex - 2580), word);
                } else if (listIndex > 2600 && listIndex < 2621) {
                    actualList131.put((listIndex - 2600), word);
                } else if (listIndex > 2620 && listIndex < 2641) {
                    actualList132.put((listIndex - 2620), word);
                } else if (listIndex > 2640 && listIndex < 2661) {
                    actualList133.put((listIndex - 2640), word);
                } else if (listIndex > 2660 && listIndex < 2681) {
                    actualList134.put((listIndex - 2660), word);
                } else if (listIndex > 2680 && listIndex < 2701) {
                    actualList135.put((listIndex - 2680), word);
                } else if (listIndex > 2700 && listIndex < 2721) {
                    actualList136.put((listIndex - 2700), word);
                } else if (listIndex > 2720 && listIndex < 2741) {
                    actualList137.put((listIndex - 2720), word);
                } else if (listIndex > 2740 && listIndex < 2761) {
                    actualList138.put((listIndex - 2740), word);
                } else if (listIndex > 2760 && listIndex < 2781) {
                    actualList139.put((listIndex - 2760), word);
                } else if (listIndex > 2780 && listIndex < 2801) {
                    actualList140.put((listIndex - 2780), word);
                } else if (listIndex > 2800 && listIndex < 2821) {
                    actualList141.put((listIndex - 2800), word);
                } else if (listIndex > 2820 && listIndex < 2841) {
                    actualList142.put((listIndex - 2820), word);
                } else if (listIndex > 2840 && listIndex < 2861) {
                    actualList143.put((listIndex - 2840), word);
                } else if (listIndex > 2860 && listIndex < 2881) {
                    actualList144.put((listIndex - 2860), word);
                } else if (listIndex > 2880 && listIndex < 2901) {
                    actualList145.put((listIndex - 2800), word);
                } else if (listIndex > 2900 && listIndex < 2921) {
                    actualList146.put((listIndex - 2900), word);
                } else if (listIndex > 2920 && listIndex < 2941) {
                    actualList147.put((listIndex - 2920), word);
                } else if (listIndex > 2940 && listIndex < 2961) {
                    actualList148.put((listIndex - 2940), word);
                } else if (listIndex > 2960 && listIndex < 2981) {
                    actualList149.put((listIndex - 2960), word);
                } else if (listIndex > 2980 && listIndex < 3001) {
                    actualList150.put((listIndex - 2980), word);
                } else if (listIndex > 3000 && listIndex < 3021) {
                    actualList151.put((listIndex - 3000), word);
                } else if (listIndex > 3020 && listIndex < 3041) {
                    actualList152.put((listIndex - 3020), word);
                } else if (listIndex > 3040 && listIndex < 3061) {
                    actualList153.put((listIndex - 3040), word);
                } else if (listIndex > 3060 && listIndex < 3081) {
                    actualList154.put((listIndex - 3060), word);
                } else if (listIndex > 3080 && listIndex < 3101) {
                    actualList155.put((listIndex - 3080), word);
                } else if (listIndex > 3100 && listIndex < 3121) {
                    actualList156.put((listIndex - 3100), word);
                } else if (listIndex > 3120 && listIndex < 3141) {
                    actualList157.put((listIndex - 3120), word);
                } else if (listIndex > 3140 && listIndex < 3161) {
                    actualList158.put((listIndex - 3140), word);
                } else if (listIndex > 3160 && listIndex < 3181) {
                    actualList159.put((listIndex - 3160), word);
                } else if (listIndex > 3180 && listIndex < 3201) {
                    actualList160.put((listIndex - 3180), word);
                } else if (listIndex > 3200 && listIndex < 3221) {
                    actualList161.put((listIndex - 3200), word);
                } else if (listIndex > 3220 && listIndex < 3241) {
                    actualList162.put((listIndex - 3220), word);
                } else if (listIndex > 3240 && listIndex < 3261) {
                    actualList163.put((listIndex - 3240), word);
                } else if (listIndex > 3260 && listIndex < 3281) {
                    actualList164.put((listIndex - 3260), word);
                } else if (listIndex > 3280 && listIndex < 3301) {
                    actualList165.put((listIndex - 3280), word);
                } else if (listIndex > 3300 && listIndex < 3321) {
                    actualList166.put((listIndex - 3300), word);
                } else if (listIndex > 3320 && listIndex < 3341) {
                    actualList167.put((listIndex - 3320), word);
                } else if (listIndex > 3340 && listIndex < 3361) {
                    actualList168.put((listIndex - 3340), word);
                } else if (listIndex > 3360 && listIndex < 3381) {
                    actualList169.put((listIndex - 3360), word);
                } else if (listIndex > 3380 && listIndex < 3401) {
                    actualList170.put((listIndex - 3380), word);
                } else if (listIndex > 3400 && listIndex < 3421) {
                    actualList171.put((listIndex - 3400), word);
                } else if (listIndex > 3420 && listIndex < 3441) {
                    actualList172.put((listIndex - 3420), word);
                } else if (listIndex > 3440 && listIndex < 3461) {
                    actualList173.put((listIndex - 3440), word);
                } else if (listIndex > 3460 && listIndex < 3481) {
                    actualList174.put((listIndex - 3460), word);
                } else if (listIndex > 3480 && listIndex < 3501) {
                    actualList175.put((listIndex - 3480), word);
                } else if (listIndex > 3500 && listIndex < 3521) {
                    actualList176.put((listIndex - 3500), word);
                } else if (listIndex > 3520 && listIndex < 3541) {
                    actualList177.put((listIndex - 3520), word);
                } else if (listIndex > 3540 && listIndex < 3561) {
                    actualList178.put((listIndex - 3540), word);
                } else if (listIndex > 3560 && listIndex < 3581) {
                    actualList179.put((listIndex - 3560), word);
                } else if (listIndex > 3580 && listIndex < 3601) {
                    actualList180.put((listIndex - 3580), word);
                } else if (listIndex > 3600 && listIndex < 3621) {
                    actualList181.put((listIndex - 3600), word);
                } else if (listIndex > 3620 && listIndex < 3641) {
                    actualList182.put((listIndex - 3620), word);
                } else if (listIndex > 3640 && listIndex < 3661) {
                    actualList183.put((listIndex - 3680), word);
                } else if (listIndex > 3660 && listIndex < 3681) {
                    actualList184.put((listIndex - 3660), word);
                } else if (listIndex > 3680 && listIndex < 3701) {
                    actualList185.put((listIndex - 3680), word);
                } else if (listIndex > 3700 && listIndex < 3721) {
                    actualList186.put((listIndex - 3700), word);
                } else if (listIndex > 3720 && listIndex < 3741) {
                    actualList187.put((listIndex - 3720), word);
                } else if (listIndex > 3740 && listIndex < 3761) {
                    actualList188.put((listIndex - 3740), word);
                } else if (listIndex > 3760 && listIndex < 3781) {
                    actualList189.put((listIndex - 3760), word);
                } else if (listIndex > 3780 && listIndex < 3801) {
                    actualList190.put((listIndex - 3780), word);
                } else if (listIndex > 3800 && listIndex < 3821) {
                    actualList191.put((listIndex - 3800), word);
                } else if (listIndex > 3820 && listIndex < 3841) {
                    actualList192.put((listIndex - 3820), word);
                } else if (listIndex > 3840 && listIndex < 3861) {
                    actualList193.put((listIndex - 3840), word);
                } else if (listIndex > 3860 && listIndex < 3881) {
                    actualList194.put((listIndex - 3860), word);
                } else if (listIndex > 3880 && listIndex < 3901) {
                    actualList195.put((listIndex - 3880), word);
                } else if (listIndex > 3900 && listIndex < 3921) {
                    actualList196.put((listIndex - 3900), word);
                } else if (listIndex > 3920 && listIndex < 3941) {
                    actualList197.put((listIndex - 3920), word);
                } else if (listIndex > 3940 && listIndex < 3961) {
                    actualList198.put((listIndex - 3940), word);
                } else if (listIndex > 3960 && listIndex < 3981) {
                    actualList199.put((listIndex - 3960), word);
                } else {
                    actualList200.put((listIndex -3980), word);
                }
                listIndex += 1;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        subList1.put(1,actualList1);
        subList1.put(2,actualList2);
        subList1.put(3,actualList3);
        subList1.put(4,actualList4);
        subList1.put(5,actualList5);
        subList1.put(6,actualList6);
        subList1.put(7,actualList7);
        subList1.put(8,actualList8);
        subList1.put(9,actualList9);
        subList1.put(10,actualList10);
        subList1.put(11,actualList11);
        subList1.put(12,actualList12);
        subList1.put(13,actualList13);
        subList1.put(14,actualList14);
        subList1.put(15,actualList15);
        subList1.put(16,actualList16);
        subList1.put(17,actualList17);
        subList1.put(18,actualList18);
        subList1.put(19,actualList19);
        subList1.put(20,actualList20);
        subList2.put(1,actualList21);
        subList2.put(2,actualList22);
        subList2.put(3,actualList23);
        subList2.put(4,actualList24);
        subList2.put(5,actualList25);
        subList2.put(6,actualList26);
        subList2.put(7,actualList27);
        subList2.put(8,actualList28);
        subList2.put(9,actualList29);
        subList2.put(10,actualList30);
        subList2.put(11,actualList31);
        subList2.put(12,actualList32);
        subList2.put(13,actualList33);
        subList2.put(14,actualList34);
        subList2.put(15,actualList35);
        subList2.put(16,actualList36);
        subList2.put(17,actualList37);
        subList2.put(18,actualList38);
        subList2.put(19,actualList39);
        subList2.put(20,actualList40);
        subList3.put(1,actualList41);
        subList3.put(2,actualList42);
        subList3.put(3,actualList43);
        subList3.put(4,actualList44);
        subList3.put(5,actualList45);
        subList3.put(6,actualList46);
        subList3.put(7,actualList47);
        subList3.put(8,actualList48);
        subList3.put(9,actualList49);
        subList3.put(10,actualList50);
        subList3.put(11,actualList51);
        subList3.put(12,actualList52);
        subList3.put(13,actualList53);
        subList3.put(14,actualList54);
        subList3.put(15,actualList55);
        subList3.put(16,actualList56);
        subList3.put(17,actualList57);
        subList3.put(18,actualList58);
        subList3.put(19,actualList59);
        subList3.put(20,actualList60);
        subList4.put(1,actualList61);
        subList4.put(2,actualList62);
        subList4.put(3,actualList63);
        subList4.put(4,actualList64);
        subList4.put(5,actualList65);
        subList4.put(6,actualList66);
        subList4.put(7,actualList67);
        subList4.put(8,actualList68);
        subList4.put(9,actualList69);
        subList4.put(10,actualList70);
        subList4.put(11,actualList71);
        subList4.put(12,actualList72);
        subList4.put(13,actualList73);
        subList4.put(14,actualList74);
        subList4.put(15,actualList75);
        subList4.put(16,actualList76);
        subList4.put(17,actualList77);
        subList4.put(18,actualList78);
        subList4.put(19,actualList79);
        subList4.put(20,actualList80);
        subList5.put(1,actualList81);
        subList5.put(2,actualList82);
        subList5.put(3,actualList83);
        subList5.put(4,actualList84);
        subList5.put(5,actualList85);
        subList5.put(6,actualList86);
        subList5.put(7,actualList87);
        subList5.put(8,actualList88);
        subList5.put(9,actualList89);
        subList5.put(10,actualList90);
        subList5.put(11,actualList91);
        subList5.put(12,actualList92);
        subList5.put(13,actualList93);
        subList5.put(14,actualList94);
        subList5.put(15,actualList95);
        subList5.put(16,actualList96);
        subList5.put(17,actualList97);
        subList5.put(18,actualList98);
        subList5.put(19,actualList99);
        subList5.put(20,actualList100);
        subList6.put(1,actualList101);
        subList6.put(2,actualList102);
        subList6.put(3,actualList103);
        subList6.put(4,actualList104);
        subList6.put(5,actualList105);
        subList6.put(6,actualList106);
        subList6.put(7,actualList107);
        subList6.put(8,actualList108);
        subList6.put(9,actualList109);
        subList6.put(10,actualList110);
        subList6.put(11,actualList111);
        subList6.put(12,actualList112);
        subList6.put(13,actualList113);
        subList6.put(14,actualList114);
        subList6.put(15,actualList115);
        subList6.put(16,actualList116);
        subList6.put(17,actualList117);
        subList6.put(18,actualList118);
        subList6.put(19,actualList119);
        subList6.put(20,actualList120);
        subList7.put(1,actualList121);
        subList7.put(2,actualList122);
        subList7.put(3,actualList123);
        subList7.put(4,actualList124);
        subList7.put(5,actualList125);
        subList7.put(6,actualList126);
        subList7.put(7,actualList127);
        subList7.put(8,actualList128);
        subList7.put(9,actualList129);
        subList7.put(10,actualList130);
        subList7.put(11,actualList131);
        subList7.put(12,actualList132);
        subList7.put(13,actualList133);
        subList7.put(14,actualList134);
        subList7.put(15,actualList135);
        subList7.put(16,actualList136);
        subList7.put(17,actualList137);
        subList7.put(18,actualList138);
        subList7.put(19,actualList139);
        subList7.put(20,actualList140);
        subList8.put(1,actualList141);
        subList8.put(2,actualList142);
        subList8.put(3,actualList143);
        subList8.put(4,actualList144);
        subList8.put(5,actualList145);
        subList8.put(6,actualList146);
        subList8.put(7,actualList147);
        subList8.put(8,actualList148);
        subList8.put(9,actualList149);
        subList8.put(10,actualList150);
        subList8.put(11,actualList151);
        subList8.put(12,actualList152);
        subList8.put(13,actualList153);
        subList8.put(14,actualList154);
        subList8.put(15,actualList155);
        subList8.put(16,actualList156);
        subList8.put(17,actualList157);
        subList8.put(18,actualList158);
        subList8.put(19,actualList159);
        subList8.put(20,actualList160);
        subList9.put(1,actualList161);
        subList9.put(2,actualList162);
        subList9.put(3,actualList163);
        subList9.put(4,actualList164);
        subList9.put(5,actualList165);
        subList9.put(6,actualList166);
        subList9.put(7,actualList167);
        subList9.put(8,actualList168);
        subList9.put(9,actualList169);
        subList9.put(10,actualList170);
        subList9.put(11,actualList171);
        subList9.put(12,actualList172);
        subList9.put(13,actualList173);
        subList9.put(14,actualList174);
        subList9.put(15,actualList175);
        subList9.put(16,actualList176);
        subList9.put(17,actualList177);
        subList9.put(18,actualList178);
        subList9.put(19,actualList179);
        subList9.put(20,actualList180);
        subList10.put(1,actualList181);
        subList10.put(2,actualList182);
        subList10.put(3,actualList183);
        subList10.put(4,actualList184);
        subList10.put(5,actualList185);
        subList10.put(6,actualList186);
        subList10.put(7,actualList187);
        subList10.put(8,actualList188);
        subList10.put(9,actualList189);
        subList10.put(10,actualList190);
        subList10.put(11,actualList191);
        subList10.put(12,actualList192);
        subList10.put(13,actualList193);
        subList10.put(14,actualList194);
        subList10.put(15,actualList195);
        subList10.put(16,actualList196);
        subList10.put(17,actualList197);
        subList10.put(18,actualList198);
        subList10.put(19,actualList199);
        subList10.put(20,actualList200);

        wordList.put(1, subList1);
        wordList.put(2, subList2);
        wordList.put(3, subList3);
        wordList.put(4, subList4);
        wordList.put(5, subList5);
        wordList.put(6, subList6);
        wordList.put(7, subList7);
        wordList.put(8, subList8);
        wordList.put(9, subList9);
        wordList.put(10, subList10);
        wordList.put(11, subList1);
        wordList.put(12, subList2);
        wordList.put(13, subList3);
        wordList.put(14, subList4);
        wordList.put(15, subList5);
        wordList.put(16, subList6);
        wordList.put(17, subList7);
        wordList.put(18, subList8);
        wordList.put(19, subList9);
        wordList.put(20, subList10);

        return wordList;
    }
}
