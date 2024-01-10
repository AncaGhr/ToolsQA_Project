package ObjectData;

import java.util.HashMap;

public class AlertObject {

    private String PromptAlertValue;

    public String getPromptAlertValue() {
        return PromptAlertValue;
    }

    public void setPromptAlertValue(String PromptAlertValue) {
        this.PromptAlertValue = PromptAlertValue;
    }

    public AlertObject(HashMap<String, String> testData) {
        populateObject(testData);
    }

    // Facem o metoda care sa mapeze valorile din prooperties la variabilele din clasa

    private void populateObject(HashMap<String, String> testData) {
        for (String Key : testData.keySet()) {
            switch (Key) {
                case "PromptAlertValue":
                    setPromptAlertValue(testData.get(Key));
                    break;
            }

        }
    }
}