package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xal {
    private boolean a;
    private boolean b;
    private byte c;

    public final defpackage.xam a() {
        if (this.c == 3) {
            return new defpackage.xam(this.a, this.b);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if ((this.c & 1) == 0) {
            sb.append(" enabled");
        }
        if ((this.c & 2) == 0) {
            sb.append(" checked");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.b = z;
        this.c = (byte) (this.c | 2);
    }

    public final void c(boolean z) {
        this.a = z;
        this.c = (byte) (this.c | 1);
    }
}
