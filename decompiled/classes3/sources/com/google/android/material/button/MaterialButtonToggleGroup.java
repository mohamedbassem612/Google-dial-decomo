package com.google.android.material.button;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class MaterialButtonToggleGroup extends defpackage.afrk {
    public final java.util.LinkedHashSet e;
    public boolean f;
    private boolean g;
    private boolean h;
    private final int i;
    private java.util.Set j;

    public MaterialButtonToggleGroup(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(agdv.a(context, attributeSet, i, 2132086109), attributeSet, i);
        this.e = new java.util.LinkedHashSet();
        this.f = false;
        this.j = new java.util.HashSet();
        android.content.res.TypedArray typedArrayA = afvl.a(getContext(), attributeSet, defpackage.afrn.d, i, 2132086109, new int[0]);
        boolean z = typedArrayA.getBoolean(7, false);
        if (this.g != z) {
            this.g = z;
            m(new java.util.HashSet());
        }
        java.lang.String strL = l();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            a(i2).d = strL;
        }
        this.i = typedArrayA.getResourceId(2, -1);
        this.h = typedArrayA.getBoolean(4, false);
        if (this.d == null) {
            this.d = yg.e(new afzw(0.0f));
        }
        setEnabled(typedArrayA.getBoolean(0, true));
        typedArrayA.recycle();
        setImportantForAccessibility(1);
    }

    private final java.lang.String l() {
        return (this.g ? android.widget.RadioButton.class : android.widget.ToggleButton.class).getName();
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, rlv] */
    private final void m(java.util.Set set) {
        java.util.Set set2 = this.j;
        this.j = new java.util.HashSet(set);
        boolean z = false;
        int i = 0;
        while (i < getChildCount()) {
            int id = a(i).getId();
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(id);
            boolean zContains = set.contains(numValueOf);
            java.lang.Object objFindViewById = findViewById(id);
            if (objFindViewById instanceof com.google.android.material.button.MaterialButton) {
                this.f = true;
                ((com.google.android.material.button.MaterialButton) objFindViewById).j(zContains);
                this.f = z;
            }
            if (set2.contains(numValueOf) != set.contains(numValueOf)) {
                boolean zContains2 = set.contains(numValueOf);
                for (defpackage.ajxi ajxiVar : this.e) {
                    java.lang.Object obj = ajxiVar.a;
                    ?? r11 = ajxiVar.c;
                    java.lang.Object obj2 = ajxiVar.b;
                    if (zContains2) {
                        defpackage.vws.a.b().l("com/android/dialer/voicemail/tab/impl/ui/SimSelectorViewPeer", "<init>", 62, "SimSelectorViewPeer.java").v("onButtonChecked");
                        r11.o(rmx.gb);
                        int i2 = 0;
                        while (true) {
                            defpackage.vws vwsVar = (defpackage.vws) obj;
                            aify aifyVar = vwsVar.c;
                            if (i2 < aifyVar.size()) {
                                com.google.android.material.button.MaterialButton materialButton = (com.google.android.material.button.MaterialButton) aifyVar.get(i2);
                                boolean z2 = materialButton.getId() == id;
                                vwsVar.b(materialButton, z2);
                                if (z2) {
                                    j$.util.Optional optional = vwsVar.b;
                                    defpackage.vag vagVar = new defpackage.vag((ajwr) obj2, materialButton, i2, 2);
                                    if (true == optional.isPresent()) {
                                        java.lang.Object obj3 = optional.get();
                                        java.lang.Object obj4 = vagVar.c;
                                        java.lang.Object obj5 = vagVar.b;
                                        defpackage.vtt vttVar = ((defpackage.vtu) ((defpackage.vwq) obj3).d.get(vagVar.a)).c;
                                        if (vttVar == null) {
                                            vttVar = defpackage.vtt.a;
                                        }
                                        ((ajwr) obj4).g((android.view.View) obj5, new defpackage.vwr(vttVar));
                                    }
                                }
                                i2++;
                            }
                        }
                    }
                }
            }
            i++;
            z = false;
        }
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View, com.google.android.material.button.MaterialButton] */
    @Override // defpackage.afrk, android.view.ViewGroup
    public final void addView(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof com.google.android.material.button.MaterialButton)) {
            android.util.Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        ?? r2 = (com.google.android.material.button.MaterialButton) view;
        r2.setMaxLines(1);
        r2.setEllipsize(android.text.TextUtils.TruncateAt.END);
        if (r2.w()) {
            r2.b.q = true;
        }
        r2.d = l();
        j(r2.getId(), r2.f);
        dzs.i((android.view.View) r2, new defpackage.afrm(this));
    }

    @Override // defpackage.afrk
    public final boolean e() {
        return false;
    }

    public final void j(int i, boolean z) {
        if (i == -1) {
            android.util.Log.e("MButtonToggleGroup", "Button ID is not valid: -1");
            return;
        }
        java.util.HashSet hashSet = new java.util.HashSet(this.j);
        if (z) {
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
            if (hashSet.contains(numValueOf)) {
                return;
            }
            if (this.g && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(numValueOf);
        } else {
            java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(i);
            if (!hashSet.contains(numValueOf2)) {
                return;
            }
            if (!this.h || hashSet.size() > 1) {
                hashSet.remove(numValueOf2);
            }
        }
        m(hashSet);
    }

    public final boolean k(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.i;
        if (i != -1) {
            m(java.util.Collections.singleton(java.lang.Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ebd ebdVar = new ebd(accessibilityNodeInfo);
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof com.google.android.material.button.MaterialButton) && k(i2)) {
                i++;
            }
        }
        ebdVar.u(ni.t(1, i, true != this.g ? 2 : 1));
    }

    public MaterialButtonToggleGroup(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 2130969858);
    }

    public MaterialButtonToggleGroup(android.content.Context context) {
        this(context, null);
    }
}
