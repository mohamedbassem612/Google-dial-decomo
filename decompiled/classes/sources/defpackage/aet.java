package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aet implements defpackage.cyz {
    public final defpackage.ccp a;
    public final defpackage.ccp b;

    public aet(boolean z) {
        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z);
        defpackage.cdu cduVar = defpackage.cdu.c;
        this.a = new androidx.compose.runtime.ParcelableSnapshotMutableState(boolValueOf, cduVar);
        this.b = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, cduVar);
    }

    @Override // defpackage.cmw
    public final /* synthetic */ defpackage.cmw a(defpackage.cmw cmwVar) {
        return defpackage.cfo.k(this, cmwVar);
    }

    @Override // defpackage.cmw
    public final /* synthetic */ java.lang.Object b(java.lang.Object obj, defpackage.aonn aonnVar) {
        return aonnVar.a(obj, this);
    }

    @Override // defpackage.cmw
    public final /* synthetic */ boolean c(defpackage.aonj aonjVar) {
        return defpackage.den.W(this, aonjVar);
    }

    @Override // defpackage.cyz
    public final java.lang.Object d(defpackage.dpf dpfVar) {
        return this;
    }
}
