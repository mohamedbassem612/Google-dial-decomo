package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class oxp {
    public final float b;
    public final float c;
    public final defpackage.amdx d = new defpackage.amdx();
    public final android.view.animation.Interpolator a = new android.view.animation.PathInterpolator(0.0f, 0.0f, 0.35f, 1.0f);

    public oxp(android.content.Context context) {
        this.b = context.getResources().getDisplayMetrics().density * 250.0f;
        this.c = context.getResources().getDisplayMetrics().density * 3000.0f;
    }
}
