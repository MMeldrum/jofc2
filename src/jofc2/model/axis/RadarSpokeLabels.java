package jofc2.model.axis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import jofc2.OFC;

public class RadarSpokeLabels extends Label {

	private static final long serialVersionUID = 609144082013907034L;

	private List<Object> labels;

	public RadarSpokeLabels() {
	}

	public RadarSpokeLabels(String... labels) {
		addLabels(labels);
	}

	public RadarSpokeLabels(List<String> labels) {
		addLabels(OFC.toArray(labels, String.class));
	}

	public List<Object> getLabels() {
		return labels;
	}

	public RadarSpokeLabels addLabels(String... labels) {
		checkLabels();
		this.labels.addAll(Arrays.asList(labels));
		return this;
	}

	public RadarSpokeLabels addLabels(Label... labels) {
		checkLabels();
		this.labels.addAll(Arrays.asList(labels));
		return this;
	}

	public RadarSpokeLabels addLabels(List<Label> labels) {
		checkLabels();
		this.labels.addAll(labels);
		return this;
	}

	private synchronized void checkLabels() {
		if (labels == null)
			labels = new ArrayList<Object>();
	}

}
