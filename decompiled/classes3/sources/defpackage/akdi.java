package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class akdi {
    private final ainh a;
    private final java.lang.String b;

    public akdi(ainh ainhVar, java.lang.String str) {
        this.a = ainhVar;
        this.b = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.akdi) {
            defpackage.akdi akdiVar = (defpackage.akdi) obj;
            if (this.a.equals(akdiVar.a)) {
                java.lang.String str = this.b;
                if (str == null) {
                    if (akdiVar.b == null) {
                        return true;
                    }
                } else if (str.equals(akdiVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        java.lang.String str = this.b;
        return (iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode());
    }

    public final java.lang.String toString() {
        return "MessageAndLogSite{logSite=" + this.a.toString() + ", message=" + this.b + '}';
    }

    public akdi() {
        throw null;
    }
}
