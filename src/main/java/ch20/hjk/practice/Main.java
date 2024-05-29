package ch20.hjk.practice;

public class Main {
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("Usage: java Main digits");
            System.out.println("Example: java Main 1212123");
            System.exit(0);
        }

        // 문제 20-2
        sharedFalse();
        sharedTrue();

        // 문제 20-3:new로 값을 얻어서 map에 put하는 동안은 다른 스레드가 접근하지 못하도록 해야 new를 많이 호출하는 걸 방지할 수 있다.
    }

    private static void sharedTrue(){
        BigString bs = new BigString("1235546987695432135465789042045646578975123210", true);

        Runtime.getRuntime().gc();
        long used = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("사용 메모리(shared=true): " + used);
    }

    private static void sharedFalse(){
        BigString bs = new BigString("1235546987695432135465789042045646578975123210", false);

        Runtime.getRuntime().gc();
        long used = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("사용 메모리(shared=false): " + used);

    }
}
