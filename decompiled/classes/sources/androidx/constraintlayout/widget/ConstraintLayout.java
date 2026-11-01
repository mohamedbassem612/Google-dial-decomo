package androidx.constraintlayout.widget;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class ConstraintLayout extends android.view.ViewGroup {
    final android.util.SparseArray a;
    public final java.util.ArrayList b;
    protected final defpackage.dsz c;
    public int d;
    public int e;
    protected boolean f;
    public int g;
    public due h;
    final defpackage.dtw i;
    private int j;
    private int k;
    private int l;
    private java.util.HashMap m;
    private final android.util.SparseArray n;

    public ConstraintLayout(android.content.Context context) {
        super(context);
        this.a = new android.util.SparseArray();
        this.b = new java.util.ArrayList(4);
        this.c = new defpackage.dsz();
        this.j = 0;
        this.d = 0;
        this.e = Integer.MAX_VALUE;
        this.k = Integer.MAX_VALUE;
        this.f = true;
        this.g = 257;
        this.h = null;
        this.l = -1;
        this.m = new java.util.HashMap();
        this.n = new android.util.SparseArray();
        this.i = new defpackage.dtw(this, this);
        e(null, 0, 0);
    }

    private final void e(android.util.AttributeSet attributeSet, int i, int i2) {
        defpackage.dsz dszVar = this.c;
        dszVar.ag = this;
        defpackage.dtw dtwVar = this.i;
        dszVar.aF = dtwVar;
        dszVar.aG.c = dtwVar;
        this.a.put(getId(), this);
        this.h = null;
        if (attributeSet != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, defpackage.dui.b, i, i2);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                if (index == 16) {
                    this.j = typedArrayObtainStyledAttributes.getDimensionPixelOffset(16, this.j);
                } else if (index == 17) {
                    this.d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(17, this.d);
                } else if (index == 14) {
                    this.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(14, this.e);
                } else if (index == 15) {
                    this.k = typedArrayObtainStyledAttributes.getDimensionPixelOffset(15, this.k);
                } else if (index == 113) {
                    this.g = typedArrayObtainStyledAttributes.getInt(113, this.g);
                } else if (index == 56) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(56, 0);
                    if (resourceId != 0) {
                        try {
                            dum.a(getContext(), resourceId, new android.util.SparseArray(), new android.util.SparseArray());
                        } catch (android.content.res.Resources.NotFoundException unused) {
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(34, 0);
                    try {
                        due dueVar = new due();
                        this.h = dueVar;
                        dueVar.f(getContext(), resourceId2);
                    } catch (android.content.res.Resources.NotFoundException unused2) {
                        this.h = null;
                    }
                    this.l = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.c.U(this.g);
    }

    private final void f() {
        this.f = true;
    }

    /* JADX WARN: Code duplicated, block: B:256:0x0495  */
    private final void g() throws java.lang.Throwable {
        boolean z;
        boolean z2;
        defpackage.dsy dsyVar;
        defpackage.dsy dsyVar2;
        defpackage.dsy dsyVar3;
        defpackage.dsy dsyVar4;
        defpackage.dsy dsyVar5;
        defpackage.dtv dtvVar;
        defpackage.dsy dsyVar6;
        int i;
        int i2;
        float fAbs;
        java.lang.Throwable th;
        int i3;
        java.lang.Throwable th2;
        defpackage.dtc dtcVar;
        defpackage.dsy dsyVarEd;
        defpackage.dsy dsyVar7;
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = this;
        boolean zIsInEditMode = constraintLayout.isInEditMode();
        int childCount = constraintLayout.getChildCount();
        boolean z3 = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            defpackage.dsy dsyVarEd2 = constraintLayout.ed(constraintLayout.getChildAt(i4));
            if (dsyVarEd2 != null) {
                dsyVarEd2.s();
            }
        }
        java.lang.Throwable th3 = null;
        if (zIsInEditMode) {
            for (int i5 = 0; i5 < childCount; i5++) {
                android.view.View childAt = constraintLayout.getChildAt(i5);
                try {
                    java.lang.String resourceName = constraintLayout.getResources().getResourceName(childAt.getId());
                    int id = childAt.getId();
                    java.lang.Integer numValueOf = java.lang.Integer.valueOf(id);
                    if (resourceName instanceof java.lang.String) {
                        if (constraintLayout.m == null) {
                            constraintLayout.m = new java.util.HashMap();
                        }
                        int iIndexOf = resourceName.indexOf("/");
                        java.lang.String strSubstring = iIndexOf != -1 ? resourceName.substring(iIndexOf + 1) : resourceName;
                        numValueOf.getClass();
                        constraintLayout.m.put(strSubstring, java.lang.Integer.valueOf(id));
                    }
                    int iIndexOf2 = resourceName.indexOf(47);
                    if (iIndexOf2 != -1) {
                        resourceName = resourceName.substring(iIndexOf2 + 1);
                    }
                    int id2 = childAt.getId();
                    if (id2 == 0) {
                        dsyVar7 = constraintLayout.c;
                    } else {
                        android.view.View viewFindViewById = (android.view.View) constraintLayout.a.get(id2);
                        if (viewFindViewById == null && (viewFindViewById = constraintLayout.findViewById(id2)) != null && viewFindViewById != constraintLayout && viewFindViewById.getParent() == constraintLayout) {
                            constraintLayout.onViewAdded(viewFindViewById);
                        }
                        dsyVar7 = viewFindViewById == constraintLayout ? constraintLayout.c : viewFindViewById == null ? null : ((defpackage.dtv) viewFindViewById.getLayoutParams()).av;
                    }
                    dsyVar7.ai = resourceName;
                } catch (android.content.res.Resources.NotFoundException unused) {
                }
            }
        }
        if (constraintLayout.l != -1) {
            for (int i6 = 0; i6 < childCount; i6++) {
                duf childAt2 = constraintLayout.getChildAt(i6);
                if (childAt2.getId() == constraintLayout.l && (childAt2 instanceof duf)) {
                    throw null;
                }
            }
        }
        due dueVar = constraintLayout.h;
        if (dueVar != null) {
            dueVar.j(constraintLayout);
        }
        defpackage.dsz dszVar = constraintLayout.c;
        dszVar.aI.clear();
        java.util.ArrayList arrayList = constraintLayout.b;
        int size = arrayList.size();
        int i7 = 1;
        if (size > 0) {
            int i8 = 0;
            while (i8 < size) {
                defpackage.dtt dttVar = (defpackage.dtt) arrayList.get(i8);
                if (dttVar.isInEditMode()) {
                    dttVar.e(dttVar.f);
                }
                defpackage.dtc dtcVar2 = dttVar.i;
                if (dtcVar2 == null) {
                    th = th3;
                    i3 = i7;
                } else {
                    dtcVar2.as = 0;
                    java.util.Arrays.fill(dtcVar2.ar, th3);
                    int i9 = 0;
                    while (i9 < dttVar.d) {
                        int i10 = dttVar.c[i9];
                        android.view.View viewA = constraintLayout.a(i10);
                        if (viewA == null) {
                            java.util.HashMap map = dttVar.h;
                            java.lang.String str = (java.lang.String) map.get(java.lang.Integer.valueOf(i10));
                            th2 = th3;
                            int iD = dttVar.d(constraintLayout, str);
                            if (iD != 0) {
                                dttVar.c[i9] = iD;
                                map.put(java.lang.Integer.valueOf(iD), str);
                                viewA = constraintLayout.a(iD);
                            }
                        } else {
                            th2 = th3;
                        }
                        if (viewA != null && (dsyVarEd = constraintLayout.ed(viewA)) != (dtcVar = dttVar.i) && dsyVarEd != null) {
                            int i11 = dtcVar.as + i7;
                            defpackage.dsy[] dsyVarArr = dtcVar.ar;
                            int length = dsyVarArr.length;
                            if (i11 > length) {
                                dtcVar.ar = (defpackage.dsy[]) java.util.Arrays.copyOf(dsyVarArr, length << 1);
                            }
                            defpackage.dsy[] dsyVarArr2 = dtcVar.ar;
                            int i12 = dtcVar.as;
                            dsyVarArr2[i12] = dsyVarEd;
                            dtcVar.as = i12 + 1;
                        }
                        i9++;
                        th3 = th2;
                        i7 = i7;
                    }
                    th = th3;
                    i3 = i7;
                    defpackage.dtc dtcVar3 = dttVar.i;
                }
                i8++;
                th3 = th;
                i7 = i3;
            }
        }
        java.lang.Throwable th4 = th3;
        int i13 = i7;
        for (int i14 = 0; i14 < childCount; i14++) {
            android.view.View childAt3 = constraintLayout.getChildAt(i14);
            if (childAt3 instanceof defpackage.dug) {
                throw th4;
            }
        }
        android.util.SparseArray sparseArray = constraintLayout.n;
        sparseArray.clear();
        sparseArray.put(0, dszVar);
        sparseArray.put(constraintLayout.getId(), dszVar);
        for (int i15 = 0; i15 < childCount; i15++) {
            android.view.View childAt4 = constraintLayout.getChildAt(i15);
            sparseArray.put(childAt4.getId(), constraintLayout.ed(childAt4));
        }
        int i16 = 0;
        while (i16 < childCount) {
            android.view.View childAt5 = constraintLayout.getChildAt(i16);
            defpackage.dsy dsyVarEd3 = constraintLayout.ed(childAt5);
            if (dsyVarEd3 != null) {
                defpackage.dtv dtvVar2 = (defpackage.dtv) childAt5.getLayoutParams();
                dszVar.aI.add(dsyVarEd3);
                defpackage.dsy dsyVar8 = dsyVarEd3.U;
                if (dsyVar8 != null) {
                    ((defpackage.dtf) dsyVar8).Y(dsyVarEd3);
                }
                dsyVarEd3.U = dszVar;
                dtvVar2.a();
                dtvVar2.aw = z3;
                dsyVarEd3.ah = childAt5.getVisibility();
                boolean z4 = dtvVar2.aj;
                dsyVarEd3.ag = childAt5;
                if (childAt5 instanceof defpackage.dtt) {
                    ((defpackage.dtt) childAt5).b(dsyVarEd3, dszVar.b);
                }
                if (dtvVar2.ah) {
                    defpackage.dtb dtbVar = (defpackage.dtb) dsyVarEd3;
                    int i17 = dtvVar2.as;
                    int i18 = dtvVar2.at;
                    float f = dtvVar2.au;
                    if (f != -1.0f) {
                        if (f > -1.0f) {
                            dtbVar.a = f;
                            dtbVar.b = -1;
                            dtbVar.c = -1;
                        }
                    } else if (i17 != -1) {
                        if (i17 >= 0) {
                            dtbVar.a = -1.0f;
                            dtbVar.b = i17;
                            dtbVar.c = -1;
                        }
                    } else if (i18 != -1 && i18 >= 0) {
                        dtbVar.a = -1.0f;
                        dtbVar.b = -1;
                        dtbVar.c = i18;
                    }
                    z = zIsInEditMode;
                    z2 = z3;
                } else {
                    int i19 = dtvVar2.al;
                    int i20 = dtvVar2.am;
                    int i21 = dtvVar2.an;
                    int i22 = dtvVar2.ao;
                    int i23 = dtvVar2.ap;
                    int i24 = dtvVar2.aq;
                    float f2 = dtvVar2.ar;
                    int i25 = dtvVar2.p;
                    z = zIsInEditMode;
                    if (i25 != -1) {
                        defpackage.dsy dsyVar9 = (defpackage.dsy) sparseArray.get(i25);
                        if (dsyVar9 != null) {
                            float f3 = dtvVar2.r;
                            dsyVarEd3.O(7, dsyVar9, 7, dtvVar2.q, 0);
                            dsyVarEd3.E = f3;
                        }
                        dsyVar6 = dsyVarEd3;
                        dtvVar = dtvVar2;
                    } else {
                        if (i19 != -1) {
                            defpackage.dsy dsyVar10 = (defpackage.dsy) sparseArray.get(i19);
                            if (dsyVar10 != null) {
                                dsyVar = dsyVarEd3;
                                dsyVar.O(2, dsyVar10, 2, dtvVar2.leftMargin, i23);
                            } else {
                                dsyVar = dsyVarEd3;
                            }
                        } else {
                            dsyVar = dsyVarEd3;
                            if (i20 != -1 && (dsyVar2 = (defpackage.dsy) sparseArray.get(i20)) != null) {
                                dsyVar.O(2, dsyVar2, 4, dtvVar2.leftMargin, i23);
                            }
                        }
                        if (i21 != -1) {
                            defpackage.dsy dsyVar11 = (defpackage.dsy) sparseArray.get(i21);
                            if (dsyVar11 != null) {
                                dsyVar.O(4, dsyVar11, 2, dtvVar2.rightMargin, i24);
                            }
                        } else if (i22 != -1 && (dsyVar3 = (defpackage.dsy) sparseArray.get(i22)) != null) {
                            dsyVar.O(4, dsyVar3, 4, dtvVar2.rightMargin, i24);
                        }
                        int i26 = dtvVar2.i;
                        if (i26 != -1) {
                            defpackage.dsy dsyVar12 = (defpackage.dsy) sparseArray.get(i26);
                            if (dsyVar12 != null) {
                                dsyVar.O(3, dsyVar12, 3, dtvVar2.topMargin, dtvVar2.x);
                            }
                        } else {
                            int i27 = dtvVar2.j;
                            if (i27 != -1 && (dsyVar4 = (defpackage.dsy) sparseArray.get(i27)) != null) {
                                dsyVar.O(3, dsyVar4, 5, dtvVar2.topMargin, dtvVar2.x);
                            }
                        }
                        int i28 = dtvVar2.k;
                        if (i28 != -1) {
                            defpackage.dsy dsyVar13 = (defpackage.dsy) sparseArray.get(i28);
                            if (dsyVar13 != null) {
                                dsyVar.O(5, dsyVar13, 3, dtvVar2.bottomMargin, dtvVar2.z);
                            }
                        } else {
                            int i29 = dtvVar2.l;
                            if (i29 != -1 && (dsyVar5 = (defpackage.dsy) sparseArray.get(i29)) != null) {
                                dsyVar.O(5, dsyVar5, 5, dtvVar2.bottomMargin, dtvVar2.z);
                            }
                        }
                        dtvVar = dtvVar2;
                        int i30 = dtvVar.m;
                        if (i30 != -1) {
                            dsyVar6 = dsyVar;
                            h(dsyVar6, dtvVar, sparseArray, i30, 6);
                        } else {
                            int i31 = dtvVar.n;
                            if (i31 != -1) {
                                dsyVar6 = dsyVar;
                                h(dsyVar6, dtvVar, sparseArray, i31, 3);
                            } else {
                                int i32 = dtvVar.o;
                                if (i32 != -1) {
                                    dsyVar6 = dsyVar;
                                    h(dsyVar6, dtvVar, sparseArray, i32, 5);
                                } else {
                                    dsyVar6 = dsyVar;
                                }
                            }
                        }
                        if (f2 >= 0.0f) {
                            dsyVar6.ae = f2;
                        }
                        float f4 = dtvVar.H;
                        if (f4 >= 0.0f) {
                            dsyVar6.af = f4;
                        }
                    }
                    if (z) {
                        int i33 = dtvVar.X;
                        if (i33 != -1) {
                            int i34 = dtvVar.Y;
                            dsyVar6.Z = i33;
                            dsyVar6.aa = i34;
                        } else if (dtvVar.Y != -1) {
                            i33 = -1;
                            int i35 = dtvVar.Y;
                            dsyVar6.Z = i33;
                            dsyVar6.aa = i35;
                        }
                    }
                    if (dtvVar.ae) {
                        dsyVar6.P(i13);
                        dsyVar6.C(dtvVar.width);
                        if (dtvVar.width == -2) {
                            dsyVar6.P(2);
                        }
                    } else if (dtvVar.width == -1) {
                        if (dtvVar.aa) {
                            dsyVar6.P(3);
                        } else {
                            dsyVar6.P(4);
                        }
                        dsyVar6.K(2).f = dtvVar.leftMargin;
                        dsyVar6.K(4).f = dtvVar.rightMargin;
                    } else {
                        dsyVar6.P(3);
                        dsyVar6.C(0);
                    }
                    if (dtvVar.af) {
                        dsyVar6.Q(1);
                        dsyVar6.x(dtvVar.height);
                        if (dtvVar.height == -2) {
                            dsyVar6.Q(2);
                        }
                    } else if (dtvVar.height == -1) {
                        if (dtvVar.ab) {
                            dsyVar6.Q(3);
                        } else {
                            dsyVar6.Q(4);
                        }
                        dsyVar6.K(3).f = dtvVar.topMargin;
                        dsyVar6.K(5).f = dtvVar.bottomMargin;
                    } else {
                        dsyVar6.Q(3);
                        dsyVar6.x(0);
                    }
                    java.lang.String str2 = dtvVar.I;
                    if (str2 == null || str2.length() == 0) {
                        dsyVar6.X = 0.0f;
                    } else {
                        int length2 = str2.length();
                        int iIndexOf3 = str2.indexOf(44);
                        if (iIndexOf3 <= 0 || iIndexOf3 >= length2 - 1) {
                            i = -1;
                            i2 = 0;
                        } else {
                            java.lang.String strSubstring2 = str2.substring(0, iIndexOf3);
                            i = strSubstring2.equalsIgnoreCase("W") ? 0 : strSubstring2.equalsIgnoreCase("H") ? 1 : -1;
                            i2 = iIndexOf3 + 1;
                        }
                        int iIndexOf4 = str2.indexOf(58);
                        if (iIndexOf4 < 0 || iIndexOf4 >= length2 - 1) {
                            java.lang.String strSubstring3 = str2.substring(i2);
                            if (strSubstring3.length() > 0) {
                                fAbs = java.lang.Float.parseFloat(strSubstring3);
                            } else {
                                fAbs = 0.0f;
                            }
                        } else {
                            java.lang.String strSubstring4 = str2.substring(i2, iIndexOf4);
                            java.lang.String strSubstring5 = str2.substring(iIndexOf4 + 1);
                            if (strSubstring4.length() <= 0 || strSubstring5.length() <= 0) {
                                fAbs = 0.0f;
                            } else {
                                try {
                                    float f5 = java.lang.Float.parseFloat(strSubstring4);
                                    float f6 = java.lang.Float.parseFloat(strSubstring5);
                                    if (f5 <= 0.0f || f6 <= 0.0f) {
                                        fAbs = 0.0f;
                                    } else {
                                        fAbs = i == 1 ? java.lang.Math.abs(f6 / f5) : java.lang.Math.abs(f5 / f6);
                                    }
                                } catch (java.lang.NumberFormatException unused2) {
                                }
                            }
                        }
                        if (fAbs > 0.0f) {
                            dsyVar6.X = fAbs;
                            dsyVar6.Y = i;
                        }
                    }
                    float f7 = dtvVar.L;
                    float[] fArr = dsyVar6.al;
                    z2 = false;
                    fArr[0] = f7;
                    i13 = 1;
                    fArr[1] = dtvVar.M;
                    dsyVar6.aj = dtvVar.N;
                    dsyVar6.ak = dtvVar.O;
                    int i36 = dtvVar.ad;
                    if (i36 >= 0 && i36 <= 3) {
                        dsyVar6.r = i36;
                    }
                    int i37 = dtvVar.P;
                    int i38 = dtvVar.R;
                    int i39 = dtvVar.T;
                    float f8 = dtvVar.V;
                    dsyVar6.s = i37;
                    dsyVar6.v = i38;
                    if (i39 == Integer.MAX_VALUE) {
                        i39 = 0;
                    }
                    dsyVar6.w = i39;
                    dsyVar6.x = f8;
                    if (f8 > 0.0f && f8 < 1.0f && i37 == 0) {
                        dsyVar6.s = 2;
                    }
                    int i40 = dtvVar.Q;
                    int i41 = dtvVar.S;
                    int i42 = dtvVar.U;
                    float f9 = dtvVar.W;
                    dsyVar6.t = i40;
                    dsyVar6.y = i41;
                    if (i42 == Integer.MAX_VALUE) {
                        i42 = 0;
                    }
                    dsyVar6.z = i42;
                    dsyVar6.A = f9;
                    if (f9 > 0.0f && f9 < 1.0f && i40 == 0) {
                        dsyVar6.t = 2;
                    }
                }
            } else {
                z = zIsInEditMode;
                z2 = z3;
            }
            i16++;
            constraintLayout = this;
            z3 = z2;
            zIsInEditMode = z;
        }
    }

    private final void h(defpackage.dsy dsyVar, defpackage.dtv dtvVar, android.util.SparseArray sparseArray, int i, int i2) {
        android.view.View view = (android.view.View) this.a.get(i);
        defpackage.dsy dsyVar2 = (defpackage.dsy) sparseArray.get(i);
        if (dsyVar2 == null || view == null || !(view.getLayoutParams() instanceof defpackage.dtv)) {
            return;
        }
        dtvVar.ag = true;
        if (i2 == 6) {
            defpackage.dtv dtvVar2 = (defpackage.dtv) view.getLayoutParams();
            dtvVar2.ag = true;
            dtvVar2.av.F = true;
        }
        dsyVar.K(6).j(dsyVar2.K(i2), dtvVar.D, dtvVar.C);
        dsyVar.F = true;
        dsyVar.K(3).d();
        dsyVar.K(5).d();
    }

    public final android.view.View a(int i) {
        return (android.view.View) this.a.get(i);
    }

    protected final boolean c() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && getLayoutDirection() == 1;
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof defpackage.dtv;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(android.graphics.Canvas canvas) {
        java.lang.Object tag;
        int size;
        java.util.ArrayList arrayList = this.b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                android.view.View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof java.lang.String)) {
                    java.lang.String[] strArrSplit = ((java.lang.String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i3 = java.lang.Integer.parseInt(strArrSplit[0]);
                        int i4 = java.lang.Integer.parseInt(strArrSplit[1]);
                        int i5 = java.lang.Integer.parseInt(strArrSplit[2]);
                        float f = (java.lang.Integer.parseInt(strArrSplit[3]) / 1920.0f) * height;
                        android.graphics.Paint paint = new android.graphics.Paint();
                        paint.setColor(-65536);
                        int i6 = (int) ((i4 / 1920.0f) * height);
                        int i7 = (int) ((i3 / 1080.0f) * width);
                        float f2 = ((int) ((i5 / 1080.0f) * width)) + i7;
                        float f3 = i7;
                        float f4 = i6;
                        canvas.drawLine(f3, f4, f2, f4, paint);
                        float f5 = i6 + ((int) f);
                        canvas.drawLine(f2, f4, f2, f5, paint);
                        canvas.drawLine(f2, f5, f3, f5, paint);
                        canvas.drawLine(f3, f5, f3, f4, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f3, f4, f2, f5, paint);
                        canvas.drawLine(f3, f5, f2, f4, paint);
                    }
                }
            }
        }
    }

    public final java.lang.Object eY(java.lang.Object obj) {
        java.util.HashMap map;
        if ((obj instanceof java.lang.String) && (map = this.m) != null && map.containsKey(obj)) {
            return this.m.get(obj);
        }
        return null;
    }

    public final defpackage.dsy ed(android.view.View view) {
        if (view == this) {
            return this.c;
        }
        if (view != null) {
            if (view.getLayoutParams() instanceof defpackage.dtv) {
                return ((defpackage.dtv) view.getLayoutParams()).av;
            }
            view.setLayoutParams(new defpackage.dtv(view.getLayoutParams()));
            if (view.getLayoutParams() instanceof defpackage.dtv) {
                return ((defpackage.dtv) view.getLayoutParams()).av;
            }
        }
        return null;
    }

    @Override // android.view.View
    public final void forceLayout() {
        f();
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    protected /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new defpackage.dtv();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new defpackage.dtv(getContext(), attributeSet);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002c  */
    /* JADX WARN: Code duplicated, block: B:23:0x004a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0047 A[SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            android.view.View childAt = getChildAt(i5);
            defpackage.dtv dtvVar = (defpackage.dtv) childAt.getLayoutParams();
            defpackage.dsy dsyVar = dtvVar.av;
            if (childAt.getVisibility() != 8 || dtvVar.ah || dtvVar.ai) {
                boolean z2 = dtvVar.aj;
                int iK = dsyVar.k();
                int iL = dsyVar.l();
                childAt.layout(iK, iL, dsyVar.j() + iK, dsyVar.h() + iL);
                if (!(childAt instanceof defpackage.dug)) {
                    throw null;
                }
            } else {
                boolean z3 = dtvVar.ak;
                if (zIsInEditMode) {
                    boolean z4 = dtvVar.aj;
                    int iK2 = dsyVar.k();
                    int iL2 = dsyVar.l();
                    childAt.layout(iK2, iL2, dsyVar.j() + iK2, dsyVar.h() + iL2);
                    if (!(childAt instanceof defpackage.dug)) {
                        throw null;
                    }
                } else {
                    continue;
                }
            }
        }
        java.util.ArrayList arrayList = this.b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0225 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x0227  */
    /* JADX WARN: Code duplicated, block: B:103:0x022a  */
    /* JADX WARN: Code duplicated, block: B:104:0x0230 A[DONT_INVERT, PHI: r7
      0x0230: PHI (r7v1 int) = (r7v0 int), (r7v16 int) binds: [B:100:0x0223, B:102:0x0227] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:105:0x0232  */
    /* JADX WARN: Code duplicated, block: B:106:0x0234  */
    /* JADX WARN: Code duplicated, block: B:109:0x0239  */
    /* JADX WARN: Code duplicated, block: B:111:0x024d  */
    /* JADX WARN: Code duplicated, block: B:112:0x024f  */
    /* JADX WARN: Code duplicated, block: B:118:0x0260  */
    /* JADX WARN: Code duplicated, block: B:119:0x0262  */
    /* JADX WARN: Code duplicated, block: B:125:0x0273 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:126:0x0275  */
    /* JADX WARN: Code duplicated, block: B:131:0x0283  */
    /* JADX WARN: Code duplicated, block: B:133:0x0291 A[LOOP:12: B:132:0x028f->B:133:0x0291, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:137:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:140:0x0309 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:141:0x030b  */
    /* JADX WARN: Code duplicated, block: B:142:0x0312  */
    /* JADX WARN: Code duplicated, block: B:143:0x0315  */
    /* JADX WARN: Code duplicated, block: B:145:0x0318  */
    /* JADX WARN: Code duplicated, block: B:146:0x031b  */
    /* JADX WARN: Code duplicated, block: B:148:0x031f  */
    /* JADX WARN: Code duplicated, block: B:150:0x032a  */
    /* JADX WARN: Code duplicated, block: B:155:0x033d  */
    /* JADX WARN: Code duplicated, block: B:157:0x0356 A[EDGE_INSN: B:157:0x0356->B:159:0x036e BREAK  A[LOOP:3: B:149:0x0328->B:393:?]] */
    /* JADX WARN: Code duplicated, block: B:158:0x036c  */
    /* JADX WARN: Code duplicated, block: B:162:0x0378  */
    /* JADX WARN: Code duplicated, block: B:165:0x037d  */
    /* JADX WARN: Code duplicated, block: B:167:0x039b  */
    /* JADX WARN: Code duplicated, block: B:169:0x039e  */
    /* JADX WARN: Code duplicated, block: B:173:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:175:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:177:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:181:0x03da  */
    /* JADX WARN: Code duplicated, block: B:183:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:185:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:201:0x0412 A[PHI: r0 r2 r25 r26
      0x0412: PHI (r0v40 int) = (r0v35 int), (r0v56 int) binds: [B:214:0x04b4, B:200:0x040a] A[DONT_GENERATE, DONT_INLINE]
      0x0412: PHI (r2v55 boolean) = (r2v46 boolean), (r2v67 boolean) binds: [B:214:0x04b4, B:200:0x040a] A[DONT_GENERATE, DONT_INLINE]
      0x0412: PHI (r25v6 boolean) = (r25v4 boolean), (r25v8 boolean) binds: [B:214:0x04b4, B:200:0x040a] A[DONT_GENERATE, DONT_INLINE]
      0x0412: PHI (r26v6 boolean) = (r26v4 boolean), (r26v9 boolean) binds: [B:214:0x04b4, B:200:0x040a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:202:0x0415  */
    /* JADX WARN: Code duplicated, block: B:203:0x0417 A[PHI: r7
      0x0417: PHI (r7v11 int) = (r7v2 int), (r7v12 int) binds: [B:124:0x0271, B:202:0x0415] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:205:0x0421  */
    /* JADX WARN: Code duplicated, block: B:207:0x042f A[LOOP:13: B:206:0x042d->B:207:0x042f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:209:0x0486  */
    /* JADX WARN: Code duplicated, block: B:212:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:213:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:215:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:217:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:218:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:223:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:225:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:227:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:229:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:255:0x053a  */
    /* JADX WARN: Code duplicated, block: B:282:0x0574  */
    /* JADX WARN: Code duplicated, block: B:284:0x057b  */
    /* JADX WARN: Code duplicated, block: B:288:0x058c  */
    /* JADX WARN: Code duplicated, block: B:290:0x0594 A[LOOP:7: B:287:0x058a->B:290:0x0594, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:295:0x05a3  */
    /* JADX WARN: Code duplicated, block: B:297:0x05a6 A[LOOP:8: B:296:0x05a4->B:297:0x05a6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:300:0x05bc  */
    /* JADX WARN: Code duplicated, block: B:302:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:304:0x05e6  */
    /* JADX WARN: Code duplicated, block: B:306:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:308:0x0615  */
    /* JADX WARN: Code duplicated, block: B:310:0x061b  */
    /* JADX WARN: Code duplicated, block: B:315:0x0638  */
    /* JADX WARN: Code duplicated, block: B:317:0x063e  */
    /* JADX WARN: Code duplicated, block: B:322:0x065c  */
    /* JADX WARN: Code duplicated, block: B:326:0x0676  */
    /* JADX WARN: Code duplicated, block: B:328:0x0679  */
    /* JADX WARN: Code duplicated, block: B:330:0x0683  */
    /* JADX WARN: Code duplicated, block: B:332:0x0687  */
    /* JADX WARN: Code duplicated, block: B:345:0x06b8  */
    /* JADX WARN: Code duplicated, block: B:348:0x06cd  */
    /* JADX WARN: Code duplicated, block: B:350:0x06d3  */
    /* JADX WARN: Code duplicated, block: B:355:0x06f0  */
    /* JADX WARN: Code duplicated, block: B:357:0x06f6  */
    /* JADX WARN: Code duplicated, block: B:363:0x0716  */
    /* JADX WARN: Code duplicated, block: B:370:0x0732 A[LOOP:10: B:325:0x0674->B:370:0x0732, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:372:0x0743  */
    /* JADX WARN: Code duplicated, block: B:376:0x0780  */
    /* JADX WARN: Code duplicated, block: B:378:0x0783  */
    /* JADX WARN: Code duplicated, block: B:386:0x021b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:387:0x0216 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:391:0x0339 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:398:0x0409 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:410:0x0597 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:417:0x0740 A[EDGE_INSN: B:417:0x0740->B:371:0x0740 BREAK  A[LOOP:10: B:325:0x0674->B:370:0x0732], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:420:0x0723 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0158  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:66:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:72:0x01be  */
    /* JADX WARN: Code duplicated, block: B:75:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:77:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:83:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:86:0x01f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:88:0x01f5 A[PHI: r6
      0x01f5: PHI (r6v38 boolean) = (r6v37 boolean), (r6v42 boolean) binds: [B:85:0x01f0, B:87:0x01f4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:90:0x01fb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:91:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:99:0x021b A[PHI: r2 r6 r11
      0x021b: PHI (r2v5 int[]) = (r2v4 int[]), (r2v69 int[]) binds: [B:74:0x01c1, B:386:0x021b] A[DONT_GENERATE, DONT_INLINE]
      0x021b: PHI (r6v6 boolean) = (r6v5 boolean), (r6v34 boolean) binds: [B:74:0x01c1, B:386:0x021b] A[DONT_GENERATE, DONT_INLINE]
      0x021b: PHI (r11v4 int) = (r11v3 int), (r11v47 int) binds: [B:74:0x01c1, B:386:0x021b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v60, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.Object, java.util.List] */
    @Override // android.view.View
    protected final void onMeasure(int i, int i2) throws java.lang.Throwable {
        int i3;
        int iMax;
        int iMax2;
        int i4;
        boolean z;
        int[] iArr;
        defpackage.aogc aogcVar;
        defpackage.dtw dtwVar;
        int size;
        int i5;
        int iJ;
        int iH;
        boolean z2;
        boolean z3;
        int[] iArr2;
        boolean z4;
        int i6;
        int i7;
        boolean z5;
        boolean z6;
        int i8;
        boolean zV;
        int i9;
        java.util.ArrayList arrayList;
        int size2;
        defpackage.dtw dtwVar2;
        int iM;
        int iN;
        int iMax3;
        int iMax4;
        boolean z7;
        int i10;
        boolean zBt;
        int i11;
        int i12;
        int i13;
        java.util.ArrayList arrayList2;
        defpackage.dtw dtwVar3;
        defpackage.dsy dsyVar;
        int iJ2;
        int iH2;
        int i14;
        java.util.ArrayList arrayList3;
        int iJ3;
        defpackage.dtw dtwVar4;
        int iH3;
        defpackage.dsy dsyVar2;
        boolean zBt2;
        int iJ4;
        int iH4;
        int iJ5;
        int iH5;
        int size3;
        int i15;
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout;
        int childCount;
        int i16;
        java.util.ArrayList arrayList4;
        int size4;
        int i17;
        android.view.View childAt;
        defpackage.dsy dsyVar3;
        int i18;
        int i19;
        int i20;
        boolean z8;
        dto dtoVar;
        dtp dtpVar;
        boolean z9;
        boolean z10;
        int iMin;
        int iMin2;
        int iMin3;
        int iMin4;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        defpackage.fxy fxyVar;
        int i21;
        java.lang.Object obj;
        java.util.ArrayList arrayList5;
        int size5;
        int i22;
        defpackage.fxy fxyVar2;
        java.util.ArrayList arrayList6;
        int size6;
        int i23;
        int i24;
        java.lang.Object obj2;
        defpackage.dsy dsyVar4;
        int iL;
        int iL2;
        int iK;
        int iL3;
        defpackage.dsz dszVar;
        boolean z15;
        int i25;
        boolean z16;
        int i26;
        int[] iArr3;
        int i27;
        int i28;
        boolean z17;
        ?? r7;
        int size7;
        int i29;
        int size8;
        int i30;
        boolean z18;
        defpackage.dtr dtrVar;
        ?? r0;
        int size9;
        int i31;
        boolean zE;
        int i32;
        defpackage.dsy dsyVar5;
        boolean z19;
        int iM2;
        int i33;
        boolean z20;
        if (!this.f) {
            int childCount2 = getChildCount();
            for (int i34 = 0; i34 < childCount2; i34++) {
                if (getChildAt(i34).isLayoutRequested()) {
                    this.f = true;
                    break;
                }
            }
        }
        defpackage.dsz dszVar2 = this.c;
        dszVar2.b = c();
        if (this.f) {
            this.f = false;
            int childCount3 = getChildCount();
            for (int i35 = 0; i35 < childCount3; i35++) {
                if (getChildAt(i35).isLayoutRequested()) {
                    g();
                    dszVar2.aH.bs(dszVar2);
                    break;
                }
            }
        }
        defpackage.dsq dsqVar = dszVar2.c;
        int i36 = this.g;
        int mode = android.view.View.MeasureSpec.getMode(i);
        int size10 = android.view.View.MeasureSpec.getSize(i);
        int mode2 = android.view.View.MeasureSpec.getMode(i2);
        int size11 = android.view.View.MeasureSpec.getSize(i2);
        int iMax5 = java.lang.Math.max(0, getPaddingTop());
        int iMax6 = java.lang.Math.max(0, getPaddingBottom());
        int i37 = iMax5 + iMax6;
        int iMax7 = java.lang.Math.max(0, getPaddingLeft()) + java.lang.Math.max(0, getPaddingRight());
        int iMax8 = java.lang.Math.max(0, getPaddingStart()) + java.lang.Math.max(0, getPaddingEnd());
        if (iMax8 > 0) {
            iMax7 = iMax8;
        }
        defpackage.dtw dtwVar5 = this.i;
        dtwVar5.b = iMax5;
        dtwVar5.c = iMax6;
        dtwVar5.d = iMax7;
        dtwVar5.e = i37;
        dtwVar5.f = i;
        dtwVar5.g = i2;
        int iMax9 = java.lang.Math.max(0, getPaddingStart());
        int iMax10 = java.lang.Math.max(0, getPaddingEnd());
        if (iMax9 <= 0 && iMax10 <= 0) {
            iMax9 = java.lang.Math.max(0, getPaddingLeft());
        } else if (c()) {
            iMax9 = iMax10;
        }
        int i38 = size10 - iMax7;
        int i39 = size11 - i37;
        int i40 = dtwVar5.e;
        int i41 = dtwVar5.d;
        int childCount4 = getChildCount();
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                if (childCount4 == 0) {
                    childCount4 = 0;
                    iMax = java.lang.Math.max(0, this.j);
                } else {
                    iMax = 0;
                }
                i3 = 2;
            } else if (mode != 1073741824) {
                i41 = i41;
                i3 = 1;
                iMax = 0;
            } else {
                i41 = i41;
                iMax = java.lang.Math.min(this.e - i41, i38);
                i3 = 1;
            }
        } else if (childCount4 == 0) {
            i41 = i41;
            iMax = java.lang.Math.max(0, this.j);
            i3 = 2;
            childCount4 = 0;
        } else {
            i41 = i41;
            i3 = 2;
            iMax = i38;
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                iMax2 = childCount4 == 0 ? java.lang.Math.max(0, this.d) : 0;
            } else if (mode2 != 1073741824) {
                i4 = 1;
                iMax2 = 0;
            } else {
                iMax2 = java.lang.Math.min(this.k - i40, i39);
                i4 = 1;
            }
            if (iMax == dszVar2.j() || iMax2 != dszVar2.h()) {
                z = true;
                dszVar2.aG.b = true;
            } else {
                z = true;
            }
            dszVar2.Z = 0;
            dszVar2.aa = 0;
            boolean z21 = z;
            int i42 = this.e - i41;
            iArr = dszVar2.D;
            iArr[0] = i42;
            iArr[z21 ? 1 : 0] = this.k - i40;
            dszVar2.B(0);
            dszVar2.A(0);
            dszVar2.P(i3);
            dszVar2.C(iMax);
            dszVar2.Q(i4);
            dszVar2.x(iMax2);
            dszVar2.B(this.j - i41);
            dszVar2.A(this.d - i40);
            dszVar2.d = iMax9;
            dszVar2.ar = iMax5;
            aogcVar = dszVar2.aH;
            dtwVar = dszVar2.aF;
            size = dszVar2.aI.size();
            i5 = i36 & 128;
            iJ = dszVar2.j();
            iH = dszVar2.h();
            if (i5 == 128) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2 || (i36 & 64) == 64) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                i32 = 0;
                while (true) {
                    if (i32 < size) {
                        iArr2 = iArr;
                        dsyVar5 = (defpackage.dsy) dszVar2.aI.get(i32);
                        z19 = z3;
                        iM2 = dsyVar5.M();
                        i6 = size;
                        int iN2 = dsyVar5.N();
                        i33 = i32;
                        if (iM2 == 3 || iN2 != 3 || dsyVar5.X <= 0.0f) {
                            z20 = false;
                        } else {
                            z20 = true;
                        }
                        if (dsyVar5.H()) {
                            if (!z20) {
                                z20 = false;
                                if (dsyVar5.I()) {
                                    i32 = i33 + 1;
                                    iArr = iArr2;
                                    z3 = z19;
                                    size = i6;
                                } else {
                                    i32 = i33 + 1;
                                    iArr = iArr2;
                                    z3 = z19;
                                    size = i6;
                                }
                            }
                        } else if ((dsyVar5.I() || !z20) && !(dsyVar5 instanceof defpackage.dte) && !dsyVar5.H() && !dsyVar5.I()) {
                            i32 = i33 + 1;
                            iArr = iArr2;
                            z3 = z19;
                            size = i6;
                        }
                        i7 = 1073741824;
                        z4 = false;
                    } else {
                        iArr2 = iArr;
                        z4 = z3;
                        i6 = size;
                        i7 = 1073741824;
                    }
                }
            } else {
                iArr2 = iArr;
                z4 = z3;
                i6 = size;
                i7 = 1073741824;
            }
            if (mode != i7) {
                if (z2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
            } else if (mode2 != i7) {
                mode = 1073741824;
                if (z2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
            } else {
                z5 = true;
                mode = 1073741824;
                mode2 = 1073741824;
            }
            z6 = z4 & z5;
            if (z6) {
                iMin3 = java.lang.Math.min(iArr2[0], i38);
                iMin4 = java.lang.Math.min(iArr2[1], i39);
                if (mode == 1073741824) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (mode == 1073741824 && dszVar2.j() != iMin3) {
                    dszVar2.C(iMin3);
                    dszVar2.c();
                }
                if (mode2 == 1073741824) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (mode2 == 1073741824 && dszVar2.h() != iMin4) {
                    dszVar2.x(iMin4);
                    dszVar2.c();
                }
                if (mode != 1073741824) {
                    z13 = z12;
                    z14 = z11;
                    fxyVar = dszVar2.aG;
                    if (fxyVar.a) {
                        obj = fxyVar.f;
                        defpackage.dsz dszVar3 = (defpackage.dsz) obj;
                        arrayList5 = dszVar3.aI;
                        i22 = 0;
                        for (size5 = arrayList5.size(); i22 < size5; size5 = size5) {
                            defpackage.dsy dsyVar6 = (defpackage.dsy) arrayList5.get(i22);
                            dsyVar6.r();
                            dsyVar6.e = false;
                            java.util.ArrayList arrayList7 = arrayList5;
                            dto dtoVar2 = dsyVar6.h;
                            dtoVar2.e.i = false;
                            dtoVar2.g = false;
                            dtoVar2.g();
                            dtp dtpVar2 = dsyVar6.i;
                            dtpVar2.e.i = false;
                            dtpVar2.g = false;
                            dtpVar2.g();
                            i22++;
                            arrayList5 = arrayList7;
                            obj = obj;
                        }
                        java.lang.Object obj3 = obj;
                        i21 = 0;
                        ((defpackage.dsy) obj3).r();
                        dszVar3.e = false;
                        dto dtoVar3 = dszVar3.h;
                        dtoVar3.e.i = false;
                        dtoVar3.g = false;
                        dtoVar3.g();
                        dtp dtpVar3 = dszVar3.i;
                        dtpVar3.e.i = false;
                        dtpVar3.g = false;
                        dtpVar3.g();
                        fxyVar.h();
                    } else {
                        i21 = 0;
                    }
                    fxyVar.j((defpackage.dsz) fxyVar.e);
                    java.lang.Object obj4 = fxyVar.f;
                    defpackage.dsy dsyVar7 = (defpackage.dsy) obj4;
                    dsyVar7.Z = i21;
                    dsyVar7.aa = i21;
                    defpackage.dsz dszVar4 = (defpackage.dsz) obj4;
                    dszVar4.h.h.c(i21);
                    dszVar4.i.h.c(i21);
                    if (mode == 1073741824) {
                        zV = dszVar2.V(z2, i21);
                        i8 = 1;
                    } else {
                        i8 = 0;
                        zV = true;
                    }
                    if (mode2 == 1073741824) {
                        zV &= dszVar2.V(z2, 1);
                        i8++;
                    }
                } else if (mode2 == 1073741824) {
                    fxyVar2 = dszVar2.aG;
                    if (!fxyVar2.a || fxyVar2.b) {
                        java.lang.Object obj5 = fxyVar2.f;
                        defpackage.dsz dszVar5 = (defpackage.dsz) obj5;
                        arrayList6 = dszVar5.aI;
                        size6 = arrayList6.size();
                        i23 = 0;
                        while (i23 < size6) {
                            int i43 = i23;
                            defpackage.dsy dsyVar8 = (defpackage.dsy) arrayList6.get(i23);
                            dsyVar8.r();
                            dsyVar8.e = false;
                            dsyVar8.h.g();
                            dsyVar8.i.g();
                            i23 = i43 + 1;
                            z12 = z12;
                        }
                        z13 = z12;
                        ((defpackage.dsy) obj5).r();
                        i24 = 0;
                        dszVar5.e = false;
                        dszVar5.h.g();
                        dszVar5.i.g();
                        fxyVar2.b = false;
                    } else {
                        z13 = z12;
                        i24 = 0;
                    }
                    fxyVar2.j((defpackage.dsz) fxyVar2.e);
                    obj2 = fxyVar2.f;
                    dsyVar4 = (defpackage.dsy) obj2;
                    dsyVar4.Z = i24;
                    dsyVar4.aa = i24;
                    iL = dsyVar4.L(i24);
                    iL2 = dsyVar4.L(1);
                    if (fxyVar2.a) {
                        fxyVar2.h();
                    }
                    iK = dsyVar4.k();
                    iL3 = dsyVar4.l();
                    z14 = z11;
                    dszVar = (defpackage.dsz) obj2;
                    dszVar.h.h.c(iK);
                    dszVar.i.h.c(iL3);
                    fxyVar2.i();
                    if (iL != 2) {
                        if (iL2 == 2) {
                            z15 = true;
                            z16 = !z2;
                            i25 = 2;
                        } else {
                            i26 = iK;
                        }
                        iArr3 = dszVar.aq;
                        i27 = iArr3[0];
                        if (i27 != 1 || i27 == 4) {
                            int iJ6 = i26 + dsyVar4.j();
                            dszVar.h.i.c(iJ6);
                            dszVar.h.e.c(iJ6 - i26);
                            fxyVar2.i();
                            i28 = iArr3[1];
                            if (i28 != 1 || i28 == 4) {
                                int iH6 = dsyVar4.h() + iL3;
                                dszVar.i.i.c(iH6);
                                dszVar.i.e.c(iH6 - iL3);
                            }
                            fxyVar2.i();
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        r7 = fxyVar2.h;
                        size7 = r7.size();
                        for (i29 = 0; i29 < size7; i29++) {
                            dtrVar = (defpackage.dtr) r7.get(i29);
                            if (dtrVar.d == obj2 || dtrVar.g) {
                                dtrVar.c();
                            }
                        }
                        size8 = r7.size();
                        i30 = 0;
                        while (true) {
                            if (i30 < size8) {
                                z18 = true;
                                break;
                            }
                            defpackage.dtr dtrVar2 = (defpackage.dtr) r7.get(i30);
                            if ((!z17 || dtrVar2.d != obj2) && (!dtrVar2.h.i || ((!dtrVar2.i.i && !(dtrVar2 instanceof dtm)) || (!dtrVar2.e.i && !(dtrVar2 instanceof dth) && !(dtrVar2 instanceof dtm))))) {
                                z18 = false;
                                break;
                            }
                            i30++;
                        }
                        dsyVar4.P(iL);
                        dsyVar4.Q(iL2);
                        zV = z18;
                        i8 = 2;
                    } else {
                        z15 = true;
                        if (z2) {
                            i25 = iL2;
                            z16 = false;
                        } else {
                            i25 = iL2;
                            z16 = true;
                        }
                    }
                    if (z15 != z16) {
                        r0 = fxyVar2.h;
                        size9 = r0.size();
                        i26 = iK;
                        i31 = 0;
                        do {
                            if (i31 < size9) {
                                if (iL == 2) {
                                    dsyVar4.P(1);
                                    dsyVar4.C(fxyVar2.g(dszVar, 0));
                                    dszVar.h.e.c(dsyVar4.j());
                                    iL = 2;
                                }
                                if (i25 == 2) {
                                    break;
                                }
                                dsyVar4.Q(1);
                                dsyVar4.x(fxyVar2.g(dszVar, 1));
                                dszVar.i.e.c(dsyVar4.h());
                                break;
                            }
                            zE = ((defpackage.dtr) r0.get(i31)).e();
                            i31++;
                        } while (zE);
                    } else {
                        i26 = iK;
                    }
                    iL2 = i25;
                    iArr3 = dszVar.aq;
                    i27 = iArr3[0];
                    if (i27 != 1) {
                        int iJ7 = i26 + dsyVar4.j();
                        dszVar.h.i.c(iJ7);
                        dszVar.h.e.c(iJ7 - i26);
                        fxyVar2.i();
                        i28 = iArr3[1];
                        if (i28 != 1) {
                            int iH7 = dsyVar4.h() + iL3;
                            dszVar.i.i.c(iH7);
                            dszVar.i.e.c(iH7 - iL3);
                        } else {
                            int iH8 = dsyVar4.h() + iL3;
                            dszVar.i.i.c(iH8);
                            dszVar.i.e.c(iH8 - iL3);
                        }
                        fxyVar2.i();
                        z17 = true;
                    } else {
                        int iJ8 = i26 + dsyVar4.j();
                        dszVar.h.i.c(iJ8);
                        dszVar.h.e.c(iJ8 - i26);
                        fxyVar2.i();
                        i28 = iArr3[1];
                        if (i28 != 1) {
                            int iH9 = dsyVar4.h() + iL3;
                            dszVar.i.i.c(iH9);
                            dszVar.i.e.c(iH9 - iL3);
                        } else {
                            int iH10 = dsyVar4.h() + iL3;
                            dszVar.i.i.c(iH10);
                            dszVar.i.e.c(iH10 - iL3);
                        }
                        fxyVar2.i();
                        z17 = true;
                    }
                    r7 = fxyVar2.h;
                    size7 = r7.size();
                    while (i29 < size7) {
                        dtrVar = (defpackage.dtr) r7.get(i29);
                        if (dtrVar.d == obj2) {
                            dtrVar.c();
                        } else {
                            dtrVar.c();
                        }
                    }
                    size8 = r7.size();
                    i30 = 0;
                    while (true) {
                        if (i30 < size8) {
                            z18 = true;
                            break;
                        }
                        defpackage.dtr dtrVar3 = (defpackage.dtr) r7.get(i30);
                        if (!z17) {
                            z18 = false;
                            break;
                        } else {
                            z18 = false;
                            break;
                        }
                        i30++;
                    }
                    dsyVar4.P(iL);
                    dsyVar4.Q(iL2);
                    zV = z18;
                    i8 = 2;
                } else {
                    mode = 1073741824;
                    z13 = z12;
                    z14 = z11;
                    fxyVar = dszVar2.aG;
                    if (fxyVar.a) {
                        obj = fxyVar.f;
                        defpackage.dsz dszVar6 = (defpackage.dsz) obj;
                        arrayList5 = dszVar6.aI;
                        i22 = 0;
                        while (i22 < size5) {
                            defpackage.dsy dsyVar9 = (defpackage.dsy) arrayList5.get(i22);
                            dsyVar9.r();
                            dsyVar9.e = false;
                            java.util.ArrayList arrayList8 = arrayList5;
                            dto dtoVar4 = dsyVar9.h;
                            dtoVar4.e.i = false;
                            dtoVar4.g = false;
                            dtoVar4.g();
                            dtp dtpVar4 = dsyVar9.i;
                            dtpVar4.e.i = false;
                            dtpVar4.g = false;
                            dtpVar4.g();
                            i22++;
                            arrayList5 = arrayList8;
                            obj = obj;
                        }
                        java.lang.Object obj6 = obj;
                        i21 = 0;
                        ((defpackage.dsy) obj6).r();
                        dszVar6.e = false;
                        dto dtoVar5 = dszVar6.h;
                        dtoVar5.e.i = false;
                        dtoVar5.g = false;
                        dtoVar5.g();
                        dtp dtpVar5 = dszVar6.i;
                        dtpVar5.e.i = false;
                        dtpVar5.g = false;
                        dtpVar5.g();
                        fxyVar.h();
                    } else {
                        i21 = 0;
                    }
                    fxyVar.j((defpackage.dsz) fxyVar.e);
                    java.lang.Object obj7 = fxyVar.f;
                    defpackage.dsy dsyVar10 = (defpackage.dsy) obj7;
                    dsyVar10.Z = i21;
                    dsyVar10.aa = i21;
                    defpackage.dsz dszVar7 = (defpackage.dsz) obj7;
                    dszVar7.h.h.c(i21);
                    dszVar7.i.h.c(i21);
                    if (mode == 1073741824) {
                        zV = dszVar2.V(z2, i21);
                        i8 = 1;
                    } else {
                        i8 = 0;
                        zV = true;
                    }
                    if (mode2 == 1073741824) {
                        zV &= dszVar2.V(z2, 1);
                        i8++;
                    }
                }
                if (zV) {
                    dszVar2.D(!z14, !z13);
                }
            } else {
                i8 = 0;
                zV = false;
            }
            if (zV || i8 != 2) {
                i9 = dszVar2.aw;
                if (i6 > 0) {
                    size3 = dszVar2.aI.size();
                    boolean zW = dszVar2.W(64);
                    defpackage.dtw dtwVar6 = dszVar2.aF;
                    i15 = 0;
                    while (i15 < size3) {
                        dsyVar3 = (defpackage.dsy) dszVar2.aI.get(i15);
                        if (!(dsyVar3 instanceof defpackage.dtb) || (dsyVar3 instanceof defpackage.dsv)) {
                            i18 = size3;
                        } else {
                            boolean z22 = dsyVar3.G;
                            if (zW && (dtoVar = dsyVar3.h) != null && (dtpVar = dsyVar3.i) != null && dtoVar.e.i && dtpVar.e.i) {
                                i18 = size3;
                            } else {
                                int iL4 = dsyVar3.L(0);
                                int iL5 = dsyVar3.L(1);
                                if (iL4 == 3) {
                                    if (dsyVar3.s == 1 || iL5 != 3) {
                                        i20 = iL5;
                                    } else {
                                        if (dsyVar3.t != 1) {
                                            z8 = true;
                                            i20 = 3;
                                            i19 = 3;
                                        } else {
                                            i20 = 3;
                                        }
                                        if (!z8) {
                                            i18 = size3;
                                        } else {
                                            if (dszVar2.W(1) || (dsyVar3 instanceof defpackage.dte)) {
                                                i18 = size3;
                                            } else {
                                                boolean z23 = i19 == 3 && dsyVar3.s == 0 && i20 != 3 && !dsyVar3.H();
                                                i18 = size3;
                                                if (i20 == 3 && dsyVar3.t == 0 && i19 != 3 && !dsyVar3.H()) {
                                                    z23 = true;
                                                }
                                                if (((i19 == 3 || i20 == 3) && dsyVar3.X > 0.0f) || z23) {
                                                }
                                            }
                                            aogcVar.bt(dtwVar6, dsyVar3, 0);
                                        }
                                    }
                                    i19 = 3;
                                } else {
                                    i19 = iL4;
                                    i20 = iL5;
                                }
                                z8 = false;
                                if (!z8) {
                                    i18 = size3;
                                } else if (dszVar2.W(1)) {
                                    i18 = size3;
                                    aogcVar.bt(dtwVar6, dsyVar3, 0);
                                } else {
                                    i18 = size3;
                                    aogcVar.bt(dtwVar6, dsyVar3, 0);
                                }
                            }
                        }
                        i15++;
                        size3 = i18;
                    }
                    constraintLayout = dtwVar6.a;
                    childCount = constraintLayout.getChildCount();
                    for (i16 = 0; i16 < childCount; i16++) {
                        childAt = constraintLayout.getChildAt(i16);
                        if (childAt instanceof defpackage.dug) {
                            throw null;
                        }
                    }
                    arrayList4 = constraintLayout.b;
                    size4 = arrayList4.size();
                    if (size4 > 0) {
                        for (i17 = 0; i17 < size4; i17++) {
                        }
                    }
                }
                aogcVar.bs(dszVar2);
                arrayList = (java.util.ArrayList) aogcVar.a;
                size2 = arrayList.size();
                if (i6 > 0) {
                    aogcVar.bu(dszVar2, 0, iJ, iH);
                }
                if (size2 > 0) {
                    iM = dszVar2.M();
                    iN = dszVar2.N();
                    int iJ9 = dszVar2.j();
                    defpackage.dsy dsyVar11 = (defpackage.dsy) aogcVar.b;
                    iMax3 = java.lang.Math.max(iJ9, dsyVar11.ac);
                    iMax4 = java.lang.Math.max(dszVar2.h(), dsyVar11.ad);
                    z7 = false;
                    i10 = 0;
                    while (i10 < size2) {
                        dsyVar2 = (defpackage.dsy) arrayList.get(i10);
                        zBt2 = z7;
                        if (dsyVar2 instanceof defpackage.dte) {
                            iJ4 = dsyVar2.j();
                            iH4 = dsyVar2.h();
                            zBt2 |= aogcVar.bt(dtwVar, dsyVar2, 1);
                            iJ5 = dsyVar2.j();
                            iH5 = dsyVar2.h();
                            if (iJ5 != iJ4) {
                                dsyVar2.C(iJ5);
                                if (iM == 2 && dsyVar2.i() > iMax3) {
                                    iMax3 = java.lang.Math.max(iMax3, dsyVar2.i() + dsyVar2.K(4).b());
                                }
                                zBt2 = true;
                            }
                            if (iH5 != iH4) {
                                dsyVar2.x(iH5);
                                if (iN == 2 && dsyVar2.g() > iMax4) {
                                    iMax4 = java.lang.Math.max(iMax4, dsyVar2.g() + dsyVar2.K(5).b());
                                }
                                zBt2 = true;
                            }
                        }
                        z7 = zBt2;
                        i10++;
                        dtwVar5 = dtwVar5;
                        i9 = i9;
                    }
                    int i44 = i9;
                    dtwVar2 = dtwVar5;
                    zBt = z7;
                    i11 = 2;
                    i12 = 0;
                    while (i12 < i11) {
                        i13 = 0;
                        while (i13 < size2) {
                            dsyVar = (defpackage.dsy) arrayList.get(i13);
                            if (!((dsyVar instanceof defpackage.dtc) || (dsyVar instanceof defpackage.dte)) || (dsyVar instanceof defpackage.dtb) || dsyVar.ah == 8 || ((z6 && dsyVar.h.e.i && dsyVar.i.e.i) || (dsyVar instanceof defpackage.dte))) {
                                i14 = i13;
                                arrayList3 = arrayList;
                                dtwVar4 = dtwVar;
                            } else {
                                iJ2 = dsyVar.j();
                                iH2 = dsyVar.h();
                                i14 = i13;
                                int i45 = dsyVar.ab;
                                arrayList3 = arrayList;
                                zBt |= aogcVar.bt(dtwVar, dsyVar, i12 == 1 ? 2 : 1);
                                iJ3 = dsyVar.j();
                                dtwVar4 = dtwVar;
                                iH3 = dsyVar.h();
                                if (iJ3 != iJ2) {
                                    dsyVar.C(iJ3);
                                    if (iM == 2 && dsyVar.i() > iMax3) {
                                        iMax3 = java.lang.Math.max(iMax3, dsyVar.i() + dsyVar.K(4).b());
                                    }
                                    zBt = true;
                                }
                                if (iH3 != iH2) {
                                    dsyVar.x(iH3);
                                    if (iN == 2 && dsyVar.g() > iMax4) {
                                        iMax4 = java.lang.Math.max(iMax4, dsyVar.g() + dsyVar.K(5).b());
                                    }
                                    zBt = true;
                                }
                                if (!dsyVar.F && i45 != dsyVar.ab) {
                                    zBt = true;
                                }
                            }
                            i13 = i14 + 1;
                            arrayList = arrayList3;
                            dtwVar = dtwVar4;
                        }
                        arrayList2 = arrayList;
                        dtwVar3 = dtwVar;
                        if (!zBt) {
                            break;
                        }
                        i12++;
                        aogcVar.bu(dszVar2, i12, iJ, iH);
                        i11 = 2;
                        arrayList = arrayList2;
                        dtwVar = dtwVar3;
                        zBt = false;
                    }
                    i9 = i44;
                } else {
                    dtwVar2 = dtwVar5;
                }
                dszVar2.U(i9);
            } else {
                dtwVar2 = dtwVar5;
            }
            int iJ10 = dszVar2.j();
            int iH11 = dszVar2.h();
            z9 = dszVar2.ax;
            z10 = dszVar2.ay;
            defpackage.dtw dtwVar7 = dtwVar2;
            int i46 = dtwVar7.e;
            int iResolveSizeAndState = resolveSizeAndState(iJ10 + dtwVar7.d, i, 0) & 16777215;
            int iResolveSizeAndState2 = resolveSizeAndState(iH11 + i46, i2, 0) & 16777215;
            iMin = java.lang.Math.min(this.e, iResolveSizeAndState);
            iMin2 = java.lang.Math.min(this.k, iResolveSizeAndState2);
            if (z9) {
                iMin |= 16777216;
            }
            if (z10) {
                iMin2 |= 16777216;
            }
            setMeasuredDimension(iMin, iMin2);
        }
        iMax2 = childCount4 == 0 ? java.lang.Math.max(0, this.d) : i39;
        i4 = 2;
        if (iMax == dszVar2.j()) {
            z = true;
            dszVar2.aG.b = true;
        } else {
            z = true;
            dszVar2.aG.b = true;
        }
        dszVar2.Z = 0;
        dszVar2.aa = 0;
        boolean z24 = z;
        int i47 = this.e - i41;
        iArr = dszVar2.D;
        iArr[0] = i47;
        iArr[z24 ? 1 : 0] = this.k - i40;
        dszVar2.B(0);
        dszVar2.A(0);
        dszVar2.P(i3);
        dszVar2.C(iMax);
        dszVar2.Q(i4);
        dszVar2.x(iMax2);
        dszVar2.B(this.j - i41);
        dszVar2.A(this.d - i40);
        dszVar2.d = iMax9;
        dszVar2.ar = iMax5;
        aogcVar = dszVar2.aH;
        dtwVar = dszVar2.aF;
        size = dszVar2.aI.size();
        i5 = i36 & 128;
        iJ = dszVar2.j();
        iH = dszVar2.h();
        if (i5 == 128) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (z3) {
            i32 = 0;
            while (true) {
                if (i32 < size) {
                    iArr2 = iArr;
                    dsyVar5 = (defpackage.dsy) dszVar2.aI.get(i32);
                    z19 = z3;
                    iM2 = dsyVar5.M();
                    i6 = size;
                    int iN3 = dsyVar5.N();
                    i33 = i32;
                    if (iM2 == 3) {
                        z20 = false;
                    } else {
                        z20 = false;
                    }
                    if (dsyVar5.H()) {
                        if (dsyVar5.I()) {
                            i32 = i33 + 1;
                            iArr = iArr2;
                            z3 = z19;
                            size = i6;
                        } else {
                            i32 = i33 + 1;
                            iArr = iArr2;
                            z3 = z19;
                            size = i6;
                        }
                    } else if (!z20) {
                        z20 = false;
                        if (dsyVar5.I()) {
                            i32 = i33 + 1;
                            iArr = iArr2;
                            z3 = z19;
                            size = i6;
                        } else {
                            i32 = i33 + 1;
                            iArr = iArr2;
                            z3 = z19;
                            size = i6;
                        }
                    }
                    i7 = 1073741824;
                    z4 = false;
                } else {
                    iArr2 = iArr;
                    z4 = z3;
                    i6 = size;
                    i7 = 1073741824;
                }
            }
        } else {
            iArr2 = iArr;
            z4 = z3;
            i6 = size;
            i7 = 1073741824;
        }
        if (mode != i7) {
            if (z2) {
                z5 = true;
            } else {
                z5 = false;
            }
        } else if (mode2 != i7) {
            mode = 1073741824;
            if (z2) {
                z5 = true;
            } else {
                z5 = false;
            }
        } else {
            z5 = true;
            mode = 1073741824;
            mode2 = 1073741824;
        }
        z6 = z4 & z5;
        if (z6) {
            iMin3 = java.lang.Math.min(iArr2[0], i38);
            iMin4 = java.lang.Math.min(iArr2[1], i39);
            if (mode == 1073741824) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (mode == 1073741824) {
                dszVar2.C(iMin3);
                dszVar2.c();
            }
            if (mode2 == 1073741824) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (mode2 == 1073741824) {
                dszVar2.x(iMin4);
                dszVar2.c();
            }
            if (mode != 1073741824) {
                z13 = z12;
                z14 = z11;
                fxyVar = dszVar2.aG;
                if (fxyVar.a) {
                    obj = fxyVar.f;
                    defpackage.dsz dszVar8 = (defpackage.dsz) obj;
                    arrayList5 = dszVar8.aI;
                    i22 = 0;
                    while (i22 < size5) {
                        defpackage.dsy dsyVar12 = (defpackage.dsy) arrayList5.get(i22);
                        dsyVar12.r();
                        dsyVar12.e = false;
                        java.util.ArrayList arrayList9 = arrayList5;
                        dto dtoVar6 = dsyVar12.h;
                        dtoVar6.e.i = false;
                        dtoVar6.g = false;
                        dtoVar6.g();
                        dtp dtpVar6 = dsyVar12.i;
                        dtpVar6.e.i = false;
                        dtpVar6.g = false;
                        dtpVar6.g();
                        i22++;
                        arrayList5 = arrayList9;
                        obj = obj;
                    }
                    java.lang.Object obj8 = obj;
                    i21 = 0;
                    ((defpackage.dsy) obj8).r();
                    dszVar8.e = false;
                    dto dtoVar7 = dszVar8.h;
                    dtoVar7.e.i = false;
                    dtoVar7.g = false;
                    dtoVar7.g();
                    dtp dtpVar7 = dszVar8.i;
                    dtpVar7.e.i = false;
                    dtpVar7.g = false;
                    dtpVar7.g();
                    fxyVar.h();
                } else {
                    i21 = 0;
                }
                fxyVar.j((defpackage.dsz) fxyVar.e);
                java.lang.Object obj9 = fxyVar.f;
                defpackage.dsy dsyVar13 = (defpackage.dsy) obj9;
                dsyVar13.Z = i21;
                dsyVar13.aa = i21;
                defpackage.dsz dszVar9 = (defpackage.dsz) obj9;
                dszVar9.h.h.c(i21);
                dszVar9.i.h.c(i21);
                if (mode == 1073741824) {
                    zV = dszVar2.V(z2, i21);
                    i8 = 1;
                } else {
                    i8 = 0;
                    zV = true;
                }
                if (mode2 == 1073741824) {
                    zV &= dszVar2.V(z2, 1);
                    i8++;
                }
            } else if (mode2 == 1073741824) {
                fxyVar2 = dszVar2.aG;
                if (fxyVar2.a) {
                    java.lang.Object obj10 = fxyVar2.f;
                    defpackage.dsz dszVar10 = (defpackage.dsz) obj10;
                    arrayList6 = dszVar10.aI;
                    size6 = arrayList6.size();
                    i23 = 0;
                    while (i23 < size6) {
                        int i48 = i23;
                        defpackage.dsy dsyVar14 = (defpackage.dsy) arrayList6.get(i23);
                        dsyVar14.r();
                        dsyVar14.e = false;
                        dsyVar14.h.g();
                        dsyVar14.i.g();
                        i23 = i48 + 1;
                        z12 = z12;
                    }
                    z13 = z12;
                    ((defpackage.dsy) obj10).r();
                    i24 = 0;
                    dszVar10.e = false;
                    dszVar10.h.g();
                    dszVar10.i.g();
                    fxyVar2.b = false;
                } else {
                    java.lang.Object obj11 = fxyVar2.f;
                    defpackage.dsz dszVar11 = (defpackage.dsz) obj11;
                    arrayList6 = dszVar11.aI;
                    size6 = arrayList6.size();
                    i23 = 0;
                    while (i23 < size6) {
                        int i49 = i23;
                        defpackage.dsy dsyVar15 = (defpackage.dsy) arrayList6.get(i23);
                        dsyVar15.r();
                        dsyVar15.e = false;
                        dsyVar15.h.g();
                        dsyVar15.i.g();
                        i23 = i49 + 1;
                        z12 = z12;
                    }
                    z13 = z12;
                    ((defpackage.dsy) obj11).r();
                    i24 = 0;
                    dszVar11.e = false;
                    dszVar11.h.g();
                    dszVar11.i.g();
                    fxyVar2.b = false;
                }
                fxyVar2.j((defpackage.dsz) fxyVar2.e);
                obj2 = fxyVar2.f;
                dsyVar4 = (defpackage.dsy) obj2;
                dsyVar4.Z = i24;
                dsyVar4.aa = i24;
                iL = dsyVar4.L(i24);
                iL2 = dsyVar4.L(1);
                if (fxyVar2.a) {
                    fxyVar2.h();
                }
                iK = dsyVar4.k();
                iL3 = dsyVar4.l();
                z14 = z11;
                dszVar = (defpackage.dsz) obj2;
                dszVar.h.h.c(iK);
                dszVar.i.h.c(iL3);
                fxyVar2.i();
                if (iL != 2) {
                    if (iL2 == 2) {
                        z15 = true;
                        z16 = !z2;
                        i25 = 2;
                    } else {
                        i26 = iK;
                    }
                    iArr3 = dszVar.aq;
                    i27 = iArr3[0];
                    if (i27 != 1) {
                        int iJ11 = i26 + dsyVar4.j();
                        dszVar.h.i.c(iJ11);
                        dszVar.h.e.c(iJ11 - i26);
                        fxyVar2.i();
                        i28 = iArr3[1];
                        if (i28 != 1) {
                            int iH12 = dsyVar4.h() + iL3;
                            dszVar.i.i.c(iH12);
                            dszVar.i.e.c(iH12 - iL3);
                        } else {
                            int iH13 = dsyVar4.h() + iL3;
                            dszVar.i.i.c(iH13);
                            dszVar.i.e.c(iH13 - iL3);
                        }
                        fxyVar2.i();
                        z17 = true;
                    } else {
                        int iJ12 = i26 + dsyVar4.j();
                        dszVar.h.i.c(iJ12);
                        dszVar.h.e.c(iJ12 - i26);
                        fxyVar2.i();
                        i28 = iArr3[1];
                        if (i28 != 1) {
                            int iH14 = dsyVar4.h() + iL3;
                            dszVar.i.i.c(iH14);
                            dszVar.i.e.c(iH14 - iL3);
                        } else {
                            int iH15 = dsyVar4.h() + iL3;
                            dszVar.i.i.c(iH15);
                            dszVar.i.e.c(iH15 - iL3);
                        }
                        fxyVar2.i();
                        z17 = true;
                    }
                    r7 = fxyVar2.h;
                    size7 = r7.size();
                    while (i29 < size7) {
                        dtrVar = (defpackage.dtr) r7.get(i29);
                        if (dtrVar.d == obj2) {
                            dtrVar.c();
                        } else {
                            dtrVar.c();
                        }
                    }
                    size8 = r7.size();
                    i30 = 0;
                    while (true) {
                        if (i30 < size8) {
                            z18 = true;
                            break;
                        }
                        defpackage.dtr dtrVar4 = (defpackage.dtr) r7.get(i30);
                        if (!z17) {
                            z18 = false;
                            break;
                        } else {
                            z18 = false;
                            break;
                        }
                        i30++;
                    }
                    dsyVar4.P(iL);
                    dsyVar4.Q(iL2);
                    zV = z18;
                    i8 = 2;
                } else {
                    z15 = true;
                    if (z2) {
                        i25 = iL2;
                        z16 = false;
                    } else {
                        i25 = iL2;
                        z16 = true;
                    }
                }
                if (z15 != z16) {
                    r0 = fxyVar2.h;
                    size9 = r0.size();
                    i26 = iK;
                    i31 = 0;
                    do {
                        if (i31 < size9) {
                            if (iL == 2) {
                                dsyVar4.P(1);
                                dsyVar4.C(fxyVar2.g(dszVar, 0));
                                dszVar.h.e.c(dsyVar4.j());
                                iL = 2;
                            }
                            if (i25 == 2) {
                                break;
                            }
                            dsyVar4.Q(1);
                            dsyVar4.x(fxyVar2.g(dszVar, 1));
                            dszVar.i.e.c(dsyVar4.h());
                            break;
                        }
                        zE = ((defpackage.dtr) r0.get(i31)).e();
                        i31++;
                    } while (zE);
                } else {
                    i26 = iK;
                }
                iL2 = i25;
                iArr3 = dszVar.aq;
                i27 = iArr3[0];
                if (i27 != 1) {
                    int iJ13 = i26 + dsyVar4.j();
                    dszVar.h.i.c(iJ13);
                    dszVar.h.e.c(iJ13 - i26);
                    fxyVar2.i();
                    i28 = iArr3[1];
                    if (i28 != 1) {
                        int iH16 = dsyVar4.h() + iL3;
                        dszVar.i.i.c(iH16);
                        dszVar.i.e.c(iH16 - iL3);
                    } else {
                        int iH17 = dsyVar4.h() + iL3;
                        dszVar.i.i.c(iH17);
                        dszVar.i.e.c(iH17 - iL3);
                    }
                    fxyVar2.i();
                    z17 = true;
                } else {
                    int iJ14 = i26 + dsyVar4.j();
                    dszVar.h.i.c(iJ14);
                    dszVar.h.e.c(iJ14 - i26);
                    fxyVar2.i();
                    i28 = iArr3[1];
                    if (i28 != 1) {
                        int iH18 = dsyVar4.h() + iL3;
                        dszVar.i.i.c(iH18);
                        dszVar.i.e.c(iH18 - iL3);
                    } else {
                        int iH19 = dsyVar4.h() + iL3;
                        dszVar.i.i.c(iH19);
                        dszVar.i.e.c(iH19 - iL3);
                    }
                    fxyVar2.i();
                    z17 = true;
                }
                r7 = fxyVar2.h;
                size7 = r7.size();
                while (i29 < size7) {
                    dtrVar = (defpackage.dtr) r7.get(i29);
                    if (dtrVar.d == obj2) {
                        dtrVar.c();
                    } else {
                        dtrVar.c();
                    }
                }
                size8 = r7.size();
                i30 = 0;
                while (true) {
                    if (i30 < size8) {
                        z18 = true;
                        break;
                    }
                    defpackage.dtr dtrVar5 = (defpackage.dtr) r7.get(i30);
                    if (!z17) {
                        z18 = false;
                        break;
                    } else {
                        z18 = false;
                        break;
                    }
                    i30++;
                }
                dsyVar4.P(iL);
                dsyVar4.Q(iL2);
                zV = z18;
                i8 = 2;
            } else {
                mode = 1073741824;
                z13 = z12;
                z14 = z11;
                fxyVar = dszVar2.aG;
                if (fxyVar.a) {
                    obj = fxyVar.f;
                    defpackage.dsz dszVar12 = (defpackage.dsz) obj;
                    arrayList5 = dszVar12.aI;
                    i22 = 0;
                    while (i22 < size5) {
                        defpackage.dsy dsyVar16 = (defpackage.dsy) arrayList5.get(i22);
                        dsyVar16.r();
                        dsyVar16.e = false;
                        java.util.ArrayList arrayList10 = arrayList5;
                        dto dtoVar8 = dsyVar16.h;
                        dtoVar8.e.i = false;
                        dtoVar8.g = false;
                        dtoVar8.g();
                        dtp dtpVar8 = dsyVar16.i;
                        dtpVar8.e.i = false;
                        dtpVar8.g = false;
                        dtpVar8.g();
                        i22++;
                        arrayList5 = arrayList10;
                        obj = obj;
                    }
                    java.lang.Object obj12 = obj;
                    i21 = 0;
                    ((defpackage.dsy) obj12).r();
                    dszVar12.e = false;
                    dto dtoVar9 = dszVar12.h;
                    dtoVar9.e.i = false;
                    dtoVar9.g = false;
                    dtoVar9.g();
                    dtp dtpVar9 = dszVar12.i;
                    dtpVar9.e.i = false;
                    dtpVar9.g = false;
                    dtpVar9.g();
                    fxyVar.h();
                } else {
                    i21 = 0;
                }
                fxyVar.j((defpackage.dsz) fxyVar.e);
                java.lang.Object obj13 = fxyVar.f;
                defpackage.dsy dsyVar17 = (defpackage.dsy) obj13;
                dsyVar17.Z = i21;
                dsyVar17.aa = i21;
                defpackage.dsz dszVar13 = (defpackage.dsz) obj13;
                dszVar13.h.h.c(i21);
                dszVar13.i.h.c(i21);
                if (mode == 1073741824) {
                    zV = dszVar2.V(z2, i21);
                    i8 = 1;
                } else {
                    i8 = 0;
                    zV = true;
                }
                if (mode2 == 1073741824) {
                    zV &= dszVar2.V(z2, 1);
                    i8++;
                }
            }
            if (zV) {
                dszVar2.D(!z14, !z13);
            }
        } else {
            i8 = 0;
            zV = false;
        }
        if (zV) {
            i9 = dszVar2.aw;
            if (i6 > 0) {
                size3 = dszVar2.aI.size();
                boolean zW2 = dszVar2.W(64);
                defpackage.dtw dtwVar8 = dszVar2.aF;
                i15 = 0;
                while (i15 < size3) {
                    dsyVar3 = (defpackage.dsy) dszVar2.aI.get(i15);
                    if (dsyVar3 instanceof defpackage.dtb) {
                        i18 = size3;
                    } else {
                        i18 = size3;
                    }
                    i15++;
                    size3 = i18;
                }
                constraintLayout = dtwVar8.a;
                childCount = constraintLayout.getChildCount();
                while (i16 < childCount) {
                    childAt = constraintLayout.getChildAt(i16);
                    if (childAt instanceof defpackage.dug) {
                        throw null;
                    }
                }
                arrayList4 = constraintLayout.b;
                size4 = arrayList4.size();
                if (size4 > 0) {
                    while (i17 < size4) {
                    }
                }
            }
            aogcVar.bs(dszVar2);
            arrayList = (java.util.ArrayList) aogcVar.a;
            size2 = arrayList.size();
            if (i6 > 0) {
                aogcVar.bu(dszVar2, 0, iJ, iH);
            }
            if (size2 > 0) {
                iM = dszVar2.M();
                iN = dszVar2.N();
                int iJ15 = dszVar2.j();
                defpackage.dsy dsyVar18 = (defpackage.dsy) aogcVar.b;
                iMax3 = java.lang.Math.max(iJ15, dsyVar18.ac);
                iMax4 = java.lang.Math.max(dszVar2.h(), dsyVar18.ad);
                z7 = false;
                i10 = 0;
                while (i10 < size2) {
                    dsyVar2 = (defpackage.dsy) arrayList.get(i10);
                    zBt2 = z7;
                    if (dsyVar2 instanceof defpackage.dte) {
                        iJ4 = dsyVar2.j();
                        iH4 = dsyVar2.h();
                        zBt2 |= aogcVar.bt(dtwVar, dsyVar2, 1);
                        iJ5 = dsyVar2.j();
                        iH5 = dsyVar2.h();
                        if (iJ5 != iJ4) {
                            dsyVar2.C(iJ5);
                            if (iM == 2) {
                                iMax3 = java.lang.Math.max(iMax3, dsyVar2.i() + dsyVar2.K(4).b());
                            }
                            zBt2 = true;
                        }
                        if (iH5 != iH4) {
                            dsyVar2.x(iH5);
                            if (iN == 2) {
                                iMax4 = java.lang.Math.max(iMax4, dsyVar2.g() + dsyVar2.K(5).b());
                            }
                            zBt2 = true;
                        }
                    }
                    z7 = zBt2;
                    i10++;
                    dtwVar5 = dtwVar5;
                    i9 = i9;
                }
                int i410 = i9;
                dtwVar2 = dtwVar5;
                zBt = z7;
                i11 = 2;
                i12 = 0;
                while (i12 < i11) {
                    i13 = 0;
                    while (i13 < size2) {
                        dsyVar = (defpackage.dsy) arrayList.get(i13);
                        if (dsyVar instanceof defpackage.dtc) {
                            iJ2 = dsyVar.j();
                            iH2 = dsyVar.h();
                            i14 = i13;
                            int i411 = dsyVar.ab;
                            arrayList3 = arrayList;
                            zBt |= aogcVar.bt(dtwVar, dsyVar, i12 == 1 ? 2 : 1);
                            iJ3 = dsyVar.j();
                            dtwVar4 = dtwVar;
                            iH3 = dsyVar.h();
                            if (iJ3 != iJ2) {
                                dsyVar.C(iJ3);
                                if (iM == 2) {
                                    iMax3 = java.lang.Math.max(iMax3, dsyVar.i() + dsyVar.K(4).b());
                                }
                                zBt = true;
                            }
                            if (iH3 != iH2) {
                                dsyVar.x(iH3);
                                if (iN == 2) {
                                    iMax4 = java.lang.Math.max(iMax4, dsyVar.g() + dsyVar.K(5).b());
                                }
                                zBt = true;
                            }
                            if (!dsyVar.F) {
                            }
                        } else {
                            iJ2 = dsyVar.j();
                            iH2 = dsyVar.h();
                            i14 = i13;
                            int i412 = dsyVar.ab;
                            arrayList3 = arrayList;
                            zBt |= aogcVar.bt(dtwVar, dsyVar, i12 == 1 ? 2 : 1);
                            iJ3 = dsyVar.j();
                            dtwVar4 = dtwVar;
                            iH3 = dsyVar.h();
                            if (iJ3 != iJ2) {
                                dsyVar.C(iJ3);
                                if (iM == 2) {
                                    iMax3 = java.lang.Math.max(iMax3, dsyVar.i() + dsyVar.K(4).b());
                                }
                                zBt = true;
                            }
                            if (iH3 != iH2) {
                                dsyVar.x(iH3);
                                if (iN == 2) {
                                    iMax4 = java.lang.Math.max(iMax4, dsyVar.g() + dsyVar.K(5).b());
                                }
                                zBt = true;
                            }
                            if (!dsyVar.F) {
                            }
                        }
                        i13 = i14 + 1;
                        arrayList = arrayList3;
                        dtwVar = dtwVar4;
                    }
                    arrayList2 = arrayList;
                    dtwVar3 = dtwVar;
                    if (!zBt) {
                        break;
                        break;
                    }
                    i12++;
                    aogcVar.bu(dszVar2, i12, iJ, iH);
                    i11 = 2;
                    arrayList = arrayList2;
                    dtwVar = dtwVar3;
                    zBt = false;
                }
                i9 = i410;
            } else {
                dtwVar2 = dtwVar5;
            }
            dszVar2.U(i9);
        } else {
            i9 = dszVar2.aw;
            if (i6 > 0) {
                size3 = dszVar2.aI.size();
                boolean zW3 = dszVar2.W(64);
                defpackage.dtw dtwVar9 = dszVar2.aF;
                i15 = 0;
                while (i15 < size3) {
                    dsyVar3 = (defpackage.dsy) dszVar2.aI.get(i15);
                    if (dsyVar3 instanceof defpackage.dtb) {
                        i18 = size3;
                    } else {
                        i18 = size3;
                    }
                    i15++;
                    size3 = i18;
                }
                constraintLayout = dtwVar9.a;
                childCount = constraintLayout.getChildCount();
                while (i16 < childCount) {
                    childAt = constraintLayout.getChildAt(i16);
                    if (childAt instanceof defpackage.dug) {
                        throw null;
                    }
                }
                arrayList4 = constraintLayout.b;
                size4 = arrayList4.size();
                if (size4 > 0) {
                    while (i17 < size4) {
                    }
                }
            }
            aogcVar.bs(dszVar2);
            arrayList = (java.util.ArrayList) aogcVar.a;
            size2 = arrayList.size();
            if (i6 > 0) {
                aogcVar.bu(dszVar2, 0, iJ, iH);
            }
            if (size2 > 0) {
                iM = dszVar2.M();
                iN = dszVar2.N();
                int iJ16 = dszVar2.j();
                defpackage.dsy dsyVar19 = (defpackage.dsy) aogcVar.b;
                iMax3 = java.lang.Math.max(iJ16, dsyVar19.ac);
                iMax4 = java.lang.Math.max(dszVar2.h(), dsyVar19.ad);
                z7 = false;
                i10 = 0;
                while (i10 < size2) {
                    dsyVar2 = (defpackage.dsy) arrayList.get(i10);
                    zBt2 = z7;
                    if (dsyVar2 instanceof defpackage.dte) {
                        iJ4 = dsyVar2.j();
                        iH4 = dsyVar2.h();
                        zBt2 |= aogcVar.bt(dtwVar, dsyVar2, 1);
                        iJ5 = dsyVar2.j();
                        iH5 = dsyVar2.h();
                        if (iJ5 != iJ4) {
                            dsyVar2.C(iJ5);
                            if (iM == 2) {
                                iMax3 = java.lang.Math.max(iMax3, dsyVar2.i() + dsyVar2.K(4).b());
                            }
                            zBt2 = true;
                        }
                        if (iH5 != iH4) {
                            dsyVar2.x(iH5);
                            if (iN == 2) {
                                iMax4 = java.lang.Math.max(iMax4, dsyVar2.g() + dsyVar2.K(5).b());
                            }
                            zBt2 = true;
                        }
                    }
                    z7 = zBt2;
                    i10++;
                    dtwVar5 = dtwVar5;
                    i9 = i9;
                }
                int i413 = i9;
                dtwVar2 = dtwVar5;
                zBt = z7;
                i11 = 2;
                i12 = 0;
                while (i12 < i11) {
                    i13 = 0;
                    while (i13 < size2) {
                        dsyVar = (defpackage.dsy) arrayList.get(i13);
                        if (dsyVar instanceof defpackage.dtc) {
                            iJ2 = dsyVar.j();
                            iH2 = dsyVar.h();
                            i14 = i13;
                            int i414 = dsyVar.ab;
                            arrayList3 = arrayList;
                            zBt |= aogcVar.bt(dtwVar, dsyVar, i12 == 1 ? 2 : 1);
                            iJ3 = dsyVar.j();
                            dtwVar4 = dtwVar;
                            iH3 = dsyVar.h();
                            if (iJ3 != iJ2) {
                                dsyVar.C(iJ3);
                                if (iM == 2) {
                                    iMax3 = java.lang.Math.max(iMax3, dsyVar.i() + dsyVar.K(4).b());
                                }
                                zBt = true;
                            }
                            if (iH3 != iH2) {
                                dsyVar.x(iH3);
                                if (iN == 2) {
                                    iMax4 = java.lang.Math.max(iMax4, dsyVar.g() + dsyVar.K(5).b());
                                }
                                zBt = true;
                            }
                            if (!dsyVar.F) {
                            }
                        } else {
                            iJ2 = dsyVar.j();
                            iH2 = dsyVar.h();
                            i14 = i13;
                            int i415 = dsyVar.ab;
                            arrayList3 = arrayList;
                            zBt |= aogcVar.bt(dtwVar, dsyVar, i12 == 1 ? 2 : 1);
                            iJ3 = dsyVar.j();
                            dtwVar4 = dtwVar;
                            iH3 = dsyVar.h();
                            if (iJ3 != iJ2) {
                                dsyVar.C(iJ3);
                                if (iM == 2) {
                                    iMax3 = java.lang.Math.max(iMax3, dsyVar.i() + dsyVar.K(4).b());
                                }
                                zBt = true;
                            }
                            if (iH3 != iH2) {
                                dsyVar.x(iH3);
                                if (iN == 2) {
                                    iMax4 = java.lang.Math.max(iMax4, dsyVar.g() + dsyVar.K(5).b());
                                }
                                zBt = true;
                            }
                            if (!dsyVar.F) {
                            }
                        }
                        i13 = i14 + 1;
                        arrayList = arrayList3;
                        dtwVar = dtwVar4;
                    }
                    arrayList2 = arrayList;
                    dtwVar3 = dtwVar;
                    if (!zBt) {
                        break;
                        break;
                    }
                    i12++;
                    aogcVar.bu(dszVar2, i12, iJ, iH);
                    i11 = 2;
                    arrayList = arrayList2;
                    dtwVar = dtwVar3;
                    zBt = false;
                }
                i9 = i413;
            } else {
                dtwVar2 = dtwVar5;
            }
            dszVar2.U(i9);
        }
        int iJ17 = dszVar2.j();
        int iH110 = dszVar2.h();
        z9 = dszVar2.ax;
        z10 = dszVar2.ay;
        defpackage.dtw dtwVar10 = dtwVar2;
        int i416 = dtwVar10.e;
        int iResolveSizeAndState3 = resolveSizeAndState(iJ17 + dtwVar10.d, i, 0) & 16777215;
        int iResolveSizeAndState4 = resolveSizeAndState(iH110 + i416, i2, 0) & 16777215;
        iMin = java.lang.Math.min(this.e, iResolveSizeAndState3);
        iMin2 = java.lang.Math.min(this.k, iResolveSizeAndState4);
        if (z9) {
            iMin |= 16777216;
        }
        if (z10) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(android.view.View view) {
        super.onViewAdded(view);
        boolean z = view instanceof androidx.constraintlayout.widget.Guideline;
        defpackage.dsy dsyVarEd = ed(view);
        if (z && !(dsyVarEd instanceof defpackage.dtb)) {
            defpackage.dtv dtvVar = (defpackage.dtv) view.getLayoutParams();
            dtvVar.av = new defpackage.dtb();
            dtvVar.ah = true;
            ((defpackage.dtb) dtvVar.av).c(dtvVar.Z);
        }
        if (view instanceof defpackage.dtt) {
            defpackage.dtt dttVar = (defpackage.dtt) view;
            dttVar.h();
            ((defpackage.dtv) view.getLayoutParams()).ai = true;
            java.util.ArrayList arrayList = this.b;
            if (!arrayList.contains(dttVar)) {
                arrayList.add(dttVar);
            }
        }
        this.a.put(view.getId(), view);
        this.f = true;
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(android.view.View view) {
        super.onViewRemoved(view);
        this.a.remove(view.getId());
        this.c.Y(ed(view));
        this.b.remove(view);
        this.f = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        f();
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setId(int i) {
        android.util.SparseArray sparseArray = this.a;
        sparseArray.remove(getId());
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    protected final android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new defpackage.dtv(layoutParams);
    }

    public ConstraintLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new android.util.SparseArray();
        this.b = new java.util.ArrayList(4);
        this.c = new defpackage.dsz();
        this.j = 0;
        this.d = 0;
        this.e = Integer.MAX_VALUE;
        this.k = Integer.MAX_VALUE;
        this.f = true;
        this.g = 257;
        this.h = null;
        this.l = -1;
        this.m = new java.util.HashMap();
        this.n = new android.util.SparseArray();
        this.i = new defpackage.dtw(this, this);
        e(attributeSet, 0, 0);
    }

    public ConstraintLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new android.util.SparseArray();
        this.b = new java.util.ArrayList(4);
        this.c = new defpackage.dsz();
        this.j = 0;
        this.d = 0;
        this.e = Integer.MAX_VALUE;
        this.k = Integer.MAX_VALUE;
        this.f = true;
        this.g = 257;
        this.h = null;
        this.l = -1;
        this.m = new java.util.HashMap();
        this.n = new android.util.SparseArray();
        this.i = new defpackage.dtw(this, this);
        e(attributeSet, i, 0);
    }

    public ConstraintLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = new android.util.SparseArray();
        this.b = new java.util.ArrayList(4);
        this.c = new defpackage.dsz();
        this.j = 0;
        this.d = 0;
        this.e = Integer.MAX_VALUE;
        this.k = Integer.MAX_VALUE;
        this.f = true;
        this.g = 257;
        this.h = null;
        this.l = -1;
        this.m = new java.util.HashMap();
        this.n = new android.util.SparseArray();
        this.i = new defpackage.dtw(this, this);
        e(attributeSet, i, i2);
    }
}
