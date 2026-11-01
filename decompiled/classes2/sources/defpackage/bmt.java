package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class bmt implements aomy {
    private final /* synthetic */ int $cid;

    public /* synthetic */ bmt(int i) {
        this.$cid = i;
    }

    public final java.lang.Object a() {
        int i = this.$cid;
        java.lang.Float fValueOf = java.lang.Float.valueOf(0.0f);
        switch (i) {
            case 0:
                ajb ajbVar = defpackage.bmz.a;
                break;
            case 1:
                ajb ajbVar2 = defpackage.bmz.a;
                return java.lang.Float.valueOf(1.0f);
            case 2:
                return new defpackage.bsh();
            case 3:
                return java.util.UUID.randomUUID();
            case 4:
                cbd cbdVar = defpackage.cmd.a;
                return null;
            case 5:
                return java.lang.Boolean.FALSE;
            case 6:
                return new defpackage.ni(new android.graphics.PathMeasure(), (byte[]) null);
            case 7:
                return aojh.a;
            case 8:
                return null;
            case 9:
                int i2 = dem.z;
                return java.lang.Boolean.FALSE;
            case 10:
                cbd cbdVar2 = defpackage.dfy.a;
                return java.lang.Boolean.FALSE;
            case 11:
                return java.lang.Boolean.FALSE;
            case 12:
                aonn aonnVar = defpackage.dis.a;
                return java.lang.Boolean.FALSE;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                aonn aonnVar2 = defpackage.dis.a;
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                aonn aonnVar3 = defpackage.dis.a;
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
            case 16:
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return java.util.UUID.randomUUID();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                cbd cbdVar3 = defpackage.dra.a;
                return "DEFAULT_TEST_TAG";
            default:
                cbd cbdVar4 = defpackage.dra.a;
                return java.lang.Boolean.FALSE;
        }
        return fValueOf;
    }
}
