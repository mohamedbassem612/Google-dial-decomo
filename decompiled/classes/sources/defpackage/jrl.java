package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class jrl implements defpackage.sqn {
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
        return defpackage.aiql.z(ztf.a);
    }

    @Override // defpackage.sqn
    public final defpackage.ajcq d(android.content.Context context, android.telecom.Call.Details details, defpackage.ajcq ajcqVar) {
        ztf ztfVar;
        defpackage.aooh.f(context, "appContext");
        defpackage.aooh.f(details, "callDetails");
        defpackage.aooh.f(ajcqVar, "directionFuture");
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            defpackage.aooh.f(details, "callDetails");
            int iM = baa$.ExternalSyntheticApiModelOutline1.m(details);
            if (iM != 1) {
                ztfVar = iM != 2 ? ztf.a : ztf.c;
            } else {
                ztfVar = ztf.b;
            }
        } else {
            ztfVar = ztf.a;
        }
        return defpackage.aiql.z(ztfVar);
    }

    @Override // defpackage.sqn
    public final defpackage.ajcq e() {
        return defpackage.ajcm.a;
    }

    @Override // defpackage.sqn
    public final /* bridge */ /* synthetic */ java.lang.Object f(spn spnVar) {
        defpackage.aooh.f(spnVar, "phoneLookupInfo");
        ztf ztfVarB = ztf.b(spnVar.f);
        return ztfVarB == null ? ztf.a : ztfVarB;
    }

    @Override // defpackage.sqn
    public final java.lang.String g() {
        return "StirShakenPhoneLookup";
    }

    @Override // defpackage.sqn
    public final /* bridge */ /* synthetic */ void h(defpackage.akzx akzxVar, java.lang.Object obj) {
        ztf ztfVar = (ztf) obj;
        defpackage.aooh.f(akzxVar, "phoneLookupInfo");
        defpackage.aooh.f(ztfVar, "subMessage");
        akzxVar.u();
        spn spnVar = akzxVar.b;
        spn spnVar2 = spn.a;
        spnVar.f = ztfVar.a();
        spnVar.b |= 8;
    }
}
