package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public enum aogi {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");

    public final java.lang.String e;

    aogi(java.lang.String str) {
        this.e = str;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.e;
    }
}
