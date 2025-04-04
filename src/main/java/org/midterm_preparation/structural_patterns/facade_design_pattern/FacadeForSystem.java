package org.midterm_preparation.structural_patterns.facade_design_pattern;

public class FacadeForSystem {

    public void callSubsystems(){
        SubSystem1 subSystem1 = new SubSystem1();
        SubSystem2 subSystem2 = new SubSystem2();
        subSystem1.doSubSystem1();
        subSystem2.doSubSystem2();
    }
}
