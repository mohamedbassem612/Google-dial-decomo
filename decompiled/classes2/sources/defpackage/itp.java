package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class itp implements defpackage.itr {
    public final defpackage.kqy a;

    public itp(defpackage.kqy kqyVar) {
        aooh.f(kqyVar, "callActions");
        this.a = kqyVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.itp) && aooh.n(this.a, ((defpackage.itp) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "CallActions(callActions=" + this.a + ')';
    }
}
