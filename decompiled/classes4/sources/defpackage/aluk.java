package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aluk {
    public defpackage.alwn d;
    public boolean e;
    public boolean f;
    public j$.time.Duration g;
    public boolean o;
    public defpackage.aluc r;
    public defpackage.alud s;
    public defpackage.alug t;
    public java.util.Map u;
    public defpackage.alvy v;
    public int y;
    private final aizr z;
    public final java.util.concurrent.atomic.AtomicInteger a = new java.util.concurrent.atomic.AtomicInteger(10000);
    public j$.util.Optional b = j$.util.Optional.empty();
    public final java.util.concurrent.locks.ReentrantLock c = new java.util.concurrent.locks.ReentrantLock();
    public java.util.List h = new java.util.ArrayList();
    public aify i = aike.a;
    public j$.util.Optional j = j$.util.Optional.empty();
    public int w = 4;
    public int x = 4;
    public boolean k = false;
    public boolean l = true;
    public double m = 0.5d;
    public j$.util.Optional n = j$.util.Optional.empty();
    public java.util.ArrayList p = new java.util.ArrayList();
    public java.lang.String q = "";

    public aluk(aizr aizrVar) {
        this.z = aizrVar;
    }

    private static aify l(java.util.List list, j$.util.Optional optional) {
        int size = list.size();
        aift aiftVar = new aift(4);
        aiftVar.k(list);
        pqj pqjVar = new pqj(aiftVar, size, 6);
        if (true == optional.isPresent()) {
            java.lang.Object obj = optional.get();
            java.lang.Object obj2 = pqjVar.b;
            int i = pqjVar.a;
            akzx akzxVarP = ((defpackage.alww) obj).p();
            akzxVarP.u();
            defpackage.alww alwwVar = (defpackage.alww) akzxVarP.b;
            alwwVar.b |= 1;
            alwwVar.e = i;
            ((aift) obj2).i((defpackage.alww) akzxVarP.p());
        }
        return aiftVar.h();
    }

    public final int a(defpackage.alww alwwVar) {
        this.c.lock();
        try {
            java.util.List list = this.h;
            akzx akzxVarP = alwwVar.p();
            long size = this.h.size();
            akzxVarP.u();
            defpackage.alww alwwVar2 = (defpackage.alww) akzxVarP.b;
            alwwVar2.b |= 1;
            alwwVar2.e = size;
            list.add((defpackage.alww) akzxVarP.p());
            int size2 = this.h.size() - 1;
            return size2;
        } finally {
            this.c.unlock();
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a3  */
    public final defpackage.alsi b(boolean z) {
        int i;
        boolean z2;
        akzx akzxVarM = defpackage.alwy.a.m();
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            aify aifyVarL = l(this.h, this.j);
            aift aiftVar = new aift(4);
            j$.util.Optional optionalEmpty = j$.util.Optional.empty();
            boolean z3 = false;
            ailk ailkVarY = aifyVarL.y(0);
            while (true) {
                i = 1;
                if (!ailkVarY.hasNext()) {
                    break;
                }
                defpackage.alww alwwVar = (defpackage.alww) ailkVarY.next();
                int iAQ = a.aQ((alwwVar.c == 3 ? (defpackage.alyp) alwwVar.d : defpackage.alyp.a).c);
                if (iAQ != 0 && iAQ == 3) {
                    defpackage.xbz xbzVar = new defpackage.xbz(alwwVar, 14);
                    if (true == optionalEmpty.isPresent()) {
                        java.lang.Object obj = optionalEmpty.get();
                        java.lang.Object obj2 = xbzVar.a;
                        akzx akzxVarP = ((alad) obj).p();
                        akzx akzxVarP2 = (((defpackage.alww) obj).c == 3 ? (defpackage.alyp) ((defpackage.alww) obj).d : defpackage.alyp.a).p();
                        if ((((defpackage.alww) obj).c == 3 ? (defpackage.alyp) ((defpackage.alww) obj).d : defpackage.alyp.a).g) {
                            z2 = true;
                        } else {
                            if ((((defpackage.alww) obj2).c == 3 ? (defpackage.alyp) ((defpackage.alww) obj2).d : defpackage.alyp.a).g) {
                                z2 = true;
                            } else {
                                z2 = z3;
                            }
                        }
                        akzxVarP2.u();
                        defpackage.alyp alypVar = (defpackage.alyp) akzxVarP2.b;
                        alypVar.b |= 16;
                        alypVar.g = z2;
                        int iAQ2 = a.aQ((((defpackage.alww) obj2).c == 3 ? (defpackage.alyp) ((defpackage.alww) obj2).d : defpackage.alyp.a).f);
                        if (iAQ2 == 0) {
                            iAQ2 = 1;
                        }
                        akzxVarP2.u();
                        defpackage.alyp alypVar2 = (defpackage.alyp) akzxVarP2.b;
                        alypVar2.f = iAQ2 - 1;
                        alypVar2.b |= 8;
                        defpackage.alwf alwfVar = (((defpackage.alww) obj).c == 3 ? (defpackage.alyp) ((defpackage.alww) obj).d : defpackage.alyp.a).d;
                        if (alwfVar == null) {
                            alwfVar = defpackage.alwf.a;
                        }
                        defpackage.alwf alwfVar2 = (((defpackage.alww) obj2).c == 3 ? (defpackage.alyp) ((defpackage.alww) obj2).d : defpackage.alyp.a).d;
                        if (alwfVar2 == null) {
                            alwfVar2 = defpackage.alwf.a;
                        }
                        defpackage.alwf alwfVarV = airh.v(aify.q(alwfVar, alwfVar2), " \n");
                        akzxVarP2.u();
                        defpackage.alyp alypVar3 = (defpackage.alyp) akzxVarP2.b;
                        j$.util.Objects.requireNonNull(alwfVarV);
                        alypVar3.d = alwfVarV;
                        alypVar3.b |= 2;
                        akzxVarP.u();
                        defpackage.alww alwwVar2 = (defpackage.alww) akzxVarP.b;
                        defpackage.alyp alypVar4 = (defpackage.alyp) akzxVarP2.p();
                        j$.util.Objects.requireNonNull(alypVar4);
                        alwwVar2.d = alypVar4;
                        alwwVar2.c = 3;
                        optionalEmpty = j$.util.Optional.ofNullable((defpackage.alww) akzxVarP.p());
                    }
                    optionalEmpty = j$.util.Optional.of((defpackage.alww) optionalEmpty.orElse(alwwVar));
                }
                int iAQ3 = a.aQ((alwwVar.c == 3 ? (defpackage.alyp) alwwVar.d : defpackage.alyp.a).c);
                if (iAQ3 != 0 && iAQ3 == 2) {
                    j$.util.Objects.requireNonNull(aiftVar);
                    defpackage.alui aluiVar = new defpackage.alui(aiftVar, i);
                    if (true == optionalEmpty.isPresent()) {
                        ((aift) aluiVar.a).i(optionalEmpty.get());
                    }
                    optionalEmpty = j$.util.Optional.empty();
                    aiftVar.i(alwwVar);
                }
                z3 = false;
            }
            j$.util.Objects.requireNonNull(aiftVar);
            defpackage.alui aluiVar2 = new defpackage.alui(aiftVar, i);
            if (true == optionalEmpty.isPresent()) {
                ((aift) aluiVar2.a).i(optionalEmpty.get());
            }
            akzxVarM.aV(aiftVar.h());
            defpackage.alwm alwmVar = defpackage.alwm.a;
            akzx akzxVarM2 = alwmVar.m();
            int i2 = this.x;
            akzxVarM2.u();
            defpackage.alwm alwmVar2 = (defpackage.alwm) akzxVarM2.b;
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            }
            alwmVar2.c = i3;
            alwmVar2.b |= 1;
            akzxVarM.u();
            defpackage.alwy alwyVar = (defpackage.alwy) akzxVarM.b;
            defpackage.alwm alwmVar3 = (defpackage.alwm) akzxVarM2.p();
            j$.util.Objects.requireNonNull(alwmVar3);
            alwyVar.h = alwmVar3;
            alwyVar.b |= 16;
            akzx akzxVarM3 = alwmVar.m();
            int i4 = this.w;
            akzxVarM3.u();
            defpackage.alwm alwmVar4 = (defpackage.alwm) akzxVarM3.b;
            int i5 = i4 - 1;
            if (i4 == 0) {
                throw null;
            }
            alwmVar4.c = i5;
            alwmVar4.b |= 1;
            akzxVarM.u();
            defpackage.alwy alwyVar2 = (defpackage.alwy) akzxVarM.b;
            defpackage.alwm alwmVar5 = (defpackage.alwm) akzxVarM3.p();
            j$.util.Objects.requireNonNull(alwmVar5);
            alwyVar2.g = alwmVar5;
            alwyVar2.b |= 8;
            if (!this.i.isEmpty()) {
                akzx akzxVarM4 = defpackage.alyg.a.m();
                akzxVarM4.aZ(this.i);
                akzxVarM4.u();
                defpackage.alyg alygVar = (defpackage.alyg) akzxVarM4.b;
                alygVar.b |= 1;
                alygVar.d = z;
                akzxVarM.u();
                defpackage.alwy alwyVar3 = (defpackage.alwy) akzxVarM.b;
                defpackage.alyg alygVar2 = (defpackage.alyg) akzxVarM4.p();
                j$.util.Objects.requireNonNull(alygVar2);
                alwyVar3.d = alygVar2;
                alwyVar3.b |= 1;
            }
            this.t.e(akzxVarM);
            akzz akzzVarM = defpackage.alsi.a.m();
            apdi apdiVar = defpackage.alwp.b;
            akzz akzzVarM2 = defpackage.alwp.a.m();
            apdi apdiVar2 = defpackage.alwz.d;
            akzx akzxVarM5 = defpackage.alwz.a.m();
            akzxVarM5.u();
            defpackage.alwz alwzVar = (defpackage.alwz) akzxVarM5.b;
            defpackage.alwy alwyVar4 = (defpackage.alwy) akzxVarM.p();
            j$.util.Objects.requireNonNull(alwyVar4);
            alwzVar.c = alwyVar4;
            alwzVar.b |= 1;
            akzzVarM2.bV(apdiVar2, (defpackage.alwz) akzxVarM5.p());
            akzzVarM.bV(apdiVar, akzzVarM2.p());
            defpackage.alsi alsiVarP = akzzVarM.p();
            reentrantLock.unlock();
            return alsiVarP;
        } catch (java.lang.Throwable th) {
            this.c.unlock();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, java.util.List] */
    public final defpackage.alsi c() {
        defpackage.alwf alwfVarU;
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            j$.util.stream.Stream map = j$.util.Collection.-EL.stream(l(this.h, this.j)).filter(new defpackage.altw(9)).map(new defpackage.alpp(11));
            j$.util.stream.Collector collector = aido.a;
            aify aifyVar = (aify) map.collect(collector);
            boolean zAnyMatch = j$.util.Collection.-EL.stream(aifyVar).anyMatch(new defpackage.altw(10));
            int iAN = a.aN(this.d.k);
            if (iAN != 0 && iAN == 4) {
                akzz akzzVarM = defpackage.alsi.a.m();
                apdi apdiVar = defpackage.alwp.b;
                akzz akzzVarM2 = defpackage.alwp.a.m();
                apdi apdiVar2 = defpackage.alyn.e;
                akzx akzxVarM = defpackage.alyn.a.m();
                akzx akzxVarM2 = defpackage.alwf.a.m();
                java.lang.String str = this.q;
                akzxVarM2.u();
                defpackage.alwf alwfVar = (defpackage.alwf) akzxVarM2.b;
                j$.util.Objects.requireNonNull(str);
                alwfVar.b |= 1;
                alwfVar.c = str;
                akzxVarM.u();
                defpackage.alyn alynVar = (defpackage.alyn) akzxVarM.b;
                defpackage.alwf alwfVar2 = (defpackage.alwf) akzxVarM2.p();
                j$.util.Objects.requireNonNull(alwfVar2);
                alynVar.c = alwfVar2;
                alynVar.b |= 1;
                akzxVarM.u();
                defpackage.alyn alynVar2 = (defpackage.alyn) akzxVarM.b;
                alynVar2.b |= 2;
                alynVar2.d = zAnyMatch;
                akzzVarM2.bV(apdiVar2, (defpackage.alyn) akzxVarM.p());
                akzzVarM.bV(apdiVar, akzzVarM2.p());
                defpackage.alsi alsiVarP = akzzVarM.p();
                reentrantLock.unlock();
                return alsiVarP;
            }
            java.util.ArrayList arrayList = (aify) j$.util.Collection.-EL.stream(aifyVar).map(new defpackage.alpp(8)).collect(collector);
            int iAN2 = a.aN(this.d.k);
            if (iAN2 == 0) {
                iAN2 = 1;
            }
            int i = iAN2 - 1;
            if (i == 1) {
                alwfVarU = airh.u(airh.x(arrayList));
            } else if (i != 2) {
                alwfVarU = airh.w(airh.v(arrayList, " "));
            } else {
                reentrantLock.lock();
                try {
                    if (!this.p.isEmpty()) {
                        arrayList = this.p;
                    }
                    if (arrayList.size() > 2 && !j$.util.Collection.-EL.stream(arrayList).allMatch(new defpackage.altw(5))) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        aify aifyVar2 = (aify) j$.util.Collection.-EL.stream(arrayList).filter(new defpackage.altw(6)).collect(collector);
                        j$.util.Optional optionalFindFirst = j$.util.Collection.-EL.stream(arrayList).findFirst();
                        defpackage.alju aljuVar = new defpackage.alju(arrayList2, 20);
                        if (true == optionalFindFirst.isPresent()) {
                            java.lang.Object obj = optionalFindFirst.get();
                            ?? r7 = aljuVar.a;
                            if (((defpackage.alwf) obj).d.isEmpty()) {
                                r7.add(defpackage.alwf.a);
                            }
                        }
                        arrayList2.addAll(aifyVar2);
                        if (((defpackage.alwf) ahvr.bk(arrayList)).d.isEmpty()) {
                            arrayList2.add(defpackage.alwf.a);
                        }
                        arrayList = arrayList2;
                    }
                    alwfVarU = airh.u(airh.x(aify.n(arrayList)));
                    this.c.unlock();
                } finally {
                    this.c.unlock();
                }
            }
            akzz akzzVarM3 = defpackage.alsi.a.m();
            apdi apdiVar3 = defpackage.alwp.b;
            akzz akzzVarM4 = defpackage.alwp.a.m();
            apdi apdiVar4 = defpackage.alyn.e;
            akzx akzxVarM3 = defpackage.alyn.a.m();
            akzxVarM3.u();
            defpackage.alyn alynVar3 = (defpackage.alyn) akzxVarM3.b;
            j$.util.Objects.requireNonNull(alwfVarU);
            alynVar3.c = alwfVarU;
            alynVar3.b |= 1;
            akzxVarM3.u();
            defpackage.alyn alynVar4 = (defpackage.alyn) akzxVarM3.b;
            alynVar4.b |= 2;
            alynVar4.d = zAnyMatch;
            akzzVarM4.bV(apdiVar4, (defpackage.alyn) akzxVarM3.p());
            akzzVarM3.bV(apdiVar3, akzzVarM4.p());
            return akzzVarM3.p();
        } catch (java.lang.Throwable th) {
            this.c.unlock();
            throw th;
        }
    }

    public final defpackage.alww d(defpackage.alyp alypVar) {
        akzx akzxVarM = defpackage.alww.a.m();
        akzxVarM.u();
        defpackage.alww alwwVar = (defpackage.alww) akzxVarM.b;
        j$.util.Objects.requireNonNull(alypVar);
        alwwVar.d = alypVar;
        alwwVar.c = 3;
        long epochMilli = this.z.a().toEpochMilli();
        akzxVarM.u();
        defpackage.alww alwwVar2 = (defpackage.alww) akzxVarM.b;
        alwwVar2.b |= 2;
        alwwVar2.f = epochMilli;
        return (defpackage.alww) akzxVarM.p();
    }

    public final void e(aify aifyVar) {
        this.c.lock();
        try {
            this.i = aifyVar;
        } finally {
            this.c.unlock();
        }
    }

    public final void f() {
        this.c.lock();
        try {
            this.l = false;
            this.t.d();
        } finally {
            this.c.unlock();
        }
    }

    public final boolean g() {
        int i = this.y;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0 || i2 == 1) {
            return false;
        }
        if (i2 == 2 || i2 == 4) {
            return true;
        }
        throw new java.lang.RuntimeException(null, null);
    }

    public final boolean h() {
        defpackage.alwn alwnVar = this.d;
        if (alwnVar != null) {
            defpackage.alxj alxjVar = alwnVar.e;
            if (alxjVar == null) {
                alxjVar = defpackage.alxj.a;
            }
            if (alxjVar.i) {
                return true;
            }
        }
        return false;
    }

    public final boolean i() {
        this.c.lock();
        try {
            return this.l;
        } finally {
            this.c.unlock();
        }
    }

    public final j$.util.Optional j(alqu alquVar, long j, int i) {
        java.lang.String strB = defpackage.alph.b(alquVar);
        if (strB.isEmpty()) {
            return j$.util.Optional.empty();
        }
        akzx akzxVarM = defpackage.alyp.a.m();
        akzxVarM.u();
        defpackage.alyp alypVar = (defpackage.alyp) akzxVarM.b;
        alypVar.c = 2;
        alypVar.b |= 1;
        boolean zD = alquVar.c == 1 ? defpackage.alph.d(alquVar, this.m) : false;
        akzxVarM.u();
        defpackage.alyp alypVar2 = (defpackage.alyp) akzxVarM.b;
        alypVar2.b |= 16;
        alypVar2.g = zD;
        akzxVarM.u();
        defpackage.alyp alypVar3 = (defpackage.alyp) akzxVarM.b;
        alypVar3.f = i - 1;
        alypVar3.b |= 8;
        akzxVarM.u();
        defpackage.alyp alypVar4 = (defpackage.alyp) akzxVarM.b;
        alypVar4.b |= 4;
        alypVar4.e = j;
        akzx akzxVarM2 = defpackage.alwf.a.m();
        akzxVarM2.u();
        defpackage.alwf alwfVar = (defpackage.alwf) akzxVarM2.b;
        j$.util.Objects.requireNonNull(strB);
        alwfVar.b |= 1;
        alwfVar.c = strB;
        akzxVarM.u();
        defpackage.alyp alypVar5 = (defpackage.alyp) akzxVarM.b;
        defpackage.alwf alwfVar2 = (defpackage.alwf) akzxVarM2.p();
        j$.util.Objects.requireNonNull(alwfVar2);
        alypVar5.d = alwfVar2;
        alypVar5.b |= 2;
        return j$.util.Optional.of((defpackage.alyp) akzxVarM.p());
    }

    public final void k(int i) {
        this.c.lock();
        try {
            e((aify) j$.util.Collection.-EL.stream(this.i).map(new defpackage.exw(i, 9)).collect(aido.a));
        } finally {
            this.c.unlock();
        }
    }
}
