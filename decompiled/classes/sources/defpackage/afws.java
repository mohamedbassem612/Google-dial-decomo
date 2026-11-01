package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afws implements defpackage.ge {
    public defpackage.afwq a;
    public boolean b = false;
    public int c;

    @Override // defpackage.ge
    public final int a() {
        return this.c;
    }

    @Override // defpackage.ge
    public final void c(android.content.Context context, defpackage.ft ftVar) {
        this.a.a(ftVar);
    }

    @Override // defpackage.ge
    public final android.os.Parcelable cH() {
        com.google.android.material.navigation.NavigationBarPresenter$SavedState navigationBarPresenter$SavedState = new com.google.android.material.navigation.NavigationBarPresenter$SavedState();
        defpackage.afwq afwqVar = this.a;
        navigationBarPresenter$SavedState.a = afwqVar.f;
        android.util.SparseArray sparseArray = afwqVar.q;
        com.google.android.material.internal.ParcelableSparseArray parcelableSparseArray = new com.google.android.material.internal.ParcelableSparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            int iKeyAt = sparseArray.keyAt(i);
            defpackage.afpu afpuVar = (defpackage.afpu) sparseArray.valueAt(i);
            parcelableSparseArray.put(iKeyAt, afpuVar != null ? afpuVar.c.a : null);
        }
        navigationBarPresenter$SavedState.b = parcelableSparseArray;
        return navigationBarPresenter$SavedState;
    }

    @Override // defpackage.ge
    public final void e(defpackage.gd gdVar) {
        throw null;
    }

    @Override // defpackage.ge
    public final void f(boolean z) {
        defpackage.afwo afwoVar;
        defpackage.glh glhVar;
        if (this.b) {
            return;
        }
        defpackage.afwq afwqVar = this.a;
        if (z) {
            afwqVar.f();
            return;
        }
        defpackage.afwo afwoVar2 = afwqVar.H;
        if (afwoVar2 == null || afwqVar.e == null) {
            return;
        }
        afwqVar.G.b = true;
        afwoVar2.c();
        afwqVar.G.b = false;
        if (afwqVar.e != null && (afwoVar = afwqVar.H) != null && afwoVar.a() == afwqVar.e.length) {
            for (int i = 0; i < afwqVar.e.length; i++) {
                if (!(afwqVar.H.b(i) instanceof defpackage.afwf) || (afwqVar.e[i] instanceof afwi)) {
                    boolean z2 = afwqVar.H.b(i).hasSubMenu() && !(afwqVar.e[i] instanceof afwu);
                    boolean z3 = (afwqVar.H.b(i).hasSubMenu() || (afwqVar.e[i] instanceof defpackage.afwm)) ? false : true;
                    if ((afwqVar.H.b(i) instanceof defpackage.afwf) || (!z2 && !z3)) {
                    }
                }
            }
            int i2 = afwqVar.f;
            int iA = afwqVar.H.a();
            for (int i3 = 0; i3 < iA; i3++) {
                android.view.MenuItem menuItemB = afwqVar.H.b(i3);
                if (menuItemB.isChecked()) {
                    afwqVar.g(menuItemB);
                    afwqVar.f = menuItemB.getItemId();
                    afwqVar.g = i3;
                }
            }
            if (i2 != afwqVar.f && (glhVar = afwqVar.b) != null) {
                defpackage.gld.b(afwqVar, glhVar);
            }
            boolean zJ = afwqVar.j(afwqVar.c, afwqVar.c());
            for (int i4 = 0; i4 < iA; i4++) {
                afwqVar.G.b = true;
                afwqVar.e[i4].fi(afwqVar.L);
                defpackage.afwp afwpVar = afwqVar.e[i4];
                if (afwpVar instanceof defpackage.afwm) {
                    defpackage.afwm afwmVar = (defpackage.afwm) afwpVar;
                    afwmVar.F(afwqVar.c);
                    afwmVar.z(afwqVar.d);
                    afwmVar.y(afwqVar.C);
                    afwmVar.H(zJ);
                }
                if (afwqVar.H.b(i4) instanceof defpackage.fv) {
                    afwqVar.e[i4].f((defpackage.fv) afwqVar.H.b(i4));
                }
                afwqVar.G.b = false;
            }
            return;
        }
        afwqVar.f();
    }

    @Override // defpackage.ge
    public final boolean g() {
        return false;
    }

    @Override // defpackage.ge
    public final boolean h(gm gmVar) {
        return false;
    }

    @Override // defpackage.ge
    public final boolean i(defpackage.fv fvVar) {
        return false;
    }

    @Override // defpackage.ge
    public final boolean j(defpackage.fv fvVar) {
        return false;
    }

    @Override // defpackage.ge
    public final void n(android.os.Parcelable parcelable) {
        if (parcelable instanceof com.google.android.material.navigation.NavigationBarPresenter$SavedState) {
            defpackage.afwq afwqVar = this.a;
            com.google.android.material.navigation.NavigationBarPresenter$SavedState navigationBarPresenter$SavedState = (com.google.android.material.navigation.NavigationBarPresenter$SavedState) parcelable;
            int i = navigationBarPresenter$SavedState.a;
            int iA = afwqVar.H.a();
            for (int i2 = 0; i2 < iA; i2++) {
                android.view.MenuItem menuItemB = afwqVar.H.b(i2);
                if (i == menuItemB.getItemId()) {
                    afwqVar.f = i;
                    afwqVar.g = i2;
                    afwqVar.g(menuItemB);
                    break;
                }
            }
            android.content.Context context = this.a.getContext();
            com.google.android.material.internal.ParcelableSparseArray parcelableSparseArray = navigationBarPresenter$SavedState.b;
            android.util.SparseArray sparseArray = new android.util.SparseArray(parcelableSparseArray.size());
            for (int i3 = 0; i3 < parcelableSparseArray.size(); i3++) {
                int iKeyAt = parcelableSparseArray.keyAt(i3);
                com.google.android.material.badge.BadgeState.State state = (com.google.android.material.badge.BadgeState.State) parcelableSparseArray.valueAt(i3);
                sparseArray.put(iKeyAt, state != null ? new defpackage.afpu(context, state) : null);
            }
            defpackage.afwq afwqVar2 = this.a;
            for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                int iKeyAt2 = sparseArray.keyAt(i4);
                android.util.SparseArray sparseArray2 = afwqVar2.q;
                if (sparseArray2.indexOfKey(iKeyAt2) < 0) {
                    sparseArray2.append(iKeyAt2, (defpackage.afpu) sparseArray.get(iKeyAt2));
                }
            }
            defpackage.afwp[] afwpVarArr = afwqVar2.e;
            if (afwpVarArr != null) {
                for (defpackage.afwp afwpVar : afwpVarArr) {
                    if (afwpVar instanceof defpackage.afwm) {
                        defpackage.afwm afwmVar = (defpackage.afwm) afwpVar;
                        defpackage.afpu afpuVar = (defpackage.afpu) afwqVar2.q.get(afwmVar.getId());
                        if (afpuVar != null) {
                            afwmVar.q(afpuVar);
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.ge
    public final void d(defpackage.ft ftVar, boolean z) {
    }
}
