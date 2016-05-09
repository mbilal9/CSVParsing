/**
 * Created by Bilal on 08/05/2016.
 */
public class Transfers {

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public int getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = to;
    }

    public int getTransfer() {
        return transfer;
    }

    public void setTransfer(int transfer) {
        this.transfer = transfer;
    }

    public int getTransfertime() {
        return transfertime;
    }

    public void setTransfertime(int transfertime) {
        this.transfertime = transfertime;
    }

    public Transfers(int from, int to, int transfer, int transfertime) {
        this.from = from;
        this.to = to;
        this.transfer = transfer;
        this.transfertime = transfertime;
    }

    public Transfers() {
    }

    int from;
    int to;
    int transfer;
    int transfertime;

}
