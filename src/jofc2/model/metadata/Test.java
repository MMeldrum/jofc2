package jofc2.model.metadata;

import jofc2.model.Chart;
import jofc2.model.Text;
import jofc2.model.axis.XAxis;
import jofc2.model.axis.YAxis;
import jofc2.model.elements.LineChart;
import jofc2.model.elements.AbstractDot;
import jofc2.model.elements.AbstractDot.Style.Type;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Chart chart = new Chart();
		chart.setTitle(new Text("Testline"));
		LineChart lc = new LineChart();
		//lc.setDotStyle(new LineChart.Bow("#111111",9,9,9));
		lc.setDotStyle(new AbstractDot.Style(Type.STAR, "#111111",9,9).setRotation(90));
		lc.setDotStyle(new AbstractDot.Style(Type.H0LLOW_DOT, "#111111",9,9));
		lc.setDotStyle(new AbstractDot.Style(Type.ANCHOR, "#111111",9,9,90,true).setSides(3));
		lc.setDotStyle(new AbstractDot.Style(Type.SOLID_DOT, "#111111",9,9));
		lc.setDotStyle(new AbstractDot.Style(Type.BOW, "#111111",9,9).setRotation(90));
		lc.setText("Sanitärbranch");

		lc.addValues(5, 6, 7, 8);

		chart.addElements(lc);
		YAxis ya = new YAxis();
		// ya.setRange(10000, 110000, 10000);
		ya.setGridColour("#DDDEE1");
		ya.setColour("#96A9C5");
		chart.setYAxis(ya);
		XAxis xa = new XAxis();
		xa.setGridColour("#DDDEE1");
		xa.setColour("#96A9C5");
		chart.setXAxis(xa);
		chart.setFixedNumDecimalsForced(true);
		chart.setDecimalSeparatorIsComma(true);
		chart.computeYAxisRange(15);
		System.err.println(chart.toDebugString());
	}

}
