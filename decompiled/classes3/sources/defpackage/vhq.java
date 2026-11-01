package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vhq extends defpackage.vhb {
    private static final java.util.regex.Pattern c = java.util.regex.Pattern.compile("^<?([^>]+)>?$");
    protected defpackage.vhs a;
    protected defpackage.vha b;

    static {
        java.util.regex.Pattern.compile("\r?\n");
    }

    public vhq(byte[] bArr) {
        this.a = new defpackage.vhs();
        o(null);
    }

    protected final java.lang.String a(java.lang.String str) {
        return this.a.a(str);
    }

    @Override // defpackage.vhk
    public final void b(android.content.Context context, java.io.OutputStream outputStream) throws java.io.IOException {
        java.io.BufferedWriter bufferedWriter = new java.io.BufferedWriter(new java.io.OutputStreamWriter(outputStream), 1024);
        this.a.d(outputStream);
        bufferedWriter.write("\r\n");
        bufferedWriter.flush();
        defpackage.vha vhaVar = this.b;
        if (vhaVar != null) {
            vhaVar.b(context, outputStream);
        }
    }

    @Override // defpackage.vhk
    public final defpackage.vha j() {
        return this.b;
    }

    @Override // defpackage.vhk
    public final java.lang.String k() {
        java.lang.String strA = a("Content-ID");
        if (strA == null) {
            return null;
        }
        return c.matcher(strA).replaceAll("$1");
    }

    @Override // defpackage.vhk
    public final java.lang.String l() {
        java.lang.String strA = a("Content-Type");
        return strA == null ? "text/plain" : strA;
    }

    @Override // defpackage.vhk
    public final java.lang.String m() {
        return defpackage.vhw.c(l(), null);
    }

    @Override // defpackage.vhk
    public final void n(java.lang.String str, java.lang.String str2) {
        this.a.b(str, str2);
    }

    @Override // defpackage.vhk
    public final void o(defpackage.vha vhaVar) {
        this.b = vhaVar;
        if (vhaVar instanceof defpackage.vhj) {
            p("Content-Type", ((defpackage.vhj) vhaVar).e());
            return;
        }
        if (vhaVar instanceof defpackage.vhx) {
            java.lang.String strConcat = java.lang.String.format(java.util.Locale.US, "%s;\n charset=utf-8", m());
            java.lang.String strC = defpackage.vhw.c(l(), "name");
            if (strC != null) {
                strConcat = java.lang.String.valueOf(strConcat).concat(java.lang.String.valueOf(java.lang.String.format(java.util.Locale.US, ";\n name=\"%s\"", strC)));
            }
            p("Content-Type", strConcat);
            p("Content-Transfer-Encoding", "base64");
        }
    }

    @Override // defpackage.vhk
    public final void p(java.lang.String str, java.lang.String str2) {
        this.a.c(str, str2);
    }

    @Override // defpackage.vhk
    public final java.lang.String[] q(java.lang.String str) {
        return this.a.e(str);
    }

    public vhq() {
        throw null;
    }
}
