package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agzh extends defpackage.agzi implements emj {
    public final emx a;
    public defpackage.agzq b;
    private final aidh c = new aifg();
    private boolean d = true;
    private final agze e;
    private final java.util.concurrent.Executor f;
    private final agtg g;
    private final agtg h;
    private final defpackage.uzx i;

    public agzh(emx emxVar, defpackage.uzx uzxVar, java.util.concurrent.Executor executor) {
        this.a = emxVar;
        this.i = uzxVar;
        try {
            this.e = (agze) uzxVar.aS(2131428271, emxVar, new defpackage.agzl(1));
            this.f = executor;
            agtg agtgVar = new agtg(executor, true, false, false);
            this.g = agtgVar;
            agtgVar.c();
            this.h = new agtg(executor, false, false, false);
            emxVar.P().c(this);
        } catch (java.lang.IllegalStateException e) {
            throw new java.lang.IllegalStateException("Both an unqualified and a `@ViewLifecycle LocalSubscriptionMixin` have been injectedin this Fragment scope. Only one of the two LocalSubscriptionMixins may be used in a given Fragment - either the unqualified or `@ViewLifecycle`LocalSubscriptionMixin exclusively.", e);
        }
    }

    public final void b(emx emxVar) {
        afec.c();
        defpackage.agzq agzqVar = this.b;
        if (agzqVar != null) {
            afec.c();
            agzqVar.d.execute(ahqx.h(new defpackage.agdr(agzqVar, 15)));
        }
        this.e.a = false;
    }

    public final void e(emx emxVar) {
        afec.c();
        if (this.d) {
            ahvr.bY(this.b == null);
            aidh aidhVar = this.c;
            this.b = new defpackage.agzq(aifl.a(aidhVar.entrySet()), this.f, this.g, this.h);
            if (this.e.a && this.d) {
                defpackage.agzq agzqVar = this.b;
                afec.c();
                agzqVar.d.execute(ahqx.h(new defpackage.agdr(agzqVar, 14)));
            } else {
                defpackage.agzq agzqVar2 = this.b;
                afec.c();
                agzqVar2.d.execute(ahqx.h(new defpackage.agdr(agzqVar2, 11)));
            }
            aidhVar.clear();
            this.d = false;
        }
        defpackage.agzq agzqVar3 = this.b;
        afec.c();
        agzqVar3.e.c();
    }

    public final void f(emx emxVar) {
        afec.c();
        defpackage.agzq agzqVar = this.b;
        afec.c();
        agzqVar.e.d();
    }

    @Override // defpackage.agzi
    public final defpackage.agwm h(int i, defpackage.agza agzaVar, ahyn ahynVar) {
        afec.c();
        int i2 = 1;
        ahvr.bY(this.b == null);
        ahvr.bY(this.c.g(agzaVar, (defpackage.amdx) this.i.aT(i, this.a, new defpackage.ahhc(ahynVar, 1), new defpackage.agzm(i2))) == null);
        return new defpackage.agzd(this, agzaVar);
    }

    public final /* synthetic */ void a(emx emxVar) {
    }

    public final /* synthetic */ void c(emx emxVar) {
    }

    public final /* synthetic */ void fn(emx emxVar) {
    }
}
