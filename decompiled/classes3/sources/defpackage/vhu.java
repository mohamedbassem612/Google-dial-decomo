package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class vhu extends defpackage.vhi {
    private static final aimz d = aimz.i("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/mail/internet/MimeMessage");
    public final android.content.Context b;
    public defpackage.vha c;
    private com.android.dialer.voicemail.service.impl.vvmclients.omtp.imap.mail.Address[] f;
    private java.util.Date g;
    private boolean h = false;
    private defpackage.vhs e = null;

    static {
        new java.text.SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss Z", java.util.Locale.US);
        java.util.regex.Pattern.compile("^<?([^>]+)>?$");
        java.util.regex.Pattern.compile("\r?\n");
    }

    public vhu(android.content.Context context) {
        this.b = context;
    }

    private final defpackage.vhs u() {
        defpackage.vhs vhsVar = this.e;
        if (vhsVar != null) {
            return vhsVar;
        }
        defpackage.vhs vhsVar2 = new defpackage.vhs();
        this.e = vhsVar2;
        return vhsVar2;
    }

    @Override // defpackage.vha
    public final java.io.InputStream a() {
        return null;
    }

    @Override // defpackage.vhk
    public final void b(android.content.Context context, java.io.OutputStream outputStream) throws java.io.IOException {
        java.io.BufferedWriter bufferedWriter = new java.io.BufferedWriter(new java.io.OutputStreamWriter(outputStream), 1024);
        if (r("Message-ID") == null && !this.h) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("<");
            for (int i = 0; i < 24; i++) {
                sb.append("0123456789abcdefghijklmnopqrstuv".charAt(((int) ((vht) agab.aH(context, vht.class)).pr().C()) & 31));
            }
            sb.append('.');
            sb.append(java.lang.Long.toString(java.lang.System.currentTimeMillis()));
            sb.append("@email.android.com>");
            p("Message-ID", sb.toString());
        }
        u().d(outputStream);
        bufferedWriter.write("\r\n");
        bufferedWriter.flush();
        defpackage.vha vhaVar = this.c;
        if (vhaVar != null) {
            vhaVar.b(context, outputStream);
        }
    }

    @Override // defpackage.vhi
    public final java.lang.Long c() {
        try {
            java.lang.String strR = r("Content-Duration");
            if (strR == null) {
                a.bI(d.d(), "message missing Content-Duration header", "com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/mail/internet/MimeMessage", "getDuration", (char) 228, "MimeMessage.java", zct.b);
                return null;
            }
            try {
                return java.lang.Long.valueOf(strR);
            } catch (java.lang.NumberFormatException unused) {
                a.bt(d.d(), "cannot parse duration %s", strR, "com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/mail/internet/MimeMessage", "getDuration", (char) 234, "MimeMessage.java", zct.b);
                return null;
            }
        } catch (defpackage.vgv e) {
            a.bq(d.c(), "cannot retrieve header", "com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/mail/internet/MimeMessage", "getDuration", (char) 224, "MimeMessage.java", e, zct.b);
            return null;
        }
    }

    @Override // defpackage.vhi
    public final java.lang.String d() {
        java.lang.String strR = r("X-Transcription");
        if (strR == null) {
            return null;
        }
        if (strR.matches("^Source-ID=<.*>$")) {
            return strR.replaceAll("^Source-ID=<|>$", "");
        }
        d.b().l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/mail/internet/MimeMessage", "getTranscriptionSourceId", 429, "MimeMessage.java").y("invalid X-Transcription header: %s", strR);
        return null;
    }

    @Override // defpackage.vhi
    public final java.util.Date e() {
        if (this.g == null) {
            try {
                this.g = apsl.b(a.bx(defpackage.vhw.e(r("Date")), "Date: ")).b();
            } catch (java.lang.Exception e) {
                a.bq(d.c(), "Failed parsing Date", "com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/mail/internet/MimeMessage", "getSentDate", (char) 190, "MimeMessage.java", e, zct.b);
            }
        }
        if (this.g == null) {
            try {
                this.g = apsl.b(a.bx(defpackage.vhw.e(r("Delivery-date")), "Date: ")).b();
            } catch (java.lang.Exception e2) {
                a.bq(d.c(), "Failed parsing Delivery-date", "com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/mail/internet/MimeMessage", "getSentDate", (char) 204, "MimeMessage.java", e2, zct.b);
            }
        }
        return this.g;
    }

    @Override // defpackage.vhi
    public final com.android.dialer.voicemail.service.impl.vvmclients.omtp.imap.mail.Address[] g() {
        com.android.dialer.voicemail.service.impl.vvmclients.omtp.imap.mail.Address[] addressArr;
        com.android.dialer.voicemail.service.impl.vvmclients.omtp.imap.mail.Address[] addressArr2 = this.f;
        if (addressArr2 != null) {
            return addressArr2;
        }
        java.lang.String strD = defpackage.vhw.d(r("From"));
        if (strD == null || strD.length() == 0) {
            strD = defpackage.vhw.d(r("Sender"));
        }
        java.util.regex.Pattern pattern = com.android.dialer.voicemail.service.impl.vvmclients.omtp.imap.mail.Address.a;
        if (strD == null || strD.length() == 0) {
            addressArr = com.android.dialer.voicemail.service.impl.vvmclients.omtp.imap.mail.Address.b;
        } else {
            android.text.util.Rfc822Token[] rfc822TokenArr = android.text.util.Rfc822Tokenizer.tokenize(strD);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (android.text.util.Rfc822Token rfc822Token : rfc822TokenArr) {
                java.lang.String address = rfc822Token.getAddress();
                if (!android.text.TextUtils.isEmpty(address) && (com.android.dialer.voicemail.service.impl.vvmclients.omtp.imap.mail.Address.a.matcher(address).find() || address.startsWith("VOICE="))) {
                    java.lang.String name = rfc822Token.getName();
                    if (true == android.text.TextUtils.isEmpty(name)) {
                        name = null;
                    }
                    arrayList.add(new com.android.dialer.voicemail.service.impl.vvmclients.omtp.imap.mail.Address(address, name));
                }
            }
            addressArr = (com.android.dialer.voicemail.service.impl.vvmclients.omtp.imap.mail.Address[]) arrayList.toArray(new com.android.dialer.voicemail.service.impl.vvmclients.omtp.imap.mail.Address[arrayList.size()]);
        }
        this.f = addressArr;
        return addressArr;
    }

    @Override // defpackage.vhk
    public final defpackage.vha j() {
        return this.c;
    }

    @Override // defpackage.vhk
    public final java.lang.String k() {
        throw null;
    }

    @Override // defpackage.vhk
    public final java.lang.String l() {
        java.lang.String strR = r("Content-Type");
        return strR == null ? "text/plain" : strR;
    }

    @Override // defpackage.vhk
    public final java.lang.String m() {
        return defpackage.vhw.c(l(), null);
    }

    @Override // defpackage.vhk
    public final void n(java.lang.String str, java.lang.String str2) {
        u().b(str, str2);
    }

    @Override // defpackage.vhk
    public final void o(defpackage.vha vhaVar) {
        this.c = vhaVar;
        if (vhaVar instanceof defpackage.vhj) {
            p("Content-Type", ((defpackage.vhj) vhaVar).e());
            p("MIME-Version", "1.0");
        } else if (vhaVar instanceof defpackage.vhx) {
            p("Content-Type", java.lang.String.format(java.util.Locale.US, "%s;\n charset=utf-8", m()));
            p("Content-Transfer-Encoding", "base64");
        }
    }

    @Override // defpackage.vhk
    public final void p(java.lang.String str, java.lang.String str2) {
        u().c(str, str2);
    }

    @Override // defpackage.vhk
    public final java.lang.String[] q(java.lang.String str) {
        return u().e(str);
    }

    protected final java.lang.String r(java.lang.String str) {
        return u().a(str);
    }

    public final apth s() {
        u().a.clear();
        this.h = true;
        this.f = null;
        this.g = null;
        this.c = null;
        apth apthVar = new apth();
        apthVar.a = new defpackage.xtc(this);
        return apthVar;
    }

    public final void t(java.io.InputStream inputStream) {
        s().a(new defpackage.apsz(inputStream));
    }
}
