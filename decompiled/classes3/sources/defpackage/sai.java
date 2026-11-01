package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class sai implements java.util.function.Function {
    @Override // java.util.function.Function
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final defpackage.abxt apply(defpackage.akmm akmmVar) {
        akzx akzxVarM = defpackage.abxt.a.m();
        if ((akmmVar.b & 1) != 0) {
            java.util.function.Function function = defpackage.sat.b;
            defpackage.akmj akmjVar = akmmVar.c;
            if (akmjVar == null) {
                akmjVar = defpackage.akmj.a;
            }
            defpackage.abxp abxpVar = (defpackage.abxp) aa$.ExternalSyntheticApiModelOutline1.m(function, akmjVar);
            akzxVarM.u();
            defpackage.abxt abxtVar = (defpackage.abxt) akzxVarM.b;
            j$.util.Objects.requireNonNull(abxpVar);
            abxtVar.c = abxpVar;
            abxtVar.b |= 1;
        }
        if ((akmmVar.b & 2) != 0) {
            java.util.function.Function function2 = defpackage.sat.c;
            defpackage.akmu akmuVar = akmmVar.d;
            if (akmuVar == null) {
                akmuVar = defpackage.akmu.a;
            }
            defpackage.abxr abxrVar = (defpackage.abxr) aa$.ExternalSyntheticApiModelOutline1.m(function2, akmuVar);
            akzxVarM.u();
            defpackage.abxt abxtVar2 = (defpackage.abxt) akzxVarM.b;
            j$.util.Objects.requireNonNull(abxrVar);
            abxtVar2.d = abxrVar;
            abxtVar2.b |= 2;
        }
        b(akmmVar, akzxVarM);
        return (defpackage.abxt) akzxVarM.p();
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
        return j$.util.function.Function.-CC.$default$andThen(this, function);
    }

    public void b(defpackage.akmm akmmVar, akzx akzxVar) {
        throw null;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        return j$.util.function.Function.-CC.$default$compose(this, function);
    }
}
