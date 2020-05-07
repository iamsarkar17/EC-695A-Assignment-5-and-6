interface College
{
    String name_of_college="Siliguri Institute of Technology";
}
class Teacher
{
    String name,qualification;
    void getinfo(String c1,String quali)
    {
        name=c1;
        qualification=quali;
    }
    void disp()
    {
        System.out.println("Name= "+name+"\nQualification= "+qualification);
    }
}
class Department extends Teacher implements College
{
    int deptno;
    String deptname;
    void getdept(int d1,String c2)
    {
        //super.method(tn,tq);
        deptno=d1;
        deptname=c2;
    }
    void disp()
    {
        super.disp();
        System.out.println("Deptno= "+deptno+"\nDeptname= "+deptname+"\nCollege Name= "+name_of_college);
    }
}
class SIT
{
    public static void main(String args[])
    {
        Department d=new Department();
        d.getdept(27,"ECE");
        d.getinfo("Lohit","B.Tech");
        d.disp();
    }
}
