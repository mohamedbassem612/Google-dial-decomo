package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class qd {
    private static final defpackage.qt a = new defpackage.qs().a();
    private java.lang.String b;
    private defpackage.qt c;
    private final java.lang.String d;
    private int e;

    public qd(defpackage.qe qeVar) {
        this.b = "";
        this.c = a;
        this.e = 10;
        dzk.x(qeVar);
        this.b = qeVar.a;
        this.c = qeVar.b;
        this.d = qeVar.c;
        this.e = qeVar.d;
    }

    public final defpackage.qe a() {
        return new defpackage.qe(this.b, this.c, this.d, this.e);
    }

    public final void b(java.lang.String str, defpackage.qt qtVar) {
        dzk.x(str);
        dzk.x(qtVar);
        this.b = str;
        this.c = qtVar;
    }
}
