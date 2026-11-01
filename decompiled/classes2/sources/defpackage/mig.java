package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class mig implements java.util.function.Function {
    private final /* synthetic */ int $cid;

    public /* synthetic */ mig(int i) {
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
                return fn$.ExternalSyntheticApiModelOutline0.m(fn$.ExternalSyntheticApiModelOutline0.m(obj));
            case 1:
                return gus.aw((java.lang.String) obj);
            case 2:
                j$.util.Optional optionalEmpty = ((defpackage.mij) obj).b;
                if (true == optionalEmpty.isPresent() && true != anty.aD((java.lang.String) optionalEmpty.get())) {
                    optionalEmpty = j$.util.Optional.empty();
                }
                return (java.lang.String) optionalEmpty.orElse((java.lang.Object) null);
            case 3:
                defpackage.miv mivVarB = defpackage.miv.b(((defpackage.miu) obj).c);
                return mivVarB == null ? defpackage.miv.UNSPECIFIED : mivVarB;
            case 4:
                defpackage.mjq mjqVar = (defpackage.mjq) obj;
                return new defpackage.mkn(mjqVar.a, mjqVar.b, mjqVar.c, mjqVar.f);
            case 5:
                return ((defpackage.hla) obj).a();
            case 6:
                return (android.telecom.PhoneAccountHandle) ((j$.util.Optional) obj).get();
            case 7:
                return java.lang.Integer.valueOf(((java.util.List) obj).size());
            case 8:
                java.lang.Integer num = (java.lang.Integer) obj;
                aooh.c(num);
                return gus.au(num.intValue());
            case 9:
                return java.lang.Integer.valueOf(((java.util.List) obj).size());
            case 10:
                return (java.lang.String) obj;
            case 11:
                return gus.av(((java.lang.Integer) obj).intValue());
            case 12:
                return java.lang.Long.valueOf(((java.lang.Integer) obj).intValue());
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return ((android.net.Uri) obj).toString();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return java.lang.Long.valueOf(((java.lang.Integer) obj).intValue());
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return gus.av(((java.lang.Integer) obj).intValue());
            case 16:
                return (java.lang.String) obj;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return (java.lang.String) obj;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return gus.ax(((j$.util.Optional) obj).isPresent());
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return (java.lang.String) obj;
            default:
                return (java.lang.String) obj;
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
