package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class afsq {
    private static volatile defpackage.ahbz a;

    public afsq(android.content.Context context, defpackage.apnt apntVar) {
        if (defpackage.anhc.a.eZ().b((android.content.Context) apntVar.a)) {
            defpackage.zzd.k(context, "PROFILE_SYNC_VERBOSE");
        } else {
            new defpackage.zzd(context, "PROFILE_SYNC_VERBOSE", null);
        }
    }

    public static void A(com.google.android.material.internal.CheckableImageButton checkableImageButton, android.view.View.OnClickListener onClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        cZ(checkableImageButton);
    }

    public static void B(com.google.android.material.internal.CheckableImageButton checkableImageButton) {
        checkableImageButton.setOnLongClickListener((android.view.View.OnLongClickListener) null);
        cZ(checkableImageButton);
    }

    public static void C(com.google.android.material.internal.CheckableImageButton checkableImageButton, java.lang.CharSequence charSequence) {
        if (true != checkableImageButton.isFocusable()) {
            charSequence = null;
        }
        checkableImageButton.setTooltipText(charSequence);
    }

    public static ahta D(defpackage.ahqy ahqyVar, android.util.SparseArray sparseArray, float f, defpackage.aify aifyVar, boolean z) {
        defpackage.ahvr.ci(ahqyVar);
        ahsw ahswVar = new ahsw(ahqyVar, sparseArray, f, aifyVar, z);
        defpackage.akzx akzxVar = ahswVar.m;
        defpackage.ahvr.bY(((defpackage.apfr) akzxVar.r()).equals(defpackage.apfr.a));
        defpackage.ahqy ahqyVar2 = ahswVar.d;
        boolean z2 = false;
        defpackage.ahvr.bY(ahqyVar2.e.size() > 0);
        defpackage.alcf alcfVarE = defpackage.aldi.e(ahqyVar2.f);
        akzxVar.u();
        defpackage.apfr apfrVar = (defpackage.apfr) akzxVar.b;
        j$.util.Objects.requireNonNull(alcfVarE);
        apfrVar.g = alcfVarE;
        apfrVar.b |= 16;
        long jA = defpackage.ahvr.A(ahqyVar2);
        akzxVar.u();
        defpackage.apfr apfrVar2 = (defpackage.apfr) akzxVar.b;
        apfrVar2.b |= 1;
        apfrVar2.c = jA;
        float f2 = ahswVar.e;
        if (f2 > 0.0f) {
            defpackage.akzx akzxVarM = apfp.a.m();
            akzxVarM.u();
            apfp apfpVar = akzxVarM.b;
            apfpVar.b = 2;
            apfpVar.c = java.lang.Float.valueOf(f2);
            akzxVar.u();
            defpackage.apfr apfrVar3 = (defpackage.apfr) akzxVar.b;
            apfp apfpVarP = akzxVarM.r();
            j$.util.Objects.requireNonNull(apfpVarP);
            apfrVar3.e = apfpVarP;
            apfrVar3.b |= 4;
        }
        if ((ahqyVar2.b & 32) != 0) {
            defpackage.ahna ahnaVar = ahqyVar2.i;
            if (ahnaVar == null) {
                ahnaVar = defpackage.ahna.a;
            }
            if ((ahnaVar.b & 1) != 0) {
                ahmz ahmzVar = ahnaVar.c;
                if (ahmzVar == null) {
                    ahmzVar = ahmz.a;
                }
                int i = ahmzVar.c;
                akzxVar.u();
                defpackage.apfr apfrVar4 = (defpackage.apfr) akzxVar.b;
                apfrVar4.b |= 64;
                apfrVar4.i = i;
            }
            if ((ahnaVar.b & 2) != 0) {
                defpackage.akzx akzxVarM2 = apfq.a.m();
                ahmy ahmyVar = ahnaVar.d;
                if (ahmyVar == null) {
                    ahmyVar = ahmy.a;
                }
                defpackage.akzm akzmVarC = defpackage.aldf.c(ahmyVar.c);
                akzxVarM2.u();
                apfq apfqVar = akzxVarM2.b;
                j$.util.Objects.requireNonNull(akzmVarC);
                apfqVar.c = akzmVarC;
                apfqVar.b |= 1;
                akzxVar.u();
                defpackage.apfr apfrVar5 = (defpackage.apfr) akzxVar.b;
                apfq apfqVarP = akzxVarM2.r();
                j$.util.Objects.requireNonNull(apfqVarP);
                apfrVar5.j = apfqVarP;
                apfrVar5.b |= 128;
            }
        }
        java.util.Iterator it = ahqyVar2.e.iterator();
        while (it.hasNext()) {
            ahswVar.b((defpackage.ahop) it.next());
        }
        java.lang.Long l = ahswVar.b;
        if (l != null) {
            java.util.Map map = ahswVar.c;
            java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
            for (java.util.Map.Entry entry : map.entrySet()) {
                defpackage.akzx akzxVarM3 = apfm.a.m();
                long jLongValue = ((java.lang.Long) entry.getKey()).longValue();
                akzxVarM3.u();
                apfm apfmVar = akzxVarM3.b;
                apfmVar.b |= 1;
                apfmVar.c = jLongValue;
                long jLongValue2 = ((java.lang.Long) entry.getValue()).longValue();
                akzxVarM3.u();
                apfm apfmVar2 = akzxVarM3.b;
                apfmVar2.b |= 2;
                apfmVar2.d = jLongValue2;
                arrayList.add(akzxVarM3.r());
            }
            defpackage.akzx akzxVarM4 = apfn.a.m();
            akzxVarM4.u();
            apfn apfnVar = akzxVarM4.b;
            apfnVar.e = 2;
            apfnVar.b |= 1;
            l.longValue();
            akzxVarM4.u();
            apfn apfnVar2 = akzxVarM4.b;
            apfnVar2.c = 2;
            apfnVar2.d = l;
            akzxVarM4.u();
            apfn apfnVar3 = akzxVarM4.b;
            defpackage.alat alatVar = apfnVar3.f;
            if (!alatVar.c()) {
                apfnVar3.f = defpackage.alad.J(alatVar);
            }
            defpackage.akyl.i(arrayList, apfnVar3.f);
            akzxVar.u();
            defpackage.apfr apfrVar6 = (defpackage.apfr) akzxVar.b;
            apfn apfnVarP = akzxVarM4.r();
            j$.util.Objects.requireNonNull(apfnVarP);
            defpackage.alat alatVar2 = apfrVar6.f;
            if (!alatVar2.c()) {
                apfrVar6.f = defpackage.alad.J(alatVar2);
            }
            apfrVar6.f.add(apfnVarP);
        }
        if (ahswVar.j == null) {
            ahswVar.j = ahswVar.i;
        }
        java.lang.String str = ahswVar.j.c;
        akzxVar.u();
        defpackage.apfr apfrVar7 = (defpackage.apfr) akzxVar.b;
        j$.util.Objects.requireNonNull(str);
        apfrVar7.b |= 2;
        apfrVar7.d = str;
        defpackage.ahvr.bY(ahswVar.g != Long.MAX_VALUE);
        defpackage.ahvr.bY(ahswVar.h != Long.MIN_VALUE);
        long j = ahswVar.h - ahswVar.g;
        if (ahswVar.l) {
            if (ahqyVar2.e.size() == 1 && j == 0) {
                z2 = (ahqyVar2.b & 32) == 0;
                j = 0;
            }
        } else if (ahqyVar2.e.size() == 1 && ahqyVar2.g == ahswVar.f && (ahqyVar2.b & 32) == 0) {
            z2 = true;
        }
        boolean z3 = z2;
        defpackage.akzm akzmVarE = defpackage.aldf.e(j);
        akzxVar.u();
        defpackage.apfr apfrVar8 = (defpackage.apfr) akzxVar.b;
        j$.util.Objects.requireNonNull(akzmVarE);
        apfrVar8.h = akzmVarE;
        apfrVar8.b |= 32;
        defpackage.akzx akzxVarM5 = apha.a.m();
        defpackage.akzm akzmVarE2 = defpackage.aldf.e((ahqyVar2.g * 1000000) + ((long) ahqyVar2.h));
        akzxVarM5.u();
        apha aphaVar = akzxVarM5.b;
        j$.util.Objects.requireNonNull(akzmVarE2);
        aphaVar.d = akzmVarE2;
        aphaVar.b |= 1;
        java.util.Iterator it2 = ahswVar.a.values().iterator();
        while (it2.hasNext()) {
            apgz apgzVarP = ((defpackage.akzx) it2.next()).r();
            akzxVarM5.u();
            apha aphaVar2 = akzxVarM5.b;
            j$.util.Objects.requireNonNull(apgzVarP);
            defpackage.alat alatVar3 = aphaVar2.c;
            if (!alatVar3.c()) {
                aphaVar2.c = defpackage.alad.J(alatVar3);
            }
            aphaVar2.c.add(apgzVarP);
        }
        if (ahqyVar2.k.size() > 0 && ahqyVar2.l.size() > 0) {
            defpackage.alat alatVar4 = ahqyVar2.k;
            akzxVar.u();
            defpackage.apfr apfrVar9 = (defpackage.apfr) akzxVar.b;
            defpackage.alat alatVar5 = apfrVar9.m;
            if (!alatVar5.c()) {
                apfrVar9.m = defpackage.alad.J(alatVar5);
            }
            defpackage.akyl.i(alatVar4, apfrVar9.m);
            defpackage.alat alatVar6 = ahqyVar2.l;
            akzxVar.u();
            defpackage.apfr apfrVar10 = (defpackage.apfr) akzxVar.b;
            defpackage.alat alatVar7 = apfrVar10.n;
            if (!alatVar7.c()) {
                apfrVar10.n = defpackage.alad.J(alatVar7);
            }
            defpackage.akyl.i(alatVar6, apfrVar10.n);
            int i2 = ahswVar.j.b;
            if ((i2 & 2048) != 0 && (i2 & 4096) != 0 && (i2 & 8192) != 0) {
                defpackage.akzx akzxVarM6 = apfk.a.m();
                int i3 = ahswVar.j.n;
                akzxVarM6.u();
                apfk apfkVar = akzxVarM6.b;
                apfkVar.b |= 8;
                apfkVar.d = i3;
                int i4 = ahswVar.j.o;
                akzxVarM6.u();
                apfk apfkVar2 = akzxVarM6.b;
                apfkVar2.b |= 16;
                apfkVar2.e = i4;
                int i5 = ahswVar.j.p;
                akzxVarM6.u();
                apfk apfkVar3 = akzxVarM6.b;
                apfkVar3.b |= 4;
                apfkVar3.c = i5;
                akzxVar.u();
                defpackage.apfr apfrVar11 = (defpackage.apfr) akzxVar.b;
                apfk apfkVarP = akzxVarM6.r();
                j$.util.Objects.requireNonNull(apfkVarP);
                apfrVar11.l = apfkVarP;
                apfrVar11.b |= 256;
            }
        }
        defpackage.aify aifyVar2 = ahswVar.k;
        if (!aifyVar2.isEmpty()) {
            defpackage.akzx akzxVarM7 = apfo.a.m();
            akzxVarM7.u();
            apfo apfoVar = akzxVarM7.b;
            defpackage.alat alatVar8 = apfoVar.b;
            if (!alatVar8.c()) {
                apfoVar.b = defpackage.alad.J(alatVar8);
            }
            defpackage.akyl.i(aifyVar2, apfoVar.b);
            akzxVar.u();
            defpackage.apfr apfrVar12 = (defpackage.apfr) akzxVar.b;
            apfo apfoVarP = akzxVarM7.r();
            j$.util.Objects.requireNonNull(apfoVarP);
            apfrVar12.o = apfoVarP;
            apfrVar12.b |= 512;
        }
        defpackage.ahop ahopVar = ahswVar.j;
        defpackage.aenj aenjVar = new defpackage.aenj(ahopVar.c);
        defpackage.apev apevVar = (defpackage.apev) ahswVar.a(ahopVar).e();
        long j2 = ahqyVar2.g;
        return new ahta(aenjVar, apevVar, j2, j2 + ahswVar.f, z3, (defpackage.apfr) akzxVar.r(), akzxVarM5.r());
    }

    /* JADX WARN: Code duplicated, block: B:134:0x044e  */
    /* JADX WARN: Code duplicated, block: B:137:0x046d  */
    /* JADX WARN: Code duplicated, block: B:144:0x049d  */
    /* JADX WARN: Code duplicated, block: B:147:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:168:0x0509  */
    /* JADX WARN: Code duplicated, block: B:170:0x0514  */
    public static ahsx E(ahsz ahszVar) {
        boolean z;
        j$.util.Optional optionalEmpty;
        float f;
        boolean z2;
        defpackage.aphg aphgVar;
        defpackage.aphg aphgVar2;
        defpackage.alat alatVar;
        defpackage.aphg aphgVar3;
        defpackage.alat alatVar2;
        int i;
        int i2;
        j$.time.Duration durationOfNanos = j$.time.Duration.ofNanos(Long.MAX_VALUE);
        j$.time.Duration durationOfNanos2 = j$.time.Duration.ofNanos(Long.MIN_VALUE);
        int i3 = 4;
        defpackage.aift aiftVar = new defpackage.aift(4);
        defpackage.ahqy ahqyVar = ahszVar.a;
        java.lang.String str = null;
        for (defpackage.ahop ahopVar : ahqyVar.e) {
            android.util.SparseArray sparseArray = ahszVar.b;
            defpackage.akzx akzxVarM = aphf.a.m();
            int i4 = i3;
            if ((ahopVar.b & 1) != 0) {
                java.lang.String str2 = ahopVar.c;
                akzxVarM.u();
                aphf aphfVar = akzxVarM.b;
                j$.util.Objects.requireNonNull(str2);
                aphfVar.b |= 1;
                aphfVar.c = str2;
            }
            if ((ahopVar.b & 2) != 0) {
                int i5 = ahopVar.d;
                akzxVarM.u();
                aphf aphfVar2 = akzxVarM.b;
                aphfVar2.b |= 2;
                aphfVar2.d = i5;
            }
            if ((ahopVar.b & 4) != 0) {
                int i6 = ahopVar.e;
                akzxVarM.u();
                aphf aphfVar3 = akzxVarM.b;
                aphfVar3.b |= 4;
                aphfVar3.e = i6;
            }
            int i7 = ahopVar.b;
            if ((i7 & 8) == 0 && (i7 & 16) == 0) {
                i = -1;
            } else {
                i = -1;
                defpackage.akzm akzmVarDH = defpackage.ajsz.dH(j$.time.Duration.ofMillis(ahopVar.f).plusNanos(ahopVar.g));
                akzxVarM.u();
                aphf aphfVar4 = akzxVarM.b;
                j$.util.Objects.requireNonNull(akzmVarDH);
                aphfVar4.f = akzmVarDH;
                aphfVar4.b |= 8;
            }
            int i8 = ahopVar.b;
            if ((i8 & 32) != 0 || (i8 & 64) != 0) {
                defpackage.akzm akzmVarDH2 = defpackage.ajsz.dH(j$.time.Duration.ofMillis(ahopVar.h).plusNanos(ahopVar.i));
                akzxVarM.u();
                aphf aphfVar5 = akzxVarM.b;
                j$.util.Objects.requireNonNull(akzmVarDH2);
                aphfVar5.g = akzmVarDH2;
                aphfVar5.b |= 16;
            }
            if ((ahopVar.b & 128) != 0) {
                defpackage.akzm akzmVarC = defpackage.aldf.c(ahopVar.j);
                akzxVarM.u();
                aphf aphfVar6 = akzxVarM.b;
                j$.util.Objects.requireNonNull(akzmVarC);
                aphfVar6.h = akzmVarC;
                aphfVar6.b |= 32;
            }
            if ((ahopVar.b & 512) != 0) {
                int iAN = defpackage.a.aN(ahopVar.l);
                if (iAN == 0) {
                    iAN = 1;
                }
                int i9 = iAN + i;
                if (i9 == 0) {
                    i2 = 1;
                } else if (i9 != 1) {
                    i2 = i9 != 2 ? i4 : 3;
                } else {
                    i2 = 2;
                }
                akzxVarM.u();
                aphf aphfVar7 = akzxVarM.b;
                aphfVar7.j = i2 + i;
                aphfVar7.b |= 128;
            }
            if ((ahopVar.b & 1024) != 0) {
                boolean z3 = ahopVar.m;
                akzxVarM.u();
                aphf aphfVar8 = akzxVarM.b;
                aphfVar8.b |= 256;
                aphfVar8.k = z3;
            }
            if ((ahopVar.b & 32) != 0) {
                defpackage.akzm akzmVarDH3 = defpackage.ajsz.dH(j$.time.Duration.ofMillis(ahopVar.h).plusNanos(ahopVar.i));
                akzxVarM.u();
                aphf aphfVar9 = akzxVarM.b;
                j$.util.Objects.requireNonNull(akzmVarDH3);
                aphfVar9.g = akzmVarDH3;
                aphfVar9.b |= 16;
            }
            if (ahopVar.e == i) {
                str = ahopVar.c;
            }
            if ((ahopVar.b & 256) != 0) {
                boolean z4 = ahopVar.k;
                akzxVarM.u();
                aphf aphfVar10 = akzxVarM.b;
                aphfVar10.b |= 64;
                aphfVar10.i = z4;
            }
            defpackage.ahor ahorVarDc = dc(ahopVar.d, ahsq.a, sparseArray);
            if (ahorVarDc.b()) {
                if (((ahsq) ahorVarDc.a()).a().f()) {
                    defpackage.apev apevVar = (defpackage.apev) ((ahsq) ahorVarDc.a()).a().b();
                    akzxVarM.u();
                    aphf aphfVar11 = akzxVarM.b;
                    j$.util.Objects.requireNonNull(apevVar);
                    aphfVar11.m = apevVar;
                    aphfVar11.b |= 1024;
                }
                if (((ahsq) ahorVarDc.a()).b()) {
                    akzxVarM.u();
                    aphf aphfVar12 = akzxVarM.b;
                    aphfVar12.b |= 512;
                    aphfVar12.l = true;
                }
            }
            defpackage.ahor ahorVarDc2 = dc(ahopVar.d, aeng.a, sparseArray);
            if (ahorVarDc2.b()) {
                long jLongValue = ((java.lang.Long) ahorVarDc2.a()).longValue();
                akzxVarM.u();
                aphf aphfVar13 = akzxVarM.b;
                aphfVar13.b |= 2048;
                aphfVar13.n = jLongValue;
                defpackage.ahor ahorVarDc3 = dc(0, aeng.c, sparseArray);
                if (ahorVarDc3.b()) {
                }
            }
            defpackage.ahor ahorVarDc4 = dc(ahopVar.d, aeng.b, sparseArray);
            if (ahorVarDc4.b()) {
                long jLongValue2 = ((java.lang.Long) ahorVarDc4.a()).longValue();
                akzxVarM.u();
                aphf aphfVar14 = akzxVarM.b;
                aphfVar14.b |= 4096;
                aphfVar14.o = jLongValue2;
            }
            j$.time.Duration durationPlusNanos = j$.time.Duration.ofMillis(ahopVar.f).plusNanos(ahopVar.g);
            j$.time.Duration durationPlus = durationPlusNanos.plus(j$.time.Duration.ofMillis(ahopVar.h).plusNanos(ahopVar.i));
            if (durationPlusNanos.compareTo(durationOfNanos) < 0) {
                durationOfNanos = durationPlusNanos;
            }
            if (durationPlus.compareTo(durationOfNanos2) > 0) {
                durationOfNanos2 = durationPlus;
            }
            int i10 = ahopVar.b;
            if ((i10 & 2048) != 0 && (i10 & 4096) != 0 && (i10 & 8192) != 0) {
                int i11 = ahopVar.n;
                akzxVarM.u();
                aphf aphfVar15 = akzxVarM.b;
                aphfVar15.b |= 8192;
                aphfVar15.p = i11;
                int i12 = ahopVar.o;
                akzxVarM.u();
                aphf aphfVar16 = akzxVarM.b;
                aphfVar16.b |= 16384;
                aphfVar16.q = i12;
                int i13 = ahopVar.p;
                akzxVarM.u();
                aphf aphfVar17 = akzxVarM.b;
                aphfVar17.b |= 32768;
                aphfVar17.r = i13;
            }
            aiftVar.i(akzxVarM.r());
            i3 = i4;
        }
        defpackage.akzx akzxVarM2 = defpackage.aphg.a.m();
        long jA = defpackage.ahvr.A(ahqyVar);
        akzxVarM2.u();
        defpackage.aphg aphgVar4 = (defpackage.aphg) akzxVarM2.b;
        aphgVar4.b |= 1;
        aphgVar4.c = jA;
        boolean z5 = ahszVar.c;
        akzxVarM2.u();
        defpackage.aphg aphgVar5 = (defpackage.aphg) akzxVarM2.b;
        aphgVar5.b |= 32;
        aphgVar5.i = z5;
        defpackage.aify aifyVarH = aiftVar.g();
        akzxVarM2.u();
        defpackage.aphg aphgVar6 = (defpackage.aphg) akzxVarM2.b;
        defpackage.alat alatVar3 = aphgVar6.d;
        if (!alatVar3.c()) {
            aphgVar6.d = defpackage.alad.J(alatVar3);
        }
        defpackage.akyl.i(aifyVarH, aphgVar6.d);
        defpackage.aify aifyVar = ahszVar.f;
        akzxVarM2.u();
        defpackage.aphg aphgVar7 = (defpackage.aphg) akzxVarM2.b;
        defpackage.alat alatVar4 = aphgVar7.m;
        if (!alatVar4.c()) {
            aphgVar7.m = defpackage.alad.J(alatVar4);
        }
        defpackage.akyl.i(aifyVar, aphgVar7.m);
        if ((ahqyVar.b & 4) != 0) {
            defpackage.alcf alcfVarE = defpackage.aldi.e(ahqyVar.f);
            akzxVarM2.u();
            defpackage.aphg aphgVar8 = (defpackage.aphg) akzxVarM2.b;
            j$.util.Objects.requireNonNull(alcfVarE);
            aphgVar8.e = alcfVarE;
            aphgVar8.b |= 2;
        }
        int i14 = ahqyVar.b;
        if ((i14 & 8) != 0 || (i14 & 16) != 0) {
            defpackage.akzm akzmVarDH4 = defpackage.ajsz.dH(j$.time.Duration.ofMillis(ahqyVar.g).plusNanos(ahqyVar.h));
            akzxVarM2.u();
            defpackage.aphg aphgVar9 = (defpackage.aphg) akzxVarM2.b;
            j$.util.Objects.requireNonNull(akzmVarDH4);
            aphgVar9.f = akzmVarDH4;
            aphgVar9.b |= 4;
        }
        if ((ahqyVar.b & 64) != 0) {
            int iAQ = defpackage.a.aQ(ahqyVar.j);
            if (iAQ == 0) {
                iAQ = 1;
            }
            int i15 = iAQ - 1;
            int i16 = i15 != 0 ? i15 != 1 ? 3 : 2 : 1;
            akzxVarM2.u();
            defpackage.aphg aphgVar10 = (defpackage.aphg) akzxVarM2.b;
            aphgVar10.h = i16 - 1;
            aphgVar10.b |= 16;
        }
        defpackage.ahna ahnaVar = ahqyVar.i;
        if (ahnaVar == null) {
            ahnaVar = defpackage.ahna.a;
        }
        defpackage.akzx akzxVarM3 = aphe.a.m();
        if ((ahnaVar.b & 1) != 0) {
            defpackage.akzx akzxVarM4 = aphd.a.m();
            ahmz ahmzVar = ahnaVar.c;
            if (ahmzVar == null) {
                ahmzVar = ahmz.a;
            }
            int i17 = ahmzVar.c;
            akzxVarM4.u();
            aphd aphdVar = akzxVarM4.b;
            aphdVar.b |= 1;
            aphdVar.c = i17;
            aphd aphdVarP = akzxVarM4.r();
            akzxVarM3.u();
            aphe apheVar = akzxVarM3.b;
            j$.util.Objects.requireNonNull(aphdVarP);
            apheVar.c = aphdVarP;
            apheVar.b |= 1;
            z = true;
        } else {
            z = false;
        }
        if ((ahnaVar.b & 2) == 0) {
            if (!z) {
                optionalEmpty = j$.util.Optional.empty();
            }
            if (optionalEmpty.isPresent()) {
                java.lang.Object obj = optionalEmpty.get();
                akzxVarM2.u();
                defpackage.aphg aphgVar11 = (defpackage.aphg) akzxVarM2.b;
                j$.util.Objects.requireNonNull(obj);
                aphgVar11.g = (aphe) obj;
                aphgVar11.b |= 8;
            }
            f = ahszVar.d;
            if (f > 0.0f) {
                akzxVarM2.u();
                defpackage.aphg aphgVar12 = (defpackage.aphg) akzxVarM2.b;
                aphgVar12.b |= 64;
                aphgVar12.l = f;
            }
            if (ahqyVar.k.size() > 0 && ahqyVar.l.size() > 0) {
                defpackage.alat alatVar5 = ahqyVar.k;
                akzxVarM2.u();
                aphgVar2 = (defpackage.aphg) akzxVarM2.b;
                alatVar = aphgVar2.j;
                if (!alatVar.c()) {
                    aphgVar2.j = defpackage.alad.J(alatVar);
                }
                defpackage.akyl.i(alatVar5, aphgVar2.j);
                defpackage.alat alatVar6 = ahqyVar.l;
                akzxVarM2.u();
                aphgVar3 = (defpackage.aphg) akzxVarM2.b;
                alatVar2 = aphgVar3.k;
                if (!alatVar2.c()) {
                    aphgVar3.k = defpackage.alad.J(alatVar2);
                }
                defpackage.akyl.i(alatVar6, aphgVar3.k);
            }
            z2 = ahszVar.e ? ahqyVar.e.size() == 1 && j$.time.Duration.ofMillis(ahqyVar.g).plusNanos((long) ahqyVar.h).equals(durationOfNanos2) && (ahqyVar.b & 32) == 0 : ahqyVar.e.size() == 1 && durationOfNanos.equals(durationOfNanos2) && (ahqyVar.b & 32) == 0;
            aphgVar = (defpackage.aphg) akzxVarM2.r();
            if (aphgVar != null) {
                return new ahsx(aphgVar, new defpackage.aenj(str), z2);
            }
            throw new java.lang.NullPointerException("Null traceRecord");
        }
        defpackage.akzx akzxVarM5 = aphc.a.m();
        ahmy ahmyVar = ahnaVar.d;
        if (ahmyVar == null) {
            ahmyVar = ahmy.a;
        }
        defpackage.akzm akzmVarC2 = defpackage.aldf.c(ahmyVar.c);
        akzxVarM5.u();
        aphc aphcVar = akzxVarM5.b;
        j$.util.Objects.requireNonNull(akzmVarC2);
        aphcVar.c = akzmVarC2;
        aphcVar.b |= 1;
        ahmy ahmyVar2 = ahnaVar.d;
        if (ahmyVar2 == null) {
            ahmyVar2 = ahmy.a;
        }
        int i18 = ahmyVar2.d;
        akzxVarM5.u();
        aphc aphcVar2 = akzxVarM5.b;
        aphcVar2.b |= 2;
        aphcVar2.d = i18;
        aphc aphcVarP = akzxVarM5.r();
        akzxVarM3.u();
        aphe apheVar2 = akzxVarM3.b;
        j$.util.Objects.requireNonNull(aphcVarP);
        apheVar2.d = aphcVarP;
        apheVar2.b |= 2;
        optionalEmpty = j$.util.Optional.of(akzxVarM3.r());
        if (optionalEmpty.isPresent()) {
            java.lang.Object obj2 = optionalEmpty.get();
            akzxVarM2.u();
            defpackage.aphg aphgVar13 = (defpackage.aphg) akzxVarM2.b;
            j$.util.Objects.requireNonNull(obj2);
            aphgVar13.g = (aphe) obj2;
            aphgVar13.b |= 8;
        }
        f = ahszVar.d;
        if (f > 0.0f) {
            akzxVarM2.u();
            defpackage.aphg aphgVar14 = (defpackage.aphg) akzxVarM2.b;
            aphgVar14.b |= 64;
            aphgVar14.l = f;
        }
        if (ahqyVar.k.size() > 0) {
            defpackage.alat alatVar7 = ahqyVar.k;
            akzxVarM2.u();
            aphgVar2 = (defpackage.aphg) akzxVarM2.b;
            alatVar = aphgVar2.j;
            if (!alatVar.c()) {
                aphgVar2.j = defpackage.alad.J(alatVar);
            }
            defpackage.akyl.i(alatVar7, aphgVar2.j);
            defpackage.alat alatVar8 = ahqyVar.l;
            akzxVarM2.u();
            aphgVar3 = (defpackage.aphg) akzxVarM2.b;
            alatVar2 = aphgVar3.k;
            if (!alatVar2.c()) {
                aphgVar3.k = defpackage.alad.J(alatVar2);
            }
            defpackage.akyl.i(alatVar8, aphgVar3.k);
        }
        if (ahszVar.e) {
        }
        aphgVar = (defpackage.aphg) akzxVarM2.r();
        if (aphgVar != null) {
            return new ahsx(aphgVar, new defpackage.aenj(str), z2);
        }
        throw new java.lang.NullPointerException("Null traceRecord");
    }

    public static void F(android.view.View view, defpackage.ahpz ahpzVar, java.lang.String str, android.view.View.OnClickListener onClickListener) {
        defpackage.aooh.f(view, "<this>");
        defpackage.aooh.f(ahpzVar, "traceCreation");
        view.setOnClickListener(new ahpp(ahpzVar, 1480, str, onClickListener, 0));
    }

    public static void G(defpackage.aw awVar, android.content.Intent intent) {
        android.content.Intent intent2 = new android.content.Intent(intent);
        ahqq ahqqVarN = defpackage.ahqx.n(intent2);
        try {
            awVar.aD(intent2);
            ahqqVarN.close();
        } catch (java.lang.Throwable th) {
            try {
                ahqqVarN.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public static defpackage.ahpm H(android.app.Service service, java.lang.String str) throws afeb {
        defpackage.afec.c();
        return defpackage.ahvr.ac(service).i(str, 1436);
    }

    public static boolean I(android.view.View view) {
        return da(view.getContext());
    }

    public static /* synthetic */ defpackage.aoub J(defpackage.aoss aossVar, defpackage.aonn aonnVar) throws java.io.IOException {
        defpackage.aoub aoubVarAl;
        defpackage.aols aolsVar = defpackage.aols.a;
        defpackage.aooh.f(aossVar, "<this>");
        defpackage.ahre.c(aossVar);
        defpackage.ahpe ahpeVarA = defpackage.ahns.a();
        defpackage.ahpj ahpjVar = ahpeVarA.c;
        if (ahpjVar == null || defpackage.aooh.n(ahpjVar, defpackage.ahoo.a)) {
            defpackage.ahpm ahpmVarH = defpackage.ahns.h();
            try {
                aoubVarAl = defpackage.aoov.al(aossVar, aolsVar, 1, new ahnc(aonnVar, (defpackage.aoln) null));
                defpackage.ajsz.ak(ahpmVarH, null);
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    defpackage.ajsz.ak(ahpmVarH, th);
                    throw th2;
                }
            }
        } else {
            defpackage.ahpj ahpjVar2 = ahpeVarA.d;
            ahpeVarA.d = ahpeVarA.c;
            try {
                defpackage.ahpm ahpmVarH2 = defpackage.ahns.h();
                try {
                    aoubVarAl = defpackage.aoov.al(aossVar, aolsVar, 1, new ahnc(aonnVar, (defpackage.aoln) null));
                    defpackage.ajsz.ak(ahpmVarH2, null);
                    ahpeVarA.d = ahpjVar2;
                } catch (java.lang.Throwable th3) {
                    try {
                        throw th3;
                    } catch (java.lang.Throwable th4) {
                        defpackage.ajsz.ak(ahpmVarH2, th3);
                        throw th4;
                    }
                }
            } catch (java.lang.Throwable th5) {
                ahpeVarA.d = ahpjVar2;
                throw th5;
            }
        }
        return aoubVarAl;
    }

    public static defpackage.aolr K(defpackage.aolr aolrVar) {
        defpackage.ahpn ahpgVar;
        defpackage.aooh.f(aolrVar, "<this>");
        defpackage.aooh.f(aolrVar, "<this>");
        defpackage.cch cchVar = defpackage.ahrd.b;
        defpackage.aolr aolrVarMinusKey = aolrVar.minusKey(cchVar);
        defpackage.ahrd ahrdVar = (defpackage.ahrd) aolrVar.get(cchVar);
        if (ahrdVar == null || (ahpgVar = ahrdVar.a) == null) {
            ahpgVar = new defpackage.ahpg(0);
        }
        if (ahpgVar == null) {
            defpackage.aooh.i("context");
        }
        return aolrVarMinusKey.plus(new defpackage.ahrd(ahpgVar, false, true));
    }

    public static ahhl L(android.content.Context context) {
        return xrr.c(context);
    }

    public static defpackage.aoss M(defpackage.aolr aolrVar, defpackage.ems emsVar) {
        defpackage.aooh.f(aolrVar, "parentContext");
        defpackage.aooh.f(emsVar, "lifecycle");
        defpackage.aovh aovhVar = new defpackage.aovh(null);
        emsVar.c(new zu(aovhVar, 7));
        return new ahgt(aolrVar, aovhVar);
    }

    public static boolean N(android.content.Context context) {
        return !((java.lang.Boolean) ((defpackage.ahys) ((defpackage.ahgo) defpackage.agab.aH(context, defpackage.ahgo.class)).fj()).a).booleanValue();
    }

    public static android.content.Context O(android.view.View view) {
        if (view.getParent() instanceof android.view.View) {
            return db(((android.view.View) view.getParent()).getContext(), defpackage.amyf.class, android.app.Activity.class);
        }
        return null;
    }

    public static boolean P(android.content.Context context) {
        android.content.Context contextDb = db(context, defpackage.amyf.class);
        if (contextDb instanceof defpackage.amyf) {
            defpackage.amyf amyfVar = (defpackage.amyf) contextDb;
            if (amyfVar.a != null) {
                for (defpackage.aw awVarA = amyfVar.a(); awVarA != null; awVarA = awVarA.E) {
                    if (awVarA.s) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static java.lang.String Q(java.lang.String str) {
        return str == null ? "103243289" : "103243289_".concat(java.lang.String.valueOf(new defpackage.aorg("[^A-Za-z0-9\\-_:]").b(str, "_")));
    }

    public static void R(java.io.RandomAccessFile randomAccessFile, int i) throws java.io.IOException {
        randomAccessFile.writeInt(i);
        randomAccessFile.seek(0L);
    }

    public static java.lang.Object S(android.content.Context context, java.lang.Class cls, com.google.apps.tiktok.account.AccountId accountId) {
        defpackage.aooh.f(context, "context");
        android.content.Context applicationContext = context.getApplicationContext();
        defpackage.aooh.c(applicationContext);
        try {
            java.lang.Object objCast = cls.cast(((defpackage.ahej) defpackage.agab.aH(applicationContext, defpackage.ahej.class)).sX().B(accountId));
            defpackage.aooh.c(objCast);
            return objCast;
        } catch (java.lang.ClassCastException e) {
            throw new java.lang.IllegalStateException("Failed to get an entry point. Did you mark your interface with @SingletonAccountEntryPoint?", e);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [aonj, java.lang.Object] */
    public static void T(uzx uzxVar, defpackage.aonj aonjVar) {
        uzxVar.a.a(new aprf(aonjVar, (byte[]) null));
    }

    public static int U(android.media.AudioFormat audioFormat) {
        return android.media.AudioTrack.getMinBufferSize(audioFormat.getSampleRate(), audioFormat.getChannelMask(), audioFormat.getEncoding());
    }

    public static /* synthetic */ java.lang.String V(int i) {
        return i != 1 ? "PLAYED_AVATAR_MESSAGE" : "CALLER_TRANSCRIPT";
    }

    public static adok W(adoj adojVar) {
        j$.util.Objects.requireNonNull(adojVar);
        return new adny(adojVar);
    }

    public static void X(java.io.InputStream inputStream) {
        try {
            inputStream.close();
        } catch (java.io.IOException unused) {
        }
    }

    public static int Y(int i) {
        if (i == 0) {
            return 1;
        }
        switch (i) {
            case 950:
                return 951;
            case 951:
                return 952;
            case 952:
                return 953;
            default:
                switch (i) {
                    case 1001:
                        return 1002;
                    case 1002:
                        return 1003;
                    case 1003:
                        return 1004;
                    case 1004:
                        return 1005;
                    case 1005:
                        return 1006;
                    default:
                        return 0;
                }
        }
    }

    public static android.net.Uri Z(android.content.Context context, android.net.Uri uri) throws java.io.IOException {
        try {
            java.lang.String str = android.system.Os.readlink(new defpackage.zzx((java.lang.Object) context, (byte[]) null).H(uri).getAbsolutePath());
            if (str == null) {
                throw new java.io.IOException("Unable to read symlink");
            }
            java.util.regex.Pattern pattern = defpackage.afej.a;
            defpackage.afei afeiVar = new defpackage.afei(context);
            afeiVar.b(str);
            return afeiVar.a();
        } catch (defpackage.afex | android.system.ErrnoException e) {
            throw new java.io.IOException("Unable to read symlink", e);
        }
    }

    public static com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo aA(afpl afplVar) {
        ((defpackage.akym) afplVar.a).i();
        defpackage.aify aifyVar = com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo.a;
        return new com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo(defpackage.aish.e.g().k(((defpackage.akym) afplVar.b).i()), (java.lang.String) null);
    }

    public static acwe aB(acvr acvrVar, int i) {
        defpackage.akzx akzxVarM = acwe.a.m();
        java.lang.String str = acvrVar.d;
        akzxVarM.u();
        acwe acweVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        acweVar.b |= 1;
        acweVar.c = str;
        long j = acvrVar.e;
        akzxVarM.u();
        acwe acweVar2 = akzxVarM.b;
        acweVar2.b |= 2;
        acweVar2.d = j;
        java.lang.String strAp = ap(acvrVar);
        akzxVarM.u();
        acwe acweVar3 = akzxVarM.b;
        j$.util.Objects.requireNonNull(strAp);
        acweVar3.b |= 4;
        acweVar3.e = strAp;
        akzxVarM.u();
        acwe acweVar4 = akzxVarM.b;
        acweVar4.f = i - 1;
        acweVar4.b |= 8;
        if ((acvrVar.b & 32) != 0) {
            amlu amluVar = acvrVar.h;
            if (amluVar == null) {
                amluVar = amlu.a;
            }
            akzxVarM.u();
            acwe acweVar5 = akzxVarM.b;
            j$.util.Objects.requireNonNull(amluVar);
            acweVar5.g = amluVar;
            acweVar5.b |= 16;
        }
        return akzxVarM.r();
    }

    public static aczc aC(android.content.Context context, defpackage.acxa acxaVar) {
        try {
            return aczc.a(context.getSharedPreferences("gms_icing_mdd_migrations", 0).getInt("mdd_file_key_version", aczc.a.d));
        } catch (java.lang.IllegalArgumentException unused) {
            acxaVar.a();
            context.getSharedPreferences("gms_icing_mdd_migrations", 0).edit().clear().commit();
            return aczc.c;
        }
    }

    public static boolean aD(android.content.Context context) {
        return context.getSharedPreferences("gms_icing_mdd_migrations", 0).getBoolean("migrated_to_new_file_key", false);
    }

    public static boolean aE(android.content.Context context, aczc aczcVar) {
        aczcVar.name();
        int i = defpackage.adbe.a;
        return context.getSharedPreferences("gms_icing_mdd_migrations", 0).edit().putInt("mdd_file_key_version", aczcVar.d).commit();
    }

    public static void aF(android.content.Context context) {
        int i = defpackage.adbe.a;
        context.getSharedPreferences("gms_icing_mdd_migrations", 0).edit().putBoolean("migrated_to_new_file_key", true).commit();
    }

    public static /* synthetic */ java.lang.String aG(int i) {
        if (i != 1) {
            return i != 2 ? "DOWNLOADED_GROUP" : "IN_PROGRESS_FUTURE";
        }
        return "PENDING_GROUP";
    }

    public static boolean aH(amlu amluVar) {
        try {
            afgc.a(amluVar);
            return true;
        } catch (java.lang.IllegalArgumentException e) {
            defpackage.adbe.f(e, "Invalid transform specification");
            return false;
        }
    }

    public static java.lang.String aI(android.accounts.Account account) {
        return account.type + ':' + account.name;
    }

    public static android.graphics.fonts.FontFamily.Builder aJ(android.content.Context context, actu actuVar, actz actzVar, android.os.CancellationSignal cancellationSignal) throws java.io.IOException {
        android.content.res.AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        defpackage.aooh.f(context, "context");
        defpackage.aooh.f(actuVar, "fontInfo");
        defpackage.aooh.f(actzVar, "font");
        afaw afawVarA = defpackage.aooh.n(context.getPackageName(), "com.google.android.gms") ? afaw.b : afaw.a("com.google.android.gms");
        android.net.Uri uri = actuVar.a;
        int i = afax.a;
        android.content.ContentResolver contentResolver = context.getContentResolver();
        java.lang.String scheme = uri.getScheme();
        if ("android.resource".equals(scheme)) {
            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r", cancellationSignal);
        } else if ("content".equals(scheme)) {
            if (!afax.f(context, uri, afax.a("r"), afawVarA)) {
                throw new java.io.FileNotFoundException("Can't open content uri.");
            }
            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r", cancellationSignal);
            afax.g(assetFileDescriptorOpenAssetFileDescriptor);
        } else {
            if (!"file".equals(scheme)) {
                throw new java.io.FileNotFoundException("Unsupported scheme");
            }
            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r", cancellationSignal);
            try {
                afax.e(context, assetFileDescriptorOpenAssetFileDescriptor.getParcelFileDescriptor(), uri, afawVarA);
            } catch (java.io.FileNotFoundException e) {
                afax.d(assetFileDescriptorOpenAssetFileDescriptor, e);
                throw e;
            } catch (java.io.IOException e2) {
                java.io.FileNotFoundException fileNotFoundException = new java.io.FileNotFoundException("Validation failed.");
                fileNotFoundException.initCause(e2);
                afax.d(assetFileDescriptorOpenAssetFileDescriptor, fileNotFoundException);
                throw fileNotFoundException;
            }
        }
        android.os.ParcelFileDescriptor parcelFileDescriptor = assetFileDescriptorOpenAssetFileDescriptor.getParcelFileDescriptor();
        if (parcelFileDescriptor == null) {
            return null;
        }
        try {
            android.graphics.fonts.Font fontM = da$.ExternalSyntheticApiModelOutline0.m(da$.ExternalSyntheticApiModelOutline0.m(da$.ExternalSyntheticApiModelOutline0.m$2(da$.ExternalSyntheticApiModelOutline0.m$1(da$.ExternalSyntheticApiModelOutline0.m(new android.graphics.fonts.Font.Builder(parcelFileDescriptor), actuVar.c), actuVar.d ? 1 : 0), actuVar.b), acty.a(actzVar.b, context)));
            defpackage.aooh.e(fontM, "build(...)");
            android.graphics.fonts.FontFamily.Builder builder = new android.graphics.fonts.FontFamily.Builder(fontM);
            defpackage.ajsz.ak(parcelFileDescriptor, null);
            return builder;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                defpackage.ajsz.ak(parcelFileDescriptor, th);
                throw th2;
            }
        }
    }

    public static acru aK(acrq acrqVar) {
        defpackage.aooh.f(acrqVar, "version");
        if (defpackage.aooh.n(acrqVar, acrr.c)) {
            return acse.a;
        }
        if (defpackage.aooh.n(acrqVar, acrr.d)) {
            return acsu.a;
        }
        if (defpackage.aooh.n(acrqVar, acrr.a)) {
            return acsu.a;
        }
        if (defpackage.aooh.n(acrqVar, acrr.b)) {
            return acsu.a;
        }
        java.util.Objects.toString(acrqVar);
        throw new java.lang.IllegalStateException("Unsupported energy version: ".concat(java.lang.String.valueOf(acrqVar)));
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00c8 A[PHI: r11
      0x00c8: PHI (r11v11 int) = 
      (r11v10 int)
      (r11v10 int)
      (r11v10 int)
      (r11v10 int)
      (r11v13 int)
      (r11v13 int)
      (r11v13 int)
      (r11v13 int)
      (r11v13 int)
      (r11v13 int)
      (r11v13 int)
      (r11v13 int)
      (r11v13 int)
      (r11v13 int)
     binds: [B:21:0x005b, B:23:0x0063, B:25:0x006b, B:27:0x0073, B:29:0x007c, B:31:0x0084, B:33:0x008c, B:35:0x0094, B:37:0x009c, B:39:0x00a4, B:41:0x00ac, B:43:0x00b4, B:45:0x00bc, B:47:0x00c4] A[DONT_GENERATE, DONT_INLINE]] */
    public static defpackage.cqg[] aL(long j, defpackage.bor borVar, amnk amnkVar) {
        int i;
        int i2;
        int[] iArrB;
        defpackage.aooh.f(amnkVar, "version");
        long j2 = borVar.a;
        if (defpackage.anty.ah(j, j2) || defpackage.anty.ah(j, borVar.K) || defpackage.anty.ah(j, borVar.L) || defpackage.anty.ah(j, borVar.c) || defpackage.anty.ah(j, borVar.e)) {
            i = 1;
        } else if (defpackage.anty.ah(j, borVar.f) || defpackage.anty.ah(j, borVar.O) || defpackage.anty.ah(j, borVar.P) || defpackage.anty.ah(j, borVar.h)) {
            i = 2;
        } else {
            int i3 = 3;
            if (defpackage.anty.ah(j, borVar.j) || defpackage.anty.ah(j, borVar.S) || defpackage.anty.ah(j, borVar.T) || defpackage.anty.ah(j, borVar.l)) {
                i = i3;
            } else {
                i3 = 4;
                if (defpackage.anty.ah(j, borVar.p) || defpackage.anty.ah(j, borVar.D) || defpackage.anty.ah(j, borVar.E) || defpackage.anty.ah(j, borVar.F) || defpackage.anty.ah(j, borVar.G) || defpackage.anty.ah(j, borVar.H) || defpackage.anty.ah(j, borVar.I) || defpackage.anty.ah(j, borVar.J) || defpackage.anty.ah(j, borVar.r) || defpackage.anty.ah(j, borVar.u)) {
                    i = i3;
                } else {
                    i = 0;
                }
            }
        }
        long j3 = borVar.p;
        if (i != 0) {
            long j4 = borVar.j;
            iArrB = amnj.b(defpackage.cfd.L(j), defpackage.cfd.L(j2), defpackage.cfd.L(borVar.f), defpackage.cfd.L(j4), defpackage.cfd.L(j3), (defpackage.anty.ah(j3, -4294967296L) || defpackage.anty.ah(j3, -66688592860151808L)) && (defpackage.anty.ah(j2, -68864818429296640L) || defpackage.anty.ah(j2, -24549921394786304L)) && (defpackage.anty.ah(j4, -66309149679419392L) || defpackage.anty.ah(j4, -41142024304328704L)), i, amnkVar);
            i2 = 0;
        } else {
            int iL = defpackage.cfd.L(j);
            boolean z = new amnm(defpackage.cfd.L(j3)).c <= 50.0d;
            defpackage.aooh.f(amnkVar, "version");
            amnm amnmVar = new amnm(iL);
            defpackage.aooh.f(amnkVar, "version");
            java.util.List listA = amnj.a(amnkVar).a(amnmVar, z);
            i2 = 0;
            iArrB = new int[]{((amnm) listA.get(0)).d, ((amnm) listA.get(1)).d};
        }
        int length = iArrB.length;
        defpackage.cqg[] cqgVarArr = new defpackage.cqg[length];
        for (int i4 = i2; i4 < length; i4++) {
            cqgVarArr[i4] = new defpackage.cqg(defpackage.cfd.M(iArrB[i4]));
        }
        return cqgVarArr;
    }

    public static defpackage.aiq aM(defpackage.aiq aiqVar, int i) {
        j$.util.Objects.checkIndex(0, 3);
        if (aiqVar == null) {
            return aiqVar;
        }
        if (aiqVar instanceof defpackage.ajr) {
            if (i <= 1) {
                return ((defpackage.ajr) aiqVar).a;
            }
            defpackage.ajr ajrVar = (defpackage.ajr) aiqVar;
            return new akg(i, ajrVar.a, ajrVar.c, ajrVar.b);
        }
        if (!(aiqVar instanceof akg)) {
            return aiqVar;
        }
        if (i <= 1) {
            return ((akg) aiqVar).b;
        }
        akg akgVar = (akg) aiqVar;
        return i < akgVar.a ? new akg(i, akgVar.b, akgVar.d, akgVar.c) : (defpackage.ajl) aiqVar;
    }

    /* JADX WARN: Code duplicated, block: B:85:0x0188  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ad  */
    public static void aN(defpackage.aomy aomyVar, defpackage.cmw cmwVar, bnv bnvVar, boolean z, defpackage.bni bniVar, defpackage.ayy ayyVar, defpackage.aono aonoVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.cav cavVar2;
        bnv bnvVar2;
        boolean z2;
        defpackage.ayy ayyVar2;
        boolean z3;
        defpackage.ayy ayyVarH;
        bnv bnvVar3;
        defpackage.aonj aonjVarI;
        boolean z4;
        defpackage.kaw kawVar;
        defpackage.cmw cmwVarK;
        java.lang.Object obj;
        acsy acsyVar;
        boolean zB;
        java.lang.Object objR;
        boolean zB2;
        java.lang.Object objR2;
        defpackage.aooh.f(aomyVar, "onClick");
        defpackage.aooh.f(aonoVar, "content");
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1850034144);
        if (i3 == 0) {
            i2 = (true != cavVarB.D(aomyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.z(3) ? 1024 : 2048;
        }
        int i4 = i2 | 221184;
        if ((1572864 & i) == 0) {
            i4 |= true != cavVarB.B(bniVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i4 |= 4194304;
        }
        int i5 = i4 | 100663296;
        if ((805306368 & i) == 0) {
            i5 |= true != cavVarB.D(aonoVar) ? 268435456 : 536870912;
        }
        int i6 = i5;
        if (cavVarB.H((306783379 & i6) != 306783378, i6 & 1)) {
            int i7 = i6 & (-29361025);
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            cbtVar.Z(-127, null, 0, null);
            if ((i & 1) == 0 || cavVarB.E()) {
                defpackage.ayy ayyVar3 = acpl.a;
                defpackage.ayy ayyVar4 = defpackage.bnj.a;
                defpackage.bti btiVarAm = defpackage.den.am(cavVarB);
                bnv bnvVar4 = btiVarAm.i;
                if (bnvVar4 == null) {
                    bnvVar4 = new bnv(defpackage.btj.a(btiVarAm, 6), defpackage.btj.a(btiVarAm, 14));
                    btiVarAm.i = bnvVar4;
                }
                z3 = true;
                ayyVarH = acpl.h(acpl.c());
                bnvVar3 = bnvVar4;
            } else {
                cavVarB.s();
                bnvVar3 = bnvVar;
                z3 = z;
                ayyVarH = ayyVar;
            }
            cavVarB.l();
            cavVarB.u(1347425147);
            java.lang.Object objR3 = cbtVar.R();
            java.lang.Object obj2 = defpackage.cau.a;
            if (objR3 == obj2) {
                objR3 = new defpackage.kaw((byte[]) null, (char[]) null, (byte[]) null);
                cbtVar.ab(objR3);
            }
            defpackage.kaw kawVar2 = (defpackage.kaw) objR3;
            cbtVar.W(false);
            defpackage.ajl ajlVarA = defpackage.den.al(cavVarB).a();
            defpackage.cer cerVarM = rv.m(kawVar2, cavVarB, 0);
            long j = z3 ? bniVar.a : bniVar.c;
            boolean zY = defpackage.a.y(cerVarM);
            defpackage.aooh.f(bnvVar3, "shapes");
            cavVarB.u(-1545384952);
            defpackage.crd crdVar = zY ? bnvVar3.b : bnvVar3.a;
            if ((bnvVar3.a instanceof defpackage.bgc) && (bnvVar3.b instanceof defpackage.bgc)) {
                cavVarB.u(-808399240);
                cbtVar.Z(943754329, bnvVar3, 0, null);
                defpackage.aooh.d(crdVar, "null cannot be cast to non-null type androidx.compose.foundation.shape.RoundedCornerShape");
                defpackage.bgc bgcVar = (defpackage.bgc) crdVar;
                defpackage.aooh.f(bgcVar, "currentShape");
                boolean zB3 = cavVarB.B(ajlVarA);
                java.lang.Object objR4 = cbtVar.R();
                if (zB3) {
                    obj = obj2;
                } else {
                    obj = obj2;
                    if (objR4 == obj) {
                    }
                    acsyVar = (acsy) objR4;
                    zB = cavVarB.B(acsyVar) | cavVarB.B(bgcVar);
                    objR = cbtVar.R();
                    if (!zB || objR == obj) {
                        aonjVarI = null;
                        objR = new acju(acsyVar, bgcVar, (defpackage.aoln) null, 17);
                        cbtVar.ab(objR);
                    } else {
                        aonjVarI = null;
                    }
                    defpackage.cbp.f(bgcVar, acsyVar, (defpackage.aonn) objR, cavVarB);
                    defpackage.aooh.f(acsyVar, "state");
                    zB2 = cavVarB.B(acsyVar);
                    objR2 = cbtVar.R();
                    if (!zB2 || objR2 == obj) {
                        z4 = false;
                        objR2 = new acsw(acsyVar, 0);
                        cbtVar.ab(objR2);
                    } else {
                        z4 = false;
                    }
                    crdVar = (acsw) objR2;
                    cbtVar.W(z4);
                    cbtVar.W(z4);
                }
                objR4 = new acsy(bgcVar, ajlVarA);
                cbtVar.ab(objR4);
                acsyVar = (acsy) objR4;
                zB = cavVarB.B(acsyVar) | cavVarB.B(bgcVar);
                objR = cbtVar.R();
                if (zB) {
                    aonjVarI = null;
                    objR = new acju(acsyVar, bgcVar, (defpackage.aoln) null, 17);
                    cbtVar.ab(objR);
                } else {
                    aonjVarI = null;
                    objR = new acju(acsyVar, bgcVar, (defpackage.aoln) null, 17);
                    cbtVar.ab(objR);
                }
                defpackage.cbp.f(bgcVar, acsyVar, (defpackage.aonn) objR, cavVarB);
                defpackage.aooh.f(acsyVar, "state");
                zB2 = cavVarB.B(acsyVar);
                objR2 = cbtVar.R();
                if (zB2) {
                    z4 = false;
                    objR2 = new acsw(acsyVar, 0);
                    cbtVar.ab(objR2);
                } else {
                    z4 = false;
                    objR2 = new acsw(acsyVar, 0);
                    cbtVar.ab(objR2);
                }
                crdVar = (acsw) objR2;
                cbtVar.W(z4);
                cbtVar.W(z4);
            } else {
                bnvVar3 = bnvVar3;
                aonjVarI = null;
                z4 = false;
                cavVarB.u(-808305062);
                cbtVar.W(false);
            }
            cbtVar.W(z4);
            defpackage.cbd cbdVar = acrn.a;
            defpackage.aooh.f(cmwVar, "$this$energyEffect");
            defpackage.aooh.f(crdVar, "shape");
            defpackage.cmw acrlVar = new acrl(crdVar, j);
            defpackage.cko ckoVarG = defpackage.cfd.g();
            if (ckoVarG != null) {
                aonjVarI = ckoVarG.i();
            }
            defpackage.cko ckoVarH = defpackage.cfd.h(ckoVarG);
            try {
                acrr acrrVar = acrr.a;
                defpackage.cfd.i(ckoVarG, ckoVarH, aonjVarI);
                if (aK(acrrVar).b()) {
                    kawVar = kawVar2;
                    cmwVarK = defpackage.cfd.K(cmwVar, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, crdVar, true, 0, 1042431).a(acrlVar);
                } else {
                    kawVar = kawVar2;
                    cmwVarK = defpackage.cfd.K(cmwVar.a(acrlVar), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, crdVar, true, 0, 1042431);
                }
                defpackage.bni bniVarC = bniVar.c(defpackage.cfd.M(z4), bniVar.b, bniVar.c, bniVar.d);
                defpackage.ayy ayyVar5 = acpl.a;
                cavVar2 = cavVarB;
                boolean z5 = z3;
                ayyVar2 = ayyVarH;
                defpackage.aaoo.aE(aomyVar, bnvVar3, cmwVarK, z5, bniVarC, acpl.g(), ayyVar2, kawVar, aonoVar, cavVar2, (i6 & 14) | ((i7 >> 6) & 7168) | (i6 & 1879048192));
                z2 = z5;
                bnvVar2 = bnvVar3;
            } catch (java.lang.Throwable th) {
                defpackage.cfd.i(ckoVarG, ckoVarH, aonjVarI);
                throw th;
            }
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
            bnvVar2 = bnvVar;
            z2 = z;
            ayyVar2 = ayyVar;
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.bmp(aomyVar, cmwVar, bnvVar2, z2, bniVar, ayyVar2, aonoVar, i, 14);
        }
    }

    public static void aO(defpackage.aomy aomyVar, defpackage.cmw cmwVar, long j, long j2, defpackage.csm csmVar, defpackage.csm csmVar2, float f, defpackage.aonj aonjVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.cmw cmwVar2;
        long j3;
        long j4;
        float f2;
        long jT;
        float f3;
        int i3;
        long j5;
        defpackage.aooh.f(aomyVar, "progress");
        int i4 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1186709412);
        if (i4 == 0) {
            i2 = (true != cavVarB.D(aomyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            cmwVar2 = cmwVar;
            i2 |= true != cavVarB.B(cmwVar2) ? 16 : 32;
        } else {
            cmwVar2 = cmwVar;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i & 3072) == 0) {
            i2 |= 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= true != ((i & 32768) == 0 ? cavVarB.B(csmVar) : cavVarB.D(csmVar)) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != ((i & 262144) == 0 ? cavVarB.B(csmVar2) : cavVarB.D(csmVar2)) ? 65536 : 131072;
        }
        int i5 = i2 | 1572864;
        if ((12582912 & i) == 0) {
            i5 |= true != cavVarB.D(aonjVar) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            i5 |= true != cavVarB.y(75.398224f) ? 33554432 : 67108864;
        }
        if ((805306368 & i) == 0) {
            i5 |= true != cavVarB.y(0.0f) ? 268435456 : 536870912;
        }
        if (cavVarB.H((306783379 & i5) != 306783378, i5 & 1)) {
            ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
            if ((i & 1) == 0 || cavVarB.E()) {
                float f4 = acra.a;
                jT = defpackage.abrz.t(25, cavVarB);
                long jT2 = defpackage.abrz.t(31, cavVarB);
                f3 = acra.a;
                i3 = 262144;
                j5 = jT2;
            } else {
                cavVarB.s();
                jT = j;
                i3 = 262144;
                j5 = j2;
                f3 = f;
            }
            cavVarB.l();
            int i6 = i5 & 234881024;
            int i7 = (i5 & 126) | 32768 | (57344 & i5) | i3 | (458752 & i5) | (3670016 & i5) | (i5 & 29360128) | i6 | (i5 & 1879048192);
            long j6 = jT;
            bws.a(aomyVar, cmwVar2, j6, j5, csmVar, csmVar2, f3, aonjVar, cavVarB, i7);
            j4 = j5;
            f2 = f3;
            j3 = j6;
        } else {
            cavVarB.s();
            j3 = j;
            j4 = j2;
            f2 = f;
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new bwr(aomyVar, cmwVar, j3, j4, csmVar, csmVar2, f2, aonjVar, i, 2);
        }
    }

    public static defpackage.azz aP(defpackage.cav cavVar) {
        return new ayn(defpackage.uu.j(cavVar), 31);
    }

    public static bwk aQ(long j, defpackage.cav cavVar) {
        long jT = defpackage.abrz.t(36, cavVar);
        long jT2 = defpackage.abrz.t(17, cavVar);
        long jT3 = defpackage.abrz.t(17, cavVar);
        long jT4 = defpackage.abrz.t(18, cavVar);
        long jT5 = defpackage.abrz.t(18, cavVar);
        defpackage.ayy ayyVar = bwl.a;
        defpackage.bor borVarAk = defpackage.den.ak(cavVar);
        bwk bwkVar = borVarAk.ac;
        if (bwkVar == null) {
            bwkVar = new bwk(defpackage.bos.b(borVarAk, 34), defpackage.bos.b(borVarAk, 36), defpackage.bos.b(borVarAk, 17), defpackage.bos.b(borVarAk, 17), defpackage.bos.b(borVarAk, 18), defpackage.bos.b(borVarAk, 18));
            borVarAk.ac = bwkVar;
        }
        long j2 = j != 16 ? j : bwkVar.a;
        if (jT == r0) {
            jT = bwkVar.b;
        }
        long j3 = jT;
        if (jT2 == r0) {
            jT2 = bwkVar.c;
        }
        long j4 = jT2;
        if (jT3 == r0) {
            jT3 = bwkVar.d;
        }
        long j5 = jT3;
        if (jT4 == r0) {
            jT4 = bwkVar.e;
        }
        long j6 = jT4;
        if (jT5 == 16) {
            jT5 = bwkVar.f;
        }
        return new bwk(j2, j3, j4, j5, j6, jT5);
    }

    public static void aR(boolean z, defpackage.cmw cmwVar, boolean z2, bvp bvpVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.cmw cmwVar2;
        bvp bvpVar2;
        defpackage.cmw cmwVar3;
        bvp bvpVar3;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-789572113);
        if (i3 == 0) {
            i2 = (true != cavVarB.C(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.D(null) ? 16 : 32;
        }
        int i4 = i2 | 3456;
        if ((i & 24576) == 0) {
            i4 |= true != cavVarB.C(z2) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i4 |= 65536;
        }
        int i5 = i4 | 1572864;
        if (cavVarB.H((599187 & i5) != 599186, i5 & 1)) {
            ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
            if ((i & 1) == 0 || cavVarB.E()) {
                defpackage.cmt cmtVar = defpackage.cmw.c;
                cmwVar3 = cmtVar;
                bvpVar3 = new bvp(defpackage.abrz.t(9, cavVarB), defpackage.abrz.t(25, cavVarB), defpackage.cfd.M(0), defpackage.abrz.t(25, cavVarB), defpackage.abrz.t(23, cavVarB), defpackage.abrz.t(38, cavVarB), defpackage.abrz.t(23, cavVarB), defpackage.abrz.t(38, cavVarB), defpackage.cfd.P(defpackage.cqg.h(defpackage.abrz.t(34, cavVarB), 1.0f), defpackage.den.ak(cavVarB).p), defpackage.cfd.P(defpackage.cqg.h(defpackage.abrz.t(17, cavVarB), 0.12f), defpackage.den.ak(cavVarB).p), defpackage.cfd.M(0), defpackage.cfd.P(defpackage.cqg.h(defpackage.abrz.t(17, cavVarB), 0.38f), defpackage.den.ak(cavVarB).p), defpackage.cfd.P(defpackage.cqg.h(defpackage.abrz.t(17, cavVarB), 0.38f), defpackage.den.ak(cavVarB).p), defpackage.cfd.P(defpackage.cqg.h(defpackage.abrz.t(38, cavVarB), 0.12f), defpackage.den.ak(cavVarB).p), defpackage.cfd.P(defpackage.cqg.h(defpackage.abrz.t(17, cavVarB), 0.12f), defpackage.den.ak(cavVarB).p), defpackage.cfd.P(defpackage.cqg.h(defpackage.abrz.t(38, cavVarB), 0.38f), defpackage.den.ak(cavVarB).p));
            } else {
                cavVarB.s();
                cmwVar3 = cmwVar;
                bvpVar3 = bvpVar;
            }
            cavVarB.l();
            bvr.a(z, cmwVar3, z2, bvpVar3, cavVarB, i5 & 3735550);
            cmwVar2 = cmwVar3;
            bvpVar2 = bvpVar3;
        } else {
            cavVarB.s();
            cmwVar2 = cmwVar;
            bvpVar2 = bvpVar;
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new lpm(z, cmwVar2, z2, bvpVar2, i, 5);
        }
    }

    public static java.lang.Integer aS(ajml ajmlVar) {
        return (java.lang.Integer) ajmlVar.a("maxIterations");
    }

    public static /* synthetic */ defpackage.aojh aT(aogy aogyVar) {
        defpackage.aooh.f(aogyVar, "$this$keyframes");
        aogyVar.a = 10000;
        java.lang.Float fValueOf = java.lang.Float.valueOf(0.0f);
        ajz ajzVarN = aogyVar.n(fValueOf, 0);
        defpackage.ajh ajhVar = defpackage.aji.c;
        ((ajy) ajzVarN).b = ajhVar;
        ajz ajzVarN2 = aogyVar.n(java.lang.Float.valueOf(0.15f), 2500);
        defpackage.ajh ajhVar2 = defpackage.aji.g;
        ((ajy) ajzVarN2).b = ajhVar2;
        ((ajy) aogyVar.n(fValueOf, 5000)).b = ajhVar;
        ((ajy) aogyVar.n(java.lang.Float.valueOf(-0.15f), 7500)).b = ajhVar2;
        ((ajy) aogyVar.n(fValueOf, 10000)).b = ajhVar;
        return defpackage.aojh.a;
    }

    public static /* synthetic */ defpackage.aojh aU(aogy aogyVar) {
        defpackage.aooh.f(aogyVar, "$this$keyframes");
        aogyVar.a = 1500;
        java.lang.Float fValueOf = java.lang.Float.valueOf(-0.2f);
        aogyVar.n(fValueOf, 0);
        ((ajy) aogyVar.n(fValueOf, 300)).b = defpackage.ajk.a;
        java.lang.Float fValueOf2 = java.lang.Float.valueOf(0.2f);
        aogyVar.n(fValueOf2, 1050);
        aogyVar.n(fValueOf2, 1500);
        return defpackage.aojh.a;
    }

    public static /* synthetic */ defpackage.aojh aV(aogy aogyVar) {
        defpackage.aooh.f(aogyVar, "$this$keyframes");
        aogyVar.a = 1500;
        java.lang.Float fValueOf = java.lang.Float.valueOf(0.0f);
        ((ajy) aogyVar.n(fValueOf, 0)).b = defpackage.aji.e;
        java.lang.Float fValueOf2 = java.lang.Float.valueOf(1.0f);
        aogyVar.n(fValueOf2, 525);
        ((ajy) aogyVar.n(fValueOf2, 975)).b = defpackage.aji.d;
        aogyVar.n(fValueOf, 1500);
        return defpackage.aojh.a;
    }

    public static /* synthetic */ defpackage.aojh aW(aogy aogyVar) {
        defpackage.aooh.f(aogyVar, "$this$keyframes");
        aogyVar.a = 1500;
        java.lang.Float fValueOf = java.lang.Float.valueOf(0.0f);
        aogyVar.n(fValueOf, 0);
        ((ajy) aogyVar.n(fValueOf, 375)).b = defpackage.aji.e;
        ((ajy) aogyVar.n(java.lang.Float.valueOf(1.0f), 750)).b = defpackage.aji.d;
        aogyVar.n(fValueOf, 1200);
        aogyVar.n(fValueOf, 1500);
        return defpackage.aojh.a;
    }

    public static /* synthetic */ int aX(java.lang.Object obj) {
        j$.util.Objects.checkIndex(0, 4);
        if (obj instanceof abhm) {
            return 0;
        }
        if (obj instanceof abho) {
            return 1;
        }
        return obj instanceof abhn ? 2 : -2;
    }

    public static void aY(abja abjaVar, float f, float f2, bpw bpwVar, java.lang.String str, defpackage.aomy aomyVar, boolean z, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.cav cavVar2;
        long j;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(110535383);
        if (i3 == 0) {
            i2 = (true != cavVarB.z(abjaVar.ordinal()) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.y(f) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.y(f2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.B(bpwVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cavVarB.B(str) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != cavVarB.D(aomyVar) ? 65536 : 131072;
        }
        if ((i & 1572864) == 0) {
            i2 |= true != cavVarB.C(z) ? 524288 : 1048576;
        }
        if (cavVarB.H((599187 & i2) != 599186, i2 & 1)) {
            defpackage.cmi cmiVar = defpackage.cmh.k;
            defpackage.cmt cmtVar = defpackage.cmw.c;
            defpackage.cye cyeVarA = defpackage.aww.a(defpackage.awi.c, cmiVar, cavVarB, 48);
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            int iM = defpackage.anty.M(cbtVar.x);
            defpackage.cje cjeVarAi = cbtVar.ai();
            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmtVar);
            defpackage.aomy aomyVar2 = defpackage.dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar2);
            } else {
                cavVarB.x();
            }
            defpackage.cev.c(cavVarB, cyeVarA, defpackage.dam.e);
            defpackage.cev.c(cavVarB, cjeVarAi, defpackage.dam.d);
            defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM), defpackage.dam.f);
            defpackage.cev.b(cavVarB, defpackage.dam.g);
            defpackage.cev.c(cavVarB, cmwVarM, defpackage.dam.c);
            defpackage.aaoo.aC(aomyVar, defpackage.azm.i(cmtVar, f2, 72.0f), false, bpwVar, null, null, defpackage.cfo.j(-1513113237, new zjn(abjaVar, str, 4, (byte[]) null), cavVarB), cavVarB, (i2 & 7168) | ((i2 >> 15) & 14) | 1572864, 52);
            defpackage.cmw cmwVarBD = bD(defpackage.azm.k(defpackage.den.ba(cmtVar, 0.0f, 12.0f, 0.0f, 0.0f), f));
            defpackage.dkz dkzVar = defpackage.den.an(cavVarB).h;
            if (z) {
                cavVarB.u(-254641326);
                cbtVar.W(false);
                j = -4294967296L;
            } else {
                cavVarB.u(-254640138);
                j = defpackage.den.ak(cavVarB).q;
                cbtVar.W(false);
            }
            cavVar2 = cavVarB;
            defpackage.abrz.k(str, cmwVarBD, j, 0L, null, null, 0L, new defpackage.dot(3), 0L, 2, false, 1, 0, null, dkzVar, cavVar2, (i2 >> 12) & 14, 24960, 109560);
            cbtVar.W(true);
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abgr(abjaVar, f, f2, bpwVar, str, aomyVar, z, i);
        }
    }

    public static void aZ(awv awvVar, abgx abgxVar, defpackage.cmw cmwVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.cmw cmwVar2;
        defpackage.aooh.f(awvVar, "<this>");
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1391318766);
        if (i3 == 0) {
            i2 = i | (true != cavVarB.B(awvVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(abgxVar) ? 16 : 32;
        }
        int i4 = i2 | 384;
        if (cavVarB.H((i4 & 147) != 146, i4 & 1)) {
            defpackage.cmt cmtVar = defpackage.cmw.c;
            int iA = defpackage.dpi.a(awvVar.b(), 320.0f);
            float fB = awvVar.b();
            float f = iA >= 0 ? 24.0f : 8.0f;
            float f2 = (((((fB - ((f + f) + 0.0f)) + 0.0f) - 8.0f) + 0.0f) / 2.0f) + 0.0f;
            float f3 = ((defpackage.dpi) defpackage.aooc.A(new defpackage.dpi(88.0f), new defpackage.dpi(f2))).a;
            float f4 = ((defpackage.dpi) defpackage.aooc.A(new defpackage.dpi(defpackage.dpi.a(awvVar.b(), 240.0f) >= 0 ? 108.0f : 88.0f), new defpackage.dpi(f2))).a;
            defpackage.cmw cmwVarX = defpackage.den.x(defpackage.azm.d(cmtVar, 1.0f), "answer_method_tap_container");
            defpackage.aonj aonjVar = abgxVar.k;
            int i5 = i4 & 112;
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            if (i5 == 32 || objR == defpackage.cau.a) {
                objR = new bil(abgxVar, 15);
                cbtVar.ab(objR);
            }
            defpackage.cmw cmwVarAZ = defpackage.den.aZ(defpackage.cvy.a(cmwVarX, aonjVar, (androidx.compose.ui.input.pointer.PointerInputEventHandler) objR), f, 0.0f);
            defpackage.cye cyeVarA = defpackage.azh.a(defpackage.awi.g, defpackage.cmh.m, cavVarB, 6);
            int iM = defpackage.anty.M(cbtVar.x);
            defpackage.cje cjeVarAi = cbtVar.ai();
            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmwVarAZ);
            defpackage.aomy aomyVar = defpackage.dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            defpackage.cev.c(cavVarB, cyeVarA, defpackage.dam.e);
            defpackage.cev.c(cavVarB, cjeVarAi, defpackage.dam.d);
            defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM), defpackage.dam.f);
            defpackage.cev.b(cavVarB, defpackage.dam.g);
            defpackage.cev.c(cavVarB, cmwVarM, defpackage.dam.c);
            abja abjaVar = abgxVar.b;
            bpw bpwVarAa = defpackage.aaoo.aa(defpackage.abts.F(cavVarB).s, defpackage.abts.F(cavVarB).t, defpackage.cqg.h(defpackage.abts.F(cavVarB).s, 0.38f), defpackage.cqg.h(defpackage.abts.F(cavVarB).t, 0.38f), cavVarB, 0);
            java.lang.String str = abgxVar.e;
            defpackage.aomy aomyVar2 = abgxVar.f;
            boolean z = abgxVar.l;
            aY(abjaVar, f4, f3, bpwVarAa, str, aomyVar2, z, cavVarB, 0);
            defpackage.den.aR(defpackage.azm.k(cmtVar, 8.0f), cavVarB);
            aY(abgxVar.a, f4, f3, defpackage.aaoo.aa(defpackage.abts.F(cavVarB).n, defpackage.abts.F(cavVarB).o, defpackage.cqg.h(defpackage.abts.F(cavVarB).n, 0.38f), defpackage.cqg.h(defpackage.abts.F(cavVarB).o, 0.38f), cavVarB, 0), abgxVar.c, abgxVar.d, z, cavVarB, 0);
            cavVarB = cavVarB;
            cbtVar.W(true);
            cmwVar2 = cmtVar;
        } else {
            cavVarB.s();
            cmwVar2 = cmwVar;
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new ppx(awvVar, abgxVar, cmwVar2, i, 17);
        }
    }

    public static void aa(android.content.Context context, android.net.Uri uri, android.net.Uri uri2) throws java.io.IOException {
        try {
            defpackage.zzx zzxVar = new defpackage.zzx((java.lang.Object) context, (byte[]) null);
            android.system.Os.symlink(zzxVar.H(uri2).getAbsolutePath(), zzxVar.H(uri).getAbsolutePath());
        } catch (defpackage.afex | android.system.ErrnoException e) {
            throw new java.io.IOException("Unable to create symlink", e);
        }
    }

    public static acwe ab(java.lang.String str, android.content.Context context, defpackage.acxa acxaVar) throws defpackage.adbz {
        defpackage.akzx akzxVarM;
        java.util.List listJ = defpackage.ahzf.d("|").j(str);
        int iOrdinal = aC(context, acxaVar).ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (listJ.size() != 4) {
                    throw new defpackage.adbz("Bad-format serializedFileKey = ".concat(java.lang.String.valueOf(str)));
                }
                akzxVarM = acwe.a.m();
                java.lang.String str2 = (java.lang.String) listJ.get(0);
                akzxVarM.u();
                acwe acweVar = akzxVarM.b;
                j$.util.Objects.requireNonNull(str2);
                acweVar.b |= 1;
                acweVar.c = str2;
                long j = java.lang.Integer.parseInt((java.lang.String) listJ.get(1));
                akzxVarM.u();
                acwe acweVar2 = akzxVarM.b;
                acweVar2.b |= 2;
                acweVar2.d = j;
                java.lang.String str3 = (java.lang.String) listJ.get(2);
                akzxVarM.u();
                acwe acweVar3 = akzxVarM.b;
                j$.util.Objects.requireNonNull(str3);
                acweVar3.b |= 4;
                acweVar3.e = str3;
                int iAQ = defpackage.a.aQ(java.lang.Integer.parseInt((java.lang.String) listJ.get(3)));
                akzxVarM.u();
                acwe acweVar4 = akzxVarM.b;
                int i = iAQ - 1;
                if (iAQ == 0) {
                    throw null;
                }
                acweVar4.f = i;
                acweVar4.b |= 8;
            } else {
                if (listJ.size() != 2) {
                    throw new defpackage.adbz("Bad-format serializedFileKey = s".concat(java.lang.String.valueOf(str)));
                }
                akzxVarM = acwe.a.m();
                java.lang.String str4 = (java.lang.String) listJ.get(0);
                akzxVarM.u();
                acwe acweVar5 = akzxVarM.b;
                j$.util.Objects.requireNonNull(str4);
                acweVar5.b |= 4;
                acweVar5.e = str4;
                int iAQ2 = defpackage.a.aQ(java.lang.Integer.parseInt((java.lang.String) listJ.get(1)));
                akzxVarM.u();
                acwe acweVar6 = akzxVarM.b;
                int i2 = iAQ2 - 1;
                if (iAQ2 == 0) {
                    throw null;
                }
                acweVar6.f = i2;
                acweVar6.b |= 8;
            }
        } else {
            if (listJ.size() != 5) {
                throw new defpackage.adbz("Bad-format serializedFileKey = ".concat(java.lang.String.valueOf(str)));
            }
            defpackage.akzx akzxVarM2 = acwe.a.m();
            java.lang.String str5 = (java.lang.String) listJ.get(0);
            akzxVarM2.u();
            acwe acweVar7 = akzxVarM2.b;
            j$.util.Objects.requireNonNull(str5);
            acweVar7.b |= 1;
            acweVar7.c = str5;
            long j2 = java.lang.Integer.parseInt((java.lang.String) listJ.get(1));
            akzxVarM2.u();
            acwe acweVar8 = akzxVarM2.b;
            acweVar8.b |= 2;
            acweVar8.d = j2;
            java.lang.String str6 = (java.lang.String) listJ.get(2);
            akzxVarM2.u();
            acwe acweVar9 = akzxVarM2.b;
            j$.util.Objects.requireNonNull(str6);
            acweVar9.b |= 4;
            acweVar9.e = str6;
            int iAQ3 = defpackage.a.aQ(java.lang.Integer.parseInt((java.lang.String) listJ.get(3)));
            akzxVarM2.u();
            acwe acweVar10 = akzxVarM2.b;
            int i3 = iAQ3 - 1;
            if (iAQ3 == 0) {
                throw null;
            }
            acweVar10.f = i3;
            acweVar10.b |= 8;
            if (listJ.get(4) != null && !((java.lang.String) listJ.get(4)).isEmpty()) {
                try {
                    java.lang.String str7 = (java.lang.String) listJ.get(4);
                    amlu amluVar = amlu.a;
                    amlu amluVarE = defpackage.abrz.E(str7, defpackage.alad.M(amlu.class));
                    akzxVarM2.u();
                    acwe acweVar11 = akzxVarM2.b;
                    j$.util.Objects.requireNonNull(amluVarE);
                    acweVar11.g = amluVarE;
                    acweVar11.b |= 16;
                } catch (defpackage.alaz e) {
                    throw new defpackage.adbz("Failed to deserialize key:".concat(java.lang.String.valueOf(str)), e);
                }
            }
            akzxVarM = akzxVarM2;
        }
        return akzxVarM.r();
    }

    public static java.lang.String ac(acwe acweVar, android.content.Context context, defpackage.acxa acxaVar) {
        int iOrdinal = aC(context, acxaVar).ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return ae(acweVar);
            }
            if (iOrdinal == 2) {
                return ad(acweVar);
            }
            throw new java.lang.RuntimeException(null, null);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(acweVar.c);
        sb.append('|');
        sb.append(acweVar.d);
        sb.append('|');
        sb.append(acweVar.e);
        sb.append('|');
        int iAQ = defpackage.a.aQ(acweVar.f);
        sb.append((iAQ != 0 ? iAQ : 1) - 1);
        return sb.toString();
    }

    public static java.lang.String ad(acwe acweVar) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(acweVar.e);
        sb.append('|');
        int iAQ = defpackage.a.aQ(acweVar.f);
        if (iAQ == 0) {
            iAQ = 1;
        }
        sb.append(iAQ - 1);
        return sb.toString();
    }

    public static java.lang.String ae(acwe acweVar) {
        java.lang.String strH;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(acweVar.c);
        sb.append('|');
        sb.append(acweVar.d);
        sb.append('|');
        sb.append(acweVar.e);
        sb.append('|');
        int iAQ = defpackage.a.aQ(acweVar.f);
        if (iAQ == 0) {
            iAQ = 1;
        }
        sb.append(iAQ - 1);
        sb.append('|');
        if ((acweVar.b & 16) != 0) {
            amlu amluVar = acweVar.g;
            if (amluVar == null) {
                amluVar = amlu.a;
            }
            strH = defpackage.abrz.H(amluVar);
        } else {
            strH = "";
        }
        sb.append(strH);
        return sb.toString();
    }

    public static java.nio.ByteBuffer af(java.lang.Iterable iterable) {
        java.lang.String str;
        java.util.Iterator it = iterable.iterator();
        long jL = 0;
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            jL += (long) (((defpackage.albh) it.next()).l() + 12);
            i2++;
        }
        if (i2 == 0) {
            return java.nio.ByteBuffer.allocate(0);
        }
        try {
            java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate((int) jL);
            byte[] bArrArray = byteBufferAllocate.array();
            java.util.Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                defpackage.albh albhVar = (defpackage.albh) it2.next();
                int iL = albhVar.l();
                try {
                    byteBufferAllocate.putInt(iL);
                    int i3 = i + 4;
                    try {
                        albhVar.S(new defpackage.akzh(bArrArray, i3, iL));
                    } catch (java.io.IOException e) {
                        android.util.Log.e("ProtoLiteUtil", "Exception while writing to buffer.", e);
                    }
                    try {
                        byteBufferAllocate.put(bArrArray, i3, iL);
                        int i4 = i3 + iL;
                        java.util.zip.CRC32 crc32 = new java.util.zip.CRC32();
                        crc32.update(bArrArray, i4 - iL, iL);
                        byteBufferAllocate.putLong(crc32.getValue());
                        i = i4 + 8;
                    } catch (java.nio.BufferOverflowException e2) {
                        android.util.Log.e("ProtoLiteUtil", "Buffer underflow. A message may have an invalid serialized form or has been concurrently modified.", e2);
                        return null;
                    }
                } catch (java.nio.BufferOverflowException e3) {
                    android.util.Log.e("ProtoLiteUtil", "Buffer underflow. A message may have an invalid serialized form or has been concurrently modified.", e3);
                    return null;
                }
            }
            byteBufferAllocate.rewind();
            return byteBufferAllocate;
        } catch (java.lang.IllegalArgumentException e4) {
            if (jL > 1073741824) {
                str = java.lang.String.format(java.util.Locale.US, "%.2fGB", java.lang.Double.valueOf(jL / 1.073741824E9d));
            } else if (jL > 1048576) {
                str = java.lang.String.format(java.util.Locale.US, "%.2fMB", java.lang.Double.valueOf(jL / 1048576.0d));
            } else {
                str = jL > 1024 ? java.lang.String.format(java.util.Locale.US, "%.2fKB", java.lang.Double.valueOf(jL / 1024.0d)) : java.lang.String.format(java.util.Locale.US, "%d Bytes", java.lang.Long.valueOf(jL));
            }
            android.util.Log.e("ProtoLiteUtil", java.lang.String.format("Too big to serialize, %s", str), e4);
            return null;
        }
    }

    public static java.util.List ag(java.nio.ByteBuffer byteBuffer, java.lang.Class cls, defpackage.albn albnVar) {
        java.lang.Object objK;
        java.lang.String string = cls.toString();
        int iLimit = byteBuffer.limit();
        java.util.ArrayList arrayList = new java.util.ArrayList((byteBuffer.limit() / 1000) + 1);
        while (byteBuffer.position() < iLimit) {
            try {
                int i = byteBuffer.getInt();
                if (i < 0) {
                    android.util.Log.e("ProtoLiteUtil", java.lang.String.format("Invalid message size: %d. May have given the wrong message type: %s", java.lang.Integer.valueOf(i), string));
                } else {
                    if (iLimit < byteBuffer.position() + i + 8) {
                        android.util.Log.e("ProtoLiteUtil", java.lang.String.format("Invalid message size: %d (buffer end is %d)", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(iLimit)));
                        return arrayList;
                    }
                    long j = byteBuffer.getLong(byteBuffer.position() + i);
                    byte[] bArrArray = byteBuffer.array();
                    int iArrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
                    java.util.zip.CRC32 crc32 = new java.util.zip.CRC32();
                    crc32.update(bArrArray, iArrayOffset, i);
                    long value = crc32.getValue();
                    if (value != j) {
                        android.util.Log.e("ProtoLiteUtil", java.lang.String.format("Corrupt protobuf data, expected CRC: %d computed CRC: %d", java.lang.Long.valueOf(j), java.lang.Long.valueOf(value)));
                        return arrayList;
                    }
                    try {
                        objK = albnVar.k(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), i, defpackage.akzq.a);
                    } catch (defpackage.alaz e) {
                        android.util.Log.e("ProtoLiteUtil", "Cannot deserialize message of type ".concat(cls.toString()), e);
                        objK = null;
                    }
                    if (objK != null) {
                        arrayList.add(objK);
                        byteBuffer.position(byteBuffer.position() + i + 8);
                    }
                }
            } catch (java.nio.BufferUnderflowException e2) {
                android.util.Log.e("ProtoLiteUtil", java.lang.String.format("Buffer underflow. May have given the wrong message type: %s", string), e2);
            }
            return null;
        }
        return arrayList;
    }

    public static acvw ah(defpackage.acuz acuzVar) {
        return defpackage.alad.B(acvw.a, acuzVar.i(), defpackage.akzq.a);
    }

    public static acwb ai(java.lang.String str) throws defpackage.adbx {
        try {
            acwb acwbVar = acwb.a;
            return defpackage.abrz.E(str, defpackage.alad.M(acwb.class));
        } catch (defpackage.alaz | java.lang.NullPointerException e) {
            throw new defpackage.adbx("Failed to deserialize key:".concat(java.lang.String.valueOf(str)), e);
        }
    }

    public static java.io.File aj(android.content.Context context, defpackage.ahyn ahynVar) {
        java.lang.String strConcat = "gms_icing_mdd_garbage_file";
        if (ahynVar != null && ahynVar.f()) {
            strConcat = "gms_icing_mdd_garbage_file".concat((java.lang.String) ahynVar.b());
        }
        return new java.io.File(context.getFilesDir(), strConcat);
    }

    public static java.lang.String ak(acwb acwbVar) {
        return android.util.Base64.encodeToString(acwbVar.i(), 3);
    }

    public static long al(acvu acvuVar) {
        if (acvuVar.l == 0) {
            return Long.MAX_VALUE;
        }
        return java.util.concurrent.TimeUnit.SECONDS.toMillis(acvuVar.l);
    }

    public static android.net.Uri am(android.net.Uri uri, acvr acvrVar) {
        android.net.Uri.Builder builderBuildUpon = uri.buildUpon();
        if (acvrVar.p.isEmpty()) {
            java.lang.String str = acvrVar.d;
            builderBuildUpon.appendPath(str.substring(str.lastIndexOf("/") + 1));
        } else {
            for (java.lang.String str2 : acvrVar.p.split("/", -1)) {
                if (!str2.isEmpty()) {
                    builderBuildUpon.appendPath(str2);
                }
            }
        }
        return builderBuildUpon.build();
    }

    public static android.net.Uri an(android.content.Context context, defpackage.ahyn ahynVar, acvu acvuVar) {
        java.lang.String str = !acvuVar.w.isEmpty() ? acvuVar.w : acvuVar.d;
        int iAQ = defpackage.a.aQ(acvuVar.j);
        if (iAQ == 0) {
            iAQ = 1;
        }
        return defpackage.abrz.M(context, ahynVar).buildUpon().appendPath(defpackage.abrz.Q(iAQ)).build().buildUpon().appendPath(str).build();
    }

    public static acvu ao(acvu acvuVar, long j) {
        acvs acvsVar = acvuVar.c;
        if (acvsVar == null) {
            acvsVar = acvs.a;
        }
        defpackage.akzx akzxVarP = acvsVar.L();
        akzxVarP.u();
        acvs acvsVar2 = akzxVarP.b;
        acvsVar2.b |= 1;
        acvsVar2.c = j;
        acvs acvsVarP = akzxVarP.r();
        defpackage.akzx akzxVarP2 = acvuVar.L();
        akzxVarP2.u();
        acvu acvuVar2 = akzxVarP2.b;
        j$.util.Objects.requireNonNull(acvsVarP);
        acvuVar2.c = acvsVarP;
        acvuVar2.b |= 1;
        return akzxVarP2.r();
    }

    public static java.lang.String ap(acvr acvrVar) {
        return aq(acvrVar) ? acvrVar.i : acvrVar.g;
    }

    public static boolean aq(acvr acvrVar) {
        if ((acvrVar.b & 32) != 0) {
            amlu amluVar = acvrVar.h;
            if (amluVar == null) {
                amluVar = amlu.a;
            }
            java.util.Iterator it = amluVar.b.iterator();
            while (it.hasNext()) {
                if (((amlt) it.next()).b == 4) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    public static boolean ar(java.lang.String str, defpackage.aihd aihdVar) {
        if (str.isEmpty()) {
            return false;
        }
        int iIndexOf = str.indexOf(58);
        defpackage.ahvr.cc((iIndexOf ^ (-1)) >>> 31, "Invalid url: %s", str);
        java.lang.String strSubstring = str.substring(0, iIndexOf);
        defpackage.ailj ailjVarK = aihdVar.iterator();
        while (ailjVarK.hasNext()) {
            if (defpackage.ahvr.r(strSubstring, (java.lang.String) ailjVarK.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean as(acvr acvrVar) {
        return ar(acvrVar.d, new defpackage.aile("inlinefile"));
    }

    public static boolean at(acvu acvuVar) {
        int iAe;
        if (!acvuVar.n) {
            return false;
        }
        java.util.Iterator it = acvuVar.o.iterator();
        do {
            if (!it.hasNext()) {
                return true;
            }
            iAe = defpackage.a.ae(((acvr) it.next()).m);
        } while ((iAe != 0 ? iAe : 1) != 2);
        return false;
    }

    public static boolean au(acvr acvrVar) {
        return ar(acvrVar.d, defpackage.aihd.r("file", "asset"));
    }

    public static boolean av(long j) {
        return j <= defpackage.abrz.V();
    }

    public static android.net.Uri aw(android.net.Uri uri) {
        java.lang.String string = uri.toString();
        return android.net.Uri.parse(string.substring(0, string.lastIndexOf("_")));
    }

    public static java.lang.String ax(java.lang.String str, java.lang.String str2) {
        return str + '_' + str2;
    }

    public static void b(android.graphics.Outline outline, android.graphics.Path path) {
        baa$.ExternalSyntheticApiModelOutline1.m(outline, path);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void bA(int i, java.util.List list, defpackage.aono aonoVar, defpackage.cav cavVar, int i2) {
        int i3;
        int i4 = i2 & 6;
        defpackage.cav cavVarB = cavVar.b(-423572455);
        if (i4 == 0) {
            i3 = (true != cavVarB.z(i) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != ((i2 & 64) == 0 ? cavVarB.B(list) : cavVarB.D(list)) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != cavVarB.D(aonoVar) ? 128 : 256;
        }
        if (!cavVarB.H((i3 & 147) != 146, i3 & 1)) {
            cavVarB.s();
        } else {
            if (((defpackage.aojj) list).a() <= 1) {
                throw new java.lang.IllegalStateException("Options list must contain more than one element");
            }
            int i5 = i3 & 14;
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            if (i5 == 4 || objR == defpackage.cau.a) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(null, defpackage.cdu.c);
                cbtVar.ab(parcelableSnapshotMutableState);
                objR = parcelableSnapshotMutableState;
            }
            defpackage.ccp ccpVar = (defpackage.ccp) objR;
            java.lang.Object objA = ccpVar.a();
            if (objA != null) {
                cavVarB.u(-32706731);
                aonoVar.a(objA, cavVarB, java.lang.Integer.valueOf((i3 >> 3) & 112));
                cbtVar.W(false);
            } else {
                cavVarB.u(-32628735);
                boolean zB = ((i3 & 112) == 32 || ((i3 & 64) != 0 && cavVarB.D(list))) | (i5 == 4) | cavVarB.B(ccpVar);
                java.lang.Object objR2 = cbtVar.R();
                if (zB || objR2 == defpackage.cau.a) {
                    objR2 = new abdw(list, ccpVar, i);
                    cbtVar.ab(objR2);
                }
                defpackage.cye cyeVar = (defpackage.cye) objR2;
                defpackage.cmt cmtVar = defpackage.cmw.c;
                int iM = defpackage.anty.M(cbtVar.x);
                defpackage.cje cjeVarAi = cbtVar.ai();
                defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmtVar);
                defpackage.aomy aomyVar = defpackage.dam.a;
                cavVarB.v();
                if (cbtVar.w) {
                    cavVarB.j(aomyVar);
                } else {
                    cavVarB.x();
                }
                defpackage.cev.c(cavVarB, cyeVar, defpackage.dam.e);
                defpackage.cev.c(cavVarB, cjeVarAi, defpackage.dam.d);
                defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM), defpackage.dam.f);
                defpackage.cev.b(cavVarB, defpackage.dam.g);
                defpackage.cev.c(cavVarB, cmwVarM, defpackage.dam.c);
                cavVarB.u(1204743153);
                defpackage.aojl aojlVar = new defpackage.aojl((defpackage.aojo) list);
                while (aojlVar.hasNext()) {
                    aonoVar.a(aojlVar.next(), cavVarB, java.lang.Integer.valueOf((i3 >> 3) & 112));
                }
                cbtVar.W(false);
                cbtVar.W(true);
                cbtVar.W(false);
            }
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new bbu(i, list, aonoVar, i2, 6);
        }
    }

    public static void bB(float f, defpackage.aonn aonnVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.aooh.f(aonnVar, "content");
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-90584609);
        if (i3 == 0) {
            i2 = (true != cavVarB.y(f) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.D(aonnVar) ? 16 : 32;
        }
        if (cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            abdx abdxVar = new abdx(f);
            defpackage.cmt cmtVar = defpackage.cmw.c;
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            int iM = defpackage.anty.M(cbtVar.x);
            defpackage.cje cjeVarAi = cbtVar.ai();
            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmtVar);
            int i4 = ((i2 >> 3) & 14) << 6;
            defpackage.aomy aomyVar = defpackage.dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            defpackage.cev.c(cavVarB, abdxVar, defpackage.dam.e);
            defpackage.cev.c(cavVarB, cjeVarAi, defpackage.dam.d);
            defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM), defpackage.dam.f);
            defpackage.cev.b(cavVarB, defpackage.dam.g);
            defpackage.cev.c(cavVarB, cmwVarM, defpackage.dam.c);
            aonnVar.a(cavVarB, java.lang.Integer.valueOf(((i4 & 896) >> 6) & 14));
            cbtVar.W(true);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abdv(f, aonnVar, i, 0);
        }
    }

    public static void bC(java.util.List list, defpackage.aono aonoVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.aooh.f(list, "options");
        defpackage.aooh.f(aonoVar, "content");
        defpackage.cav cavVarB = cavVar.b(-2083813452);
        if ((i & 6) == 0) {
            i2 = (true != cavVarB.y(0.25f) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? cavVarB.B(list) : cavVarB.D(list)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.D(aonoVar) ? 128 : 256;
        }
        if (cavVarB.H((i2 & 147) != 146, i2 & 1)) {
            bA(defpackage.aopc.i(((int) (((defpackage.dgn) cavVarB.e(defpackage.dfo.o)).b() & 4294967295L)) * 0.25f), list, aonoVar, cavVarB, i2 & 1008);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.slz(list, aonoVar, i, 11, null);
        }
    }

    public static defpackage.cmw bD(defpackage.cmw cmwVar) {
        defpackage.aooh.f(cmwVar, "<this>");
        return defpackage.dig.a(cmwVar, new yrz(9));
    }

    public static defpackage.cmw bE(defpackage.cmw cmwVar, java.lang.String str, defpackage.dib dibVar) {
        defpackage.aooh.f(cmwVar, "$this$contentDescription");
        return str != null ? cmwVar.a(defpackage.dig.b(defpackage.cmw.c, true, new abdu(str, dibVar, 0))) : cmwVar;
    }

    public static android.content.Intent bF(abdr abdrVar) {
        int i;
        if (abdrVar.e.size() >= 200) {
            defpackage.akzx akzxVarP = abdrVar.L();
            akzxVarP.u();
            akzxVarP.b.e = defpackage.albq.a;
            abdrVar = (abdr) akzxVarP.r();
        }
        android.content.Intent intent = new android.content.Intent("android.intent.action.INSERT");
        intent.setType("vnd.android.cursor.item/event");
        intent.setPackage("com.google.android.calendar");
        intent.putExtra("proto", abdrVar.i());
        intent.putExtra("android.intent.extra.EMAIL", (java.lang.String[]) defpackage.ahvr.bs(defpackage.aieu.c(new aiht(defpackage.aieu.c(abdrVar.e).d(), new ymu(10))).d(), java.lang.String.class));
        int i2 = 0;
        intent.putExtra("allDay", false);
        if ((abdrVar.b & 16) != 0) {
            intent.putExtra("beginTime", abdrVar.f);
        }
        if ((abdrVar.b & 32) != 0) {
            intent.putExtra("endTime", abdrVar.g);
        }
        if ((abdrVar.b & 4) != 0) {
            intent.putExtra("title", abdrVar.d);
        }
        if ((abdrVar.b & 128) != 0) {
            intent.putExtra("eventLocation", abdrVar.i);
        }
        if ((abdrVar.b & 256) != 0) {
            intent.putExtra("description", abdrVar.j);
        }
        if ((abdrVar.b & 512) != 0) {
            intent.putExtra("rrule", abdrVar.k);
        }
        if ((abdrVar.b & 1024) != 0) {
            int iAQ = defpackage.a.aQ(abdrVar.l);
            if (iAQ == 0) {
                iAQ = 1;
            }
            int i3 = iAQ - 1;
            if (i3 != 0) {
                i = i3 != 1 ? 2 : 1;
            } else {
                i = 0;
            }
            intent.putExtra("availability", i);
        }
        if ((abdrVar.b & 2048) != 0) {
            int iAQ2 = defpackage.a.aQ(abdrVar.m);
            if (iAQ2 == 0) {
                iAQ2 = 1;
            }
            int i4 = iAQ2 - 1;
            if (i4 != 0) {
                i2 = i4 != 1 ? 3 : 2;
            }
            intent.putExtra("accessLevel", i2);
        }
        if ((abdrVar.b & 64) != 0) {
            intent.putExtra("eventTimezone", abdrVar.h);
        }
        return intent;
    }

    public static synchronized defpackage.ahbz bG(android.content.Context context) {
        defpackage.aogc aogcVar;
        aogcVar = new defpackage.aogc(java.util.Collections.singletonList(new defpackage.afeh(new defpackage.ajxw(context))));
        defpackage.aazc aazcVar = defpackage.aang.a;
        return cV(aogcVar, defpackage.aazc.w(4));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static /* synthetic */ void bH(android.content.Intent intent, zvr zvrVar) {
        int i;
        switch (zvrVar.e) {
            case 0:
                i = 2;
                break;
            case 1:
                i = 3;
                break;
            case 2:
                i = 4;
                break;
            case 3:
                i = 5;
                break;
            case 4:
                i = 6;
                break;
            case 5:
                i = 7;
                break;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                i = 8;
                break;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                i = 9;
                break;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                i = 10;
                break;
            case 9:
                i = 11;
                break;
            case 10:
                i = 12;
                break;
            case 11:
                i = 13;
                break;
            case 12:
                i = 14;
                break;
            case 13:
                i = 15;
                break;
            case 14:
                i = 16;
                break;
            case 15:
                i = 17;
                break;
            case 16:
                i = 18;
                break;
            default:
                i = 0;
                break;
        }
        if (i == 0) {
            i = 1;
        }
        switch (i - 2) {
            case 0:
                throw new java.lang.IllegalArgumentException("Can't assign unknown extra");
            case 1:
                intent.putExtra(zvrVar.d, zvrVar.b == 3 ? (java.lang.String) zvrVar.c : "");
                return;
            case 2:
                intent.putExtra(zvrVar.d, (byte) (zvrVar.b == 4 ? ((java.lang.Integer) zvrVar.c).intValue() : 0));
                return;
            case 3:
                intent.putExtra(zvrVar.d, (short) (zvrVar.b == 5 ? ((java.lang.Integer) zvrVar.c).intValue() : 0));
                return;
            case 4:
                intent.putExtra(zvrVar.d, zvrVar.b == 6 ? ((java.lang.Integer) zvrVar.c).intValue() : 0);
                return;
            case 5:
                intent.putExtra(zvrVar.d, zvrVar.b == 7 ? ((java.lang.Long) zvrVar.c).longValue() : 0L);
                return;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                intent.putExtra(zvrVar.d, zvrVar.b == 8 ? ((java.lang.Float) zvrVar.c).floatValue() : 0.0f);
                return;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                intent.putExtra(zvrVar.d, zvrVar.b == 9 ? ((java.lang.Double) zvrVar.c).doubleValue() : 0.0d);
                return;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                intent.putExtra(zvrVar.d, zvrVar.b == 10 ? ((java.lang.Boolean) zvrVar.c).booleanValue() : false);
                return;
            case 9:
                java.lang.String[] strArr = new java.lang.String[zvrVar.f.size()];
                for (int i2 = 0; i2 < zvrVar.f.size(); i2++) {
                    strArr[i2] = (java.lang.String) zvrVar.f.get(i2);
                }
                intent.putExtra(zvrVar.d, strArr);
                return;
            case 10:
                byte[] bArr = new byte[zvrVar.g.size()];
                for (int i3 = 0; i3 < zvrVar.g.size(); i3++) {
                    bArr[i3] = (byte) zvrVar.g.e(i3);
                }
                intent.putExtra(zvrVar.d, bArr);
                return;
            case 11:
                short[] sArr = new short[zvrVar.h.size()];
                for (int i4 = 0; i4 < zvrVar.h.size(); i4++) {
                    sArr[i4] = (short) zvrVar.h.e(i4);
                }
                intent.putExtra(zvrVar.d, sArr);
                return;
            case 12:
                int[] iArr = new int[zvrVar.i.size()];
                for (int i5 = 0; i5 < zvrVar.i.size(); i5++) {
                    iArr[i5] = zvrVar.i.e(i5);
                }
                intent.putExtra(zvrVar.d, iArr);
                return;
            case 13:
                long[] jArr = new long[zvrVar.j.size()];
                for (int i6 = 0; i6 < zvrVar.j.size(); i6++) {
                    jArr[i6] = zvrVar.j.a(i6);
                }
                intent.putExtra(zvrVar.d, jArr);
                return;
            case 14:
                float[] fArr = new float[zvrVar.k.size()];
                for (int i7 = 0; i7 < zvrVar.k.size(); i7++) {
                    fArr[i7] = zvrVar.k.e(i7);
                }
                intent.putExtra(zvrVar.d, fArr);
                return;
            case 15:
                double[] dArr = new double[zvrVar.l.size()];
                for (int i8 = 0; i8 < zvrVar.l.size(); i8++) {
                    dArr[i8] = zvrVar.l.e(i8);
                }
                intent.putExtra(zvrVar.d, dArr);
                return;
            case 16:
                boolean[] zArr = new boolean[zvrVar.m.size()];
                for (int i9 = 0; i9 < zvrVar.m.size(); i9++) {
                    zArr[i9] = zvrVar.m.f(i9);
                }
                intent.putExtra(zvrVar.d, zArr);
                return;
            default:
                throw new java.lang.IllegalArgumentException("Unrecognized extra type");
        }
    }

    public static /* synthetic */ boolean bI(int i, int i2, int i3) {
        int mode = android.view.View.MeasureSpec.getMode(i2);
        int size = android.view.View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0 && (mode != 1073741824 || size != i)) {
                return false;
            }
        } else if (size < i) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ java.lang.Boolean bJ(defpackage.aoin aoinVar) {
        if (aoinVar == null) {
            defpackage.aooh.i("<this>");
        }
        return (java.lang.Boolean) aoinVar.a();
    }

    public static /* synthetic */ java.lang.String bL(java.lang.String str, java.lang.String str2) {
        if (str == null || str2 == null || defpackage.aooh.n(str, str2)) {
            return str == null ? str2 : str;
        }
        throw new java.lang.IllegalStateException("Start and end events have different call IDs.");
    }

    public static /* synthetic */ defpackage.zan bM(defpackage.zao zaoVar, defpackage.zak zakVar) {
        defpackage.zan zanVar = (defpackage.zan) zaoVar.e.get(zakVar);
        if (zanVar != null) {
            return zanVar;
        }
        java.util.Objects.toString(zakVar);
        throw new java.lang.IllegalStateException(zakVar.toString().concat(" error not set in CuiEventConfiguration"));
    }

    public static /* synthetic */ void bN(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer.order() != java.nio.ByteOrder.LITTLE_ENDIAN) {
            throw new java.lang.IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    public static /* synthetic */ java.nio.ByteBuffer bO(java.nio.ByteBuffer byteBuffer, int i) {
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i2 = i + iPosition;
        if (i2 < iPosition || i2 > iLimit) {
            throw new java.nio.BufferUnderflowException();
        }
        byteBuffer.limit(i2);
        try {
            java.nio.ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i2);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    public static /* synthetic */ android.content.Intent bP() {
        throw new java.lang.IllegalStateException("This method is not expected to be called.");
    }

    public static /* synthetic */ defpackage.ajcq bQ() {
        defpackage.akzx akzxVarM = ruy.a.m();
        ruw ruwVar = ruw.a;
        akzxVarM.u();
        ruy ruyVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(ruwVar);
        ruyVar.c = ruwVar;
        ruyVar.b = 1;
        return defpackage.aiql.z(akzxVarM.r());
    }

    public static /* synthetic */ java.lang.String bS(java.lang.String str, java.lang.String str2) {
        return defpackage.ahvr.p(str) + '_' + str2;
    }

    public static /* synthetic */ int bT(java.lang.String str) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (android.telephony.PhoneNumberUtils.isISODigit(str.charAt(i2))) {
                i++;
            }
        }
        return i;
    }

    public static /* synthetic */ uzm bV(int i) {
        switch (i) {
            case -6:
                return uzm.k;
            case -5:
                return uzm.i;
            case -4:
                return uzm.j;
            case -3:
                return uzm.h;
            case -2:
                return uzm.g;
            case -1:
                return uzm.f;
            case 0:
                return uzm.b;
            case 1:
                return uzm.c;
            case 2:
                return uzm.d;
            case 3:
                return uzm.e;
            default:
                return uzm.a;
        }
    }

    public static /* synthetic */ java.lang.Boolean bW(defpackage.ajcq ajcqVar, defpackage.ajcq ajcqVar2) {
        boolean z = true;
        if (!((java.lang.Boolean) defpackage.aiql.H(ajcqVar)).booleanValue() && !((java.lang.Boolean) defpackage.aiql.H(ajcqVar2)).booleanValue()) {
            z = false;
        }
        return java.lang.Boolean.valueOf(z);
    }

    public static /* synthetic */ java.lang.Boolean bX(defpackage.ajcq ajcqVar, defpackage.ajcq ajcqVar2) {
        boolean z = false;
        if (((java.lang.Boolean) defpackage.aiql.H(ajcqVar)).booleanValue() && ((java.lang.Boolean) defpackage.aiql.H(ajcqVar2)).booleanValue()) {
            z = true;
        }
        return java.lang.Boolean.valueOf(z);
    }

    public static /* synthetic */ defpackage.eax bY(android.view.View view, defpackage.eax eaxVar) {
        defpackage.dwn dwnVarF = eaxVar.f(647);
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.leftMargin = dwnVarF.b;
        marginLayoutParams.topMargin = dwnVarF.c;
        marginLayoutParams.rightMargin = dwnVarF.d;
        marginLayoutParams.bottomMargin = dwnVarF.e;
        view.setLayoutParams(marginLayoutParams);
        return defpackage.eax.a;
    }

    public static /* synthetic */ java.lang.Object bZ(java.lang.Object obj) {
        return (java.lang.Boolean) ((defpackage.mge) obj).f();
    }

    public static void ba(java.util.List list, defpackage.cmw cmwVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1649996769);
        boolean z = true;
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? cavVarB.B(list) : cavVarB.D(list)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        int i4 = 18;
        if (cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            boolean zK = defpackage.abts.K(cavVarB);
            defpackage.cmw cmwVarC = defpackage.azm.c(cmwVar, 1.0f);
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !cavVarB.D(list))) {
                z = false;
            }
            boolean zC = z | cavVarB.C(zK);
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            if (zC || objR == defpackage.cau.a) {
                objR = new defpackage.afw(list, zK, 3);
                cbtVar.ab(objR);
            }
            yt.a(cmwVarC, (defpackage.aonj) objR, cavVarB, 0);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.slz(list, cmwVar, i, i4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:144:0x028b  */
    /* JADX WARN: Code duplicated, block: B:152:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:157:0x02b1  */
    public static void bb(defpackage.aws awsVar, abgx abgxVar, abfs abfsVar, abgq abgqVar, defpackage.dpq dpqVar, defpackage.cav cavVar, int i) {
        defpackage.cav cavVar2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i2;
        int i3;
        boolean z5;
        java.lang.Object objR;
        defpackage.cbt cbtVar;
        boolean z6;
        java.lang.Object objR2;
        defpackage.aooh.f(abgqVar, "state");
        defpackage.aooh.f(dpqVar, "layoutDirection");
        int i4 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1973897205);
        int i5 = i4 == 0 ? (true != cavVarB.B(awsVar) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i5 |= true != cavVarB.B(abgxVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i5 |= true != ((i & 512) == 0 ? cavVarB.B(abfsVar) : cavVarB.D(abfsVar)) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i5 |= true != ((i & 4096) == 0 ? cavVarB.B(abgqVar) : cavVarB.D(abgqVar)) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i5 |= true != cavVarB.z(dpqVar.ordinal()) ? 8192 : 16384;
        }
        if (cavVarB.H((i5 & 9363) != 9362, i5 & 1)) {
            defpackage.aii aiiVar = abgqVar.t;
            defpackage.cmt cmtVar = defpackage.cmw.c;
            defpackage.cmw cmwVarA = awsVar.a(defpackage.den.bn(defpackage.azm.e(defpackage.azm.k(cmtVar, ((defpackage.dpi) aiiVar.d()).a), abfsVar.c), defpackage.den.ak(cavVarB).H, defpackage.bge.a), defpackage.cmh.e);
            boolean z7 = (i5 & 112) == 32;
            int i6 = i5 & 896;
            defpackage.aojh aojhVar = defpackage.aojh.a;
            boolean z8 = z7 | (i6 == 256 || ((i5 & 512) != 0 && cavVarB.D(abfsVar)));
            int i7 = i5 & 7168;
            boolean z9 = z8 | (i7 == 2048 || ((i5 & 4096) != 0 && cavVarB.D(abgqVar)));
            defpackage.cbt cbtVar2 = (defpackage.cbt) cavVarB;
            java.lang.Object objR3 = cbtVar2.R();
            if (z9 || objR3 == defpackage.cau.a) {
                z = false;
                objR3 = new abgg(abgxVar, abfsVar, abgqVar, 0);
                cbtVar2.ab(objR3);
            } else {
                z = false;
            }
            defpackage.cmw cmwVarA2 = defpackage.cvy.a(cmwVarA, aojhVar, (androidx.compose.ui.input.pointer.PointerInputEventHandler) objR3);
            defpackage.cye cyeVarB = defpackage.awo.b(defpackage.cmh.a, z);
            int iM = defpackage.anty.M(cbtVar2.x);
            defpackage.cje cjeVarAi = cbtVar2.ai();
            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmwVarA2);
            defpackage.aomy aomyVar = defpackage.dam.a;
            cavVarB.v();
            if (cbtVar2.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            defpackage.cev.c(cavVarB, cyeVarB, defpackage.dam.e);
            defpackage.cev.c(cavVarB, cjeVarAi, defpackage.dam.d);
            defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM), defpackage.dam.f);
            defpackage.cev.b(cavVarB, defpackage.dam.g);
            defpackage.cev.c(cavVarB, cmwVarM, defpackage.dam.c);
            float f = abfsVar.f;
            defpackage.cmw cmwVarAY = defpackage.den.aY(cmtVar, f);
            abgi abgiVar = abgqVar.u;
            java.util.List listA = abgiVar.a();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : listA) {
                if (obj instanceof abhf) {
                    arrayList.add(obj);
                }
            }
            ba(arrayList, cmwVarAY, cavVarB, 0);
            float f2 = abfsVar.b;
            float f3 = ((abfsVar.a - abfsVar.e) + 0.0f) - f;
            if (dpqVar == defpackage.dpq.b) {
                z3 = false;
                z2 = true;
            } else {
                z2 = false;
                z3 = true;
            }
            java.lang.String str = abgxVar.e;
            long j = abgqVar.f;
            long j2 = abgqVar.g;
            java.util.List listA2 = abgiVar.a();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj2 : listA2) {
                long j3 = j2;
                if (obj2 instanceof abhe) {
                    arrayList2.add(obj2);
                }
                j2 = j3;
            }
            long j4 = j2;
            if (i7 == 2048) {
                z4 = true;
                i2 = 2048;
            } else if ((i5 & 4096) == 0 || !cavVarB.D(abgqVar)) {
                i2 = i7;
                z4 = false;
            } else {
                i2 = i7;
                z4 = true;
            }
            java.lang.Object objR4 = cbtVar2.R();
            if (z4 || objR4 == defpackage.cau.a) {
                objR4 = new xmr(abgqVar, 19);
                cbtVar2.ab(objR4);
            }
            defpackage.aomy aomyVar2 = (defpackage.aomy) objR4;
            boolean z10 = i2 == 2048 || ((i5 & 4096) != 0 && cavVarB.D(abgqVar));
            java.lang.Object objR5 = cbtVar2.R();
            if (z10 || objR5 == defpackage.cau.a) {
                objR5 = new xmr(abgqVar, 20);
                cbtVar2.ab(objR5);
            }
            float f4 = ((f3 + 0.0f) / 2.0f) + 0.0f;
            float f5 = f2 / 2.0f;
            int i8 = (i5 >> 6) & 14;
            int i9 = i2;
            int i10 = i5;
            bc(str, true, j, j4, f5, arrayList2, aomyVar2, z2, f4, (defpackage.aomy) objR5, abfsVar, cavVarB, 48, i8);
            java.lang.String str2 = abgxVar.c;
            long j5 = abgqVar.h;
            java.util.List listA3 = abgiVar.a();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj3 : listA3) {
                if (obj3 instanceof abhd) {
                    arrayList3.add(obj3);
                }
            }
            if (i9 != 2048) {
                i3 = i10;
                z5 = (i3 & 4096) != 0 && cavVarB.D(abgqVar);
                objR = cbtVar2.R();
                if (!z5 || objR == defpackage.cau.a) {
                    objR = new abgd(abgqVar, 1);
                    cbtVar = cbtVar2;
                    cbtVar.ab(objR);
                } else {
                    cbtVar = cbtVar2;
                }
                defpackage.aomy aomyVar3 = (defpackage.aomy) objR;
                if (i9 != 2048 || ((i3 & 4096) != 0 && cavVarB.D(abgqVar))) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                objR2 = cbtVar.R();
                if (z6 || objR2 == defpackage.cau.a) {
                    objR2 = new abgd(abgqVar, 0);
                    cbtVar.ab(objR2);
                }
                cavVar2 = cavVarB;
                bc(str2, false, j, j5, f5, arrayList3, aomyVar3, z3, f4, (defpackage.aomy) objR2, abfsVar, cavVar2, 48, i8);
                cbtVar.W(true);
            } else {
                i3 = i10;
            }
            objR = cbtVar2.R();
            if (z5) {
                objR = new abgd(abgqVar, 1);
                cbtVar = cbtVar2;
                cbtVar.ab(objR);
            } else {
                objR = new abgd(abgqVar, 1);
                cbtVar = cbtVar2;
                cbtVar.ab(objR);
            }
            defpackage.aomy aomyVar4 = (defpackage.aomy) objR;
            if (i9 != 2048) {
                z6 = true;
            } else {
                z6 = true;
            }
            objR2 = cbtVar.R();
            if (z6) {
                objR2 = new abgd(abgqVar, 0);
                cbtVar.ab(objR2);
            } else {
                objR2 = new abgd(abgqVar, 0);
                cbtVar.ab(objR2);
            }
            cavVar2 = cavVarB;
            bc(str2, false, j, j5, f5, arrayList3, aomyVar4, z3, f4, (defpackage.aomy) objR2, abfsVar, cavVar2, 48, i8);
            cbtVar.W(true);
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new alh(awsVar, abgxVar, abfsVar, abgqVar, dpqVar, i, 17);
        }
    }

    public static void bc(java.lang.String str, boolean z, long j, long j2, float f, java.util.List list, defpackage.aomy aomyVar, boolean z2, float f2, defpackage.aomy aomyVar2, abfs abfsVar, defpackage.cav cavVar, int i, int i2) {
        int i3;
        boolean z3;
        long j3;
        long j4;
        float f3;
        boolean z4;
        int i4;
        int i5;
        defpackage.aooh.f(str, "text");
        defpackage.aooh.f(aomyVar, "offset");
        defpackage.aooh.f(aomyVar2, "progress");
        int i6 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-384484395);
        if (i6 == 0) {
            i3 = (true != cavVarB.B(str) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            z3 = z;
            i3 |= true != cavVarB.C(z3) ? 16 : 32;
        } else {
            z3 = z;
        }
        if ((i & 384) == 0) {
            j3 = j;
            i3 |= true != cavVarB.A(j3) ? 128 : 256;
        } else {
            j3 = j;
        }
        if ((i & 3072) == 0) {
            j4 = j2;
            i3 |= true != cavVarB.A(j4) ? 1024 : 2048;
        } else {
            j4 = j2;
        }
        if ((i & 24576) == 0) {
            f3 = f;
            i3 |= true != cavVarB.y(f3) ? 8192 : 16384;
        } else {
            f3 = f;
        }
        if ((196608 & i) == 0) {
            i3 |= true != ((262144 & i) == 0 ? cavVarB.B(list) : cavVarB.D(list)) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != cavVarB.D(aomyVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            z4 = z2;
            i3 |= true != cavVarB.C(z4) ? 4194304 : 8388608;
        } else {
            z4 = z2;
        }
        if ((i & 100663296) == 0) {
            i4 = i3 | (true != cavVarB.y(f2) ? 33554432 : 67108864);
        } else {
            i4 = i3;
        }
        if ((805306368 & i) == 0) {
            i4 |= true != cavVarB.D(aomyVar2) ? 268435456 : 536870912;
        }
        if ((i2 & 6) == 0) {
            i5 = i2 | (true != ((i2 & 8) == 0 ? cavVarB.B(abfsVar) : cavVarB.D(abfsVar)) ? 2 : 4);
        } else {
            i5 = i2;
        }
        if (cavVarB.H(((i4 & 306783379) == 306783378 && (i5 & 3) == 2) ? false : true, i4 & 1)) {
            defpackage.cbd cbdVar = defpackage.dfo.e;
            defpackage.den.ab(cbdVar.b(new defpackage.dpg(((defpackage.dpf) cavVarB.e(cbdVar)).a(), 1.0f)), defpackage.cfo.j(1928695957, new abge(z3, abfsVar, aomyVar2, list, z4, aomyVar, str, j3, j4, f3, f2), cavVarB), cavVarB, 56);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abgc(str, z, j, j2, f, list, aomyVar, z2, f2, aomyVar2, abfsVar, i, i2);
        }
    }

    public static defpackage.aomy bd(defpackage.cer cerVar) {
        return (defpackage.aomy) cerVar.a();
    }

    public static defpackage.aomy be(defpackage.cer cerVar) {
        return (defpackage.aomy) cerVar.a();
    }

    public static defpackage.aonj bf(defpackage.cer cerVar) {
        return (defpackage.aonj) cerVar.a();
    }

    public static void bg(awv awvVar, abgx abgxVar, defpackage.dpq dpqVar, defpackage.cav cavVar, int i) {
        int i2;
        abgx abgxVar2;
        defpackage.cav cavVar2;
        abgq abgqVar;
        defpackage.aonj aonjVar;
        float f;
        java.lang.Object obj;
        defpackage.aooh.f(awvVar, "<this>");
        defpackage.aooh.f(dpqVar, "layoutDirection");
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1420969374);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(awvVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(abgxVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.z(dpqVar.ordinal()) ? 128 : 256;
        }
        int i4 = i2;
        if (cavVarB.H((i4 & 147) != 146, i4 & 1)) {
            long j = awvVar.c;
            defpackage.dpi dpiVar = new defpackage.dpi(defpackage.dpd.g(j) ? awvVar.b.dj(defpackage.dpd.a(j)) : Float.POSITIVE_INFINITY);
            defpackage.ajh ajhVar = abft.a;
            float f2 = ((defpackage.dpi) defpackage.aooc.A(dpiVar, new defpackage.dpi(abft.f))).a;
            float f3 = ((defpackage.dpi) defpackage.aooc.A(new defpackage.dpi(awvVar.b()), new defpackage.dpi(abft.h))).a;
            defpackage.dpf dpfVar = (defpackage.dpf) cavVarB.e(defpackage.dfo.e);
            defpackage.aooh.f(dpfVar, "density");
            float f4 = abft.e;
            float f5 = (f3 - f4) + 0.0f;
            float f6 = (((0.25f * f2) + 0.0f) * 0.5f) + 0.0f;
            float f7 = f6 + f6 + 0.0f;
            abfs abfsVar = new abfs(f5, dpfVar.dl(f5), f2, dpfVar.dl(f2), f4, f2 + f7 + 0.0f, f2, dpfVar.dl(f2), f6, dpfVar.dl(f6), dpfVar.dl((((f5 - f2) + 0.0f) - f7) + 0.0f) / 2.0f);
            boolean z = abgxVar.h;
            long j2 = defpackage.abts.F(cavVarB).n;
            long j3 = defpackage.abts.F(cavVarB).s;
            long j4 = defpackage.abts.F(cavVarB).n;
            long j5 = defpackage.den.ak(cavVarB).q;
            defpackage.bry bryVarAl = defpackage.den.al(cavVarB);
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            java.lang.Object obj2 = defpackage.cau.a;
            if (objR == obj2) {
                objR = defpackage.cbp.a(defpackage.aols.a, cavVarB);
                cbtVar.ab(objR);
            }
            defpackage.aoss aossVar = (defpackage.aoss) objR;
            java.lang.Object objR2 = cbtVar.R();
            if (objR2 == obj2) {
                objR2 = new defpackage.kaw((byte[]) null, (char[]) null, (byte[]) null);
                cbtVar.ab(objR2);
            }
            defpackage.kaw kawVar = (defpackage.kaw) objR2;
            java.lang.Object objR3 = cbtVar.R();
            if (objR3 == obj2) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, defpackage.cdu.c);
                cbtVar.ab(parcelableSnapshotMutableState);
                objR3 = parcelableSnapshotMutableState;
            }
            defpackage.ccp ccpVar = (defpackage.ccp) objR3;
            java.lang.Object objR4 = cbtVar.R();
            if (objR4 == obj2) {
                objR4 = new amg(kawVar, ccpVar, (defpackage.aoln) null, 13);
                cbtVar.ab(objR4);
            }
            defpackage.cbp.g(kawVar, (defpackage.aonn) objR4, cavVarB);
            boolean zB = cavVarB.B(abfsVar);
            java.lang.Object objR5 = cbtVar.R();
            if (zB || objR5 == obj2) {
                objR5 = new abgq(aossVar, bryVarAl, kawVar, ccpVar, abfsVar, new apy(abgy.b, app.b(new abgj(abfsVar, 3))), j2, j5, j3, j4, z);
                cbtVar.ab(objR5);
            }
            abgq abgqVar2 = (abgq) objR5;
            java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z);
            boolean zD = cavVarB.D(abgqVar2) | cavVarB.C(z);
            java.lang.Object objR6 = cbtVar.R();
            if (zD || objR6 == obj2) {
                objR6 = new jcm(abgqVar2, z, (defpackage.aoln) null, 9);
                cbtVar.ab(objR6);
            }
            defpackage.cbp.g(boolValueOf, (defpackage.aonn) objR6, cavVarB);
            int i5 = i4 & 112;
            boolean z2 = i5 == 32;
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            boolean zD2 = cavVarB.D(abgqVar2) | z2;
            java.lang.Object objR7 = cbtVar.R();
            if (zD2 || objR7 == obj2) {
                objR7 = new zjr(abgxVar, abgqVar2, (defpackage.aoln) null, 3);
                cbtVar.ab(objR7);
            }
            defpackage.cbp.f(abgqVar2, bool, (defpackage.aonn) objR7, cavVarB);
            java.lang.Float fValueOf = java.lang.Float.valueOf(abgqVar2.a());
            defpackage.aonj aonjVar2 = abgxVar.g;
            boolean zD3 = z2 | cavVarB.D(abgqVar2);
            java.lang.Object objR8 = cbtVar.R();
            if (zD3 || objR8 == obj2) {
                abgqVar = abgqVar2;
                aonjVar = aonjVar2;
                f = f3;
                obj = obj2;
                zjr zjrVar = new zjr(abgxVar, abgqVar, (defpackage.aoln) null, 4, (byte[]) null);
                cbtVar.ab(zjrVar);
                objR8 = zjrVar;
            } else {
                aonjVar = aonjVar2;
                f = f3;
                abgqVar = abgqVar2;
                obj = obj2;
            }
            defpackage.cbp.e(abgqVar, fValueOf, aonjVar, (defpackage.aonn) objR8, cavVarB);
            defpackage.cer cerVarG = defpackage.cdh.g(abgxVar.d, cavVarB);
            defpackage.cer cerVarG2 = defpackage.cdh.g(abgxVar.f, cavVarB);
            defpackage.cer cerVarG3 = defpackage.cdh.g(abgxVar.k, cavVarB);
            java.lang.Object objR9 = cbtVar.R();
            if (objR9 == obj) {
                objR9 = new aclk(cerVarG3, cerVarG2, cerVarG, 1);
                cbtVar.ab(objR9);
            }
            defpackage.aonj aonjVar3 = (defpackage.aonj) objR9;
            java.lang.Object objR10 = cbtVar.R();
            if (objR10 == obj) {
                objR10 = new xmr(cerVarG3, 18);
                cbtVar.ab(objR10);
            }
            defpackage.aomy aomyVar = (defpackage.aomy) objR10;
            java.lang.Object objR11 = cbtVar.R();
            if (objR11 == obj) {
                objR11 = new abfw(cerVarG3, 2);
                cbtVar.ab(objR11);
            }
            defpackage.aonj aonjVar4 = (defpackage.aonj) objR11;
            boolean zBooleanValue = ((java.lang.Boolean) defpackage.abts.G(cavVarB).b.a()).booleanValue();
            java.lang.String str = abgxVar.e;
            java.lang.String str2 = abgxVar.c;
            boolean zC = cavVarB.C(zBooleanValue) | cavVarB.B(str) | cavVarB.B(str2);
            java.lang.Object objR12 = cbtVar.R();
            if (zC || objR12 == obj) {
                objR12 = zBooleanValue ? defpackage.ajsz.bb(new dhw(str, new xmr(cerVarG2, 13)), new dhw(str2, new xmr(cerVarG, 14))) : defpackage.aokc.a;
                cbtVar.ab(objR12);
            } else {
                aonjVar3 = aonjVar3;
            }
            java.util.List list = (java.util.List) objR12;
            defpackage.cmt cmtVar = defpackage.cmw.c;
            defpackage.cmw cmwVarX = defpackage.den.x(defpackage.azm.d(cmtVar, 1.0f), "answer_method_swipe_container");
            defpackage.cmj cmjVar = defpackage.cmh.a;
            defpackage.cye cyeVarB = defpackage.awo.b(cmjVar, false);
            int iM = defpackage.anty.M(cbtVar.x);
            defpackage.cje cjeVarAi = cbtVar.ai();
            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmwVarX);
            defpackage.aomy aomyVar2 = defpackage.dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar2);
            } else {
                cavVarB.x();
            }
            defpackage.aonn aonnVar = defpackage.dam.e;
            defpackage.cev.c(cavVarB, cyeVarB, aonnVar);
            defpackage.aonn aonnVar2 = defpackage.dam.d;
            defpackage.cev.c(cavVarB, cjeVarAi, aonnVar2);
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(iM);
            defpackage.aonn aonnVar3 = defpackage.dam.f;
            defpackage.cev.c(cavVarB, numValueOf, aonnVar3);
            defpackage.aonj aonjVar5 = defpackage.dam.g;
            defpackage.cev.b(cavVarB, aonjVar5);
            defpackage.aonn aonnVar4 = defpackage.dam.c;
            defpackage.cev.c(cavVarB, cmwVarM, aonnVar4);
            defpackage.awt awtVar = defpackage.awt.a;
            defpackage.cmw cmwVarE = defpackage.azm.e(defpackage.azm.k(cmtVar, f), f2);
            defpackage.cmj cmjVar2 = defpackage.cmh.e;
            defpackage.cmw cmwVarA = awtVar.a(cmwVarE, cmjVar2);
            boolean zD4 = cavVarB.D(abgqVar);
            java.lang.Object objR13 = cbtVar.R();
            if (zD4 || objR13 == obj) {
                objR13 = new xmr(abgqVar, 15);
                cbtVar.ab(objR13);
            }
            defpackage.cmw cmwVarAQ = defpackage.aehj.aQ(cmwVarA, (defpackage.aomy) objR13);
            defpackage.cye cyeVarB2 = defpackage.awo.b(cmjVar, false);
            abgq abgqVar3 = abgqVar;
            int iM2 = defpackage.anty.M(cbtVar.x);
            defpackage.cje cjeVarAi2 = cbtVar.ai();
            defpackage.cmw cmwVarM2 = defpackage.cfo.m(cavVarB, cmwVarAQ);
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar2);
            } else {
                cavVarB.x();
            }
            defpackage.cev.c(cavVarB, cyeVarB2, aonnVar);
            defpackage.cev.c(cavVarB, cjeVarAi2, aonnVar2);
            defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM2), aonnVar3);
            defpackage.cev.b(cavVarB, aonjVar5);
            defpackage.cev.c(cavVarB, cmwVarM2, aonnVar4);
            bb(awtVar, abgxVar, abfsVar, abgqVar3, dpqVar, cavVarB, i5 | 4102 | ((i4 << 6) & 57344));
            abgxVar2 = abgxVar;
            defpackage.cmw cmwVarA2 = awtVar.a(cmtVar, cmjVar2);
            abja abjaVar = abgxVar2.a;
            boolean zD5 = cavVarB.D(abgqVar3);
            java.lang.Object objR14 = cbtVar.R();
            if (zD5 || objR14 == obj) {
                objR14 = new xtu(aomyVar, abgqVar3, 4, (byte[]) null);
                cbtVar.ab(objR14);
            }
            bi(cmwVarA2, abjaVar, list, abgqVar3, aonjVar3, (defpackage.aomy) objR14, aonjVar4, cavVarB, 12812288);
            cavVar2 = cavVarB;
            cbtVar.W(true);
            cbtVar.W(true);
        } else {
            abgxVar2 = abgxVar;
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new ppx(awvVar, abgxVar2, dpqVar, i, 16);
        }
    }

    public static void bh(awv awvVar, abgx abgxVar, defpackage.cav cavVar, int i) {
        int i2;
        awv awvVar2;
        abgx abgxVar2;
        defpackage.aooh.f(awvVar, "<this>");
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1277747253);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(awvVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(abgxVar) ? 16 : 32;
        }
        if (cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            defpackage.cbd cbdVar = defpackage.dfo.j;
            awvVar2 = awvVar;
            abgxVar2 = abgxVar;
            defpackage.den.ab(cbdVar.b(defpackage.dpq.a), defpackage.cfo.j(1983591563, new ata(awvVar2, abgxVar2, (defpackage.dpq) cavVarB.e(cbdVar), 19, (short[]) null), cavVarB), cavVarB, 56);
        } else {
            awvVar2 = awvVar;
            abgxVar2 = abgxVar;
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.slz(awvVar2, abgxVar2, i, 17, null);
        }
    }

    public static void bi(defpackage.cmw cmwVar, abja abjaVar, java.util.List list, abgq abgqVar, defpackage.aonj aonjVar, defpackage.aomy aomyVar, defpackage.aonj aonjVar2, defpackage.cav cavVar, int i) {
        int i2;
        abja abjaVar2;
        boolean z;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(518711295);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(cmwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.z(abjaVar.ordinal()) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.B(null) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != ((i & 4096) == 0 ? cavVarB.B(list) : cavVarB.D(list)) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != ((i & 32768) == 0 ? cavVarB.B(abgqVar) : cavVarB.D(abgqVar)) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != cavVarB.D(aonjVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != cavVarB.D(aomyVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != cavVarB.D(aonjVar2) ? 4194304 : 8388608;
        }
        if (cavVarB.H((4793491 & i2) != 4793490, i2 & 1)) {
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            java.lang.Object obj = defpackage.cau.a;
            if (objR == obj) {
                xmr xmrVar = new xmr(abgqVar, 16);
                defpackage.ajxw ajxwVar = defpackage.ceo.a;
                defpackage.cbk cbkVar = new defpackage.cbk(xmrVar, null);
                cbtVar.ab(cbkVar);
                objR = cbkVar;
            }
            defpackage.cer cerVar = (defpackage.cer) objR;
            java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(defpackage.a.y(cerVar));
            int i4 = i2 & 57344;
            boolean z2 = i4 == 16384 || ((i2 & 32768) != 0 && cavVarB.D(abgqVar));
            java.lang.Object objR2 = cbtVar.R();
            if (z2 || objR2 == obj) {
                objR2 = new zjr(abgqVar, cerVar, (defpackage.aoln) null, 2);
                cbtVar.ab(objR2);
            }
            defpackage.cbp.g(boolValueOf, (defpackage.aonn) objR2, cavVarB);
            cavVarB.u(265379571);
            defpackage.cmw cmwVarX = defpackage.den.x(cmwVar, "answer_method_puck");
            if (i4 != 16384) {
                z = (i2 & 32768) != 0 && cavVarB.D(abgqVar);
            } else {
                z = true;
                i4 = 16384;
            }
            java.lang.Object objR3 = cbtVar.R();
            if (z || objR3 == obj) {
                objR3 = new abfw(abgqVar, 3);
                cbtVar.ab(objR3);
            }
            defpackage.cmw cmwVarA = cmwVarX.a(new ayq((defpackage.aonj) objR3, true));
            if (!list.isEmpty()) {
                int i5 = i2 & 7168;
                defpackage.cmt cmtVar = defpackage.cmw.c;
                boolean z3 = i5 == 2048 || ((i2 & 4096) != 0 && cavVarB.D(list));
                java.lang.Object objR4 = cbtVar.R();
                if (z3 || objR4 == obj) {
                    objR4 = new abfw(list, 4);
                    cbtVar.ab(objR4);
                }
                cmwVarA = cmwVarA.a(defpackage.dig.b(cmtVar, true, (defpackage.aonj) objR4));
            }
            cbtVar.W(false);
            int i6 = 3670016 & i2;
            defpackage.aojh aojhVar = defpackage.aojh.a;
            java.lang.Object objR5 = cbtVar.R();
            if (i6 == 1048576 || objR5 == obj) {
                objR5 = new bil(aomyVar, 14);
                cbtVar.ab(objR5);
            }
            defpackage.cmw cmwVarA2 = defpackage.cvy.a(cmwVarA, aojhVar, (androidx.compose.ui.input.pointer.PointerInputEventHandler) objR5);
            apy apyVar = abgqVar.d;
            defpackage.kaw kawVar = abgqVar.v;
            defpackage.aso asoVar = defpackage.aso.b;
            defpackage.aooh.f(aonjVar, "onFlingResult");
            float fDl = ((defpackage.dpf) cavVarB.e(defpackage.dfo.e)).dl(125.0f);
            boolean zB = cavVarB.B(apyVar) | cavVarB.y(fDl);
            int i7 = i2;
            java.lang.Object objR6 = cbtVar.R();
            if (zB || objR6 == obj) {
                defpackage.alm almVarBv = defpackage.den.bv(0, 0, null, 7);
                defpackage.aoot aootVar = new defpackage.aoot();
                objR6 = new abfy(aootVar, new auu(new abfz(apyVar, fDl, new abfw(aootVar, 0)), abfv.a, almVarBv), aonjVar);
                cbtVar.ab(objR6);
            }
            defpackage.cmw cmwVarC = app.c(cmwVarA2, apyVar, asoVar, true, kawVar, (atw) objR6);
            boolean z4 = i4 == 16384 || ((i7 & 32768) != 0 && cavVarB.D(abgqVar));
            boolean z5 = (i7 & 29360128) == 8388608;
            java.lang.Object objR7 = cbtVar.R();
            if ((z4 | z5) || objR7 == obj) {
                objR7 = new blu(abgqVar, aonjVar2, 2);
                cbtVar.ab(objR7);
            }
            defpackage.cmw cmwVarA3 = defpackage.cvy.a(cmwVarC, aojhVar, (androidx.compose.ui.input.pointer.PointerInputEventHandler) objR7);
            abfs abfsVar = abgqVar.c;
            defpackage.cmw cmwVarBn = defpackage.den.bn(defpackage.den.aZ(defpackage.azm.g(cmwVarA3, abfsVar.e), 0.0f, abfsVar.f), -4294967296L, defpackage.bge.a);
            boolean z6 = false;
            defpackage.cye cyeVarB = defpackage.awo.b(defpackage.cmh.a, false);
            int iM = defpackage.anty.M(cbtVar.x);
            defpackage.cje cjeVarAi = cbtVar.ai();
            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmwVarBn);
            defpackage.aomy aomyVar2 = defpackage.dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar2);
            } else {
                cavVarB.x();
            }
            defpackage.cev.c(cavVarB, cyeVarB, defpackage.dam.e);
            defpackage.cev.c(cavVarB, cjeVarAi, defpackage.dam.d);
            defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM), defpackage.dam.f);
            defpackage.cev.b(cavVarB, defpackage.dam.g);
            defpackage.cev.c(cavVarB, cmwVarM, defpackage.dam.c);
            defpackage.cmw cmwVarG = defpackage.azm.g(defpackage.awt.a.a(defpackage.cmw.c, defpackage.cmh.e), 32.0f);
            if (i4 == 16384 || ((i7 & 32768) != 0 && cavVarB.D(abgqVar))) {
                z6 = true;
            }
            java.lang.Object objR8 = cbtVar.R();
            if (z6 || objR8 == obj) {
                objR8 = new xmr(abgqVar, 17);
                cbtVar.ab(objR8);
            }
            defpackage.aomy aomyVar3 = (defpackage.aomy) objR8;
            defpackage.aooh.f(cmwVarG, "<this>");
            defpackage.aooh.f(aomyVar3, "rotation");
            abjaVar2 = abjaVar;
            defpackage.aaoo.W(defpackage.aehj.aL(abjaVar2, cavVarB), null, defpackage.cfd.J(cmwVarG, new abgj(aomyVar3, 5)), ((defpackage.cqg) abgqVar.o.d()).a, cavVarB, (i7 >> 3) & 112, 0);
            cbtVar.W(true);
        } else {
            abjaVar2 = abjaVar;
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.ciy(cmwVar, abjaVar2, list, abgqVar, aonjVar, aomyVar, aonjVar2, i, 6);
        }
    }

    public static void bj(abgx abgxVar, defpackage.cmw cmwVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1699675289);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(abgxVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = 16;
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        if (cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            defpackage.rz.f(cmwVar, null, defpackage.cfo.j(-2138220355, new defpackage.ped(abgxVar, 17), cavVarB), cavVarB, ((i2 >> 3) & 14) | 3072);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.slz(abgxVar, cmwVar, i, i4);
        }
    }

    public static int bk(abfo abfoVar) {
        defpackage.aooh.f(abfoVar, "<this>");
        j$.util.Objects.checkIndex(0, 14);
        if (abfoVar != null) {
            if (abfoVar instanceof abff) {
                return ((abff) abfoVar).b;
            }
            if (abfoVar instanceof abfg) {
                throw null;
            }
            if (abfoVar instanceof abfe) {
                return ((abfe) abfoVar).b;
            }
            if (abfoVar instanceof abfb) {
                throw null;
            }
            if (abfoVar instanceof abfi) {
                return ((abfi) abfoVar).a;
            }
            if (abfoVar instanceof abfn) {
                throw null;
            }
            if (abfoVar instanceof abfc) {
                throw null;
            }
            if (abfoVar instanceof abfm) {
                throw null;
            }
            if (abfoVar instanceof abfk) {
                throw null;
            }
            if (abfoVar instanceof abfd) {
                return ((abfd) abfoVar).c;
            }
            if (abfoVar instanceof abfl) {
                throw null;
            }
            if (abfoVar instanceof abfh) {
                throw null;
            }
            if (abfoVar instanceof abfj) {
                throw null;
            }
        }
        throw new defpackage.aois();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Iterable, java.lang.Object] */
    public static abfr bl(defpackage.aonj aonjVar) {
        defpackage.aooh.f(aonjVar, "action");
        afpl afplVar = new afpl((byte[]) null, (byte[]) null);
        aonjVar.a(afplVar);
        return new abfr(((java.lang.StringBuilder) afplVar.a).toString(), defpackage.ajsz.bZ(afplVar.b));
    }

    public static void bm(abfr abfrVar, defpackage.cmw cmwVar, long j, long j2, defpackage.dot dotVar, int i, boolean z, int i2, defpackage.dkz dkzVar, defpackage.cav cavVar, int i3, int i4) {
        long j3;
        long j4;
        int i5;
        int i6;
        defpackage.cav cavVar2;
        int i7;
        long j5;
        defpackage.cmw cmwVar2;
        defpackage.dot dotVar2;
        boolean z2;
        int i8;
        defpackage.dkz dkzVar2;
        long j6;
        long jS;
        long jH;
        defpackage.dkz dkzVar3;
        defpackage.cmw cmwVar3;
        int i9;
        int i10;
        int i11;
        boolean z3;
        defpackage.dot dotVar3;
        boolean z4;
        long j7;
        long j8;
        int i12;
        java.util.Iterator it;
        int i13 = i3 & 6;
        defpackage.cav cavVarB = cavVar.b(575671316);
        int i14 = i13 == 0 ? (true != cavVarB.B(abfrVar) ? 2 : 4) | i3 : i3;
        int i15 = i4 & 2;
        if (i15 != 0) {
            i14 |= 48;
        } else if ((i3 & 48) == 0) {
            i14 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        int i16 = i4 & 4;
        if (i16 != 0) {
            i14 |= 384;
            j3 = j;
        } else {
            j3 = j;
            if ((i3 & 384) == 0) {
                i14 |= true != cavVarB.A(j3) ? 128 : 256;
            }
        }
        int i17 = i4 & 8;
        if (i17 != 0) {
            i14 |= 3072;
            j4 = j2;
        } else {
            j4 = j2;
            if ((i3 & 3072) == 0) {
                i14 |= true != cavVarB.A(j4) ? 1024 : 2048;
            }
        }
        if ((i4 & 16) != 0) {
            i14 |= 24576;
        } else if ((i3 & 24576) == 0) {
            i14 |= true != cavVarB.B(null) ? 8192 : 16384;
        }
        int i18 = i4 & 32;
        if (i18 != 0) {
            i14 |= 196608;
        } else if ((i3 & 196608) == 0) {
            i14 |= true != cavVarB.B(dotVar) ? 65536 : 131072;
        }
        int i19 = i4 & 64;
        if (i19 != 0) {
            i14 |= 1572864;
            i5 = i;
        } else {
            i5 = i;
            if ((i3 & 1572864) == 0) {
                i14 |= true != cavVarB.z(i5) ? 524288 : 1048576;
            }
        }
        int i20 = i4 & 128;
        int i21 = i14;
        boolean z5 = i20 == 0;
        if (i20 != 0) {
            i6 = i21 | 12582912;
        } else if ((i3 & 12582912) == 0) {
            i6 = i21 | (true != cavVarB.C(z) ? 4194304 : 8388608);
        } else {
            i6 = i21;
        }
        int i22 = i4 & 256;
        if (i22 != 0) {
            i6 |= 100663296;
        } else if ((i3 & 100663296) == 0) {
            i6 |= true != cavVarB.z(i2) ? 33554432 : 67108864;
        }
        if ((805306368 & i3) == 0) {
            int i23 = 268435456;
            if ((i4 & 512) == 0 && cavVarB.B(dkzVar)) {
                i23 = 536870912;
            }
            i6 |= i23;
        }
        int i24 = i6;
        if (cavVarB.H((i6 & 306783379) != 306783378, i24 & 1)) {
            int i25 = i4 & 512;
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            cbtVar.Z(-127, null, 0, null);
            if ((i3 & 1) == 0 || cavVarB.E()) {
                defpackage.cmw cmwVar4 = i15 != 0 ? defpackage.cmw.c : cmwVar;
                jS = i16 != 0 ? defpackage.cfd.S() : j3;
                if (i17 != 0) {
                    defpackage.dpt[] dptVarArr = defpackage.dps.a;
                    jH = defpackage.dpy.h(0L, Float.NaN);
                } else {
                    jH = j4;
                }
                defpackage.dot dotVar4 = i18 != 0 ? null : dotVar;
                if (i19 != 0) {
                    i5 = 1;
                }
                boolean z6 = (!z5) | z;
                int i26 = i22 != 0 ? Integer.MAX_VALUE : i2;
                if (i25 != 0) {
                    i11 = i24 & (-1879048193);
                    cmwVar3 = cmwVar4;
                    i9 = i5;
                    dotVar3 = dotVar4;
                    i10 = i26;
                    dkzVar3 = (defpackage.dkz) cavVarB.e(defpackage.bvt.a);
                    z3 = z6;
                } else {
                    dkzVar3 = dkzVar;
                    cmwVar3 = cmwVar4;
                    i9 = i5;
                    i10 = i26;
                    i11 = i24;
                    z3 = z6;
                    dotVar3 = dotVar4;
                }
            } else {
                cavVarB.s();
                if (i25 != 0) {
                    int i27 = i24 & (-1879048193);
                    dotVar3 = dotVar;
                    z3 = z;
                    i10 = i2;
                    dkzVar3 = dkzVar;
                    i11 = i27;
                    i9 = i5;
                    jH = j4;
                    jS = j3;
                    cmwVar3 = cmwVar;
                } else {
                    z3 = z;
                    i10 = i2;
                    dkzVar3 = dkzVar;
                    i9 = i5;
                    jH = j4;
                    jS = j3;
                    i11 = i24;
                    cmwVar3 = cmwVar;
                    dotVar3 = dotVar;
                }
            }
            cavVarB.l();
            cavVarB.u(-830633353);
            long j9 = 16;
            if (jS != 16) {
                j7 = jS;
                j8 = j7;
                j9 = 16;
                z4 = false;
            } else {
                cavVarB.u(-830632580);
                long jF = dkzVar3.f();
                if (jF == 16) {
                    jF = ((defpackage.cqg) cavVarB.e(defpackage.boy.a)).a;
                }
                z4 = false;
                cbtVar.W(false);
                j7 = j9;
                j8 = jF;
            }
            cbtVar.W(z4);
            long j10 = jH;
            long j11 = defpackage.den.ak(cavVarB).a;
            long j12 = defpackage.abts.F(cavVarB).c;
            long j13 = defpackage.abts.F(cavVarB).d;
            long j14 = jS;
            long j15 = defpackage.abts.F(cavVarB).e;
            abfp abfpVar = new abfp(j11, j8, j13, defpackage.abts.F(cavVarB).f, defpackage.den.ak(cavVarB).l, defpackage.den.ak(cavVarB).m);
            int i28 = i11 & 14;
            java.lang.Object objR = cbtVar.R();
            if (i28 == 4 || objR == defpackage.cau.a) {
                java.lang.String str = abfrVar.a;
                java.util.List listCb = defpackage.ajsz.cb(abfrVar.b);
                java.util.Iterator it2 = listCb.iterator();
                while (it2.hasNext()) {
                    if (((abfo) it2.next()) instanceof abfc) {
                        throw null;
                    }
                }
                abfr abfrVar2 = new abfr(str, listCb);
                java.lang.String str2 = abfrVar2.a;
                java.util.List listCb2 = defpackage.ajsz.cb(abfrVar2.b);
                java.util.Iterator it3 = listCb2.iterator();
                while (it3.hasNext()) {
                    if (((abfo) it3.next()) instanceof abfh) {
                        throw null;
                    }
                }
                abfr abfrVar3 = new abfr(str2, listCb2);
                cbtVar.ab(abfrVar3);
                objR = abfrVar3;
            }
            abfr abfrVar4 = (abfr) objR;
            defpackage.aooh.f(abfrVar4, "$this$toAnnotatedString");
            djf djfVar = new djf(16);
            java.util.List<abfj> list = abfrVar4.b;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                abfo abfoVar = (abfo) obj;
                if ((abfoVar instanceof abfh) || (abfoVar instanceof abfj)) {
                    arrayList.add(obj);
                }
            }
            int i29 = 14;
            for (abfj abfjVar : defpackage.ajsz.bX(arrayList, new qxq(14))) {
                int iBn = bn(abfjVar);
                if (iBn == 0) {
                    java.lang.String str3 = abfrVar4.a;
                    throw null;
                }
                if (iBn == 1) {
                    java.lang.String str4 = abfrVar4.a;
                    throw null;
                }
            }
            java.lang.String str5 = abfrVar4.a;
            if (str5.length() > 0) {
                java.lang.String strSubstring = str5.substring(0);
                defpackage.aooh.e(strSubstring, "substring(...)");
                djfVar.g(strSubstring);
            }
            java.util.Iterator it4 = list.iterator();
            while (it4.hasNext()) {
                abfd abfdVar = (abfo) it4.next();
                if (!(abfdVar instanceof abfh) && !(abfdVar instanceof abfj)) {
                    j$.util.Objects.checkIndex(0, i29);
                    if (abfdVar != null) {
                        if (abfdVar instanceof abfb) {
                            new defpackage.dks(0L, 0L, defpackage.dnd.g, (defpackage.dmw) null, (defpackage.dmx) null, (defpackage.dmq) null, (java.lang.String) null, 0L, (defpackage.dok) null, (defpackage.doz) null, (defpackage.dnx) null, 0L, (defpackage.dou) null, (defpackage.crc) null, 65531);
                            throw null;
                        }
                        if (abfdVar instanceof abfc) {
                            new defpackage.dkd(0, new defpackage.dpa(defpackage.dpy.g(20), 1), 503);
                            throw null;
                        }
                        if (abfdVar instanceof abfm) {
                            new defpackage.dkd(0, null, 511);
                            throw null;
                        }
                        if (abfdVar instanceof abfd) {
                            abfd abfdVar2 = abfdVar;
                            it = it4;
                            dju djuVar = new dju(abfdVar2.a, (dkx) null, new krq(abfdVar, 2));
                            int i30 = abfdVar2.c;
                            int i31 = abfdVar2.d;
                            djfVar.c.add(new dje(djuVar, i30, i31, ""));
                            djfVar.e(new defpackage.dks(abfpVar.a, 0L, (defpackage.dnd) null, (defpackage.dmw) null, (defpackage.dmx) null, (defpackage.dmq) null, (java.lang.String) null, 0L, (defpackage.dok) null, (defpackage.doz) null, (defpackage.dnx) null, 0L, defpackage.dou.b, (defpackage.crc) null, 61438), i30, i31);
                        } else {
                            it = it4;
                            if (abfdVar instanceof abfi) {
                                abfi abfiVar = (abfi) abfdVar;
                                djfVar.e(new defpackage.dks(0L, 0L, (defpackage.dnd) null, new defpackage.dmw(1), (defpackage.dmx) null, (defpackage.dmq) null, (java.lang.String) null, 0L, (defpackage.dok) null, (defpackage.doz) null, (defpackage.dnx) null, 0L, (defpackage.dou) null, (defpackage.crc) null, 65527), abfiVar.a, abfiVar.b);
                            } else {
                                if (abfdVar instanceof abfk) {
                                    throw null;
                                }
                                if (abfdVar instanceof abfn) {
                                    new defpackage.dks(0L, 0L, (defpackage.dnd) null, (defpackage.dmw) null, (defpackage.dmx) null, (defpackage.dmq) null, (java.lang.String) null, 0L, (defpackage.dok) null, (defpackage.doz) null, (defpackage.dnx) null, 0L, defpackage.dou.b, (defpackage.crc) null, 61439);
                                    throw null;
                                }
                                if (abfdVar instanceof abfe) {
                                    abfe abfeVar = (abfe) abfdVar;
                                    djfVar.e(new defpackage.dks(defpackage.cfd.M(abfeVar.a), 0L, (defpackage.dnd) null, (defpackage.dmw) null, (defpackage.dmx) null, (defpackage.dmq) null, (java.lang.String) null, 0L, (defpackage.dok) null, (defpackage.doz) null, (defpackage.dnx) null, 0L, (defpackage.dou) null, (defpackage.crc) null, 65534), abfeVar.b, abfeVar.c);
                                } else if (abfdVar instanceof abff) {
                                    long j16 = abfpVar.b;
                                    if (j16 != j9) {
                                        abff abffVar = (abff) abfdVar;
                                        float f = abffVar.a;
                                        djfVar.e(new defpackage.dks(defpackage.cqg.h(j16, 0.16f), 0L, (defpackage.dnd) null, (defpackage.dmw) null, (defpackage.dmx) null, (defpackage.dmq) null, (java.lang.String) null, 0L, (defpackage.dok) null, (defpackage.doz) null, (defpackage.dnx) null, 0L, (defpackage.dou) null, (defpackage.crc) null, 65534), abffVar.b, abffVar.c);
                                    }
                                } else {
                                    if (abfdVar instanceof abfg) {
                                        throw null;
                                    }
                                    if (abfdVar instanceof abfl) {
                                        new defpackage.dks(abfpVar.a, 0L, (defpackage.dnd) null, (defpackage.dmw) null, (defpackage.dmx) null, (defpackage.dmq) null, (java.lang.String) null, 0L, (defpackage.dok) null, (defpackage.doz) null, (defpackage.dnx) null, 0L, (defpackage.dou) null, (defpackage.crc) null, 65534);
                                        throw null;
                                    }
                                }
                            }
                        }
                        i29 = 14;
                        it4 = it;
                    }
                    throw new defpackage.aois();
                }
            }
            defpackage.dji djiVarC = djfVar.c();
            defpackage.aooh.f(abfrVar4, "<this>");
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            xa.i(cavVarB);
            defpackage.dkz dkzVar4 = defpackage.den.an(cavVarB).o;
            cavVarB.u(344731883);
            for (abfj abfjVar2 : list) {
                int iBn2 = bn(abfjVar2);
                if (iBn2 == 0) {
                    cavVarB.u(2096781745);
                    throw null;
                }
                if (iBn2 == 1) {
                    cavVarB.u(2097379518);
                    throw null;
                }
                cavVarB.u(2099150207);
                cbtVar.W(false);
            }
            cbtVar.W(false);
            boolean zB = cavVarB.B(abfrVar4);
            java.lang.Object objR2 = cbtVar.R();
            if (zB || objR2 == defpackage.cau.a) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(defpackage.aokc.a, defpackage.cdu.c);
                cbtVar.ab(parcelableSnapshotMutableState);
                objR2 = parcelableSnapshotMutableState;
            }
            defpackage.ccp ccpVar = (defpackage.ccp) objR2;
            defpackage.aooh.f(abfrVar4, "<this>");
            if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                java.util.Iterator it5 = list.iterator();
                while (it5.hasNext()) {
                    if (((abfo) it5.next()) instanceof abfg) {
                        throw null;
                    }
                }
            }
            cavVarB.u(-830615018);
            cbtVar.W(false);
            boolean zC = cavVarB.C(false) | cavVarB.B(ccpVar) | cavVarB.B(abfrVar4);
            boolean z7 = (3670016 & i11) == 1048576;
            java.lang.Object objR3 = cbtVar.R();
            if ((zC || z7) || objR3 == defpackage.cau.a) {
                i12 = 14;
                objR3 = new yrz(14);
                cbtVar.ab(objR3);
            } else {
                i12 = 14;
            }
            int i32 = i11 << 3;
            int i33 = (i11 >> 15) & i12;
            int i34 = i11 >> 12;
            cavVar2 = cavVarB;
            defpackage.abrz.l(djiVarC, cmwVar3, j7, j10, 0L, dotVar3, 0L, i9, z3, i10, 0, linkedHashMap, (defpackage.aonj) objR3, dkzVar3, cavVar2, (i11 & 896) | (57344 & i32) | (i32 & 458752), i33 | (i34 & 896) | (i34 & 7168) | (i34 & 57344) | ((i11 >> 3) & 234881024), 35784);
            j6 = j14;
            cmwVar2 = cmwVar3;
            j5 = j10;
            dotVar2 = dotVar3;
            i7 = i9;
            z2 = z3;
            i8 = i10;
            dkzVar2 = dkzVar3;
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
            long j17 = j4;
            i7 = i5;
            j5 = j17;
            cmwVar2 = cmwVar;
            dotVar2 = dotVar;
            z2 = z;
            i8 = i2;
            dkzVar2 = dkzVar;
            j6 = j3;
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abfq(abfrVar, cmwVar2, j6, j5, dotVar2, i7, z2, i8, dkzVar2, i3, i4, 0);
        }
    }

    public static /* synthetic */ int bn(java.lang.Object obj) {
        j$.util.Objects.checkIndex(0, 3);
        if (obj == null) {
            return -1;
        }
        if (obj instanceof abfh) {
            return 0;
        }
        return obj instanceof abfj ? 1 : -2;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x03ea A[PHI: r3
      0x03ea: PHI (r3v33 dng) = (r3v32 dng), (r3v34 dng), (r3v35 dng) binds: [B:110:0x03d4, B:112:0x03de, B:114:0x03e8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x0154  */
    public static void bo(java.lang.String str, defpackage.cmw cmwVar, long j, long j2, defpackage.dot dotVar, int i, boolean z, int i2, defpackage.dkz dkzVar, defpackage.cav cavVar, int i3, int i4) {
        int i5;
        defpackage.cav cavVar2;
        long j3;
        long j4;
        int i6;
        boolean z2;
        int i7;
        long jS;
        int i8;
        int i9;
        long jH;
        boolean z3;
        java.lang.Object[] objArr;
        int i10;
        java.lang.String url;
        dng dngVar;
        defpackage.dks dksVar;
        defpackage.dks dksVar2;
        int i11;
        defpackage.aooh.f(str, "text");
        int i12 = i3 & 6;
        defpackage.cav cavVarB = cavVar.b(-945474864);
        if (i12 == 0) {
            i5 = i3 | (true != cavVarB.B(str) ? 2 : 4);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        int i13 = i5 | 28032;
        if ((i3 & 196608) == 0) {
            i13 |= true != cavVarB.B(dotVar) ? 65536 : 131072;
        }
        int i14 = i13 | 114819072;
        if ((i3 & 805306368) == 0) {
            i14 |= true != cavVarB.B(dkzVar) ? 268435456 : 536870912;
        }
        if (cavVarB.H(((306783379 & i14) == 306783378 && ((i4 | 6) & 3) == 2) ? false : true, i14 & 1)) {
            ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
            if ((i3 & 1) == 0 || cavVarB.E()) {
                jS = defpackage.cfd.S();
                defpackage.dpt[] dptVarArr = defpackage.dps.a;
                i8 = 1;
                i9 = Integer.MAX_VALUE;
                jH = defpackage.dpy.h(0L, Float.NaN);
                z3 = true;
            } else {
                cavVarB.s();
                jS = j;
                jH = j2;
                i8 = i;
                z3 = z;
                i9 = i2;
            }
            cavVarB.l();
            long j5 = defpackage.den.ak(cavVarB).a;
            defpackage.dou douVar = defpackage.dou.b;
            dkx dkxVar = new dkx(new defpackage.dks(j5, 0L, (defpackage.dnd) null, (defpackage.dmw) null, (defpackage.dmx) null, (defpackage.dmq) null, (java.lang.String) null, 0L, (defpackage.dok) null, (defpackage.doz) null, (defpackage.dnx) null, 0L, douVar, (defpackage.crc) null, 61438), (defpackage.dks) null, (defpackage.dks) null, (defpackage.dks) null);
            android.text.Spanned spannedM = aa$.ExternalSyntheticApiModelOutline1.m("<ContentHandlerReplacementTag />".concat(java.lang.String.valueOf(str)), 63, (android.text.Html.ImageGetter) null, djt.a);
            djf djfVar = new djf(spannedM.length());
            djfVar.k(spannedM);
            java.lang.Object[] spans = spannedM.getSpans(0, djfVar.a(), java.lang.Object.class);
            int length = spans.length;
            int i15 = 0;
            while (i15 < length) {
                int i16 = length;
                java.lang.Object obj = spans[i15];
                defpackage.cav cavVar3 = cavVarB;
                long jE = defpackage.dfd.e(spannedM.getSpanStart(obj), spannedM.getSpanEnd(obj));
                int iD = defpackage.dky.d(jE);
                int iA = defpackage.dky.a(jE);
                android.text.Spanned spanned = spannedM;
                if (!(obj instanceof android.text.style.AbsoluteSizeSpan)) {
                    if (obj instanceof android.text.style.AlignmentSpan) {
                        android.text.Layout.Alignment alignment = ((android.text.style.AlignmentSpan) obj).getAlignment();
                        if (alignment == null) {
                            i11 = 0;
                        } else {
                            int i17 = djs.a[alignment.ordinal()];
                            if (i17 == 1) {
                                i11 = 5;
                            } else if (i17 == 2) {
                                i11 = 3;
                            } else if (i17 != 3) {
                                i11 = 0;
                            } else {
                                i11 = 6;
                            }
                        }
                        djfVar.d(new defpackage.dkd(i11, null, 510), iD, iA);
                    } else {
                        jH = jH;
                        if (obj instanceof djl) {
                            djl djlVar = (djl) obj;
                            i10 = i8;
                            djfVar.c.add(new dje(new dku(djlVar.b), iD, iA, djlVar.a));
                        } else {
                            i10 = i8;
                            if (obj instanceof android.text.style.BackgroundColorSpan) {
                                djfVar.e(new defpackage.dks(0L, 0L, (defpackage.dnd) null, (defpackage.dmw) null, (defpackage.dmx) null, (defpackage.dmq) null, (java.lang.String) null, 0L, (defpackage.dok) null, (defpackage.doz) null, (defpackage.dnx) null, defpackage.cfd.M(((android.text.style.BackgroundColorSpan) obj).getBackgroundColor()), (defpackage.dou) null, (defpackage.crc) null, 63487), iD, iA);
                            } else if (obj instanceof djo) {
                                long j6 = djn.a;
                                djo djoVar = (djo) obj;
                                int i18 = djoVar.b;
                                defpackage.dpy.i(j6);
                                defpackage.dpt[] dptVarArr2 = defpackage.dps.a;
                                long jH2 = defpackage.dpy.h(j6 & 1095216660480L, i18 * defpackage.dps.a(j6));
                                djn djnVar = djoVar.a;
                                objArr = spans;
                                defpackage.dkd dkdVar = new defpackage.dkd(0, new defpackage.dpa(jH2, jH2), 503);
                                java.util.List list = djfVar.c;
                                list.add(new dje(dkdVar, iD, iA, ""));
                                list.add(new dje(djnVar, iD, iA, ""));
                            } else {
                                objArr = spans;
                                if (obj instanceof android.text.style.ForegroundColorSpan) {
                                    djfVar.e(new defpackage.dks(defpackage.cfd.M(((android.text.style.ForegroundColorSpan) obj).getForegroundColor()), 0L, (defpackage.dnd) null, (defpackage.dmw) null, (defpackage.dmx) null, (defpackage.dmq) null, (java.lang.String) null, 0L, (defpackage.dok) null, (defpackage.doz) null, (defpackage.dnx) null, 0L, (defpackage.dou) null, (defpackage.crc) null, 65534), iD, iA);
                                } else if (obj instanceof android.text.style.RelativeSizeSpan) {
                                    djfVar.e(new defpackage.dks(0L, defpackage.dpy.h(8589934592L, ((android.text.style.RelativeSizeSpan) obj).getSizeChange()), (defpackage.dnd) null, (defpackage.dmw) null, (defpackage.dmx) null, (defpackage.dmq) null, (java.lang.String) null, 0L, (defpackage.dok) null, (defpackage.doz) null, (defpackage.dnx) null, 0L, (defpackage.dou) null, (defpackage.crc) null, 65533), iD, iA);
                                } else if (obj instanceof android.text.style.StrikethroughSpan) {
                                    djfVar.e(new defpackage.dks(0L, 0L, (defpackage.dnd) null, (defpackage.dmw) null, (defpackage.dmx) null, (defpackage.dmq) null, (java.lang.String) null, 0L, (defpackage.dok) null, (defpackage.doz) null, (defpackage.dnx) null, 0L, defpackage.dou.c, (defpackage.crc) null, 61439), iD, iA);
                                } else if (obj instanceof android.text.style.StyleSpan) {
                                    int style = ((android.text.style.StyleSpan) obj).getStyle();
                                    if (style != 1) {
                                        if (style == 2) {
                                            dksVar2 = new defpackage.dks(0L, 0L, (defpackage.dnd) null, new defpackage.dmw(1), (defpackage.dmx) null, (defpackage.dmq) null, (java.lang.String) null, 0L, (defpackage.dok) null, (defpackage.doz) null, (defpackage.dnx) null, 0L, (defpackage.dou) null, (defpackage.crc) null, 65527);
                                        } else if (style != 3) {
                                            dksVar = null;
                                        } else {
                                            dksVar2 = new defpackage.dks(0L, 0L, defpackage.dnd.g, new defpackage.dmw(1), (defpackage.dmx) null, (defpackage.dmq) null, (java.lang.String) null, 0L, (defpackage.dok) null, (defpackage.doz) null, (defpackage.dnx) null, 0L, (defpackage.dou) null, (defpackage.crc) null, 65523);
                                        }
                                        dksVar = dksVar2;
                                    } else {
                                        dksVar = new defpackage.dks(0L, 0L, defpackage.dnd.g, (defpackage.dmw) null, (defpackage.dmx) null, (defpackage.dmq) null, (java.lang.String) null, 0L, (defpackage.dok) null, (defpackage.doz) null, (defpackage.dnx) null, 0L, (defpackage.dou) null, (defpackage.crc) null, 65531);
                                    }
                                    if (dksVar != null) {
                                        djfVar.e(dksVar, iD, iA);
                                    }
                                } else if (obj instanceof android.text.style.SubscriptSpan) {
                                    djfVar.e(new defpackage.dks(0L, 0L, (defpackage.dnd) null, (defpackage.dmw) null, (defpackage.dmx) null, (defpackage.dmq) null, (java.lang.String) null, 0L, new defpackage.dok(-0.5f), (defpackage.doz) null, (defpackage.dnx) null, 0L, (defpackage.dou) null, (defpackage.crc) null, 65279), iD, iA);
                                } else if (obj instanceof android.text.style.SuperscriptSpan) {
                                    djfVar.e(new defpackage.dks(0L, 0L, (defpackage.dnd) null, (defpackage.dmw) null, (defpackage.dmx) null, (defpackage.dmq) null, (java.lang.String) null, 0L, new defpackage.dok(0.5f), (defpackage.doz) null, (defpackage.dnx) null, 0L, (defpackage.dou) null, (defpackage.crc) null, 65279), iD, iA);
                                } else if (obj instanceof android.text.style.TypefaceSpan) {
                                    android.text.style.TypefaceSpan typefaceSpan = (android.text.style.TypefaceSpan) obj;
                                    java.lang.String family = typefaceSpan.getFamily();
                                    dng dngVar2 = defpackage.dmq.d;
                                    if (defpackage.aooh.n(family, dngVar2.f)) {
                                        dngVar = dngVar2;
                                    } else {
                                        dng dngVar3 = defpackage.dmq.c;
                                        if (defpackage.aooh.n(family, dngVar3.f)) {
                                            dngVar = dngVar3;
                                        } else {
                                            dngVar3 = defpackage.dmq.a;
                                            if (defpackage.aooh.n(family, dngVar3.f)) {
                                                dngVar = dngVar3;
                                            } else {
                                                dngVar3 = defpackage.dmq.b;
                                                if (defpackage.aooh.n(family, dngVar3.f)) {
                                                    dngVar = dngVar3;
                                                } else {
                                                    java.lang.String family2 = typefaceSpan.getFamily();
                                                    if (family2 != null) {
                                                        if (family2.length() == 0) {
                                                            dngVar = null;
                                                        } else {
                                                            android.graphics.Typeface typefaceCreate = android.graphics.Typeface.create(family2, 0);
                                                            if (defpackage.aooh.n(typefaceCreate, android.graphics.Typeface.DEFAULT) || defpackage.aooh.n(typefaceCreate, android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, 0))) {
                                                                typefaceCreate = null;
                                                            }
                                                            if (typefaceCreate != null) {
                                                                dngVar = new dng(new vk(typefaceCreate, (byte[]) null));
                                                            }
                                                        }
                                                    }
                                                    dngVar2 = null;
                                                    dngVar = dngVar2;
                                                }
                                            }
                                        }
                                    }
                                    djfVar.e(new defpackage.dks(0L, 0L, (defpackage.dnd) null, (defpackage.dmw) null, (defpackage.dmx) null, (defpackage.dmq) dngVar, (java.lang.String) null, 0L, (defpackage.dok) null, (defpackage.doz) null, (defpackage.dnx) null, 0L, (defpackage.dou) null, (defpackage.crc) null, 65503), iD, iA);
                                } else if (obj instanceof android.text.style.UnderlineSpan) {
                                    djfVar.e(new defpackage.dks(0L, 0L, (defpackage.dnd) null, (defpackage.dmw) null, (defpackage.dmx) null, (defpackage.dmq) null, (java.lang.String) null, 0L, (defpackage.dok) null, (defpackage.doz) null, (defpackage.dnx) null, 0L, douVar, (defpackage.crc) null, 61439), iD, iA);
                                } else if ((obj instanceof android.text.style.URLSpan) && (url = ((android.text.style.URLSpan) obj).getURL()) != null) {
                                    djfVar.c.add(new dje(new djv(url, dkxVar), iD, iA, ""));
                                }
                            }
                        }
                        objArr = spans;
                    }
                    i15++;
                    spannedM = spanned;
                    jH = jH;
                    i8 = i10;
                    spans = objArr;
                    length = i16;
                    cavVarB = cavVar3;
                }
                i10 = i8;
                objArr = spans;
                i15++;
                spannedM = spanned;
                jH = jH;
                i8 = i10;
                spans = objArr;
                length = i16;
                cavVarB = cavVar3;
            }
            cavVar2 = cavVarB;
            long j7 = jH;
            int i19 = i8;
            defpackage.dji djiVarC = djfVar.c();
            int i20 = i14 << 3;
            int i21 = i14 >> 12;
            int i22 = ((i14 >> 15) & 14) | (i21 & 896) | (i21 & 7168) | (i21 & 57344) | ((i14 >> 3) & 234881024);
            long j8 = jS;
            boolean z4 = z3;
            defpackage.abrz.l(djiVarC, cmwVar, j8, j7, 0L, dotVar, 0L, i19, z4, i9, 0, null, null, dkzVar, cavVar2, (i14 & 1008) | (i20 & 57344) | (i20 & 458752), i22, 232392);
            j3 = j8;
            j4 = j7;
            i6 = i19;
            z2 = z4;
            i7 = i9;
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
            j3 = j;
            j4 = j2;
            i6 = i;
            z2 = z;
            i7 = i2;
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abfq(str, cmwVar, j3, j4, dotVar, i6, z2, i7, dkzVar, i3, i4, 1);
        }
    }

    public static void bp(java.lang.String str, java.util.List list, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.aooh.f(list, "annotations");
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1455226064);
        if (i3 == 0) {
            i2 = i | (true != cavVarB.B(str) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? cavVarB.B(list) : cavVarB.D(list)) ? 16 : 32;
        }
        if (cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            defpackage.cmt cmtVar = defpackage.cmw.c;
            defpackage.cmw cmwVarBD = bD(defpackage.den.aY(rl.f(cmtVar, rl.e(cavVarB, 6), false), 16.0f));
            defpackage.cye cyeVarB = defpackage.awo.b(defpackage.cmh.a, false);
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            int iM = defpackage.anty.M(cbtVar.x);
            defpackage.cje cjeVarAi = cbtVar.ai();
            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmwVarBD);
            defpackage.aomy aomyVar = defpackage.dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            defpackage.aonn aonnVar = defpackage.dam.e;
            defpackage.cev.c(cavVarB, cyeVarB, aonnVar);
            defpackage.aonn aonnVar2 = defpackage.dam.d;
            defpackage.cev.c(cavVarB, cjeVarAi, aonnVar2);
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(iM);
            defpackage.aonn aonnVar3 = defpackage.dam.f;
            defpackage.cev.c(cavVarB, numValueOf, aonnVar3);
            defpackage.aonj aonjVar = defpackage.dam.g;
            defpackage.cev.b(cavVarB, aonjVar);
            defpackage.aonn aonnVar4 = defpackage.dam.c;
            defpackage.cev.c(cavVarB, cmwVarM, aonnVar4);
            defpackage.bfx bfxVar = defpackage.den.am(cavVarB).a;
            defpackage.cmw cmwVarD = defpackage.sl.d(defpackage.den.bm(defpackage.cfd.K(cmtVar, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, bfxVar, true, 0, 1042431), 1.0f, defpackage.den.ak(cavVarB).s, bfxVar));
            defpackage.cye cyeVarA = defpackage.aww.a(defpackage.awi.c, defpackage.cmh.j, cavVarB, 0);
            int iM2 = defpackage.anty.M(cbtVar.x);
            defpackage.cje cjeVarAi2 = cbtVar.ai();
            defpackage.cmw cmwVarM2 = defpackage.cfo.m(cavVarB, cmwVarD);
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            defpackage.cev.c(cavVarB, cyeVarA, aonnVar);
            defpackage.cev.c(cavVarB, cjeVarAi2, aonnVar2);
            defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM2), aonnVar3);
            defpackage.cev.b(cavVarB, aonjVar);
            defpackage.cev.c(cavVarB, cmwVarM2, aonnVar4);
            bq(str, list, cavVarB, i2 & 14);
            cbtVar.W(true);
            cbtVar.W(true);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.slz(str, list, i, 13, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:80:0x0216 A[LOOP:3: B:78:0x0210->B:80:0x0216, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:86:0x026a  */
    /* JADX WARN: Code duplicated, block: B:89:0x0295  */
    /* JADX WARN: Code duplicated, block: B:90:0x0299  */
    /* JADX WARN: Code duplicated, block: B:96:0x02da  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [cbt] */
    /* JADX WARN: Type inference failed for: r0v18, types: [cbt] */
    /* JADX WARN: Type inference failed for: r0v61, types: [cbt] */
    /* JADX WARN: Type inference failed for: r0v65, types: [cbt] */
    /* JADX WARN: Type inference failed for: r11v1, types: [cbt] */
    /* JADX WARN: Type inference failed for: r11v9, types: [cbt] */
    /* JADX WARN: Type inference failed for: r1v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v22, types: [cbt] */
    /* JADX WARN: Type inference failed for: r6v9, types: [cbt] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r8v4, types: [cbt] */
    public static void bq(java.lang.String str, java.util.List list, defpackage.cav cavVar, int i) {
        defpackage.cdk cdkVarI;
        defpackage.slz slzVar;
        boolean z;
        long j;
        java.lang.Object next;
        defpackage.cbt cbtVar;
        boolean z2;
        boolean z3;
        java.lang.String strSubstring;
        defpackage.aoot aootVar;
        java.util.ArrayList arrayList;
        java.util.Iterator it;
        boolean z4;
        defpackage.aonn aonnVar;
        defpackage.aonn aonnVar2;
        ?? r1;
        java.lang.String str2 = str;
        list = list;
        int i2 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-567634903);
        int i3 = 2;
        boolean z5 = true;
        int i4 = i2 == 0 ? i | (true != cavVarB.B(str2) ? 2 : 4) : i;
        if ((i & 48) == 0) {
            i4 |= true != ((i & 64) == 0 ? cavVarB.B(list) : cavVarB.D(list)) ? 16 : 32;
        }
        ?? r7 = 0;
        if (cavVarB.H((i4 & 19) != 18, i4 & 1)) {
            if (list == null || list.isEmpty()) {
                cdkVarI = cavVarB.I();
                if (cdkVarI == null) {
                    return;
                } else {
                    slzVar = new defpackage.slz(str, list, i, 14, null);
                }
            } else {
                java.util.ListIterator listIterator = list.listIterator();
                java.lang.Object next2 = listIterator.next();
                boolean z6 = true;
                boolean z7 = false;
                while (listIterator.hasNext()) {
                    cavVarB.u(-1124788126);
                    if (next2 instanceof abeo) {
                        switch (((abeo) next2).a.ordinal()) {
                            case 14:
                                z = z5;
                                ?? r2 = r7;
                                cavVarB.u(-1124713478);
                                ((defpackage.cbt) cavVarB).W(r2);
                                z7 = z;
                                r1 = r2;
                                next2 = listIterator.next();
                                ((defpackage.cbt) cavVarB).W(r1);
                                r7 = r1;
                                z5 = z;
                                listIterator = listIterator;
                                break;
                            case 15:
                                z = z5;
                                ?? r3 = r7;
                                cavVarB.u(-1124646983);
                                ((defpackage.cbt) cavVarB).W(r3);
                                z7 = r3 == true ? 1 : 0;
                                r1 = r3;
                                next2 = listIterator.next();
                                ((defpackage.cbt) cavVarB).W(r1);
                                r7 = r1;
                                z5 = z;
                                listIterator = listIterator;
                                break;
                            case 16:
                                cavVarB.u(-1124498834);
                                if (z6) {
                                    cavVarB.u(-1124351367);
                                    ((defpackage.cbt) cavVarB).W(r7);
                                } else {
                                    cavVarB.u(-1124537150);
                                    defpackage.aaoo.af(defpackage.azm.d(defpackage.cmw.c, 1.0f), defpackage.den.ak(cavVarB).s, cavVarB, 54);
                                    ((defpackage.cbt) cavVarB).W(r7);
                                }
                                defpackage.cmt cmtVar = defpackage.cmw.c;
                                if (z7) {
                                    cavVarB.u(-1124277587);
                                    j = defpackage.den.ak(cavVarB).F;
                                    ((defpackage.cbt) cavVarB).W(r7);
                                } else {
                                    cavVarB.u(-1124196522);
                                    j = defpackage.den.ak(cavVarB).p;
                                    ((defpackage.cbt) cavVarB).W(r7);
                                }
                                defpackage.cmw cmwVarC = defpackage.sl.c(cmtVar.a(new defpackage.amq(j, null, defpackage.cqz.a, 2)), i3);
                                defpackage.cye cyeVarA = defpackage.azh.a(defpackage.awi.a, defpackage.cmh.m, cavVarB, r7);
                                defpackage.cbt cbtVar2 = (defpackage.cbt) cavVarB;
                                int iM = defpackage.anty.M(cbtVar2.x);
                                defpackage.cje cjeVarAi = cbtVar2.ai();
                                defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmwVarC);
                                defpackage.aomy aomyVar = defpackage.dam.a;
                                cavVarB.v();
                                if (cbtVar2.w) {
                                    cavVarB.j(aomyVar);
                                } else {
                                    cavVarB.x();
                                }
                                defpackage.aonn aonnVar3 = defpackage.dam.e;
                                defpackage.cev.c(cavVarB, cyeVarA, aonnVar3);
                                defpackage.aonn aonnVar4 = defpackage.dam.d;
                                defpackage.cev.c(cavVarB, cjeVarAi, aonnVar4);
                                java.lang.Integer numValueOf = java.lang.Integer.valueOf(iM);
                                defpackage.aonn aonnVar5 = defpackage.dam.f;
                                defpackage.cev.c(cavVarB, numValueOf, aonnVar5);
                                defpackage.aonj aonjVar = defpackage.dam.g;
                                defpackage.cev.b(cavVarB, aonjVar);
                                defpackage.aonn aonnVar6 = defpackage.dam.c;
                                defpackage.cev.c(cavVarB, cmwVarM, aonnVar6);
                                cavVarB.u(-161125821);
                                boolean z8 = true;
                                while (true) {
                                    cavVarB.u(-699931106);
                                    next = listIterator.next();
                                    abeo abeoVar = next instanceof abeo ? (abeo) next : null;
                                    abex abexVar = abeoVar != null ? abeoVar.a : null;
                                    if (abexVar == abex.q || abexVar == abex.p) {
                                        listIterator = listIterator;
                                        next = next;
                                        cbtVar = cbtVar2;
                                        z2 = false;
                                        z3 = true;
                                        i3 = 2;
                                        cbtVar.W(false);
                                    } else {
                                        if (abexVar != abex.r) {
                                            cbtVar2.W(false);
                                            listIterator = listIterator;
                                            aonnVar2 = aonnVar3;
                                            aonnVar = aonnVar6;
                                            next = next;
                                            z2 = false;
                                            aonnVar4 = aonnVar4;
                                            cbtVar = cbtVar2;
                                            aonjVar = aonjVar;
                                            aonnVar5 = aonnVar5;
                                            aomyVar = aomyVar;
                                            z3 = true;
                                            i3 = 2;
                                        } else {
                                            if (z8) {
                                                cavVarB.u(-699448685);
                                                cbtVar2.W(false);
                                            } else {
                                                cavVarB.u(-699674954);
                                                defpackage.aaoo.ag(defpackage.azm.k(defpackage.azm.b(cmtVar, 1.0f), 1.0f), defpackage.den.ak(cavVarB).s, cavVarB, 54);
                                                cbtVar2.W(false);
                                            }
                                            for (int iNextIndex = listIterator.nextIndex(); iNextIndex < list.size(); iNextIndex++) {
                                                abeq abeqVar = (abeq) list.get(iNextIndex);
                                                int iB = abeqVar.b();
                                                int i5 = ((abeo) next).c;
                                                if (iB >= i5 && abeqVar.a() > i5) {
                                                    abeo abeoVar2 = (abeo) next;
                                                    strSubstring = str2.substring(abeoVar2.b, abeoVar2.c);
                                                    defpackage.aooh.e(strSubstring, "substring(...)");
                                                    aootVar = new defpackage.aoot();
                                                    arrayList = new java.util.ArrayList(defpackage.ajsz.bl(list.subList(listIterator.nextIndex(), iNextIndex), 10));
                                                    for (it = r0.iterator(); it.hasNext(); it = it) {
                                                        abeq abeqVar2 = (abeq) it.next();
                                                        abeq abeqVar3 = (abeq) next;
                                                        arrayList.add(abeqVar2.c(abeqVar2.b() - abeqVar3.b(), abeqVar2.a() - abeqVar3.b()));
                                                    }
                                                    aootVar.a = arrayList;
                                                    if (z7 || strSubstring.length() <= 0) {
                                                        z4 = false;
                                                    } else {
                                                        aootVar.a = defpackage.ajsz.cb((java.util.Collection) aootVar.a);
                                                        z4 = false;
                                                        ((java.util.List) aootVar.a).add(new abeo(abex.e, 0, strSubstring.length()));
                                                    }
                                                    defpackage.cmw cmwVarAY = defpackage.den.aY(defpackage.azm.k(cmtVar, 100.0f), 8.0f);
                                                    defpackage.cye cyeVarB = defpackage.awo.b(defpackage.cmh.a, z4);
                                                    int iM2 = defpackage.anty.M(cbtVar2.x);
                                                    defpackage.cje cjeVarAi2 = cbtVar2.ai();
                                                    defpackage.cmw cmwVarM2 = defpackage.cfo.m(cavVarB, cmwVarAY);
                                                    cavVarB.v();
                                                    if (cbtVar2.w) {
                                                        cavVarB.j(aomyVar);
                                                    } else {
                                                        cavVarB.x();
                                                    }
                                                    defpackage.cev.c(cavVarB, cyeVarB, aonnVar3);
                                                    defpackage.cev.c(cavVarB, cjeVarAi2, aonnVar4);
                                                    defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM2), aonnVar5);
                                                    defpackage.cev.b(cavVarB, aonjVar);
                                                    defpackage.cev.c(cavVarB, cmwVarM2, aonnVar6);
                                                    if (strSubstring.length() <= 0 || !((java.util.Collection) aootVar.a).isEmpty()) {
                                                        cavVarB.u(1691645535);
                                                        aonnVar = aonnVar6;
                                                        aonnVar2 = aonnVar3;
                                                        z2 = false;
                                                        cbtVar = cbtVar2;
                                                        i3 = 2;
                                                        abew.e(new abey(strSubstring, (java.util.List) aootVar.a), (defpackage.cmw) null, (defpackage.cmw) null, 0L, (defpackage.dkz) null, 0L, false, (java.util.Map) null, (defpackage.aonn) null, (defpackage.dkz) null, cavVarB, 805306368, 0, 32254);
                                                        cbtVar.W(false);
                                                    } else {
                                                        cavVarB.u(1691841579);
                                                        cbtVar2.W(false);
                                                        z2 = false;
                                                        aonnVar2 = aonnVar3;
                                                        aonnVar = aonnVar6;
                                                        cbtVar = cbtVar2;
                                                        i3 = 2;
                                                    }
                                                    z3 = true;
                                                    cbtVar.W(true);
                                                    cbtVar.W(z2);
                                                    z8 = z2;
                                                }
                                            }
                                            abeo abeoVar3 = (abeo) next;
                                            strSubstring = str2.substring(abeoVar3.b, abeoVar3.c);
                                            defpackage.aooh.e(strSubstring, "substring(...)");
                                            aootVar = new defpackage.aoot();
                                            arrayList = new java.util.ArrayList(defpackage.ajsz.bl(list.subList(listIterator.nextIndex(), iNextIndex), 10));
                                            while (it.hasNext()) {
                                                abeq abeqVar4 = (abeq) it.next();
                                                abeq abeqVar5 = (abeq) next;
                                                arrayList.add(abeqVar4.c(abeqVar4.b() - abeqVar5.b(), abeqVar4.a() - abeqVar5.b()));
                                            }
                                            aootVar.a = arrayList;
                                            if (z7) {
                                                z4 = false;
                                            } else {
                                                z4 = false;
                                            }
                                            defpackage.cmw cmwVarAY2 = defpackage.den.aY(defpackage.azm.k(cmtVar, 100.0f), 8.0f);
                                            defpackage.cye cyeVarB2 = defpackage.awo.b(defpackage.cmh.a, z4);
                                            int iM3 = defpackage.anty.M(cbtVar2.x);
                                            defpackage.cje cjeVarAi3 = cbtVar2.ai();
                                            defpackage.cmw cmwVarM3 = defpackage.cfo.m(cavVarB, cmwVarAY2);
                                            cavVarB.v();
                                            if (cbtVar2.w) {
                                                cavVarB.j(aomyVar);
                                            } else {
                                                cavVarB.x();
                                            }
                                            defpackage.cev.c(cavVarB, cyeVarB2, aonnVar3);
                                            defpackage.cev.c(cavVarB, cjeVarAi3, aonnVar4);
                                            defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM3), aonnVar5);
                                            defpackage.cev.b(cavVarB, aonjVar);
                                            defpackage.cev.c(cavVarB, cmwVarM3, aonnVar6);
                                            if (strSubstring.length() <= 0) {
                                                cavVarB.u(1691645535);
                                                aonnVar = aonnVar6;
                                                aonnVar2 = aonnVar3;
                                                z2 = false;
                                                cbtVar = cbtVar2;
                                                i3 = 2;
                                                abew.e(new abey(strSubstring, (java.util.List) aootVar.a), (defpackage.cmw) null, (defpackage.cmw) null, 0L, (defpackage.dkz) null, 0L, false, (java.util.Map) null, (defpackage.aonn) null, (defpackage.dkz) null, cavVarB, 805306368, 0, 32254);
                                                cbtVar.W(false);
                                            } else {
                                                cavVarB.u(1691645535);
                                                aonnVar = aonnVar6;
                                                aonnVar2 = aonnVar3;
                                                z2 = false;
                                                cbtVar = cbtVar2;
                                                i3 = 2;
                                                abew.e(new abey(strSubstring, (java.util.List) aootVar.a), (defpackage.cmw) null, (defpackage.cmw) null, 0L, (defpackage.dkz) null, 0L, false, (java.util.Map) null, (defpackage.aonn) null, (defpackage.dkz) null, cavVarB, 805306368, 0, 32254);
                                                cbtVar.W(false);
                                            }
                                            z3 = true;
                                            cbtVar.W(true);
                                            cbtVar.W(z2);
                                            z8 = z2;
                                        }
                                        if (listIterator.hasNext()) {
                                            cbtVar2 = cbtVar;
                                            cmtVar = cmtVar;
                                            aonnVar3 = aonnVar2;
                                            listIterator = listIterator;
                                            aonnVar4 = aonnVar4;
                                            aonnVar6 = aonnVar;
                                            aonjVar = aonjVar;
                                            aonnVar5 = aonnVar5;
                                            aomyVar = aomyVar;
                                            str2 = str;
                                            list = list;
                                        }
                                    }
                                }
                                cbtVar.W(z2);
                                cbtVar.W(z3);
                                cbtVar.W(z2);
                                cbtVar.W(z2);
                                z6 = z2;
                                r7 = z6;
                                z5 = z3;
                                listIterator = listIterator;
                                next2 = next;
                                break;
                            default:
                                z = z5;
                                ?? r4 = r7;
                                cavVarB.u(-1121920905);
                                ((defpackage.cbt) cavVarB).W(r4);
                                r1 = r4;
                                next2 = listIterator.next();
                                ((defpackage.cbt) cavVarB).W(r1);
                                r7 = r1;
                                z5 = z;
                                listIterator = listIterator;
                                break;
                        }
                        i3 = i3;
                        str2 = str;
                    } else {
                        next2 = listIterator.next();
                        ((defpackage.cbt) cavVarB).W(r7);
                    }
                }
            }
            cdkVarI.c = slzVar;
        }
        cavVarB.s();
        cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            slzVar = new defpackage.slz(str, list, i, 15, null);
            cdkVarI.c = slzVar;
        }
    }

    public static float br(float f, float f2, float f3, float f4, float f5, defpackage.ajh ajhVar) {
        defpackage.aooh.f(ajhVar, "easing");
        if (f4 == f5) {
            throw new java.lang.IllegalArgumentException("Progress range cannot be 0 (min == max == " + f4 + ')');
        }
        if (f3 <= f4) {
            return f;
        }
        if (f3 >= f5) {
            return f2;
        }
        return f + ((f2 - f) * ajhVar.a((f3 - f4) / (f5 - f4)));
    }

    public static /* synthetic */ float bs(float f, float f2, float f3, float f4, int i) {
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        return br(0.0f, f, f2, f3, f4, defpackage.ajk.d);
    }

    public static void bt(defpackage.cyb cybVar, java.lang.Object obj, abef abefVar, defpackage.agf agfVar, defpackage.agg aggVar, afk afkVar, defpackage.aono aonoVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.aooh.f(cybVar, "<this>");
        defpackage.aooh.f(obj, "key");
        defpackage.aooh.f(abefVar, "item");
        defpackage.aooh.f(aonoVar, "content");
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(36151248);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? cavVarB.B(cybVar) : cavVarB.D(cybVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.D(obj) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.B(abefVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.B(agfVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cavVarB.B(aggVar) ? 8192 : 16384;
        }
        if ((i & 196608) == 0) {
            i2 |= true != ((262144 & i) == 0 ? cavVarB.B(afkVar) : cavVarB.D(afkVar)) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != cavVarB.D(aonoVar) ? 524288 : 1048576;
        }
        if (cavVarB.H((599187 & i2) != 599186, i2 & 1)) {
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            cbtVar.Z(-127, null, 0, null);
            if ((i & 1) != 0 && !cavVarB.E()) {
                cavVarB.s();
            }
            cavVarB.l();
            cbtVar.Z(381619672, obj, 0, null);
            defpackage.akc akcVar = abefVar.b;
            defpackage.cmw cmwVarA = defpackage.cmw.c;
            if (akcVar.g()) {
                cmwVarA = new afh(cybVar, afkVar, new aem(1)).a(cmwVarA).a(new afh(cybVar, afkVar, new aem(0)));
            }
            abek abekVar = new abek(((java.lang.Boolean) akcVar.a()).booleanValue(), ((java.lang.Boolean) akcVar.b()).booleanValue());
            defpackage.aooh.f(cmwVarA, "<this>");
            int i4 = i2 >> 3;
            defpackage.den.bx(akcVar, cmwVarA.a(new abel(abekVar)), agfVar, aggVar, null, defpackage.cfo.j(1339245717, new bli(aonoVar, abefVar, 11, (byte[]) null), cavVarB), cavVarB, (i4 & 896) | 196608 | (i4 & 7168), 16);
            cbtVar.W(false);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.ciy(cybVar, obj, abefVar, agfVar, aggVar, afkVar, aonoVar, i, 5);
        }
    }

    public static void bu(java.util.List list, defpackage.aonj aonjVar, defpackage.cmw cmwVar, defpackage.agf agfVar, defpackage.agg aggVar, afk afkVar, defpackage.aono aonoVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.agf agfVar2;
        afk afkVar2;
        afk afkVar3;
        defpackage.aooh.f(list, "items");
        defpackage.aooh.f(aonjVar, "key");
        defpackage.aooh.f(aonoVar, "itemContent");
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1004782111);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? cavVarB.B(list) : cavVarB.D(list)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.D(aonjVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            agfVar2 = agfVar;
            i2 |= true != cavVarB.B(agfVar2) ? 1024 : 2048;
        } else {
            agfVar2 = agfVar;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cavVarB.B(aggVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != cavVarB.y(8.0f) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != cavVarB.D(aonoVar) ? 4194304 : 8388608;
        }
        if (cavVarB.H((4793491 & i2) != 4793490, i2 & 1)) {
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            cbtVar.Z(-127, null, 0, null);
            if ((i & 1) == 0 || cavVarB.E()) {
                afkVar3 = abeh.a;
            } else {
                cavVarB.s();
                afkVar3 = afkVar;
            }
            cavVarB.l();
            defpackage.aooh.f(list, "items");
            defpackage.aooh.f(aonjVar, "key");
            java.lang.Object objR = cbtVar.R();
            java.lang.Object obj = defpackage.cau.a;
            if (objR == obj) {
                objR = new afpl(list, aonjVar);
                cbtVar.ab(objR);
            }
            afpl afplVar = (afpl) objR;
            boolean zD = cavVarB.D(afplVar) | ((((i2 & 14) ^ 6) > 4 && cavVarB.D(list)) || (i2 & 6) == 4);
            java.lang.Object objR2 = cbtVar.R();
            if (zD || objR2 == obj) {
                objR2 = new abei(afplVar, list, (defpackage.aoln) null);
                cbtVar.ab(objR2);
            }
            defpackage.cbp.g(list, (defpackage.aonn) objR2, cavVarB);
            defpackage.aomy aomyVar = ((defpackage.abnc) cavVarB.e(defpackage.abnd.a)).a;
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            bool.booleanValue();
            boolean zC = cavVarB.C(false) | cavVarB.D(afplVar);
            java.lang.Object objR3 = cbtVar.R();
            if (zC || objR3 == obj) {
                objR3 = new zqs(afplVar, (defpackage.aoln) null, 15);
                cbtVar.ab(objR3);
            }
            defpackage.cbp.f(afplVar, bool, (defpackage.aonn) objR3, cavVarB);
            int i4 = i2 & 3670016;
            java.lang.Object objR4 = cbtVar.R();
            if (i4 == 1048576 || objR4 == obj) {
                objR4 = new bgg(5);
                cbtVar.ab(objR4);
            }
            defpackage.cye cyeVar = (defpackage.cye) objR4;
            int iM = defpackage.anty.M(cbtVar.x);
            defpackage.cje cjeVarAi = cbtVar.ai();
            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmwVar);
            defpackage.aomy aomyVar2 = defpackage.dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar2);
            } else {
                cavVarB.x();
            }
            defpackage.cev.c(cavVarB, cyeVar, defpackage.dam.e);
            defpackage.cev.c(cavVarB, cjeVarAi, defpackage.dam.d);
            defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM), defpackage.dam.f);
            defpackage.cev.b(cavVarB, defpackage.dam.g);
            defpackage.cev.c(cavVarB, cmwVarM, defpackage.dam.c);
            afk afkVar4 = afkVar3;
            defpackage.den.A(defpackage.cfo.j(1431982121, new afnc(afplVar, aonjVar, agfVar2, aggVar, afkVar4, aonoVar, 1), cavVarB), cavVarB, 6);
            cbtVar.W(true);
            afkVar2 = afkVar4;
        } else {
            cavVarB.s();
            afkVar2 = afkVar;
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.ciy(list, aonjVar, cmwVar, agfVar, aggVar, afkVar2, aonoVar, i, 4);
        }
    }

    public static boolean bv(int i, int i2, java.util.List list, defpackage.aonj aonjVar, java.util.List list2) {
        return defpackage.aooh.n(aonjVar.a(((abef) list.get(i)).a), aonjVar.a(list2.get(i2)));
    }

    public static void bw(aogy aogyVar) {
        java.lang.Float fValueOf = java.lang.Float.valueOf(0.0f);
        aogyVar.o(fValueOf, 0.0f);
        defpackage.aopo aopoVarB = defpackage.aooc.B(defpackage.aooc.C(1, 40), 2);
        int i = aopoVarB.a;
        int i2 = aopoVarB.b;
        int i3 = aopoVarB.c;
        int i4 = 0;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (true) {
                int i5 = i4 + 1;
                aogyVar.o(java.lang.Float.valueOf(i4 % 2 == 0 ? 10.0f : -10.0f), i / 40.0f);
                if (i == i2) {
                    break;
                }
                i += i3;
                i4 = i5;
            }
        }
        aogyVar.o(fValueOf, 1.0f);
    }

    public static void bx(int i, int i2, int i3, int i4, boolean z, int[] iArr) {
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = i3;
        iArr[3] = i4;
        iArr[4] = z ? 1 : 0;
    }

    public static void by(int[] iArr, int i, int i2) {
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
    }

    public static void bz(java.lang.Object obj, defpackage.agf agfVar, defpackage.agg aggVar, java.lang.String str, defpackage.aonp aonpVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.agf agfVar2;
        defpackage.agg aggVar2;
        java.lang.Object obj2;
        defpackage.aonp aonpVar2;
        java.lang.String str2;
        defpackage.aooh.f(aonpVar, "content");
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(785192790);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? cavVarB.B(obj) : cavVarB.D(obj)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? cavVarB.B(null) : cavVarB.D(null)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            agfVar2 = agfVar;
            i2 |= true != cavVarB.B(agfVar2) ? 128 : 256;
        } else {
            agfVar2 = agfVar;
        }
        if ((i & 3072) == 0) {
            aggVar2 = aggVar;
            i2 |= true != cavVarB.B(aggVar2) ? 1024 : 2048;
        } else {
            aggVar2 = aggVar;
        }
        int i4 = i2 | 24576;
        if ((i & 196608) == 0) {
            i4 |= true != cavVarB.D(aonpVar) ? 65536 : 131072;
        }
        if (cavVarB.H((74899 & i4) != 74898, i4 & 1)) {
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            java.lang.Object obj3 = defpackage.cau.a;
            if (objR == obj3) {
                objR = new defpackage.xp();
                cbtVar.ab(objR);
            }
            defpackage.xp xpVar = (defpackage.xp) objR;
            if (xpVar.a == null) {
                cavVarB.u(1286962531);
                cavVarB.u(1286986091);
                aonpVar.a(null, obj, cavVarB, java.lang.Integer.valueOf(((i4 & 8) << 3) | 6 | ((i4 << 3) & 112) | ((i4 >> 9) & 896)));
                cbtVar.W(false);
                cbtVar.W(false);
                defpackage.cdk cdkVarI = cavVarB.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new alh(obj, agfVar2, aggVar2, aonpVar, i, 15);
                    return;
                }
                return;
            }
            obj2 = obj;
            aonpVar2 = aonpVar;
            cavVarB.u(1287032684);
            cbtVar.W(false);
            xpVar.a = obj2;
            cavVarB.u(1287229379);
            cbtVar.W(false);
            java.lang.Object objR2 = cbtVar.R();
            if (objR2 == obj3) {
                objR2 = new defpackage.akc(java.lang.Boolean.TRUE);
                cbtVar.ab(objR2);
            }
            defpackage.akc akcVar = (defpackage.akc) objR2;
            j$.util.Objects.checkIndex(0, 3);
            akcVar.f(java.lang.Boolean.TRUE);
            defpackage.den.bx(akcVar, null, agfVar, aggVar, "AnimatedVisibilityAfterInitialComposition", defpackage.cfo.j(443157886, new bli(xpVar, aonpVar2, 10), cavVarB), cavVarB, (i4 & 896) | 196608 | (i4 & 7168) | (i4 & 57344), 2);
            str2 = "AnimatedVisibilityAfterInitialComposition";
        } else {
            obj2 = obj;
            aonpVar2 = aonpVar;
            cavVarB.s();
            str2 = str;
        }
        defpackage.cdk cdkVarI2 = cavVarB.I();
        if (cdkVarI2 != null) {
            cdkVarI2.c = new alh(obj2, agfVar, aggVar, str2, aonpVar2, i, 16);
        }
    }

    public static double c(double d) {
        double d2 = d % 360.0d;
        return d2 < 0.0d ? d2 + 360.0d : d2;
    }

    public static /* synthetic */ java.lang.Boolean cA(defpackage.mce mceVar, java.lang.Boolean bool) {
        if (mceVar == null) {
            defpackage.aooh.i("<unused var>");
        }
        if (bool == null) {
            defpackage.aooh.i("<unused var>");
        }
        return java.lang.Boolean.FALSE;
    }

    public static /* synthetic */ defpackage.rmx cB(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return defpackage.rmx.BEESLY_CALENDAR_CALL_ACTION_CLICKED;
        }
        if (i2 != 1) {
            return i2 != 2 ? defpackage.rmx.BEESLY_CALL_PERSON_CALL_ACTION_CLICKED : defpackage.rmx.BEESLY_ADD_CONTACT_CALL_ACTION_CLICKED;
        }
        return defpackage.rmx.BEESLY_REMINDER_CALL_ACTION_CLICKED;
    }

    public static /* synthetic */ defpackage.rmx cC(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return defpackage.rmx.BEESLY_CALENDAR_CALL_ACTION_DISPLAYED;
        }
        if (i2 != 1) {
            return i2 != 2 ? defpackage.rmx.BEESLY_CALL_PERSON_CALL_ACTION_DISPLAYED : defpackage.rmx.BEESLY_ADD_CONTACT_CALL_ACTION_DISPLAYED;
        }
        return defpackage.rmx.BEESLY_REMINDER_CALL_ACTION_DISPLAYED;
    }

    public static /* synthetic */ defpackage.rmx cD(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return defpackage.rmx.BEESLY_GOOGLE_CALENDAR_APP_LAUNCHED;
        }
        if (i2 == 1) {
            return defpackage.rmx.BEESLY_CALENDAR_APP_LAUNCHED;
        }
        if (i2 != 2) {
            return i2 != 3 ? defpackage.rmx.BEESLY_CALL_PERSON_DIALER_APP_LAUNCHED : defpackage.rmx.BEESLY_ADD_CONTACT_CONTACTS_APP_LAUNCHED;
        }
        return defpackage.rmx.BEESLY_REMINDER_REMINDER_APP_LAUNCHED;
    }

    public static /* synthetic */ defpackage.rmx cE(int i) {
        int i2 = i - 1;
        if (i2 != 0) {
            return i2 != 1 ? defpackage.rmx.BEESLY_CONTACTS_APP_MISSING : defpackage.rmx.BEESLY_REMINDER_APP_MISSING;
        }
        return defpackage.rmx.BEESLY_CALENDAR_APP_MISSING;
    }

    public static void cG(java.lang.RuntimeException runtimeException, abcv abcvVar, java.lang.String str) {
        defpackage.zvj zvjVar = abcvVar.a;
        if (zvjVar != defpackage.zvj.STARTUP && zvjVar != defpackage.zvj.TELEDOCTOR) {
            throw runtimeException;
        }
        try {
            android.util.Log.e("ExceptionUtil", defpackage.a.bx(str, "RuntimeException while safely performing function: "), runtimeException);
        } catch (java.lang.RuntimeException unused) {
        }
    }

    public static defpackage.ajcq cH(java.util.concurrent.Callable callable) {
        defpackage.ajcr ajcrVar = new defpackage.ajcr(callable);
        new java.lang.Thread(ajcrVar).start();
        return ajcrVar;
    }

    public static com.google.android.libraries.abuse.hades.tartarus.core.C cI(ajyu ajyuVar) {
        defpackage.aooh.f(ajyuVar, "<this>");
        java.nio.ByteBuffer byteBuffer = ajyuVar.b;
        defpackage.aooh.e(byteBuffer, "getByteBuffer(...)");
        return new com.google.android.libraries.abuse.hades.tartarus.core.C(byteBuffer, ajyuVar.a);
    }

    public static /* synthetic */ defpackage.zjm cJ(defpackage.aoin aoinVar) {
        if (aoinVar == null) {
            defpackage.aooh.i("provider");
        }
        return new defpackage.zjm(aoinVar, (defpackage.zcs) new defpackage.vkc(2));
    }

    public static /* synthetic */ defpackage.zjm cK(defpackage.aoin aoinVar) {
        if (aoinVar == null) {
            defpackage.aooh.i("listener");
        }
        return new defpackage.zjm(aoinVar, (defpackage.zcs) new defpackage.vkc(2));
    }

    public static /* synthetic */ defpackage.zjm cL(defpackage.aoin aoinVar) {
        if (aoinVar == null) {
            defpackage.aooh.i("integration");
        }
        return new defpackage.zjm(aoinVar, (defpackage.zcs) new defpackage.vkc(2));
    }

    public static /* synthetic */ defpackage.zjm cM(j$.util.Optional optional, j$.util.Optional optional2) {
        if (optional == null) {
            defpackage.aooh.i("optionalFeature");
        }
        if (optional2 == null) {
            defpackage.aooh.i("featureEnabledFn");
        }
        return new defpackage.zjm(optional, optional2);
    }

    public static void cN() {
        com.google.android.libraries.abuse.hades.tartarus.core.D.a.a();
    }

    public static android.net.Uri cO(java.lang.String str) {
        android.net.Uri uri = android.net.Uri.parse("content://com.google.android.safetycore/phone/".concat(str));
        defpackage.aooh.e(uri, "parse(...)");
        return uri;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void cP(java.lang.Object obj) throws java.lang.Exception {
        if (obj instanceof java.lang.AutoCloseable) {
            obj.close();
            return;
        }
        if (obj instanceof java.util.concurrent.ExecutorService) {
            defpackage.anty.aj((java.util.concurrent.ExecutorService) obj);
            return;
        }
        if (obj instanceof android.content.res.TypedArray) {
            ((android.content.res.TypedArray) obj).recycle();
            return;
        }
        if (obj instanceof android.media.MediaMetadataRetriever) {
            ((android.media.MediaMetadataRetriever) obj).release();
        } else if (obj instanceof android.drm.DrmManagerClient) {
            ((android.drm.DrmManagerClient) obj).release();
        } else {
            if (!(obj instanceof android.content.ContentProviderClient)) {
                throw new java.lang.IllegalArgumentException();
            }
            ((android.content.ContentProviderClient) obj).release();
        }
    }

    public static int cQ(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 501) {
            return 602;
        }
        switch (i) {
            case 2:
                return 102;
            case 3:
                return 103;
            case 4:
                return 104;
            case 5:
                return 105;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return 106;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return 107;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return 108;
            case 9:
                return 109;
            case 10:
                return 110;
            case 11:
                return 111;
            case 12:
                return 112;
            case 13:
                return 113;
            case 14:
                return 114;
            case 15:
                return 115;
            case 16:
                return 116;
            case 17:
                return 117;
            case 18:
                return 118;
            default:
                switch (i) {
                    case 20:
                        return 119;
                    case 21:
                        return 122;
                    case 22:
                        return 123;
                    case 23:
                        return 124;
                    case 24:
                        return 125;
                    case 25:
                        return 126;
                    case 26:
                        return 121;
                    case 27:
                        return 127;
                    case 28:
                        return 128;
                    case 29:
                        return 120;
                    case 30:
                        return 129;
                    case 31:
                        return 130;
                    case 32:
                        return 133;
                    case 33:
                        return 131;
                    case 34:
                        return 132;
                    case 35:
                        return 134;
                    case 36:
                        return 135;
                    case 37:
                        return 136;
                    default:
                        switch (i) {
                            case 601:
                                return 702;
                            case 602:
                                return 703;
                            case 603:
                                return 704;
                            case 604:
                                return 705;
                            case 605:
                                return 706;
                            case 606:
                                return 707;
                            case 607:
                                return 708;
                            default:
                                return 1;
                        }
                }
        }
    }

    public static int cR(ajyu ajyuVar) {
        int iH = ajyuVar.h(4);
        byte b = iH != 0 ? ajyuVar.b.get(iH + ajyuVar.a) : (byte) 0;
        int i = 1;
        if (b != 0) {
            if (b != 2) {
                int i2 = 18;
                if (b == 18) {
                    return 19;
                }
                if (b != 17) {
                    if (b == 3) {
                        return 4;
                    }
                    i2 = 5;
                    if (b != 4) {
                        if (b == 1) {
                            return 2;
                        }
                        if (b == 5) {
                            return 6;
                        }
                        i = 7;
                        if (b != 6) {
                            if (b == 7) {
                                return 8;
                            }
                            i = 9;
                            if (b != 8) {
                                if (b == 9) {
                                    return 10;
                                }
                                i = 11;
                                if (b != 10) {
                                    if (b == 11) {
                                        return 12;
                                    }
                                    i = 13;
                                    if (b != 12) {
                                        if (b == 13) {
                                            return 14;
                                        }
                                        i = 15;
                                        if (b != 14) {
                                            if (b == 15) {
                                                return 16;
                                            }
                                            if (b == 16) {
                                                return 17;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return i2;
            }
            return 3;
        }
        return i;
    }

    public static /* synthetic */ vaa cS(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new vaa(akzxVar);
    }

    public static void cU(android.content.Context context, defpackage.ahyn ahynVar, acvu acvuVar, defpackage.aogc aogcVar) {
        android.net.Uri uriAn = an(context, ahynVar, acvuVar);
        if (aogcVar.R(uriAn)) {
            affs affsVar = new affs();
            affsVar.a = true;
        }
    }

    public static synchronized defpackage.ahbz cV(defpackage.aogc aogcVar, java.util.concurrent.Executor executor) {
        if (a == null) {
            defpackage.afhj afhjVar = defpackage.afhj.a;
            java.util.HashMap map = new java.util.HashMap();
            defpackage.agab.ag(defpackage.afha.a, map);
            a = new defpackage.ahbz(executor, aogcVar, afhjVar, map);
        }
        return a;
    }

    private static java.util.List cW(java.util.List list, int i) {
        return list.subList(0, java.lang.Math.min(list.size(), i));
    }

    private static aggh cX(org.xmlpull.v1.XmlPullParser xmlPullParser, android.content.Context context) {
        int next;
        android.util.AttributeSet attributeSetAsAttributeSet = android.util.Xml.asAttributeSet(xmlPullParser);
        do {
            try {
                next = xmlPullParser.next();
                if (next == 2) {
                    if (xmlPullParser.getName().equals("FooterButton")) {
                        return new aggh(context, attributeSetAsAttributeSet);
                    }
                    throw new android.view.InflateException(xmlPullParser.getPositionDescription() + ": not a FooterButton");
                }
            } catch (java.io.IOException e) {
                throw new android.view.InflateException(xmlPullParser.getPositionDescription() + ": " + e.getMessage(), e);
            } catch (org.xmlpull.v1.XmlPullParserException e2) {
                throw new android.view.InflateException(e2.getMessage(), e2);
            }
        } while (next != 1);
        throw new android.view.InflateException(xmlPullParser.getPositionDescription() + ": No start tag found!");
    }

    private static int[] cY(com.google.android.material.textfield.TextInputLayout textInputLayout, com.google.android.material.internal.CheckableImageButton checkableImageButton) {
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int length2 = drawableState2.length;
        int[] iArrCopyOf = java.util.Arrays.copyOf(drawableState, length + length2);
        java.lang.System.arraycopy(drawableState2, 0, iArrCopyOf, length, length2);
        return iArrCopyOf;
    }

    private static void cZ(com.google.android.material.internal.CheckableImageButton checkableImageButton) {
        boolean zHasOnClickListeners = checkableImageButton.hasOnClickListeners();
        checkableImageButton.setFocusable(zHasOnClickListeners);
        checkableImageButton.setClickable(zHasOnClickListeners);
        checkableImageButton.c = zHasOnClickListeners;
        checkableImageButton.setLongClickable(false);
        checkableImageButton.setImportantForAccessibility(true != zHasOnClickListeners ? 2 : 1);
    }

    public static /* synthetic */ boolean ca(defpackage.aoin aoinVar) {
        java.lang.Object objA = aoinVar.a();
        defpackage.aooh.e(objA, "get(...)");
        return ((java.lang.Boolean) objA).booleanValue();
    }

    public static /* synthetic */ defpackage.ajcq cb() {
        defpackage.akzx akzxVarM = ruy.a.m();
        rux ruxVar = rux.a;
        akzxVarM.u();
        ruy ruyVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(ruxVar);
        ruyVar.c = ruxVar;
        ruyVar.b = 2;
        return defpackage.aiql.z(akzxVarM.r());
    }

    public static /* synthetic */ defpackage.aojh cc(defpackage.diq diqVar) {
        defpackage.aooh.f(diqVar, "$this$semantics");
        defpackage.dfb.g(diqVar);
        return defpackage.aojh.a;
    }

    public static /* synthetic */ defpackage.aojh cd(defpackage.aono aonoVar, afe afeVar, defpackage.cav cavVar, int i) {
        defpackage.aooh.f(afeVar, "$this$AnimatedVisibility");
        if ((i & 6) == 0) {
            i |= true != ((i & 8) == 0 ? cavVar.B(afeVar) : cavVar.D(afeVar)) ? 2 : 4;
        }
        if (cavVar.H((i & 19) != 18, i & 1)) {
            aonoVar.a(afeVar, cavVar, java.lang.Integer.valueOf(i & 14));
        } else {
            cavVar.s();
        }
        return defpackage.aojh.a;
    }

    public static /* synthetic */ defpackage.ccp ce() {
        return new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, defpackage.cdu.c);
    }

    public static /* synthetic */ boolean cf(defpackage.kiu kiuVar) {
        defpackage.aooh.f(kiuVar, "<this>");
        kiw kiwVar = kiuVar.r;
        if (kiwVar == null) {
            kiwVar = kiw.a;
        }
        defpackage.rmt rmtVarB = defpackage.rmt.b(kiwVar.o);
        if (rmtVarB == null) {
            rmtVarB = defpackage.rmt.UNKNOWN_SOURCE_TYPE;
        }
        return rmtVarB == defpackage.rmt.UNKNOWN_SOURCE_TYPE;
    }

    public static /* synthetic */ boolean cg(defpackage.kiu kiuVar) {
        defpackage.aooh.f(kiuVar, "<this>");
        return kiuVar.i == 1;
    }

    public static /* synthetic */ boolean ch(defpackage.tkk tkkVar) {
        if (tkkVar == null) {
            defpackage.aooh.i("<this>");
        }
        return tkkVar.a();
    }

    public static /* synthetic */ defpackage.ajcq cj() {
        hgw hgwVarBu = defpackage.pez.bu(ruy.a.m());
        hgwVarBu.A(defpackage.pez.bt(ruw.a.m()).y());
        return defpackage.aiql.z(hgwVarBu.z());
    }

    public static /* synthetic */ defpackage.aojh ck(defpackage.cav cavVar, int i) {
        if (cavVar.H((i & 3) != 2, i & 1)) {
            defpackage.aaoo.W(defpackage.aehj.aL(abja.v, cavVar), defpackage.dfa.f(2132017490, cavVar), null, 0L, cavVar, 0, 12);
        } else {
            cavVar.s();
        }
        return defpackage.aojh.a;
    }

    public static /* synthetic */ boolean cl(char c) {
        if (c >= '!' && c < 'A') {
            return true;
        }
        if (c < '[' || c >= 'a') {
            return c >= '{' && c < 127;
        }
        return true;
    }

    public static /* synthetic */ int[] cm(android.content.Context context) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{2130968642});
        try {
            return context.getResources().getIntArray(typedArrayObtainStyledAttributes.getResourceId(0, 2130903044));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static /* synthetic */ int[] cn(android.content.Context context) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{2130968641});
        try {
            return context.getResources().getIntArray(typedArrayObtainStyledAttributes.getResourceId(0, 2130903042));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static /* synthetic */ qzp co(defpackage.aoin aoinVar, rfa rfaVar) {
        if (((qcr) aoinVar.a()).b()) {
            return qzp.b;
        }
        return rfaVar.d.get() ? qzp.a : qzp.c;
    }

    public static /* synthetic */ defpackage.aojh cp(defpackage.diq diqVar) {
        if (diqVar == null) {
            defpackage.aooh.i("$this$semantics");
        }
        diqVar.a(defpackage.dio.a, java.lang.Boolean.TRUE);
        return defpackage.aojh.a;
    }

    public static /* synthetic */ void cq(afqy afqyVar) {
        android.view.View viewFindViewById = afqyVar.findViewById(2131427944);
        if (viewFindViewById != null) {
            com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehaviorH = com.google.android.material.bottomsheet.BottomSheetBehavior.h(viewFindViewById);
            defpackage.aooh.e(bottomSheetBehaviorH, "from(...)");
            bottomSheetBehaviorH.t(3);
        }
    }

    public static /* synthetic */ java.lang.CharSequence cr(java.lang.CharSequence charSequence) {
        java.lang.String string = charSequence.toString();
        if (string.isEmpty()) {
            return string;
        }
        return java.lang.String.valueOf(java.lang.String.valueOf(string.charAt(0)).toUpperCase(java.util.Locale.getDefault())).concat(java.lang.String.valueOf(string.substring(1).toLowerCase(java.util.Locale.getDefault())));
    }

    public static /* synthetic */ boolean cs(char c) {
        java.lang.Character.UnicodeBlock unicodeBlockOf = java.lang.Character.UnicodeBlock.of(c);
        return defpackage.aooh.n(unicodeBlockOf, java.lang.Character.UnicodeBlock.GENERAL_PUNCTUATION) || defpackage.aooh.n(unicodeBlockOf, java.lang.Character.UnicodeBlock.MATHEMATICAL_OPERATORS) || defpackage.aooh.n(unicodeBlockOf, java.lang.Character.UnicodeBlock.HIGH_SURROGATES) || defpackage.aooh.n(unicodeBlockOf, java.lang.Character.UnicodeBlock.LOW_SURROGATES) || defpackage.aooh.n(unicodeBlockOf, java.lang.Character.UnicodeBlock.ARROWS) || defpackage.aooh.n(unicodeBlockOf, java.lang.Character.UnicodeBlock.MISCELLANEOUS_TECHNICAL) || defpackage.aooh.n(unicodeBlockOf, java.lang.Character.UnicodeBlock.ENCLOSED_ALPHANUMERICS) || defpackage.aooh.n(unicodeBlockOf, java.lang.Character.UnicodeBlock.GEOMETRIC_SHAPES) || defpackage.aooh.n(unicodeBlockOf, java.lang.Character.UnicodeBlock.MISCELLANEOUS_SYMBOLS) || defpackage.aooh.n(unicodeBlockOf, java.lang.Character.UnicodeBlock.DINGBATS) || defpackage.aooh.n(unicodeBlockOf, java.lang.Character.UnicodeBlock.MISCELLANEOUS_SYMBOLS_AND_ARROWS) || defpackage.aooh.n(unicodeBlockOf, java.lang.Character.UnicodeBlock.VARIATION_SELECTORS);
    }

    public static /* synthetic */ defpackage.aigf ct(java.util.List list) {
        defpackage.aigb aigbVar = new defpackage.aigb(4);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            aigbVar.l((java.util.Map) defpackage.aiql.H((defpackage.ajcq) it.next()));
        }
        return aigbVar.e(true);
    }

    public static /* synthetic */ java.lang.String cu(nmz nmzVar) {
        if (nmzVar instanceof nmx) {
            return ((nmx) nmzVar).a;
        }
        if (nmzVar instanceof nmy) {
            return ((nmy) nmzVar).a;
        }
        if (defpackage.aooh.n(nmzVar, nmw.a)) {
            return null;
        }
        throw new defpackage.aois();
    }

    public static /* synthetic */ boolean cv(defpackage.mnk mnkVar) {
        defpackage.aooh.f(mnkVar, "<this>");
        return mnkVar.a();
    }

    public static /* synthetic */ boolean cw(defpackage.mnk mnkVar, defpackage.mnl mnlVar) {
        return mnkVar.a() && mnlVar.a() == defpackage.mnm.MODE_SUPPORTS_AUTO_AND_MANUAL_SCREENING;
    }

    public static /* synthetic */ android.net.Uri cx(abwd abwdVar) {
        java.lang.String str = abwdVar.g;
        defpackage.aooh.e(str, "getLookupUri(...)");
        if (str.length() == 0) {
            return null;
        }
        java.lang.String str2 = abwdVar.g;
        defpackage.aooh.e(str2, "getLookupUri(...)");
        android.net.Uri uri = android.net.Uri.parse(str2);
        defpackage.aooh.e(uri, "parse(...)");
        return uri;
    }

    public static /* synthetic */ java.lang.String cy(android.content.Context context, j$.util.Optional optional, j$.util.Optional optional2) {
        java.lang.String string = (java.lang.String) defpackage.aooh.q(optional);
        if (string == null) {
            string = context.getString(2132020653);
            defpackage.aooh.e(string, "getString(...)");
        }
        java.lang.String str = (java.lang.String) defpackage.aooh.q(optional2);
        return str != null ? defpackage.a.br(str, string, " • ") : string;
    }

    public static /* synthetic */ boolean cz(defpackage.mnk mnkVar, defpackage.aoin aoinVar) {
        return mnkVar.a() && ((java.lang.Boolean) aoinVar.a()).booleanValue();
    }

    public static int d(double d) {
        if (d < 0.0d) {
            return -1;
        }
        return d == 0.0d ? 0 : 1;
    }

    private static boolean da(android.content.Context context) {
        if (context == null) {
            return true;
        }
        if (context instanceof defpackage.az) {
            return !((defpackage.az) context).a().ac();
        }
        if (context instanceof android.content.ContextWrapper) {
            return da(((android.content.ContextWrapper) context).getBaseContext());
        }
        return true;
    }

    private static android.content.Context db(android.content.Context context, java.lang.Class... clsArr) {
        loop0: while (context instanceof android.content.ContextWrapper) {
            for (java.lang.Class cls : clsArr) {
                if (cls.isInstance(context)) {
                    break loop0;
                }
            }
            context = ((android.content.ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    private static defpackage.ahor dc(int i, defpackage.agab agabVar, android.util.SparseArray sparseArray) {
        return defpackage.ahou.j(agabVar, (defpackage.ahou) sparseArray.get(i, defpackage.ahot.a));
    }

    public static double e(double d, double d2) {
        if (d < 0.0d || d > 100.0d) {
            return -1.0d;
        }
        int i = afsi.c;
        double dG = defpackage.anar.g((d + 16.0d) / 116.0d) * 100.0d;
        double d3 = ((dG + 5.0d) / d2) - 5.0d;
        if (d3 < 0.0d || d3 > 100.0d) {
            return -1.0d;
        }
        double dMax = java.lang.Math.max(dG, d3);
        if (dMax != d3) {
            dG = d3;
        }
        double d4 = (dMax + 5.0d) / (dG + 5.0d);
        double dAbs = java.lang.Math.abs(d4 - d2);
        if (d4 < d2 && dAbs > 0.04d) {
            return -1.0d;
        }
        double dA = ((afsi.a(d3 / 100.0d) * 116.0d) - 16.0d) - 0.4d;
        if (dA < 0.0d || dA > 100.0d) {
            return -1.0d;
        }
        return dA;
    }

    public static double f(double d, double d2) {
        if (d < 0.0d || d > 100.0d) {
            return -1.0d;
        }
        int i = afsi.c;
        double dG = defpackage.anar.g((d + 16.0d) / 116.0d) * 100.0d;
        double d3 = ((dG + 5.0d) * d2) - 5.0d;
        if (d3 < 0.0d || d3 > 100.0d) {
            return -1.0d;
        }
        double dMax = java.lang.Math.max(d3, dG);
        if (dMax == dG) {
            dG = d3;
        }
        double d4 = (dMax + 5.0d) / (dG + 5.0d);
        double dAbs = java.lang.Math.abs(d4 - d2);
        if (d4 < d2 && dAbs > 0.04d) {
            return -1.0d;
        }
        double dA = ((afsi.a(d3 / 100.0d) * 116.0d) - 16.0d) + 0.4d;
        if (dA < 0.0d || dA > 100.0d) {
            return -1.0d;
        }
        return dA;
    }

    public static void g(defpackage.afpu afpuVar, android.view.View view) {
        android.graphics.Rect rect = new android.graphics.Rect();
        view.getDrawingRect(rect);
        afpuVar.setBounds(rect);
        afpuVar.i(view, null);
    }

    public static void h(android.animation.AnimatorSet animatorSet, java.util.List list) {
        int size = list.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            android.animation.Animator animator = (android.animation.Animator) list.get(i);
            jMax = java.lang.Math.max(jMax, animator.getStartDelay() + animator.getDuration());
        }
        android.animation.ValueAnimator valueAnimatorOfInt = android.animation.ValueAnimator.ofInt(0, 0);
        valueAnimatorOfInt.setDuration(jMax);
        list.add(0, valueAnimatorOfInt);
        animatorSet.playTogether(list);
    }

    public static afou i(afoe afoeVar) {
        java.util.List list = afoeVar.a;
        java.util.List listCW = cW(list, 7);
        afor aforVar = new afor(listCW);
        boolean z = true;
        if (listCW.size() >= list.size() && !afoeVar.b) {
            z = false;
        }
        return new afou(aforVar, z, afoeVar.c);
    }

    public static afou j(afoe afoeVar, int i, afon afonVar) {
        boolean z;
        defpackage.aift aiftVar = new defpackage.aift(4);
        java.util.List list = afoeVar.a;
        java.util.Iterator it = list.iterator();
        while (true) {
            z = true;
            z = true;
            if (!it.hasNext()) {
                break;
            }
            akmc akmcVar = (akmc) it.next();
            int iAQ = defpackage.a.aQ(akmcVar.e);
            if ((iAQ != 0 ? iAQ : 1) == 2) {
                aiftVar.i(akmcVar);
            }
        }
        defpackage.aify aifyVarH = aiftVar.g();
        defpackage.aooh.e(aifyVarH, "build(...)");
        java.util.List listCW = cW(aifyVarH, i);
        afot afotVarA = afonVar.a(listCW);
        if (listCW.size() >= list.size() && !afoeVar.b) {
            z = false;
        }
        return new afou(afotVarA, z, afoeVar.c);
    }

    public static afoe k() {
        defpackage.aify aifyVar = defpackage.aike.a;
        defpackage.aooh.e(aifyVar, "of(...)");
        defpackage.aooh.e(aifyVar, "of(...)");
        return new afoe(aifyVar, 0, false, aifyVar);
    }

    public static afoe l(defpackage.aify aifyVar, boolean z, defpackage.aify aifyVar2) {
        defpackage.aooh.f(aifyVar, "items");
        defpackage.aooh.f(aifyVar2, "eventLogs");
        return new afoe(aifyVar, 0, z, aifyVar2);
    }

    public static afoe m(defpackage.aify aifyVar, int i, defpackage.aify aifyVar2) {
        defpackage.aooh.f(aifyVar, "items");
        defpackage.aooh.f(aifyVar2, "eventLogs");
        return new afoe(aifyVar, i, true, aifyVar2);
    }

    public static int n(android.content.Context context, int i) {
        return (int) android.util.TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static boolean o() {
        return android.os.Build.VERSION.SDK_INT >= 33;
    }

    public static boolean p() {
        return android.os.Build.VERSION.SDK_INT >= 35;
    }

    public static aggh q(int i, android.content.Context context) {
        android.content.res.XmlResourceParser xml = context.getResources().getXml(i);
        try {
            return cX(xml, context);
        } finally {
            xml.close();
        }
    }

    public static /* synthetic */ java.lang.String r(int i) {
        switch (i) {
            case 1:
                return "NOT_STARTED";
            case 2:
                return "BIND_FAILED";
            case 3:
                return "BINDING";
            case 4:
                return "CONNECTED";
            case 5:
                return "DISCONNECTED";
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return "SERVICE_NOT_USABLE";
            default:
                return "REBIND_REQUIRED";
        }
    }

    public static void s(boolean z, java.lang.String str) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(str);
        }
    }

    public static void t(java.lang.String str) {
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            throw new java.lang.IllegalStateException(str.concat(" must be called from the UI thread."));
        }
    }

    public static java.lang.String u(byte[] bArr) {
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            return android.util.Base64.encodeToString(messageDigest.digest(), 11);
        } catch (java.security.NoSuchAlgorithmException unused) {
            return "";
        }
    }

    public static ageo v(android.content.Context context) {
        android.content.Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return new ageo(new ager(context));
    }

    public static android.widget.ImageView.ScaleType w(int i) {
        if (i == 0) {
            return android.widget.ImageView.ScaleType.FIT_XY;
        }
        if (i == 1) {
            return android.widget.ImageView.ScaleType.FIT_START;
        }
        if (i == 2) {
            return android.widget.ImageView.ScaleType.FIT_CENTER;
        }
        if (i == 3) {
            return android.widget.ImageView.ScaleType.FIT_END;
        }
        if (i != 5) {
            return i != 6 ? android.widget.ImageView.ScaleType.CENTER : android.widget.ImageView.ScaleType.CENTER_INSIDE;
        }
        return android.widget.ImageView.ScaleType.CENTER_CROP;
    }

    public static void x(com.google.android.material.textfield.TextInputLayout textInputLayout, com.google.android.material.internal.CheckableImageButton checkableImageButton, android.content.res.ColorStateList colorStateList, android.graphics.PorterDuff.Mode mode) {
        android.graphics.drawable.Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                drawable.setTintList(colorStateList);
            } else {
                drawable.setTintList(android.content.res.ColorStateList.valueOf(colorStateList.getColorForState(cY(textInputLayout, checkableImageButton), colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static void y(com.google.android.material.textfield.TextInputLayout textInputLayout, com.google.android.material.internal.CheckableImageButton checkableImageButton, android.content.res.ColorStateList colorStateList) {
        android.graphics.drawable.Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int colorForState = colorStateList.getColorForState(cY(textInputLayout, checkableImageButton), colorStateList.getDefaultColor());
        android.graphics.drawable.Drawable drawableMutate = drawable.mutate();
        drawableMutate.setTintList(android.content.res.ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    public static void z(com.google.android.material.internal.CheckableImageButton checkableImageButton, int i) {
        checkableImageButton.setMinimumWidth(i);
        checkableImageButton.setMinimumHeight(i);
    }

    public /* bridge */ /* synthetic */ afof a(android.accounts.Account account) {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v10, types: [afsq] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final java.lang.Object ay(akxm akxmVar, defpackage.aoss aossVar, defpackage.aoln aolnVar) throws java.lang.Throwable {
        adev adevVar;
        ?? r5;
        defpackage.aoss aossVar2;
        akxm akxmVar2 = akxmVar;
        if (aolnVar instanceof adev) {
            adevVar = (adev) aolnVar;
            int i = adevVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                adevVar.b = i - Integer.MIN_VALUE;
            } else {
                adevVar = new adev(this, aolnVar);
            }
        } else {
            adevVar = new adev(this, aolnVar);
        }
        adev adevVar2 = adevVar;
        java.lang.Object objD = adevVar2.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = adevVar2.b;
        if (i2 == 0) {
            defpackage.aooc.af(objD);
            java.lang.Object obj = akxmVar2.e;
            defpackage.dzk.x(obj);
            rj rjVar = new rj();
            java.lang.Object obj2 = akxmVar2.b;
            defpackage.dzk.x(obj2);
            if (obj2 == null) {
                r5 = obj2;
                r5 = rg.a;
            }
            r5 = obj2;
            defpackage.izg izgVar = new defpackage.izg((android.content.Context) obj, (java.util.concurrent.Executor) r5, (rf) rjVar);
            java.lang.Object obj3 = izgVar.a;
            java.util.concurrent.Executor executor = rg.a;
            android.app.appsearch.AppSearchManager appSearchManagerM = ac$.ExternalSyntheticApiModelOutline0.m(((android.content.Context) obj3).getSystemService(ac$.ExternalSyntheticApiModelOutline0.m()));
            defpackage.dsj dsjVar = new defpackage.dsj();
            ac$.ExternalSyntheticApiModelOutline0.m(appSearchManagerM, (java.util.concurrent.Executor) izgVar.c, new rh(dsjVar, izgVar, 1, (byte[]) null));
            adevVar2.d = akxmVar2;
            adevVar2.c = (defpackage.apbj) aossVar;
            adevVar2.b = 1;
            objD = defpackage.aosv.D(dsjVar, adevVar2);
            if (objD != aoluVar) {
                aossVar2 = aossVar;
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objD);
            return objD;
        }
        defpackage.apbj apbjVar = adevVar2.c;
        akxm akxmVar3 = adevVar2.d;
        defpackage.aooc.af(objD);
        aossVar2 = apbjVar;
        akxmVar2 = akxmVar3;
        qa qaVar = (qa) objD;
        defpackage.aimz aimzVar = adei.a;
        oq oqVarF = qaVar.f();
        if (!oqVarF.a("LIST_FILTER_QUERY_LANGUAGE") || !oqVarF.a("VERBATIM_SEARCH")) {
            defpackage.aooh.c(qaVar);
            adem ademVar = new adem(qaVar);
            java.lang.Object obj4 = akxmVar2.e;
            java.lang.Object obj5 = akxmVar2.a;
            defpackage.aigf aigfVar = addf.a;
            java.lang.Object obj6 = akxmVar2.c;
            return new addo(ademVar, (android.content.Context) obj4, (defpackage.xtq) obj5, (java.util.concurrent.Executor) akxmVar2.b, aossVar2);
        }
        ?? r1 = adei.k;
        defpackage.aooh.c(qaVar);
        adem ademVar2 = new adem(qaVar);
        java.lang.Object obj7 = akxmVar2.e;
        java.lang.Object obj8 = akxmVar2.a;
        addg addgVar = new addg();
        java.lang.Object obj9 = akxmVar2.c;
        ?? r6 = akxmVar2.b;
        adevVar2.d = null;
        adevVar2.c = null;
        adevVar2.b = 2;
        java.lang.Object objCT = r1.cT(ademVar2, (android.content.Context) obj7, (defpackage.xtq) obj8, addgVar, r6, aossVar2, adevVar2);
        if (objCT != aoluVar) {
            return objCT;
        }
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r7v2, types: [aolr, java.lang.Object] */
    public final java.lang.Object az(akxm akxmVar, adde addeVar, defpackage.aoln aolnVar) throws java.lang.Throwable {
        adew adewVar;
        if (aolnVar instanceof adew) {
            adewVar = (adew) aolnVar;
            int i = adewVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                adewVar.b = i - Integer.MIN_VALUE;
            } else {
                adewVar = new adew(this, aolnVar);
            }
        } else {
            adewVar = new adew(this, aolnVar);
        }
        java.lang.Object objAy = adewVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = adewVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(objAy);
            adewVar.d = akxmVar;
            adewVar.c = addeVar;
            adewVar.b = 1;
            objAy = ay(akxmVar, defpackage.aosv.n(akxmVar.d.plus(new defpackage.aovh(null))), adewVar);
            if (objAy == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            addeVar = adewVar.c;
            akxmVar = adewVar.d;
            defpackage.aooc.af(objAy);
        }
        return new adej((addb) objAy, addeVar, (java.util.concurrent.Executor) akxmVar.b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object cT(adem ademVar, android.content.Context context, defpackage.xtq xtqVar, adcz adczVar, java.util.concurrent.Executor executor, defpackage.aoss aossVar, defpackage.aoln aolnVar) {
        addp addpVar;
        if (aolnVar instanceof addp) {
            addpVar = (addp) aolnVar;
            int i = addpVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                addpVar.b = i - Integer.MIN_VALUE;
            } else {
                addpVar = new addp(this, aolnVar);
            }
        } else {
            addpVar = new addp(this, aolnVar);
        }
        java.lang.Object obj = addpVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = addpVar.b;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            adei adeiVar = addpVar.c;
            defpackage.aooc.af(obj);
            return adeiVar;
        }
        defpackage.aooc.af(obj);
        adei adeiVar2 = new adei(ademVar, context, xtqVar, adczVar, executor, aossVar);
        addpVar.c = adeiVar2;
        addpVar.b = 1;
        return adeiVar2.j(addpVar) != aoluVar ? adeiVar2 : aoluVar;
    }

    public afsq(char[] cArr) {
    }

    public afsq() {
    }

    public afsq(byte[] bArr) {
        new ahja(this, 0);
    }
}
