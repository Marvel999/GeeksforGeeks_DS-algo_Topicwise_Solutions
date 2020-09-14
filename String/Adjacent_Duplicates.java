package String;

public class Adjacent_Duplicates {
    public static void main(String[] args) {

    }
    public String removeDuplicates(String S) {
        int length = S.length();
        while (true) {
            S = S.replaceAll("(\\w)\\1", "");
            if (length == S.length()) {
                break;
            }
            length = S.length();
        }
        return S;
    }
}
