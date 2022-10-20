package by.sekrotse.qrstorage.service.codegen;

import by.sekrotse.qrstorage.service.codegen.api.DefaultFileInformation;


public class PngFileInformation extends DefaultFileInformation {

    public PngFileInformation() {
        fileFormat = ImageFileFormat.PNG;
    }

    public PngFileInformation(int width, int hieght) {
       this.width = width;
       this.height = hieght;
       this.fileFormat = ImageFileFormat.PNG;
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
