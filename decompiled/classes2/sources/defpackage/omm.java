package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class omm implements aoin {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ omm(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v15, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v19, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v23, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v27, types: [aoin, java.lang.Object] */
    public final java.lang.Object a() {
        switch (this.$cid) {
            case 0:
            case 1:
            case 2:
                return this.a;
            case 3:
                defpackage.omk omkVar = (defpackage.omk) this.a;
                float fC = omkVar.c.c(java.util.concurrent.TimeUnit.MILLISECONDS);
                java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MINUTES;
                float f = fC / 60000.0f;
                return new ozv(f == 0.0f ? "" : java.lang.String.format(java.util.Locale.US, "%.2f", java.lang.Float.valueOf((omkVar.b.get() + omkVar.a.get()) / f)), 1);
            case 4:
            case 5:
            case 6:
            case 7:
                return this.a;
            case 8:
                return ((defpackage.ooc) this.a.a()).b;
            case 9:
                return ((defpackage.ooc) this.a.a()).c;
            case 10:
                return ((defpackage.ooc) this.a.a()).d;
            case 11:
                return ((defpackage.ooc) this.a.a()).e;
            case 12:
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return this.a;
            case 16:
                return ((otq) this.a).k;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return ((otq) this.a).j;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return ((otq) this.a).l;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return ((otq) this.a).i;
            default:
                return ((otq) this.a).m;
        }
    }
}
