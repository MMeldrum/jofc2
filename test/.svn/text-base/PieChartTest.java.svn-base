import jofc2.OFC;
import jofc2.model.Chart;
import jofc2.model.elements.PieChart;
import jofc2.org.json.JSONArray;
import jofc2.org.json.JSONObject;
import org.testng.annotations.Test;

@Test
public class PieChartTest
{
    public void testEmptySlices() throws Exception {
        PieChart pc = new PieChart();
        pc.addValues(2, 5, 7, null, 1);
        Chart c = new Chart();
        c.addElements(pc);
        String s = OFC.getInstance().prettyPrint(c, 4);
        System.out.println("RENDERED CHART:" + s);

        JSONObject jsonResult=  new JSONObject(OFC.getInstance().render(c));
        JSONArray elements = jsonResult.getJSONArray("elements");
        assert elements.getJSONObject(0).getString("type").equals("pie");
        JSONArray values = elements.getJSONObject(0).getJSONArray("values");
        assert values.length() == 4;



    }
}
