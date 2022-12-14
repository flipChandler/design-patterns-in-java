package state.tcpconnection;

public abstract class TCPState {

    protected abstract void open();
    protected abstract void close();
    protected abstract void acknowledge();
}
