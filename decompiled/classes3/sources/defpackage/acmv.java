package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acmv {
    private final defpackage.acmd a;
    private final defpackage.acmd b;

    public acmv(defpackage.acmd acmdVar, defpackage.acmd acmdVar2) {
        aooh.f(acmdVar2, "state");
        this.a = acmdVar;
        this.b = acmdVar2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.acmv) {
            defpackage.acmv acmvVar = (defpackage.acmv) obj;
            if (aooh.n(this.a, acmvVar.a) && aooh.n(this.b, acmvVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        defpackage.acmd acmdVar = this.a;
        return ((acmdVar == null ? 0 : acmdVar.hashCode()) * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "VeNodeCallbackKey(parentCve=" + this.a + ", state=" + this.b + ')';
    }
}
