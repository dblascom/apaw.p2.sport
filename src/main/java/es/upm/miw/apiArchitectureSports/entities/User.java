package es.upm.miw.apiArchitectureSports.entities;

public class User {
    private String nick;

    private String email;

    public User(String nick, String email) {
        this.nick = nick;
        this.email = email;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User [nick=" + nick + ", email=" + email + "]";
    }
}
