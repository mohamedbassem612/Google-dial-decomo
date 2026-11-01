package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acjf implements defpackage.acip, defpackage.aciq {
    public final aolr d;
    public final acbd e;
    public final acal f;
    public final acit g;
    public final adye h;
    private final aoin k;
    public static final aiof a = aiof.i("GnpSdk");
    private static final java.util.Set i = new java.util.LinkedHashSet();
    public static final java.util.Map b = new java.util.LinkedHashMap();
    public static final java.util.Map c = new java.util.LinkedHashMap();
    private static final java.util.Map j = new java.util.LinkedHashMap();

    public acjf(aolr aolrVar, aolr aolrVar2, java.lang.String str, acbd acbdVar, acal acalVar, acit acitVar, aoin aoinVar, adye adyeVar, aoin aoinVar2) {
        aooh.f(aolrVar, "backgroundContext");
        aooh.f(aolrVar2, "mainContext");
        aooh.f(str, "packageName");
        aooh.f(acbdVar, "promoEvalLogger");
        aooh.f(acalVar, "clearcutLogger");
        aooh.f(acitVar, "userActionUtil");
        aooh.f(aoinVar, "callbackManager");
        aooh.f(adyeVar, "gnpRasta");
        aooh.f(aoinVar2, "gnpInAppUiViewModel");
        this.d = aolrVar;
        this.e = acbdVar;
        this.f = acalVar;
        this.g = acitVar;
        this.k = aoinVar;
        this.h = adyeVar;
    }

    @Override // defpackage.acip
    public final java.lang.Object a(com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext, defpackage.acir acirVar, aoln aolnVar) {
        java.lang.Object objAj = aoov.aj(this.d, new defpackage.acje(promoContext, this, acirVar, null), aolnVar);
        return objAj != aolu.a ? aojh.a : objAj;
    }

    @Override // defpackage.acip
    public final java.lang.Object b(com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext, int i2, aoln aolnVar) {
        java.lang.Object objAj = aoov.aj(this.d, new defpackage.acjd(i2, this, promoContext, null), aolnVar);
        return objAj != aolu.a ? aojh.a : objAj;
    }

    @Override // defpackage.aciq
    public final void c(com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext, defpackage.akkc akkcVar, az azVar) {
        aooh.f(promoContext, "promoContext");
        akhq akhqVar = promoContext.c().c;
        if (akhqVar == null) {
            akhqVar = akhq.a;
        }
        java.lang.String strR = defpackage.abxl.r(akhqVar);
        b.put(strR, akkcVar);
        c.put(strR, azVar);
        j.put(strR, promoContext);
        java.util.Set set = i;
        aooh.c(strR);
        set.add(strR);
        if (anfq.a.b().c()) {
            azVar.P().c(new acjb(this, promoContext, 0));
        }
    }

    @Override // defpackage.aciq
    public final void d(com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext) {
        aooh.f(promoContext, "promoContext");
        akhq akhqVar = promoContext.c().c;
        if (akhqVar == null) {
            akhqVar = akhq.a;
        }
        java.lang.String strR = defpackage.abxl.r(akhqVar);
        i.remove(strR);
        b.remove(strR);
        c.remove(strR);
        j.remove(strR);
    }

    @Override // defpackage.aciq
    public final boolean e() {
        return ajsz.ci(i);
    }

    public final void f(com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext, defpackage.acir acirVar) {
        ackz ackzVar = (ackz) this.k.a();
        if (ackzVar == null) {
            a.d().v("Can't report an impression to collaborator as no callback was provided");
            return;
        }
        defpackage.abxl.v(promoContext);
        if (acirVar != defpackage.acir.a) {
            ackzVar.d(acirVar.toString());
        }
    }
}
