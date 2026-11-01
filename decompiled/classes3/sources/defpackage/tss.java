package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tss implements defpackage.ttd {
    private static final aimz a = aimz.i("com/android/dialer/sharpie/impl/state/SharpieLifecycleStateHolder");
    private defpackage.tth b = defpackage.tth.NOT_SET;

    @Override // defpackage.ttd
    public final defpackage.ttc a(defpackage.ttb ttbVar) {
        aooh.f(ttbVar, "event");
        int i = ttbVar.b;
        if (i == 1) {
            defpackage.tth tthVarB = defpackage.tth.b((i == 1 ? (defpackage.tsv) ttbVar.c : defpackage.tsv.a).b);
            if (tthVarB == null) {
                tthVarB = defpackage.tth.UNRECOGNIZED;
            }
            if (this.b != tthVarB) {
                a.b().l("com/android/dialer/sharpie/impl/state/SharpieLifecycleStateHolder", "update", 26, "SharpieLifecycleStateHolder.kt").I("lifecycle transition: %s -> %s", this.b.name(), tthVarB.name());
                this.b = tthVarB;
                return defpackage.ttc.b;
            }
        }
        return defpackage.ttc.a;
    }

    @Override // defpackage.ttd
    public final defpackage.tti b(defpackage.tti ttiVar) {
        aooh.f(ttiVar, "model");
        defpackage.vqu vquVarCu = wsc.cu(ttiVar.p());
        defpackage.tth tthVar = this.b;
        aooh.f(tthVar, "value");
        akzx akzxVar = (akzx) vquVarCu.a;
        akzxVar.u();
        ((defpackage.tti) akzxVar.b).c = tthVar.a();
        return vquVarCu.ad();
    }
}
