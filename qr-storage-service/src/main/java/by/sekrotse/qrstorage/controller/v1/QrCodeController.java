package by.sekrotse.qrstorage.controller.v1;

import by.sekrotse.qrstorage.service.CodeService;
import com.google.zxing.WriterException;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("api/v1/code")
@RequiredArgsConstructor
@Slf4j
public class QrCodeController {
    private final CodeService codeService;

    @GetMapping(value = "/{passport}", produces = MediaType.IMAGE_PNG_VALUE)
    @Operation(summary = "Getting Qr code by document number.", tags = {"v1-qr-code-controller"})
    public byte[] getLastQrCodeByDocument(
            @PathVariable("passport") String passportNum,
            @RequestParam(name = "type", defaultValue = "QR") String type
    ) throws WriterException, IOException {
       return codeService.generateCode(passportNum, type);
    }
}
