package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aiut {
    public static final defpackage.aiut a = new defpackage.aiut();

    /* JADX WARN: Code duplicated, block: B:37:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [aonn] */
    /* JADX WARN: Type inference failed for: r9v9 */
    public final java.lang.Object a(final aiue aiueVar, aonj aonjVar, final ahzp ahzpVar, aonn aonnVar, aoln aolnVar) throws java.lang.Exception {
        defpackage.aius aiusVar;
        aiue it;
        java.lang.Object obj;
        java.lang.Object obj2;
        aonj<java.lang.Exception> aonjVar2;
        java.lang.Exception exc;
        aonj aonjVar3;
        ?? r9;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        if (aolnVar instanceof defpackage.aius) {
            aiusVar = (defpackage.aius) aolnVar;
            int i = aiusVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                aiusVar.e = i - Integer.MIN_VALUE;
            } else {
                aiusVar = new defpackage.aius(this, aolnVar);
            }
        } else {
            aiusVar = new defpackage.aius(this, aolnVar);
        }
        java.lang.Object obj6 = aiusVar.c;
        aolu aoluVar = aolu.a;
        int i2 = aiusVar.e;
        try {
            if (i2 == 0) {
                aooc.af(obj6);
                aonj arrayList = new java.util.ArrayList();
                ahvr.ci(ahzpVar);
                final int i3 = 0;
                aonjVar3 = arrayList;
                it = new java.lang.Iterable() { // from class: aity
                    @Override // java.lang.Iterable
                    public final java.util.Iterator iterator() {
                        if (i3 == 0) {
                            return new defpackage.aitz((aiue) aiueVar, (ahzp) ahzpVar);
                        }
                        defpackage.airh airhVar = new defpackage.airh();
                        ailj ailjVarK = ((aihd) ahzpVar).k();
                        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
                        java.util.ArrayDeque arrayDeque2 = new java.util.ArrayDeque();
                        arrayDeque2.add(ailjVarK);
                        return new defpackage.airj(airhVar, arrayDeque2, arrayDeque);
                    }
                }.iterator();
                obj = aonjVar;
                obj2 = aonnVar;
                aonjVar2 = aonjVar3;
                if (it.hasNext()) {
                    java.lang.Object next = it.next();
                    aooh.e(next, "next(...)");
                    aiusVar.f = (uph) obj;
                    aiusVar.g = (ytl) obj2;
                    aiusVar.a = aonjVar3;
                    aiusVar.b = it;
                    aiusVar.e = 1;
                    if (defpackage.ajee.c((j$.time.Duration) next, aiusVar) != aoluVar) {
                        r9 = obj2;
                        obj3 = obj;
                        obj4 = aonjVar3;
                        obj5 = it;
                    }
                    return aoluVar;
                }
                exc = (java.lang.Exception) ajsz.bq(aonjVar2);
                for (java.lang.Exception exc2 : aonjVar2) {
                    if (exc2 != exc) {
                        aoil.b(exc, exc2);
                    }
                }
                throw exc;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                java.lang.Object obj7 = aiusVar.b;
                java.lang.Object obj8 = aiusVar.a;
                ytl ytlVar = aiusVar.g;
                uph uphVar = aiusVar.f;
                aooc.af(obj6);
                return obj6;
            }
            java.lang.Object obj9 = aiusVar.b;
            java.lang.Object obj10 = aiusVar.a;
            ytl ytlVar2 = aiusVar.g;
            uph uphVar2 = aiusVar.f;
            aooc.af(obj6);
            obj5 = obj9;
            obj4 = obj10;
            r9 = ytlVar2;
            obj3 = uphVar2;
        } catch (java.lang.Exception e) {
            aonj aonjVar4 = aonjVar;
            aooc.Y(aiusVar.u());
            aonjVar4.add(e);
            boolean zBooleanValue = ((java.lang.Boolean) aonnVar.a(e)).booleanValue();
            aonjVar2 = aonjVar4;
            if (zBooleanValue) {
                it = aiueVar;
                obj = aonnVar;
                obj2 = ahzpVar;
                aonjVar3 = aonjVar4;
            }
            exc = (java.lang.Exception) ajsz.bq(aonjVar2);
            while (r6.hasNext()) {
                if (exc2 != exc) {
                    aoil.b(exc, exc2);
                }
            }
            throw exc;
        }
        aiusVar.f = (uph) obj3;
        aiusVar.g = (ytl) r9;
        aiusVar.a = obj4;
        aiusVar.b = obj5;
        aiusVar.e = 2;
        java.lang.Object objM = aosv.m((aonn) r9, aiusVar);
        if (objM != aoluVar) {
            return objM;
        }
        return aoluVar;
    }
}
