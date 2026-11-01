package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public abstract class apxf implements defpackage.apyv {
    protected int memoizedHashCode = 0;

    public int b(defpackage.apze apzeVar) {
        throw null;
    }

    @Override // defpackage.apyv
    public final defpackage.apxo c() {
        try {
            int iG = g();
            defpackage.apxo apxoVar = defpackage.apxo.d;
            byte[] bArr = new byte[iG];
            defpackage.apxj apxjVar = new defpackage.apxj(bArr, iG);
            r(apxjVar);
            return aoog.q(bArr, apxjVar);
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e);
        }
    }
}
