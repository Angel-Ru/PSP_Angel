import java.util.Scanner;

public class ExercicisMultiproces1
{
    public void execSenar(String n1)
    {
        String comando= "ExercicisMultiproces1_ParellSenar.java";
        try {
            ProcessBuilder pb = new ProcessBuilder("java", comando, n1);
            Process process = pb.start();
            process.getInputStream();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ExercicisMultiproces1 l = new ExercicisMultiproces1();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Introdueix un nombre (o escriu 'exit' per tancar):");
            String n1 = sc.nextLine();

            if (n1.equalsIgnoreCase("exit")) {
                System.out.println("Tancant...");
                break;
            }

            l.execSenar(n1);
        }

        sc.close();
    }
}