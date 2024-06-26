package ch19.hjk.practice;

public class DayState implements State {
    private static DayState singleton = new DayState();

    private DayState(){}

    public static State getInstance(){
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {
        if(12 <= hour && hour < 13){
            context.changeState(LunchState.getInstance());
        }else if(hour < 8 || 21 <= hour){
            context.changeState(NightState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.recordLog("금고 사용(주간)");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("비상벨(주간)");
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("일반통화(주간)");
    }

    @Override
    public String toString() {
        return "[주간]";
    }
}
