package by.sekrotse.qrstorage.service.codegen.api;

import by.sekrotse.qrstorage.exception.FileCreatedException;

public interface CodeGenerator {
    String type();
    byte[] generate(String text) throws FileCreatedException;
}
