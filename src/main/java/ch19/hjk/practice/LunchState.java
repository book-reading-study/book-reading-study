package ch19.hjk.practice;

// 문제 19-3
public class LunchState implements State{
    private static LunchState singleton = new LunchState();

    private LunchState(){}

    public static State getInstance(){
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {
        if((9 <= hour && hour < 12)|| (13 <= hour && hour < 17)){
            context.changeState(DayState.getInstance());
        }else if(hour < 8|| 21 <= hour){
            context.changeState(NightState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.callSecurityCenter("비상: 점심시간 금고 사용!");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("비상벨(점심)");
    }

    @Override
    public void doPhone(Context context) {
        context.recordLog("점심시간 통화 녹음");
    }

    @Override
    public String toString() {
        return "[점심]";
    }
}
