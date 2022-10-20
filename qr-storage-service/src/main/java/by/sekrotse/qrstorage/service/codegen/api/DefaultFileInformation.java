package by.sekrotse.qrstorage.service.codegen.api;

public abstract class DefaultFileInformation implements CodeFileInformation {
    protected int width = 250;
    protected int height = 250;
    protected ImageFileFormat fileFormat = ImageFileFormat.PNG;

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public ImageFileFormat getFormat() {
        return fileFormat;
    }
}
