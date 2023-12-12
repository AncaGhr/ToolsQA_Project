package ObjectData;

import java.util.HashMap;

public class FormTableObject {

    private String firstnamevalue;
    private String lastnamevalue;
    private String emailadress;
    private String mobilevalue;
    private String subjectsvalue;
    private String adressvalue;
    private String statevalue;
    private String cityvalue;
    private String expectedmessage;

    private String examen;

    public FormTableObject(HashMap<String, String> testData){
        populateObject(testData);
    }

    // Facem o metoda care sa mapeze valorile din prooperties la variabilele din clasa

    private void populateObject(HashMap<String, String> testData){
        for (String Key: testData.keySet()){
            switch(Key){
                case "firstnamevalue":
                    setFirstnamevalue(testData.get(Key));
                    break;
                case "lastnamevalue":
                    setLastnamevalue(testData.get(Key));
                    break;
                case "emailadress":
                    setEmailadress(testData.get(Key));
                    break;
                case "mobilevalue":
                    setMobilevalue(testData.get(Key));
                    break;
                case "subjectsvalue":
                    setSubjectsvalue(testData.get(Key));
                    break;
                case "adressvalue":
                    setAdressvalue(testData.get(Key));
                    break;
                case "statevalue":
                    setStatevalue(testData.get(Key));
                    break;
                case "cityvalue":
                    setCityvalue(testData.get(Key));
                    break;
                case "expectedmessage":
                    setExpectedmessage(testData.get(Key));
                    break;
//                case "examen":
//                    setExamen(testData.get(Key));
//                    break;

            }

        }

    }


    public String getFirstnamevalue() {
        return firstnamevalue;
    }

    public void setFirstnamevalue(String firstnamevalue) {
        this.firstnamevalue = firstnamevalue;
    }

    public String getLastnamevalue() {
        return lastnamevalue;
    }

    public void setLastnamevalue(String lastnamevalue) {
        this.lastnamevalue = lastnamevalue;
    }

    public String getEmailadress() {
        return emailadress;
    }

    public void setEmailadress(String emailadress) {
        this.emailadress = emailadress;
    }

    public String getMobilevalue() {
        return mobilevalue;
    }

    public void setMobilevalue(String mobilevalue) {
        this.mobilevalue = mobilevalue;
    }

    public String getSubjectsvalue() {
        return subjectsvalue;
    }

    public void setSubjectsvalue(String subjectsvalue) {
        this.subjectsvalue = subjectsvalue;
    }

    public String getAdressvalue() {
        return adressvalue;
    }

    public void setAdressvalue(String adressvalue) {
        this.adressvalue = adressvalue;
    }

    public String getStatevalue() {
        return statevalue;
    }

    public void setStatevalue(String statevalue) {
        this.statevalue = statevalue;
    }

    public String getCityvalue() {
        return cityvalue;
    }

    public void setCityvalue(String cityvalue) {
        this.cityvalue = cityvalue;
    }

    public String getExpectedmessage() {
        return expectedmessage;
    }

    public void setExpectedmessage(String expectedmessage) {
        this.expectedmessage = expectedmessage;
    }

//    public String getExamen() {
//        return examen;
//    }
//
//    public void setExamen(String examen) {
//        this.examen = examen;
//    }
}
