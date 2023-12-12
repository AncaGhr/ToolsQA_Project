package ObjectData;

import java.util.HashMap;

public class AlertObject {

    private String Text;

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }

    public FormTableObject(HashMap<String, String> testData){
        populateObject(testData);
    }

    // Facem o metoda care sa mapeze valorile din prooperties la variabilele din clasa

    private void populateObject(HashMap<String, String> testData){
        for (String Key: testData.keySet()){
            switch(Key){
                case "Text":
                    alertvalue(testData.get(Key));
                    break;

            }

        }
