package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apxn extends defpackage.apxm {
    public static final /* synthetic */ int b = 0;
    private static final long serialVersionUID = 1;
    public final byte[] a;

    public apxn(byte[] bArr) {
        bArr.getClass();
        this.a = bArr;
    }

    @Override // defpackage.apxo
    public final byte a(int i) {
        return this.a[i];
    }

    @Override // defpackage.apxo
    public final int b() {
        return this.a.length;
    }

    @Override // defpackage.apxo
    public final defpackage.apxo c(int i, int i2) {
        int iP = anty.P(0, i2, b());
        return iP == 0 ? defpackage.apxo.d : new defpackage.apxl(this.a, 0, iP);
    }

    @Override // defpackage.apxo
    public final void d(defpackage.apxj apxjVar) throws defpackage.apxu {
        apxjVar.n(this.a, 0, b());
    }

    @Override // defpackage.apxo
    protected final boolean e(defpackage.apxo apxoVar) {
        boolean z = apxoVar instanceof defpackage.apxn;
        if (z) {
            return java.util.Arrays.equals(this.a, ((defpackage.apxn) apxoVar).a);
        }
        boolean z2 = apxoVar instanceof defpackage.apxl;
        if (!z2) {
            return apxoVar.e(this);
        }
        int iB = b();
        if (iB > apxoVar.b()) {
            throw new java.lang.IllegalArgumentException("Length too large: " + iB + b());
        }
        if (iB > apxoVar.b()) {
            throw new java.lang.IllegalArgumentException("Ran off end of other: 0, " + iB + ", " + apxoVar.b());
        }
        if (z) {
            return a.O(this.a, 0, ((defpackage.apxn) apxoVar).a, 0, iB);
        }
        if (!z2) {
            return apxoVar.c(0, iB).equals(c(0, iB));
        }
        defpackage.apxl apxlVar = (defpackage.apxl) apxoVar;
        byte[] bArr = this.a;
        int i = defpackage.apxl.c;
        return a.O(bArr, 0, apxlVar.a, apxlVar.b, iB);
    }

    @Override // defpackage.apxo
    protected final void f(byte[] bArr, int i) {
        java.lang.System.arraycopy(this.a, 0, bArr, 0, i);
    }

    @Override // defpackage.apxo
    protected final int g(int i, int i2) {
        byte[] bArr = defpackage.apyj.a;
        return anty.N(i, this.a, 0, i2);
    }
}
