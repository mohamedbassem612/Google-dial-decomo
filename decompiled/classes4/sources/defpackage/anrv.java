package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class anrv implements defpackage.aocw {
    public final defpackage.aocw a;
    public boolean b = false;
    public int c = 0;
    private final java.lang.Runnable d;

    public anrv(defpackage.aocw aocwVar, java.lang.Runnable runnable) {
        this.a = aocwVar;
        this.d = runnable;
    }

    public final java.lang.Runnable a() {
        if (this.b && this.c == 0) {
            return this.d;
        }
        return null;
    }
}
