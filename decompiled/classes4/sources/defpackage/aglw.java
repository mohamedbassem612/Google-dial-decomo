package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public class aglw {
    public final aglv a;
    public final aomy b;

    public aglw(aglv aglvVar, aomy aomyVar) {
        this.a = aglvVar;
        this.b = aomyVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.aglw aglwVar = (defpackage.aglw) obj;
            if (aooh.n(this.a, aglwVar.a) && aooh.n(this.b, aglwVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }
}
