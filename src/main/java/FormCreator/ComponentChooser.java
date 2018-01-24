package FormCreator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import FormCreator.App.AppAction;

public class ComponentChooser extends JFrame {
	private static final long serialVersionUID = 1L;
	private JButton buttonButton = new JButton("button");
	
	private class ButtonAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			if(arg0.getSource().equals(buttonButton)) {
				App.app.setAction(AppAction.PLACE_BUTTON);
			} else {
				
			}
		}
	}
	
	public ComponentChooser() {
		buttonButton.setBounds(20, 20, 100, 50);
		buttonButton.addActionListener(new ButtonAction());
		this.add(buttonButton);
		
		this.setBounds(200, 0, 300, 200);
		this.setVisible(true);
	}
}
