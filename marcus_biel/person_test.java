import static org.junit.Assert.assertEquals;
import java.util.Arrays;

import org.junit.Test;
public class person_test{
    private static final String[] MY_STATE_VALUES = {
        "PENDING" , "PROCESSING" , "PROCESSED"
    };
    private String[] states()
    {
        return Arrays.copyOf(MY_STATE_VALUES, MY_STATE_VALUES.length);
    }
    @Test
    public void shouldReturnHelloWorld()
    {
        person marcus = new person();
        assertEquals("Hello World",marcus.helloWorld());
    }
    @Test
    public void shouldReturnNumberOfPersonsInLoop()
    {
        for(int i = 0;i < 4; i++)
        {
            person myPerson = new person();
        }
        assertEquals(4, person.numberOfPersons());
    }
    @Test
    public void shouldReturnNumberOfPersonsInWhileLoop()
    {
        int i =0;
        while(i < 4)
        {
           person myPerson = new person();
            i ++;
        }
        assertEquals(4, person.numberOfPersons());
    }
    @Test
    public void shouldReturnNumberOfPersonsInDoWhileLoop()
    {   
        person myPerson;
        int i =0;
        do
        {
            myPerson = new person();
            i ++;
        }
        while(i < 4);
        assertEquals(4, person.numberOfPersons());
    }
    @Test
    public void shouldReturnNumberOfPersons()
    {
        person person1 = new person();
        person person2 = new person();
        person person3 = new person();
        person person4 = new person();
        assertEquals(4, person1.numberOfPersons());
    }
    @Test
    public void shouldReturnHelloNeville()
    {
     marcus neville = new marcus();
     assertEquals("Hello Neville", neville.hello("Neville"));
    }
    @Test
    public void shouldDemonstrateArrays()
    {
        // Here we have an array of type person and its reference 
        // object is persons and its max length is 4
        person[] persons  =new person[4];
        // Here we create a new object of type person and 
        // allocate it to the zero position of the array
        persons[0] = new person();
        for(int i = 0;i <2; i ++)
        {
            persons[i] = new person(); 
            System.out.println(persons[i].helloWorld());
        }
       
    }
    @Test
    public void shouldDemonstrateForEachLoopInArrays()
    {
        person[] persons = new person[4];
        for(person person1 :persons)
        {
            person1 = new person(); 
            System.out.println(person1.helloWorld());
        }
    }
    @Test
    public void shouldDemmoCurlyArray()
    {
        person myPerson = new person();
        person[] persons = new person[4];
        persons[0] = new person();
        person person2 = new person();
        person[] person3 = {myPerson , persons[0]};
        System.out.println( persons[0].helloWorld());
    }
    @Test
    public void shouldDemoEnums()
    {
        LoggingLevel state= LoggingLevel.PROCCESSED;
        switch(state)
        {
            case PENDING:
               System.out.println(casePending());
                break;
            case PROCCESSED:
                System.out.println(caseProcessed());
                break;
            case PROCESSING:
                System.out.println(caseProcessing());
            default:
                System.out.println("The Logging Level stated above isnt among the enumerated values");
                break;
        }


        for(LoggingLevel current:LoggingLevel.values())
        {
            
            if( current.equals(LoggingLevel.PENDING))
            {
                System.out.println("It is Pending");
            }
            if( current.equals(LoggingLevel.PROCESSING))
            {
                System.out.println("The state is PROCESSING");  
            }
            if( current.equals(LoggingLevel.PROCCESSED))
            {
                System.out.println("The state is PROCESSED");  
            }
        }
    }
    

    public String casePending()
    {
        return "This level is Pending";
    }
    public String caseProcessing()
    {
        return "This level is Processing";
    }
    public String caseProcessed()
    {
        return "This level is Processed";
    }
}