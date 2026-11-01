package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum amrg implements alah {
    SEARCH_DATA_SOURCE_UNKNOWN(0),
    SEARCH_DATA_SOURCE_SMARTDIAL_TABLE(1),
    SEARCH_DATA_SOURCE_CONTACT_RETRIEVER(2),
    SEARCH_DATA_SOURCE_APP_SEARCH(3);

    public final int e;

    amrg(int i) {
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
