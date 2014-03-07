package pl.ais.examples.ws.versions.v2.services;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Service;

import pl.ais.examples.ws.versions.services.ProcessorService;
import pl.ais.examples.ws.versions.v2.Constants;
import pl.ais.examples.ws.versions.v2.model.Request;
import pl.ais.examples.ws.versions.v2.model.Response;

@WebService(targetNamespace = Constants.NAMESPACE, name = Processor.WEB_NAME)
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path(Processor.WEB_NAME)
@Service(Processor.NAME)
public class Processor extends ProcessorService {

  public static final String NAME = "ProcessorV2";
  public static final String WEB_NAME = "Processor";

  @POST
  @Path("process")
  @WebMethod(operationName = "process", action = Constants.NAMESPACE + "/process")
  public Response process(Request request) {
    Response response = new Response();
    processInternal(request, response);
    return response;
  }

}
