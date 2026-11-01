package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
class sal implements java.util.function.Function {
    public void a(defpackage.akmv akmvVar, akzx akzxVar) {
        throw null;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
        return j$.util.function.Function.-CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
        defpackage.akmv akmvVar = (defpackage.akmv) obj;
        akzx akzxVarM = defpackage.abxs.a.m();
        float f = akmvVar.b;
        akzxVarM.u();
        defpackage.abxs abxsVar = (defpackage.abxs) akzxVarM.b;
        abxsVar.b |= 1;
        abxsVar.c = f;
        float f2 = akmvVar.c;
        akzxVarM.u();
        defpackage.abxs abxsVar2 = (defpackage.abxs) akzxVarM.b;
        abxsVar2.b |= 2;
        abxsVar2.d = f2;
        float f3 = akmvVar.d;
        akzxVarM.u();
        defpackage.abxs abxsVar3 = (defpackage.abxs) akzxVarM.b;
        abxsVar3.b |= 4;
        abxsVar3.e = f3;
        java.lang.String str = akmvVar.e;
        akzxVarM.u();
        defpackage.abxs abxsVar4 = (defpackage.abxs) akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        abxsVar4.b |= 8;
        abxsVar4.f = str;
        a(akmvVar, akzxVarM);
        return (defpackage.abxs) akzxVarM.p();
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        return j$.util.function.Function.-CC.$default$compose(this, function);
    }
}
