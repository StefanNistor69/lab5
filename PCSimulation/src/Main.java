import java.time.LocalTime;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Gaming_PC_1 Gaming_PC_1 = new Gaming_PC_1();
        Gaming_PC_2 Gaming_PC_2 = new Gaming_PC_2();
        Gaming_PC_3 Gaming_PC_3 = new Gaming_PC_3();
        Office_PC_1 Office_PC_1 = new Office_PC_1();
        Office_PC_2 Office_PC_2 = new Office_PC_2();
        Office_PC_3 Office_PC_3 = new Office_PC_3();
        Gaming_Customer gamer = new Gaming_Customer(true);
        Office_Customer office = new Office_Customer(false);
        ExperiencedWorker exp = new ExperiencedWorker(120, 12);
        NewWorker noob = new NewWorker(60, 8);


        Random rand = new Random();
        long start = System.currentTimeMillis();
        long end = start + 12*1000;
        int profit = 0;
        int endShift = 100000000;
        int startShift = 0;
        int costs = 0;




        Worker waiter = new Worker(10 * endShift, endShift);
        int randomCustomer = rand.nextInt(2);

        while (true) {


                int randomPC = rand.nextInt(7);
                int randomDiscountCard = rand.nextInt(2) + 1;
                int randomWorker = rand.nextInt(2)+1;


                int randomTimeTakeCustomer = rand.nextInt(15) + 1;
                startShift += randomTimeTakeCustomer;
                if (randomTimeTakeCustomer >= 15) {
                    System.out.println("Customer was too indecisive and left");
                    System.out.println(randomTimeTakeCustomer + " minutes waisted");
                } else if (randomCustomer == 1) {

                    switch (randomPC) {
                        case 1:
                            gamer.GamingCustomer();
                            System.out.println("Customer chose the first model of the gaming collection");
                            Gaming_PC_1.AssemblePC();
                            System.out.println("The check price was: " + Gaming_PC_1.getPrice());
                            profit += Gaming_PC_1.getPrice();
                            costs += Gaming_PC_1.getPCcost();
                            if (randomDiscountCard == 2) {
                                System.out.println("Discount!");
                                profit += Gaming_PC_1.getPrice() * 0.75;
                            }
                            if(randomWorker == 1){
                                exp.Experienced();
                                System.out.println("Customer satisfaction was good and the customer tipped " + Gaming_PC_1.getPrice()/10);
                                profit += Gaming_PC_1.getPrice()/10;
                            }else{
                                noob.New();
                                System.out.println("Customer was unsatisfied and refunded: " + Gaming_PC_1.getPrice());
                                profit -= Gaming_PC_1.getPrice();
                            }
                            break;
                        case 2:
                            gamer.GamingCustomer();
                            System.out.println("Customer chose the second model of the gaming collection");
                            Gaming_PC_2.AssemblePC();
                            System.out.println("The check price was: " + Gaming_PC_2.getPrice());
                            profit += Gaming_PC_2.getPrice();
                            costs += Gaming_PC_2.getPCcost();
                            if (randomDiscountCard == 2) {
                                System.out.println("Discount!");
                                profit += Gaming_PC_2.getPrice() * 0.75;
                            }
                            if(randomWorker == 1){
                                exp.Experienced();
                                System.out.println("Customer satisfaction was good and the customer tipped " + Gaming_PC_2.getPrice()/10);
                                profit += Gaming_PC_2.getPrice()/10;
                            }else{
                                noob.New();
                                System.out.println("Customer was unsatisfied and refunded: " + Gaming_PC_2.getPrice());
                                profit -= Gaming_PC_2.getPrice();
                            }
                            break;
                        case 3:
                            gamer.GamingCustomer();
                            System.out.println("Customer chose the third model of the gaming collection");
                            Gaming_PC_3.AssemblePC();
                            System.out.println("The check price was: " + Gaming_PC_3.getPrice());
                            profit += Gaming_PC_3.getPrice();
                            costs += Gaming_PC_3.getPCcost();
                            if (randomDiscountCard == 2) {

                                profit += Gaming_PC_3.getPrice() * 0.75;
                            }
                            if(randomWorker == 1){
                                exp.Experienced();
                                System.out.println("Customer satisfaction was good and the customer tipped " + Gaming_PC_3.getPrice()/10);
                                profit += Gaming_PC_3.getPrice()/10;
                            }else{
                                noob.New();
                                System.out.println("Customer was unsatisfied and refunded: " + Gaming_PC_3.getPrice());
                                profit -= Gaming_PC_3.getPrice();
                            }
                            break;
                        case 4:
                            office.OfficeCustomer();
                            System.out.println("Customer chose the first model of the office collection");
                            Office_PC_1.AssemblePC();
                            System.out.println("The check price was: " + Office_PC_1.getPrice());
                            profit += Office_PC_1.getPrice();
                            costs += Office_PC_1.getPCcost();
                            if (randomDiscountCard == 2) {
                                profit += Office_PC_1.getPrice() * 0.75;
                            }
                            if(randomWorker == 1){
                                exp.Experienced();
                                System.out.println("Customer satisfaction was good and the customer tipped " + Office_PC_1.getPrice()/10);
                                profit += Office_PC_1.getPrice()/10;
                            }else{
                                noob.New();
                                System.out.println("Customer was unsatisfied and refunded: " + Office_PC_1.getPrice());
                                profit -= Office_PC_1.getPrice();
                            }
                            break;
                        case 5:
                            office.OfficeCustomer();
                            System.out.println("Customer chose the second model of the office collection");
                            Office_PC_2.AssemblePC();
                            System.out.println("The check price was: " + Office_PC_2.getPrice());
                            profit += Office_PC_2.getPrice();
                            costs += Office_PC_2.getPCcost();
                            if (randomDiscountCard == 2) {
                                profit += Office_PC_2.getPrice() * 0.75;
                            }
                            if(randomWorker == 1){
                                exp.Experienced();
                                System.out.println("Customer satisfaction was good and the customer tipped " + Office_PC_2.getPrice()/10);
                                profit += Office_PC_2.getPrice()/10;
                            }else{
                                noob.New();
                                System.out.println("Customer was unsatisfied and refunded: " + Office_PC_2.getPrice());
                                profit -= Office_PC_2.getPrice();

                            }
                            break;
                        case 6:
                            office.OfficeCustomer();
                            System.out.println("Customer chose the third model of the office collection");
                            Office_PC_3.AssemblePC();
                            System.out.println("The check price was: " + Office_PC_3.getPrice());
                            profit += Office_PC_3.getPrice();
                            costs += Office_PC_3.getPCcost();
                            if (randomDiscountCard == 2) {
                                profit += Office_PC_3.getPrice() * 0.75;
                            }
                            if(randomWorker == 1){
                                exp.Experienced();
                                System.out.println("Customer satisfaction was good and the customer tipped " + Office_PC_3.getPrice()/10);
                                profit += Office_PC_3.getPrice()/10;
                            }else{
                                noob.New();
                                System.out.println("Customer was unsatisfied and refunded: " + Office_PC_3.getPrice());
                                profit -= Office_PC_3.getPrice();
                            }
                            break;

                    }
                    startShift += 15;
                }
                System.out.println("    ");



            if (System.currentTimeMillis() > end) {
                int monthlyProfit =  profit / 12;
                int monthlyCost =  costs / 12;

                System.out.println("Simulation ended");

                System.out.println("Final profit : " + profit);
                System.out.println("Final costs : " + costs);
                System.out.println("Monthly profit : " + monthlyProfit);
                System.out.println("Monthly costs : " + monthlyCost);
                System.exit(0);
            }
        }
    }


    }
