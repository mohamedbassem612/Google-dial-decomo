package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class leo implements defpackage.ouh {
    private final defpackage.lev a;
    private final defpackage.lee b;
    private final defpackage.mba c;
    private final qbe d;
    private final ipc e;

    public leo(defpackage.lev levVar, defpackage.lee leeVar, ipc ipcVar, qbe qbeVar, defpackage.mba mbaVar) {
        this.a = levVar;
        this.b = leeVar;
        this.e = ipcVar;
        this.d = qbeVar;
        this.c = mbaVar;
    }

    @Override // defpackage.ouh
    public final void a() {
        defpackage.lbn lbnVar = new defpackage.lbn(2);
        defpackage.lee leeVar = this.b;
        agsm.i(258, leeVar.c.p(leeVar.d.bl(lbnVar)), "failed to update call screen app states when call screen is clicked", new java.lang.Object[0]);
        this.e.bm(rmu.A);
        this.d.a(qbc.G);
        this.c.b(mce.ay);
        this.a.d();
    }
}
