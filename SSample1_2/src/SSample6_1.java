import javax.swing.ImageIcon;
import javax.swing.JFrame;

class SSample7_1 extends JFrame{
  public static void main(String args[]){
    SSample7_1 frame = new SSample7_1("タイトル");
  

  }

  SSample7_1(String title){
	  setVisible(true);
	  setTitle(title);
    setBounds(100, 100, 300, 250);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    ImageIcon icon = new ImageIcon("./icon.png");
    setIconImage(icon.getImage());


  }
}