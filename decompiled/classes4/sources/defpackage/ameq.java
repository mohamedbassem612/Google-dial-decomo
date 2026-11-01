package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class ameq implements java.util.function.BiPredicate {
    @Override // java.util.function.BiPredicate
    public final /* synthetic */ java.util.function.BiPredicate and(java.util.function.BiPredicate biPredicate) {
        return j$.util.function.BiPredicate.-CC.$default$and(this, biPredicate);
    }

    @Override // java.util.function.BiPredicate
    public final /* synthetic */ java.util.function.BiPredicate negate() {
        return j$.util.function.BiPredicate.-CC.$default$negate(this);
    }

    @Override // java.util.function.BiPredicate
    public final /* synthetic */ java.util.function.BiPredicate or(java.util.function.BiPredicate biPredicate) {
        return j$.util.function.BiPredicate.-CC.$default$or(this, biPredicate);
    }

    @Override // java.util.function.BiPredicate
    public final boolean test(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.amce amceVar = (defpackage.amce) obj;
        defpackage.amce amceVar2 = (defpackage.amce) obj2;
        if (amceVar.m() && amceVar2.l()) {
            return true;
        }
        if (amceVar.n() && amceVar2.q()) {
            return true;
        }
        if (amceVar.m() || amceVar.l()) {
            java.lang.String strE = amceVar.e();
            java.lang.String strE2 = amceVar2.e();
            ahzf ahzfVar = defpackage.amev.b;
            aify aifyVarN = aify.n(ahzfVar.j(strE));
            aify aifyVarN2 = aify.n(ahzfVar.j(strE2));
            if (aifyVarN.size() >= 3 && aifyVarN2.size() >= 3 && j$.util.stream.IntStream.-CC.range(0, 3).mapToObj(new defpackage.amep(aifyVarN, aifyVarN2, 0)).filter(new defpackage.amdm(3)).count() / 3.0d < 0.5d) {
                return true;
            }
        }
        return false;
    }
}
