import jofc2.OFC;
import jofc2.model.Chart;
import jofc2.model.elements.LineChart;
import jofc2.model.elements.AbstractDot;
import jofc2.model.elements.AbstractDot.Style.Type;
import jofc2.org.json.JSONArray;
import jofc2.org.json.JSONObject;
import org.testng.annotations.Test;

public class LineChartTest
{
    @Test
    public void serializationTest() {
        LineChart lc = new LineChart();
		lc.setDotStyle(new AbstractDot.Style(Type.STAR, "#111111",9,9).setRotation(90));
		lc.setDotStyle(new AbstractDot.Style(Type.H0LLOW_DOT, "#111111",9,9));
		lc.setDotStyle(new AbstractDot.Style(Type.ANCHOR, "#111111",9,9,90,true).setSides(3));
		lc.setDotStyle(new AbstractDot.Style(Type.SOLID_DOT, "#111111",9,9));
		lc.setDotStyle(new AbstractDot.Style(Type.BOW, "#111111",9,9).setRotation(90));
        lc.addValues(10, 1, 5, 4, 6);
        lc.addDots(new LineChart.Dot(15, "#121212"));

        Chart c = new Chart();
        c.addElements(lc);

        String s = OFC.getInstance().prettyPrint(c, 4);
        System.out.println("RENDERED CHART:" + s);
        assert !s.contains("\"@class\"");
    }
    @Test
    public void JSONTest() throws Exception {
        LineChart lc = new LineChart();
		lc.setDotStyle(new AbstractDot.Style(Type.STAR, "#111111",9,9).setRotation(90));
		lc.setDotStyle(new AbstractDot.Style(Type.H0LLOW_DOT, "#111111",9,9));
		lc.setDotStyle(new AbstractDot.Style(Type.ANCHOR, "#111111",9,9,90,true).setSides(3));
		lc.setDotStyle(new AbstractDot.Style(Type.SOLID_DOT, "#111111",9,9));
		lc.setDotStyle(new AbstractDot.Style(Type.BOW, "#111111",9,9).setRotation(90));
        lc.addValues(10, 1, 5, 4, 6);
        lc.addDots(new LineChart.Dot(15, "#121212"));

        Chart c = new Chart();
        c.addElements(lc);
        JSONObject jsonResult=  new JSONObject(OFC.getInstance().render(c));
        JSONArray elements = jsonResult.getJSONArray("elements");
        assert elements.getJSONObject(0).getString("type").equals("line");
        JSONArray values = elements.getJSONObject(0).getJSONArray("values");
        assert values.length() == 6;
        assert values.getInt(0) == 10;
        assert values.getInt(1) == 1;
        assert values.getInt(2) == 5;
        assert values.getInt(3) == 4;
        assert values.getInt(4) == 6;
        assert values.getJSONObject(5).getInt("value") == 15;
        assert values.getJSONObject(5).getString("colour").equals("#121212");

    }
}
