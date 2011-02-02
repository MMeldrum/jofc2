package jofc2.model.axis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import jofc2.OFC;

public class RadarAxisLabels extends Label {

	private static final long serialVersionUID = -2420707651601250911L;

	private List<Object> labels;

	public RadarAxisLabels() {
	}

	public RadarAxisLabels(String... labels) {
		addLabels(labels);
	}

	public RadarAxisLabels(List<String> labels) {
		addLabels(OFC.toArray(labels, String.class));
	}

	public List<Object> getLabels() {
		return labels;
	}

	public RadarAxisLabels addLabels(String... labels) {
		checkLabels();
		this.labels.addAll(Arrays.asList(labels));
		return this;
	}

	public RadarAxisLabels addLabels(Label... labels) {
		checkLabels();
		this.labels.addAll(Arrays.asList(labels));
		return this;
	}

	public RadarAxisLabels addLabels(List<Label> labels) {
		checkLabels();
		this.labels.addAll(labels);
		return this;
	}

	private synchronized void checkLabels() {
		if (labels == null)
			labels = new ArrayList<Object>();
	}

}
