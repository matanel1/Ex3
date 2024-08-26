package assignments.ex3;
import classes.week4.StdDraw;

/** This is NOT a Junit class - as it tests GUI components which 
 * should not be tested using Junit.
 * 
 * The Code uses the STDDraw class: 
 * https://introcs.cs.princeton.edu/java/stdlib/javadoc/StdDraw.html
 * @author boaz.benmoshe
 *
 */
public class StdDrawTest {
	public static void main(String[] a) {

		int[][] mat = {{1,1,1,1,1}, {1,0,1,0,1}, {1,0,0,0,1},  {1,0,1,0,1},  {1,1,1,1,1}, {1,0,1,0,1}};
		int[][] mat1 = {{0,0,0,0,0}, {1,0,1,0,1}, {1,0,0,0,1},  {1,0,1,0,1},  {1,1,1,1,1}, {1,0,1,0,1}};
		int[][] mat2 = {{0,0,0,0,0}, {0,1,1,1,0}, {0,1,1,1,0},  {0,1,1,1,0},  {0,1,1,1,0}, {0,0,0,0,0}};
		int[][] mat3 = {{0,0,0,0,0,0}, {0,1,1,1,1,0}, {0,1,1,1,1,0},  {0,1,1,1,1,0},  {0,1,1,1,1,0}, {0,0,0,0,0,0}};
		int[][] mat4 = {{0,0,0,0,0,0}, {0,1,1,1,1,0}, {0,1,1,1,1,0},  {0,1,1,1,1,0},  {0,1,1,1,1,0}, {0,0,0,0,0,0},{0,0,0,0,0,0}, {0,1,1,1,1,0}, {0,1,1,1,1,0},  {0,1,1,1,1,0},  {0,1,1,1,1,0}, {0,0,0,0,0,0}};
		drawMat(mat3);

	}

	public static void drawMat(int[][] mat) {
		StdDraw.setScale(0, 1);
		StdDraw.clear();
		for(int y=0;y<mat.length;y++) {
			for(int x=0;x<mat[0].length;x++) {
				int v = mat[y][x];
				if(v==0) {StdDraw.setPenColor(StdDraw.BLUE);}
				else {StdDraw.setPenColor(StdDraw.BOOK_RED);}
				double r = 1/14.0;
				double x1 = 0.1+2.2*r*x;
				double y1 = 1-(0.1+2.2*r*y);
				StdDraw.filledSquare(x1,y1,r);
			}
		}
		StdDraw.show();
		StdDraw.pause(2);
	}
	}