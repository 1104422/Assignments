
package studentsname;

public class StudentsName {

    public static void main(String[] args) {
       StudentNamesList Bs3rd = new StudentNamesList();
       Bs3rd.Insert("Hafeez");
       Bs3rd.Insert("Kamal");
       Bs3rd.Insert("Hussain");
       Bs3rd.Insert("Nazeer");
       Bs3rd.Insert("Jamal");
      
       Bs3rd.Traverse();
       
      //System.out.println(Bs3rd.Find("Kamal"));
     // Bs3rd.Insert("jann");

       Bs3rd.Traverse();

    }
    
}
