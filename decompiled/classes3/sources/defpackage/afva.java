package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afva implements android.animation.TimeInterpolator {
    private final android.animation.TimeInterpolator a;

    public afva(android.animation.TimeInterpolator timeInterpolator) {
        this.a = timeInterpolator;
    }

    public static android.animation.TimeInterpolator a(boolean z, android.animation.TimeInterpolator timeInterpolator) {
        return !z ? new defpackage.afva(timeInterpolator) : timeInterpolator;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return 1.0f - this.a.getInterpolation(f);
    }
}
