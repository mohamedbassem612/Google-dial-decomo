package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
class saj implements java.util.function.Function {
    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
        return j$.util.function.Function.-CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
        defpackage.akmj akmjVar = (defpackage.akmj) obj;
        akzx akzxVarM = defpackage.abxp.a.m();
        int i = akmjVar.b;
        if (i == 1) {
            defpackage.abxs abxsVar = (defpackage.abxs) aa$.ExternalSyntheticApiModelOutline1.m(defpackage.saq.b, i == 1 ? (defpackage.akmv) akmjVar.c : defpackage.akmv.a);
            akzxVarM.u();
            defpackage.abxp abxpVar = (defpackage.abxp) akzxVarM.b;
            j$.util.Objects.requireNonNull(abxsVar);
            abxpVar.c = abxsVar;
            abxpVar.b = 1;
        }
        return (defpackage.abxp) akzxVarM.p();
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        return j$.util.function.Function.-CC.$default$compose(this, function);
    }
}
