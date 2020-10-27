 
public class person
{

        // Instance variable of type Name
        // Reference to the class Name
        private Name personName;
 
        private static int personCounter;

        public String helloWorld()
        {
            return "Hello World";
        }
        public Name shouldReturnName() {
            return personName;
        }
        public person()
        {
            personCounter ++;
        }
        public person(Name personName)
        {
            // this() is used to assign the value of the inner value 
            // to the given parameter value 
            this.personName = personName;
        }
        public static int numberOfPersons() {
            return personCounter;
        }
}