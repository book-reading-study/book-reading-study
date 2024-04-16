package ch14.hjk.practice;

public class Main {
    public static void main(String[] args) {
        // 문제 14-1
        // 컴포넌트를 클릭했을 때 onClick같은 클릭 이벤트에서 클릭된 컴포넌트가 어떤 유형인지(Button, Widget, Textbox...) 사슬을 돌면서 검사한다?

        // 문제 14-2
        // support는 Client 역할을 하는 클래스에서 호출해서 문제를 처리해야 하므로 접근지정자가 public이다.
        // resolve는 Client처럼 외부에서 직접적으로 호출해서는 안 되지만, Support의 자식 클래스에서 resolve를 재정의할 수는 있어야 해서 protected로 선언

        // 문제 14-3
        Support alice = new NoSupport("Alice");
        Support bob = new LimitSupport("Bob", 100);
        Support charlie = new SpecialSupport("Charlie", 429);
        Support diana = new LimitSupport("Diana",200);
        Support elmo = new OddSupport("Elmo");
        Support fred = new LimitSupport("Fred", 300);

        alice.addNext(bob).addNext(charlie).addNext(diana).addNext(elmo).addNext(fred);

        for(int i = 0 ; i < 500 ; i+=33){
            alice.support(new Trouble(i));
        }
    }
}
