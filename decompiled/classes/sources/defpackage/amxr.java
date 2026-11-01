package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class amxr implements defpackage.amyp {
    private volatile java.lang.Object a;
    private final java.lang.Object b = new java.lang.Object();
    private final defpackage.aw c;
    private final defpackage.amxv d;

    public amxr(defpackage.aw awVar) {
        this.c = awVar;
        this.d = new defpackage.amxv(awVar);
    }

    public static final android.content.Context e(android.content.Context context) {
        while ((context instanceof android.content.ContextWrapper) && !(context instanceof android.app.Activity)) {
            context = ((android.content.ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    public static final void g(defpackage.aw awVar) {
        if (awVar.m == null) {
            awVar.au(new android.os.Bundle());
        }
    }

    @Override // defpackage.amyp
    public final java.lang.Object B() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    this.a = a();
                }
            }
        }
        return this.a;
    }

    protected java.lang.Object a() {
        defpackage.hko hkoVarF;
        defpackage.aw awVar = this.c;
        if (awVar.X() == null) {
            throw new java.lang.NullPointerException("Hilt Fragments must be attached before creating the component.");
        }
        defpackage.ajsz.dA(awVar.X() instanceof defpackage.amyq, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", awVar.X().getClass());
        d(awVar);
        for (defpackage.aw awVar2 = awVar; awVar2 != null; awVar2 = awVar2.E) {
            if (awVar2 instanceof defpackage.amyq) {
                defpackage.amyp amypVarB = ((defpackage.amyq) awVar2).b();
                if (amypVarB instanceof defpackage.amxj) {
                    hkoVarF = ((defpackage.amxj) amypVarB).f();
                    defpackage.hiq hiqVarK = ((defpackage.amxq) defpackage.aooc.ar(hkoVarF, defpackage.amxq.class)).K();
                    hiqVarK.c = this.d.B();
                    hiqVarK.b = awVar;
                    defpackage.aooc.an(hiqVarK.b, defpackage.aw.class);
                    defpackage.aooc.an(hiqVarK.c, defpackage.amwy.class);
                    return new defpackage.his(hiqVarK.a, hiqVarK.d, hiqVarK.e, hiqVarK.f, hiqVarK.b, hiqVarK.c);
                }
            }
        }
        defpackage.ajsz.dA(awVar.X() instanceof defpackage.amyq, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", awVar.X().getClass());
        hkoVarF = ((defpackage.amxj) ((defpackage.amyq) awVar.X()).b()).f();
        defpackage.hiq hiqVarK2 = ((defpackage.amxq) defpackage.aooc.ar(hkoVarF, defpackage.amxq.class)).K();
        hiqVarK2.c = this.d.B();
        hiqVarK2.b = awVar;
        defpackage.aooc.an(hiqVarK2.b, defpackage.aw.class);
        defpackage.aooc.an(hiqVarK2.c, defpackage.amwy.class);
        return new defpackage.his(hiqVarK2.a, hiqVarK2.d, hiqVarK2.e, hiqVarK2.f, hiqVarK2.b, hiqVarK2.c);
    }

    public final void f() {
        defpackage.aw awVar = this.c;
        if (awVar.X() == null) {
            throw new java.lang.NullPointerException("Hilt Fragments must be attached before initializing saved state.");
        }
        defpackage.ajsz.dA(awVar.X() instanceof defpackage.amyp, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", awVar.X().getClass());
        defpackage.aw awVar2 = this.d.a;
        defpackage.amxw amxwVar = ((defpackage.amxt) new defpackage.eog(awVar2, new defpackage.amxk(awVar2, 2)).a(defpackage.amxt.class)).b;
        if (amxwVar.c()) {
            amxwVar.b(awVar.T());
        }
        awVar.P().c(new defpackage.roe(this, amxwVar, 2));
    }

    protected void d(defpackage.aw awVar) {
    }
}
