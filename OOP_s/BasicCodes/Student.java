
public class Student{
    
    private static int count = 0;
    public String Name;
    public int Age;
    private String Course;
    private int ID;
    protected String Hometown;

    // Constructor method will not have any return type including void
    // Constructor is a special function or method to create objects
    public Student(String name, int age, String course, String hometown)
    {
        this.Name = name;
        this.Age = age;
        this.Course = course;
        this.Hometown = hometown;

        this.register();
    }

    //Constructor which doesn't take any input parameters or function argument 
    public Student()
    {

    }

    // Special function constructor which only takes name as input
    public Student(String name)
    {
        this.Name = name;
    }

    public String getName()
    {
        return this.Name;
    }

    public int getAge()
    {
        return this.Age;
    }
    
    public String getCourse()
    {
        return this.Course;
    }

    public String getHometown()
    {
        return this.Hometown;
    }

    // Register the student and retuns the ID
    private int register()
    {
        count++;
        this.ID = count;        
        return this.ID;
    }

    private void updateName(String name)
    {
        this.Name = name;
    }

    protected void updateAge(int age)
    {
        this.Age = age;
    }
}
