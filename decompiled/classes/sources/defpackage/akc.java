package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class akc extends defpackage.all {
    private final defpackage.ccp a;
    private final defpackage.ccp b;

    public akc(java.lang.Object obj) {
        defpackage.cdu cduVar = defpackage.cdu.c;
        this.a = new androidx.compose.runtime.ParcelableSnapshotMutableState(obj, cduVar);
        this.b = new androidx.compose.runtime.ParcelableSnapshotMutableState(obj, cduVar);
    }

    @Override // defpackage.all
    public final java.lang.Object a() {
        return this.a.a();
    }

    @Override // defpackage.all
    public final java.lang.Object b() {
        return this.b.a();
    }

    @Override // defpackage.all
    public final void c(java.lang.Object obj) {
        this.a.b(obj);
    }

    public final void f(java.lang.Object obj) {
        this.b.b(obj);
    }

    public final boolean g() {
        return defpackage.aooh.n(a(), b()) && !w();
    }

    @Override // defpackage.all
    public final void e() {
    }

    @Override // defpackage.all
    public final void d(defpackage.alg algVar) {
    }
}
