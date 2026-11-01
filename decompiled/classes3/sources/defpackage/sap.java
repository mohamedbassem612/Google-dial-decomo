package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
class sap implements java.util.function.Function {
    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
        return j$.util.function.Function.-CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
        defpackage.abxs abxsVar = (defpackage.abxs) obj;
        akzx akzxVarM = defpackage.akmv.a.m();
        if ((abxsVar.b & 1) != 0) {
            float f = abxsVar.c;
            akzxVarM.u();
            ((defpackage.akmv) akzxVarM.b).b = f;
        }
        if ((abxsVar.b & 2) != 0) {
            float f2 = abxsVar.d;
            akzxVarM.u();
            ((defpackage.akmv) akzxVarM.b).c = f2;
        }
        if ((abxsVar.b & 4) != 0) {
            float f3 = abxsVar.e;
            akzxVarM.u();
            ((defpackage.akmv) akzxVarM.b).d = f3;
        }
        return (defpackage.akmv) akzxVarM.p();
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        return j$.util.function.Function.-CC.$default$compose(this, function);
    }
}
