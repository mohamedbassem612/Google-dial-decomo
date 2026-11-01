package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class olp {
    private int a;
    private int b;
    private long c;
    private byte d;

    public final defpackage.olq a() {
        if (this.d == 7) {
            return new defpackage.olq(this.a, this.b, this.c);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if ((this.d & 1) == 0) {
            sb.append(" startFrame");
        }
        if ((this.d & 2) == 0) {
            sb.append(" endFrame");
        }
        if ((this.d & 4) == 0) {
            sb.append(" fadeInDurationMillis");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.b = i;
        this.d = (byte) (this.d | 2);
    }

    public final void c(long j) {
        this.c = j;
        this.d = (byte) (this.d | 4);
    }

    public final void d(int i) {
        this.a = i;
        this.d = (byte) (this.d | 1);
    }
}
