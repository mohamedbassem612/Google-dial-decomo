package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class agzj implements defpackage.agza {
    private final defpackage.agza a;
    private defpackage.agzu b = null;

    public agzj(defpackage.agza agzaVar) {
        this.a = agzaVar;
    }

    @Override // defpackage.agza
    public final void a(java.lang.Throwable th) {
        afec.c();
        defpackage.agzu agzuVar = this.b;
        defpackage.agzs agzsVar = new defpackage.agzs(th);
        this.b = agzsVar;
        if (agzsVar.equals(agzuVar)) {
            return;
        }
        this.a.a(th);
    }

    @Override // defpackage.agza
    public final void b(java.lang.Object obj) {
        afec.c();
        defpackage.agzu agzuVar = this.b;
        defpackage.agzt agztVar = new defpackage.agzt(obj);
        this.b = agztVar;
        if (agztVar.equals(agzuVar)) {
            return;
        }
        this.a.b(obj);
    }
}
