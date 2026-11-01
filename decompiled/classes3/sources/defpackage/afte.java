package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afte extends defpackage.afst {
    final /* synthetic */ com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton b;
    private final defpackage.afth c;
    private final boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afte(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton extendedFloatingActionButton, defpackage.amdx amdxVar, defpackage.afth afthVar, boolean z) {
        super(extendedFloatingActionButton, amdxVar);
        j$.util.Objects.requireNonNull(extendedFloatingActionButton);
        this.b = extendedFloatingActionButton;
        this.c = afthVar;
        this.d = z;
    }

    @Override // defpackage.afst, defpackage.afto
    public final android.animation.AnimatorSet a() {
        defpackage.afpg afpgVarC = c();
        if (afpgVarC.f("width")) {
            android.animation.PropertyValuesHolder[] propertyValuesHolderArrG = afpgVarC.g("width");
            propertyValuesHolderArrG[0].setFloatValues(this.b.getWidth(), this.c.d());
            afpgVarC.e("width", propertyValuesHolderArrG);
        }
        if (afpgVarC.f("height")) {
            android.animation.PropertyValuesHolder[] propertyValuesHolderArrG2 = afpgVarC.g("height");
            propertyValuesHolderArrG2[0].setFloatValues(this.b.getHeight(), this.c.a());
            afpgVarC.e("height", propertyValuesHolderArrG2);
        }
        if (afpgVarC.f("paddingStart")) {
            android.animation.PropertyValuesHolder[] propertyValuesHolderArrG3 = afpgVarC.g("paddingStart");
            propertyValuesHolderArrG3[0].setFloatValues(this.b.getPaddingStart(), this.c.c());
            afpgVarC.e("paddingStart", propertyValuesHolderArrG3);
        }
        if (afpgVarC.f("paddingEnd")) {
            android.animation.PropertyValuesHolder[] propertyValuesHolderArrG4 = afpgVarC.g("paddingEnd");
            propertyValuesHolderArrG4[0].setFloatValues(this.b.getPaddingEnd(), this.c.b());
            afpgVarC.e("paddingEnd", propertyValuesHolderArrG4);
        }
        if (afpgVarC.f("labelOpacity")) {
            android.animation.PropertyValuesHolder[] propertyValuesHolderArrG5 = afpgVarC.g("labelOpacity");
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton extendedFloatingActionButton = this.b;
            int iAlpha = android.graphics.Color.alpha(extendedFloatingActionButton.A());
            propertyValuesHolderArrG5[0].setFloatValues(iAlpha != 0 ? android.graphics.Color.alpha(extendedFloatingActionButton.getCurrentTextColor()) / iAlpha : 0.0f, true == this.d ? 1.0f : 0.0f);
            afpgVarC.e("labelOpacity", propertyValuesHolderArrG5);
        }
        return super.b(afpgVarC);
    }

    @Override // defpackage.afst, defpackage.afto
    public final void f() {
        super.f();
        com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton extendedFloatingActionButton = this.b;
        extendedFloatingActionButton.x = false;
        extendedFloatingActionButton.setHorizontallyScrolling(false);
        android.view.ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
        if (layoutParams != null) {
            defpackage.afth afthVar = this.c;
            layoutParams.width = afthVar.e().width;
            layoutParams.height = afthVar.e().height;
        }
    }

    @Override // defpackage.afst, defpackage.afto
    public final void g(android.animation.Animator animator) {
        super.g(animator);
        com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton extendedFloatingActionButton = this.b;
        extendedFloatingActionButton.w = this.d;
        extendedFloatingActionButton.x = true;
        extendedFloatingActionButton.setHorizontallyScrolling(true);
        extendedFloatingActionButton.C();
    }

    @Override // defpackage.afto
    public final int h() {
        return this.d ? 2130837549 : 2130837548;
    }

    @Override // defpackage.afto
    public final void i() {
        com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton extendedFloatingActionButton = this.b;
        boolean z = this.d;
        extendedFloatingActionButton.w = z;
        android.view.ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
        if (layoutParams != null) {
            if (!z) {
                extendedFloatingActionButton.z = layoutParams.width;
                extendedFloatingActionButton.A = layoutParams.height;
            }
            defpackage.afth afthVar = this.c;
            layoutParams.width = afthVar.e().width;
            layoutParams.height = afthVar.e().height;
            if (z) {
                extendedFloatingActionButton.B(extendedFloatingActionButton.y);
            } else if (extendedFloatingActionButton.getText() != null && extendedFloatingActionButton.getText() != "") {
                extendedFloatingActionButton.B(android.content.res.ColorStateList.valueOf(0));
            }
            extendedFloatingActionButton.setPaddingRelative(afthVar.c(), extendedFloatingActionButton.getPaddingTop(), afthVar.b(), extendedFloatingActionButton.getPaddingBottom());
            extendedFloatingActionButton.requestLayout();
            extendedFloatingActionButton.C();
        }
    }

    @Override // defpackage.afto
    public final boolean j() {
        boolean z = this.d;
        com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton extendedFloatingActionButton = this.b;
        return z == extendedFloatingActionButton.w || extendedFloatingActionButton.c == null || android.text.TextUtils.isEmpty(extendedFloatingActionButton.getText());
    }

    @Override // defpackage.afto
    public final void k() {
    }
}
