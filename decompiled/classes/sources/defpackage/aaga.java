package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class aaga {
    public java.lang.Object e;
    public boolean f;
    final /* synthetic */ defpackage.aagf g;

    public aaga(defpackage.aagf aagfVar, java.lang.Object obj) {
        j$.util.Objects.requireNonNull(aagfVar);
        this.g = aagfVar;
        this.e = obj;
        this.f = false;
    }

    protected abstract void c();

    public final void d() {
        synchronized (this) {
            this.e = null;
        }
    }

    public final void e() {
        d();
        java.util.ArrayList arrayList = this.g.h;
        synchronized (arrayList) {
            arrayList.remove(this);
        }
    }
}
