package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class lt implements defpackage.ge {
    defpackage.ft a;
    public defpackage.fv b;
    final /* synthetic */ android.support.v7.widget.Toolbar c;

    public lt(android.support.v7.widget.Toolbar toolbar) {
        this.c = toolbar;
    }

    @Override // defpackage.ge
    public final int a() {
        return 0;
    }

    @Override // defpackage.ge
    public final void c(android.content.Context context, defpackage.ft ftVar) {
        defpackage.fv fvVar;
        defpackage.ft ftVar2 = this.a;
        if (ftVar2 != null && (fvVar = this.b) != null) {
            ftVar2.v(fvVar);
        }
        this.a = ftVar;
    }

    @Override // defpackage.ge
    public final android.os.Parcelable cH() {
        return null;
    }

    @Override // defpackage.ge
    public final void e(defpackage.gd gdVar) {
        throw null;
    }

    @Override // defpackage.ge
    public final void f(boolean z) {
        if (this.b != null) {
            defpackage.ft ftVar = this.a;
            if (ftVar != null) {
                int size = ftVar.size();
                for (int i = 0; i < size; i++) {
                    if (this.a.getItem(i) == this.b) {
                        return;
                    }
                }
            }
            i(this.b);
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
        android.support.v7.widget.Toolbar toolbar = this.c;
        fx fxVar = toolbar.h;
        if (fxVar instanceof fx) {
            fxVar.a.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.h);
        toolbar.removeView(toolbar.g);
        toolbar.h = null;
        java.util.ArrayList arrayList = toolbar.s;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                arrayList.clear();
                this.b = null;
                toolbar.requestLayout();
                fvVar.h(false);
                toolbar.ev();
                return true;
            }
            toolbar.addView((android.view.View) arrayList.get(size));
        }
    }

    @Override // defpackage.ge
    public final boolean j(defpackage.fv fvVar) {
        android.support.v7.widget.Toolbar toolbar = this.c;
        if (toolbar.g == null) {
            toolbar.g = new defpackage.hr(toolbar.getContext(), null, 2130970932);
            toolbar.g.setImageDrawable(toolbar.e);
            toolbar.g.setContentDescription(toolbar.f);
            defpackage.lu luVar = new defpackage.lu();
            luVar.a = (toolbar.m & 112) | 8388611;
            luVar.b = 2;
            toolbar.g.setLayoutParams(luVar);
            toolbar.g.setOnClickListener(new gr(toolbar, 2));
        }
        android.view.ViewParent parent = toolbar.g.getParent();
        if (parent != toolbar) {
            if (parent instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) parent).removeView(toolbar.g);
            }
            toolbar.addView(toolbar.g);
        }
        toolbar.h = fvVar.getActionView();
        this.b = fvVar;
        android.view.ViewParent parent2 = toolbar.h.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) parent2).removeView(toolbar.h);
            }
            defpackage.lu luVar2 = new defpackage.lu();
            luVar2.a = (toolbar.m & 112) | 8388611;
            luVar2.b = 2;
            toolbar.h.setLayoutParams(luVar2);
            toolbar.addView(toolbar.h);
        }
        int childCount = toolbar.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            android.view.View childAt = toolbar.getChildAt(childCount);
            if (((defpackage.lu) childAt.getLayoutParams()).b != 2 && childAt != toolbar.a) {
                toolbar.removeViewAt(childCount);
                toolbar.s.add(childAt);
            }
        }
        toolbar.requestLayout();
        fvVar.h(true);
        fx fxVar = toolbar.h;
        if (fxVar instanceof fx) {
            fxVar.a.onActionViewExpanded();
        }
        toolbar.ev();
        return true;
    }

    @Override // defpackage.ge
    public final void n(android.os.Parcelable parcelable) {
    }

    @Override // defpackage.ge
    public final void d(defpackage.ft ftVar, boolean z) {
    }
}
