package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class nzq implements aoin {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ nzq(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [aoin, java.lang.Object] */
    public final java.lang.Object a() {
        switch (this.$cid) {
            case 0:
                return ((defpackage.nzt) this.a.a()).g;
            case 1:
                return (aguq) this.a.a();
            case 2:
                return ((oac) this.a).h;
            case 3:
                return ((defpackage.obd) this.a.a()).i;
            case 4:
                return ((rdp) this.a).a;
            case 5:
            case 8:
            case 9:
            case 10:
            case 11:
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
            case 16:
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
            default:
                return this.a;
            case 6:
                return ((defpackage.ocq) this.a).h;
            case 7:
                return ((defpackage.ocu) this.a).h;
            case 12:
                java.lang.Object obj = this.a;
                aooh.d(obj, "null cannot be cast to non-null type com.google.android.callingshared.peertopeer.capabilities.CapabilityDataCommander<com.google.protobuf.MessageLite>");
                return obj;
        }
    }
}
