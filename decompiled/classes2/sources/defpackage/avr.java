package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class avr implements azz {
    private final azz a;
    private final azz b;

    public avr(azz azzVar, azz azzVar2) {
        this.a = azzVar;
        this.b = azzVar2;
    }

    public final int a(dpf dpfVar) {
        return this.a.a(dpfVar) + this.b.a(dpfVar);
    }

    public final int b(dpf dpfVar, dpq dpqVar) {
        return this.a.b(dpfVar, dpqVar) + this.b.b(dpfVar, dpqVar);
    }

    public final int c(dpf dpfVar, dpq dpqVar) {
        return this.a.c(dpfVar, dpqVar) + this.b.c(dpfVar, dpqVar);
    }

    public final int d(dpf dpfVar) {
        return this.a.d(dpfVar) + this.b.d(dpfVar);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.avr) {
            defpackage.avr avrVar = (defpackage.avr) obj;
            if (aooh.n(avrVar.a, this.a) && aooh.n(avrVar.b, this.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return "(" + this.a + " + " + this.b + ')';
    }
}
