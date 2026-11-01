package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aqo implements defpackage.ati {
    public final defpackage.aonj a;
    public final defpackage.ccp c;
    public final defpackage.ccp d;
    public final defpackage.ccp e;
    public final defpackage.asv b = new defpackage.aqn(this);
    public final defpackage.nf f = new defpackage.nf((char[]) null, (byte[]) null, (byte[]) null);

    public aqo(defpackage.aonj aonjVar) {
        this.a = aonjVar;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        defpackage.cdu cduVar = defpackage.cdu.c;
        this.c = new androidx.compose.runtime.ParcelableSnapshotMutableState(bool, cduVar);
        this.d = new androidx.compose.runtime.ParcelableSnapshotMutableState(bool, cduVar);
        this.e = new androidx.compose.runtime.ParcelableSnapshotMutableState(bool, cduVar);
    }

    @Override // defpackage.ati
    public final float a(float f) {
        return ((java.lang.Number) this.a.a(java.lang.Float.valueOf(f))).floatValue();
    }

    @Override // defpackage.ati
    public final java.lang.Object d(aoc aocVar, defpackage.aonn aonnVar, defpackage.aoln aolnVar) throws java.lang.Throwable {
        java.lang.Object objM = defpackage.aosv.m(new amh(this, aocVar, aonnVar, (defpackage.aoln) null, 7), aolnVar);
        return objM != defpackage.aolu.a ? defpackage.aojh.a : objM;
    }

    @Override // defpackage.ati
    public final /* synthetic */ boolean f() {
        return true;
    }

    @Override // defpackage.ati
    public final /* synthetic */ boolean g() {
        return true;
    }

    @Override // defpackage.ati
    public final boolean h() {
        return ((java.lang.Boolean) this.c.a()).booleanValue();
    }
}
