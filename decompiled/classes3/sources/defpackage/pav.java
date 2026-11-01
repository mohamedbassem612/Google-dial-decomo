package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pav extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;
    private final amzg g;
    private final amzg h;
    private final amyz i;

    public pav(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6, amzg amzgVar7, amyz amyzVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.pav.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
        this.g = amzs.b(amzgVar6);
        this.h = amzs.b(amzgVar7);
        this.i = amyzVar3;
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        final android.content.Context context = (android.content.Context) list.get(0);
        final boolean zBooleanValue = ((java.lang.Boolean) list.get(1)).booleanValue();
        final java.lang.String str = (java.lang.String) list.get(2);
        final aify aifyVar = (aify) list.get(3);
        final j$.util.Optional optional = (j$.util.Optional) list.get(4);
        final krv krvVar = (krv) list.get(5);
        final defpackage.zpo zpoVar = (defpackage.zpo) list.get(6);
        final amyz amyzVar = this.i;
        return aiql.z(defpackage.uyg.I(new java.util.concurrent.Callable() { // from class: pau
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                if (zBooleanValue) {
                    return j$.util.Optional.empty();
                }
                aify aifyVar2 = aifyVar;
                if (aifyVar2.isEmpty()) {
                    return j$.util.Optional.empty();
                }
                if (zpoVar == defpackage.zpo.l) {
                    return j$.util.Optional.empty();
                }
                java.lang.String str2 = str;
                akzx akzxVarM = defpackage.pat.a.m();
                akzxVarM.u();
                defpackage.pat patVar = (defpackage.pat) akzxVarM.b;
                j$.util.Objects.requireNonNull(str2);
                patVar.b |= 1;
                patVar.c = str2;
                akzxVarM.u();
                defpackage.pat patVar2 = (defpackage.pat) akzxVarM.b;
                alat alatVar = patVar2.d;
                if (!alatVar.c()) {
                    patVar2.d = alad.J(alatVar);
                }
                j$.util.Optional optional2 = optional;
                akyl.i(aifyVar2, patVar2.d);
                j$.util.Objects.requireNonNull(akzxVarM);
                defpackage.oys oysVar = new defpackage.oys(akzxVarM, 8);
                if (true == optional2.isPresent()) {
                    java.lang.String str3 = (java.lang.String) optional2.get();
                    akzx akzxVar = (akzx) oysVar.a;
                    akzxVar.u();
                    defpackage.pat patVar3 = (defpackage.pat) akzxVar.b;
                    j$.util.Objects.requireNonNull(str3);
                    patVar3.b |= 2;
                    patVar3.e = str3;
                }
                aoin aoinVar = amyzVar;
                android.content.Context context2 = context;
                ((java.util.concurrent.atomic.AtomicReference) krvVar.b).set((defpackage.pat) akzxVarM.p());
                defpackage.oug ougVarA = defpackage.oui.a();
                ougVarA.f(defpackage.ouj.REPLY_WITH_SMS);
                ougVarA.d(2131231435);
                ougVarA.e(context2.getString(2132017669));
                if (((java.lang.Boolean) aoinVar.a()).booleanValue()) {
                    ougVarA.a = j$.util.Optional.of(context2.getString(2132017670));
                }
                return j$.util.Optional.of(ougVarA.a());
            }
        }));
    }

    protected final ajcq c() {
        amzg amzgVar = this.h;
        amzg amzgVar2 = this.g;
        amzg amzgVar3 = this.f;
        amzg amzgVar4 = this.e;
        amzg amzgVar5 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar5.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
