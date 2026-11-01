package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aeve {
    public final float a;
    public final java.lang.Object b;

    public aeve(java.util.Random random, float f) {
        boolean z = false;
        if (f >= 0.0f && f <= 1.0f) {
            z = true;
        }
        defpackage.ahvr.bN(z, "Sampling rate should be a floating number >= 0 and <= 1.");
        this.a = f;
        this.b = random;
    }

    public final boolean a() {
        return ((java.util.Random) this.b).nextFloat() < this.a;
    }

    public aeve(java.lang.String str, float f) {
        this.b = str;
        this.a = f;
    }
}
