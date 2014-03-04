package pl.ais.examples.ws.versions.v1.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import pl.ais.examples.ws.versions.model.ResponseSpec;

@XmlRootElement
@XmlType(propOrder = "status")
public class Response implements ResponseSpec {

  private int status;

  @Override
  public int getStatus() {
    return status;
  }

  public void setStatus(int status) {
    this.status = status;
  }

}
