package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class umc implements agye {
    final /* synthetic */ defpackage.umd a;

    public umc(defpackage.umd umdVar) {
        this.a = umdVar;
    }

    public final void a(java.lang.Throwable th) {
        aooh.f(th, "cause");
        defpackage.umd.a.c().i(zct.b).k(th).l("com/android/dialer/spamnotification/impl/ui/SpamNotificationFragmentPeer$subscriptionCallback$<anonymous>", "onError", 80, "SpamNotificationFragmentPeer.kt").v("Error fetching fragment model");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) throws aois {
        defpackage.uks uksVar = (defpackage.uks) obj;
        aooh.f(uksVar, "data");
        defpackage.umd.a.b().l("com/android/dialer/spamnotification/impl/ui/SpamNotificationFragmentPeer", "updateModel", 158, "SpamNotificationFragmentPeer.kt").y("newModel: %s", uksVar.getClass());
        final defpackage.umd umdVar = this.a;
        umdVar.g = uksVar;
        if (uksVar instanceof defpackage.ukp) {
            umdVar.b(rmw.s);
            defpackage.vqu vquVarBO = wsc.bO(defpackage.ult.a.m());
            defpackage.ujd ujdVar = ((defpackage.ukp) uksVar).a;
            aooh.f(ujdVar, "value");
            akzx akzxVar = (akzx) vquVarBO.a;
            akzxVar.u();
            defpackage.ult ultVar = (defpackage.ult) akzxVar.b;
            j$.util.Objects.requireNonNull(ujdVar);
            ultVar.c = ujdVar;
            ultVar.b = 2;
            umdVar.c(vquVarBO.R());
            return;
        }
        if (uksVar instanceof defpackage.ukq) {
            umdVar.b(rmw.r);
            defpackage.vqu vquVarBO2 = wsc.bO(defpackage.ult.a.m());
            defpackage.uki ukiVar = ((defpackage.ukq) uksVar).a;
            aooh.f(ukiVar, "value");
            akzx akzxVar2 = (akzx) vquVarBO2.a;
            akzxVar2.u();
            defpackage.ult ultVar2 = (defpackage.ult) akzxVar2.b;
            j$.util.Objects.requireNonNull(ukiVar);
            ultVar2.c = ukiVar;
            ultVar2.b = 1;
            umdVar.c(vquVarBO2.R());
            return;
        }
        if (uksVar instanceof defpackage.ukr) {
            boolean z = ((defpackage.ukr) uksVar).a;
            defpackage.uhp uhpVar = umdVar.f;
            android.widget.Toast.makeText(uhpVar.a, z ? uhpVar.a.getString(2132020220) : uhpVar.a.getString(2132020221), 1).show();
        } else if (uksVar instanceof defpackage.ukn) {
            umdVar.b(rmw.t);
            umdVar.d(((defpackage.ukn) uksVar).a);
        } else if (aooh.n(uksVar, defpackage.uko.a)) {
            umdVar.d.H().finish();
        } else if (aooh.n(uksVar, defpackage.uko.c)) {
            umdVar.f.d(umdVar.d.I(), new defpackage.uhn() { // from class: uma
                @Override // defpackage.uhn
                public final void a() {
                    defpackage.ujp.a.b().l("com/android/dialer/spamnotification/impl/service/SpamFragmentControllerImpl", "enableSpamBlockingSetting", 53, "SpamFragmentControllerImpl.kt").v("enter");
                    aimz aimzVar = zih.a;
                    aolr aolrVarPlus = zih.b.plus(aols.a);
                    defpackage.ujp ujpVar = umdVar.i;
                    aoov.al(ujpVar.d, aolrVarPlus, 1, new defpackage.uke((aoln) null, ujpVar, 1));
                }
            }, new nwi(umdVar, 2));
        } else if (!aooh.n(uksVar, defpackage.uko.b)) {
            throw new aois();
        }
    }

    public final /* synthetic */ void c() {
    }
}
