package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class oru {
    private static final defpackage.aimz b = defpackage.aimz.i("com/android/dialer/i18n/disclaimer/DisclaimerLocaleResolver");
    public final defpackage.oko a;
    private final android.content.Context c;
    private final defpackage.aoir d;
    private final defpackage.aoir e;
    private final defpackage.aonj f;

    public oru(android.content.Context context, defpackage.oko okoVar) {
        defpackage.aooh.f(context, "appContext");
        this.c = context;
        this.a = okoVar;
        this.d = defpackage.aooc.ag(new defpackage.uoa(1));
        this.e = defpackage.aooc.ag(new defpackage.ors());
        j$.time.Duration durationO = defpackage.aiql.O(15);
        defpackage.edt edtVar = new defpackage.edt(this, (defpackage.aoln) null, 4);
        defpackage.ahzp ahzpVar = defpackage.ahzp.a;
        if (durationO == null) {
            defpackage.aooh.i("duration");
            defpackage.aooh.i("<this>");
        }
        long jB = defpackage.aizo.b(durationO);
        if (jB <= 0) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bg(durationO, "Duration (", ") must be positive."));
        }
        this.f = new defpackage.aiuq(edtVar, jB);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(defpackage.aoln aolnVar) {
        ort ortVar;
        java.lang.String lowerCase;
        if (aolnVar instanceof ort) {
            ortVar = (ort) aolnVar;
            int i = ortVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ortVar.c = i - Integer.MIN_VALUE;
            } else {
                ortVar = new ort(this, aolnVar);
            }
        } else {
            ortVar = new ort(this, aolnVar);
        }
        java.lang.Object objA = ortVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = ortVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objA);
            defpackage.aonj aonjVar = this.f;
            ortVar.c = 1;
            objA = aonjVar.a(ortVar);
            if (objA == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objA);
        }
        java.lang.String str = (java.lang.String) objA;
        java.lang.Object obj = null;
        if (str != null) {
            lowerCase = str.toLowerCase(java.util.Locale.ROOT);
            defpackage.aooh.e(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = null;
        }
        if (lowerCase == null) {
            ((defpackage.aimw) b.d().l("com/android/dialer/i18n/disclaimer/DisclaimerLocaleResolver", "getDisclaimerLocale", 123, "DisclaimerLocaleResolver.kt")).v("networkCountryIso is null");
            return null;
        }
        java.util.List list = (java.util.List) ((java.util.Map) this.e.a()).get(lowerCase);
        if (list == null || list.isEmpty()) {
            ((defpackage.aimw) b.b().l("com/android/dialer/i18n/disclaimer/DisclaimerLocaleResolver", "getDisclaimerLocale", 129, "DisclaimerLocaleResolver.kt")).y("No disclaimer locale found for countryIso: %s", lowerCase);
            return null;
        }
        java.lang.String language = defpackage.gus.ae(this.c).getLanguage();
        defpackage.aooh.e(language, "getLanguage(...)");
        for (java.lang.Object obj2 : list) {
            if (defpackage.aooh.n(((java.util.Map) this.d.a()).get((orr) obj2), language)) {
                obj = obj2;
                break;
            }
        }
        orr orrVar = (orr) obj;
        return orrVar == null ? (orr) defpackage.ajsz.bE(list) : orrVar;
    }
}
