package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mlp {
    public static final aimz a = aimz.i("com/android/dialer/dialpadview/ui/PreCallDialpadOverflowMenuRenderer");
    public android.view.View b;
    public defpackage.kf c;
    public boolean d;
    public final defpackage.mla e;
    public final defpackage.mlm f;

    public mlp(defpackage.mla mlaVar, defpackage.mlm mlmVar) {
        this.e = mlaVar;
        this.f = mlmVar;
    }

    final void a(java.lang.String str) {
        this.b.setVisibility(true != str.isEmpty() ? 0 : 4);
    }
}
