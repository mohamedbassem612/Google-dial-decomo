package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yan implements defpackage.xuv {
    public static final defpackage.xur a = new defpackage.xur("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90, defpackage.xur.a);
    public static final defpackage.xur b = new defpackage.xur("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, defpackage.xur.a);
    private final defpackage.xxt c;

    public yan(defpackage.xxt xxtVar) {
        this.c = xxtVar;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0076  */
    /* JADX WARN: Instruction removed from duplicated block: B:33:0x0076, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // defpackage.xue
    public final /* bridge */ /* synthetic */ boolean a(java.lang.Object obj, java.io.File file, defpackage.xus xusVar) throws java.lang.Throwable {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) ((defpackage.xxe) obj).c();
        android.graphics.Bitmap.CompressFormat compressFormat = (android.graphics.Bitmap.CompressFormat) xusVar.b(b);
        if (compressFormat == null) {
            compressFormat = bitmap.hasAlpha() ? android.graphics.Bitmap.CompressFormat.PNG : android.graphics.Bitmap.CompressFormat.JPEG;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        int i = defpackage.yfx.a;
        long jElapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
        int iIntValue = ((java.lang.Integer) xusVar.b(a)).intValue();
        java.io.OutputStream xuzVar = null;
        try {
            try {
                try {
                    try {
                        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
                        try {
                            defpackage.xxt xxtVar = this.c;
                            xuzVar = xxtVar != null ? new defpackage.xuz(fileOutputStream, xxtVar) : fileOutputStream;
                            bitmap.compress(compressFormat, iIntValue, xuzVar);
                            xuzVar.close();
                            this = 1;
                            xuzVar.close();
                        } catch (java.io.IOException e) {
                            e = e;
                            xuzVar = fileOutputStream;
                            if (android.util.Log.isLoggable("BitmapEncoder", 3)) {
                                android.util.Log.d("BitmapEncoder", "Failed to encode Bitmap", e);
                            }
                            this = 0;
                            this = 0;
                            if (xuzVar != null) {
                                xuzVar.close();
                            }
                            if (android.util.Log.isLoggable("BitmapEncoder", 2)) {
                                android.util.Log.v("BitmapEncoder", "Compressed with type: " + java.lang.String.valueOf(compressFormat) + " of size " + defpackage.ygc.a(bitmap) + " in " + defpackage.yfx.a(jElapsedRealtimeNanos) + ", options format: " + java.lang.String.valueOf(xusVar.b(b)) + ", hasAlpha: " + bitmap.hasAlpha());
                            }
                            return this;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            xuzVar = fileOutputStream;
                            if (xuzVar != null) {
                                try {
                                    xuzVar.close();
                                } catch (java.io.IOException unused) {
                                }
                            }
                            throw th;
                        }
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                    }
                } catch (java.io.IOException unused2) {
                }
            } catch (java.io.IOException e2) {
                e = e2;
            }
            if (android.util.Log.isLoggable("BitmapEncoder", 2)) {
                android.util.Log.v("BitmapEncoder", "Compressed with type: " + java.lang.String.valueOf(compressFormat) + " of size " + defpackage.ygc.a(bitmap) + " in " + defpackage.yfx.a(jElapsedRealtimeNanos) + ", options format: " + java.lang.String.valueOf(xusVar.b(b)) + ", hasAlpha: " + bitmap.hasAlpha());
            }
            return this;
        } catch (java.lang.Throwable th3) {
            throw th3;
        }
    }

    @Override // defpackage.xuv
    public final int b() {
        return 2;
    }
}
