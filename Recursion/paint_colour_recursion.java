package Recursion;

public class paint_colour_recursion {
    public static void main(String[] args){
     int[][] a={{1, 1, 1, 3, 1, 1, 1, 1},
             {1, 1, 1, 1, 1, 1, 0, 0},
             {1, 0, 0, 1, 1, 0, 1, 1},
             {2, 2, 2, 2, 2, 0, 1, 0},
             {1, 1, 1, 2, 2, 0, 1, 0},
             {1, 1, 1, 2, 2, 2, 2, 0},
             {1, 1, 1, 1, 1, 2, 1, 1},
             {1, 1, 1, 1, 1, 2, 2, 1},
     };
//     printrecurstion(a,2,1,1,3);
//        for (int i=0;i<a.length;i++){
//            for(int j=0;j<a[0].length;j++){
//                System.out.print(a[i][j]+" ");
//            }
//            System.out.println();
//        }

        triverse(a,0,0);

    }
    static int cout=0;
    public static void printrecurstion(int[][] arr,int c,int r,int pev,int fill){
        if(c>=arr[0].length || r>=arr.length || c<0 || r<0){
            return;
        }
        if(arr[r][c]!=pev){
            return;
        }
        arr[r][c]=fill;

        printrecurstion(arr,c+1,r,pev,fill);
        printrecurstion(arr,c-1,r,pev,fill);
        printrecurstion(arr,c,r+1,pev,fill);
        printrecurstion(arr,c,r-1,pev,fill);

    }


    public static void triverse(int[][] arr,int c,int r){
        if(r>=arr.length){
//            if(r>=arr.length){
//                System.out.println();
//                return;
//            }
            return;
        }



        if(c<arr[0].length)
        {System.out.print(arr[r][c]+" ");
        triverse(arr,c+1,r);
        }
        else if(r<arr.length){
            c=0;
            System.out.println();
        triverse(arr,c,r+1);

        }

    }
}
