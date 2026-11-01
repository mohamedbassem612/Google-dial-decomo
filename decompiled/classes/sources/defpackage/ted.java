package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public enum ted implements defpackage.alah {
    OEM_UNKNOWN(0),
    OEM_OPPO(1),
    OEM_TEST(100000);

    public final int d;

    ted(int i) {
        this.d = i;
    }

    @Override // defpackage.alah
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.d);
    }
}
