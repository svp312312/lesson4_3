package ThirdExample;

import org.springframework.stereotype.Component;

//@Component
public class Ship implements Machine{
    @Override
    public void voice() {
        System.out.println("Ship's voice");

    }
    @Override
    public void info(){
        System.out.println("no information");
    };
}
