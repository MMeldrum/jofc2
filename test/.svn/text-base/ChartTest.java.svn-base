import jofc2.model.Chart;
import jofc2.model.axis.YAxis;
import jofc2.model.elements.LineChart;
import org.testng.annotations.Test;

@Test
public class ChartTest
{
    public void testComputeYAxisNoEntries() {
         Chart chart = new Chart();
        chart.computeYAxisRange(1);
        assert chart.getYAxis() != null;
        assert chart.getYAxis().getMin() == 0;
        assert chart.getYAxis().getMax() == 0;
     }
    public void testComputeYAxisOnePositiveEntry() {
         Chart chart = new Chart();
        final LineChart lineChart = new LineChart();
        lineChart.addDots((new LineChart.Dot(5)));
        chart.addElements(lineChart);
        chart.computeYAxisRange(1);
        assert chart.getYAxis() != null;
        assert chart.getYAxis().getMin() == 5;
     }
     public void testComputeYAxisOnePositiveEntryMinimumSet() {
         Chart chart = new Chart();
         chart.setYAxis(new YAxis());
         chart.getYAxis().setMin(0);
        final LineChart lineChart = new LineChart();
        lineChart.addDots((new LineChart.Dot(5)));
        chart.addElements(lineChart);
        chart.computeYAxisRange(1);
        assert chart.getYAxis() != null;
        assert chart.getYAxis().getMin() == 0;
     }
     public void testComputeYAxisOneNegativeEntry() {
         Chart chart = new Chart();
        final LineChart lineChart = new LineChart();
        lineChart.addDots((new LineChart.Dot(-5)));
        chart.addElements(lineChart);
        chart.computeYAxisRange(1);
        assert chart.getYAxis() != null;
        assert chart.getYAxis().getMin() == -5;
     }
}
