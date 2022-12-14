package state.tcpconnection;

public class TCPConnection {

    private TCPState state = new TCPListen();

    public void open() {
        this.state.open();
    }

    public void close() {
        this.state.close();
    }

    public void acknowledge() {
        this.state.acknowledge();
    }

    public TCPState getState() {
        return state;
    }

    public void setState(TCPState state) {
        this.state = state;
    }
}
