package ДЗ6;

//Есть некоторый текст. Реализуйте следующую функциональность
//■ Изменить текст таким образом, чтобы каждое предложение начиналось с большой буквы;
//■ Посчитайте сколько раз цифры встречаются в тексте;
//■ Посчитайте сколько раз знаки препинания встречаются в тексте;
//■ Посчитайте количество предложений в тексте.
public class DZ3 {
    public static void main(String[] args) {
        String text = "привет. меня зовут Фндрей! как дела? что делаешь.";
        String[] strs = text.split("[.?!]");
        String  punct = ".,?;:!";
        char [] p = punct.toCharArray();
        char [] txt = text.toCharArray();
        int count = 0;
        int punctuation = 0;
        int sent = 0;
        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < txt.length; j++) {
                if (p[i] == txt[j]) {
                    punctuation++;
                }
            }
        }
        for (int i = 0; i < strs.length; i++) {
            strs[i] = strs[i].trim();
            sent = strs.length;
            char[] chars = strs[i].toCharArray();
            chars[0] = Character.toUpperCase(strs[i].charAt(0));
            for (int j = 0; j < chars.length; j++) {
                if (Character.isDigit(chars[j])) {
                    count++;
                }
            }
            strs[i] = new String(chars);
            System.out.print(strs[i] + ". ");
        }
        System.out.println();
        System.out.println("Digits - " + count);
        System.out.println("Punct " + punctuation);
        System.out.println("Sentences " + sent);
    }
}
