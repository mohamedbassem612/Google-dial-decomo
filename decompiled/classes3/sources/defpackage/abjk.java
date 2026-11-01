package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abjk {
    private static final aimz a = aimz.i("com/google/android/libraries/communications/ux/components/image/transform/ImageTransformSubregionComputation");

    public static final android.graphics.Bitmap a(java.io.InputStream inputStream, int i, int i2, defpackage.abjl abjlVar) throws java.io.IOException {
        aooh.f(inputStream, "source");
        aimz aimzVar = a;
        aimzVar.b().l("com/google/android/libraries/communications/ux/components/image/transform/ImageTransformSubregionComputation", "getSubregion", 31, "ImageTransformSubregionComputation.kt").v("Decoding subregion");
        android.graphics.BitmapRegionDecoder bitmapRegionDecoderNewInstance = android.graphics.BitmapRegionDecoder.newInstance(inputStream, false);
        if (bitmapRegionDecoderNewInstance != null) {
            float width = bitmapRegionDecoderNewInstance.getWidth();
            float height = bitmapRegionDecoderNewInstance.getHeight();
            long jFloatToRawIntBits = (java.lang.Float.floatToRawIntBits(width) << 32) | (java.lang.Float.floatToRawIntBits(height) & 4294967295L);
            long jFloatToRawIntBits2 = (((long) java.lang.Float.floatToRawIntBits(i)) << 32) | (((long) java.lang.Float.floatToRawIntBits(i2)) & 4294967295L);
            defpackage.abjl abjlVarAE = aehj.aE(abjlVar, 1.0f, 0L, jFloatToRawIntBits, jFloatToRawIntBits2);
            long jAC = aehj.aC(abjlVarAE, jFloatToRawIntBits, jFloatToRawIntBits2, 0L);
            long jAC2 = aehj.aC(abjlVarAE, jFloatToRawIntBits, jFloatToRawIntBits2, (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32)))) << 32) | (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L)))) & 4294967295L));
            android.graphics.Rect rect = new android.graphics.Rect((int) java.lang.Float.intBitsToFloat((int) (jAC >> 32)), (int) java.lang.Float.intBitsToFloat((int) (jAC & 4294967295L)), (int) java.lang.Float.intBitsToFloat((int) (jAC2 >> 32)), (int) java.lang.Float.intBitsToFloat((int) (jAC2 & 4294967295L)));
            if (!rect.isEmpty()) {
                aimzVar.b().l("com/google/android/libraries/communications/ux/components/image/transform/ImageTransformSubregionComputation", "getSubregion", 60, "ImageTransformSubregionComputation.kt").M("Returning subregion bitmap at %s, with preview %s and image %s", rect, new cpp(jFloatToRawIntBits2), new cpp(jFloatToRawIntBits));
                android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                options.inScaled = false;
                options.inSampleSize = 1;
                return bitmapRegionDecoderNewInstance.decodeRegion(rect, options);
            }
        }
        return null;
    }
}
