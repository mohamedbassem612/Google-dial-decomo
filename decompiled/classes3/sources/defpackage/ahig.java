package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahig {
    public java.lang.String a;
    public ahyn b;
    public aigb c;
    public int d;
    private aigf e;
    private boolean f;
    private boolean g;
    private final ahyn h;
    private final ahyn i;
    private final ahyn j;
    private byte k;

    public ahig() {
        ahwt ahwtVar = ahwt.a;
        this.b = ahwtVar;
        this.h = ahwtVar;
        this.i = ahwtVar;
        this.j = ahwtVar;
    }

    public final defpackage.ahih a() {
        java.lang.String str;
        aigb aigbVar = this.c;
        if (aigbVar != null) {
            this.e = aigbVar.e(true);
        } else if (this.e == null) {
            this.e = aikj.b;
        }
        if (this.k == 3 && (str = this.a) != null && this.d != 0) {
            return new defpackage.ahih(str, this.b, this.e, this.f, this.g, this.h, this.i, this.j);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.a == null) {
            sb.append(" categoryTag");
        }
        if ((this.k & 1) == 0) {
            sb.append(" psdAllowPii");
        }
        if ((this.k & 2) == 0) {
            sb.append(" includeScreenshot");
        }
        if (this.d == 0) {
            sb.append(" colorTheme");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.g = z;
        this.k = (byte) (this.k | 2);
    }

    public final void c(boolean z) {
        this.f = z;
        this.k = (byte) (this.k | 1);
    }
}
