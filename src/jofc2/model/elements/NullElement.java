package jofc2.model.elements;

import java.io.Serializable;

import jofc2.model.metadata.Converter;
import jofc2.util.NullConverter;

@Converter(NullConverter.class)
public class NullElement implements Serializable {

	@Override
	public String toString() {
		return null;
	}
}
