package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xyg {
    public final android.content.Context a;
    public final android.app.ActivityManager b;
    public float c;
    public final defpackage.vqu d;

    public xyg(android.content.Context context) {
        this.c = 1.0f;
        this.a = context;
        android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getSystemService("activity");
        this.b = activityManager;
        this.d = new defpackage.vqu(context.getResources().getDisplayMetrics());
        if (activityManager.isLowRamDevice()) {
            this.c = 0.0f;
        }
    }
}
