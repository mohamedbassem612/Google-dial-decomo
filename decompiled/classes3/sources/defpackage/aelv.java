package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aelv implements defpackage.aelt {
    private final defpackage.acov a;
    private final defpackage.aljf b;

    public aelv(defpackage.aehm aehmVar, defpackage.aeit aeitVar, defpackage.acov acovVar) {
        this.a = acovVar;
        this.b = new defpackage.aljf(this, new defpackage.aelu(this, acovVar), aehmVar, aeitVar);
    }

    private final defpackage.acma g(int i) {
        return f(i, ahwt.a);
    }

    @Override // defpackage.aelt
    public final void a(android.view.View view, int i) {
        afec.c();
        this.a.b().a(view, g(i));
    }

    @Override // defpackage.aelt
    public final void b(android.view.View view, int i) {
        afec.c();
        defpackage.acmm acmmVarB = this.a.b();
        defpackage.acma acmaVarG = g(i);
        if (defpackage.acml.b(view) == null) {
            acmmVarB.a(view, acmaVarG);
        }
    }

    @Override // defpackage.aelt
    public final void c(android.view.View view) {
        afec.c();
        defpackage.acmm acmmVarB = this.a.b();
        afec.c();
        defpackage.acmd acmdVarB = defpackage.acml.b(view);
        if (acmdVarB == null) {
            defpackage.vaa vaaVar = acmmVarB.a;
            aaoo.as(new java.lang.NullPointerException("Tried to unbind a view without an associated CVE. This indicates a GIL instrumentation error. Is `ViewVisualElements#unbind` being invoked unconditionally when `ViewVisualElements#bind` is invoked conditionally?"));
        } else {
            acmdVarB.a.f();
            ahvr.bY(!acmdVarB.a.l());
            acmdVarB.a = null;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [aeit, java.lang.Object] */
    @Override // defpackage.aelt
    public final void d(android.view.View view) {
        afec.c();
        defpackage.aljf aljfVar = this.b;
        defpackage.aelo aeloVar = new defpackage.aelo(aljfVar, view);
        view.addOnAttachStateChangeListener(aeloVar);
        aljfVar.i(view, aljfVar.d.a());
        int i = dzs.a;
        if (view.isAttachedToWindow()) {
            aeloVar.onViewAttachedToWindow(view);
        }
    }

    @Override // defpackage.aelt
    public final void e(adae adaeVar, android.view.View view) {
        defpackage.acmg acmgVarA = this.a.a();
        acme acmeVar = (acme) view.getTag(2131428418);
        if (acmeVar != null) {
            adaeVar.x(acmeVar);
            view.setTag(2131428418, null);
        }
        acmgVarA.a(adaeVar.w(), defpackage.acml.b(view));
    }

    public final defpackage.acma f(int i, ahyn ahynVar) {
        acmc acmcVarG;
        defpackage.acma acmaVar = new defpackage.acma(defpackage.vaa.ak(i), new defpackage.ymu(13), (defpackage.vaa) this.a.c().b);
        if (ahynVar.f()) {
            defpackage.aelm aelmVar = (defpackage.aelm) ahynVar.b();
            int i2 = aelmVar.b - 1;
            if (i2 == 0) {
                acmcVarG = abrz.g((java.lang.String) j$.util.Objects.requireNonNull(aelmVar.a));
            } else if (i2 != 1) {
                acmcVarG = abrz.h();
            } else {
                apdi apdiVar = acmp.a;
                akzx akzxVarM = acmo.a.m();
                akzxVarM.u();
                acmo acmoVar = akzxVarM.b;
                acmoVar.d = 2;
                acmoVar.b |= 2;
                acmcVarG = new acmc(apdiVar, akzxVarM.p());
            }
            acmaVar.b(acmcVarG);
        }
        return acmaVar;
    }
}
