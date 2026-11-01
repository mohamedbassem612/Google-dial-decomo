package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kgz {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/calllog/halo/impl/HaloImpl");
    public final defpackage.khh b;
    public final defpackage.aoss c;
    public final boolean d;
    public final defpackage.lqz e;
    public final defpackage.tkl f;
    public final defpackage.aogc g;
    private final defpackage.agsm h;
    private final defpackage.khn i;
    private final defpackage.khr j;
    private final defpackage.tkl k;

    public kgz(defpackage.agsm agsmVar, defpackage.tkl tklVar, defpackage.khh khhVar, defpackage.aogc aogcVar, defpackage.khn khnVar, defpackage.lqz lqzVar, defpackage.tkl tklVar2, defpackage.khr khrVar, defpackage.aoss aossVar) {
        if (agsmVar == null) {
            defpackage.aooh.i("androidFutures");
        }
        if (khhVar == null) {
            defpackage.aooh.i("haloCallDetailsDataIntegration");
        }
        if (lqzVar == null) {
            defpackage.aooh.i("haloCallLogDataIntegration");
        }
        if (tklVar2 == null) {
            defpackage.aooh.i("peopleDirectoryContactStorage");
        }
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        this.h = agsmVar;
        this.f = tklVar;
        this.b = khhVar;
        this.g = aogcVar;
        this.i = khnVar;
        this.e = lqzVar;
        this.k = tklVar2;
        this.j = khrVar;
        this.c = aossVar;
        this.d = khrVar.c();
    }

    public static final kiw e(kiw kiwVar) {
        defpackage.aooh.f(kiwVar, "numberAttributes");
        defpackage.akzx akzxVarL = kiwVar.L();
        akzxVarL.u();
        kiw kiwVar2 = akzxVarL.b;
        kiwVar2.b &= -33;
        kiw kiwVar3 = kiw.a;
        kiwVar2.h = kiwVar3.h;
        akzxVarL.u();
        kiw kiwVar4 = akzxVarL.b;
        kiwVar4.b &= -65;
        kiwVar4.i = false;
        akzxVarL.u();
        kiw kiwVar5 = akzxVarL.b;
        kiwVar5.b &= -129;
        kiwVar5.j = false;
        akzxVarL.u();
        kiw kiwVar6 = akzxVarL.b;
        kiwVar6.b &= -257;
        kiwVar6.k = false;
        akzxVarL.u();
        kiw kiwVar7 = akzxVarL.b;
        kiwVar7.b &= -513;
        kiwVar7.l = 0;
        akzxVarL.u();
        kiw kiwVar8 = akzxVarL.b;
        kiwVar8.b &= -1025;
        kiwVar8.m = 0;
        akzxVarL.u();
        kiw kiwVar9 = akzxVarL.b;
        kiwVar9.b &= -2049;
        kiwVar9.n = 0;
        akzxVarL.u();
        kiw kiwVar10 = akzxVarL.b;
        kiwVar10.b &= -8193;
        kiwVar10.p = false;
        akzxVarL.u();
        kiw kiwVar11 = akzxVarL.b;
        kiwVar11.b &= -16385;
        kiwVar11.q = kiwVar3.q;
        akzxVarL.u();
        kiw kiwVar12 = akzxVarL.b;
        kiwVar12.b &= -65537;
        kiwVar12.s = false;
        akzxVarL.u();
        kiw kiwVar13 = akzxVarL.b;
        kiwVar13.u = null;
        kiwVar13.b &= -262145;
        akzxVarL.u();
        akzxVarL.b.v = defpackage.albq.a;
        akzxVarL.u();
        kiw kiwVar14 = akzxVarL.b;
        kiwVar14.b &= -524289;
        kiwVar14.w = false;
        akzxVarL.u();
        kiw kiwVar15 = akzxVarL.b;
        kiwVar15.b &= -2097153;
        kiwVar15.y = false;
        akzxVarL.u();
        kiw kiwVar16 = akzxVarL.b;
        kiwVar16.b &= -4194305;
        kiwVar16.z = false;
        akzxVarL.u();
        kiw kiwVar17 = akzxVarL.b;
        kiwVar17.b &= -8388609;
        kiwVar17.A = false;
        akzxVarL.u();
        kiw kiwVar18 = akzxVarL.b;
        kiwVar18.b &= -16777217;
        kiwVar18.B = false;
        akzxVarL.u();
        kiw kiwVar19 = akzxVarL.b;
        kiwVar19.b &= -33554433;
        kiwVar19.C = 0;
        kiw kiwVarR = akzxVarL.r();
        defpackage.aooh.e(kiwVarR, "build(...)");
        return kiwVarR;
    }

    public final defpackage.kgu a(kip kipVar) {
        defpackage.aooh.f(kipVar, "callDetails");
        return (defpackage.kgu) defpackage.mni.by(kipVar, this.b);
    }

    public final defpackage.kgu b(defpackage.kiu kiuVar) {
        defpackage.aooh.f(kiuVar, "coalescedRow");
        return (defpackage.kgu) hgt.w(kiuVar, this.e);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [aolu] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.LinkedHashMap, java.util.Map] */
    public final java.lang.Object c(defpackage.aoln aolnVar) {
        kgw kgwVar;
        if (aolnVar instanceof kgw) {
            kgwVar = (kgw) aolnVar;
            int i = kgwVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kgwVar.c = i - Integer.MIN_VALUE;
            } else {
                kgwVar = new kgw(this, aolnVar);
            }
        } else {
            kgwVar = new kgw(this, aolnVar);
        }
        java.lang.Object objW = kgwVar.a;
        java.lang.Object linkedHashMap = defpackage.aolu.a;
        int i2 = kgwVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objW);
            defpackage.tkl tklVar = this.k;
            kgwVar.c = 1;
            objW = tklVar.w(kgwVar);
            if (objW != linkedHashMap) {
            }
            return linkedHashMap;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        defpackage.aooc.af(objW);
        java.util.Map map = (java.util.Map) objW;
        linkedHashMap = new java.util.LinkedHashMap(defpackage.ajsz.aL(map.size()));
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.Object key = entry.getKey();
            defpackage.kid kidVar = (defpackage.kid) entry.getValue();
            linkedHashMap.put(key, new soe(kidVar.e, kidVar.d, kidVar.b, kidVar.c, kidVar.f));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r12v4, types: [aolr, java.lang.Object] */
    public final java.lang.Object d(java.util.Map map, defpackage.aoln aolnVar) {
        kgy kgyVar;
        if (aolnVar instanceof kgy) {
            kgyVar = (kgy) aolnVar;
            int i = kgyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kgyVar.c = i - Integer.MIN_VALUE;
            } else {
                kgyVar = new kgy(this, aolnVar);
            }
        } else {
            kgyVar = new kgy(this, aolnVar);
        }
        java.lang.Object objAj = kgyVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = kgyVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objAj);
            java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
            for (java.util.Map.Entry entry : map.entrySet()) {
                java.lang.String str = ((kgv) entry.getKey()).a;
                soe soeVar = (soe) entry.getValue();
                arrayList.add(new defpackage.kid(str, soeVar.d, soeVar.e, soeVar.c, soeVar.b, soeVar.f));
            }
            defpackage.tkl tklVar = this.k;
            kgyVar.c = 1;
            objAj = arrayList.isEmpty() ? null : defpackage.aoov.aj(tklVar.c, new ite(tklVar, arrayList, (defpackage.aoln) null, 3), kgyVar);
            if (objAj == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objAj);
        }
        return java.lang.Boolean.valueOf(objAj != null);
    }

    public final java.lang.Object f(java.lang.String str, int i, defpackage.aoln aolnVar) {
        return this.i.a(str, i, aolnVar);
    }

    public final void g(java.lang.String str, int i) {
        defpackage.aooh.f(str, "uuid");
        defpackage.aooh.f(str, "uuid");
        defpackage.ajcq ajcqVarF = defpackage.aosv.F(this.c, 0, new kgx(this, str, i, (defpackage.aoln) null, 0), 3);
        defpackage.agsm agsmVar = this.h;
        defpackage.aooh.f(agsmVar, "<this>");
        agsmVar.g(ajcqVarF, 10L, java.util.concurrent.TimeUnit.SECONDS);
    }
}
