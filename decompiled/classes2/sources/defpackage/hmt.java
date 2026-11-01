package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hmt implements defpackage.hqr {
    public final defpackage.hqe a;
    public final ahpz b;
    public final rlv c;
    public final gpd d;
    public final rai e;
    private final android.content.Context f;

    public hmt(android.content.Context context, rai raiVar, defpackage.hqe hqeVar, ahpz ahpzVar, rlv rlvVar, gpd gpdVar) {
        aooh.f(context, "appContext");
        aooh.f(raiVar, "contactNumberScreenFactory");
        aooh.f(ahpzVar, "traceCreation");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        this.f = context;
        this.e = raiVar;
        this.a = hqeVar;
        this.b = ahpzVar;
        this.c = rlvVar;
        this.d = gpdVar;
    }

    @Override // defpackage.hqw
    public final defpackage.ze a() {
        defpackage.ys ysVar = new defpackage.ys();
        ysVar.b();
        return ysVar.a();
    }

    @Override // defpackage.hqr
    public final /* synthetic */ java.lang.Object b(java.lang.Object obj, defpackage.tt ttVar, aoln aolnVar) {
        java.lang.Object objA;
        java.lang.String str;
        java.lang.String string;
        java.util.List<defpackage.hmg> list = (java.util.List) obj;
        if (list.isEmpty()) {
            objA = new defpackage.xo(androidx.car.app.model.CarText.create(dvx.e(this.f, 2132018538))).a();
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(list, 10));
            for (defpackage.hmg hmgVar : list) {
                java.lang.String str2 = hmgVar.c;
                if (str2.length() == 0) {
                    defpackage.hmu hmuVar = (defpackage.hmu) ajsz.bG(hmgVar.b);
                    str = hmuVar != null ? hmuVar.c : null;
                    if (str == null) {
                        str = "";
                    }
                } else {
                    str = str2;
                }
                defpackage.yh yhVar = new defpackage.yh();
                yhVar.f(str);
                akzx akzxVarM = abwd.a.m();
                akzxVarM.u();
                abwd abwdVar = akzxVarM.b;
                j$.util.Objects.requireNonNull(str2);
                abwdVar.b |= 1;
                abwdVar.c = str2;
                java.lang.String str3 = hmgVar.e;
                akzxVarM.u();
                abwd abwdVar2 = akzxVarM.b;
                j$.util.Objects.requireNonNull(str3);
                abwdVar2.b |= 4;
                abwdVar2.e = str3;
                long j = hmgVar.d;
                akzxVarM.u();
                abwd abwdVar3 = akzxVarM.b;
                abwdVar3.b |= 8;
                abwdVar3.f = j;
                android.net.Uri lookupUri = android.provider.ContactsContract.Contacts.getLookupUri(hmgVar.a, hmgVar.f);
                if (lookupUri != null && (string = lookupUri.toString()) != null) {
                    akzxVarM.u();
                    abwd abwdVar4 = akzxVarM.b;
                    j$.util.Objects.requireNonNull(string);
                    abwdVar4.b |= 16;
                    abwdVar4.g = string;
                }
                abwd abwdVarP = akzxVarM.p();
                aooh.e(abwdVarP, "build(...)");
                aimz aimzVar = com.android.dialer.androidauto.impl.caricons.CarIconContentProvider.a;
                int i = 2;
                yhVar.d(kcq.M(ttVar, abwdVarP, ttVar.getResources().getDimensionPixelSize(2131167329), ttVar.getResources().getDimensionPixelSize(2131167329)), 2);
                if (hmgVar.b.size() == 1) {
                    defpackage.vw vwVar = new defpackage.vw();
                    vwVar.c(new androidx.car.app.model.CarIcon(new defpackage.wj(androidx.core.graphics.drawable.IconCompat.g(this.f, 2131231340))));
                    vwVar.d(new defpackage.hms(this, hmgVar, ttVar, 0));
                    yhVar.b(vwVar.a());
                }
                yhVar.e(new defpackage.hms(this, hmgVar, ttVar, i));
                arrayList.add(yhVar.a());
            }
            defpackage.ys ysVar = new defpackage.ys();
            defpackage.yi yiVar = new defpackage.yi();
            yiVar.d = arrayList;
            ysVar.a = ajsz.aY(yiVar.a());
            ysVar.f = true;
            objA = ysVar.a();
        }
        this.d.i((java.lang.String) null).b(mce.gw);
        return objA;
    }

    @Override // defpackage.hqw
    public final /* synthetic */ aoxh c(aoxh aoxhVar, defpackage.tt ttVar) {
        return defpackage.hhv.a(this, aoxhVar, ttVar);
    }
}
