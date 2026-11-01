package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class goo extends defpackage.goq {
    public final int a;

    public goo(int i) {
        super(a.bj(i, "dimension in pixel:"));
        this.a = i;
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("Pixel value must be a positive integer.");
        }
    }
}
