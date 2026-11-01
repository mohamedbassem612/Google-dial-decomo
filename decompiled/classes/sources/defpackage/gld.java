package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gld {
    private static final defpackage.gkz b = new defpackage.glh(null);
    private static final java.lang.ThreadLocal c = new java.lang.ThreadLocal();
    static final java.util.ArrayList a = new java.util.ArrayList();

    static defpackage.aca a() {
        defpackage.aca acaVar;
        java.lang.ThreadLocal threadLocal = c;
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) threadLocal.get();
        if (weakReference != null && (acaVar = (defpackage.aca) weakReference.get()) != null) {
            return acaVar;
        }
        defpackage.aca acaVar2 = new defpackage.aca();
        threadLocal.set(new java.lang.ref.WeakReference(acaVar2));
        return acaVar2;
    }

    public static void b(android.view.ViewGroup viewGroup, defpackage.gkz gkzVar) {
        java.util.ArrayList arrayList = a;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (gkzVar == null) {
            gkzVar = b;
        }
        defpackage.gkz gkzVarClone = gkzVar.clone();
        d(viewGroup, gkzVarClone);
        viewGroup.setTag(2131429315, null);
        c(viewGroup, gkzVarClone);
    }

    public static void c(android.view.ViewGroup viewGroup, defpackage.gkz gkzVar) {
        if (gkzVar == null || viewGroup == null) {
            return;
        }
        glc glcVar = new glc(gkzVar, viewGroup);
        viewGroup.addOnAttachStateChangeListener(glcVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(glcVar);
    }

    public static void d(android.view.ViewGroup viewGroup, defpackage.gkz gkzVar) {
        java.util.ArrayList arrayList = (java.util.ArrayList) a().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((defpackage.gkz) arrayList.get(i)).t(viewGroup);
            }
        }
        if (gkzVar != null) {
            gkzVar.p(viewGroup, true);
        }
        if (((fsu) viewGroup.getTag(2131429315)) != null) {
            throw null;
        }
    }
}
