package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afpk extends dye {
    final /* synthetic */ com.google.android.material.appbar.AppBarLayout a;
    final /* synthetic */ androidx.coordinatorlayout.widget.CoordinatorLayout b;
    final /* synthetic */ com.google.android.material.appbar.AppBarLayout.BaseBehavior c;

    public afpk(com.google.android.material.appbar.AppBarLayout.BaseBehavior baseBehavior, com.google.android.material.appbar.AppBarLayout appBarLayout, androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout) {
        this.a = appBarLayout;
        this.b = coordinatorLayout;
        j$.util.Objects.requireNonNull(baseBehavior);
        this.c = baseBehavior;
    }

    public final void c(android.view.View view, ebd ebdVar) {
        super.c(view, ebdVar);
        ebdVar.s(android.widget.ScrollView.class.getName());
        com.google.android.material.appbar.AppBarLayout appBarLayout = this.a;
        if (appBarLayout.f() != 0) {
            com.google.android.material.appbar.AppBarLayout.BaseBehavior baseBehavior = this.c;
            android.view.View viewM = com.google.android.material.appbar.AppBarLayout.BaseBehavior.m(this.b);
            if (viewM != null) {
                int childCount = appBarLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    if (appBarLayout.getChildAt(i).getLayoutParams().a != 0) {
                        if (baseBehavior.g() != (-appBarLayout.f())) {
                            ebdVar.i(ebc.g);
                            ebdVar.N(true);
                        }
                        if (baseBehavior.g() != 0) {
                            if (!viewM.canScrollVertically(-1)) {
                                ebdVar.i(ebc.h);
                                ebdVar.N(true);
                                return;
                            } else {
                                if ((-appBarLayout.b()) != 0) {
                                    ebdVar.i(ebc.h);
                                    ebdVar.N(true);
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    }
                }
            }
        }
    }

    public final boolean i(android.view.View view, int i, android.os.Bundle bundle) {
        if (i == 4096) {
            this.a.j(false);
            return true;
        }
        if (i != 8192) {
            return super.i(view, i, bundle);
        }
        com.google.android.material.appbar.AppBarLayout.BaseBehavior baseBehavior = this.c;
        if (baseBehavior.g() != 0) {
            androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout = this.b;
            android.view.View viewM = com.google.android.material.appbar.AppBarLayout.BaseBehavior.m(coordinatorLayout);
            boolean zCanScrollVertically = viewM.canScrollVertically(-1);
            com.google.android.material.appbar.AppBarLayout appBarLayout = this.a;
            if (!zCanScrollVertically) {
                appBarLayout.j(true);
                return true;
            }
            int i2 = -appBarLayout.b();
            if (i2 != 0) {
                baseBehavior.n(coordinatorLayout, appBarLayout, viewM, i2, new int[]{0, 0});
                return true;
            }
        }
        return false;
    }
}
