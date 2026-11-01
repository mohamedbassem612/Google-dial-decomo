package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
class san implements java.util.function.Function {
    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
        return j$.util.function.Function.-CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
        defpackage.abxp abxpVar = (defpackage.abxp) obj;
        akzx akzxVarM = defpackage.akmj.a.m();
        int i = abxpVar.b;
        if (i == 1) {
            defpackage.akmv akmvVar = (defpackage.akmv) aa$.ExternalSyntheticApiModelOutline1.m(defpackage.sau.b, i == 1 ? (defpackage.abxs) abxpVar.c : defpackage.abxs.a);
            akzxVarM.u();
            defpackage.akmj akmjVar = (defpackage.akmj) akzxVarM.b;
            j$.util.Objects.requireNonNull(akmvVar);
            akmjVar.c = akmvVar;
            akmjVar.b = 1;
        }
        return (defpackage.akmj) akzxVarM.p();
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        return j$.util.function.Function.-CC.$default$compose(this, function);
    }
}
