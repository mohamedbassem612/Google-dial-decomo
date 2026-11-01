package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class iaz implements java.util.function.Supplier {
    private final /* synthetic */ int $cid;

    @Override // java.util.function.Supplier
    public final java.lang.Object get() {
        switch (this.$cid) {
            case 0:
                return new java.util.NoSuchElementException();
            case 1:
                return new java.lang.IllegalStateException("AudioTee in stopped state must have a stoppedReason");
            case 2:
                return new java.lang.IllegalStateException("Selected chip missing tagConfig");
            case 3:
                return new java.lang.NullPointerException();
            case 4:
                return new java.util.ArrayList();
            case 5:
                return new java.util.HashSet();
            case 6:
                return new java.util.ArrayList();
            case 7:
                return new java.lang.NullPointerException();
            case 8:
                return new j$.util.LongSummaryStatistics();
            case 9:
                return new j$.util.DoubleSummaryStatistics();
            case 10:
                return new j$.util.IntSummaryStatistics();
            case 11:
                return new java.lang.IllegalStateException("no audio tee");
            case 12:
                return new java.lang.IllegalStateException("no call audio");
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return new java.lang.IllegalStateException("no avatarSessionManager to initialize callScreenSession");
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return new java.util.ArrayList();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return new java.lang.IllegalStateException();
            case 16:
                return new java.lang.IllegalStateException("resources not initialized or already closed");
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new java.util.NoSuchElementException("dialogOptions expected to be not empty when selectedPhoneAccountHandle is empty.");
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new java.util.ArrayList();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return new java.util.ArrayList();
            default:
                return new java.lang.IllegalStateException();
        }
    }
}
