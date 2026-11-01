package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class ybo implements defpackage.yfw {
    @Override // defpackage.yfw
    public final java.lang.Object a() {
        boolean z = false;
        if (android.os.Build.VERSION.SDK_INT == 34) {
            android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(1, 1, android.graphics.Bitmap.Config.ALPHA_8);
            android.graphics.Bitmap bitmapCopy = bitmapCreateBitmap.copy(android.graphics.Bitmap.Config.HARDWARE, false);
            bitmapCreateBitmap.recycle();
            z = bitmapCopy == null;
            if (android.util.Log.isLoggable("GainmapWorkaroundCalc", 2)) {
                android.util.Log.v("GainmapWorkaroundCalc", "calculateNeedsGainmapDecodeWorkaround=" + z);
            }
            if (bitmapCopy != null) {
                bitmapCopy.recycle();
            }
        }
        return java.lang.Boolean.valueOf(z);
    }
}
