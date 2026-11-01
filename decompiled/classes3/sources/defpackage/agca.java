package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agca {
    public int a;
    public boolean b;
    public final java.lang.Object c;

    public agca(int i, defpackage.aprf aprfVar) {
        this.c = new java.lang.ref.WeakReference(aprfVar);
        this.a = i;
    }

    final boolean a(defpackage.aprf aprfVar) {
        return aprfVar != null && ((java.lang.ref.WeakReference) this.c).get() == aprfVar;
    }

    public agca(com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton) {
        this.b = false;
        this.a = 0;
        this.c = floatingActionButton;
    }
}
