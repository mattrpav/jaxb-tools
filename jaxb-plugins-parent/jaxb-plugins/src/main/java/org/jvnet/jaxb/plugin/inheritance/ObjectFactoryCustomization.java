package org.jvnet.jaxb.plugin.inheritance;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement(namespace = "urn:jaxb.jvnet.org:plugin:inheritance", name = "objectFactory")
@XmlType(propOrder = { "extendsClass", "implementsInterface" })
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class ObjectFactoryCustomization {

	private String packageName;

	@XmlAttribute
	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	private ExtendsClass extendsClass;

	@XmlElement(namespace = "urn:jaxb.jvnet.org:plugin:inheritance", name = "extends")
	public ExtendsClass getExtendsClass() {
		return extendsClass;
	}

	public void setExtendsClass(ExtendsClass extendsClass) {
		this.extendsClass = extendsClass;
	}

	private List<ImplementsInterface> implementsInterface = new ArrayList<>();

	@XmlElement(namespace = "urn:jaxb.jvnet.org:plugin:inheritance", name = "implements")
	public List<ImplementsInterface> getImplementsInterface() {
		return implementsInterface;
	}

	public void setImplementsInterface(List<ImplementsInterface> implementsInterface) {
		this.implementsInterface = implementsInterface;
	}

}
