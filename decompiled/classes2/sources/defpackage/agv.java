package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class agv extends dca {
    private final defpackage.agy a;

    public agv(defpackage.agy agyVar) {
        this.a = agyVar;
    }

    public final /* bridge */ /* synthetic */ cmv d() {
        return new defpackage.agu(this.a);
    }

    public final /* bridge */ /* synthetic */ void e(cmv cmvVar) {
        defpackage.agu aguVar = (defpackage.agu) cmvVar;
        defpackage.agy agyVar = aguVar.e;
        defpackage.agy agyVar2 = this.a;
        if (aooh.n(agyVar2, agyVar)) {
            return;
        }
        aguVar.e.k(false);
        aguVar.e = agyVar2;
        agyVar2.k(((cmv) aguVar).D);
        if (((cmv) aguVar).D) {
            aguVar.w();
            aguVar.v();
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.agv) && aooh.n(this.a, ((defpackage.agv) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "SharedBoundsNodeElement(sharedElementEntry=" + this.a + ')';
    }
}
