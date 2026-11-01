package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aejd extends kh {
    public final defpackage.aehm a;
    public final ahyn e;
    public java.lang.Object f;
    public aify g;
    private final defpackage.aeit h;
    private final defpackage.aelt i;
    private final aeis j;
    private final int l;
    private final defpackage.wsk m;
    private final defpackage.alln n;
    private final java.util.List k = new java.util.ArrayList();
    private final aehj o = new defpackage.aejb(this);

    public aejd(defpackage.aeiy aeiyVar, defpackage.aeix aeixVar, defpackage.alfm alfmVar, defpackage.aelt aeltVar, int i, aeis aeisVar) {
        defpackage.wsk wskVar = aeiyVar.e;
        ahvr.ci(wskVar);
        this.m = wskVar;
        defpackage.aehm aehmVar = aeiyVar.a;
        ahvr.ci(aehmVar);
        this.a = aehmVar;
        defpackage.aeit aeitVar = aeiyVar.b;
        ahvr.ci(aeitVar);
        this.h = aeitVar;
        this.e = aeiyVar.d;
        this.i = aeltVar;
        this.j = aeisVar;
        defpackage.aele aeleVar = aeiyVar.c;
        ahvr.ci(aeleVar);
        ahvr.ci(alfmVar);
        this.n = new defpackage.alln(aeitVar, aeleVar, alfmVar, aeltVar, new defpackage.aeja(aeixVar));
        this.l = i;
    }

    public final int a() {
        return this.k.size();
    }

    public final /* bridge */ /* synthetic */ ld d(android.view.ViewGroup viewGroup, int i) {
        return new defpackage.aeiw(viewGroup, this.a, this.m, this.e, this.j, this.l, this.i);
    }

    public final void l(android.support.v7.widget.RecyclerView recyclerView) {
        aeiv aeivVar = this.h;
        aeivVar.b(this.o);
        this.f = aeivVar.a();
        this.g = aify.n(aeivVar.d());
        ahyn ahynVar = this.j.a;
        w();
    }

    public final /* synthetic */ void m(ld ldVar, int i) {
        defpackage.aeiw aeiwVar = (defpackage.aeiw) ldVar;
        java.lang.Object obj = this.k.get(i);
        defpackage.wgf wgfVar = new defpackage.wgf(this.n, obj, 5);
        com.google.android.libraries.onegoogle.account.particle.AccountParticle accountParticle = aeiwVar.s;
        accountParticle.m = true;
        accountParticle.b(aeiwVar.v);
        aeiwVar.w = obj;
        accountParticle.n.i(obj, new defpackage.aejw(aeiwVar, 1));
        ahyn ahynVar = aeiwVar.t;
        accountParticle.setOnClickListener(wgfVar);
        accountParticle.k.setAlpha(1.0f);
        accountParticle.l.setAlpha(1.0f);
        com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc accountParticleDisc = accountParticle.j;
        accountParticleDisc.setAlpha(1.0f);
        accountParticleDisc.a.setColorFilter(null);
        accountParticle.findViewById(2131428597).setVisibility(8);
        ahyn ahynVar2 = aeiwVar.u;
    }

    public final void n(android.support.v7.widget.RecyclerView recyclerView) {
        this.h.c(this.o);
        ahyn ahynVar = this.j.a;
        this.k.clear();
    }

    public final /* bridge */ /* synthetic */ void q(ld ldVar) {
        defpackage.aeiw aeiwVar = (defpackage.aeiw) ldVar;
        com.google.android.libraries.onegoogle.account.particle.AccountParticle accountParticle = aeiwVar.s;
        accountParticle.d(aeiwVar.v);
        accountParticle.m = false;
        ahyn ahynVar = aeiwVar.u;
    }

    public final void w() {
        afec.c();
        java.util.List list = this.k;
        java.util.ArrayList arrayList = new java.util.ArrayList(list);
        ahyn ahynVar = this.j.a;
        java.util.ArrayList arrayList2 = new java.util.ArrayList((java.util.Collection) this.g);
        java.lang.Object obj = this.f;
        if (obj != null) {
            arrayList2.remove(obj);
        }
        es esVarA = ev.a(new defpackage.aejc(this, arrayList, arrayList2));
        list.clear();
        list.addAll(arrayList2);
        esVarA.c(this);
    }
}
