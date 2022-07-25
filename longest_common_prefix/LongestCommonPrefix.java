package per.kim;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        String result = strs[0];
        int idx = result.length();

        if (strs.length > 1) {
            for (int i = 1; i < strs.length; i++) {
                    while (strs[i].indexOf(result) != 0 && idx >= 0) {
                        result = result.substring(0, idx);
                        idx--;
                    }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] strs = new String[]{"fllower", "fllow", "fllight"};
        String[] strs2 = new String[]{"dog", "racecar", "car"};
        String[] strs3 = new String[]{"a"};
        String[] strs4 = new String[]{"c", "acc", "ccc"};
        System.out.println(longestCommonPrefix(strs));
        System.out.println(longestCommonPrefix(strs2));
        System.out.println(longestCommonPrefix(strs3));
        System.out.println(longestCommonPrefix(strs4));
    }
}
