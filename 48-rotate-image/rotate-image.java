class Solution {
    public void rotate(int[][] matrix) {
        //phele transpose karenge
        int rows=matrix.length;
        for(int i=0;i<rows;i++){
            for(int j=0;j<i;j++){

                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;          
                }
        }
        //ab reverse karenge
        
        for(int i=0;i<rows;i++){
            int stcol=0;
            int endcol=rows-1;
            while(stcol<endcol){
                int temp=matrix[i][stcol];
                matrix[i][stcol]=matrix[i][endcol];
                matrix[i][endcol]=temp;
                stcol++;
                endcol--;
            }
        }
    }
}