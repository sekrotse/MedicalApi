package by.sekrotse.qrstorage.service.codegen.api;

import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public abstract class BaseCodeGenerator implements CodeGenerator {
    protected CodeFileInformation fileInformation;

    public BaseCodeGenerator(CodeFileInformation fileInformation) {
        this.fileInformation = fileInformation;
    }

    public byte[] matrixToByteImage(BitMatrix bitMatrix) throws IOException {
        try (ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {
            MatrixToImageWriter.writeToStream(bitMatrix, fileInformation.getFormat().name(), outputStream);
            byte[] data = outputStream.toByteArray();
            return data;
        }
    }
}
