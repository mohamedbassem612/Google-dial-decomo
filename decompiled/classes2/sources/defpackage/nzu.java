package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class nzu implements java.util.function.Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ nzu(java.lang.Object obj, int i) {
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

    /* JADX WARN: Type inference failed for: r5v11, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v13, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v15, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v17, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v19, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v21, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v23, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v25, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v27, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v29, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v31, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v33, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v44, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v46, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v48, types: [aonj, java.lang.Object] */
    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(((defpackage.nzt) this.a).i.get());
                aooh.e(optionalOfNullable, "ofNullable(...)");
                return new defpackage.oad((android.location.Location) obj, optionalOfNullable);
            case 1:
                java.lang.Object obj2 = this.a;
                return ahvr.F(new defpackage.lly(obj2, (android.net.Uri) obj, 11, null), ((defpackage.nzm) obj2).b);
            case 2:
                return this.a.a(obj);
            case 3:
                return a.l((aonj) this.a, obj);
            case 4:
                return this.a.a(obj);
            case 5:
                return this.a.a(obj);
            case 6:
                return this.a.a(obj);
            case 7:
                return this.a.a(obj);
            case 8:
                return a.l((aonj) this.a, obj);
            case 9:
                return a.l((aonj) this.a, obj);
            case 10:
                return this.a.a(obj);
            case 11:
                return this.a.a(obj);
            case 12:
                return this.a.a(obj);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return this.a.a(obj);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                pmm pmmVar = new pmm();
                pmmVar.e(pms.e);
                pmmVar.d((java.lang.Integer) obj);
                pmmVar.b(((android.content.Context) this.a).getText(2132018733).toString());
                return pmmVar.a();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                qay qayVar = (qay) obj;
                aimw aimwVarL = oti.a.b().l("com/android/dialer/incall/activity/lockholder/CallScopeLockHolder", "acquireInCallUiLock", 91, "CallScopeLockHolder.java");
                oti otiVar = (oti) this.a;
                aimwVarL.y("transferring OnBindUiLockHolder's InCallUiLock to CallScopeLockHolder - %s", otiVar.e);
                qayVar.a = otiVar.d();
                return j$.util.Optional.of(qayVar);
            case 16:
                return this.a.a(obj);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return a.l((aonj) this.a, obj);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return a.k((aonj) this.a, obj);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return ((zms) this.a).e((android.bluetooth.BluetoothDevice) obj);
            default:
                return ((android.content.Context) this.a).getString(2132020097, (java.lang.String) obj);
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
