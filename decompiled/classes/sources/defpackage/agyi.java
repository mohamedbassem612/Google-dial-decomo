package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agyi implements defpackage.emj {
    final /* synthetic */ defpackage.aw a;
    final /* synthetic */ defpackage.ajwr b;

    public agyi(defpackage.ajwr ajwrVar, defpackage.aw awVar) {
        this.a = awVar;
        j$.util.Objects.requireNonNull(ajwrVar);
        this.b = ajwrVar;
    }

    @Override // defpackage.emj
    public final void a(defpackage.emx emxVar) {
        defpackage.aw awVar = this.a;
        defpackage.eos eosVar = new defpackage.eos(awVar.T());
        eosVar.b(defpackage.env.c, android.os.Bundle.EMPTY);
        this.b.a = (defpackage.agyj) new defpackage.eog(awVar.S(), awVar.R(), eosVar).a(defpackage.agyj.class);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    @Override // defpackage.emj
    public final void b(defpackage.emx emxVar) throws afeb {
        defpackage.ajwr ajwrVar = this.b;
        defpackage.agtg agtgVar = (defpackage.agtg) ajwrVar.b;
        agtgVar.d();
        agtgVar.a();
        defpackage.agyj agyjVar = (defpackage.agyj) ajwrVar.a;
        java.util.Iterator it = agyjVar.a.values().iterator();
        while (it.hasNext()) {
            ((defpackage.agym) it.next()).c();
        }
        java.util.Iterator it2 = agyjVar.b.values().iterator();
        while (it2.hasNext()) {
            ((defpackage.agym) it2.next()).c();
        }
        agyjVar.c.c();
        agyjVar.d.clear();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    @Override // defpackage.emj
    public final void e(defpackage.emx emxVar) throws afeb {
        defpackage.ajwr ajwrVar = this.b;
        ((defpackage.agtg) ajwrVar.b).c();
        defpackage.agyj agyjVar = (defpackage.agyj) ajwrVar.a;
        agyjVar.c.g();
        for (java.lang.Integer num : agyjVar.b.keySet()) {
            defpackage.ahvr.ca(agyjVar.d.contains(num), "Did not re-register a subscription for @ResId %s. You must re-register all subscriptions you previously had after a configuration change, so that you don't lose user state.", num.intValue());
        }
        ((defpackage.agyj) ajwrVar.a).e.c();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    @Override // defpackage.emj
    public final void f(defpackage.emx emxVar) throws afeb {
        defpackage.ajwr ajwrVar = this.b;
        ((defpackage.agyj) ajwrVar.a).e.d();
        ((defpackage.agtg) ajwrVar.b).d();
    }

    @Override // defpackage.emj
    public final /* synthetic */ void c(defpackage.emx emxVar) {
    }

    @Override // defpackage.emj
    public final /* synthetic */ void fn(defpackage.emx emxVar) {
    }
}
