package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public enum akpk implements alah {
    CHANNEL_GROUP_STATE_UNKNOWN(0),
    ALLOWED(1),
    BANNED(2);

    public final int d;

    akpk(int i) {
        this.d = i;
    }

    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.d);
    }
}
