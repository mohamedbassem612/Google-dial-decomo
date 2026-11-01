package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class qbn extends defpackage.amzm {
    private final amzg b;
    private final amzg c;

    public qbn(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new amzw(defpackage.qbn.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    @Override // defpackage.amzm
    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        android.telecom.Call.Details details = (android.telecom.Call.Details) list.get(0);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(1)).booleanValue();
        akzx akzxVarM = defpackage.amop.a.m();
        boolean zCan = details.can(4194304);
        akzxVarM.u();
        defpackage.amop amopVar = (defpackage.amop) akzxVarM.b;
        amopVar.b |= 1;
        amopVar.c = zCan;
        boolean zCan2 = details.can(1048576);
        akzxVarM.u();
        defpackage.amop amopVar2 = (defpackage.amop) akzxVarM.b;
        amopVar2.b |= 2;
        amopVar2.d = zCan2;
        boolean zCan3 = details.can(8388608);
        akzxVarM.u();
        defpackage.amop amopVar3 = (defpackage.amop) akzxVarM.b;
        amopVar3.b |= 4;
        amopVar3.e = zCan3;
        boolean zCan4 = details.can(8192);
        akzxVarM.u();
        defpackage.amop amopVar4 = (defpackage.amop) akzxVarM.b;
        amopVar4.b |= 8;
        amopVar4.f = zCan4;
        boolean zCan5 = details.can(1);
        akzxVarM.u();
        defpackage.amop amopVar5 = (defpackage.amop) akzxVarM.b;
        amopVar5.b |= 16;
        amopVar5.g = zCan5;
        boolean zCan6 = details.can(128);
        akzxVarM.u();
        defpackage.amop amopVar6 = (defpackage.amop) akzxVarM.b;
        amopVar6.b |= 32;
        amopVar6.h = zCan6;
        akzxVarM.u();
        defpackage.amop amopVar7 = (defpackage.amop) akzxVarM.b;
        amopVar7.b |= 64;
        amopVar7.i = zBooleanValue;
        boolean zCan7 = details.can(64);
        akzxVarM.u();
        defpackage.amop amopVar8 = (defpackage.amop) akzxVarM.b;
        amopVar8.b |= 128;
        amopVar8.j = zCan7;
        boolean zCan8 = details.can(32);
        akzxVarM.u();
        defpackage.amop amopVar9 = (defpackage.amop) akzxVarM.b;
        amopVar9.b |= 256;
        amopVar9.k = zCan8;
        boolean zCan9 = details.can(4096);
        akzxVarM.u();
        defpackage.amop amopVar10 = (defpackage.amop) akzxVarM.b;
        amopVar10.b |= 512;
        amopVar10.l = zCan9;
        boolean zCan10 = details.can(768);
        akzxVarM.u();
        defpackage.amop amopVar11 = (defpackage.amop) akzxVarM.b;
        amopVar11.b |= 1024;
        amopVar11.m = zCan10;
        boolean zCan11 = details.can(256);
        akzxVarM.u();
        defpackage.amop amopVar12 = (defpackage.amop) akzxVarM.b;
        amopVar12.b |= 2048;
        amopVar12.n = zCan11;
        boolean zCan12 = details.can(512);
        akzxVarM.u();
        defpackage.amop amopVar13 = (defpackage.amop) akzxVarM.b;
        amopVar13.b |= 4096;
        amopVar13.o = zCan12;
        boolean zCan13 = details.can(3072);
        akzxVarM.u();
        defpackage.amop amopVar14 = (defpackage.amop) akzxVarM.b;
        amopVar14.b |= 8192;
        amopVar14.p = zCan13;
        boolean zCan14 = details.can(1024);
        akzxVarM.u();
        defpackage.amop amopVar15 = (defpackage.amop) akzxVarM.b;
        amopVar15.b |= 16384;
        amopVar15.q = zCan14;
        boolean zCan15 = details.can(2048);
        akzxVarM.u();
        defpackage.amop amopVar16 = (defpackage.amop) akzxVarM.b;
        amopVar16.b |= 32768;
        amopVar16.r = zCan15;
        boolean zCan16 = details.can(2);
        akzxVarM.u();
        defpackage.amop amopVar17 = (defpackage.amop) akzxVarM.b;
        amopVar17.b |= 65536;
        amopVar17.s = zCan16;
        boolean zCan17 = details.can(8);
        akzxVarM.u();
        defpackage.amop amopVar18 = (defpackage.amop) akzxVarM.b;
        amopVar18.b |= 131072;
        amopVar18.t = zCan17;
        boolean zHasProperty = details.hasProperty(1);
        akzxVarM.u();
        defpackage.amop amopVar19 = (defpackage.amop) akzxVarM.b;
        amopVar19.b |= 262144;
        amopVar19.u = zHasProperty;
        boolean zHasProperty2 = details.hasProperty(4);
        akzxVarM.u();
        defpackage.amop amopVar20 = (defpackage.amop) akzxVarM.b;
        amopVar20.b |= 524288;
        amopVar20.v = zHasProperty2;
        boolean zHasProperty3 = details.hasProperty(32);
        akzxVarM.u();
        defpackage.amop amopVar21 = (defpackage.amop) akzxVarM.b;
        amopVar21.b |= 1048576;
        amopVar21.w = zHasProperty3;
        boolean zHasProperty4 = details.hasProperty(2);
        akzxVarM.u();
        defpackage.amop amopVar22 = (defpackage.amop) akzxVarM.b;
        amopVar22.b |= 2097152;
        amopVar22.x = zHasProperty4;
        boolean zHasProperty5 = details.hasProperty(128);
        akzxVarM.u();
        defpackage.amop amopVar23 = (defpackage.amop) akzxVarM.b;
        amopVar23.b |= 4194304;
        amopVar23.y = zHasProperty5;
        boolean zHasProperty6 = details.hasProperty(16);
        akzxVarM.u();
        defpackage.amop amopVar24 = (defpackage.amop) akzxVarM.b;
        amopVar24.b |= 8388608;
        amopVar24.z = zHasProperty6;
        boolean zHasProperty7 = details.hasProperty(64);
        akzxVarM.u();
        defpackage.amop amopVar25 = (defpackage.amop) akzxVarM.b;
        amopVar25.b |= 16777216;
        amopVar25.A = zHasProperty7;
        boolean zHasProperty8 = details.hasProperty(8);
        akzxVarM.u();
        defpackage.amop amopVar26 = (defpackage.amop) akzxVarM.b;
        amopVar26.b |= 33554432;
        amopVar26.B = zHasProperty8;
        boolean zHasProperty9 = details.hasProperty(1024);
        akzxVarM.u();
        defpackage.amop amopVar27 = (defpackage.amop) akzxVarM.b;
        amopVar27.b |= 67108864;
        amopVar27.C = zHasProperty9;
        boolean zHasProperty10 = details.hasProperty(16384);
        akzxVarM.u();
        defpackage.amop amopVar28 = (defpackage.amop) akzxVarM.b;
        amopVar28.b |= 134217728;
        amopVar28.D = zHasProperty10;
        return aiql.z((defpackage.amop) akzxVarM.p());
    }

    @Override // defpackage.amzm
    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
