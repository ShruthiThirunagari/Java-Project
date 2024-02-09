package oops;

public class Main {
    public static void main(String [] args){
        SubDepartment subDepartment = new SubDepartment(50);
                int departmentsize = subDepartment.getDepartmentSize();
                System.out.println("Sub Department size = "+departmentsize);
    }
}
