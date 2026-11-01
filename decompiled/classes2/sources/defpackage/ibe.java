package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class ibe implements ajat {
    private final /* synthetic */ int $cid;

    public /* synthetic */ ibe(int i) {
        this.$cid = i;
    }

    public final ajcq a(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                return ((defpackage.hxf) obj).b();
            case 1:
                return ((defpackage.hxf) obj).c();
            case 2:
                return ((defpackage.hxf) obj).a();
            case 3:
                j$.util.Optional optional = (j$.util.Optional) obj;
                if (optional.isPresent()) {
                    defpackage.ibs.a.b().l("com/android/dialer/audio/impl/tidepods/AudioAvailableCallAttributesUpdatePropagator", "updateModelAndPropagate", 122, "AudioAvailableCallAttributesUpdatePropagator.java").v("retrieving call attributes from active call scope");
                    return ((defpackage.ibr) aooc.ar(((defpackage.ibq) ((apqr) optional.orElseThrow()).a(defpackage.ibq.class)).lD().Y(), defpackage.ibr.class)).o();
                }
                defpackage.ibs.a.b().l("com/android/dialer/audio/impl/tidepods/AudioAvailableCallAttributesUpdatePropagator", "updateModelAndPropagate", 118, "AudioAvailableCallAttributesUpdatePropagator.java").v("no active call scope present");
                return aiql.z(j$.util.Optional.empty());
            case 4:
                return ((defpackage.jwc) aooc.ar((defpackage.hkl) obj, defpackage.jwc.class)).be();
            case 5:
                j$.util.Optional optionalOfNullable = (j$.util.Optional) obj;
                if (true == optionalOfNullable.isPresent()) {
                    optionalOfNullable = j$.util.Optional.ofNullable(((zzx) optionalOfNullable.get()).r());
                }
                return (ajcq) optionalOfNullable.orElse(aiql.z(wgi.a));
            case 6:
                return ((defpackage.kuc) aooc.ar((defpackage.hkl) obj, defpackage.kuc.class)).w();
            case 7:
                return ((defpackage.hxf) obj).b();
            case 8:
                return ((defpackage.kxv) obj).bA();
            case 9:
                return ((defpackage.hxf) obj).c();
            case 10:
                return ((defpackage.hxf) obj).b();
            case 11:
                return ((defpackage.iax) ((j$.util.Optional) obj).orElseThrow(new defpackage.iaz(12))).e(j$.time.Duration.ofSeconds(1L));
            case 12:
                return ((defpackage.leu) obj).ap();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return ((defpackage.adnj) obj).a();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                acui acuiVar = (acui) obj;
                if (acuiVar != null) {
                    return aiql.z(j$.util.Optional.of(java.lang.Integer.valueOf(acuiVar.f)));
                }
                a.bI(defpackage.nzm.a.c().m(aioa.b), "No file group found for Eligibility Expansion.", "com/android/dialer/eligibilityexpansion/mdd/EligibilityExpansionRepository", "getVersion", 'L', "EligibilityExpansionRepository.java", zct.b);
                return aiql.z(j$.util.Optional.empty());
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                java.util.regex.Pattern pattern = defpackage.omi.a;
                return ((defpackage.omh) aooc.ar((defpackage.hkl) obj, defpackage.omh.class)).W();
            case 16:
                oko okoVar = (oko) obj;
                if (okoVar == null) {
                    throw new java.lang.IllegalStateException("No telephony instance for SIM");
                }
                return aosv.F(okoVar.d, 0, new defpackage.ogf(okoVar, (aoln) null, 13, (char[]) null), 3);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return ((defpackage.ova) aooc.ar((defpackage.hkl) obj, defpackage.ova.class)).S();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return ((ozy) aooc.ar((defpackage.hkl) obj, ozy.class)).aH();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return ((defpackage.qbk) aooc.ar((defpackage.hkl) obj, defpackage.qbk.class)).s();
            default:
                return ((defpackage.qbk) aooc.ar((defpackage.hkl) obj, defpackage.qbk.class)).r();
        }
    }
}
