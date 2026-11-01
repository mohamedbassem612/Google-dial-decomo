package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class axf implements azz {
    private final azz a;
    private final azz b;

    public axf(azz azzVar, azz azzVar2) {
        this.a = azzVar;
        this.b = azzVar2;
    }

    public final int a(dpf dpfVar) {
        int iA = this.a.a(dpfVar) - this.b.a(dpfVar);
        if (iA < 0) {
            return 0;
        }
        return iA;
    }

    public final int b(dpf dpfVar, dpq dpqVar) {
        int iB = this.a.b(dpfVar, dpqVar) - this.b.b(dpfVar, dpqVar);
        if (iB < 0) {
            return 0;
        }
        return iB;
    }

    public final int c(dpf dpfVar, dpq dpqVar) {
        int iC = this.a.c(dpfVar, dpqVar) - this.b.c(dpfVar, dpqVar);
        if (iC < 0) {
            return 0;
        }
        return iC;
    }

    public final int d(dpf dpfVar) {
        int iD = this.a.d(dpfVar) - this.b.d(dpfVar);
        if (iD < 0) {
            return 0;
        }
        return iD;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.axf) {
            defpackage.axf axfVar = (defpackage.axf) obj;
            if (aooh.n(axfVar.a, this.a) && aooh.n(axfVar.b, this.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "(" + this.a + " - " + this.b + ')';
    }
}
