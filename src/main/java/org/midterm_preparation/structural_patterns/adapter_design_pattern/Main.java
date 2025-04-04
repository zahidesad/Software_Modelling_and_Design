package org.midterm_preparation.structural_patterns.adapter_design_pattern;

public class Main {
    public static void main(String[] args) {
        RemoteControlAdapter remoteControlAdapter = new NewRemoteControl();
        remoteControlAdapter.play();

        remoteControlAdapter = new RemoteAdapter(new OldRemoteControl());
        remoteControlAdapter.play();
    }
}
