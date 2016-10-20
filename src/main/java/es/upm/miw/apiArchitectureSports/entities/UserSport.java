package es.upm.miw.apiArchitectureSports.entities;

public class UserSport {

    private int id;

    private User user;

    private Sport sport;

    public UserSport(User user, Sport sport) {
        
        this.user = user;
        this.sport = sport;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNick() {
        return user.getNick();
    }

    public void setNick(String nick) {
        user.setNick(nick);
    }

    public String getEmail() {
        return user.getEmail();
    }

    public void setEmail(String email) {
        user.setEmail(email);
    }

    public String getName() {
        return sport.getName();
    }

    public void setName(String name) {
        sport.setName(name);
    }

    @Override
    public String toString() {
        return "UserSport [id=" + id + ", user=" + user + ", sport=" + sport + "]";
    }

}
