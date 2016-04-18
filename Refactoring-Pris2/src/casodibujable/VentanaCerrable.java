package casodibujable;

import java.awt.*;
import java.awt.event.*;

class VentanaCerrable extends Frame implements WindowListener {
	// constructores
	public VentanaCerrable() {
		super();
	}

	public VentanaCerrable(String title) {
		super(title);
		setSize(500, 500);
		addWindowListener(this);
	}
	@Override
	// métodos de la interface WindowsListener
	public void windowActivated(WindowEvent e) {
		throw new UnsupportedOperationException()	;
	}
	@Override
	public void windowClosed(WindowEvent e) {
		throw new UnsupportedOperationException()	;
	}
	@Override
	 public void windowClosing(WindowEvent e) {
	System.exit(0);
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		throw new UnsupportedOperationException()	;
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		throw new UnsupportedOperationException()	;
	}
@Override
	public void windowIconified(WindowEvent e) {
	throw new UnsupportedOperationException()	;
	}
@Override
	public void windowOpened(WindowEvent e) {
	 throw new UnsupportedOperationException()	;
	}
}