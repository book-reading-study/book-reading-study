package ch18.geonhee;

import ch18.geonhee.game.Gamer;
import ch18.geonhee.game.Memento;

public class Main {

    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);
        Memento memento = gamer.createMemento();

        for (int i = 0; i < 100; i++) {
            System.out.println("==== " + i);
            System.out.println("상태: " + gamer);

            gamer.bet();

            System.out.println("소지금은 " + gamer.getMoney() + "원 입니다.");

            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("많이 늘었음. 현재 상태 저장!");
                memento = gamer.createMemento();
                continue;
            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                System.out.println("많이 줄었음. 이전 상태를 복원!");
                gamer.restoreMemento(memento);
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println();
        }
    }
}
