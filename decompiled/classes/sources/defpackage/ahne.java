package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahne {
    defpackage.ahpj a;
    public defpackage.ahnd b = defpackage.ahnd.d;
    public final defpackage.ahpj c;

    public ahne(defpackage.ahpn ahpnVar, boolean z) {
        defpackage.ahpj ahpjVarA = z ? ahpnVar.a() : null;
        this.a = ahpjVarA;
        this.c = z ? ahpjVarA : null;
    }

    public static void a(defpackage.ahpj ahpjVar) {
        android.os.Trace.beginSection(defpackage.ahns.i(ahpjVar.d()));
    }

    final void b(defpackage.ahpj ahpjVar) {
        if (d(ahpjVar) || ahpjVar.b() == null) {
            android.os.Trace.beginSection(ahpjVar.e());
            a(ahpjVar);
        } else {
            b(ahpjVar.b());
            a(ahpjVar);
        }
    }

    final void c(defpackage.ahpj ahpjVar) {
        if (d(ahpjVar) || ahpjVar.b() == null) {
            android.os.Trace.endSection();
            android.os.Trace.endSection();
        } else {
            android.os.Trace.endSection();
            c(ahpjVar.b());
        }
    }

    public final boolean d(defpackage.ahpj ahpjVar) {
        return ahpjVar.a() != this;
    }
}
