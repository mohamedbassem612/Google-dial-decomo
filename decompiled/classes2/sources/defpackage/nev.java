package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum nev implements alah {
    TYPE_UNSET(0),
    TYPE_DEFAULT(1),
    TYPE_ASK_IF_URGENT(2),
    UNRECOGNIZED(-1);

    private final int f;

    nev(int i) {
        this.f = i;
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.f;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.f);
    }
}
