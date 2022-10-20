package by.sekrotse.qrstorage.service.codegen.api;

public interface CodeFileInformation {
    int getWidth();
    int getHeight();
    ImageFileFormat getFormat();

    enum ImageFileFormat {
        PNG,
        JPEG,
        GIF
    }
}
