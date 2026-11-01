package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class acjk implements defpackage.acit {
    public static final defpackage.aiof a = defpackage.aiof.i("GnpSdk");
    private static final defpackage.acfb l = new defpackage.acfb();
    public final defpackage.acal b;
    public final java.util.Set c;
    public final defpackage.aoin d;
    public final defpackage.acab e;
    public final defpackage.adao f;
    private final android.content.Context g;
    private final java.lang.String h;
    private final defpackage.aoin i;
    private final defpackage.aolr j;
    private final defpackage.aoss k;

    public acjk(android.content.Context context, java.lang.String str, defpackage.adao adaoVar, defpackage.acal acalVar, defpackage.aoin aoinVar, java.util.Set set, defpackage.aoin aoinVar2, defpackage.acab acabVar, defpackage.aolr aolrVar, defpackage.aoss aossVar, defpackage.aazc aazcVar) {
        if (context == null) {
            defpackage.aooh.i("context");
        }
        if (str == null) {
            defpackage.aooh.i("packageName");
        }
        if (adaoVar == null) {
            defpackage.aooh.i("presentedPromosStore");
        }
        if (acalVar == null) {
            defpackage.aooh.i("clearcutLogger");
        }
        if (aoinVar == null) {
            defpackage.aooh.i("callbacksManager");
        }
        if (aoinVar2 == null) {
            defpackage.aooh.i("promotionSync");
        }
        if (aolrVar == null) {
            defpackage.aooh.i("lightweightContext");
        }
        if (aossVar == null) {
            defpackage.aooh.i("backgroundScope");
        }
        if (aazcVar == null) {
            defpackage.aooh.i("clock");
        }
        this.g = context;
        this.h = str;
        this.f = adaoVar;
        this.b = acalVar;
        this.i = aoinVar;
        this.c = set;
        this.d = aoinVar2;
        this.e = acabVar;
        this.j = aolrVar;
        this.k = aossVar;
    }

    @Override // defpackage.acit
    public final void a(android.app.Activity activity, akij akijVar, android.content.Intent intent) {
        defpackage.aooh.f(activity, "activity");
        if (intent == null) {
            ((defpackage.aiob) a.d()).v("Intent could not be loaded, not launching.");
            return;
        }
        int iOrdinal = akijVar.ordinal();
        if (iOrdinal == 1) {
            try {
                activity.startActivity(intent);
                return;
            } catch (android.content.ActivityNotFoundException e) {
                ((defpackage.aiob) ((defpackage.aiob) a.d()).k(e)).v("Did not find activity to start");
                return;
            }
        }
        if (iOrdinal == 2) {
            activity.startService(intent);
            return;
        }
        if (iOrdinal == 3) {
            activity.sendBroadcast(intent);
            return;
        }
        if (iOrdinal != 4) {
            ((defpackage.aiob) a.d()).y("IntentType %s not yet supported", akijVar.name());
            return;
        }
        try {
            activity.startActivityForResult(intent, 0);
        } catch (android.content.ActivityNotFoundException e2) {
            ((defpackage.aiob) ((defpackage.aiob) a.d()).k(e2)).v("Did not find activity to start");
        }
    }

    @Override // defpackage.acit
    public final boolean b(android.content.Context context, akik akikVar) {
        defpackage.aooh.f(context, "context");
        defpackage.aooh.f(akikVar, "intentTarget");
        akij akijVarB = akij.b(akikVar.g);
        if (akijVarB == null) {
            akijVarB = akij.a;
        }
        if (akij.b != akijVarB && akij.e != akijVarB) {
            return true;
        }
        android.content.Intent intentF = f(akikVar);
        return (intentF == null || intentF.resolveActivityInfo(context.getPackageManager(), intentF.getFlags()) == null) ? false : true;
    }

    @Override // defpackage.acit
    public final /* synthetic */ int c(akjc akjcVar) {
        defpackage.aooh.f(akjcVar, "action");
        akjb akjbVarB = akjb.b(akjcVar.e);
        if (akjbVarB == null) {
            akjbVarB = akjb.a;
        }
        int iOrdinal = akjbVarB.ordinal();
        if (iOrdinal == 1) {
            return 4;
        }
        if (iOrdinal == 2) {
            return 5;
        }
        if (iOrdinal != 3) {
            return iOrdinal != 4 ? 2 : 8;
        }
        return 3;
    }

    @Override // defpackage.acit
    public final void d(com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext, int i) {
        ackw ackwVar;
        akhh akhhVar;
        defpackage.aooh.f(promoContext, "promoContext");
        akhl akhlVarC = promoContext.c();
        j$.time.Instant instantNow = j$.time.Instant.now();
        defpackage.aooh.e(instantNow, "instant(...)");
        defpackage.alcf alcfVarAu = defpackage.aooc.au(instantNow);
        ajyi ajyiVarJ = akky.j(akhi.a.m());
        akhq akhqVar = akhlVarC.c;
        if (akhqVar == null) {
            akhqVar = akhq.a;
        }
        defpackage.aooh.e(akhqVar, "getPromoId(...)");
        ajyiVarJ.g(akhqVar);
        ajyiVarJ.h(i);
        defpackage.xtq xtqVarC = akmr.C(defpackage.alcf.a.m());
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        xtqVarC.am(promoContext.a() / 1000);
        ajyiVarJ.f(xtqVarC.al());
        defpackage.aooh.f(alcfVarAu, "value");
        defpackage.akzx akzxVar = (defpackage.akzx) ajyiVarJ.a;
        akzxVar.u();
        akhi akhiVar = akzxVar.b;
        j$.util.Objects.requireNonNull(alcfVarAu);
        akhiVar.f = alcfVarAu;
        akhiVar.b |= 4;
        aksc akscVarD = promoContext.d();
        if (akscVarD != null && (akhhVar = (akhh) l.d(akscVarD)) != null) {
            akzxVar.u();
            akhi akhiVar2 = akzxVar.b;
            j$.util.Objects.requireNonNull(akhhVar);
            akhiVar2.g = akhhVar;
            akhiVar2.b |= 8;
        }
        akhi akhiVarE = ajyiVarJ.e();
        defpackage.aoss aossVar = this.k;
        defpackage.aoov.an(aossVar, null, 0, new acjj(this, promoContext, akhlVarC, akhiVarE, i, alcfVarAu, (defpackage.aoln) null), 3);
        defpackage.aoov.an(aossVar, null, 0, new xhb(this, akhiVarE, akhlVarC, (defpackage.aoln) null, 12), 3);
        defpackage.ackz ackzVar = (defpackage.ackz) this.i.a();
        if (ackzVar != null) {
            aclc aclcVarV = abxl.v(promoContext);
            int i2 = i - 2;
            if (i2 == 1) {
                ackwVar = ackw.d;
            } else if (i2 == 2) {
                ackwVar = ackw.b;
            } else if (i2 != 3) {
                ackwVar = i2 != 6 ? ackw.a : ackw.e;
            } else {
                ackwVar = ackw.c;
            }
            ackzVar.c(aclcVarV, ackwVar);
        }
    }

    @Override // defpackage.acit
    public final java.lang.Object e(akik akikVar, int i, akjc akjcVar, defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.j, new xla(this, akikVar, 3, akjcVar, (defpackage.aoln) null, 5), aolnVar);
    }

    public final android.content.Intent f(akik akikVar) {
        java.lang.String str;
        android.content.Intent intent;
        java.lang.String str2 = akikVar.e;
        defpackage.aooh.e(str2, "getClassName(...)");
        java.lang.String str3 = akikVar.d;
        defpackage.aooh.e(str3, "getAction(...)");
        java.lang.String str4 = akikVar.c;
        defpackage.aooh.e(str4, "getPackageName(...)");
        if (str4.length() > 0) {
            str = akikVar.c;
        } else {
            str = str3.length() == 0 ? this.h : "";
        }
        defpackage.aooh.c(str);
        if (str2.length() == 0 && str3.length() == 0) {
            intent = this.g.getPackageManager().getLaunchIntentForPackage(str);
            if (intent == null) {
                return null;
            }
        } else {
            intent = new android.content.Intent();
            if (str2.length() > 0) {
                intent.setClassName(str, str2);
            } else if (str.length() > 0) {
                intent.setPackage(str);
            }
            if (str3.length() > 0) {
                intent.setAction(str3);
            }
        }
        java.lang.String str5 = akikVar.f;
        defpackage.aooh.e(str5, "getData(...)");
        if (str5.length() > 0) {
            android.net.Uri uri = android.net.Uri.parse(str5);
            defpackage.aooh.e(uri, "parse(...)");
            intent.setData(uri);
        }
        intent.addFlags(akikVar.i);
        return intent;
    }
}
