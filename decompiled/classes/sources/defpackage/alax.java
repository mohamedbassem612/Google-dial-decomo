package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class alax {
    public volatile defpackage.akzc a;
    protected volatile defpackage.albh b;
    private final defpackage.albh c;
    private final defpackage.akzq d;
    private volatile boolean e;

    public alax(defpackage.albh albhVar) {
        if (albhVar == null) {
            throw new java.lang.IllegalArgumentException("message cannot be null");
        }
        this.b = albhVar;
        this.c = albhVar.t();
        this.d = defpackage.akzq.a;
        this.a = null;
        this.e = false;
    }

    final int a() {
        int iC = this.a != null ? this.a.c() : this.b.l();
        return ((352 - (java.lang.Integer.numberOfLeadingZeros(iC) * 9)) >>> 6) + iC;
    }

    final defpackage.albh b() {
        try {
            return this.b;
        } catch (defpackage.alaz unused) {
            byte b = this.d.b;
            int i = defpackage.akzq.c;
            return this.c;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (this != obj) {
            if (!(obj instanceof defpackage.alax)) {
                return b().equals(obj);
            }
            defpackage.alax alaxVar = (defpackage.alax) obj;
            if (this.a == null || alaxVar.a == null || this.d != alaxVar.d || !this.a.equals(alaxVar.a)) {
                return b().equals(alaxVar.b());
            }
        }
        return true;
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final java.lang.String toString() {
        return b().toString();
    }
}
