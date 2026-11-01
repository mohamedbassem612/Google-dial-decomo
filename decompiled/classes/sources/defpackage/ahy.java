package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahy {
    private final defpackage.ccp a;
    private final defpackage.ccp b;
    private final defpackage.ccp c;
    private final defpackage.ccp d;
    private final defpackage.ccp e;
    private final defpackage.ccp f;
    private final defpackage.ceg g;
    private final defpackage.ceg h;

    public ahy() {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        defpackage.cdu cduVar = defpackage.cdu.c;
        this.a = new androidx.compose.runtime.ParcelableSnapshotMutableState(bool, cduVar);
        this.g = new androidx.compose.runtime.ParcelableSnapshotMutableFloatState(1.0f);
        this.b = new androidx.compose.runtime.ParcelableSnapshotMutableState(bool, cduVar);
        this.h = new androidx.compose.runtime.ParcelableSnapshotMutableFloatState(1.0f);
        this.c = new androidx.compose.runtime.ParcelableSnapshotMutableState(bool, cduVar);
        this.d = new androidx.compose.runtime.ParcelableSnapshotMutableState(new defpackage.crg(defpackage.mni.bj(0.5f, 0.5f)), cduVar);
        this.e = new androidx.compose.runtime.ParcelableSnapshotMutableState(bool, cduVar);
        this.f = new androidx.compose.runtime.ParcelableSnapshotMutableState(new defpackage.cqg(defpackage.cfd.M(0)), cduVar);
    }

    public final float a() {
        return this.g.c();
    }

    public final float b() {
        return this.h.c();
    }

    public final long c() {
        return ((defpackage.crg) this.d.a()).a;
    }

    public final long d() {
        return ((defpackage.cqg) this.f.a()).a;
    }

    public final void e() {
        this.g.h(1.0f);
        this.a.b(java.lang.Boolean.FALSE);
        this.h.h(1.0f);
        this.b.b(java.lang.Boolean.FALSE);
        this.d.b(new defpackage.crg(defpackage.mni.bj(0.5f, 0.5f)));
        this.c.b(java.lang.Boolean.FALSE);
        this.f.b(new defpackage.cqg(defpackage.cfd.M(0)));
        this.e.b(java.lang.Boolean.FALSE);
    }

    public final boolean f() {
        return ((java.lang.Boolean) this.a.a()).booleanValue();
    }

    public final boolean g() {
        return ((java.lang.Boolean) this.b.a()).booleanValue();
    }

    public final boolean h() {
        return ((java.lang.Boolean) this.c.a()).booleanValue();
    }

    public final boolean i() {
        return ((java.lang.Boolean) this.e.a()).booleanValue();
    }
}
