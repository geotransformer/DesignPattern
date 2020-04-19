package designpattern.Builder;

import java.util.List;

public class Monitor {
    private String name;
    private String type;
    private int pollingInterval;
    private List<String>  properties;
    private String metricName;

    private String onSuccess;
    private String onFailure;
    private String eventName;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPollingInterval() {
		return pollingInterval;
	}
	public void setPollingInterval(int pollingInterval) {
		this.pollingInterval = pollingInterval;
	}
	public List<String> getProperties() {
		return properties;
	}
	public void setProperties(List<String> properties) {
		this.properties = properties;
	}
	public String getMetricName() {
		return metricName;
	}
	public void setMetricName(String metricName) {
		this.metricName = metricName;
	}
	public String getOnSuccess() {
		return onSuccess;
	}
	public void setOnSuccess(String onSuccess) {
		this.onSuccess = onSuccess;
	}
	public String getOnFailure() {
		return onFailure;
	}
	public void setOnFailure(String onFailure) {
		this.onFailure = onFailure;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

}
