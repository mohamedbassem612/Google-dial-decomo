package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final /* synthetic */ class aowa extends defpackage.aoof implements defpackage.aono {
    public static final defpackage.aowa a = new defpackage.aowa();

    public aowa() {
        super(3, defpackage.aowe.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // defpackage.aono
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        defpackage.aown aownVar;
        defpackage.aowe aoweVar = (defpackage.aowe) obj;
        defpackage.apdm apdmVar = (defpackage.apdm) obj2;
        defpackage.aown aownVar2 = (defpackage.aown) aoweVar.e.a;
        while (!aoweVar.y()) {
            long jB = aoweVar.c.b();
            long j = defpackage.aowg.b;
            long j2 = jB / j;
            int i = (int) (jB % j);
            if (aownVar2.b != j2) {
                defpackage.aown aownVarR = aoweVar.r(j2, aownVar2);
                if (aownVarR != null) {
                    aownVar = aownVarR;
                } else {
                    continue;
                }
            } else {
                aownVar = aownVar2;
            }
            java.lang.Object objN = aoweVar.n(aownVar, i, jB, apdmVar);
            defpackage.aown aownVar3 = aownVar;
            if (objN == defpackage.aowg.m) {
                if (true != (apdmVar instanceof defpackage.aovq)) {
                    apdmVar = null;
                }
                if (apdmVar != null) {
                    apdmVar.c = aownVar3;
                    apdmVar.d = i;
                }
            } else if (objN == defpackage.aowg.o) {
                if (jB < aoweVar.h()) {
                    aownVar3.o();
                }
                aownVar2 = aownVar3;
            } else {
                if (objN == defpackage.aowg.n) {
                    throw new java.lang.IllegalStateException("unexpected");
                }
                aownVar3.o();
                apdmVar.e = objN;
            }
            return defpackage.aojh.a;
        }
        apdmVar.e = defpackage.aowg.l;
        return defpackage.aojh.a;
    }
}
