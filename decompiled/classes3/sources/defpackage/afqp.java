package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afqp implements afvo {
    final /* synthetic */ boolean a;
    final /* synthetic */ com.google.android.material.bottomsheet.BottomSheetBehavior b;

    public afqp(com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior, boolean z) {
        this.a = z;
        j$.util.Objects.requireNonNull(bottomSheetBehavior);
        this.b = bottomSheetBehavior;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006e  */
    /* JADX WARN: Code duplicated, block: B:37:0x008a  */
    public final void a(android.view.View view, eax eaxVar, afvp afvpVar) {
        boolean z;
        dwn dwnVarF = eaxVar.f(519);
        int i = dwnVarF.c;
        dwn dwnVarF2 = eaxVar.f(32);
        com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = this.b;
        bottomSheetBehavior.o = i;
        boolean zL = agab.L(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        if (bottomSheetBehavior.h) {
            int iA = eaxVar.a();
            bottomSheetBehavior.n = iA;
            paddingBottom = afvpVar.d + iA;
        }
        if (bottomSheetBehavior.i) {
            paddingLeft = dwnVarF.b + (zL ? afvpVar.c : afvpVar.a);
        }
        if (bottomSheetBehavior.j) {
            paddingRight = (zL ? afvpVar.a : afvpVar.c) + dwnVarF.d;
        }
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
        boolean z2 = true;
        boolean z3 = false;
        if (bottomSheetBehavior.k) {
            int i2 = marginLayoutParams.leftMargin;
            int i3 = dwnVarF.b;
            if (i2 != i3) {
                marginLayoutParams.leftMargin = i3;
                z3 = true;
            }
        }
        if (bottomSheetBehavior.l) {
            int i4 = marginLayoutParams.rightMargin;
            int i5 = dwnVarF.d;
            if (i4 != i5) {
                marginLayoutParams.rightMargin = i5;
            } else {
                z2 = z3;
            }
        } else {
            z2 = z3;
        }
        if (!bottomSheetBehavior.m || marginLayoutParams.topMargin == i) {
            if (z2) {
            }
            view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
            z = this.a;
            if (z) {
                bottomSheetBehavior.g = dwnVarF2.e;
            }
            if (!bottomSheetBehavior.h || z) {
                bottomSheetBehavior.D();
            }
            return;
        }
        marginLayoutParams.topMargin = i;
        view.setLayoutParams(marginLayoutParams);
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        z = this.a;
        if (z) {
            bottomSheetBehavior.g = dwnVarF2.e;
        }
        if (bottomSheetBehavior.h) {
        }
        bottomSheetBehavior.D();
    }
}
