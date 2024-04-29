package ch16.hjk.practice;

import ch16.hjk.example.ColleagueButton;
import ch16.hjk.example.ColleagueCheckbox;
import ch16.hjk.example.ColleagueTextField;
import ch16.hjk.example.Mediator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame2 extends Frame implements ActionListener, Mediator {
    private ColleagueCheckbox checkGuest;
    private ColleagueCheckbox checkLogin;
    private ColleagueTextField textUser;
    private ColleagueTextField textPass;
    private ColleagueButton buttonOk;
    private ColleagueButton buttonCancel;

    public LoginFrame2(String title){
        super(title);

        setBackground(Color.lightGray);
        setLayout(new GridLayout(4, 2));

        createColleagues();

        add(checkGuest);
        add(checkLogin);
        add(new Label("Username: "));
        add(textUser);
        add(new Label("Password: "));
        add(textPass);
        add(buttonOk);
        add(buttonCancel);

        colleagueChanged();

        pack();
        setVisible(true);

    }

    @Override
    public void createColleagues() {
        CheckboxGroup g = new CheckboxGroup();
        checkGuest = new ColleagueCheckbox("Guest", g, true);
        checkLogin = new ColleagueCheckbox("Login", g, false);

        textUser = new ColleagueTextField("", 10);
        textPass = new ColleagueTextField("", 10);
        textPass.setEchoChar('*');

        buttonOk = new ColleagueButton("OK");
        buttonCancel = new ColleagueButton("Cancel");

        checkGuest.setMediator(this);
        checkLogin.setMediator(this);
        textUser.setMediator(this);
        textPass.setMediator(this);
        buttonOk.setMediator(this);
        buttonCancel.setMediator(this);

        checkGuest.addItemListener(checkGuest);
        checkLogin.addItemListener(checkLogin);
        textUser.addTextListener(textUser);
        textPass.addTextListener(textPass);
        buttonOk.addActionListener(this);
        buttonCancel.addActionListener(this);

    }

    @Override
    public void colleagueChanged() {
        if(checkGuest.getState()) {
            textUser.setColleagueEnabled(false);
            textPass.setColleagueEnabled(false);
            buttonOk.setColleagueEnabled(true);
        }else{
            textUser.setColleagueEnabled(true);
            userPassChanged();
        }
    }

    private void userPassChanged() {
        if(textUser.getText().length() > 0){
            textPass.setColleagueEnabled(true);
        }else{
            textPass.setColleagueEnabled(false);
            buttonOk.setColleagueEnabled(false);
        }

        // 16-1 연습문제
        // 사용자 이름, 패스워드가 모두 4문자 이상일 때만 OK 버튼 활성화
        if(textUser.getText().length() > 3 && textPass.getText().length() > 3){
            buttonOk.setColleagueEnabled(true);
        }else{
            buttonOk.setColleagueEnabled(false);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        System.exit(0);
    }
}
