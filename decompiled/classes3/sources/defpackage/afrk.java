package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class afrk extends android.widget.LinearLayout {
    public static final java.lang.Object a = new java.lang.Object();
    public defpackage.agbf b;
    public kf c;
    public yg d;
    private int e;
    private final java.util.List f;
    private final java.util.Comparator g;
    private java.lang.Integer[] h;
    private defpackage.agbd i;
    private int j;
    private boolean k;
    private final int l;
    private boolean m;
    private com.google.android.material.button.MaterialButton n;
    private final java.util.Map o;
    private final java.util.Map p;
    private final java.util.List q;
    private final java.util.List r;
    private final java.util.List s;
    private final defpackage.aprf t;

    public afrk(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(agdv.a(context, attributeSet, i, 2132085896), attributeSet, i);
        int i2 = 0;
        this.e = 0;
        this.f = new java.util.ArrayList();
        this.t = new defpackage.aprf(this);
        this.g = new bdt(this, 14, (byte[]) null);
        this.k = true;
        this.o = new java.util.HashMap();
        this.p = new java.util.HashMap();
        this.q = new java.util.ArrayList();
        this.r = new java.util.ArrayList();
        this.s = new java.util.ArrayList();
        android.content.Context context2 = getContext();
        android.content.res.TypedArray typedArrayA = afvl.a(context2, attributeSet, defpackage.afrn.b, i, 2132085896, new int[0]);
        if (typedArrayA.hasValue(2)) {
            this.b = defpackage.agbf.b(context2, typedArrayA);
        }
        if (typedArrayA.hasValue(6)) {
            defpackage.agbd agbdVarF = defpackage.agbd.f(context2, typedArrayA, 6);
            this.i = agbdVarF;
            if (agbdVarF == null) {
                this.i = new defpackage.agbc(new agal(agal.l(context2, typedArrayA.getResourceId(6, 0), typedArrayA.getResourceId(7, 0)))).a();
            }
        }
        if (typedArrayA.hasValue(3)) {
            this.d = yg.f(context2, typedArrayA, new afzw(0.0f));
        }
        this.j = typedArrayA.getDimensionPixelSize(1, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayA.getBoolean(0, true));
        int i3 = typedArrayA.getInt(5, 0);
        if (this.e != i3) {
            this.e = i3;
            requestLayout();
            invalidate();
        }
        this.l = getResources().getDimensionPixelOffset(2131166295);
        if (e()) {
            android.graphics.drawable.Drawable drawable = typedArrayA.getDrawable(4);
            com.google.android.material.button.MaterialButton materialButton = (com.google.android.material.button.MaterialButton) android.view.LayoutInflater.from(context2).inflate(2131624311, (android.view.ViewGroup) this, false);
            this.n = materialButton;
            materialButton.setTag(a);
            this.n.m(drawable);
            if (this.n.getContentDescription() == null) {
                this.n.setContentDescription(getResources().getString(2132019367));
            }
            this.n.setVisibility(8);
            kf kfVar = new kf(getContext(), this.n, 17, 0, agab.y(getContext(), 2130969854, getClass().getCanonicalName()).data);
            this.c = kfVar;
            kfVar.d.d(true);
            this.n.setOnClickListener(new defpackage.afrh(this, i2));
            addView(this.n);
            this.m = true;
        }
        typedArrayA.recycle();
    }

    static final android.widget.LinearLayout.LayoutParams f(android.view.View view) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : new defpackage.afrj(layoutParams.width, layoutParams.height);
    }

    protected static final defpackage.afrj g(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof android.widget.LinearLayout.LayoutParams) {
            return new defpackage.afrj((android.widget.LinearLayout.LayoutParams) layoutParams);
        }
        return layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? new defpackage.afrj((android.view.ViewGroup.MarginLayoutParams) layoutParams) : new defpackage.afrj(layoutParams);
    }

    private final int j() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (p(i)) {
                return i;
            }
        }
        return -1;
    }

    private final int k() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (p(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private final int l(boolean z, android.widget.Button button, int i, int i2) {
        int measuredHeight;
        int i3;
        int i4;
        measureChild(button, i, i2);
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) button.getLayoutParams();
        if (z) {
            measuredHeight = button.getMeasuredWidth();
            i3 = layoutParams.leftMargin;
            i4 = layoutParams.rightMargin;
        } else {
            measuredHeight = button.getMeasuredHeight();
            i3 = layoutParams.topMargin;
            i4 = layoutParams.bottomMargin;
        }
        int i5 = i3 + i4;
        if (measuredHeight == 0) {
            measuredHeight = z ? button.getMinimumWidth() : button.getMinimumHeight();
        }
        return measuredHeight + i5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void m() {
        int iMin;
        int iJ = j();
        if (iJ != -1) {
            for (int i = iJ + 1; i < getChildCount(); i++) {
                android.view.View childAt = getChildAt(i);
                java.lang.Object childAt2 = getChildAt(i - 1);
                if ((childAt instanceof com.google.android.material.button.MaterialButton) && (childAt2 instanceof com.google.android.material.button.MaterialButton)) {
                    com.google.android.material.button.MaterialButton materialButton = (com.google.android.material.button.MaterialButton) childAt;
                    com.google.android.material.button.MaterialButton materialButton2 = (com.google.android.material.button.MaterialButton) childAt2;
                    if (this.j <= 0) {
                        iMin = java.lang.Math.min(materialButton.c(), materialButton2.c());
                        materialButton.r(true);
                        materialButton2.r(true);
                    } else {
                        materialButton.r(false);
                        materialButton2.r(false);
                        iMin = 0;
                    }
                } else {
                    iMin = 0;
                }
                android.widget.LinearLayout.LayoutParams layoutParamsF = f(childAt);
                if (getOrientation() == 0) {
                    layoutParamsF.setMarginEnd(0);
                    layoutParamsF.setMarginStart(this.j - iMin);
                    layoutParamsF.topMargin = 0;
                } else {
                    layoutParamsF.bottomMargin = 0;
                    layoutParamsF.topMargin = this.j - iMin;
                    layoutParamsF.setMarginStart(0);
                }
                childAt.setLayoutParams(layoutParamsF);
            }
            if (getChildCount() == 0 || iJ == -1) {
                return;
            }
            android.widget.LinearLayout.LayoutParams layoutParamsF2 = f(a(iJ));
            if (getOrientation() == 1) {
                layoutParamsF2.topMargin = 0;
                layoutParamsF2.bottomMargin = 0;
            } else {
                layoutParamsF2.setMarginEnd(0);
                layoutParamsF2.setMarginStart(0);
                layoutParamsF2.leftMargin = 0;
                layoutParamsF2.rightMargin = 0;
            }
        }
    }

    private final void n(int i, int i2) {
        if (i == i2) {
            a(i).x(1);
            return;
        }
        int iMin = Integer.MAX_VALUE;
        int i3 = i;
        while (i3 <= i2) {
            if (p(i3)) {
                a(i3).x(i3 == i ? 3 : i3 == i2 ? 2 : 4);
                int iMin2 = 0;
                if (p(i3) && this.b != null) {
                    com.google.android.material.button.MaterialButton materialButtonA = a(i3);
                    defpackage.agbf agbfVar = this.b;
                    int width = materialButtonA.getWidth();
                    int iMax = -width;
                    for (int i4 = 0; i4 < agbfVar.a; i4++) {
                        float f = iMax;
                        defpackage.agbe agbeVar = (defpackage.agbe) agbfVar.d[i4].a;
                        iMax = (int) (agbeVar.b == 2 ? java.lang.Math.max(f, agbeVar.a) : java.lang.Math.max(f, width * agbeVar.a));
                    }
                    int iMax2 = java.lang.Math.max(0, iMax);
                    com.google.android.material.button.MaterialButton materialButtonI = i(i3);
                    int i5 = materialButtonI == null ? 0 : materialButtonI.j;
                    com.google.android.material.button.MaterialButton materialButtonH = h(i3);
                    iMin2 = java.lang.Math.min(iMax2, i5 + (materialButtonH != null ? materialButtonH.j : 0));
                }
                if (i3 != i && i3 != i2) {
                    iMin2 /= 2;
                }
                iMin = java.lang.Math.min(iMin, iMin2);
            }
            i3++;
        }
        while (i <= i2) {
            if (p(i)) {
                com.google.android.material.button.MaterialButton materialButtonA2 = a(i);
                defpackage.agbf agbfVar2 = this.b;
                if (materialButtonA2.k != agbfVar2) {
                    materialButtonA2.k = agbfVar2;
                    materialButtonA2.h(true);
                }
                int i6 = iMin << 1;
                if (materialButtonA2.l != i6) {
                    materialButtonA2.l = i6;
                    materialButtonA2.h(true);
                }
            }
            i++;
        }
    }

    private final void o() {
        for (int i = 0; i < getChildCount(); i++) {
            a(i).i();
        }
    }

    private boolean p(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    public final com.google.android.material.button.MaterialButton a(int i) {
        return (com.google.android.material.button.MaterialButton) getChildAt(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof com.google.android.material.button.MaterialButton)) {
            android.util.Log.e("MButtonGroup", "Child views must be of type MaterialButton.");
            return;
        }
        o();
        this.k = true;
        int iIndexOfChild = indexOfChild(this.n);
        if (iIndexOfChild < 0 || i != -1) {
            super.addView(view, i, layoutParams);
        } else {
            super.addView(view, iIndexOfChild, layoutParams);
        }
        com.google.android.material.button.MaterialButton materialButton = (com.google.android.material.button.MaterialButton) view;
        if (materialButton.getId() == -1) {
            materialButton.setId(android.view.View.generateViewId());
        }
        materialButton.n = this.t;
        java.util.List list = this.f;
        if (!materialButton.w()) {
            throw new java.lang.IllegalStateException("Attempted to get ShapeAppearance from a MaterialButton which has an overwritten background.");
        }
        list.add(materialButton.b.b);
        materialButton.setEnabled(isEnabled());
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final defpackage.afrj generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new defpackage.afrj(getContext(), attributeSet);
    }

    final void c() {
        int i;
        if (!(this.d == null && this.i == null) && this.k) {
            this.k = false;
            int childCount = getChildCount();
            int iJ = j();
            int iK = k();
            int i2 = 0;
            while (i2 < childCount) {
                com.google.android.material.button.MaterialButton materialButtonA = a(i2);
                if (materialButtonA.getVisibility() != 8) {
                    java.lang.Object obj = this.i;
                    if (obj == null || (i2 != iJ && i2 != iK)) {
                        obj = (agak) this.f.get(i2);
                    }
                    defpackage.agbc agbcVar = !(obj instanceof defpackage.agbd) ? new defpackage.agbc((agal) this.f.get(i2)) : new defpackage.agbc((defpackage.agbd) obj);
                    int orientation = getOrientation();
                    boolean zL = agab.L(this);
                    if (orientation == 0) {
                        i = i2 == iJ ? 5 : 0;
                        if (i2 == iK) {
                            i |= 10;
                        }
                        if (zL) {
                            i = ((i & 10) >> 1) | ((i & 5) << 1);
                        }
                    } else {
                        i = i2 == iJ ? 3 : 0;
                        if (i2 == iK) {
                            i |= 12;
                        }
                    }
                    yg ygVar = this.d;
                    int i3 = ~i;
                    if (agal.g(i3, 1)) {
                        agbcVar.e = ygVar;
                    }
                    if (agal.g(i3, 2)) {
                        agbcVar.f = ygVar;
                    }
                    if (agal.g(i3, 4)) {
                        agbcVar.g = ygVar;
                    }
                    if (agal.g(i3, 8)) {
                        agbcVar.h = ygVar;
                    }
                    agal agalVarA = agbcVar.a();
                    if (!agalVarA.d()) {
                        agalVarA = agalVarA.g();
                    }
                    if (!materialButtonA.w()) {
                        throw new java.lang.IllegalStateException("Attempted to set ShapeAppearance on a MaterialButton which has an overwritten background.");
                    }
                    defpackage.afrl afrlVar = materialButtonA.b;
                    if (afrlVar.c == null && agalVarA.d()) {
                        afrlVar.c(materialButtonA.e());
                    }
                    afrlVar.e(agalVarA);
                }
                i2++;
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof defpackage.afrj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d() {
        for (java.util.Map.Entry entry : this.p.entrySet()) {
            android.widget.Button button = (android.widget.Button) entry.getKey();
            android.view.MenuItem menuItem = (android.view.MenuItem) entry.getValue();
            if (entry.getKey() instanceof com.google.android.material.button.MaterialButton) {
                com.google.android.material.button.MaterialButton materialButton = (com.google.android.material.button.MaterialButton) button;
                menuItem.setCheckable(materialButton.v());
                menuItem.setChecked(materialButton.f);
            }
            menuItem.setEnabled(button.isEnabled());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(android.graphics.Canvas canvas) {
        java.util.TreeMap treeMap = new java.util.TreeMap(this.g);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put(a(i), java.lang.Integer.valueOf(i));
        }
        this.h = (java.lang.Integer[]) treeMap.values().toArray(new java.lang.Integer[0]);
        super.dispatchDraw(canvas);
    }

    public boolean e() {
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new defpackage.afrj(-2, -2);
    }

    @Override // android.view.ViewGroup
    protected final int getChildDrawingOrder(int i, int i2) {
        java.lang.Integer[] numArr = this.h;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        android.util.Log.w("MButtonGroup", "Child order wasn't updated");
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0050  */
    public final com.google.android.material.button.MaterialButton h(int i) {
        int i2 = i + 1;
        int childCount = getChildCount();
        while (true) {
            if (i2 >= childCount) {
                i2 = -1;
                break;
            }
            if (p(i2)) {
                break;
            }
            i2++;
        }
        java.util.List list = this.s;
        if (!list.isEmpty()) {
            int i3 = 0;
            while (i3 < list.size()) {
                int iIntValue = ((java.lang.Integer) list.get(i3)).intValue();
                int iIntValue2 = i3 == list.size() + (-1) ? childCount - 1 : ((java.lang.Integer) list.get(i3 + 1)).intValue() - 1;
                if (i < iIntValue || i > iIntValue2 || (i2 >= iIntValue && i2 <= iIntValue2)) {
                    i3++;
                }
            }
            if (i2 != -1) {
                return a(i2);
            }
        } else if (i2 != -1) {
            return a(i2);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004e  */
    public final com.google.android.material.button.MaterialButton i(int i) {
        int i2 = i - 1;
        int childCount = getChildCount();
        while (true) {
            if (i2 < 0) {
                i2 = -1;
                break;
            }
            if (p(i2)) {
                break;
            }
            i2--;
        }
        java.util.List list = this.s;
        if (!list.isEmpty()) {
            int i3 = 0;
            while (i3 < list.size()) {
                int iIntValue = ((java.lang.Integer) list.get(i3)).intValue();
                int iIntValue2 = i3 == list.size() + (-1) ? childCount : ((java.lang.Integer) list.get(i3 + 1)).intValue();
                if (i < iIntValue || i >= iIntValue2 || (i2 >= iIntValue && i2 < iIntValue2)) {
                    i3++;
                }
            }
            if (i2 != -1) {
                return a(i2);
            }
        } else if (i2 != -1) {
            return a(i2);
        }
        return null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!z) {
            return;
        }
        o();
        int iJ = j();
        int iK = k();
        if (iJ == -1 || this.b == null) {
            return;
        }
        if (this.e != 2) {
            n(iJ, iK);
            return;
        }
        int i5 = 0;
        while (true) {
            java.util.List list = this.s;
            if (i5 >= list.size()) {
                return;
            }
            int i6 = i5 + 1;
            n(((java.lang.Integer) list.get(i5)).intValue(), (i5 == list.size() + (-1) ? getChildCount() : ((java.lang.Integer) list.get(i6)).intValue()) - 1);
            i5 = i6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x021a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v5, types: [android.view.View, com.google.android.material.button.MaterialButton] */
    /* JADX WARN: Type inference failed for: r7v16, types: [android.view.View, com.google.android.material.button.MaterialButton] */
    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int paddingBottom;
        fv fvVar;
        m();
        if (this.e != 2) {
            paddingBottom = 0;
        } else {
            if (getOrientation() == 1) {
                throw new java.lang.IllegalArgumentException("The wrap overflow mode is not compatible to the vertical orientation.");
            }
            if (android.view.View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
                throw new java.lang.IllegalArgumentException("The wrap overflow mode is not compatible with wrap_content layout width.");
            }
            java.util.List list = this.s;
            list.clear();
            int size = android.view.View.MeasureSpec.getSize(i);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            int i3 = 0;
            int iMax = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < getChildCount(); i5++) {
                if (p(i5)) {
                    ?? A = a(i5);
                    measureChild(A, i, i2);
                    int measuredWidth = A.getMeasuredWidth();
                    int measuredHeight = A.getMeasuredHeight();
                    if (measuredWidth > 0) {
                        android.widget.LinearLayout.LayoutParams layoutParamsF = f(A);
                        if (i3 + measuredWidth + (arrayList.isEmpty() ? 0 : this.j) > size || arrayList.isEmpty()) {
                            if (!arrayList.isEmpty()) {
                                arrayList2.add(java.lang.Integer.valueOf(i3));
                            }
                            i4 += iMax + (list.isEmpty() ? 0 : this.j);
                            list.add(java.lang.Integer.valueOf(i5));
                            layoutParamsF.setMarginStart(-i3);
                            arrayList.clear();
                            i3 = 0;
                            iMax = 0;
                        }
                        int i6 = measuredWidth + (i3 == 0 ? 0 : this.j);
                        iMax = java.lang.Math.max(iMax, measuredHeight);
                        arrayList.add(java.lang.Integer.valueOf(i5));
                        layoutParamsF.topMargin += i4;
                        A.setLayoutParams(layoutParamsF);
                        i3 += i6;
                    }
                }
            }
            arrayList2.add(java.lang.Integer.valueOf(i3));
            int iIntValue = ((java.lang.Integer) java.util.Collections.max(arrayList2)).intValue();
            int i7 = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                int iIntValue2 = ((java.lang.Integer) list.get(i8)).intValue();
                int iIntValue3 = ((java.lang.Integer) arrayList2.get(i8)).intValue();
                ?? A2 = a(iIntValue2);
                android.widget.LinearLayout.LayoutParams layoutParamsF2 = f(A2);
                int i9 = layoutParamsF2.gravity & 8388615;
                int absoluteGravity = android.view.Gravity.getAbsoluteGravity(i9, getLayoutDirection());
                int i10 = iIntValue - iIntValue3;
                if (i9 != 8388611) {
                    if (absoluteGravity == 1) {
                        i10 /= 2;
                    }
                    layoutParamsF2.setMarginStart((layoutParamsF2.getMarginStart() + i10) - i7);
                    A2.setLayoutParams(layoutParamsF2);
                    i7 = i10;
                }
            }
            paddingBottom = getPaddingBottom() + i4 + iMax + getPaddingTop();
        }
        if (this.m) {
            if (this.e != 1) {
                this.n.setVisibility(8);
            } else {
                boolean z = getOrientation() == 0;
                java.util.List list2 = this.q;
                list2.clear();
                int size2 = z ? android.view.View.MeasureSpec.getSize(i) : android.view.View.MeasureSpec.getSize(i2);
                int iL = l(z, this.n, i, i2);
                int i11 = 0;
                int iL2 = 0;
                while (true) {
                    if (i11 >= getChildCount() - 1) {
                        this.n.setVisibility(8);
                        list2.clear();
                        break;
                    }
                    int i12 = i11 + 1;
                    agaw agawVarA = a(i11);
                    iL2 += l(z, agawVarA, i, i2);
                    if (iL2 + iL > size2) {
                        list2.add(agawVarA);
                    }
                    if (iL2 > size2) {
                        while (i12 < getChildCount() - 1) {
                            list2.add(a(i12));
                            i12++;
                        }
                        this.n.setVisibility(0);
                        break;
                    }
                    i11 = i12;
                }
                java.util.List<android.widget.Button> list3 = this.r;
                if (!list2.equals(list3)) {
                    for (int i13 = 0; i13 < getChildCount() - 1; i13++) {
                        agaw agawVarA2 = a(i13);
                        if (this.p.containsKey(agawVarA2)) {
                            agawVarA2.setVisibility(0);
                        }
                    }
                    list3.clear();
                    list3.addAll(list2);
                    ft ftVar = this.c.b;
                    java.util.Map map = this.o;
                    map.clear();
                    java.util.Map map2 = this.p;
                    map2.clear();
                    ftVar.clear();
                    for (android.widget.Button button : list3) {
                        if (button.getLayoutParams() instanceof defpackage.afrj) {
                            defpackage.afrj afrjVar = (defpackage.afrj) button.getLayoutParams();
                            java.lang.CharSequence contentDescription = afrjVar.b;
                            if (android.text.TextUtils.isEmpty(contentDescription)) {
                                if (button instanceof com.google.android.material.button.MaterialButton) {
                                    com.google.android.material.button.MaterialButton materialButton = (com.google.android.material.button.MaterialButton) button;
                                    if (android.text.TextUtils.isEmpty(materialButton.getText())) {
                                        contentDescription = button.getContentDescription();
                                    } else {
                                        contentDescription = materialButton.getText();
                                    }
                                } else {
                                    contentDescription = button.getContentDescription();
                                }
                            }
                            android.graphics.drawable.Drawable drawable = afrjVar.a;
                            fv fvVarC = ftVar.c(0, 0, 0, contentDescription);
                            if (drawable != null) {
                                int i14 = this.l;
                                fvVarC.setIcon(new android.graphics.drawable.InsetDrawable(drawable, i14, 0, i14, 0));
                            }
                            fvVarC.l = new defpackage.afri(button, 0);
                            fvVar = fvVarC;
                        } else {
                            fvVar = null;
                        }
                        if (fvVar != null) {
                            map.put(java.lang.Integer.valueOf(fvVar.a), button);
                            map2.put(button, fvVar);
                            button.setVisibility(8);
                        }
                    }
                    d();
                }
            }
        }
        c();
        super.onMeasure(i, i2);
        if (this.e != 2 || paddingBottom == getMeasuredHeight()) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth(), paddingBottom);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final void onViewRemoved(android.view.View view) {
        super.onViewRemoved(view);
        if (view instanceof com.google.android.material.button.MaterialButton) {
            ((com.google.android.material.button.MaterialButton) view).n = null;
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f.remove(iIndexOfChild);
        }
        this.k = true;
        c();
        o();
        m();
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        for (int i = 0; i < getChildCount(); i++) {
            a(i).setEnabled(z);
        }
    }

    @Override // android.widget.LinearLayout
    public final void setOrientation(int i) {
        if (getOrientation() != i) {
            this.k = true;
        }
        super.setOrientation(i);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return g(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final /* synthetic */ android.widget.LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new defpackage.afrj(-2, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ android.widget.LinearLayout.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return g(layoutParams);
    }

    public afrk(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 2130969855);
    }

    public afrk(android.content.Context context) {
        this(context, null);
    }
}
