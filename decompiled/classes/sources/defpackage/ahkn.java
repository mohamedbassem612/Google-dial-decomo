package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahkn {
    public java.lang.String a;
    public defpackage.ahyn b;
    public defpackage.ahkk c;
    public java.util.concurrent.Executor d;
    public byte e;
    private defpackage.albh f;
    private defpackage.aify g;
    private defpackage.ahyn h;
    private final defpackage.ahyn i;

    public ahkn() {
        defpackage.ahwt ahwtVar = defpackage.ahwt.a;
        this.b = ahwtVar;
        this.h = ahwtVar;
        this.i = ahwtVar;
    }

    public final defpackage.ahko a() {
        java.lang.String str;
        defpackage.albh albhVar;
        defpackage.ahkk ahkkVar;
        if (this.g == null) {
            this.g = defpackage.aike.a;
        }
        if (this.e == 1 && (str = this.a) != null && (albhVar = this.f) != null && (ahkkVar = this.c) != null) {
            return new defpackage.ahko(str, this.b, albhVar, ahkkVar, this.g, this.h, this.i, this.d);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.e == 0) {
            sb.append(" blockingSafeReads");
        }
        if (this.a == null) {
            sb.append(" name");
        }
        if (this.f == null) {
            sb.append(" schema");
        }
        if (this.c == null) {
            sb.append(" storage");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(defpackage.afgd afgdVar) {
        this.h = new defpackage.ahys(afgdVar);
    }

    public final void c(defpackage.albh albhVar) {
        if (albhVar == null) {
            throw new java.lang.NullPointerException("Null schema");
        }
        this.f = albhVar;
    }
}
