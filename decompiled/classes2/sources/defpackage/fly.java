package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fly {
    public final defpackage.fmb a;
    public final defpackage.fmb b;

    public fly(defpackage.fmb fmbVar, defpackage.fmb fmbVar2) {
        this.a = fmbVar;
        this.b = fmbVar2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.fly flyVar = (defpackage.fly) obj;
            if (this.a.equals(flyVar.a) && this.b.equals(flyVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        defpackage.fmb fmbVar = this.a;
        defpackage.fmb fmbVar2 = this.b;
        return "[" + fmbVar.toString() + (fmbVar.equals(fmbVar2) ? "" : ", ".concat(fmbVar2.toString())) + ']';
    }
}
