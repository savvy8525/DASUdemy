package com.linkedlist;


public class LinkedList {

    // CREATE CLASS VARIABLES, NODE CLASS, AND CONSTRUCTOR HERE //
    //                                                          //
    //                                                          //
    //                                                          //
    //                                                          //
    //////////////////////////////////////////////////////////////
    static class Node {
        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;
    int length;

    public LinkedList(int value) {
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
    }

    public void getTail() {
        if (head == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.value);
        }
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }

    // WRITE APPEND METHOD HERE //
    //                          //
    //                          //
    //                          //
    //                          //
    //////////////////////////////

    public void append(int value) {
            Node append = new Node(value);
            if(this.head == null) {
                this.head = append;
                this.tail = append;
            }else {
                this.tail.next = append;
                this.tail = append;
            }
            length++;
    }

    // WRITE REMOVELAST METHOD HERE //
    //                              //
    //                              //
    //                              //
    //                              //
    //////////////////////////////////

    public Node removeLast() {
        Node temp = head;
        Node pre = head;
        if(head == null) {
            return null;
        }
        while(temp.next != null) {
                pre = temp;
                temp = temp.next;
        }

        this.tail = pre;
        this.tail.next = null;
        length--;

        if(length == 0) {
            this.head = null;
            this.tail = null;
        }

        return temp;
    }

    // WRITE PREPEND METHOD HERE //
    //                           //
    //                           //
    //                           //
    //                           //
    ///////////////////////////////

    public void prepend(int value) {
        Node prepend = new Node(value);
        Node temp = head;
        if(this.head != null) {
            this.head = prepend;
            this.head.next = temp;
            length++;
            if(length == 1) {
                this.tail = this.head;
            }
        }

        /* Instructor code
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
         */


    }

}
