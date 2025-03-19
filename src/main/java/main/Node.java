package main;

package org.telran.de.lesson10;

public class Node {
    int val;
    Node next;

    // Конструктор узла
    public Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}

public class LinkedListExample {
    public static void main(String[] args) {
        // Создаем узлы: ->5->3->5->7 -> null
        Node zero = new Node(5, null);
        Node one = new Node(3, null);
        Node two = new Node(5, null);
        Node three = new Node(7, null);

        // Связываем узлы
        zero.next = one;
        one.next = two;
        two.next = three;

        // Выводим список
        printList(zero);
    }

    // Метод для печати списка
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
