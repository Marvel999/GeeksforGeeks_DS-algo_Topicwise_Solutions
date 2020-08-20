package array_Practice_Question;

public class MinimumDistance {
    public static void main(String[] args) {
        long arr[] = {6, 15, 82, 8, 74, 59, 75, 83, 86, 36, 20, 39, 34, 60};
        long n=14;
        long x=7;
        long y=20;
//        long arr[] = {1,2,3,2};
//        long n=4;
//        long x=1;
//        long y=2;
        long min= minDist(arr,n,x,y);
        System.out.println(min);

    }

      static long minDist(long arr[], long n, long x, long y) {
        int xpos=0;
        int ypos=0;
        int xpos1=0;
        int ypos1=0;
        for(int i=0;i<n;i++){
            if(arr[i]==x && xpos1==0){
                xpos=i;
                xpos1=1;

            }


             if(arr[i]==y && ypos1==0){
                ypos=i;
                ypos1=1;
            }

            if( ypos1==0) {
                ypos=-1;

            }
            if( xpos1==0) {
                xpos=-1;

            }



        }

        if(xpos!=-1 && ypos!=-1){
            long min=xpos-ypos;
            if(min<0)
                return -min;
            else
                return min;
        }
        else{
            return -1;

        }
    }
}
