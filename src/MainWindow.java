import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainWindow extends Frame{

	public MainWindow() {
		setSize(400,400);
		setTitle("QRCode");
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		
	}
	
	public static void main(String[] args) {
		MainWindow main = new MainWindow();
	}

}
