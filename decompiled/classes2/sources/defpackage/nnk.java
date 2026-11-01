package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nnk implements defpackage.meh {
    private final defpackage.nox a;
    private final aogc b;

    public nnk(defpackage.nox noxVar, aogc aogcVar) {
        aooh.f(aogcVar, "resultPropagator");
        this.a = noxVar;
        this.b = aogcVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.meh
    public final java.lang.Object c(boolean z, aoln aolnVar) {
        defpackage.nnj nnjVar;
        if (aolnVar instanceof defpackage.nnj) {
            nnjVar = (defpackage.nnj) aolnVar;
            int i = nnjVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nnjVar.c = i - Integer.MIN_VALUE;
            } else {
                nnjVar = new defpackage.nnj(this, aolnVar);
            }
        } else {
            nnjVar = new defpackage.nnj(this, aolnVar);
        }
        java.lang.Object objA = nnjVar.a;
        aolu aoluVar = aolu.a;
        int i2 = nnjVar.c;
        if (i2 == 0) {
            aooc.af(objA);
            if (z) {
                defpackage.nox noxVar = this.a;
                nnjVar.c = 1;
                objA = noxVar.a(nnjVar);
                if (objA == aoluVar) {
                    return aoluVar;
                }
            }
            this.b.s(ajcm.a, defpackage.not.a);
            return aojh.a;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        aooc.af(objA);
        this.b.s(ajcm.a, defpackage.not.a);
        return aojh.a;
    }
}
