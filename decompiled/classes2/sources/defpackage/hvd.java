package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class hvd implements java.util.function.Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ hvd(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
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

    /* JADX WARN: Type inference failed for: r2v1, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v35, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v37, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v39, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v41, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v43, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v45, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v47, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v49, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v51, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v53, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v55, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v57, types: [aonj, java.lang.Object] */
    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                return this.a.a(obj);
            case 1:
                return a.l((aonj) this.a, obj);
            case 2:
                return ((ils) obj).b((j$.util.Optional) this.a);
            case 3:
                return ((defpackage.kvt) obj).f((j$.util.Optional) this.a);
            case 4:
                return this.a.a(obj);
            case 5:
                return this.a.a(obj);
            case 6:
                j$.util.Optional optionalA = ((defpackage.iny) obj).a((android.os.Bundle) this.a);
                return true == optionalA.isPresent() ? j$.util.Optional.ofNullable(((defpackage.ioa) optionalA.get()).c) : optionalA;
            case 7:
                return ((defpackage.iny) obj).b((android.os.Bundle) this.a);
            case 8:
                j$.util.Optional optionalA2 = ((defpackage.iny) obj).a((android.os.Bundle) this.a);
                if (true != optionalA2.isPresent()) {
                    return optionalA2;
                }
                defpackage.inz inzVarB = defpackage.inz.b(((defpackage.ioa) optionalA2.get()).b);
                if (inzVarB == null) {
                    inzVarB = defpackage.inz.UNSPECIFIED;
                }
                return j$.util.Optional.ofNullable(inzVarB);
            case 9:
                return this.a.a(obj);
            case 10:
                return this.a.a(obj);
            case 11:
                return this.a.a(obj);
            case 12:
                return a.j((aonj) this.a, obj);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return a.j((aonj) this.a, obj);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return this.a.a(obj);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                java.util.Set set = defpackage.jpk.a;
                return this.a.a(obj);
            case 16:
                java.util.Set set2 = defpackage.jpk.a;
                return this.a.a(obj);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ?? r2 = this.a;
                java.util.Set set3 = defpackage.jpk.a;
                return a.l((aonj) r2, obj);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                java.util.Set set4 = defpackage.jpk.a;
                return this.a.a(obj);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                ?? r3 = this.a;
                java.util.Set set5 = defpackage.jpk.a;
                return a.k((aonj) r3, obj);
            default:
                java.util.Set set6 = defpackage.jpk.a;
                return this.a.a(obj);
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
