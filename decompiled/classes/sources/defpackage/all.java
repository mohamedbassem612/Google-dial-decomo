package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class all {
    private final defpackage.ccp a = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, defpackage.cdu.c);

    public abstract java.lang.Object a();

    public abstract java.lang.Object b();

    public abstract void c(java.lang.Object obj);

    public abstract void d(defpackage.alg algVar);

    public abstract void e();

    public final void v(boolean z) {
        this.a.b(java.lang.Boolean.valueOf(z));
    }

    public final boolean w() {
        return ((java.lang.Boolean) this.a.a()).booleanValue();
    }
}
