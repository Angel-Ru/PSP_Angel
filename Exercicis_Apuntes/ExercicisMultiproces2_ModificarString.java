import java.util.Scanner;

public class ExercicisMultiproces2_ModificarString
{
    public static void main(String[] args) {
        // Crear un escàner per llegir l'entrada estàndard
        Scanner scanner = new Scanner(System.in);
        // Llegir el text de l'entrada
        String textInput = scanner.nextLine();

        // Transformar el text
        String textOutput = transformarText(textInput);

        // Imprimir el text transformant
        System.out.println(textOutput);

        // Tancar l'escàner
        scanner.close();
    }

    private static String transformarText(String text) {
        // Transformar a majúscules
        text = text.toUpperCase();

        // Substituir les vocals per "_"
        text = text.replace('A', '_');
        text = text.replace('E', '_');
        text = text.replace('I', '_');
        text = text.replace('O', '_');
        text = text.replace('U', '_');

        return text;
    }
}

