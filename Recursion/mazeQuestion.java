package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class mazeQuestion {
    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
        int dr=sc.nextInt();
        int dc=sc.nextInt();
        System.out.println(getMazePaths(1,1,dr,dc));
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sc==dc && sr==dr){
            ArrayList<String> bla=new ArrayList<>();
            return bla;
        }
        ArrayList<String> pathc=new ArrayList<>();
        ArrayList<String> pathv=new ArrayList<>();
        if(sc<dc){
            pathc=getMazePaths(sr,sc+1,dr,dc);

        }
        if(sr<dr){
            pathv=getMazePaths(sr+1,sc,dr,dc);

        }
        ArrayList<String> paths=new ArrayList<>();

        for(String p:pathc){
            paths.add("h"+p);
        }

        for(String p:pathv){
            paths.add("v"+p);
        }

        return paths;

    }
}
