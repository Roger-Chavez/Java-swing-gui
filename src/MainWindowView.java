// This is the View
// Its only job is to display what the user sees
// It performs no calculations, but instead passes
// information entered by the user to whomever needs
// it. 

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;
import javax.swing.text.StyleConstants.ColorConstants;
import Views.DashboardView;
import Views.GradeView;
import Views.Modules;

public class MainWindowView extends JFrame{

	private JPanel gridBagPanel = new JPanel(new GridBagLayout());
	private JToolBar NavBar = new JToolBar(1); // 1 indicates that the JToolbar will be vertical
	private JPanel cardStack = new JPanel(new CardLayout());
	private JButton yellowButton = new JButton("Yellow");
	private JButton redButton = new JButton("Red");
	private ArrayList<JPanel> viewsArray= new ArrayList();
	public GradeView gradeView = new GradeView();
	public DashboardView dashboardView = new DashboardView();
	public Modules modulesView = new Modules();
	private JButton magentaButton = new JButton("Magenta");
	
	MainWindowView(){		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600,600);
		
		
		// Set Dimensions for background gridbagPanel(GBP)
		gridBagPanel.setMaximumSize(new Dimension(600,600));
		gridBagPanel.setLayout(new GridBagLayout());
		
		
		// Set Dimensions and Constraints before adding to GBP
		NavBar.setMaximumSize(new Dimension(100,600));
		NavBar.setBackground(Color.black);
		GridBagConstraints gc = new GridBagConstraints();
		gc.fill= GridBagConstraints.HORIZONTAL;
		gc.ipady=600;
		gc.weighty = 1;
		gc.gridx=0;
		gc.gridy=0;
		gc.anchor = GridBagConstraints.NORTHWEST;

		
		// add Buttons to NavBar
		yellowButton.setMaximumSize(new Dimension(100,40));
		NavBar.add(yellowButton);
		redButton.setMaximumSize(new Dimension(100, 40));
		NavBar.add(redButton);
		magentaButton.setMaximumSize(new Dimension(100, 40));
		NavBar.add(magentaButton);
		
		// Remove ability to move NavBar around, set orientation to vertical 
		// and add the NavBar to the background Panel
		NavBar.setFloatable(false);
		NavBar.setOrientation(1);
		gridBagPanel.add(NavBar, gc);
		
		// cardStack is where all the window panels will be added
		// set card stack dimensions and insert to the right of the NavBar
		cardStack.setMaximumSize(new Dimension(499,600));
		gc.fill = GridBagConstraints.HORIZONTAL;
		gc.weightx = 0.8;
		gc.weighty = 1;
		gc.ipady=600;
		gc.gridwidth=1;
		gc.gridx = 1;
		gc.gridy = 0;

		cardStack.setBackground(Color.blue);
		gridBagPanel.add(cardStack, gc);

		// Add the background panel to the app window
		this.add(gridBagPanel);
		
		
		cardStack.add(gradeView);
		cardStack.add(dashboardView);
		cardStack.add(modulesView);

		// End of setting up the components --------
		
	}
	
	void oneNavBarListener(ActionListener listenForNavBarButton){
		yellowButton.addActionListener(listenForNavBarButton);
	}
	
	void twoNavBarListener(ActionListener listenForNavBarButton){
		redButton.addActionListener(listenForNavBarButton);
	}
	
	void threeNavBarListener(ActionListener listenForNavBarButton){
		magentaButton.addActionListener(listenForNavBarButton);
	}
	
	public void addView(JPanel view) {
		this.cardStack.add(view);
	}
	
	
}