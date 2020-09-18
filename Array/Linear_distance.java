package Array;

public class Linear_distance {
    public static int distance(int x1,int y1,int x2,int y2){
        return (int)Math.sqrt(Math.pow(x2 - x1, 2) +
                Math.pow(y2 - y1, 2) * 1.0);
    }
    public static boolean checkStraightLine(int[][] coordinates) {
        int points = coordinates.length;

        int x = coordinates[1][0] - coordinates[0][0];
        int y = coordinates[1][1] - coordinates[0][1];

        int curr_x = 0, curr_y = 0;

        for(int i=2;i<points;i++)
        {
            curr_x = coordinates[i][0] - coordinates[i-1][0];
            curr_y = coordinates[i][1] - coordinates[i-1][1];

            if(y*curr_x != x*curr_y)
                return false;
        }
        return true;
    }


    public static void main(String[] args) {
       
        int[][] arr={{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}};
        System.out.println(checkStraightLine(arr));
    }
}
