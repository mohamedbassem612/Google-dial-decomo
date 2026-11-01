package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class amq extends defpackage.dca {
    private final long a;
    private final defpackage.cqd b;
    private final defpackage.crd d;

    public /* synthetic */ amq(long j, defpackage.cqd cqdVar, defpackage.crd crdVar, int i) {
        if ((i & 1) != 0) {
            float[] fArr = defpackage.crp.a;
            j = defpackage.cfd.N(0.0f, 0.0f, 0.0f, 0.0f, defpackage.crp.u);
        }
        cqdVar = (i & 2) != 0 ? null : cqdVar;
        this.a = j;
        this.b = cqdVar;
        this.d = crdVar;
    }

    @Override // defpackage.dca
    public final /* bridge */ /* synthetic */ defpackage.cmv d() {
        return new defpackage.amr(this.a, this.b, this.d);
    }

    @Override // defpackage.dca
    public final /* bridge */ /* synthetic */ void e(defpackage.cmv cmvVar) {
        defpackage.amr amrVar = (defpackage.amr) cmvVar;
        amrVar.a = this.a;
        amrVar.b = this.b;
        amrVar.c = 1.0f;
        defpackage.crd crdVar = amrVar.d;
        defpackage.crd crdVar2 = this.d;
        if (!defpackage.aooh.n(crdVar, crdVar2)) {
            amrVar.d = crdVar2;
            defpackage.cfo.A(amrVar).I();
        }
        defpackage.cfo.w(amrVar);
    }

    public final boolean equals(java.lang.Object obj) {
        defpackage.amq amqVar = obj instanceof defpackage.amq ? (defpackage.amq) obj : null;
        return amqVar != null && this.a == amqVar.a && defpackage.aooh.n(this.b, amqVar.b) && defpackage.aooh.n(this.d, amqVar.d);
    }

    public final int hashCode() {
        defpackage.cqd cqdVar = this.b;
        int iHashCode = cqdVar != null ? cqdVar.hashCode() : 0;
        long j = this.a;
        return (((((((int) (j ^ (j >>> 32))) * 31) + iHashCode) * 31) + 1065353216) * 31) + this.d.hashCode();
    }
}
