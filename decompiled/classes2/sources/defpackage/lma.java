package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lma extends ld implements defpackage.lmn {
    public final android.widget.TextView s;
    public final android.widget.TextView t;
    public final android.widget.ImageView u;
    public final android.widget.TextView v;
    public final android.widget.ImageView w;
    public final wde x;
    public final rlv y;
    public final ops z;

    public lma(voc vocVar, ops opsVar, rlv rlvVar, android.view.View view) {
        super(view);
        this.z = opsVar;
        this.y = rlvVar;
        this.s = (android.widget.TextView) view.findViewById(2131427729);
        this.t = (android.widget.TextView) view.findViewById(2131427730);
        this.u = (android.widget.ImageView) view.findViewById(2131427728);
        this.v = (android.widget.TextView) view.findViewById(2131429372);
        this.w = (android.widget.ImageView) view.findViewById(2131429371);
        this.x = vocVar.g((com.airbnb.lottie.LottieAnimationView) view.findViewById(2131427731));
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
        this.x.b();
    }

    @Override // defpackage.lmn
    public final void G() {
        android.widget.TextView textView = this.s;
        textView.setEnabled(false);
        textView.setEnabled(true);
    }
}
