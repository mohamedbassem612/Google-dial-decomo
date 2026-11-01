package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class aot implements aonn {
    public final /* synthetic */ aou a;
    public final /* synthetic */ cpn b;
    public final /* synthetic */ cqu c;
    public final /* synthetic */ cqd d;
    public final /* synthetic */ aooq e;
    public final /* synthetic */ aoot f;
    public final /* synthetic */ long g;
    public final /* synthetic */ int h;
    public final /* synthetic */ cqh i;
    public final /* synthetic */ cpx j;

    public /* synthetic */ aot(aou aouVar, cpn cpnVar, cqu cquVar, cqd cqdVar, aooq aooqVar, aoot aootVar, long j, int i, cpx cpxVar, cqh cqhVar) {
        this.a = aouVar;
        this.b = cpnVar;
        this.c = cquVar;
        this.d = cqdVar;
        this.e = aooqVar;
        this.f = aootVar;
        this.g = j;
        this.h = i;
        this.j = cpxVar;
        this.i = cqhVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00bb  */
    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) throws java.lang.Throwable {
        long j;
        boolean z;
        cpu cpuVar;
        csj csjVar;
        csj csjVar2 = (csj) obj;
        float fFloatValue = ((java.lang.Float) obj2).floatValue();
        cqh cqhVar = this.i;
        cpx cpxVar = this.j;
        cpn cpnVar = this.b;
        if (!cpnVar.i()) {
            cqd cqdVar = this.d;
            cqu cquVar = this.c;
            float fQ = aooc.q(java.lang.Math.min((float) java.lang.Math.ceil(aooc.q(fFloatValue, 0.0f)), (float) java.lang.Math.ceil(cpnVar.a() / 2.0f)), 0.0f);
            float f = fQ + fQ;
            if (f > cpnVar.a()) {
                den.T(csjVar2, cquVar.a, cqdVar, 0.0f, (den) null, 60);
            } else {
                long j2 = this.g;
                aoot aootVar = this.f;
                aooq aooqVar = this.e;
                if (aooqVar.a != fQ || aootVar.a == null) {
                    aou aouVar = this.a;
                    j = j2;
                    long j3 = j & 4294967295L;
                    long j4 = j >> 32;
                    cpu cpuVar2 = aouVar.g;
                    cqf cqfVarB = aouVar.a;
                    defpackage.cqo cqoVar = cpuVar2 != null ? new defpackage.cqo(cpuVar2.a()) : null;
                    int i = this.h;
                    if (cqoVar == null || !a.x(cqoVar.a, 0)) {
                        if (defpackage.cqo.a(i, cpuVar2 != 0 ? new defpackage.cqo(cpuVar2.a()) : null)) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = true;
                    }
                    int i2 = (int) j4;
                    int i3 = (int) j3;
                    if (cpuVar2 == 0 || cqfVarB == null || i2 > cpuVar2.c() || i3 > cpuVar2.b() || !z) {
                        cpu cpuVarB = cqp.b(i2, i3, i);
                        aouVar.g = cpuVarB;
                        cqfVarB = cpr.b(cpuVarB);
                        aouVar.a = cqfVarB;
                        cpuVar = cpuVarB;
                    } else {
                        cpuVar = cpuVar2;
                    }
                    cqf cqfVar = cqfVarB;
                    csh cshVar = aouVar.b;
                    if (cshVar == null) {
                        cshVar = new csh();
                        aouVar.b = cshVar;
                    }
                    csh cshVar2 = cshVar;
                    long jL = dpy.l(j);
                    dpq dpqVarP = csjVar2.p();
                    csf csfVar = cshVar2.a;
                    dpf dpfVar = csfVar.a;
                    dpq dpqVar = csfVar.b;
                    cqf cqfVar2 = csfVar.c;
                    long j5 = csfVar.d;
                    csfVar.a = csjVar2;
                    csfVar.b = dpqVarP;
                    csfVar.c = cqfVar;
                    csfVar.d = jL;
                    cqfVar.g();
                    den.J(cshVar2, -72057594037927936L, jL, 0.0f, (cqh) null, 58);
                    float f2 = cpnVar.b;
                    float f3 = cpnVar.c;
                    csg csgVar = cshVar2.b;
                    apnt apntVar = csgVar.c;
                    float f4 = -f2;
                    float f5 = -f3;
                    apntVar.r(f4, f5);
                    float f6 = -f5;
                    float f7 = -f4;
                    try {
                        try {
                            den.T(cshVar2, cquVar.a, cqdVar, 0.0f, new csm(f, 0.0f, 0, 0, 30), 52);
                            try {
                                float fIntBitsToFloat = (java.lang.Float.intBitsToFloat((int) (den.I(cshVar2) >> 32)) + 1.0f) / java.lang.Float.intBitsToFloat((int) (den.I(cshVar2) >> 32));
                                float fIntBitsToFloat2 = (java.lang.Float.intBitsToFloat((int) (den.I(cshVar2) & 4294967295L)) + 1.0f) / java.lang.Float.intBitsToFloat((int) (den.I(cshVar2) & 4294967295L));
                                long jQ = cdh.q(csgVar.a());
                                long jA = csgVar.a();
                                csgVar.b().g();
                                try {
                                    apntVar.q(fIntBitsToFloat, fIntBitsToFloat2, jQ);
                                    try {
                                        den.T(cshVar2, cpxVar, cqdVar, 0.0f, (den) null, 28);
                                        csgVar.b().e();
                                        csgVar.h(jA);
                                        cshVar2.b.c.r(f7, f6);
                                        cqfVar.e();
                                        csf csfVar2 = cshVar2.a;
                                        csfVar2.a = dpfVar;
                                        csfVar2.b = dpqVar;
                                        csfVar2.c = cqfVar2;
                                        csfVar2.d = j5;
                                        cpuVar.d();
                                        aootVar.a = cpuVar;
                                        aooqVar.a = fQ;
                                    } catch (java.lang.Throwable th) {
                                        th = th;
                                        csgVar = csgVar;
                                        csgVar.b().e();
                                        csgVar.h(jA);
                                        throw th;
                                    }
                                } catch (java.lang.Throwable th2) {
                                    th = th2;
                                }
                            } catch (java.lang.Throwable th3) {
                                th = th3;
                                cshVar2 = cshVar2;
                                cshVar2.b.c.r(f7, f6);
                                throw th;
                            }
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            cshVar2 = cshVar2;
                        }
                    } catch (java.lang.Throwable th5) {
                        th = th5;
                    }
                } else {
                    j = j2;
                }
                float f8 = cpnVar.b;
                float f9 = cpnVar.c;
                csjVar2.q().c.r(f8, f9);
                float f10 = -f9;
                float f11 = -f8;
                try {
                    csjVar = csjVar2;
                    try {
                        den.L(csjVar, (cpu) aootVar.a, j, 0L, 0.0f, cqhVar, 0, 890);
                        csjVar.q().c.r(f11, f10);
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        csjVar.q().c.r(f11, f10);
                        throw th;
                    }
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    csjVar = csjVar2;
                }
            }
        }
        return aojh.a;
    }
}
