package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aj implements enh {
    final /* synthetic */ defpackage.al a;

    public aj(defpackage.al alVar) {
        this.a = alVar;
    }

    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj) {
        if (((emx) obj) != null) {
            defpackage.al alVar = this.a;
            if (alVar.c) {
                android.view.View viewN = alVar.N();
                if (viewN.getParent() != null) {
                    throw new java.lang.IllegalStateException("DialogFragment can not be attached to a container view");
                }
                if (alVar.d != null) {
                    if (bo.Z(3)) {
                        android.util.Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + alVar.d);
                    }
                    alVar.d.setContentView(viewN);
                }
            }
        }
    }
}
