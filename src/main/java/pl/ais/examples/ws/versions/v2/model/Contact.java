package pl.ais.examples.ws.versions.v2.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

import pl.ais.examples.ws.versions.model.ContactSpec;

@XmlType(propOrder = {"firstName", "lastName"})
public class Contact implements ContactSpec {

  private String firstName;
  private String lastName;

  @XmlAttribute(name = "firstName")
  @Override
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  @XmlAttribute(name = "lastName")
  @Override
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
}
