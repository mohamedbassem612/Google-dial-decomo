package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class sqf implements defpackage.sqn {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/phonelookup/cnap/CnapPhoneLookupContributor");
    public final defpackage.ojo b;
    private final defpackage.ajct c;

    public sqf(defpackage.ajct ajctVar, defpackage.ojo ojoVar) {
        this.c = ajctVar;
        this.b = ojoVar;
    }

    @Override // defpackage.sqn
    public final defpackage.ajcq a(defpackage.aigf aigfVar) {
        return defpackage.anar.w(aigfVar);
    }

    @Override // defpackage.sqn
    public final defpackage.ajcq b(defpackage.aihd aihdVar) {
        return defpackage.aiql.z(java.lang.Boolean.FALSE);
    }

    @Override // defpackage.sqn
    public final defpackage.ajcq c(hkd hkdVar) {
        java.lang.String str = hkdVar.c;
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/phonelookup/cnap/CnapPhoneLookupContributor", "lookup", 99, "CnapPhoneLookupContributor.java")).y("normalizedNumber: %s", defpackage.aais.aC(str));
        return this.c.submit(defpackage.ahqx.i(new qfb(this, str, 15)));
    }

    @Override // defpackage.sqn
    public final defpackage.ajcq d(android.content.Context context, android.telecom.Call.Details details, defpackage.ajcq ajcqVar) {
        java.lang.String callerDisplayName = details.getCallerDisplayName();
        if (callerDisplayName == null) {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/phonelookup/cnap/CnapPhoneLookupContributor", "lookup", 77, "CnapPhoneLookupContributor.java")).v("callerDisplayName (CNAP) is null");
        } else {
            boolean zIsEmpty = callerDisplayName.isEmpty();
            defpackage.aimz aimzVar = a;
            if (zIsEmpty) {
                ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/phonelookup/cnap/CnapPhoneLookupContributor", "lookup", 79, "CnapPhoneLookupContributor.java")).v("callerDisplayName (CNAP) is empty");
            } else {
                ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/phonelookup/cnap/CnapPhoneLookupContributor", "lookup", 81, "CnapPhoneLookupContributor.java")).v("callerDisplayName (CNAP) is non-null and non-empty");
            }
        }
        if (android.text.TextUtils.isEmpty(callerDisplayName)) {
            return defpackage.aiql.z(spc.a);
        }
        defpackage.akzx akzxVarM = spc.a.m();
        akzxVarM.u();
        spc spcVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(callerDisplayName);
        spcVar.b |= 1;
        spcVar.c = callerDisplayName;
        return defpackage.aiql.z(akzxVarM.r());
    }

    @Override // defpackage.sqn
    public final defpackage.ajcq e() {
        return defpackage.ajcm.a;
    }

    @Override // defpackage.sqn
    public final /* synthetic */ java.lang.Object f(spn spnVar) {
        spc spcVar = spnVar.i;
        return spcVar == null ? spc.a : spcVar;
    }

    @Override // defpackage.sqn
    public final java.lang.String g() {
        return "CnapPhoneLookup";
    }

    @Override // defpackage.sqn
    public final /* synthetic */ void h(defpackage.akzx akzxVar, java.lang.Object obj) {
        spc spcVar = (spc) obj;
        akzxVar.u();
        spn spnVar = akzxVar.b;
        spn spnVar2 = spn.a;
        j$.util.Objects.requireNonNull(spcVar);
        spnVar.i = spcVar;
        spnVar.b |= 64;
    }
}
