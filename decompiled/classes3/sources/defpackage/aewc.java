package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aewc {
    private static final ahzf d = ahzf.b('/').a();
    public static final defpackage.aewb a = new defpackage.aewa(1);
    public static final defpackage.aewb b = new defpackage.aewa(0);
    public static final defpackage.aewb c = new defpackage.aewa(2);

    public static java.util.List a(java.lang.String str) {
        return ahvr.aO(d.j(str), new aeqw(5));
    }

    public static void b(defpackage.aewb aewbVar, albg albgVar) {
        java.lang.String strA = aewbVar.a(albgVar);
        java.lang.String strB = aewbVar.b(albgVar);
        if (!strA.isEmpty() || strB.isEmpty()) {
            aewbVar.c(albgVar, null);
        } else {
            aewbVar.c(albgVar, defpackage.agmc.ag(strB));
        }
        aewbVar.d(albgVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:105:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final aiwh c(aiwh aiwhVar) {
        java.lang.String str = aiwhVar.d;
        if (str.isEmpty()) {
            return aiwhVar;
        }
        java.lang.String str2 = aiwhVar.c;
        boolean zStartsWith = true;
        switch (str2.hashCode()) {
            case -1940179375:
                if (str2.equals("java.lang.AbstractMethodError")) {
                    zStartsWith = str.startsWith("abstract method ");
                } else {
                    zStartsWith = false;
                }
                if (zStartsWith) {
                    return aiwhVar;
                }
                akzx akzxVarP = aiwhVar.p();
                long jLongValue = defpackage.agmc.ag(str).longValue();
                akzxVarP.u();
                aiwh aiwhVar2 = akzxVarP.b;
                aiwhVar2.b |= 4;
                aiwhVar2.e = jLongValue;
                akzxVarP.u();
                aiwh aiwhVar3 = akzxVarP.b;
                aiwhVar3.b &= -3;
                aiwhVar3.d = aiwh.a.d;
                return akzxVarP.p();
            case -1383341662:
                if (str2.equals("java.lang.StringIndexOutOfBoundsException")) {
                    zStartsWith = java.util.regex.Pattern.matches("length=\\d+; index=\\d+", str);
                } else {
                    zStartsWith = false;
                }
                if (zStartsWith) {
                    return aiwhVar;
                }
                akzx akzxVarP2 = aiwhVar.p();
                long jLongValue2 = defpackage.agmc.ag(str).longValue();
                akzxVarP2.u();
                aiwh aiwhVar4 = akzxVarP2.b;
                aiwhVar4.b |= 4;
                aiwhVar4.e = jLongValue2;
                akzxVarP2.u();
                aiwh aiwhVar5 = akzxVarP2.b;
                aiwhVar5.b &= -3;
                aiwhVar5.d = aiwh.a.d;
                return akzxVarP2.p();
            case -823400207:
                if (str2.equals("java.lang.ArithmeticException")) {
                    zStartsWith = str.equals("divide by zero");
                } else {
                    zStartsWith = false;
                }
                if (zStartsWith) {
                    return aiwhVar;
                }
                akzx akzxVarP3 = aiwhVar.p();
                long jLongValue3 = defpackage.agmc.ag(str).longValue();
                akzxVarP3.u();
                aiwh aiwhVar6 = akzxVarP3.b;
                aiwhVar6.b |= 4;
                aiwhVar6.e = jLongValue3;
                akzxVarP3.u();
                aiwh aiwhVar7 = akzxVarP3.b;
                aiwhVar7.b &= -3;
                aiwhVar7.d = aiwh.a.d;
                return akzxVarP3.p();
            case -759901694:
                if (str2.equals("java.lang.IllegalAccessError")) {
                    if (java.util.regex.Pattern.matches("Illegal class access: '.+' attempting to access .+'", str) || java.util.regex.Pattern.matches("Illegal class access ('.+' attempting to access '.+') in attempt to invoke .+ method .+", str) || java.util.regex.Pattern.matches("Method '.+' is inaccessible to class '.+'", str) || java.util.regex.Pattern.matches("Field '.+' is inaccessible to class '.+'", str) || java.util.regex.Pattern.matches("Final field '.+' cannot be written to by method '.+'", str) || java.util.regex.Pattern.matches("Method '.+' implementing interface method '.+' is not public", str)) {
                    }
                    akzx akzxVarP4 = aiwhVar.p();
                    long jLongValue4 = defpackage.agmc.ag(str).longValue();
                    akzxVarP4.u();
                    aiwh aiwhVar8 = akzxVarP4.b;
                    aiwhVar8.b |= 4;
                    aiwhVar8.e = jLongValue4;
                    akzxVarP4.u();
                    aiwh aiwhVar9 = akzxVarP4.b;
                    aiwhVar9.b &= -3;
                    aiwhVar9.d = aiwh.a.d;
                    return akzxVarP4.p();
                }
                zStartsWith = false;
                if (zStartsWith) {
                    return aiwhVar;
                }
                akzx akzxVarP5 = aiwhVar.p();
                long jLongValue5 = defpackage.agmc.ag(str).longValue();
                akzxVarP5.u();
                aiwh aiwhVar10 = akzxVarP5.b;
                aiwhVar10.b |= 4;
                aiwhVar10.e = jLongValue5;
                akzxVarP5.u();
                aiwh aiwhVar11 = akzxVarP5.b;
                aiwhVar11.b &= -3;
                aiwhVar11.d = aiwh.a.d;
                return akzxVarP5.p();
            case -437312173:
                if (str2.equals("java.lang.ArrayStoreException")) {
                    zStartsWith = java.util.regex.Pattern.matches(".+ cannot be stored in an array of type .+", str);
                } else {
                    zStartsWith = false;
                }
                if (zStartsWith) {
                    return aiwhVar;
                }
                akzx akzxVarP6 = aiwhVar.p();
                long jLongValue6 = defpackage.agmc.ag(str).longValue();
                akzxVarP6.u();
                aiwh aiwhVar12 = akzxVarP6.b;
                aiwhVar12.b |= 4;
                aiwhVar12.e = jLongValue6;
                akzxVarP6.u();
                aiwh aiwhVar13 = akzxVarP6.b;
                aiwhVar13.b &= -3;
                aiwhVar13.d = aiwh.a.d;
                return akzxVarP6.p();
            case -37663348:
                if (str2.equals("java.lang.ClassCastException")) {
                    zStartsWith = java.util.regex.Pattern.matches(".+ cannot be cast to .+", str);
                } else {
                    zStartsWith = false;
                }
                if (zStartsWith) {
                    return aiwhVar;
                }
                akzx akzxVarP7 = aiwhVar.p();
                long jLongValue7 = defpackage.agmc.ag(str).longValue();
                akzxVarP7.u();
                aiwh aiwhVar14 = akzxVarP7.b;
                aiwhVar14.b |= 4;
                aiwhVar14.e = jLongValue7;
                akzxVarP7.u();
                aiwh aiwhVar15 = akzxVarP7.b;
                aiwhVar15.b &= -3;
                aiwhVar15.d = aiwh.a.d;
                return akzxVarP7.p();
            case 145247949:
                if (str2.equals("java.lang.IncompatibleClassChangeError")) {
                    if (java.util.regex.Pattern.matches("The method '.+' was expected to be of type .+ but instead was found to be of type .+", str) || java.util.regex.Pattern.matches("Class '.+' does not implement interface '.+' in call to '.+'", str) || java.util.regex.Pattern.matches("Expected '.+' to be a (?:static|instance) field rather than a (?:static|instance) field", str) || java.util.regex.Pattern.matches("Conflicting default method implementations .+", str)) {
                    }
                    akzx akzxVarP8 = aiwhVar.p();
                    long jLongValue8 = defpackage.agmc.ag(str).longValue();
                    akzxVarP8.u();
                    aiwh aiwhVar16 = akzxVarP8.b;
                    aiwhVar16.b |= 4;
                    aiwhVar16.e = jLongValue8;
                    akzxVarP8.u();
                    aiwh aiwhVar17 = akzxVarP8.b;
                    aiwhVar17.b &= -3;
                    aiwhVar17.d = aiwh.a.d;
                    return akzxVarP8.p();
                }
                zStartsWith = false;
                if (zStartsWith) {
                    return aiwhVar;
                }
                akzx akzxVarP9 = aiwhVar.p();
                long jLongValue9 = defpackage.agmc.ag(str).longValue();
                akzxVarP9.u();
                aiwh aiwhVar18 = akzxVarP9.b;
                aiwhVar18.b |= 4;
                aiwhVar18.e = jLongValue9;
                akzxVarP9.u();
                aiwh aiwhVar19 = akzxVarP9.b;
                aiwhVar19.b &= -3;
                aiwhVar19.d = aiwh.a.d;
                return akzxVarP9.p();
            case 287460082:
                if (str2.equals("java.io.InvalidClassException")) {
                    if (java.util.regex.Pattern.matches("cannot bind .+ descriptor to .+", str) || java.util.regex.Pattern.matches("Circular reference\\.", str) || java.util.regex.Pattern.matches(".*class invalid for deserialization", str) || java.util.regex.Pattern.matches("Class descriptor should be initialized", str) || java.util.regex.Pattern.matches(".*enum descriptor has non-zero .+", str) || java.util.regex.Pattern.matches(".*enum type", str) || java.util.regex.Pattern.matches(".*incompatible types for field .+", str) || java.util.regex.Pattern.matches(".*invalid descriptor for field .+", str) || java.util.regex.Pattern.matches(".*local class incompatible: .+", str) || java.util.regex.Pattern.matches(".*local class name incompatible with stream class .+", str) || java.util.regex.Pattern.matches("multiple serializable fields named .+", str) || java.util.regex.Pattern.matches(".*no valid constructor", str) || java.util.regex.Pattern.matches(".*serializable and externalizable flags conflict", str) || java.util.regex.Pattern.matches(".*Serializable incompatible with Externalizable", str) || java.util.regex.Pattern.matches(".*unmatched serializable field(s) declared", str)) {
                    }
                    akzx akzxVarP10 = aiwhVar.p();
                    long jLongValue10 = defpackage.agmc.ag(str).longValue();
                    akzxVarP10.u();
                    aiwh aiwhVar110 = akzxVarP10.b;
                    aiwhVar110.b |= 4;
                    aiwhVar110.e = jLongValue10;
                    akzxVarP10.u();
                    aiwh aiwhVar111 = akzxVarP10.b;
                    aiwhVar111.b &= -3;
                    aiwhVar111.d = aiwh.a.d;
                    return akzxVarP10.p();
                }
                zStartsWith = false;
                if (zStartsWith) {
                    return aiwhVar;
                }
                akzx akzxVarP11 = aiwhVar.p();
                long jLongValue11 = defpackage.agmc.ag(str).longValue();
                akzxVarP11.u();
                aiwh aiwhVar112 = akzxVarP11.b;
                aiwhVar112.b |= 4;
                aiwhVar112.e = jLongValue11;
                akzxVarP11.u();
                aiwh aiwhVar113 = akzxVarP11.b;
                aiwhVar113.b &= -3;
                aiwhVar113.d = aiwh.a.d;
                return akzxVarP11.p();
            case 1077344571:
                if (str2.equals("java.lang.WrongMethodTypeException")) {
                    zStartsWith = java.util.regex.Pattern.matches("Expected .+ but was .+", str);
                } else {
                    zStartsWith = false;
                }
                if (zStartsWith) {
                    return aiwhVar;
                }
                akzx akzxVarP12 = aiwhVar.p();
                long jLongValue12 = defpackage.agmc.ag(str).longValue();
                akzxVarP12.u();
                aiwh aiwhVar114 = akzxVarP12.b;
                aiwhVar114.b |= 4;
                aiwhVar114.e = jLongValue12;
                akzxVarP12.u();
                aiwh aiwhVar115 = akzxVarP12.b;
                aiwhVar115.b &= -3;
                aiwhVar115.d = aiwh.a.d;
                return akzxVarP12.p();
            case 1270017459:
                if (str2.equals("java.lang.IndexOutOfBoundsException")) {
                    zStartsWith = java.util.regex.Pattern.matches("length=\\d+; index=-?\\d+", str);
                } else {
                    zStartsWith = false;
                }
                if (zStartsWith) {
                    return aiwhVar;
                }
                akzx akzxVarP13 = aiwhVar.p();
                long jLongValue13 = defpackage.agmc.ag(str).longValue();
                akzxVarP13.u();
                aiwh aiwhVar116 = akzxVarP13.b;
                aiwhVar116.b |= 4;
                aiwhVar116.e = jLongValue13;
                akzxVarP13.u();
                aiwh aiwhVar117 = akzxVarP13.b;
                aiwhVar117.b &= -3;
                aiwhVar117.d = aiwh.a.d;
                return akzxVarP13.p();
            case 1625905794:
                if (str2.equals("java.lang.ArrayIndexOutOfBoundsException")) {
                    zStartsWith = java.util.regex.Pattern.matches("length=\\d+; index=-?\\d+", str);
                } else {
                    zStartsWith = false;
                }
                if (zStartsWith) {
                    return aiwhVar;
                }
                akzx akzxVarP14 = aiwhVar.p();
                long jLongValue14 = defpackage.agmc.ag(str).longValue();
                akzxVarP14.u();
                aiwh aiwhVar118 = akzxVarP14.b;
                aiwhVar118.b |= 4;
                aiwhVar118.e = jLongValue14;
                akzxVarP14.u();
                aiwh aiwhVar119 = akzxVarP14.b;
                aiwhVar119.b &= -3;
                aiwhVar119.d = aiwh.a.d;
                return akzxVarP14.p();
            case 1879291277:
                if (str2.equals("java.lang.NullPointerException")) {
                    if (java.util.regex.Pattern.matches("Attempt to (?:read from|write to) field '.+' on a null object reference in method '.+'", str) || java.util.regex.Pattern.matches("Attempt to invoke .+ method '.+' on a null object reference", str) || str.equals("Attempt to read from null array") || str.equals("Attempt to write to null array") || str.equals("Attempt to get length of null array") || str.equals("Attempt to do a synchronize operation on a null object")) {
                    }
                    akzx akzxVarP15 = aiwhVar.p();
                    long jLongValue15 = defpackage.agmc.ag(str).longValue();
                    akzxVarP15.u();
                    aiwh aiwhVar1110 = akzxVarP15.b;
                    aiwhVar1110.b |= 4;
                    aiwhVar1110.e = jLongValue15;
                    akzxVarP15.u();
                    aiwh aiwhVar1111 = akzxVarP15.b;
                    aiwhVar1111.b &= -3;
                    aiwhVar1111.d = aiwh.a.d;
                    return akzxVarP15.p();
                }
                zStartsWith = false;
                if (zStartsWith) {
                    return aiwhVar;
                }
                akzx akzxVarP16 = aiwhVar.p();
                long jLongValue16 = defpackage.agmc.ag(str).longValue();
                akzxVarP16.u();
                aiwh aiwhVar1112 = akzxVarP16.b;
                aiwhVar1112.b |= 4;
                aiwhVar1112.e = jLongValue16;
                akzxVarP16.u();
                aiwh aiwhVar1113 = akzxVarP16.b;
                aiwhVar1113.b &= -3;
                aiwhVar1113.d = aiwh.a.d;
                return akzxVarP16.p();
            default:
                zStartsWith = false;
                if (zStartsWith) {
                    return aiwhVar;
                }
                akzx akzxVarP17 = aiwhVar.p();
                long jLongValue17 = defpackage.agmc.ag(str).longValue();
                akzxVarP17.u();
                aiwh aiwhVar1114 = akzxVarP17.b;
                aiwhVar1114.b |= 4;
                aiwhVar1114.e = jLongValue17;
                akzxVarP17.u();
                aiwh aiwhVar1115 = akzxVarP17.b;
                aiwhVar1115.b &= -3;
                aiwhVar1115.d = aiwh.a.d;
                return akzxVarP17.p();
        }
    }
}
