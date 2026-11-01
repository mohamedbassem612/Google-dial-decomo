package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class acyd implements ajat {
    public final /* synthetic */ acyu a;
    public final /* synthetic */ defpackage.acwe b;
    public final /* synthetic */ java.lang.String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ defpackage.acvr e;
    public final /* synthetic */ defpackage.acvu f;
    public final /* synthetic */ int g;

    public /* synthetic */ acyd(acyu acyuVar, defpackage.acwe acweVar, java.lang.String str, long j, defpackage.acvr acvrVar, defpackage.acvu acvuVar, int i) {
        this.a = acyuVar;
        this.b = acweVar;
        this.c = str;
        this.d = j;
        this.e = acvrVar;
        this.f = acvuVar;
        this.g = i;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [aczw, java.lang.Object] */
    public final ajcq a(java.lang.Object obj) {
        akzx akzxVarM = defpackage.acwg.a.m();
        defpackage.acwa acwaVar = defpackage.acwa.DOWNLOAD_COMPLETE;
        akzxVarM.u();
        defpackage.acwg acwgVar = (defpackage.acwg) akzxVarM.b;
        acwgVar.d = acwaVar.h;
        acwgVar.b |= 2;
        akzxVarM.u();
        defpackage.acwg acwgVar2 = (defpackage.acwg) akzxVarM.b;
        java.lang.String str = this.c;
        java.lang.String strConcat = "android_shared_".concat(java.lang.String.valueOf(str));
        j$.util.Objects.requireNonNull(strConcat);
        acwgVar2.b |= 1;
        acwgVar2.c = strConcat;
        akzxVarM.u();
        defpackage.acwg acwgVar3 = (defpackage.acwg) akzxVarM.b;
        acwgVar3.b |= 4;
        acwgVar3.e = true;
        akzxVarM.u();
        defpackage.acwg acwgVar4 = (defpackage.acwg) akzxVarM.b;
        acwgVar4.b |= 8;
        final long j = this.d;
        acwgVar4.f = j;
        akzxVarM.u();
        defpackage.acwg acwgVar5 = (defpackage.acwg) akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        acwgVar5.b |= 16;
        acwgVar5.g = str;
        defpackage.acwg acwgVar6 = (defpackage.acwg) akzxVarM.p();
        final acyu acyuVar = this.a;
        ajcq ajcqVarH = acyuVar.j.e.h(this.b, acwgVar6);
        final defpackage.acvr acvrVar = this.e;
        final defpackage.acvu acvuVar = this.f;
        final int i = this.g;
        return acyuVar.q(ajcqVarH, new ajat() { // from class: acyn
            public final ajcq a(java.lang.Object obj2) {
                boolean zBooleanValue = ((java.lang.Boolean) obj2).booleanValue();
                acyu acyuVar2 = acyuVar;
                defpackage.acvu acvuVar2 = acvuVar;
                defpackage.acvr acvrVar2 = acvrVar;
                if (!zBooleanValue) {
                    adbe.e("%s: Failed to set new state for file %s, filegroup %s", new java.lang.Object[]{"FileGroupManager", acvrVar2.c, acvuVar2.d});
                    acyu.B(acyuVar2.b, acvuVar2, acvrVar2, 15);
                    return aiql.z(java.lang.Boolean.FALSE);
                }
                long j2 = j;
                int i2 = i;
                adba adbaVar = acyuVar2.b;
                akzx akzxVarM2 = aiwp.a.m();
                akzxVarM2.u();
                aiwp aiwpVar = akzxVarM2.b;
                aiwpVar.c = airh.k(i2);
                aiwpVar.b |= 1;
                java.lang.String str2 = acvuVar2.d;
                akzxVarM2.u();
                aiwp aiwpVar2 = akzxVarM2.b;
                j$.util.Objects.requireNonNull(str2);
                aiwpVar2.b |= 2;
                aiwpVar2.d = str2;
                int i3 = acvuVar2.f;
                akzxVarM2.u();
                aiwp aiwpVar3 = akzxVarM2.b;
                aiwpVar3.b |= 4;
                aiwpVar3.e = i3;
                long j3 = acvuVar2.s;
                akzxVarM2.u();
                aiwp aiwpVar4 = akzxVarM2.b;
                aiwpVar4.b |= 128;
                aiwpVar4.i = j3;
                java.lang.String str3 = acvuVar2.t;
                akzxVarM2.u();
                aiwp aiwpVar5 = akzxVarM2.b;
                j$.util.Objects.requireNonNull(str3);
                aiwpVar5.b |= 256;
                aiwpVar5.j = str3;
                java.lang.String str4 = acvrVar2.c;
                akzxVarM2.u();
                aiwp aiwpVar6 = akzxVarM2.b;
                j$.util.Objects.requireNonNull(str4);
                aiwpVar6.b |= 8;
                aiwpVar6.f = str4;
                akzxVarM2.u();
                aiwp aiwpVar7 = akzxVarM2.b;
                aiwpVar7.b |= 16;
                aiwpVar7.g = true;
                akzxVarM2.u();
                aiwp aiwpVar8 = akzxVarM2.b;
                aiwpVar8.b |= 32;
                aiwpVar8.h = j2;
                adbaVar.e(akzxVarM2.p());
                return aiql.z(java.lang.Boolean.TRUE);
            }
        });
    }
}
