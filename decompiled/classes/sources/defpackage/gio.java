package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gio implements defpackage.giv {
    public final java.lang.String a;
    public final java.lang.Object[] b;

    public gio(java.lang.String str, java.lang.Object[] objArr) {
        if (str == null) {
            defpackage.aooh.i("query");
        }
        this.a = str;
        this.b = objArr;
    }

    @Override // defpackage.giv
    public final java.lang.String f() {
        return this.a;
    }

    @Override // defpackage.giv
    public final void g(defpackage.giu giuVar) {
        defpackage.dzk.L(giuVar, this.b);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public gio(java.lang.String str) {
        this(str, null);
        if (str == null) {
            defpackage.aooh.i("query");
        }
    }
}
