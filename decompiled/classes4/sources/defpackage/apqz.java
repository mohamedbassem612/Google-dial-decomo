package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public enum apqz {
    CR("\r"),
    CRLF("\r\n"),
    LF("\n");

    public final java.lang.String d;

    apqz(java.lang.String str) {
        this.d = (java.lang.String) j$.util.Objects.requireNonNull(str, "lineSeparator");
    }
}
