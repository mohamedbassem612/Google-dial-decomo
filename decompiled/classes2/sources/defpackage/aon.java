package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aon implements ati {
    public static final ckb a = new dko(new defpackage.aem(3), new nq(20), 1);
    public float c;
    private final cei k;
    public final cei d = new androidx.compose.runtime.ParcelableSnapshotMutableIntState(0);
    public final cei e = new androidx.compose.runtime.ParcelableSnapshotMutableIntState(0);
    public final ccp b = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, cdu.c);
    public final kaw g = new kaw((byte[]) null, (char[]) null, (byte[]) null);
    public final cei f = new androidx.compose.runtime.ParcelableSnapshotMutableIntState(androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY);
    private final ati h = new aqo(new agb(this, 15));
    private final cer i = new cbg(new defpackage.mq(this, 15));
    private final cer j = new cbg(new defpackage.mq(this, 16));

    public aon(int i) {
        this.k = new androidx.compose.runtime.ParcelableSnapshotMutableIntState(i);
    }

    public final float a(float f) {
        return this.h.a(f);
    }

    public final int b() {
        return this.f.c();
    }

    public final int c() {
        return this.k.c();
    }

    public final java.lang.Object d(defpackage.aoc aocVar, aonn aonnVar, aoln aolnVar) {
        java.lang.Object objD = this.h.d(aocVar, aonnVar, aolnVar);
        return objD != aolu.a ? aojh.a : objD;
    }

    public final void e(int i) {
        this.k.h(i);
    }

    public final boolean f() {
        return ((java.lang.Boolean) this.j.a()).booleanValue();
    }

    public final boolean g() {
        return ((java.lang.Boolean) this.i.a()).booleanValue();
    }

    public final boolean h() {
        return this.h.h();
    }
}
