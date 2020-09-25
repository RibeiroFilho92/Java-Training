
package Entities;

public class Room {
    
    private String name;
    private String email;
    private int room;
    
    public Room( String name, String email, int room) {
        this.name = name;
        this.email = email;
        this.room = room;
    }
    
    public String toString() {
        return this.room + ": " + this.name + ", " + this.email;
    } 
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public int getRoom() {
        return this.room;
    }
    
    public void setRoom(int room) {
        this.room = room;
    }
}
