package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class caw implements cdl {
    final /* synthetic */ defpackage.cck a;
    final /* synthetic */ cbb b;

    public caw(cbb cbbVar, defpackage.cck cckVar) {
        this.b = cbbVar;
        this.a = cckVar;
    }

    public final int c(cdk cdkVar, java.lang.Object obj) {
        cdl cdlVar = this.b;
        if (true != (cdlVar instanceof cdl)) {
            cdlVar = null;
        }
        int iC = cdlVar != null ? cdlVar.c(cdkVar, obj) : 1;
        if (iC != 1) {
            return iC;
        }
        defpackage.cck cckVar = this.a;
        cckVar.d = ajsz.bU(cckVar.d, new aoiu(cdkVar, obj));
        return 2;
    }

    public final void b() {
    }

    public final void a(java.lang.Object obj) {
    }
}
