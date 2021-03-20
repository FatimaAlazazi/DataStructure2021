package lab9;

import Lab7.LinkedStack;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Created by fatima on 20/03/2021.
 */
public class TextEditor {
    static LinkedStack<String>stack= new LinkedStack<>();
    private JButton undo;
    private JTextArea textArea1;
    private JPanel mainPannel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("TextEditor");
        frame.setContentPane(new TextEditor().mainPannel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(500,500);
        frame.setLocation(500,500);
    }

    public TextEditor() {
        textArea1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                stack.push(textArea1.getText());
            }
        });
        undo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!stack.isEmpty())
                textArea1.setText(stack.pop());
            }
        });
    }
}
