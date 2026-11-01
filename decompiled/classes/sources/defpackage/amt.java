package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class amt extends defpackage.dca {
    private final float a;
    private final defpackage.cqd b;
    private final defpackage.crd d;

    public amt(float f, defpackage.cqd cqdVar, defpackage.crd crdVar) {
        this.a = f;
        this.b = cqdVar;
        this.d = crdVar;
    }

    @Override // defpackage.dca
    public final /* bridge */ /* synthetic */ defpackage.cmv d() {
        return new defpackage.ams(this.a, this.b, this.d);
    }

    @Override // defpackage.dca
    public final /* bridge */ /* synthetic */ void e(defpackage.cmv cmvVar) {
        defpackage.ams amsVar = (defpackage.ams) cmvVar;
        float f = amsVar.b;
        float f2 = this.a;
        if (java.lang.Float.compare(f, f2) != 0) {
            amsVar.b = f2;
            defpackage.cfo.w(amsVar);
        }
        defpackage.cqd cqdVar = this.b;
        if (!defpackage.aooh.n(amsVar.c, cqdVar)) {
            amsVar.c = cqdVar;
            defpackage.cfo.w(amsVar);
        }
        defpackage.crd crdVar = this.d;
        if (defpackage.aooh.n(amsVar.d, crdVar)) {
            return;
        }
        amsVar.d = crdVar;
        defpackage.cfo.w(amsVar);
        defpackage.cfo.A(amsVar).I();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.amt) {
            defpackage.amt amtVar = (defpackage.amt) obj;
            if (defpackage.dpi.c(this.a, amtVar.a) && defpackage.aooh.n(this.b, amtVar.b) && defpackage.aooh.n(this.d, amtVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((java.lang.Float.floatToIntBits(this.a) * 31) + this.b.hashCode()) * 31) + this.d.hashCode();
    }
}
