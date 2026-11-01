package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class amct {
    private static final aimz a = aimz.i("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/CacheResultParser");

    public static int a(java.lang.String str) {
        return defpackage.ambu.a.j(str).size();
    }

    public static aify b(defpackage.amdq amdqVar, boolean z) {
        char c;
        int iA;
        j$.util.Optional optional = amdqVar.a;
        if (optional.isEmpty()) {
            return aike.a;
        }
        defpackage.ambv ambvVar = (defpackage.ambv) optional.get();
        aify aifyVar = ambvVar.e;
        int i = ambvVar.a;
        int i2 = i + 1;
        if (aifyVar.size() != i2) {
            a.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/CacheResultParser", "parseCorrection", 56, "CacheResultParser.java").B("Parsing endCacheIndex %d with invalid length wordCosts [%s]", i, aifyVar);
            return aike.a;
        }
        aify aifyVar2 = ambvVar.c;
        char c2 = 4;
        aift aiftVar = new aift(4);
        int size = aifyVar2.size();
        int i3 = 0;
        boolean z2 = false;
        int iA2 = 0;
        while (i3 < size) {
            defpackage.amcf amcfVar = (defpackage.amcf) aifyVar2.get(i3);
            java.lang.String strC = amcfVar.c();
            if (z2) {
                int length = strC.length();
                akzx akzxVarM = defpackage.amfx.a.m();
                c = c2;
                defpackage.amfw amfwVar = defpackage.amfw.PREDICTED_BY_CACHE;
                akzxVarM.u();
                defpackage.amfx amfxVar = (defpackage.amfx) akzxVarM.b;
                amfxVar.e = amfwVar.f;
                amfxVar.b |= 4;
                akzxVarM.u();
                defpackage.amfx amfxVar2 = (defpackage.amfx) akzxVarM.b;
                amfxVar2.b |= 1;
                amfxVar2.c = 0;
                akzxVarM.u();
                defpackage.amfx amfxVar3 = (defpackage.amfx) akzxVarM.b;
                amfxVar3.b |= 2;
                amfxVar3.d = length;
                defpackage.amfx amfxVar4 = (defpackage.amfx) akzxVarM.p();
                defpackage.amcd amcdVarA = defpackage.amce.a();
                amcdVarA.c(defpackage.amev.d(amcfVar.b(), amfxVar4));
                amcdVarA.d(j$.util.Optional.of(java.lang.Integer.valueOf(amcfVar.a())));
                amcdVarA.g(aike.a);
                aiftVar.i(amcdVarA.a());
                iA = a(strC);
            } else {
                c = c2;
                if (a(strC) + iA2 >= i2) {
                    int length2 = ambr.a(defpackage.ambu.a.j(strC).subList(0, i2 - iA2)).length();
                    defpackage.amft amftVarE = defpackage.amev.e(amcfVar.b(), length2);
                    java.lang.String strC2 = amcfVar.c();
                    aify aifyVarB = aike.a;
                    if (!strC2.isEmpty() && length2 > 0) {
                        aifyVarB = aifyVar.b(iA2, a(strC2.substring(0, length2)) + iA2);
                    }
                    defpackage.amcd amcdVarA2 = defpackage.amce.a();
                    amcdVarA2.c(amftVarE);
                    amcdVarA2.a = z;
                    amcdVarA2.d(j$.util.Optional.of(java.lang.Integer.valueOf(amcfVar.a())));
                    amcdVarA2.g(aifyVarB);
                    aiftVar.i(amcdVarA2.a());
                    iA2 += a(strC);
                    z2 = true;
                } else {
                    int length3 = strC.length();
                    akzx akzxVarM2 = defpackage.amfx.a.m();
                    defpackage.amfw amfwVar2 = defpackage.amfw.MATCHED_CACHE;
                    akzxVarM2.u();
                    defpackage.amfx amfxVar5 = (defpackage.amfx) akzxVarM2.b;
                    amfxVar5.e = amfwVar2.f;
                    amfxVar5.b |= 4;
                    akzxVarM2.u();
                    defpackage.amfx amfxVar6 = (defpackage.amfx) akzxVarM2.b;
                    amfxVar6.b |= 1;
                    amfxVar6.c = 0;
                    akzxVarM2.u();
                    defpackage.amfx amfxVar7 = (defpackage.amfx) akzxVarM2.b;
                    amfxVar7.b |= 2;
                    amfxVar7.d = length3;
                    defpackage.amfx amfxVar8 = (defpackage.amfx) akzxVarM2.p();
                    java.lang.String strC3 = amcfVar.c();
                    aify aifyVarB2 = aike.a;
                    if (!strC3.isEmpty()) {
                        aifyVarB2 = aifyVar.b(iA2, a(strC3) + iA2);
                    }
                    defpackage.amcd amcdVarA3 = defpackage.amce.a();
                    amcdVarA3.c(defpackage.amev.d(amcfVar.b(), amfxVar8));
                    amcdVarA3.a = z;
                    amcdVarA3.d(j$.util.Optional.of(java.lang.Integer.valueOf(amcfVar.a())));
                    amcdVarA3.g(aifyVarB2);
                    aiftVar.i(amcdVarA3.a());
                    iA = a(strC);
                }
                i3++;
                c2 = c;
            }
            iA2 += iA;
            i3++;
            c2 = c;
        }
        return aiftVar.h();
    }
}
