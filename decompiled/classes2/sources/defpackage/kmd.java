package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class kmd {
    private int a;
    private long b;
    private byte c;

    public final defpackage.kme a() {
        if (this.c == 3) {
            return new defpackage.kme(this.a, this.b);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if ((this.c & 1) == 0) {
            sb.append(" layoutPosition");
        }
        if ((this.c & 2) == 0) {
            sb.append(" coalescedRowId");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(long j) {
        this.b = j;
        this.c = (byte) (this.c | 2);
    }

    public final void c(int i) {
        this.a = i;
        this.c = (byte) (this.c | 1);
    }
}
