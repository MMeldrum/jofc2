package jofc2.model.axis;

import java.util.List;

import jofc2.model.metadata.Alias;

public class RadarAxis extends Axis {

	private static final long serialVersionUID = 5247612351699392724L;

	private RadarAxisLabels labels = new RadarAxisLabels();

	@Alias("spoke-labels")
	private RadarSpokeLabels spokelabels = new RadarSpokeLabels();

	public RadarAxisLabels getLabels() {
		return labels;
	}

	public void setLabels(RadarAxisLabels labels) {
		this.labels = labels;
	}

	public RadarAxis setLabels(String... labels) {
		this.labels = new RadarAxisLabels(labels);
		return this;
	}

	public RadarAxis setLabels(List<String> labels) {
		this.labels = new RadarAxisLabels(labels);
		return this;
	}

	public RadarAxis addLabels(String... labels) {
		this.labels.addLabels(labels);
		return this;
	}

	public RadarAxis addLabels(Label... labels) {
		this.labels.addLabels(labels);
		return this;
	}

	public RadarAxis addLabels(List<Label> labels) {
		this.labels.addLabels(labels);
		return this;
	}

	public RadarSpokeLabels getSpokelabels() {
		return spokelabels;
	}

	public void setSpokelabels(RadarSpokeLabels spokelabels) {
		this.spokelabels = spokelabels;
	}

	public RadarAxis setSpokeLabels(String... labels) {
		this.spokelabels = new RadarSpokeLabels(labels);
		return this;
	}

	public RadarAxis setSpokeLabels(List<String> labels) {
		this.spokelabels = new RadarSpokeLabels(labels);
		return this;
	}

	public RadarAxis addSpokeLabels(String... labels) {
		this.spokelabels.addLabels(labels);
		return this;
	}

	public RadarAxis addSpokeLabels(Label... labels) {
		this.spokelabels.addLabels(labels);
		return this;
	}

	public RadarAxis addSpokeLabels(List<Label> labels) {
		this.spokelabels.addLabels(labels);
		return this;
	}

}
