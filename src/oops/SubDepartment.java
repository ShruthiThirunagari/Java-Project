package oops;

public class SubDepartment extends Department{
    private int noe;

    public SubDepartment(int noe){
        this.noe = noe;
    }

    @Override
    public int getDepartmentSize() {
        return noe;
    }
}
