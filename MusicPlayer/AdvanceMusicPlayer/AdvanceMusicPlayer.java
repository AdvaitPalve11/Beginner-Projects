package MusicPlayer.AdvanceMusicPlayer;
import javax.sound.sampled.*;
import java.io.File;
import java.util.Scanner;

public class AdvanceMusicPlayer implements AudioMethods {

    private final String filePath;
    private Clip clip;


    AdvanceMusicPlayer(String filePath){
        this.filePath = filePath;
        loadAudio();
    }

    private void loadAudio() {
        try {
            File file = new File(filePath);
            AudioInputStream audioStream =
                    AudioSystem.getAudioInputStream(file);

            clip = AudioSystem.getClip();
            clip.open(audioStream);

        } catch (Exception e) {
            System.out.println("Error loading file");
        }
    }


    void musicControl ()  {
        Scanner sc = new Scanner(System.in);
            String response = "";
            while(!response.equals("Q")){
                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("R = Reset");
                System.out.println("Q = Quit");
                System.out.print("Enter Your choice: ");

                response = sc.next().toUpperCase();

                switch (response){
                    case "P" : play();
                        break;

                    case "S" : stop();
                        break;

                    case "R" : restart();
                        break;

                    case "Q" : quit();
                        break;

                    default: System.out.println("Invalid Choice");
                }
            }
            sc.close();
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
        clip.start();
    }
    @Override
    public void quit() {
        clip.close();
    }



    public static void main(String[] args) {
        String filePath = "SONGFILEPATH";
        AdvanceMusicPlayer mp = new AdvanceMusicPlayer(filePath);
        mp.musicControl();

    }
}


