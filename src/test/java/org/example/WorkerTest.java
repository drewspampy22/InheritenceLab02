package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {
    Worker w1;

    WorkerTest() {
    }

    @BeforeEach
    void setUp() {
        this.w1 = new Worker("Drew", "Spampinato", "000006", "Mr.", 2002, 60.5);
    }

    @Test
    void calculateWeeklyPay() {
        System.out.println(this.w1.calculateWeeklyPay(60.0));
    }

    @Test
    void displayWeeklyPay() {
        System.out.println(this.w1.displayWeeklyPay(40.0));
    }
}