import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/** 
 * 
 * @author Alexander Javad, email: alexjavad@gmail.com
 *
 */

//TODO: Fix the Following Bugs
//TODO: BUG #0: Program is slow and seemingly unresponsive (perhaps due to author's terribly slow computer)
//TODO: BUG #1: zoomValue gets stuck after hitting upper 400% threshold
//TODO: BUG #2: zoomValue goes from 100% -> 65% when clicking ZoomOut (going below the 100% threshold)
//TODO: BUG #3: zoomValue gets gets stuck after hitting lower 10% threshold

public class DisplayShape extends Applet implements ActionListener {
	int zoomValue = 100;
	int zoomFactor = zoomValue/100;
	int w=10,h=10;
	Color[] colors = {Color.red, Color.blue, Color.yellow, Color.green};
	Button zoomIn;
	Button zoomOut;
	TextArea txtArea;
	Graphics gAccess;
	
	
	//Initializes All needed Applet Components upon Applet Launch
	public void init () {

		// Construct the buttons
		zoomIn = new Button("Zoom In");
		zoomOut = new Button("Zoom Out");

		// add the buttons to the layout
		this.add(zoomIn);
		this.add(zoomOut);

		// specify that action events sent by this
		// button should be handled by this DisplayShape object
		zoomIn.addActionListener(this);
		zoomOut.addActionListener(this);
	}

	//Paints Shapes to Applet Screen
	public void paint(Graphics g) {
		gAccess = g;
		int colorIndex = 0;
		int spacing = 20*zoomFactor;
		centerString(g, "Zoom Value is: " + String.valueOf(zoomValue) + "%");
		
		for(int i=10; i<90; i+=spacing) {
			drawMyShape(g, getCenterX()+i, getCenterY(), colorIndex);
			colorIndex++;
		}
	}

	//Draws a Shape that can be best described as a thin rectangle with a circle above it (like the letter 'i')
	public void drawMyShape(Graphics g, int x, int y, int c) {
		g.setColor(colors[c]);
		g.drawOval(x, y, w, h);
		g.fillOval(x, y, w, h);
		g.fillRect(x, y+w+5, w, h);
	}

	
	//Establishes the correct action to execute upon clicking a button in the applet's layout
	@Override
	public void actionPerformed(ActionEvent evt) {
		if(zoomValue>=100 && zoomValue<=400) {
			if (evt.getSource() == zoomIn) {
				zoomValue+=25;
				w+=zoomFactor;
				h+=zoomFactor;
				this.paint(gAccess);
			}	
			else if (evt.getSource() == zoomOut) {
				zoomValue-=25;
				w-=zoomFactor;
				h-=zoomFactor;
				this.paint(gAccess);	
			}
		}
		
		if(zoomValue<100 && zoomValue>=10) {
			if (evt.getSource() == zoomIn) {
				zoomValue+=10;
				w+=zoomFactor;
				h+=zoomFactor;
				this.paint(gAccess);
			}
			else if (evt.getSource() == zoomOut) {
				zoomValue-=10;
				w-=zoomFactor;
				h-=zoomFactor;
				this.paint(gAccess);
			}
		}
	}

	//Paints the String s in the horizontal center of the screen, 40px from the top of the applet
	public void centerString(Graphics g, String s) {
		g.drawString(s, getCenterX(), 40);
	}
	
	//returns the x coordinate of the center of this applet's component window
	public int getCenterX() {
		return getSize().width/2;
	}
	
	//returns the x coordinate of the center of this applet's component window
	public int getCenterY() {
		return getSize().height/2;
	}

} // end DisplayShape.class