package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hci implements cer {
    public final cer a;
    private final ccp b;
    private final ccp c;
    private final cer d;
    private final aosi e = new aosi((aoub) null);

    public hci() {
        cdu cduVar = cdu.c;
        this.b = new androidx.compose.runtime.ParcelableSnapshotMutableState((java.lang.Object) null, cduVar);
        this.c = new androidx.compose.runtime.ParcelableSnapshotMutableState((java.lang.Object) null, cduVar);
        defpackage.fxt fxtVar = new defpackage.fxt(this, 17);
        ajxw ajxwVar = ceo.a;
        new cbk(fxtVar, (cen) null);
        this.d = new cbk(new defpackage.fxt(this, 18), (cen) null);
        new cbk(new defpackage.fxt(this, 19), (cen) null);
        this.a = new cbk(new defpackage.fxt(this, 20), (cen) null);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final defpackage.gzh a() {
        return (defpackage.gzh) this.b.a();
    }

    public final java.lang.Throwable c() {
        return (java.lang.Throwable) this.c.a();
    }

    public final synchronized void d(defpackage.gzh gzhVar) {
        aooh.f(gzhVar, "composition");
        if (f()) {
            return;
        }
        this.b.b(gzhVar);
        this.e.Q(gzhVar);
    }

    public final synchronized void e(java.lang.Throwable th) {
        if (f()) {
            return;
        }
        this.c.b(th);
        this.e.c(th);
    }

    public final boolean f() {
        return ((java.lang.Boolean) this.d.a()).booleanValue();
    }
}
