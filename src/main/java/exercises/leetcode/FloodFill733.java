package exercises.leetcode;

public class FloodFill733 {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int colorMatch = image[sr][sc];
        boolean[][] isVisited = new boolean[image.length][image[0].length];

        return fill(image, isVisited, sr, sc, newColor, colorMatch);
    }

    private int[][] fill(int[][] image, boolean isVisited[][], int sr, int sc, int newColor, int colorMatch) {
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length) {
            return image;
        } else if (image[sr][sc] != colorMatch || isVisited[sr][sc]) {
            return image;
        } else {
            image[sr][sc] = newColor;
            isVisited[sr][sc] = true;
            int[][] img1 = fill(image, isVisited, sr - 1, sc, newColor, colorMatch);
            fill(img1, isVisited, sr, sc - 1, newColor, colorMatch);
            fill(img1, isVisited, sr + 1, sc, newColor, colorMatch);
            fill(img1, isVisited, sr, sc + 1, newColor, colorMatch);
            return img1;
        }
    }
}
