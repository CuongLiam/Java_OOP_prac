import javax.swing.JOptionPane;

public class GUI {
    public static void gui(){
        double a, b, c;

        a = Double.parseDouble(JOptionPane.showInputDialog("type a :"));
        b = Double.parseDouble(JOptionPane.showInputDialog("type b :"));

        c = Math.sqrt((a*a)+(b*b));

        JOptionPane.showMessageDialog(null,"cạnh huyền c là : " +c);

    }
}
