package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum aayy implements alah {
    UNKNOWN(0),
    NOT_ENCRYPTED(1),
    ENCRYPTION_OFFERED(2),
    ENCRYPTED(3),
    REMOTE_RINGING_NONE_SUPPORT_ENCRYPTION(4),
    REMOTE_RINGING_ALL_SUPPORT_ENCRYPTION(5),
    REMOTE_RINGING_SOME_SUPPORT_ENCRYPTION(6);

    public final int h;

    aayy(int i2) {
        this.h = i2;
    }

    public final int a() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.h);
    }
}
