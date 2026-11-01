package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class tle implements defpackage.tlb {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/sharpie/impl/i18n/SharpieLocaleProviderImpl");
    private static final java.util.Locale b;
    private static final java.util.Locale c;
    private static final java.util.Locale d;
    private static final java.util.Locale e;
    private static final java.util.Locale f;
    private static final java.util.Locale g;
    private static final java.util.Locale h;
    private static final java.util.Locale i;
    private static final java.util.Locale j;
    private static final java.util.Locale k;
    private static final java.util.Locale l;
    private static final java.util.Locale m;
    private static final java.util.Locale n;
    private static final java.util.Locale o;
    private static final java.util.Locale p;
    private static final java.util.Locale q;
    private static final java.util.Locale r;
    private static final java.util.Locale s;
    private final android.content.Context t;
    private final defpackage.aoin u;
    private final defpackage.aoin v;
    private final defpackage.aoin w;
    private final defpackage.aoin x;
    private final defpackage.oko y;
    private final defpackage.aonj z;

    static {
        java.util.Locale localeForLanguageTag = java.util.Locale.forLanguageTag("en-US");
        defpackage.aooh.e(localeForLanguageTag, "forLanguageTag(...)");
        b = localeForLanguageTag;
        java.util.Locale localeForLanguageTag2 = java.util.Locale.forLanguageTag("en-GB");
        defpackage.aooh.e(localeForLanguageTag2, "forLanguageTag(...)");
        c = localeForLanguageTag2;
        java.util.Locale localeForLanguageTag3 = java.util.Locale.forLanguageTag("en-CA");
        defpackage.aooh.e(localeForLanguageTag3, "forLanguageTag(...)");
        d = localeForLanguageTag3;
        java.util.Locale localeForLanguageTag4 = java.util.Locale.forLanguageTag("en-IN");
        defpackage.aooh.e(localeForLanguageTag4, "forLanguageTag(...)");
        e = localeForLanguageTag4;
        java.util.Locale localeForLanguageTag5 = java.util.Locale.forLanguageTag("en-AU");
        defpackage.aooh.e(localeForLanguageTag5, "forLanguageTag(...)");
        f = localeForLanguageTag5;
        java.util.Locale localeForLanguageTag6 = java.util.Locale.forLanguageTag("en-SG");
        defpackage.aooh.e(localeForLanguageTag6, "forLanguageTag(...)");
        g = localeForLanguageTag6;
        java.util.Locale localeForLanguageTag7 = java.util.Locale.forLanguageTag("id-ID");
        defpackage.aooh.e(localeForLanguageTag7, "forLanguageTag(...)");
        h = localeForLanguageTag7;
        java.util.Locale localeForLanguageTag8 = java.util.Locale.forLanguageTag("hi-IN");
        defpackage.aooh.e(localeForLanguageTag8, "forLanguageTag(...)");
        i = localeForLanguageTag8;
        java.util.Locale localeForLanguageTag9 = java.util.Locale.forLanguageTag("fr-CA");
        defpackage.aooh.e(localeForLanguageTag9, "forLanguageTag(...)");
        j = localeForLanguageTag9;
        java.util.Locale localeForLanguageTag10 = java.util.Locale.forLanguageTag("en-IE");
        defpackage.aooh.e(localeForLanguageTag10, "forLanguageTag(...)");
        k = localeForLanguageTag10;
        java.util.Locale localeForLanguageTag11 = java.util.Locale.forLanguageTag("ja-JP");
        defpackage.aooh.e(localeForLanguageTag11, "forLanguageTag(...)");
        l = localeForLanguageTag11;
        java.util.Locale localeForLanguageTag12 = java.util.Locale.forLanguageTag("de-DE");
        defpackage.aooh.e(localeForLanguageTag12, "forLanguageTag(...)");
        m = localeForLanguageTag12;
        java.util.Locale localeForLanguageTag13 = java.util.Locale.forLanguageTag("fr-FR");
        defpackage.aooh.e(localeForLanguageTag13, "forLanguageTag(...)");
        n = localeForLanguageTag13;
        java.util.Locale localeForLanguageTag14 = java.util.Locale.forLanguageTag("es-US");
        defpackage.aooh.e(localeForLanguageTag14, "forLanguageTag(...)");
        o = localeForLanguageTag14;
        java.util.Locale localeForLanguageTag15 = java.util.Locale.forLanguageTag("es-ES");
        defpackage.aooh.e(localeForLanguageTag15, "forLanguageTag(...)");
        p = localeForLanguageTag15;
        java.util.Locale localeForLanguageTag16 = java.util.Locale.forLanguageTag("it-IT");
        defpackage.aooh.e(localeForLanguageTag16, "forLanguageTag(...)");
        q = localeForLanguageTag16;
        java.util.Locale localeForLanguageTag17 = java.util.Locale.forLanguageTag("pl-PL");
        defpackage.aooh.e(localeForLanguageTag17, "forLanguageTag(...)");
        r = localeForLanguageTag17;
        java.util.Locale localeForLanguageTag18 = java.util.Locale.forLanguageTag("pt-BR");
        defpackage.aooh.e(localeForLanguageTag18, "forLanguageTag(...)");
        s = localeForLanguageTag18;
    }

    public tle(android.content.Context context, defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3, defpackage.aoin aoinVar4, defpackage.oko okoVar) {
        defpackage.aooh.f(context, "appContext");
        defpackage.aooh.f(aoinVar, "enableSharpieIdP9Plus");
        defpackage.aooh.f(aoinVar2, "enableSharpiePlP9Plus");
        defpackage.aooh.f(aoinVar3, "enableSharpiePtP9Plus");
        defpackage.aooh.f(aoinVar4, "enableSharpieBrP9Plus");
        this.t = context;
        this.u = aoinVar;
        this.v = aoinVar2;
        this.w = aoinVar3;
        this.x = aoinVar4;
        this.y = okoVar;
        this.z = new defpackage.aiuo(new defpackage.edt(this, (defpackage.aoln) null, 5));
    }

    @Override // defpackage.tlb
    public final java.lang.Object a(defpackage.aoln aolnVar) {
        return this.z.a(aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(defpackage.aoln aolnVar) {
        tlc tlcVar;
        if (aolnVar instanceof tlc) {
            tlcVar = (tlc) aolnVar;
            int i2 = tlcVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tlcVar.c = i2 - Integer.MIN_VALUE;
            } else {
                tlcVar = new tlc(this, aolnVar);
            }
        } else {
            tlcVar = new tlc(this, aolnVar);
        }
        java.lang.Object objC = tlcVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i3 = tlcVar.c;
        if (i3 == 0) {
            defpackage.aooc.af(objC);
            java.util.Locale localeAe = defpackage.gus.ae(this.t);
            java.util.Locale.Builder builder = new java.util.Locale.Builder();
            builder.setLanguage(localeAe.getLanguage());
            builder.setRegion(localeAe.getCountry());
            java.util.Locale localeBuild = builder.build();
            defpackage.aooh.e(localeBuild, "build(...)");
            if (defpackage.aooh.n(localeBuild, b) || defpackage.aooh.n(localeBuild, c) || defpackage.aooh.n(localeBuild, f) || defpackage.aooh.n(localeBuild, d) || defpackage.aooh.n(localeBuild, j) || defpackage.aooh.n(localeBuild, e) || defpackage.aooh.n(localeBuild, i) || defpackage.aooh.n(localeBuild, k) || defpackage.aooh.n(localeBuild, q) || defpackage.aooh.n(localeBuild, p) || defpackage.aooh.n(localeBuild, l) || defpackage.aooh.n(localeBuild, m) || defpackage.aooh.n(localeBuild, n) || defpackage.aooh.n(localeBuild, o) || defpackage.aooh.n(localeBuild, g) || defpackage.aooh.n(localeBuild, h) || defpackage.aooh.n(localeBuild, s) || defpackage.aooh.n(localeBuild, r)) {
                ((defpackage.aimw) a.b().l("com/android/dialer/sharpie/impl/i18n/SharpieLocaleProviderImpl", "getLocaleInternal", 44, "SharpieLocaleProviderImpl.kt")).y("using system locale %s for Sharpie", localeBuild.toLanguageTag());
                return localeBuild;
            }
            tlcVar.c = 1;
            objC = c(tlcVar);
            if (objC == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objC);
        }
        java.util.Locale locale = (java.util.Locale) objC;
        ((defpackage.aimw) a.b().l("com/android/dialer/sharpie/impl/i18n/SharpieLocaleProviderImpl", "getLocaleInternal", 49, "SharpieLocaleProviderImpl.kt")).y("using regional locale %s for Sharpie", locale.toLanguageTag());
        return locale;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(defpackage.aoln aolnVar) {
        tld tldVar;
        if (aolnVar instanceof tld) {
            tldVar = (tld) aolnVar;
            int i2 = tldVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tldVar.c = i2 - Integer.MIN_VALUE;
            } else {
                tldVar = new tld(this, aolnVar);
            }
        } else {
            tldVar = new tld(this, aolnVar);
        }
        java.lang.Object objI = tldVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i3 = tldVar.c;
        if (i3 == 0) {
            defpackage.aooc.af(objI);
            defpackage.oko okoVar = this.y;
            tldVar.c = 1;
            objI = okoVar.I(tldVar);
            if (objI == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objI);
        }
        java.lang.String str = (java.lang.String) objI;
        if (str == null) {
            str = "";
        }
        defpackage.akfg akfgVarB = defpackage.akfg.b(str);
        if (akfgVarB == defpackage.akfg.GB) {
            return c;
        }
        if (akfgVarB == defpackage.akfg.AU) {
            return f;
        }
        if (akfgVarB == defpackage.akfg.CA) {
            return d;
        }
        if (akfgVarB == defpackage.akfg.IN) {
            return e;
        }
        if (akfgVarB == defpackage.akfg.IE) {
            return k;
        }
        if (akfgVarB == defpackage.akfg.SG) {
            return g;
        }
        if (((java.lang.Boolean) this.u.a()).booleanValue() && akfgVarB == defpackage.akfg.ID) {
            return h;
        }
        if (akfgVarB == defpackage.akfg.IT) {
            return q;
        }
        if (akfgVarB == defpackage.akfg.JP) {
            return l;
        }
        if (akfgVarB == defpackage.akfg.DE) {
            return m;
        }
        if (akfgVarB == defpackage.akfg.FR) {
            return n;
        }
        if (akfgVarB == defpackage.akfg.MX) {
            return o;
        }
        if (akfgVarB == defpackage.akfg.ES) {
            return p;
        }
        if (((java.lang.Boolean) this.v.a()).booleanValue() && akfgVarB == defpackage.akfg.PL) {
            return r;
        }
        if (((java.lang.Boolean) this.w.a()).booleanValue() && akfgVarB == defpackage.akfg.PT) {
            return s;
        }
        return (((java.lang.Boolean) this.x.a()).booleanValue() && akfgVarB == defpackage.akfg.BR) ? s : b;
    }
}
