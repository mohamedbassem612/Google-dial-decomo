package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
class sak implements java.util.function.Function {
    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
        return j$.util.function.Function.-CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
        defpackage.akmu akmuVar = (defpackage.akmu) obj;
        akzx akzxVarM = defpackage.abxr.a.m();
        if ((akmuVar.b & 1) != 0) {
            defpackage.amml ammlVar = akmuVar.c;
            if (ammlVar == null) {
                ammlVar = defpackage.amml.a;
            }
            akzxVarM.u();
            defpackage.abxr abxrVar = (defpackage.abxr) akzxVarM.b;
            j$.util.Objects.requireNonNull(ammlVar);
            abxrVar.c = ammlVar;
            abxrVar.b |= 1;
        }
        float f = akmuVar.d;
        akzxVarM.u();
        defpackage.abxr abxrVar2 = (defpackage.abxr) akzxVarM.b;
        abxrVar2.b |= 2;
        abxrVar2.d = f;
        float f2 = akmuVar.e;
        akzxVarM.u();
        defpackage.abxr abxrVar3 = (defpackage.abxr) akzxVarM.b;
        abxrVar3.b |= 4;
        abxrVar3.e = f2;
        int i = akmuVar.f;
        akzxVarM.u();
        defpackage.abxr abxrVar4 = (defpackage.abxr) akzxVarM.b;
        abxrVar4.b |= 8;
        abxrVar4.f = i;
        int i2 = akmuVar.g;
        akzxVarM.u();
        defpackage.abxr abxrVar5 = (defpackage.abxr) akzxVarM.b;
        abxrVar5.b |= 16;
        abxrVar5.g = i2;
        float f3 = akmuVar.h;
        akzxVarM.u();
        defpackage.abxr abxrVar6 = (defpackage.abxr) akzxVarM.b;
        abxrVar6.b |= 32;
        abxrVar6.h = f3;
        return (defpackage.abxr) akzxVarM.p();
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        return j$.util.function.Function.-CC.$default$compose(this, function);
    }
}
