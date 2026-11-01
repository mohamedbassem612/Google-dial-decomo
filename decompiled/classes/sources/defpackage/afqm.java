package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afqm implements defpackage.afvo {
    public afqm(com.google.android.material.bottomnavigation.BottomNavigationView bottomNavigationView) {
        j$.util.Objects.requireNonNull(bottomNavigationView);
    }

    @Override // defpackage.afvo
    public final void a(android.view.View view, defpackage.eax eaxVar, defpackage.afvp afvpVar) {
        afvpVar.d += eaxVar.a();
        int layoutDirection = view.getLayoutDirection();
        int iB = eaxVar.b();
        int iC = eaxVar.c();
        afvpVar.a += layoutDirection == 1 ? iC : iB;
        if (layoutDirection != 1) {
            iB = iC;
        }
        afvpVar.c += iB;
        afvpVar.a(view);
    }
}
