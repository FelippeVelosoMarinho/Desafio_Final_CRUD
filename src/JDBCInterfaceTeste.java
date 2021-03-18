package Desafio_Final;

import javax.swing.*;

public class JDBCInterfaceTeste{
    public static void main(String[]args){

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                InsterfaceGUI gui = new InsterfaceGUI();
                gui.setVisible(true);
                ConnectionFactory cf = new ConnectionFactory();
                cf.dados();
            }
        });
    }
}