package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public enum apgc implements defpackage.alah {
    UNKNOWN_HARDWARE_VARIANT(0),
    PHONE_OR_TABLET(1),
    WATCH(2),
    LEANBACK(3),
    AUTOMOTIVE(4),
    DESKTOP(5),
    XR(6);

    public final int h;

    apgc(int i2) {
        this.h = i2;
    }

    @Override // defpackage.alah
    public final int a() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.h);
    }
}
