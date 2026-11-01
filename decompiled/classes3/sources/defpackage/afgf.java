package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class afgf implements ajas {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ ajcq a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ afgf(aeqg aeqgVar, ajcq ajcqVar, ajcq ajcqVar2, aenj aenjVar, int i) {
        this.$cid = i;
        this.c = aeqgVar;
        this.a = ajcqVar;
        this.d = ajcqVar2;
        this.b = aenjVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, java.util.concurrent.Future] */
    public final ajcq a() {
        int i = this.$cid;
        ?? r2 = this.c;
        if (i != 0) {
            aeqg aeqgVar = (aeqg) r2;
            apgu apguVarC = ((aesp) aeqgVar.b.a()).c(((aeqa) aiql.H(this.a)).a(), ((aeqa) aiql.H((java.util.concurrent.Future) this.d)).a());
            if (apguVarC == null) {
                return ajcm.a;
            }
            if ((apguVarC.b & 256) == 0) {
                return ajcm.a;
            }
            java.lang.Object obj = this.b;
            aequ aequVar = aeqgVar.c;
            java.lang.String str = ((aenj) obj).a;
            aeqq aeqqVarA = aeqr.a();
            aeqqVarA.a = str;
            aeqqVarA.c(true);
            aeqqVarA.f(apguVarC);
            aeqqVarA.b = null;
            return aequVar.a(aeqqVarA.a());
        }
        android.net.Uri uri = (android.net.Uri) aiql.H((java.util.concurrent.Future) r2);
        java.util.Set set = (java.util.Set) aiql.H(this.a);
        defpackage.afgj afgjVar = new defpackage.afgj(set);
        java.util.Iterator it = set.iterator();
        while (true) {
            java.lang.Object obj2 = this.b;
            if (!it.hasNext()) {
                java.lang.Object obj3 = this.d;
                ahzh ahzhVarB = ahzh.b(ahwr.a);
                java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(true);
                java.lang.Integer num = (java.lang.Integer) obj3;
                afgk afgkVar = (afgk) obj2;
                ajck ajckVarZ = ajck.w(afgjVar.a).z(num.intValue(), afgkVar.g, (java.util.concurrent.ScheduledExecutorService) null);
                defpackage.adek adekVar = new defpackage.adek(atomicBoolean, 17);
                ajbm ajbmVar = ajbm.a;
                ajck ajckVarU = ajckVarZ.u(java.util.concurrent.TimeoutException.class, adekVar, ajbmVar);
                aiql.I(ajckVarU, new defpackage.afgg(afgkVar, atomicBoolean, set, ahzhVarB, afgjVar, num), ajbmVar);
                return ajckVarU;
            }
            java.lang.String str2 = (java.lang.String) it.next();
            defpackage.afgj afgjVar2 = afgjVar;
            android.content.Intent intent = new android.content.Intent();
            intent.setAction("com.google.android.libraries.storage.protostore.MULTI_APP");
            java.lang.Boolean.FALSE.booleanValue();
            intent.setData(uri);
            intent.setPackage(str2);
            intent.setFlags(268435456);
            afgk afgkVar2 = (afgk) obj2;
            afgkVar2.b.sendOrderedBroadcast(intent, null, afgjVar2, afgkVar2.e, -1, null, null);
            afgjVar = afgjVar2;
        }
    }

    public /* synthetic */ afgf(afgk afgkVar, ajcq ajcqVar, ajcq ajcqVar2, java.lang.Integer num, int i) {
        this.$cid = i;
        this.b = afgkVar;
        this.c = ajcqVar;
        this.a = ajcqVar2;
        this.d = num;
    }
}
