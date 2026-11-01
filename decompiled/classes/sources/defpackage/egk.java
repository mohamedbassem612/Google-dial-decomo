package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class egk extends defpackage.egj {
    public static final /* synthetic */ int b = 0;
    private static final long serialVersionUID = 1;
    public final byte[] a;

    public egk(byte[] bArr) {
        bArr.getClass();
        this.a = bArr;
    }

    @Override // defpackage.egm
    public final byte a(int i) {
        return this.a[i];
    }

    @Override // defpackage.egm
    public final int b() {
        return this.a.length;
    }

    @Override // defpackage.egm
    public final defpackage.egm c(int i, int i2) {
        int iP = defpackage.anty.P(0, i2, b());
        return iP == 0 ? defpackage.egm.d : new egh(this.a, 0, iP);
    }

    @Override // defpackage.egm
    public final void d(defpackage.egf egfVar) {
        egfVar.a(this.a, 0, b());
    }

    @Override // defpackage.egm
    protected final boolean e(defpackage.egm egmVar) {
        boolean z = egmVar instanceof defpackage.egk;
        if (z) {
            return java.util.Arrays.equals(this.a, ((defpackage.egk) egmVar).a);
        }
        boolean z2 = egmVar instanceof egh;
        if (!z2) {
            return egmVar.e(this);
        }
        int iB = b();
        if (iB > egmVar.b()) {
            throw new java.lang.IllegalArgumentException("Length too large: " + iB + b());
        }
        if (iB > egmVar.b()) {
            throw new java.lang.IllegalArgumentException("Ran off end of other: 0, " + iB + ", " + egmVar.b());
        }
        if (z) {
            return defpackage.a.O(this.a, 0, ((defpackage.egk) egmVar).a, 0, iB);
        }
        if (!z2) {
            return egmVar.c(0, iB).equals(c(0, iB));
        }
        egh eghVar = (egh) egmVar;
        byte[] bArr = this.a;
        int i = egh.c;
        return defpackage.a.O(bArr, 0, eghVar.a, eghVar.b, iB);
    }

    @Override // defpackage.egm
    protected final void f(byte[] bArr, int i) {
        java.lang.System.arraycopy(this.a, 0, bArr, 0, i);
    }

    @Override // defpackage.egm
    protected final int g(int i, int i2) {
        byte[] bArr = defpackage.ehl.a;
        return defpackage.anty.N(i, this.a, 0, i2);
    }
}
