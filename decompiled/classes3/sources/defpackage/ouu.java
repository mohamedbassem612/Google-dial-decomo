package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ouu implements ouh {
    private static final aimz a = aimz.i("com/android/dialer/incall/answer/answerandrelease/service/AnswerAndReleaseChipClickedListener");
    private final heq b;

    public ouu(heq heqVar) {
        this.b = heqVar;
    }

    public final void a() {
        ajcq ajcqVarI;
        a.b().l("com/android/dialer/incall/answer/answerandrelease/service/AnswerAndReleaseChipClickedListener", "onChipClicked", 20, "AnswerAndReleaseChipClickedListener.java").v("Answer and release clicked.");
        java.lang.Object obj = this.b.a;
        defpackage.pqm pqmVar = (defpackage.pqm) obj;
        aify aifyVarG = pqmVar.u.b(defpackage.zpo.f).g();
        if (aifyVarG.isEmpty()) {
            defpackage.pqm.a.b().l("com/android/dialer/incall/core/call/CallControllerImpl", "answerAndRelease", 277, "CallControllerImpl.java").v("No active call, answering incoming call.");
            ajcqVarI = pqmVar.b();
        } else {
            pqmVar.j.set(true);
            ahrv ahrvVarG = ahrv.g(((defpackage.pql) ((defpackage.apqr) aifyVarG.get(0)).a(defpackage.pql.class)).cq().f());
            ajcu ajcuVar = pqmVar.d;
            ajcqVarI = ahrvVarG.j(5000L, java.util.concurrent.TimeUnit.MILLISECONDS, ajcuVar).i(new ocj(obj, 12), ajcuVar);
        }
        agsm.i(437, ajcqVarI, "Failed to answer and release.", new java.lang.Object[0]);
    }
}
