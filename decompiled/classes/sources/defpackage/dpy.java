package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dpy {
    public static final java.lang.Void a(java.lang.String str) {
        throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static final void b(java.lang.String str) {
        throw new java.lang.UnsupportedOperationException("Empty collection can't be reduced.");
    }

    public static /* synthetic */ java.lang.String c(java.util.List list, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, defpackage.aonj aonjVar, int i) throws java.io.IOException {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if ((i & 2) != 0) {
            charSequence2 = "";
        }
        sb.append(charSequence2);
        int size = list.size();
        byte b = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            byte b2 = (i & 8) != 0 ? (byte) -1 : (byte) 0;
            if (i2 >= size) {
                b = b2;
                break;
            }
            java.lang.Object obj = list.get(i2);
            i3++;
            if (i3 > 1) {
                sb.append(1 != (i & 1) ? charSequence : ", ");
            }
            if (b2 >= 0 && i3 > 0) {
                break;
            }
            defpackage.aonj aonjVar2 = (i & 32) == 0 ? aonjVar : null;
            if (aonjVar2 != null) {
                sb.append((java.lang.CharSequence) aonjVar2.a(obj));
            } else if (obj == null || (obj instanceof java.lang.CharSequence)) {
                sb.append((java.lang.CharSequence) obj);
            } else if (obj instanceof java.lang.Character) {
                sb.append(((java.lang.Character) obj).charValue());
            } else {
                sb.append((java.lang.CharSequence) obj.toString());
            }
            i2++;
        }
        if (b >= 0 && i3 > 0) {
            sb.append((java.lang.CharSequence) ((i & 16) != 0 ? "..." : null));
        }
        if ((i & 4) != 0) {
            charSequence3 = "";
        }
        sb.append(charSequence3);
        return sb.toString();
    }

    public static final float d(float f, float[] fArr, float[] fArr2) {
        float f2;
        float f3;
        float f4;
        float f5;
        float fAbs = java.lang.Math.abs(f);
        float fSignum = java.lang.Math.signum(f);
        int iBinarySearch = java.util.Arrays.binarySearch(fArr, fAbs);
        if (iBinarySearch >= 0) {
            f5 = fArr2[iBinarySearch];
        } else {
            int i = -(iBinarySearch + 1);
            int i2 = i - 1;
            int length = fArr.length - 1;
            float f6 = 0.0f;
            if (i2 >= length) {
                float f7 = fArr[length];
                float f8 = fArr2[length];
                if (f7 == 0.0f) {
                    return 0.0f;
                }
                return f * (f8 / f7);
            }
            if (i2 == -1) {
                f2 = fArr[0];
                f3 = fArr2[0];
                f4 = 0.0f;
            } else {
                float f9 = fArr[i2];
                f2 = fArr[i];
                f6 = fArr2[i2];
                f3 = fArr2[i];
                f4 = f9;
            }
            f5 = dnv.f(f6, f3, f4, f2, fAbs);
        }
        return fSignum * f5;
    }

    public static final long e(double d) {
        long jFloatToRawIntBits = java.lang.Float.floatToRawIntBits((float) d);
        defpackage.dpt[] dptVarArr = defpackage.dps.a;
        return (jFloatToRawIntBits & 4294967295L) | 8589934592L;
    }

    public static final long f(double d) {
        long jFloatToRawIntBits = java.lang.Float.floatToRawIntBits((float) d);
        defpackage.dpt[] dptVarArr = defpackage.dps.a;
        return (jFloatToRawIntBits & 4294967295L) | 4294967296L;
    }

    public static final long g(int i) {
        long jFloatToRawIntBits = java.lang.Float.floatToRawIntBits(i);
        defpackage.dpt[] dptVarArr = defpackage.dps.a;
        return (jFloatToRawIntBits & 4294967295L) | 4294967296L;
    }

    public static final long h(long j, float f) {
        long jFloatToRawIntBits = java.lang.Float.floatToRawIntBits(f);
        defpackage.dpt[] dptVarArr = defpackage.dps.a;
        return j | (jFloatToRawIntBits & 4294967295L);
    }

    public static final void i(long j) {
        defpackage.dpt[] dptVarArr = defpackage.dps.a;
        if ((j & 1095216660480L) == 0) {
            dpm.a("Cannot perform operation for Unspecified type.");
        }
    }

    public static final long j(long j) {
        return (((long) java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (j >> 32)))) << 32) | (((long) java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L);
    }

    public static final long k(long j) {
        return (((long) ((int) java.lang.Float.intBitsToFloat((int) (j >> 32)))) << 32) | (((long) ((int) java.lang.Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L);
    }

    public static final long l(long j) {
        return (((long) java.lang.Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) java.lang.Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L);
    }

    public static /* synthetic */ defpackage.aope m(java.lang.String str, defpackage.efk efkVar) {
        dkq dkqVar = new dkq(14);
        defpackage.aosp aospVar = defpackage.aoth.a;
        return new defpackage.efp(str, efkVar, dkqVar, defpackage.aosv.n(defpackage.apcz.a.plus(new defpackage.aovh(null))));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r5v0, types: [aonj] */
    public static final java.lang.Object n(java.io.File file, defpackage.aonj aonjVar, defpackage.aoln aolnVar) throws java.io.IOException {
        defpackage.ees eesVar;
        if (aolnVar instanceof defpackage.ees) {
            eesVar = (defpackage.ees) aolnVar;
            int i = eesVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                eesVar.c = i - Integer.MIN_VALUE;
            } else {
                eesVar = new defpackage.ees(aolnVar);
            }
        } else {
            eesVar = new defpackage.ees(aolnVar);
        }
        java.lang.Object objA = eesVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = eesVar.c;
        try {
            if (i2 == 0) {
                defpackage.aooc.af(objA);
                eesVar.a = file;
                eesVar.c = 1;
                objA = aonjVar.a(eesVar);
                file = file;
                if (objA == aoluVar) {
                    objA = aoluVar;
                    file = file;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                java.lang.Object obj = eesVar.a;
                defpackage.aooc.af(objA);
                file = obj;
            }
            return objA;
        } catch (java.io.IOException e) {
            if (e instanceof defpackage.ecp) {
                java.util.Objects.toString(file);
                throw new defpackage.ecp("Corruption in file ".concat(java.lang.String.valueOf((java.lang.Object) file)), e);
            }
            if (file == 0) {
                defpackage.aooh.i("file");
            }
            java.io.File file2 = (java.io.File) file;
            if (!file2.exists()) {
                throw eav.i(file2, e);
            }
            if (file2.isFile()) {
                if (file2.canRead()) {
                    if (file2.canWrite()) {
                        throw eav.i(file2, e);
                    }
                    throw eav.i(file2, e);
                }
                if (file2.canWrite()) {
                    throw eav.i(file2, e);
                }
                throw eav.i(file2, e);
            }
            if (file2.canRead()) {
                if (file2.canWrite()) {
                    throw eav.i(file2, e);
                }
                throw eav.i(file2, e);
            }
            if (file2.canWrite()) {
                throw eav.i(file2, e);
            }
            throw eav.i(file2, e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final java.lang.Object o(defpackage.aonj aonjVar, defpackage.aoln aolnVar) {
        defpackage.eej eejVar;
        defpackage.aogc aogcVar;
        if (aolnVar instanceof defpackage.eej) {
            eejVar = (defpackage.eej) aolnVar;
            int i = eejVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                eejVar.l = i - Integer.MIN_VALUE;
            } else {
                eejVar = new defpackage.eej(aolnVar);
            }
        } else {
            eejVar = new defpackage.eej(aolnVar);
        }
        java.lang.Object obj = eejVar.k;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        try {
            try {
                switch (eejVar.l) {
                    case 0:
                        defpackage.aooc.af(obj);
                        eejVar.a = null;
                        eejVar.b = null;
                        eejVar.c = null;
                        eejVar.d = null;
                        eejVar.l = 7;
                        java.lang.Object objA = aonjVar.a(eejVar);
                        return objA == aoluVar ? aoluVar : objA;
                    case 1:
                        int i2 = eejVar.j;
                        int i3 = eejVar.i;
                        java.lang.Object obj2 = eejVar.h;
                        java.lang.Object obj3 = eejVar.g;
                        java.lang.Object obj4 = eejVar.f;
                        java.lang.String str = eejVar.n;
                        java.lang.String str2 = eejVar.m;
                        java.lang.Object obj5 = eejVar.e;
                        java.lang.Object obj6 = eejVar.d;
                        java.lang.Object obj7 = eejVar.c;
                        java.lang.Object obj8 = eejVar.b;
                        java.lang.Object obj9 = eejVar.a;
                        defpackage.aooc.af(obj);
                        defpackage.aogc aogcVar2 = (defpackage.aogc) obj;
                        java.lang.Object obj10 = aogcVar2.a;
                        java.lang.Object obj11 = aogcVar2.c;
                        eejVar.a = null;
                        eejVar.b = null;
                        eejVar.c = null;
                        eejVar.d = null;
                        eejVar.e = null;
                        eejVar.m = null;
                        eejVar.n = null;
                        eejVar.f = null;
                        eejVar.g = null;
                        eejVar.o = null;
                        eejVar.p = aogcVar2;
                        eejVar.h = null;
                        eejVar.i = 0;
                        eejVar.l = 3;
                        throw null;
                    case 2:
                        int i4 = eejVar.i;
                        aogcVar = eejVar.p;
                        break;
                    case 3:
                        int i5 = eejVar.i;
                        aogcVar = eejVar.p;
                        break;
                    case 4:
                        int i6 = eejVar.j;
                        int i7 = eejVar.i;
                        java.lang.Object obj12 = eejVar.g;
                        java.lang.Object obj13 = eejVar.f;
                        java.lang.String str3 = eejVar.n;
                        java.lang.String str4 = eejVar.m;
                        java.lang.Object obj14 = eejVar.e;
                        java.lang.Object obj15 = eejVar.d;
                        java.lang.Object obj16 = eejVar.c;
                        java.lang.Object obj17 = eejVar.b;
                        java.lang.Object obj18 = eejVar.a;
                        defpackage.aooc.af(obj);
                        defpackage.aogc aogcVar3 = (defpackage.aogc) obj;
                        java.lang.Object obj19 = aogcVar3.a;
                        java.lang.Object obj20 = aogcVar3.c;
                        eejVar.a = null;
                        eejVar.b = null;
                        eejVar.c = null;
                        eejVar.d = null;
                        eejVar.e = null;
                        eejVar.m = null;
                        eejVar.n = null;
                        eejVar.f = null;
                        eejVar.g = null;
                        eejVar.o = aogcVar3;
                        eejVar.i = 0;
                        eejVar.l = 6;
                        throw null;
                    case 5:
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        int i8 = eejVar.i;
                        defpackage.aogc aogcVar4 = eejVar.o;
                        java.lang.Object obj21 = eejVar.g;
                        java.lang.Object obj22 = eejVar.f;
                        java.lang.String str5 = eejVar.n;
                        java.lang.String str6 = eejVar.m;
                        java.lang.Object obj23 = eejVar.e;
                        java.lang.Object obj24 = eejVar.d;
                        java.lang.Object obj25 = eejVar.c;
                        java.lang.Object obj26 = eejVar.b;
                        java.lang.Object obj27 = eejVar.a;
                        defpackage.aooc.af(obj);
                        defpackage.mni.aP(aogcVar4.b);
                        return obj;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        java.lang.Object obj28 = eejVar.d;
                        java.lang.Object obj29 = eejVar.c;
                        java.lang.Object obj30 = eejVar.b;
                        java.lang.Object obj31 = eejVar.a;
                        defpackage.aooc.af(obj);
                        return obj;
                    default:
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                java.lang.Object obj32 = eejVar.g;
                java.lang.Object obj33 = eejVar.f;
                java.lang.String str7 = eejVar.n;
                java.lang.String str8 = eejVar.m;
                java.lang.Object obj34 = eejVar.e;
                java.lang.Object obj35 = eejVar.d;
                java.lang.Object obj36 = eejVar.c;
                java.lang.Object obj37 = eejVar.b;
                java.lang.Object obj38 = eejVar.a;
                defpackage.aooc.af(obj);
                defpackage.mni.aP(aogcVar.b);
                return obj;
            } catch (java.lang.Throwable th) {
                try {
                    fsu.I((defpackage.gkc) null, th);
                    throw new defpackage.aoiq();
                } catch (java.lang.Throwable th2) {
                    defpackage.mni.aP(aonjVar.b);
                    throw th2;
                }
            }
        } catch (java.lang.Throwable th3) {
            try {
                fsu.I((defpackage.gkc) null, th3);
                throw new defpackage.aoiq();
            } catch (java.lang.Throwable th4) {
                defpackage.mni.aP(aonjVar.b);
                throw th4;
            }
        }
    }

    public static final defpackage.aogc p(defpackage.ecx ecxVar, java.util.concurrent.Executor executor) {
        if (ecxVar == null) {
            defpackage.aooh.i("dataStore");
        }
        if (executor == null) {
            defpackage.aooh.i("executor");
        }
        defpackage.aosp aospVarAc = defpackage.aooc.ac(executor);
        if (ecxVar == null) {
            defpackage.aooh.i("dataStore");
        }
        defpackage.eei eeiVar = ecxVar instanceof defpackage.eei ? (defpackage.eei) ecxVar : null;
        if (eeiVar != null) {
            return new defpackage.aogc(eeiVar, aospVarAc);
        }
        throw new java.lang.IllegalStateException("Unexpected DataStore object that does not implement CurrentDataProviderStore");
    }
}
