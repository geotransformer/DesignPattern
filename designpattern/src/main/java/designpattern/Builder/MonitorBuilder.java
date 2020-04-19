package designpattern.Builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Intent 
 * 
 * Separate the construction of a complex object from its representation
 * so that the same construction process can create different representations.
 *
 */
public class MonitorBuilder {
	private String name;
	private String type;
	private List<String> properties;

	private int pollingInterval;
	private String metricName;

	private String onSuccess;
	private String onFailure;
	private String eventName;

	public MonitorBuilder(String name, String type) {
		this.name = name;
		this.type = type;
		this.properties = new ArrayList<>();
	}

	public MonitorBuilder withProperies(List<String> properties) {
		this.properties = properties;
		return this;
	}

	public MonitorBuilder withPollingInterval(int pollingInterval) {
		this.pollingInterval = pollingInterval;
		return this;
	}

	public MonitorBuilder withMetricName(String metricName) {
		this.metricName = metricName;
		return this;
	}

	public MonitorBuilder withOnSuccess(String onSuccessData) {
		onSuccess = onSuccessData;
		// Do something
		return this;
	}

	public MonitorBuilder withOnFailure(String onFailureData) {
		onFailure = onFailureData;
		// Do something
		return this;
	}

	public MonitorBuilder withEventName(String eventName) {
		this.eventName = eventName;
		return this;
	}

	public Monitor build() {
		Monitor monitor = new Monitor();
		
		monitor.setName(name);
		monitor.setType(type);
		monitor.setProperties(properties);
		monitor.setMetricName(metricName);
		monitor.setPollingInterval(pollingInterval);
		monitor.setOnFailure(onFailure);
		monitor.setOnSuccess(onSuccess);
		monitor.setEventName(eventName);
		return monitor;
	}

}
