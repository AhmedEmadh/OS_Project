public class Process {
    private String name;
    private double arrivalTime;
    private double burstTime;
    private double remainingTime;
    private double completionTime;
    private double waitingTime;
    private double turnaroundTime;
    private int priority;

    public Process(String name, double arrivalTime, double burstTime, int priority) {
        this.name = name;
        this.arrivalTime = arrivalTime;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.completionTime = 0;
        this.waitingTime = 0;
        this.turnaroundTime = 0;
        this.priority = priority;
    }

    public void execute(double time) {
        // Execute the process for the given amount of time
    }

    public String getName() {
        return name;
    }

    public double getArrivalTime() {
        return arrivalTime;
    }

    public double getBurstTime() {
        return burstTime;
    }

    public double getRemainingTime() {
        return remainingTime;
    }

    public double getCompletionTime() {
        return completionTime;
    }

    public double getWaitingTime() {
        return waitingTime;
    }

    public double getTurnaroundTime() {
        return turnaroundTime;
    }

    public int getPriority() {
        return priority;
    }
}