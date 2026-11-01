package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class daf extends defpackage.dac {
    private final defpackage.ccp a = new androidx.compose.runtime.ParcelableSnapshotMutableState(null, defpackage.cdu.c);
    private final oq b;

    public daf(oq oqVar) {
        this.b = oqVar;
    }

    @Override // defpackage.dac
    public final java.lang.Object a(oq oqVar) {
        if (oqVar != this.b) {
            defpackage.cwh.d("Check failed.");
        }
        java.lang.Object objA = this.a.a();
        if (objA == null) {
            return null;
        }
        return objA;
    }

    @Override // defpackage.dac
    public final void b(oq oqVar, java.lang.Object obj) {
        if (oqVar != this.b) {
            defpackage.cwh.d("Check failed.");
        }
        this.a.b(obj);
    }

    @Override // defpackage.dac
    public final boolean c(oq oqVar) {
        return oqVar == this.b;
    }
}
