package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afwy extends defpackage.emo {
    final /* synthetic */ com.google.android.material.navigation.NavigationView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afwy(com.google.android.material.navigation.NavigationView navigationView) {
        super(null);
        j$.util.Objects.requireNonNull(navigationView);
        this.a = navigationView;
    }

    @Override // defpackage.emo
    public final void d(android.view.View view) {
        com.google.android.material.navigation.NavigationView navigationView = this.a;
        if (view == navigationView) {
            navigationView.n.J();
            navigationView.b();
        }
    }

    @Override // defpackage.emo
    public final void e(android.view.View view) {
        com.google.android.material.navigation.NavigationView navigationView = this.a;
        if (view == navigationView) {
            defpackage.aogc aogcVar = navigationView.n;
            j$.util.Objects.requireNonNull(aogcVar);
            view.post(new aflt(aogcVar, 4));
        }
    }
}
