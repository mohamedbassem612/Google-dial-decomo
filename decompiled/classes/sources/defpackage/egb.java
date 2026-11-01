package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class egb implements defpackage.ehw {
    protected int memoizedHashCode = 0;

    public int c(defpackage.eig eigVar) {
        throw null;
    }

    @Override // defpackage.ehw
    public final defpackage.egm d() {
        try {
            int iH = h();
            defpackage.egm egmVar = defpackage.egm.d;
            byte[] bArr = new byte[iH];
            egs egsVar = new egs(bArr, iH);
            r(egsVar);
            return eav.h(egsVar, bArr);
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e);
        }
    }
}
