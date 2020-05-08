class Solution {
    public boolean checkStraightLine(int[][] cods) {
        int i, j, n;
        float a, b;
        n = cods.length;
        boolean res = true;
        float x1, x2, x3, y1, y2, y3;
        x1 = x2 = x3 = y1 = y2 = y3 = 0;
        //System.out.print(0 - (-3));
        for(i = 0; i < n; i++)
            System.out.println(cods[i][0] + " " + cods[i][1]);
        if(n == 2)
            return true;
        else{
            for(i = 0; i < n - 2; i++){
                x1 = cods[i][0];
                y1 = cods[i][1];
                x2 = cods[i + 1][0];
                y2 = cods[i + 1][1];
                x3 = cods[i + 2][0];
                y3 = cods[i + 2][1];
                a = (y2 - y1) / (x2 - x1);
                b = (y3 - y2) / (x3 - x2);
                System.out.println(a + " " + b);
                if(a != b){
                    res = false;
                    break;
                }
            }
        }
        return res;
    }
}
