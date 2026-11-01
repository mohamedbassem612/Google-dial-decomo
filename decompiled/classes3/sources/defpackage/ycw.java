package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ycw implements defpackage.xuv {
    @Override // defpackage.xue
    public final /* bridge */ /* synthetic */ boolean a(java.lang.Object obj, java.io.File file, defpackage.xus xusVar) throws java.lang.Throwable {
        try {
            defpackage.yfp.c(((defpackage.ycv) ((defpackage.xxe) obj).c()).b(), file);
            return true;
        } catch (java.io.IOException e) {
            if (android.util.Log.isLoggable("GifEncoder", 5)) {
                android.util.Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
            }
            return false;
        }
    }

    @Override // defpackage.xuv
    public final int b() {
        return 1;
    }
}
