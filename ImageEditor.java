import javax.swing.*;

public class ImageEditor extends JFrame{ 
	public ImageEditor(){ 
	setDefaultCloseOperation(EXIT_ON_CLOSE); 
	setSize(400, 300); 
	setVisible(true); 
	} 
 
	public static void main (String []args){
	ImageEditor frm = new ImageEditor();
	}
}
