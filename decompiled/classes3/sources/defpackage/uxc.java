package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uxc {
    public static final aimz a = aimz.i("com/android/dialer/tts/api/modelavailability/impl/TtsAvailabilityImpl");
    public final android.content.Context b;
    public final aolr c;
    public final aoss d;
    public final afcg e;
    public final aoin f;
    public final aoin g;
    public final rlv h;

    public uxc(android.content.Context context, aolr aolrVar, aoss aossVar, afcg afcgVar, aoin aoinVar, aoin aoinVar2, rlv rlvVar) {
        aooh.f(context, "appContext");
        aooh.f(aolrVar, "lightweightContext");
        aooh.f(aossVar, "backgroundScope");
        aooh.f(aoinVar, "enableAttributionSource");
        aooh.f(aoinVar2, "enableExceptionHandlingFix");
        aooh.f(rlvVar, "loggingBindings");
        this.b = context;
        this.c = aolrVar;
        this.d = aossVar;
        this.e = afcgVar;
        this.f = aoinVar;
        this.g = aoinVar2;
        this.h = rlvVar;
    }

    public static final defpackage.yrn b(java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            defpackage.afcn afcnVar = (defpackage.afcn) it.next();
            int i = afcnVar.b;
            if (i == 7) {
                defpackage.afdk afdkVar = i == 7 ? (defpackage.afdk) afcnVar.c : defpackage.afdk.a;
                aooh.e(afdkVar, "getTtsModelResponse(...)");
                for (defpackage.yrn yrnVar : afdkVar.b) {
                    alat alatVar = yrnVar.c;
                    aooh.e(alatVar, "getVoiceList(...)");
                    if (!(alatVar instanceof java.util.Collection) || !alatVar.isEmpty()) {
                        java.util.Iterator it2 = alatVar.iterator();
                        while (it2.hasNext()) {
                            int iF = defpackage.yqm.f(((defpackage.yrm) it2.next()).b);
                            if (iF == 0) {
                                iF = 1;
                            }
                            if (iF == 14) {
                                return yrnVar;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public final java.lang.Object a(java.util.Locale locale, aoln aolnVar) {
        return aoov.aj(this.c, new defpackage.ufr(this, locale, (aoln) null, 18), aolnVar);
    }
}
