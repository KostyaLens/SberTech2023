package org.example;

class Fоrk {
    public boolean taken;
}
public class Philosopher implements Runnable {
    private Fоrk leftFork;
    private Fоrk rightFork;
    public Philosopher(Fоrk leftFork, Fоrk rightFork){
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    @Override
    public void run() {
        while (true){
//            if (Thread.// я хотел получить вот так доспуп взята ли вилка если да то философ думает, и ждеёт пока осободиться)
//                if //здесь я хотел проверить зята ли второя если то он кладёт ту что взял и думает
                    //а здесь типо есть а потом кладёт обез вилки
                // взята ли вилка я хотел контролировать полем taken у Fork
            //
        }
    }
}
