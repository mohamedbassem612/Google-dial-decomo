package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
abstract class ayi extends cmv implements dbd {
    public final cyf cX(cyi cyiVar, cyd cydVar, long j) {
        long jG = g(cydVar, j);
        if (d()) {
            jG = dpe.e(j, jG);
        }
        czc czcVarV = cydVar.v(jG);
        return cyiVar.du(czcVarV.a, czcVarV.b, aokd.a, new defpackage.auj(czcVarV, 10));
    }

    public abstract boolean d();

    public int e(cxf cxfVar, cxe cxeVar, int i) {
        return cxeVar.c(i);
    }

    public int f(cxf cxfVar, cxe cxeVar, int i) {
        return cxeVar.d(i);
    }

    public abstract long g(cyd cydVar, long j);

    public int i(cxf cxfVar, cxe cxeVar, int i) {
        return cxeVar.e(i);
    }

    public int j(cxf cxfVar, cxe cxeVar, int i) {
        return cxeVar.f(i);
    }
}
