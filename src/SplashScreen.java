import javax.swing.*;
import javax.swing.plaf.MenuBarUI;

import java.awt.*;

public class SplashScreen extends JFrame{

JFrame f;
JLabel image = new JLabel(new ImageIcon("D:\\Eclipse\\Workspace\\SWC2333 GROUP ASSIGNMENT\\gambar/zoologo.jpg"));
JLabel text = new JLabel("WELCOME TO");
JLabel text2 = new JLabel("A  R  I  F  I  N ");
JProgressBar progressBar = new JProgressBar();
JLabel message = new JLabel();

public static void main(String[]args) { //FOR RETURN
    SplashScreen splash = new SplashScreen();
    try {
       Thread.sleep(50);
       splash.dispose();
    } catch(Exception e) {
       e.printStackTrace();
    }
 }

SplashScreen() //CALL THE PUBLIC VOID
{

    createGui();
    addImage();
    addText();
    addText2();
    addProgressBar();
    addMessage();
    runningPBar();
    loGin();
    
}


public void createGui() { //CREATE JFRAME
    f = new JFrame();
    f.setUndecorated(true);
    f.getContentPane().setLayout(null);
    f.setSize(700, 370);
    f.setLocationRelativeTo(null);
    f.getContentPane().setBackground(Color.PINK);
    f.setVisible(true);
   
}
public void addText(){ //ADD TEXT
    text.setFont(new Font("Ink Free", Font.BOLD, 30));
    text.setBounds(129,47,283,40);
    text.setForeground(new Color(128, 0, 128));
    f.getContentPane().add(text);
}
 
public void addText2(){ //ADD TEXT2
    text2.setFont(new Font("Segoe Print", Font.BOLD, 30));
    text2.setBounds(215,232,335,30);
    text2.setForeground(new Color(160, 82, 45));
    f.getContentPane().add(text2);
}

public void addImage(){ //ADD IMAGE
	
    image.setBounds(178,10,320,234);
    image.setSize(320,300);
    f.getContentPane().add(image);

}

public void addMessage(){ //ADD MESSAGE
    message.setBounds(139, 280, 399, 30);
    message.setForeground(new Color(210, 105, 30));
    message.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 15));
    f.getContentPane().add(message);
}
public void addProgressBar(){ //CREATE PROGRESS BAR
    progressBar.setBounds(138,267,400,16);
    progressBar.setBorderPainted(true);
    progressBar.setStringPainted(true);
    progressBar.setForeground(new Color(128, 0, 128));
    progressBar.setBackground(Color.WHITE);
    f.getContentPane().add(progressBar);
}
public void runningPBar(){ //LOADING BAR
    int i = 0;

    while (i <=100){
        try {
            Thread.sleep(50);
            progressBar.setValue(i);
            message.setText("LOADING" + Integer.toString(i) + "%");
            i++;
            if(i == 100)
                f.dispose();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public void loGin() //CONNECT TO LOGINFRAME
{
	LoginFrame lf = new LoginFrame();
    lf.setVisible(true);
    dispose();
}






}