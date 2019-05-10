package Adapter;

public class VectorAdapterFromRaster2 implements VectorGraphicsInterface{
    RasterGraphics rg = null;//new RasterGraphics();

    public VectorAdapterFromRaster2(RasterGraphics rg) {
        this.rg = rg;
    }

    @Override
    public void drawLine() {
        rg.drawRasterLine();
    }

    @Override
    public void drawSquare() {
        rg.drawRasterSquare();
    }
}
