package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class adhe extends defpackage.adid {
    private final defpackage.adib a;
    private final boolean b;
    private volatile transient java.lang.String c;

    public adhe(defpackage.adib adibVar, boolean z) {
        this.a = adibVar;
        this.b = z;
    }

    @Override // defpackage.adid
    public final defpackage.adib a() {
        return this.a;
    }

    @Override // defpackage.adid
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.adid) {
            defpackage.adid adidVar = (defpackage.adid) obj;
            if (this.a.equals(adidVar.a()) && this.b == adidVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    @Override // defpackage.adid
    public final java.lang.String toString() {
        if (this.c == null) {
            synchronized (this) {
                if (this.c == null) {
                    this.c = "{" + this.a.toString() + ", " + (true != this.b ? "bg" : "fg") + '}';
                    if (this.c == null) {
                        throw new java.lang.NullPointerException("toString() cannot return null");
                    }
                }
            }
        }
        return this.c;
    }
}
