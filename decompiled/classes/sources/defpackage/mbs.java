package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class mbs implements defpackage.zbp {
    private final defpackage.ipc a;

    public mbs(defpackage.ipc ipcVar) {
        this.a = ipcVar;
    }

    @Override // defpackage.zbp
    public final void a(defpackage.zbo zboVar) {
        if (zboVar instanceof defpackage.zbu) {
            defpackage.zbu zbuVar = (defpackage.zbu) zboVar;
            this.a.aO(zbuVar.b, zbuVar.d, zbuVar.e);
        }
    }
}
