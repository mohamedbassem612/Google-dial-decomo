package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agww extends defpackage.agwm {
    public final java.lang.Object a;
    public final defpackage.agwx b;

    public agww(java.lang.Object obj, defpackage.agwx agwxVar) {
        this.a = obj;
        this.b = agwxVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.agww) {
            defpackage.agww agwwVar = (defpackage.agww) obj;
            if (aooh.n(this.a, agwwVar.a) && aooh.n(this.b, agwwVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Object obj = this.a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "StaleRead(staleResponse=" + this.a + ", cause=" + this.b + ')';
    }
}
