package by.sekrotse.qrstorage.service;

import by.sekrotse.qrstorage.service.codegen.api.CodeGenerator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Slf4j
public class CodeService {
    private final Map<String, CodeGenerator> codeMap = new HashMap<>();

    public CodeService(List<CodeGenerator> codeGenerators) {
        for (CodeGenerator generator : codeGenerators) {
            codeMap.put(generator.type(), generator);
        }
    }

    public byte[] generateCode(String text, String type) {
        return codeMap.get(type).generate(text);
    }
}
