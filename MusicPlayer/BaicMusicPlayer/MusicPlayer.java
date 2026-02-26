package MusicPlayer.BaicMusicPlayer;
import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MusicPlayer {
    private final String filePath;
    private Clip clip;
    MusicPlayer(String filePath){
        this.filePath = filePath;
    }

    void musicControl(){
        File file = new File(filePath);
        try(Scanner sc = new Scanner(System.in);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){

            clip = AudioSystem.getClip();
            clip.open(audioStream);

            String response = "";

            while(!response.equals("Q")){
                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("R = Reset");
                System.out.println("Q = Quit");
                System.out.print("Enter Your choice: ");

                response = sc.next().toUpperCase();

                switch (response){
                    case "P" : clip.start();
                        break;

                    case "S" : clip.stop();
                        break;

                    case "R" :
                        clip.stop();
                        clip.setMicrosecondPosition(0);
                        break;

                    case "Q" : clip.close();
                        break;

                    default:
                        System.out.println("Invalid Choice");

                }
            }

        }
        catch (FileNotFoundException e){
            System.out.println("File Not Found");
        }
        catch (UnsupportedAudioFileException e){
            System.out.println("Audio File NOT Supported");
        }

        catch (IOException e){
            System.out.println("Something went wrong");
        }
        catch (LineUnavailableException e) {
            throw new RuntimeException(e);
        }
        finally {
            System.out.println("Song Ended");

        }

    }

    public static void main(String[] args){
        String filePath = "SONGFILEPATH";
        MusicPlayer mp = new MusicPlayer(filePath);
        mp.musicControl();

    }
}
