public class Assignment01Q05 {

    public static int findShortestPath(int[][] m, int i, int j) {
        if (i==j)
            return 0;
        for (int p=0; p<m.length; p++){
            for (int y=0; y < m.length; y++){
            
                for (int x=0; x < m[y].length; x++){
                    if (x!=y && m[y][x]!=0){
                        for (int k=0; k<m.length; k++){
                            if (m[x][k] != 0){
                                int PossibleLengthFromY2K = m[x][k] + m[y][x];
                                if (m[y][k] > PossibleLengthFromY2K || m[y][k] == 0)
                                    m[y][k] = PossibleLengthFromY2K;
                            }
                        }   
                    }
                }
            }
        }
        if (m[i][j] == 0)
            return -1;
        return m[i][j];
    }


    public static void main(String[] args) {

        
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}