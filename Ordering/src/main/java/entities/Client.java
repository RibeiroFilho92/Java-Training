
package entities;

import static entities.Order.sdf;
import java.util.Date;

public class Client {
    
    private String name;
    private String email;
    private Date birthDate;
    
    public Client() {}
    
    public Client(String name, String email, Date birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public Date getBirthDate() {
        return this.birthDate;
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getName() + " (");
        sb.append(sdf.format(getBirthDate()));
        sb.append(")" + " - " + getEmail());
        return sb.toString();
    }
}
