package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xcn {
    public static final aimz a = aimz.i("com/android/incallui/atlas/ui/impl/tidepods/service/ringtone/HoldForMeRingtoneController");
    public final android.media.AudioManager b;
    public final oju c;
    public final android.content.Context d;
    public final ajct e;
    public final rwi f;
    public final android.os.Vibrator g;
    public final ogj k;
    private final ajct m;
    public final ajwr l = new ajwr();
    public j$.util.Optional h = j$.util.Optional.empty();
    public j$.util.Optional i = j$.util.Optional.empty();
    public j$.util.Optional j = j$.util.Optional.empty();

    public xcn(android.content.Context context, ajct ajctVar, ajct ajctVar2, android.media.AudioManager audioManager, oju ojuVar, rwi rwiVar, ogj ogjVar, android.os.Vibrator vibrator) {
        this.d = context;
        this.m = ajctVar;
        this.e = ajctVar2;
        this.b = audioManager;
        this.c = ojuVar;
        this.f = rwiVar;
        this.k = ogjVar;
        this.g = vibrator;
    }

    public final ajcq a(defpackage.xck xckVar) {
        defpackage.xcj xcjVarA;
        int iOrdinal = xckVar.ordinal();
        if (iOrdinal == 0) {
            defpackage.xcd xcdVar = new defpackage.xcd();
            xcdVar.b(2131951617);
            xcjVarA = xcdVar.a();
        } else if (iOrdinal == 1) {
            defpackage.xcd xcdVar2 = new defpackage.xcd();
            xcdVar2.b(2131951618);
            xcdVar2.c(defpackage.tcm.a);
            xcjVarA = xcdVar2.a();
        } else {
            if (iOrdinal != 2) {
                throw new java.lang.AssertionError("unknown ringing mode");
            }
            defpackage.xcd xcdVar3 = new defpackage.xcd();
            xcdVar3.b(2131951619);
            xcdVar3.c(defpackage.tcm.a);
            xcjVarA = xcdVar3.a();
        }
        defpackage.xcj xcjVar = xcjVarA;
        return ahvr.H(this.m.eU(ahqx.i(new lqh(this, ((defpackage.xce) xcjVar).a, 9))), new icy(this, xcjVar, xckVar, 19, (boolean[]) null), this.e);
    }

    public final ajcq b(defpackage.xck xckVar) {
        return this.l.e(ahqx.b(new defpackage.wwg(this, xckVar, 6)), this.e);
    }

    public final ajcq c() {
        return this.l.d(ahqx.i(new defpackage.wwy(this, 15)), this.e);
    }

    public final void d(defpackage.xcm xcmVar) {
        a.b().l("com/android/incallui/atlas/ui/impl/tidepods/service/ringtone/HoldForMeRingtoneController", "applySystemConfigDiff", 270, "HoldForMeRingtoneController.java").y("applying system config diff: %s", xcmVar);
        try {
            j$.util.OptionalInt optionalIntB = xcmVar.b();
            oju ojuVar = this.c;
            j$.util.Objects.requireNonNull(ojuVar);
            optionalIntB.ifPresent(new defpackage.qgy(ojuVar, 3));
        } catch (java.lang.RuntimeException e) {
            hgb.g(a.b(), "unable to change ringer mode to %s", xcmVar.b(), "com/android/incallui/atlas/ui/impl/tidepods/service/ringtone/HoldForMeRingtoneController", "applySystemConfigDiff", (char) 283, "HoldForMeRingtoneController.java", e, zct.a);
        }
        try {
            xcmVar.c().ifPresent(new defpackage.qgy(this, 4));
        } catch (java.lang.RuntimeException e2) {
            hgb.g(a.b(), "unable to change ringer volume to %s", xcmVar.c(), "com/android/incallui/atlas/ui/impl/tidepods/service/ringtone/HoldForMeRingtoneController", "applySystemConfigDiff", (char) 295, "HoldForMeRingtoneController.java", e2, zct.a);
        }
        try {
            j$.util.OptionalInt optionalIntA = xcmVar.a();
            rwi rwiVar = this.f;
            j$.util.Objects.requireNonNull(rwiVar);
            optionalIntA.ifPresent(new defpackage.qgy(rwiVar, 5));
        } catch (java.lang.RuntimeException e3) {
            hgb.g(a.b(), "unable to change interruption filter to %s", xcmVar.a(), "com/android/incallui/atlas/ui/impl/tidepods/service/ringtone/HoldForMeRingtoneController", "applySystemConfigDiff", (char) 307, "HoldForMeRingtoneController.java", e3, zct.a);
        }
    }
}
