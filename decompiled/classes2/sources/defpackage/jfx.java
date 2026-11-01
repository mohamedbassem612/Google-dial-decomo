package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jfx implements defpackage.igz {
    private final defpackage.jif a;
    private boolean b;
    private final qbe c;
    private final apdp d;

    public jfx(defpackage.jif jifVar, qbe qbeVar) {
        aooh.f(jifVar, "beeslyCallEventClearcutLogger");
        aooh.f(qbeVar, "inCallLogging");
        this.a = jifVar;
        this.c = qbeVar;
        this.d = new apdp();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.igz
    public final java.lang.Object a(defpackage.ihc ihcVar, aoln aolnVar) throws java.lang.Throwable {
        defpackage.jfw jfwVar;
        apdp apdpVar;
        apdp apdpVar2;
        java.lang.Object next;
        if (aolnVar instanceof defpackage.jfw) {
            jfwVar = (defpackage.jfw) aolnVar;
            int i = jfwVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                jfwVar.d = i - Integer.MIN_VALUE;
            } else {
                jfwVar = new defpackage.jfw(this, aolnVar);
            }
        } else {
            jfwVar = new defpackage.jfw(this, aolnVar);
        }
        java.lang.Object obj = jfwVar.b;
        aojh aojhVar = aolu.a;
        int i2 = jfwVar.d;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdpVar = this.d;
                jfwVar.a = ihcVar;
                jfwVar.e = apdpVar;
                jfwVar.d = 1;
                if (apdpVar.b(jfwVar) != aojhVar) {
                }
                return aojhVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                apdpVar2 = (apdp) jfwVar.a;
                try {
                    aooc.af(obj);
                    this.c.a(qbc.nX);
                    aojhVar = aojh.a;
                    apdpVar2.d();
                    return aojhVar;
                } catch (java.lang.Throwable th) {
                    th = th;
                    apdpVar2.d();
                    throw th;
                }
            }
            apdp apdpVar3 = jfwVar.e;
            defpackage.ihc ihcVar2 = (defpackage.ihc) jfwVar.a;
            aooc.af(obj);
            apdpVar = apdpVar3;
            ihcVar = ihcVar2;
            if (!this.b) {
                alat alatVar = ihcVar.b;
                aooh.e(alatVar, "getHypothesesList(...)");
                java.util.Iterator it = alatVar.iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        double d = ((defpackage.iha) next).c;
                        do {
                            java.lang.Object next2 = it.next();
                            double d2 = ((defpackage.iha) next2).c;
                            if (java.lang.Double.compare(d, d2) < 0) {
                                next = next2;
                                d = d2;
                            }
                        } while (it.hasNext());
                    }
                } else {
                    next = null;
                }
                defpackage.iha ihaVar = (defpackage.iha) next;
                if (ihaVar != null) {
                    defpackage.ihb ihbVarB = defpackage.ihb.b(ihaVar.b);
                    if (ihbVarB == null) {
                        ihbVarB = defpackage.ihb.UNRECOGNIZED;
                    }
                    if (ihbVarB == defpackage.ihb.SPEECH && ihaVar.c > 0.5d) {
                        this.b = true;
                        defpackage.jif jifVar = this.a;
                        jfwVar.a = apdpVar;
                        jfwVar.e = null;
                        jfwVar.d = 2;
                        java.lang.Object objA = ahvr.ag(jifVar.a, jifVar.h, new defpackage.icr(jifVar, (aoln) null, 18, (byte[]) null)).a(jfwVar);
                        if (objA != aojhVar) {
                            objA = aojh.a;
                        }
                        if (objA != aojhVar) {
                            apdpVar2 = apdpVar;
                            this.c.a(qbc.nX);
                            aojhVar = aojh.a;
                            apdpVar2.d();
                        }
                    }
                    return aojhVar;
                }
            }
            apdpVar2 = apdpVar;
            aojhVar = aojh.a;
            apdpVar2.d();
            return aojhVar;
        } catch (java.lang.Throwable th2) {
            th = th2;
            apdpVar2 = apdpVar;
            apdpVar2.d();
            throw th;
        }
    }
}
