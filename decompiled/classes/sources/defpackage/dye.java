package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class dye {
    private static final android.view.View.AccessibilityDelegate a = new android.view.View.AccessibilityDelegate();
    public final android.view.View.AccessibilityDelegate A;
    private final android.view.View.AccessibilityDelegate b;

    public dye(android.view.View.AccessibilityDelegate accessibilityDelegate) {
        this.b = accessibilityDelegate;
        this.A = new defpackage.dyd(this);
    }

    static java.util.List N(android.view.View view) {
        java.util.List list = (java.util.List) view.getTag(2131429218);
        return list == null ? java.util.Collections.EMPTY_LIST : list;
    }

    public defpackage.ebg a(android.view.View view) {
        android.view.accessibility.AccessibilityNodeProvider accessibilityNodeProvider = this.b.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new defpackage.ebg(accessibilityNodeProvider);
        }
        return null;
    }

    public void b(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        this.b.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void c(android.view.View view, ebd ebdVar) {
        this.b.onInitializeAccessibilityNodeInfo(view, ebdVar.a);
    }

    public void d(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        this.b.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void e(android.view.View view, int i) {
        this.b.sendAccessibilityEvent(view, i);
    }

    public void f(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        this.b.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public boolean g(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return this.b.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean h(android.view.ViewGroup viewGroup, android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return this.b.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean i(android.view.View view, int i, android.os.Bundle bundle) {
        boolean zPerformAccessibilityAction;
        java.lang.ref.WeakReference weakReference;
        android.text.style.ClickableSpan clickableSpan;
        java.util.List listN = N(view);
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 < listN.size()) {
                ebc ebcVar = (ebc) listN.get(i2);
                if (ebcVar.a() == i) {
                    if (ebcVar.v != null) {
                        java.lang.Class cls = ebcVar.u;
                        if (cls != null) {
                            try {
                            } catch (java.lang.Exception e) {
                                java.lang.Class cls2 = ebcVar.u;
                                android.util.Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(java.lang.String.valueOf(cls2 == null ? "null" : cls2.getName())), e);
                            }
                        }
                        zPerformAccessibilityAction = ebcVar.v.a(view);
                        break;
                    }
                } else {
                    i2++;
                }
            }
            zPerformAccessibilityAction = false;
            break;
        }
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.b.performAccessibilityAction(view, i, bundle);
        }
        if (zPerformAccessibilityAction || i != 2131427346 || bundle == null) {
            return zPerformAccessibilityAction;
        }
        int i3 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        android.util.SparseArray sparseArray = (android.util.SparseArray) view.getTag(2131429219);
        if (sparseArray != null && (weakReference = (java.lang.ref.WeakReference) sparseArray.get(i3)) != null && (clickableSpan = (android.text.style.ClickableSpan) weakReference.get()) != null) {
            java.lang.CharSequence text = view.createAccessibilityNodeInfo().getText();
            android.text.style.ClickableSpan[] clickableSpanArr = text instanceof android.text.Spanned ? (android.text.style.ClickableSpan[]) ((android.text.Spanned) text).getSpans(0, text.length(), android.text.style.ClickableSpan.class) : null;
            for (int i4 = 0; clickableSpanArr != null && i4 < clickableSpanArr.length; i4++) {
                if (clickableSpan.equals(clickableSpanArr[i4])) {
                    clickableSpan.onClick(view);
                    z = true;
                    break;
                }
            }
        }
        return z;
    }

    public dye() {
        this(a);
    }
}
