package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class qm {
    public defpackage.qo a;
    public defpackage.qo b;
    public defpackage.qo c;
    private final java.lang.String d;

    public qm(defpackage.qn qnVar) {
        this.a = new defpackage.qo(0, 0);
        this.b = new defpackage.qo(-1, -1);
        this.c = new defpackage.qo(0, 0);
        dzk.x(qnVar);
        this.d = qnVar.a;
        this.a = qnVar.d.a;
        this.b = new defpackage.qo(qnVar.b, qnVar.c);
        this.c = qnVar.d.b;
    }

    public final defpackage.qn a() {
        defpackage.qp qpVar = new defpackage.qp(this.a, this.c);
        java.lang.String str = this.d;
        qpVar.c = str;
        defpackage.qo qoVar = this.a;
        int i = qoVar.a;
        int i2 = qoVar.b;
        defpackage.qo qoVar2 = this.b;
        int i3 = qoVar2.a;
        int i4 = qoVar2.b;
        defpackage.qo qoVar3 = this.c;
        int i5 = qoVar3.a;
        int i6 = qoVar3.b;
        return new defpackage.qn(str, i3, i4, qpVar);
    }

    public qm(java.lang.String str) {
        this.a = new defpackage.qo(0, 0);
        this.b = new defpackage.qo(-1, -1);
        this.c = new defpackage.qo(0, 0);
        dzk.x(str);
        this.d = str;
    }
}
