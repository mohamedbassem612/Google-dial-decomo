package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qoz implements defpackage.qmx {
    private static final aimz c = aimz.i("com/android/dialer/incall/video/buttons/HoldButtonController");
    public final ruc a;
    public final zne b = new defpackage.qvm(this, 1);
    private final defpackage.pqm d;
    private final defpackage.qbe e;

    public qoz(defpackage.pqm pqmVar, ruc rucVar, defpackage.qbe qbeVar) {
        this.d = pqmVar;
        this.a = rucVar;
        this.e = qbeVar;
    }

    @Override // defpackage.qmx
    public final void a(defpackage.qmw qmwVar) {
        boolean z = qmwVar.b;
        aimz aimzVar = c;
        if (z) {
            aimzVar.b().l("com/android/dialer/incall/video/buttons/HoldButtonController", "onButtonClicked", 38, "HoldButtonController.java").v("unhold clicked");
            this.e.a(qbc.bN);
            agsm.i(637, this.d.l(), "failed to unhold the call", new java.lang.Object[0]);
            return;
        }
        aimzVar.b().l("com/android/dialer/incall/video/buttons/HoldButtonController", "onButtonClicked", 44, "HoldButtonController.java").v("hold clicked");
        ruc rucVar = this.a;
        aenj aenjVar = ruc.C;
        rucVar.j(aenjVar);
        rucVar.k(aenjVar);
        this.e.a(qbc.bM);
        this.d.n();
    }
}
