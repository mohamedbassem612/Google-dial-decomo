package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fp implements android.widget.AdapterView.OnItemClickListener, ge {
    android.content.Context a;
    public android.view.LayoutInflater b;
    ft c;
    public android.support.v7.view.menu.ExpandedMenuView d;
    public gd e;
    public defpackage.fo f;

    public fp(android.content.Context context) {
        this.a = context;
        this.b = android.view.LayoutInflater.from(context);
    }

    public final int a() {
        return 0;
    }

    public final void c(android.content.Context context, ft ftVar) {
        if (this.a != null) {
            this.a = context;
            if (this.b == null) {
                this.b = android.view.LayoutInflater.from(context);
            }
        }
        this.c = ftVar;
        defpackage.fo foVar = this.f;
        if (foVar != null) {
            foVar.notifyDataSetChanged();
        }
    }

    public final android.os.Parcelable cH() {
        if (this.d == null) {
            return null;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        android.util.SparseArray<android.os.Parcelable> sparseArray = new android.util.SparseArray<>();
        android.support.v7.view.menu.ExpandedMenuView expandedMenuView = this.d;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    public final void d(ft ftVar, boolean z) {
        gd gdVar = this.e;
        if (gdVar != null) {
            gdVar.a(ftVar, z);
        }
    }

    public final void e(gd gdVar) {
        throw null;
    }

    public final void f(boolean z) {
        defpackage.fo foVar = this.f;
        if (foVar != null) {
            foVar.notifyDataSetChanged();
        }
    }

    public final boolean g() {
        return false;
    }

    public final boolean h(defpackage.gm gmVar) {
        if (!gmVar.hasVisibleItems()) {
            return false;
        }
        defpackage.fu fuVar = new defpackage.fu(gmVar);
        ft ftVar = fuVar.a;
        defpackage.cx cxVar = new defpackage.cx(ftVar.a);
        fuVar.c = new defpackage.fp(cxVar.getContext());
        defpackage.fp fpVar = fuVar.c;
        fpVar.e = fuVar;
        ftVar.g(fpVar);
        cxVar.b(fuVar.c.k(), fuVar);
        android.view.View view = ftVar.g;
        if (view != null) {
            cxVar.c(view);
        } else {
            cxVar.d(ftVar.f);
            cxVar.setTitle(ftVar.e);
        }
        cxVar.a.p = fuVar;
        fuVar.b = cxVar.create();
        fuVar.b.setOnDismissListener(fuVar);
        android.view.WindowManager.LayoutParams attributes = fuVar.b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        fuVar.b.show();
        gd gdVar = this.e;
        if (gdVar != null) {
            gdVar.b(gmVar);
        }
        return true;
    }

    public final boolean i(fv fvVar) {
        return false;
    }

    public final boolean j(fv fvVar) {
        return false;
    }

    public final android.widget.ListAdapter k() {
        defpackage.fo foVar = this.f;
        if (foVar != null) {
            return foVar;
        }
        defpackage.fo foVar2 = new defpackage.fo(this);
        this.f = foVar2;
        return foVar2;
    }

    public final void n(android.os.Parcelable parcelable) {
        android.util.SparseArray<android.os.Parcelable> sparseParcelableArray = ((android.os.Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i, long j) {
        this.c.B(this.f.getItem(i), this, 0);
    }
}
