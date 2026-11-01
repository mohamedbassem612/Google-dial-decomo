package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public abstract class viq extends defpackage.vih {
    public java.util.Date d;
    private boolean g;
    private int h;
    private static final aimz e = aimz.i("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/mail/store/imap/ImapString");
    public static final byte[] b = new byte[0];
    public static final defpackage.viq c = new defpackage.vip();
    private static final java.text.SimpleDateFormat f = new java.text.SimpleDateFormat("dd-MMM-yyyy HH:mm:ss Z", java.util.Locale.US);

    public abstract java.io.InputStream a();

    public abstract java.lang.String b();

    @Override // defpackage.vih
    public void c(defpackage.vhg vhgVar, defpackage.vin vinVar) {
        vhgVar.c("\"" + b() + '\"');
    }

    public final int d(int i) {
        if (!this.g) {
            try {
                this.h = java.lang.Integer.parseInt(b());
                this.g = true;
            } catch (java.lang.NumberFormatException unused) {
                return i;
            }
        }
        return this.h;
    }

    public final boolean e(java.lang.String str) {
        return ahvr.r(b(), str);
    }

    public final boolean f() {
        if (this.d != null) {
            return true;
        }
        if (!g()) {
            try {
                this.d = f.parse(b());
                return true;
            } catch (java.text.ParseException unused) {
                a.bt(e.d(), "ImapString %s can't be parsed as a date.", b(), "com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/mail/store/imap/ImapString", "isDate", (char) 144, "ImapString.java", zct.b);
            }
        }
        return false;
    }

    public final boolean g() {
        return b().length() == 0;
    }

    @Override // defpackage.vih
    public final boolean s() {
        return false;
    }

    @Override // defpackage.vih
    public final boolean t() {
        return true;
    }
}
