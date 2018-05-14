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

package eu.hansolo.fx.ioscheckbox;

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
    private IosCheckBox checkBox1;
    private IosCheckBox checkBox2;
    private IosCheckBox checkBox3;

    @Override public void init() {
        checkBox1 = IosCheckBoxBuilder.create()
                                      .prefSize(76, 46)
                                      .checked(true)
                                      .build();
        checkBox2 = IosCheckBoxBuilder.create()
                                      .prefSize(76, 46)
                                      .checkedColor(Color.RED)
                                      .build();
        checkBox3 = IosCheckBoxBuilder.create()
                                      .prefSize(76, 46)
                                      .checkedColor(Color.CORNFLOWERBLUE)
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
    }

    @Override public void stop() {
        System.exit(0);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
