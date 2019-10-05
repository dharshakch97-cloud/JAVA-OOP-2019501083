import java.util.*;

public class User {
    private String user;
    private int noOfConnections;
    private User[] connections;

    User(String u, int nc, User[] c) {
        this.user = u;
        this.noOfConnections = nc;
        this.connections = c;
    }

    public getUser() {
        return this.user;
    }

    public getNoOfConnections() {
        return this.noOfConnections;
    }

    public getConnections() {
        return this.connections;
    }

    public setUser(String user_name) {
        this.user = user_name;
    }

    public setNoOfConnections(int nc) {
        this.noOfConnections = nc;
    }

    public setConnections(User[] connections_a) {
        this.connections = connections_a;
    }
}