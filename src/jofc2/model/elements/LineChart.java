/*
This file is part of JOFC2.

JOFC2 is free software: you can redistribute it and/or modify
it under the terms of the Lesser GNU General Public License as
published by the Free Software Foundation, either version 3 of
the License, or (at your option) any later version.

JOFC2 is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

See <http://www.gnu.org/licenses/lgpl-3.0.txt>.
 */
package jofc2.model.elements;

import jofc2.model.metadata.Alias;
import jofc2.model.metadata.Converter;
import jofc2.util.LineDotConverter;

import java.util.Arrays;
import java.util.List;

public class LineChart extends AnimatedElement {

	private static final long serialVersionUID = 8807130855547088579L;
	private static transient final Integer DEFAULT_FONTSIZE = 10;
	private Integer width;
	@Alias("dot-size")
	private Integer dotSize;
	@Alias("halo-size")
	private Integer haloSize;
	private String colour;
	@Alias("dot-style")
	private AbstractDot.Style dotStyle = new AbstractDot.Style(AbstractDot.Style.Type.SOLID_DOT); //default
	private boolean loop;

	public LineChart() {
		this("line");
	}
	
	public LineChart(AbstractDot.Style dotStyle) {
		this();
		this.setDotStyle(dotStyle);
	}
	
	protected LineChart(String type) {
		super(type);
		setFontSize(DEFAULT_FONTSIZE);
	}

	public Integer getWidth() {
		return width;
	}

	public LineChart setWidth(Integer width) {
		this.width = width;
		return this;
	}

	public Integer getDotSize() {
		return dotSize;
	}

	public LineChart setDotSize(Integer dotSize) {
		this.dotSize = dotSize;
		return this;
	}

	public String getColour() {
		return colour;
	}

	public LineChart setColour(String colour) {
		this.colour = colour;
		return this;
	}

	public LineChart addValues(Number... values) {
		return addValues(Arrays.asList(values));
	}

	public LineChart addValues(List<Number> values) {
		// We convert all Numbers to Dots except Null Values they are Converted
		// to a Null Element
		// as Dots with the value null are interpreted as Zero from OFC and null
		// Values themself are interpolated
		for (Number number : values) {
			if (number == null) {
				getValues().add(new NullElement());
			} else {
                getValues().add(number);
            }
		}
		return this;
	}

	public LineChart addDots(Dot... dots) {
		return addDots(Arrays.asList(dots));
	}

	public LineChart addDots(List<Dot> dots) {
		for (Dot dot : dots) {
			if (dot == null || dot.getValue() == null) {
				getValues().add(new NullElement());
			} else {
				getValues().add(dot);
			}
		}
		return this;
	}

	public Integer getHaloSize() {
		return haloSize;
	}

	public LineChart setHaloSize(Integer haloSize) {
		this.haloSize = haloSize;
		return this;
	}
	
	public boolean isLoop() {
		return loop;
	}

	public void setLoop(boolean loop) {
		this.loop = loop;
	}


	@Converter(LineDotConverter.class)
	public static class Dot extends AbstractDot {
        private static final long serialVersionUID = -2405878719335954700L;

        public Dot(Number value) {
            this(value, null);
        }

        public Dot(Number value, String colour) {
		    this(value, colour, null, null);
	    }

	    public Dot(Number value, String colour, Integer dotSize, Integer haloSize) {
            super(colour, dotSize, haloSize);
            setValue(value);
	    }

        private Number value;

        public Number getValue() {
		    return value;
	    }

	    public AbstractDot setValue(Number value) {
		    this.value = value;
		    return this;
	    }

		
    }

    public AbstractDot.Style getDotStyle() {
		return dotStyle;
	}

	public LineChart setDotStyle(AbstractDot.Style dotStyle) {
		this.dotStyle = dotStyle;
		return this;
	}

}
