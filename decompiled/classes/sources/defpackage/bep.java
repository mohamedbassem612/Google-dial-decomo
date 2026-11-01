package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class bep {
    public defpackage.air a;
    private defpackage.aoub b;

    /* JADX WARN: Type inference failed for: r3v0, types: [aonj, java.lang.Object] */
    public bep() {
        defpackage.nf nfVar = defpackage.alo.a;
        java.lang.Float fValueOf = java.lang.Float.valueOf(0.0f);
        this.a = new defpackage.air(nfVar, fValueOf, (defpackage.aiw) nfVar.a.a(fValueOf), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public final float a() {
        return ((java.lang.Number) this.a.a()).floatValue();
    }

    public final void b() {
        defpackage.aoub aoubVar = this.b;
        if (aoubVar != null) {
            aoubVar.s(null);
        }
        this.a = new defpackage.air(defpackage.alo.a, java.lang.Float.valueOf(0.0f), null, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public final void c(float f, defpackage.dpf dpfVar, defpackage.aoss aossVar) {
        if (f > dpfVar.dl(1.0f)) {
            defpackage.cko ckoVar = (defpackage.cko) defpackage.ckw.i.i();
            defpackage.aonj aonjVarI = ckoVar != null ? ckoVar.i() : null;
            defpackage.cko ckoVarH = defpackage.cfd.h(ckoVar);
            try {
                float fFloatValue = ((java.lang.Number) this.a.a()).floatValue();
                defpackage.aoub aoubVar = this.b;
                if (aoubVar != null) {
                    aoubVar.s(null);
                }
                defpackage.air airVar = this.a;
                if (airVar.d) {
                    this.a = defpackage.den.bs(airVar, fFloatValue - f, 0.0f, 30);
                } else {
                    this.a = new defpackage.air(defpackage.alo.a, java.lang.Float.valueOf(-f), null, Long.MIN_VALUE, Long.MIN_VALUE, false);
                }
                this.b = defpackage.aoov.an(aossVar, null, 0, new ahb(this, (defpackage.aoln) null, 18), 3);
            } finally {
                defpackage.cfd.i(ckoVar, ckoVarH, aonjVarI);
            }
        }
    }

    public final boolean d() {
        return ((java.lang.Number) this.a.a()).floatValue() != 0.0f;
    }
}
