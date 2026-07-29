class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int orignalColor=image[sr][sc];
        if(orignalColor==color) return image;

        helper(sr,sc,image,orignalColor,color);
        return image;
    }

    public void helper( int sr, int sc,int[][] image,int orignalColor,int color){
        if(sr<0 || sc<0 || sr>=image.length || sc >=image[0].length) return;
        if(image[sr][sc]!=orignalColor) return;

        image[sr][sc] = color;
        helper(sr+1,sc,image,orignalColor,color);
        helper(sr-1,sc,image,orignalColor,color);
        helper(sr,sc+1,image,orignalColor,color);
        helper(sr,sc-1,image,orignalColor,color);
    }
}