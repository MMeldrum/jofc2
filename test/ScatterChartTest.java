import jofc2.OFC;
import jofc2.model.Chart;
import jofc2.model.elements.ScatterChart;
import jofc2.model.elements.AbstractDot;
import org.testng.annotations.Test;

public class ScatterChartTest
{
    @Test
    public void serializationTest() {
        ScatterChart sc = new ScatterChart();
		sc.addPoint(23, 32);		        
		sc.addPoint(12, 12);		        
		sc.addPoints(new ScatterChart.Point(12, 13, 10));
        sc.setDotStyle(new AbstractDot.Style(AbstractDot.Style.Type.STAR, "#ff0000"));


        Chart c = new Chart();
        c.addElements(sc);

        String s = OFC.getInstance().prettyPrint(c, 4); 
        System.out.println("RENDERED CHART:" + s);
        assert( !s.contains("@class"));
    }
}
