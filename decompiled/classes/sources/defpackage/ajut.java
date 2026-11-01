package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajut implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Runnable a;

    public ajut(defpackage.ajdc ajdcVar, java.lang.Runnable runnable, int i) {
        this.$cid = i;
        this.a = runnable;
        j$.util.Objects.requireNonNull(ajdcVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$cid;
        java.lang.Runnable runnable = this.a;
        if (i != 0) {
            runnable.run();
        } else {
            runnable.run();
        }
    }

    public final java.lang.String toString() {
        int i = this.$cid;
        java.lang.Runnable runnable = this.a;
        return i != 0 ? runnable.toString() : runnable.toString();
    }

    public ajut(defpackage.ajuu ajuuVar, java.lang.Runnable runnable, int i) {
        this.$cid = i;
        this.a = runnable;
        j$.util.Objects.requireNonNull(ajuuVar);
    }
}
