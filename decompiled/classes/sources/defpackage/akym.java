package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class akym implements defpackage.albh {
    protected transient int O = 0;

    private final java.lang.String a(java.lang.String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public int e(defpackage.albw albwVar) {
        throw null;
    }

    @Override // defpackage.albh
    public final defpackage.akzc f() {
        try {
            int iL = l();
            defpackage.akzc akzcVar = defpackage.akzc.d;
            byte[] bArr = new byte[iL];
            defpackage.akzh akzhVar = new defpackage.akzh(bArr, 0, iL);
            S(akzhVar);
            akzhVar.H();
            return new defpackage.akza(bArr);
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException(a("ByteString"), e);
        }
    }

    public final void g(java.io.OutputStream outputStream) {
        int iL = l();
        int iNumberOfLeadingZeros = ((352 - (java.lang.Integer.numberOfLeadingZeros(iL) * 9)) >>> 6) + iL;
        if (iNumberOfLeadingZeros > 4096) {
            iNumberOfLeadingZeros = 4096;
        }
        defpackage.akzj akzjVar = new defpackage.akzj(outputStream, iNumberOfLeadingZeros);
        akzjVar.v(iL);
        S(akzjVar);
        akzjVar.c();
    }

    @Override // defpackage.albh
    public final void h(java.io.OutputStream outputStream) {
        int iL = l();
        if (iL > 4096) {
            iL = 4096;
        }
        defpackage.akzj akzjVar = new defpackage.akzj(outputStream, iL);
        S(akzjVar);
        akzjVar.c();
    }

    @Override // defpackage.albh
    public final byte[] i() {
        try {
            int iL = l();
            if (iL == 0) {
                return defpackage.alau.a;
            }
            byte[] bArr = new byte[iL];
            defpackage.akzh akzhVar = new defpackage.akzh(bArr, 0, iL);
            S(akzhVar);
            akzhVar.H();
            return bArr;
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException(a("byte array"), e);
        }
    }
}
