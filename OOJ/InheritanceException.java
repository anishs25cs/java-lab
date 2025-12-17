class WrongAge extends Exception {
    WrongAge(String msg) {
        super(msg);
    }
}

class Father {
    Father(int age) throws WrongAge {
        if (age < 0)
            throw new WrongAge("Invalid Father Age");
    }
}

class Son extends Father {
    Son(int fAge, int sAge) throws WrongAge {
        super(fAge);
        if (sAge >= fAge)
            throw new WrongAge("Son age invalid");
    }
}

public class InheritanceException {
    public static void main(String[] args) {
        try {
            new Son(50, 60);
        } catch (WrongAge e) {
            System.out.println(e.getMessage());
        }
    }
}
