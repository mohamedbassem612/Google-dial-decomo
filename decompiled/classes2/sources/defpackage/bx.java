package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bx {
    public static final defpackage.ce a = new defpackage.cd();
    public static final defpackage.ce b;

    static {
        defpackage.ce ceVar = null;
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("gks");
            aooh.d(cls, "null cannot be cast to non-null type java.lang.Class<androidx.fragment.app.FragmentTransitionImpl>");
            ceVar = (defpackage.ce) cls.getDeclaredConstructor(null).newInstance(null);
        } catch (java.lang.Exception unused) {
        }
        b = ceVar;
    }

    public static final void a(java.util.List list, int i) {
        aooh.f(list, "views");
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((android.view.View) it.next()).setVisibility(i);
        }
    }

    public static final void b(aw awVar, aw awVar2) {
        aooh.f(awVar, "inFragment");
        aooh.f(awVar2, "outFragment");
    }
}
