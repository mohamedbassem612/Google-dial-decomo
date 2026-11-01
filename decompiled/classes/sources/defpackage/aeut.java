package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aeut {
    public final float a;

    public aeut(float f) {
        if (f < 0.0f || f > 1.0f) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Probability must be in [0, 1], was %s", java.lang.Float.valueOf(f)));
        }
        this.a = f;
    }
}
