package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dpe {
    public static final int a(int i) {
        if (i < 8191) {
            return 13;
        }
        if (i < 32767) {
            return 15;
        }
        if (i < 65535) {
            return 16;
        }
        return i >= 262143 ? 255 : 18;
    }

    public static final int b(long j, int i) {
        int iC = defpackage.dpd.c(j);
        if (i < iC) {
            i = iC;
        }
        int iA = defpackage.dpd.a(j);
        return i > iA ? iA : i;
    }

    public static final long c(int i, int i2, int i3, int i4) {
        if (((i2 >= i ? 1 : 0) & (i4 < i3 ? 0 : 1) & ((i ^ (-1)) >>> 31) & ((i3 ^ (-1)) >>> 31)) == 0) {
            dpm.a(defpackage.aoov.l("\n        maxWidth(" + i2 + ") must be >= than minWidth(" + i + "),\n        maxHeight(" + i4 + ") must be >= than minHeight(" + i3 + "),\n        minWidth(" + i + ") and minHeight(" + i3 + ") must be >= 0\n        "));
        }
        return f(i, i2, i3, i4);
    }

    public static final long d(long j, long j2) {
        int i = (int) (j2 >> 32);
        int iD = defpackage.dpd.d(j);
        if (i < iD) {
            i = iD;
        }
        int iB = defpackage.dpd.b(j);
        if (i > iB) {
            i = iB;
        }
        long j3 = ((long) i) << 32;
        int iA = defpackage.dpd.a(j);
        int i2 = (int) (j2 & 4294967295L);
        int iC = defpackage.dpd.c(j);
        if (i2 < iC) {
            i2 = iC;
        }
        if (i2 <= iA) {
            iA = i2;
        }
        return j3 | ((long) iA);
    }

    public static final long e(long j, long j2) {
        int iD = defpackage.dpd.d(j2);
        int iD2 = defpackage.dpd.d(j);
        if (iD < iD2) {
            iD = iD2;
        }
        int iB = defpackage.dpd.b(j);
        if (iD > iB) {
            iD = iB;
        }
        int iB2 = defpackage.dpd.b(j2);
        if (iB2 >= iD2) {
            iD2 = iB2;
        }
        if (iD2 <= iB) {
            iB = iD2;
        }
        int iC = defpackage.dpd.c(j2);
        int iC2 = defpackage.dpd.c(j);
        if (iC < iC2) {
            iC = iC2;
        }
        int iA = defpackage.dpd.a(j);
        if (iC > iA) {
            iC = iA;
        }
        int iA2 = defpackage.dpd.a(j2);
        if (iA2 >= iC2) {
            iC2 = iA2;
        }
        if (iC2 <= iA) {
            iA = iC2;
        }
        return c(iD, iB, iC, iA);
    }

    public static final long f(int i, int i2, int i3, int i4) {
        int i5 = i4 == Integer.MAX_VALUE ? i3 : i4;
        int i6 = i2 == Integer.MAX_VALUE ? i : i2;
        int iA = a(i5);
        int iA2 = a(i6);
        if (iA + iA2 > 31) {
            i(i6, i5);
        }
        int i7 = i2 + 1;
        int i8 = i4 + 1;
        int i9 = iA2 - 13;
        return ((long) ((i9 >> 1) + (i9 & 1))) | (((long) i) << 2) | (((long) (i7 & (~(i7 >> 31)))) << 33) | (((long) i3) << (iA2 + 2)) | (((long) (i8 & (~(i8 >> 31)))) << (iA2 + 33));
    }

    public static final long g(long j, int i, int i2) {
        int iB = defpackage.dpd.b(j);
        if (iB != Integer.MAX_VALUE && (iB = iB + i) < 0) {
            iB = 0;
        }
        int iC = defpackage.dpd.c(j) + i2;
        if (iC < 0) {
            iC = 0;
        }
        int iA = defpackage.dpd.a(j);
        if (iA != Integer.MAX_VALUE && (iA = iA + i2) < 0) {
            iA = 0;
        }
        int iD = defpackage.dpd.d(j) + i;
        return c(iD >= 0 ? iD : 0, iB, iC, iA);
    }

    public static final java.lang.Void h(int i) {
        throw new java.lang.IllegalArgumentException(defpackage.a.bs(i, "Can't represent a size of ", " in Constraints"));
    }

    public static final void i(int i, int i2) {
        throw new java.lang.IllegalArgumentException(defpackage.a.bA(i2, i, "Can't represent a width of ", " and height of ", " in Constraints"));
    }

    public static final long j(int i, int i2, int i3, int i4) {
        int i5 = 262142;
        int iMin = java.lang.Math.min(i3, 262142);
        int iMin2 = i4 == Integer.MAX_VALUE ? Integer.MAX_VALUE : java.lang.Math.min(i4, 262142);
        int i6 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i6 >= 8191) {
            if (i6 < 32767) {
                i5 = 65534;
            } else if (i6 < 65535) {
                i5 = 32766;
            } else {
                if (i6 >= 262143) {
                    h(i6);
                    throw new defpackage.aoiq();
                }
                i5 = 8190;
            }
        }
        return c(java.lang.Math.min(i5, i), i2 != Integer.MAX_VALUE ? java.lang.Math.min(i5, i2) : Integer.MAX_VALUE, iMin, iMin2);
    }

    public static final long k(int i, int i2, int i3, int i4) {
        int i5 = 262142;
        int iMin = java.lang.Math.min(i, 262142);
        int iMin2 = i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : java.lang.Math.min(i2, 262142);
        int i6 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i6 >= 8191) {
            if (i6 < 32767) {
                i5 = 65534;
            } else if (i6 < 65535) {
                i5 = 32766;
            } else {
                if (i6 >= 262143) {
                    h(i6);
                    throw new defpackage.aoiq();
                }
                i5 = 8190;
            }
        }
        return c(iMin, iMin2, java.lang.Math.min(i5, i3), i4 != Integer.MAX_VALUE ? java.lang.Math.min(i5, i4) : Integer.MAX_VALUE);
    }

    public static final long l(int i, int i2) {
        if (((i ^ (-1)) & (i2 ^ (-1))) >= 0) {
            dpm.a(defpackage.a.bA(i2, i, "width(", ") and height(", ") must be >= 0"));
        }
        return f(i, i, i2, i2);
    }

    public static final defpackage.dpf m(android.content.Context context) {
        float f = context.getResources().getConfiguration().fontScale;
        float f2 = context.getResources().getDisplayMetrics().density;
        int i = defpackage.dpw.a;
        defpackage.dpv dpvVarA = defpackage.dpw.a(f);
        if (dpvVarA == null) {
            dpvVarA = new defpackage.dpr(f);
        }
        return new defpackage.dph(f2, f, dpvVarA);
    }

    public static defpackage.doy n(defpackage.doy doyVar, defpackage.doy doyVar2) {
        if (doyVar2 instanceof defpackage.dol) {
            if (doyVar instanceof defpackage.dol) {
                defpackage.dol dolVar = (defpackage.dol) doyVar2;
                defpackage.crb crbVar = dolVar.a;
                float fFloatValue = dolVar.b;
                bup bupVar = new bup(doyVar, 19);
                if (java.lang.Float.isNaN(fFloatValue)) {
                    fFloatValue = ((java.lang.Number) bupVar.a()).floatValue();
                }
                return new defpackage.dol(crbVar, fFloatValue);
            }
            if (!(doyVar instanceof defpackage.dol)) {
                return doyVar2;
            }
        } else if (doyVar instanceof defpackage.dol) {
            return doyVar;
        }
        return doyVar2.e(new defpackage.ddw(doyVar, 9));
    }

    public static defpackage.doy o(defpackage.doy doyVar, defpackage.aomy aomyVar) {
        return defpackage.aooh.n(doyVar, defpackage.dox.a) ? (defpackage.doy) aomyVar.a() : doyVar;
    }

    public static boolean p(android.content.Context context) {
        return aa$.ExternalSyntheticApiModelOutline1.m((android.os.UserManager) context.getSystemService(android.os.UserManager.class));
    }

    public static defpackage.dxe q(android.content.res.Configuration configuration) {
        return new defpackage.dxe(new defpackage.dxf(aa$.ExternalSyntheticApiModelOutline1.m(configuration)));
    }

    public static final android.os.Bundle r(defpackage.aoiu... aoiuVarArr) {
        if (aoiuVarArr == null) {
            defpackage.aooh.i("pairs");
        }
        android.os.Bundle bundle = new android.os.Bundle(aoiuVarArr.length);
        for (defpackage.aoiu aoiuVar : aoiuVarArr) {
            java.lang.String str = (java.lang.String) aoiuVar.a;
            java.lang.Object obj = aoiuVar.b;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof java.lang.Boolean) {
                bundle.putBoolean(str, ((java.lang.Boolean) obj).booleanValue());
            } else if (obj instanceof java.lang.Byte) {
                bundle.putByte(str, ((java.lang.Number) obj).byteValue());
            } else if (obj instanceof java.lang.Character) {
                bundle.putChar(str, ((java.lang.Character) obj).charValue());
            } else if (obj instanceof java.lang.Double) {
                bundle.putDouble(str, ((java.lang.Number) obj).doubleValue());
            } else if (obj instanceof java.lang.Float) {
                bundle.putFloat(str, ((java.lang.Number) obj).floatValue());
            } else if (obj instanceof java.lang.Integer) {
                bundle.putInt(str, ((java.lang.Number) obj).intValue());
            } else if (obj instanceof java.lang.Long) {
                bundle.putLong(str, ((java.lang.Number) obj).longValue());
            } else if (obj instanceof java.lang.Short) {
                bundle.putShort(str, ((java.lang.Number) obj).shortValue());
            } else if (obj instanceof android.os.Bundle) {
                bundle.putBundle(str, (android.os.Bundle) obj);
            } else if (obj instanceof java.lang.CharSequence) {
                bundle.putCharSequence(str, (java.lang.CharSequence) obj);
            } else if (obj instanceof android.os.Parcelable) {
                bundle.putParcelable(str, (android.os.Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof java.lang.Object[]) {
                java.lang.Class<?> componentType = obj.getClass().getComponentType();
                if (componentType == null) {
                    defpackage.aooh.g();
                }
                if (android.os.Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (android.os.Parcelable[]) obj);
                } else if (java.lang.String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (java.lang.String[]) obj);
                } else if (java.lang.CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (java.lang.CharSequence[]) obj);
                } else {
                    if (!java.io.Serializable.class.isAssignableFrom(componentType)) {
                        throw new java.lang.IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (java.io.Serializable) obj);
                }
            } else if (obj instanceof java.io.Serializable) {
                bundle.putSerializable(str, (java.io.Serializable) obj);
            } else if (obj instanceof android.os.IBinder) {
                bundle.putBinder(str, (android.os.IBinder) obj);
            } else if (obj instanceof android.util.Size) {
                bundle.putSize(str, (android.util.Size) obj);
            } else {
                if (!(obj instanceof android.util.SizeF)) {
                    throw new java.lang.IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                bundle.putSizeF(str, (android.util.SizeF) obj);
            }
        }
        return bundle;
    }

    public static java.io.Serializable s(android.os.Bundle bundle, java.lang.String str, java.lang.Class cls) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return ae$.ExternalSyntheticApiModelOutline0.m(bundle, str, cls);
        }
        java.io.Serializable serializable = bundle.getSerializable(str);
        if (cls.isInstance(serializable)) {
            return serializable;
        }
        return null;
    }

    public static java.lang.Object t(android.os.Bundle bundle, java.lang.String str, java.lang.Class cls) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return ae$.ExternalSyntheticApiModelOutline0.m(bundle, str, cls);
        }
        android.os.Parcelable parcelable = bundle.getParcelable(str);
        if (cls.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static android.os.Parcelable[] u(android.os.Bundle bundle, java.lang.Class cls) {
        return android.os.Build.VERSION.SDK_INT >= 34 ? (android.os.Parcelable[]) ae$.ExternalSyntheticApiModelOutline0.m(bundle, "accounts", cls) : bundle.getParcelableArray("accounts");
    }
}
