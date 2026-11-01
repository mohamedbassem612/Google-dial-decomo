package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rdj extends defpackage.afqs {
    final /* synthetic */ defpackage.rdk a;

    public rdj(defpackage.rdk rdkVar) {
        this.a = rdkVar;
    }

    @Override // defpackage.afqs
    public final void a(android.view.View view, int i) {
        defpackage.rdk rdkVar;
        defpackage.rcc rccVarD;
        if (i != 5 || (rccVarD = (rdkVar = this.a).d()) == null) {
            return;
        }
        defpackage.qtr qtrVarB = defpackage.qtr.b(rccVarD.k.d);
        if (qtrVarB == null) {
            qtrVarB = defpackage.qtr.BOTTOM_SHEET_FRAGMENT_KEY_NONE;
        }
        defpackage.rap rapVarB = rdkVar.b();
        if (rapVarB != null) {
            rdkVar.o.g(rapVarB.m(qtrVarB, 2), 5L, java.util.concurrent.TimeUnit.SECONDS);
        }
    }

    @Override // defpackage.afqs
    public final void b(android.view.View view) {
    }
}
