package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public enum akro implements defpackage.alah {
    DEFAULT(0),
    TV(1),
    WEARABLE(2),
    AUTOMOTIVE(3),
    BATTLESTAR(4),
    CHROME_OS(5),
    DESKTOP_ANDROID(6),
    XR(7),
    XR_PERIPHERAL(8);

    public final int j;

    akro(int i) {
        this.j = i;
    }

    @Override // defpackage.alah
    public final int a() {
        return this.j;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.j);
    }
}
