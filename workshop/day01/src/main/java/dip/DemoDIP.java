package dip;

public class DemoDIP {

    public static void main(String[] args) {
        CI callee = new CI() {
            @Override
            public void doSth() {
                System.out.println("From Main");
            }
        };
        // Constructor Injection
        Caller caller = new Caller();
        // Setter/property Injection
        caller.setCallee(callee);
        // Method Injection
        caller.callB();
    }

}

class Caller {
    CI ci;
    public void callB() {
        ci.doSth();
    }

    public void setCallee(CI ci) {
        this.ci = ci;
    }
}

interface CI {
    public void doSth();
}

