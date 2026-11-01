package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class yfb implements android.view.ViewTreeObserver.OnPreDrawListener {
    private final /* synthetic */ int $cid;
    private final java.lang.ref.WeakReference a;

    public yfb(defpackage.aljb aljbVar, int i) {
        this.$cid = i;
        this.a = new java.lang.ref.WeakReference(aljbVar);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i = 0;
        if (this.$cid != 0) {
            if (android.util.Log.isLoggable("CustomViewTarget", 2)) {
                android.util.Log.v("CustomViewTarget", "OnGlobalLayoutListener called attachStateListener=".concat(toString()));
            }
            defpackage.aljb aljbVar = (defpackage.aljb) this.a.get();
            if (aljbVar != null) {
                ?? r0 = aljbVar.a;
                if (!r0.isEmpty()) {
                    int iC = aljbVar.c();
                    int iB = aljbVar.b();
                    if (defpackage.aljb.e(iC, iB)) {
                        java.util.ArrayList arrayList = new java.util.ArrayList((java.util.Collection) r0);
                        int size = arrayList.size();
                        while (i < size) {
                            ((defpackage.yez) arrayList.get(i)).g(iC, iB);
                            i++;
                        }
                        aljbVar.d();
                    }
                }
            }
        } else {
            if (android.util.Log.isLoggable("ViewTarget", 2)) {
                android.util.Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=".concat(toString()));
            }
            vwb vwbVar = (vwb) this.a.get();
            if (vwbVar != null) {
                ?? r1 = vwbVar.b;
                if (!r1.isEmpty()) {
                    int iO = vwbVar.o();
                    int iN = vwbVar.n();
                    if (vwb.q(iO, iN)) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList((java.util.Collection) r1);
                        int size2 = arrayList2.size();
                        while (i < size2) {
                            ((defpackage.yez) arrayList2.get(i)).g(iO, iN);
                            i++;
                        }
                        vwbVar.p();
                    }
                }
            }
        }
        return true;
    }

    public yfb(vwb vwbVar, int i) {
        this.$cid = i;
        this.a = new java.lang.ref.WeakReference(vwbVar);
    }
}
