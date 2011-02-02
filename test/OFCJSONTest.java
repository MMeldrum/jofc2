import jofc2.model.Chart;
import jofc2.model.Text;
import jofc2.model.axis.XAxis;
import jofc2.model.axis.YAxis;
import jofc2.model.elements.BarChart;
import jofc2.model.elements.LineChart;
import jofc2.model.elements.AbstractDot;
import jofc2.model.elements.BarChart.Bar;
import jofc2.model.elements.LineChart.Dot;
import jofc2.model.elements.AbstractDot.Style.Type;

public class OFCJSONTest {

	public OFCJSONTest() {
		Chart chart = new Chart();
		chart.setTitle(new Text("Testline"));
		chart.setBackgroundColour("#FFFFFF");
		LineChart lc = new LineChart();
		lc.setText("Sanitärbranch");
		lc.setDotStyle(new AbstractDot.Style(Type.STAR, "#111111", 9, 9)
				.setRotation(90));
		LineChart lc2 = new LineChart();
		lc2.setColour("#FF0000");
		lc2.setText("Werkzeugbranch");
		BarChart bc3 = new BarChart(BarChart.Style.NORMAL);
		bc3.setAlpha(0.3f);
		for (int i = 1; i <= 3; i++) {
			double value = Math.random() * 25000 + 10000;
			lc.addDots(new Dot(value, "#0000FF", 3, 1));
			double value2 = Math.random() * 25000 + 10000;
			lc2.addDots(new Dot(value2, "#FF0000", 3, 1));
			Bar b2 = new Bar(Math.random() * 25000 + 25000);
			bc3.addBars(b2);
		}
		lc.addDots(new Dot(null, "#0000FF", 3, 1));
		lc.addValues(5, 6, 7, 8);
		lc2.addDots(new Dot(null, "#FF0000", 3, 1));
		lc2.addValues(null, null, null, null);
		chart.addElements(bc3, lc, lc2);
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

	public static void main(String string) {
		new OFCJSONTest();
	}
}
