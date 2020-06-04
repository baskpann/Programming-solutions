class Solution {
    public void reverseString(char[] s) {
        reverseStringUtil(s, 0, s.length - 1); // recursive approach
        
        /* iterative approach
        int i;
        LinkedList <Character> stack = new LinkedList();
        for(char c : s)
            stack.push(c);
        
        for(i = 0; !stack.isEmpty(); i++)
            s[i] = stack.pop();
        */
    }
    private void reverseStringUtil(char[] s, int l, int r){
        if(l >= r)
            return;
        char tmp = s[l];
        s[l] = s[r];
        s[r] = tmp;
        reverseStringUtil(s, l + 1, r - 1);
    }
}