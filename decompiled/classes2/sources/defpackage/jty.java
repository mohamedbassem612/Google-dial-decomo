package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class jty implements java.util.function.Predicate {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ jty(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

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

    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v21, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r11v23, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v25, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r11v31, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r11v42, types: [aonj, java.lang.Object] */
    @Override // java.util.function.Predicate
    public final boolean test(java.lang.Object obj) {
        pur purVar;
        switch (this.$cid) {
            case 0:
                defpackage.jtx jtxVar = (defpackage.jtx) obj;
                if (!jtxVar.d || !defpackage.jiv.c(jtxVar, (alcf) this.a)) {
                    return false;
                }
                break;
            case 1:
                return this.a.add(((defpackage.jtx) obj).f);
            case 2:
                return defpackage.jiv.c((defpackage.jtx) obj, (alcf) this.a);
            case 3:
                defpackage.jtx jtxVar2 = (defpackage.jtx) obj;
                if (!jtxVar2.d) {
                    return false;
                }
                if (!jtxVar2.f.equals(this.a)) {
                    return false;
                }
                break;
            case 4:
                return ((java.lang.String) this.a).equals(((zai) obj).e);
            case 5:
                return ((java.lang.String) this.a).startsWith((java.lang.String) obj);
            case 6:
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                java.lang.Integer num = (java.lang.Integer) this.a.get(entry.getKey());
                if (num != null && num.equals(entry.getValue())) {
                    return false;
                }
                break;
            case 7:
                if (((defpackage.kdc) obj).a.d != ((kiu) this.a).d) {
                    return false;
                }
                break;
            case 8:
                if (this.a.contains((java.lang.String) obj)) {
                    return false;
                }
                break;
            case 9:
                if (this.a.containsKey(java.lang.Long.valueOf(((defpackage.kdy) obj).a))) {
                    return false;
                }
                break;
            case 10:
                return this.a.contains(((java.util.Map.Entry) obj).getKey());
            case 11:
                return ((java.lang.String) ((defpackage.nzm) this.a).d.a()).equals(((acuh) obj).c);
            case 12:
                return a.w((aonj) this.a, obj);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                defpackage.oqt oqtVarA = ((defpackage.oql) obj).a();
                defpackage.oqt oqtVarB = defpackage.oqt.b(((defpackage.oqs) this.a).c);
                if (oqtVarB == null) {
                    oqtVarB = defpackage.oqt.DIALER_HATS_EVENT_TYPE_UNKNOWN;
                }
                return oqtVarA.equals(oqtVarB);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                plp plpVar = (plp) obj;
                if (plpVar.d.isEmpty()) {
                    return false;
                }
                int iAS = a.aS(plpVar.e);
                if (iAS == 0) {
                    iAS = 1;
                }
                if (iAS != ((plq) this.a).b) {
                    return false;
                }
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                android.hardware.camera2.CameraCharacteristics cameraCharacteristics = ((pvc) obj).b;
                aimz aimzVar = pvf.a;
                java.lang.Integer num2 = (java.lang.Integer) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.LENS_FACING);
                if (num2 == null) {
                    purVar = pur.a;
                } else {
                    int iIntValue = num2.intValue();
                    if (iIntValue == 0) {
                        purVar = pur.b;
                    } else if (iIntValue != 1) {
                        a.bt(pvf.a.d(), "undefined direction %d", num2, "com/android/dialer/incall/core/video/impl/CameraController$CameraInfo", "getCameraDirection", (char) 546, "CameraController.java", zct.b);
                        purVar = pur.a;
                    } else {
                        purVar = pur.c;
                    }
                }
                if (purVar != this.a) {
                    return false;
                }
                break;
            case 16:
                return a.w((aonj) this.a, obj);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return ((qay) obj).a.equals(this.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                if (((tkl) this.a).j(((android.view.Display) obj).getDisplayId()) == 1) {
                    return false;
                }
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                if (((quq) ((aoin) ((zzx) this.a).k().get((quo) obj)).a()).b().b != 1) {
                    return false;
                }
                break;
            default:
                if (((quq) ((aoin) ((zzx) this.a).k().get((quo) obj)).a()).b().b != 4) {
                    return false;
                }
                break;
        }
        return true;
    }
}
