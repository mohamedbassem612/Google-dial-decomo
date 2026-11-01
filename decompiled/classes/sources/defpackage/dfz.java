package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dfz implements defpackage.dgn {
    public defpackage.ccp a;
    private defpackage.aomy b;
    private final defpackage.ccp c = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, defpackage.cdu.c);

    public dfz() {
        new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, defpackage.cdu.c);
    }

    @Override // defpackage.dgn
    public final long a() {
        if (this.a == null) {
            defpackage.aomy aomyVar = this.b;
            this.a = new androidx.compose.runtime.ParcelableSnapshotMutableState(aomyVar != null ? aomyVar.a() : dfp.a, defpackage.cdu.c);
            this.b = null;
        }
        defpackage.ccp ccpVar = this.a;
        if (ccpVar == null) {
            defpackage.aooh.g();
        }
        return ((dfp) ccpVar.a()).c;
    }

    @Override // defpackage.dgn
    public final long b() {
        if (this.a == null) {
            defpackage.aomy aomyVar = this.b;
            this.a = new androidx.compose.runtime.ParcelableSnapshotMutableState(aomyVar != null ? aomyVar.a() : dfp.a, defpackage.cdu.c);
            this.b = null;
        }
        defpackage.ccp ccpVar = this.a;
        if (ccpVar == null) {
            defpackage.aooh.g();
        }
        return ((dfp) ccpVar.a()).b;
    }

    public final void c(defpackage.aomy aomyVar) {
        if (this.a == null) {
            this.b = aomyVar;
        }
    }

    public final void d(boolean z) {
        this.c.b(java.lang.Boolean.valueOf(z));
    }
}
