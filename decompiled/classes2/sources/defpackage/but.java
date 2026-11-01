package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class but {
    public final aosb a;
    public final defpackage.buu b;

    public but(defpackage.buu buuVar, aosb aosbVar) {
        this.b = buuVar;
        this.a = aosbVar;
    }

    public final void a() {
        aosb aosbVar = this.a;
        if (aosbVar.h()) {
            aosbVar.w(defpackage.bvc.a);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.but butVar = (defpackage.but) obj;
            if (aooh.n(this.b, butVar.b) && aooh.n(this.a, butVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }
}
