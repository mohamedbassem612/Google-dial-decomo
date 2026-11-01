package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class ibm implements java.util.concurrent.ThreadFactory {
    private final /* synthetic */ int $cid;

    public ibm(apvy apvyVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(apvyVar);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        int i = this.$cid;
        if (i == 0) {
            defpackage.ibn.a.b().l("com/android/dialer/audio/impl/concurrent/CallAudioConcurrentModule", "audioThreadExecutor", 54, "CallAudioConcurrentModule.java").v("creating serial thread");
            java.lang.Thread thread = new java.lang.Thread(runnable, "Audio-HighPriority-Serial");
            thread.setPriority(5);
            return thread;
        }
        if (i == 1) {
            return new defpackage.dxp(runnable);
        }
        if (i == 2) {
            int i2 = xmj.a;
            return new java.lang.Thread(runnable, "OnboardingTaskBinding");
        }
        if (i == 3) {
            return new java.lang.Thread(runnable);
        }
        if (i != 4) {
            return java.util.concurrent.Executors.defaultThreadFactory().newThread(new aobd(this, runnable, 12));
        }
        java.util.concurrent.atomic.AtomicReference atomicReference = aewq.a;
        return new java.lang.Thread(runnable, "ProcessStablePhenotypeFlag");
    }

    public /* synthetic */ ibm(int i) {
        this.$cid = i;
    }
}
