package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afpz extends defpackage.afqg {
    @Override // defpackage.afqg
    public final int a(android.view.View view, android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
        return view.getMeasuredHeight() + marginLayoutParams.bottomMargin;
    }

    @Override // defpackage.afqg
    public final int b() {
        return 1;
    }

    @Override // defpackage.afqg
    public final android.view.ViewPropertyAnimator c(android.view.View view, int i) {
        return view.animate().translationY(i);
    }

    @Override // defpackage.afqg
    public final void d() {
    }
}
