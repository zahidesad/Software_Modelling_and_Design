package org.midterm_preparation.structural_patterns.adapter_design_pattern;

public class NewRemoteControl implements RemoteControlAdapter{

    @Override
    public void play() {
        System.out.println("Play new");
    }
}
