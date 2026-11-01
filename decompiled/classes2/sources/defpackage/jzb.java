package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class jzb {
    public final kit a;
    public final defpackage.kdy b;
    public final java.util.Map c;
    public final java.util.List d;
    private final sso e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final int j;
    private final int k;
    private final kgz l;
    private final rsr m;

    public jzb(sso ssoVar, kit kitVar, defpackage.kdy kdyVar, java.util.Map map, kgz kgzVar, boolean z, boolean z2, boolean z3, boolean z4, rsr rsrVar) {
        aooh.f(kitVar, "groupDateGroup");
        aooh.f(kdyVar, "mainEntry");
        aooh.f(map, "mainEntryFeatureData");
        this.e = ssoVar;
        this.a = kitVar;
        this.b = kdyVar;
        this.c = map;
        this.l = kgzVar;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.m = rsrVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(kdyVar);
        this.d = arrayList;
        this.j = kdyVar.p;
        this.k = kdyVar.f;
    }

    /* JADX WARN: Code duplicated, block: B:169:0x043c A[PHI: r2
      0x043c: PHI (r2v27 kiw) = (r2v26 kiw), (r2v46 kiw) binds: [B:162:0x042c, B:168:0x043a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x009b  */
    public final kiu a(long j, int i) {
        java.lang.String str;
        defpackage.hkd hkdVarB;
        boolean z;
        boolean z2;
        mmy mmyVarG;
        int iAR;
        java.lang.String str2;
        java.util.List list = this.d;
        int size = list.size();
        java.util.ArrayList arrayList = new java.util.ArrayList(size);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(size);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(size);
        int i2 = this.j;
        boolean z3 = i2 == 3;
        java.util.Iterator it = list.iterator();
        boolean z4 = false;
        int i3 = 0;
        int i4 = 0;
        boolean z5 = true;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        long j2 = 0;
        boolean z6 = false;
        int i9 = 0;
        boolean z7 = true;
        boolean z8 = false;
        boolean z9 = false;
        while (it.hasNext()) {
            defpackage.kdy kdyVar = (defpackage.kdy) it.next();
            boolean z10 = z3;
            arrayList.add(java.lang.Long.valueOf(kdyVar.a));
            if (!this.i && (str2 = kdyVar.s) != null && str2.length() != 0) {
                arrayList2.add(str2);
            }
            long j3 = kdyVar.b;
            java.util.Iterator it2 = it;
            arrayList3.add(java.lang.Long.valueOf(j3));
            int iU = this.h ? defpackage.hgz.U(j, j3) : defpackage.hgu.p(j, j3);
            if (i3 < 4 && iU < 7) {
                i3++;
            }
            int i10 = kdyVar.p;
            long j4 = kdyVar.r;
            if (j4 <= 0) {
                z = false;
            } else if (i10 == 1) {
                z = true;
            } else if (i10 == 2) {
                z = true;
                i10 = 2;
            } else {
                z = false;
            }
            if (z5) {
                boolean z11 = i10 == 3 || i10 == 5 || z;
                if (z) {
                    if (z6) {
                        z11 = false;
                        z6 = true;
                    } else {
                        j2 = j4;
                        z6 = false;
                    }
                }
                z5 = z11;
                i5 = i10;
            } else {
                z5 = false;
            }
            boolean z12 = kdyVar.g;
            boolean z13 = i10 == 3;
            boolean z14 = z13 && !z12;
            if (z7) {
                z8 = z14 | z8;
                z2 = z;
                if (i10 != 1 && i10 != 2) {
                    z7 = false;
                }
            } else {
                z2 = z;
            }
            if (z8) {
                if (z14) {
                    i4++;
                } else {
                    z8 = false;
                }
            }
            if (!z9 && z13) {
                z4 = !z12;
                z9 = true;
            }
            if (z14) {
                i6++;
            }
            if (!z10) {
                z3 = z10;
            } else if (z13) {
                i7++;
                z3 = z10;
            } else {
                z3 = false;
            }
            i8 = (z12 || (mmyVarG = kdyVar.g()) == null || (iAR = a.aR(mmyVarG.n)) == 0 || iAR != 4) ? i8 : i8 + 1;
            z6 = z2 | z6;
            i9 |= kdyVar.l;
            it = it2;
        }
        int i11 = i8;
        int i12 = i9;
        boolean z15 = z5 && (i5 == 3 || i5 == 5);
        int i13 = true == z4 ? i6 : i7;
        defpackage.jhw jhwVarD = defpackage.hgt.D(defpackage.kis.a.m());
        jhwVarD.n();
        akzx akzxVar = (akzx) jhwVarD.a;
        akzxVar.u();
        defpackage.kis kisVar = (defpackage.kis) akzxVar.b;
        kisVar.c();
        akyl.i(arrayList, kisVar.b);
        if (!this.i) {
            jhwVarD.m();
            akzxVar.u();
            defpackage.kis kisVar2 = (defpackage.kis) akzxVar.b;
            kisVar2.b();
            akyl.i(arrayList2, kisVar2.c);
        }
        jhwVarD.o();
        akzxVar.u();
        defpackage.kis kisVar3 = (defpackage.kis) akzxVar.b;
        kisVar3.d();
        akyl.i(arrayList3, kisVar3.d);
        defpackage.kis kisVarL = jhwVarD.l();
        defpackage.kdy kdyVar2 = this.b;
        defpackage.ni niVarJ = defpackage.hgt.J(kiu.a.m());
        akzx akzxVar2 = (akzx) niVarJ.a;
        akzxVar2.u();
        kiu kiuVar = akzxVar2.b;
        kiuVar.b |= 1048576;
        kiuVar.x = i4;
        akzxVar2.u();
        kiu kiuVar2 = akzxVar2.b;
        kiuVar2.b |= 16777216;
        kiuVar2.B = i13;
        akzxVar2.u();
        kiu kiuVar3 = akzxVar2.b;
        kiuVar3.c |= 4;
        kiuVar3.M = i11;
        aooh.f(kisVarL, "value");
        akzxVar2.u();
        kiu kiuVar4 = akzxVar2.b;
        j$.util.Objects.requireNonNull(kisVarL);
        kiuVar4.u = kisVarL;
        kiuVar4.b |= 131072;
        akzxVar2.u();
        kiu kiuVar5 = akzxVar2.b;
        kiuVar5.b |= 2097152;
        kiuVar5.y = i;
        akzxVar2.u();
        kiu kiuVar6 = akzxVar2.b;
        kiuVar6.b |= 4194304;
        kiuVar6.z = z15;
        boolean z16 = z15 && j2 <= 300;
        akzxVar2.u();
        kiu kiuVar7 = akzxVar2.b;
        kiuVar7.b |= 8388608;
        kiuVar7.A = z16;
        boolean z17 = z6 && i3 < 4;
        akzxVar2.u();
        kiu kiuVar8 = akzxVar2.b;
        kiuVar8.b |= 536870912;
        kiuVar8.G = z17;
        akzxVar2.u();
        kiu kiuVar9 = akzxVar2.b;
        kiuVar9.b |= 4096;
        kiuVar9.p = i12;
        kit kitVar = this.a;
        aooh.f(kitVar, "value");
        akzxVar2.u();
        kiu kiuVar10 = akzxVar2.b;
        kiuVar10.v = kitVar.e;
        kiuVar10.b |= 262144;
        int i14 = this.k;
        akzxVar2.u();
        kiu kiuVar11 = akzxVar2.b;
        kiuVar11.b |= 32;
        kiuVar11.i = i14;
        akzxVar2.u();
        kiu kiuVar12 = akzxVar2.b;
        kiuVar12.b |= 8192;
        kiuVar12.q = i2;
        niVarJ.G();
        java.util.Map map = this.c;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(ajsz.aL(map.size()));
        for (java.util.Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(((ken) entry.getKey()).k, entry.getValue());
        }
        akzxVar2.u();
        akzxVar2.b.b().putAll(linkedHashMap);
        long j5 = kdyVar2.a;
        akzxVar2.u();
        kiu kiuVar13 = akzxVar2.b;
        kiuVar13.b |= 1;
        kiuVar13.d = j5;
        long j6 = kdyVar2.b;
        akzxVar2.u();
        kiu kiuVar14 = akzxVar2.b;
        kiuVar14.b |= 2;
        kiuVar14.e = j6;
        boolean z18 = kdyVar2.g;
        akzxVar2.u();
        kiu kiuVar15 = akzxVar2.b;
        kiuVar15.b |= 64;
        kiuVar15.j = z18;
        boolean z19 = kdyVar2.h;
        akzxVar2.u();
        kiu kiuVar16 = akzxVar2.b;
        kiuVar16.b |= 128;
        kiuVar16.k = z19;
        boolean z20 = kdyVar2.n;
        akzxVar2.u();
        kiu kiuVar17 = akzxVar2.b;
        kiuVar17.b |= 32768;
        kiuVar17.s = z20;
        int i15 = kdyVar2.l;
        akzxVar2.u();
        kiu kiuVar18 = akzxVar2.b;
        kiuVar18.b |= 2048;
        kiuVar18.o = i15;
        long j7 = kdyVar2.r;
        akzxVar2.u();
        kiu kiuVar19 = akzxVar2.b;
        kiuVar19.b |= 1073741824;
        kiuVar19.H = j7;
        defpackage.hkd hkdVarB2 = kdyVar2.b();
        if (hkdVarB2 == null) {
            hkdVarB2 = defpackage.hkd.a;
            aooh.e(hkdVarB2, "getDefaultInstance(...)");
        }
        aooh.f(hkdVarB2, "value");
        akzxVar2.u();
        kiu kiuVar20 = akzxVar2.b;
        j$.util.Objects.requireNonNull(hkdVarB2);
        kiuVar20.f = hkdVarB2;
        kiuVar20.b |= 4;
        java.lang.String str3 = kdyVar2.j;
        if (str3 != null && str3.length() != 0) {
            akzxVar2.u();
            kiu kiuVar21 = akzxVar2.b;
            j$.util.Objects.requireNonNull(str3);
            kiuVar21.b |= 512;
            kiuVar21.m = str3;
        }
        java.lang.String str4 = kdyVar2.d;
        if (str4 != null && str4.length() > 0 && (!this.f || (((hkdVarB = kdyVar2.b()) != null && hkdVarB.e) || aooh.n(str3, jzk.b) || aooh.n(str3, jzk.c)))) {
            akzxVar2.u();
            kiu kiuVar22 = akzxVar2.b;
            j$.util.Objects.requireNonNull(str4);
            kiuVar22.b |= 8;
            kiuVar22.g = str4;
        }
        java.lang.String str5 = kdyVar2.e;
        if (str5 != null && str5.length() != 0) {
            akzxVar2.u();
            kiu kiuVar23 = akzxVar2.b;
            j$.util.Objects.requireNonNull(str5);
            kiuVar23.b |= 16;
            kiuVar23.h = str5;
        }
        java.lang.String str6 = kdyVar2.i;
        if (str6 != null && str6.length() != 0) {
            akzxVar2.u();
            kiu kiuVar24 = akzxVar2.b;
            j$.util.Objects.requireNonNull(str6);
            kiuVar24.b |= 256;
            kiuVar24.l = str6;
        }
        java.lang.String str7 = kdyVar2.k;
        if (str7 != null && str7.length() != 0) {
            akzxVar2.u();
            kiu kiuVar25 = akzxVar2.b;
            j$.util.Objects.requireNonNull(str7);
            kiuVar25.b |= 1024;
            kiuVar25.n = str7;
        }
        java.lang.String str8 = kdyVar2.o;
        if (str8 != null && str8.length() != 0) {
            akzxVar2.u();
            kiu kiuVar26 = akzxVar2.b;
            j$.util.Objects.requireNonNull(str8);
            kiuVar26.b |= 65536;
            kiuVar26.t = str8;
        }
        defpackage.kiw kiwVarE = kdyVar2.e();
        defpackage.kiw kiwVarE2 = null;
        if (kiwVarE == null) {
            kiwVarE = kiwVarE2;
        } else if (kdyVar2.B != null) {
            kiwVarE2 = this.l != null ? kgz.e(kiwVarE) : null;
            if (kiwVarE2 != null) {
                kiwVarE = kiwVarE2;
            }
        }
        if (kiwVarE != null) {
            niVarJ.F(kiwVarE);
        }
        ucu ucuVarI = kdyVar2.i();
        if (ucuVarI != null) {
            akzxVar2.u();
            kiu kiuVar27 = akzxVar2.b;
            j$.util.Objects.requireNonNull(ucuVarI);
            kiuVar27.w = ucuVarI;
            kiuVar27.b |= 524288;
        }
        wxp wxpVarK = kdyVar2.k();
        if (wxpVarK != null) {
            akzxVar2.u();
            kiu kiuVar28 = akzxVar2.b;
            j$.util.Objects.requireNonNull(wxpVarK);
            kiuVar28.C = wxpVarK;
            kiuVar28.b |= 33554432;
        }
        defpackage.kir kirVarD = kdyVar2.d();
        if (kirVarD != null) {
            akzxVar2.u();
            kiu kiuVar29 = akzxVar2.b;
            j$.util.Objects.requireNonNull(kirVarD);
            kiuVar29.D = kirVarD;
            kiuVar29.b |= 67108864;
        }
        kui kuiVarF = kdyVar2.f();
        if (kuiVarF != null) {
            akzxVar2.u();
            kiu kiuVar30 = akzxVar2.b;
            j$.util.Objects.requireNonNull(kuiVarF);
            kiuVar30.E = kuiVarF;
            kiuVar30.b |= 134217728;
        }
        defpackage.omz omzVarH = kdyVar2.h();
        if (omzVarH != null) {
            akzxVar2.u();
            kiu kiuVar31 = akzxVar2.b;
            j$.util.Objects.requireNonNull(omzVarH);
            kiuVar31.J = omzVarH;
            kiuVar31.c |= 1;
        }
        defpackage.jvx jvxVarC = kdyVar2.c();
        if (jvxVarC != null) {
            akzxVar2.u();
            kiu kiuVar32 = akzxVar2.b;
            j$.util.Objects.requireNonNull(jvxVarC);
            kiuVar32.F = jvxVarC;
            kiuVar32.b |= 268435456;
        }
        wgu wguVarJ = kdyVar2.j();
        if (wguVarJ != null) {
            akzxVar2.u();
            kiu kiuVar33 = akzxVar2.b;
            j$.util.Objects.requireNonNull(wguVarJ);
            kiuVar33.I = wguVarJ;
            kiuVar33.b |= Integer.MIN_VALUE;
        }
        mmy mmyVarG2 = kdyVar2.g();
        if (mmyVarG2 != null) {
            akzxVar2.u();
            kiu kiuVar34 = akzxVar2.b;
            j$.util.Objects.requireNonNull(mmyVarG2);
            kiuVar34.K = mmyVarG2;
            kiuVar34.c |= 2;
        }
        if (this.g && (str = kdyVar2.D) != null && str.length() > 0) {
            akzxVar2.u();
            kiu kiuVar35 = akzxVar2.b;
            j$.util.Objects.requireNonNull(str);
            kiuVar35.c |= 8;
            kiuVar35.N = str;
        }
        return niVarJ.E();
    }

    public final boolean b(defpackage.kdy kdyVar, kit kitVar, java.util.Map map) {
        aooh.f(kdyVar, "entry");
        aooh.f(kitVar, "rowDateGroup");
        aooh.f(map, "entryFeatureData");
        if (this.k != kdyVar.f) {
            return false;
        }
        int i = kdyVar.p;
        int i2 = this.j;
        if ((i2 == 3 || i2 == 5) != (i == 3 || i == 5) || this.a != kitVar) {
            return false;
        }
        defpackage.kdy kdyVar2 = this.b;
        boolean z = this.f;
        if ((!z || kdyVar2.B == null || kdyVar.B == null || !aooh.n(kdyVar2.j, kdyVar.j) || kdyVar2.n() == null || !aooh.n(kdyVar2.n(), kdyVar.n())) && !this.e.d(kdyVar2, kdyVar)) {
            return false;
        }
        if (z) {
            java.util.Set<java.util.Map.Entry> setEntrySet = map.entrySet();
            if (!(setEntrySet instanceof java.util.Collection) || !setEntrySet.isEmpty()) {
                for (java.util.Map.Entry entry : setEntrySet) {
                    ken kenVar = (ken) entry.getKey();
                    if (!this.m.aa(kenVar, (akzc) entry.getValue(), (akzc) this.c.get(kenVar))) {
                        return false;
                    }
                }
            }
            java.util.Set<java.util.Map.Entry> setEntrySet2 = this.c.entrySet();
            if (!(setEntrySet2 instanceof java.util.Collection) || !setEntrySet2.isEmpty()) {
                for (java.util.Map.Entry entry2 : setEntrySet2) {
                    ken kenVar2 = (ken) entry2.getKey();
                    akzc akzcVar = (akzc) entry2.getValue();
                    if (!map.containsKey(kenVar2) && !this.m.aa(kenVar2, akzcVar, (akzc) null)) {
                        return false;
                    }
                }
            }
        } else {
            java.util.Collection collectionValues = map.values();
            if (!(collectionValues instanceof java.util.Collection) || !collectionValues.isEmpty()) {
                java.util.Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    if (((akzc) it.next()).c() > 10) {
                        return false;
                    }
                }
            }
        }
        aenj aenjVar = jzk.a;
        defpackage.kir kirVarD = kdyVar.d();
        if (kirVarD != null && (kirVarD.b & 2) != 0) {
            return false;
        }
        wxp wxpVarK = kdyVar.k();
        if (wxpVarK != null && wxpVarK.e) {
            return false;
        }
        wgu wguVarJ = kdyVar.j();
        if (wguVarJ != null && wguVarJ.e) {
            return false;
        }
        kui kuiVarF = kdyVar.f();
        java.lang.String str = kuiVarF != null ? kuiVarF.c : null;
        if (str != null && !aoov.H(str)) {
            return false;
        }
        mmy mmyVarG = kdyVar.g();
        return mmyVarG == null || !mmyVarG.j;
    }
}
