/*
 * Copyright (c) 2018 by Gerrit Grunwald
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package eu.hansolo.fx.ioswitch;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.Scene;


/**
 * User: hansolo
 * Date: 14.05.18
 * Time: 12:16
 */
public class Main extends Application {
    private IosSwitch checkBox1;
    private IosSwitch checkBox2;
    private IosSwitch checkBox3;

    @Override public void init() {
        checkBox1 = IosSwitchBuilder.create()
                                    .prefSize(76, 46)
                                    .selected(true)
                                    .build();
        checkBox2 = IosSwitchBuilder.create()
                                    .prefSize(76, 46)
                                    .selectedColor(Color.RED)
                                    .build();
        checkBox3 = IosSwitchBuilder.create()
                                    .prefSize(76, 46)
                                    .selected(true)
                                    .selectedColor(Color.CORNFLOWERBLUE)
                                    .showOnOffText(true)
                                    .build();
    }

    @Override public void start(Stage stage) {
        VBox pane = new VBox(10, checkBox1, checkBox2, checkBox3);
        pane.setPadding(new Insets(10));

        Scene scene = new Scene(pane);

        stage.setTitle("iOS CheckBox");
        stage.setScene(scene);
        stage.show();

        //checkBox3.setDisable(true);
    }

    @Override public void stop() {
        System.exit(0);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
