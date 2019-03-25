import javax.swing.JFrame;

public class UserInterface {
    public static void createAndShowGUI() {
        JFrame frame = new JFrame("Coffee");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250, 175);
        frame.setResizable(false);
        View.addComponents(frame.getContentPane());
        frame.setVisible(true);
         View.calculateButton.addActionListener(e -> {
           if( Model.ToMake()!= new Cup())
            JOptionPane.showMessageDialog(null,"Ваш кофе готов");
           else
               JOptionPane.showMessageDialog(null,"Ваш кофе не готов");
        });
    }

}
