import java.awt.Point;
import java.awt.image.BufferedImage;
import java.awt.image.PixelInterleavedSampleModel;
import java.awt.image.Raster;
import java.awt.image.SampleModel;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;
import javax.imageio.*;
import javax.swing.JOptionPane;

public class Rotate90 {
	private static SampleModel sampleModel;
	static BufferedImage outputImage = null;

	public static void main(String[] args) {

		//Gather Input Image
		BufferedImage inputImage = null;
		try {
			inputImage = ImageIO.read(new File("C:\\Users\\Alexander\\Pictures\\strawberry.png"));
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, e.toString(), "Error",
					JOptionPane.ERROR_MESSAGE);
		}

		int[][] inputImageArray = convertTo2DUsingGetRGB(inputImage);
		int[][] rotatedImageArray = rotate90(inputImageArray, inputImage.getHeight(), inputImage.getWidth());

		//Write Output Image
		try {
			outputImage = createOutputImage(rotatedImageArray);
			File outputFile = new File("C:\\Users\\Alexander\\Pictures\\strawberry2.png");
			ImageIO.write(outputImage, "png", outputFile);
		} catch (IOException e) {

		}

	}


	public static int[][] convertTo2DUsingGetRGB(BufferedImage image) {
		sampleModel = image.getRaster().getSampleModel();
		int width = image.getWidth();
		int height = image.getHeight();
		int[][] result = new int[height][width];
		
		for (int row = 0; row < height; row++) {
			for (int col = 0; col < width; col++) {
				result[row][col] = image.getRGB(row, col);
			}
		}
		return result;
	}

	public static int[][] rotate90(int[][] imgArray, int height, int width) {
		int[][] result = new int[height][width];
		for(int row=0; row<height; row++) {
			for(int col=0; col<width; col++) {
				//System.out.println("Accessing imgArray @ Row: " + String.valueOf(row) + " [max-value: " +  String.valueOf(height-1) + "]" +
					//	" Col: " + String.valueOf(col) + " [max-value: " +  String.valueOf(width-1) + "]");
				System.out.println("Placing value in INPUT @ Row: " + String.valueOf(row) + " Col: " + String.valueOf(col) + " in OUTPUT @ Row: " + String.valueOf(height-col-1) + " Col: " + String.valueOf(row));
				result[height-col-1][row]=imgArray[row][col];
			}
		}
		return result;
	}

	public static BufferedImage createOutputImage(int[][] rotatedImg) {
		int w=rotatedImg.length;
		int h=rotatedImg[0].length;
		BufferedImage image=new BufferedImage(w,h,BufferedImage.TYPE_BYTE_GRAY);
		//WritableRaster raster= Raster.createWritableRaster(sampleModel, new Point(0,0));
		WritableRaster raster= Raster.createWritableRaster(new PixelInterleavedSampleModel(0, w, h, 1, 1920, new int[] {0}), new Point(0,0));

		for(int i=0;i<w;i++)
	    {
	        for(int j=0;j<h;j++)
	        {
	            raster.setSample(i,j,0,rotatedImg[i][j]);
	        }
	    }
	    image.setData(raster);
	    return image;

	}

}
