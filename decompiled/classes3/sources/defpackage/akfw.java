package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akfw {
    private static defpackage.akfw c;
    public final defpackage.akfx b = defpackage.akfx.h();
    public final defpackage.akgf a = new defpackage.akgf(apdi.f().a);

    public static synchronized defpackage.akfw a() {
        defpackage.akfw akfwVar;
        akfwVar = c;
        if (akfwVar == null) {
            apdi.f();
            akfwVar = new defpackage.akfw();
            c = akfwVar;
        }
        return akfwVar;
    }

    private static final java.lang.String c(akfg akfgVar, java.util.Locale locale) {
        return (akfgVar == null || akfgVar.equals(akfg.eq) || akfgVar.equals(defpackage.akgb.a)) ? "" : new java.util.Locale("", akfgVar.eW).getDisplayCountry(locale);
    }

    public final java.lang.String b(defpackage.akgu akguVar, java.util.Locale locale) {
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(akguVar.c);
        defpackage.akfx akfxVar = this.b;
        java.util.List<akfg> list = (java.util.List) akfxVar.i.get(numValueOf);
        if (list == null) {
            list = java.util.Collections.EMPTY_LIST;
        }
        if (list.size() == 1) {
            return c((akfg) list.get(0), locale);
        }
        akfg akfgVar = akfg.eq;
        akfg akfgVar2 = akfgVar;
        for (akfg akfgVar3 : list) {
            if (akfxVar.r(akguVar, akfgVar3)) {
                if (akfgVar2 != akfgVar) {
                    return "";
                }
                akfgVar2 = akfgVar3;
            }
        }
        return c(akfgVar2, locale);
    }
}
