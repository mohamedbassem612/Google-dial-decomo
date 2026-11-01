package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gng extends defpackage.gnf {
    private final java.lang.Object a;
    private final java.lang.String b;
    private final defpackage.gnh c;
    private final defpackage.gmu d;

    public gng(java.lang.Object obj, java.lang.String str, defpackage.gnh gnhVar, defpackage.gmu gmuVar) {
        if (obj == null) {
            defpackage.aooh.i("value");
        }
        if (str == null) {
            defpackage.aooh.i("tag");
        }
        if (gnhVar == null) {
            defpackage.aooh.i("verificationMode");
        }
        this.a = obj;
        this.b = str;
        this.c = gnhVar;
        this.d = gmuVar;
    }

    @Override // defpackage.gnf
    public final defpackage.gnf a(java.lang.String str, defpackage.aonj aonjVar) {
        java.lang.Object obj = this.a;
        return !((java.lang.Boolean) aonjVar.a(obj)).booleanValue() ? new gna(obj, this.b, str, this.c) : this;
    }

    @Override // defpackage.gnf
    public final java.lang.Object b() {
        return this.a;
    }
}
