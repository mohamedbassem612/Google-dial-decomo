package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agjt {
    public final defpackage.aglv a;
    public final java.lang.Object b;
    public final ajh c;

    public agjt(defpackage.aglv aglvVar, java.lang.Object obj, ajh ajhVar) {
        aooh.f(aglvVar, "uniform");
        this.a = aglvVar;
        this.b = obj;
        this.c = ajhVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.agjt) {
            defpackage.agjt agjtVar = (defpackage.agjt) obj;
            if (aooh.n(this.a, agjtVar.a) && aooh.n(this.b, agjtVar.b) && aooh.n(this.c, agjtVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        java.lang.Object obj = this.b;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        ajh ajhVar = this.c;
        return iHashCode2 + (ajhVar != null ? ajhVar.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "Keyframe(uniform=" + this.a + ", value=" + this.b + ", easing=" + this.c + ')';
    }
}
