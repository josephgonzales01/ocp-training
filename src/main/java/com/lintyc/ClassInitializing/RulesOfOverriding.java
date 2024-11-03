package com.lintyc.ClassInitializing;

/*
    1. If two methods have the same name but different signatures, the methods are overloaded, not overridden
    2. Override method should have same or less restrictive access modifiers
    3. Declaring Checked exception on override method should have same Exception class or subclass of what the
        overridden method has.
    4. Override method should have a return type that is same or subclass/implements of Overridden method return type
    5. private method cannot be overridden, if same method name and signature present on child class its method
        redeclaration
    6. static method cannot be overridden, if both parent and child contains same signature static method, parent static
        method is hidden/not executed instead only child  static method executed
    7. final method cannot be overridden
    8. Lastly variables cannot be overridden, when same name and type variable exist in Parent and Child they are distinct
        2 variables

 */

import java.io.FileNotFoundException;
import java.io.IOException;

class Reptile {
    protected void sleep() throws IOException {
    }

    protected CharSequence crawl() throws FileNotFoundException {
        return "Im crawling";
    }

    public void exitShell() {
    }

    private void imUnique() {
    }

    public final void imBreathing() {
    }

    public static void hide() {
        System.out.println("Im hiding");
    }

}

public class RulesOfOverriding extends Reptile {
    /*
        since FilenotFoundException is subclass of IOException
     */
    @Override
    public void sleep() throws FileNotFoundException {
    }

    /*
        Since String implements the Interface CharSequence
     */
    @Override
    public String crawl() {
        return "Yes indeed Im crawling";
    }

    /*
       Error: override method has parent class of the exception from  overridden method
    */
    //@Override
    //public void hide() throws IOException {}

    /*
       Error: more restrictive than overridden method access
    */
    //@Override
    //void exitShell() {}

    /*
      This method is not overriding the parent method, hence this method is independent,
      it will error if @Override is added
     */
    //@Override
    private void imUnique() {
    }

    /*
        Unlike private a final method cannot be overridden
     */
    //public void imBreathing(){}

    /*
     Error. cannot override static method with non static
     */
    //public void hide() {}

    public static void main(String[] args) throws FileNotFoundException {
        Reptile lizard = new RulesOfOverriding();

        //Demo subclass crawl is executed
        System.out.println(lizard.crawl());


    }


}
