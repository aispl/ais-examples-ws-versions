package pl.ais.examples.ws.versions.v1.model;

import javax.xml.bind.annotation.XmlType;

import com.sun.xml.txw2.annotation.XmlAttribute;

import pl.ais.examples.ws.versions.model.ContactSpec;

@XmlType(propOrder = "name")
public class Contact implements ContactSpec {

  private String name;

  @XmlAttribute("name")
  @Override
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
