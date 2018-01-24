package FormCreator.Components;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class FormButton extends JButton {
	private static final long serialVersionUID = 1L;

	private class ButtonAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
		}
	}
	
	public FormButton(int index, Point location) {
		super("button" + index);
		
		this.setLocation(location);
		this.setSize(200, 100);
	}
}