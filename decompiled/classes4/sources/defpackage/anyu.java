package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class anyu extends defpackage.annf {
    public final defpackage.anmv a;
    private final annp b;
    private final anmc c;
    private final java.util.concurrent.Executor d;
    private final defpackage.anpk e;
    private anmb f;
    private ajsz g;

    public anyu(annp annpVar, anmc anmcVar, java.util.concurrent.Executor executor, defpackage.anpk anpkVar, anmb anmbVar) {
        this.b = annpVar;
        this.c = anmcVar;
        this.e = anpkVar;
        java.util.concurrent.Executor executor2 = anmbVar.c;
        executor = executor2 != null ? executor2 : executor;
        this.d = executor;
        anlz anlzVarA = anmb.a(anmbVar);
        anlzVarA.b = executor;
        this.f = new anmb(anlzVarA);
        this.a = defpackage.anmv.k();
    }

    @Override // defpackage.annf
    public final void a(anty antyVar, anph anphVar) {
        defpackage.anpk anpkVar = this.e;
        new defpackage.anoi(anpkVar, anphVar, this.f, anzg.g);
        defpackage.apjb apjbVarA = this.b.a();
        anqw anqwVar = (anqw) apjbVarA.a;
        if (!anqwVar.h()) {
            this.d.execute(new defpackage.anyt(this, antyVar, anxo.b(anqwVar)));
            this.g = anzg.X;
        } else {
            defpackage.anzq anzqVarB = ((anzs) apjbVarA.b).b(anpkVar);
            if (anzqVarB != null) {
                this.f = this.f.e(defpackage.anzq.a, anzqVarB);
            }
            ajsz ajszVarB = this.c.b(anpkVar, this.f);
            this.g = ajszVarB;
            ajszVarB.a(antyVar, anphVar);
        }
    }

    @Override // defpackage.annf, defpackage.anpz
    protected final ajsz c() {
        return this.g;
    }

    @Override // defpackage.anpz
    public final void dv(java.lang.String str, java.lang.Throwable th) {
        ajsz ajszVar = this.g;
        if (ajszVar != null) {
            ajszVar.dv(str, th);
        }
    }
}
