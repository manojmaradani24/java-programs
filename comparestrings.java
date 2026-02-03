class comparestrings {
    public static void main(String[] args) {
        String s1 = "Code";
        String s2 = "Code";
        int flag = 0;
        if (s1.length() != s2.length()) {
            flag = 1;
        } else {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    flag = 1;
                    break;
                }
            }
        }
        if (flag == 0)
            System.out.println("Strings are equal");
        else
            System.out.println("Strings are not equal");
    }
}