import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Scheduler {
    private Queue<Process> processQueue;
    private List<Process> processList;
    private double currentTime;
    private double quantum;
    private boolean preemptive;
    private boolean priority;

    public Scheduler(String schedulerType, double quantum, boolean preemptive, boolean priority) {
        this.processQueue = new LinkedList<>();
        this.processList = new ArrayList<>();
        this.currentTime = 0;
        this.quantum = quantum;
        this.preemptive = preemptive;
        this.priority = priority;
    }

    public void addProcess(Process process) {
        // Add a new process to the queue
    }

    public void runScheduler() {
        // Run the scheduler using the selected scheduling algorithm
    }

    private void fcfs() {
        // Implement the FCFS algorithm
    }

    private void sjf() {
        // Implement the SJF algorithm (preemptive or non-preemptive)
    }

    private void priority() {
        // Implement the Priority algorithm (preemptive or non-preemptive)
    }

    private void roundRobin() {
        // Implement the Round Robin algorithm
    }

    public void stopScheduler() {
        // Stop the scheduler and clear the queue
    }

    public double getAverageWaitingTime() {
        // Calculate and return the average waiting time of the processes
        return 0;
    }

    public double getAverageTurnaroundTime() {
        // Calculate and return the average turnaround time of the processes
        return 0;
    }

    public List<Process> getProcessList() {
        return processList;
    }

    public double getCurrentTime() {
        return currentTime;
    }

    public Queue<Process> getProcessQueue() {
        return processQueue;
    }
}