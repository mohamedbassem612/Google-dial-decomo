package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class ambx {
    public java.lang.String a;
    public java.lang.Integer b;
    public int c;
    private double d;
    private int e;
    private aify f;
    private byte g;

    public final defpackage.amby a() {
        java.lang.String str;
        java.lang.Integer num;
        int i;
        aify aifyVar;
        if (this.g == 3 && (str = this.a) != null && (num = this.b) != null && (i = this.c) != 0 && (aifyVar = this.f) != null) {
            return new defpackage.amby(str, num, this.d, this.e, i, aifyVar);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.a == null) {
            sb.append(" text");
        }
        if (this.b == null) {
            sb.append(" endIndexInCacheWords");
        }
        if ((this.g & 1) == 0) {
            sb.append(" matchCost");
        }
        if ((this.g & 2) == 0) {
            sb.append(" firstCorrectedAsrWordIndex");
        }
        if (this.c == 0) {
            sb.append(" status");
        }
        if (this.f == null) {
            sb.append(" wordCosts");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.e = i;
        this.g = (byte) (this.g | 2);
    }

    public final void c(double d) {
        this.d = d;
        this.g = (byte) (this.g | 1);
    }

    public final void d(aify aifyVar) {
        if (aifyVar == null) {
            throw new java.lang.NullPointerException("Null wordCosts");
        }
        this.f = aifyVar;
    }
}
