
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        double Balance=5000;
        double IntRate=0.17;
        double Interest1stMonth=0;
        double Interest2ndMonth=0;



       Interest1stMonth= Balance*IntRate;

       Interest2ndMonth= Balance*(IntRate+IntRate);

        System.out.print("The Interest for the first month is "+ Interest1stMonth);

        System.out.println("The Interest for the second moth is "+Interest2ndMonth);





    }


}