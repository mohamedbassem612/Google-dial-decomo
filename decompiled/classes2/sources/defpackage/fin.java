package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fin {
    public final int a;
    public final defpackage.ezh[] b;
    public final defpackage.fii[] c;
    public final defpackage.ert d;
    public final java.lang.Object e;

    public fin(defpackage.ezh[] ezhVarArr, defpackage.fii[] fiiVarArr, defpackage.ert ertVar, java.lang.Object obj) {
        int length = ezhVarArr.length;
        ahvr.bM(length == fiiVarArr.length);
        this.b = ezhVarArr;
        this.c = (defpackage.fii[]) fiiVarArr.clone();
        this.d = ertVar;
        this.e = obj;
        this.a = length;
    }

    public final boolean a(defpackage.fin finVar, int i) {
        return finVar != null && j$.util.Objects.equals(this.b[i], finVar.b[i]) && j$.util.Objects.equals(this.c[i], finVar.c[i]);
    }

    public final boolean b(int i) {
        return this.b[i] != null;
    }
}
