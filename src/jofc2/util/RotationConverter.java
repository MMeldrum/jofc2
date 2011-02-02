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
package jofc2.util;

import jofc2.model.axis.Label.Rotation;

import com.thoughtworks.xstream.converters.SingleValueConverter;

public class RotationConverter implements SingleValueConverter {

	public Object fromString(String s) {
		return Rotation.valueOf(s.toUpperCase());
	}

	public String toString(Object o) {
		return o.toString();
	}

	@SuppressWarnings("unchecked")
	public boolean canConvert(Class c) {
		return Rotation.class.isAssignableFrom(c);
	}
}
