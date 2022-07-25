package per.kim;

public class LengthOfLastWord {

    public static int lengthOfLastWord(String s) {
        int length = 0;
        s = s.trim();
        if (!s.contains(" ")) {
            length = s.length();
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                length = s.substring(i+1).length();
            }
        }
        return length;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Helloooo Worldddd    minseo  "));
        System.out.println(lengthOfLastWord("   fly me to the moon "));
        System.out.println(lengthOfLastWord("luffy is still joyboy"));
        System.out.println(lengthOfLastWord("a"));
        
    }
}
