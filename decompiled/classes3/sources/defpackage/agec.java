package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
class agec extends glp {
    private final defpackage.ageg x;
    private final defpackage.ageg y;
    private final java.util.List z = new java.util.ArrayList();

    protected agec(defpackage.ageg agegVar, defpackage.ageg agegVar2) {
        this.x = agegVar;
        this.y = agegVar2;
    }

    private final android.animation.Animator S(android.view.ViewGroup viewGroup, android.view.View view, boolean z) {
        int iU;
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        T(arrayList, this.x, viewGroup, view, z);
        T(arrayList, this.y, viewGroup, view, z);
        java.util.Iterator it = this.z.iterator();
        while (it.hasNext()) {
            T(arrayList, (defpackage.ageg) it.next(), viewGroup, view, z);
        }
        android.content.Context context = viewGroup.getContext();
        int i = defpackage.agef.a;
        if (((gkz) this).b == -1 && (iU = agab.u(context, 2130970054, -1)) != -1) {
            K(iU);
        }
        android.animation.TimeInterpolator timeInterpolator = afpc.b;
        if (((gkz) this).c == null) {
            L(agab.C(context, 2130970071, timeInterpolator));
        }
        afsq.h(animatorSet, arrayList);
        return animatorSet;
    }

    private static void T(java.util.List list, defpackage.ageg agegVar, android.view.ViewGroup viewGroup, android.view.View view, boolean z) {
        if (agegVar != null) {
            android.animation.Animator animatorA = z ? agegVar.a(viewGroup, view) : agegVar.b(viewGroup, view);
            if (animatorA != null) {
                list.add(animatorA);
            }
        }
    }

    public final android.animation.Animator f(android.view.ViewGroup viewGroup, android.view.View view, gli gliVar, gli gliVar2) {
        return S(viewGroup, view, false);
    }

    public final android.animation.Animator g(android.view.ViewGroup viewGroup, android.view.View view, gli gliVar) {
        return S(viewGroup, view, true);
    }
}
