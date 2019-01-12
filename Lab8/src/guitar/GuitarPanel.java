package guitar;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class GuitarPanel extends JPanel {
	private Image img = new ImageIcon(getClass().getResource("/guitar.jpg")).getImage();
	private int[] y = { 0, 408, 381, 356, 327, 300, 272 };
	private int previousY;
	private int currentY;
	private int currentX;

	Guitar guitar;

	// set up GUI and register mouse event handler
	public GuitarPanel() {

		previousY = 0;
		currentY = 0;
		currentX = 0;
		guitar = new Guitar(); // instantiate guitar object

		// handle frame mouse motion event
		addMouseMotionListener(

				new MouseMotionAdapter() // anonymous inner class
				{
					// method of mouseMoved is to store previousY when mouse move
					public void mouseMoved(MouseEvent event) {
						previousY = event.getY();
					}

					// store drag coordinates and repaint
					public void mouseDragged(MouseEvent event) {

						currentY = event.getY();
						currentX = event.getX();

						System.out.println("currentY - " + currentY);
						System.out.println("currentX - " + currentX);

						if (currentY < 410 && currentX > 112) {
							for (int i = y.length - 1; i > 0; i--) {
								if (previousY < y[i] && currentY >= y[i] || previousY > y[i] && currentY <= y[i]) {
									guitar.pluck(i);
									System.out.println("i - " + i);
								}
							} // end of the string range

							previousY = currentY;

						} // end method mouseDragged
					} // end anonymous inner class
				}); // end call to addMouseMotionListener
	} // end PaintPanel constructor

	// draw ovals in a 4-by-4 bounding box at specified locations on window
	public void paintComponent(Graphics g) {
		super.paintComponent(g); // clears drawing area
		// draw all points in array
		g.drawImage(img, 0, 0, null);

	} // end method paintComponent
} // end class GuitarPanel

/**************************************************************************
 * (C) Copyright 1992-2012 by Deitel & Associates, Inc. and * Pearson Education,
 * Inc. All Rights Reserved. * * DISCLAIMER: The authors and publisher of this
 * book have used their * best efforts in preparing the book. These efforts
 * include the * development, research, and testing of the theories and programs
 * * to determine their effectiveness. The authors and publisher make * no
 * warranty of any kind, expressed or implied, with regard to these * programs
 * or to the documentation contained in these books. The authors * and publisher
 * shall not be liable in any event for incidental or * consequential damages in
 * connection with, or arising out of, the * furnishing, performance, or use of
 * these programs. *
 *************************************************************************/