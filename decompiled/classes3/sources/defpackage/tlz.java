package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tlz implements defpackage.ahjd {
    private final /* synthetic */ int $cid;
    public final ipc a;

    public tlz(ipc ipcVar, int i) {
        this.$cid = i;
        this.a = ipcVar;
    }

    @Override // defpackage.ahjd
    public final defpackage.ahjc a(apjb apjbVar) {
        if (this.$cid == 0) {
            return new iwz(this, 9);
        }
        defpackage.ryg rygVarAU = pez.aU(defpackage.rvq.a.m());
        defpackage.ryg rygVarAS = pez.aS(defpackage.rvo.a.m());
        rygVarAS.k(defpackage.rvc.CALL_RECORDING);
        rygVarAU.o(rygVarAS.i());
        return new iwz(this.a.aL(rygVarAU.n()), 4);
    }
}
