import javax.swing.JFrame;

public class ImageEditorFrame extends JFrame{ 
	public ImageEditorFrame(){ 
	setDefaultCloseOperation(EXIT_ON_CLOSE); 
	setSize(400, 300); 
	setVisible(true); 
	} 
} 

public class Main{
	public static void main (String []args){
	ImageEditorFrame frm = new ImageEditorFrame();
	}
}
