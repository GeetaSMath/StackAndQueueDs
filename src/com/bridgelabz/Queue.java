package com.bridgelabz;


public class Queue {
    //Represent a node of the singly linked list
    public static class QNode {
        private int data;
        private QNode next;

        //Parameter and Default Constructors of QNode
        public QNode(int x) {
            this.data = x;
            this.next = null;
        }
        public QNode(){
        }
    }

    //Represent the 'Q Front and Rear Pointers for the EnQue and DeQue' as of the singly linked list
    public QNode front = null;
    public QNode rear = null;

    //Method to push int element in the Queue using front rear
    public void enQue(int x){
        QNode node = new QNode(x);
        if (front == null){
            System.out.println("Queue is Underflow and Empty");
            front = node;
        }else {
            rear.next = node;
        }
        rear = node;
        System.out.println("Successfully EnQue the data : " + x);
    }

    /// Method to display Queue in First In First Out Order
    public void display() {
        if (front == null)
            System.out.println("Que is Empty");
        QNode temp = new QNode();
        temp = front;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    //Method to push int element in the DeQue using front rear
    public void deAllQue(){
        if (front == null){
            System.out.println("Queue is Underflow and Empty");
            return;
        }
        while (front != null){
            QNode temp = front;
            System.out.println("Successfully DnQue the data : " + front.data);
            front = front.next;
        }
        rear = null;
    }

    //Method to find size
    public void deQue(){
        if (front == null){
            System.out.println("Queue is Underflow and Empty");
            return;
        }
        System.out.println("Successfully DnQue the data : " + front.data);
        front = front.next;
    }

    public void size(){
        if (front == null){
            System.out.println("Que is Empty Size is Zero");
            return;
        }
        int i=0;
        while (front != null) {
            i++;
            front = front.next;
        }
        System.out.println("Que is Size is " + i);
    }


    public static void main(String[] args) {
        Queue Que = new Queue();

        //Method to push int element in the Queue using front rear
        Que.enQue(56);
        Que.enQue(30);
        Que.enQue(70);
        Que.enQue(40);
        Que.display();


        //Method to remove int element in the Queue using front rear
        Que.deQue();

        /// Method to display Queue in First In First Out Order
        Que.display();

        //Method to remove all int element in the Queue using front rear
        Que.deAllQue();

        Que.display();

        //Method to find size
        Que.size();


    }

}
