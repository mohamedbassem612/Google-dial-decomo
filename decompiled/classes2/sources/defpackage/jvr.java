package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class jvr implements java.util.function.Predicate {
    private final /* synthetic */ int $cid;

    public /* synthetic */ jvr(int i) {
        this.$cid = i;
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

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.util.function.Predicate
    public final boolean test(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                return "localized-caller-tags-config".equals(((acuh) obj).c);
            case 1:
                ((rai) obj).a.run();
                return false;
            case 2:
                return ((j$.util.Optional) obj).isPresent();
            case 3:
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                int iAR = a.aR(((zai) entry.getValue()).i);
                if ((iAR != 0 && iAR == 4) || !"ROOT".equals(((zai) entry.getValue()).c)) {
                    return false;
                }
                break;
            case 4:
                int iAR2 = a.aR(((zai) ((java.util.Map.Entry) obj).getValue()).i);
                if (iAR2 == 0 || iAR2 != 4) {
                    return false;
                }
                break;
            case 5:
                return j$.util.Objects.nonNull((java.lang.Long) obj);
            case 6:
                defpackage.kiw kiwVar = ((kiu) obj).r;
                if (kiwVar == null) {
                    kiwVar = defpackage.kiw.a;
                }
                if (kiwVar.t <= 0) {
                    return false;
                }
                break;
            case 7:
                java.lang.Integer asInteger = ((android.content.ContentValues) obj).getAsInteger("call_type");
                if (asInteger == null) {
                    return false;
                }
                if (asInteger.intValue() != 1 && asInteger.intValue() != 2 && asInteger.intValue() != 3 && asInteger.intValue() != 4 && asInteger.intValue() != 5 && asInteger.intValue() != 6 && asInteger.intValue() != 7) {
                    return false;
                }
                break;
            case 8:
                if (android.text.TextUtils.isEmpty((java.lang.CharSequence) obj)) {
                    return false;
                }
                break;
            case 9:
                if (android.text.TextUtils.isEmpty((java.lang.CharSequence) obj)) {
                    return false;
                }
                break;
            case 10:
                if ((((defpackage.kie) obj).b & 4) == 0) {
                    return false;
                }
                break;
            case 11:
                return j$.util.Objects.nonNull((java.lang.Long) obj);
            case 12:
                return ((spe) ((java.util.Map.Entry) obj).getValue()).b.isEmpty();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                aimz aimzVar = lbl.a;
                if ((((kui) ((java.util.Map.Entry) obj).getValue()).b & 1) == 0) {
                    return false;
                }
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                int iAN = a.aN(((defpackage.lgo) obj).g);
                if (iAN == 0 || iAN != 2) {
                    return false;
                }
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return j$.util.Objects.nonNull((java.lang.String) obj);
            case 16:
                defpackage.lgo lgoVar = (defpackage.lgo) obj;
                int iAN2 = a.aN(lgoVar.g);
                if (iAN2 == 0 || iAN2 != 2 || !lgoVar.k) {
                    return false;
                }
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                aimz aimzVar2 = lcp.a;
                defpackage.ljy ljyVar = ((defpackage.lkq) obj).g.c;
                if (ljyVar == null) {
                    ljyVar = defpackage.ljy.a;
                }
                return ljyVar.d;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                if (((defpackage.lkq) obj).b == null) {
                    return false;
                }
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                int iAN3 = a.aN(((defpackage.lgo) obj).g);
                if (iAN3 != 0 && iAN3 == 4) {
                    return false;
                }
                break;
            default:
                return j$.util.Objects.nonNull((defpackage.lqi) obj);
        }
        return true;
    }
}
