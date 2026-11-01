package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class kle implements java.util.function.Function {
    private final /* synthetic */ int $cid;

    public /* synthetic */ kle(int i) {
        this.$cid = i;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
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
        return j$.util.function.Function.-CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                return ((defpackage.kdc) obj).a;
            case 1:
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                return new java.util.AbstractMap.SimpleImmutableEntry((java.lang.Long) entry.getKey(), ((android.content.ContentValues) entry.getValue()).getAsInteger("type"));
            case 2:
                return java.lang.Integer.valueOf(((defpackage.kie) obj).e);
            case 3:
                return anar.r(obj);
            case 4:
                return java.lang.Long.valueOf(((defpackage.kdy) obj).b);
            case 5:
                return ((java.lang.Long) obj).toString();
            case 6:
                return anty.aE(obj);
            case 7:
                return ((defpackage.lkq) obj).a;
            case 8:
                return java.lang.Long.valueOf(((defpackage.lkq) obj).a);
            case 9:
                return (defpackage.lkq) obj;
            case 10:
                return (defpackage.lkq) obj;
            case 11:
                return ((defpackage.lgo) obj).e;
            case 12:
                return ((android.content.ContentValues) ((java.util.Map.Entry) obj).getValue()).getAsString("timestamp");
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return java.lang.Long.valueOf(((defpackage.kdy) obj).a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return ((defpackage.lkq) obj).a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return java.lang.Integer.valueOf(((defpackage.lgo) obj).d);
            case 16:
                return new defpackage.ljm();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                try {
                    return (defpackage.lqi) aiql.H((ajcq) obj);
                } catch (java.util.concurrent.ExecutionException e) {
                    a.by(defpackage.lql.a.c(), "Future did not complete successfully", "com/android/dialer/conference/impl/service/ConferenceProducerModule", "produceConferenceModel", 'b', "ConferenceProducerModule.java", e);
                    return null;
                }
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return java.lang.String.valueOf((java.lang.Long) obj);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return java.lang.Long.valueOf((java.lang.String) obj);
            default:
                return gus.aw((java.lang.String) obj);
        }
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
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
        return j$.util.function.Function.-CC.$default$compose(this, function);
    }
}
