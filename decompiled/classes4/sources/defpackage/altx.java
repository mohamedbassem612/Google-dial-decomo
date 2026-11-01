package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class altx {
    public double a;
    public int b;
    public byte c;
    public int d;
    private int e;

    public final defpackage.alty a() {
        int i;
        if (this.c == 7 && (i = this.d) != 0) {
            return new defpackage.alty(this.a, this.e, this.b, i);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if ((this.c & 1) == 0) {
            sb.append(" costThreshold");
        }
        if ((this.c & 2) == 0) {
            sb.append(" blockSizeThreshold");
        }
        if ((this.c & 4) == 0) {
            sb.append(" blockProximityThreshold");
        }
        if (this.d == 0) {
            sb.append(" confidenceThreshold");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.e = i;
        this.c = (byte) (this.c | 2);
    }
}
