class CarRace extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(currentThread().getName()+" has completed Lap "+i);
                currentThread().sleep(1000);
    
                if ((i == 5) && (Race.flag == 0)) { 
                    Race.flag = 1;
                    System.out.println("\n"+currentThread().getName()+" is the winner!!!!");
                }
            }
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Race {
    static int flag = 0;
    public static void main(String[] args) {
        CarRace cr1 = new CarRace();
        CarRace cr2 = new CarRace();
        CarRace cr3 = new CarRace();
        CarRace cr4 = new CarRace();
        CarRace cr5 = new CarRace();

        cr1.setName("Rahul");
        cr2.setName("Vaidehi");
        cr3.setName("Sahana");
        cr4.setName("Chirag");
        cr5.setName("Akshita");

        cr1.start();
        cr2.start();
        cr3.start();
        cr4.start();
        cr5.start();        
    }
}