package com.bridgelabz;

class Queue {
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
        QNode temp = new QNode();
        temp = front;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }


    public static void main(String[] args) {
        Queue Que = new Queue();

        //Method to push int element in the Queue using front rear
        Que.enQue(56);
        Que.enQue(30);
        Que.enQue(70);

        /// Method to display Queue in First In First Out Order
        Que.display();


    }



}

