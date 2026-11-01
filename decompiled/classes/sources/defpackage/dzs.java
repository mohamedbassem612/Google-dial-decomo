package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dzs {
    public static final /* synthetic */ int a = 0;
    private static java.util.WeakHashMap b;
    private static final int[] c = {2131427349, 2131427350, 2131427361, 2131427372, 2131427375, 2131427376, 2131427377, 2131427378, 2131427379, 2131427380, 2131427351, 2131427352, 2131427353, 2131427354, 2131427355, 2131427356, 2131427357, 2131427358, 2131427359, 2131427360, 2131427362, 2131427363, 2131427364, 2131427365, 2131427366, 2131427367, 2131427368, 2131427369, 2131427370, 2131427371, 2131427373, 2131427374};
    private static final defpackage.dzi d = new defpackage.dzi();

    public static int a(android.view.View view, java.lang.CharSequence charSequence, defpackage.ebo eboVar) {
        int iA;
        java.util.List listP = p(view);
        int i = 0;
        while (true) {
            if (i >= listP.size()) {
                int i2 = -1;
                for (int i3 = 0; i3 < 32 && i2 == -1; i3++) {
                    i2 = c[i3];
                    boolean z = true;
                    for (int i4 = 0; i4 < listP.size(); i4++) {
                        z &= ((ebc) listP.get(i4)).a() != i2;
                    }
                    if (true != z) {
                        i2 = -1;
                    }
                }
                iA = i2;
                break;
            }
            if (android.text.TextUtils.equals(charSequence, ((ebc) listP.get(i)).b())) {
                iA = ((ebc) listP.get(i)).a();
                break;
            }
            i++;
        }
        if (iA != -1) {
            q(view, new ebc((java.lang.Object) null, iA, charSequence, eboVar, (java.lang.Class) null));
        }
        return iA;
    }

    public static defpackage.dye b(android.view.View view) {
        android.view.View.AccessibilityDelegate accessibilityDelegateA = defpackage.dzp.a(view);
        if (accessibilityDelegateA == null) {
            return null;
        }
        return accessibilityDelegateA instanceof defpackage.dyd ? ((defpackage.dyd) accessibilityDelegateA).a : new defpackage.dye(accessibilityDelegateA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static dyl c(android.view.View view, dyl dylVar) {
        if (android.util.Log.isLoggable("ViewCompat", 3)) {
            android.util.Log.d("ViewCompat", "performReceiveContent: " + dylVar + ", view=" + view.getClass().getSimpleName() + '[' + view.getId() + ']');
        }
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return dzr.a(view, dylVar);
        }
        if (((dzr) view.getTag(2131429228)) == null) {
            return view.a(dylVar);
        }
        dyl dylVarK = dzr.k(view, dylVar);
        if (dylVarK == null) {
            return null;
        }
        return view.a(dylVarK);
    }

    public static defpackage.eax d(android.view.View view, defpackage.eax eaxVar) {
        android.view.WindowInsets windowInsetsE = eaxVar.e();
        if (windowInsetsE == null) {
            return eaxVar;
        }
        android.view.WindowInsets windowInsetsA = defpackage.dzq.a(view, windowInsetsE);
        return !windowInsetsA.equals(windowInsetsE) ? defpackage.eax.q(windowInsetsA, view) : eaxVar;
    }

    public static defpackage.eax e(android.view.View view, defpackage.eax eaxVar) {
        android.view.WindowInsets windowInsetsE = eaxVar.e();
        if (windowInsetsE == null) {
            return eaxVar;
        }
        android.view.WindowInsets windowInsetsOnApplyWindowInsets = view.onApplyWindowInsets(windowInsetsE);
        return !windowInsetsOnApplyWindowInsets.equals(windowInsetsE) ? defpackage.eax.q(windowInsetsOnApplyWindowInsets, view) : eaxVar;
    }

    public static void f(android.view.ViewGroup viewGroup, android.view.View view) {
        viewGroup.getOverlay().add(view);
        android.view.View view2 = (android.view.View) view.getParent();
        defpackage.aooh.f(view2, "<this>");
        view2.setTag(2131429433, viewGroup);
    }

    public static void g(android.view.View view, int i) {
        r(i, view);
        n(view);
    }

    public static void h(android.view.View view, ebc ebcVar, java.lang.CharSequence charSequence, defpackage.ebo eboVar) {
        if (eboVar == null && charSequence == null) {
            g(view, ebcVar.a());
        } else {
            q(view, new ebc((java.lang.Object) null, ebcVar.t, charSequence, eboVar, ebcVar.u));
        }
    }

    public static void i(android.view.View view, defpackage.dye dyeVar) {
        if (dyeVar == null && (defpackage.dzp.a(view) instanceof defpackage.dyd)) {
            dyeVar = new defpackage.dye();
        }
        l(view);
        view.setAccessibilityDelegate(dyeVar == null ? null : dyeVar.A);
    }

    public static void j(android.view.View view, boolean z) {
        java.lang.Boolean.valueOf(z).getClass();
        defpackage.dzo.c(view, z);
    }

    public static void k(android.view.View view, java.lang.CharSequence charSequence) {
        defpackage.dzo.d(view, charSequence);
        defpackage.dzi dziVar = d;
        if (charSequence == null) {
            dziVar.a.remove(view);
            view.removeOnAttachStateChangeListener(dziVar);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(dziVar);
            return;
        }
        java.util.WeakHashMap weakHashMap = dziVar.a;
        boolean z = false;
        if (view.isShown() && view.getWindowVisibility() == 0) {
            z = true;
        }
        weakHashMap.put(view, java.lang.Boolean.valueOf(z));
        view.addOnAttachStateChangeListener(dziVar);
        if (view.isAttachedToWindow()) {
            dziVar.a(view);
        }
    }

    public static void l(android.view.View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    public static java.lang.String[] m(android.view.View view) {
        return android.os.Build.VERSION.SDK_INT >= 31 ? dzr.b(view) : (java.lang.String[]) view.getTag(2131429229);
    }

    static void n(android.view.View view) {
        if (((android.view.accessibility.AccessibilityManager) view.getContext().getSystemService("accessibility")).isEnabled()) {
            boolean z = defpackage.dzo.a(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() == 0 && !z) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, 0);
                        return;
                    } catch (java.lang.AbstractMethodError e) {
                        android.util.Log.e("ViewCompat", java.lang.String.valueOf(view.getParent().getClass().getSimpleName()).concat(" does not fully implement ViewParent"), e);
                        return;
                    }
                }
                return;
            }
            int i = true != z ? 2048 : 32;
            android.view.accessibility.AccessibilityEvent accessibilityEventObtain = android.view.accessibility.AccessibilityEvent.obtain();
            accessibilityEventObtain.setEventType(i);
            accessibilityEventObtain.setContentChangeTypes(0);
            if (z) {
                accessibilityEventObtain.getText().add(defpackage.dzo.a(view));
                l(view);
            }
            view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
        }
    }

    @java.lang.Deprecated
    public static ni o(android.view.View view) {
        java.util.WeakHashMap weakHashMap = b;
        if (weakHashMap == null) {
            weakHashMap = new java.util.WeakHashMap();
            b = weakHashMap;
        }
        ni niVar = (ni) weakHashMap.get(view);
        if (niVar != null) {
            return niVar;
        }
        ni niVar2 = new ni(view);
        b.put(view, niVar2);
        return niVar2;
    }

    private static java.util.List p(android.view.View view) {
        java.util.ArrayList arrayList = (java.util.ArrayList) view.getTag(2131429218);
        if (arrayList != null) {
            return arrayList;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        view.setTag(2131429218, arrayList2);
        return arrayList2;
    }

    private static void q(android.view.View view, ebc ebcVar) {
        defpackage.dye dyeVarB = b(view);
        if (dyeVarB == null) {
            dyeVarB = new defpackage.dye();
        }
        i(view, dyeVarB);
        r(ebcVar.a(), view);
        p(view).add(ebcVar);
        n(view);
    }

    private static void r(int i, android.view.View view) {
        java.util.List listP = p(view);
        for (int i2 = 0; i2 < listP.size(); i2++) {
            if (((ebc) listP.get(i2)).a() == i) {
                listP.remove(i2);
                return;
            }
        }
    }
}
