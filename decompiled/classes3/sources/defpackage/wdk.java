package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wdk {
    public final android.content.Context a;
    public final android.view.WindowManager b;
    public final int c;
    public final int d;
    public int e;
    public android.view.View f;
    public android.view.View g;
    public android.view.View h;
    public boolean i;
    public boolean j;

    public wdk(android.content.Context context) {
        this.a = context;
        this.b = (android.view.WindowManager) context.getSystemService(android.view.WindowManager.class);
        this.c = context.getResources().getDimensionPixelSize(2131165371);
        this.d = context.getResources().getDimensionPixelSize(2131165370);
    }

    public final void a() {
        android.view.View view = this.f;
        if (view != null) {
            view.animate().alpha(0.0f).setInterpolator(wsc.bq(this.a, defpackage.urq.EASING_LINEAR)).setDuration(175L).withEndAction(new defpackage.vet(this, 11)).start();
        }
    }
}
