package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class eli implements aomy {
    private final /* synthetic */ int $cid;

    public /* synthetic */ eli(int i) {
        this.$cid = i;
    }

    public final java.lang.Object a() {
        java.lang.Object yzVar;
        androidx.window.extensions.layout.WindowLayoutComponent windowLayoutComponentO;
        switch (this.$cid) {
            case 0:
                yzVar = new defpackage.yz(null, null, null);
                break;
            case 1:
                cbd cbdVar = defpackage.dra.a;
                return java.util.UUID.randomUUID();
            case 2:
                return new enw();
            case 3:
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                defpackage.dkq dkqVar = new defpackage.dkq(20);
                aopu[] aopuVarArr = aoou.a;
                dzl.o(new aooa(defpackage.fwq.class), dkqVar, linkedHashMap);
                return dzl.n(linkedHashMap);
            case 4:
                return null;
            case 5:
                return new android.os.Handler(android.os.Looper.getMainLooper());
            case 6:
                int i = defpackage.gpz.b;
                try {
                    java.lang.ClassLoader classLoader = defpackage.gqa.class.getClassLoader();
                    izg izgVar = classLoader != null ? new izg(classLoader, new gne(classLoader, (byte[]) null)) : null;
                    if (izgVar == null || (windowLayoutComponentO = izgVar.o()) == null) {
                        return null;
                    }
                    gne gneVar = new gne(classLoader, (byte[]) null);
                    int i2 = gmz.a;
                    int iA = gmz.a();
                    if (iA >= 9 || iA >= 6 || iA >= 2) {
                        yzVar = new defpackage.gqr(windowLayoutComponentO, gneVar);
                    } else if (iA != 1) {
                        yzVar = new defpackage.gqp();
                    } else {
                        yzVar = new defpackage.gqq(windowLayoutComponentO, gneVar);
                    }
                } catch (java.lang.Throwable unused) {
                    return null;
                }
                break;
            case 7:
                throw new java.lang.IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
            case 8:
                defpackage.gvq gvqVar = defpackage.gvq.a;
                return aojh.a;
            case 9:
            case 10:
            case 11:
            case 12:
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return new androidx.compose.runtime.ParcelableSnapshotMutableState(defpackage.jac.a, cdu.c);
            case 16:
                return new androidx.compose.runtime.ParcelableSnapshotMutableFloatState(3000.0f);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new androidx.compose.runtime.ParcelableSnapshotMutableFloatState(0.0f);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.TRUE, cdu.c);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return afsq.ce();
            default:
                return new androidx.compose.runtime.ParcelableSnapshotMutableFloatState(0.0f);
        }
        return yzVar;
    }
}
