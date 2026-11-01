package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class whm {
    public final ajcq a;
    public final dsd b;

    public whm(ajcq ajcqVar, dsd dsdVar) {
        this.a = ajcqVar;
        this.b = dsdVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.whm) {
            defpackage.whm whmVar = (defpackage.whm) obj;
            if (aooh.n(this.a, whmVar.a) && aooh.n(this.b, whmVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "SessionTracking(future=" + this.a + ", completer=" + this.b + ')';
    }
}
