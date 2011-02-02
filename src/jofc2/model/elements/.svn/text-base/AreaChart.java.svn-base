package jofc2.model.elements;

import jofc2.model.metadata.Alias;

public class AreaChart extends LineChart {

	private static final long serialVersionUID = -985447338290196674L;
	private static transient final Float DEFAULT_ALPHA = 0.35f;

	@Alias("fill-alpha")
	private Float fillAlpha;
	@Alias("fill")
	private String fillColor;

	public AreaChart() {
		super("area");
		setFillAlpha(DEFAULT_ALPHA);
	}

	public Float getFillAlpha() {
		return fillAlpha;
	}

	public AreaChart setFillAlpha(Float fillAlpha) {
		this.fillAlpha = fillAlpha;
		return this;
	}

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

}