package by.sekrotse.qrstorage.service.codegen;

import by.sekrotse.qrstorage.exception.FileCreatedException;
import by.sekrotse.qrstorage.service.codegen.api.BaseCodeGenerator;
import by.sekrotse.qrstorage.service.codegen.api.CodeFileInformation;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.aztec.AztecWriter;
import com.google.zxing.common.BitMatrix;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@Slf4j
public class AztecCodeGenerator extends BaseCodeGenerator {
    private static final String type = "AZTEC";

    public AztecCodeGenerator(CodeFileInformation fileInformation) {
        super(fileInformation);
    }

    @Override
    public String type() {
        return type;
    }

    @Override
    public byte[] generate(String text) throws FileCreatedException {
        try {
            AztecWriter aztecWriter = new AztecWriter();
            BitMatrix bitMatrix = aztecWriter.encode(
                    text,
                    BarcodeFormat.AZTEC,
                    fileInformation.getHeight(),
                    fileInformation.getWidth()
            );
            return matrixToByteImage(bitMatrix);
        } catch (IOException e) {
            throw new FileCreatedException("File didn't created.");
        }
    }
}
