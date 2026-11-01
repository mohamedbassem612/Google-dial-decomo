package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class iom implements defpackage.sqn {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/b2cenrichedcalling/phonelookup/B2cEnrichedCallingPhoneLookupContributor");
    private final defpackage.aoss b;

    public iom(defpackage.aoss aossVar, defpackage.aais aaisVar) {
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        if (aaisVar == null) {
            defpackage.aooh.i("sanitizer");
        }
        this.b = aossVar;
    }

    @Override // defpackage.sqn
    public final defpackage.ajcq a(defpackage.aigf aigfVar) {
        return defpackage.mni.aO(aigfVar);
    }

    @Override // defpackage.sqn
    public final defpackage.ajcq b(defpackage.aihd aihdVar) {
        defpackage.aooh.f(aihdVar, "phoneNumbers");
        return defpackage.aiql.z(java.lang.Boolean.FALSE);
    }

    @Override // defpackage.sqn
    public final defpackage.ajcq c(hkd hkdVar) {
        defpackage.aooh.f(hkdVar, "dialerPhoneNumber");
        return defpackage.aiql.z(sns.g(sow.a.m()).e());
    }

    @Override // defpackage.sqn
    public final defpackage.ajcq d(android.content.Context context, android.telecom.Call.Details details, defpackage.ajcq ajcqVar) {
        defpackage.aooh.f(context, "appContext");
        defpackage.aooh.f(details, "callDetails");
        defpackage.aooh.f(ajcqVar, "callDirection");
        return defpackage.aosv.F(this.b, 0, new iiw(this, details, (defpackage.aoln) null, 10), 3);
    }

    @Override // defpackage.sqn
    public final defpackage.ajcq e() {
        return defpackage.ajcm.a;
    }

    @Override // defpackage.sqn
    public final /* bridge */ /* synthetic */ java.lang.Object f(spn spnVar) {
        defpackage.aooh.f(spnVar, "phoneLookupInfo");
        sow sowVar = spnVar.q;
        if (sowVar == null) {
            sowVar = sow.a;
        }
        defpackage.aooh.e(sowVar, "getB2CEnrichedCallingInfo(...)");
        return sowVar;
    }

    @Override // defpackage.sqn
    public final java.lang.String g() {
        return "B2cEnrichedCallingPhoneLookupContributor";
    }

    @Override // defpackage.sqn
    public final /* bridge */ /* synthetic */ void h(defpackage.akzx akzxVar, java.lang.Object obj) {
        sow sowVar = (sow) obj;
        defpackage.aooh.f(akzxVar, "phoneLookupInfo");
        defpackage.aooh.f(sowVar, "subMessage");
        akzxVar.u();
        spn spnVar = akzxVar.b;
        spn spnVar2 = spn.a;
        j$.util.Objects.requireNonNull(sowVar);
        spnVar.q = sowVar;
        spnVar.b |= 16384;
    }
}
