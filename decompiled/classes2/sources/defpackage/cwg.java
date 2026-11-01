package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class cwg {
    private final boolean a;
    private final defpackage.cwe[] b;
    private int c;
    private final float[] d;
    private final float[] e;
    private final float[] f;
    private final int g;

    public cwg(boolean z, int i) {
        this.a = z;
        this.g = i;
        if (z && i == 1) {
            throw new java.lang.IllegalStateException("Lsq2 not (yet) supported for differential axes");
        }
        this.b = new defpackage.cwe[20];
        this.d = new float[20];
        this.e = new float[20];
        this.f = new float[3];
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x01cb, code lost:
    
        if (r0 > r1) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01d1, code lost:
    
        if (r0 < r1) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01d6, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:?, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float a(float r21) {
        /*
            Method dump skipped, instruction units count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwg.a(float):float");
    }

    public final void b(long j, float f) {
        int i = (this.c + 1) % 20;
        this.c = i;
        defpackage.cwe[] cweVarArr = this.b;
        defpackage.cwe cweVar = cweVarArr[i];
        if (cweVar == null) {
            cweVarArr[i] = new defpackage.cwe(j, f);
        } else {
            cweVar.a = j;
            cweVar.b = f;
        }
    }

    public final void c() {
        java.util.Arrays.fill(this.b, 0, 20, (java.lang.Object) null);
        this.c = 0;
    }
}
