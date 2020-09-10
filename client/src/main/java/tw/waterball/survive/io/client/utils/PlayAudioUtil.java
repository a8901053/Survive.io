package tw.waterball.survive.io.client.utils;

import javax.sound.sampled.*;
import java.io.File;
import java.text.NumberFormat;


/**
 * @author - c11037at@gmail.com
 */
public class PlayAudioUtil {

    public static void playAudioEffect(String fileName) {
        //todo maybe we can cache each audio to prevent reloading each file, for example: how to resolve continuous shooting?
        File file = new File(fileName);
        try {
            AudioInputStream audioInputStream = AudioSystem
                    .getAudioInputStream(file);
            AudioFormat format = audioInputStream.getFormat();
            DataLine.Info info = new DataLine.Info(SourceDataLine.class, format);
            SourceDataLine line = (SourceDataLine) AudioSystem.getLine(info);
            line.open();
            line.start();
            int length = 0;
            byte[] buffer = new byte[512];
            while ((length = audioInputStream.read(buffer)) != -1) {
                NumberFormat numberFormat = NumberFormat.getInstance();
                numberFormat.setMaximumFractionDigits(2);
                line.write(buffer, 0, length);
            }
            line.drain();
            line.close();
            audioInputStream.close();
        } catch (Exception e) {
            //todo do something
        }
    }
}
