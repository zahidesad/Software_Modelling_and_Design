package org.midterm_preparation.structural_patterns.adapter_design_pattern;

public class RemoteAdapter implements RemoteControlAdapter{
    OldRemoteControl oldRemoteControl;

    public RemoteAdapter(OldRemoteControl adaptee) {
        this.oldRemoteControl = adaptee;
    }



    @Override
    public void play() {
        oldRemoteControl.playOld();
    }
}
