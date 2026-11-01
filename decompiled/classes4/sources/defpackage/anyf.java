package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class anyf implements anzt {
    public final defpackage.anwc a;
    boolean b;
    public final /* synthetic */ defpackage.anyh c;

    public anyf(defpackage.anyh anyhVar, defpackage.anwc anwcVar) {
        j$.util.Objects.requireNonNull(anyhVar);
        this.c = anyhVar;
        this.b = false;
        this.a = anwcVar;
    }

    public static final java.lang.String e(defpackage.anqj anqjVar) {
        int iOrdinal;
        if (anqjVar == null || (iOrdinal = anqjVar.ordinal()) == 0) {
            return "none";
        }
        if (iOrdinal == 1) {
            return "integrity_only";
        }
        if (iOrdinal == 2) {
            return "privacy_and_integrity";
        }
        throw new java.lang.IllegalArgumentException("Unknown SecurityLevel: ".concat(anqjVar.toString()));
    }

    public static final java.lang.String f(defpackage.anlw anlwVar, anlv anlvVar) {
        java.lang.String str = (java.lang.String) anlwVar.a(anlvVar);
        return str == null ? "" : str;
    }

    public static final java.lang.String g(defpackage.anlw anlwVar) {
        java.lang.String str = (java.lang.String) anlwVar.a(defpackage.annq.b);
        if (str == null) {
            str = (java.lang.String) anlwVar.a(anpv.a);
        }
        return str == null ? "" : str;
    }

    public final void a(boolean z) {
        this.c.g(this.a, z);
    }

    public final void b() {
        defpackage.anyh anyhVar = this.c;
        anyhVar.d.a(2, "READY");
        anyhVar.g.execute(new defpackage.anwo(this, 9));
    }

    public final void c(anqw anqwVar, defpackage.anwr anwrVar) {
        java.lang.Object[] objArr = {this.a.c(), defpackage.anyh.k(anqwVar)};
        defpackage.anyh anyhVar = this.c;
        anyhVar.d.b(2, "{0} SHUTDOWN with {1}", objArr);
        this.b = true;
        anyhVar.g.execute(new defpackage.akaz(this, anwrVar, anqwVar, 14));
    }

    public final void d() {
        ahvr.bZ(this.b, "transportShutdown() must be called before transportTerminated().");
        defpackage.anwc anwcVar = this.a;
        java.lang.Object[] objArr = {anwcVar.c()};
        defpackage.anyh anyhVar = this.c;
        anyhVar.d.b(2, "{0} Terminated", objArr);
        anno.c(anyhVar.c.f, anwcVar);
        anyhVar.g(anwcVar, false);
        java.util.Iterator it = anyhVar.f.iterator();
        if (!it.hasNext()) {
            anyhVar.g.execute(new defpackage.anwo(this, 10, (byte[]) null));
        } else {
            anwcVar.t();
            throw null;
        }
    }

    public final void h() {
        java.util.Iterator it = this.c.f.iterator();
        if (it.hasNext()) {
            throw null;
        }
    }
}
