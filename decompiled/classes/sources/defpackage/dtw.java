package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dtw {
    public final androidx.constraintlayout.widget.ConstraintLayout a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    final /* synthetic */ androidx.constraintlayout.widget.ConstraintLayout h;

    public dtw(androidx.constraintlayout.widget.ConstraintLayout constraintLayout, androidx.constraintlayout.widget.ConstraintLayout constraintLayout2) {
        this.h = constraintLayout;
        this.a = constraintLayout2;
    }

    private static final boolean b(int i, int i2, int i3) {
        if (i == i2) {
            return true;
        }
        int mode = android.view.View.MeasureSpec.getMode(i);
        return android.view.View.MeasureSpec.getMode(i2) == 1073741824 && (mode == Integer.MIN_VALUE || mode == 0) && i3 == android.view.View.MeasureSpec.getSize(i2);
    }

    public final void a(defpackage.dsy dsyVar, defpackage.dtg dtgVar) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int baseline;
        int iMax;
        int iMax2;
        int i;
        int i2;
        int i3;
        if (dsyVar != null) {
            if (dsyVar.ah == 8) {
                dtgVar.c = 0;
                dtgVar.d = 0;
                dtgVar.e = 0;
                return;
            }
            if (dsyVar.U != null) {
                int i4 = dtgVar.i;
                int i5 = dtgVar.j;
                int i6 = dtgVar.a;
                int i7 = dtgVar.b;
                int i8 = this.b + this.c;
                int i9 = this.d;
                java.lang.Object obj = dsyVar.ag;
                int i10 = i4 - 1;
                if (i4 == 0) {
                    throw null;
                }
                if (i10 == 0) {
                    iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
                } else if (i10 == 1) {
                    iMakeMeasureSpec = android.view.ViewGroup.getChildMeasureSpec(this.f, i9, -2);
                } else if (i10 == 2) {
                    iMakeMeasureSpec = android.view.ViewGroup.getChildMeasureSpec(this.f, i9, -2);
                    int i11 = dsyVar.s;
                    int i12 = dtgVar.h;
                    if (i12 == 1 || i12 == 2) {
                        int measuredHeight = ((android.view.View) obj).getMeasuredHeight();
                        int iH = dsyVar.h();
                        if (dtgVar.h == 2 || i11 != 1 || measuredHeight == iH || (obj instanceof defpackage.dug) || dsyVar.e()) {
                            iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(dsyVar.j(), 1073741824);
                        }
                    }
                } else if (i10 != 3) {
                    iMakeMeasureSpec = 0;
                } else {
                    int i13 = this.f;
                    defpackage.dsx dsxVar = dsyVar.J;
                    int i14 = dsxVar != null ? dsxVar.f : 0;
                    defpackage.dsx dsxVar2 = dsyVar.L;
                    if (dsxVar2 != null) {
                        i14 += dsxVar2.f;
                    }
                    iMakeMeasureSpec = android.view.ViewGroup.getChildMeasureSpec(i13, i9 + i14, -1);
                }
                int i15 = i5 - 1;
                if (i5 == 0) {
                    throw null;
                }
                if (i15 == 0) {
                    iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
                } else if (i15 == 1) {
                    iMakeMeasureSpec2 = android.view.ViewGroup.getChildMeasureSpec(this.g, i8, -2);
                } else if (i15 == 2) {
                    iMakeMeasureSpec2 = android.view.ViewGroup.getChildMeasureSpec(this.g, i8, -2);
                    int i16 = dsyVar.t;
                    int i17 = dtgVar.h;
                    if (i17 == 1 || i17 == 2) {
                        int measuredWidth = ((android.view.View) obj).getMeasuredWidth();
                        int iJ = dsyVar.j();
                        if (dtgVar.h == 2 || i16 != 1 || measuredWidth == iJ || (obj instanceof defpackage.dug) || dsyVar.f()) {
                            iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(dsyVar.h(), 1073741824);
                        }
                    }
                } else if (i15 != 3) {
                    iMakeMeasureSpec2 = 0;
                } else {
                    int i18 = this.g;
                    int i19 = dsyVar.J != null ? dsyVar.K.f : 0;
                    if (dsyVar.L != null) {
                        i19 += dsyVar.M.f;
                    }
                    iMakeMeasureSpec2 = android.view.ViewGroup.getChildMeasureSpec(i18, i8 + i19, -1);
                }
                defpackage.dsy dsyVar2 = dsyVar.U;
                if (dsyVar2 != null && (this.h.g & 256) == 256) {
                    android.view.View view = (android.view.View) obj;
                    if (view.getMeasuredWidth() == dsyVar.j() && view.getMeasuredWidth() < dsyVar2.j() && view.getMeasuredHeight() == dsyVar.h() && view.getMeasuredHeight() < dsyVar2.h() && view.getBaseline() == dsyVar.ab && !dsyVar.J() && b(dsyVar.H, iMakeMeasureSpec, dsyVar.j()) && b(dsyVar.I, iMakeMeasureSpec2, dsyVar.h())) {
                        dtgVar.c = dsyVar.j();
                        dtgVar.d = dsyVar.h();
                        dtgVar.e = dsyVar.ab;
                        return;
                    }
                }
                boolean z = i4 == 3;
                boolean z2 = i5 == 3;
                boolean z3 = i5 == 4 || i5 == 1;
                boolean z4 = i4 == 4 || i4 == 1;
                boolean z5 = z && dsyVar.X > 0.0f;
                boolean z6 = z2 && dsyVar.X > 0.0f;
                if (obj != null) {
                    android.view.View view2 = (android.view.View) obj;
                    defpackage.dtv dtvVar = (defpackage.dtv) view2.getLayoutParams();
                    boolean z7 = z4;
                    int i20 = dtgVar.h;
                    if (i20 != 1 && i20 != 2 && z && dsyVar.s == 0 && z2 && dsyVar.t == 0) {
                        i = -1;
                        baseline = 0;
                        iMax = 0;
                        iMax2 = 0;
                    } else {
                        if ((obj instanceof defpackage.duj) && (dsyVar instanceof defpackage.dte)) {
                            throw null;
                        }
                        view2.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        dsyVar.z(iMakeMeasureSpec, iMakeMeasureSpec2);
                        int measuredWidth2 = view2.getMeasuredWidth();
                        int measuredHeight2 = view2.getMeasuredHeight();
                        baseline = view2.getBaseline();
                        int i21 = dsyVar.v;
                        iMax = i21 > 0 ? java.lang.Math.max(i21, measuredWidth2) : measuredWidth2;
                        int i22 = dsyVar.w;
                        if (i22 > 0) {
                            iMax = java.lang.Math.min(i22, iMax);
                        }
                        int i23 = dsyVar.y;
                        iMax2 = i23 > 0 ? java.lang.Math.max(i23, measuredHeight2) : measuredHeight2;
                        int i24 = dsyVar.z;
                        if (i24 > 0) {
                            iMax2 = java.lang.Math.min(i24, iMax2);
                        }
                        if ((this.h.g & 1) != 1) {
                            if (z5 && z3) {
                                iMax = (int) ((iMax2 * dsyVar.X) + 0.5f);
                            } else if (z6 && z7) {
                                iMax2 = (int) ((iMax / dsyVar.X) + 0.5f);
                            }
                        }
                        if (measuredWidth2 == iMax) {
                            i2 = measuredHeight2 != iMax2 ? 1073741824 : 1073741824;
                            i = -1;
                        } else {
                            iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                        }
                        if (measuredHeight2 != iMax2) {
                            iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(iMax2, i2);
                        }
                        view2.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        dsyVar.z(iMakeMeasureSpec, iMakeMeasureSpec2);
                        iMax = view2.getMeasuredWidth();
                        iMax2 = view2.getMeasuredHeight();
                        baseline = view2.getBaseline();
                        i = -1;
                    }
                    boolean z8 = baseline != i;
                    dtgVar.g = (iMax == dtgVar.a && iMax2 == dtgVar.b) ? false : true;
                    boolean z9 = dtvVar.ag | z8;
                    if (!z9) {
                        i3 = baseline;
                    } else if (baseline != -1) {
                        if (dsyVar.ab != baseline) {
                            dtgVar.g = true;
                        }
                        i3 = baseline;
                    } else {
                        i3 = -1;
                    }
                    dtgVar.c = iMax;
                    dtgVar.d = iMax2;
                    dtgVar.f = z9;
                    dtgVar.e = i3;
                }
            }
        }
    }
}
