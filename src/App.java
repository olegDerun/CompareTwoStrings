public class App {
    public static void main(String[] args) throws Exception {
        String string1 = new String("Alice");
        String string2 = new String("Alice");
  
        System.out.println("Comparing " + string1 + " and " + string2 + " : " + stringCompare(string1, string2));
    }

    public static int stringCompare(String str1, String str2)
    {
        int l1 = str1.length();
        int l2 = str2.length();
        int lmin = Math.min(l1, l2);
  
        for (int i = 0; i < lmin; i++) {
            int str1_ch = (int)str1.charAt(i);
            int str2_ch = (int)str2.charAt(i);
  
            if (str1_ch != str2_ch) {
                return str1_ch - str2_ch;
            }
        }
  
        if (l1 != l2) {
            return l1 - l2;
        }
  
        else {
            return 0;
        }
    }
}
