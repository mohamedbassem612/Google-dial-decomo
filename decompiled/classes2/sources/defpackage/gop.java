package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gop extends defpackage.goq {
    private final float a;

    public gop(float f) {
        super("dimension in ratio:" + f);
        this.a = f;
        double d = (double) f;
        if (d <= 0.0d || d > 1.0d) {
            throw new java.lang.IllegalArgumentException("Ratio must be in range (0.0, 1.0]");
        }
    }

    public final int a(int i) {
        return (int) (this.a * i);
    }
}
