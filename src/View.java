import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.*;

import static javax.swing.JOptionPane.PLAIN_MESSAGE;

public class View {

    private static JTextField NameOfStudent;
    private static JTextField SortOfCoffee;
    private static JTextField WSugar;
    private static JTextField VTeapot;
    private static JButton calculateButton;
    private static JTextField WCoffee;
    public static void addComponents(Container pane) {
        pane.setLayout(new GridBagLayout());
        pane.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 1;
        constraints.gridx = 0;
        constraints.gridy = 0;
        pane.add(new JLabel("Имя студента"), constraints);
        constraints.gridx = 1;
        constraints.gridy = 0;
        constraints.gridwidth = 2;
        NameOfStudent = new JTextField();
        pane.add(NameOfStudent, constraints);
        constraints.gridx = 0;
        constraints.gridy = 2;
        pane.add(new JLabel("Объём кофе"), constraints);
        constraints.gridx = 1;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        VTeapot = new JTextField();
        pane.add(VTeapot, constraints);
        constraints.gridx = 0;
        constraints.gridy = 3;
        pane.add(new JLabel("Название кофе"), constraints);
        constraints.gridx = 1;
        constraints.gridy = 3;
        constraints.gridwidth = 2;
        SortOfCoffee = new JTextField();
        pane.add(SortOfCoffee, constraints);
        constraints.gridx = 0;
        constraints.gridy = 4;
        pane.add(new JLabel("Кол-во сахара"), constraints);
        constraints.gridx = 1;
        constraints.gridy = 4;
        constraints.gridwidth = 2;
        WSugar = new JTextField();
        pane.add(WSugar, constraints);
        constraints.gridx = 0;
        constraints.gridy = 5;
        pane.add(new JLabel("Кол-во кофе"), constraints);
        constraints.gridx = 1;
        constraints.gridy = 5;
        constraints.gridwidth = 2;
        WCoffee = new JTextField();
        pane.add(WCoffee, constraints);
        constraints.gridx = 0;
        constraints.gridy = 6;
        constraints.gridwidth = 2;
        calculateButton = new JButton("Сделать кофе");
        calculateButton.setPreferredSize(new Dimension(75, 20));
        pane.add(calculateButton, constraints);
        calculateButton.addActionListener(e -> {
                Model.ToMake();
                JOptionPane.showMessageDialog(null,"Ваш кофе готов");
        });
    }
    static public String getNameOfStudent (){
        return NameOfStudent.getText();
    }
    static public String getSortOfCoffee(){
        return SortOfCoffee.getText();
    }
    static public int getWSugar(){
        return Integer.parseInt(WSugar.getText());
    }
    static public int getWCoffee(){
        return Integer.parseInt(WCoffee.getText());
    }
    static  public int getVTeapot(){
        return Integer.parseInt(VTeapot.getText());
    }

}