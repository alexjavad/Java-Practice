import java.awt.Point;


public class TwoDArray {


	public static void main(String[] args) {
		//NxN matrix
		int height = 4; //height also known as N
		//
		
		int width = height;
		

		Point[][] board = new Point[height][width];

		int h = board.length;
		int w = board[0].length;

		//System.out.println("The Board's Real Height: " + String.valueOf(height) + " versus Computed Height: " + String.valueOf(h));
		//System.out.println("The Board's Real Width: " + String.valueOf(width) + " versus Computed Width: " + String.valueOf(w));


		initBoard(board);
		print(board);
		
		System.out.println("");
		System.out.println("");
		
		int accessRow = 1;
		int accessCol = 2;
		System.out.println("Value at Row: " + String.valueOf(accessRow) + " Col: " + String.valueOf(accessCol) + " is--> " + board[accessRow][accessCol]);

	}

	public static void initBoard(Point[][] b) {
		int height=b.length,width=b[0].length;
		for(int row=0; row<height; row++) {
			for(int col=0; col<width; col++) {
				b[row][col]=new Point(row,col);
			}
		}
	}

	public static void print(Point[][] b) {
		int height=b.length,width=b[0].length;
		for(int row=0; row<height; row++) {
			for(int col=0; col<width; col++) {
				System.out.print(" " + b[row][col]);
			}
			System.out.println("");
		}
	}
}
