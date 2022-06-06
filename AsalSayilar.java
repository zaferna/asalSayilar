public class AsalSayilar {
    public static void main(String[] args) {

        int i, n,sum;


        for (i = 2; i <= 100; i++) {
            sum=0;

            for(n=2; n<=i;n++){

                if(i%n==0){

                    sum+=n;


                    }



                }

            if(sum%i==0){

                System.out.print(i+ "  ");
            }



        }
    }
}
