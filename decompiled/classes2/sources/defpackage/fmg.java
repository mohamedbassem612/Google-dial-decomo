package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fmg extends defpackage.flq {
    final /* synthetic */ defpackage.fma a;
    final /* synthetic */ defpackage.fmh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fmg(defpackage.fmh fmhVar, defpackage.fma fmaVar, defpackage.fma fmaVar2) {
        super(fmaVar);
        this.a = fmaVar2;
        j$.util.Objects.requireNonNull(fmhVar);
        this.b = fmhVar;
    }

    @Override // defpackage.flq, defpackage.fma
    public final defpackage.fly b(long j) {
        defpackage.fly flyVarB = this.a.b(j);
        defpackage.fmb fmbVar = flyVarB.a;
        long j2 = fmbVar.c;
        long j3 = fmbVar.b;
        long j4 = this.b.a;
        defpackage.fmb fmbVar2 = new defpackage.fmb(j3, j2 + j4);
        defpackage.fmb fmbVar3 = flyVarB.b;
        return new defpackage.fly(fmbVar2, new defpackage.fmb(fmbVar3.b, fmbVar3.c + j4));
    }
}
