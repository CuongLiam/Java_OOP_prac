import javax.swing.JOptionPane;

public class GUI {
    public static void gui(){
        String name = JOptionPane.showInputDialog("Enter ur name");
        JOptionPane.showMessageDialog(null, "hello " +name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("enter ur age"));
        JOptionPane.showMessageDialog(null, "you are " +age+ " years old");

        Double height = Double.parseDouble(JOptionPane.showInputDialog("your height is :"));
        JOptionPane.showMessageDialog(null, "you are  " +height+ " cm tall");
    }
}
