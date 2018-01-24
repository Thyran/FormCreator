package FormCreator;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;

import FormCreator.Components.FormButton;

public class App extends JFrame {
	public static App app;
	
	public ObjectInspector inspector = null;
	public ComponentChooser chooser = null;
	public AppAction action;

	private Components comps = new Components();
	private static final long serialVersionUID = 1L;
	
	public static enum AppAction {
		IDLE,
		PLACE_BUTTON
	}
	
	private class Components {
		public List<JButton> buttons = new ArrayList<JButton>();
		
		public void addComponent(JComponent comp) {
			if (comp instanceof JButton) {
				buttons.add((JButton) comp);
				
				app.add(comp);
			}
		}
	}
	
	private class MouseAction implements MouseListener {
		@Override
		public void mouseClicked(MouseEvent arg0) {
			switch(action) {
			case IDLE:
				break;
			case PLACE_BUTTON:
				System.out.println(arg0.getLocationOnScreen());
				comps.addComponent(new FormButton(comps.buttons.size() +1, arg0.getPoint()));
				break;
			}
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	}
	
	public void setAction(AppAction action) {
		this.action = action;
	}
	
	public static void main(String[] args) {
		app = new App();
	}
	
	public App() {
		inspector = new ObjectInspector();
		chooser = new ComponentChooser();
		
		setAction(AppAction.IDLE);
		
		this.addMouseListener(new MouseAction());
		this.setBounds(200, 200, 300, 300);
		this.setVisible(true);
	}
}