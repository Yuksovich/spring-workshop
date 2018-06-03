package screen_saver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * @author Evgeny Borisov
 */
@Component
public class ColorFrame extends JFrame {
    @Autowired
    private Color color;

    private Random random = new Random();

    @PostConstruct
    public void init(){
        System.out.println(color.getClass());
        System.out.println(color.getBlue());
        System.out.println(color.getBlue());
        System.out.println(color.getBlue());
        System.out.println(color.getBlue());
        setSize(200,200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void moveToRandomLocation() {
        setLocation(random.nextInt(1200),random.nextInt(900));
        getContentPane().setBackground(color);
        repaint();
    }
}











