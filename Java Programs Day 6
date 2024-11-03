/**
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class piglatin {
    String str;

    public void setStr(String s) {
        str = s;
    }

    public boolean isPiglatin() {
        if (str == null) {
            return false;
        }
        if (str.length() == 0) {
            return false;
        }
        if (str.charAt(0) == 'a' || str.charAt(0) == 'e' || str.charAt(0) == 'i' || str.charAt(0) == 'o'
                || str.charAt(0) == 'u') {
            return true;
        }
        return false;
    }
class piglatinCustom {
    public static void main(String[] args) {
        // Create a piglatin object
        piglatin pig = new piglatin();

        // Enter the string from the user using BufferedReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a string: ");
        try {
            String userInput = reader.readLine();
            pig.setStr(userInput);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Check if the string is in piglatin
        if (pig.isPiglatin()) {
            System.out.println("The string is in piglatin");
        } else {
            System.out.println("The string is not in piglatin");
        }
    }
}

}
*/

/**
class human
{
    private int age;
    public String name;
    protected long phonenumber;
    public void setAge(int age)
    {
        this.age = age;
    }
    public int getAge()
    {
        return age;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
}

public class gettersandsettersinJava {
    public static void main(String[] args) {
        human h = new human();
        h.setAge(20);
        h.setName("John");
        h.phonenumber = 1234567890;
        System.out.println("Age: " + h.getAge());
        System.out.println("Name: " + h.getName());
        System.out.println("Phone Number: " + h.phonenumber);
    }
    
}
*/

class Person {
    private String name;
    private int age;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Name cannot be empty!");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive!");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.contains("@") && email.contains(".")) {
            this.email = email;
        } else {
            System.out.println("Invalid email format!");
        }
    }
}

class Main {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("Alice");
        person.setAge(25);
        person.setEmail("alice@example.com");

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Email: " + person.getEmail());

        // Trying invalid email
        person.setEmail("alice.example.com");  // Outputs: Invalid email format!
    }
}



