package linkedlist;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListsTest {

    LinkedLists testList = new LinkedLists();

    @BeforeEach
    public void setUp(){
        for(int i = 0; i < 10; i ++){
            testList.addLast(i);
            assert true;
        }
    }

    @org.junit.jupiter.api.Test
    void addFirst() {
        assert true;
    }

    @org.junit.jupiter.api.Test
    void addLast() {
    }

    @org.junit.jupiter.api.Test
    void deleteFirst() {
    }

    @org.junit.jupiter.api.Test
    void deleteLast() {
    }

    @org.junit.jupiter.api.Test
    void contains() {
    }

    @org.junit.jupiter.api.Test
    void indexOf() {
    }

    @org.junit.jupiter.api.Test
    void size() {
    }

    @org.junit.jupiter.api.Test
    void toArray() {
    }

    @org.junit.jupiter.api.Test
    void testToString() {
    }

    @org.junit.jupiter.api.Test
    void reverse() {
    }

    @org.junit.jupiter.api.Test
    void kFromEnd() {
    }

    @org.junit.jupiter.api.Test
    void findMiddle() {
    }
}