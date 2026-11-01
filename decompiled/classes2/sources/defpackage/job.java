package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class job {
    public static final aimz a = aimz.i("com/android/dialer/callannouncer/impl/service/CallAnnouncerInternalProducerModule");

    public static java.lang.String a(java.lang.String str) {
        return str.replace("&", "&amp;").replace("\"", "&quot;").replace("'", "&apos;").replace("<", "&lt;").replace(">", "&gt;");
    }

    public static java.lang.String b(java.lang.String str) {
        return a.bk(str, "<speak>", "</speak>");
    }
}
