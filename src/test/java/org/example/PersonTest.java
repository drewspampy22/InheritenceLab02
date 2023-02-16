package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person p1;
    Person p2;
    Person p3;
    Person p4;
    Person p5;
    Person p6;

    PersonTest() {
    }

    @BeforeEach
    void setUp() {
        this.p1 = new Person("Drew", "Spampinato", "000001", "Mr.", 2000);
        this.p2 = new Person("Jared", "Place", "000002", "Mr.", 2001);
        this.p3 = new Person("Sean", "Roberts", "000003", "Mr.", 2002);
        this.p4 = new Person("Luke", "Myers", "000004", "Mr.", 2003);
        this.p5 = new Person("Dylan", "ShoeMaker", "000005", "Mr.", 2004);
        this.p6 = new Person("Luke", "Compton", "000006", "Mr.", 2005);
    }

    @Test
    void setID() {
        this.p1.setID("00000A");
        Assertions.assertEquals("00000A", this.p1.getID());
    }

    @Test
    void setFirstName() {
        this.p6.setfirstName("Anthony");
        Assertions.assertEquals("Anthony", this.p6.getfirstName());
    }

    @Test
    void setLastName() {
        this.p4.setlastName("Ero");
        Assertions.assertEquals("Ero", this.p4.getlastName());
    }

    @Test
    void setTitle() {
        this.p5.setTitle("Dr.");
        Assertions.assertEquals("Dr.", this.p5.getTitle());
    }

    @Test
    void setYOB() {
        this.p3.setYOB(1999);
        Assertions.assertEquals(1999, this.p3.getYOB());
    }

    @Test
    void toCSVDataRecord() {
        this.p1.toCSVRecordMethod();
    }

    @Test
    void fullName() {
        this.p1.getFullName();
    }

    @Test
    void formalName() {
        this.p1.getFormalName();
    }

    @Test
    void getAge() {
        this.p1.getAge();
    }

    @Test
    void testGetAge() {
    }


}
