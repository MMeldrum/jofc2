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
import jofc2.util.AbstractDotConverter;
import jofc2.util.TypeDotConverter;

import java.io.Serializable;

/**
 * Date: 8 oct. 2010 at 12:41:21
 *
 * @author david rapin
 */
@Converter(AbstractDotConverter.class)
public abstract class AbstractDot implements Serializable {
    private static final long serialVersionUID = 3107198408102010L;

    @Alias("halo-size")
	private Integer haloSize;
	@Alias("dot-size")
	private Integer dotSize;
	private String colour;
	@Alias("tip")
	private String tooltip;
	@Alias("on-click")
	private String onClick;

	public AbstractDot() {
		this(null, null, null);
	}

	public AbstractDot(String colour) {
		this(colour, null, null);
	}

	public AbstractDot(String colour, Integer dotSize, Integer haloSize) {
		setColour(colour);
		setDotSize(dotSize);
		setHaloSize(haloSize);
	}

	public Integer getHaloSize() {
		return haloSize;
	}

	public AbstractDot setHaloSize(Integer haloSize) {
		this.haloSize = haloSize;
		return this;
	}

	public Integer getDotSize() {
		return dotSize;
	}

	public AbstractDot setDotSize(Integer dotSize) {
		this.dotSize = dotSize;
		return this;
	}

	public String getColour() {
		return colour;
	}

	public AbstractDot setColour(String colour) {
		this.colour = colour;
		return this;
	}

	public String getTooltip() {
		return tooltip;
	}

	public void setTooltip(String tooltip) {
		this.tooltip = tooltip;
	}

	public String getOnClick() {
		return onClick;
	}

	public void setOnClick(String onClick) {
		this.onClick = onClick;
	}

    @Converter(TypeDotConverter.class)
	public static class Style implements Serializable {

        private static final long serialVersionUID = 7167564063732384112L;

        public enum Type {
            BOW("bow"),
            DOT("dot"),
            H0LLOW_DOT("hollow-dot"),
            ANCHOR("anchor"),
            STAR("star"),
            SOLID_DOT("solid-dot"),
            ;

            private final String type;

            Type(String type) {
                this.type = type;
            }

            public String getType() {
                return type;
            }
        }

        private String type = "solid-dot";
        private Integer rotation = 90;
        private Boolean hollow = false;
        @Alias("halo-size")
        private Integer haloSize = 2;
        @Alias("dot-size")
        private Integer dotSize = 2;
        private String colour;
        private Integer sides = 2;

        // "dot-style": { "type": "dot", "dot-size": 4, "halo-size": 2 }

        /**
         * Build a simple LineChart with a Style.
         *
         * The examples <Code>LineChart lc = new LineChart();</code> Type:
         * Hallow-Dot Code: lc.setDotStyle(new LineChart.Style(Type.HALLOW_DOT,
         * "#111111",9,9));
         *
         * Type: Anchor Code: lc.setDotStyle(new LineChart.Style(Type.ANCHOR,
         * "#111111",9,9,90,true).setSides(3));
         *
         * Type: Star Code: lc.setDotStyle(new LineChart.Style(Type.STAR,
         * "#111111",9,9).setRotation(90));
         *
         * Type: Solid-Dot Code: lc.setDotStyle(new
         * LineChart.Style(Type.SOLID_DOT, "#111111",9,9));
         *
         * Type: bow Code: lc.setDotStyle(new LineChart.Style(Type.BOW,
         * "#111111",9,9).setRotation(90));
         *
         *
         * @param type
         *            <class>Type</class> object BOW, DOT, HALLOW_DOT, ANCHOR,
         *            STAR and SOLID_DOT
         * @param colour
         *            colour in #RGB
         */
        public Style(Type type, String colour) {
            this(type, colour, 2, 2, null, null);
        }
        /**
         * Another Constructor
         *
         * @param type
         *            <class>Type</class> object BOW, DOT, HALLOW_DOT, ANCHOR,
         *            STAR and SOLID_DOT
         */
        public Style(Type type) {
            this(type, null, 2, 2, null, null);
        }

