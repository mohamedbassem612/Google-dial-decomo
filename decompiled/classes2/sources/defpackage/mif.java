package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class mif implements java.util.function.Predicate {
    private final /* synthetic */ int $cid;

    @Override // java.util.function.Predicate
    public final /* synthetic */ java.util.function.Predicate and(java.util.function.Predicate predicate) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                break;
            case 16:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                break;
            default:
                break;
        }
        return j$.util.function.Predicate.-CC.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ java.util.function.Predicate negate() {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                break;
            case 16:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                break;
            default:
                break;
        }
        return j$.util.function.Predicate.-CC.$default$negate(this);
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ java.util.function.Predicate or(java.util.function.Predicate predicate) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                break;
            case 16:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                break;
            default:
                break;
        }
        return j$.util.function.Predicate.-CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                android.telephony.UiccCardInfo uiccCardInfoM = fn$.ExternalSyntheticApiModelOutline0.m(obj);
                if (uiccCardInfoM != null && fn$.ExternalSyntheticApiModelOutline0.m(uiccCardInfoM)) {
                    return true;
                }
                break;
            case 1:
                return j$.util.Objects.nonNull((defpackage.kie) obj);
            case 2:
                if (!android.text.TextUtils.isEmpty((java.lang.String) obj)) {
                    return true;
                }
                break;
            case 3:
                return ((j$.util.Optional) obj).isPresent();
            case 4:
                return j$.util.Objects.nonNull((java.lang.Long) obj);
            case 5:
                return ((defpackage.oqm) obj).a();
            case 6:
                return ((java.lang.String) obj).startsWith("call scope");
            case 7:
                int state = ((pql) ((apqr) obj).a(pql.class)).c().getState();
                if (state == 13 || state == 12) {
                    return true;
                }
                break;
            case 8:
                apqr apqrVar = (apqr) obj;
                if (((defpackage.pvo) apqrVar.a(defpackage.pvo.class)).co().a().c()) {
                    return true;
                }
                ptx ptxVarCs = ((defpackage.pvo) apqrVar.a(defpackage.pvo.class)).cs();
                if (ptxVarCs.t() || ptxVarCs.u()) {
                    return true;
                }
                break;
            case 9:
                return zcy.a((android.telecom.Call) obj).c();
            case 10:
                return j$.util.Objects.equals((java.lang.String) obj, "on bind");
            case 11:
                aimz aimzVar = qfj.a;
                int iAN = a.aN(((qgp) obj).e);
                if (iAN != 0 && iAN == 3) {
                    return true;
                }
                break;
            case 12:
                qgp qgpVar = (qgp) obj;
                int iAN2 = a.aN(qgpVar.e);
                if (iAN2 != 0 && iAN2 == 2 && !qgpVar.d && !qgpVar.c.isEmpty()) {
                    return true;
                }
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return qtd.a.contains(((qmy) obj).a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return ((rej) obj).d.isPresent();
            case 16:
                rui ruiVar = (rui) obj;
                if ((ruiVar.b & 1) != 0 && ahvr.r(ruiVar.c, android.os.Build.MANUFACTURER)) {
                    return true;
                }
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return ((j$.util.Optional) obj).isPresent();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return ((java.lang.String) obj).startsWith("phone_voicemail_account_");
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return ((java.lang.String) obj).startsWith("phone_voicemail_account_");
            default:
                return ((java.lang.String) obj).startsWith("phone_voicemail_account_");
        }
        return false;
    }
}
