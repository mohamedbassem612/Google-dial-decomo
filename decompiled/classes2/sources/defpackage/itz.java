package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class itz {
    public final defpackage.kqy a;

    public itz(defpackage.kqy kqyVar) {
        aooh.f(kqyVar, "duplexCallActions");
        this.a = kqyVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.itz) && aooh.n(this.a, ((defpackage.itz) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "BeeslyCallActions(duplexCallActions=" + this.a + ')';
    }
}
