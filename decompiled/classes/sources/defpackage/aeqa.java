package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aeqa {
    final java.lang.Long a;
    final java.lang.Long b;
    final android.os.health.HealthStats c;
    final java.lang.String d;
    final int e;
    final /* synthetic */ defpackage.aesp f;

    public aeqa(defpackage.aesp aespVar, java.lang.Long l, java.lang.Long l2, android.os.health.HealthStats healthStats, int i, java.lang.String str) {
        j$.util.Objects.requireNonNull(aespVar);
        this.f = aespVar;
        this.a = l;
        this.b = l2;
        this.c = healthStats;
        this.e = i;
        this.d = str;
    }

    public final defpackage.aeqo a() {
        java.lang.Object obj;
        defpackage.akzx akzxVarM = defpackage.aper.a.m();
        android.os.health.HealthStats healthStats = this.c;
        long jBi = defpackage.agab.bi(healthStats, 10001);
        if (jBi != 0) {
            akzxVarM.u();
            defpackage.aper aperVar = (defpackage.aper) akzxVarM.b;
            aperVar.b |= 1;
            aperVar.d = jBi;
        }
        long jBi2 = defpackage.agab.bi(healthStats, 10002);
        if (jBi2 != 0) {
            akzxVarM.u();
            defpackage.aper aperVar2 = (defpackage.aper) akzxVarM.b;
            aperVar2.b |= 2;
            aperVar2.e = jBi2;
        }
        long jBi3 = defpackage.agab.bi(healthStats, 10003);
        if (jBi3 != 0) {
            akzxVarM.u();
            defpackage.aper aperVar3 = (defpackage.aper) akzxVarM.b;
            aperVar3.b |= 4;
            aperVar3.f = jBi3;
        }
        long jBi4 = defpackage.agab.bi(healthStats, 10004);
        if (jBi4 != 0) {
            akzxVarM.u();
            defpackage.aper aperVar4 = (defpackage.aper) akzxVarM.b;
            aperVar4.b |= 8;
            aperVar4.g = jBi4;
        }
        akzxVarM.bA(defpackage.agab.bj(healthStats, 10005));
        akzxVarM.bB(defpackage.agab.bj(healthStats, 10006));
        akzxVarM.bC(defpackage.agab.bj(healthStats, 10007));
        akzxVarM.bz(defpackage.agab.bj(healthStats, 10008));
        akzxVarM.by(defpackage.agab.bj(healthStats, 10009));
        akzxVarM.bu(defpackage.agab.bj(healthStats, 10010));
        defpackage.apeq apeqVarBm = defpackage.agab.bm(healthStats, 10011);
        if (apeqVarBm != null) {
            akzxVarM.u();
            defpackage.aper aperVar5 = (defpackage.aper) akzxVarM.b;
            j$.util.Objects.requireNonNull(apeqVarBm);
            aperVar5.n = apeqVarBm;
            aperVar5.b |= 16;
        }
        akzxVarM.bv(defpackage.agab.bj(healthStats, 10012));
        akzxVarM.bx(defpackage.aeqk.a.d(defpackage.agab.bk(healthStats, 10014)));
        akzxVarM.bw(defpackage.aeqj.a.d(defpackage.agab.bk(healthStats, 10015)));
        long jBi5 = defpackage.agab.bi(healthStats, 10016);
        if (jBi5 != 0) {
            akzxVarM.u();
            defpackage.aper aperVar6 = (defpackage.aper) akzxVarM.b;
            aperVar6.b |= 32;
            aperVar6.s = jBi5;
        }
        long jBi6 = defpackage.agab.bi(healthStats, 10017);
        if (jBi6 != 0) {
            akzxVarM.u();
            defpackage.aper aperVar7 = (defpackage.aper) akzxVarM.b;
            aperVar7.b |= 64;
            aperVar7.t = jBi6;
        }
        long jBi7 = defpackage.agab.bi(healthStats, 10018);
        if (jBi7 != 0) {
            akzxVarM.u();
            defpackage.aper aperVar8 = (defpackage.aper) akzxVarM.b;
            aperVar8.b |= 128;
            aperVar8.u = jBi7;
        }
        long jBi8 = defpackage.agab.bi(healthStats, 10019);
        if (jBi8 != 0) {
            akzxVarM.u();
            defpackage.aper aperVar9 = (defpackage.aper) akzxVarM.b;
            aperVar9.b |= 256;
            aperVar9.v = jBi8;
        }
        long jBi9 = defpackage.agab.bi(healthStats, 10020);
        if (jBi9 != 0) {
            akzxVarM.u();
            defpackage.aper aperVar10 = (defpackage.aper) akzxVarM.b;
            aperVar10.b |= 512;
            aperVar10.w = jBi9;
        }
        long jBi10 = defpackage.agab.bi(healthStats, 10021);
        if (jBi10 != 0) {
            akzxVarM.u();
            defpackage.aper aperVar11 = (defpackage.aper) akzxVarM.b;
            aperVar11.b |= 1024;
            aperVar11.x = jBi10;
        }
        long jBi11 = defpackage.agab.bi(healthStats, 10022);
        if (jBi11 != 0) {
            akzxVarM.u();
            defpackage.aper aperVar12 = (defpackage.aper) akzxVarM.b;
            aperVar12.b |= 2048;
            aperVar12.y = jBi11;
        }
        long jBi12 = defpackage.agab.bi(healthStats, 10023);
        if (jBi12 != 0) {
            akzxVarM.u();
            defpackage.aper aperVar13 = (defpackage.aper) akzxVarM.b;
            aperVar13.b |= 4096;
            aperVar13.z = jBi12;
        }
        long jBi13 = defpackage.agab.bi(healthStats, 10024);
        if (jBi13 != 0) {
            akzxVarM.u();
            defpackage.aper aperVar14 = (defpackage.aper) akzxVarM.b;
            aperVar14.b |= 8192;
            aperVar14.A = jBi13;
        }
        long jBi14 = defpackage.agab.bi(healthStats, 10025);
        if (jBi14 != 0) {
            akzxVarM.u();
            defpackage.aper aperVar15 = (defpackage.aper) akzxVarM.b;
            aperVar15.b |= 16384;
            aperVar15.B = jBi14;
        }
        long jBi15 = defpackage.agab.bi(healthStats, 10026);
        if (jBi15 != 0) {
            akzxVarM.u();
            defpackage.aper aperVar16 = (defpackage.aper) akzxVarM.b;
            aperVar16.b |= 32768;
            aperVar16.C = jBi15;
        }
        long jBi16 = defpackage.agab.bi(healthStats, 10027);
        if (jBi16 != 0) {
            akzxVarM.u();
            defpackage.aper aperVar17 = (defpackage.aper) akzxVarM.b;
            aperVar17.b |= 65536;
            aperVar17.D = jBi16;
        }
        long jBi17 = defpackage.agab.bi(healthStats, 10028);
        if (jBi17 != 0) {
            akzxVarM.u();
            defpackage.aper aperVar18 = (defpackage.aper) akzxVarM.b;
            aperVar18.b |= 131072;
            aperVar18.E = jBi17;
        }
        long jBi18 = defpackage.agab.bi(healthStats, 10029);
        if (jBi18 != 0) {
            akzxVarM.u();
            defpackage.aper aperVar19 = (defpackage.aper) akzxVarM.b;
            aperVar19.b |= 262144;
            aperVar19.F = jBi18;
        }
        defpackage.apeq apeqVarBm2 = defpackage.agab.bm(healthStats, 10030);
        if (apeqVarBm2 != null) {
            akzxVarM.u();
            defpackage.aper aperVar20 = (defpackage.aper) akzxVarM.b;
            j$.util.Objects.requireNonNull(apeqVarBm2);
            aperVar20.G = apeqVarBm2;
            aperVar20.b |= 524288;
        }
        long jBi19 = defpackage.agab.bi(healthStats, 10031);
        if (jBi19 != 0) {
            akzxVarM.u();
            defpackage.aper aperVar21 = (defpackage.aper) akzxVarM.b;
            aperVar21.b |= 1048576;
            aperVar21.H = jBi19;
        }
        defpackage.apeq apeqVarBm3 = defpackage.agab.bm(healthStats, 10032);
        if (apeqVarBm3 != null) {
            akzxVarM.u();
            defpackage.aper aperVar22 = (defpackage.aper) akzxVarM.b;
            j$.util.Objects.requireNonNull(apeqVarBm3);
            aperVar22.I = apeqVarBm3;
            aperVar22.b |= 2097152;
        }
        defpackage.apeq apeqVarBm4 = defpackage.agab.bm(healthStats, 10033);
        if (apeqVarBm4 != null) {
            akzxVarM.u();
            defpackage.aper aperVar23 = (defpackage.aper) akzxVarM.b;
            j$.util.Objects.requireNonNull(apeqVarBm4);
            aperVar23.J = apeqVarBm4;
            aperVar23.b |= 4194304;
        }
        defpackage.apeq apeqVarBm5 = defpackage.agab.bm(healthStats, 10034);
        if (apeqVarBm5 != null) {
            akzxVarM.u();
            defpackage.aper aperVar24 = (defpackage.aper) akzxVarM.b;
            j$.util.Objects.requireNonNull(apeqVarBm5);
            aperVar24.K = apeqVarBm5;
            aperVar24.b |= 8388608;
        }
        defpackage.apeq apeqVarBm6 = defpackage.agab.bm(healthStats, 10035);
        if (apeqVarBm6 != null) {
            akzxVarM.u();
            defpackage.aper aperVar25 = (defpackage.aper) akzxVarM.b;
            j$.util.Objects.requireNonNull(apeqVarBm6);
            aperVar25.L = apeqVarBm6;
            aperVar25.b |= 16777216;
        }
        defpackage.apeq apeqVarBm7 = defpackage.agab.bm(healthStats, 10036);
        if (apeqVarBm7 != null) {
            akzxVarM.u();
            defpackage.aper aperVar26 = (defpackage.aper) akzxVarM.b;
            j$.util.Objects.requireNonNull(apeqVarBm7);
            aperVar26.M = apeqVarBm7;
            aperVar26.b |= 33554432;
        }
        defpackage.apeq apeqVarBm8 = defpackage.agab.bm(healthStats, 10037);
        if (apeqVarBm8 != null) {
            akzxVarM.u();
            defpackage.aper aperVar27 = (defpackage.aper) akzxVarM.b;
            j$.util.Objects.requireNonNull(apeqVarBm8);
            aperVar27.N = apeqVarBm8;
            aperVar27.b |= 67108864;
        }
        defpackage.apeq apeqVarBm9 = defpackage.agab.bm(healthStats, 10038);
        if (apeqVarBm9 != null) {
            akzxVarM.u();
            defpackage.aper aperVar28 = (defpackage.aper) akzxVarM.b;
            j$.util.Objects.requireNonNull(apeqVarBm9);
            aperVar28.R = apeqVarBm9;
            aperVar28.b |= 134217728;
        }
        defpackage.apeq apeqVarBm10 = defpackage.agab.bm(healthStats, 10039);
        if (apeqVarBm10 != null) {
            akzxVarM.u();
            defpackage.aper aperVar29 = (defpackage.aper) akzxVarM.b;
            j$.util.Objects.requireNonNull(apeqVarBm10);
            aperVar29.S = apeqVarBm10;
            aperVar29.b |= 268435456;
        }
        defpackage.apeq apeqVarBm11 = defpackage.agab.bm(healthStats, 10040);
        if (apeqVarBm11 != null) {
            akzxVarM.u();
            defpackage.aper aperVar30 = (defpackage.aper) akzxVarM.b;
            j$.util.Objects.requireNonNull(apeqVarBm11);
            aperVar30.T = apeqVarBm11;
            aperVar30.b |= 536870912;
        }
        defpackage.apeq apeqVarBm12 = defpackage.agab.bm(healthStats, 10041);
        if (apeqVarBm12 != null) {
            akzxVarM.u();
            defpackage.aper aperVar31 = (defpackage.aper) akzxVarM.b;
            j$.util.Objects.requireNonNull(apeqVarBm12);
            aperVar31.U = apeqVarBm12;
            aperVar31.b |= 1073741824;
        }
        defpackage.apeq apeqVarBm13 = defpackage.agab.bm(healthStats, 10042);
        if (apeqVarBm13 != null) {
            akzxVarM.u();
            defpackage.aper aperVar32 = (defpackage.aper) akzxVarM.b;
            j$.util.Objects.requireNonNull(apeqVarBm13);
            aperVar32.V = apeqVarBm13;
            aperVar32.b |= Integer.MIN_VALUE;
        }
        defpackage.apeq apeqVarBm14 = defpackage.agab.bm(healthStats, 10043);
        if (apeqVarBm14 != null) {
            akzxVarM.u();
            defpackage.aper aperVar33 = (defpackage.aper) akzxVarM.b;
            j$.util.Objects.requireNonNull(apeqVarBm14);
            aperVar33.W = apeqVarBm14;
            aperVar33.c |= 1;
        }
        defpackage.apeq apeqVarBm15 = defpackage.agab.bm(healthStats, 10044);
        if (apeqVarBm15 != null) {
            akzxVarM.u();
            defpackage.aper aperVar34 = (defpackage.aper) akzxVarM.b;
            j$.util.Objects.requireNonNull(apeqVarBm15);
            aperVar34.X = apeqVarBm15;
            aperVar34.c |= 2;
        }
        long jBi20 = defpackage.agab.bi(healthStats, 10045);
        if (jBi20 != 0) {
            akzxVarM.u();
            defpackage.aper aperVar35 = (defpackage.aper) akzxVarM.b;
            aperVar35.c |= 4;
            aperVar35.Y = jBi20;
        }
        long jBi21 = defpackage.agab.bi(healthStats, 10046);
        if (jBi21 != 0) {
            akzxVarM.u();
            defpackage.aper aperVar36 = (defpackage.aper) akzxVarM.b;
            aperVar36.c |= 8;
            aperVar36.Z = jBi21;
        }
        long jBi22 = defpackage.agab.bi(healthStats, 10047);
        if (jBi22 != 0) {
            akzxVarM.u();
            defpackage.aper aperVar37 = (defpackage.aper) akzxVarM.b;
            aperVar37.c |= 16;
            aperVar37.aa = jBi22;
        }
        long jBi23 = defpackage.agab.bi(healthStats, 10048);
        if (jBi23 != 0) {
            akzxVarM.u();
            defpackage.aper aperVar38 = (defpackage.aper) akzxVarM.b;
            aperVar38.c |= 32;
            aperVar38.ab = jBi23;
        }
        long jBi24 = defpackage.agab.bi(healthStats, 10049);
        if (jBi24 != 0) {
            akzxVarM.u();
            defpackage.aper aperVar39 = (defpackage.aper) akzxVarM.b;
            aperVar39.c |= 64;
            aperVar39.ac = jBi24;
        }
        long jBi25 = defpackage.agab.bi(healthStats, 10050);
        if (jBi25 != 0) {
            akzxVarM.u();
            defpackage.aper aperVar40 = (defpackage.aper) akzxVarM.b;
            aperVar40.c |= 128;
            aperVar40.ad = jBi25;
        }
        long jBi26 = defpackage.agab.bi(healthStats, 10051);
        if (jBi26 != 0) {
            akzxVarM.u();
            defpackage.aper aperVar41 = (defpackage.aper) akzxVarM.b;
            aperVar41.c |= 256;
            aperVar41.ae = jBi26;
        }
        long jBi27 = defpackage.agab.bi(healthStats, 10052);
        if (jBi27 != 0) {
            akzxVarM.u();
            defpackage.aper aperVar42 = (defpackage.aper) akzxVarM.b;
            aperVar42.c |= 512;
            aperVar42.af = jBi27;
        }
        long jBi28 = defpackage.agab.bi(healthStats, 10053);
        if (jBi28 != 0) {
            akzxVarM.u();
            defpackage.aper aperVar43 = (defpackage.aper) akzxVarM.b;
            aperVar43.c |= 1024;
            aperVar43.ag = jBi28;
        }
        long jBi29 = defpackage.agab.bi(healthStats, 10054);
        if (jBi29 != 0) {
            akzxVarM.u();
            defpackage.aper aperVar44 = (defpackage.aper) akzxVarM.b;
            aperVar44.c |= 2048;
            aperVar44.ah = jBi29;
        }
        long jBi30 = defpackage.agab.bi(healthStats, 10055);
        if (jBi30 != 0) {
            akzxVarM.u();
            defpackage.aper aperVar45 = (defpackage.aper) akzxVarM.b;
            aperVar45.c |= 4096;
            aperVar45.ai = jBi30;
        }
        long jBi31 = defpackage.agab.bi(healthStats, 10056);
        if (jBi31 != 0) {
            akzxVarM.u();
            defpackage.aper aperVar46 = (defpackage.aper) akzxVarM.b;
            aperVar46.c |= 8192;
            aperVar46.aj = jBi31;
        }
        long jBi32 = defpackage.agab.bi(healthStats, 10057);
        if (jBi32 != 0) {
            akzxVarM.u();
            defpackage.aper aperVar47 = (defpackage.aper) akzxVarM.b;
            aperVar47.c |= 16384;
            aperVar47.ak = jBi32;
        }
        long jBi33 = defpackage.agab.bi(healthStats, 10058);
        if (jBi33 != 0) {
            akzxVarM.u();
            defpackage.aper aperVar48 = (defpackage.aper) akzxVarM.b;
            aperVar48.c |= 32768;
            aperVar48.al = jBi33;
        }
        long jBi34 = defpackage.agab.bi(healthStats, 10059);
        if (jBi34 != 0) {
            akzxVarM.u();
            defpackage.aper aperVar49 = (defpackage.aper) akzxVarM.b;
            aperVar49.c |= 65536;
            aperVar49.am = jBi34;
        }
        defpackage.apeq apeqVarBm16 = defpackage.agab.bm(healthStats, 10061);
        if (apeqVarBm16 != null) {
            akzxVarM.u();
            defpackage.aper aperVar50 = (defpackage.aper) akzxVarM.b;
            j$.util.Objects.requireNonNull(apeqVarBm16);
            aperVar50.an = apeqVarBm16;
            aperVar50.c |= 131072;
        }
        long jBi35 = defpackage.agab.bi(healthStats, 10062);
        if (jBi35 != 0) {
            akzxVarM.u();
            defpackage.aper aperVar51 = (defpackage.aper) akzxVarM.b;
            aperVar51.c |= 262144;
            aperVar51.ao = jBi35;
        }
        long jBi36 = defpackage.agab.bi(healthStats, 10063);
        if (jBi36 != 0) {
            akzxVarM.u();
            defpackage.aper aperVar52 = (defpackage.aper) akzxVarM.b;
            aperVar52.c |= 524288;
            aperVar52.ap = jBi36;
        }
        long jBi37 = defpackage.agab.bi(healthStats, 10064);
        if (jBi37 != 0) {
            akzxVarM.u();
            defpackage.aper aperVar53 = (defpackage.aper) akzxVarM.b;
            aperVar53.c |= 1048576;
            aperVar53.aq = jBi37;
        }
        defpackage.aesp aespVar = this.f;
        defpackage.akzx akzxVarL = ((defpackage.aper) akzxVarM.r()).L();
        j$.util.DesugarCollections.unmodifiableList(((defpackage.aper) akzxVarL.b).h);
        int i = 0;
        while (true) {
            java.lang.Object obj2 = aespVar.c;
            int size = ((defpackage.aper) akzxVarL.b).h.size();
            obj = ((defpackage.adao) obj2).a;
            if (i >= size) {
                break;
            }
            akzxVarL.bH(i, ((defpackage.aeqh) obj).c(1, akzxVarL.br(i)));
            i++;
        }
        j$.util.DesugarCollections.unmodifiableList(((defpackage.aper) akzxVarL.b).i);
        for (int i2 = 0; i2 < ((defpackage.aper) akzxVarL.b).i.size(); i2++) {
            akzxVarL.bI(i2, ((defpackage.aeqh) obj).c(1, akzxVarL.bs(i2)));
        }
        j$.util.DesugarCollections.unmodifiableList(((defpackage.aper) akzxVarL.b).j);
        for (int i3 = 0; i3 < ((defpackage.aper) akzxVarL.b).j.size(); i3++) {
            akzxVarL.bJ(i3, ((defpackage.aeqh) obj).c(1, akzxVarL.bt(i3)));
        }
        j$.util.DesugarCollections.unmodifiableList(((defpackage.aper) akzxVarL.b).k);
        for (int i4 = 0; i4 < ((defpackage.aper) akzxVarL.b).k.size(); i4++) {
            akzxVarL.bG(i4, ((defpackage.aeqh) obj).c(1, akzxVarL.bq(i4)));
        }
        j$.util.DesugarCollections.unmodifiableList(((defpackage.aper) akzxVarL.b).l);
        for (int i5 = 0; i5 < ((defpackage.aper) akzxVarL.b).l.size(); i5++) {
            akzxVarL.bF(i5, ((defpackage.aeqh) obj).c(2, akzxVarL.bp(i5)));
        }
        j$.util.DesugarCollections.unmodifiableList(((defpackage.aper) akzxVarL.b).m);
        for (int i6 = 0; i6 < ((defpackage.aper) akzxVarL.b).m.size(); i6++) {
            akzxVarL.bD(i6, ((defpackage.aeqh) obj).c(3, akzxVarL.bn(i6)));
        }
        j$.util.DesugarCollections.unmodifiableList(((defpackage.aper) akzxVarL.b).o);
        for (int i7 = 0; i7 < ((defpackage.aper) akzxVarL.b).o.size(); i7++) {
            akzxVarL.bE(i7, ((defpackage.aeqh) obj).c(5, akzxVarL.bo(i7)));
        }
        defpackage.aper aperVar54 = (defpackage.aper) akzxVarL.r();
        java.lang.Long l = this.a;
        java.lang.Long l2 = this.b;
        java.lang.Object obj3 = aespVar.b;
        return new defpackage.aeqo(aperVar54, l, l2, 1001915728L, java.lang.Long.valueOf(obj3 != null ? ((java.lang.String) obj3).hashCode() : 0L), this.e, this.d, null, null);
    }
}
