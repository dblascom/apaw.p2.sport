package es.upm.miw.apiArchitectureSports.wrappers;

public class UserWrapper {

    private String nick;

    private String email;
    
    public UserWrapper(String nick, String email) {
        super();
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
        return "UserWrapper [nick=" + nick + ", email=" + email + "]";
    }
    
    
}