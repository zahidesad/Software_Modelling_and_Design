package org.week11_lab.example01;

public class Client {
    public static void main(String[] args) {
        Task task = new Task();
        System.out.println(task);

        System.out.println("\n→ Claiming the task...");
        task.claim();
        System.out.println(task);

        System.out.println("\n→ Pausing the task...");
        task.pause();
        System.out.println(task);

        System.out.println("\n→ Claiming again...");
        task.claim();
        System.out.println(task);

        System.out.println("\n→ Rejecting while in progress...");
        task.reject();
        System.out.println(task);

        System.out.println("\n→ Claiming once more...");
        task.claim();
        System.out.println(task);

        System.out.println("\n→ Completing the task...");
        task.complete();
        System.out.println(task);

        System.out.println("\n→ Trying to claim a completed task...");
        try {
            task.claim();
        } catch (IllegalStateException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
