package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adic {
    public defpackage.adib a;
    private boolean b;
    private byte c;

    public final defpackage.adid a() {
        defpackage.adib adibVar;
        if (this.c == 1 && (adibVar = this.a) != null) {
            return new defpackage.adhe(adibVar, this.b);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.a == null) {
            sb.append(" constraints");
        }
        if (this.c == 0) {
            sb.append(" runInForeground");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.b = z;
        this.c = (byte) 1;
    }
}
