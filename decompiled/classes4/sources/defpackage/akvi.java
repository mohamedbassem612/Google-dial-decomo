package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public enum akvi implements alah {
    CLIENT_VALUE_UNKNOWN(0),
    CLIENT_VALUE_ACCOUNT_NAME(1);

    public final int c;

    akvi(int i) {
        this.c = i;
    }

    public static defpackage.akvi b(int i) {
        if (i == 0) {
            return CLIENT_VALUE_UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return CLIENT_VALUE_ACCOUNT_NAME;
    }

    public final int a() {
        return this.c;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.c);
    }
}
