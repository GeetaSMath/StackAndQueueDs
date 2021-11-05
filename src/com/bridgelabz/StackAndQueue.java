package com.bridgelabz;

public class StackAndQueue{
        //Represent a node of the singly linked list
        public static class Node {
            private int data;
            private Node next;

            //Parameter and Default Constructors
            public Node(int x) {
                this.data = x;
                this.next = null;
            }
            public Node(){
            }
        }
        //Represent the 'Stack Pointer' like top as of the singly linked list
        private Node top = null;

        /// Method to push int element in the stack
        public void push(int x){
            Node node = new Node(x);
            if (node == null){
                System.out.println("Stack is Under flow");
                node.next = null;
            }else {
                node.next = top;
            }
            top = node;
            System.out.println("Successfully pushed " + x);
        }

        /// Method to display stack in First In Last Out Order
        public void display(){
            if (top == null)
                System.out.println("Stack is Under flow");
            Node temp = new Node();
            temp = top;
            System.out.println("Stack Contains data in 'First In Last Out' Order : ");
            while (temp != null){
                System.out.println(+temp.data);
                temp = temp.next;
            }
        }

        //Method to display the stack Peek value
        public void peek(){
            if (top == null)
                System.out.println("Stack is underflow");
            else
                System.out.println("Stack Peek value is : " + top.data);
        }

        //Method to display the stack Pop value
        public void pop(){
            if (top == null)
                System.out.println("Stack is underflow");
            else{
                System.out.println("Stack Pooped value is : " + top.data);
                top = top.next;
            }

        }

        public static void main(String[] args) {
            StackAndQueue stack = new StackAndQueue();

            //Pushing int elements
            stack.push(70);
            stack.push(30);
            stack.push(56);


            //Method to display stack in First In Last Out Order
            stack.display();

            //Peak and PoP from the Stack till it is empty
            while (stack.top != null){
                stack.peek();
                stack.pop();
            }
            if (stack.top == null)
                System.out.println("Stack is empty");
        }
        }