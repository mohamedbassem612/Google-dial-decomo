package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vik extends defpackage.viq {
    private static final aimz e = aimz.i("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/mail/store/imap/ImapMemoryLiteral");
    private final byte[] f;

    public vik(defpackage.vhf vhfVar) {
        int i;
        this.f = new byte[vhfVar.a];
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f;
            int length = bArr.length;
            if (i2 >= length || (i = vhfVar.read(bArr, i2, length - i2)) < 0) {
                break;
            } else {
                i2 += i;
            }
        }
        if (i2 != this.f.length) {
            a.bI(e.d(), "length mismatch", "com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/mail/store/imap/ImapMemoryLiteral", "<init>", '2', "ImapMemoryLiteral.java", zct.b);
        }
    }

    @Override // defpackage.viq
    public final java.io.InputStream a() {
        return new java.io.ByteArrayInputStream(this.f);
    }

    @Override // defpackage.viq
    public final java.lang.String b() {
        try {
            return new java.lang.String(this.f, "US-ASCII");
        } catch (java.io.UnsupportedEncodingException e2) {
            a.bq(e.c(), "Unsupported encoding", "com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/mail/store/imap/ImapMemoryLiteral", "getString", '<', "ImapMemoryLiteral.java", e2, zct.b);
            return null;
        }
    }

    @Override // defpackage.viq, defpackage.vih
    public final void c(defpackage.vhg vhgVar, defpackage.vin vinVar) throws defpackage.vgv {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("{");
        byte[] bArr = this.f;
        sb.append(bArr.length);
        sb.append('}');
        vhgVar.c(sb.toString());
        vhgVar.c("\r\n");
        vhgVar.a();
        if (!vinVar.a(false).c) {
            throw new defpackage.vgv("Unexpected response received", null);
        }
        akzc.u(bArr).m(((defpackage.vhh) vhgVar).i);
        vhgVar.c("\r\n");
    }

    public final java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.US, "{%d byte literal(memory)}", java.lang.Integer.valueOf(this.f.length));
    }
}
