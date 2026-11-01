package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum hqh implements alah {
    TAB_ID_UNKNOWN(0),
    TAB_ID_FAVORITES(1),
    TAB_ID_RECENTS(2),
    TAB_ID_CONTACTS(3),
    TAB_ID_DIALPAD(4),
    UNRECOGNIZED(-1);

    private final int h;

    hqh(int i) {
        this.h = i;
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.h;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.h);
    }
}
