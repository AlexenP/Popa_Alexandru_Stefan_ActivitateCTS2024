package tests.dubluri;

import classes.IPersoana;

public class PersoanaFake implements IPersoana {
    private String valoareSex;
    private int valoareGetVarsta;
    private boolean valoareSetCheckCNP;
    @Override
    public String getSex() {
        return null;
    }

    @Override
    public int getVarsta() {
        return valoareGetVarsta;
    }

    @Override
    public boolean checkCNP() {
        return false;
    }

    public void setValoareSex(String valoareSex) {
        this.valoareSex = valoareSex;
    }

    public void setValoareGetVarsta(int valoareSetVarsta) {
        this.valoareGetVarsta = valoareSetVarsta;
    }

    public void setValoareSetCheckCNP(boolean valoareSetCheckCNP) {
        this.valoareSetCheckCNP = valoareSetCheckCNP;
    }
}
