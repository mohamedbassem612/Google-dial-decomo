package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class ebx implements dyy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public ebx(com.google.android.material.appbar.AppBarLayout appBarLayout, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(appBarLayout);
        this.a = appBarLayout;
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [aonn, java.lang.Object] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final eax dC(android.view.View view, eax eaxVar) {
        defpackage.dum dumVar;
        eak eahVar;
        int i;
        int i2;
        int i3;
        eax eaxVarOnApplyWindowInsets = eaxVar;
        switch (this.$cid) {
            case 0:
                dwn dwnVarA = defpackage.ecb.a(eaxVarOnApplyWindowInsets);
                dwn dwnVarC = dwn.c(eaxVarOnApplyWindowInsets.g(519), eaxVarOnApplyWindowInsets.g(64));
                defpackage.ecb ecbVar = (defpackage.ecb) this.a;
                if (!dwnVarA.equals(ecbVar.c) || !dwnVarC.equals(ecbVar.d)) {
                    ecbVar.c = dwnVarA;
                    ecbVar.d = dwnVarC;
                    java.util.ArrayList arrayList = ecbVar.b;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ((defpackage.ebv) arrayList.get(size)).d(dwnVarA, dwnVarC);
                    }
                }
                break;
            case 1:
                androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout = (androidx.coordinatorlayout.widget.CoordinatorLayout) this.a;
                if (!j$.util.Objects.equals(coordinatorLayout.e, eaxVarOnApplyWindowInsets)) {
                    coordinatorLayout.e = eaxVarOnApplyWindowInsets;
                    boolean z = eaxVarOnApplyWindowInsets.d() > 0;
                    coordinatorLayout.f = z;
                    coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
                    if (!eaxVarOnApplyWindowInsets.x()) {
                        int childCount = coordinatorLayout.getChildCount();
                        for (int i4 = 0; i4 < childCount; i4++) {
                            android.view.View childAt = coordinatorLayout.getChildAt(i4);
                            int i5 = dzs.a;
                            if (childAt.getFitsSystemWindows() && (dumVar = ((defpackage.dup) childAt.getLayoutParams()).a) != null) {
                                eaxVarOnApplyWindowInsets = dumVar.onApplyWindowInsets(coordinatorLayout, childAt, eaxVarOnApplyWindowInsets);
                                if (!eaxVarOnApplyWindowInsets.x()) {
                                }
                            }
                        }
                    }
                    coordinatorLayout.requestLayout();
                }
                break;
            case 2:
                defpackage.lmk.a.b().l("com/android/dialer/callscreen/impl/ui/CallScreenFragmentPeer", "setLayoutEdgeToEdge", 351, "CallScreenFragmentPeer.java").v("Applying edge to edge insets.");
                dwn dwnVarF = eaxVarOnApplyWindowInsets.f(647);
                android.view.View view2 = (android.view.View) this.a;
                androidx.constraintlayout.widget.ConstraintLayout constraintLayoutFindViewById = view2.findViewById(2131427681);
                view2.setPadding(0, dwnVarF.c, 0, 0);
                constraintLayoutFindViewById.setPadding(0, 0, 0, dwnVarF.e);
                return eax.a;
            case 3:
                j$.util.OptionalInt optionalIntOf = j$.util.OptionalInt.of(0);
                j$.util.OptionalInt optionalIntEmpty = j$.util.OptionalInt.empty();
                j$.util.OptionalInt optionalIntEmpty2 = j$.util.OptionalInt.empty();
                j$.util.OptionalInt optionalIntEmpty3 = j$.util.OptionalInt.empty();
                if (android.os.Build.VERSION.SDK_INT >= 36) {
                    eahVar = new eak(eaxVarOnApplyWindowInsets);
                } else if (android.os.Build.VERSION.SDK_INT >= 35) {
                    eahVar = new eaj(eaxVarOnApplyWindowInsets);
                } else if (android.os.Build.VERSION.SDK_INT >= 34) {
                    eahVar = new eai(eaxVarOnApplyWindowInsets);
                } else {
                    eahVar = android.os.Build.VERSION.SDK_INT >= 31 ? new eah(eaxVarOnApplyWindowInsets) : new eag(eaxVarOnApplyWindowInsets);
                }
                eak eakVar = eahVar;
                dwn dwnVarF2 = eaxVarOnApplyWindowInsets.f(128);
                pyu pyuVar = (pyu) this.a;
                eakVar.d(128, pyuVar.a(dwnVarF2, optionalIntOf, optionalIntEmpty, optionalIntEmpty2, optionalIntEmpty3));
                eakVar.d(519, pyuVar.a(eaxVarOnApplyWindowInsets.f(519), optionalIntOf, optionalIntEmpty, optionalIntEmpty2, optionalIntEmpty3));
                return eakVar.a();
            case 4:
                pyn pynVar = ((pyu) this.a).d;
                dwn dwnVarF3 = eaxVarOnApplyWindowInsets.f(647);
                int dimensionPixelOffset = pynVar.dX().getDimensionPixelOffset(2131167869);
                view.setPadding(java.lang.Math.max(dimensionPixelOffset, dwnVarF3.b), dwnVarF3.c, java.lang.Math.max(dimensionPixelOffset, dwnVarF3.d), view.getPaddingBottom());
                return eax.a;
            case 5:
                qhj.a.b().l("com/android/dialer/incall/rtt/ui/RttChatFragmentPeer", "setLayoutEdgeToEdge", 594, "RttChatFragmentPeer.java").v("Applying edge to edge insets.");
                dwn dwnVarF4 = eaxVarOnApplyWindowInsets.f(655);
                ((android.view.View) this.a).setPadding(0, dwnVarF4.c, 0, dwnVarF4.e);
                return eax.a;
            case 6:
                aooh.c(view);
                return (eax) this.a.a(view, eaxVarOnApplyWindowInsets);
            case 7:
                dwn dwnVarF5 = eaxVarOnApplyWindowInsets.f(647);
                aooh.c(view);
                int i6 = dzs.a;
                java.lang.Object objB = dzo.b(view, 2131429304);
                dzo.b(view, 2131428785);
                rqz rqzVar = (rqz) this.a;
                rqu rquVar = rqzVar.d;
                java.lang.Object objB2 = dzo.b(view, 2131427997);
                java.lang.Object objB3 = dzo.b(view, 2131427981);
                int i7 = rquVar.dX().getConfiguration().orientation;
                ahbv ahbvVar = rqzVar.n;
                android.content.Context context = rqzVar.c;
                boolean zC = rhx.c(context);
                android.view.View view3 = (android.view.View) objB;
                view3.setBackgroundColor(urg.c((android.content.Context) ahbvVar.a, 2130969107));
                view3.setVisibility(8);
                androidx.constraintlayout.widget.ConstraintLayout constraintLayoutFindViewById2 = view.findViewById(2131428439);
                if (constraintLayoutFindViewById2 != null) {
                    constraintLayoutFindViewById2.setBackgroundColor(urg.c(context, 2130969107));
                }
                android.view.View view4 = (android.view.View) objB3;
                view4.setBackgroundColor(urg.c(context, 2130969108));
                if (view.findViewById(2131427998) != null) {
                    aooh.c(objB3);
                    dtv layoutParams = view4.getLayoutParams();
                    if (layoutParams == null) {
                        throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    }
                    dtv dtvVar = layoutParams;
                    dtvVar.u = -1;
                    dtvVar.s = -1;
                    dtvVar.t = 2131427998;
                    dtvVar.v = 2131427998;
                    view4.setLayoutParams(dtvVar);
                }
                if (i7 != 1 && i7 != 0) {
                    if (i7 != 2) {
                        i = 2;
                        i2 = i7;
                    } else if (zC) {
                        i2 = 2;
                        i = 2;
                    } else {
                        aooh.c(objB);
                        int i8 = dwnVarF5.c;
                        view3.setPadding(view3.getPaddingLeft(), i8, view3.getPaddingRight(), view3.getPaddingBottom());
                        aooh.c(objB2);
                        android.view.View view5 = (android.view.View) objB2;
                        view5.setPadding(view5.getPaddingLeft(), i8, view5.getPaddingRight(), view5.getPaddingBottom());
                    }
                    if (i2 != i) {
                        i3 = i2;
                    } else if (zC) {
                        aooh.c(objB);
                        int i9 = dwnVarF5.c;
                        view3.setPadding(view3.getPaddingLeft(), i9, view3.getPaddingRight(), view3.getPaddingBottom());
                        aooh.c(objB2);
                        android.view.View view6 = (android.view.View) objB2;
                        view6.setPadding(view6.getPaddingLeft(), i9, view6.getPaddingRight(), view6.getPaddingBottom());
                    } else {
                        i3 = i;
                    }
                    java.lang.String str = java.lang.String.format("Illegal orientation %d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i3)}, 1));
                    aooh.e(str, "format(...)");
                    throw new java.lang.IllegalStateException(str);
                }
                aooh.c(objB);
                view3.setPadding(view3.getPaddingLeft(), dwnVarF5.c, view3.getPaddingRight(), view3.getPaddingBottom());
                return eax.a;
            case 8:
                dwn dwnVarF6 = eaxVarOnApplyWindowInsets.f(647);
                aooh.c(view);
                rri rriVar = (rri) this.a;
                rrf rrfVar = rriVar.e;
                int i10 = dzs.a;
                java.lang.Object objB4 = dzo.b(view, 2131427997);
                java.lang.Object objB5 = dzo.b(view, 2131427981);
                int i11 = rrfVar.dX().getConfiguration().orientation;
                androidx.constraintlayout.widget.ConstraintLayout constraintLayoutFindViewById3 = view.findViewById(2131428439);
                if (constraintLayoutFindViewById3 != null) {
                    constraintLayoutFindViewById3.setBackgroundColor(urg.c(rriVar.d, 2130969107));
                }
                android.view.View view7 = (android.view.View) objB5;
                view7.setBackgroundColor(urg.c(rriVar.d, 2130969108));
                if (view.findViewById(2131427998) != null) {
                    aooh.c(objB5);
                    dtv layoutParams2 = view7.getLayoutParams();
                    if (layoutParams2 == null) {
                        throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    }
                    dtv dtvVar2 = layoutParams2;
                    dtvVar2.u = -1;
                    dtvVar2.s = -1;
                    dtvVar2.t = 2131427998;
                    dtvVar2.v = 2131427998;
                    view7.setLayoutParams(dtvVar2);
                }
                if (i11 != 0 && i11 != 1) {
                    if (i11 != 2) {
                        java.lang.String str2 = java.lang.String.format("Illegal orientation %d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i11)}, 1));
                        aooh.e(str2, "format(...)");
                        throw new java.lang.IllegalStateException(str2);
                    }
                    aooh.c(objB4);
                    android.view.View view8 = (android.view.View) objB4;
                    view8.setPadding(view8.getPaddingLeft(), dwnVarF6.c, view8.getPaddingRight(), view8.getPaddingBottom());
                }
                return eax.a;
            case 9:
                dwn dwnVarF7 = eaxVarOnApplyWindowInsets.f(647);
                aimw aimwVarL = wtk.a.b().l("com/android/dialer/xatu/impl/ui/XatuInCallFragmentPeer", "setLayoutEdgeToEdge", 439, "XatuInCallFragmentPeer.java");
                int i12 = dwnVarF7.c;
                int i13 = dwnVarF7.e;
                aimwVarL.z("Applying edge to edge insets. Top inset px: %d, bottom inset px: %d", i12, i13);
                android.view.View view9 = (android.view.View) this.a;
                view9.setPadding(0, i12, 0, 0);
                view9.findViewById(2131428369).setPadding(0, 0, 0, i12);
                ((android.view.ViewGroup.MarginLayoutParams) ((android.widget.TextView) view9.findViewById(2131429348)).getLayoutParams()).bottomMargin = view9.getContext().getResources().getDimensionPixelOffset(2131168029) + i13;
                ((android.view.ViewGroup.MarginLayoutParams) ((android.widget.TextView) view9.findViewById(2131429346)).getLayoutParams()).bottomMargin = view9.getContext().getResources().getDimensionPixelOffset(2131168029) + i13;
                ((android.view.ViewGroup.MarginLayoutParams) ((android.widget.TextView) view9.findViewById(2131429347)).getLayoutParams()).bottomMargin = view9.getContext().getResources().getDimensionPixelOffset(2131168029) + i13;
                return eax.a;
            case 10:
                com.google.android.material.appbar.AppBarLayout appBarLayout = (com.google.android.material.appbar.AppBarLayout) this.a;
                eax eaxVar2 = true != appBarLayout.getFitsSystemWindows() ? null : eaxVarOnApplyWindowInsets;
                if (!j$.util.Objects.equals(appBarLayout.c, eaxVar2)) {
                    appBarLayout.c = eaxVar2;
                    appBarLayout.l();
                    appBarLayout.requestLayout();
                }
                break;
            case 11:
                afqy afqyVar = (afqy) this.a;
                defpackage.afqx afqxVar = afqyVar.f;
                if (afqxVar != null) {
                    afqyVar.a.n(afqxVar);
                }
                afqyVar.f = new defpackage.afqx(afqyVar.b, eaxVarOnApplyWindowInsets);
                afqyVar.f.d(afqyVar.getWindow());
                afqyVar.a.i(afqyVar.f);
                break;
            default:
                int i14 = eaxVarOnApplyWindowInsets.f(647).c;
                com.google.android.material.search.SearchView searchView = (com.google.android.material.search.SearchView) this.a;
                searchView.f(i14);
                searchView.d.setVisibility(i14 <= 0 ? 8 : 0);
                break;
        }
        return eaxVarOnApplyWindowInsets;
    }

    public /* synthetic */ ebx(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public ebx(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, int i) {
        this.$cid = i;
        this.a = coordinatorLayout;
    }

    public ebx(afqy afqyVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(afqyVar);
        this.a = afqyVar;
    }
}
