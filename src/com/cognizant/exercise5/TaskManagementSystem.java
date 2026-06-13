package com.cognizant.exercise5;

public class TaskManagementSystem {

    private Node head;

    public void addTask(Task task){
        Node nn=new Node(task);
        if(head==null){
            head=nn;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=nn;
    }
    public Task search(int taskId){
        if(head==null){
            return null;
        }
        Node temp=head;
        while(temp !=null){
            if(temp.task.taskId==taskId){
                return temp.task;
            }
            temp=temp.next;
        }
        return null;
    }
    public void displayTasks(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.task);
            temp=temp.next;
        }
    }
    public void deleteTask(int taskId){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        if(head.task.taskId==taskId){
             head=head.next;
             System.out.println("task delete");
             return;
        }
        Node temp = head;

        while (temp.next != null &&
                temp.next.task.taskId != taskId) {

            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Task Not Found");
            return;
        }

        temp.next = temp.next.next;

        System.out.println("Task Deleted");

    }
}
