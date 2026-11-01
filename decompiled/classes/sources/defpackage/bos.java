package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class bos {
    public static final defpackage.cbd a = new defpackage.cet(new defpackage.ns(10));

    public static final long a(defpackage.bor borVar, long j) {
        if (j == borVar.a) {
            return borVar.b;
        }
        if (j == borVar.f) {
            return borVar.g;
        }
        if (j == borVar.j) {
            return borVar.k;
        }
        if (j == borVar.n) {
            return borVar.o;
        }
        if (j == borVar.w) {
            return borVar.x;
        }
        if (j == borVar.c) {
            return borVar.d;
        }
        if (j == borVar.h) {
            return borVar.i;
        }
        if (j == borVar.l) {
            return borVar.m;
        }
        if (j == borVar.y) {
            return borVar.z;
        }
        if (j == borVar.u) {
            return borVar.v;
        }
        if (j != borVar.p) {
            if (j == borVar.r) {
                return borVar.s;
            }
            if (j != borVar.D && j != borVar.F && j != borVar.G && j != borVar.H && j != borVar.I && j != borVar.J && j != borVar.E) {
                if (j == borVar.K || j == borVar.L) {
                    return borVar.M;
                }
                if (j == borVar.O || j == borVar.P) {
                    return borVar.Q;
                }
                if (j == borVar.S || j == borVar.T) {
                    return borVar.U;
                }
                float[] fArr = defpackage.crp.a;
                return defpackage.cfd.N(0.0f, 0.0f, 0.0f, 0.0f, defpackage.crp.u);
            }
        }
        return borVar.q;
    }

    public static final long b(defpackage.bor borVar, int i) {
        if (i == 3) {
            return borVar.v;
        }
        if (i == 4) {
            return borVar.e;
        }
        if (i == 5) {
            return borVar.u;
        }
        if (i == 6) {
            return borVar.o;
        }
        if (i == 7) {
            return borVar.x;
        }
        if (i == 8) {
            return borVar.z;
        }
        if (i == 9) {
            return borVar.b;
        }
        if (i == 10) {
            return borVar.d;
        }
        if (i == 13) {
            return borVar.g;
        }
        if (i == 14) {
            return borVar.i;
        }
        if (i == 17) {
            return borVar.q;
        }
        if (i == 18) {
            return borVar.s;
        }
        if (i == 42) {
            return borVar.t;
        }
        if (i == 19) {
            return borVar.k;
        }
        if (i == 20) {
            return borVar.m;
        }
        if (i == 23) {
            return borVar.A;
        }
        if (i == 24) {
            return borVar.B;
        }
        if (i == 25) {
            return borVar.a;
        }
        if (i == 26) {
            return borVar.c;
        }
        if (i == 29) {
            return borVar.C;
        }
        if (i == 30) {
            return borVar.f;
        }
        if (i == 31) {
            return borVar.h;
        }
        if (i == 34) {
            return borVar.p;
        }
        if (i == 43) {
            return borVar.r;
        }
        if (i == 35) {
            return borVar.D;
        }
        if (i == 36) {
            return borVar.F;
        }
        if (i == 37) {
            return borVar.G;
        }
        if (i == 38) {
            return borVar.H;
        }
        if (i == 39) {
            return borVar.I;
        }
        if (i == 40) {
            return borVar.J;
        }
        if (i == 41) {
            return borVar.E;
        }
        if (i == 44) {
            return borVar.j;
        }
        if (i == 45) {
            return borVar.l;
        }
        if (i == 27) {
            return borVar.K;
        }
        if (i == 28) {
            return borVar.L;
        }
        if (i == 11) {
            return borVar.M;
        }
        if (i == 12) {
            return borVar.N;
        }
        if (i == 32) {
            return borVar.O;
        }
        if (i == 33) {
            return borVar.P;
        }
        if (i == 15) {
            return borVar.Q;
        }
        if (i == 16) {
            return borVar.R;
        }
        if (i == 21) {
            return borVar.U;
        }
        if (i == 22) {
            return borVar.V;
        }
        float[] fArr = defpackage.crp.a;
        return defpackage.cfd.N(0.0f, 0.0f, 0.0f, 0.0f, defpackage.crp.u);
    }

    public static final long c(defpackage.bor borVar, long j, float f, defpackage.cav cavVar) {
        boolean zBooleanValue = ((java.lang.Boolean) cavVar.e(a)).booleanValue();
        long j2 = borVar.p;
        if (j != j2 || !zBooleanValue) {
            return j;
        }
        if (java.lang.Float.compare(f, 0.0f) == 0) {
            return j2;
        }
        float fLog = (float) java.lang.Math.log(f + 1.0f);
        long j3 = borVar.t;
        float fD = defpackage.cqg.d(j3);
        float fC = defpackage.cqg.c(j3);
        float fB = defpackage.cqg.b(j3);
        float[] fArr = defpackage.crp.a;
        return defpackage.cfd.P(defpackage.cfd.N(fD, fC, fB, ((fLog * 4.5f) + 2.0f) / 100.0f, defpackage.crp.y[(int) (j3 & 63)]), j2);
    }

    public static final long d(long j, defpackage.cav cavVar) {
        cavVar.u(89374138);
        long jA = a(((defpackage.bqv) cavVar.e(defpackage.bqx.a)).a, j);
        if (jA == 16) {
            jA = ((defpackage.cqg) cavVar.e(defpackage.boy.a)).a;
        }
        cavVar.o();
        return jA;
    }

    public static final long e(int i, defpackage.cav cavVar) {
        return b(((defpackage.bqv) cavVar.e(defpackage.bqx.a)).a, i);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v0 ??, still in use, count: 1, list:
          (r2v0 ?? I:??[OBJECT, ARRAY]) from 0x02ed: RETURN (r2v0 ?? I:??[OBJECT, ARRAY])
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public static /* synthetic */ defpackage.bor f(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v0 ??, still in use, count: 1, list:
          (r2v0 ?? I:??[OBJECT, ARRAY]) from 0x02ed: RETURN (r2v0 ?? I:??[OBJECT, ARRAY])
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r105v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    public static /* synthetic */ defpackage.bor g(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, int i) {
        long j45 = 1 != (i & 1) ? j : -13302995479429120L;
        long j46 = (268435456 & i) != 0 ? -72057594037927936L : j25;
        long j47 = (134217728 & i) != 0 ? -51433715133317120L : j24;
        long j48 = (67108864 & i) != 0 ? -30522885168693248L : j23;
        long j49 = (33554432 & i) != 0 ? -1725288362803200L : 0L;
        long j50 = (16777216 & i) != 0 ? -32619108382015488L : 0L;
        long j51 = (8388608 & i) != 0 ? -45013937321672704L : 0L;
        long j52 = (4194304 & i) != 0 ? -3737562145357824L : 0L;
        long j53 = (2097152 & i) != 0 ? -57931940522622976L : j22;
        long j54 = (1048576 & i) != 0 ? -7071058062475264L : j21;
        long j55 = (524288 & i) != 0 ? j45 : j20;
        long j56 = (262144 & i) != 0 ? -14983251110133760L : j19;
        long j57 = (131072 & i) != 0 ? -51433715133317120L : j18;
        long j58 = (65536 & i) != 0 ? -7071058062475264L : j17;
        long j59 = (32768 & i) != 0 ? -66408200215199744L : j16;
        long j60 = (i & 16384) != 0 ? -7071058062475264L : j15;
        long j61 = (i & 8192) != 0 ? -66408200215199744L : j14;
        long j62 = (i & 4096) != 0 ? -43001212567552L : j13;
        long j63 = (i & 2048) != 0 ? -44126390919888896L : j12;
        long j64 = (i & 1024) != 0 ? -51469024059457536L : j11;
        long j65 = (i & 512) != 0 ? -4581905471111168L : j10;
        long j66 = (i & 256) != 0 ? -6510242707800064L : j9;
        long j67 = (i & 128) != 0 ? -51153301013528576L : j8;
        long j68 = (i & 64) != 0 ? -57652613029560320L : j7;
        long j69 = (i & 32) != 0 ? -14422448640360448L : j6;
        long j70 = (i & 16) != 0 ? -42977006131871744L : j5;
        long j71 = (i & 8) != 0 ? -5948362201235456L : j4;
        return new defpackage.bor(j45, (i & 2) != 0 ? -56261520367026176L : j2, (i & 4) != 0 ? -49760000737804288L : j3, j71, j70, j69, j68, j67, j66, j65, j64, j63, j62, j61, j60, j59, j58, j57, j56, j55, j54, j53, j52, j51, j50, j49, j48, j47, j46, j26, j32, j27, j28, j29, j30, j31, j33, j34, j35, j36, j37, j38, j39, j40, j41, j42, j43, j44);
    }
}
