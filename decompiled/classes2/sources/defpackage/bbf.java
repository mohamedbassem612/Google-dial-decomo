package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bbf extends aomh implements aonn {
    private final /* synthetic */ int $cid;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bbf(aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.$cid) {
            case 0:
                new defpackage.bbf((aoln) obj2, 0);
                aojh aojhVar = aojh.a;
                aooc.af(aojhVar);
                return aojhVar;
            case 1:
                new defpackage.bbf((aoln) obj2, 1, (byte[]) null);
                return anar.o(aojh.a);
            case 2:
                return new defpackage.bbf((aoln) obj2, 2, (char[]) null).b(aojh.a);
            case 3:
                return new defpackage.bbf((aoln) obj2, 3, (short[]) null).b(aojh.a);
            case 4:
                new defpackage.bbf((aoln) obj2, 4, (int[]) null);
                return anar.o(aojh.a);
            case 5:
                return new defpackage.bbf((aoln) obj2, 5, (boolean[]) null).b(aojh.a);
            case 6:
                return new defpackage.bbf((aoln) obj2, 6, (float[]) null).b(aojh.a);
            case 7:
                return new defpackage.bbf((aoln) obj2, 7, (byte[][]) null).b(aojh.a);
            case 8:
                return new defpackage.bbf((aoln) obj2, 8, (char[][]) null).b(aojh.a);
            case 9:
                return new defpackage.bbf((aoln) obj2, 9, (short[][]) null).b(aojh.a);
            case 10:
                return new defpackage.bbf((aoln) obj2, 10, (int[][]) null).b(aojh.a);
            case 11:
                return new defpackage.bbf((aoln) obj2, 11, (boolean[][]) null).b(aojh.a);
            case 12:
                return new defpackage.bbf((aoln) obj2, 12, (float[][]) null).b(aojh.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                new defpackage.bbf((aoln) obj2, 13, (byte[][][]) null).b(aojh.a);
                return null;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return new defpackage.bbf((aoln) obj2, 14, (char[][][]) null).b(aojh.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return new defpackage.bbf((aoln) obj2, 15, (short[][][]) null).b(aojh.a);
            case 16:
                return new defpackage.bbf((aoln) obj2, 16, (int[][][]) null).b(aojh.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                new defpackage.bbf((aoln) obj2, 17, (boolean[][][]) null);
                return anar.o(aojh.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                new defpackage.bbf((aoln) obj2, 18, (float[][][]) null);
                aooc.af(aojh.a);
                return null;
            default:
                new defpackage.bbf((aoln) obj2, 19, null, null);
                return anar.o(aojh.a);
        }
    }

    public final java.lang.Object b(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                aooc.af(obj);
                return aojh.a;
            case 1:
                return anar.o(obj);
            case 2:
                aooc.af(obj);
                return android.view.Choreographer.getInstance();
            case 3:
                aooc.af(obj);
                return java.lang.Boolean.TRUE;
            case 4:
                return anar.o(obj);
            case 5:
                aooc.af(obj);
                akzx akzxVarM = defpackage.mhi.a.m();
                aooh.f(akzxVarM, "builder");
                int i = android.os.Build.VERSION.SDK_INT;
                akzxVarM.u();
                defpackage.mhi mhiVar = (defpackage.mhi) akzxVarM.b;
                mhiVar.b |= 1;
                mhiVar.c = i;
                int i2 = android.os.Build.VERSION.PREVIEW_SDK_INT;
                akzxVarM.u();
                defpackage.mhi mhiVar2 = (defpackage.mhi) akzxVarM.b;
                mhiVar2.b |= 2;
                mhiVar2.d = i2;
                java.lang.String str = android.os.Build.VERSION.RELEASE;
                aooh.e(str, "RELEASE");
                aooh.f(str, "value");
                akzxVarM.u();
                defpackage.mhi mhiVar3 = (defpackage.mhi) akzxVarM.b;
                j$.util.Objects.requireNonNull(str);
                mhiVar3.b |= 4;
                mhiVar3.e = str;
                java.lang.String str2 = android.os.Build.MANUFACTURER;
                aooh.e(str2, "MANUFACTURER");
                aooh.f(str2, "value");
                akzxVarM.u();
                defpackage.mhi mhiVar4 = (defpackage.mhi) akzxVarM.b;
                j$.util.Objects.requireNonNull(str2);
                mhiVar4.b |= 8;
                mhiVar4.f = str2;
                java.lang.String str3 = android.os.Build.MODEL;
                aooh.e(str3, "MODEL");
                aooh.f(str3, "value");
                akzxVarM.u();
                defpackage.mhi mhiVar5 = (defpackage.mhi) akzxVarM.b;
                j$.util.Objects.requireNonNull(str3);
                mhiVar5.b |= 16;
                mhiVar5.g = str3;
                java.lang.String str4 = android.os.Build.PRODUCT;
                aooh.e(str4, "PRODUCT");
                aooh.f(str4, "value");
                akzxVarM.u();
                defpackage.mhi mhiVar6 = (defpackage.mhi) akzxVarM.b;
                j$.util.Objects.requireNonNull(str4);
                mhiVar6.b |= 32;
                mhiVar6.h = str4;
                java.lang.String str5 = android.os.Build.BRAND;
                aooh.e(str5, "BRAND");
                aooh.f(str5, "value");
                akzxVarM.u();
                defpackage.mhi mhiVar7 = (defpackage.mhi) akzxVarM.b;
                j$.util.Objects.requireNonNull(str5);
                mhiVar7.b |= 64;
                mhiVar7.i = str5;
                java.lang.String str6 = android.os.Build.DEVICE;
                aooh.e(str6, "DEVICE");
                aooh.f(str6, "value");
                akzxVarM.u();
                defpackage.mhi mhiVar8 = (defpackage.mhi) akzxVarM.b;
                j$.util.Objects.requireNonNull(str6);
                mhiVar8.b |= 128;
                mhiVar8.j = str6;
                java.lang.String id = java.util.TimeZone.getDefault().getID();
                aooh.e(id, "getID(...)");
                aooh.f(id, "value");
                akzxVarM.u();
                defpackage.mhi mhiVar9 = (defpackage.mhi) akzxVarM.b;
                j$.util.Objects.requireNonNull(id);
                mhiVar9.b |= 512;
                mhiVar9.k = id;
                alad aladVarP = akzxVarM.p();
                aooh.e(aladVarP, "build(...)");
                return mni.aJ((defpackage.mhi) aladVarP, new defpackage.mhs(0));
            case 6:
                aooc.af(obj);
                return java.lang.Boolean.TRUE;
            case 7:
                aooc.af(obj);
                return gus.aP(mvm.a.m()).K();
            case 8:
                aooc.af(obj);
                return gus.aP(mvm.a.m()).K();
            case 9:
                aooc.af(obj);
                defpackage.hgw hgwVarBu = pez.bu(ruy.a.m());
                hgwVarBu.A(pez.bt(ruw.a.m()).y());
                return hgwVarBu.z();
            case 10:
                aooc.af(obj);
                return abxl.L("STATE_SWITCHBOARD_CULDESAC_ENABLED", 1);
            case 11:
                aooc.af(obj);
                sdc sdcVar = sdc.a;
                aooh.e(sdcVar, "getDefaultInstance(...)");
                return sdcVar;
            case 12:
                aooc.af(obj);
                sfd sfdVar = sfd.a;
                aooh.e(sfdVar, "getDefaultInstance(...)");
                return sfdVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                aooc.af(obj);
                swi.a.b().l("com/android/dialer/prefetchedcall/impl/PrefetchedCallImpl", "onCallScreeningStarted$<anonymous>", 60, "PrefetchedCallImpl.kt").v("enter onCallScreeningStarted");
                return null;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                aooc.af(obj);
                defpackage.hgw hgwVarBu2 = pez.bu(ruy.a.m());
                hgwVarBu2.B(pez.bs(rux.a.m()).x());
                return hgwVarBu2.z();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                aooc.af(obj);
                return wsc.cx(tlf.a.m()).ah();
            case 16:
                aooc.af(obj);
                return wsc.cx(tlf.a.m()).ah();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return anar.o(obj);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                aooc.af(obj);
                return null;
            default:
                return anar.o(obj);
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        switch (this.$cid) {
            case 0:
                return new defpackage.bbf(aolnVar, 0);
            case 1:
                return new defpackage.bbf(aolnVar, 1, (byte[]) null);
            case 2:
                return new defpackage.bbf(aolnVar, 2, (char[]) null);
            case 3:
                return new defpackage.bbf(aolnVar, 3, (short[]) null);
            case 4:
                return new defpackage.bbf(aolnVar, 4, (int[]) null);
            case 5:
                return new defpackage.bbf(aolnVar, 5, (boolean[]) null);
            case 6:
                return new defpackage.bbf(aolnVar, 6, (float[]) null);
            case 7:
                return new defpackage.bbf(aolnVar, 7, (byte[][]) null);
            case 8:
                return new defpackage.bbf(aolnVar, 8, (char[][]) null);
            case 9:
                return new defpackage.bbf(aolnVar, 9, (short[][]) null);
            case 10:
                return new defpackage.bbf(aolnVar, 10, (int[][]) null);
            case 11:
                return new defpackage.bbf(aolnVar, 11, (boolean[][]) null);
            case 12:
                return new defpackage.bbf(aolnVar, 12, (float[][]) null);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return new defpackage.bbf(aolnVar, 13, (byte[][][]) null);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return new defpackage.bbf(aolnVar, 14, (char[][][]) null);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return new defpackage.bbf(aolnVar, 15, (short[][][]) null);
            case 16:
                return new defpackage.bbf(aolnVar, 16, (int[][][]) null);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new defpackage.bbf(aolnVar, 17, (boolean[][][]) null);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new defpackage.bbf(aolnVar, 18, (float[][][]) null);
            default:
                return new defpackage.bbf(aolnVar, 19, null, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bbf(aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bbf(aoln aolnVar, int i, byte[] bArr, byte[] bArr2) {
        super(2, aolnVar);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bbf(aoln aolnVar, int i, char[] cArr) {
        super(2, aolnVar);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bbf(aoln aolnVar, int i, float[] fArr) {
        super(2, aolnVar);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bbf(aoln aolnVar, int i, int[] iArr) {
        super(2, aolnVar);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bbf(aoln aolnVar, int i, short[] sArr) {
        super(2, aolnVar);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bbf(aoln aolnVar, int i, boolean[] zArr) {
        super(2, aolnVar);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bbf(aoln aolnVar, int i, byte[][] bArr) {
        super(2, aolnVar);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bbf(aoln aolnVar, int i, char[][] cArr) {
        super(2, aolnVar);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bbf(aoln aolnVar, int i, float[][] fArr) {
        super(2, aolnVar);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bbf(aoln aolnVar, int i, int[][] iArr) {
        super(2, aolnVar);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bbf(aoln aolnVar, int i, short[][] sArr) {
        super(2, aolnVar);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bbf(aoln aolnVar, int i, boolean[][] zArr) {
        super(2, aolnVar);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bbf(aoln aolnVar, int i, byte[][][] bArr) {
        super(2, aolnVar);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bbf(aoln aolnVar, int i, char[][][] cArr) {
        super(2, aolnVar);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bbf(aoln aolnVar, int i, float[][][] fArr) {
        super(2, aolnVar);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bbf(aoln aolnVar, int i, int[][][] iArr) {
        super(2, aolnVar);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bbf(aoln aolnVar, int i, short[][][] sArr) {
        super(2, aolnVar);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bbf(aoln aolnVar, int i, boolean[][][] zArr) {
        super(2, aolnVar);
        this.$cid = i;
    }
}
