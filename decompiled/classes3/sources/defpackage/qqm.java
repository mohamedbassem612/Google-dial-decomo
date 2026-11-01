package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qqm {
    public static final aimz a = aimz.i("com/android/dialer/incall/video/service/VideoDialogMonitor");
    public final zof b = new nzx(this, 6);
    public final java.util.concurrent.atomic.AtomicBoolean c = new java.util.concurrent.atomic.AtomicBoolean(false);

    public final void a(boolean z) {
        this.c.set(z);
    }

    final boolean b() {
        return this.c.get();
    }
}
