import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Image;
import javax.swing.SwingConstants;
import java.awt.Font;

public class FacilityView extends JFrame{
	JPanel facilityHolder = new JPanel();
	FacilityView(){
		getContentPane().setLayout(null);
		
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 494, 100);
		getContentPane().add(panel);
		panel.setLayout(null);
		facilityHolder.setBounds(0, 0, 494, 100);
		facilityHolder.setLayout(null);
		JLabel facilityNameLabel = new JLabel("24-Hour Security");
		facilityNameLabel.setFont(new Font("Source Sans Pro ExtraLight", Font.PLAIN, 23));
		facilityNameLabel.setBounds(100, 0, 394, 100);
		facilityHolder.add(facilityNameLabel);
		
		JLabel facilityIconLabel = new JLabel();
		facilityIconLabel.setBounds(0, 0, 100, 100);
		facilityIconLabel.setIcon(loadImage("Images/LogoMakr-8MnvPi.png", 50,50));
		facilityHolder.add(facilityIconLabel);
//		facilitiesPanel.add(facilityHolder);
//		facilityHolder.setLayout(null);
		panel.add(facilityHolder);
		setSize(1024, 700);
		setVisible(true);
	}
	public static void main(String[] args) {
		new FacilityView();
	}
	private ImageIcon loadImage(String path, int x, int y){
        Image image = new ImageIcon(this.getClass().getResource(path)).getImage();
        Image scaledImage = image.getScaledInstance(x, y, java.awt.Image.SCALE_SMOOTH);
        return new ImageIcon(scaledImage);
	} 
}
