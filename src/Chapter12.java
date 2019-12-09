import javax.swing.*;
import java.awt.*;
import javax.sound.midi.*;
import java.awt.event.*;
//1st variant

    /*
    public class Chapter12 {
        public static void main(String[] args) {
            Chapter12 gui = new Chapter12();
            gui.go();
        }
            public void go() {
            JFrame frame = new JFrame();
            JButton button = new JButton("click me");
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    button.setText ("I've been clicked");
                }
            });

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(button);
            frame.setSize(300, 300);
            frame.setVisible(true);
        }
    }
//2nd variant main

class SimpleGui1B implements ActionListener {
    JButton button;
    public static void main (String[] args) {
        SimpleGui1B gui = new SimpleGui1B();
        gui.go();
    }
    public void go() {
        JFrame frame = new JFrame();
        button = new JButton("click me");
        button.addActionListener(this);
        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent event) {
        button.setText("I’ve been clicked!");
    }
}

*/
//Make your own drawing widget

/*
class MyDrawPanel extends JPanel {
    //переливающийся рандомными цветами 2д круг
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);
        Color startColor = new Color(red, green, blue);
        red = (int) (Math.random() * 255);
        green = (int) (Math.random() * 255);
        blue = (int) (Math.random() * 255);
        Color endColor = new Color(red, green, blue);
        GradientPaint gradient = new GradientPaint(70, 70, startColor, 150, 150, endColor);
        g2d.setPaint(gradient);
        g2d.fillOval(70, 70, 100, 100);
    /*
    //переливающийся круг 2д
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        GradientPaint gradient = new GradientPaint(70,70,Color.blue, 150,150, Color.orange);

        g2d.setPaint(gradient);
        g2d.fillOval(70,70,100,100);
    }
    /*
    //Paint a randomly-colored circle
    //on a black background
    public void paintComponent(Graphics g) {
        g.fillRect(0,0,this.getWidth(), this.getHeight());
//палитра
        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);
        Color randomColor = new Color(red, green, blue);
        g.setColor(randomColor);
        g.fillOval(70,70,100,100);
    }
      /* add color квадрат
    public void paintComponent(Graphics g) {
        g.setColor(Color.orange);
        g.fillRect(20,50,100,100);
    }
    //add image

    public void paintComponent(Graphics g) {
        Image image = new ImageIcon("catzilla.jpg").getImage();
        g.drawImage(image,3,4,this);
    */ /*
    }
    }

    class SimpleGui3C implements ActionListener {
        JFrame frame;

        public static void main(String[] args) {
            SimpleGui3C gui = new SimpleGui3C();
            gui.go();
        }

        public void go() {
            frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JButton button = new JButton("Change colors");
            button.addActionListener(this);

            MyDrawPanel drawPanel = new MyDrawPanel();

            frame.getContentPane().add(BorderLayout.SOUTH, button);
            frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
            frame.setSize(300, 300);
            frame.setVisible(true);
        }

        public void actionPerformed(ActionEvent event) {
            frame.repaint();
        }
    }
*/

    //ДВЕ КНОПКИ
//внутренний класс в классе
/*
   class TwoButtons {
        JFrame frame;
        JLabel label;
        public static void main (String[] args) {
            TwoButtons gui = new TwoButtons ();
            gui.go();
        }
        public void go() {
            frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JButton labelButton = new JButton("Change Label");
            labelButton.addActionListener(new LabelListener());
            JButton colorButton = new JButton("Change Circle");
            colorButton.addActionListener(new ColorListener());
            label = new JLabel("I’m a label");
            MyDrawPanel drawPanel = new MyDrawPanel();

            frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
            frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
            frame.getContentPane().add(BorderLayout.EAST, labelButton);
            frame.getContentPane().add(BorderLayout.WEST, label);
            frame.setSize(700,700);
            frame.setVisible(true);
        }

        class LabelListener implements ActionListener {
            public void actionPerformed(ActionEvent event) {
                label.setText("Ouch!");
            }
        } // close inner class
        class ColorListener implements ActionListener {
            public void actionPerformed(ActionEvent event) {
                frame.repaint();
            }
        } // close inner class
    }
class MyDrawPanel extends JPanel {
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);
        Color startColor = new Color(red, green, blue);
        red = (int) (Math.random() * 255);
        green = (int) (Math.random() * 255);
        blue = (int) (Math.random() * 255);
        Color endColor = new Color(red, green, blue);
        GradientPaint gradient = new GradientPaint(70, 70, startColor, 150, 150, endColor);
        g2d.setPaint(gradient);
        g2d.fillOval(70, 70, 200, 200);
    }
}

 */
//The complete simple animation code
class SimpleAnimation {
    int x = 70;
    int y = 70;
    public static void main (String[] args) {
        SimpleAnimation gui = new SimpleAnimation ();
        gui.go();
    }
    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyDrawPanel drawPanel = new MyDrawPanel();
        frame.getContentPane().add(drawPanel);
        frame.setSize(700,700);
        frame.setVisible(true);
        for (int i = 0; i < 130; i++) {
            x++;
            y++;
            drawPanel.repaint();

            try {
                Thread.sleep(50);
            } catch(Exception ex) { }
        }

    }// close go() method
    class MyDrawPanel extends JPanel {

        public void paintComponent(Graphics g) {
            //обновление фона анимации
            g.setColor(Color.white);
            g.fillRect(0,0,this.getWidth(), this.getHeight());


            g.setColor(Color.green);
            g.fillOval(x,y,40,40);
        }
    } // close inner class
} // close outer class

//how to use the new static
//makeEvent() method
class MiniMusicPlayer1 {

    public static void main(String[] args) {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();


            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();

            for (int i = 5; i < 61; i+= 4) {

                track.add(makeEvent(144,1,i,100,i));
                track.add(makeEvent(128,1,i,100,i + 2));
            } // end loop

            sequencer.setSequence(seq);
            sequencer.setTempoInBPM(220);
            sequencer.start();
        } catch (Exception ex) {ex.printStackTrace();}
    } // close main
    public static MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
        MidiEvent event = null;
        try {
            ShortMessage a = new ShortMessage();
            a.setMessage(comd, chan, one, two);
            event = new MidiEvent(a, tick);

        }catch(Exception e) { }
        return event;
    }
} // close class