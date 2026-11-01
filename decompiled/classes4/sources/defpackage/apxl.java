package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class apxl extends defpackage.apxm {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 1;
    public final byte[] a;
    public final int b;
    private final int e;

    public apxl(byte[] bArr, int i, int i2) {
        anty.P(i, i + i2, bArr.length);
        this.a = bArr;
        this.b = i;
        this.e = i2;
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    @Override // defpackage.apxo
    public final byte a(int i) {
        return this.a[this.b + i];
    }

    @Override // defpackage.apxo
    public final int b() {
        return this.e;
    }

    @Override // defpackage.apxo
    public final defpackage.apxo c(int i, int i2) {
        int iP = anty.P(i, i2, this.e);
        return iP == 0 ? defpackage.apxo.d : new defpackage.apxl(this.a, this.b + i, iP);
    }

    @Override // defpackage.apxo
    public final void d(defpackage.apxj apxjVar) throws defpackage.apxu {
        apxjVar.n(this.a, this.b, this.e);
    }

    @Override // defpackage.apxo
    protected final boolean e(defpackage.apxo apxoVar) {
        boolean z = apxoVar instanceof defpackage.apxn;
        if (!z && !(apxoVar instanceof defpackage.apxl)) {
            return apxoVar.e(this);
        }
        int i = this.e;
        if (i > apxoVar.b()) {
            throw new java.lang.IllegalArgumentException("Length too large: " + i + i);
        }
        if (i > apxoVar.b()) {
            throw new java.lang.IllegalArgumentException("Ran off end of other: 0, " + i + ", " + apxoVar.b());
        }
        if (z) {
            byte[] bArr = this.a;
            int i2 = this.b;
            int i3 = defpackage.apxn.b;
            return a.O(bArr, i2, ((defpackage.apxn) apxoVar).a, 0, i);
        }
        if (apxoVar instanceof defpackage.apxl) {
            defpackage.apxl apxlVar = (defpackage.apxl) apxoVar;
            return a.O(this.a, this.b, apxlVar.a, apxlVar.b, i);
        }
        defpackage.apxo apxoVarC = apxoVar.c(0, i);
        int i4 = this.b;
        return apxoVarC.equals(c(i4, i + i4));
    }

    @Override // defpackage.apxo
    protected final void f(byte[] bArr, int i) {
        java.lang.System.arraycopy(this.a, this.b, bArr, 0, i);
    }

    @Override // defpackage.apxo
    protected final int g(int i, int i2) {
        byte[] bArr = defpackage.apyj.a;
        return anty.N(i, this.a, this.b, i2);
    }

    java.lang.Object writeReplace() {
        return defpackage.apxo.h(i());
    }
}
