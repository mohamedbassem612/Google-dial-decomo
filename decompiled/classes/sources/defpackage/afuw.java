package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afuw implements defpackage.ge {
    int A;
    public com.google.android.material.internal.NavigationMenuView a;
    public android.widget.LinearLayout b;
    defpackage.ft c;
    public int d;
    public defpackage.afup e;
    public android.view.LayoutInflater f;
    public android.content.res.ColorStateList h;
    public android.content.res.ColorStateList k;
    public android.content.res.ColorStateList l;
    public android.graphics.drawable.Drawable m;
    public android.graphics.drawable.RippleDrawable n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public int y;
    public int z;
    public int g = 0;
    public int i = 0;
    public boolean j = true;
    public boolean x = true;
    public int B = -1;
    final android.view.View.OnClickListener C = new defpackage.afun(this, 0);

    @Override // defpackage.ge
    public final int a() {
        return this.d;
    }

    @Override // defpackage.ge
    public final void c(android.content.Context context, defpackage.ft ftVar) {
        this.f = android.view.LayoutInflater.from(context);
        this.c = ftVar;
        this.A = context.getResources().getDimensionPixelOffset(2131165579);
    }

    @Override // defpackage.ge
    public final android.os.Parcelable cH() {
        android.os.Bundle bundle = new android.os.Bundle();
        if (this.a != null) {
            android.util.SparseArray<? extends android.os.Parcelable> sparseArray = new android.util.SparseArray<>();
            this.a.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        defpackage.afup afupVar = this.e;
        if (afupVar != null) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            defpackage.fv fvVar = afupVar.e;
            if (fvVar != null) {
                bundle2.putInt("android:menu:checked", fvVar.a);
            }
            android.util.SparseArray<? extends android.os.Parcelable> sparseArray2 = new android.util.SparseArray<>();
            java.util.ArrayList arrayList = afupVar.a;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                afut afutVar = (defpackage.afur) arrayList.get(i);
                if (afutVar instanceof afut) {
                    defpackage.fv fvVar2 = afutVar.a;
                    android.view.View actionView = fvVar2 != null ? fvVar2.getActionView() : null;
                    if (actionView != null) {
                        com.google.android.material.internal.ParcelableSparseArray parcelableSparseArray = new com.google.android.material.internal.ParcelableSparseArray();
                        actionView.saveHierarchyState(parcelableSparseArray);
                        sparseArray2.put(fvVar2.a, parcelableSparseArray);
                    }
                }
            }
            bundle2.putSparseParcelableArray("android:menu:action_views", sparseArray2);
            bundle.putBundle("android:menu:adapter", bundle2);
        }
        if (this.b != null) {
            android.util.SparseArray<? extends android.os.Parcelable> sparseArray3 = new android.util.SparseArray<>();
            this.b.saveHierarchyState(sparseArray3);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray3);
        }
        return bundle;
    }

    @Override // defpackage.ge
    public final void e(defpackage.gd gdVar) {
        throw null;
    }

    @Override // defpackage.ge
    public final void f(boolean z) {
        defpackage.afup afupVar = this.e;
        if (afupVar != null) {
            java.util.ArrayList arrayList = afupVar.a;
            int size = arrayList.size();
            afupVar.w();
            afupVar.e();
            if (size == arrayList.size()) {
                afupVar.i(0, arrayList.size());
            }
        }
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

    public final void k(int i) {
        this.B = i;
        com.google.android.material.internal.NavigationMenuView navigationMenuView = this.a;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(i);
        }
    }

    public final void l(boolean z) {
        defpackage.afup afupVar = this.e;
        if (afupVar != null) {
            afupVar.f = z;
        }
    }

    public final void m() {
        defpackage.afup afupVar = this.e;
        if (afupVar == null) {
            return;
        }
        int i = 0;
        while (true) {
            java.util.ArrayList arrayList = afupVar.a;
            if (i >= arrayList.size()) {
                return;
            }
            if (arrayList.get(i) instanceof defpackage.afus) {
                afupVar.f(i);
            }
            i++;
        }
    }

    @Override // defpackage.ge
    public final void n(android.os.Parcelable parcelable) {
        defpackage.fv fvVar;
        android.view.View actionView;
        com.google.android.material.internal.ParcelableSparseArray parcelableSparseArray;
        defpackage.fv fvVar2;
        if (parcelable instanceof android.os.Bundle) {
            android.os.Bundle bundle = (android.os.Bundle) parcelable;
            android.util.SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.a.restoreHierarchyState(sparseParcelableArray);
            }
            android.os.Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                defpackage.afup afupVar = this.e;
                int i = bundle2.getInt("android:menu:checked", 0);
                if (i != 0) {
                    afupVar.f = true;
                    java.util.ArrayList arrayList = afupVar.a;
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        afut afutVar = (defpackage.afur) arrayList.get(i2);
                        if ((afutVar instanceof afut) && (fvVar2 = afutVar.a) != null && fvVar2.a == i) {
                            afupVar.x(fvVar2);
                            break;
                        }
                    }
                    afupVar.f = false;
                    afupVar.w();
                }
                android.util.SparseArray sparseParcelableArray2 = bundle2.getSparseParcelableArray("android:menu:action_views");
                if (sparseParcelableArray2 != null) {
                    java.util.ArrayList arrayList2 = afupVar.a;
                    int size2 = arrayList2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        afut afutVar2 = (defpackage.afur) arrayList2.get(i3);
                        if ((afutVar2 instanceof afut) && (fvVar = afutVar2.a) != null && (actionView = fvVar.getActionView()) != null && (parcelableSparseArray = (com.google.android.material.internal.ParcelableSparseArray) sparseParcelableArray2.get(fvVar.a)) != null) {
                            actionView.restoreHierarchyState(parcelableSparseArray);
                        }
                    }
                }
            }
            android.util.SparseArray sparseParcelableArray3 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray3 != null) {
                this.b.restoreHierarchyState(sparseParcelableArray3);
            }
        }
    }

    public final void o() {
        defpackage.afup afupVar = this.e;
        if (afupVar == null) {
            return;
        }
        int i = 0;
        while (true) {
            java.util.ArrayList arrayList = afupVar.a;
            if (i >= arrayList.size()) {
                return;
            }
            if ((arrayList.get(i) instanceof afut) && afupVar.b(i) == 1) {
                afupVar.f(i);
            }
            i++;
        }
    }

    public final void p() {
        defpackage.afup afupVar = this.e;
        if (afupVar == null) {
            return;
        }
        int i = 0;
        while (true) {
            java.util.ArrayList arrayList = afupVar.a;
            if (i >= arrayList.size()) {
                return;
            }
            if ((arrayList.get(i) instanceof afut) && afupVar.b(i) == 0) {
                afupVar.f(i);
            }
            i++;
        }
    }

    public final void q() {
        int i = (this.b.getChildCount() > 0 || !this.x) ? 0 : this.z;
        com.google.android.material.internal.NavigationMenuView navigationMenuView = this.a;
        navigationMenuView.setPadding(0, i, 0, navigationMenuView.getPaddingBottom());
    }

    @Override // defpackage.ge
    public final void d(defpackage.ft ftVar, boolean z) {
    }
}
