package pl.ais.examples.ws.versions.services;

import javax.jws.WebMethod;

import pl.ais.examples.ws.versions.model.RequestSpec;
import pl.ais.examples.ws.versions.model.ResponseSpec;

public abstract class ProcessorService {

  @WebMethod(exclude = true)
  protected void processInternal(RequestSpec request, ResponseSpec response) {
    if (request == null) {
      response.setStatus(-1);
    } else {
      response.setStatus(0);
    }
  }
}
