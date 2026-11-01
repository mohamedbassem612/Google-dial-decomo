package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tlt implements jqh {
    private final defpackage.tlw a;

    public tlt(defpackage.tlw tlwVar) {
        aooh.f(tlwVar, "sharpieScoobyClearcutLogger");
        this.a = tlwVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aixo aixoVar, aoln aolnVar) {
        defpackage.tls tlsVar;
        defpackage.uzx uzxVarY;
        defpackage.uzx uzxVar;
        if (aolnVar instanceof defpackage.tls) {
            tlsVar = (defpackage.tls) aolnVar;
            int i = tlsVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tlsVar.c = i - Integer.MIN_VALUE;
            } else {
                tlsVar = new defpackage.tls(this, aolnVar);
            }
        } else {
            tlsVar = new defpackage.tls(this, aolnVar);
        }
        java.lang.Object objA = tlsVar.a;
        aolu aoluVar = aolu.a;
        int i2 = tlsVar.c;
        if (i2 == 0) {
            aooc.af(objA);
            uzxVarY = airh.y(aixoVar.p());
            defpackage.tlw tlwVar = this.a;
            tlsVar.d = uzxVarY;
            tlsVar.e = uzxVarY;
            tlsVar.c = 1;
            objA = ahvr.ag(tlwVar.a, tlwVar.i, new defpackage.tlu(tlwVar, null)).a(tlsVar);
            if (objA == aoluVar) {
                return aoluVar;
            }
            uzxVar = uzxVarY;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uzxVar = tlsVar.e;
            uzxVarY = tlsVar.d;
            aooc.af(objA);
        }
        aiym aiymVar = (aiym) objA;
        aooh.f(aiymVar, "value");
        akzx akzxVar = (akzx) uzxVar.a;
        akzxVar.u();
        aixo aixoVar2 = akzxVar.b;
        aixo aixoVar3 = aixo.a;
        j$.util.Objects.requireNonNull(aiymVar);
        aixoVar2.G = aiymVar;
        aixoVar2.c |= 16;
        return uzxVarY.ah();
    }
}
