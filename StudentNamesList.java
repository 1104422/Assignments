
package studentsname;

public class StudentNamesList {
    private String[] Names = new String [5];
    // Insert
    int IndexNumber;
    void Insert(String EnterName){
        if (IndexNumber < Names.length){
        Names[IndexNumber++] = EnterName;
        }
    }
     
    // Traverse
    void Traverse(){
        for(int i = 0;i<Names.length;i++){
            System.out.println(Names[i]+"[" +i+"]");
        }
    }
    //Find
    String Find(String SearchName){
        String Index = "Not Found";
        for(int i = 0;i<Names.length;i++){
            if(Names[i]== SearchName){
                Index = "Found";
            }
        }
        return Index;
    }
    //Delete
    void Delete(int Index){
        Names[Index] = "";
        for(int i = Index+1;i<Names.length;i++){
             Names[i-1]= Names[i];
        }
        
         Names[Names.length -1] = "";
        
        
    }
}
