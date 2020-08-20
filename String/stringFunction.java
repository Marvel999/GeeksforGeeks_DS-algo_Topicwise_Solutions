package StringInJava;

import java.lang.reflect.Array;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;

public class stringFunction {

    public static void  main(String[] args){
        boolean b=Character.isLowerCase('m');
        System.out.println(b);
        System.out.println( Math.pow(2,3));
        int n=9;
        String s=Integer.toString(n);
        char CH='A';
        String s1="";
        int[] arr=new int[12];

        s1=s1+Character.toString(CH);
        char[] cj=s.toCharArray();

        String b1= new String(cj);
        Arrays.sort(cj);

        System.out.println();
        String  res= java.time.format.DateTimeFormatter.ofPattern("EEEE")
                .format(java.time.LocalDate.of(2020, 11, 20));
        System.out.println(res);
        //axifraphic larger.
        System.out.println("Small".compareTo("Too"));

        NumberFormat.getCurrencyInstance(Locale.US).format(2122);

//        Calendar cal = Calendar.getInstance();
//        cal.setWeekDate(2020,2011,20);
//         System.out.println(cal.get(Calendar.DAY_OF_MONTH));
         System.out.println(LocalDate.of(2020, 11, 20).getDayOfWeek().name());
    }
}



class Comparator{
    boolean compare(String s1,String s2){
        if(s1.equals(s2))
            return true;
        else
            return false;
    }
    boolean compare(int num1,int num2){
        if(num1==num2)
            return true;
        else
            return false;
    }

    boolean compare(int[] arr1,int[] arr2){
        boolean b=false;
        if(arr1.length==arr2.length){
            for(int i=0;i<arr1.length-1;i++){
                if(arr1[i]==arr2[i]){
                    b=true;
                }else{
                    b= false;
                    break;
                }
            }
            return b;}
        else
            return false;
    }


}