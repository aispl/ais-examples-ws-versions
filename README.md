Versioned web services example
==============================

Application provides two versions of `Processor` service.

In `V1` version it accepts `Contact` object with `name` attribute.

For `V2` verstion `name` attribute was removed from `Contact` object and `firstName` and `lastName` attributes were added.
Of course `V1` clients are not compatible with `V2` clients and vice-versa but, since both versions are provided in parallel, clients may migrate from `V1` to `V2`.

Contracts
---------

### SOAP/REST contract

SOAP/REST model is defined in `pl.ais.examples.ws.versions.{version}.model` and service contract is defined in `pl.ais.examples.ws.versions.{version}.services.Processor` classes.

### Internal contract

Internal model is defined in `pl.ais.examples.ws.versions.model` package and it's being used by `pl.ais.examples.ws.versions.services.ProcessorService`, which is a superclass for `pl.ais.examples.ws.versions.{version}.services.Processor` classes.

Implementation details
----------------------

`ProcessorService`'s `service` method returns `void` and accepts `response` as one of it's arguments. That's because `ProcessorService` should use only interfaces (from `pl.ais.examples.ws.versions.model` package), not version-related classes.
