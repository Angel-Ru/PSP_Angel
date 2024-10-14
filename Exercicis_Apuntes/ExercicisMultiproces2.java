import java.io.*;
import java.util.Scanner;

public class ExercicisMultiproces2
{
        static final String dirPath = "D:\\Desenvolupament_aplicacions_multiplataforma\\PSP\\Exercici_1\\src";

        static final String [] comand = {
                "java",
                  "ExercicisMultiproces2_ModificarString" + ".java"
        };

        public static Process execProrama() throws IOException {
            ProcessBuilder programa = new ProcessBuilder(comand);
            programa.directory(new File(dirPath));
          /*  programa.redirectError(new File(dirPath+"\\error.txt"));*/
            return programa.start();
        }

        private static void enviar(Process process, String input) throws IOException
        {
            OutputStream outs = process.getOutputStream();
            OutputStreamWriter outsw = new OutputStreamWriter(outs);
            BufferedWriter outbw = new BufferedWriter(outsw);
            outbw.write(input);
            outbw.newLine();
            outbw.flush();
            outs.close();
        }


        private static String llegir(Process process) throws IOException
        {

            InputStream inS = process.getInputStream();

            InputStreamReader inSR = new InputStreamReader(inS);

            BufferedReader inBR = new BufferedReader(inSR);


            return inBR.readLine();

        }

        public static void main(String[] args) throws IOException {
            try (Scanner sc = new Scanner(System.in))
            {
                while (true)
                {
                    System.out.println("El pare diu : Escriu una frase");

                    String n = sc.nextLine();

                    if("exit".equals(n)) return;

                    Process process = execProrama();

                    enviar(process, n);
                    String retorn = llegir(process);
                    System.out.println("El pare diu:" + retorn);

                    System.out.println("El pare diu: Fi");
                }
            }
        }
}
