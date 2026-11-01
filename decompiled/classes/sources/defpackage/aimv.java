package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class aimv extends defpackage.aine implements defpackage.ainm {
    protected aimv(java.util.logging.Level level) {
        super(level);
    }

    @Override // defpackage.aine
    protected final defpackage.aira a() {
        return defpackage.aiqy.a;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0074  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10, types: [ainu] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6, types: [ainu] */
    /* JADX WARN: Type inference failed for: r15v9, types: [ainx] */
    @Override // defpackage.aine
    protected final boolean b(defpackage.aini ainiVar) {
        int iA;
        int i;
        defpackage.ainu ainuVar;
        defpackage.aimr aimrVar;
        defpackage.ainu ainuVar2;
        ?? r15;
        defpackage.aior aiorVarN = n();
        int iB = aiorVarN.b();
        for (int i2 = 0; i2 < iB; i2++) {
            if (aiorVarN.c(i2).a == "eye3tag") {
                if (aiorVarN.d(defpackage.ainc.a) != null) {
                    break;
                }
                defpackage.ainp ainpVar = defpackage.ainc.i;
                if (aiorVarN.d(ainpVar) != null) {
                    break;
                }
                s(ainpVar, defpackage.aioa.SMALL);
                break;
            }
        }
        defpackage.aind aindVar = this.c;
        if (aindVar != null) {
            if (ainiVar != null) {
                long j = this.b;
                defpackage.ainj ainjVar = defpackage.aimu.a;
                defpackage.aimt aimtVar = (defpackage.aimt) aindVar.d(defpackage.ainc.d);
                if (aimtVar == null) {
                    ainuVar = null;
                } else {
                    defpackage.aimu aimuVar = (defpackage.aimu) defpackage.aimu.a.b(ainiVar, aindVar);
                    if (j < 0) {
                        throw new java.lang.IllegalArgumentException("timestamp cannot be negative");
                    }
                    java.util.concurrent.atomic.AtomicLong atomicLong = aimuVar.b;
                    long j2 = atomicLong.get();
                    if (j2 >= 0) {
                        long nanos = aimtVar.b.toNanos(aimtVar.a) + j2;
                        if (nanos < 0 || j < nanos) {
                            ainuVar = defpackage.aimu.c;
                        } else {
                            atomicLong.compareAndSet(j2, -j);
                            ainuVar = aimuVar;
                        }
                    } else {
                        atomicLong.compareAndSet(j2, -j);
                        ainuVar = aimuVar;
                    }
                }
                defpackage.aind aindVar2 = this.c;
                defpackage.ainj ainjVar2 = defpackage.aimr.a;
                java.lang.Integer num = (java.lang.Integer) aindVar2.d(defpackage.ainc.b);
                if (num == null) {
                    ainuVar2 = null;
                } else {
                    aimrVar = (defpackage.aimr) defpackage.aimr.a.b(ainiVar, aindVar2);
                    if (aimrVar.b.incrementAndGet() < num.intValue()) {
                        ainuVar2 = aimrVar;
                        ainuVar2 = defpackage.aimr.c;
                    }
                }
                ainuVar2 = aimrVar;
                defpackage.ainu ainuVarB = defpackage.ainu.b(ainuVar, ainuVar2);
                defpackage.aind aindVar3 = this.c;
                defpackage.ainj ainjVar3 = defpackage.ainx.a;
                java.lang.Integer num2 = (java.lang.Integer) aindVar3.d(defpackage.ainc.c);
                if (num2 == null || num2.intValue() <= 0) {
                    r15 = 0;
                } else {
                    r15 = (defpackage.ainx) defpackage.ainx.a.b(ainiVar, aindVar3);
                    if ((((java.util.Random) defpackage.ainx.b.get()).nextInt(num2.intValue()) == 0 ? r15.e.incrementAndGet() : r15.e.get()) <= 0) {
                        r15 = defpackage.ainx.c;
                    }
                }
                defpackage.ainu ainuVarB2 = defpackage.ainu.b(ainuVarB, r15);
                this.d = ainuVarB2;
                if (ainuVarB2 == defpackage.ainu.c) {
                    return false;
                }
            }
            defpackage.aind aindVar4 = this.c;
            defpackage.ainp ainpVar2 = defpackage.ainc.i;
            defpackage.aioa aioaVar = (defpackage.aioa) aindVar4.d(ainpVar2);
            if (aioaVar != null) {
                defpackage.aind aindVar5 = this.c;
                if (aindVar5 != null && (iA = aindVar5.a(ainpVar2)) >= 0) {
                    int i3 = iA << 1;
                    int i4 = i3 + 2;
                    while (true) {
                        i = aindVar5.b;
                        if (i4 >= (i << 1)) {
                            break;
                        }
                        java.lang.Object obj = aindVar5.a[i4];
                        if (!obj.equals(ainpVar2)) {
                            java.lang.Object[] objArr = aindVar5.a;
                            objArr[i3] = obj;
                            objArr[i3 + 1] = objArr[i4 + 1];
                            i3 += 2;
                        }
                        i4 += 2;
                    }
                    aindVar5.b = i - ((i4 - i3) >> 1);
                    while (i3 < i4) {
                        aindVar5.a[i3] = null;
                        i3++;
                    }
                }
                defpackage.aior aiorVarN2 = n();
                defpackage.ainp ainpVar3 = defpackage.ainc.a;
                s(ainpVar3, new defpackage.aink((java.lang.Throwable) aiorVarN2.d(ainpVar3), aioaVar, defpackage.aird.b(defpackage.aine.class, aioaVar.f, 1)));
            }
        }
        return true;
    }
}
