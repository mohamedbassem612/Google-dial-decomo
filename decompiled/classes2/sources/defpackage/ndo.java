package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ndo implements aoxi {
    final /* synthetic */ defpackage.nej a;

    public ndo(defpackage.nej nejVar) {
        this.a = nejVar;
    }

    /* JADX WARN: Code duplicated, block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final java.lang.Object a(defpackage.nke nkeVar, aoln aolnVar) {
        defpackage.ndn ndnVar;
        defpackage.nej nejVar;
        defpackage.nej nejVar2;
        if (aolnVar instanceof defpackage.ndn) {
            ndnVar = (defpackage.ndn) aolnVar;
            int i = ndnVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ndnVar.c = i - Integer.MIN_VALUE;
            } else {
                ndnVar = new defpackage.ndn(this, aolnVar);
            }
        } else {
            ndnVar = new defpackage.ndn(this, aolnVar);
        }
        java.lang.Object obj = ndnVar.a;
        aolu aoluVar = aolu.a;
        switch (ndnVar.c) {
            case 0:
                aooc.af(obj);
                j$.util.Objects.checkIndex(0, 6);
                if (nkeVar != null) {
                    if (nkeVar instanceof defpackage.nka) {
                        defpackage.nej nejVar3 = this.a;
                        ndnVar.c = 1;
                        if (nejVar3.g(ndnVar) == aoluVar) {
                            return aoluVar;
                        }
                    } else if (nkeVar instanceof defpackage.nkb) {
                        defpackage.nej nejVar4 = this.a;
                        defpackage.nvp nvpVar = defpackage.nvp.EVENT_DOBBY_OPENING_DISCLOSURE_FAILED;
                        ndnVar.c = 2;
                        if (nejVar4.j.x(nvpVar, ndnVar) == aoluVar) {
                            return aoluVar;
                        }
                        nejVar = this.a;
                        ndnVar.c = 3;
                        if (nejVar.g(ndnVar) == aoluVar) {
                            return aoluVar;
                        }
                    } else if (nkeVar instanceof defpackage.njx) {
                        defpackage.nej nejVar5 = this.a;
                        defpackage.njt njtVar = ((defpackage.njx) nkeVar).a;
                        ndnVar.c = 4;
                        if (nejVar5.P(njtVar, ndnVar) == aoluVar) {
                            return aoluVar;
                        }
                        nejVar2 = this.a;
                        ndnVar.c = 5;
                        if (nejVar2.G(null, ndnVar) == aoluVar) {
                            return aoluVar;
                        }
                    } else if (nkeVar instanceof defpackage.njv) {
                        defpackage.nej nejVar6 = this.a;
                        ndnVar.c = 6;
                        if (nejVar6.a(ndnVar) == aoluVar) {
                            return aoluVar;
                        }
                    } else if (nkeVar instanceof defpackage.njz) {
                        defpackage.nej nejVar7 = this.a;
                        nejVar7.L = ((defpackage.njz) nkeVar).a;
                        nejVar7.V();
                    }
                }
                return aojh.a;
            case 1:
            case 3:
            case 5:
            case 6:
                aooc.af(obj);
                return aojh.a;
            case 2:
                aooc.af(obj);
                nejVar = this.a;
                ndnVar.c = 3;
                if (nejVar.g(ndnVar) == aoluVar) {
                    return aoluVar;
                }
                return aojh.a;
            case 4:
                aooc.af(obj);
                nejVar2 = this.a;
                ndnVar.c = 5;
                if (nejVar2.G(null, ndnVar) == aoluVar) {
                    return aoluVar;
                }
                return aojh.a;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
