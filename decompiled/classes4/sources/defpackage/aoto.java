package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aoto extends defpackage.aotp {
    private final java.lang.Runnable a;

    public aoto(long j, java.lang.Runnable runnable) {
        super(j);
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.run();
    }

    @Override // defpackage.aotp
    public final java.lang.String toString() {
        java.lang.String string = super.toString();
        java.lang.Runnable runnable = this.a;
        java.util.Objects.toString(runnable);
        return string.concat(runnable.toString());
    }
}
