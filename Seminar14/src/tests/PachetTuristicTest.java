package tests;

import classes.IPersoana;
import classes.PachetTuristic;
import classes.Persoana;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import tests.categories.CuMock;
import tests.categories.FaraMock;
import tests.dubluri.PersoanaFake;

import static org.junit.Assert.*;

public class PachetTuristicTest {

    @Test
    @Category(FaraMock.class)
    public void testCorectitudineAplicaDiscount() {
        IPersoana client = new Persoana("Ion","1290315400018");
        PachetTuristic pachetTuristic = new PachetTuristic(client,"Dest 1",20D);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(18.0,pachetTuristic.getPret(),0.01);
    }

    @Test
    @Category(FaraMock.class)
    public void aplicaDiscountBoundary(){
        IPersoana client = new Persoana("Dan","1590212");
        PachetTuristic pachetTuristic = new PachetTuristic(client,"Dest 1",20D);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(18.0,pachetTuristic.getPret(),0.01);
    }

    @Test
    @Category(CuMock.class)
    public void valoareAplicaDiscountFake(){
        PersoanaFake client = new PersoanaFake();
        PachetTuristic pachetTuristic = new PachetTuristic(client,"Dest 1",20D);
        client.setValoareGetVarsta(65);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(18.0,pachetTuristic.getPret(),0.01);
    }

    @Test
    @Category(CuMock.class)
    public void valoareNuAplicaDiscountFake() {
        PersoanaFake persoana = new PersoanaFake();
        persoana.setValoareGetVarsta(25);
        PachetTuristic pachet = new PachetTuristic(persoana, "Mamaia", 1000.0);
        pachet.aplicaDiscountVarstnici(10);
        assertEquals(1000.0, pachet.getPret(), 0.01);
    }

    @Test()
    @Category(CuMock.class)
    public void valoareAplicaDiscount100() {
        PersoanaFake persoana = new PersoanaFake();
        persoana.setValoareGetVarsta(100);
        PachetTuristic pachet = new PachetTuristic(persoana, "Mamaia", 1000.0);
        pachet.aplicaDiscountVarstnici(10);
        assertEquals(900.0, pachet.getPret(), 0.01);
    }

    @Test()
    @Category(CuMock.class)
    public void valoareAplicaDiscount0() {
        PersoanaFake persoana = new PersoanaFake();
        persoana.setValoareGetVarsta(100);
        PachetTuristic pachet = new PachetTuristic(persoana, "Mamaia", 1000.0);
        pachet.aplicaDiscountVarstnici(0);
        assertEquals(1000.0, pachet.getPret(), 0.01);
    }

    @Test()
    @Category(CuMock.class)
    public void valoareAplicaDiscount1() {
        PersoanaFake persoana = new PersoanaFake();
        persoana.setValoareGetVarsta(100);
        PachetTuristic pachet = new PachetTuristic(persoana, "Mamaia", 1000.0);
        pachet.aplicaDiscountVarstnici(1);
        assertEquals(990, pachet.getPret(),0.01);
    }
}