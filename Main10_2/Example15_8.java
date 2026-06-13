package Main10_2;

public class Example15_8 {
    public static void main(String args[]) {
        TicketHouse officer = new TicketHouse();
        Thread zhang, li, zhao;

        zhang = new Thread(officer);
        zhang.setName("张某"); 
        li = new Thread(officer);
        li.setName("李某");   
        zhao = new Thread(officer);
        zhao.setName("赵某"); 

        zhang.start();
        li.start();
        zhao.start();
    }
}