package ch19.geonhee.example;

public interface Context {

    void setClock(int hour);

    void changeState(State state);

    void callSecurityCenter(String msg);

    void recordLog(String msg);
}
