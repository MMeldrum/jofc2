import jofc2.OFC;
import jofc2.model.Chart;
import jofc2.model.elements.HorizontalBarChart;
import jofc2.model.elements.HorizontalBarChart.Bar;

import org.testng.annotations.Test;

public class HorizontalBarChartTest
{
    @Test
    public void serializationTest() {
        HorizontalBarChart hc = new HorizontalBarChart();
        hc.addBars(new Bar(32,32));
        Chart c = new Chart();
        c.addElements(hc);

        String s = OFC.getInstance().prettyPrint(c, 4); 
        System.out.println("RENDERED CHART:" + s);
        assert( !s.contains("@class"));
    }
}
