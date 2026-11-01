package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adsz {
    public final java.lang.String a;
    public final java.io.File b;
    public final java.lang.String c;
    public final defpackage.adsx d;
    public final defpackage.adtk e;
    final boolean g;
    final boolean h;
    private final defpackage.adth l;
    private defpackage.adsy n;
    public final defpackage.aiii f = new defpackage.aidf(null);
    int i = 0;
    private boolean m = false;
    public defpackage.afsq k = null;
    public int j = -1;

    public adsz(defpackage.adth adthVar, java.lang.String str, java.io.File file, java.lang.String str2, defpackage.adsx adsxVar, defpackage.adtk adtkVar) {
        this.n = defpackage.adsy.a;
        this.a = str;
        this.b = file;
        this.c = str2;
        this.d = adsxVar;
        this.l = adthVar;
        this.e = adtkVar;
        int i = defpackage.adsv.a;
        boolean zStartsWith = str.startsWith("data:");
        this.g = zStartsWith;
        boolean zStartsWith2 = str.startsWith("file:");
        this.h = zStartsWith2;
        if (zStartsWith2 || zStartsWith) {
            this.n = defpackage.adsy.c;
        }
    }

    public final synchronized defpackage.adsy a() {
        return this.n;
    }

    final synchronized void b() {
    }

    final synchronized void c() {
    }

    final synchronized void d() {
        this.m = true;
    }

    public final boolean e() {
        return this.l.l(this);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.adsz)) {
            return false;
        }
        defpackage.adsz adszVar = (defpackage.adsz) obj;
        return j$.util.Objects.equals(this.a, adszVar.a) && j$.util.Objects.equals(this.b, adszVar.b) && j$.util.Objects.equals(this.c, adszVar.c) && j$.util.Objects.equals(this.n, adszVar.n) && this.m == adszVar.m;
    }

    public final synchronized boolean f() {
        return this.m;
    }

    public final void g(defpackage.adsy adsyVar) {
        if (this.h || this.g) {
            return;
        }
        this.n = adsyVar;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, this.b, this.c, this.n, java.lang.Boolean.valueOf(this.m)});
    }

    public final java.lang.String toString() {
        defpackage.ahym ahymVarK = defpackage.ahvr.k(defpackage.adsz.class);
        ahymVarK.b("", this.a);
        ahymVarK.b("targetDirectory", this.b);
        ahymVarK.b("fileName", this.c);
        ahymVarK.b("requiredConnectivity", this.n);
        ahymVarK.g("canceled", this.m);
        return ahymVarK.toString();
    }
}
