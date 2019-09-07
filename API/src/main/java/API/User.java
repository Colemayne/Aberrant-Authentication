package API;

import javax.persistence.*;

@Entity
@Table(name="ACCOUNT_LOGIN_CREDENTIALS")
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="account_id")
    private Integer id;
    @Column(name="username")
    private String username;
    @Column(name="email")
    private String email;
    @Column(name="password")
    private String password;
    @Column(name="salt_front")
    private String salt_front;
    @Column(name="salt_back")
    private String salt_back;

    public User(String username, String email, String password, String salt_front, String salt_back) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.salt_front = salt_front;
        this.salt_back = salt_back;
    }

    public User(){};

    public Integer getid() {
        return id;
    }

    public void setid(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSaltFront() {
        return salt_front;
    }

    public void setSaltFront(String salt_front) {
        this.salt_front = salt_front;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSalt_back() {
        return salt_back;
    }

    public void setSalt_back(String salt_back) {
        this.salt_back = salt_back;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", salt_front='" + salt_front + '\'' +
                ", salt_back='" + salt_back + '\'' +
                '}';
    }
}
