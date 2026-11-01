package androidx.core.view.insets;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class ProtectionLayout extends android.widget.FrameLayout {
    private static final java.lang.Object a = new java.lang.Object();
    private final java.util.List b;
    private defpackage.ebv c;

    public ProtectionLayout(android.content.Context context, java.util.List list) {
        super(context);
        this.b = new java.util.ArrayList();
        a(list);
    }

    private final void b() {
        defpackage.ecb ecbVar;
        java.util.List list = this.b;
        if (list.isEmpty()) {
            c();
            return;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) getRootView();
        java.lang.Object tag = viewGroup.getTag(2131429232);
        if (tag instanceof defpackage.ecb) {
            ecbVar = (defpackage.ecb) tag;
        } else {
            ecbVar = new defpackage.ecb(viewGroup);
            viewGroup.setTag(2131429232, ecbVar);
        }
        c();
        this.c = new defpackage.ebv(ecbVar, list);
        int childCount = getChildCount();
        int iA = this.c.a();
        for (int i = 0; i < iA; i++) {
            defpackage.ebu ebuVarB = this.c.b(i);
            android.content.Context context = getContext();
            int i2 = i + childCount;
            defpackage.ebt ebtVar = ebuVarB.b;
            int i3 = ebuVarB.a;
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, ebtVar.a, 48);
            dwn dwnVar = ebtVar.b;
            layoutParams.leftMargin = dwnVar.b;
            layoutParams.topMargin = dwnVar.c;
            layoutParams.rightMargin = dwnVar.d;
            layoutParams.bottomMargin = dwnVar.e;
            android.view.View view = new android.view.View(context);
            view.setTag(a);
            view.setTranslationX(0.0f);
            view.setTranslationY(ebtVar.e);
            view.setAlpha(ebtVar.f);
            view.setVisibility(true != ebtVar.c ? 8 : 0);
            view.setBackground(ebtVar.d);
            ebtVar.a(new defpackage.ebw(layoutParams, view));
            addView(view, i2, layoutParams);
        }
    }

    private final void c() {
        defpackage.ebv ebvVar;
        if (this.c != null) {
            removeViews(getChildCount() - this.c.a(), this.c.a());
            int iA = this.c.a();
            int i = 0;
            while (true) {
                ebvVar = this.c;
                if (i >= iA) {
                    break;
                }
                ebvVar.b(i).b.a(null);
                i++;
            }
            if (!ebvVar.e) {
                ebvVar.e = true;
                ebvVar.b.b.remove(ebvVar);
                java.util.ArrayList arrayList = ebvVar.a;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else {
                        ((defpackage.ebu) arrayList.get(size)).e = null;
                    }
                }
                arrayList.clear();
            }
            this.c = null;
        }
    }

    public final void a(java.util.List list) {
        java.util.List list2 = this.b;
        list2.clear();
        list2.addAll(list);
        if (isAttachedToWindow()) {
            b();
            requestApplyInsets();
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        if (view != null && view.getTag() != a) {
            defpackage.ebv ebvVar = this.c;
            int childCount = getChildCount() - (ebvVar != null ? ebvVar.a() : 0);
            if (i > childCount || i < 0) {
                i = childCount;
            }
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) getRootView();
        java.lang.Object tag = viewGroup.getTag(2131429232);
        if (tag instanceof defpackage.ecb) {
            defpackage.ecb ecbVar = (defpackage.ecb) tag;
            if (ecbVar.b.isEmpty()) {
                ecbVar.a.post(new defpackage.drn(ecbVar, 2));
                viewGroup.setTag(2131429232, null);
            }
        }
    }

    public ProtectionLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProtectionLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ProtectionLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.b = new java.util.ArrayList();
    }

    public ProtectionLayout(android.content.Context context) {
        super(context);
        this.b = new java.util.ArrayList();
    }
}
