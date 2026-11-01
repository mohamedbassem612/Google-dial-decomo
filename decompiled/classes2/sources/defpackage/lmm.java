package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class lmm extends ld implements defpackage.lmn {
    public final android.widget.TextView s;
    public final android.widget.TextView t;
    public final wde u;
    public final rlv v;

    public lmm(voc vocVar, rlv rlvVar, android.view.View view) {
        super(view);
        this.v = rlvVar;
        this.s = (android.widget.TextView) view.findViewById(2131429368);
        this.t = (android.widget.TextView) view.findViewById(2131429370);
        this.u = vocVar.g((com.airbnb.lottie.LottieAnimationView) view.findViewById(2131429373));
    }

    @Override // defpackage.lmn
    public final android.view.View C() {
        return this.a;
    }

    @Override // defpackage.lmn
    public final android.widget.TextView D() {
        return this.t;
    }

    @Override // defpackage.lmn
    public final android.widget.TextView E() {
        return this.s;
    }

    @Override // defpackage.lmn
    public final void F() {
        this.u.b();
    }

    @Override // defpackage.lmn
    public final void G() {
        android.widget.TextView textView = this.s;
        textView.setEnabled(false);
        textView.setEnabled(true);
    }
}
