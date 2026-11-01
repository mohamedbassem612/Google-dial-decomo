package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aetm {
    public int a;
    public defpackage.ahyn b = defpackage.ahwt.a;
    public byte c;
    public int d;
    private boolean e;
    private defpackage.aify f;

    public final defpackage.aetn a() {
        int i;
        if (this.f == null) {
            this.f = defpackage.aike.a;
        }
        if (this.c == 3 && (i = this.d) != 0) {
            return new defpackage.aetn(i, this.a, this.e, this.b, this.f);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.d == 0) {
            sb.append(" enablement");
        }
        if ((this.c & 1) == 0) {
            sb.append(" batchSize");
        }
        if ((this.c & 2) == 0) {
            sb.append(" enableUrlAutoSanitization");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.e = z;
        this.c = (byte) (this.c | 2);
    }
}
