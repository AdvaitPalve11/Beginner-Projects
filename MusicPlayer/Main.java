package MusicPlayer;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws UnsupportedAudioFileException, IOException {
        String filePath = "C:\\Users\\Advait\\Documents\\Beginner-Projects\\MusicPlayer\\stopWaiting.wav";
        File file = new File(filePath);

        try(AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){

            Clip clip = AudioSystem.getClip();
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

    }
}
