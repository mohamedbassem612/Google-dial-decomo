package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class iwc {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/beesly/impl/locale/BeeslySingletonLocaleProvider");
    public final android.content.Context b;
    public final defpackage.aoin c;
    public final defpackage.aoin d;
    public final defpackage.aoin e;
    public final defpackage.aoin f;
    public final defpackage.aoin g;
    public final defpackage.iqm h;
    public final defpackage.aoir i;
    private final defpackage.aoin j;
    private final defpackage.aoin k;
    private final defpackage.aoin l;
    private final defpackage.oru m;

    public iwc(android.content.Context context, defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3, defpackage.aoin aoinVar4, defpackage.aoin aoinVar5, defpackage.aoin aoinVar6, defpackage.aoin aoinVar7, defpackage.aoin aoinVar8, defpackage.oru oruVar, defpackage.iqm iqmVar) {
        defpackage.aooh.f(context, "appContext");
        defpackage.aooh.f(aoinVar, "isUserInUs");
        defpackage.aooh.f(aoinVar2, "isUserInUk");
        defpackage.aooh.f(aoinVar3, "isUserInCa");
        defpackage.aooh.f(aoinVar4, "isUserInIe");
        defpackage.aooh.f(aoinVar5, "isUserInAu");
        defpackage.aooh.f(aoinVar6, "isUserInIn");
        defpackage.aooh.f(aoinVar7, "isOemUserInIn");
        defpackage.aooh.f(aoinVar8, "isUserInFrCa");
        this.b = context;
        this.c = aoinVar;
        this.d = aoinVar2;
        this.e = aoinVar3;
        this.f = aoinVar4;
        this.g = aoinVar5;
        this.j = aoinVar6;
        this.k = aoinVar7;
        this.l = aoinVar8;
        this.m = oruVar;
        this.h = iqmVar;
        this.i = defpackage.aooc.ag(new defpackage.gpg(this, 18));
    }

    public static final java.lang.String b(java.util.Locale locale) {
        java.lang.String languageTag = new java.util.Locale.Builder().setLanguage(locale.getLanguage()).setRegion(locale.getCountry()).build().toLanguageTag();
        defpackage.aooh.e(languageTag, "toLanguageTag(...)");
        return languageTag;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(defpackage.aoln aolnVar) {
        iwb iwbVar;
        java.lang.String str;
        if (aolnVar instanceof iwb) {
            iwbVar = (iwb) aolnVar;
            int i = iwbVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                iwbVar.c = i - Integer.MIN_VALUE;
            } else {
                iwbVar = new iwb(this, aolnVar);
            }
        } else {
            iwbVar = new iwb(this, aolnVar);
        }
        java.lang.Object objA = iwbVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = iwbVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objA);
            java.util.Locale localeAe = defpackage.gus.ae(this.b);
            defpackage.aooh.e(localeAe, "getLocale(...)");
            java.lang.String strB = b(localeAe);
            if (((java.lang.Boolean) this.j.a()).booleanValue() || ((java.lang.Boolean) this.k.a()).booleanValue()) {
                return !defpackage.aooh.n(strB, "hi-IN") ? "en-IN" : "hi-IN";
            }
            if (((java.lang.Boolean) this.l.a()).booleanValue()) {
                return "fr-CA";
            }
            defpackage.oru oruVar = this.m;
            iwbVar.c = 1;
            objA = oruVar.a(iwbVar);
            if (objA == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objA);
        }
        orr orrVar = (orr) objA;
        return (orrVar == null || (str = orrVar.B) == null) ? "en-US" : str;
    }
}
