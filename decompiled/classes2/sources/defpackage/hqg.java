package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hqg {
    public final defpackage.hqh a;
    public final aonj b;

    public hqg(defpackage.hqh hqhVar, aonj aonjVar) {
        aooh.f(hqhVar, "tabId");
        this.a = hqhVar;
        this.b = aonjVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.hqg) {
            defpackage.hqg hqgVar = (defpackage.hqg) obj;
            if (this.a == hqgVar.a && aooh.n(this.b, hqgVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "TabData(tabId=" + this.a + ", updateActiveTabCallback=" + this.b + ')';
    }
}
