package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class dsr {
    defpackage.dst a;
    final /* synthetic */ defpackage.dss b;

    public dsr(defpackage.dss dssVar) {
        this.b = dssVar;
    }

    public final java.lang.String toString() {
        java.lang.String str = "[ ";
        if (this.a != null) {
            for (int i = 0; i < 9; i++) {
                str = str + this.a.i[i] + ' ';
            }
        }
        return str + "] " + java.lang.String.valueOf(this.a);
    }
}
