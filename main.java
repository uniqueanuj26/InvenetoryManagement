public class main {
    public static void main(String[] args) {

        /* 
        Innermain in = new Innermain()
        {

            public void show(){
                System.out.println("in show 1");
            }
        }; 
        in.show();
        */

        //product operation

        product pd = new product();
        pd.setBatch(1001, "Phone", 200, 20);
        System.out.println(pd.getBatch());

        //customer operation
        customer cus = new customer();

        //inventory operation
        inventory inv = new inventory();

    }
}


class Innermain {

    public void show(){
        System.out.println("in show");
    }
}
