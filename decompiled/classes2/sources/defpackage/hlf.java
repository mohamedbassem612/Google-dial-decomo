package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hlf extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    int a;
    private /* synthetic */ java.lang.Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hlf(aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.$cid) {
            case 0:
                return c((aoxi) obj, (aoln) obj2).b(aojh.a);
            case 1:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 2:
                return c((aoxi) obj, (aoln) obj2).b(aojh.a);
            case 3:
                return c((java.util.List) obj, (aoln) obj2).b(aojh.a);
            case 4:
                return c((aoxi) obj, (aoln) obj2).b(aojh.a);
            case 5:
                return c((defpackage.jfg) obj, (aoln) obj2).b(aojh.a);
            case 6:
                return c((defpackage.jfg) obj, (aoln) obj2).b(aojh.a);
            case 7:
                return c((defpackage.jfg) obj, (aoln) obj2).b(aojh.a);
            case 8:
                return c((defpackage.jfg) obj, (aoln) obj2).b(aojh.a);
            case 9:
                return c((defpackage.jfg) obj, (aoln) obj2).b(aojh.a);
            case 10:
                return c((defpackage.jfg) obj, (aoln) obj2).b(aojh.a);
            case 11:
                return c((defpackage.jfg) obj, (aoln) obj2).b(aojh.a);
            case 12:
                return c((defpackage.jfg) obj, (aoln) obj2).b(aojh.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return c((defpackage.jfg) obj, (aoln) obj2).b(aojh.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return c((defpackage.jfg) obj, (aoln) obj2).b(aojh.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return c((aoxi) obj, (aoln) obj2).b(aojh.a);
            default:
                return c((aoxi) obj, (aoln) obj2).b(aojh.a);
        }
    }

    public final java.lang.Object b(java.lang.Object obj) {
        java.util.List list;
        switch (this.$cid) {
            case 0:
                aolu aoluVar = aolu.a;
                int i = this.a;
                aooc.af(obj);
                if (i == 0) {
                    aoxi aoxiVar = (aoxi) this.b;
                    aojh aojhVar = aojh.a;
                    this.a = 1;
                    if (aoxiVar.a(aojhVar, this) == aoluVar) {
                        return aoluVar;
                    }
                }
                return aojh.a;
            case 1:
                aoss aossVar = (aoss) this.b;
                aolu aoluVar2 = aolu.a;
                int i2 = this.a;
                aooc.af(obj);
                while (aooc.aa(aossVar.c())) {
                    apk apkVar = new apk(6);
                    this.b = aossVar;
                    this.a = 1;
                    if (cdh.d(u()).a(apkVar, this) == aoluVar2) {
                        return aoluVar2;
                    }
                }
                return aojh.a;
            case 2:
                aolu aoluVar3 = aolu.a;
                int i3 = this.a;
                aooc.af(obj);
                if (i3 == 0) {
                    aoxi aoxiVar2 = (aoxi) this.b;
                    aojh aojhVar2 = aojh.a;
                    this.a = 1;
                    if (aoxiVar2.a(aojhVar2, this) == aoluVar3) {
                        return aoluVar3;
                    }
                }
                return aojh.a;
            case 3:
                aolu aoluVar4 = aolu.a;
                if (this.a != 0) {
                    list = (java.util.List) this.b;
                    aooc.af(obj);
                } else {
                    aooc.af(obj);
                    java.util.List list2 = (java.util.List) this.b;
                    this.b = list2;
                    this.a = 1;
                    if (ahre.a((aolr) null, this) == aoluVar4) {
                        return aoluVar4;
                    }
                    list = list2;
                }
                boolean z = ahns.a;
                ahpe ahpeVarA = ahns.a();
                ahne ahneVar = ahpeVarA.e;
                if (ahneVar == null) {
                    throw new java.lang.IllegalStateException("reactiveTraced should be used within TikTok provided CoroutineContext");
                }
                ahnd ahndVar = ahneVar.b;
                if (ahndVar == ahnd.b) {
                    try {
                        return new defpackage.hlp(list);
                    } catch (java.lang.Throwable th) {
                        ahnn.b(th);
                        throw th;
                    }
                }
                if (ahndVar == ahnd.a) {
                    throw new java.lang.IllegalStateException("Already has a manually propagated trace, resuming executor trace may change causality.");
                }
                ahpj ahpjVarB = ahns.b();
                if (ahpjVarB != null && ahpjVarB != ahoo.a && ahpjVarB != ahneVar.c) {
                    throw new java.lang.IllegalStateException("Do not call reactiveTraced with the trace present: the reactive pattern should be used in long-lived coroutines to avoid trace leaks, and therefore having the trace present in the coroutine defeats the purpose. See go/tiktok/dev/concurrent/coroutines/tracing#flows");
                }
                ahob ahobVarM = ahpeVarA.d;
                if (ahobVarM == null) {
                    ahobVarM = ahob.m(ahpeVarA);
                }
                ahnd ahndVar2 = ahnd.b;
                ahnd ahndVar3 = ahneVar.b;
                if (ahobVarM == ahoo.a) {
                    ahndVar2 = ahnd.c;
                }
                ahneVar.b = ahndVar2;
                ahpj ahpjVarD = ahns.d(ahpeVarA, ahobVarM);
                try {
                    defpackage.hlp hlpVar = new defpackage.hlp(list);
                    ahns.d(ahns.a(), ahpjVarD);
                    ahneVar.b = ahndVar3;
                    return hlpVar;
                } catch (java.lang.Throwable th2) {
                    try {
                        ahnn.b(th2);
                        throw th2;
                    } catch (java.lang.Throwable th3) {
                        ahns.d(ahns.a(), ahpjVarD);
                        ahneVar.b = ahndVar3;
                        throw th3;
                    }
                }
            case 4:
                aolu aoluVar5 = aolu.a;
                int i4 = this.a;
                aooc.af(obj);
                if (i4 == 0) {
                    aoxi aoxiVar3 = (aoxi) this.b;
                    aojh aojhVar3 = aojh.a;
                    this.a = 1;
                    if (aoxiVar3.a(aojhVar3, this) == aoluVar5) {
                        return aoluVar5;
                    }
                }
                return aojh.a;
            case 5:
                aolu aoluVar6 = aolu.a;
                int i5 = this.a;
                aooc.af(obj);
                if (i5 == 0) {
                    defpackage.jfg jfgVar = (defpackage.jfg) this.b;
                    this.a = 1;
                    if (jfgVar.v() == aoluVar6) {
                        return aoluVar6;
                    }
                }
                return aojh.a;
            case 6:
                aolu aoluVar7 = aolu.a;
                int i6 = this.a;
                aooc.af(obj);
                if (i6 == 0) {
                    defpackage.jfg jfgVar2 = (defpackage.jfg) this.b;
                    this.a = 1;
                    if (jfgVar2.f(this) == aoluVar7) {
                        return aoluVar7;
                    }
                }
                return aojh.a;
            case 7:
                aolu aoluVar8 = aolu.a;
                int i7 = this.a;
                aooc.af(obj);
                if (i7 == 0) {
                    defpackage.jfg jfgVar3 = (defpackage.jfg) this.b;
                    this.a = 1;
                    if (jfgVar3.h(this) == aoluVar8) {
                        return aoluVar8;
                    }
                }
                return aojh.a;
            case 8:
                aolu aoluVar9 = aolu.a;
                int i8 = this.a;
                aooc.af(obj);
                if (i8 == 0) {
                    defpackage.jfg jfgVar4 = (defpackage.jfg) this.b;
                    this.a = 1;
                    if (jfgVar4.q() == aoluVar9) {
                        return aoluVar9;
                    }
                }
                return aojh.a;
            case 9:
                aolu aoluVar10 = aolu.a;
                int i9 = this.a;
                aooc.af(obj);
                if (i9 == 0) {
                    defpackage.jfg jfgVar5 = (defpackage.jfg) this.b;
                    defpackage.jfk jfkVar = defpackage.jfk.a;
                    this.a = 1;
                    if (jfgVar5.g(jfkVar, this) == aoluVar10) {
                        return aoluVar10;
                    }
                }
                return aojh.a;
            case 10:
                aolu aoluVar11 = aolu.a;
                int i10 = this.a;
                aooc.af(obj);
                if (i10 == 0) {
                    defpackage.jfg jfgVar6 = (defpackage.jfg) this.b;
                    this.a = 1;
                    if (jfgVar6.s() == aoluVar11) {
                        return aoluVar11;
                    }
                }
                return aojh.a;
            case 11:
                aolu aoluVar12 = aolu.a;
                int i11 = this.a;
                aooc.af(obj);
                if (i11 == 0) {
                    defpackage.jfg jfgVar7 = (defpackage.jfg) this.b;
                    this.a = 1;
                    if (jfgVar7.r() == aoluVar12) {
                        return aoluVar12;
                    }
                }
                return aojh.a;
            case 12:
                aolu aoluVar13 = aolu.a;
                int i12 = this.a;
                aooc.af(obj);
                if (i12 == 0) {
                    defpackage.jfg jfgVar8 = (defpackage.jfg) this.b;
                    this.a = 1;
                    if (jfgVar8.u() == aoluVar13) {
                        return aoluVar13;
                    }
                }
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                aolu aoluVar14 = aolu.a;
                int i13 = this.a;
                aooc.af(obj);
                if (i13 == 0) {
                    defpackage.jfg jfgVar9 = (defpackage.jfg) this.b;
                    defpackage.jfn jfnVar = defpackage.jfn.a;
                    this.a = 1;
                    if (jfgVar9.t(jfnVar) == aoluVar14) {
                        return aoluVar14;
                    }
                }
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                aolu aoluVar15 = aolu.a;
                int i14 = this.a;
                aooc.af(obj);
                if (i14 == 0) {
                    defpackage.jfg jfgVar10 = (defpackage.jfg) this.b;
                    this.a = 1;
                    if (jfgVar10.i(this) == aoluVar15) {
                        return aoluVar15;
                    }
                }
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                aolu aoluVar16 = aolu.a;
                int i15 = this.a;
                aooc.af(obj);
                if (i15 == 0) {
                    aoxi aoxiVar4 = (aoxi) this.b;
                    aojh aojhVar4 = aojh.a;
                    this.a = 1;
                    if (aoxiVar4.a(aojhVar4, this) == aoluVar16) {
                        return aoluVar16;
                    }
                }
                return aojh.a;
            default:
                aolu aoluVar17 = aolu.a;
                int i16 = this.a;
                aooc.af(obj);
                if (i16 == 0) {
                    aoxi aoxiVar5 = (aoxi) this.b;
                    aojh aojhVar5 = aojh.a;
                    this.a = 1;
                    if (aoxiVar5.a(aojhVar5, this) == aoluVar17) {
                        return aoluVar17;
                    }
                }
                return aojh.a;
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        switch (this.$cid) {
            case 0:
                defpackage.hlf hlfVar = new defpackage.hlf(aolnVar, 0);
                hlfVar.b = obj;
                return hlfVar;
            case 1:
                defpackage.hlf hlfVar2 = new defpackage.hlf(aolnVar, 1, (byte[]) null);
                hlfVar2.b = obj;
                return hlfVar2;
            case 2:
                defpackage.hlf hlfVar3 = new defpackage.hlf(aolnVar, 2, (char[]) null);
                hlfVar3.b = obj;
                return hlfVar3;
            case 3:
                defpackage.hlf hlfVar4 = new defpackage.hlf(aolnVar, 3, (short[]) null);
                hlfVar4.b = obj;
                return hlfVar4;
            case 4:
                defpackage.hlf hlfVar5 = new defpackage.hlf(aolnVar, 4, (int[]) null);
                hlfVar5.b = obj;
                return hlfVar5;
            case 5:
                defpackage.hlf hlfVar6 = new defpackage.hlf(aolnVar, 5, (boolean[]) null);
                hlfVar6.b = obj;
                return hlfVar6;
            case 6:
                defpackage.hlf hlfVar7 = new defpackage.hlf(aolnVar, 6, (float[]) null);
                hlfVar7.b = obj;
                return hlfVar7;
            case 7:
                defpackage.hlf hlfVar8 = new defpackage.hlf(aolnVar, 7, (byte[][]) null);
                hlfVar8.b = obj;
                return hlfVar8;
            case 8:
                defpackage.hlf hlfVar9 = new defpackage.hlf(aolnVar, 8, (char[][]) null);
                hlfVar9.b = obj;
                return hlfVar9;
            case 9:
                defpackage.hlf hlfVar10 = new defpackage.hlf(aolnVar, 9, (short[][]) null);
                hlfVar10.b = obj;
                return hlfVar10;
            case 10:
                defpackage.hlf hlfVar11 = new defpackage.hlf(aolnVar, 10, (int[][]) null);
                hlfVar11.b = obj;
                return hlfVar11;
            case 11:
                defpackage.hlf hlfVar12 = new defpackage.hlf(aolnVar, 11, (boolean[][]) null);
                hlfVar12.b = obj;
                return hlfVar12;
            case 12:
                defpackage.hlf hlfVar13 = new defpackage.hlf(aolnVar, 12, (float[][]) null);
                hlfVar13.b = obj;
                return hlfVar13;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                defpackage.hlf hlfVar14 = new defpackage.hlf(aolnVar, 13, (byte[][][]) null);
                hlfVar14.b = obj;
                return hlfVar14;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                defpackage.hlf hlfVar15 = new defpackage.hlf(aolnVar, 14, (char[][][]) null);
                hlfVar15.b = obj;
                return hlfVar15;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                defpackage.hlf hlfVar16 = new defpackage.hlf(aolnVar, 15, (short[][][]) null);
                hlfVar16.b = obj;
                return hlfVar16;
            default:
                defpackage.hlf hlfVar17 = new defpackage.hlf(aolnVar, 16, (int[][][]) null);
                hlfVar17.b = obj;
                return hlfVar17;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hlf(aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hlf(aoln aolnVar, int i, char[] cArr) {
        super(2, aolnVar);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hlf(aoln aolnVar, int i, float[] fArr) {
        super(2, aolnVar);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hlf(aoln aolnVar, int i, int[] iArr) {
        super(2, aolnVar);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hlf(aoln aolnVar, int i, short[] sArr) {
        super(2, aolnVar);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hlf(aoln aolnVar, int i, boolean[] zArr) {
        super(2, aolnVar);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hlf(aoln aolnVar, int i, byte[][] bArr) {
        super(2, aolnVar);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hlf(aoln aolnVar, int i, char[][] cArr) {
        super(2, aolnVar);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hlf(aoln aolnVar, int i, float[][] fArr) {
        super(2, aolnVar);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hlf(aoln aolnVar, int i, int[][] iArr) {
        super(2, aolnVar);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hlf(aoln aolnVar, int i, short[][] sArr) {
        super(2, aolnVar);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hlf(aoln aolnVar, int i, boolean[][] zArr) {
        super(2, aolnVar);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hlf(aoln aolnVar, int i, byte[][][] bArr) {
        super(2, aolnVar);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hlf(aoln aolnVar, int i, char[][][] cArr) {
        super(2, aolnVar);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hlf(aoln aolnVar, int i, int[][][] iArr) {
        super(2, aolnVar);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hlf(aoln aolnVar, int i, short[][][] sArr) {
        super(2, aolnVar);
        this.$cid = i;
    }
}
