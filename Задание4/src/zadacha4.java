
//Разработайте программу, которая выбросит Exception,
// когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class zadacha4 {
    public String input() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = null;

        try {
            s = reader.readLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());

        } finally {
            try {
                reader.close();

            } 
            catch (IOException e) {
                System.out.println(e.getMessage());
            }
            if (s.equals("")) {

                throw new Exception("Пустые строки выводить нельзя!");
            }
            return s;
        }

    }

}
