import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

// The Controller coordinates interactions
// between the View and Model

public class MainWindowController {
	
	private MainWindowView theView;
	private MainWindowModel theModel;
	
	public MainWindowController(MainWindowView theView, MainWindowModel theModel) {
		this.theView = theView;
		this.theModel = theModel;
		
		// Plug the NavBarView to the NavBarListener
		this.theView.oneNavBarListener(new oneListener());
		this.theView.twoNavBarListener(new twoListener());
		this.theView.threeNavBarListener(new threeListener());
	}
	
	class oneListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			theView.gradeView.setVisible(true);
			theView.dashboardView.setVisible(false);
			theView.modulesView.setVisible(false);
		}
	}
	
	class twoListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			theView.dashboardView.setVisible(true);
			theView.gradeView.setVisible(false);
			theView.modulesView.setVisible(false);
		}	
	}
	
	class threeListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			theView.modulesView.setVisible(true);
			theView.gradeView.setVisible(false);
			theView.dashboardView.setVisible(false);
		}		
	}
	
}