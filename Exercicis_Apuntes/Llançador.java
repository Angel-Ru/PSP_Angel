import java.io.File;

public class Llançador
{

    public void execSuma(String n1, String n2)
    {
        String comando= "src/Apuntes.java";
                try {
                    ProcessBuilder pb = new ProcessBuilder("java", comando, n1, n2);
                    pb.redirectOutput(new File("src/Prova.txt"));
                    pb.start();
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
    }

    public static void main(String[] args)
    {
        Llançador l = new Llançador();

        String n1 = args[0];
        String n2 = args[1];
        l.execSuma(n1,n2);
    }
}
