/*
 * Copyright 2006 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.gwt.examples;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.PushButton;
import com.google.gwt.user.client.ui.RootPanel;

public class PushButtonExample implements EntryPoint {

  public void onModuleLoad() {
    // Make a new button that does something when you click it.
    PushButton b = new PushButton("Jump", "Jump?", new ClickHandler() {
      public void onClick(ClickEvent event) {
        Window.alert("Crash...");
        Window.alert("Uh Oh...");
      }
    });

    // In a real application, you would have to have css styles defined for
    // gwt-PushButton-up,gwt-PushButton-up-hovering,gwt-PushButton-up-disabled,
    // gwt-PushButton-down,.gwt-PushButton-down-hovering,.gwt-PushButton-down-disabled

    // Add the push button to the root panel.
    RootPanel.get().add(b);
  }
}