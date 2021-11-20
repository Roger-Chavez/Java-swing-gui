package Views;
// This is the View
// Its only job is to display what the user sees
// It performs no calculations, but instead passes
// information entered by the user to whomever needs
// it. 

import java.awt.*;
import javax.swing.*;

public class DashboardView extends JPanel{
	private int panelID;
	
	public DashboardView(){	

		this.setBackground(Color.red);
		// End of setting up the components --------	
	}
	
	public void setVisible(Boolean show) {
		this.setVisible(show);
	}
	
	public int getViewID() {
		return this.panelID;
	}
}