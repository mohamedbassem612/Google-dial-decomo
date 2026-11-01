package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum udl implements alah {
    UNKNOWN_VERDICT_SOURCE(0),
    REMOTE(1),
    USER(2);

    private final int e;

    udl(int i) {
        this.e = i;
    }

    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.e);
    }
}
