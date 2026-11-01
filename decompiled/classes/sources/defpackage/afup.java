package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afup extends defpackage.kh {
    public final java.util.ArrayList a;
    public defpackage.fv e;
    public boolean f;
    final /* synthetic */ defpackage.afuw g;

    public afup(defpackage.afuw afuwVar) {
        j$.util.Objects.requireNonNull(afuwVar);
        this.g = afuwVar;
        this.a = new java.util.ArrayList();
        w();
    }

    private final void y(int i, int i2) {
        while (i < i2) {
            ((afut) this.a.get(i)).b = true;
            i++;
        }
    }

    private final void z(android.view.View view, int i, boolean z) {
        defpackage.dzs.i(view, new afuo(this, i, z));
    }

    @Override // defpackage.kh
    public final int a() {
        return this.a.size();
    }

    @Override // defpackage.kh
    public final int b(int i) {
        afut afutVar = (defpackage.afur) this.a.get(i);
        if (afutVar instanceof defpackage.afus) {
            return 2;
        }
        if (afutVar instanceof defpackage.afuq) {
            return 3;
        }
        if (afutVar instanceof afut) {
            return afutVar.a.hasSubMenu() ? 1 : 0;
        }
        throw new java.lang.RuntimeException("Unknown item type.");
    }

    @Override // defpackage.kh
    public final long c(int i) {
        return i;
    }

    @Override // defpackage.kh
    public final /* synthetic */ defpackage.ld d(android.view.ViewGroup viewGroup, int i) {
        defpackage.ld afuvVar;
        if (i == 0) {
            defpackage.afuw afuwVar = this.g;
            afuvVar = new afuv(afuwVar.f, viewGroup, afuwVar.C);
        } else if (i == 1) {
            afuvVar = new defpackage.ld(this.g.f.inflate(2131624136, viewGroup, false));
        } else {
            if (i != 2) {
                if (i != 3) {
                    return null;
                }
                return new defpackage.ld(this.g.b);
            }
            afuvVar = new defpackage.ld(this.g.f.inflate(2131624135, viewGroup, false));
        }
        return afuvVar;
    }

    @Override // defpackage.kh
    public final /* bridge */ /* synthetic */ void m(defpackage.ld ldVar, int i) {
        int iB = b(i);
        if (iB != 0) {
            if (iB != 1) {
                if (iB == 2) {
                    defpackage.afus afusVar = (defpackage.afus) this.a.get(i);
                    android.view.View view = ldVar.a;
                    defpackage.afuw afuwVar = this.g;
                    view.setPaddingRelative(afuwVar.s, afusVar.a, afuwVar.t, afusVar.b);
                    return;
                }
                return;
            }
            android.widget.TextView textView = (android.widget.TextView) ldVar.a;
            textView.setText(((afut) this.a.get(i)).a.d);
            defpackage.afuw afuwVar2 = this.g;
            textView.setTextAppearance(afuwVar2.g);
            textView.setPaddingRelative(afuwVar2.u, textView.getPaddingTop(), afuwVar2.v, textView.getPaddingBottom());
            android.content.res.ColorStateList colorStateList = afuwVar2.h;
            if (colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
            z(textView, i, true);
            return;
        }
        android.view.View view2 = (com.google.android.material.internal.NavigationMenuItemView) ldVar.a;
        defpackage.afuw afuwVar3 = this.g;
        ((com.google.android.material.internal.NavigationMenuItemView) view2).m = afuwVar3.l;
        ((com.google.android.material.internal.NavigationMenuItemView) view2).n = ((com.google.android.material.internal.NavigationMenuItemView) view2).m != null;
        defpackage.fv fvVar = ((com.google.android.material.internal.NavigationMenuItemView) view2).l;
        if (fvVar != null) {
            view2.b(fvVar.getIcon());
        }
        int i2 = afuwVar3.i;
        android.widget.CheckedTextView checkedTextView = ((com.google.android.material.internal.NavigationMenuItemView) view2).j;
        checkedTextView.setTextAppearance(i2);
        android.content.res.ColorStateList colorStateList2 = afuwVar3.k;
        if (colorStateList2 != null) {
            checkedTextView.setTextColor(colorStateList2);
        }
        android.graphics.drawable.Drawable drawable = afuwVar3.m;
        view2.setBackground(drawable != null ? drawable.getConstantState().newDrawable() : null);
        android.graphics.drawable.RippleDrawable rippleDrawable = afuwVar3.n;
        if (rippleDrawable != null) {
            view2.setForeground(rippleDrawable.getConstantState().newDrawable());
        }
        afut afutVar = (afut) this.a.get(i);
        ((com.google.android.material.internal.NavigationMenuItemView) view2).d = afutVar.b;
        int i3 = afuwVar3.o;
        int i4 = afuwVar3.p;
        view2.setPadding(i3, i4, i3, i4);
        checkedTextView.setCompoundDrawablePadding(afuwVar3.q);
        if (afuwVar3.w) {
            ((com.google.android.material.internal.NavigationMenuItemView) view2).c = afuwVar3.r;
        }
        checkedTextView.setMaxLines(afuwVar3.y);
        defpackage.fv fvVar2 = afutVar.a;
        ((com.google.android.material.internal.NavigationMenuItemView) view2).i = afuwVar3.j;
        view2.f(fvVar2);
        z(view2, i, false);
    }

    @Override // defpackage.kh
    public final /* bridge */ /* synthetic */ void q(defpackage.ld ldVar) {
        if (ldVar instanceof afuv) {
            com.google.android.material.internal.NavigationMenuItemView navigationMenuItemView = ldVar.a;
            android.widget.FrameLayout frameLayout = navigationMenuItemView.k;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            navigationMenuItemView.j.setCompoundDrawables(null, null, null, null);
        }
    }

    public final void w() {
        boolean z;
        if (this.f) {
            return;
        }
        boolean z2 = true;
        this.f = true;
        java.util.ArrayList arrayList = this.a;
        arrayList.clear();
        arrayList.add(new defpackage.afuq());
        defpackage.afuw afuwVar = this.g;
        int size = afuwVar.c.f().size();
        int i = -1;
        int i2 = 0;
        boolean z3 = false;
        int size2 = 0;
        while (i2 < size) {
            defpackage.fv fvVar = (defpackage.fv) afuwVar.c.f().get(i2);
            if (fvVar.isChecked()) {
                x(fvVar);
            }
            if (fvVar.isCheckable()) {
                fvVar.j(false);
            }
            if (fvVar.hasSubMenu()) {
                gm gmVar = fvVar.k;
                if (gmVar.hasVisibleItems()) {
                    if (i2 != 0) {
                        arrayList.add(new defpackage.afus(afuwVar.A, 0));
                    } else {
                        i2 = 0;
                    }
                    arrayList.add(new afut(fvVar));
                    int size3 = arrayList.size();
                    int size4 = gmVar.size();
                    int i3 = 0;
                    boolean z4 = false;
                    while (i3 < size4) {
                        defpackage.fv fvVar2 = (defpackage.fv) gmVar.getItem(i3);
                        if (fvVar2.isVisible()) {
                            if (!z4 && fvVar2.getIcon() != null) {
                                z4 = z2;
                            }
                            if (fvVar2.isCheckable()) {
                                fvVar2.j(false);
                            }
                            if (fvVar2.isChecked()) {
                                x(fvVar2);
                            }
                            arrayList.add(new afut(fvVar2));
                        }
                        i3++;
                        z2 = z2;
                    }
                    z = z2;
                    if (z4) {
                        y(size3, arrayList.size());
                    }
                } else {
                    z = z2;
                }
            } else {
                z = z2;
                int i4 = fvVar.b;
                if (i4 != i) {
                    size2 = arrayList.size();
                    z3 = fvVar.getIcon() != null ? z : false;
                    if (i2 != 0) {
                        int i5 = afuwVar.A;
                        arrayList.add(new defpackage.afus(i5, i5));
                        size2++;
                    } else {
                        i2 = 0;
                    }
                } else if (!z3 && fvVar.getIcon() != null) {
                    y(size2, arrayList.size());
                    z3 = z;
                }
                afut afutVar = new afut(fvVar);
                afutVar.b = z3;
                arrayList.add(afutVar);
                i = i4;
            }
            i2++;
            z2 = z;
        }
        this.f = false;
    }

    public final void x(defpackage.fv fvVar) {
        if (this.e == fvVar || !fvVar.isCheckable()) {
            return;
        }
        defpackage.fv fvVar2 = this.e;
        if (fvVar2 != null) {
            fvVar2.setChecked(false);
        }
        this.e = fvVar;
        fvVar.setChecked(true);
    }
}
