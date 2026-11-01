package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class byg extends dca {
    private final defpackage.apy a;
    private final aonn b;
    private final aso d;

    public byg(defpackage.apy apyVar, aonn aonnVar, aso asoVar) {
        this.a = apyVar;
        this.b = aonnVar;
        this.d = asoVar;
    }

    public final /* bridge */ /* synthetic */ cmv d() {
        return new defpackage.byi(this.a, this.b, this.d);
    }

    public final /* bridge */ /* synthetic */ void e(cmv cmvVar) {
        defpackage.byi byiVar = (defpackage.byi) cmvVar;
        defpackage.apy apyVar = byiVar.a;
        defpackage.apy apyVar2 = this.a;
        boolean zN = aooh.n(apyVar, apyVar2);
        byiVar.a = apyVar2;
        byiVar.b = this.b;
        byiVar.c = this.d;
        if (zN) {
            return;
        }
        byiVar.d = false;
        cfo.u(byiVar);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.byg) {
            defpackage.byg bygVar = (defpackage.byg) obj;
            if (aooh.n(this.a, bygVar.a) && this.b == bygVar.b && this.d == bygVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.d.hashCode();
    }
}
