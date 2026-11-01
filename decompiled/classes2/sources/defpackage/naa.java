package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class naa implements java.util.function.Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ naa(java.lang.Object obj, int i) {
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

    /* JADX WARN: Type inference failed for: r4v1, types: [aoqa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11, types: [aoqa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v13, types: [aoqa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v15, types: [aoqa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v17, types: [aoqa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v19, types: [aoqa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v21, types: [aoqa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v23, types: [aoqa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v25, types: [aoqa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v27, types: [aoqa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [aoqa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [aoqa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v51, types: [java.lang.Object, oql] */
    /* JADX WARN: Type inference failed for: r4v7, types: [aoqa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9, types: [aoqa, java.lang.Object] */
    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                return defpackage.mzp.f(this.a, (defpackage.mtq) obj);
            case 1:
                return defpackage.mzp.f(this.a, (defpackage.mtq) obj);
            case 2:
                return defpackage.mzp.f(this.a, (defpackage.mtq) obj);
            case 3:
                return defpackage.mzp.f(this.a, (defpackage.mtq) obj);
            case 4:
                return defpackage.mzp.f(this.a, (defpackage.mtq) obj);
            case 5:
                return defpackage.mzp.f(this.a, (defpackage.mtq) obj);
            case 6:
                return defpackage.mzp.f(this.a, (defpackage.mtq) obj);
            case 7:
                return defpackage.mzp.f(this.a, (defpackage.mtq) obj);
            case 8:
                return defpackage.mzp.f(this.a, (defpackage.mtq) obj);
            case 9:
                return defpackage.mzp.f(this.a, (defpackage.mtq) obj);
            case 10:
                return defpackage.mzp.f(this.a, (defpackage.mtq) obj);
            case 11:
                return defpackage.mzp.f(this.a, (defpackage.mtq) obj);
            case 12:
                return defpackage.mzp.f(this.a, (defpackage.mtq) obj);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return defpackage.mzp.f(this.a, (defpackage.mtq) obj);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return ((aoom) this.a).b((defpackage.nmo) obj);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return ((zjs) this.a).c((android.telecom.PhoneAccountHandle) obj);
            case 16:
                return gus.az(new mhc[]{gus.aw((java.lang.String) obj), gus.aw(java.lang.String.valueOf(this.a))});
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return gus.az(new mhc[]{gus.aw((java.lang.String) obj), gus.aw(java.lang.String.valueOf(this.a))});
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                long j = ((defpackage.kdy) obj).b;
                return new defpackage.onr(j, (defpackage.omz) ((aigf) this.a).get(java.lang.Long.valueOf(j)));
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return ((defpackage.oql) obj).f((oqi) this.a);
            default:
                return java.lang.Boolean.valueOf(this.a.d().equals(((android.view.View) obj).getTag(2131428321)));
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
