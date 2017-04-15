/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocurrency1;

/**
 *
 * @author dmaslov
 */
public class Cocurrency1 implements Runnable {

    /**
     * @param args the command line arguments
     */
    public void run() {

    }

    public static void main(String[] args) throws InterruptedException {

        //(new Thread(new Cocurrency1())).start();

        System.out.println("Hi from Thread!");
        String Messages[] = {
            "Line-1",
            "Line-2",
            "Line-3"
        };

        for (int i = 0; i < Messages.length; i++) {
            Thread.sleep(4000);
            System.out.println(Messages[i]);
        }

    }

}
