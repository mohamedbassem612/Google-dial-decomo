package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yao implements defpackage.xuu {
    private final defpackage.xxm a = new defpackage.xxn();
    private final boolean b;

    public yao(boolean z) {
        this.b = z;
    }

    @Override // defpackage.xuu
    public final /* bridge */ /* synthetic */ defpackage.xxe a(java.lang.Object obj, int i, int i2, defpackage.xus xusVar) {
        return c(defpackage.uyg$$ExternalSyntheticApiModelOutline2.m(obj), i, i2, xusVar);
    }

    @Override // defpackage.xuu
    public final /* bridge */ /* synthetic */ boolean b(java.lang.Object obj, defpackage.xus xusVar) {
        defpackage.uyg$$ExternalSyntheticApiModelOutline2.m(obj);
        return true;
    }

    public final defpackage.xxe c(android.graphics.ImageDecoder.Source source, int i, int i2, defpackage.xus xusVar) {
        try {
            android.graphics.Bitmap bitmapDecodeBitmap = android.graphics.ImageDecoder.decodeBitmap(source, new defpackage.yai(i, i2, xusVar, this.b));
            if (android.util.Log.isLoggable("BitmapImageDecoder", 2)) {
                android.util.Log.v("BitmapImageDecoder", "Decoded [" + bitmapDecodeBitmap.getWidth() + 'x' + bitmapDecodeBitmap.getHeight() + "] for [" + i + 'x' + i2 + ']');
            }
            return new defpackage.ybv(bitmapDecodeBitmap, this.a, 1);
        } catch (java.io.IOException e) {
            if (android.util.Log.isLoggable("BitmapImageDecoder", 3)) {
                android.util.Log.d("BitmapImageDecoder", "Failed to decode bitmap from ImageDecoder source", e);
            }
            return null;
        }
    }
}
