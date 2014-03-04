package pl.ais.examples.ws.versions.v1.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import pl.ais.examples.ws.versions.model.ItemSpec;
import pl.ais.examples.ws.versions.model.RequestSpec;

@XmlRootElement
@XmlType(propOrder = { "contact", "items" })
public class Request implements RequestSpec {

  private Contact contact;
  private List<Item> items;

  @Override
  public Contact getContact() {
    return contact;
  }

  public void setContact(Contact contact) {
    this.contact = contact;
  }

  public List<Item> getItems() {
    return items;
  }

  public void setItems(List<Item> items) {
    this.items = items;
  }

  @XmlTransient
  @Override
  public List<ItemSpec> getItemSpecs() {
    if (items == null) {
      return null;
    }
    return new ArrayList<ItemSpec>(items);
  }
}
