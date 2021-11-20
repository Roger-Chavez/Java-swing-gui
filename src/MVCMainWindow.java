public class MVCMainWindow {
    
    public static void main(String[] args) {
    	
    	MainWindowView mainWindowView = new MainWindowView();
        
    	MainWindowModel theModel = new MainWindowModel();
        
        MainWindowController theController = new MainWindowController(mainWindowView,theModel);
        
        mainWindowView.setVisible(true);
       
    }
}