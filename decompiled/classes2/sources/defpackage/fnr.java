package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public abstract class fnr implements defpackage.fno {
    @Override // defpackage.fno
    public final defpackage.eqy a(defpackage.fnp fnpVar) {
        java.nio.ByteBuffer byteBuffer = fnpVar.d;
        ahvr.ci(byteBuffer);
        boolean z = false;
        if (byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            z = true;
        }
        ahvr.bM(z);
        return b(fnpVar, byteBuffer);
    }

    protected abstract defpackage.eqy b(defpackage.fnp fnpVar, java.nio.ByteBuffer byteBuffer);
}
