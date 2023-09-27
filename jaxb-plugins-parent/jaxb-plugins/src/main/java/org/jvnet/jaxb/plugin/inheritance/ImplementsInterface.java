package org.jvnet.jaxb.plugin.inheritance;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlValue;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement(namespace = "urn:jaxb.jvnet.org:plugin:inheritance", name = "implements")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class ImplementsInterface {

	private String interfaceName;

	@XmlValue
	@XmlJavaTypeAdapter(value = CollapsedStringAdapter.class)
	public String getInterfaceName() {
		return interfaceName;
	}

	public void setInterfaceName(String interfaceName) {
		this.interfaceName = interfaceName;
	}

}
