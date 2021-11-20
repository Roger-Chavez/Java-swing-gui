package Views;
// This is the View
// Its only job is to display what the user sees
// It performs no calculations, but instead passes
// information entered by the user to whomever needs
// it. 

import java.awt.Color;
import javax.swing.JPanel;

public class GradeView extends JPanel{
	private int panelID;
	
	public GradeView(){	

		this.setBackground(Color.yellow);
		// End of setting up the components --------	
	}
	
	public void setVisible(Boolean show) {
		this.setVisible(show);
	}
	
	public int getViewID() {
		return this.panelID;
	}
}