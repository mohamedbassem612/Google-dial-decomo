package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afqb extends defpackage.afqg {
    @Override // defpackage.afqg
    public final int a(android.view.View view, android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
        return view.getMeasuredWidth() + marginLayoutParams.rightMargin;
    }

    @Override // defpackage.afqg
    public final int b() {
        return 0;
    }

    @Override // defpackage.afqg
    public final android.view.ViewPropertyAnimator c(android.view.View view, int i) {
        return view.animate().translationX(i);
    }

    @Override // defpackage.afqg
    public final void d() {
    }
}
