package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vio extends defpackage.viq {
    private static final aimz e = aimz.i("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/mail/store/imap/ImapSimpleString");
    private final java.lang.String f;

    public vio(java.lang.String str) {
        this.f = str;
    }

    @Override // defpackage.viq
    public final java.io.InputStream a() {
        try {
            return new java.io.ByteArrayInputStream(this.f.getBytes("US-ASCII"));
        } catch (java.io.UnsupportedEncodingException e2) {
            a.bq(e.c(), "Unsupported encoding", "com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/mail/store/imap/ImapSimpleString", "getAsStream", '.', "ImapSimpleString.java", e2, zct.b);
            return null;
        }
    }

    @Override // defpackage.viq
    public final java.lang.String b() {
        return this.f;
    }

    public final java.lang.String toString() {
        return "\"" + this.f + '\"';
    }
}
