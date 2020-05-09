class Solution {
    public boolean isPerfectSquare(int num) {
        float val = 0, fnum;
        fnum = num;
        val = (float)(Math.pow(fnum, 0.5));
        System.out.println((int)val);
        int iVal = (int) val;
        if((iVal * iVal) == num)
            return true;
        else
            return false;
    }
}
