package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
class sao implements java.util.function.Function {
    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
        return j$.util.function.Function.-CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
        defpackage.abxr abxrVar = (defpackage.abxr) obj;
        akzx akzxVarM = defpackage.akmu.a.m();
        if ((abxrVar.b & 1) != 0) {
            defpackage.amml ammlVar = abxrVar.c;
            if (ammlVar == null) {
                ammlVar = defpackage.amml.a;
            }
            akzxVarM.u();
            defpackage.akmu akmuVar = (defpackage.akmu) akzxVarM.b;
            j$.util.Objects.requireNonNull(ammlVar);
            akmuVar.c = ammlVar;
            akmuVar.b |= 1;
        }
        if ((abxrVar.b & 2) != 0) {
            float f = abxrVar.d;
            akzxVarM.u();
            ((defpackage.akmu) akzxVarM.b).d = f;
        }
        if ((abxrVar.b & 4) != 0) {
            float f2 = abxrVar.e;
            akzxVarM.u();
            ((defpackage.akmu) akzxVarM.b).e = f2;
        }
        if ((abxrVar.b & 8) != 0) {
            int i = abxrVar.f;
            akzxVarM.u();
            ((defpackage.akmu) akzxVarM.b).f = i;
        }
        if ((abxrVar.b & 16) != 0) {
            int i2 = abxrVar.g;
            akzxVarM.u();
            ((defpackage.akmu) akzxVarM.b).g = i2;
        }
        if ((abxrVar.b & 32) != 0) {
            float f3 = abxrVar.h;
            akzxVarM.u();
            ((defpackage.akmu) akzxVarM.b).h = f3;
        }
        return (defpackage.akmu) akzxVarM.p();
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        return j$.util.function.Function.-CC.$default$compose(this, function);
    }
}
