package state.tcpconnection;

public class Application {

    public static void main(String[] args) {
        TCPConnection tcpConnection = new TCPConnection();
        tcpConnection.open();

        tcpConnection.setState(new TCPEstablished());
        tcpConnection.open();
    }
}
