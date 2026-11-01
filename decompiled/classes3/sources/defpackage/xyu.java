package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xyu implements defpackage.xue {
    @Override // defpackage.xue
    public final /* bridge */ /* synthetic */ boolean a(java.lang.Object obj, java.io.File file, defpackage.xus xusVar) throws java.lang.Throwable {
        try {
            defpackage.yfp.c((java.nio.ByteBuffer) obj, file);
            return true;
        } catch (java.io.IOException e) {
            if (android.util.Log.isLoggable("ByteBufferEncoder", 3)) {
                android.util.Log.d("ByteBufferEncoder", "Failed to write data", e);
            }
            return false;
        }
    }
}
