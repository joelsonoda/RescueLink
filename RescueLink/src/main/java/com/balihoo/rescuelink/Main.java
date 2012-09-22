package com.balihoo.rescuelink;

import com.vaadin.Application;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.Window;

@SuppressWarnings("serial")
public class Main extends Application
{
    private Window window;

    @Override
    public void init()
    {
        window = new Window("Rescue Link");
        setMainWindow(window);
        Button button = new Button("Click Me");
        button.addListener(new Button.ClickListener() {
            public void buttonClick(ClickEvent event) {
                window.addComponent(new Label("Thank you for clicking"));
            }
        });
        window.addComponent(button);
        
    }
    
}
