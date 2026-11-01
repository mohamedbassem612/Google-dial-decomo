package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wat {
    private static final aimz a = aimz.i("com/android/dialer/wear/crossdevicemetrics/impl/CrossDeviceMetricsPhoneMetricsCollector");
    private final defpackage.zde b;
    private final rsr c;
    private final zzx d;

    public wat(defpackage.zde zdeVar, rsr rsrVar, zzx zzxVar) {
        this.b = zdeVar;
        this.c = rsrVar;
        this.d = zzxVar;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x013c  */
    /* JADX WARN: Code duplicated, block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.was wasVar;
        akzx akzxVarM;
        ailj ailjVarK;
        ajyi ajyiVar;
        ajyi ajyiVar2;
        ajyi ajyiVar3;
        ajyi ajyiVar4;
        ajyi ajyiVar5;
        akzx akzxVar;
        ajyi ajyiVar6;
        if (aolnVar instanceof defpackage.was) {
            wasVar = (defpackage.was) aolnVar;
            int i = wasVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                wasVar.d = i - Integer.MIN_VALUE;
            } else {
                wasVar = new defpackage.was(this, aolnVar);
            }
        } else {
            wasVar = new defpackage.was(this, aolnVar);
        }
        java.lang.Object objA = wasVar.b;
        aolu aoluVar = aolu.a;
        int i2 = wasVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                ailjVarK = (ailj) wasVar.a;
                akzxVarM = wasVar.e;
                aooc.af(objA);
            } else if (i2 == 2) {
                ajyi ajyiVar7 = wasVar.g;
                ajyi ajyiVar8 = wasVar.f;
                ajyi ajyiVar9 = (ajyi) wasVar.a;
                akzx akzxVar2 = wasVar.e;
                aooc.af(objA);
                ajyiVar2 = ajyiVar7;
                ajyiVar = ajyiVar8;
                akzxVarM = akzxVar2;
                ajyiVar3 = ajyiVar9;
                java.lang.String str = (java.lang.String) objA;
                aooh.f(str, "value");
                akzx akzxVar3 = (akzx) ajyiVar2.a;
                akzxVar3.u();
                defpackage.amte amteVar = (defpackage.amte) akzxVar3.b;
                defpackage.amte amteVar2 = defpackage.amte.a;
                j$.util.Objects.requireNonNull(str);
                amteVar.b |= 1;
                amteVar.c = str;
                java.lang.String str2 = android.os.Build.ID;
                aooh.e(str2, "ID");
                aooh.f(str2, "value");
                akzx akzxVar4 = (akzx) ajyiVar.a;
                akzxVar4.u();
                defpackage.amte amteVar3 = (defpackage.amte) akzxVar4.b;
                j$.util.Objects.requireNonNull(str2);
                amteVar3.b |= 2;
                amteVar3.d = str2;
                java.lang.String str3 = android.os.Build.DEVICE;
                aooh.e(str3, "DEVICE");
                aooh.f(str3, "value");
                akzxVar4.u();
                defpackage.amte amteVar4 = (defpackage.amte) akzxVar4.b;
                j$.util.Objects.requireNonNull(str3);
                amteVar4.b |= 4;
                amteVar4.e = str3;
                wasVar.e = akzxVarM;
                wasVar.a = ajyiVar3;
                wasVar.f = ajyiVar;
                wasVar.g = ajyiVar;
                wasVar.d = 3;
                objA = this.c.b(wasVar);
                if (objA != aoluVar) {
                    return aoluVar;
                }
                ajyiVar4 = ajyiVar;
                ajyiVar5 = ajyiVar4;
                akzxVar = akzxVarM;
                ajyiVar6 = ajyiVar3;
            } else {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ajyiVar4 = wasVar.g;
                ajyiVar5 = wasVar.f;
                ajyiVar6 = (ajyi) wasVar.a;
                akzxVar = wasVar.e;
                aooc.af(objA);
            }
            java.lang.String str4 = (java.lang.String) objA;
            aooh.f(str4, "value");
            akzx akzxVar5 = (akzx) ajyiVar4.a;
            akzxVar5.u();
            defpackage.amte amteVar5 = (defpackage.amte) akzxVar5.b;
            defpackage.amte amteVar6 = defpackage.amte.a;
            j$.util.Objects.requireNonNull(str4);
            amteVar5.b |= 8;
            amteVar5.f = str4;
            int i3 = android.os.Build.VERSION.SDK_INT;
            akzx akzxVar6 = (akzx) ajyiVar5.a;
            akzxVar6.u();
            defpackage.amte amteVar7 = (defpackage.amte) akzxVar6.b;
            amteVar7.b |= 16;
            amteVar7.g = i3;
            alad aladVarP = akzxVar.p();
            aooh.e(aladVarP, "build(...)");
            defpackage.amtd amtdVar = (defpackage.amtd) aladVarP;
            aooh.f(amtdVar, "value");
            akzxVar6.u();
            defpackage.amte amteVar8 = (defpackage.amte) akzxVar6.b;
            j$.util.Objects.requireNonNull(amtdVar);
            amteVar8.h = amtdVar;
            amteVar8.b |= 32;
            alad aladVarP2 = ((akzx) ajyiVar6.a).p();
            aooh.e(aladVarP2, "build(...)");
            return (defpackage.amte) aladVarP2;
        }
        aooc.af(objA);
        a.b().l("com/android/dialer/wear/crossdevicemetrics/impl/CrossDeviceMetricsPhoneMetricsCollector", "collectPhoneMetrics", 25, "CrossDeviceMetricsPhoneMetricsCollector.kt").v("Collecting Phone Dialer Metrics for Cross Device Metrics.");
        akzxVarM = defpackage.amtd.a.m();
        aooh.e(akzxVarM, "newBuilder(...)");
        ailjVarK = this.d.e().k();
        aooh.e(ailjVarK, "iterator(...)");
        while (ailjVarK.hasNext()) {
            defpackage.waj wajVar = (defpackage.waj) ailjVarK.next();
            wasVar.e = akzxVarM;
            wasVar.a = ailjVarK;
            wasVar.d = 1;
            if (wajVar.a(akzxVarM, wasVar) == aoluVar) {
                return aoluVar;
            }
        }
        akzx akzxVarM2 = defpackage.amte.a.m();
        aooh.f(akzxVarM2, "builder");
        ajyiVar = new ajyi(akzxVarM2);
        defpackage.zde zdeVar = this.b;
        wasVar.e = akzxVarM;
        wasVar.a = ajyiVar;
        wasVar.f = ajyiVar;
        wasVar.g = ajyiVar;
        wasVar.d = 2;
        objA = zdeVar.a(wasVar);
        if (objA == aoluVar) {
            return aoluVar;
        }
        ajyiVar2 = ajyiVar;
        ajyiVar3 = ajyiVar2;
        java.lang.String str5 = (java.lang.String) objA;
        aooh.f(str5, "value");
        akzx akzxVar7 = (akzx) ajyiVar2.a;
        akzxVar7.u();
        defpackage.amte amteVar9 = (defpackage.amte) akzxVar7.b;
        defpackage.amte amteVar10 = defpackage.amte.a;
        j$.util.Objects.requireNonNull(str5);
        amteVar9.b |= 1;
        amteVar9.c = str5;
        java.lang.String str6 = android.os.Build.ID;
        aooh.e(str6, "ID");
        aooh.f(str6, "value");
        akzx akzxVar8 = (akzx) ajyiVar.a;
        akzxVar8.u();
        defpackage.amte amteVar11 = (defpackage.amte) akzxVar8.b;
        j$.util.Objects.requireNonNull(str6);
        amteVar11.b |= 2;
        amteVar11.d = str6;
        java.lang.String str7 = android.os.Build.DEVICE;
        aooh.e(str7, "DEVICE");
        aooh.f(str7, "value");
        akzxVar8.u();
        defpackage.amte amteVar12 = (defpackage.amte) akzxVar8.b;
        j$.util.Objects.requireNonNull(str7);
        amteVar12.b |= 4;
        amteVar12.e = str7;
        wasVar.e = akzxVarM;
        wasVar.a = ajyiVar3;
        wasVar.f = ajyiVar;
        wasVar.g = ajyiVar;
        wasVar.d = 3;
        objA = this.c.b(wasVar);
        if (objA != aoluVar) {
            return aoluVar;
        }
        ajyiVar4 = ajyiVar;
        ajyiVar5 = ajyiVar4;
        akzxVar = akzxVarM;
        ajyiVar6 = ajyiVar3;
        java.lang.String str8 = (java.lang.String) objA;
        aooh.f(str8, "value");
        akzx akzxVar9 = (akzx) ajyiVar4.a;
        akzxVar9.u();
        defpackage.amte amteVar13 = (defpackage.amte) akzxVar9.b;
        defpackage.amte amteVar14 = defpackage.amte.a;
        j$.util.Objects.requireNonNull(str8);
        amteVar13.b |= 8;
        amteVar13.f = str8;
        int i4 = android.os.Build.VERSION.SDK_INT;
        akzx akzxVar10 = (akzx) ajyiVar5.a;
        akzxVar10.u();
        defpackage.amte amteVar15 = (defpackage.amte) akzxVar10.b;
        amteVar15.b |= 16;
        amteVar15.g = i4;
        alad aladVarP3 = akzxVar.p();
        aooh.e(aladVarP3, "build(...)");
        defpackage.amtd amtdVar2 = (defpackage.amtd) aladVarP3;
        aooh.f(amtdVar2, "value");
        akzxVar10.u();
        defpackage.amte amteVar16 = (defpackage.amte) akzxVar10.b;
        j$.util.Objects.requireNonNull(amtdVar2);
        amteVar16.h = amtdVar2;
        amteVar16.b |= 32;
        alad aladVarP4 = ((akzx) ajyiVar6.a).p();
        aooh.e(aladVarP4, "build(...)");
        return (defpackage.amte) aladVarP4;
    }
}
