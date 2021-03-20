package lab9;

/**
 * Created by asmaa on 23/03/2019.
 */
public class Process {
    private int ProcessIndex;
    private int ArrivalTime;
    private int ExecutingTime;
    private int WaitingTime;
    private int RemainingTime;
    private int EndTime;
    private int TurnAroundTime;

    public Process(int ProcessIndex, int arrivalTime, int executingTime) {
        this.ProcessIndex = ProcessIndex;
        this.ArrivalTime = arrivalTime;
        this.ExecutingTime = executingTime;
        this.WaitingTime = 0;
        this.RemainingTime = executingTime;
    }

    public void setProcessIndex(int processIndex) {
        ProcessIndex = processIndex;
    }

    public void setArrivalTime(int arrivalTime) {
        ArrivalTime = arrivalTime;
    }

    public void setExecutingTime(int executingTime) {
        ExecutingTime = executingTime;
    }

    public void setWaitingTime(int waitingTime) {
        WaitingTime = waitingTime;
    }

    public void setRemainingTime(int remainingTime) {
        RemainingTime = remainingTime;
    }

    public void setEndTime(int endTime) {
        EndTime = endTime;
    }

    public void setTurnAroundTime(int turnAroundTime) {
        TurnAroundTime = turnAroundTime;
    }

    public int getProcessIndex() {
        return ProcessIndex;
    }

    public int getArrivalTime() {
        return ArrivalTime;
    }

    public int getExecutingTime() {
        return ExecutingTime;
    }

    public int getWaitingTime() {
        return WaitingTime;
    }

    public int getRemainingTime() {
        return RemainingTime;
    }

    public int getEndTime() {
        return EndTime;
    }

    public int getTurnAroundTime() {
        return TurnAroundTime;
    }
}
