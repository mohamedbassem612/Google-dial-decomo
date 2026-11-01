package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gtx implements defpackage.gtw {
    public final java.util.Map a = new java.util.LinkedHashMap();

    @Override // defpackage.gtw
    public final boolean a(defpackage.gxd gxdVar) {
        throw null;
    }

    @Override // defpackage.gtw
    public final defpackage.ipc b(defpackage.gxd gxdVar) {
        if (gxdVar == null) {
            defpackage.aooh.i("id");
        }
        return (defpackage.ipc) this.a.remove(gxdVar);
    }

    @Override // defpackage.gtw
    public final defpackage.ipc c(defpackage.gxd gxdVar) {
        java.util.Map map = this.a;
        java.lang.Object ipcVar = map.get(gxdVar);
        if (ipcVar == null) {
            ipcVar = new defpackage.ipc(gxdVar);
            map.put(gxdVar, ipcVar);
        }
        return (defpackage.ipc) ipcVar;
    }
}
