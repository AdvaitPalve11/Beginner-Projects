package MusicPlayer;
import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws UnsupportedAudioFileException, IOException {
        String filePath = "C:\\Users\\Advait\\Documents\\Beginner-Projects\\MusicPlayer\\stopWaiting.wav";
        File file = new File(filePath);

        try(Scanner sc = new Scanner(System.in);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            String response = "";



            clip.start();
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
}
