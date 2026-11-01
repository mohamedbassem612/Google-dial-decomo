package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adxo implements defpackage.adxm {
    private final android.content.Context a;
    private final defpackage.tvn b;

    static {
        defpackage.aiof.i("GnpSdk");
    }

    public adxo(android.content.Context context, defpackage.tvn tvnVar, defpackage.aefv aefvVar) {
        defpackage.aooh.f(context, "context");
        defpackage.aooh.f(tvnVar, "clearcutLoggerFactory");
        this.a = context;
        this.b = tvnVar;
        aefvVar.a(context);
    }

    /* JADX WARN: Code duplicated, block: B:86:0x04a0  */
    @Override // defpackage.adxm
    public final void a(adxn adxnVar) {
        defpackage.aduy aduyVarA;
        int i;
        java.lang.String strSubstring;
        defpackage.zzd zzdVarL;
        defpackage.akzx akzxVarM = akpv.a.m();
        defpackage.aooh.f(akzxVarM, "builder");
        defpackage.akzx akzxVarM2 = akpu.a.m();
        defpackage.aooh.f(akzxVarM2, "builder");
        defpackage.akzx akzxVarM3 = akpt.a.m();
        defpackage.aooh.f(akzxVarM3, "builder");
        java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(akzxVarM3.b.c);
        defpackage.aooh.e(listUnmodifiableList, "getThreadContextList(...)");
        new defpackage.alct(listUnmodifiableList);
        akzxVarM3.u();
        akpt akptVar = akzxVarM3.b;
        defpackage.alat alatVar = akptVar.c;
        if (!alatVar.c()) {
            akptVar.c = defpackage.alad.J(alatVar);
        }
        adxp adxpVar = (adxp) adxnVar;
        defpackage.akyl.i(adxpVar.l, akptVar.c);
        java.lang.String str = adxpVar.c.a;
        defpackage.aooh.e(str, "getClientId(...)");
        defpackage.aooh.f(str, "value");
        akzxVarM3.u();
        akpt akptVar2 = akzxVarM3.b;
        j$.util.Objects.requireNonNull(str);
        akptVar2.b |= 1;
        akptVar2.d = str;
        defpackage.aedq aedqVar = adxpVar.e;
        if (adxpVar.g != null || android.text.TextUtils.isEmpty(adxpVar.n)) {
            aduyVarA = adxpVar.g;
        } else {
            defpackage.adux aduxVarA = defpackage.aduy.a();
            aduxVarA.b(com.google.android.libraries.notifications.platform.registration.Zwieback.a);
            aduxVarA.f = adxpVar.n;
            aduyVarA = aduxVarA.a();
        }
        akqq akqqVarA = aedqVar.a(aduyVarA);
        defpackage.aooh.f(akqqVarA, "value");
        akzxVarM3.u();
        akpt akptVar3 = akzxVarM3.b;
        j$.util.Objects.requireNonNull(akqqVarA);
        akptVar3.i = akqqVarA;
        akptVar3.b |= 32;
        akql akqlVarB = adxpVar.f.b();
        defpackage.aooh.f(akqlVarB, "value");
        akzxVarM3.u();
        akpt akptVar4 = akzxVarM3.b;
        j$.util.Objects.requireNonNull(akqlVarB);
        akptVar4.h = akqlVarB;
        akptVar4.b |= 16;
        long j = adxpVar.m;
        akzxVarM3.u();
        akpt akptVar5 = akzxVarM3.b;
        akptVar5.b |= 256;
        akptVar5.k = j;
        akqc akqcVar = adxpVar.k;
        if (akqcVar != null) {
            defpackage.akzx akzxVarM4 = akqa.a.m();
            defpackage.aooh.f(akzxVarM4, "builder");
            akzxVarM4.u();
            akqa akqaVar = akzxVarM4.b;
            j$.util.Objects.requireNonNull(akqcVar);
            akqaVar.c = akqcVar;
            akqaVar.b |= 1;
            akqa akqaVarR = akzxVarM4.r();
            defpackage.aooh.e(akqaVarR, "build(...)");
            akqa akqaVar2 = akqaVarR;
            defpackage.aooh.f(akqaVar2, "value");
            akzxVarM3.u();
            akpt akptVar6 = akzxVarM3.b;
            j$.util.Objects.requireNonNull(akqaVar2);
            akptVar6.j = akqaVar2;
            akptVar6.b |= 64;
        }
        java.lang.String str2 = adxpVar.h;
        if (!android.text.TextUtils.isEmpty(str2)) {
            if (str2 == null) {
                throw new java.lang.IllegalStateException("Required value was null.");
            }
            aklu.b(str2, akzxVarM3);
        }
        java.lang.String str3 = adxpVar.i;
        if (!android.text.TextUtils.isEmpty(str3)) {
            if (str3 == null) {
                throw new java.lang.IllegalStateException("Required value was null.");
            }
            akzxVarM3.u();
            akpt akptVar7 = akzxVarM3.b;
            j$.util.Objects.requireNonNull(str3);
            akptVar7.b |= 4;
            akptVar7.f = str3;
        }
        java.lang.String str4 = adxpVar.j;
        if (!android.text.TextUtils.isEmpty(str4)) {
            if (str4 == null) {
                throw new java.lang.IllegalStateException("Required value was null.");
            }
            aklu.b(str4, akzxVarM3);
        }
        java.lang.Long l = adxpVar.p;
        if (l != null) {
            long jLongValue = l.longValue();
            akzxVarM3.u();
            akpt akptVar8 = akzxVarM3.b;
            akptVar8.b |= 8;
            akptVar8.g = jLongValue;
        }
        java.lang.String str5 = adxpVar.q;
        if (str5 != null && str5.length() != 0) {
            defpackage.akzx akzxVarM5 = akpr.a.m();
            defpackage.aooh.f(akzxVarM5, "builder");
            akzxVarM5.u();
            akpr akprVar = akzxVarM5.b;
            j$.util.Objects.requireNonNull(str5);
            akprVar.b |= 1;
            akprVar.c = str5;
            akpr akprVarR = akzxVarM5.r();
            defpackage.aooh.e(akprVarR, "build(...)");
            akpr akprVar2 = akprVarR;
            defpackage.aooh.f(akprVar2, "value");
            akzxVarM3.u();
            akpt akptVar9 = akzxVarM3.b;
            j$.util.Objects.requireNonNull(akprVar2);
            akptVar9.o = akprVar2;
            akptVar9.b |= 16384;
        }
        java.lang.String str6 = adxpVar.r;
        if (str6 != null && str6.length() != 0) {
            defpackage.akzx akzxVarM6 = akpq.a.m();
            defpackage.aooh.f(akzxVarM6, "builder");
            akzxVarM6.u();
            akpq akpqVar = akzxVarM6.b;
            j$.util.Objects.requireNonNull(str6);
            akpqVar.b |= 1;
            akpqVar.c = str6;
            akpq akpqVarR = akzxVarM6.r();
            defpackage.aooh.e(akpqVarR, "build(...)");
            akpq akpqVar2 = akpqVarR;
            defpackage.aooh.f(akpqVar2, "value");
            akzxVarM3.u();
            akpt akptVar10 = akzxVarM3.b;
            j$.util.Objects.requireNonNull(akpqVar2);
            akptVar10.p = akpqVar2;
            akptVar10.b |= 32768;
        }
        adtm adtmVar = adxpVar.t;
        int i2 = 3;
        if (adtmVar != null) {
            long jLongValue2 = adtmVar.a.longValue();
            akzxVarM3.u();
            akpt akptVar11 = akzxVarM3.b;
            i = 2;
            akptVar11.b |= 512;
            akptVar11.l = jLongValue2;
            int i3 = adxpVar.w;
            if ((i3 == 10 || i3 == 29 || i3 == 42 || adxpVar.x == 4) && adxpVar.y != 3) {
                defpackage.akzx akzxVarM7 = akqg.a.m();
                defpackage.aooh.f(akzxVarM7, "builder");
                long jLongValue3 = adxpVar.s - adtmVar.b.longValue();
                akzxVarM7.u();
                akqg akqgVar = akzxVarM7.b;
                akqgVar.b |= 1;
                akqgVar.c = jLongValue3;
                long jLongValue4 = adtmVar.c.longValue();
                akzxVarM7.u();
                akqg akqgVar2 = akzxVarM7.b;
                akqgVar2.b |= 2;
                akqgVar2.d = jLongValue4;
                long jLongValue5 = adtmVar.d.longValue();
                akzxVarM7.u();
                akqg akqgVar3 = akzxVarM7.b;
                akqgVar3.b |= 4;
                akqgVar3.e = jLongValue5;
                long jLongValue6 = adtmVar.e.longValue();
                akzxVarM7.u();
                akqg akqgVar4 = akzxVarM7.b;
                akqgVar4.b |= 8;
                akqgVar4.f = jLongValue6;
                long jLongValue7 = adtmVar.f.longValue();
                akzxVarM7.u();
                akqg akqgVar5 = akzxVarM7.b;
                akqgVar5.b |= 16;
                akqgVar5.g = jLongValue7;
                long jLongValue8 = adtmVar.g.longValue();
                akzxVarM7.u();
                akqg akqgVar6 = akzxVarM7.b;
                akqgVar6.b |= 32;
                akqgVar6.h = jLongValue8;
                long jLongValue9 = adtmVar.h.longValue();
                akzxVarM7.u();
                akqg akqgVar7 = akzxVarM7.b;
                akqgVar7.b |= 128;
                akqgVar7.j = jLongValue9;
                akzxVarM7.u();
                akqg akqgVar8 = akzxVarM7.b;
                akqgVar8.i = 1;
                akqgVar8.b |= 64;
                akqg akqgVarR = akzxVarM7.r();
                defpackage.aooh.e(akqgVarR, "build(...)");
                akqg akqgVar9 = akqgVarR;
                defpackage.aooh.f(akqgVar9, "value");
                akzxVarM3.u();
                akpt akptVar12 = akzxVarM3.b;
                j$.util.Objects.requireNonNull(akqgVar9);
                akptVar12.m = akqgVar9;
                akptVar12.b |= 2048;
            }
        } else {
            i = 2;
        }
        java.lang.String strValueOf = java.lang.String.valueOf(adxp.a.nextInt(1000000000));
        defpackage.aooh.f(strValueOf, "value");
        akzxVarM3.u();
        akpt akptVar13 = akzxVarM3.b;
        j$.util.Objects.requireNonNull(strValueOf);
        akptVar13.b |= 4096;
        akptVar13.n = strValueOf;
        akpt akptVarR = akzxVarM3.r();
        defpackage.aooh.e(akptVarR, "build(...)");
        akpt akptVar14 = akptVarR;
        defpackage.aooh.f(akptVar14, "value");
        akzxVarM2.u();
        akpu akpuVar = akzxVarM2.b;
        j$.util.Objects.requireNonNull(akptVar14);
        akpuVar.e = akptVar14;
        akpuVar.b |= 1;
        int i4 = adxpVar.w;
        if (i4 != 0) {
            defpackage.akzx akzxVarM8 = akqr.a.m();
            defpackage.aooh.f(akzxVarM8, "builder");
            akzxVarM8.u();
            akqr akqrVar = akzxVarM8.b;
            akqrVar.c = i4 - 1;
            akqrVar.b |= 1;
            int i5 = adxpVar.y;
            if (i5 != 0) {
                akzxVarM8.u();
                akqr akqrVar2 = akzxVarM8.b;
                akqrVar2.d = i5 - 1;
                akqrVar2.b |= 128;
            }
            akqr akqrVarR = akzxVarM8.r();
            defpackage.aooh.e(akqrVarR, "build(...)");
            akqr akqrVar3 = akqrVarR;
            defpackage.aooh.f(akqrVar3, "value");
            akzxVarM2.u();
            akpu akpuVar2 = akzxVarM2.b;
            j$.util.Objects.requireNonNull(akqrVar3);
            akpuVar2.d = akqrVar3;
            akpuVar2.c = i;
        } else {
            int i6 = adxpVar.x;
            if (i6 != 0) {
                defpackage.akzx akzxVarM9 = akqi.a.m();
                defpackage.aooh.f(akzxVarM9, "builder");
                akzxVarM9.u();
                akqi akqiVar = akzxVarM9.b;
                akqiVar.c = i6 - 1;
                akqiVar.b |= 1;
                int i7 = adxpVar.A;
                if (i7 != 0) {
                    akzxVarM9.u();
                    akqi akqiVar2 = akzxVarM9.b;
                    akqiVar2.e = i7 - 1;
                    akqiVar2.b |= 256;
                }
                java.lang.String str7 = adxpVar.o;
                if (str7 != null) {
                    akzxVarM9.u();
                    akqi akqiVar3 = akzxVarM9.b;
                    j$.util.Objects.requireNonNull(str7);
                    akqiVar3.b |= 32;
                    akqiVar3.d = str7;
                }
                akqi akqiVarR = akzxVarM9.r();
                defpackage.aooh.e(akqiVarR, "build(...)");
                akqi akqiVar4 = akqiVarR;
                defpackage.aooh.f(akqiVar4, "value");
                akzxVarM2.u();
                akpu akpuVar3 = akzxVarM2.b;
                j$.util.Objects.requireNonNull(akqiVar4);
                akpuVar3.d = akqiVar4;
                akpuVar3.c = 3;
            } else {
                int i8 = adxpVar.z;
                if (i8 != 0) {
                    defpackage.akzx akzxVarM10 = akqo.a.m();
                    defpackage.aooh.f(akzxVarM10, "builder");
                    akzxVarM10.u();
                    akqo akqoVar = akzxVarM10.b;
                    akqoVar.c = i8 - 1;
                    akqoVar.b |= 1;
                    akqo akqoVarR = akzxVarM10.r();
                    defpackage.aooh.e(akqoVarR, "build(...)");
                    akqo akqoVar2 = akqoVarR;
                    defpackage.aooh.f(akqoVar2, "value");
                    akzxVarM2.u();
                    akpu akpuVar4 = akzxVarM2.b;
                    j$.util.Objects.requireNonNull(akqoVar2);
                    akpuVar4.d = akqoVar2;
                    akpuVar4.c = 4;
                } else {
                    java.lang.Throwable cause = adxpVar.b;
                    if (cause == null) {
                        throw new java.lang.IllegalStateException("GnpLogEvent must have interactionType, failureType, systemEventType, or exception.");
                    }
                    defpackage.akzx akzxVarM11 = akpy.a.m();
                    defpackage.aooh.f(akzxVarM11, "builder");
                    while (cause != null) {
                        java.util.List listUnmodifiableList2 = j$.util.DesugarCollections.unmodifiableList(akzxVarM11.b.d);
                        defpackage.aooh.e(listUnmodifiableList2, "getJobExceptionDataList(...)");
                        new defpackage.alct(listUnmodifiableList2);
                        defpackage.akzx akzxVarM12 = akpx.a.m();
                        defpackage.aooh.f(akzxVarM12, "builder");
                        java.lang.String simpleName = cause.getClass().getSimpleName();
                        defpackage.aooh.e(simpleName, "getSimpleName(...)");
                        defpackage.aooh.f(simpleName, "value");
                        akzxVarM12.u();
                        akpx akpxVar = akzxVarM12.b;
                        j$.util.Objects.requireNonNull(simpleName);
                        akpxVar.b |= 1;
                        akpxVar.c = simpleName;
                        java.lang.String message = cause.getMessage();
                        if (message != null) {
                            strSubstring = message.substring(0, java.lang.Math.min(message.length(), 200));
                            defpackage.aooh.e(strSubstring, "substring(...)");
                            if (strSubstring == null) {
                                strSubstring = "";
                            }
                        } else {
                            strSubstring = "";
                        }
                        defpackage.aooh.f(strSubstring, "value");
                        akzxVarM12.u();
                        akpx akpxVar2 = akzxVarM12.b;
                        j$.util.Objects.requireNonNull(strSubstring);
                        akpxVar2.b |= 2;
                        akpxVar2.d = strSubstring;
                        akpx akpxVarR = akzxVarM12.r();
                        defpackage.aooh.e(akpxVarR, "build(...)");
                        akpx akpxVar3 = akpxVarR;
                        defpackage.aooh.f(akpxVar3, "value");
                        akzxVarM11.u();
                        akpy akpyVar = akzxVarM11.b;
                        j$.util.Objects.requireNonNull(akpxVar3);
                        defpackage.alat alatVar2 = akpyVar.d;
                        if (!alatVar2.c()) {
                            akpyVar.d = defpackage.alad.J(alatVar2);
                        }
                        akpyVar.d.add(akpxVar3);
                        cause = cause.getCause();
                    }
                    if (adxpVar.q != null) {
                        aklu.a(3, akzxVarM11);
                    } else if (adxpVar.r != null) {
                        aklu.a(4, akzxVarM11);
                    }
                    akpy akpyVarR = akzxVarM11.r();
                    defpackage.aooh.e(akpyVarR, "build(...)");
                    akpy akpyVar2 = akpyVarR;
                    defpackage.aooh.f(akpyVar2, "value");
                    akzxVarM2.u();
                    akpu akpuVar5 = akzxVarM2.b;
                    j$.util.Objects.requireNonNull(akpyVar2);
                    akpuVar5.d = akpyVar2;
                    akpuVar5.c = 6;
                }
            }
        }
        akpu akpuVarR = akzxVarM2.r();
        defpackage.aooh.e(akpuVarR, "build(...)");
        akpu akpuVar6 = akpuVarR;
        defpackage.aooh.f(akpuVar6, "value");
        akzxVarM.u();
        akpv akpvVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(akpuVar6);
        akpvVar.c = akpuVar6;
        akpvVar.b |= 2;
        int iOrdinal = adxpVar.d.ordinal();
        if (iOrdinal == 0) {
            i2 = 4;
        } else if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                i2 = 14;
            } else if (iOrdinal == 3) {
                i2 = 13;
            } else if (iOrdinal == 4) {
                i2 = 15;
            } else {
                if (iOrdinal != 5) {
                    throw new defpackage.aois();
                }
                i2 = 2;
            }
        }
        akzxVarM.u();
        akpv akpvVar2 = akzxVarM.b;
        akpvVar2.d = i2 - 1;
        akpvVar2.b |= 4;
        defpackage.albh albhVarR = akzxVarM.r();
        defpackage.aooh.e(albhVarR, "build(...)");
        defpackage.albh albhVar = (akpv) albhVarR;
        java.lang.String str8 = adxpVar.u;
        defpackage.tvn tvnVar = this.b;
        if (str8 == null) {
            defpackage.zza zzaVarF = defpackage.zzd.f((android.content.Context) tvnVar.a, "CHIME");
            zzaVarF.f = new akxl(1, (byte[]) null);
            zzdVarL = zzaVarF.b();
        } else {
            zzdVarL = tvnVar.L("CHIME", str8);
        }
        defpackage.zzc zzcVarH = zzdVarL.h(albhVar, defpackage.abtl.b(this.a, new akpp()));
        if (!adxpVar.v.isEmpty()) {
            zzcVarH.g(defpackage.ajsz.cm(adxpVar.v));
        }
        zzcVarH.d();
    }
}
