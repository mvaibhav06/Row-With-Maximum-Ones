public class MaxOnes {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int out = Integer.MIN_VALUE;
        int index = 0;

        for(int i=0; i<mat.length; i++){
            int max = 0;
            for(int j=0; j<mat[i].length; j++){
                if(mat[i][j] == 1){
                    max++;
                }
            }
            if(max > out){
                out = max;
                index = i;
            }else if(max == out){
                index = Math.min(index,i);
            }
        }
        return new int[]{index,out};
    }
}
