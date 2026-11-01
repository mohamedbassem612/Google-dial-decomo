package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class aexk implements defpackage.aaua {
    @Override // defpackage.aaua
    public final java.lang.Object a(defpackage.aaum aaumVar) {
        int i;
        int i2;
        defpackage.aexh aexhVar;
        com.google.android.gms.phenotype.Configurations configurations = (com.google.android.gms.phenotype.Configurations) aaumVar.g();
        defpackage.akzx akzxVarM = defpackage.aexg.a.m();
        java.lang.String str = configurations.a;
        akzxVarM.u();
        defpackage.aexg aexgVar = (defpackage.aexg) akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        int i3 = 1;
        aexgVar.b |= 1;
        aexgVar.c = str;
        java.lang.String str2 = configurations.c;
        akzxVarM.u();
        defpackage.aexg aexgVar2 = (defpackage.aexg) akzxVarM.b;
        j$.util.Objects.requireNonNull(str2);
        int i4 = 4;
        aexgVar2.b |= 4;
        aexgVar2.e = str2;
        boolean z = configurations.f;
        akzxVarM.u();
        defpackage.aexg aexgVar3 = (defpackage.aexg) akzxVarM.b;
        aexgVar3.b |= 8;
        aexgVar3.h = z;
        long j = configurations.g;
        akzxVarM.u();
        defpackage.aexg aexgVar4 = (defpackage.aexg) akzxVarM.b;
        aexgVar4.b |= 16;
        aexgVar4.i = j;
        byte[] bArr = configurations.b;
        int i5 = 2;
        int i6 = 0;
        if (bArr != null) {
            int length = bArr.length;
            defpackage.akzc akzcVar = defpackage.akzc.d;
            try {
                defpackage.akzc akzcVarE = defpackage.akzc.E(bArr, 0, length);
                akzxVarM.u();
                defpackage.aexg aexgVar5 = (defpackage.aexg) akzxVarM.b;
                j$.util.Objects.requireNonNull(akzcVarE);
                aexgVar5.b |= 2;
                aexgVar5.d = akzcVarE;
            } catch (defpackage.alaz e) {
                throw new java.lang.AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
            }
        }
        com.google.android.gms.phenotype.Configuration[] configurationArr = configurations.d;
        int length2 = configurationArr.length;
        int i7 = 0;
        while (i7 < length2) {
            com.google.android.gms.phenotype.Configuration configuration = configurationArr[i7];
            com.google.android.gms.phenotype.Flag[] flagArr = configuration.b;
            int length3 = flagArr.length;
            int i8 = i6;
            while (i8 < length3) {
                com.google.android.gms.phenotype.Flag flag = flagArr[i8];
                int i9 = flag.g;
                if (i9 == i3) {
                    i = i5;
                    int i10 = i3;
                    i2 = i4;
                    defpackage.akzx akzxVarM2 = defpackage.aexh.a.m();
                    java.lang.String str3 = flag.a;
                    akzxVarM2.u();
                    defpackage.aexh aexhVar2 = (defpackage.aexh) akzxVarM2.b;
                    j$.util.Objects.requireNonNull(str3);
                    aexhVar2.b |= 1;
                    aexhVar2.e = str3;
                    long jB = flag.b();
                    akzxVarM2.u();
                    defpackage.aexh aexhVar3 = (defpackage.aexh) akzxVarM2.b;
                    aexhVar3.c = i10;
                    aexhVar3.d = java.lang.Long.valueOf(jB);
                    aexhVar = (defpackage.aexh) akzxVarM2.r();
                } else if (i9 != i5) {
                    if (i9 == 3) {
                        i2 = i4;
                        defpackage.akzx akzxVarM3 = defpackage.aexh.a.m();
                        java.lang.String str4 = flag.a;
                        akzxVarM3.u();
                        defpackage.aexh aexhVar4 = (defpackage.aexh) akzxVarM3.b;
                        j$.util.Objects.requireNonNull(str4);
                        aexhVar4.b |= 1;
                        aexhVar4.e = str4;
                        double dA = flag.a();
                        akzxVarM3.u();
                        defpackage.aexh aexhVar5 = (defpackage.aexh) akzxVarM3.b;
                        aexhVar5.c = 3;
                        aexhVar5.d = java.lang.Double.valueOf(dA);
                        aexhVar = (defpackage.aexh) akzxVarM3.r();
                    } else if (i9 == i4) {
                        defpackage.akzx akzxVarM4 = defpackage.aexh.a.m();
                        java.lang.String str5 = flag.a;
                        akzxVarM4.u();
                        defpackage.aexh aexhVar6 = (defpackage.aexh) akzxVarM4.b;
                        j$.util.Objects.requireNonNull(str5);
                        aexhVar6.b |= 1;
                        aexhVar6.e = str5;
                        java.lang.String strC = flag.c();
                        akzxVarM4.u();
                        defpackage.aexh aexhVar7 = (defpackage.aexh) akzxVarM4.b;
                        j$.util.Objects.requireNonNull(strC);
                        i2 = 4;
                        aexhVar7.c = 4;
                        aexhVar7.d = strC;
                        aexhVar = (defpackage.aexh) akzxVarM4.r();
                    } else {
                        if (i9 != 5) {
                            throw new java.lang.IllegalArgumentException(defpackage.a.bj(i9, "Unrecognized flag type: "));
                        }
                        defpackage.akzx akzxVarM5 = defpackage.aexh.a.m();
                        java.lang.String str6 = flag.a;
                        akzxVarM5.u();
                        defpackage.aexh aexhVar8 = (defpackage.aexh) akzxVarM5.b;
                        j$.util.Objects.requireNonNull(str6);
                        aexhVar8.b |= 1;
                        aexhVar8.e = str6;
                        byte[] bArrF = flag.f();
                        int length4 = bArrF.length;
                        defpackage.akzc akzcVar2 = defpackage.akzc.d;
                        try {
                            defpackage.akzc akzcVarE2 = defpackage.akzc.E(bArrF, i6, length4);
                            akzxVarM5.u();
                            defpackage.aexh aexhVar9 = (defpackage.aexh) akzxVarM5.b;
                            j$.util.Objects.requireNonNull(akzcVarE2);
                            aexhVar9.c = 5;
                            aexhVar9.d = akzcVarE2;
                            aexhVar = (defpackage.aexh) akzxVarM5.r();
                            i = 2;
                            i2 = 4;
                        } catch (defpackage.alaz e2) {
                            throw new java.lang.AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e2);
                        }
                    }
                    i = 2;
                } else {
                    i2 = i4;
                    defpackage.akzx akzxVarM6 = defpackage.aexh.a.m();
                    java.lang.String str7 = flag.a;
                    akzxVarM6.u();
                    defpackage.aexh aexhVar10 = (defpackage.aexh) akzxVarM6.b;
                    j$.util.Objects.requireNonNull(str7);
                    aexhVar10.b |= 1;
                    aexhVar10.e = str7;
                    boolean zE = flag.e();
                    akzxVarM6.u();
                    defpackage.aexh aexhVar11 = (defpackage.aexh) akzxVarM6.b;
                    i = 2;
                    aexhVar11.c = 2;
                    aexhVar11.d = java.lang.Boolean.valueOf(zE);
                    aexhVar = (defpackage.aexh) akzxVarM6.r();
                }
                akzxVarM.u();
                defpackage.aexg aexgVar6 = (defpackage.aexg) akzxVarM.b;
                j$.util.Objects.requireNonNull(aexhVar);
                defpackage.alat alatVar = aexgVar6.f;
                if (!alatVar.c()) {
                    aexgVar6.f = alatVar.d(alatVar.size() << 1);
                }
                aexgVar6.f.add(aexhVar);
                i8++;
                i5 = i;
                i4 = i2;
                i3 = 1;
                i6 = 0;
            }
            int i11 = i5;
            int i12 = i4;
            java.lang.String[] strArr = configuration.c;
            if (strArr != null) {
                for (java.lang.String str8 : strArr) {
                    akzxVarM.u();
                    defpackage.aexg aexgVar7 = (defpackage.aexg) akzxVarM.b;
                    j$.util.Objects.requireNonNull(str8);
                    defpackage.alat alatVar2 = aexgVar7.g;
                    if (!alatVar2.c()) {
                        aexgVar7.g = alatVar2.d(alatVar2.size() << 1);
                    }
                    aexgVar7.g.add(str8);
                }
            }
            i7++;
            i5 = i11;
            i4 = i12;
            i3 = 1;
            i6 = 0;
        }
        return (defpackage.aexg) akzxVarM.r();
    }
}
