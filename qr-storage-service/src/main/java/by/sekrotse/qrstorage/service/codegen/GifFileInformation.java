package by.sekrotse.qrstorage.service.codegen;

import by.sekrotse.qrstorage.service.codegen.api.DefaultFileInformation;

public class GifFileInformation extends DefaultFileInformation {

    public GifFileInformation() {
        fileFormat = ImageFileFormat.GIF;
    }

    public GifFileInformation(int width, int hieght) {
       this.width = width;
       this.height = hieght;
       this.fileFormat = ImageFileFormat.GIF;
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
