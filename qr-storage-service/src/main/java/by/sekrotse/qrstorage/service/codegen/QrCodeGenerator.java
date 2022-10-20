package by.sekrotse.qrstorage.service.codegen;

import by.sekrotse.qrstorage.exception.FileCreatedException;
import by.sekrotse.qrstorage.service.codegen.api.BaseCodeGenerator;
import by.sekrotse.qrstorage.service.codegen.api.CodeFileInformation;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Slf4j
@Component
public class QrCodeGenerator extends BaseCodeGenerator {
    private static final String type = "QR";

    public QrCodeGenerator(CodeFileInformation fileInformation) {
        super(fileInformation);
    }

    @Override
    public String type() {
        return type;
    }

    @Override
    public byte[] generate(String text) throws FileCreatedException {
        try {
            QRCodeWriter qrCodeWriter = new QRCodeWriter();
            BitMatrix bitMatrix = qrCodeWriter.encode(
                    text,
                    BarcodeFormat.QR_CODE,
                    fileInformation.getWidth(),
                    fileInformation.getHeight()
            );
            return matrixToByteImage(bitMatrix);
        } catch (WriterException | IOException ex) {
            throw new FileCreatedException("File didn't created.");
        }
    }
}
