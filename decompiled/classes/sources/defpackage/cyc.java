package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cyc implements defpackage.cyb {
    public defpackage.aomy a;

    public cyc(byte[] bArr) {
        this.a = null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [cxi, java.lang.Object] */
    @Override // defpackage.cyb
    public final defpackage.cxi dd(defpackage.czb czbVar) {
        defpackage.aomy aomyVar = this.a;
        if (aomyVar == null) {
            defpackage.aooh.g();
        }
        return aomyVar.a();
    }

    @Override // defpackage.cyb
    public final defpackage.cxi de(defpackage.cxi cxiVar) {
        defpackage.cya cyaVar;
        defpackage.cya cyaVar2 = cxiVar instanceof defpackage.cya ? (defpackage.cya) cxiVar : null;
        if (cyaVar2 != null) {
            return cyaVar2;
        }
        if (cxiVar == null) {
            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        }
        defpackage.dck dckVar = (defpackage.dck) cxiVar;
        defpackage.dbu dbuVarD = dckVar.D();
        return (dbuVarD == null || (cyaVar = dbuVarD.s) == null) ? dckVar : cyaVar;
    }

    @Override // defpackage.cyb
    public final /* synthetic */ long df(defpackage.cxi cxiVar, defpackage.cxi cxiVar2, boolean z) {
        return defpackage.den.B(this, cxiVar, cxiVar2, z);
    }

    public cyc() {
        this(null);
    }
}
