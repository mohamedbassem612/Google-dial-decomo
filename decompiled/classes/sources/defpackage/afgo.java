package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afgo {
    public defpackage.ahyn a = defpackage.ahwt.a;
    public defpackage.afhd b;
    private android.net.Uri c;
    private defpackage.albh d;
    private defpackage.aift e;
    private defpackage.aify f;
    private boolean g;
    private byte h;

    public final defpackage.afgp a() {
        android.net.Uri uri;
        defpackage.albh albhVar;
        defpackage.afhd afhdVar;
        defpackage.aift aiftVar = this.e;
        if (aiftVar != null) {
            this.f = aiftVar.g();
        } else if (this.f == null) {
            this.f = defpackage.aike.a;
        }
        if (this.h == 3 && (uri = this.c) != null && (albhVar = this.d) != null && (afhdVar = this.b) != null) {
            return new defpackage.afgp(uri, albhVar, this.a, this.f, afhdVar, this.g);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.c == null) {
            sb.append(" uri");
        }
        if (this.d == null) {
            sb.append(" schema");
        }
        if (this.b == null) {
            sb.append(" variantConfig");
        }
        if ((this.h & 1) == 0) {
            sb.append(" useGeneratedExtensionRegistry");
        }
        if ((this.h & 2) == 0) {
            sb.append(" enableTracing");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(defpackage.afgl afglVar) {
        if (this.e == null) {
            if (this.f == null) {
                this.e = new defpackage.aift(4);
            } else {
                defpackage.aift aiftVar = new defpackage.aift(4);
                this.e = aiftVar;
                aiftVar.k(this.f);
                this.f = null;
            }
        }
        this.e.i(afglVar);
    }

    public final void c() {
        this.h = (byte) (this.h | 2);
    }

    public final void d(defpackage.albh albhVar) {
        if (albhVar == null) {
            throw new java.lang.NullPointerException("Null schema");
        }
        this.d = albhVar;
    }

    public final void e(android.net.Uri uri) {
        if (uri == null) {
            throw new java.lang.NullPointerException("Null uri");
        }
        this.c = uri;
    }

    public final void f(boolean z) {
        this.g = z;
        this.h = (byte) (this.h | 1);
    }
}
