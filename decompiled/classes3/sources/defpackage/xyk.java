package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class xyk extends java.lang.Thread {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xyk(defpackage.xyl xylVar, java.lang.Runnable runnable) {
        super(runnable);
        j$.util.Objects.requireNonNull(xylVar);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        android.os.Process.setThreadPriority(9);
        super.run();
    }
}
