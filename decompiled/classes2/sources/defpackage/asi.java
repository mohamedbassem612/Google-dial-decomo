package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class asi extends defpackage.ask implements defpackage.asx {
    public final aowi a;
    public aoub b;
    private final /* synthetic */ defpackage.asx h;
    private final aonj i;
    private final defpackage.ni j;

    public asi(defpackage.asx asxVar, ato atoVar, defpackage.ni niVar, aonn aonnVar, dpf dpfVar, aonj aonjVar) {
        super(atoVar, aonnVar, dpfVar);
        this.h = asxVar;
        this.j = niVar;
        this.i = aonjVar;
        this.a = aooh.H(androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY, 0, (aonj) null, 6);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object d(defpackage.asi asiVar, aoot aootVar, aoos aoosVar, aoot aootVar2, long j, aoln aolnVar) {
        defpackage.ash ashVar;
        boolean z;
        if (aolnVar instanceof defpackage.ash) {
            ashVar = (defpackage.ash) aolnVar;
            int i = ashVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ashVar.b = i - Integer.MIN_VALUE;
            } else {
                ashVar = new defpackage.ash(aolnVar);
            }
        } else {
            ashVar = new defpackage.ash(aolnVar);
        }
        java.lang.Object objN = ashVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ashVar.b;
        if (i2 == 0) {
            aooc.af(objN);
            if (j < 0) {
                return java.lang.Boolean.FALSE;
            }
            long j2 = aorh.a;
            long jB = aooh.B(j, aorj.c);
            defpackage.ahb ahbVar = new defpackage.ahb(asiVar, (aoln) null, 14);
            ashVar.c = asiVar;
            ashVar.d = aootVar;
            ashVar.e = aoosVar;
            ashVar.f = aootVar2;
            ashVar.b = 1;
            objN = aooh.N(jB, ahbVar, ashVar);
            if (objN == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aootVar2 = ashVar.f;
            aoosVar = ashVar.e;
            aootVar = ashVar.d;
            asiVar = ashVar.c;
            aooc.af(objN);
        }
        defpackage.ase aseVar = (defpackage.ase) objN;
        if (aseVar != null) {
            boolean z2 = ((defpackage.ase) aootVar.a).c;
            aootVar.a = new defpackage.ase(aseVar.a, aseVar.b);
            aoosVar.a = asiVar.b(((defpackage.ase) aootVar.a).a);
            aootVar2.a = den.br(0.0f, 0.0f);
            asiVar.e(aseVar);
            z = !h(aoosVar.a);
        } else {
            z = false;
        }
        return java.lang.Boolean.valueOf(z);
    }

    public static final defpackage.ase g(aowi aowiVar) {
        defpackage.ase aseVarA = null;
        java.util.Iterator itA = new aoka(new defpackage.asm(new defpackage.apv(aowiVar, 2), null), 3).a();
        while (itA.hasNext()) {
            defpackage.ase aseVar = (defpackage.ase) itA.next();
            aseVarA = aseVarA == null ? aseVar : aseVarA.a(aseVar);
        }
        return aseVarA;
    }

    public static final boolean h(long j) {
        return java.lang.Math.abs(java.lang.Float.intBitsToFloat((int) (j & 4294967295L))) < 0.5f;
    }

    public static final long i(long j, long j2) {
        return java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) - java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    public static final long k(long j, long j2) {
        return java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) + java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    @Override // defpackage.asx
    public final long a(long j) {
        throw null;
    }

    @Override // defpackage.asx
    public final long b(long j) {
        return this.h.b(j);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:29:0x0101  */
    /* JADX WARN: Code duplicated, block: B:31:0x0111  */
    /* JADX WARN: Code duplicated, block: B:32:0x0116  */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final java.lang.Object c(defpackage.ase aseVar, float f, float f2, aoln aolnVar) {
        defpackage.asf asfVar;
        aoos aoosVar;
        float f3;
        float f4;
        long jQ;
        aonn aonnVar;
        defpackage.dpu dpuVar;
        defpackage.asx asxVar;
        float fIntBitsToFloat;
        long jBj;
        if (aolnVar instanceof defpackage.asf) {
            asfVar = (defpackage.asf) aolnVar;
            int i = asfVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                asfVar.e = i - Integer.MIN_VALUE;
            } else {
                asfVar = new defpackage.asf(this, aolnVar);
            }
        } else {
            asfVar = new defpackage.asf(this, aolnVar);
        }
        defpackage.asf asfVar2 = asfVar;
        java.lang.Object obj = asfVar2.c;
        aolu aoluVar = aolu.a;
        int i2 = asfVar2.e;
        if (i2 == 0) {
            aooc.af(obj);
            aoot aootVar = new aoot();
            aootVar.a = aseVar;
            e(aseVar);
            defpackage.ase aseVarG = g(this.a);
            if (aseVarG != null) {
                e(aseVarG);
                aootVar.a = ((defpackage.ase) aootVar.a).a(aseVarG);
            }
            aoos aoosVar2 = new aoos();
            long jB = b(((defpackage.ase) aootVar.a).a);
            aoosVar2.a = jB;
            if (!h(jB)) {
                aoot aootVar2 = new aoot();
                aootVar2.a = den.br(0.0f, 0.0f);
                defpackage.asg asgVar = new defpackage.asg(this, aootVar2, aoosVar2, aootVar, f, f2, null);
                asfVar2.f = aoosVar2;
                asfVar2.a = f;
                asfVar2.b = f2;
                asfVar2.e = 1;
                if (m(asgVar, asfVar2) == aoluVar) {
                    return aoluVar;
                }
                aoosVar = aoosVar2;
                f3 = f;
                f4 = f2;
                jQ = this.g.q();
                if (jQ == 0) {
                    long jFloatToRawIntBits = java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (((long) java.lang.Float.floatToRawIntBits(java.lang.Math.signum(java.lang.Float.intBitsToFloat((int) (aoosVar.a & 4294967295L))))) & 4294967295L)) * java.lang.Math.min(java.lang.Math.abs(java.lang.Float.intBitsToFloat((int) (aoosVar.a & 4294967295L))) / 100.0f, f4))) & 4294967295L)) * 1000.0f);
                    asxVar = this.h;
                    fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
                    if (fIntBitsToFloat == 0.0f) {
                        jQ = 0;
                    } else {
                        if (((java.lang.Boolean) ((defpackage.asn) asxVar).a.a()).booleanValue()) {
                            jBj = mni.bj(0.0f, fIntBitsToFloat);
                        } else {
                            jBj = mni.bj(fIntBitsToFloat, 0.0f);
                        }
                        jQ = jBj;
                    }
                }
                aonnVar = this.c;
                dpuVar = new defpackage.dpu(jQ);
                asfVar2.f = null;
                asfVar2.a = f3;
                asfVar2.b = f4;
                asfVar2.e = 2;
                if (aonnVar.a(dpuVar, asfVar2) == aoluVar) {
                    return aoluVar;
                }
            }
        } else if (i2 == 1) {
            f4 = asfVar2.b;
            f3 = asfVar2.a;
            aoosVar = asfVar2.f;
            aooc.af(obj);
            jQ = this.g.q();
            if (jQ == 0) {
                long jFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (((long) java.lang.Float.floatToRawIntBits(java.lang.Math.signum(java.lang.Float.intBitsToFloat((int) (aoosVar.a & 4294967295L))))) & 4294967295L)) * java.lang.Math.min(java.lang.Math.abs(java.lang.Float.intBitsToFloat((int) (aoosVar.a & 4294967295L))) / 100.0f, f4))) & 4294967295L)) * 1000.0f);
                asxVar = this.h;
                fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L));
                if (fIntBitsToFloat == 0.0f) {
                    jQ = 0;
                } else {
                    if (((java.lang.Boolean) ((defpackage.asn) asxVar).a.a()).booleanValue()) {
                        jBj = mni.bj(0.0f, fIntBitsToFloat);
                    } else {
                        jBj = mni.bj(fIntBitsToFloat, 0.0f);
                    }
                    jQ = jBj;
                }
            }
            aonnVar = this.c;
            dpuVar = new defpackage.dpu(jQ);
            asfVar2.f = null;
            asfVar2.a = f3;
            asfVar2.b = f4;
            asfVar2.e = 2;
            if (aonnVar.a(dpuVar, asfVar2) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        return aojh.a;
    }

    public final void e(defpackage.ase aseVar) {
        this.g.r(aseVar.b, aseVar.a);
    }

    @Override // defpackage.ask
    protected final boolean f(cvf cvfVar) {
        return cvfVar.e == 6;
    }

    @Override // defpackage.ask
    protected final boolean j(cvf cvfVar) {
        long jA = this.j.a(cvfVar);
        if (!((java.lang.Boolean) this.i.a(new defpackage.asw(b(jA)))).booleanValue()) {
            return this.e;
        }
        aowi aowiVar = this.a;
        java.util.List list = cvfVar.a;
        if (list.isEmpty()) {
            throw new java.util.NoSuchElementException("List is empty.");
        }
        return !(aowiVar.b(new defpackage.ase(jA, ((defpackage.cvm) list.get(0)).b)) instanceof aowl);
    }

    public final long l(apnt apntVar, long j) {
        return b(apntVar.w(this.h.a(j)));
    }
}
