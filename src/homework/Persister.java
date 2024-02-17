package homework;

public class Persister implements Saveable {
    final User user;

    public Persister(User user){
        this.user = user;
    }
    
    @Override
    public void saveReported(){
        System.out.println("Save user: " + user.getName());
    }

    
 }
