class Solution {
    public String convert(String s, int numRows) {
        int currRow=0;
        boolean goingDown=false;
        StringBuilder[] rows=new StringBuilder[numRows];
        if(numRows==1) return s;

        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        for(int i=0;i<s.length();i++){
            if (currRow == 0 || currRow == numRows - 1)
                goingDown = !goingDown;
            if(goingDown){
                rows[currRow].append(s.charAt(i));
                currRow+=1;
            }else{
                rows[currRow].append(s.charAt(i));
                currRow-=1;
            }
        }

        StringBuilder ans = new StringBuilder();
        for(int i=0;i<numRows;i++){
            ans.append(rows[i]);
        }
        return ans.toString();
    }
}