package com.deadpool.harman.heritage;

class DedupChars {
    static String deduplicate(String s) {
        // your code
        StringBuilder bd = new StringBuilder();
        char[] arr = s.toCharArray();

        bd.append(arr[0]);
        for(int j = 1; j < arr.length - 1; j++) {

            if(Character.toLowerCase(arr[j]) != Character.toLowerCase(arr[j+1])) {
                bd.append(arr[j+1]);
            }
        }

        return bd.toString();
    }

    public static void main(String[] args) {
        String input = "Зздрррраавствввууй,    Ссссбееерррр!";
        String expected = "Здравствуй, Сбер!";

        String deduplicated = deduplicate(input);
        System.out.println(deduplicated);
        System.out.println(expected.equals(deduplicated));
}
}
