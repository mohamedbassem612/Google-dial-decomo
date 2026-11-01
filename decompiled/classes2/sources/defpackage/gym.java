package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gym implements java.lang.Runnable {
    private final gtr a;
    private final boolean b;
    private final int c;
    private final ipc d;

    public gym(gtr gtrVar, ipc ipcVar, boolean z, int i) {
        aooh.f(gtrVar, "processor");
        aooh.f(ipcVar, "token");
        this.a = gtrVar;
        this.d = ipcVar;
        this.b = z;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zE;
        gve gveVarA;
        boolean z = this.b;
        gtr gtrVar = this.a;
        if (z) {
            ipc ipcVar = this.d;
            int i = this.c;
            java.lang.String str = ((gxd) ipcVar.a).a;
            synchronized (gtrVar.l) {
                gveVarA = gtrVar.a(str);
            }
            zE = gtr.e(str, gveVarA, i);
        } else {
            ipc ipcVar2 = this.d;
            int i2 = this.c;
            java.lang.String str2 = ((gxd) ipcVar2.a).a;
            synchronized (gtrVar.l) {
                if (gtrVar.f.get(str2) != null) {
                    gsh.a().c(gtr.a, a.bk(str2, "Ignored stopWork. WorkerWrapper ", " is in foreground"));
                } else {
                    java.util.Set set = (java.util.Set) gtrVar.h.get(str2);
                    if (set != null && set.contains(ipcVar2)) {
                        zE = gtr.e(str2, gtrVar.a(str2), i2);
                    }
                }
                zE = false;
            }
        }
        java.lang.String str3 = ((gxd) this.d.a).a;
        int i3 = this.c;
        gsh.a().c(gsh.b("StopWorkRunnable"), "StopWorkRunnable for " + str3 + "; Processor.stopWork = " + zE + ", reason: " + i3);
    }
}
