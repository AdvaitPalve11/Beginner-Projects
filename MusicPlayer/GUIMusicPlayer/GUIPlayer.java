    package MusicPlayer.GUIMusicPlayer;
    import java.awt.*;
    import javax.swing.*;
    import java.io.File;
    import javax.sound.sampled.*;
    public class GUIPlayer extends JFrame implements AudioMethods {
        private Clip clip;
        private String filePath;

        public GUIPlayer(String filepath) {
            this.filePath = filepath;

            try {
                File file = new File(filePath);
                AudioInputStream audioStream =
                        AudioSystem.getAudioInputStream(file);

                clip = AudioSystem.getClip();
                clip.open(audioStream);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this,
                        "Error loading audio");
            }

            setTitle("Music Player");
            setSize(400, 400);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(new FlowLayout());

            JButton playButton = new JButton("Play");
            JButton stopButton = new JButton("Stop");
            JButton resetButton = new JButton("Reset");
            JButton quitButton = new JButton("Quit");

            playButton.addActionListener(e -> play());

            stopButton.addActionListener(e -> stop());

            resetButton.addActionListener(e -> {
                clip.stop();
                clip.setMicrosecondPosition(0);
            });

            quitButton.addActionListener(e -> quit());

            add(playButton);
            add(stopButton);
            add(resetButton);
            add(quitButton);

            setVisible(true);
        }

        @Override
        public void play() {
        clip.start();
        }

        @Override
        public void stop() {
        clip.stop();
        }

        @Override
        public void restart() {
        clip.stop();
        clip.setMicrosecondPosition(0);
        }

        @Override
        public void quit() {
            clip.close();

        }
        public static void main(String[] args) {
            String file = "C://Users//Advait//Documents//Beginner-Projects//MusicPlayer//stopWaiting.wav";
            new GUIPlayer(file);
        }
    }


