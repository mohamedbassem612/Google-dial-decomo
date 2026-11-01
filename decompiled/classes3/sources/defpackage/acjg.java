package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acjg {
    public static final aiof a = aiof.i("GnpSdk");
    public final java.util.Set b;

    public acjg(java.util.Set set) {
        this.b = set;
        a.b().l("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/base/TargetElementFinder", "<init>", 27, "TargetElementFinder.java").y("set is %s.", set);
    }

    public static android.view.View a(android.app.Activity activity, android.view.View view, ahyc ahycVar) {
        android.view.View viewN;
        android.view.View viewB = b(view, ahycVar);
        return (viewB != null || (viewN = aesg.n(activity)) == null) ? viewB : b(viewN, ahycVar);
    }

    private static android.view.View b(android.view.View view, ahyc ahycVar) {
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        arrayDeque.add(view);
        while (!arrayDeque.isEmpty()) {
            android.view.View view2 = (android.view.View) arrayDeque.poll();
            if (((java.lang.Boolean) ahycVar.apply(view2)).booleanValue()) {
                return view2;
            }
            if (view2 instanceof android.view.ViewGroup) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    arrayDeque.offer(viewGroup.getChildAt(i));
                }
            }
        }
        return null;
    }
}
