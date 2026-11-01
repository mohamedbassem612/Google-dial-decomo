package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vhv extends defpackage.vhj {
    public java.lang.String c;
    protected java.lang.String d;

    public vhv(java.lang.String str) throws defpackage.vgv {
        this.b = str;
        try {
            java.lang.String strC = defpackage.vhw.c(str, "boundary");
            this.d = strC;
            if (strC != null) {
            } else {
                throw new defpackage.vgv(a.bx(str, "MultiPart does not contain boundary: "), null);
            }
        } catch (java.lang.Exception e) {
            throw new defpackage.vgv(a.bp((byte) 41, str, "Invalid MultiPart Content-Type; must contain subtype and boundary. ("), e);
        }
    }

    @Override // defpackage.vhj, defpackage.vha
    public final java.io.InputStream a() {
        return null;
    }

    @Override // defpackage.vhj, defpackage.vha
    public final void b(android.content.Context context, java.io.OutputStream outputStream) throws java.io.IOException {
        java.io.BufferedWriter bufferedWriter = new java.io.BufferedWriter(new java.io.OutputStreamWriter(outputStream), 1024);
        java.lang.String str = this.c;
        if (str != null) {
            bufferedWriter.write(str.concat("\r\n"));
        }
        java.util.ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            defpackage.vhb vhbVar = (defpackage.vhb) arrayList.get(i);
            bufferedWriter.write("--" + this.d + "\r\n");
            bufferedWriter.flush();
            vhbVar.b(context, outputStream);
            bufferedWriter.write("\r\n");
        }
        bufferedWriter.write("--" + this.d + "--\r\n");
        bufferedWriter.flush();
    }

    @Override // defpackage.vhj
    public final java.lang.String e() {
        return this.b;
    }

    public final void g(java.lang.String str) {
        this.b = java.lang.String.format(java.util.Locale.US, "multipart/%s; boundary=\"%s\"", str, this.d);
    }

    public vhv() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("----");
        for (int i = 0; i < 30; i++) {
            stringBuffer.append(java.lang.Integer.toString((int) (java.lang.Math.random() * 35.0d), 36));
        }
        this.d = stringBuffer.toString().toUpperCase(java.util.Locale.US);
        g("mixed");
    }
}
