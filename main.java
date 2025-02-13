import java.util.Scanner;

class HomoSapience{

    public double LeftHand_sum2(){
        
        Scanner whatever = new Scanner(System.in);

        double var = whatever.nextDouble();
        double var2 = whatever.nextDouble();

        double sum = var + var2;

        return sum;
    }
}






class main{

    public static void main( String[]args)
        {
            //System.out.println("!");

            HomoSapience samin = new HomoSapience();
            double returnedValue = samin.LeftHand_sum2();

            System.out.println(returnedValue);


        }

}




