package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aofy {
    public java.lang.String[] a;
    public java.lang.String[] b;
    public boolean c;

    public aofy(defpackage.aofz aofzVar) {
        boolean z = aofzVar.b;
        this.a = aofzVar.c;
        this.b = aofzVar.d;
        this.c = aofzVar.e;
    }

    public final void a(defpackage.aofx... aofxVarArr) {
        java.lang.String[] strArr = new java.lang.String[aofxVarArr.length];
        for (int i = 0; i < aofxVarArr.length; i++) {
            strArr[i] = aofxVarArr[i].bb;
        }
        this.a = strArr;
    }

    public final void b() {
        this.c = true;
    }

    public final void c(defpackage.aogj... aogjVarArr) {
        java.lang.String[] strArr = new java.lang.String[aogjVarArr.length];
        for (int i = 0; i < aogjVarArr.length; i++) {
            strArr[i] = aogjVarArr[i].f;
        }
        this.b = strArr;
    }
}
