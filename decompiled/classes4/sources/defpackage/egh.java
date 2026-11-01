package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class egh extends egj {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 1;
    public final byte[] a;
    public final int b;
    private final int e;

    public egh(byte[] bArr, int i, int i2) {
        anty.P(i, i + i2, bArr.length);
        this.a = bArr;
        this.b = i;
        this.e = i2;
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    public final byte a(int i) {
        return this.a[this.b + i];
    }

    public final int b() {
        return this.e;
    }

    public final egm c(int i, int i2) {
        int iP = anty.P(i, i2, this.e);
        return iP == 0 ? egm.d : new defpackage.egh(this.a, this.b + i, iP);
    }

    public final void d(egf egfVar) {
        egfVar.a(this.a, this.b, this.e);
    }

    protected final boolean e(egm egmVar) {
        boolean z = egmVar instanceof egk;
        if (!z && !(egmVar instanceof defpackage.egh)) {
            return egmVar.e(this);
        }
        int i = this.e;
        if (i > egmVar.b()) {
            throw new java.lang.IllegalArgumentException("Length too large: " + i + i);
        }
        if (i > egmVar.b()) {
            throw new java.lang.IllegalArgumentException("Ran off end of other: 0, " + i + ", " + egmVar.b());
        }
        if (z) {
            byte[] bArr = this.a;
            int i2 = this.b;
            int i3 = egk.b;
            return a.O(bArr, i2, ((egk) egmVar).a, 0, i);
        }
        if (egmVar instanceof defpackage.egh) {
            defpackage.egh eghVar = (defpackage.egh) egmVar;
            return a.O(this.a, this.b, eghVar.a, eghVar.b, i);
        }
        egm egmVarC = egmVar.c(0, i);
        int i4 = this.b;
        return egmVarC.equals(c(i4, i + i4));
    }

    protected final void f(byte[] bArr, int i) {
        java.lang.System.arraycopy(this.a, this.b, bArr, 0, i);
    }

    protected final int g(int i, int i2) {
        byte[] bArr = ehl.a;
        return anty.N(i, this.a, this.b, i2);
    }

    java.lang.Object writeReplace() {
        return egm.i(j());
    }
}
