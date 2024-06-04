import java.util.*;
// public class user{
//     String name ;
//     long  aadhar;
//     long 

// }



public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
      

        System.out.println("enter no of users");
        int nu = sc.nextInt();
        user[] arr = new user[nu];

        for(int i=0;i<nu;i++){
            int cc= i+1;
            System.out.println("Enter name of user" + cc );
            String a = sc.nextLine();
            String aa = sc.nextLine();

            System.out.println("Enter aadhar of user" + cc );
            String b = sc.nextLine();
            System.out.println("Enter phno of user" + cc);
            String c = sc.nextLine();
            arr[i] = new user(aa, b, c);
        
            System.out.println("enter the no. of days you want to stay");
            int noof = sc.nextInt();
            hotel h1 = new hotel();


        int roomprice=0;
        int hotelprice=0;
        for(int ii=0;ii<noof;ii++){
        System.out.println("Enter the type of rooms you want");
        System.out.println("1. For gold press 1 ");
        System.out.println("2. For silver press 2 ");
        System.out.println("3. For bronze press 1 ");
        System.out.println("4. For exit press 0 ");

        int n;
        n = sc.nextInt();
        System.out.println("enter the no. of rooms you want ");
        int ne = sc.nextInt();

        

        switch(n){
            case 1: roomprice+= ne*h1.getg(); 

            case 2: roomprice+= ne*h1.gets(); 

            case 3: roomprice+= ne*h1.getb(); 
            default: break;
        }
        System.out.println("Enter the type of services you want");
        System.out.println("1. For laundry press 1 ");
        System.out.println("2. For spa press 2 ");
        System.out.println("3. For breakfast press 3 ");
        System.out.println("4. For breakfast and laundry press 4 ");
        System.out.println("5. For breakfast and spa press 5 ");
        System.out.println("6. For spa and laundry press 6");
        System.out.println("7. For breakfast and laundry and spa press 7 ");

        System.out.println("8. For exit press 0 ");

       int services;
        services = sc.nextInt();

        switch(services){
            case 1: hotelprice+= h1.getl(); 

            case 2: hotelprice+= h1.getspa(); 

            case 3: hotelprice+= h1.getbr(); 
            case 4 : hotelprice+= h1.getbr()+h1.getl();
           
            case 5 :  hotelprice+= h1.getbr()+h1.getspa();
            case 6 :  hotelprice+= h1.getl()+h1.getspa();
            case 7 :  hotelprice+= h1.getbr()+h1.getspa() + h1.getl();
            default: break;
        }









    }

     int finalprice = roomprice+hotelprice;
     System.out.println(" the final price for user named " + arr[i].getname() + " is :");
     System.out.println(finalprice);

    }
}
}
