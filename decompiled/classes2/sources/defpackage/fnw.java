package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fnw extends defpackage.fnr {
    @Override // defpackage.fnr
    protected final defpackage.eqy b(defpackage.fnp fnpVar, java.nio.ByteBuffer byteBuffer) {
        defpackage.etx etxVar = new defpackage.etx(byteBuffer.array(), byteBuffer.limit());
        java.lang.String strT = etxVar.T();
        ahvr.ci(strT);
        java.lang.String strT2 = etxVar.T();
        ahvr.ci(strT2);
        return new defpackage.eqy(-9223372036854775807L, new defpackage.fnv(strT, strT2, etxVar.v(), etxVar.v(), java.util.Arrays.copyOfRange(etxVar.b, etxVar.c, etxVar.d)));
    }
}
