package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class rln {
    public final defpackage.zjs a;
    public final defpackage.oko b;
    public final defpackage.ruc c;
    public final defpackage.aoin d;
    public final int e;
    private final defpackage.ahzi f;

    public rln(defpackage.zjs zjsVar, defpackage.oko okoVar, int i, defpackage.ruc rucVar, defpackage.aoin aoinVar) {
        if (zjsVar == null) {
            defpackage.aooh.i("dialerTelecom");
        }
        if (rucVar == null) {
            defpackage.aooh.i("metrics");
        }
        if (aoinVar == null) {
            defpackage.aooh.i("hasGooglerAccount");
        }
        this.a = zjsVar;
        this.b = okoVar;
        this.e = 5;
        this.c = rucVar;
        this.d = aoinVar;
        defpackage.ahzi ahziVarBI = defpackage.ahvr.bI(new defpackage.ahzi() { // from class: rlm
            /* JADX WARN: Type inference failed for: r9v49, types: [aonj, java.lang.Object] */
            @Override // defpackage.ahzi
            public final java.lang.Object eZ() {
                boolean z;
                defpackage.rln rlnVar = this.a;
                defpackage.ruc rucVar2 = rlnVar.c;
                defpackage.aenj aenjVar = defpackage.ruc.cc;
                rucVar2.j(aenjVar);
                defpackage.akzx akzxVarM = defpackage.rla.a.m();
                if (akzxVarM == null) {
                    defpackage.aooh.i("builder");
                }
                int i2 = android.os.Build.VERSION.SDK_INT;
                akzxVarM.u();
                defpackage.rla rlaVar = (defpackage.rla) akzxVarM.b;
                boolean z2 = true;
                rlaVar.b |= 1;
                rlaVar.c = i2;
                java.lang.String str = android.os.Build.BRAND;
                defpackage.aooh.e(str, "BRAND");
                if (str == null) {
                    defpackage.aooh.i("value");
                }
                akzxVarM.u();
                defpackage.rla rlaVar2 = (defpackage.rla) akzxVarM.b;
                j$.util.Objects.requireNonNull(str);
                rlaVar2.b |= 4;
                rlaVar2.f = str;
                java.lang.String str2 = android.os.Build.DEVICE;
                defpackage.aooh.e(str2, "DEVICE");
                if (str2 == null) {
                    defpackage.aooh.i("value");
                }
                akzxVarM.u();
                defpackage.rla rlaVar3 = (defpackage.rla) akzxVarM.b;
                j$.util.Objects.requireNonNull(str2);
                rlaVar3.b |= 8;
                rlaVar3.g = str2;
                java.lang.String str3 = android.os.Build.MANUFACTURER;
                defpackage.aooh.e(str3, "MANUFACTURER");
                if (str3 == null) {
                    defpackage.aooh.i("value");
                }
                akzxVarM.u();
                defpackage.rla rlaVar4 = (defpackage.rla) akzxVarM.b;
                j$.util.Objects.requireNonNull(str3);
                rlaVar4.b |= 16;
                rlaVar4.h = str3;
                java.lang.String str4 = android.os.Build.MODEL;
                defpackage.aooh.e(str4, "MODEL");
                if (str4 == null) {
                    defpackage.aooh.i("value");
                }
                akzxVarM.u();
                defpackage.rla rlaVar5 = (defpackage.rla) akzxVarM.b;
                j$.util.Objects.requireNonNull(str4);
                rlaVar5.b |= 32;
                rlaVar5.i = str4;
                java.lang.String str5 = android.os.Build.PRODUCT;
                defpackage.aooh.e(str5, "PRODUCT");
                if (str5 == null) {
                    defpackage.aooh.i("value");
                }
                akzxVarM.u();
                defpackage.rla rlaVar6 = (defpackage.rla) akzxVarM.b;
                j$.util.Objects.requireNonNull(str5);
                rlaVar6.b |= 64;
                rlaVar6.j = str5;
                java.lang.String country = java.util.Locale.getDefault().getCountry();
                defpackage.aooh.e(country, "getCountry(...)");
                java.lang.String lowerCase = country.toLowerCase(java.util.Locale.ROOT);
                defpackage.aooh.e(lowerCase, "toLowerCase(...)");
                if (lowerCase == null) {
                    defpackage.aooh.i("value");
                }
                akzxVarM.u();
                defpackage.rla rlaVar7 = (defpackage.rla) akzxVarM.b;
                j$.util.Objects.requireNonNull(lowerCase);
                rlaVar7.b |= 128;
                rlaVar7.k = lowerCase;
                java.lang.String language = java.util.Locale.getDefault().getLanguage();
                defpackage.aooh.e(language, "getLanguage(...)");
                if (language == null) {
                    defpackage.aooh.i("value");
                }
                akzxVarM.u();
                defpackage.rla rlaVar8 = (defpackage.rla) akzxVarM.b;
                j$.util.Objects.requireNonNull(language);
                rlaVar8.b |= 256;
                rlaVar8.l = language;
                java.lang.String str6 = android.os.Build.ID;
                defpackage.aooh.e(str6, "ID");
                if (str6 == null) {
                    defpackage.aooh.i("value");
                }
                akzxVarM.u();
                defpackage.rla rlaVar9 = (defpackage.rla) akzxVarM.b;
                j$.util.Objects.requireNonNull(str6);
                rlaVar9.b |= 1024;
                rlaVar9.n = str6;
                java.lang.String str7 = android.os.Build.FINGERPRINT;
                defpackage.aooh.e(str7, "FINGERPRINT");
                if (str7 == null) {
                    defpackage.aooh.i("value");
                }
                akzxVarM.u();
                defpackage.rla rlaVar10 = (defpackage.rla) akzxVarM.b;
                j$.util.Objects.requireNonNull(str7);
                rlaVar10.b |= 2048;
                rlaVar10.o = str7;
                akzxVarM.u();
                defpackage.rla rlaVar11 = (defpackage.rla) akzxVarM.b;
                rlaVar11.b |= 4096;
                char c = 2;
                rlaVar11.p = 2;
                defpackage.rku rkuVar = defpackage.rku.RELEASE;
                akzxVarM.u();
                defpackage.rla rlaVar12 = (defpackage.rla) akzxVarM.b;
                rlaVar12.d = rkuVar.a();
                rlaVar12.b |= 2;
                java.lang.Object objA = rlnVar.d.a();
                defpackage.aooh.e(objA, "get(...)");
                boolean zBooleanValue = ((java.lang.Boolean) objA).booleanValue();
                akzxVarM.u();
                defpackage.rla rlaVar13 = (defpackage.rla) akzxVarM.b;
                rlaVar13.b |= 512;
                rlaVar13.m = zBooleanValue;
                for (android.telecom.PhoneAccountHandle phoneAccountHandle : rlnVar.a.s()) {
                    j$.util.Optional optionalD = rlnVar.b.D(phoneAccountHandle);
                    if (optionalD == null) {
                        defpackage.aooh.i("<this>");
                    }
                    defpackage.oko okoVar2 = (defpackage.oko) optionalD.orElse((java.lang.Object) null);
                    if (okoVar2 != null) {
                        char c2 = c;
                        java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(((defpackage.rla) akzxVarM.b).e);
                        defpackage.aooh.e(listUnmodifiableList, "getSimStatesList(...)");
                        new defpackage.alct(listUnmodifiableList);
                        defpackage.akzx akzxVarM2 = defpackage.rli.a.m();
                        if (akzxVarM2 == null) {
                            defpackage.aooh.i("builder");
                        }
                        hgw hgwVar = new hgw(akzxVarM2);
                        java.lang.String strFlattenToString = phoneAccountHandle.getComponentName().flattenToString();
                        defpackage.aooh.e(strFlattenToString, "flattenToString(...)");
                        if (strFlattenToString == null) {
                            defpackage.aooh.i("value");
                        }
                        defpackage.akzx akzxVar = (defpackage.akzx) hgwVar.a;
                        akzxVar.u();
                        boolean z3 = z2;
                        defpackage.rli rliVar = (defpackage.rli) akzxVar.b;
                        j$.util.Objects.requireNonNull(strFlattenToString);
                        rliVar.b |= 1;
                        rliVar.c = strFlattenToString;
                        java.lang.String id = phoneAccountHandle.getId();
                        defpackage.aooh.e(id, "getId(...)");
                        if (id == null) {
                            defpackage.aooh.i("value");
                        }
                        akzxVar.u();
                        defpackage.rli rliVar2 = (defpackage.rli) akzxVar.b;
                        j$.util.Objects.requireNonNull(id);
                        rliVar2.b |= 2;
                        rliVar2.d = id;
                        j$.util.Optional optionalQ = okoVar2.q();
                        rhb rhbVar = new rhb(new qji(hgwVar, 14), 4);
                        if (z3 == optionalQ.isPresent()) {
                            rhbVar.a.a(optionalQ.get());
                        }
                        java.lang.Integer numValueOf = java.lang.Integer.valueOf(okoVar2.c());
                        java.lang.Integer num = numValueOf.intValue() == -1 ? null : numValueOf;
                        if (num != null) {
                            int iIntValue = num.intValue();
                            akzxVar.u();
                            defpackage.rli rliVar3 = (defpackage.rli) akzxVar.b;
                            rliVar3.b |= 8;
                            rliVar3.f = iIntValue;
                        }
                        java.lang.String strT = okoVar2.T();
                        if (strT != null) {
                            java.lang.String lowerCase2 = strT.toLowerCase(java.util.Locale.ROOT);
                            defpackage.aooh.e(lowerCase2, "toLowerCase(...)");
                            if (lowerCase2 == null) {
                                defpackage.aooh.i("value");
                            }
                            akzxVar.u();
                            defpackage.rli rliVar4 = (defpackage.rli) akzxVar.b;
                            j$.util.Objects.requireNonNull(lowerCase2);
                            rliVar4.b |= 16;
                            rliVar4.g = lowerCase2;
                        }
                        defpackage.alad aladVarR = akzxVar.r();
                        defpackage.aooh.e(aladVarR, "build(...)");
                        defpackage.rli rliVar5 = (defpackage.rli) aladVarR;
                        if (rliVar5 == null) {
                            defpackage.aooh.i("value");
                        }
                        akzxVarM.u();
                        defpackage.rla rlaVar14 = (defpackage.rla) akzxVarM.b;
                        j$.util.Objects.requireNonNull(rliVar5);
                        defpackage.alat alatVar = rlaVar14.e;
                        if (alatVar.c()) {
                            z = true;
                        } else {
                            z = true;
                            rlaVar14.e = alatVar.d(alatVar.size() << 1);
                        }
                        rlaVar14.e.add(rliVar5);
                        c = c2;
                        z2 = z;
                    }
                }
                defpackage.alad aladVarR2 = akzxVarM.r();
                defpackage.aooh.e(aladVarR2, "build(...)");
                defpackage.rla rlaVar15 = (defpackage.rla) aladVarR2;
                rucVar2.m(aenjVar);
                return rlaVar15;
            }
        });
        defpackage.aooh.e(ahziVarBI, "memoize(...)");
        this.f = ahziVarBI;
    }

    public final defpackage.rla a() {
        java.lang.Object objEZ = this.f.eZ();
        defpackage.aooh.e(objEZ, "get(...)");
        return (defpackage.rla) objEZ;
    }
}
