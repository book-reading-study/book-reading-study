package ch22.hjk.practice;

import ch22.hjk.practice.color.ColorCommand;
import ch22.hjk.practice.color.DrawCanvas;
import ch22.hjk.practice.command.Command;
import ch22.hjk.practice.command.MacroCommand;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame {
    private MacroCommand history = new MacroCommand();
    private DrawCanvas canvas = new DrawCanvas(400, 400, history);
    private JButton clearButton = new JButton("clear");
    private JButton undoButton = new JButton("undo");
    private JButton redColorButton = new JButton("red");
    private JButton blueColorButton = new JButton("blue");
    private JButton blackColorButton = new JButton("black");
    private Color color = Color.black;

    public Main(String title){
        super(title);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        canvas.addMouseMotionListener(new MouseMotionAdapter(){
            @Override
            public void mouseDragged(MouseEvent e) {
                Command cmd = new ColorCommand(canvas, e.getPoint(), color);
                history.append(cmd);
                cmd.execute();
            }
        });
        clearButton.addActionListener(e -> {
            history.clear();
            canvas.repaint();
        });
        undoButton.addActionListener(e ->{
            history.undo();
            canvas.repaint();
        });
        redColorButton.addActionListener(e -> {
            color = Color.red;
        });
        blueColorButton.addActionListener(e ->{
            color = Color.blue;
        });
        blackColorButton.addActionListener(e ->{
            color = Color.black;
        });

        Box buttonBox = new Box(BoxLayout.X_AXIS);
        buttonBox.add(clearButton);
        buttonBox.add(undoButton);
        buttonBox.add(redColorButton);
        buttonBox.add(blueColorButton);
        buttonBox.add(blackColorButton);
        Box mainBox = new Box(BoxLayout.Y_AXIS);
        mainBox.add(buttonBox);
        mainBox.add(canvas);
        getContentPane().add(mainBox);

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main("Command Pattern Sample");
    }

}