        /**
         * Another constructor
         *
         * @param type
         *            <class>Type</class> object BOW, DOT, HALLOW_DOT, ANCHOR,
         *            STAR and SOLID_DOT
         * @param colour
         *            <code>String</code> colour
         * @param dotSize
         *            <code>Integer</code> that represent the dot size
         * @param haloSize
         *            <code>Integer</code> that represent the halo size
         */
        public Style(Type type, String colour, Integer dotSize, Integer haloSize) {
            this(type, colour, dotSize, haloSize, null, null);
        }

        /**
         * Another Constructor
         *
         * @param type
         *            <class>Type</class> object BOW, DOT, HALLOW_DOT, ANCHOR,
         *            STAR and SOLID_DOT
         * @param colour
         *            <code>String</code> colour
         * @param dotSize
         *            <code>Integer</code> that represent the dot size
         * @param haloSize
         *            <code>Integer</code> that represent the halo size
         * @param rotation
         *            <code>Integer</code> that represent the angle
         * @param hollow
         *            <code>Boolean</code>
         */
        public Style(Type type, String colour, Integer dotSize,
                Integer haloSize, Integer rotation, Boolean hollow) {
            if (Type.H0LLOW_DOT == type) {
                // "dot-style": { "type": "hollow-dot", "dot-size": 5,
                // "halo-size":
                // 0,"colour": "#3D5C56" }
                setType(Type.H0LLOW_DOT.getType());
                setColour(colour);
                setDotSize(dotSize);
                setHaloSize(haloSize);
                setRotation(null);
                setSides(null);
                setHollow(null);
            } else if (Type.ANCHOR == type) {
                // "dot-style": { "type": "anchor", "dot-size": 6, "halo-size":
                // 1,"colour": "#3D5C56", "rotation": 90, "sides": 3 }
                setType(Type.ANCHOR.getType());
                setColour(colour);
                setDotSize(dotSize);
                setHaloSize(haloSize);
                setRotation(rotation);
                setSides(sides);
                setHollow(null);
            } else if (Type.STAR == type) {
                // "dot-style": { "type": "star", "dot-size": 6, "halo-size":
                // 2,"colour": "#f00000", "rotation": 180, "hollow": false }
                setType(Type.STAR.getType());
                setColour(colour);
                setDotSize(dotSize);
                setHaloSize(haloSize);
                setRotation(rotation);
                setHollow(hollow);
                setSides(null);
            } else if (Type.SOLID_DOT == type) {
                // "dot-style": { "type": "solid-dot", "dot-size": 3,
                // "halo-size":
                // 1, "colour": "#3D5C56" }
                setType(Type.SOLID_DOT.getType());
                setColour(colour);
                setDotSize(dotSize);
                setHaloSize(haloSize);
                setRotation(null);
                setSides(null);
                setHollow(null);
            } else if (Type.DOT == type) {
                setType(Type.DOT.getType());
                setColour(colour);
                setDotSize(dotSize);
                setHaloSize(haloSize);
                setRotation(null);
                setSides(null);
                setHollow(null);
            } else if (Type.BOW == type) {
                // "dot-style": { "type": "bow", "dot-size": 6, "halo-size":
                // 0,"colour":
                // "#3D5C56", "rotation": 90
                setType(Type.BOW.getType());
                setColour(colour);
                setDotSize(dotSize);
                setHaloSize(haloSize);
                setRotation(rotation);
                setSides(null);
                setHollow(null);
            }
        }

        public Integer getHaloSize() {
            return haloSize;
        }

        public Style setHaloSize(Integer haloSize) {
            this.haloSize = haloSize;
            return this;
        }

        public Integer getDotSize() {
            return dotSize;
        }

        public Style setDotSize(Integer dotSize) {
            this.dotSize = dotSize;
            return this;
        }

        public String getColour() {
            return colour;
        }

        public Style setColour(String colour) {
            this.colour = colour;
            return this;
        }

        public String getType() {
            return type;
        }

        public Style setType(String type) {
            this.type = type;
            return this;
        }

        public Integer getRotation() {
            return rotation;
        }

        public Style setRotation(Integer rotation) {
            this.rotation = rotation;
            return this;
        }

        public Integer getSides() {
            return sides;
        }

        public Style setSides(Integer sides) {
            this.sides = sides;
            return this;
        }

        public Boolean getHollow() {
            return hollow;
        }

        public Style setHollow(Boolean hollow) {
            this.hollow = hollow;
            return this;
        }
    }
}
