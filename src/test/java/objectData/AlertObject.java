package objectData;

import java.util.Map;

public class AlertObject extends GeneralObject{

    private String alertValue;

    public AlertObject (Map<String, String> testData){
        prepareObject(testData);
    }

    private void prepareObject(Map<String, String> testData){
        for (String key: testData.keySet()){
            switch (key){
                case "alertValue":
                    setAlertValue(testData.get(key));
                    break;

            }
        }
    }

    public String getAlertValue() {
        return alertValue;
    }

    public void setAlertValue(String alertValue) {
        this.alertValue = alertValue;
    }
}
