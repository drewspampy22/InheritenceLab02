package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest {
    SalaryWorker sw1;

    SalaryWorkerTest() {
    }

    @BeforeEach
    void setUp() {
        this.sw1 = new SalaryWorker("Drew", "Spampinato", "000005", "Mr.", 2002, 60.5, 105400.0);
    }

    @Test
    void calculateWeeklyPay() {
        System.out.println(this.sw1.calculateWeeklyPay(0.0));
    }

}