package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class apdd extends defpackage.apdc {
    public final java.lang.Runnable a;

    public apdd(java.lang.Runnable runnable, long j, boolean z) {
        super(j, z);
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.run();
    }

    public final java.lang.String toString() {
        java.lang.Runnable runnable = this.a;
        java.lang.String strA = defpackage.aosv.a(runnable);
        java.lang.String strB = defpackage.aosv.b(runnable);
        long j = this.g;
        boolean z = this.h;
        java.lang.String str = defpackage.apde.a;
        return "Task[" + strA + '@' + strB + ", " + j + ", " + (true != z ? "Non-blocking" : "Blocking") + ']';
    }
}
