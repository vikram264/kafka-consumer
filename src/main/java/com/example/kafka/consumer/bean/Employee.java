package com.example.kafka.consumer.bean;

public class Employee
{

    private String name;
    private String empId;
    private String lob;

    public Employee (String name, String empId, String lob)
    {

        this.name = name;
        this.empId = empId;
        this.lob = lob;
    }

    public Employee ()
    {

    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getEmpId ()
    {
        return empId;
    }

    public void setEmpId (String empId)
    {
        this.empId = empId;
    }

    public String getLob ()
    {
        return lob;
    }

    public void setLob (String lob)
    {
        this.lob = lob;
    }

    @Override
    public String toString ()
    {
        return "Employee [name=" + name + ", empId=" + empId + ", lob=" + lob + "]";
    }

}
