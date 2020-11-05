package com.company;

public class Vigenere {
    public static String encoder(String word, String key) {

        char[][] encryption = new char[26][26];
        char[] alphabet = new char[26];
        int index = 0;
        int repeat = 0;
        String code = "";

        char[] wordChar = word.toCharArray();
        char[] keyChar = key.toCharArray();

        int x = 0;
        int y = 0;

        for (char c = 'a'; c <= 'z'; c++) {
            alphabet[index] = Character.toUpperCase(c);
            index++;
        }

        for (int i = 0; i < encryption.length; i++) {
            index = repeat;
            for (int j = 0; j < encryption[i].length; j++) {
                if (index == 26) {
                    index = 0;
                }
                encryption[i][j] = alphabet[index];
                index++;
            }
            repeat++;
        }

        index = 0;

        for (int k = 0; k < word.length(); k++) {

            if (index == keyChar.length) {
                index = 0;
            }

            if (wordChar[k] == ' ') {
                code += ' ';
                continue;
            }

            for (int l = 0; l < alphabet.length; l++) {
                if (alphabet[l] == Character.toUpperCase(wordChar[k])) {
                    x = l;
                }
                if (alphabet[l] == Character.toUpperCase(keyChar[index])) {
                    y = l;
                }

            }
            index++;
            code += Character.toLowerCase(encryption[y][x]);
        }

        return code;
    }



}
