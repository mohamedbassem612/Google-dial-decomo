package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mjo {
    public static final aimz a = aimz.i("com/android/dialer/dialpadview/easteregg/PseudoEmergencyAnimator");
    public android.animation.ValueAnimator b;
    public defpackage.mlh c;

    public mjo(defpackage.mlh mlhVar) {
        this.c = mlhVar;
    }

    public final void a() {
        android.animation.ValueAnimator valueAnimator = this.b;
        if (valueAnimator == null || !valueAnimator.isStarted()) {
            return;
        }
        this.b.end();
    }

    public final void b(long j) {
        android.os.Vibrator vibrator;
        android.content.Context contextA = this.c.a();
        if (contextA == null || (vibrator = (android.os.Vibrator) contextA.getSystemService("vibrator")) == null) {
            return;
        }
        vibrator.vibrate(j);
    }
}
