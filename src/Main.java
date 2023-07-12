import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public Map<String, Integer> words (String filePass){
        String text = "";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePass))){
            while (bufferedReader.ready()){
                text += bufferedReader.readLine() + " ";
            }
            String [] splitedText = text.split(" ");
            Map <String, Integer> map = new HashMap<>();
            for (int i = 0; i < splitedText.length; i++) {
                int count = 0;
                for (int j = 0; j < splitedText.length; j++) {
                    if(splitedText[i].equalsIgnoreCase(splitedText[j])){
                        count++;
                    }

                }map.put(splitedText[i], count);

            }return map;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.words("words.txt"));


    }
}