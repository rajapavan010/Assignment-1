class ParentClass {
    private int privateField;
    
    private void privateMethod() {
        System.out.println("Private method called.");
    }
    
    public void printFields() {
        System.out.println("Private field value: " + privateField);
    }
    
    public void callPrivateMethod() {
        privateMethod();
    }
}

class SubClass extends ParentClass {
    public void accessPrivateMembers() {
    }
}

public class Main {
    public static void main(String[] args) {
        ParentClass parent = new ParentClass();
        parent.printFields();
        parent.callPrivateMethod(); 
        
        SubClass sub = new SubClass();
        sub.accessPrivateMembers();
    }
}
