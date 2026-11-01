package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public enum idu implements defpackage.alah {
    UNKNOWN(0),
    SYSTEM(1),
    WAV(2);

    private final int e;

    idu(int i) {
        this.e = i;
    }

    @Override // defpackage.alah
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.e);
    }
}
