package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class srv implements defpackage.sqn {
    private static final defpackage.aimz c = defpackage.aimz.i("com/android/dialer/phonelookup/geolocation/GeoLocationPhoneLookupContributor");
    public final defpackage.ajct a;
    public final defpackage.rsr b;
    private final j$.util.Optional d;

    public srv(j$.util.Optional optional, defpackage.ajct ajctVar, defpackage.rsr rsrVar) {
        this.d = optional;
        this.a = ajctVar;
        this.b = rsrVar;
    }

    public static final spj i(defpackage.ssm ssmVar, hkd hkdVar) {
        java.lang.String str = hkdVar.c;
        java.lang.String str2 = hkdVar.d;
        defpackage.aimz aimzVar = c;
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/phonelookup/geolocation/GeoLocationPhoneLookupContributor", "getGeoLocationLookupInfo", 94, "GeoLocationPhoneLookupContributor.java")).y("normalizedNumber: %s", defpackage.aais.aC(str));
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/phonelookup/geolocation/GeoLocationPhoneLookupContributor", "getGeoLocationLookupInfo", 95, "GeoLocationPhoneLookupContributor.java")).y("countryIso: %s", defpackage.aais.aD(str2));
        java.lang.String strA = ssmVar.a(str, str2);
        if (strA == null) {
            ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/phonelookup/geolocation/GeoLocationPhoneLookupContributor", "getGeoLocationLookupInfo", 99, "GeoLocationPhoneLookupContributor.java")).v("default instance returned");
            return spj.a;
        }
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/phonelookup/geolocation/GeoLocationPhoneLookupContributor", "getGeoLocationLookupInfo", 102, "GeoLocationPhoneLookupContributor.java")).y("geoDescription set: %s", defpackage.aais.aD(strA));
        defpackage.akzx akzxVarM = spj.a.m();
        akzxVarM.u();
        spj spjVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(strA);
        spjVar.b |= 1;
        spjVar.c = strA;
        return akzxVarM.r();
    }

    @Override // defpackage.sqn
    public final defpackage.ajcq a(defpackage.aigf aigfVar) {
        java.lang.Object ajcmVar;
        defpackage.srt srtVar = new defpackage.srt(this, aigfVar);
        j$.util.Optional optional = this.d;
        optional.isPresent();
        defpackage.srv srvVar = srtVar.a;
        defpackage.aigf aigfVar2 = srtVar.b;
        java.lang.Object obj = optional.get();
        defpackage.ajcq ajcqVarY = srvVar.b.Y();
        defpackage.rml rmlVar = new defpackage.rml(srvVar, aigfVar2, obj, 4);
        long j = defpackage.ahqx.a;
        defpackage.ahqv ahqvVar = new defpackage.ahqv(defpackage.ahns.c(false), rmlVar);
        int i = defpackage.ajan.c;
        defpackage.ajct ajctVar = srvVar.a;
        defpackage.ajam ajamVar = new defpackage.ajam(ajcqVarY, ahqvVar);
        ajcqVarY.c(ajamVar, defpackage.aiql.t(ajctVar, ajamVar));
        j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(ajamVar);
        defpackage.sru sruVar = new defpackage.sru(aigfVar);
        if (true != optionalOfNullable.isPresent()) {
            defpackage.aigf aigfVar3 = sruVar.a;
            ajcmVar = aigfVar3 == null ? defpackage.ajcm.a : new defpackage.ajcm(aigfVar3);
        } else {
            ajcmVar = optionalOfNullable.get();
        }
        return (defpackage.ajcq) ajcmVar;
    }

    @Override // defpackage.sqn
    public final defpackage.ajcq b(defpackage.aihd aihdVar) {
        return defpackage.aiql.z(java.lang.Boolean.FALSE);
    }

    @Override // defpackage.sqn
    public final defpackage.ajcq c(hkd hkdVar) {
        idc idcVar = new idc(this, hkdVar, 10, (byte[]) null);
        j$.util.Optional optional = this.d;
        optional.isPresent();
        j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(((defpackage.srv) idcVar.b).a.submit(defpackage.ahqx.i(new qfb(optional.get(), idcVar.a, 19, (byte[]) null))));
        return (defpackage.ajcq) (true != optionalOfNullable.isPresent() ? defpackage.aiql.z(spj.a) : optionalOfNullable.get());
    }

    @Override // defpackage.sqn
    public final /* synthetic */ defpackage.ajcq d(android.content.Context context, android.telecom.Call.Details details, defpackage.ajcq ajcqVar) {
        return sns.f(this, context, details);
    }

    @Override // defpackage.sqn
    public final defpackage.ajcq e() {
        return defpackage.ajcm.a;
    }

    @Override // defpackage.sqn
    public final /* synthetic */ java.lang.Object f(spn spnVar) {
        spj spjVar = spnVar.m;
        return spjVar == null ? spj.a : spjVar;
    }

    @Override // defpackage.sqn
    public final java.lang.String g() {
        return "GeoLocationPhoneLookup";
    }

    @Override // defpackage.sqn
    public final /* synthetic */ void h(defpackage.akzx akzxVar, java.lang.Object obj) {
        spj spjVar = (spj) obj;
        akzxVar.u();
        spn spnVar = akzxVar.b;
        spn spnVar2 = spn.a;
        j$.util.Objects.requireNonNull(spjVar);
        spnVar.m = spjVar;
        spnVar.b |= 1024;
    }
}
