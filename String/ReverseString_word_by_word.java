package String;

public class ReverseString_word_by_word {
    public static void main(String[] args) {
        String s="    Hii i am manish";
        String[] spliedStingArray=s.trim().split(" ");
        String output="";
        for(int i=spliedStingArray.length-1;i>=0;i--){
            output=output+spliedStingArray[i]+"  ";
        }
        System.out.println(output.substring(0,output.length()-1));
    }
}
