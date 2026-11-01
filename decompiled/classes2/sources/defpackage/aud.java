package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aud extends defpackage.ask implements defpackage.asx {
    public final aowi a;
    public aoub b;
    private final /* synthetic */ defpackage.asx h;
    private final aonj i;

    public aud(defpackage.asx asxVar, ato atoVar, aonn aonnVar, dpf dpfVar, aonj aonjVar) {
        super(atoVar, aonnVar, dpfVar);
        this.h = asxVar;
        this.i = aonjVar;
        this.a = aooh.H(androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY, 0, (aonj) null, 6);
    }

    public static final defpackage.atz e(aowi aowiVar) {
        defpackage.atz atzVarA = null;
        java.util.Iterator itA = new aoka(new defpackage.asm(new defpackage.apv(aowiVar, 4), null), 3).a();
        while (itA.hasNext()) {
            defpackage.atz atzVar = (defpackage.atz) itA.next();
            atzVarA = atzVarA == null ? atzVar : atzVarA.a(atzVar);
        }
        return atzVarA;
    }

    private static final boolean h(long j) {
        return java.lang.Float.intBitsToFloat((int) (j >> 32)) == 0.0f && java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) == 0.0f;
    }

    @Override // defpackage.asx
    public final long a(long j) {
        throw null;
    }

    @Override // defpackage.asx
    public final long b(long j) {
        return this.h.b(j);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(defpackage.atz atzVar, aoln aolnVar) {
        defpackage.aua auaVar;
        if (aolnVar instanceof defpackage.aua) {
            auaVar = (defpackage.aua) aolnVar;
            int i = auaVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                auaVar.c = i - Integer.MIN_VALUE;
            } else {
                auaVar = new defpackage.aua(this, aolnVar);
            }
        } else {
            auaVar = new defpackage.aua(this, aolnVar);
        }
        java.lang.Object obj = auaVar.a;
        aolu aoluVar = aolu.a;
        int i2 = auaVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(obj);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(obj);
            }
            return aojh.a;
        }
        aooc.af(obj);
        aoot aootVar = new aoot();
        aootVar.a = atzVar;
        d(atzVar);
        defpackage.atz atzVarE = e(this.a);
        if (atzVarE != null) {
            d(atzVarE);
            aootVar.a = ((defpackage.atz) aootVar.a).a(atzVarE);
        }
        defpackage.aub aubVar = new defpackage.aub(this, aootVar, (aoln) null, 0);
        auaVar.c = 1;
        if (m(aubVar, auaVar) == aoluVar) {
            return aoluVar;
        }
        aonn aonnVar = this.c;
        defpackage.dpu dpuVar = new defpackage.dpu(this.g.q());
        auaVar.c = 2;
        if (aonnVar.a(dpuVar, auaVar) == aoluVar) {
            return aoluVar;
        }
        return aojh.a;
    }

    public final void d(defpackage.atz atzVar) {
        this.g.r(atzVar.b, atzVar.a);
    }

    @Override // defpackage.ask
    protected final boolean f(cvf cvfVar) {
        int i = cvfVar.e;
        return i == 10 || i == 11 || i == 12;
    }

    public final void g(apnt apntVar, long j) {
        b(apntVar.v(this.h.a(j), 1));
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0057  */
    /* JADX WARN: Code duplicated, block: B:22:0x0077  */
    /* JADX WARN: Code duplicated, block: B:26:0x0090  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00bb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:56:0x0095 A[SYNTHETIC] */
    @Override // defpackage.ask
    protected final boolean j(cvf cvfVar) {
        java.util.List listA;
        int size;
        int i;
        long j;
        boolean z;
        boolean z2;
        boolean z3;
        defpackage.cuy cuyVar;
        long j2;
        boolean z4;
        aoop aoopVar = new aoop();
        java.util.List list = cvfVar.a;
        defpackage.cvm cvmVar = (defpackage.cvm) (list.isEmpty() ? null : list.get(0));
        if (cvmVar != null) {
            if (cvfVar.e == 10 && h(cvmVar.l)) {
                java.util.List listA2 = cvmVar.a();
                int size2 = listA2.size();
                int i2 = 0;
                while (true) {
                    if (i2 < size2) {
                        if (h(((defpackage.cuy) listA2.get(i2)).d)) {
                            i2++;
                        } else {
                            listA = cvmVar.a();
                            size = listA.size();
                            for (i = 0; i < size; i++) {
                                cuyVar = (defpackage.cuy) listA.get(i);
                                j2 = cuyVar.d ^ (-9223372034707292160L);
                                if (!((java.lang.Boolean) this.i.a(new defpackage.asw(b(j2)))).booleanValue()) {
                                    if (this.a.b(new defpackage.atz(j2, cuyVar.a, false)) instanceof aowl) {
                                        z4 = true;
                                    } else {
                                        z4 = true;
                                    }
                                    aoopVar.a = z4;
                                }
                            }
                            j = cvmVar.l ^ (-9223372034707292160L);
                            if (cvfVar.e == 12) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!((java.lang.Boolean) this.i.a(new defpackage.asw(b(j)))).booleanValue()) {
                                z2 = z;
                            } else if (z) {
                                z2 = true;
                            }
                            if (this.a.b(new defpackage.atz(j, cvmVar.b, z2)) instanceof aowl) {
                                z3 = true;
                            } else {
                                z3 = true;
                            }
                            aoopVar.a = z3;
                        }
                    }
                }
            } else {
                listA = cvmVar.a();
                size = listA.size();
                while (i < size) {
                    cuyVar = (defpackage.cuy) listA.get(i);
                    j2 = cuyVar.d ^ (-9223372034707292160L);
                    if (!((java.lang.Boolean) this.i.a(new defpackage.asw(b(j2)))).booleanValue()) {
                        if ((this.a.b(new defpackage.atz(j2, cuyVar.a, false)) instanceof aowl) || aoopVar.a) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        aoopVar.a = z4;
                    }
                }
                j = cvmVar.l ^ (-9223372034707292160L);
                if (cvfVar.e == 12) {
                    z = true;
                } else {
                    z = false;
                }
                if (!((java.lang.Boolean) this.i.a(new defpackage.asw(b(j)))).booleanValue()) {
                    z2 = z;
                } else if (z) {
                    z2 = true;
                }
                if ((this.a.b(new defpackage.atz(j, cvmVar.b, z2)) instanceof aowl) || aoopVar.a) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                aoopVar.a = z3;
            }
        }
        return aoopVar.a || this.e;
    }
}
