package pl.ais.examples.ws.versions.v2.model;

import javax.xml.bind.annotation.XmlType;

import pl.ais.examples.ws.versions.model.ItemSpec;

@XmlType(propOrder = "description")
public class Item implements ItemSpec {

  private String description;

  @Override
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

}
