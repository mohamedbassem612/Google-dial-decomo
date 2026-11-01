package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class lcx {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/callscreen/impl/flags/Flags");
    private final defpackage.lbw b;
    private final defpackage.oko c;
    private final defpackage.aoin d;
    private final defpackage.aoin e;
    private final defpackage.aoin f;
    private final defpackage.aoin g;

    public lcx(defpackage.lbw lbwVar, defpackage.oko okoVar, defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3, defpackage.aoin aoinVar4) {
        this.b = lbwVar;
        this.c = okoVar;
        this.d = aoinVar;
        this.e = aoinVar2;
        this.f = aoinVar3;
        this.g = aoinVar4;
    }

    private final j$.util.Optional e(defpackage.akff akffVar) {
        defpackage.oko okoVar = this.c;
        if (!okoVar.z().isPresent()) {
            return j$.util.Optional.empty();
        }
        java.lang.String str = (java.lang.String) okoVar.z().orElseThrow(new iaz(7));
        if (str.isEmpty()) {
            return j$.util.Optional.empty();
        }
        defpackage.ypq ypqVar = (defpackage.ypq) this.e.a();
        j$.util.Objects.requireNonNull(str);
        ypr yprVar = (ypr) ypqVar.b.get(str);
        if (yprVar == null) {
            yprVar = null;
        }
        defpackage.aimz aimzVar = a;
        if (yprVar == null) {
            ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/callscreen/impl/flags/Flags", "modelForLanguage", 139, "Flags.java")).y("simCountry %s is not supported", str);
            return j$.util.Optional.empty();
        }
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/callscreen/impl/flags/Flags", "modelForLanguage", 143, "Flags.java")).y("found countryConfig for %s", str);
        if (akffVar.e()) {
            ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/callscreen/impl/flags/Flags", "modelForLanguage", 175, "Flags.java")).y("%s is unknown language", akffVar);
            return j$.util.Optional.empty();
        }
        java.util.Map mapUnmodifiableMap = j$.util.DesugarCollections.unmodifiableMap(yprVar.b);
        for (defpackage.akff akffVar2 = akffVar; akffVar2 != null; akffVar2 = akffVar2.r) {
            defpackage.ypo ypoVar = (defpackage.ypo) mapUnmodifiableMap.get(akffVar2.q);
            if (ypoVar != null) {
                defpackage.aify aifyVarN = defpackage.aify.n(new defpackage.alam(ypoVar.c, defpackage.ypo.a));
                ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/callscreen/impl/flags/Flags", "modelForLanguage", 188, "Flags.java")).I("language: %s using ASR models: %s", akffVar2, aifyVarN);
                return j$.util.Optional.of(aifyVarN);
            }
        }
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/callscreen/impl/flags/Flags", "modelForLanguage", 194, "Flags.java")).y("no configuration for %s or its parents", akffVar);
        return j$.util.Optional.empty();
    }

    public final defpackage.aify a(j$.util.Optional optional) {
        if (!optional.isPresent()) {
            return defpackage.aike.a;
        }
        if (!this.b.a() && !((java.lang.Boolean) this.g.a()).booleanValue()) {
            if (!((defpackage.akff) optional.orElseThrow()).c().equals(defpackage.akff.d.c())) {
                return defpackage.aike.a;
            }
            java.lang.Object[] objArr = {defpackage.ypm.WHISPER};
            defpackage.ahvr.ay(objArr, 1);
            return new defpackage.aike(objArr, 1);
        }
        defpackage.aoin aoinVar = this.f;
        if (((defpackage.ypo) aoinVar.a()).c.size() > 0) {
            return defpackage.aify.n(new defpackage.alam(((defpackage.ypo) aoinVar.a()).c, defpackage.ypo.a));
        }
        j$.util.Optional optionalE = e((defpackage.akff) optional.orElseThrow());
        if (optionalE.isPresent()) {
            return (defpackage.aify) optionalE.orElseThrow();
        }
        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.d()).i(defpackage.zct.b)).l("com/android/dialer/callscreen/impl/flags/Flags", "overallModelPreference", 'q', "Flags.java")).y("No AsrModelPreference for language: %s", optional);
        return defpackage.aike.a;
    }

    public final j$.util.Optional b() {
        defpackage.oko okoVar = this.c;
        if (!okoVar.z().isPresent()) {
            return j$.util.Optional.empty();
        }
        java.lang.String str = (java.lang.String) okoVar.z().orElseThrow(new iaz(7));
        defpackage.ypq ypqVar = (defpackage.ypq) this.e.a();
        j$.util.Objects.requireNonNull(str);
        ypr yprVar = (ypr) ypqVar.b.get(str);
        if (yprVar == null) {
            yprVar = null;
        }
        if (yprVar == null) {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/callscreen/impl/flags/Flags", "getSupportedLanguage", 211, "Flags.java")).y("simCountry %s is not supported", str);
            return j$.util.Optional.empty();
        }
        java.util.Iterator it = j$.util.DesugarCollections.unmodifiableMap(yprVar.b).keySet().iterator();
        return it.hasNext() ? j$.util.Optional.of(defpackage.akff.a((java.lang.String) it.next())) : j$.util.Optional.empty();
    }

    public final j$.util.Optional c() {
        return !this.b.a() ? j$.util.Optional.empty() : j$.util.Optional.of((defpackage.acve) this.d.a());
    }

    public final boolean d(defpackage.akff akffVar) {
        if (this.b.a()) {
            return e(akffVar).isPresent();
        }
        return false;
    }
}
