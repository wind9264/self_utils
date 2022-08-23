import java.sql.Connection

public class Connection {
    private final String url;
    private final String user;
    private final String pwd;

    Connection conn = null;


    public Connection(String url, String user, String pwd) {
        this.url = url;
        this.user = user;
        this.pwd = pwd;

        if (this.conn == null) {
            try {
            }
        }
    }

}