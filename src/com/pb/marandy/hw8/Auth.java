package com.pb.marandy.hw8;

public class Auth {
  private String login;
   private String password;

    public void signUp(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
       if (login.length()>=5 && login.length()<=20 && login.matches("[a-zA-Z0-9]+")){
           this.login = login;
       } else {
       throw new WrongLoginException("Недопустимый login");
       }
       if (password.length()>=5 && password.matches("[a-zA-Z0-9_]+")) {
           this.password = password;
       } else {
           throw new WrongPasswordException();
       }
       if (password.equals(confirmPassword)){
           System.out.println("Вы успешно зарегистрировались");
       } else {
           throw new WrongPasswordException();
       }
    }
    public void signIn (String login, String password) throws WrongLoginException {
    if (login.equals(this.login) && password.equals(this.password)){
        System.out.println("Вы успешно вошли на сайт");
    } else {
        throw new WrongLoginException("Логин или пароль введены неверно");
    }
    }
}
