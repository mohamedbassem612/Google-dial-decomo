package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class lpe {
    private static final defpackage.aimz b = defpackage.aimz.i("com/android/dialer/compat/directboot/RevertedFlagsDetector");
    public final defpackage.rlv a;
    private final java.util.concurrent.atomic.AtomicBoolean c = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final java.util.concurrent.atomic.AtomicBoolean d = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final java.util.concurrent.atomic.AtomicBoolean e = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final defpackage.aoin f;
    private final defpackage.ajct g;
    private final defpackage.zzx h;

    public lpe(defpackage.aoin aoinVar, defpackage.zzx zzxVar, defpackage.rlv rlvVar, defpackage.ajct ajctVar) {
        this.f = aoinVar;
        this.h = zzxVar;
        this.a = rlvVar;
        this.g = ajctVar;
    }

    private final void c(defpackage.rmx rmxVar) {
        defpackage.agsm.i(315, this.g.submit(defpackage.ahqx.h(new defpackage.an(this, rmxVar, 11, (byte[]) null))), "failed logging impressions", new java.lang.Object[0]);
    }

    public final void a() {
        ((defpackage.aimw) ((defpackage.aimw) b.b()).l("com/android/dialer/compat/directboot/RevertedFlagsDetector", "flagGuardFixApplied", 123, "RevertedFlagsDetector.java")).v("flag guard applied");
        this.e.set(true);
    }

    public final void b() {
        if (this.h.m()) {
            if (this.c.getAndSet(true)) {
                return;
            }
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) b.d()).i(defpackage.zct.b)).l("com/android/dialer/compat/directboot/RevertedFlagsDetector", "interacted", '<', "RevertedFlagsDetector.java")).v("interactions during direct boot");
            this.a.o(defpackage.rmx.REVERTED_FLAGS_DETECTOR_INTERACTED_IN_DIRECT_BOOT);
            return;
        }
        if (this.d.getAndSet(true)) {
            return;
        }
        if (((java.lang.Boolean) this.f.a()).booleanValue()) {
            boolean z = this.e.get();
            defpackage.aimz aimzVar = b;
            if (z) {
                ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/compat/directboot/RevertedFlagsDetector", "interacted", 79, "RevertedFlagsDetector.java")).v("flag guards successfully prevented default values from being used after unlock");
                c(defpackage.rmx.REVERTED_FLAGS_DETECTOR_FRESH_AVERTED_BY_GUARD);
                return;
            } else {
                ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/compat/directboot/RevertedFlagsDetector", "interacted", 84, "RevertedFlagsDetector.java")).v("direct boot is not causing flags to use default values");
                c(defpackage.rmx.REVERTED_FLAGS_DETECTOR_FRESH);
                return;
            }
        }
        if (this.c.get()) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) b.d()).i(defpackage.zct.b)).l("com/android/dialer/compat/directboot/RevertedFlagsDetector", "interacted", '`', "RevertedFlagsDetector.java")).v("All flags are using default values since dialer was interacted during direct boot");
            c(defpackage.rmx.REVERTED_FLAGS_DETECTOR_STALE_INTERACTED_IN_DIRECT_BOOT);
            return;
        }
        boolean z2 = this.e.get();
        defpackage.aimz aimzVar2 = b;
        if (z2) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aimzVar2.d()).i(defpackage.zct.b)).l("com/android/dialer/compat/directboot/RevertedFlagsDetector", "interacted", 'j', "RevertedFlagsDetector.java")).v("All flags are using default values. Some flag access during direct boot was guarded but ultimately it failed");
            c(defpackage.rmx.REVERTED_FLAGS_DETECTOR_STALE_AVERTED_BY_GUARD_BUT_FAILED);
        } else {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aimzVar2.d()).i(defpackage.zct.b)).l("com/android/dialer/compat/directboot/RevertedFlagsDetector", "interacted", 'u', "RevertedFlagsDetector.java")).v("All flags are using default values for unknown reasons.");
            c(defpackage.rmx.REVERTED_FLAGS_DETECTOR_STALE_UNKNOWN);
        }
    }
}
