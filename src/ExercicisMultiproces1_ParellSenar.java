public class ExercicisMultiproces1_ParellSenar
{
    public void parellSenar(int a)
    {
        if(a % 2 == 0)
        {
            System.out.println("Parell");
        }
        else
        {
            System.out.println("Senar");
        }
    }

    public static void main(String[] args)
    {
        int n1 = Integer.parseInt(args[0]);

        ExercicisMultiproces1_ParellSenar emp = new ExercicisMultiproces1_ParellSenar();
        emp.parellSenar(n1);
    }
}
