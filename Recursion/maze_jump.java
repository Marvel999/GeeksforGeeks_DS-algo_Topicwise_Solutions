package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class maze_jump {
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
        if(sc==dc && sc==dc){
            ArrayList<String> bla=new ArrayList<>();
            bla.add("");
            return bla;
        }


        ArrayList<String> paths=new ArrayList<>();
        // ArrayList<String> pathv=new ArrayList<>();
        // ArrayList<String> pathh=new ArrayList<>();
        // ArrayList<String> pathd=new ArrayList<>();

        for(int ms=1;ms<=dr-sr;ms++){
            ArrayList<String> pathv =getMazePaths(sr+ms,sc,dr,dc);
            for(String p:pathv){
                paths.add("v"+ms+p);
            }
        }

        for(int ms=1;ms<=dc-sc ;ms++){
            ArrayList<String> pathh=getMazePaths(sr,sc-ms,dr,dc);
            for(String p:pathh){
                paths.add("h"+ms+p);

            }
        }

        for(int ms=1;ms<=dr-sr && ms<=dc-sc;ms++){
            ArrayList<String> pathd=getMazePaths(sr+ms,sc+ms,dr,dc);
            for(String p:pathd){
                paths.add("d"+ms+p);
            }
        }

        return paths;
    }
}
