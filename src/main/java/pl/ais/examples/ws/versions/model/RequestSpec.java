package pl.ais.examples.ws.versions.model;

import java.util.List;

public interface RequestSpec {

  ContactSpec getContact();

  List<ItemSpec> getItemSpecs();
}
