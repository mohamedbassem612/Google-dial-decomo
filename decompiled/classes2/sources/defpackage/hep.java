package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum hep {
    JSON(".json"),
    ZIP(".zip"),
    GZIP(".gz");

    public final java.lang.String d;

    hep(java.lang.String str) {
        this.d = str;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.d;
    }
}
