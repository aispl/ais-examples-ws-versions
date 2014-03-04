package pl.ais.examples.ws.versions.v1.services;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.stereotype.Service;

import pl.ais.examples.ws.versions.services.ProcessorService;
import pl.ais.examples.ws.versions.v1.Constants;
import pl.ais.examples.ws.versions.v1.model.Request;
import pl.ais.examples.ws.versions.v1.model.Response;

@WebService(targetNamespace = Constants.NAMESPACE, name = "Processor")
@Service(Processor.NAME)
public class Processor extends ProcessorService {

  public static final String NAME = "ProcessorV1";

  @WebMethod(operationName = "process", action = Constants.NAMESPACE + "/process")
  public Response process(Request request) {
    Response response = new Response();
    processInternal(request, response);
    return response;
  }

}
