package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gty implements defpackage.gtw {
    public final defpackage.gtw a;
    public final java.lang.Object b = new java.lang.Object();

    public gty(defpackage.gtw gtwVar) {
        this.a = gtwVar;
    }

    @Override // defpackage.gtw
    public final boolean a(defpackage.gxd gxdVar) {
        boolean zContainsKey;
        synchronized (this.b) {
            zContainsKey = ((defpackage.gtx) this.a).a.containsKey(gxdVar);
        }
        return zContainsKey;
    }

    @Override // defpackage.gtw
    public final defpackage.ipc b(defpackage.gxd gxdVar) {
        defpackage.ipc ipcVarB;
        if (gxdVar == null) {
            defpackage.aooh.i("id");
        }
        synchronized (this.b) {
            ipcVarB = this.a.b(gxdVar);
        }
        return ipcVarB;
    }

    @Override // defpackage.gtw
    public final defpackage.ipc c(defpackage.gxd gxdVar) {
        defpackage.ipc ipcVarC;
        synchronized (this.b) {
            ipcVarC = this.a.c(gxdVar);
        }
        return ipcVarC;
    }
}
