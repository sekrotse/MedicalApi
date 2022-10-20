package by.sekrotse.qrstorage.service.codegen;

import by.sekrotse.qrstorage.service.codegen.api.DefaultFileInformation;

public class JpegFileInformation extends DefaultFileInformation {

    public JpegFileInformation() {
        fileFormat = ImageFileFormat.JPEG;
    }

    public JpegFileInformation(int width, int hieght) {
       this.width = width;
       this.height = hieght;
       this.fileFormat = ImageFileFormat.JPEG;
    }

    @Override
    public int getWidth() {
        return this.width;
    }

    @Override
    public int getHeight() {
        return this.height;
    }

    @Override
    public ImageFileFormat getFormat() {
        return this.fileFormat;
    }
}
