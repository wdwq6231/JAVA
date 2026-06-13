package Main10_2;

public class TicketHouse implements Runnable {
    int fiveAmount = 3, tenAmount = 0, twentyAmount = 0;

    public void run() {
        if(Thread.currentThread().getName().equals("张某")) {
            saleTicket(20);  
        }
        else if(Thread.currentThread().getName().equals("李某")) {
            saleTicket(10);  
        }
        else if(Thread.currentThread().getName().equals("赵某")) {
            saleTicket(5);   
        }
    }

    private synchronized void saleTicket(int money) {
        if(money == 5) {
            fiveAmount = fiveAmount + 1;
            System.out.println("给" + Thread.currentThread().getName() + "入场券，"
                    + Thread.currentThread().getName() + "给5元，钱正好");
        }
        else if(money == 10) {
            while(fiveAmount < 1) {
                try {
                    System.out.println("\n" + Thread.currentThread().getName() + "靠边等...");
                    wait();  
                    System.out.println("\n" + Thread.currentThread().getName() + "继续买票");
                } catch(InterruptedException e) {}
            }
            fiveAmount = fiveAmount - 1;  
            tenAmount = tenAmount + 1;    
            System.out.println("给" + Thread.currentThread().getName() + "入场券，"
                    + Thread.currentThread().getName() + "给10元，找赎5元");
        }
        else if(money == 20) {
            while(fiveAmount < 3) {
                try {
                    System.out.println("\n" + Thread.currentThread().getName() + "靠边等...");
                    wait();  
                    System.out.println("\n" + Thread.currentThread().getName() + "继续买票");
                } catch(InterruptedException e) {}
            }
            fiveAmount = fiveAmount - 3;  
            twentyAmount = twentyAmount + 1; 
            System.out.println("给" + Thread.currentThread().getName() + "入场券，"
                    + Thread.currentThread().getName() + "给20元，找赎15元");
        }
        notifyAll(); 
    }
}
