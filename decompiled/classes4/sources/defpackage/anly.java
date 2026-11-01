package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class anly {
    public final anvs a;
    public final defpackage.anpk b;
    public final anph c;
    public final anmb d;
    public final anmg[] f;
    public defpackage.anvp h;
    public boolean i;
    public defpackage.anwq j;
    private final aprf k;
    public final java.lang.Object g = new java.lang.Object();
    public final defpackage.anmv e = defpackage.anmv.k();

    public anly(anvs anvsVar, defpackage.anpk anpkVar, anph anphVar, anmb anmbVar, aprf aprfVar, anmg[] anmgVarArr) {
        this.a = anvsVar;
        this.b = anpkVar;
        this.c = anphVar;
        this.d = anmbVar;
        this.k = aprfVar;
        this.f = anmgVarArr;
    }

    public final void a(anqw anqwVar) {
        ahvr.bN(!anqwVar.h(), "Cannot fail with OK status");
        ahvr.bZ(!this.i, "apply() or fail() already called");
        b(new defpackage.anwy(anxo.b(anqwVar), this.f));
    }

    public final void b(defpackage.anvp anvpVar) {
        boolean z;
        ahvr.bZ(!this.i, "already finalized");
        this.i = true;
        synchronized (this.g) {
            if (this.h == null) {
                this.h = anvpVar;
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            this.k.a();
            return;
        }
        ahvr.bZ(this.j != null, "delayedStream is null");
        java.lang.Runnable runnableT = this.j.t(anvpVar);
        if (runnableT != null) {
            runnableT.run();
        }
        this.k.a();
    }
}
