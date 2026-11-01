package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum aixq implements alah {
    UNKNOWN(0),
    USER_CONFIRMED_BUSINESS(1),
    USER_DENIED_BUSINESS(2),
    USER_CONFIRMED_BUSINESS_CNAP(3),
    USER_DENIED_BUSINESS_CNAP(4);

    public final int f;

    aixq(int i) {
        this.f = i;
    }

    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.f);
    }
}
