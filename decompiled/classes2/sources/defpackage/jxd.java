package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum jxd implements alah {
    UNDEFINED(0),
    PINNED_CONTACT(1),
    STARRED_CONTACT(2),
    FREQUENT_CONTACT(3);

    public final int e;

    jxd(int i) {
        this.e = i;
    }

    public static defpackage.jxd b(int i) {
        if (i == 0) {
            return UNDEFINED;
        }
        if (i == 1) {
            return PINNED_CONTACT;
        }
        if (i == 2) {
            return STARRED_CONTACT;
        }
        if (i != 3) {
            return null;
        }
        return FREQUENT_CONTACT;
    }

    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.e);
    }
}
