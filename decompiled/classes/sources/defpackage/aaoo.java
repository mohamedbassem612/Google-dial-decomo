package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class aaoo {
    public static aaoj b;
    public static aaot c;

    private aaoo() {
    }

    public static android.net.Uri A(android.content.Context context, java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("getHelpUrl(): fromWhere must be non-empty");
        }
        java.lang.String strA = defpackage.aaym.a(context.getContentResolver(), "context_sensitive_help_url", "https://support.google.com/mobile/?hl=%locale%");
        if (strA.contains("%locale%")) {
            java.util.Locale locale = java.util.Locale.getDefault();
            strA = strA.replace("%locale%", locale.getLanguage() + '-' + locale.getCountry().toLowerCase(locale));
        }
        android.net.Uri.Builder builderBuildUpon = android.net.Uri.parse(strA).buildUpon();
        builderBuildUpon.appendQueryParameter("p", str);
        try {
            builderBuildUpon.appendQueryParameter("version", java.lang.String.valueOf(context.getPackageManager().getPackageInfo(context.getApplicationInfo().packageName, 0).versionCode));
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            android.util.Log.e("HelpUrl", "Error finding package ".concat(java.lang.String.valueOf(context.getApplicationInfo().packageName)));
        }
        return builderBuildUpon.build();
    }

    public static int B(int i) {
        switch (i) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return 6;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return 7;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return 8;
            case 9:
                return 9;
            case 10:
                return 10;
            case 11:
                return 11;
            case 12:
                return 12;
            case 13:
                return 13;
            case 14:
                return 14;
            case 15:
                return 15;
            default:
                return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x03b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0392  */
    public static aayg C(java.util.List list, java.lang.Object obj) {
        int iB;
        int iB2;
        int iB3;
        int iB4;
        defpackage.akzx akzxVarM = aayg.a.m();
        akzxVarM.u();
        aayg aaygVar = akzxVarM.b;
        aaygVar.c = 1;
        aaygVar.b |= 1;
        if (obj == null) {
            akzxVarM.u();
            aayg aaygVar2 = akzxVarM.b;
            aaygVar2.c = 14;
            aaygVar2.b |= 1;
            return akzxVarM.r();
        }
        defpackage.akzx akzxVarM2 = aayf.a.m();
        if (obj instanceof java.lang.String) {
            akzxVarM.u();
            aayg aaygVar3 = akzxVarM.b;
            aaygVar3.c = 2;
            aaygVar3.b |= 1;
            java.lang.String str = (java.lang.String) obj;
            akzxVarM2.u();
            aayf aayfVar = akzxVarM2.b;
            j$.util.Objects.requireNonNull(str);
            aayfVar.b |= 2;
            aayfVar.d = str;
        } else if (obj instanceof java.lang.Integer) {
            akzxVarM.u();
            aayg aaygVar4 = akzxVarM.b;
            aaygVar4.c = 6;
            aaygVar4.b |= 1;
            int iIntValue = ((java.lang.Integer) obj).intValue();
            akzxVarM2.u();
            aayf aayfVar2 = akzxVarM2.b;
            aayfVar2.b |= 32;
            aayfVar2.h = iIntValue;
        } else if (obj instanceof java.lang.Long) {
            akzxVarM.u();
            aayg aaygVar5 = akzxVarM.b;
            aaygVar5.c = 5;
            aaygVar5.b |= 1;
            long jLongValue = ((java.lang.Long) obj).longValue();
            akzxVarM2.u();
            aayf aayfVar3 = akzxVarM2.b;
            aayfVar3.b |= 16;
            aayfVar3.g = jLongValue;
        } else if (obj instanceof java.lang.Double) {
            akzxVarM.u();
            aayg aaygVar6 = akzxVarM.b;
            aaygVar6.c = 3;
            aaygVar6.b |= 1;
            double dDoubleValue = ((java.lang.Double) obj).doubleValue();
            akzxVarM2.u();
            aayf aayfVar4 = akzxVarM2.b;
            aayfVar4.b |= 4;
            aayfVar4.e = dDoubleValue;
        } else if (obj instanceof java.lang.Float) {
            akzxVarM.u();
            aayg aaygVar7 = akzxVarM.b;
            aaygVar7.c = 4;
            aaygVar7.b |= 1;
            float fFloatValue = ((java.lang.Float) obj).floatValue();
            akzxVarM2.u();
            aayf aayfVar5 = akzxVarM2.b;
            aayfVar5.b |= 8;
            aayfVar5.f = fFloatValue;
        } else if (obj instanceof java.lang.Boolean) {
            akzxVarM.u();
            aayg aaygVar8 = akzxVarM.b;
            aaygVar8.c = 8;
            aaygVar8.b |= 1;
            boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
            akzxVarM2.u();
            aayf aayfVar6 = akzxVarM2.b;
            aayfVar6.b |= 128;
            aayfVar6.j = zBooleanValue;
        } else if (obj instanceof java.lang.Byte) {
            akzxVarM.u();
            aayg aaygVar9 = akzxVarM.b;
            aaygVar9.c = 7;
            aaygVar9.b |= 1;
            byte bByteValue = ((java.lang.Byte) obj).byteValue();
            akzxVarM2.u();
            aayf aayfVar7 = akzxVarM2.b;
            aayfVar7.b |= 64;
            aayfVar7.i = bByteValue;
        } else if (obj instanceof byte[]) {
            akzxVarM.u();
            aayg aaygVar10 = akzxVarM.b;
            aaygVar10.c = 1;
            aaygVar10.b |= 1;
            defpackage.akzc akzcVarU = defpackage.akzc.u((byte[]) obj);
            akzxVarM2.u();
            aayf aayfVar8 = akzxVarM2.b;
            j$.util.Objects.requireNonNull(akzcVarU);
            aayfVar8.b |= 1;
            aayfVar8.c = akzcVarU;
        } else if (obj instanceof java.lang.String[]) {
            akzxVarM.u();
            aayg aaygVar11 = akzxVarM.b;
            aaygVar11.c = 11;
            aaygVar11.b |= 1;
            java.util.List listAsList = java.util.Arrays.asList((java.lang.String[]) obj);
            akzxVarM2.u();
            aayf aayfVar9 = akzxVarM2.b;
            defpackage.alat alatVar = aayfVar9.m;
            if (!alatVar.c()) {
                aayfVar9.m = defpackage.alad.J(alatVar);
            }
            defpackage.akyl.i(listAsList, aayfVar9.m);
        } else {
            int i = 0;
            if (obj instanceof long[]) {
                akzxVarM.u();
                aayg aaygVar12 = akzxVarM.b;
                aaygVar12.c = 12;
                aaygVar12.b |= 1;
                long[] jArr = (long[]) obj;
                java.util.ArrayList arrayList = new java.util.ArrayList(jArr.length);
                while (i < jArr.length) {
                    arrayList.add(java.lang.Long.valueOf(jArr[i]));
                    i++;
                }
                akzxVarM2.u();
                aayf aayfVar10 = akzxVarM2.b;
                defpackage.alan alanVar = aayfVar10.n;
                if (!alanVar.c()) {
                    aayfVar10.n = defpackage.alad.I(alanVar);
                }
                defpackage.akyl.i(arrayList, aayfVar10.n);
            } else if (obj instanceof float[]) {
                akzxVarM.u();
                aayg aaygVar13 = akzxVarM.b;
                aaygVar13.c = 15;
                aaygVar13.b |= 1;
                float[] fArr = (float[]) obj;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(fArr.length);
                while (i < fArr.length) {
                    arrayList2.add(java.lang.Float.valueOf(fArr[i]));
                    i++;
                }
                akzxVarM2.u();
                aayf aayfVar11 = akzxVarM2.b;
                defpackage.alaj alajVar = aayfVar11.o;
                if (!alajVar.c()) {
                    aayfVar11.o = defpackage.alad.G(alajVar);
                }
                defpackage.akyl.i(arrayList2, aayfVar11.o);
            } else if (obj instanceof com.google.android.gms.wearable.Asset) {
                akzxVarM.u();
                aayg aaygVar14 = akzxVarM.b;
                aaygVar14.c = 13;
                aaygVar14.b |= 1;
                list.add((com.google.android.gms.wearable.Asset) obj);
                int size = list.size() - 1;
                akzxVarM2.u();
                aayf aayfVar12 = akzxVarM2.b;
                aayfVar12.b |= 256;
                aayfVar12.p = size;
            } else if (obj instanceof aawb) {
                akzxVarM.u();
                aayg aaygVar15 = akzxVarM.b;
                aaygVar15.c = 9;
                aaygVar15.b |= 1;
                aawb aawbVar = (aawb) obj;
                java.util.TreeSet<java.lang.String> treeSet = new java.util.TreeSet(aawbVar.c());
                aayh[] aayhVarArr = new aayh[treeSet.size()];
                for (java.lang.String str2 : treeSet) {
                    defpackage.akzx akzxVarM3 = aayh.a.m();
                    akzxVarM3.u();
                    aayh aayhVar = akzxVarM3.b;
                    j$.util.Objects.requireNonNull(str2);
                    aayhVar.b |= 1;
                    aayhVar.c = str2;
                    aayg aaygVarC = C(list, aawbVar.b(str2));
                    akzxVarM3.u();
                    aayh aayhVar2 = akzxVarM3.b;
                    j$.util.Objects.requireNonNull(aaygVarC);
                    aayhVar2.d = aaygVarC;
                    aayhVar2.b |= 2;
                    aayhVarArr[i] = (aayh) akzxVarM3.r();
                    i++;
                }
                java.util.List listAsList2 = java.util.Arrays.asList(aayhVarArr);
                akzxVarM2.u();
                aayf aayfVar13 = akzxVarM2.b;
                defpackage.alat alatVar2 = aayfVar13.k;
                if (!alatVar2.c()) {
                    aayfVar13.k = defpackage.alad.J(alatVar2);
                }
                defpackage.akyl.i(listAsList2, aayfVar13.k);
            } else {
                if (!(obj instanceof java.util.ArrayList)) {
                    throw new java.lang.RuntimeException("newFieldValueFromValue: unexpected value ".concat(java.lang.String.valueOf(obj.getClass().getSimpleName())));
                }
                akzxVarM.u();
                aayg aaygVar16 = akzxVarM.b;
                aaygVar16.c = 10;
                aaygVar16.b |= 1;
                java.util.ArrayList arrayList3 = (java.util.ArrayList) obj;
                int size2 = arrayList3.size();
                java.lang.Object obj2 = null;
                int i2 = 14;
                while (i < size2) {
                    java.lang.Object obj3 = arrayList3.get(i);
                    aayg aaygVarC2 = C(list, obj3);
                    int i3 = aaygVarC2.c;
                    int iB5 = B(i3);
                    if ((iB5 == 0 || iB5 != 14) && (((iB = B(i3)) == 0 || iB != 2) && (((iB2 = B(i3)) == 0 || iB2 != 6) && ((iB3 = B(i3)) == 0 || iB3 != 9)))) {
                        throw new java.lang.IllegalArgumentException("The only ArrayList element types supported by DataBundleUtil are String, Integer, Bundle, and null, but this ArrayList contains a ".concat(java.lang.String.valueOf(java.lang.String.valueOf(obj3.getClass()))));
                    }
                    if (i2 != 14) {
                        iB4 = B(i3);
                        if (iB4 == 0) {
                            iB4 = 1;
                        }
                        if (iB4 != i2) {
                            throw new java.lang.IllegalArgumentException("ArrayList elements must all be of the sameclass, but this one contains a " + java.lang.String.valueOf(obj2.getClass()) + " and a " + java.lang.String.valueOf(obj3.getClass()));
                        }
                    } else {
                        int iB6 = B(i3);
                        if (iB6 == 0 || iB6 != 14) {
                            int iB7 = B(i3);
                            if (iB7 == 0) {
                                iB7 = 1;
                            }
                            i2 = iB7;
                            obj2 = obj3;
                        } else {
                            i2 = 14;
                            iB4 = B(i3);
                            if (iB4 == 0) {
                                iB4 = 1;
                            }
                            if (iB4 != i2) {
                                throw new java.lang.IllegalArgumentException("ArrayList elements must all be of the sameclass, but this one contains a " + java.lang.String.valueOf(obj2.getClass()) + " and a " + java.lang.String.valueOf(obj3.getClass()));
                            }
                        }
                    }
                    akzxVarM2.u();
                    aayf aayfVar14 = akzxVarM2.b;
                    j$.util.Objects.requireNonNull(aaygVarC2);
                    defpackage.alat alatVar3 = aayfVar14.l;
                    if (!alatVar3.c()) {
                        aayfVar14.l = defpackage.alad.J(alatVar3);
                    }
                    aayfVar14.l.add(aaygVarC2);
                    i++;
                }
            }
        }
        akzxVarM.u();
        aayg aaygVar17 = akzxVarM.b;
        aayf aayfVarR = akzxVarM2.r();
        j$.util.Objects.requireNonNull(aayfVarR);
        aaygVar17.d = aayfVarR;
        aaygVar17.b |= 2;
        return akzxVarM.r();
    }

    public static void D(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.io.IOException unused) {
            }
        }
    }

    public static com.google.android.gms.common.api.Status E(int i) {
        java.lang.String strAA;
        switch (i) {
            case 4000:
                strAA = "TARGET_NODE_NOT_CONNECTED";
                break;
            case 4001:
                strAA = "DUPLICATE_LISTENER";
                break;
            case 4002:
                strAA = "UNKNOWN_LISTENER";
                break;
            case 4003:
                strAA = "DATA_ITEM_TOO_LARGE";
                break;
            case 4004:
                strAA = "INVALID_TARGET_NODE";
                break;
            case 4005:
                strAA = "ASSET_UNAVAILABLE";
                break;
            case 4006:
                strAA = "DUPLICATE_CAPABILITY";
                break;
            case 4007:
                strAA = "UNKNOWN_CAPABILITY";
                break;
            case 4008:
                strAA = "WIFI_CREDENTIAL_SYNC_NO_CREDENTIAL_FETCHED";
                break;
            case 4009:
                strAA = "UNSUPPORTED_BY_TARGET";
                break;
            case 4010:
                strAA = "ACCOUNT_KEY_CREATION_FAILED";
                break;
            case 4011:
            default:
                strAA = defpackage.aais.aA(i);
                break;
            case 4012:
                strAA = "MIGRATION_NOT_CANCELLABLE";
                break;
            case 4013:
                strAA = "NO_MIGRATION_FOUND_TO_CANCEL";
                break;
            case 4014:
                strAA = "FEATURE_DISABLED";
                break;
            case 4015:
                strAA = "WIFI_CONNECTION_FAILED";
                break;
        }
        return new com.google.android.gms.common.api.Status(i, strAA, null, null);
    }

    public static void F(java.lang.String str, java.lang.Object... objArr) {
        android.util.Log.e("WakeLock", java.lang.String.format(str, objArr));
    }

    public static void G(java.lang.String str, java.lang.Throwable th) {
        if (android.util.Log.isLoggable("PeopleClient", 5)) {
            android.util.Log.w("PeopleClient", str, th);
        }
    }

    public static amwp H(java.lang.String str, java.lang.String str2) {
        defpackage.aooh.f(str, "rawContent");
        defpackage.aooh.f(str2, "languageCode");
        return new amwp(new zjn(str, str2, 3, (byte[]) null), abaz.c(str) + abaz.c(str2) + 150);
    }

    public static amwp I(java.lang.String str, java.lang.String str2) {
        zjn zjnVar = new zjn(str, str2, 2, (byte[]) null);
        if (str == null) {
            str = "";
        }
        int iC = abaz.c(str) + 150 + abaz.c("") + abaz.c("");
        if (str2 == null) {
            str2 = "";
        }
        return new amwp(zjnVar, iC + abaz.c(str2));
    }

    public static void J(defpackage.aonn aonnVar, defpackage.aonn aonnVar2, defpackage.cmw cmwVar, float f, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.aonn aonnVar3;
        defpackage.aonn aonnVar4;
        defpackage.cmw cmwVar2;
        float f2;
        defpackage.aooh.f(aonnVar, "leadingButton");
        defpackage.aooh.f(aonnVar2, "trailingButton");
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1359053646);
        if (i3 == 0) {
            i2 = (true != cavVarB.D(aonnVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.D(aonnVar2) ? 16 : 32;
        }
        int i4 = i2 | 384;
        if ((i & 3072) == 0) {
            i4 = i2 | 1408;
        }
        if (cavVarB.H((i4 & 1171) != 1170, i4 & 1)) {
            ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
            if ((i & 1) == 0 || cavVarB.E()) {
                cmwVar = defpackage.cmw.c;
                acqt acqtVar = acqt.a;
                defpackage.bfy bfyVar = acte.a;
                f = 2.0f;
            } else {
                cavVarB.s();
            }
            cmwVar2 = cmwVar;
            f2 = f;
            cavVarB.l();
            int i5 = i4 & 1022;
            aonnVar3 = aonnVar;
            aonnVar4 = aonnVar2;
            ro.u(aonnVar3, aonnVar4, cmwVar2, f2, cavVarB, i5);
        } else {
            aonnVar3 = aonnVar;
            aonnVar4 = aonnVar2;
            cavVarB.s();
            cmwVar2 = cmwVar;
            f2 = f;
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new acqu(aonnVar3, aonnVar4, cmwVar2, f2, i, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0136  */
    /* JADX WARN: Code duplicated, block: B:101:0x0139  */
    /* JADX WARN: Code duplicated, block: B:103:0x013d  */
    /* JADX WARN: Code duplicated, block: B:104:0x0140  */
    /* JADX WARN: Code duplicated, block: B:106:0x0143  */
    /* JADX WARN: Code duplicated, block: B:107:0x0146  */
    /* JADX WARN: Code duplicated, block: B:109:0x0149  */
    /* JADX WARN: Code duplicated, block: B:110:0x014c  */
    /* JADX WARN: Code duplicated, block: B:112:0x014f  */
    /* JADX WARN: Code duplicated, block: B:113:0x0152  */
    /* JADX WARN: Code duplicated, block: B:115:0x0156  */
    /* JADX WARN: Code duplicated, block: B:116:0x0159  */
    /* JADX WARN: Code duplicated, block: B:119:0x018b  */
    /* JADX WARN: Code duplicated, block: B:122:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:44:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:54:0x009c  */
    /* JADX WARN: Code duplicated, block: B:55:0x009f  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:80:0x00df  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:91:0x0101  */
    /* JADX WARN: Code duplicated, block: B:93:0x0118  */
    /* JADX WARN: Code duplicated, block: B:99:0x0134 A[DONT_INVERT] */
    public static void K(defpackage.cmw cmwVar, defpackage.aonn aonnVar, defpackage.aonn aonnVar2, defpackage.aonn aonnVar3, defpackage.aonn aonnVar4, int i, long j, long j2, defpackage.azz azzVar, defpackage.aono aonoVar, defpackage.cav cavVar, int i2, int i3) {
        int i4;
        defpackage.aonn aonnVar5;
        int i5;
        defpackage.aonn aonnVar6;
        int i6;
        int i7;
        defpackage.aonn aonnVar7;
        int i8;
        int i9;
        int i10;
        boolean z;
        defpackage.cmw cmwVar2;
        defpackage.aonn aonnVar8;
        int i11;
        defpackage.azz azzVar2;
        defpackage.aonn aonnVar9;
        defpackage.aonn aonnVar10;
        defpackage.aonn aonnVar11;
        long j3;
        defpackage.cdk cdkVarI;
        int i12;
        defpackage.cmw cmwVar3;
        defpackage.aonn aonnVar12;
        defpackage.aonn aonnVar13;
        defpackage.aonn aonnVar14;
        defpackage.aonn aonnVar15;
        int i13;
        defpackage.azz azrVar;
        int i14;
        defpackage.aonn aonnVar16;
        defpackage.aonn aonnVar17;
        int i15;
        defpackage.aonn aonnVar18;
        defpackage.aonn aonnVar19;
        long j4;
        int i16;
        int i17;
        int i18;
        defpackage.aooh.f(aonoVar, "content");
        int i19 = i3 & 1;
        defpackage.cav cavVarB = cavVar.b(303642276);
        if (i19 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (true != cavVarB.B(cmwVar) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        int i20 = i3 & 2;
        if (i20 == 0) {
            if ((i2 & 48) == 0) {
                aonnVar5 = aonnVar;
                i4 |= true != cavVarB.D(aonnVar5) ? 16 : 32;
            }
            i5 = i3 & 4;
            if (i5 != 0) {
                if ((i2 & 384) == 0) {
                    aonnVar6 = aonnVar2;
                    if (true != cavVarB.D(aonnVar6)) {
                        i6 = 128;
                    } else {
                        i6 = 256;
                    }
                    i4 |= i6;
                }
                i7 = i3 & 8;
                if (i7 != 0) {
                    if ((i2 & 3072) == 0) {
                        aonnVar7 = aonnVar3;
                        if (true != cavVarB.D(aonnVar7)) {
                            i8 = 1024;
                        } else {
                            i8 = 2048;
                        }
                        i4 |= i8;
                    }
                    i9 = i3 & 16;
                    if (i9 != 0) {
                        if ((i2 & 24576) == 0) {
                            if (true != cavVarB.D(aonnVar4)) {
                                i10 = 8192;
                            } else {
                                i10 = 16384;
                            }
                            i4 |= i10;
                        }
                        if ((196608 & i2) == 0) {
                            i18 = 65536;
                            if ((i3 & 32) == 0 && cavVarB.z(i)) {
                                i18 = 131072;
                            }
                            i4 |= i18;
                        }
                        if ((1572864 & i2) == 0) {
                            if (true != cavVarB.A(j)) {
                                i17 = 524288;
                            } else {
                                i17 = 1048576;
                            }
                            i4 |= i17;
                        }
                        if ((12582912 & i2) == 0) {
                            i4 |= 4194304;
                        }
                        if ((100663296 & i2) == 0) {
                            i4 |= 33554432;
                        }
                        if ((805306368 & i2) == 0) {
                            if (true != cavVarB.D(aonoVar)) {
                                i16 = 268435456;
                            } else {
                                i16 = 536870912;
                            }
                            i4 |= i16;
                        }
                        if ((306783379 & i4) != 306783378) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (cavVarB.H(z, i4 & 1)) {
                            i12 = i3 & 32;
                            ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
                            if ((i2 & 1) != 0 || cavVarB.E()) {
                                if (i19 != 0) {
                                    cmwVar3 = defpackage.cmw.c;
                                } else {
                                    cmwVar3 = cmwVar;
                                }
                                if (i20 != 0) {
                                    aonnVar12 = acpv.a;
                                } else {
                                    aonnVar12 = aonnVar5;
                                }
                                if (i5 != 0) {
                                    aonnVar13 = acpv.b;
                                } else {
                                    aonnVar13 = aonnVar6;
                                }
                                if (i7 != 0) {
                                    aonnVar14 = acpv.c;
                                } else {
                                    aonnVar14 = aonnVar7;
                                }
                                if (i9 != 0) {
                                    aonnVar15 = acpv.d;
                                } else {
                                    aonnVar15 = aonnVar4;
                                }
                                if (i12 != 0) {
                                    i4 &= -458753;
                                    i13 = 2;
                                } else {
                                    i13 = i;
                                }
                                long jR = defpackage.abrz.r(j, cavVarB);
                                azrVar = new azr(defpackage.uu.j(cavVarB), defpackage.uu.f(cavVarB));
                                i14 = i4 & (-264241153);
                                aonnVar16 = aonnVar13;
                                aonnVar17 = aonnVar15;
                                i15 = i13;
                                aonnVar18 = aonnVar12;
                                aonnVar19 = aonnVar14;
                                j4 = jR;
                            } else {
                                cavVarB.s();
                                if (i12 != 0) {
                                    i4 &= -458753;
                                }
                                cmwVar3 = cmwVar;
                                i15 = i;
                                i14 = i4 & (-264241153);
                                aonnVar18 = aonnVar5;
                                aonnVar16 = aonnVar6;
                                aonnVar19 = aonnVar7;
                                aonnVar17 = aonnVar4;
                                j4 = j2;
                                azrVar = azzVar;
                            }
                            cavVarB.l();
                            rm.u(cmwVar3, aonnVar18, aonnVar16, aonnVar19, aonnVar17, i15, j, j4, azrVar, aonoVar, cavVarB, i14 & 1883242494);
                            i11 = i15;
                            azzVar2 = azrVar;
                            aonnVar8 = aonnVar17;
                            j3 = j4;
                            aonnVar11 = aonnVar19;
                            aonnVar10 = aonnVar16;
                            aonnVar9 = aonnVar18;
                            cmwVar2 = cmwVar3;
                        } else {
                            cavVarB.s();
                            cmwVar2 = cmwVar;
                            aonnVar8 = aonnVar4;
                            i11 = i;
                            azzVar2 = azzVar;
                            aonnVar9 = aonnVar5;
                            aonnVar10 = aonnVar6;
                            aonnVar11 = aonnVar7;
                            j3 = j2;
                        }
                        cdkVarI = cavVarB.I();
                        if (cdkVarI != null) {
                            cdkVarI.c = new acql(cmwVar2, aonnVar9, aonnVar10, aonnVar11, aonnVar8, i11, j, j3, azzVar2, aonoVar, i2, i3);
                        }
                    }
                    i4 |= 24576;
                    if ((196608 & i2) == 0) {
                        i18 = 65536;
                        if ((i3 & 32) == 0) {
                            i18 = 131072;
                        }
                        i4 |= i18;
                    }
                    if ((1572864 & i2) == 0) {
                        if (true != cavVarB.A(j)) {
                            i17 = 524288;
                        } else {
                            i17 = 1048576;
                        }
                        i4 |= i17;
                    }
                    if ((12582912 & i2) == 0) {
                        i4 |= 4194304;
                    }
                    if ((100663296 & i2) == 0) {
                        i4 |= 33554432;
                    }
                    if ((805306368 & i2) == 0) {
                        if (true != cavVarB.D(aonoVar)) {
                            i16 = 268435456;
                        } else {
                            i16 = 536870912;
                        }
                        i4 |= i16;
                    }
                    if ((306783379 & i4) != 306783378) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (cavVarB.H(z, i4 & 1)) {
                        i12 = i3 & 32;
                        ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
                        if ((i2 & 1) != 0) {
                            if (i19 != 0) {
                                cmwVar3 = defpackage.cmw.c;
                            } else {
                                cmwVar3 = cmwVar;
                            }
                            if (i20 != 0) {
                                aonnVar12 = acpv.a;
                            } else {
                                aonnVar12 = aonnVar5;
                            }
                            if (i5 != 0) {
                                aonnVar13 = acpv.b;
                            } else {
                                aonnVar13 = aonnVar6;
                            }
                            if (i7 != 0) {
                                aonnVar14 = acpv.c;
                            } else {
                                aonnVar14 = aonnVar7;
                            }
                            if (i9 != 0) {
                                aonnVar15 = acpv.d;
                            } else {
                                aonnVar15 = aonnVar4;
                            }
                            if (i12 != 0) {
                                i4 &= -458753;
                                i13 = 2;
                            } else {
                                i13 = i;
                            }
                            long jR2 = defpackage.abrz.r(j, cavVarB);
                            azrVar = new azr(defpackage.uu.j(cavVarB), defpackage.uu.f(cavVarB));
                            i14 = i4 & (-264241153);
                            aonnVar16 = aonnVar13;
                            aonnVar17 = aonnVar15;
                            i15 = i13;
                            aonnVar18 = aonnVar12;
                            aonnVar19 = aonnVar14;
                            j4 = jR2;
                        } else {
                            if (i19 != 0) {
                                cmwVar3 = defpackage.cmw.c;
                            } else {
                                cmwVar3 = cmwVar;
                            }
                            if (i20 != 0) {
                                aonnVar12 = acpv.a;
                            } else {
                                aonnVar12 = aonnVar5;
                            }
                            if (i5 != 0) {
                                aonnVar13 = acpv.b;
                            } else {
                                aonnVar13 = aonnVar6;
                            }
                            if (i7 != 0) {
                                aonnVar14 = acpv.c;
                            } else {
                                aonnVar14 = aonnVar7;
                            }
                            if (i9 != 0) {
                                aonnVar15 = acpv.d;
                            } else {
                                aonnVar15 = aonnVar4;
                            }
                            if (i12 != 0) {
                                i4 &= -458753;
                                i13 = 2;
                            } else {
                                i13 = i;
                            }
                            long jR3 = defpackage.abrz.r(j, cavVarB);
                            azrVar = new azr(defpackage.uu.j(cavVarB), defpackage.uu.f(cavVarB));
                            i14 = i4 & (-264241153);
                            aonnVar16 = aonnVar13;
                            aonnVar17 = aonnVar15;
                            i15 = i13;
                            aonnVar18 = aonnVar12;
                            aonnVar19 = aonnVar14;
                            j4 = jR3;
                        }
                        cavVarB.l();
                        rm.u(cmwVar3, aonnVar18, aonnVar16, aonnVar19, aonnVar17, i15, j, j4, azrVar, aonoVar, cavVarB, i14 & 1883242494);
                        i11 = i15;
                        azzVar2 = azrVar;
                        aonnVar8 = aonnVar17;
                        j3 = j4;
                        aonnVar11 = aonnVar19;
                        aonnVar10 = aonnVar16;
                        aonnVar9 = aonnVar18;
                        cmwVar2 = cmwVar3;
                    } else {
                        cavVarB.s();
                        cmwVar2 = cmwVar;
                        aonnVar8 = aonnVar4;
                        i11 = i;
                        azzVar2 = azzVar;
                        aonnVar9 = aonnVar5;
                        aonnVar10 = aonnVar6;
                        aonnVar11 = aonnVar7;
                        j3 = j2;
                    }
                    cdkVarI = cavVarB.I();
                    if (cdkVarI != null) {
                        cdkVarI.c = new acql(cmwVar2, aonnVar9, aonnVar10, aonnVar11, aonnVar8, i11, j, j3, azzVar2, aonoVar, i2, i3);
                    }
                }
                i4 |= 3072;
                aonnVar7 = aonnVar3;
                i9 = i3 & 16;
                if (i9 != 0) {
                    if ((i2 & 24576) == 0) {
                        if (true != cavVarB.D(aonnVar4)) {
                            i10 = 8192;
                        } else {
                            i10 = 16384;
                        }
                        i4 |= i10;
                    }
                    if ((196608 & i2) == 0) {
                        i18 = 65536;
                        if ((i3 & 32) == 0) {
                            i18 = 131072;
                        }
                        i4 |= i18;
                    }
                    if ((1572864 & i2) == 0) {
                        if (true != cavVarB.A(j)) {
                            i17 = 524288;
                        } else {
                            i17 = 1048576;
                        }
                        i4 |= i17;
                    }
                    if ((12582912 & i2) == 0) {
                        i4 |= 4194304;
                    }
                    if ((100663296 & i2) == 0) {
                        i4 |= 33554432;
                    }
                    if ((805306368 & i2) == 0) {
                        if (true != cavVarB.D(aonoVar)) {
                            i16 = 268435456;
                        } else {
                            i16 = 536870912;
                        }
                        i4 |= i16;
                    }
                    if ((306783379 & i4) != 306783378) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (cavVarB.H(z, i4 & 1)) {
                        i12 = i3 & 32;
                        ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
                        if ((i2 & 1) != 0) {
                            if (i19 != 0) {
                                cmwVar3 = defpackage.cmw.c;
                            } else {
                                cmwVar3 = cmwVar;
                            }
                            if (i20 != 0) {
                                aonnVar12 = acpv.a;
                            } else {
                                aonnVar12 = aonnVar5;
                            }
                            if (i5 != 0) {
                                aonnVar13 = acpv.b;
                            } else {
                                aonnVar13 = aonnVar6;
                            }
                            if (i7 != 0) {
                                aonnVar14 = acpv.c;
                            } else {
                                aonnVar14 = aonnVar7;
                            }
                            if (i9 != 0) {
                                aonnVar15 = acpv.d;
                            } else {
                                aonnVar15 = aonnVar4;
                            }
                            if (i12 != 0) {
                                i4 &= -458753;
                                i13 = 2;
                            } else {
                                i13 = i;
                            }
                            long jR4 = defpackage.abrz.r(j, cavVarB);
                            azrVar = new azr(defpackage.uu.j(cavVarB), defpackage.uu.f(cavVarB));
                            i14 = i4 & (-264241153);
                            aonnVar16 = aonnVar13;
                            aonnVar17 = aonnVar15;
                            i15 = i13;
                            aonnVar18 = aonnVar12;
                            aonnVar19 = aonnVar14;
                            j4 = jR4;
                        } else {
                            if (i19 != 0) {
                                cmwVar3 = defpackage.cmw.c;
                            } else {
                                cmwVar3 = cmwVar;
                            }
                            if (i20 != 0) {
                                aonnVar12 = acpv.a;
                            } else {
                                aonnVar12 = aonnVar5;
                            }
                            if (i5 != 0) {
                                aonnVar13 = acpv.b;
                            } else {
                                aonnVar13 = aonnVar6;
                            }
                            if (i7 != 0) {
                                aonnVar14 = acpv.c;
                            } else {
                                aonnVar14 = aonnVar7;
                            }
                            if (i9 != 0) {
                                aonnVar15 = acpv.d;
                            } else {
                                aonnVar15 = aonnVar4;
                            }
                            if (i12 != 0) {
                                i4 &= -458753;
                                i13 = 2;
                            } else {
                                i13 = i;
                            }
                            long jR5 = defpackage.abrz.r(j, cavVarB);
                            azrVar = new azr(defpackage.uu.j(cavVarB), defpackage.uu.f(cavVarB));
                            i14 = i4 & (-264241153);
                            aonnVar16 = aonnVar13;
                            aonnVar17 = aonnVar15;
                            i15 = i13;
                            aonnVar18 = aonnVar12;
                            aonnVar19 = aonnVar14;
                            j4 = jR5;
                        }
                        cavVarB.l();
                        rm.u(cmwVar3, aonnVar18, aonnVar16, aonnVar19, aonnVar17, i15, j, j4, azrVar, aonoVar, cavVarB, i14 & 1883242494);
                        i11 = i15;
                        azzVar2 = azrVar;
                        aonnVar8 = aonnVar17;
                        j3 = j4;
                        aonnVar11 = aonnVar19;
                        aonnVar10 = aonnVar16;
                        aonnVar9 = aonnVar18;
                        cmwVar2 = cmwVar3;
                    } else {
                        cavVarB.s();
                        cmwVar2 = cmwVar;
                        aonnVar8 = aonnVar4;
                        i11 = i;
                        azzVar2 = azzVar;
                        aonnVar9 = aonnVar5;
                        aonnVar10 = aonnVar6;
                        aonnVar11 = aonnVar7;
                        j3 = j2;
                    }
                    cdkVarI = cavVarB.I();
                    if (cdkVarI != null) {
                        cdkVarI.c = new acql(cmwVar2, aonnVar9, aonnVar10, aonnVar11, aonnVar8, i11, j, j3, azzVar2, aonoVar, i2, i3);
                    }
                }
                i4 |= 24576;
                if ((196608 & i2) == 0) {
                    i18 = 65536;
                    if ((i3 & 32) == 0) {
                        i18 = 131072;
                    }
                    i4 |= i18;
                }
                if ((1572864 & i2) == 0) {
                    if (true != cavVarB.A(j)) {
                        i17 = 524288;
                    } else {
                        i17 = 1048576;
                    }
                    i4 |= i17;
                }
                if ((12582912 & i2) == 0) {
                    i4 |= 4194304;
                }
                if ((100663296 & i2) == 0) {
                    i4 |= 33554432;
                }
                if ((805306368 & i2) == 0) {
                    if (true != cavVarB.D(aonoVar)) {
                        i16 = 268435456;
                    } else {
                        i16 = 536870912;
                    }
                    i4 |= i16;
                }
                if ((306783379 & i4) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (cavVarB.H(z, i4 & 1)) {
                    i12 = i3 & 32;
                    ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
                    if ((i2 & 1) != 0) {
                        if (i19 != 0) {
                            cmwVar3 = defpackage.cmw.c;
                        } else {
                            cmwVar3 = cmwVar;
                        }
                        if (i20 != 0) {
                            aonnVar12 = acpv.a;
                        } else {
                            aonnVar12 = aonnVar5;
                        }
                        if (i5 != 0) {
                            aonnVar13 = acpv.b;
                        } else {
                            aonnVar13 = aonnVar6;
                        }
                        if (i7 != 0) {
                            aonnVar14 = acpv.c;
                        } else {
                            aonnVar14 = aonnVar7;
                        }
                        if (i9 != 0) {
                            aonnVar15 = acpv.d;
                        } else {
                            aonnVar15 = aonnVar4;
                        }
                        if (i12 != 0) {
                            i4 &= -458753;
                            i13 = 2;
                        } else {
                            i13 = i;
                        }
                        long jR6 = defpackage.abrz.r(j, cavVarB);
                        azrVar = new azr(defpackage.uu.j(cavVarB), defpackage.uu.f(cavVarB));
                        i14 = i4 & (-264241153);
                        aonnVar16 = aonnVar13;
                        aonnVar17 = aonnVar15;
                        i15 = i13;
                        aonnVar18 = aonnVar12;
                        aonnVar19 = aonnVar14;
                        j4 = jR6;
                    } else {
                        if (i19 != 0) {
                            cmwVar3 = defpackage.cmw.c;
                        } else {
                            cmwVar3 = cmwVar;
                        }
                        if (i20 != 0) {
                            aonnVar12 = acpv.a;
                        } else {
                            aonnVar12 = aonnVar5;
                        }
                        if (i5 != 0) {
                            aonnVar13 = acpv.b;
                        } else {
                            aonnVar13 = aonnVar6;
                        }
                        if (i7 != 0) {
                            aonnVar14 = acpv.c;
                        } else {
                            aonnVar14 = aonnVar7;
                        }
                        if (i9 != 0) {
                            aonnVar15 = acpv.d;
                        } else {
                            aonnVar15 = aonnVar4;
                        }
                        if (i12 != 0) {
                            i4 &= -458753;
                            i13 = 2;
                        } else {
                            i13 = i;
                        }
                        long jR7 = defpackage.abrz.r(j, cavVarB);
                        azrVar = new azr(defpackage.uu.j(cavVarB), defpackage.uu.f(cavVarB));
                        i14 = i4 & (-264241153);
                        aonnVar16 = aonnVar13;
                        aonnVar17 = aonnVar15;
                        i15 = i13;
                        aonnVar18 = aonnVar12;
                        aonnVar19 = aonnVar14;
                        j4 = jR7;
                    }
                    cavVarB.l();
                    rm.u(cmwVar3, aonnVar18, aonnVar16, aonnVar19, aonnVar17, i15, j, j4, azrVar, aonoVar, cavVarB, i14 & 1883242494);
                    i11 = i15;
                    azzVar2 = azrVar;
                    aonnVar8 = aonnVar17;
                    j3 = j4;
                    aonnVar11 = aonnVar19;
                    aonnVar10 = aonnVar16;
                    aonnVar9 = aonnVar18;
                    cmwVar2 = cmwVar3;
                } else {
                    cavVarB.s();
                    cmwVar2 = cmwVar;
                    aonnVar8 = aonnVar4;
                    i11 = i;
                    azzVar2 = azzVar;
                    aonnVar9 = aonnVar5;
                    aonnVar10 = aonnVar6;
                    aonnVar11 = aonnVar7;
                    j3 = j2;
                }
                cdkVarI = cavVarB.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new acql(cmwVar2, aonnVar9, aonnVar10, aonnVar11, aonnVar8, i11, j, j3, azzVar2, aonoVar, i2, i3);
                }
            }
            i4 |= 384;
            aonnVar6 = aonnVar2;
            i7 = i3 & 8;
            if (i7 != 0) {
                if ((i2 & 3072) == 0) {
                    aonnVar7 = aonnVar3;
                    if (true != cavVarB.D(aonnVar7)) {
                        i8 = 1024;
                    } else {
                        i8 = 2048;
                    }
                    i4 |= i8;
                }
                i9 = i3 & 16;
                if (i9 != 0) {
                    if ((i2 & 24576) == 0) {
                        if (true != cavVarB.D(aonnVar4)) {
                            i10 = 8192;
                        } else {
                            i10 = 16384;
                        }
                        i4 |= i10;
                    }
                    if ((196608 & i2) == 0) {
                        i18 = 65536;
                        if ((i3 & 32) == 0) {
                            i18 = 131072;
                        }
                        i4 |= i18;
                    }
                    if ((1572864 & i2) == 0) {
                        if (true != cavVarB.A(j)) {
                            i17 = 524288;
                        } else {
                            i17 = 1048576;
                        }
                        i4 |= i17;
                    }
                    if ((12582912 & i2) == 0) {
                        i4 |= 4194304;
                    }
                    if ((100663296 & i2) == 0) {
                        i4 |= 33554432;
                    }
                    if ((805306368 & i2) == 0) {
                        if (true != cavVarB.D(aonoVar)) {
                            i16 = 268435456;
                        } else {
                            i16 = 536870912;
                        }
                        i4 |= i16;
                    }
                    if ((306783379 & i4) != 306783378) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (cavVarB.H(z, i4 & 1)) {
                        i12 = i3 & 32;
                        ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
                        if ((i2 & 1) != 0) {
                            if (i19 != 0) {
                                cmwVar3 = defpackage.cmw.c;
                            } else {
                                cmwVar3 = cmwVar;
                            }
                            if (i20 != 0) {
                                aonnVar12 = acpv.a;
                            } else {
                                aonnVar12 = aonnVar5;
                            }
                            if (i5 != 0) {
                                aonnVar13 = acpv.b;
                            } else {
                                aonnVar13 = aonnVar6;
                            }
                            if (i7 != 0) {
                                aonnVar14 = acpv.c;
                            } else {
                                aonnVar14 = aonnVar7;
                            }
                            if (i9 != 0) {
                                aonnVar15 = acpv.d;
                            } else {
                                aonnVar15 = aonnVar4;
                            }
                            if (i12 != 0) {
                                i4 &= -458753;
                                i13 = 2;
                            } else {
                                i13 = i;
                            }
                            long jR8 = defpackage.abrz.r(j, cavVarB);
                            azrVar = new azr(defpackage.uu.j(cavVarB), defpackage.uu.f(cavVarB));
                            i14 = i4 & (-264241153);
                            aonnVar16 = aonnVar13;
                            aonnVar17 = aonnVar15;
                            i15 = i13;
                            aonnVar18 = aonnVar12;
                            aonnVar19 = aonnVar14;
                            j4 = jR8;
                        } else {
                            if (i19 != 0) {
                                cmwVar3 = defpackage.cmw.c;
                            } else {
                                cmwVar3 = cmwVar;
                            }
                            if (i20 != 0) {
                                aonnVar12 = acpv.a;
                            } else {
                                aonnVar12 = aonnVar5;
                            }
                            if (i5 != 0) {
                                aonnVar13 = acpv.b;
                            } else {
                                aonnVar13 = aonnVar6;
                            }
                            if (i7 != 0) {
                                aonnVar14 = acpv.c;
                            } else {
                                aonnVar14 = aonnVar7;
                            }
                            if (i9 != 0) {
                                aonnVar15 = acpv.d;
                            } else {
                                aonnVar15 = aonnVar4;
                            }
                            if (i12 != 0) {
                                i4 &= -458753;
                                i13 = 2;
                            } else {
                                i13 = i;
                            }
                            long jR9 = defpackage.abrz.r(j, cavVarB);
                            azrVar = new azr(defpackage.uu.j(cavVarB), defpackage.uu.f(cavVarB));
                            i14 = i4 & (-264241153);
                            aonnVar16 = aonnVar13;
                            aonnVar17 = aonnVar15;
                            i15 = i13;
                            aonnVar18 = aonnVar12;
                            aonnVar19 = aonnVar14;
                            j4 = jR9;
                        }
                        cavVarB.l();
                        rm.u(cmwVar3, aonnVar18, aonnVar16, aonnVar19, aonnVar17, i15, j, j4, azrVar, aonoVar, cavVarB, i14 & 1883242494);
                        i11 = i15;
                        azzVar2 = azrVar;
                        aonnVar8 = aonnVar17;
                        j3 = j4;
                        aonnVar11 = aonnVar19;
                        aonnVar10 = aonnVar16;
                        aonnVar9 = aonnVar18;
                        cmwVar2 = cmwVar3;
                    } else {
                        cavVarB.s();
                        cmwVar2 = cmwVar;
                        aonnVar8 = aonnVar4;
                        i11 = i;
                        azzVar2 = azzVar;
                        aonnVar9 = aonnVar5;
                        aonnVar10 = aonnVar6;
                        aonnVar11 = aonnVar7;
                        j3 = j2;
                    }
                    cdkVarI = cavVarB.I();
                    if (cdkVarI != null) {
                        cdkVarI.c = new acql(cmwVar2, aonnVar9, aonnVar10, aonnVar11, aonnVar8, i11, j, j3, azzVar2, aonoVar, i2, i3);
                    }
                }
                i4 |= 24576;
                if ((196608 & i2) == 0) {
                    i18 = 65536;
                    if ((i3 & 32) == 0) {
                        i18 = 131072;
                    }
                    i4 |= i18;
                }
                if ((1572864 & i2) == 0) {
                    if (true != cavVarB.A(j)) {
                        i17 = 524288;
                    } else {
                        i17 = 1048576;
                    }
                    i4 |= i17;
                }
                if ((12582912 & i2) == 0) {
                    i4 |= 4194304;
                }
                if ((100663296 & i2) == 0) {
                    i4 |= 33554432;
                }
                if ((805306368 & i2) == 0) {
                    if (true != cavVarB.D(aonoVar)) {
                        i16 = 268435456;
                    } else {
                        i16 = 536870912;
                    }
                    i4 |= i16;
                }
                if ((306783379 & i4) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (cavVarB.H(z, i4 & 1)) {
                    i12 = i3 & 32;
                    ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
                    if ((i2 & 1) != 0) {
                        if (i19 != 0) {
                            cmwVar3 = defpackage.cmw.c;
                        } else {
                            cmwVar3 = cmwVar;
                        }
                        if (i20 != 0) {
                            aonnVar12 = acpv.a;
                        } else {
                            aonnVar12 = aonnVar5;
                        }
                        if (i5 != 0) {
                            aonnVar13 = acpv.b;
                        } else {
                            aonnVar13 = aonnVar6;
                        }
                        if (i7 != 0) {
                            aonnVar14 = acpv.c;
                        } else {
                            aonnVar14 = aonnVar7;
                        }
                        if (i9 != 0) {
                            aonnVar15 = acpv.d;
                        } else {
                            aonnVar15 = aonnVar4;
                        }
                        if (i12 != 0) {
                            i4 &= -458753;
                            i13 = 2;
                        } else {
                            i13 = i;
                        }
                        long jR10 = defpackage.abrz.r(j, cavVarB);
                        azrVar = new azr(defpackage.uu.j(cavVarB), defpackage.uu.f(cavVarB));
                        i14 = i4 & (-264241153);
                        aonnVar16 = aonnVar13;
                        aonnVar17 = aonnVar15;
                        i15 = i13;
                        aonnVar18 = aonnVar12;
                        aonnVar19 = aonnVar14;
                        j4 = jR10;
                    } else {
                        if (i19 != 0) {
                            cmwVar3 = defpackage.cmw.c;
                        } else {
                            cmwVar3 = cmwVar;
                        }
                        if (i20 != 0) {
                            aonnVar12 = acpv.a;
                        } else {
                            aonnVar12 = aonnVar5;
                        }
                        if (i5 != 0) {
                            aonnVar13 = acpv.b;
                        } else {
                            aonnVar13 = aonnVar6;
                        }
                        if (i7 != 0) {
                            aonnVar14 = acpv.c;
                        } else {
                            aonnVar14 = aonnVar7;
                        }
                        if (i9 != 0) {
                            aonnVar15 = acpv.d;
                        } else {
                            aonnVar15 = aonnVar4;
                        }
                        if (i12 != 0) {
                            i4 &= -458753;
                            i13 = 2;
                        } else {
                            i13 = i;
                        }
                        long jR11 = defpackage.abrz.r(j, cavVarB);
                        azrVar = new azr(defpackage.uu.j(cavVarB), defpackage.uu.f(cavVarB));
                        i14 = i4 & (-264241153);
                        aonnVar16 = aonnVar13;
                        aonnVar17 = aonnVar15;
                        i15 = i13;
                        aonnVar18 = aonnVar12;
                        aonnVar19 = aonnVar14;
                        j4 = jR11;
                    }
                    cavVarB.l();
                    rm.u(cmwVar3, aonnVar18, aonnVar16, aonnVar19, aonnVar17, i15, j, j4, azrVar, aonoVar, cavVarB, i14 & 1883242494);
                    i11 = i15;
                    azzVar2 = azrVar;
                    aonnVar8 = aonnVar17;
                    j3 = j4;
                    aonnVar11 = aonnVar19;
                    aonnVar10 = aonnVar16;
                    aonnVar9 = aonnVar18;
                    cmwVar2 = cmwVar3;
                } else {
                    cavVarB.s();
                    cmwVar2 = cmwVar;
                    aonnVar8 = aonnVar4;
                    i11 = i;
                    azzVar2 = azzVar;
                    aonnVar9 = aonnVar5;
                    aonnVar10 = aonnVar6;
                    aonnVar11 = aonnVar7;
                    j3 = j2;
                }
                cdkVarI = cavVarB.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new acql(cmwVar2, aonnVar9, aonnVar10, aonnVar11, aonnVar8, i11, j, j3, azzVar2, aonoVar, i2, i3);
                }
            }
            i4 |= 3072;
            aonnVar7 = aonnVar3;
            i9 = i3 & 16;
            if (i9 != 0) {
                if ((i2 & 24576) == 0) {
                    if (true != cavVarB.D(aonnVar4)) {
                        i10 = 8192;
                    } else {
                        i10 = 16384;
                    }
                    i4 |= i10;
                }
                if ((196608 & i2) == 0) {
                    i18 = 65536;
                    if ((i3 & 32) == 0) {
                        i18 = 131072;
                    }
                    i4 |= i18;
                }
                if ((1572864 & i2) == 0) {
                    if (true != cavVarB.A(j)) {
                        i17 = 524288;
                    } else {
                        i17 = 1048576;
                    }
                    i4 |= i17;
                }
                if ((12582912 & i2) == 0) {
                    i4 |= 4194304;
                }
                if ((100663296 & i2) == 0) {
                    i4 |= 33554432;
                }
                if ((805306368 & i2) == 0) {
                    if (true != cavVarB.D(aonoVar)) {
                        i16 = 268435456;
                    } else {
                        i16 = 536870912;
                    }
                    i4 |= i16;
                }
                if ((306783379 & i4) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (cavVarB.H(z, i4 & 1)) {
                    i12 = i3 & 32;
                    ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
                    if ((i2 & 1) != 0) {
                        if (i19 != 0) {
                            cmwVar3 = defpackage.cmw.c;
                        } else {
                            cmwVar3 = cmwVar;
                        }
                        if (i20 != 0) {
                            aonnVar12 = acpv.a;
                        } else {
                            aonnVar12 = aonnVar5;
                        }
                        if (i5 != 0) {
                            aonnVar13 = acpv.b;
                        } else {
                            aonnVar13 = aonnVar6;
                        }
                        if (i7 != 0) {
                            aonnVar14 = acpv.c;
                        } else {
                            aonnVar14 = aonnVar7;
                        }
                        if (i9 != 0) {
                            aonnVar15 = acpv.d;
                        } else {
                            aonnVar15 = aonnVar4;
                        }
                        if (i12 != 0) {
                            i4 &= -458753;
                            i13 = 2;
                        } else {
                            i13 = i;
                        }
                        long jR12 = defpackage.abrz.r(j, cavVarB);
                        azrVar = new azr(defpackage.uu.j(cavVarB), defpackage.uu.f(cavVarB));
                        i14 = i4 & (-264241153);
                        aonnVar16 = aonnVar13;
                        aonnVar17 = aonnVar15;
                        i15 = i13;
                        aonnVar18 = aonnVar12;
                        aonnVar19 = aonnVar14;
                        j4 = jR12;
                    } else {
                        if (i19 != 0) {
                            cmwVar3 = defpackage.cmw.c;
                        } else {
                            cmwVar3 = cmwVar;
                        }
                        if (i20 != 0) {
                            aonnVar12 = acpv.a;
                        } else {
                            aonnVar12 = aonnVar5;
                        }
                        if (i5 != 0) {
                            aonnVar13 = acpv.b;
                        } else {
                            aonnVar13 = aonnVar6;
                        }
                        if (i7 != 0) {
                            aonnVar14 = acpv.c;
                        } else {
                            aonnVar14 = aonnVar7;
                        }
                        if (i9 != 0) {
                            aonnVar15 = acpv.d;
                        } else {
                            aonnVar15 = aonnVar4;
                        }
                        if (i12 != 0) {
                            i4 &= -458753;
                            i13 = 2;
                        } else {
                            i13 = i;
                        }
                        long jR13 = defpackage.abrz.r(j, cavVarB);
                        azrVar = new azr(defpackage.uu.j(cavVarB), defpackage.uu.f(cavVarB));
                        i14 = i4 & (-264241153);
                        aonnVar16 = aonnVar13;
                        aonnVar17 = aonnVar15;
                        i15 = i13;
                        aonnVar18 = aonnVar12;
                        aonnVar19 = aonnVar14;
                        j4 = jR13;
                    }
                    cavVarB.l();
                    rm.u(cmwVar3, aonnVar18, aonnVar16, aonnVar19, aonnVar17, i15, j, j4, azrVar, aonoVar, cavVarB, i14 & 1883242494);
                    i11 = i15;
                    azzVar2 = azrVar;
                    aonnVar8 = aonnVar17;
                    j3 = j4;
                    aonnVar11 = aonnVar19;
                    aonnVar10 = aonnVar16;
                    aonnVar9 = aonnVar18;
                    cmwVar2 = cmwVar3;
                } else {
                    cavVarB.s();
                    cmwVar2 = cmwVar;
                    aonnVar8 = aonnVar4;
                    i11 = i;
                    azzVar2 = azzVar;
                    aonnVar9 = aonnVar5;
                    aonnVar10 = aonnVar6;
                    aonnVar11 = aonnVar7;
                    j3 = j2;
                }
                cdkVarI = cavVarB.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new acql(cmwVar2, aonnVar9, aonnVar10, aonnVar11, aonnVar8, i11, j, j3, azzVar2, aonoVar, i2, i3);
                }
            }
            i4 |= 24576;
            if ((196608 & i2) == 0) {
                i18 = 65536;
                if ((i3 & 32) == 0) {
                    i18 = 131072;
                }
                i4 |= i18;
            }
            if ((1572864 & i2) == 0) {
                if (true != cavVarB.A(j)) {
                    i17 = 524288;
                } else {
                    i17 = 1048576;
                }
                i4 |= i17;
            }
            if ((12582912 & i2) == 0) {
                i4 |= 4194304;
            }
            if ((100663296 & i2) == 0) {
                i4 |= 33554432;
            }
            if ((805306368 & i2) == 0) {
                if (true != cavVarB.D(aonoVar)) {
                    i16 = 268435456;
                } else {
                    i16 = 536870912;
                }
                i4 |= i16;
            }
            if ((306783379 & i4) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (cavVarB.H(z, i4 & 1)) {
                i12 = i3 & 32;
                ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
                if ((i2 & 1) != 0) {
                    if (i19 != 0) {
                        cmwVar3 = defpackage.cmw.c;
                    } else {
                        cmwVar3 = cmwVar;
                    }
                    if (i20 != 0) {
                        aonnVar12 = acpv.a;
                    } else {
                        aonnVar12 = aonnVar5;
                    }
                    if (i5 != 0) {
                        aonnVar13 = acpv.b;
                    } else {
                        aonnVar13 = aonnVar6;
                    }
                    if (i7 != 0) {
                        aonnVar14 = acpv.c;
                    } else {
                        aonnVar14 = aonnVar7;
                    }
                    if (i9 != 0) {
                        aonnVar15 = acpv.d;
                    } else {
                        aonnVar15 = aonnVar4;
                    }
                    if (i12 != 0) {
                        i4 &= -458753;
                        i13 = 2;
                    } else {
                        i13 = i;
                    }
                    long jR14 = defpackage.abrz.r(j, cavVarB);
                    azrVar = new azr(defpackage.uu.j(cavVarB), defpackage.uu.f(cavVarB));
                    i14 = i4 & (-264241153);
                    aonnVar16 = aonnVar13;
                    aonnVar17 = aonnVar15;
                    i15 = i13;
                    aonnVar18 = aonnVar12;
                    aonnVar19 = aonnVar14;
                    j4 = jR14;
                } else {
                    if (i19 != 0) {
                        cmwVar3 = defpackage.cmw.c;
                    } else {
                        cmwVar3 = cmwVar;
                    }
                    if (i20 != 0) {
                        aonnVar12 = acpv.a;
                    } else {
                        aonnVar12 = aonnVar5;
                    }
                    if (i5 != 0) {
                        aonnVar13 = acpv.b;
                    } else {
                        aonnVar13 = aonnVar6;
                    }
                    if (i7 != 0) {
                        aonnVar14 = acpv.c;
                    } else {
                        aonnVar14 = aonnVar7;
                    }
                    if (i9 != 0) {
                        aonnVar15 = acpv.d;
                    } else {
                        aonnVar15 = aonnVar4;
                    }
                    if (i12 != 0) {
                        i4 &= -458753;
                        i13 = 2;
                    } else {
                        i13 = i;
                    }
                    long jR15 = defpackage.abrz.r(j, cavVarB);
                    azrVar = new azr(defpackage.uu.j(cavVarB), defpackage.uu.f(cavVarB));
                    i14 = i4 & (-264241153);
                    aonnVar16 = aonnVar13;
                    aonnVar17 = aonnVar15;
                    i15 = i13;
                    aonnVar18 = aonnVar12;
                    aonnVar19 = aonnVar14;
                    j4 = jR15;
                }
                cavVarB.l();
                rm.u(cmwVar3, aonnVar18, aonnVar16, aonnVar19, aonnVar17, i15, j, j4, azrVar, aonoVar, cavVarB, i14 & 1883242494);
                i11 = i15;
                azzVar2 = azrVar;
                aonnVar8 = aonnVar17;
                j3 = j4;
                aonnVar11 = aonnVar19;
                aonnVar10 = aonnVar16;
                aonnVar9 = aonnVar18;
                cmwVar2 = cmwVar3;
            } else {
                cavVarB.s();
                cmwVar2 = cmwVar;
                aonnVar8 = aonnVar4;
                i11 = i;
                azzVar2 = azzVar;
                aonnVar9 = aonnVar5;
                aonnVar10 = aonnVar6;
                aonnVar11 = aonnVar7;
                j3 = j2;
            }
            cdkVarI = cavVarB.I();
            if (cdkVarI != null) {
                cdkVarI.c = new acql(cmwVar2, aonnVar9, aonnVar10, aonnVar11, aonnVar8, i11, j, j3, azzVar2, aonoVar, i2, i3);
            }
        }
        i4 |= 48;
        aonnVar5 = aonnVar;
        i5 = i3 & 4;
        if (i5 != 0) {
            if ((i2 & 384) == 0) {
                aonnVar6 = aonnVar2;
                if (true != cavVarB.D(aonnVar6)) {
                    i6 = 128;
                } else {
                    i6 = 256;
                }
                i4 |= i6;
            }
            i7 = i3 & 8;
            if (i7 != 0) {
                if ((i2 & 3072) == 0) {
                    aonnVar7 = aonnVar3;
                    if (true != cavVarB.D(aonnVar7)) {
                        i8 = 1024;
                    } else {
                        i8 = 2048;
                    }
                    i4 |= i8;
                }
                i9 = i3 & 16;
                if (i9 != 0) {
                    if ((i2 & 24576) == 0) {
                        if (true != cavVarB.D(aonnVar4)) {
                            i10 = 8192;
                        } else {
                            i10 = 16384;
                        }
                        i4 |= i10;
                    }
                    if ((196608 & i2) == 0) {
                        i18 = 65536;
                        if ((i3 & 32) == 0) {
                            i18 = 131072;
                        }
                        i4 |= i18;
                    }
                    if ((1572864 & i2) == 0) {
                        if (true != cavVarB.A(j)) {
                            i17 = 524288;
                        } else {
                            i17 = 1048576;
                        }
                        i4 |= i17;
                    }
                    if ((12582912 & i2) == 0) {
                        i4 |= 4194304;
                    }
                    if ((100663296 & i2) == 0) {
                        i4 |= 33554432;
                    }
                    if ((805306368 & i2) == 0) {
                        if (true != cavVarB.D(aonoVar)) {
                            i16 = 268435456;
                        } else {
                            i16 = 536870912;
                        }
                        i4 |= i16;
                    }
                    if ((306783379 & i4) != 306783378) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (cavVarB.H(z, i4 & 1)) {
                        i12 = i3 & 32;
                        ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
                        if ((i2 & 1) != 0) {
                            if (i19 != 0) {
                                cmwVar3 = defpackage.cmw.c;
                            } else {
                                cmwVar3 = cmwVar;
                            }
                            if (i20 != 0) {
                                aonnVar12 = acpv.a;
                            } else {
                                aonnVar12 = aonnVar5;
                            }
                            if (i5 != 0) {
                                aonnVar13 = acpv.b;
                            } else {
                                aonnVar13 = aonnVar6;
                            }
                            if (i7 != 0) {
                                aonnVar14 = acpv.c;
                            } else {
                                aonnVar14 = aonnVar7;
                            }
                            if (i9 != 0) {
                                aonnVar15 = acpv.d;
                            } else {
                                aonnVar15 = aonnVar4;
                            }
                            if (i12 != 0) {
                                i4 &= -458753;
                                i13 = 2;
                            } else {
                                i13 = i;
                            }
                            long jR16 = defpackage.abrz.r(j, cavVarB);
                            azrVar = new azr(defpackage.uu.j(cavVarB), defpackage.uu.f(cavVarB));
                            i14 = i4 & (-264241153);
                            aonnVar16 = aonnVar13;
                            aonnVar17 = aonnVar15;
                            i15 = i13;
                            aonnVar18 = aonnVar12;
                            aonnVar19 = aonnVar14;
                            j4 = jR16;
                        } else {
                            if (i19 != 0) {
                                cmwVar3 = defpackage.cmw.c;
                            } else {
                                cmwVar3 = cmwVar;
                            }
                            if (i20 != 0) {
                                aonnVar12 = acpv.a;
                            } else {
                                aonnVar12 = aonnVar5;
                            }
                            if (i5 != 0) {
                                aonnVar13 = acpv.b;
                            } else {
                                aonnVar13 = aonnVar6;
                            }
                            if (i7 != 0) {
                                aonnVar14 = acpv.c;
                            } else {
                                aonnVar14 = aonnVar7;
                            }
                            if (i9 != 0) {
                                aonnVar15 = acpv.d;
                            } else {
                                aonnVar15 = aonnVar4;
                            }
                            if (i12 != 0) {
                                i4 &= -458753;
                                i13 = 2;
                            } else {
                                i13 = i;
                            }
                            long jR17 = defpackage.abrz.r(j, cavVarB);
                            azrVar = new azr(defpackage.uu.j(cavVarB), defpackage.uu.f(cavVarB));
                            i14 = i4 & (-264241153);
                            aonnVar16 = aonnVar13;
                            aonnVar17 = aonnVar15;
                            i15 = i13;
                            aonnVar18 = aonnVar12;
                            aonnVar19 = aonnVar14;
                            j4 = jR17;
                        }
                        cavVarB.l();
                        rm.u(cmwVar3, aonnVar18, aonnVar16, aonnVar19, aonnVar17, i15, j, j4, azrVar, aonoVar, cavVarB, i14 & 1883242494);
                        i11 = i15;
                        azzVar2 = azrVar;
                        aonnVar8 = aonnVar17;
                        j3 = j4;
                        aonnVar11 = aonnVar19;
                        aonnVar10 = aonnVar16;
                        aonnVar9 = aonnVar18;
                        cmwVar2 = cmwVar3;
                    } else {
                        cavVarB.s();
                        cmwVar2 = cmwVar;
                        aonnVar8 = aonnVar4;
                        i11 = i;
                        azzVar2 = azzVar;
                        aonnVar9 = aonnVar5;
                        aonnVar10 = aonnVar6;
                        aonnVar11 = aonnVar7;
                        j3 = j2;
                    }
                    cdkVarI = cavVarB.I();
                    if (cdkVarI != null) {
                        cdkVarI.c = new acql(cmwVar2, aonnVar9, aonnVar10, aonnVar11, aonnVar8, i11, j, j3, azzVar2, aonoVar, i2, i3);
                    }
                }
                i4 |= 24576;
                if ((196608 & i2) == 0) {
                    i18 = 65536;
                    if ((i3 & 32) == 0) {
                        i18 = 131072;
                    }
                    i4 |= i18;
                }
                if ((1572864 & i2) == 0) {
                    if (true != cavVarB.A(j)) {
                        i17 = 524288;
                    } else {
                        i17 = 1048576;
                    }
                    i4 |= i17;
                }
                if ((12582912 & i2) == 0) {
                    i4 |= 4194304;
                }
                if ((100663296 & i2) == 0) {
                    i4 |= 33554432;
                }
                if ((805306368 & i2) == 0) {
                    if (true != cavVarB.D(aonoVar)) {
                        i16 = 268435456;
                    } else {
                        i16 = 536870912;
                    }
                    i4 |= i16;
                }
                if ((306783379 & i4) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (cavVarB.H(z, i4 & 1)) {
                    i12 = i3 & 32;
                    ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
                    if ((i2 & 1) != 0) {
                        if (i19 != 0) {
                            cmwVar3 = defpackage.cmw.c;
                        } else {
                            cmwVar3 = cmwVar;
                        }
                        if (i20 != 0) {
                            aonnVar12 = acpv.a;
                        } else {
                            aonnVar12 = aonnVar5;
                        }
                        if (i5 != 0) {
                            aonnVar13 = acpv.b;
                        } else {
                            aonnVar13 = aonnVar6;
                        }
                        if (i7 != 0) {
                            aonnVar14 = acpv.c;
                        } else {
                            aonnVar14 = aonnVar7;
                        }
                        if (i9 != 0) {
                            aonnVar15 = acpv.d;
                        } else {
                            aonnVar15 = aonnVar4;
                        }
                        if (i12 != 0) {
                            i4 &= -458753;
                            i13 = 2;
                        } else {
                            i13 = i;
                        }
                        long jR18 = defpackage.abrz.r(j, cavVarB);
                        azrVar = new azr(defpackage.uu.j(cavVarB), defpackage.uu.f(cavVarB));
                        i14 = i4 & (-264241153);
                        aonnVar16 = aonnVar13;
                        aonnVar17 = aonnVar15;
                        i15 = i13;
                        aonnVar18 = aonnVar12;
                        aonnVar19 = aonnVar14;
                        j4 = jR18;
                    } else {
                        if (i19 != 0) {
                            cmwVar3 = defpackage.cmw.c;
                        } else {
                            cmwVar3 = cmwVar;
                        }
                        if (i20 != 0) {
                            aonnVar12 = acpv.a;
                        } else {
                            aonnVar12 = aonnVar5;
                        }
                        if (i5 != 0) {
                            aonnVar13 = acpv.b;
                        } else {
                            aonnVar13 = aonnVar6;
                        }
                        if (i7 != 0) {
                            aonnVar14 = acpv.c;
                        } else {
                            aonnVar14 = aonnVar7;
                        }
                        if (i9 != 0) {
                            aonnVar15 = acpv.d;
                        } else {
                            aonnVar15 = aonnVar4;
                        }
                        if (i12 != 0) {
                            i4 &= -458753;
                            i13 = 2;
                        } else {
                            i13 = i;
                        }
                        long jR19 = defpackage.abrz.r(j, cavVarB);
                        azrVar = new azr(defpackage.uu.j(cavVarB), defpackage.uu.f(cavVarB));
                        i14 = i4 & (-264241153);
                        aonnVar16 = aonnVar13;
                        aonnVar17 = aonnVar15;
                        i15 = i13;
                        aonnVar18 = aonnVar12;
                        aonnVar19 = aonnVar14;
                        j4 = jR19;
                    }
                    cavVarB.l();
                    rm.u(cmwVar3, aonnVar18, aonnVar16, aonnVar19, aonnVar17, i15, j, j4, azrVar, aonoVar, cavVarB, i14 & 1883242494);
                    i11 = i15;
                    azzVar2 = azrVar;
                    aonnVar8 = aonnVar17;
                    j3 = j4;
                    aonnVar11 = aonnVar19;
                    aonnVar10 = aonnVar16;
                    aonnVar9 = aonnVar18;
                    cmwVar2 = cmwVar3;
                } else {
                    cavVarB.s();
                    cmwVar2 = cmwVar;
                    aonnVar8 = aonnVar4;
                    i11 = i;
                    azzVar2 = azzVar;
                    aonnVar9 = aonnVar5;
                    aonnVar10 = aonnVar6;
                    aonnVar11 = aonnVar7;
                    j3 = j2;
                }
                cdkVarI = cavVarB.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new acql(cmwVar2, aonnVar9, aonnVar10, aonnVar11, aonnVar8, i11, j, j3, azzVar2, aonoVar, i2, i3);
                }
            }
            i4 |= 3072;
            aonnVar7 = aonnVar3;
            i9 = i3 & 16;
            if (i9 != 0) {
                if ((i2 & 24576) == 0) {
                    if (true != cavVarB.D(aonnVar4)) {
                        i10 = 8192;
                    } else {
                        i10 = 16384;
                    }
                    i4 |= i10;
                }
                if ((196608 & i2) == 0) {
                    i18 = 65536;
                    if ((i3 & 32) == 0) {
                        i18 = 131072;
                    }
                    i4 |= i18;
                }
                if ((1572864 & i2) == 0) {
                    if (true != cavVarB.A(j)) {
                        i17 = 524288;
                    } else {
                        i17 = 1048576;
                    }
                    i4 |= i17;
                }
                if ((12582912 & i2) == 0) {
                    i4 |= 4194304;
                }
                if ((100663296 & i2) == 0) {
                    i4 |= 33554432;
                }
                if ((805306368 & i2) == 0) {
                    if (true != cavVarB.D(aonoVar)) {
                        i16 = 268435456;
                    } else {
                        i16 = 536870912;
                    }
                    i4 |= i16;
                }
                if ((306783379 & i4) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (cavVarB.H(z, i4 & 1)) {
                    i12 = i3 & 32;
                    ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
                    if ((i2 & 1) != 0) {
                        if (i19 != 0) {
                            cmwVar3 = defpackage.cmw.c;
                        } else {
                            cmwVar3 = cmwVar;
                        }
                        if (i20 != 0) {
                            aonnVar12 = acpv.a;
                        } else {
                            aonnVar12 = aonnVar5;
                        }
                        if (i5 != 0) {
                            aonnVar13 = acpv.b;
                        } else {
                            aonnVar13 = aonnVar6;
                        }
                        if (i7 != 0) {
                            aonnVar14 = acpv.c;
                        } else {
                            aonnVar14 = aonnVar7;
                        }
                        if (i9 != 0) {
                            aonnVar15 = acpv.d;
                        } else {
                            aonnVar15 = aonnVar4;
                        }
                        if (i12 != 0) {
                            i4 &= -458753;
                            i13 = 2;
                        } else {
                            i13 = i;
                        }
                        long jR110 = defpackage.abrz.r(j, cavVarB);
                        azrVar = new azr(defpackage.uu.j(cavVarB), defpackage.uu.f(cavVarB));
                        i14 = i4 & (-264241153);
                        aonnVar16 = aonnVar13;
                        aonnVar17 = aonnVar15;
                        i15 = i13;
                        aonnVar18 = aonnVar12;
                        aonnVar19 = aonnVar14;
                        j4 = jR110;
                    } else {
                        if (i19 != 0) {
                            cmwVar3 = defpackage.cmw.c;
                        } else {
                            cmwVar3 = cmwVar;
                        }
                        if (i20 != 0) {
                            aonnVar12 = acpv.a;
                        } else {
                            aonnVar12 = aonnVar5;
                        }
                        if (i5 != 0) {
                            aonnVar13 = acpv.b;
                        } else {
                            aonnVar13 = aonnVar6;
                        }
                        if (i7 != 0) {
                            aonnVar14 = acpv.c;
                        } else {
                            aonnVar14 = aonnVar7;
                        }
                        if (i9 != 0) {
                            aonnVar15 = acpv.d;
                        } else {
                            aonnVar15 = aonnVar4;
                        }
                        if (i12 != 0) {
                            i4 &= -458753;
                            i13 = 2;
                        } else {
                            i13 = i;
                        }
                        long jR111 = defpackage.abrz.r(j, cavVarB);
                        azrVar = new azr(defpackage.uu.j(cavVarB), defpackage.uu.f(cavVarB));
                        i14 = i4 & (-264241153);
                        aonnVar16 = aonnVar13;
                        aonnVar17 = aonnVar15;
                        i15 = i13;
                        aonnVar18 = aonnVar12;
                        aonnVar19 = aonnVar14;
                        j4 = jR111;
                    }
                    cavVarB.l();
                    rm.u(cmwVar3, aonnVar18, aonnVar16, aonnVar19, aonnVar17, i15, j, j4, azrVar, aonoVar, cavVarB, i14 & 1883242494);
                    i11 = i15;
                    azzVar2 = azrVar;
                    aonnVar8 = aonnVar17;
                    j3 = j4;
                    aonnVar11 = aonnVar19;
                    aonnVar10 = aonnVar16;
                    aonnVar9 = aonnVar18;
                    cmwVar2 = cmwVar3;
                } else {
                    cavVarB.s();
                    cmwVar2 = cmwVar;
                    aonnVar8 = aonnVar4;
                    i11 = i;
                    azzVar2 = azzVar;
                    aonnVar9 = aonnVar5;
                    aonnVar10 = aonnVar6;
                    aonnVar11 = aonnVar7;
                    j3 = j2;
                }
                cdkVarI = cavVarB.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new acql(cmwVar2, aonnVar9, aonnVar10, aonnVar11, aonnVar8, i11, j, j3, azzVar2, aonoVar, i2, i3);
                }
            }
            i4 |= 24576;
            if ((196608 & i2) == 0) {
                i18 = 65536;
                if ((i3 & 32) == 0) {
                    i18 = 131072;
                }
                i4 |= i18;
            }
            if ((1572864 & i2) == 0) {
                if (true != cavVarB.A(j)) {
                    i17 = 524288;
                } else {
                    i17 = 1048576;
                }
                i4 |= i17;
            }
            if ((12582912 & i2) == 0) {
                i4 |= 4194304;
            }
            if ((100663296 & i2) == 0) {
                i4 |= 33554432;
            }
            if ((805306368 & i2) == 0) {
                if (true != cavVarB.D(aonoVar)) {
                    i16 = 268435456;
                } else {
                    i16 = 536870912;
                }
                i4 |= i16;
            }
            if ((306783379 & i4) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (cavVarB.H(z, i4 & 1)) {
                i12 = i3 & 32;
                ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
                if ((i2 & 1) != 0) {
                    if (i19 != 0) {
                        cmwVar3 = defpackage.cmw.c;
                    } else {
                        cmwVar3 = cmwVar;
                    }
                    if (i20 != 0) {
                        aonnVar12 = acpv.a;
                    } else {
                        aonnVar12 = aonnVar5;
                    }
                    if (i5 != 0) {
                        aonnVar13 = acpv.b;
                    } else {
                        aonnVar13 = aonnVar6;
                    }
                    if (i7 != 0) {
                        aonnVar14 = acpv.c;
                    } else {
                        aonnVar14 = aonnVar7;
                    }
                    if (i9 != 0) {
                        aonnVar15 = acpv.d;
                    } else {
                        aonnVar15 = aonnVar4;
                    }
                    if (i12 != 0) {
                        i4 &= -458753;
                        i13 = 2;
                    } else {
                        i13 = i;
                    }
                    long jR112 = defpackage.abrz.r(j, cavVarB);
                    azrVar = new azr(defpackage.uu.j(cavVarB), defpackage.uu.f(cavVarB));
                    i14 = i4 & (-264241153);
                    aonnVar16 = aonnVar13;
                    aonnVar17 = aonnVar15;
                    i15 = i13;
                    aonnVar18 = aonnVar12;
                    aonnVar19 = aonnVar14;
                    j4 = jR112;
                } else {
                    if (i19 != 0) {
                        cmwVar3 = defpackage.cmw.c;
                    } else {
                        cmwVar3 = cmwVar;
                    }
                    if (i20 != 0) {
                        aonnVar12 = acpv.a;
                    } else {
                        aonnVar12 = aonnVar5;
                    }
                    if (i5 != 0) {
                        aonnVar13 = acpv.b;
                    } else {
                        aonnVar13 = aonnVar6;
                    }
                    if (i7 != 0) {
                        aonnVar14 = acpv.c;
                    } else {
                        aonnVar14 = aonnVar7;
                    }
                    if (i9 != 0) {
                        aonnVar15 = acpv.d;
                    } else {
                        aonnVar15 = aonnVar4;
                    }
                    if (i12 != 0) {
                        i4 &= -458753;
                        i13 = 2;
                    } else {
                        i13 = i;
                    }
                    long jR113 = defpackage.abrz.r(j, cavVarB);
                    azrVar = new azr(defpackage.uu.j(cavVarB), defpackage.uu.f(cavVarB));
                    i14 = i4 & (-264241153);
                    aonnVar16 = aonnVar13;
                    aonnVar17 = aonnVar15;
                    i15 = i13;
                    aonnVar18 = aonnVar12;
                    aonnVar19 = aonnVar14;
                    j4 = jR113;
                }
                cavVarB.l();
                rm.u(cmwVar3, aonnVar18, aonnVar16, aonnVar19, aonnVar17, i15, j, j4, azrVar, aonoVar, cavVarB, i14 & 1883242494);
                i11 = i15;
                azzVar2 = azrVar;
                aonnVar8 = aonnVar17;
                j3 = j4;
                aonnVar11 = aonnVar19;
                aonnVar10 = aonnVar16;
                aonnVar9 = aonnVar18;
                cmwVar2 = cmwVar3;
            } else {
                cavVarB.s();
                cmwVar2 = cmwVar;
                aonnVar8 = aonnVar4;
                i11 = i;
                azzVar2 = azzVar;
                aonnVar9 = aonnVar5;
                aonnVar10 = aonnVar6;
                aonnVar11 = aonnVar7;
                j3 = j2;
            }
            cdkVarI = cavVarB.I();
            if (cdkVarI != null) {
                cdkVarI.c = new acql(cmwVar2, aonnVar9, aonnVar10, aonnVar11, aonnVar8, i11, j, j3, azzVar2, aonoVar, i2, i3);
            }
        }
        i4 |= 384;
        aonnVar6 = aonnVar2;
        i7 = i3 & 8;
        if (i7 != 0) {
            if ((i2 & 3072) == 0) {
                aonnVar7 = aonnVar3;
                if (true != cavVarB.D(aonnVar7)) {
                    i8 = 1024;
                } else {
                    i8 = 2048;
                }
                i4 |= i8;
            }
            i9 = i3 & 16;
            if (i9 != 0) {
                if ((i2 & 24576) == 0) {
                    if (true != cavVarB.D(aonnVar4)) {
                        i10 = 8192;
                    } else {
                        i10 = 16384;
                    }
                    i4 |= i10;
                }
                if ((196608 & i2) == 0) {
                    i18 = 65536;
                    if ((i3 & 32) == 0) {
                        i18 = 131072;
                    }
                    i4 |= i18;
                }
                if ((1572864 & i2) == 0) {
                    if (true != cavVarB.A(j)) {
                        i17 = 524288;
                    } else {
                        i17 = 1048576;
                    }
                    i4 |= i17;
                }
                if ((12582912 & i2) == 0) {
                    i4 |= 4194304;
                }
                if ((100663296 & i2) == 0) {
                    i4 |= 33554432;
                }
                if ((805306368 & i2) == 0) {
                    if (true != cavVarB.D(aonoVar)) {
                        i16 = 268435456;
                    } else {
                        i16 = 536870912;
                    }
                    i4 |= i16;
                }
                if ((306783379 & i4) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (cavVarB.H(z, i4 & 1)) {
                    i12 = i3 & 32;
                    ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
                    if ((i2 & 1) != 0) {
                        if (i19 != 0) {
                            cmwVar3 = defpackage.cmw.c;
                        } else {
                            cmwVar3 = cmwVar;
                        }
                        if (i20 != 0) {
                            aonnVar12 = acpv.a;
                        } else {
                            aonnVar12 = aonnVar5;
                        }
                        if (i5 != 0) {
                            aonnVar13 = acpv.b;
                        } else {
                            aonnVar13 = aonnVar6;
                        }
                        if (i7 != 0) {
                            aonnVar14 = acpv.c;
                        } else {
                            aonnVar14 = aonnVar7;
                        }
                        if (i9 != 0) {
                            aonnVar15 = acpv.d;
                        } else {
                            aonnVar15 = aonnVar4;
                        }
                        if (i12 != 0) {
                            i4 &= -458753;
                            i13 = 2;
                        } else {
                            i13 = i;
                        }
                        long jR114 = defpackage.abrz.r(j, cavVarB);
                        azrVar = new azr(defpackage.uu.j(cavVarB), defpackage.uu.f(cavVarB));
                        i14 = i4 & (-264241153);
                        aonnVar16 = aonnVar13;
                        aonnVar17 = aonnVar15;
                        i15 = i13;
                        aonnVar18 = aonnVar12;
                        aonnVar19 = aonnVar14;
                        j4 = jR114;
                    } else {
                        if (i19 != 0) {
                            cmwVar3 = defpackage.cmw.c;
                        } else {
                            cmwVar3 = cmwVar;
                        }
                        if (i20 != 0) {
                            aonnVar12 = acpv.a;
                        } else {
                            aonnVar12 = aonnVar5;
                        }
                        if (i5 != 0) {
                            aonnVar13 = acpv.b;
                        } else {
                            aonnVar13 = aonnVar6;
                        }
                        if (i7 != 0) {
                            aonnVar14 = acpv.c;
                        } else {
                            aonnVar14 = aonnVar7;
                        }
                        if (i9 != 0) {
                            aonnVar15 = acpv.d;
                        } else {
                            aonnVar15 = aonnVar4;
                        }
                        if (i12 != 0) {
                            i4 &= -458753;
                            i13 = 2;
                        } else {
                            i13 = i;
                        }
                        long jR115 = defpackage.abrz.r(j, cavVarB);
                        azrVar = new azr(defpackage.uu.j(cavVarB), defpackage.uu.f(cavVarB));
                        i14 = i4 & (-264241153);
                        aonnVar16 = aonnVar13;
                        aonnVar17 = aonnVar15;
                        i15 = i13;
                        aonnVar18 = aonnVar12;
                        aonnVar19 = aonnVar14;
                        j4 = jR115;
                    }
                    cavVarB.l();
                    rm.u(cmwVar3, aonnVar18, aonnVar16, aonnVar19, aonnVar17, i15, j, j4, azrVar, aonoVar, cavVarB, i14 & 1883242494);
                    i11 = i15;
                    azzVar2 = azrVar;
                    aonnVar8 = aonnVar17;
                    j3 = j4;
                    aonnVar11 = aonnVar19;
                    aonnVar10 = aonnVar16;
                    aonnVar9 = aonnVar18;
                    cmwVar2 = cmwVar3;
                } else {
                    cavVarB.s();
                    cmwVar2 = cmwVar;
                    aonnVar8 = aonnVar4;
                    i11 = i;
                    azzVar2 = azzVar;
                    aonnVar9 = aonnVar5;
                    aonnVar10 = aonnVar6;
                    aonnVar11 = aonnVar7;
                    j3 = j2;
                }
                cdkVarI = cavVarB.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new acql(cmwVar2, aonnVar9, aonnVar10, aonnVar11, aonnVar8, i11, j, j3, azzVar2, aonoVar, i2, i3);
                }
            }
            i4 |= 24576;
            if ((196608 & i2) == 0) {
                i18 = 65536;
                if ((i3 & 32) == 0) {
                    i18 = 131072;
                }
                i4 |= i18;
            }
            if ((1572864 & i2) == 0) {
                if (true != cavVarB.A(j)) {
                    i17 = 524288;
                } else {
                    i17 = 1048576;
                }
                i4 |= i17;
            }
            if ((12582912 & i2) == 0) {
                i4 |= 4194304;
            }
            if ((100663296 & i2) == 0) {
                i4 |= 33554432;
            }
            if ((805306368 & i2) == 0) {
                if (true != cavVarB.D(aonoVar)) {
                    i16 = 268435456;
                } else {
                    i16 = 536870912;
                }
                i4 |= i16;
            }
            if ((306783379 & i4) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (cavVarB.H(z, i4 & 1)) {
                i12 = i3 & 32;
                ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
                if ((i2 & 1) != 0) {
                    if (i19 != 0) {
                        cmwVar3 = defpackage.cmw.c;
                    } else {
                        cmwVar3 = cmwVar;
                    }
                    if (i20 != 0) {
                        aonnVar12 = acpv.a;
                    } else {
                        aonnVar12 = aonnVar5;
                    }
                    if (i5 != 0) {
                        aonnVar13 = acpv.b;
                    } else {
                        aonnVar13 = aonnVar6;
                    }
                    if (i7 != 0) {
                        aonnVar14 = acpv.c;
                    } else {
                        aonnVar14 = aonnVar7;
                    }
                    if (i9 != 0) {
                        aonnVar15 = acpv.d;
                    } else {
                        aonnVar15 = aonnVar4;
                    }
                    if (i12 != 0) {
                        i4 &= -458753;
                        i13 = 2;
                    } else {
                        i13 = i;
                    }
                    long jR116 = defpackage.abrz.r(j, cavVarB);
                    azrVar = new azr(defpackage.uu.j(cavVarB), defpackage.uu.f(cavVarB));
                    i14 = i4 & (-264241153);
                    aonnVar16 = aonnVar13;
                    aonnVar17 = aonnVar15;
                    i15 = i13;
                    aonnVar18 = aonnVar12;
                    aonnVar19 = aonnVar14;
                    j4 = jR116;
                } else {
                    if (i19 != 0) {
                        cmwVar3 = defpackage.cmw.c;
                    } else {
                        cmwVar3 = cmwVar;
                    }
                    if (i20 != 0) {
                        aonnVar12 = acpv.a;
                    } else {
                        aonnVar12 = aonnVar5;
                    }
                    if (i5 != 0) {
                        aonnVar13 = acpv.b;
                    } else {
                        aonnVar13 = aonnVar6;
                    }
                    if (i7 != 0) {
                        aonnVar14 = acpv.c;
                    } else {
                        aonnVar14 = aonnVar7;
                    }
                    if (i9 != 0) {
                        aonnVar15 = acpv.d;
                    } else {
                        aonnVar15 = aonnVar4;
                    }
                    if (i12 != 0) {
                        i4 &= -458753;
                        i13 = 2;
                    } else {
                        i13 = i;
                    }
                    long jR117 = defpackage.abrz.r(j, cavVarB);
                    azrVar = new azr(defpackage.uu.j(cavVarB), defpackage.uu.f(cavVarB));
                    i14 = i4 & (-264241153);
                    aonnVar16 = aonnVar13;
                    aonnVar17 = aonnVar15;
                    i15 = i13;
                    aonnVar18 = aonnVar12;
                    aonnVar19 = aonnVar14;
                    j4 = jR117;
                }
                cavVarB.l();
                rm.u(cmwVar3, aonnVar18, aonnVar16, aonnVar19, aonnVar17, i15, j, j4, azrVar, aonoVar, cavVarB, i14 & 1883242494);
                i11 = i15;
                azzVar2 = azrVar;
                aonnVar8 = aonnVar17;
                j3 = j4;
                aonnVar11 = aonnVar19;
                aonnVar10 = aonnVar16;
                aonnVar9 = aonnVar18;
                cmwVar2 = cmwVar3;
            } else {
                cavVarB.s();
                cmwVar2 = cmwVar;
                aonnVar8 = aonnVar4;
                i11 = i;
                azzVar2 = azzVar;
                aonnVar9 = aonnVar5;
                aonnVar10 = aonnVar6;
                aonnVar11 = aonnVar7;
                j3 = j2;
            }
            cdkVarI = cavVarB.I();
            if (cdkVarI != null) {
                cdkVarI.c = new acql(cmwVar2, aonnVar9, aonnVar10, aonnVar11, aonnVar8, i11, j, j3, azzVar2, aonoVar, i2, i3);
            }
        }
        i4 |= 3072;
        aonnVar7 = aonnVar3;
        i9 = i3 & 16;
        if (i9 != 0) {
            if ((i2 & 24576) == 0) {
                if (true != cavVarB.D(aonnVar4)) {
                    i10 = 8192;
                } else {
                    i10 = 16384;
                }
                i4 |= i10;
            }
            if ((196608 & i2) == 0) {
                i18 = 65536;
                if ((i3 & 32) == 0) {
                    i18 = 131072;
                }
                i4 |= i18;
            }
            if ((1572864 & i2) == 0) {
                if (true != cavVarB.A(j)) {
                    i17 = 524288;
                } else {
                    i17 = 1048576;
                }
                i4 |= i17;
            }
            if ((12582912 & i2) == 0) {
                i4 |= 4194304;
            }
            if ((100663296 & i2) == 0) {
                i4 |= 33554432;
            }
            if ((805306368 & i2) == 0) {
                if (true != cavVarB.D(aonoVar)) {
                    i16 = 268435456;
                } else {
                    i16 = 536870912;
                }
                i4 |= i16;
            }
            if ((306783379 & i4) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (cavVarB.H(z, i4 & 1)) {
                i12 = i3 & 32;
                ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
                if ((i2 & 1) != 0) {
                    if (i19 != 0) {
                        cmwVar3 = defpackage.cmw.c;
                    } else {
                        cmwVar3 = cmwVar;
                    }
                    if (i20 != 0) {
                        aonnVar12 = acpv.a;
                    } else {
                        aonnVar12 = aonnVar5;
                    }
                    if (i5 != 0) {
                        aonnVar13 = acpv.b;
                    } else {
                        aonnVar13 = aonnVar6;
                    }
                    if (i7 != 0) {
                        aonnVar14 = acpv.c;
                    } else {
                        aonnVar14 = aonnVar7;
                    }
                    if (i9 != 0) {
                        aonnVar15 = acpv.d;
                    } else {
                        aonnVar15 = aonnVar4;
                    }
                    if (i12 != 0) {
                        i4 &= -458753;
                        i13 = 2;
                    } else {
                        i13 = i;
                    }
                    long jR118 = defpackage.abrz.r(j, cavVarB);
                    azrVar = new azr(defpackage.uu.j(cavVarB), defpackage.uu.f(cavVarB));
                    i14 = i4 & (-264241153);
                    aonnVar16 = aonnVar13;
                    aonnVar17 = aonnVar15;
                    i15 = i13;
                    aonnVar18 = aonnVar12;
                    aonnVar19 = aonnVar14;
                    j4 = jR118;
                } else {
                    if (i19 != 0) {
                        cmwVar3 = defpackage.cmw.c;
                    } else {
                        cmwVar3 = cmwVar;
                    }
                    if (i20 != 0) {
                        aonnVar12 = acpv.a;
                    } else {
                        aonnVar12 = aonnVar5;
                    }
                    if (i5 != 0) {
                        aonnVar13 = acpv.b;
                    } else {
                        aonnVar13 = aonnVar6;
                    }
                    if (i7 != 0) {
                        aonnVar14 = acpv.c;
                    } else {
                        aonnVar14 = aonnVar7;
                    }
                    if (i9 != 0) {
                        aonnVar15 = acpv.d;
                    } else {
                        aonnVar15 = aonnVar4;
                    }
                    if (i12 != 0) {
                        i4 &= -458753;
                        i13 = 2;
                    } else {
                        i13 = i;
                    }
                    long jR119 = defpackage.abrz.r(j, cavVarB);
                    azrVar = new azr(defpackage.uu.j(cavVarB), defpackage.uu.f(cavVarB));
                    i14 = i4 & (-264241153);
                    aonnVar16 = aonnVar13;
                    aonnVar17 = aonnVar15;
                    i15 = i13;
                    aonnVar18 = aonnVar12;
                    aonnVar19 = aonnVar14;
                    j4 = jR119;
                }
                cavVarB.l();
                rm.u(cmwVar3, aonnVar18, aonnVar16, aonnVar19, aonnVar17, i15, j, j4, azrVar, aonoVar, cavVarB, i14 & 1883242494);
                i11 = i15;
                azzVar2 = azrVar;
                aonnVar8 = aonnVar17;
                j3 = j4;
                aonnVar11 = aonnVar19;
                aonnVar10 = aonnVar16;
                aonnVar9 = aonnVar18;
                cmwVar2 = cmwVar3;
            } else {
                cavVarB.s();
                cmwVar2 = cmwVar;
                aonnVar8 = aonnVar4;
                i11 = i;
                azzVar2 = azzVar;
                aonnVar9 = aonnVar5;
                aonnVar10 = aonnVar6;
                aonnVar11 = aonnVar7;
                j3 = j2;
            }
            cdkVarI = cavVarB.I();
            if (cdkVarI != null) {
                cdkVarI.c = new acql(cmwVar2, aonnVar9, aonnVar10, aonnVar11, aonnVar8, i11, j, j3, azzVar2, aonoVar, i2, i3);
            }
        }
        i4 |= 24576;
        if ((196608 & i2) == 0) {
            i18 = 65536;
            if ((i3 & 32) == 0) {
                i18 = 131072;
            }
            i4 |= i18;
        }
        if ((1572864 & i2) == 0) {
            if (true != cavVarB.A(j)) {
                i17 = 524288;
            } else {
                i17 = 1048576;
            }
            i4 |= i17;
        }
        if ((12582912 & i2) == 0) {
            i4 |= 4194304;
        }
        if ((100663296 & i2) == 0) {
            i4 |= 33554432;
        }
        if ((805306368 & i2) == 0) {
            if (true != cavVarB.D(aonoVar)) {
                i16 = 268435456;
            } else {
                i16 = 536870912;
            }
            i4 |= i16;
        }
        if ((306783379 & i4) != 306783378) {
            z = true;
        } else {
            z = false;
        }
        if (cavVarB.H(z, i4 & 1)) {
            i12 = i3 & 32;
            ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
            if ((i2 & 1) != 0) {
                if (i19 != 0) {
                    cmwVar3 = defpackage.cmw.c;
                } else {
                    cmwVar3 = cmwVar;
                }
                if (i20 != 0) {
                    aonnVar12 = acpv.a;
                } else {
                    aonnVar12 = aonnVar5;
                }
                if (i5 != 0) {
                    aonnVar13 = acpv.b;
                } else {
                    aonnVar13 = aonnVar6;
                }
                if (i7 != 0) {
                    aonnVar14 = acpv.c;
                } else {
                    aonnVar14 = aonnVar7;
                }
                if (i9 != 0) {
                    aonnVar15 = acpv.d;
                } else {
                    aonnVar15 = aonnVar4;
                }
                if (i12 != 0) {
                    i4 &= -458753;
                    i13 = 2;
                } else {
                    i13 = i;
                }
                long jR1110 = defpackage.abrz.r(j, cavVarB);
                azrVar = new azr(defpackage.uu.j(cavVarB), defpackage.uu.f(cavVarB));
                i14 = i4 & (-264241153);
                aonnVar16 = aonnVar13;
                aonnVar17 = aonnVar15;
                i15 = i13;
                aonnVar18 = aonnVar12;
                aonnVar19 = aonnVar14;
                j4 = jR1110;
            } else {
                if (i19 != 0) {
                    cmwVar3 = defpackage.cmw.c;
                } else {
                    cmwVar3 = cmwVar;
                }
                if (i20 != 0) {
                    aonnVar12 = acpv.a;
                } else {
                    aonnVar12 = aonnVar5;
                }
                if (i5 != 0) {
                    aonnVar13 = acpv.b;
                } else {
                    aonnVar13 = aonnVar6;
                }
                if (i7 != 0) {
                    aonnVar14 = acpv.c;
                } else {
                    aonnVar14 = aonnVar7;
                }
                if (i9 != 0) {
                    aonnVar15 = acpv.d;
                } else {
                    aonnVar15 = aonnVar4;
                }
                if (i12 != 0) {
                    i4 &= -458753;
                    i13 = 2;
                } else {
                    i13 = i;
                }
                long jR1111 = defpackage.abrz.r(j, cavVarB);
                azrVar = new azr(defpackage.uu.j(cavVarB), defpackage.uu.f(cavVarB));
                i14 = i4 & (-264241153);
                aonnVar16 = aonnVar13;
                aonnVar17 = aonnVar15;
                i15 = i13;
                aonnVar18 = aonnVar12;
                aonnVar19 = aonnVar14;
                j4 = jR1111;
            }
            cavVarB.l();
            rm.u(cmwVar3, aonnVar18, aonnVar16, aonnVar19, aonnVar17, i15, j, j4, azrVar, aonoVar, cavVarB, i14 & 1883242494);
            i11 = i15;
            azzVar2 = azrVar;
            aonnVar8 = aonnVar17;
            j3 = j4;
            aonnVar11 = aonnVar19;
            aonnVar10 = aonnVar16;
            aonnVar9 = aonnVar18;
            cmwVar2 = cmwVar3;
        } else {
            cavVarB.s();
            cmwVar2 = cmwVar;
            aonnVar8 = aonnVar4;
            i11 = i;
            azzVar2 = azzVar;
            aonnVar9 = aonnVar5;
            aonnVar10 = aonnVar6;
            aonnVar11 = aonnVar7;
            j3 = j2;
        }
        cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new acql(cmwVar2, aonnVar9, aonnVar10, aonnVar11, aonnVar8, i11, j, j3, azzVar2, aonoVar, i2, i3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r26v4 */
    /* JADX WARN: Type inference failed for: r26v5 */
    /* JADX WARN: Type inference failed for: r2v10, types: [cmw] */
    /* JADX WARN: Type inference failed for: r2v15, types: [cmw] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v14, types: [cmt] */
    public static void L(boolean z, defpackage.cmw cmwVar, bsp bspVar, defpackage.cav cavVar, int i) {
        int i2;
        ?? r2;
        bsp bspVar2;
        ?? r26;
        defpackage.cav cavVarB = cavVar.b(528231714);
        if ((i & 6) == 0) {
            i2 = (true != cavVarB.C(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.D(null) ? 16 : 32;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= true != cavVarB.C(true) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= 8192;
        }
        int i4 = i3 | 196608;
        if (cavVarB.H((74899 & i4) != 74898, i4 & 1)) {
            ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
            if ((i & 1) == 0 || cavVarB.E()) {
                defpackage.cmt cmtVar = defpackage.cmw.c;
                long jT = defpackage.abrz.t(25, cavVarB);
                long jT2 = defpackage.abrz.t(18, cavVarB);
                long jH = defpackage.cqg.h(defpackage.abrz.t(17, cavVarB), 0.38f);
                long jH2 = defpackage.cqg.h(defpackage.abrz.t(17, cavVarB), 0.38f);
                defpackage.bor borVarAk = defpackage.den.ak(cavVarB);
                bsp bspVar3 = borVarAk.ai;
                if (bspVar3 == null) {
                    bspVar3 = new bsp(defpackage.bos.b(borVarAk, 25), defpackage.bos.b(borVarAk, 18), defpackage.cqg.h(defpackage.bos.b(borVarAk, 17), 0.38f), defpackage.cqg.h(defpackage.bos.b(borVarAk, 17), 0.38f));
                    borVarAk.ai = bspVar3;
                }
                if (jT == 16) {
                    jT = bspVar3.a;
                }
                long j = jT;
                long j2 = jT2 != 16 ? jT2 : bspVar3.b;
                if (jH == 16) {
                    jH = bspVar3.c;
                }
                long j3 = jH;
                if (jH2 == 16) {
                    jH2 = bspVar3.d;
                }
                bspVar2 = new bsp(j, j2, j3, jH2);
                r26 = cmtVar;
            } else {
                cavVarB.s();
                bspVar2 = bspVar;
                i4 = i4;
                r26 = cmwVar;
            }
            ?? r3 = r26;
            cavVarB.l();
            rm.w(z, (defpackage.cmw) r3, bspVar2, cavVarB, i4 & 466942);
            r2 = r3;
        } else {
            cavVarB.s();
            r2 = cmwVar;
            bspVar2 = bspVar;
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new acqk(z, (defpackage.cmw) r2, bspVar2, i, 0);
        }
    }

    public static void M(defpackage.cmw cmwVar, long j, float f, long j2, int i, float f2, defpackage.cav cavVar, int i2, int i3) {
        defpackage.cmw cmwVar2;
        int i4;
        long j3;
        defpackage.cav cavVar2;
        long j4;
        defpackage.cmw cmwVar3;
        long j5;
        int i5;
        float f3;
        long jT;
        int i6;
        defpackage.cmw cmwVar4;
        int i7;
        float f4;
        long j6;
        long jM;
        int i8 = i3 & 1;
        defpackage.cav cavVarB = cavVar.b(1089495583);
        if (i8 != 0) {
            i4 = i2 | 6;
            cmwVar2 = cmwVar;
        } else if ((i2 & 6) == 0) {
            cmwVar2 = cmwVar;
            i4 = (true != cavVarB.B(cmwVar2) ? 2 : 4) | i2;
        } else {
            cmwVar2 = cmwVar;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            int i9 = 16;
            j3 = j;
            if ((i3 & 2) == 0 && cavVarB.A(j3)) {
                i9 = 32;
            }
            i4 |= i9;
        } else {
            j3 = j;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != cavVarB.y(f) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i4 |= 1024;
        }
        int i10 = i4 | 221184;
        if (cavVarB.H((74899 & i10) != 74898, i10 & 1)) {
            int i11 = i3 & 2;
            ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
            if ((i2 & 1) == 0 || cavVarB.E()) {
                defpackage.cmw cmwVar5 = i8 != 0 ? defpackage.cmw.c : cmwVar2;
                if (i11 != 0) {
                    i10 &= -113;
                    jT = defpackage.abrz.t(25, cavVarB);
                } else {
                    jT = j3;
                }
                i6 = i10 & (-7169);
                cmwVar4 = cmwVar5;
                i7 = 1;
                f4 = 4.0f;
                j6 = jT;
                jM = defpackage.cfd.M(0);
            } else {
                cavVarB.s();
                if (i11 != 0) {
                    i10 &= -113;
                }
                i6 = i10 & (-7169);
                jM = j2;
                i7 = i;
                f4 = f2;
                cmwVar4 = cmwVar2;
                j6 = j3;
            }
            cavVarB.l();
            cavVar2 = cavVarB;
            bsn.c(cmwVar4, j6, f, jM, i7, f4, cavVar2, i6 & 517118);
            cmwVar3 = cmwVar4;
            j5 = j6;
            j4 = jM;
            i5 = i7;
            f3 = f4;
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
            j4 = j2;
            cmwVar3 = cmwVar2;
            j5 = j3;
            i5 = i;
            f3 = f2;
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new acqj(cmwVar3, j5, f, j4, i5, f3, i2, i3);
        }
    }

    public static void N(defpackage.cmw cmwVar, long j, long j2, int i, float f, defpackage.cav cavVar, int i2) {
        defpackage.cav cavVar2;
        defpackage.cmw cmwVar2;
        long j3;
        int i3;
        float f2;
        defpackage.cmw cmwVar3;
        int i4;
        long jT;
        float f3;
        defpackage.cav cavVarB = cavVar.b(-811404689);
        int i5 = i2 | 6;
        if ((i2 & 48) == 0) {
            i5 = i2 | 22;
        }
        if ((i2 & 384) == 0) {
            i5 |= true != cavVarB.A(j2) ? 128 : 256;
        }
        int i6 = i5 | 27648;
        if (cavVarB.H((i6 & 9363) != 9362, i6 & 1)) {
            ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
            if ((i2 & 1) == 0 || cavVarB.E()) {
                cmwVar3 = defpackage.cmw.c;
                i4 = 1;
                jT = defpackage.abrz.t(25, cavVarB);
                f3 = 4.0f;
            } else {
                cavVarB.s();
                cmwVar3 = cmwVar;
                jT = j;
                i4 = i;
                f3 = f;
            }
            cavVarB.l();
            cavVar2 = cavVarB;
            bsn.d(cmwVar3, jT, j2, i4, f3, cavVar2, i6 & 65422);
            cmwVar2 = cmwVar3;
            j3 = jT;
            i3 = i4;
            f2 = f3;
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
            cmwVar2 = cmwVar;
            j3 = j;
            i3 = i;
            f2 = f;
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new acqi(cmwVar2, j3, j2, i3, f2, i2, 0);
        }
    }

    public static void O(defpackage.aomy aomyVar, defpackage.cmw cmwVar, btt bttVar, float f, boolean z, defpackage.crd crdVar, long j, long j2, float f2, long j3, defpackage.aonn aonnVar, defpackage.aonn aonnVar2, brt brtVar, defpackage.aono aonoVar, defpackage.cav cavVar, int i, int i2, int i3) {
        int i4;
        btt bttVarJ;
        float f3;
        defpackage.crd crdVarA;
        long jT;
        long j4;
        int i5;
        defpackage.cmw cmwVar2;
        boolean z2;
        brt brtVar2;
        float f4;
        long j5;
        defpackage.crd crdVar2;
        long j6;
        btt bttVar2;
        float f5;
        long j7;
        defpackage.aonn aonnVar3;
        defpackage.aonn aonnVar4;
        float f6;
        long jR;
        float f7;
        long jH;
        defpackage.aonn xpfVar;
        int i6;
        defpackage.aonn aonnVar5;
        int i7;
        defpackage.aonn aonnVar6;
        float f8;
        brt brtVar3;
        long j8;
        int i8;
        defpackage.aooh.f(aomyVar, "onDismissRequest");
        defpackage.aooh.f(aonoVar, "content");
        int i9 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1062056186);
        if (i9 == 0) {
            i4 = (true != cavVarB.D(aomyVar) ? 2 : 4) | i;
        } else {
            i4 = i;
        }
        int i10 = i3 & 2;
        if (i10 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            int i11 = 128;
            if ((i3 & 4) == 0) {
                bttVarJ = bttVar;
                if (cavVarB.B(bttVarJ)) {
                    i11 = 256;
                }
            } else {
                bttVarJ = bttVar;
            }
            i4 |= i11;
        } else {
            bttVarJ = bttVar;
        }
        if ((i & 3072) == 0) {
            if ((i3 & 8) == 0) {
                f3 = f;
                if (cavVarB.y(f3)) {
                    i8 = 2048;
                }
                i4 |= i8;
            } else {
                f3 = f;
            }
            i8 = 1024;
            i4 |= i8;
        } else {
            f3 = f;
        }
        int i12 = i3 & 16;
        boolean z3 = i12 == 0;
        if (i12 != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            i4 |= true != cavVarB.C(z) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            int i13 = 65536;
            if ((i3 & 32) == 0) {
                crdVarA = crdVar;
                if (cavVarB.B(crdVarA)) {
                    i13 = 131072;
                }
            } else {
                crdVarA = crdVar;
            }
            i4 |= i13;
        } else {
            crdVarA = crdVar;
        }
        if ((i & 1572864) == 0) {
            int i14 = 524288;
            jT = j;
            if ((i3 & 64) == 0 && cavVarB.A(jT)) {
                i14 = 1048576;
            }
            i4 |= i14;
        } else {
            jT = j;
        }
        if ((i & 12582912) == 0) {
            int i15 = 4194304;
            j4 = j2;
            if ((i3 & 128) == 0 && cavVarB.A(j4)) {
                i15 = 8388608;
            }
            i4 |= i15;
        } else {
            j4 = j2;
        }
        if ((i & 100663296) == 0) {
            int i16 = 33554432;
            if ((i3 & 256) == 0 && cavVarB.y(f2)) {
                i16 = 67108864;
            }
            i4 |= i16;
        }
        if ((i & 805306368) == 0) {
            i4 |= ((i3 & 512) == 0 && cavVarB.A(j3)) ? 536870912 : 268435456;
        }
        int i17 = i3 & 1024;
        if (i17 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = i2 | (true != cavVarB.D(aonnVar) ? 2 : 4);
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= ((i3 & 2048) == 0 && cavVarB.D(aonnVar2)) ? 32 : 16;
        }
        int i18 = i5 | 384;
        if ((i2 & 3072) == 0) {
            i18 |= true != cavVarB.D(aonoVar) ? 1024 : 2048;
        }
        if (cavVarB.H(((306783379 & i4) == 306783378 && (i18 & 1171) == 1170) ? false : true, i4 & 1)) {
            int i19 = i3 & 2048;
            int i20 = i3 & 512;
            int i21 = i3 & 256;
            int i22 = i3 & 128;
            int i23 = i3 & 64;
            int i24 = i3 & 32;
            int i25 = i3 & 8;
            int i26 = i3 & 4;
            int i27 = i18;
            ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
            if ((i & 1) == 0 || cavVarB.E()) {
                defpackage.cmw cmwVar3 = i10 != 0 ? defpackage.cmw.c : cmwVar;
                if (i26 != 0) {
                    i4 &= -897;
                    bttVarJ = rl.j(false, cavVarB, 3);
                }
                if (i25 != 0) {
                    i4 &= -7169;
                    f6 = 640.0f;
                } else {
                    f6 = f3;
                }
                boolean z4 = (!z3) | z;
                if (i24 != 0) {
                    i4 &= -458753;
                    crdVarA = defpackage.acqn.a(3, cavVarB);
                }
                if (i23 != 0) {
                    i4 &= -3670017;
                    jT = defpackage.abrz.t(39, cavVarB);
                }
                if (i22 != 0) {
                    jR = defpackage.abrz.r(jT, cavVarB);
                    i4 &= -29360129;
                } else {
                    jR = j4;
                }
                if (i21 != 0) {
                    i4 &= -234881025;
                    f7 = 1.0f;
                } else {
                    f7 = f2;
                }
                if (i20 != 0) {
                    jH = defpackage.cqg.h(defpackage.abrz.t(29, cavVarB), 0.32f);
                    i4 &= -1879048193;
                } else {
                    jH = j3;
                }
                defpackage.aonn aonnVar7 = i17 != 0 ? acpu.a : aonnVar;
                if (i19 != 0) {
                    xpfVar = new xpf(19);
                    i6 = i27 & (-113);
                } else {
                    xpfVar = aonnVar2;
                    i6 = i27;
                }
                i4 = i4;
                cavVarB = cavVarB;
                crdVarA = crdVarA;
                jT = jT;
                aonnVar5 = xpfVar;
                i7 = i6;
                aonnVar6 = aonnVar7;
                cmwVar = cmwVar3;
                f8 = f7;
                z = z4;
                long j9 = jR;
                f3 = f6;
                bttVarJ = bttVarJ;
                brtVar3 = new brt();
                j8 = jH;
                j4 = j9;
            } else {
                cavVarB.s();
                if (i26 != 0) {
                    i4 &= -897;
                }
                if (i25 != 0) {
                    i4 &= -7169;
                }
                if (i24 != 0) {
                    i4 &= -458753;
                }
                if (i23 != 0) {
                    i4 &= -3670017;
                }
                if (i22 != 0) {
                    i4 &= -29360129;
                }
                if (i21 != 0) {
                    i4 &= -234881025;
                }
                if (i20 != 0) {
                    i4 &= -1879048193;
                }
                i7 = i19 != 0 ? i27 & (-113) : i27;
                f8 = f2;
                j8 = j3;
                aonnVar6 = aonnVar;
                aonnVar5 = aonnVar2;
                brtVar3 = brtVar;
            }
            cavVarB.l();
            rl.i(aomyVar, cmwVar, bttVarJ, f3, z, crdVarA, jT, j4, f8, j8, aonnVar6, aonnVar5, brtVar3, aonoVar, cavVarB, i4 & 2147483646, i7 & 8190);
            brtVar2 = brtVar3;
            aonnVar4 = aonnVar5;
            aonnVar3 = aonnVar6;
            j7 = j8;
            f5 = f8;
            j5 = j4;
            j6 = jT;
            crdVar2 = crdVarA;
            z2 = z;
            f4 = f3;
            bttVar2 = bttVarJ;
            cmwVar2 = cmwVar;
        } else {
            cavVarB = cavVarB;
            cavVarB.s();
            cmwVar2 = cmwVar;
            z2 = z;
            brtVar2 = brtVar;
            f4 = f3;
            j5 = j4;
            crdVar2 = crdVarA;
            j6 = jT;
            bttVar2 = bttVarJ;
            f5 = f2;
            j7 = j3;
            aonnVar3 = aonnVar;
            aonnVar4 = aonnVar2;
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new acqe(aomyVar, cmwVar2, bttVar2, f4, z2, crdVar2, j6, j5, f5, j7, aonnVar3, aonnVar4, brtVar2, aonoVar, i, i2, i3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x012e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0135  */
    /* JADX WARN: Code duplicated, block: B:105:0x013f  */
    /* JADX WARN: Code duplicated, block: B:108:0x0160  */
    /* JADX WARN: Code duplicated, block: B:111:0x0170  */
    /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x006e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0079  */
    /* JADX WARN: Code duplicated, block: B:42:0x007c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code duplicated, block: B:46:0x0086  */
    /* JADX WARN: Code duplicated, block: B:47:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x0090  */
    /* JADX WARN: Code duplicated, block: B:52:0x0092  */
    /* JADX WARN: Code duplicated, block: B:55:0x0097  */
    /* JADX WARN: Code duplicated, block: B:56:0x009a  */
    /* JADX WARN: Code duplicated, block: B:58:0x009e  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00af  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:80:0x00de  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:91:0x0113  */
    /* JADX WARN: Code duplicated, block: B:97:0x0127 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x0129  */
    public static void P(defpackage.aonn aonnVar, defpackage.aomy aomyVar, defpackage.cmw cmwVar, defpackage.aonn aonnVar2, boolean z, brb brbVar, defpackage.ayy ayyVar, defpackage.cav cavVar, int i, int i2) {
        int i3;
        defpackage.cmw cmwVar2;
        int i4;
        defpackage.aonn aonnVar3;
        int i5;
        int i6;
        int i7;
        boolean z2;
        int i8;
        brb brbVarA;
        int i9;
        defpackage.ayy ayyVar2;
        int i10;
        int i11;
        boolean z3;
        boolean z4;
        defpackage.cmw cmwVar3;
        defpackage.aonn aonnVar4;
        brb brbVar2;
        defpackage.ayy ayyVar3;
        defpackage.cdk cdkVarI;
        int i12;
        int i13;
        defpackage.cmw cmwVar4;
        defpackage.aonn aonnVar5;
        brb brbVar3;
        defpackage.ayy ayyVar4;
        boolean z5;
        int i14;
        defpackage.aooh.f(aonnVar, "text");
        defpackage.aooh.f(aomyVar, "onClick");
        int i15 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1579613107);
        if (i15 == 0) {
            i3 = (true != cavVarB.D(aonnVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != cavVarB.D(aomyVar) ? 16 : 32;
        }
        int i16 = i2 & 4;
        if (i16 == 0) {
            if ((i & 384) == 0) {
                cmwVar2 = cmwVar;
                i3 |= true != cavVarB.B(cmwVar2) ? 128 : 256;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    aonnVar3 = aonnVar2;
                    if (true != cavVarB.D(aonnVar3)) {
                        i5 = 1024;
                    } else {
                        i5 = 2048;
                    }
                    i3 |= i5;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    if (true != cavVarB.D(null)) {
                        i6 = 8192;
                    } else {
                        i6 = 16384;
                    }
                    i3 |= i6;
                }
                i7 = i2 & 32;
                if (i7 != 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (i7 != 0) {
                    i3 |= 196608;
                } else if ((i & 196608) == 0) {
                    if (true != cavVarB.C(z)) {
                        i8 = 65536;
                    } else {
                        i8 = 131072;
                    }
                    i3 |= i8;
                }
                if ((1572864 & i) == 0) {
                    i14 = 524288;
                    if ((i2 & 64) == 0) {
                        brbVarA = brbVar;
                        if (cavVarB.B(brbVarA)) {
                            i14 = 1048576;
                        }
                    } else {
                        brbVarA = brbVar;
                    }
                    i3 |= i14;
                } else {
                    brbVarA = brbVar;
                }
                i9 = i2 & 128;
                if (i9 != 0) {
                    i3 |= 12582912;
                    ayyVar2 = ayyVar;
                } else {
                    ayyVar2 = ayyVar;
                    if ((i & 12582912) == 0) {
                        if (true != cavVarB.B(ayyVar2)) {
                            i10 = 4194304;
                        } else {
                            i10 = 8388608;
                        }
                        i3 |= i10;
                    }
                }
                i11 = i3 | 100663296;
                if ((38347923 & i11) != 38347922) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (cavVarB.H(z3, i11 & 1)) {
                    i12 = i2 & 64;
                    ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
                    if ((i & 1) != 0 || cavVarB.E()) {
                        if (i16 != 0) {
                            cmwVar2 = defpackage.cmw.c;
                        }
                        if (i4 != 0) {
                            aonnVar3 = null;
                        }
                        boolean z6 = (!z2) | z;
                        if (i12 != 0) {
                            i11 &= -3670017;
                            drs drsVar = acqc.a;
                            brbVarA = acqc.a(cavVarB);
                        }
                        if (i9 != 0) {
                            drs drsVar2 = acqc.a;
                            ayyVar2 = acqc.d;
                        }
                        i13 = i11;
                        cmwVar4 = cmwVar2;
                        aonnVar5 = aonnVar3;
                        brbVar3 = brbVarA;
                        ayyVar4 = ayyVar2;
                        z5 = z6;
                    } else {
                        cavVarB.s();
                        if (i12 != 0) {
                            i11 &= -3670017;
                        }
                        z5 = z;
                        i13 = i11;
                        cmwVar4 = cmwVar2;
                        aonnVar5 = aonnVar3;
                        brbVar3 = brbVarA;
                        ayyVar4 = ayyVar2;
                    }
                    cavVarB.l();
                    defpackage.pf.g(aonnVar, aomyVar, cmwVar4, aonnVar5, z5, brbVar3, ayyVar4, cavVarB, i13 & 268435454);
                    ayyVar3 = ayyVar4;
                    brbVar2 = brbVar3;
                    z4 = z5;
                    aonnVar4 = aonnVar5;
                    cmwVar3 = cmwVar4;
                } else {
                    cavVarB.s();
                    z4 = z;
                    cmwVar3 = cmwVar2;
                    aonnVar4 = aonnVar3;
                    brbVar2 = brbVarA;
                    ayyVar3 = ayyVar2;
                }
                cdkVarI = cavVarB.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new acpo(aonnVar, aomyVar, cmwVar3, aonnVar4, z4, brbVar2, ayyVar3, i, i2, 3);
                }
            }
            i3 |= 3072;
            aonnVar3 = aonnVar2;
            if ((i2 & 16) != 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                if (true != cavVarB.D(null)) {
                    i6 = 8192;
                } else {
                    i6 = 16384;
                }
                i3 |= i6;
            }
            i7 = i2 & 32;
            if (i7 != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (i7 != 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                if (true != cavVarB.C(z)) {
                    i8 = 65536;
                } else {
                    i8 = 131072;
                }
                i3 |= i8;
            }
            if ((1572864 & i) == 0) {
                i14 = 524288;
                if ((i2 & 64) == 0) {
                    brbVarA = brbVar;
                    if (cavVarB.B(brbVarA)) {
                        i14 = 1048576;
                    }
                } else {
                    brbVarA = brbVar;
                }
                i3 |= i14;
            } else {
                brbVarA = brbVar;
            }
            i9 = i2 & 128;
            if (i9 != 0) {
                i3 |= 12582912;
                ayyVar2 = ayyVar;
            } else {
                ayyVar2 = ayyVar;
                if ((i & 12582912) == 0) {
                    if (true != cavVarB.B(ayyVar2)) {
                        i10 = 4194304;
                    } else {
                        i10 = 8388608;
                    }
                    i3 |= i10;
                }
            }
            i11 = i3 | 100663296;
            if ((38347923 & i11) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (cavVarB.H(z3, i11 & 1)) {
                i12 = i2 & 64;
                ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
                if ((i & 1) != 0) {
                    if (i16 != 0) {
                        cmwVar2 = defpackage.cmw.c;
                    }
                    if (i4 != 0) {
                        aonnVar3 = null;
                    }
                    boolean z7 = (!z2) | z;
                    if (i12 != 0) {
                        i11 &= -3670017;
                        drs drsVar3 = acqc.a;
                        brbVarA = acqc.a(cavVarB);
                    }
                    if (i9 != 0) {
                        drs drsVar4 = acqc.a;
                        ayyVar2 = acqc.d;
                    }
                    i13 = i11;
                    cmwVar4 = cmwVar2;
                    aonnVar5 = aonnVar3;
                    brbVar3 = brbVarA;
                    ayyVar4 = ayyVar2;
                    z5 = z7;
                } else {
                    if (i16 != 0) {
                        cmwVar2 = defpackage.cmw.c;
                    }
                    if (i4 != 0) {
                        aonnVar3 = null;
                    }
                    boolean z8 = (!z2) | z;
                    if (i12 != 0) {
                        i11 &= -3670017;
                        drs drsVar5 = acqc.a;
                        brbVarA = acqc.a(cavVarB);
                    }
                    if (i9 != 0) {
                        drs drsVar6 = acqc.a;
                        ayyVar2 = acqc.d;
                    }
                    i13 = i11;
                    cmwVar4 = cmwVar2;
                    aonnVar5 = aonnVar3;
                    brbVar3 = brbVarA;
                    ayyVar4 = ayyVar2;
                    z5 = z8;
                }
                cavVarB.l();
                defpackage.pf.g(aonnVar, aomyVar, cmwVar4, aonnVar5, z5, brbVar3, ayyVar4, cavVarB, i13 & 268435454);
                ayyVar3 = ayyVar4;
                brbVar2 = brbVar3;
                z4 = z5;
                aonnVar4 = aonnVar5;
                cmwVar3 = cmwVar4;
            } else {
                cavVarB.s();
                z4 = z;
                cmwVar3 = cmwVar2;
                aonnVar4 = aonnVar3;
                brbVar2 = brbVarA;
                ayyVar3 = ayyVar2;
            }
            cdkVarI = cavVarB.I();
            if (cdkVarI != null) {
                cdkVarI.c = new acpo(aonnVar, aomyVar, cmwVar3, aonnVar4, z4, brbVar2, ayyVar3, i, i2, 3);
            }
        }
        i3 |= 384;
        cmwVar2 = cmwVar;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                aonnVar3 = aonnVar2;
                if (true != cavVarB.D(aonnVar3)) {
                    i5 = 1024;
                } else {
                    i5 = 2048;
                }
                i3 |= i5;
            }
            if ((i2 & 16) != 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                if (true != cavVarB.D(null)) {
                    i6 = 8192;
                } else {
                    i6 = 16384;
                }
                i3 |= i6;
            }
            i7 = i2 & 32;
            if (i7 != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (i7 != 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                if (true != cavVarB.C(z)) {
                    i8 = 65536;
                } else {
                    i8 = 131072;
                }
                i3 |= i8;
            }
            if ((1572864 & i) == 0) {
                i14 = 524288;
                if ((i2 & 64) == 0) {
                    brbVarA = brbVar;
                    if (cavVarB.B(brbVarA)) {
                        i14 = 1048576;
                    }
                } else {
                    brbVarA = brbVar;
                }
                i3 |= i14;
            } else {
                brbVarA = brbVar;
            }
            i9 = i2 & 128;
            if (i9 != 0) {
                i3 |= 12582912;
                ayyVar2 = ayyVar;
            } else {
                ayyVar2 = ayyVar;
                if ((i & 12582912) == 0) {
                    if (true != cavVarB.B(ayyVar2)) {
                        i10 = 4194304;
                    } else {
                        i10 = 8388608;
                    }
                    i3 |= i10;
                }
            }
            i11 = i3 | 100663296;
            if ((38347923 & i11) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (cavVarB.H(z3, i11 & 1)) {
                i12 = i2 & 64;
                ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
                if ((i & 1) != 0) {
                    if (i16 != 0) {
                        cmwVar2 = defpackage.cmw.c;
                    }
                    if (i4 != 0) {
                        aonnVar3 = null;
                    }
                    boolean z9 = (!z2) | z;
                    if (i12 != 0) {
                        i11 &= -3670017;
                        drs drsVar7 = acqc.a;
                        brbVarA = acqc.a(cavVarB);
                    }
                    if (i9 != 0) {
                        drs drsVar8 = acqc.a;
                        ayyVar2 = acqc.d;
                    }
                    i13 = i11;
                    cmwVar4 = cmwVar2;
                    aonnVar5 = aonnVar3;
                    brbVar3 = brbVarA;
                    ayyVar4 = ayyVar2;
                    z5 = z9;
                } else {
                    if (i16 != 0) {
                        cmwVar2 = defpackage.cmw.c;
                    }
                    if (i4 != 0) {
                        aonnVar3 = null;
                    }
                    boolean z10 = (!z2) | z;
                    if (i12 != 0) {
                        i11 &= -3670017;
                        drs drsVar9 = acqc.a;
                        brbVarA = acqc.a(cavVarB);
                    }
                    if (i9 != 0) {
                        drs drsVar10 = acqc.a;
                        ayyVar2 = acqc.d;
                    }
                    i13 = i11;
                    cmwVar4 = cmwVar2;
                    aonnVar5 = aonnVar3;
                    brbVar3 = brbVarA;
                    ayyVar4 = ayyVar2;
                    z5 = z10;
                }
                cavVarB.l();
                defpackage.pf.g(aonnVar, aomyVar, cmwVar4, aonnVar5, z5, brbVar3, ayyVar4, cavVarB, i13 & 268435454);
                ayyVar3 = ayyVar4;
                brbVar2 = brbVar3;
                z4 = z5;
                aonnVar4 = aonnVar5;
                cmwVar3 = cmwVar4;
            } else {
                cavVarB.s();
                z4 = z;
                cmwVar3 = cmwVar2;
                aonnVar4 = aonnVar3;
                brbVar2 = brbVarA;
                ayyVar3 = ayyVar2;
            }
            cdkVarI = cavVarB.I();
            if (cdkVarI != null) {
                cdkVarI.c = new acpo(aonnVar, aomyVar, cmwVar3, aonnVar4, z4, brbVar2, ayyVar3, i, i2, 3);
            }
        }
        i3 |= 3072;
        aonnVar3 = aonnVar2;
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (true != cavVarB.D(null)) {
                i6 = 8192;
            } else {
                i6 = 16384;
            }
            i3 |= i6;
        }
        i7 = i2 & 32;
        if (i7 != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (i7 != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            if (true != cavVarB.C(z)) {
                i8 = 65536;
            } else {
                i8 = 131072;
            }
            i3 |= i8;
        }
        if ((1572864 & i) == 0) {
            i14 = 524288;
            if ((i2 & 64) == 0) {
                brbVarA = brbVar;
                if (cavVarB.B(brbVarA)) {
                    i14 = 1048576;
                }
            } else {
                brbVarA = brbVar;
            }
            i3 |= i14;
        } else {
            brbVarA = brbVar;
        }
        i9 = i2 & 128;
        if (i9 != 0) {
            i3 |= 12582912;
            ayyVar2 = ayyVar;
        } else {
            ayyVar2 = ayyVar;
            if ((i & 12582912) == 0) {
                if (true != cavVarB.B(ayyVar2)) {
                    i10 = 4194304;
                } else {
                    i10 = 8388608;
                }
                i3 |= i10;
            }
        }
        i11 = i3 | 100663296;
        if ((38347923 & i11) != 38347922) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (cavVarB.H(z3, i11 & 1)) {
            i12 = i2 & 64;
            ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
            if ((i & 1) != 0) {
                if (i16 != 0) {
                    cmwVar2 = defpackage.cmw.c;
                }
                if (i4 != 0) {
                    aonnVar3 = null;
                }
                boolean z11 = (!z2) | z;
                if (i12 != 0) {
                    i11 &= -3670017;
                    drs drsVar11 = acqc.a;
                    brbVarA = acqc.a(cavVarB);
                }
                if (i9 != 0) {
                    drs drsVar12 = acqc.a;
                    ayyVar2 = acqc.d;
                }
                i13 = i11;
                cmwVar4 = cmwVar2;
                aonnVar5 = aonnVar3;
                brbVar3 = brbVarA;
                ayyVar4 = ayyVar2;
                z5 = z11;
            } else {
                if (i16 != 0) {
                    cmwVar2 = defpackage.cmw.c;
                }
                if (i4 != 0) {
                    aonnVar3 = null;
                }
                boolean z12 = (!z2) | z;
                if (i12 != 0) {
                    i11 &= -3670017;
                    drs drsVar13 = acqc.a;
                    brbVarA = acqc.a(cavVarB);
                }
                if (i9 != 0) {
                    drs drsVar14 = acqc.a;
                    ayyVar2 = acqc.d;
                }
                i13 = i11;
                cmwVar4 = cmwVar2;
                aonnVar5 = aonnVar3;
                brbVar3 = brbVarA;
                ayyVar4 = ayyVar2;
                z5 = z12;
            }
            cavVarB.l();
            defpackage.pf.g(aonnVar, aomyVar, cmwVar4, aonnVar5, z5, brbVar3, ayyVar4, cavVarB, i13 & 268435454);
            ayyVar3 = ayyVar4;
            brbVar2 = brbVar3;
            z4 = z5;
            aonnVar4 = aonnVar5;
            cmwVar3 = cmwVar4;
        } else {
            cavVarB.s();
            z4 = z;
            cmwVar3 = cmwVar2;
            aonnVar4 = aonnVar3;
            brbVar2 = brbVarA;
            ayyVar3 = ayyVar2;
        }
        cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new acpo(aonnVar, aomyVar, cmwVar3, aonnVar4, z4, brbVar2, ayyVar3, i, i2, 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0130  */
    /* JADX WARN: Code duplicated, block: B:103:0x0139  */
    /* JADX WARN: Code duplicated, block: B:105:0x015a  */
    /* JADX WARN: Code duplicated, block: B:115:0x0177 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:116:0x0179  */
    /* JADX WARN: Code duplicated, block: B:117:0x017c  */
    /* JADX WARN: Code duplicated, block: B:119:0x017f  */
    /* JADX WARN: Code duplicated, block: B:120:0x0182  */
    /* JADX WARN: Code duplicated, block: B:122:0x0185  */
    /* JADX WARN: Code duplicated, block: B:123:0x018c  */
    /* JADX WARN: Code duplicated, block: B:125:0x018f  */
    /* JADX WARN: Code duplicated, block: B:126:0x0194  */
    /* JADX WARN: Code duplicated, block: B:128:0x0197  */
    /* JADX WARN: Code duplicated, block: B:130:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:131:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:133:0x01af  */
    /* JADX WARN: Code duplicated, block: B:136:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:139:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x006e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:43:0x007e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0086  */
    /* JADX WARN: Code duplicated, block: B:46:0x0089  */
    /* JADX WARN: Code duplicated, block: B:48:0x008e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    /* JADX WARN: Code duplicated, block: B:52:0x009b  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:80:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:89:0x0103  */
    /* JADX WARN: Code duplicated, block: B:91:0x010c  */
    /* JADX WARN: Code duplicated, block: B:92:0x010f  */
    /* JADX WARN: Code duplicated, block: B:94:0x0114  */
    /* JADX WARN: Code duplicated, block: B:97:0x0128  */
    public static void Q(boolean z, defpackage.aomy aomyVar, defpackage.cmw cmwVar, long j, aon aonVar, drs drsVar, defpackage.crd crdVar, long j2, float f, defpackage.aono aonoVar, defpackage.cav cavVar, int i, int i2, int i3) {
        int i4;
        defpackage.cmw cmwVar2;
        int i5;
        long j3;
        int i6;
        aon aonVar2;
        int i7;
        drs drsVar2;
        int i8;
        defpackage.crd crdVarA;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z2;
        float f2;
        aon aonVar3;
        drs drsVar3;
        defpackage.cmw cmwVar3;
        long j4;
        defpackage.crd crdVar2;
        long j5;
        defpackage.cdk cdkVarI;
        int i15;
        int i16;
        int i17;
        defpackage.cmw cmwVar4;
        long j6;
        aon aonVarE;
        drs drsVar4;
        long jT;
        defpackage.cmw cmwVar5;
        float f3;
        aon aonVar4;
        int i18;
        drs drsVar5;
        defpackage.crd crdVar3;
        long j7;
        int i19;
        int i20;
        int i21;
        int i22;
        defpackage.aooh.f(aomyVar, "onDismissRequest");
        defpackage.aooh.f(aonoVar, "content");
        int i23 = i & 6;
        defpackage.cav cavVarB = cavVar.b(165254009);
        if (i23 == 0) {
            i4 = (true != cavVarB.C(z) ? 2 : 4) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= true != cavVarB.D(aomyVar) ? 16 : 32;
        }
        int i24 = i3 & 4;
        if (i24 == 0) {
            if ((i & 384) == 0) {
                cmwVar2 = cmwVar;
                i4 |= true != cavVarB.B(cmwVar2) ? 128 : 256;
            }
            i5 = i3 & 8;
            if (i5 != 0) {
                if ((i & 3072) == 0) {
                    j3 = j;
                    if (true != cavVarB.A(j3)) {
                        i6 = 1024;
                    } else {
                        i6 = 2048;
                    }
                    i4 |= i6;
                }
                if ((i & 24576) == 0) {
                    i22 = 8192;
                    if ((i3 & 16) == 0) {
                        aonVar2 = aonVar;
                        if (cavVarB.B(aonVar2)) {
                            i22 = 16384;
                        }
                    } else {
                        aonVar2 = aonVar;
                    }
                    i4 |= i22;
                } else {
                    aonVar2 = aonVar;
                }
                i7 = i3 & 32;
                if (i7 != 0) {
                    i4 |= 196608;
                    drsVar2 = drsVar;
                } else {
                    drsVar2 = drsVar;
                    if ((i & 196608) == 0) {
                        if (true != cavVarB.B(drsVar2)) {
                            i8 = 65536;
                        } else {
                            i8 = 131072;
                        }
                        i4 |= i8;
                    }
                }
                if ((1572864 & i) == 0) {
                    i21 = 524288;
                    if ((i3 & 64) == 0) {
                        crdVarA = crdVar;
                        if (cavVarB.B(crdVarA)) {
                            i21 = 1048576;
                        }
                    } else {
                        crdVarA = crdVar;
                    }
                    i4 |= i21;
                } else {
                    crdVarA = crdVar;
                }
                if ((i & 12582912) == 0) {
                    i20 = 4194304;
                    if ((i3 & 128) == 0 && cavVarB.A(j2)) {
                        i20 = 8388608;
                    }
                    i4 |= i20;
                }
                i9 = i3 & 256;
                if (i9 != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (true != cavVarB.y(0.0f)) {
                        i10 = 33554432;
                    } else {
                        i10 = 67108864;
                    }
                    i4 |= i10;
                }
                i11 = i2 | 6;
                if ((i2 & 48) == 0) {
                    if (true != cavVarB.D(aonoVar)) {
                        i19 = 16;
                    } else {
                        i19 = 32;
                    }
                    i12 = i11 | i19;
                } else {
                    i12 = i11;
                }
                i13 = i4 | 805306368;
                i14 = i12;
                if ((i13 & 306783379) == 306783378 || (i14 & 19) != 18) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (cavVarB.H(z2, i13 & 1)) {
                    i15 = i3 & 128;
                    i16 = i3 & 64;
                    i17 = i3 & 16;
                    ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
                    if ((i & 1) != 0 || cavVarB.E()) {
                        if (i24 != 0) {
                            cmwVar4 = defpackage.cmw.c;
                        } else {
                            cmwVar4 = cmwVar2;
                        }
                        if (i5 != 0) {
                            j6 = 0;
                        } else {
                            j6 = j3;
                        }
                        if (i17 != 0) {
                            i13 &= -57345;
                            aonVarE = rl.e(cavVarB, 0);
                        } else {
                            aonVarE = aonVar2;
                        }
                        if (i7 != 0) {
                            drs drsVar6 = acqc.a;
                            drsVar4 = acqc.a;
                        } else {
                            drsVar4 = drsVar2;
                        }
                        if (i16 != 0) {
                            drs drsVar7 = acqc.a;
                            crdVarA = defpackage.acqn.a(4, cavVarB);
                            i13 &= -3670017;
                        }
                        if (i15 != 0) {
                            drs drsVar8 = acqc.a;
                            jT = defpackage.abrz.t(36, cavVarB);
                            i13 &= -29360129;
                        } else {
                            jT = j2;
                        }
                        if (i9 != 0) {
                            drs drsVar9 = acqc.a;
                        }
                        drs drsVar10 = acqc.a;
                        cmwVar5 = cmwVar4;
                        f3 = acqc.b;
                        aonVar4 = aonVarE;
                        i18 = i13;
                        drsVar5 = drsVar4;
                        crdVar3 = crdVarA;
                        j7 = j6;
                    } else {
                        cavVarB.s();
                        if (i17 != 0) {
                            i13 &= -57345;
                        }
                        if (i16 != 0) {
                            i13 &= -3670017;
                        }
                        if (i15 != 0) {
                            i13 &= -29360129;
                        }
                        crdVar3 = crdVarA;
                        i18 = i13;
                        aonVar4 = aonVar2;
                        drsVar5 = drsVar2;
                        cmwVar5 = cmwVar2;
                        j7 = j3;
                        jT = j2;
                        f3 = f;
                    }
                    cavVarB.l();
                    defpackage.pf.h(z, aomyVar, cmwVar5, j7, aonVar4, drsVar5, crdVar3, jT, f3, aonoVar, cavVarB, i18 & 2147483646, i14 & 126, 0);
                    f2 = f3;
                    j4 = jT;
                    crdVar2 = crdVar3;
                    drsVar3 = drsVar5;
                    aonVar3 = aonVar4;
                    j5 = j7;
                    cmwVar3 = cmwVar5;
                } else {
                    cavVarB.s();
                    f2 = f;
                    aonVar3 = aonVar2;
                    drsVar3 = drsVar2;
                    cmwVar3 = cmwVar2;
                    j4 = j2;
                    crdVar2 = crdVarA;
                    j5 = j3;
                }
                cdkVarI = cavVarB.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new acqd(z, aomyVar, cmwVar3, j5, aonVar3, drsVar3, crdVar2, j4, f2, aonoVar, i, i2, i3, 0);
                }
            }
            i4 |= 3072;
            j3 = j;
            if ((i & 24576) == 0) {
                i22 = 8192;
                if ((i3 & 16) == 0) {
                    aonVar2 = aonVar;
                    if (cavVarB.B(aonVar2)) {
                        i22 = 16384;
                    }
                } else {
                    aonVar2 = aonVar;
                }
                i4 |= i22;
            } else {
                aonVar2 = aonVar;
            }
            i7 = i3 & 32;
            if (i7 != 0) {
                i4 |= 196608;
                drsVar2 = drsVar;
            } else {
                drsVar2 = drsVar;
                if ((i & 196608) == 0) {
                    if (true != cavVarB.B(drsVar2)) {
                        i8 = 65536;
                    } else {
                        i8 = 131072;
                    }
                    i4 |= i8;
                }
            }
            if ((1572864 & i) == 0) {
                i21 = 524288;
                if ((i3 & 64) == 0) {
                    crdVarA = crdVar;
                    if (cavVarB.B(crdVarA)) {
                        i21 = 1048576;
                    }
                } else {
                    crdVarA = crdVar;
                }
                i4 |= i21;
            } else {
                crdVarA = crdVar;
            }
            if ((i & 12582912) == 0) {
                i20 = 4194304;
                if ((i3 & 128) == 0) {
                    i20 = 8388608;
                }
                i4 |= i20;
            }
            i9 = i3 & 256;
            if (i9 != 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (true != cavVarB.y(0.0f)) {
                    i10 = 33554432;
                } else {
                    i10 = 67108864;
                }
                i4 |= i10;
            }
            i11 = i2 | 6;
            if ((i2 & 48) == 0) {
                if (true != cavVarB.D(aonoVar)) {
                    i19 = 16;
                } else {
                    i19 = 32;
                }
                i12 = i11 | i19;
            } else {
                i12 = i11;
            }
            i13 = i4 | 805306368;
            i14 = i12;
            if ((i13 & 306783379) == 306783378) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (cavVarB.H(z2, i13 & 1)) {
                i15 = i3 & 128;
                i16 = i3 & 64;
                i17 = i3 & 16;
                ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
                if ((i & 1) != 0) {
                    if (i24 != 0) {
                        cmwVar4 = defpackage.cmw.c;
                    } else {
                        cmwVar4 = cmwVar2;
                    }
                    if (i5 != 0) {
                        j6 = 0;
                    } else {
                        j6 = j3;
                    }
                    if (i17 != 0) {
                        i13 &= -57345;
                        aonVarE = rl.e(cavVarB, 0);
                    } else {
                        aonVarE = aonVar2;
                    }
                    if (i7 != 0) {
                        drs drsVar11 = acqc.a;
                        drsVar4 = acqc.a;
                    } else {
                        drsVar4 = drsVar2;
                    }
                    if (i16 != 0) {
                        drs drsVar12 = acqc.a;
                        crdVarA = defpackage.acqn.a(4, cavVarB);
                        i13 &= -3670017;
                    }
                    if (i15 != 0) {
                        drs drsVar13 = acqc.a;
                        jT = defpackage.abrz.t(36, cavVarB);
                        i13 &= -29360129;
                    } else {
                        jT = j2;
                    }
                    if (i9 != 0) {
                        drs drsVar14 = acqc.a;
                    }
                    drs drsVar15 = acqc.a;
                    cmwVar5 = cmwVar4;
                    f3 = acqc.b;
                    aonVar4 = aonVarE;
                    i18 = i13;
                    drsVar5 = drsVar4;
                    crdVar3 = crdVarA;
                    j7 = j6;
                } else {
                    if (i24 != 0) {
                        cmwVar4 = defpackage.cmw.c;
                    } else {
                        cmwVar4 = cmwVar2;
                    }
                    if (i5 != 0) {
                        j6 = 0;
                    } else {
                        j6 = j3;
                    }
                    if (i17 != 0) {
                        i13 &= -57345;
                        aonVarE = rl.e(cavVarB, 0);
                    } else {
                        aonVarE = aonVar2;
                    }
                    if (i7 != 0) {
                        drs drsVar16 = acqc.a;
                        drsVar4 = acqc.a;
                    } else {
                        drsVar4 = drsVar2;
                    }
                    if (i16 != 0) {
                        drs drsVar17 = acqc.a;
                        crdVarA = defpackage.acqn.a(4, cavVarB);
                        i13 &= -3670017;
                    }
                    if (i15 != 0) {
                        drs drsVar18 = acqc.a;
                        jT = defpackage.abrz.t(36, cavVarB);
                        i13 &= -29360129;
                    } else {
                        jT = j2;
                    }
                    if (i9 != 0) {
                        drs drsVar19 = acqc.a;
                    }
                    drs drsVar110 = acqc.a;
                    cmwVar5 = cmwVar4;
                    f3 = acqc.b;
                    aonVar4 = aonVarE;
                    i18 = i13;
                    drsVar5 = drsVar4;
                    crdVar3 = crdVarA;
                    j7 = j6;
                }
                cavVarB.l();
                defpackage.pf.h(z, aomyVar, cmwVar5, j7, aonVar4, drsVar5, crdVar3, jT, f3, aonoVar, cavVarB, i18 & 2147483646, i14 & 126, 0);
                f2 = f3;
                j4 = jT;
                crdVar2 = crdVar3;
                drsVar3 = drsVar5;
                aonVar3 = aonVar4;
                j5 = j7;
                cmwVar3 = cmwVar5;
            } else {
                cavVarB.s();
                f2 = f;
                aonVar3 = aonVar2;
                drsVar3 = drsVar2;
                cmwVar3 = cmwVar2;
                j4 = j2;
                crdVar2 = crdVarA;
                j5 = j3;
            }
            cdkVarI = cavVarB.I();
            if (cdkVarI != null) {
                cdkVarI.c = new acqd(z, aomyVar, cmwVar3, j5, aonVar3, drsVar3, crdVar2, j4, f2, aonoVar, i, i2, i3, 0);
            }
        }
        i4 |= 384;
        cmwVar2 = cmwVar;
        i5 = i3 & 8;
        if (i5 != 0) {
            if ((i & 3072) == 0) {
                j3 = j;
                if (true != cavVarB.A(j3)) {
                    i6 = 1024;
                } else {
                    i6 = 2048;
                }
                i4 |= i6;
            }
            if ((i & 24576) == 0) {
                i22 = 8192;
                if ((i3 & 16) == 0) {
                    aonVar2 = aonVar;
                    if (cavVarB.B(aonVar2)) {
                        i22 = 16384;
                    }
                } else {
                    aonVar2 = aonVar;
                }
                i4 |= i22;
            } else {
                aonVar2 = aonVar;
            }
            i7 = i3 & 32;
            if (i7 != 0) {
                i4 |= 196608;
                drsVar2 = drsVar;
            } else {
                drsVar2 = drsVar;
                if ((i & 196608) == 0) {
                    if (true != cavVarB.B(drsVar2)) {
                        i8 = 65536;
                    } else {
                        i8 = 131072;
                    }
                    i4 |= i8;
                }
            }
            if ((1572864 & i) == 0) {
                i21 = 524288;
                if ((i3 & 64) == 0) {
                    crdVarA = crdVar;
                    if (cavVarB.B(crdVarA)) {
                        i21 = 1048576;
                    }
                } else {
                    crdVarA = crdVar;
                }
                i4 |= i21;
            } else {
                crdVarA = crdVar;
            }
            if ((i & 12582912) == 0) {
                i20 = 4194304;
                if ((i3 & 128) == 0) {
                    i20 = 8388608;
                }
                i4 |= i20;
            }
            i9 = i3 & 256;
            if (i9 != 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (true != cavVarB.y(0.0f)) {
                    i10 = 33554432;
                } else {
                    i10 = 67108864;
                }
                i4 |= i10;
            }
            i11 = i2 | 6;
            if ((i2 & 48) == 0) {
                if (true != cavVarB.D(aonoVar)) {
                    i19 = 16;
                } else {
                    i19 = 32;
                }
                i12 = i11 | i19;
            } else {
                i12 = i11;
            }
            i13 = i4 | 805306368;
            i14 = i12;
            if ((i13 & 306783379) == 306783378) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (cavVarB.H(z2, i13 & 1)) {
                i15 = i3 & 128;
                i16 = i3 & 64;
                i17 = i3 & 16;
                ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
                if ((i & 1) != 0) {
                    if (i24 != 0) {
                        cmwVar4 = defpackage.cmw.c;
                    } else {
                        cmwVar4 = cmwVar2;
                    }
                    if (i5 != 0) {
                        j6 = 0;
                    } else {
                        j6 = j3;
                    }
                    if (i17 != 0) {
                        i13 &= -57345;
                        aonVarE = rl.e(cavVarB, 0);
                    } else {
                        aonVarE = aonVar2;
                    }
                    if (i7 != 0) {
                        drs drsVar111 = acqc.a;
                        drsVar4 = acqc.a;
                    } else {
                        drsVar4 = drsVar2;
                    }
                    if (i16 != 0) {
                        drs drsVar112 = acqc.a;
                        crdVarA = defpackage.acqn.a(4, cavVarB);
                        i13 &= -3670017;
                    }
                    if (i15 != 0) {
                        drs drsVar113 = acqc.a;
                        jT = defpackage.abrz.t(36, cavVarB);
                        i13 &= -29360129;
                    } else {
                        jT = j2;
                    }
                    if (i9 != 0) {
                        drs drsVar114 = acqc.a;
                    }
                    drs drsVar115 = acqc.a;
                    cmwVar5 = cmwVar4;
                    f3 = acqc.b;
                    aonVar4 = aonVarE;
                    i18 = i13;
                    drsVar5 = drsVar4;
                    crdVar3 = crdVarA;
                    j7 = j6;
                } else {
                    if (i24 != 0) {
                        cmwVar4 = defpackage.cmw.c;
                    } else {
                        cmwVar4 = cmwVar2;
                    }
                    if (i5 != 0) {
                        j6 = 0;
                    } else {
                        j6 = j3;
                    }
                    if (i17 != 0) {
                        i13 &= -57345;
                        aonVarE = rl.e(cavVarB, 0);
                    } else {
                        aonVarE = aonVar2;
                    }
                    if (i7 != 0) {
                        drs drsVar116 = acqc.a;
                        drsVar4 = acqc.a;
                    } else {
                        drsVar4 = drsVar2;
                    }
                    if (i16 != 0) {
                        drs drsVar117 = acqc.a;
                        crdVarA = defpackage.acqn.a(4, cavVarB);
                        i13 &= -3670017;
                    }
                    if (i15 != 0) {
                        drs drsVar118 = acqc.a;
                        jT = defpackage.abrz.t(36, cavVarB);
                        i13 &= -29360129;
                    } else {
                        jT = j2;
                    }
                    if (i9 != 0) {
                        drs drsVar119 = acqc.a;
                    }
                    drs drsVar1110 = acqc.a;
                    cmwVar5 = cmwVar4;
                    f3 = acqc.b;
                    aonVar4 = aonVarE;
                    i18 = i13;
                    drsVar5 = drsVar4;
                    crdVar3 = crdVarA;
                    j7 = j6;
                }
                cavVarB.l();
                defpackage.pf.h(z, aomyVar, cmwVar5, j7, aonVar4, drsVar5, crdVar3, jT, f3, aonoVar, cavVarB, i18 & 2147483646, i14 & 126, 0);
                f2 = f3;
                j4 = jT;
                crdVar2 = crdVar3;
                drsVar3 = drsVar5;
                aonVar3 = aonVar4;
                j5 = j7;
                cmwVar3 = cmwVar5;
            } else {
                cavVarB.s();
                f2 = f;
                aonVar3 = aonVar2;
                drsVar3 = drsVar2;
                cmwVar3 = cmwVar2;
                j4 = j2;
                crdVar2 = crdVarA;
                j5 = j3;
            }
            cdkVarI = cavVarB.I();
            if (cdkVarI != null) {
                cdkVarI.c = new acqd(z, aomyVar, cmwVar3, j5, aonVar3, drsVar3, crdVar2, j4, f2, aonoVar, i, i2, i3, 0);
            }
        }
        i4 |= 3072;
        j3 = j;
        if ((i & 24576) == 0) {
            i22 = 8192;
            if ((i3 & 16) == 0) {
                aonVar2 = aonVar;
                if (cavVarB.B(aonVar2)) {
                    i22 = 16384;
                }
            } else {
                aonVar2 = aonVar;
            }
            i4 |= i22;
        } else {
            aonVar2 = aonVar;
        }
        i7 = i3 & 32;
        if (i7 != 0) {
            i4 |= 196608;
            drsVar2 = drsVar;
        } else {
            drsVar2 = drsVar;
            if ((i & 196608) == 0) {
                if (true != cavVarB.B(drsVar2)) {
                    i8 = 65536;
                } else {
                    i8 = 131072;
                }
                i4 |= i8;
            }
        }
        if ((1572864 & i) == 0) {
            i21 = 524288;
            if ((i3 & 64) == 0) {
                crdVarA = crdVar;
                if (cavVarB.B(crdVarA)) {
                    i21 = 1048576;
                }
            } else {
                crdVarA = crdVar;
            }
            i4 |= i21;
        } else {
            crdVarA = crdVar;
        }
        if ((i & 12582912) == 0) {
            i20 = 4194304;
            if ((i3 & 128) == 0) {
                i20 = 8388608;
            }
            i4 |= i20;
        }
        i9 = i3 & 256;
        if (i9 != 0) {
            i4 |= 100663296;
        } else if ((i & 100663296) == 0) {
            if (true != cavVarB.y(0.0f)) {
                i10 = 33554432;
            } else {
                i10 = 67108864;
            }
            i4 |= i10;
        }
        i11 = i2 | 6;
        if ((i2 & 48) == 0) {
            if (true != cavVarB.D(aonoVar)) {
                i19 = 16;
            } else {
                i19 = 32;
            }
            i12 = i11 | i19;
        } else {
            i12 = i11;
        }
        i13 = i4 | 805306368;
        i14 = i12;
        if ((i13 & 306783379) == 306783378) {
            z2 = true;
        } else {
            z2 = true;
        }
        if (cavVarB.H(z2, i13 & 1)) {
            i15 = i3 & 128;
            i16 = i3 & 64;
            i17 = i3 & 16;
            ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
            if ((i & 1) != 0) {
                if (i24 != 0) {
                    cmwVar4 = defpackage.cmw.c;
                } else {
                    cmwVar4 = cmwVar2;
                }
                if (i5 != 0) {
                    j6 = 0;
                } else {
                    j6 = j3;
                }
                if (i17 != 0) {
                    i13 &= -57345;
                    aonVarE = rl.e(cavVarB, 0);
                } else {
                    aonVarE = aonVar2;
                }
                if (i7 != 0) {
                    drs drsVar1111 = acqc.a;
                    drsVar4 = acqc.a;
                } else {
                    drsVar4 = drsVar2;
                }
                if (i16 != 0) {
                    drs drsVar1112 = acqc.a;
                    crdVarA = defpackage.acqn.a(4, cavVarB);
                    i13 &= -3670017;
                }
                if (i15 != 0) {
                    drs drsVar1113 = acqc.a;
                    jT = defpackage.abrz.t(36, cavVarB);
                    i13 &= -29360129;
                } else {
                    jT = j2;
                }
                if (i9 != 0) {
                    drs drsVar1114 = acqc.a;
                }
                drs drsVar1115 = acqc.a;
                cmwVar5 = cmwVar4;
                f3 = acqc.b;
                aonVar4 = aonVarE;
                i18 = i13;
                drsVar5 = drsVar4;
                crdVar3 = crdVarA;
                j7 = j6;
            } else {
                if (i24 != 0) {
                    cmwVar4 = defpackage.cmw.c;
                } else {
                    cmwVar4 = cmwVar2;
                }
                if (i5 != 0) {
                    j6 = 0;
                } else {
                    j6 = j3;
                }
                if (i17 != 0) {
                    i13 &= -57345;
                    aonVarE = rl.e(cavVarB, 0);
                } else {
                    aonVarE = aonVar2;
                }
                if (i7 != 0) {
                    drs drsVar1116 = acqc.a;
                    drsVar4 = acqc.a;
                } else {
                    drsVar4 = drsVar2;
                }
                if (i16 != 0) {
                    drs drsVar1117 = acqc.a;
                    crdVarA = defpackage.acqn.a(4, cavVarB);
                    i13 &= -3670017;
                }
                if (i15 != 0) {
                    drs drsVar1118 = acqc.a;
                    jT = defpackage.abrz.t(36, cavVarB);
                    i13 &= -29360129;
                } else {
                    jT = j2;
                }
                if (i9 != 0) {
                    drs drsVar1119 = acqc.a;
                }
                drs drsVar11110 = acqc.a;
                cmwVar5 = cmwVar4;
                f3 = acqc.b;
                aonVar4 = aonVarE;
                i18 = i13;
                drsVar5 = drsVar4;
                crdVar3 = crdVarA;
                j7 = j6;
            }
            cavVarB.l();
            defpackage.pf.h(z, aomyVar, cmwVar5, j7, aonVar4, drsVar5, crdVar3, jT, f3, aonoVar, cavVarB, i18 & 2147483646, i14 & 126, 0);
            f2 = f3;
            j4 = jT;
            crdVar2 = crdVar3;
            drsVar3 = drsVar5;
            aonVar3 = aonVar4;
            j5 = j7;
            cmwVar3 = cmwVar5;
        } else {
            cavVarB.s();
            f2 = f;
            aonVar3 = aonVar2;
            drsVar3 = drsVar2;
            cmwVar3 = cmwVar2;
            j4 = j2;
            crdVar2 = crdVarA;
            j5 = j3;
        }
        cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new acqd(z, aomyVar, cmwVar3, j5, aonVar3, drsVar3, crdVar2, j4, f2, aonoVar, i, i2, i3, 0);
        }
    }

    public static void R(defpackage.aomy aomyVar, defpackage.aonn aonnVar, defpackage.crd crdVar, defpackage.cmw cmwVar, defpackage.aonn aonnVar2, boolean z, brb brbVar, defpackage.awa awaVar, defpackage.ayy ayyVar, defpackage.aonn aonnVar3, defpackage.cav cavVar, int i, int i2) {
        int i3;
        defpackage.cmw cmwVar2;
        defpackage.aonn aonnVar4;
        brb brbVar2;
        defpackage.awa awaVar2;
        defpackage.ayy ayyVar2;
        defpackage.aooh.f(aomyVar, "onClick");
        defpackage.aooh.f(aonnVar, "text");
        defpackage.aooh.f(crdVar, "shape");
        int i4 = i & 6;
        defpackage.cav cavVarB = cavVar.b(679991475);
        boolean z2 = true;
        if (i4 == 0) {
            i3 = (true != cavVarB.D(aomyVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != cavVarB.D(aonnVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != cavVarB.B(crdVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            cmwVar2 = cmwVar;
            i3 |= true != cavVarB.B(cmwVar2) ? 1024 : 2048;
        } else {
            cmwVar2 = cmwVar;
        }
        if ((i & 24576) == 0) {
            i3 |= true != cavVarB.D(aonnVar2) ? 8192 : 16384;
        }
        int i5 = i3 | 196608;
        if ((1572864 & i) == 0) {
            i5 |= true != cavVarB.C(z) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i5 |= 4194304;
        }
        int i6 = i2 | 6;
        if ((i2 & 48) == 0) {
            aonnVar4 = aonnVar3;
            i6 |= true == cavVarB.D(aonnVar4) ? 32 : 16;
        } else {
            aonnVar4 = aonnVar3;
        }
        int i7 = i5 | 905969664;
        if ((306783379 & i7) == 306783378 && (i6 & 19) == 18) {
            z2 = false;
        }
        if (cavVarB.H(z2, i7 & 1)) {
            int i8 = (-29360129) & i7;
            ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
            if ((i & 1) == 0 || cavVarB.E()) {
                drs drsVar = acqc.a;
                brb brbVarA = acqc.a(cavVarB);
                awaVar2 = acqc.c;
                ayyVar2 = acqc.e;
                brbVar2 = brbVarA;
            } else {
                cavVarB.s();
                brbVar2 = brbVar;
                awaVar2 = awaVar;
                ayyVar2 = ayyVar;
            }
            cavVarB.l();
            int i9 = i8 << 3;
            brj.c(aomyVar, aonnVar, crdVar, cmwVar2, aonnVar2, aonnVar4, z, brbVar2, awaVar2, ayyVar2, cavVarB, (i7 & 524286) | ((i6 << 15) & 3670016) | (29360128 & i9) | (i9 & 1879048192), ((i7 >> 27) & 14) | ((i6 << 3) & 112));
        } else {
            cavVarB.s();
            brbVar2 = brbVar;
            awaVar2 = awaVar;
            ayyVar2 = ayyVar;
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new brf(aomyVar, aonnVar, crdVar, cmwVar, aonnVar2, z, brbVar2, awaVar2, ayyVar2, aonnVar3, i, i2, 2);
        }
    }

    public static void S(defpackage.cmw cmwVar, long j, java.util.List list, defpackage.cav cavVar, int i, int i2) {
        int i3;
        defpackage.cmw cmwVar2;
        long j2;
        java.util.List list2;
        int i4;
        int i5 = i2 & 1;
        defpackage.cav cavVarB = cavVar.b(-1639168813);
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != cavVarB.B(cmwVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            int i6 = 16;
            if ((i2 & 2) == 0 && cavVarB.A(j)) {
                i6 = 32;
            }
            i3 |= i6;
        }
        if ((i & 384) == 0) {
            i3 |= 128;
        }
        if (cavVarB.H((i3 & 147) != 146, i3 & 1)) {
            int i7 = i2 & 2;
            ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
            if ((i & 1) == 0 || cavVarB.E()) {
                if (i5 != 0) {
                    cmwVar = defpackage.cmw.c;
                }
                if (i7 != 0) {
                    i3 &= -113;
                    java.util.List list3 = acqa.a;
                    j = defpackage.abrz.t(25, cavVarB);
                }
                java.util.List list4 = acqa.a;
                i4 = i3 & (-897);
                list = acqa.a;
            } else {
                cavVarB.s();
                if (i7 != 0) {
                    i3 &= -113;
                }
                i4 = i3 & (-897);
            }
            defpackage.cmw cmwVar3 = cmwVar;
            long j3 = j;
            java.util.List list5 = list;
            cavVarB.l();
            rl.o(cmwVar3, j3, list5, cavVarB, i4 & 126);
            cmwVar2 = cmwVar3;
            j2 = j3;
            list2 = list5;
        } else {
            cavVarB.s();
            cmwVar2 = cmwVar;
            j2 = j;
            list2 = list;
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new qyg(cmwVar2, j2, list2, i, i2, 3);
        }
    }

    public static void T(defpackage.cmw cmwVar, long j, long j2, defpackage.crd crdVar, java.util.List list, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.cav cavVar2;
        defpackage.crd crdVar2;
        java.util.List list2;
        defpackage.crd crdVarA;
        java.util.List list3;
        defpackage.cav cavVarB = cavVar.b(439074462);
        if ((i & 6) == 0) {
            i2 = (true != cavVarB.B(cmwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.A(j) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.A(j2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= 8192;
        }
        if (cavVarB.H((i2 & 9363) != 9362, i2 & 1)) {
            ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
            if ((i & 1) == 0 || cavVarB.E()) {
                java.util.List list4 = acqa.a;
                crdVarA = defpackage.acqn.a(6, cavVarB);
                list3 = acqa.a;
            } else {
                cavVarB.s();
                crdVarA = crdVar;
                list3 = list;
            }
            cavVarB.l();
            cavVar2 = cavVarB;
            rl.n(cmwVar, j, j2, crdVarA, list3, cavVar2, i2 & 1022);
            crdVar2 = crdVarA;
            list2 = list3;
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
            crdVar2 = crdVar;
            list2 = list;
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new bqo(cmwVar, j, j2, crdVar2, list2, i, 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0121  */
    /* JADX WARN: Code duplicated, block: B:103:0x013f  */
    /* JADX WARN: Code duplicated, block: B:106:0x014e  */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:24:0x0046  */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:33:0x005a  */
    /* JADX WARN: Code duplicated, block: B:35:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0075  */
    /* JADX WARN: Code duplicated, block: B:46:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x0089  */
    /* JADX WARN: Code duplicated, block: B:55:0x0092  */
    /* JADX WARN: Code duplicated, block: B:57:0x0096  */
    /* JADX WARN: Code duplicated, block: B:59:0x0099  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:80:0x00db  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:89:0x0102 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x0104  */
    /* JADX WARN: Code duplicated, block: B:91:0x0107  */
    /* JADX WARN: Code duplicated, block: B:93:0x010a  */
    /* JADX WARN: Code duplicated, block: B:95:0x010d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0110  */
    /* JADX WARN: Code duplicated, block: B:99:0x0113  */
    public static void U(defpackage.aonn aonnVar, defpackage.cmw cmwVar, defpackage.aonn aonnVar2, defpackage.aonn aonnVar3, defpackage.aonn aonnVar4, bqe bqeVar, defpackage.cav cavVar, int i, int i2) {
        int i3;
        defpackage.cmw cmwVar2;
        int i4;
        int i5;
        defpackage.aonn aonnVar5;
        int i6;
        int i7;
        defpackage.aonn aonnVar6;
        int i8;
        int i9;
        defpackage.aonn aonnVar7;
        int i10;
        bqe bqeVarA;
        int i11;
        boolean z;
        defpackage.cmw cmwVar3;
        defpackage.aonn aonnVar8;
        defpackage.aonn aonnVar9;
        defpackage.aonn aonnVar10;
        bqe bqeVar2;
        defpackage.cdk cdkVarI;
        int i12;
        defpackage.cmw cmwVar4;
        int i13;
        defpackage.cmw cmwVar5;
        int i14;
        int i15;
        defpackage.aooh.f(aonnVar, "headlineContent");
        int i16 = i & 6;
        defpackage.cav cavVarB = cavVar.b(75850320);
        if (i16 == 0) {
            i3 = (true != cavVarB.D(aonnVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i17 = i2 & 2;
        if (i17 == 0) {
            if ((i & 48) == 0) {
                cmwVar2 = cmwVar;
                i3 |= true != cavVarB.B(cmwVar2) ? 16 : 32;
            }
            if ((i2 & 4) != 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                if (true != cavVarB.D(null)) {
                    i4 = 128;
                } else {
                    i4 = 256;
                }
                i3 |= i4;
            }
            i5 = i2 & 8;
            if (i5 != 0) {
                if ((i & 3072) == 0) {
                    aonnVar5 = aonnVar2;
                    if (true != cavVarB.D(aonnVar5)) {
                        i6 = 1024;
                    } else {
                        i6 = 2048;
                    }
                    i3 |= i6;
                }
                i7 = i2 & 16;
                if (i7 != 0) {
                    if ((i & 24576) == 0) {
                        aonnVar6 = aonnVar3;
                        if (true != cavVarB.D(aonnVar6)) {
                            i8 = 8192;
                        } else {
                            i8 = 16384;
                        }
                        i3 |= i8;
                    }
                    i9 = i2 & 32;
                    if (i9 != 0) {
                        if ((196608 & i) == 0) {
                            aonnVar7 = aonnVar4;
                            if (true != cavVarB.D(aonnVar7)) {
                                i10 = 65536;
                            } else {
                                i10 = 131072;
                            }
                            i3 |= i10;
                        }
                        if ((1572864 & i) == 0) {
                            i15 = 524288;
                            if ((i2 & 64) == 0) {
                                bqeVarA = bqeVar;
                                if (cavVarB.B(bqeVarA)) {
                                    i15 = 1048576;
                                }
                            } else {
                                bqeVarA = bqeVar;
                            }
                            i3 |= i15;
                        } else {
                            bqeVarA = bqeVar;
                        }
                        i11 = i3 | 113246208;
                        if ((38347923 & i11) != 38347922) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (cavVarB.H(z, i11 & 1)) {
                            i12 = i2 & 64;
                            ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
                            if ((i & 1) != 0 || cavVarB.E()) {
                                if (i17 != 0) {
                                    cmwVar4 = defpackage.cmw.c;
                                } else {
                                    cmwVar4 = cmwVar2;
                                }
                                if (i5 != 0) {
                                    aonnVar5 = null;
                                }
                                if (i7 != 0) {
                                    aonnVar6 = null;
                                }
                                if (i9 != 0) {
                                    aonnVar7 = null;
                                }
                                if (i12 != 0) {
                                    i13 = i11 & (-3670017);
                                    int i18 = acpz.a;
                                    bqeVarA = acpz.a(0L, cavVarB, 511);
                                } else {
                                    i13 = i11;
                                }
                                int i19 = acpz.a;
                                int i20 = i13;
                                cmwVar5 = cmwVar4;
                                i14 = i20;
                            } else {
                                cavVarB.s();
                                i14 = i12 != 0 ? i11 & (-3670017) : i11;
                                cmwVar5 = cmwVar2;
                            }
                            defpackage.aonn aonnVar11 = aonnVar5;
                            defpackage.aonn aonnVar12 = aonnVar6;
                            defpackage.aonn aonnVar13 = aonnVar7;
                            bqe bqeVar3 = bqeVarA;
                            cavVarB.l();
                            bqg.f(aonnVar, cmwVar5, aonnVar11, aonnVar12, aonnVar13, bqeVar3, cavVarB, 268435454 & i14);
                            bqeVar2 = bqeVar3;
                            aonnVar10 = aonnVar13;
                            aonnVar9 = aonnVar12;
                            aonnVar8 = aonnVar11;
                            cmwVar3 = cmwVar5;
                        } else {
                            cavVarB.s();
                            cmwVar3 = cmwVar2;
                            aonnVar8 = aonnVar5;
                            aonnVar9 = aonnVar6;
                            aonnVar10 = aonnVar7;
                            bqeVar2 = bqeVarA;
                        }
                        cdkVarI = cavVarB.I();
                        if (cdkVarI != null) {
                            cdkVarI.c = new afa(aonnVar, cmwVar3, aonnVar8, aonnVar9, aonnVar10, bqeVar2, i, i2, 4);
                        }
                    }
                    i3 |= 196608;
                    aonnVar7 = aonnVar4;
                    if ((1572864 & i) == 0) {
                        i15 = 524288;
                        if ((i2 & 64) == 0) {
                            bqeVarA = bqeVar;
                            if (cavVarB.B(bqeVarA)) {
                                i15 = 1048576;
                            }
                        } else {
                            bqeVarA = bqeVar;
                        }
                        i3 |= i15;
                    } else {
                        bqeVarA = bqeVar;
                    }
                    i11 = i3 | 113246208;
                    if ((38347923 & i11) != 38347922) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (cavVarB.H(z, i11 & 1)) {
                        i12 = i2 & 64;
                        ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
                        if ((i & 1) != 0) {
                            if (i17 != 0) {
                                cmwVar4 = defpackage.cmw.c;
                            } else {
                                cmwVar4 = cmwVar2;
                            }
                            if (i5 != 0) {
                                aonnVar5 = null;
                            }
                            if (i7 != 0) {
                                aonnVar6 = null;
                            }
                            if (i9 != 0) {
                                aonnVar7 = null;
                            }
                            if (i12 != 0) {
                                i13 = i11 & (-3670017);
                                int i110 = acpz.a;
                                bqeVarA = acpz.a(0L, cavVarB, 511);
                            } else {
                                i13 = i11;
                            }
                            int i111 = acpz.a;
                            int i21 = i13;
                            cmwVar5 = cmwVar4;
                            i14 = i21;
                        } else {
                            if (i17 != 0) {
                                cmwVar4 = defpackage.cmw.c;
                            } else {
                                cmwVar4 = cmwVar2;
                            }
                            if (i5 != 0) {
                                aonnVar5 = null;
                            }
                            if (i7 != 0) {
                                aonnVar6 = null;
                            }
                            if (i9 != 0) {
                                aonnVar7 = null;
                            }
                            if (i12 != 0) {
                                i13 = i11 & (-3670017);
                                int i112 = acpz.a;
                                bqeVarA = acpz.a(0L, cavVarB, 511);
                            } else {
                                i13 = i11;
                            }
                            int i113 = acpz.a;
                            int i22 = i13;
                            cmwVar5 = cmwVar4;
                            i14 = i22;
                        }
                        defpackage.aonn aonnVar14 = aonnVar5;
                        defpackage.aonn aonnVar15 = aonnVar6;
                        defpackage.aonn aonnVar16 = aonnVar7;
                        bqe bqeVar4 = bqeVarA;
                        cavVarB.l();
                        bqg.f(aonnVar, cmwVar5, aonnVar14, aonnVar15, aonnVar16, bqeVar4, cavVarB, 268435454 & i14);
                        bqeVar2 = bqeVar4;
                        aonnVar10 = aonnVar16;
                        aonnVar9 = aonnVar15;
                        aonnVar8 = aonnVar14;
                        cmwVar3 = cmwVar5;
                    } else {
                        cavVarB.s();
                        cmwVar3 = cmwVar2;
                        aonnVar8 = aonnVar5;
                        aonnVar9 = aonnVar6;
                        aonnVar10 = aonnVar7;
                        bqeVar2 = bqeVarA;
                    }
                    cdkVarI = cavVarB.I();
                    if (cdkVarI != null) {
                        cdkVarI.c = new afa(aonnVar, cmwVar3, aonnVar8, aonnVar9, aonnVar10, bqeVar2, i, i2, 4);
                    }
                }
                i3 |= 24576;
                aonnVar6 = aonnVar3;
                i9 = i2 & 32;
                if (i9 != 0) {
                    if ((196608 & i) == 0) {
                        aonnVar7 = aonnVar4;
                        if (true != cavVarB.D(aonnVar7)) {
                            i10 = 65536;
                        } else {
                            i10 = 131072;
                        }
                        i3 |= i10;
                    }
                    if ((1572864 & i) == 0) {
                        i15 = 524288;
                        if ((i2 & 64) == 0) {
                            bqeVarA = bqeVar;
                            if (cavVarB.B(bqeVarA)) {
                                i15 = 1048576;
                            }
                        } else {
                            bqeVarA = bqeVar;
                        }
                        i3 |= i15;
                    } else {
                        bqeVarA = bqeVar;
                    }
                    i11 = i3 | 113246208;
                    if ((38347923 & i11) != 38347922) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (cavVarB.H(z, i11 & 1)) {
                        i12 = i2 & 64;
                        ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
                        if ((i & 1) != 0) {
                            if (i17 != 0) {
                                cmwVar4 = defpackage.cmw.c;
                            } else {
                                cmwVar4 = cmwVar2;
                            }
                            if (i5 != 0) {
                                aonnVar5 = null;
                            }
                            if (i7 != 0) {
                                aonnVar6 = null;
                            }
                            if (i9 != 0) {
                                aonnVar7 = null;
                            }
                            if (i12 != 0) {
                                i13 = i11 & (-3670017);
                                int i114 = acpz.a;
                                bqeVarA = acpz.a(0L, cavVarB, 511);
                            } else {
                                i13 = i11;
                            }
                            int i115 = acpz.a;
                            int i23 = i13;
                            cmwVar5 = cmwVar4;
                            i14 = i23;
                        } else {
                            if (i17 != 0) {
                                cmwVar4 = defpackage.cmw.c;
                            } else {
                                cmwVar4 = cmwVar2;
                            }
                            if (i5 != 0) {
                                aonnVar5 = null;
                            }
                            if (i7 != 0) {
                                aonnVar6 = null;
                            }
                            if (i9 != 0) {
                                aonnVar7 = null;
                            }
                            if (i12 != 0) {
                                i13 = i11 & (-3670017);
                                int i116 = acpz.a;
                                bqeVarA = acpz.a(0L, cavVarB, 511);
                            } else {
                                i13 = i11;
                            }
                            int i117 = acpz.a;
                            int i24 = i13;
                            cmwVar5 = cmwVar4;
                            i14 = i24;
                        }
                        defpackage.aonn aonnVar17 = aonnVar5;
                        defpackage.aonn aonnVar18 = aonnVar6;
                        defpackage.aonn aonnVar19 = aonnVar7;
                        bqe bqeVar5 = bqeVarA;
                        cavVarB.l();
                        bqg.f(aonnVar, cmwVar5, aonnVar17, aonnVar18, aonnVar19, bqeVar5, cavVarB, 268435454 & i14);
                        bqeVar2 = bqeVar5;
                        aonnVar10 = aonnVar19;
                        aonnVar9 = aonnVar18;
                        aonnVar8 = aonnVar17;
                        cmwVar3 = cmwVar5;
                    } else {
                        cavVarB.s();
                        cmwVar3 = cmwVar2;
                        aonnVar8 = aonnVar5;
                        aonnVar9 = aonnVar6;
                        aonnVar10 = aonnVar7;
                        bqeVar2 = bqeVarA;
                    }
                    cdkVarI = cavVarB.I();
                    if (cdkVarI != null) {
                        cdkVarI.c = new afa(aonnVar, cmwVar3, aonnVar8, aonnVar9, aonnVar10, bqeVar2, i, i2, 4);
                    }
                }
                i3 |= 196608;
                aonnVar7 = aonnVar4;
                if ((1572864 & i) == 0) {
                    i15 = 524288;
                    if ((i2 & 64) == 0) {
                        bqeVarA = bqeVar;
                        if (cavVarB.B(bqeVarA)) {
                            i15 = 1048576;
                        }
                    } else {
                        bqeVarA = bqeVar;
                    }
                    i3 |= i15;
                } else {
                    bqeVarA = bqeVar;
                }
                i11 = i3 | 113246208;
                if ((38347923 & i11) != 38347922) {
                    z = true;
                } else {
                    z = false;
                }
                if (cavVarB.H(z, i11 & 1)) {
                    i12 = i2 & 64;
                    ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
                    if ((i & 1) != 0) {
                        if (i17 != 0) {
                            cmwVar4 = defpackage.cmw.c;
                        } else {
                            cmwVar4 = cmwVar2;
                        }
                        if (i5 != 0) {
                            aonnVar5 = null;
                        }
                        if (i7 != 0) {
                            aonnVar6 = null;
                        }
                        if (i9 != 0) {
                            aonnVar7 = null;
                        }
                        if (i12 != 0) {
                            i13 = i11 & (-3670017);
                            int i118 = acpz.a;
                            bqeVarA = acpz.a(0L, cavVarB, 511);
                        } else {
                            i13 = i11;
                        }
                        int i119 = acpz.a;
                        int i25 = i13;
                        cmwVar5 = cmwVar4;
                        i14 = i25;
                    } else {
                        if (i17 != 0) {
                            cmwVar4 = defpackage.cmw.c;
                        } else {
                            cmwVar4 = cmwVar2;
                        }
                        if (i5 != 0) {
                            aonnVar5 = null;
                        }
                        if (i7 != 0) {
                            aonnVar6 = null;
                        }
                        if (i9 != 0) {
                            aonnVar7 = null;
                        }
                        if (i12 != 0) {
                            i13 = i11 & (-3670017);
                            int i1110 = acpz.a;
                            bqeVarA = acpz.a(0L, cavVarB, 511);
                        } else {
                            i13 = i11;
                        }
                        int i1111 = acpz.a;
                        int i26 = i13;
                        cmwVar5 = cmwVar4;
                        i14 = i26;
                    }
                    defpackage.aonn aonnVar110 = aonnVar5;
                    defpackage.aonn aonnVar111 = aonnVar6;
                    defpackage.aonn aonnVar112 = aonnVar7;
                    bqe bqeVar6 = bqeVarA;
                    cavVarB.l();
                    bqg.f(aonnVar, cmwVar5, aonnVar110, aonnVar111, aonnVar112, bqeVar6, cavVarB, 268435454 & i14);
                    bqeVar2 = bqeVar6;
                    aonnVar10 = aonnVar112;
                    aonnVar9 = aonnVar111;
                    aonnVar8 = aonnVar110;
                    cmwVar3 = cmwVar5;
                } else {
                    cavVarB.s();
                    cmwVar3 = cmwVar2;
                    aonnVar8 = aonnVar5;
                    aonnVar9 = aonnVar6;
                    aonnVar10 = aonnVar7;
                    bqeVar2 = bqeVarA;
                }
                cdkVarI = cavVarB.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new afa(aonnVar, cmwVar3, aonnVar8, aonnVar9, aonnVar10, bqeVar2, i, i2, 4);
                }
            }
            i3 |= 3072;
            aonnVar5 = aonnVar2;
            i7 = i2 & 16;
            if (i7 != 0) {
                if ((i & 24576) == 0) {
                    aonnVar6 = aonnVar3;
                    if (true != cavVarB.D(aonnVar6)) {
                        i8 = 8192;
                    } else {
                        i8 = 16384;
                    }
                    i3 |= i8;
                }
                i9 = i2 & 32;
                if (i9 != 0) {
                    if ((196608 & i) == 0) {
                        aonnVar7 = aonnVar4;
                        if (true != cavVarB.D(aonnVar7)) {
                            i10 = 65536;
                        } else {
                            i10 = 131072;
                        }
                        i3 |= i10;
                    }
                    if ((1572864 & i) == 0) {
                        i15 = 524288;
                        if ((i2 & 64) == 0) {
                            bqeVarA = bqeVar;
                            if (cavVarB.B(bqeVarA)) {
                                i15 = 1048576;
                            }
                        } else {
                            bqeVarA = bqeVar;
                        }
                        i3 |= i15;
                    } else {
                        bqeVarA = bqeVar;
                    }
                    i11 = i3 | 113246208;
                    if ((38347923 & i11) != 38347922) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (cavVarB.H(z, i11 & 1)) {
                        i12 = i2 & 64;
                        ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
                        if ((i & 1) != 0) {
                            if (i17 != 0) {
                                cmwVar4 = defpackage.cmw.c;
                            } else {
                                cmwVar4 = cmwVar2;
                            }
                            if (i5 != 0) {
                                aonnVar5 = null;
                            }
                            if (i7 != 0) {
                                aonnVar6 = null;
                            }
                            if (i9 != 0) {
                                aonnVar7 = null;
                            }
                            if (i12 != 0) {
                                i13 = i11 & (-3670017);
                                int i1112 = acpz.a;
                                bqeVarA = acpz.a(0L, cavVarB, 511);
                            } else {
                                i13 = i11;
                            }
                            int i1113 = acpz.a;
                            int i27 = i13;
                            cmwVar5 = cmwVar4;
                            i14 = i27;
                        } else {
                            if (i17 != 0) {
                                cmwVar4 = defpackage.cmw.c;
                            } else {
                                cmwVar4 = cmwVar2;
                            }
                            if (i5 != 0) {
                                aonnVar5 = null;
                            }
                            if (i7 != 0) {
                                aonnVar6 = null;
                            }
                            if (i9 != 0) {
                                aonnVar7 = null;
                            }
                            if (i12 != 0) {
                                i13 = i11 & (-3670017);
                                int i1114 = acpz.a;
                                bqeVarA = acpz.a(0L, cavVarB, 511);
                            } else {
                                i13 = i11;
                            }
                            int i1115 = acpz.a;
                            int i28 = i13;
                            cmwVar5 = cmwVar4;
                            i14 = i28;
                        }
                        defpackage.aonn aonnVar113 = aonnVar5;
                        defpackage.aonn aonnVar114 = aonnVar6;
                        defpackage.aonn aonnVar115 = aonnVar7;
                        bqe bqeVar7 = bqeVarA;
                        cavVarB.l();
                        bqg.f(aonnVar, cmwVar5, aonnVar113, aonnVar114, aonnVar115, bqeVar7, cavVarB, 268435454 & i14);
                        bqeVar2 = bqeVar7;
                        aonnVar10 = aonnVar115;
                        aonnVar9 = aonnVar114;
                        aonnVar8 = aonnVar113;
                        cmwVar3 = cmwVar5;
                    } else {
                        cavVarB.s();
                        cmwVar3 = cmwVar2;
                        aonnVar8 = aonnVar5;
                        aonnVar9 = aonnVar6;
                        aonnVar10 = aonnVar7;
                        bqeVar2 = bqeVarA;
                    }
                    cdkVarI = cavVarB.I();
                    if (cdkVarI != null) {
                        cdkVarI.c = new afa(aonnVar, cmwVar3, aonnVar8, aonnVar9, aonnVar10, bqeVar2, i, i2, 4);
                    }
                }
                i3 |= 196608;
                aonnVar7 = aonnVar4;
                if ((1572864 & i) == 0) {
                    i15 = 524288;
                    if ((i2 & 64) == 0) {
                        bqeVarA = bqeVar;
                        if (cavVarB.B(bqeVarA)) {
                            i15 = 1048576;
                        }
                    } else {
                        bqeVarA = bqeVar;
                    }
                    i3 |= i15;
                } else {
                    bqeVarA = bqeVar;
                }
                i11 = i3 | 113246208;
                if ((38347923 & i11) != 38347922) {
                    z = true;
                } else {
                    z = false;
                }
                if (cavVarB.H(z, i11 & 1)) {
                    i12 = i2 & 64;
                    ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
                    if ((i & 1) != 0) {
                        if (i17 != 0) {
                            cmwVar4 = defpackage.cmw.c;
                        } else {
                            cmwVar4 = cmwVar2;
                        }
                        if (i5 != 0) {
                            aonnVar5 = null;
                        }
                        if (i7 != 0) {
                            aonnVar6 = null;
                        }
                        if (i9 != 0) {
                            aonnVar7 = null;
                        }
                        if (i12 != 0) {
                            i13 = i11 & (-3670017);
                            int i1116 = acpz.a;
                            bqeVarA = acpz.a(0L, cavVarB, 511);
                        } else {
                            i13 = i11;
                        }
                        int i1117 = acpz.a;
                        int i29 = i13;
                        cmwVar5 = cmwVar4;
                        i14 = i29;
                    } else {
                        if (i17 != 0) {
                            cmwVar4 = defpackage.cmw.c;
                        } else {
                            cmwVar4 = cmwVar2;
                        }
                        if (i5 != 0) {
                            aonnVar5 = null;
                        }
                        if (i7 != 0) {
                            aonnVar6 = null;
                        }
                        if (i9 != 0) {
                            aonnVar7 = null;
                        }
                        if (i12 != 0) {
                            i13 = i11 & (-3670017);
                            int i1118 = acpz.a;
                            bqeVarA = acpz.a(0L, cavVarB, 511);
                        } else {
                            i13 = i11;
                        }
                        int i1119 = acpz.a;
                        int i210 = i13;
                        cmwVar5 = cmwVar4;
                        i14 = i210;
                    }
                    defpackage.aonn aonnVar116 = aonnVar5;
                    defpackage.aonn aonnVar117 = aonnVar6;
                    defpackage.aonn aonnVar118 = aonnVar7;
                    bqe bqeVar8 = bqeVarA;
                    cavVarB.l();
                    bqg.f(aonnVar, cmwVar5, aonnVar116, aonnVar117, aonnVar118, bqeVar8, cavVarB, 268435454 & i14);
                    bqeVar2 = bqeVar8;
                    aonnVar10 = aonnVar118;
                    aonnVar9 = aonnVar117;
                    aonnVar8 = aonnVar116;
                    cmwVar3 = cmwVar5;
                } else {
                    cavVarB.s();
                    cmwVar3 = cmwVar2;
                    aonnVar8 = aonnVar5;
                    aonnVar9 = aonnVar6;
                    aonnVar10 = aonnVar7;
                    bqeVar2 = bqeVarA;
                }
                cdkVarI = cavVarB.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new afa(aonnVar, cmwVar3, aonnVar8, aonnVar9, aonnVar10, bqeVar2, i, i2, 4);
                }
            }
            i3 |= 24576;
            aonnVar6 = aonnVar3;
            i9 = i2 & 32;
            if (i9 != 0) {
                if ((196608 & i) == 0) {
                    aonnVar7 = aonnVar4;
                    if (true != cavVarB.D(aonnVar7)) {
                        i10 = 65536;
                    } else {
                        i10 = 131072;
                    }
                    i3 |= i10;
                }
                if ((1572864 & i) == 0) {
                    i15 = 524288;
                    if ((i2 & 64) == 0) {
                        bqeVarA = bqeVar;
                        if (cavVarB.B(bqeVarA)) {
                            i15 = 1048576;
                        }
                    } else {
                        bqeVarA = bqeVar;
                    }
                    i3 |= i15;
                } else {
                    bqeVarA = bqeVar;
                }
                i11 = i3 | 113246208;
                if ((38347923 & i11) != 38347922) {
                    z = true;
                } else {
                    z = false;
                }
                if (cavVarB.H(z, i11 & 1)) {
                    i12 = i2 & 64;
                    ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
                    if ((i & 1) != 0) {
                        if (i17 != 0) {
                            cmwVar4 = defpackage.cmw.c;
                        } else {
                            cmwVar4 = cmwVar2;
                        }
                        if (i5 != 0) {
                            aonnVar5 = null;
                        }
                        if (i7 != 0) {
                            aonnVar6 = null;
                        }
                        if (i9 != 0) {
                            aonnVar7 = null;
                        }
                        if (i12 != 0) {
                            i13 = i11 & (-3670017);
                            int i11110 = acpz.a;
                            bqeVarA = acpz.a(0L, cavVarB, 511);
                        } else {
                            i13 = i11;
                        }
                        int i11111 = acpz.a;
                        int i211 = i13;
                        cmwVar5 = cmwVar4;
                        i14 = i211;
                    } else {
                        if (i17 != 0) {
                            cmwVar4 = defpackage.cmw.c;
                        } else {
                            cmwVar4 = cmwVar2;
                        }
                        if (i5 != 0) {
                            aonnVar5 = null;
                        }
                        if (i7 != 0) {
                            aonnVar6 = null;
                        }
                        if (i9 != 0) {
                            aonnVar7 = null;
                        }
                        if (i12 != 0) {
                            i13 = i11 & (-3670017);
                            int i11112 = acpz.a;
                            bqeVarA = acpz.a(0L, cavVarB, 511);
                        } else {
                            i13 = i11;
                        }
                        int i11113 = acpz.a;
                        int i212 = i13;
                        cmwVar5 = cmwVar4;
                        i14 = i212;
                    }
                    defpackage.aonn aonnVar119 = aonnVar5;
                    defpackage.aonn aonnVar1110 = aonnVar6;
                    defpackage.aonn aonnVar1111 = aonnVar7;
                    bqe bqeVar9 = bqeVarA;
                    cavVarB.l();
                    bqg.f(aonnVar, cmwVar5, aonnVar119, aonnVar1110, aonnVar1111, bqeVar9, cavVarB, 268435454 & i14);
                    bqeVar2 = bqeVar9;
                    aonnVar10 = aonnVar1111;
                    aonnVar9 = aonnVar1110;
                    aonnVar8 = aonnVar119;
                    cmwVar3 = cmwVar5;
                } else {
                    cavVarB.s();
                    cmwVar3 = cmwVar2;
                    aonnVar8 = aonnVar5;
                    aonnVar9 = aonnVar6;
                    aonnVar10 = aonnVar7;
                    bqeVar2 = bqeVarA;
                }
                cdkVarI = cavVarB.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new afa(aonnVar, cmwVar3, aonnVar8, aonnVar9, aonnVar10, bqeVar2, i, i2, 4);
                }
            }
            i3 |= 196608;
            aonnVar7 = aonnVar4;
            if ((1572864 & i) == 0) {
                i15 = 524288;
                if ((i2 & 64) == 0) {
                    bqeVarA = bqeVar;
                    if (cavVarB.B(bqeVarA)) {
                        i15 = 1048576;
                    }
                } else {
                    bqeVarA = bqeVar;
                }
                i3 |= i15;
            } else {
                bqeVarA = bqeVar;
            }
            i11 = i3 | 113246208;
            if ((38347923 & i11) != 38347922) {
                z = true;
            } else {
                z = false;
            }
            if (cavVarB.H(z, i11 & 1)) {
                i12 = i2 & 64;
                ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
                if ((i & 1) != 0) {
                    if (i17 != 0) {
                        cmwVar4 = defpackage.cmw.c;
                    } else {
                        cmwVar4 = cmwVar2;
                    }
                    if (i5 != 0) {
                        aonnVar5 = null;
                    }
                    if (i7 != 0) {
                        aonnVar6 = null;
                    }
                    if (i9 != 0) {
                        aonnVar7 = null;
                    }
                    if (i12 != 0) {
                        i13 = i11 & (-3670017);
                        int i11114 = acpz.a;
                        bqeVarA = acpz.a(0L, cavVarB, 511);
                    } else {
                        i13 = i11;
                    }
                    int i11115 = acpz.a;
                    int i213 = i13;
                    cmwVar5 = cmwVar4;
                    i14 = i213;
                } else {
                    if (i17 != 0) {
                        cmwVar4 = defpackage.cmw.c;
                    } else {
                        cmwVar4 = cmwVar2;
                    }
                    if (i5 != 0) {
                        aonnVar5 = null;
                    }
                    if (i7 != 0) {
                        aonnVar6 = null;
                    }
                    if (i9 != 0) {
                        aonnVar7 = null;
                    }
                    if (i12 != 0) {
                        i13 = i11 & (-3670017);
                        int i11116 = acpz.a;
                        bqeVarA = acpz.a(0L, cavVarB, 511);
                    } else {
                        i13 = i11;
                    }
                    int i11117 = acpz.a;
                    int i214 = i13;
                    cmwVar5 = cmwVar4;
                    i14 = i214;
                }
                defpackage.aonn aonnVar1112 = aonnVar5;
                defpackage.aonn aonnVar1113 = aonnVar6;
                defpackage.aonn aonnVar1114 = aonnVar7;
                bqe bqeVar10 = bqeVarA;
                cavVarB.l();
                bqg.f(aonnVar, cmwVar5, aonnVar1112, aonnVar1113, aonnVar1114, bqeVar10, cavVarB, 268435454 & i14);
                bqeVar2 = bqeVar10;
                aonnVar10 = aonnVar1114;
                aonnVar9 = aonnVar1113;
                aonnVar8 = aonnVar1112;
                cmwVar3 = cmwVar5;
            } else {
                cavVarB.s();
                cmwVar3 = cmwVar2;
                aonnVar8 = aonnVar5;
                aonnVar9 = aonnVar6;
                aonnVar10 = aonnVar7;
                bqeVar2 = bqeVarA;
            }
            cdkVarI = cavVarB.I();
            if (cdkVarI != null) {
                cdkVarI.c = new afa(aonnVar, cmwVar3, aonnVar8, aonnVar9, aonnVar10, bqeVar2, i, i2, 4);
            }
        }
        i3 |= 48;
        cmwVar2 = cmwVar;
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (true != cavVarB.D(null)) {
                i4 = 128;
            } else {
                i4 = 256;
            }
            i3 |= i4;
        }
        i5 = i2 & 8;
        if (i5 != 0) {
            if ((i & 3072) == 0) {
                aonnVar5 = aonnVar2;
                if (true != cavVarB.D(aonnVar5)) {
                    i6 = 1024;
                } else {
                    i6 = 2048;
                }
                i3 |= i6;
            }
            i7 = i2 & 16;
            if (i7 != 0) {
                if ((i & 24576) == 0) {
                    aonnVar6 = aonnVar3;
                    if (true != cavVarB.D(aonnVar6)) {
                        i8 = 8192;
                    } else {
                        i8 = 16384;
                    }
                    i3 |= i8;
                }
                i9 = i2 & 32;
                if (i9 != 0) {
                    if ((196608 & i) == 0) {
                        aonnVar7 = aonnVar4;
                        if (true != cavVarB.D(aonnVar7)) {
                            i10 = 65536;
                        } else {
                            i10 = 131072;
                        }
                        i3 |= i10;
                    }
                    if ((1572864 & i) == 0) {
                        i15 = 524288;
                        if ((i2 & 64) == 0) {
                            bqeVarA = bqeVar;
                            if (cavVarB.B(bqeVarA)) {
                                i15 = 1048576;
                            }
                        } else {
                            bqeVarA = bqeVar;
                        }
                        i3 |= i15;
                    } else {
                        bqeVarA = bqeVar;
                    }
                    i11 = i3 | 113246208;
                    if ((38347923 & i11) != 38347922) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (cavVarB.H(z, i11 & 1)) {
                        i12 = i2 & 64;
                        ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
                        if ((i & 1) != 0) {
                            if (i17 != 0) {
                                cmwVar4 = defpackage.cmw.c;
                            } else {
                                cmwVar4 = cmwVar2;
                            }
                            if (i5 != 0) {
                                aonnVar5 = null;
                            }
                            if (i7 != 0) {
                                aonnVar6 = null;
                            }
                            if (i9 != 0) {
                                aonnVar7 = null;
                            }
                            if (i12 != 0) {
                                i13 = i11 & (-3670017);
                                int i11118 = acpz.a;
                                bqeVarA = acpz.a(0L, cavVarB, 511);
                            } else {
                                i13 = i11;
                            }
                            int i11119 = acpz.a;
                            int i215 = i13;
                            cmwVar5 = cmwVar4;
                            i14 = i215;
                        } else {
                            if (i17 != 0) {
                                cmwVar4 = defpackage.cmw.c;
                            } else {
                                cmwVar4 = cmwVar2;
                            }
                            if (i5 != 0) {
                                aonnVar5 = null;
                            }
                            if (i7 != 0) {
                                aonnVar6 = null;
                            }
                            if (i9 != 0) {
                                aonnVar7 = null;
                            }
                            if (i12 != 0) {
                                i13 = i11 & (-3670017);
                                int i111110 = acpz.a;
                                bqeVarA = acpz.a(0L, cavVarB, 511);
                            } else {
                                i13 = i11;
                            }
                            int i111111 = acpz.a;
                            int i216 = i13;
                            cmwVar5 = cmwVar4;
                            i14 = i216;
                        }
                        defpackage.aonn aonnVar1115 = aonnVar5;
                        defpackage.aonn aonnVar1116 = aonnVar6;
                        defpackage.aonn aonnVar1117 = aonnVar7;
                        bqe bqeVar11 = bqeVarA;
                        cavVarB.l();
                        bqg.f(aonnVar, cmwVar5, aonnVar1115, aonnVar1116, aonnVar1117, bqeVar11, cavVarB, 268435454 & i14);
                        bqeVar2 = bqeVar11;
                        aonnVar10 = aonnVar1117;
                        aonnVar9 = aonnVar1116;
                        aonnVar8 = aonnVar1115;
                        cmwVar3 = cmwVar5;
                    } else {
                        cavVarB.s();
                        cmwVar3 = cmwVar2;
                        aonnVar8 = aonnVar5;
                        aonnVar9 = aonnVar6;
                        aonnVar10 = aonnVar7;
                        bqeVar2 = bqeVarA;
                    }
                    cdkVarI = cavVarB.I();
                    if (cdkVarI != null) {
                        cdkVarI.c = new afa(aonnVar, cmwVar3, aonnVar8, aonnVar9, aonnVar10, bqeVar2, i, i2, 4);
                    }
                }
                i3 |= 196608;
                aonnVar7 = aonnVar4;
                if ((1572864 & i) == 0) {
                    i15 = 524288;
                    if ((i2 & 64) == 0) {
                        bqeVarA = bqeVar;
                        if (cavVarB.B(bqeVarA)) {
                            i15 = 1048576;
                        }
                    } else {
                        bqeVarA = bqeVar;
                    }
                    i3 |= i15;
                } else {
                    bqeVarA = bqeVar;
                }
                i11 = i3 | 113246208;
                if ((38347923 & i11) != 38347922) {
                    z = true;
                } else {
                    z = false;
                }
                if (cavVarB.H(z, i11 & 1)) {
                    i12 = i2 & 64;
                    ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
                    if ((i & 1) != 0) {
                        if (i17 != 0) {
                            cmwVar4 = defpackage.cmw.c;
                        } else {
                            cmwVar4 = cmwVar2;
                        }
                        if (i5 != 0) {
                            aonnVar5 = null;
                        }
                        if (i7 != 0) {
                            aonnVar6 = null;
                        }
                        if (i9 != 0) {
                            aonnVar7 = null;
                        }
                        if (i12 != 0) {
                            i13 = i11 & (-3670017);
                            int i111112 = acpz.a;
                            bqeVarA = acpz.a(0L, cavVarB, 511);
                        } else {
                            i13 = i11;
                        }
                        int i111113 = acpz.a;
                        int i217 = i13;
                        cmwVar5 = cmwVar4;
                        i14 = i217;
                    } else {
                        if (i17 != 0) {
                            cmwVar4 = defpackage.cmw.c;
                        } else {
                            cmwVar4 = cmwVar2;
                        }
                        if (i5 != 0) {
                            aonnVar5 = null;
                        }
                        if (i7 != 0) {
                            aonnVar6 = null;
                        }
                        if (i9 != 0) {
                            aonnVar7 = null;
                        }
                        if (i12 != 0) {
                            i13 = i11 & (-3670017);
                            int i111114 = acpz.a;
                            bqeVarA = acpz.a(0L, cavVarB, 511);
                        } else {
                            i13 = i11;
                        }
                        int i111115 = acpz.a;
                        int i218 = i13;
                        cmwVar5 = cmwVar4;
                        i14 = i218;
                    }
                    defpackage.aonn aonnVar1118 = aonnVar5;
                    defpackage.aonn aonnVar1119 = aonnVar6;
                    defpackage.aonn aonnVar11110 = aonnVar7;
                    bqe bqeVar12 = bqeVarA;
                    cavVarB.l();
                    bqg.f(aonnVar, cmwVar5, aonnVar1118, aonnVar1119, aonnVar11110, bqeVar12, cavVarB, 268435454 & i14);
                    bqeVar2 = bqeVar12;
                    aonnVar10 = aonnVar11110;
                    aonnVar9 = aonnVar1119;
                    aonnVar8 = aonnVar1118;
                    cmwVar3 = cmwVar5;
                } else {
                    cavVarB.s();
                    cmwVar3 = cmwVar2;
                    aonnVar8 = aonnVar5;
                    aonnVar9 = aonnVar6;
                    aonnVar10 = aonnVar7;
                    bqeVar2 = bqeVarA;
                }
                cdkVarI = cavVarB.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new afa(aonnVar, cmwVar3, aonnVar8, aonnVar9, aonnVar10, bqeVar2, i, i2, 4);
                }
            }
            i3 |= 24576;
            aonnVar6 = aonnVar3;
            i9 = i2 & 32;
            if (i9 != 0) {
                if ((196608 & i) == 0) {
                    aonnVar7 = aonnVar4;
                    if (true != cavVarB.D(aonnVar7)) {
                        i10 = 65536;
                    } else {
                        i10 = 131072;
                    }
                    i3 |= i10;
                }
                if ((1572864 & i) == 0) {
                    i15 = 524288;
                    if ((i2 & 64) == 0) {
                        bqeVarA = bqeVar;
                        if (cavVarB.B(bqeVarA)) {
                            i15 = 1048576;
                        }
                    } else {
                        bqeVarA = bqeVar;
                    }
                    i3 |= i15;
                } else {
                    bqeVarA = bqeVar;
                }
                i11 = i3 | 113246208;
                if ((38347923 & i11) != 38347922) {
                    z = true;
                } else {
                    z = false;
                }
                if (cavVarB.H(z, i11 & 1)) {
                    i12 = i2 & 64;
                    ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
                    if ((i & 1) != 0) {
                        if (i17 != 0) {
                            cmwVar4 = defpackage.cmw.c;
                        } else {
                            cmwVar4 = cmwVar2;
                        }
                        if (i5 != 0) {
                            aonnVar5 = null;
                        }
                        if (i7 != 0) {
                            aonnVar6 = null;
                        }
                        if (i9 != 0) {
                            aonnVar7 = null;
                        }
                        if (i12 != 0) {
                            i13 = i11 & (-3670017);
                            int i111116 = acpz.a;
                            bqeVarA = acpz.a(0L, cavVarB, 511);
                        } else {
                            i13 = i11;
                        }
                        int i111117 = acpz.a;
                        int i219 = i13;
                        cmwVar5 = cmwVar4;
                        i14 = i219;
                    } else {
                        if (i17 != 0) {
                            cmwVar4 = defpackage.cmw.c;
                        } else {
                            cmwVar4 = cmwVar2;
                        }
                        if (i5 != 0) {
                            aonnVar5 = null;
                        }
                        if (i7 != 0) {
                            aonnVar6 = null;
                        }
                        if (i9 != 0) {
                            aonnVar7 = null;
                        }
                        if (i12 != 0) {
                            i13 = i11 & (-3670017);
                            int i111118 = acpz.a;
                            bqeVarA = acpz.a(0L, cavVarB, 511);
                        } else {
                            i13 = i11;
                        }
                        int i111119 = acpz.a;
                        int i2110 = i13;
                        cmwVar5 = cmwVar4;
                        i14 = i2110;
                    }
                    defpackage.aonn aonnVar11111 = aonnVar5;
                    defpackage.aonn aonnVar11112 = aonnVar6;
                    defpackage.aonn aonnVar11113 = aonnVar7;
                    bqe bqeVar13 = bqeVarA;
                    cavVarB.l();
                    bqg.f(aonnVar, cmwVar5, aonnVar11111, aonnVar11112, aonnVar11113, bqeVar13, cavVarB, 268435454 & i14);
                    bqeVar2 = bqeVar13;
                    aonnVar10 = aonnVar11113;
                    aonnVar9 = aonnVar11112;
                    aonnVar8 = aonnVar11111;
                    cmwVar3 = cmwVar5;
                } else {
                    cavVarB.s();
                    cmwVar3 = cmwVar2;
                    aonnVar8 = aonnVar5;
                    aonnVar9 = aonnVar6;
                    aonnVar10 = aonnVar7;
                    bqeVar2 = bqeVarA;
                }
                cdkVarI = cavVarB.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new afa(aonnVar, cmwVar3, aonnVar8, aonnVar9, aonnVar10, bqeVar2, i, i2, 4);
                }
            }
            i3 |= 196608;
            aonnVar7 = aonnVar4;
            if ((1572864 & i) == 0) {
                i15 = 524288;
                if ((i2 & 64) == 0) {
                    bqeVarA = bqeVar;
                    if (cavVarB.B(bqeVarA)) {
                        i15 = 1048576;
                    }
                } else {
                    bqeVarA = bqeVar;
                }
                i3 |= i15;
            } else {
                bqeVarA = bqeVar;
            }
            i11 = i3 | 113246208;
            if ((38347923 & i11) != 38347922) {
                z = true;
            } else {
                z = false;
            }
            if (cavVarB.H(z, i11 & 1)) {
                i12 = i2 & 64;
                ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
                if ((i & 1) != 0) {
                    if (i17 != 0) {
                        cmwVar4 = defpackage.cmw.c;
                    } else {
                        cmwVar4 = cmwVar2;
                    }
                    if (i5 != 0) {
                        aonnVar5 = null;
                    }
                    if (i7 != 0) {
                        aonnVar6 = null;
                    }
                    if (i9 != 0) {
                        aonnVar7 = null;
                    }
                    if (i12 != 0) {
                        i13 = i11 & (-3670017);
                        int i1111110 = acpz.a;
                        bqeVarA = acpz.a(0L, cavVarB, 511);
                    } else {
                        i13 = i11;
                    }
                    int i1111111 = acpz.a;
                    int i2111 = i13;
                    cmwVar5 = cmwVar4;
                    i14 = i2111;
                } else {
                    if (i17 != 0) {
                        cmwVar4 = defpackage.cmw.c;
                    } else {
                        cmwVar4 = cmwVar2;
                    }
                    if (i5 != 0) {
                        aonnVar5 = null;
                    }
                    if (i7 != 0) {
                        aonnVar6 = null;
                    }
                    if (i9 != 0) {
                        aonnVar7 = null;
                    }
                    if (i12 != 0) {
                        i13 = i11 & (-3670017);
                        int i1111112 = acpz.a;
                        bqeVarA = acpz.a(0L, cavVarB, 511);
                    } else {
                        i13 = i11;
                    }
                    int i1111113 = acpz.a;
                    int i2112 = i13;
                    cmwVar5 = cmwVar4;
                    i14 = i2112;
                }
                defpackage.aonn aonnVar11114 = aonnVar5;
                defpackage.aonn aonnVar11115 = aonnVar6;
                defpackage.aonn aonnVar11116 = aonnVar7;
                bqe bqeVar14 = bqeVarA;
                cavVarB.l();
                bqg.f(aonnVar, cmwVar5, aonnVar11114, aonnVar11115, aonnVar11116, bqeVar14, cavVarB, 268435454 & i14);
                bqeVar2 = bqeVar14;
                aonnVar10 = aonnVar11116;
                aonnVar9 = aonnVar11115;
                aonnVar8 = aonnVar11114;
                cmwVar3 = cmwVar5;
            } else {
                cavVarB.s();
                cmwVar3 = cmwVar2;
                aonnVar8 = aonnVar5;
                aonnVar9 = aonnVar6;
                aonnVar10 = aonnVar7;
                bqeVar2 = bqeVarA;
            }
            cdkVarI = cavVarB.I();
            if (cdkVarI != null) {
                cdkVarI.c = new afa(aonnVar, cmwVar3, aonnVar8, aonnVar9, aonnVar10, bqeVar2, i, i2, 4);
            }
        }
        i3 |= 3072;
        aonnVar5 = aonnVar2;
        i7 = i2 & 16;
        if (i7 != 0) {
            if ((i & 24576) == 0) {
                aonnVar6 = aonnVar3;
                if (true != cavVarB.D(aonnVar6)) {
                    i8 = 8192;
                } else {
                    i8 = 16384;
                }
                i3 |= i8;
            }
            i9 = i2 & 32;
            if (i9 != 0) {
                if ((196608 & i) == 0) {
                    aonnVar7 = aonnVar4;
                    if (true != cavVarB.D(aonnVar7)) {
                        i10 = 65536;
                    } else {
                        i10 = 131072;
                    }
                    i3 |= i10;
                }
                if ((1572864 & i) == 0) {
                    i15 = 524288;
                    if ((i2 & 64) == 0) {
                        bqeVarA = bqeVar;
                        if (cavVarB.B(bqeVarA)) {
                            i15 = 1048576;
                        }
                    } else {
                        bqeVarA = bqeVar;
                    }
                    i3 |= i15;
                } else {
                    bqeVarA = bqeVar;
                }
                i11 = i3 | 113246208;
                if ((38347923 & i11) != 38347922) {
                    z = true;
                } else {
                    z = false;
                }
                if (cavVarB.H(z, i11 & 1)) {
                    i12 = i2 & 64;
                    ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
                    if ((i & 1) != 0) {
                        if (i17 != 0) {
                            cmwVar4 = defpackage.cmw.c;
                        } else {
                            cmwVar4 = cmwVar2;
                        }
                        if (i5 != 0) {
                            aonnVar5 = null;
                        }
                        if (i7 != 0) {
                            aonnVar6 = null;
                        }
                        if (i9 != 0) {
                            aonnVar7 = null;
                        }
                        if (i12 != 0) {
                            i13 = i11 & (-3670017);
                            int i1111114 = acpz.a;
                            bqeVarA = acpz.a(0L, cavVarB, 511);
                        } else {
                            i13 = i11;
                        }
                        int i1111115 = acpz.a;
                        int i2113 = i13;
                        cmwVar5 = cmwVar4;
                        i14 = i2113;
                    } else {
                        if (i17 != 0) {
                            cmwVar4 = defpackage.cmw.c;
                        } else {
                            cmwVar4 = cmwVar2;
                        }
                        if (i5 != 0) {
                            aonnVar5 = null;
                        }
                        if (i7 != 0) {
                            aonnVar6 = null;
                        }
                        if (i9 != 0) {
                            aonnVar7 = null;
                        }
                        if (i12 != 0) {
                            i13 = i11 & (-3670017);
                            int i1111116 = acpz.a;
                            bqeVarA = acpz.a(0L, cavVarB, 511);
                        } else {
                            i13 = i11;
                        }
                        int i1111117 = acpz.a;
                        int i2114 = i13;
                        cmwVar5 = cmwVar4;
                        i14 = i2114;
                    }
                    defpackage.aonn aonnVar11117 = aonnVar5;
                    defpackage.aonn aonnVar11118 = aonnVar6;
                    defpackage.aonn aonnVar11119 = aonnVar7;
                    bqe bqeVar15 = bqeVarA;
                    cavVarB.l();
                    bqg.f(aonnVar, cmwVar5, aonnVar11117, aonnVar11118, aonnVar11119, bqeVar15, cavVarB, 268435454 & i14);
                    bqeVar2 = bqeVar15;
                    aonnVar10 = aonnVar11119;
                    aonnVar9 = aonnVar11118;
                    aonnVar8 = aonnVar11117;
                    cmwVar3 = cmwVar5;
                } else {
                    cavVarB.s();
                    cmwVar3 = cmwVar2;
                    aonnVar8 = aonnVar5;
                    aonnVar9 = aonnVar6;
                    aonnVar10 = aonnVar7;
                    bqeVar2 = bqeVarA;
                }
                cdkVarI = cavVarB.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new afa(aonnVar, cmwVar3, aonnVar8, aonnVar9, aonnVar10, bqeVar2, i, i2, 4);
                }
            }
            i3 |= 196608;
            aonnVar7 = aonnVar4;
            if ((1572864 & i) == 0) {
                i15 = 524288;
                if ((i2 & 64) == 0) {
                    bqeVarA = bqeVar;
                    if (cavVarB.B(bqeVarA)) {
                        i15 = 1048576;
                    }
                } else {
                    bqeVarA = bqeVar;
                }
                i3 |= i15;
            } else {
                bqeVarA = bqeVar;
            }
            i11 = i3 | 113246208;
            if ((38347923 & i11) != 38347922) {
                z = true;
            } else {
                z = false;
            }
            if (cavVarB.H(z, i11 & 1)) {
                i12 = i2 & 64;
                ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
                if ((i & 1) != 0) {
                    if (i17 != 0) {
                        cmwVar4 = defpackage.cmw.c;
                    } else {
                        cmwVar4 = cmwVar2;
                    }
                    if (i5 != 0) {
                        aonnVar5 = null;
                    }
                    if (i7 != 0) {
                        aonnVar6 = null;
                    }
                    if (i9 != 0) {
                        aonnVar7 = null;
                    }
                    if (i12 != 0) {
                        i13 = i11 & (-3670017);
                        int i1111118 = acpz.a;
                        bqeVarA = acpz.a(0L, cavVarB, 511);
                    } else {
                        i13 = i11;
                    }
                    int i1111119 = acpz.a;
                    int i2115 = i13;
                    cmwVar5 = cmwVar4;
                    i14 = i2115;
                } else {
                    if (i17 != 0) {
                        cmwVar4 = defpackage.cmw.c;
                    } else {
                        cmwVar4 = cmwVar2;
                    }
                    if (i5 != 0) {
                        aonnVar5 = null;
                    }
                    if (i7 != 0) {
                        aonnVar6 = null;
                    }
                    if (i9 != 0) {
                        aonnVar7 = null;
                    }
                    if (i12 != 0) {
                        i13 = i11 & (-3670017);
                        int i11111110 = acpz.a;
                        bqeVarA = acpz.a(0L, cavVarB, 511);
                    } else {
                        i13 = i11;
                    }
                    int i11111111 = acpz.a;
                    int i2116 = i13;
                    cmwVar5 = cmwVar4;
                    i14 = i2116;
                }
                defpackage.aonn aonnVar111110 = aonnVar5;
                defpackage.aonn aonnVar111111 = aonnVar6;
                defpackage.aonn aonnVar111112 = aonnVar7;
                bqe bqeVar16 = bqeVarA;
                cavVarB.l();
                bqg.f(aonnVar, cmwVar5, aonnVar111110, aonnVar111111, aonnVar111112, bqeVar16, cavVarB, 268435454 & i14);
                bqeVar2 = bqeVar16;
                aonnVar10 = aonnVar111112;
                aonnVar9 = aonnVar111111;
                aonnVar8 = aonnVar111110;
                cmwVar3 = cmwVar5;
            } else {
                cavVarB.s();
                cmwVar3 = cmwVar2;
                aonnVar8 = aonnVar5;
                aonnVar9 = aonnVar6;
                aonnVar10 = aonnVar7;
                bqeVar2 = bqeVarA;
            }
            cdkVarI = cavVarB.I();
            if (cdkVarI != null) {
                cdkVarI.c = new afa(aonnVar, cmwVar3, aonnVar8, aonnVar9, aonnVar10, bqeVar2, i, i2, 4);
            }
        }
        i3 |= 24576;
        aonnVar6 = aonnVar3;
        i9 = i2 & 32;
        if (i9 != 0) {
            if ((196608 & i) == 0) {
                aonnVar7 = aonnVar4;
                if (true != cavVarB.D(aonnVar7)) {
                    i10 = 65536;
                } else {
                    i10 = 131072;
                }
                i3 |= i10;
            }
            if ((1572864 & i) == 0) {
                i15 = 524288;
                if ((i2 & 64) == 0) {
                    bqeVarA = bqeVar;
                    if (cavVarB.B(bqeVarA)) {
                        i15 = 1048576;
                    }
                } else {
                    bqeVarA = bqeVar;
                }
                i3 |= i15;
            } else {
                bqeVarA = bqeVar;
            }
            i11 = i3 | 113246208;
            if ((38347923 & i11) != 38347922) {
                z = true;
            } else {
                z = false;
            }
            if (cavVarB.H(z, i11 & 1)) {
                i12 = i2 & 64;
                ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
                if ((i & 1) != 0) {
                    if (i17 != 0) {
                        cmwVar4 = defpackage.cmw.c;
                    } else {
                        cmwVar4 = cmwVar2;
                    }
                    if (i5 != 0) {
                        aonnVar5 = null;
                    }
                    if (i7 != 0) {
                        aonnVar6 = null;
                    }
                    if (i9 != 0) {
                        aonnVar7 = null;
                    }
                    if (i12 != 0) {
                        i13 = i11 & (-3670017);
                        int i11111112 = acpz.a;
                        bqeVarA = acpz.a(0L, cavVarB, 511);
                    } else {
                        i13 = i11;
                    }
                    int i11111113 = acpz.a;
                    int i2117 = i13;
                    cmwVar5 = cmwVar4;
                    i14 = i2117;
                } else {
                    if (i17 != 0) {
                        cmwVar4 = defpackage.cmw.c;
                    } else {
                        cmwVar4 = cmwVar2;
                    }
                    if (i5 != 0) {
                        aonnVar5 = null;
                    }
                    if (i7 != 0) {
                        aonnVar6 = null;
                    }
                    if (i9 != 0) {
                        aonnVar7 = null;
                    }
                    if (i12 != 0) {
                        i13 = i11 & (-3670017);
                        int i11111114 = acpz.a;
                        bqeVarA = acpz.a(0L, cavVarB, 511);
                    } else {
                        i13 = i11;
                    }
                    int i11111115 = acpz.a;
                    int i2118 = i13;
                    cmwVar5 = cmwVar4;
                    i14 = i2118;
                }
                defpackage.aonn aonnVar111113 = aonnVar5;
                defpackage.aonn aonnVar111114 = aonnVar6;
                defpackage.aonn aonnVar111115 = aonnVar7;
                bqe bqeVar17 = bqeVarA;
                cavVarB.l();
                bqg.f(aonnVar, cmwVar5, aonnVar111113, aonnVar111114, aonnVar111115, bqeVar17, cavVarB, 268435454 & i14);
                bqeVar2 = bqeVar17;
                aonnVar10 = aonnVar111115;
                aonnVar9 = aonnVar111114;
                aonnVar8 = aonnVar111113;
                cmwVar3 = cmwVar5;
            } else {
                cavVarB.s();
                cmwVar3 = cmwVar2;
                aonnVar8 = aonnVar5;
                aonnVar9 = aonnVar6;
                aonnVar10 = aonnVar7;
                bqeVar2 = bqeVarA;
            }
            cdkVarI = cavVarB.I();
            if (cdkVarI != null) {
                cdkVarI.c = new afa(aonnVar, cmwVar3, aonnVar8, aonnVar9, aonnVar10, bqeVar2, i, i2, 4);
            }
        }
        i3 |= 196608;
        aonnVar7 = aonnVar4;
        if ((1572864 & i) == 0) {
            i15 = 524288;
            if ((i2 & 64) == 0) {
                bqeVarA = bqeVar;
                if (cavVarB.B(bqeVarA)) {
                    i15 = 1048576;
                }
            } else {
                bqeVarA = bqeVar;
            }
            i3 |= i15;
        } else {
            bqeVarA = bqeVar;
        }
        i11 = i3 | 113246208;
        if ((38347923 & i11) != 38347922) {
            z = true;
        } else {
            z = false;
        }
        if (cavVarB.H(z, i11 & 1)) {
            i12 = i2 & 64;
            ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
            if ((i & 1) != 0) {
                if (i17 != 0) {
                    cmwVar4 = defpackage.cmw.c;
                } else {
                    cmwVar4 = cmwVar2;
                }
                if (i5 != 0) {
                    aonnVar5 = null;
                }
                if (i7 != 0) {
                    aonnVar6 = null;
                }
                if (i9 != 0) {
                    aonnVar7 = null;
                }
                if (i12 != 0) {
                    i13 = i11 & (-3670017);
                    int i11111116 = acpz.a;
                    bqeVarA = acpz.a(0L, cavVarB, 511);
                } else {
                    i13 = i11;
                }
                int i11111117 = acpz.a;
                int i2119 = i13;
                cmwVar5 = cmwVar4;
                i14 = i2119;
            } else {
                if (i17 != 0) {
                    cmwVar4 = defpackage.cmw.c;
                } else {
                    cmwVar4 = cmwVar2;
                }
                if (i5 != 0) {
                    aonnVar5 = null;
                }
                if (i7 != 0) {
                    aonnVar6 = null;
                }
                if (i9 != 0) {
                    aonnVar7 = null;
                }
                if (i12 != 0) {
                    i13 = i11 & (-3670017);
                    int i11111118 = acpz.a;
                    bqeVarA = acpz.a(0L, cavVarB, 511);
                } else {
                    i13 = i11;
                }
                int i11111119 = acpz.a;
                int i21110 = i13;
                cmwVar5 = cmwVar4;
                i14 = i21110;
            }
            defpackage.aonn aonnVar111116 = aonnVar5;
            defpackage.aonn aonnVar111117 = aonnVar6;
            defpackage.aonn aonnVar111118 = aonnVar7;
            bqe bqeVar18 = bqeVarA;
            cavVarB.l();
            bqg.f(aonnVar, cmwVar5, aonnVar111116, aonnVar111117, aonnVar111118, bqeVar18, cavVarB, 268435454 & i14);
            bqeVar2 = bqeVar18;
            aonnVar10 = aonnVar111118;
            aonnVar9 = aonnVar111117;
            aonnVar8 = aonnVar111116;
            cmwVar3 = cmwVar5;
        } else {
            cavVarB.s();
            cmwVar3 = cmwVar2;
            aonnVar8 = aonnVar5;
            aonnVar9 = aonnVar6;
            aonnVar10 = aonnVar7;
            bqeVar2 = bqeVarA;
        }
        cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new afa(aonnVar, cmwVar3, aonnVar8, aonnVar9, aonnVar10, bqeVar2, i, i2, 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0059  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:45:0x007d  */
    /* JADX WARN: Code duplicated, block: B:54:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x009e  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    public static void V(defpackage.css cssVar, java.lang.String str, defpackage.cmw cmwVar, long j, defpackage.cav cavVar, int i, int i2) {
        int i3;
        defpackage.cmw cmwVar2;
        long j2;
        long j3;
        defpackage.cdk cdkVarI;
        int i4;
        defpackage.cmw cmwVar3;
        defpackage.cmw cmwVar4;
        long j4;
        int i5;
        defpackage.aooh.f(cssVar, "painter");
        int i6 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1924880865);
        if (i6 == 0) {
            i3 = (true != ((i & 8) == 0 ? cavVarB.B(cssVar) : cavVarB.D(cssVar)) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != cavVarB.B(str) ? 16 : 32;
        }
        int i7 = i2 & 4;
        if (i7 == 0) {
            if ((i & 384) == 0) {
                cmwVar2 = cmwVar;
                i3 |= true != cavVarB.B(cmwVar2) ? 128 : 256;
            }
            if ((i & 3072) == 0) {
                i5 = 1024;
                j2 = j;
                if ((i2 & 8) == 0 && cavVarB.A(j2)) {
                    i5 = 2048;
                }
                i3 |= i5;
            } else {
                j2 = j;
            }
            if (cavVarB.H((i3 & 1171) != 1170, i3 & 1)) {
                i4 = i2 & 8;
                ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
                if ((i & 1) != 0 || cavVarB.E()) {
                    if (i7 != 0) {
                        cmwVar3 = defpackage.cmw.c;
                    } else {
                        cmwVar3 = cmwVar2;
                    }
                    if (i4 != 0) {
                        i3 &= -7169;
                        cmwVar4 = cmwVar3;
                        j4 = ((defpackage.cqg) cavVarB.e(defpackage.boy.a)).a;
                    } else {
                        cmwVar4 = cmwVar3;
                    }
                    cavVarB.l();
                    defpackage.bpz.a(cssVar, str, cmwVar4, j4, cavVarB, (i3 & 14) | 8 | (i3 & 112) | (i3 & 896) | (i3 & 7168));
                    cmwVar2 = cmwVar4;
                    j3 = j4;
                } else {
                    cavVarB.s();
                    if (i4 != 0) {
                        i3 &= -7169;
                    }
                    cmwVar4 = cmwVar2;
                }
                j4 = j2;
                cavVarB.l();
                defpackage.bpz.a(cssVar, str, cmwVar4, j4, cavVarB, (i3 & 14) | 8 | (i3 & 112) | (i3 & 896) | (i3 & 7168));
                cmwVar2 = cmwVar4;
                j3 = j4;
            } else {
                cavVarB.s();
                j3 = j2;
            }
            cdkVarI = cavVarB.I();
            if (cdkVarI != null) {
                cdkVarI.c = new acpy(cssVar, str, cmwVar2, j3, i, i2, 1);
            }
        }
        i3 |= 384;
        cmwVar2 = cmwVar;
        if ((i & 3072) == 0) {
            i5 = 1024;
            j2 = j;
            if ((i2 & 8) == 0) {
                i5 = 2048;
            }
            i3 |= i5;
        } else {
            j2 = j;
        }
        if (cavVarB.H((i3 & 1171) != 1170, i3 & 1)) {
            i4 = i2 & 8;
            ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
            if ((i & 1) != 0) {
                if (i7 != 0) {
                    cmwVar3 = defpackage.cmw.c;
                } else {
                    cmwVar3 = cmwVar2;
                }
                if (i4 != 0) {
                    i3 &= -7169;
                    cmwVar4 = cmwVar3;
                    j4 = ((defpackage.cqg) cavVarB.e(defpackage.boy.a)).a;
                } else {
                    cmwVar4 = cmwVar3;
                    j4 = j2;
                }
            } else {
                if (i7 != 0) {
                    cmwVar3 = defpackage.cmw.c;
                } else {
                    cmwVar3 = cmwVar2;
                }
                if (i4 != 0) {
                    i3 &= -7169;
                    cmwVar4 = cmwVar3;
                    j4 = ((defpackage.cqg) cavVarB.e(defpackage.boy.a)).a;
                } else {
                    cmwVar4 = cmwVar3;
                    j4 = j2;
                }
            }
            cavVarB.l();
            defpackage.bpz.a(cssVar, str, cmwVar4, j4, cavVarB, (i3 & 14) | 8 | (i3 & 112) | (i3 & 896) | (i3 & 7168));
            cmwVar2 = cmwVar4;
            j3 = j4;
        } else {
            cavVarB.s();
            j3 = j2;
        }
        cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new acpy(cssVar, str, cmwVar2, j3, i, i2, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:51:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0095  */
    /* JADX WARN: Code duplicated, block: B:53:0x0098  */
    /* JADX WARN: Code duplicated, block: B:55:0x009b  */
    /* JADX WARN: Code duplicated, block: B:56:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    public static void W(defpackage.csx csxVar, java.lang.String str, defpackage.cmw cmwVar, long j, defpackage.cav cavVar, int i, int i2) {
        int i3;
        defpackage.cmw cmwVar2;
        long j2;
        long j3;
        defpackage.cdk cdkVarI;
        int i4;
        defpackage.cmw cmwVar3;
        defpackage.cmw cmwVar4;
        long j4;
        int i5;
        defpackage.aooh.f(csxVar, "imageVector");
        int i6 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1881395758);
        if (i6 == 0) {
            i3 = (true != cavVarB.B(csxVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != cavVarB.B(str) ? 16 : 32;
        }
        int i7 = i2 & 4;
        if (i7 == 0) {
            if ((i & 384) == 0) {
                cmwVar2 = cmwVar;
                i3 |= true != cavVarB.B(cmwVar2) ? 128 : 256;
            }
            if ((i & 3072) == 0) {
                i5 = 1024;
                j2 = j;
                if ((i2 & 8) == 0 && cavVarB.A(j2)) {
                    i5 = 2048;
                }
                i3 |= i5;
            } else {
                j2 = j;
            }
            if (cavVarB.H((i3 & 1171) != 1170, i3 & 1)) {
                i4 = i2 & 8;
                ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
                if ((i & 1) != 0 || cavVarB.E()) {
                    if (i7 != 0) {
                        cmwVar3 = defpackage.cmw.c;
                    } else {
                        cmwVar3 = cmwVar2;
                    }
                    if (i4 != 0) {
                        i3 &= -7169;
                        cmwVar4 = cmwVar3;
                        j4 = ((defpackage.cqg) cavVarB.e(defpackage.boy.a)).a;
                    } else {
                        cmwVar4 = cmwVar3;
                    }
                    cavVarB.l();
                    defpackage.bpz.b(csxVar, str, cmwVar4, j4, cavVarB, i3 & 8190);
                    cmwVar2 = cmwVar4;
                    j3 = j4;
                } else {
                    cavVarB.s();
                    if (i4 != 0) {
                        i3 &= -7169;
                    }
                    cmwVar4 = cmwVar2;
                }
                j4 = j2;
                cavVarB.l();
                defpackage.bpz.b(csxVar, str, cmwVar4, j4, cavVarB, i3 & 8190);
                cmwVar2 = cmwVar4;
                j3 = j4;
            } else {
                cavVarB.s();
                j3 = j2;
            }
            cdkVarI = cavVarB.I();
            if (cdkVarI != null) {
                cdkVarI.c = new acpy(csxVar, str, cmwVar2, j3, i, i2, 0);
            }
        }
        i3 |= 384;
        cmwVar2 = cmwVar;
        if ((i & 3072) == 0) {
            i5 = 1024;
            j2 = j;
            if ((i2 & 8) == 0) {
                i5 = 2048;
            }
            i3 |= i5;
        } else {
            j2 = j;
        }
        if (cavVarB.H((i3 & 1171) != 1170, i3 & 1)) {
            i4 = i2 & 8;
            ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
            if ((i & 1) != 0) {
                if (i7 != 0) {
                    cmwVar3 = defpackage.cmw.c;
                } else {
                    cmwVar3 = cmwVar2;
                }
                if (i4 != 0) {
                    i3 &= -7169;
                    cmwVar4 = cmwVar3;
                    j4 = ((defpackage.cqg) cavVarB.e(defpackage.boy.a)).a;
                } else {
                    cmwVar4 = cmwVar3;
                    j4 = j2;
                }
            } else {
                if (i7 != 0) {
                    cmwVar3 = defpackage.cmw.c;
                } else {
                    cmwVar3 = cmwVar2;
                }
                if (i4 != 0) {
                    i3 &= -7169;
                    cmwVar4 = cmwVar3;
                    j4 = ((defpackage.cqg) cavVarB.e(defpackage.boy.a)).a;
                } else {
                    cmwVar4 = cmwVar3;
                    j4 = j2;
                }
            }
            cavVarB.l();
            defpackage.bpz.b(csxVar, str, cmwVar4, j4, cavVarB, i3 & 8190);
            cmwVar2 = cmwVar4;
            j3 = j4;
        } else {
            cavVarB.s();
            j3 = j2;
        }
        cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new acpy(csxVar, str, cmwVar2, j3, i, i2, 0);
        }
    }

    public static void X(defpackage.cpu cpuVar, java.lang.String str, defpackage.cmw cmwVar, long j, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.cpu cpuVar2;
        java.lang.String str2;
        defpackage.cmw cmwVar2;
        long j2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1435201858);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? cavVarB.B(cpuVar) : cavVarB.D(cpuVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(str) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.A(j) ? 1024 : 2048;
        }
        if (cavVarB.H((i2 & 1171) != 1170, i2 & 1)) {
            ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
            if ((i & 1) != 0 && !cavVarB.E()) {
                cavVarB.s();
            }
            cavVarB.l();
            cpuVar2 = cpuVar;
            str2 = str;
            cmwVar2 = cmwVar;
            j2 = j;
            defpackage.bpz.c(cpuVar2, str2, cmwVar2, j2, cavVarB, i2 & 8190);
        } else {
            cpuVar2 = cpuVar;
            str2 = str;
            cmwVar2 = cmwVar;
            j2 = j;
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new bpy(cpuVar2, str2, cmwVar2, j2, i, 8);
        }
    }

    public static void Y(boolean z, defpackage.aonj aonjVar, defpackage.cmw cmwVar, boolean z2, bqa bqaVar, defpackage.crd crdVar, defpackage.aonn aonnVar, defpackage.cav cavVar, int i) {
        int i2;
        bqa bqaVar2;
        defpackage.crd crdVar2;
        defpackage.cav cavVar2;
        defpackage.aooh.f(aonjVar, "onCheckedChange");
        defpackage.aooh.f(aonnVar, "content");
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-2114089353);
        if (i3 == 0) {
            i2 = (true != cavVarB.C(z) ? 2 : 4) | i;
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
            i2 |= true != cavVarB.C(z2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            bqaVar2 = bqaVar;
            i2 |= true != cavVarB.B(bqaVar2) ? 8192 : 16384;
        } else {
            bqaVar2 = bqaVar;
        }
        int i4 = i2 | 196608;
        if ((1572864 & i) == 0) {
            crdVar2 = crdVar;
            i4 |= true != cavVarB.B(crdVar2) ? 524288 : 1048576;
        } else {
            crdVar2 = crdVar;
        }
        if ((12582912 & i) == 0) {
            i4 |= true != cavVarB.D(aonnVar) ? 4194304 : 8388608;
        }
        if (cavVarB.H((4793491 & i4) != 4793490, i4 & 1)) {
            ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
            if ((i & 1) != 0 && !cavVarB.E()) {
                cavVarB.s();
            }
            cavVarB.l();
            cavVar2 = cavVarB;
            rk.g(z, aonjVar, cmwVar, z2, bqaVar2, crdVar2, aonnVar, cavVar2, i4 & 33554430);
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new bpx(z, aonjVar, cmwVar, z2, bqaVar, crdVar, aonnVar, i, 3);
        }
    }

    public static bpw Z(defpackage.cav cavVar) {
        long jT = defpackage.abrz.t(31, cavVar);
        long jR = defpackage.abrz.r(jT, cavVar);
        long jH = defpackage.cqg.h(defpackage.abrz.t(17, cavVar), 0.1f);
        long jH2 = defpackage.cqg.h(defpackage.abrz.t(17, cavVar), 0.38f);
        defpackage.bor borVarAk = defpackage.den.ak(cavVar);
        bpw bpwVar = borVarAk.ae;
        if (bpwVar == null) {
            bpwVar = new bpw(defpackage.bos.b(borVarAk, 31), defpackage.bos.b(borVarAk, 14), defpackage.cqg.h(defpackage.bos.b(borVarAk, 17), 0.1f), defpackage.cqg.h(defpackage.bos.b(borVarAk, 17), 0.38f));
            borVarAk.ae = bpwVar;
        }
        return bpwVar.c(jT, jR, jH, jH2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [aonn] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [cav, java.lang.Object] */
    public static void aA(acjl acjlVar, defpackage.cmw cmwVar, boolean z, defpackage.aonn aonnVar, defpackage.cav cavVar, int i) {
        int i2;
        ?? r4;
        defpackage.cdk cdkVarI;
        ppv ppvVar;
        defpackage.adxk adxkVarA;
        ?? r5;
        ?? r6 = aonnVar;
        int i3 = i & 6;
        ?? B = cavVar.b(-1011613571);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? B.B(acjlVar) : B.D(acjlVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != B.B(cmwVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != B.C(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != B.D(r6) ? 1024 : 2048;
        }
        int i4 = i2;
        if (B.H((i4 & 1171) != 1170, i4 & 1)) {
            android.content.Context context = (android.content.Context) B.e(defpackage.dep.b);
            defpackage.aiof aiofVar = adxj.a;
            try {
                adxkVarA = adxj.a(context);
            } catch (java.lang.RuntimeException e) {
                ((defpackage.aiob) ((defpackage.aiob) ((defpackage.aiob) adxj.a.d()).k(e)).l("com/google/android/libraries/notifications/platform/inject/Gnp", "getOrNull", 43, "Gnp.java")).v("Failed creating GnpComponent.");
                adxkVarA = null;
            }
            aciu aciuVarEp = adxkVarA != null ? adxkVarA.ep() : null;
            if (aciuVarEp == null) {
                B.u(805877844);
                r6.a(B, java.lang.Integer.valueOf((i4 >> 9) & 14));
                defpackage.cbt cbtVar = (defpackage.cbt) B;
                java.lang.Object objR = cbtVar.R();
                if (objR == defpackage.cau.a) {
                    objR = new abna(2);
                    cbtVar.ab(objR);
                }
                B.r((defpackage.aomy) objR);
                cbtVar.W(false);
                cdkVarI = B.I();
                if (cdkVarI == null) {
                    return;
                } else {
                    ppvVar = new ppv(acjlVar, cmwVar, z, (java.lang.Object) r6, i, 13);
                }
            } else {
                B.u(806078693);
                defpackage.cbt cbtVar2 = (defpackage.cbt) B;
                cbtVar2.W(false);
                java.lang.String str = acjlVar.a;
                boolean zB = B.B(str);
                java.lang.Object objR2 = cbtVar2.R();
                if (zB || objR2 == defpackage.cau.a) {
                    objR2 = aciuVarEp.a(str);
                    cbtVar2.ab(objR2);
                }
                defpackage.cer cerVarH = defpackage.dzo.h((defpackage.aozh) objR2, null, B, 0, 7);
                if (cerVarH.a() != null) {
                    B.u(806255455);
                    java.lang.Object objA = cerVarH.a();
                    defpackage.aooh.c(objA);
                    aciw aciwVar = (aciw) objA;
                    int i5 = aciwVar.h;
                    B.u(-1498009075);
                    boolean zD = B.D(aciuVarEp) | B.B(str);
                    java.lang.Object objR3 = cbtVar2.R();
                    if (zD || objR3 == defpackage.cau.a) {
                        objR3 = new xtu(aciuVarEp, str, 9);
                        cbtVar2.ab(objR3);
                    }
                    defpackage.aomy aomyVar = (defpackage.aomy) objR3;
                    boolean zD2 = B.D(aciuVarEp) | B.B(str);
                    java.lang.Object objR4 = cbtVar2.R();
                    if (zD2 || objR4 == defpackage.cau.a) {
                        objR4 = new xtu(aciuVarEp, str, 10);
                        cbtVar2.ab(objR4);
                    }
                    abxl.l(cmwVar, aciwVar, z, aomyVar, (defpackage.aomy) objR4, aonnVar, (defpackage.cav) B, ((i4 << 6) & 458752) | ((i4 >> 3) & 14) | (i4 & 896));
                    r5 = aonnVar;
                    cbtVar2.W(false);
                    cbtVar2.W(false);
                } else {
                    ?? r7 = aonnVar;
                    B.u(806636786);
                    r7.a(B, java.lang.Integer.valueOf((i4 >> 9) & 14));
                    cbtVar2.W(false);
                    r5 = r7;
                }
                android.content.Context context2 = (android.content.Context) B.e(defpackage.dep.b);
                boolean zD3 = B.D(context2) | B.D(aciuVarEp) | B.B(str);
                java.lang.Object objR5 = cbtVar2.R();
                if (zD3 || objR5 == defpackage.cau.a) {
                    objR5 = new aclk(context2, aciuVarEp, str, 0);
                    cbtVar2.ab(objR5);
                }
                defpackage.cbp.c(str, (defpackage.aonj) objR5, B);
                r4 = r5;
            }
            cdkVarI.c = ppvVar;
        }
        B.s();
        r4 = r6;
        cdkVarI = B.I();
        if (cdkVarI != null) {
            ppvVar = new ppv(acjlVar, cmwVar, z, (java.lang.Object) r4, i, 14);
            cdkVarI.c = ppvVar;
        }
    }

    public static defpackage.ackz aB(defpackage.adae adaeVar) {
        defpackage.aooh.f(adaeVar, "impl");
        return (defpackage.ackz) ((java.util.concurrent.atomic.AtomicReference) adaeVar.a).get();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004c  */
    /* JADX WARN: Code duplicated, block: B:24:0x004e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:27:0x0054  */
    /* JADX WARN: Code duplicated, block: B:29:0x0058  */
    /* JADX WARN: Code duplicated, block: B:31:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0061  */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x006e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0076  */
    /* JADX WARN: Code duplicated, block: B:41:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0083  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX WARN: Code duplicated, block: B:50:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0094  */
    /* JADX WARN: Code duplicated, block: B:53:0x0097  */
    /* JADX WARN: Code duplicated, block: B:57:0x009f  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:68:0x00be  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00db  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:84:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:86:0x0112  */
    /* JADX WARN: Code duplicated, block: B:89:0x0133  */
    /* JADX WARN: Code duplicated, block: B:92:0x0143  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:71:0x00c7, please report this as an issue */
    public static void aC(defpackage.aomy aomyVar, defpackage.cmw cmwVar, boolean z, bpw bpwVar, defpackage.kaw kawVar, defpackage.crd crdVar, defpackage.aonn aonnVar, defpackage.cav cavVar, int i, int i2) {
        int i3;
        defpackage.cmw cmwVar2;
        int i4;
        boolean z2;
        int i5;
        bpw bpwVarAa;
        int i6;
        defpackage.kaw kawVar2;
        int i7;
        boolean z3;
        defpackage.crd crdVar2;
        boolean z4;
        defpackage.cmw cmwVar3;
        bpw bpwVar2;
        defpackage.kaw kawVar3;
        defpackage.cdk cdkVarI;
        int i8;
        defpackage.cmw cmwVar4;
        defpackage.crd crdVarA;
        boolean z5;
        defpackage.cmw cmwVar5;
        defpackage.kaw kawVar4;
        bpw bpwVar3;
        int i9;
        int i10;
        int i11;
        defpackage.aooh.f(aomyVar, "onClick");
        defpackage.aooh.f(aonnVar, "content");
        int i12 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1600044516);
        if (i12 == 0) {
            i3 = (true != cavVarB.D(aomyVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i13 = i2 & 2;
        if (i13 == 0) {
            if ((i & 48) == 0) {
                cmwVar2 = cmwVar;
                i3 |= true != cavVarB.B(cmwVar2) ? 16 : 32;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (i4 != 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                if (true != cavVarB.C(z)) {
                    i5 = 128;
                } else {
                    i5 = 256;
                }
                i3 |= i5;
            }
            if ((i & 3072) == 0) {
                i11 = 1024;
                if ((i2 & 8) == 0) {
                    bpwVarAa = bpwVar;
                    if (cavVarB.B(bpwVarAa)) {
                        i11 = 2048;
                    }
                } else {
                    bpwVarAa = bpwVar;
                }
                i3 |= i11;
            } else {
                bpwVarAa = bpwVar;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    kawVar2 = kawVar;
                    if (true != cavVarB.B(kawVar2)) {
                        i7 = 8192;
                    } else {
                        i7 = 16384;
                    }
                    i3 |= i7;
                }
                if ((196608 & i) == 0) {
                    i3 |= 65536;
                }
                if ((1572864 & i) == 0) {
                    if (true != cavVarB.D(aonnVar)) {
                        i10 = 524288;
                    } else {
                        i10 = 1048576;
                    }
                    i3 |= i10;
                }
                if ((599187 & i3) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (cavVarB.H(z3, i3 & 1)) {
                    i8 = i2 & 8;
                    ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
                    if ((i & 1) != 0 || cavVarB.E()) {
                        if (i13 != 0) {
                            cmwVar4 = defpackage.cmw.c;
                        } else {
                            cmwVar4 = cmwVar2;
                        }
                        boolean z6 = z | (!z2);
                        if (i8 != 0) {
                            i3 &= -7169;
                            bpwVarAa = aa(0L, 0L, 0L, 0L, cavVarB, 15);
                        }
                        defpackage.kaw kawVar5 = i6 == 0 ? kawVar : null;
                        crdVarA = defpackage.acqn.a(6, cavVarB);
                        int i14 = i3 & (-458753);
                        z5 = z6;
                        cmwVar5 = cmwVar4;
                        kawVar4 = kawVar5;
                        bpwVar3 = bpwVarAa;
                        i9 = i14;
                    } else {
                        cavVarB.s();
                        if (i8 != 0) {
                            i3 &= -7169;
                        }
                        bpwVar3 = bpwVarAa;
                        kawVar4 = kawVar2;
                        i9 = i3 & (-458753);
                        z5 = z;
                        cmwVar5 = cmwVar2;
                        crdVarA = crdVar;
                    }
                    cavVarB.l();
                    rk.p(aomyVar, cmwVar5, z5, bpwVar3, kawVar4, crdVarA, aonnVar, cavVarB, i9 & 3735550);
                    crdVar2 = crdVarA;
                    kawVar3 = kawVar4;
                    bpwVar2 = bpwVar3;
                    z4 = z5;
                    cmwVar3 = cmwVar5;
                } else {
                    cavVarB.s();
                    crdVar2 = crdVar;
                    z4 = z;
                    cmwVar3 = cmwVar2;
                    bpwVar2 = bpwVarAa;
                    kawVar3 = kawVar;
                }
                cdkVarI = cavVarB.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new acpo(aomyVar, cmwVar3, z4, bpwVar2, kawVar3, crdVar2, aonnVar, i, i2, 2);
                }
            }
            i3 |= 24576;
            kawVar2 = kawVar;
            if ((196608 & i) == 0) {
                i3 |= 65536;
            }
            if ((1572864 & i) == 0) {
                if (true != cavVarB.D(aonnVar)) {
                    i10 = 524288;
                } else {
                    i10 = 1048576;
                }
                i3 |= i10;
            }
            if ((599187 & i3) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (cavVarB.H(z3, i3 & 1)) {
                i8 = i2 & 8;
                ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        cmwVar4 = defpackage.cmw.c;
                    } else {
                        cmwVar4 = cmwVar2;
                    }
                    boolean z7 = z | (!z2);
                    if (i8 != 0) {
                        i3 &= -7169;
                        bpwVarAa = aa(0L, 0L, 0L, 0L, cavVarB, 15);
                    }
                    if (i6 == 0) {
                    }
                    crdVarA = defpackage.acqn.a(6, cavVarB);
                    int i15 = i3 & (-458753);
                    z5 = z7;
                    cmwVar5 = cmwVar4;
                    kawVar4 = kawVar5;
                    bpwVar3 = bpwVarAa;
                    i9 = i15;
                } else {
                    if (i13 != 0) {
                        cmwVar4 = defpackage.cmw.c;
                    } else {
                        cmwVar4 = cmwVar2;
                    }
                    boolean z8 = z | (!z2);
                    if (i8 != 0) {
                        i3 &= -7169;
                        bpwVarAa = aa(0L, 0L, 0L, 0L, cavVarB, 15);
                    }
                    if (i6 == 0) {
                    }
                    crdVarA = defpackage.acqn.a(6, cavVarB);
                    int i16 = i3 & (-458753);
                    z5 = z8;
                    cmwVar5 = cmwVar4;
                    kawVar4 = kawVar5;
                    bpwVar3 = bpwVarAa;
                    i9 = i16;
                }
                cavVarB.l();
                rk.p(aomyVar, cmwVar5, z5, bpwVar3, kawVar4, crdVarA, aonnVar, cavVarB, i9 & 3735550);
                crdVar2 = crdVarA;
                kawVar3 = kawVar4;
                bpwVar2 = bpwVar3;
                z4 = z5;
                cmwVar3 = cmwVar5;
            } else {
                cavVarB.s();
                crdVar2 = crdVar;
                z4 = z;
                cmwVar3 = cmwVar2;
                bpwVar2 = bpwVarAa;
                kawVar3 = kawVar;
            }
            cdkVarI = cavVarB.I();
            if (cdkVarI != null) {
                cdkVarI.c = new acpo(aomyVar, cmwVar3, z4, bpwVar2, kawVar3, crdVar2, aonnVar, i, i2, 2);
            }
        }
        i3 |= 48;
        cmwVar2 = cmwVar;
        i4 = i2 & 4;
        if (i4 != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (true != cavVarB.C(z)) {
                i5 = 128;
            } else {
                i5 = 256;
            }
            i3 |= i5;
        }
        if ((i & 3072) == 0) {
            i11 = 1024;
            if ((i2 & 8) == 0) {
                bpwVarAa = bpwVar;
                if (cavVarB.B(bpwVarAa)) {
                    i11 = 2048;
                }
            } else {
                bpwVarAa = bpwVar;
            }
            i3 |= i11;
        } else {
            bpwVarAa = bpwVar;
        }
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                kawVar2 = kawVar;
                if (true != cavVarB.B(kawVar2)) {
                    i7 = 8192;
                } else {
                    i7 = 16384;
                }
                i3 |= i7;
            }
            if ((196608 & i) == 0) {
                i3 |= 65536;
            }
            if ((1572864 & i) == 0) {
                if (true != cavVarB.D(aonnVar)) {
                    i10 = 524288;
                } else {
                    i10 = 1048576;
                }
                i3 |= i10;
            }
            if ((599187 & i3) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (cavVarB.H(z3, i3 & 1)) {
                i8 = i2 & 8;
                ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        cmwVar4 = defpackage.cmw.c;
                    } else {
                        cmwVar4 = cmwVar2;
                    }
                    boolean z9 = z | (!z2);
                    if (i8 != 0) {
                        i3 &= -7169;
                        bpwVarAa = aa(0L, 0L, 0L, 0L, cavVarB, 15);
                    }
                    if (i6 == 0) {
                    }
                    crdVarA = defpackage.acqn.a(6, cavVarB);
                    int i17 = i3 & (-458753);
                    z5 = z9;
                    cmwVar5 = cmwVar4;
                    kawVar4 = kawVar5;
                    bpwVar3 = bpwVarAa;
                    i9 = i17;
                } else {
                    if (i13 != 0) {
                        cmwVar4 = defpackage.cmw.c;
                    } else {
                        cmwVar4 = cmwVar2;
                    }
                    boolean z10 = z | (!z2);
                    if (i8 != 0) {
                        i3 &= -7169;
                        bpwVarAa = aa(0L, 0L, 0L, 0L, cavVarB, 15);
                    }
                    if (i6 == 0) {
                    }
                    crdVarA = defpackage.acqn.a(6, cavVarB);
                    int i18 = i3 & (-458753);
                    z5 = z10;
                    cmwVar5 = cmwVar4;
                    kawVar4 = kawVar5;
                    bpwVar3 = bpwVarAa;
                    i9 = i18;
                }
                cavVarB.l();
                rk.p(aomyVar, cmwVar5, z5, bpwVar3, kawVar4, crdVarA, aonnVar, cavVarB, i9 & 3735550);
                crdVar2 = crdVarA;
                kawVar3 = kawVar4;
                bpwVar2 = bpwVar3;
                z4 = z5;
                cmwVar3 = cmwVar5;
            } else {
                cavVarB.s();
                crdVar2 = crdVar;
                z4 = z;
                cmwVar3 = cmwVar2;
                bpwVar2 = bpwVarAa;
                kawVar3 = kawVar;
            }
            cdkVarI = cavVarB.I();
            if (cdkVarI != null) {
                cdkVarI.c = new acpo(aomyVar, cmwVar3, z4, bpwVar2, kawVar3, crdVar2, aonnVar, i, i2, 2);
            }
        }
        i3 |= 24576;
        kawVar2 = kawVar;
        if ((196608 & i) == 0) {
            i3 |= 65536;
        }
        if ((1572864 & i) == 0) {
            if (true != cavVarB.D(aonnVar)) {
                i10 = 524288;
            } else {
                i10 = 1048576;
            }
            i3 |= i10;
        }
        if ((599187 & i3) != 599186) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (cavVarB.H(z3, i3 & 1)) {
            i8 = i2 & 8;
            ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
            if ((i & 1) != 0) {
                if (i13 != 0) {
                    cmwVar4 = defpackage.cmw.c;
                } else {
                    cmwVar4 = cmwVar2;
                }
                boolean z11 = z | (!z2);
                if (i8 != 0) {
                    i3 &= -7169;
                    bpwVarAa = aa(0L, 0L, 0L, 0L, cavVarB, 15);
                }
                if (i6 == 0) {
                }
                crdVarA = defpackage.acqn.a(6, cavVarB);
                int i19 = i3 & (-458753);
                z5 = z11;
                cmwVar5 = cmwVar4;
                kawVar4 = kawVar5;
                bpwVar3 = bpwVarAa;
                i9 = i19;
            } else {
                if (i13 != 0) {
                    cmwVar4 = defpackage.cmw.c;
                } else {
                    cmwVar4 = cmwVar2;
                }
                boolean z12 = z | (!z2);
                if (i8 != 0) {
                    i3 &= -7169;
                    bpwVarAa = aa(0L, 0L, 0L, 0L, cavVarB, 15);
                }
                if (i6 == 0) {
                }
                crdVarA = defpackage.acqn.a(6, cavVarB);
                int i110 = i3 & (-458753);
                z5 = z12;
                cmwVar5 = cmwVar4;
                kawVar4 = kawVar5;
                bpwVar3 = bpwVarAa;
                i9 = i110;
            }
            cavVarB.l();
            rk.p(aomyVar, cmwVar5, z5, bpwVar3, kawVar4, crdVarA, aonnVar, cavVarB, i9 & 3735550);
            crdVar2 = crdVarA;
            kawVar3 = kawVar4;
            bpwVar2 = bpwVar3;
            z4 = z5;
            cmwVar3 = cmwVar5;
        } else {
            cavVarB.s();
            crdVar2 = crdVar;
            z4 = z;
            cmwVar3 = cmwVar2;
            bpwVar2 = bpwVarAa;
            kawVar3 = kawVar;
        }
        cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new acpo(aomyVar, cmwVar3, z4, bpwVar2, kawVar3, crdVar2, aonnVar, i, i2, 2);
        }
    }

    public static void aD(defpackage.aomy aomyVar, defpackage.cmw cmwVar, boolean z, defpackage.crd crdVar, bpw bpwVar, defpackage.kaw kawVar, defpackage.aonn aonnVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.cav cavVar2;
        boolean z2;
        defpackage.crd crdVar2;
        defpackage.crd crdVarA;
        defpackage.aooh.f(aonnVar, "content");
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(461897308);
        boolean z3 = true;
        if (i3 == 0) {
            i2 = (true != cavVarB.D(aomyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        int i4 = i2 | 384;
        if ((i & 3072) == 0) {
            i4 = i2 | 1408;
        }
        if ((i & 24576) == 0) {
            i4 |= true != cavVarB.B(bpwVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i4 |= true != cavVarB.B(kawVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i4 |= true != cavVarB.D(aonnVar) ? 524288 : 1048576;
        }
        if (cavVarB.H((599187 & i4) != 599186, i4 & 1)) {
            ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
            if ((i & 1) == 0 || cavVarB.E()) {
                crdVarA = defpackage.acqn.a(6, cavVarB);
            } else {
                cavVarB.s();
                z3 = z;
                crdVarA = crdVar;
            }
            cavVarB.l();
            cavVar2 = cavVarB;
            rk.n(aomyVar, cmwVar, z3, crdVarA, bpwVar, kawVar, aonnVar, cavVar2, i4 & 4187134);
            crdVar2 = crdVarA;
            z2 = z3;
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
            z2 = z;
            crdVar2 = crdVar;
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.bmp(aomyVar, cmwVar, z2, crdVar2, bpwVar, kawVar, aonnVar, i, 13);
        }
    }

    public static void aE(defpackage.aomy aomyVar, bnv bnvVar, defpackage.cmw cmwVar, boolean z, defpackage.bni bniVar, bnm bnmVar, defpackage.ayy ayyVar, defpackage.kaw kawVar, defpackage.aono aonoVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.cmw cmwVar2;
        boolean z2;
        defpackage.bni bniVar2;
        bnm bnmVar2;
        defpackage.ayy ayyVar2;
        defpackage.kaw kawVar2;
        defpackage.aooh.f(aomyVar, "onClick");
        defpackage.aooh.f(bnvVar, "shapes");
        defpackage.aooh.f(aonoVar, "content");
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(967647817);
        if (i3 == 0) {
            i2 = (true != cavVarB.D(aomyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(bnvVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            cmwVar2 = cmwVar;
            i2 |= true != cavVarB.B(cmwVar2) ? 128 : 256;
        } else {
            cmwVar2 = cmwVar;
        }
        if ((i & 3072) == 0) {
            z2 = z;
            i2 |= true != cavVarB.C(z2) ? 1024 : 2048;
        } else {
            z2 = z;
        }
        if ((i & 24576) == 0) {
            bniVar2 = bniVar;
            i2 |= true != cavVarB.B(bniVar2) ? 8192 : 16384;
        } else {
            bniVar2 = bniVar;
        }
        if ((196608 & i) == 0) {
            bnmVar2 = bnmVar;
            i2 |= true != cavVarB.B(bnmVar2) ? 65536 : 131072;
        } else {
            bnmVar2 = bnmVar;
        }
        int i4 = i2 | 1572864;
        if ((12582912 & i) == 0) {
            ayyVar2 = ayyVar;
            i4 |= true != cavVarB.B(ayyVar2) ? 4194304 : 8388608;
        } else {
            ayyVar2 = ayyVar;
        }
        if ((100663296 & i) == 0) {
            kawVar2 = kawVar;
            i4 |= true != cavVarB.B(kawVar2) ? 33554432 : 67108864;
        } else {
            kawVar2 = kawVar;
        }
        if ((805306368 & i) == 0) {
            i4 |= true != cavVarB.D(aonoVar) ? 268435456 : 536870912;
        }
        if (cavVarB.H((306783379 & i4) != 306783378, i4 & 1)) {
            ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
            if ((i & 1) != 0 && !cavVarB.E()) {
                cavVarB.s();
            }
            cavVarB.l();
            boolean z3 = z2;
            defpackage.den.bX(aomyVar, bnvVar, cmwVar2, z3, bniVar2, bnmVar2, ayyVar2, kawVar2, aonoVar, cavVarB, i4 & 2147483646);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new bnu(aomyVar, bnvVar, cmwVar, z, bniVar, bnmVar, ayyVar, kawVar, aonoVar, i, 2);
        }
    }

    private static void aF(java.lang.Runnable runnable) {
        java.lang.Thread thread = new java.lang.Thread(runnable, "PsdCollector");
        thread.setPriority(4);
        thread.start();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v5 ??, still in use, count: 1, list:
          (r0v5 ?? I:bpw) from 0x0065: IPUT (r0v5 ?? I:bpw), (r1v4 ?? I:bor) (LINE:102) bor.ad bpw
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public static bpw aa(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v5 ??, still in use, count: 1, list:
          (r0v5 ?? I:bpw) from 0x0065: IPUT (r0v5 ?? I:bpw), (r1v4 ?? I:bor) (LINE:102) bor.ad bpw
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r20v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    public static /* synthetic */ defpackage.bwo ab(defpackage.dkz dkzVar, defpackage.dkz dkzVar2, defpackage.dkz dkzVar3, defpackage.dkz dkzVar4, defpackage.dkz dkzVar5, defpackage.dkz dkzVar6, defpackage.dkz dkzVar7, defpackage.dkz dkzVar8, defpackage.dkz dkzVar9, defpackage.dkz dkzVar10, defpackage.dkz dkzVar11, defpackage.dkz dkzVar12, defpackage.dkz dkzVar13, defpackage.dkz dkzVar14, defpackage.dkz dkzVar15, defpackage.dkz dkzVar16, defpackage.dkz dkzVar17, defpackage.dkz dkzVar18, defpackage.dkz dkzVar19, defpackage.dkz dkzVar20, defpackage.dkz dkzVar21, defpackage.dkz dkzVar22, defpackage.dkz dkzVar23, defpackage.dkz dkzVar24, defpackage.dkz dkzVar25, defpackage.dkz dkzVar26, defpackage.dkz dkzVar27, defpackage.dkz dkzVar28, defpackage.dkz dkzVar29, defpackage.dkz dkzVar30) {
        defpackage.aooh.f(dkzVar, "displayLarge");
        defpackage.aooh.f(dkzVar2, "displayMedium");
        defpackage.aooh.f(dkzVar3, "displaySmall");
        defpackage.aooh.f(dkzVar4, "headlineLarge");
        defpackage.aooh.f(dkzVar5, "headlineMedium");
        defpackage.aooh.f(dkzVar6, "headlineSmall");
        defpackage.aooh.f(dkzVar7, "titleLarge");
        defpackage.aooh.f(dkzVar8, "titleMedium");
        defpackage.aooh.f(dkzVar9, "titleSmall");
        defpackage.aooh.f(dkzVar10, "bodyLarge");
        defpackage.aooh.f(dkzVar11, "bodyMedium");
        defpackage.aooh.f(dkzVar12, "bodySmall");
        defpackage.aooh.f(dkzVar13, "labelLarge");
        defpackage.aooh.f(dkzVar14, "labelMedium");
        defpackage.aooh.f(dkzVar15, "labelSmall");
        defpackage.aooh.f(dkzVar16, "displayLargeEmphasized");
        defpackage.aooh.f(dkzVar17, "displayMediumEmphasized");
        defpackage.aooh.f(dkzVar18, "displaySmallEmphasized");
        defpackage.aooh.f(dkzVar19, "headlineLargeEmphasized");
        defpackage.aooh.f(dkzVar20, "headlineMediumEmphasized");
        defpackage.aooh.f(dkzVar21, "headlineSmallEmphasized");
        defpackage.aooh.f(dkzVar22, "titleLargeEmphasized");
        defpackage.aooh.f(dkzVar23, "titleMediumEmphasized");
        defpackage.aooh.f(dkzVar24, "titleSmallEmphasized");
        defpackage.aooh.f(dkzVar25, "bodyLargeEmphasized");
        defpackage.aooh.f(dkzVar26, "bodyMediumEmphasized");
        defpackage.aooh.f(dkzVar27, "bodySmallEmphasized");
        defpackage.aooh.f(dkzVar28, "labelLargeEmphasized");
        defpackage.aooh.f(dkzVar29, "labelMediumEmphasized");
        defpackage.aooh.f(dkzVar30, "labelSmallEmphasized");
        return new defpackage.bwo(dkzVar, dkzVar2, dkzVar3, dkzVar4, dkzVar5, dkzVar6, dkzVar7, dkzVar8, dkzVar9, dkzVar10, dkzVar11, dkzVar12, dkzVar13, dkzVar14, dkzVar15, dkzVar16, dkzVar17, dkzVar18, dkzVar19, dkzVar20, dkzVar21, dkzVar22, dkzVar23, dkzVar24, dkzVar25, dkzVar26, dkzVar27, dkzVar28, dkzVar29, dkzVar30);
    }

    public static /* synthetic */ defpackage.bwo ac() {
        defpackage.dkz dkzVar = actm.a;
        defpackage.dkz dkzVar2 = actm.d;
        defpackage.dkz dkzVar3 = actm.e;
        defpackage.dkz dkzVar4 = actm.f;
        defpackage.dkz dkzVar5 = actm.g;
        defpackage.dkz dkzVar6 = actm.h;
        defpackage.dkz dkzVar7 = actm.i;
        defpackage.dkz dkzVar8 = actm.m;
        defpackage.dkz dkzVar9 = actm.n;
        defpackage.dkz dkzVar10 = actm.o;
        defpackage.dkz dkzVar11 = actm.a;
        defpackage.dkz dkzVar12 = actm.b;
        defpackage.dkz dkzVar13 = actm.c;
        defpackage.dkz dkzVar14 = actm.j;
        defpackage.dkz dkzVar15 = actm.k;
        defpackage.dkz dkzVar16 = actm.l;
        defpackage.dkz dkzVar17 = actl.a;
        return ab(dkzVar2, dkzVar3, dkzVar4, dkzVar5, dkzVar6, dkzVar7, dkzVar8, dkzVar9, dkzVar10, dkzVar11, dkzVar12, dkzVar13, dkzVar14, dkzVar15, dkzVar16, actl.d, actl.e, actl.f, actl.g, actl.h, actl.i, actl.m, actl.n, actl.o, actl.a, actl.b, actl.c, actl.j, actl.k, actl.l);
    }

    public static void ad(defpackage.aomy aomyVar, defpackage.cmw cmwVar, defpackage.crd crdVar, long j, long j2, bpn bpnVar, defpackage.aonn aonnVar, defpackage.cav cavVar, int i, int i2) {
        int i3;
        defpackage.crd crdVar2;
        long jT;
        long jR;
        bpn bpnVar2;
        defpackage.cmw cmwVar2;
        defpackage.crd crdVar3;
        bpn bpnVar3;
        long j3;
        long j4;
        defpackage.crd crdVarA;
        defpackage.cmw cmwVar3;
        int i4;
        defpackage.crd crdVar4;
        bpn bpnVar4;
        long j5;
        long j6;
        defpackage.aooh.f(aomyVar, "onClick");
        defpackage.aooh.f(aonnVar, "content");
        int i5 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1262354088);
        if (i5 == 0) {
            i3 = (true != cavVarB.D(aomyVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            int i7 = 128;
            if ((i2 & 4) == 0) {
                crdVar2 = crdVar;
                if (cavVarB.B(crdVar2)) {
                    i7 = 256;
                }
            } else {
                crdVar2 = crdVar;
            }
            i3 |= i7;
        } else {
            crdVar2 = crdVar;
        }
        if ((i & 3072) == 0) {
            int i8 = 1024;
            jT = j;
            if ((i2 & 8) == 0 && cavVarB.A(jT)) {
                i8 = 2048;
            }
            i3 |= i8;
        } else {
            jT = j;
        }
        if ((i & 24576) == 0) {
            int i9 = 8192;
            jR = j2;
            if ((i2 & 16) == 0 && cavVarB.A(jR)) {
                i9 = 16384;
            }
            i3 |= i9;
        } else {
            jR = j2;
        }
        if ((196608 & i) == 0) {
            int i10 = 65536;
            if ((i2 & 32) == 0) {
                bpnVar2 = bpnVar;
                if (cavVarB.B(bpnVar2)) {
                    i10 = 131072;
                }
            } else {
                bpnVar2 = bpnVar;
            }
            i3 |= i10;
        } else {
            bpnVar2 = bpnVar;
        }
        int i11 = i3 | 1572864;
        if ((12582912 & i) == 0) {
            i11 |= true != cavVarB.D(aonnVar) ? 4194304 : 8388608;
        }
        if (cavVarB.H((4793491 & i11) != 4793490, i11 & 1)) {
            int i12 = i2 & 32;
            int i13 = i2 & 16;
            int i14 = i2 & 8;
            int i15 = i2 & 4;
            ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
            if ((i & 1) == 0 || cavVarB.E()) {
                defpackage.cmw cmwVar4 = i6 != 0 ? defpackage.cmw.c : cmwVar;
                if (i15 != 0) {
                    i11 &= -897;
                    crdVarA = defpackage.acqn.a(7, cavVarB);
                } else {
                    crdVarA = crdVar2;
                }
                if (i14 != 0) {
                    jT = defpackage.abrz.t(26, cavVarB);
                    i11 &= -7169;
                }
                if (i13 != 0) {
                    jR = defpackage.abrz.r(jT, cavVarB);
                    i11 &= -57345;
                }
                if (i12 != 0) {
                    i11 &= -458753;
                    bpnVar2 = new bpn(6.0f, 6.0f, 6.0f, 8.0f);
                }
                int i16 = i11;
                cmwVar3 = cmwVar4;
                i4 = i16;
                crdVar4 = crdVarA;
                bpnVar4 = bpnVar2;
                j5 = jT;
                j6 = jR;
            } else {
                cavVarB.s();
                if (i15 != 0) {
                    i11 &= -897;
                }
                if (i14 != 0) {
                    i11 &= -7169;
                }
                if (i13 != 0) {
                    i11 &= -57345;
                }
                if (i12 != 0) {
                    i11 &= -458753;
                }
                i4 = i11;
                crdVar4 = crdVar2;
                bpnVar4 = bpnVar2;
                j5 = jT;
                j6 = jR;
                cmwVar3 = cmwVar;
            }
            cavVarB.l();
            rk.j(aomyVar, cmwVar3, crdVar4, j5, j6, bpnVar4, aonnVar, cavVarB, 33554430 & i4);
            bpnVar3 = bpnVar4;
            j4 = j6;
            j3 = j5;
            crdVar3 = crdVar4;
            cmwVar2 = cmwVar3;
        } else {
            cavVarB.s();
            cmwVar2 = cmwVar;
            crdVar3 = crdVar2;
            bpnVar3 = bpnVar2;
            j3 = jT;
            j4 = jR;
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new acpx(aomyVar, cmwVar2, crdVar3, j3, j4, bpnVar3, aonnVar, i, i2);
        }
    }

    public static void ae(defpackage.aomy aomyVar, defpackage.cmw cmwVar, defpackage.crd crdVar, long j, long j2, bpn bpnVar, defpackage.aonn aonnVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.cav cavVar2;
        bpn bpnVar2;
        bpn bpnVar3;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-55903465);
        if (i3 == 0) {
            i2 = (true != cavVarB.D(aomyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.B(crdVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.A(j) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cavVarB.A(j2) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= 65536;
        }
        int i4 = i2 | 1572864;
        if ((12582912 & i) == 0) {
            i4 |= true != cavVarB.D(aonnVar) ? 4194304 : 8388608;
        }
        if (cavVarB.H((4793491 & i4) != 4793490, i4 & 1)) {
            ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
            if ((i & 1) == 0 || cavVarB.E()) {
                bpnVar3 = new bpn(6.0f, 6.0f, 6.0f, 8.0f);
            } else {
                cavVarB.s();
                bpnVar3 = bpnVar;
            }
            cavVarB.l();
            cavVar2 = cavVarB;
            rk.k(aomyVar, cmwVar, crdVar, j, j2, bpnVar3, aonnVar, cavVar2, i4 & 33095678);
            bpnVar2 = bpnVar3;
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
            bpnVar2 = bpnVar;
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new bpt(aomyVar, cmwVar, crdVar, j, j2, bpnVar2, aonnVar, i, 2);
        }
    }

    public static void af(defpackage.cmw cmwVar, long j, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.cav cavVarB = cavVar.b(964649005);
        if ((i & 6) == 0) {
            i2 = (true != cavVarB.B(cmwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.y(1.0f) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.A(j) ? 128 : 256;
        }
        if (cavVarB.H((i2 & 147) != 146, i2 & 1)) {
            ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
            if ((i & 1) != 0 && !cavVarB.E()) {
                cavVarB.s();
            }
            cavVarB.l();
            defpackage.rd.l(cmwVar, j, cavVarB, i2 & 1022);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new bpe(cmwVar, j, i, 6);
        }
    }

    public static void ag(defpackage.cmw cmwVar, long j, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(634017535);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(cmwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.y(1.0f) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.A(j) ? 128 : 256;
        }
        if (cavVarB.H((i2 & 147) != 146, i2 & 1)) {
            ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
            if ((i & 1) != 0 && !cavVarB.E()) {
                cavVarB.s();
            }
            cavVarB.l();
            defpackage.rd.m(cmwVar, j, cavVarB, i2 & 1022);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new bpe(cmwVar, j, i, 5);
        }
    }

    public static void ah(defpackage.aomy aomyVar, defpackage.cmw cmwVar, boolean z, defpackage.crd crdVar, defpackage.bnw bnwVar, defpackage.bnx bnxVar, defpackage.aono aonoVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.cav cavVar2;
        boolean z2;
        defpackage.crd crdVar2;
        defpackage.bnx bnxVar2;
        defpackage.crd crdVarA;
        defpackage.bnx bnxVar3;
        defpackage.aooh.f(aomyVar, "onClick");
        defpackage.aooh.f(aonoVar, "content");
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-2043141941);
        boolean z3 = true;
        if (i3 == 0) {
            i2 = (true != cavVarB.D(aomyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        int i4 = i2 | 384;
        if ((i & 3072) == 0) {
            i4 = i2 | 1408;
        }
        if ((i & 24576) == 0) {
            i4 |= true != cavVarB.B(bnwVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i4 |= 65536;
        }
        int i5 = i4 | 14155776;
        if ((100663296 & i) == 0) {
            i5 |= true != cavVarB.D(aonoVar) ? 33554432 : 67108864;
        }
        if (cavVarB.H((38347923 & i5) != 38347922, i5 & 1)) {
            ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
            if ((i & 1) == 0 || cavVarB.E()) {
                crdVarA = defpackage.acqn.a(12, cavVarB);
                bnxVar3 = new defpackage.bnx();
            } else {
                cavVarB.s();
                z3 = z;
                crdVarA = crdVar;
                bnxVar3 = bnxVar;
            }
            cavVarB.l();
            cavVar2 = cavVarB;
            defpackage.rd.p(aomyVar, cmwVar, z3, crdVarA, bnwVar, bnxVar3, aonoVar, cavVar2, i5 & 267969534);
            crdVar2 = crdVarA;
            bnxVar2 = bnxVar3;
            z2 = z3;
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
            z2 = z;
            crdVar2 = crdVar;
            bnxVar2 = bnxVar;
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.bmp(aomyVar, cmwVar, z2, crdVar2, bnwVar, bnxVar2, aonoVar, i, 12);
        }
    }

    public static void ai(defpackage.cmw cmwVar, defpackage.crd crdVar, defpackage.bnw bnwVar, defpackage.bnx bnxVar, defpackage.aono aonoVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.cmw cmwVar2;
        defpackage.crd crdVar2;
        defpackage.bnw bnwVar2;
        defpackage.aono aonoVar2;
        defpackage.aooh.f(aonoVar, "content");
        defpackage.cav cavVarB = cavVar.b(1536405658);
        if ((i & 6) == 0) {
            i2 = (true != cavVarB.B(cmwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(crdVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.B(bnwVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= 1024;
        }
        int i3 = i2 | 24576;
        if ((196608 & i) == 0) {
            i3 |= true != cavVarB.D(aonoVar) ? 65536 : 131072;
        }
        if (cavVarB.H((74899 & i3) != 74898, i3 & 1)) {
            ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
            if ((i & 1) == 0 || cavVarB.E()) {
                bnxVar = new defpackage.bnx();
            } else {
                cavVarB.s();
            }
            defpackage.bnx bnxVar2 = bnxVar;
            cavVarB.l();
            cmwVar2 = cmwVar;
            crdVar2 = crdVar;
            bnwVar2 = bnwVar;
            aonoVar2 = aonoVar;
            defpackage.rd.o(cmwVar2, crdVar2, bnwVar2, bnxVar2, aonoVar2, cavVarB, i3 & 517118);
            bnxVar = bnxVar2;
        } else {
            cmwVar2 = cmwVar;
            crdVar2 = crdVar;
            bnwVar2 = bnwVar;
            aonoVar2 = aonoVar;
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new alh(cmwVar2, crdVar2, bnwVar2, bnxVar, aonoVar2, i, 19);
        }
    }

    public static defpackage.bnw aj(long j, long j2, defpackage.cav cavVar, int i) {
        long jP;
        long jT = (i & 1) != 0 ? defpackage.abrz.t(38, cavVar) : j;
        long jR = (i & 2) != 0 ? defpackage.abrz.r(jT, cavVar) : j2;
        long jH = defpackage.cqg.h(defpackage.abrz.t(42, cavVar), 0.38f);
        defpackage.bor borVarAk = defpackage.den.ak(cavVar);
        if (defpackage.dpi.c(0.0f, 0.0f)) {
            jP = borVarAk.p;
        } else {
            jP = defpackage.cfd.P(defpackage.cqg.h(borVarAk.t, 0.02f), borVarAk.p);
        }
        long jP2 = defpackage.cfd.P(jH, jP);
        long jH2 = defpackage.cqg.h(defpackage.abrz.r(jT, cavVar), 0.38f);
        defpackage.bor borVarAk2 = defpackage.den.ak(cavVar);
        defpackage.bnw bnwVar = borVarAk2.Y;
        if (bnwVar == null) {
            bnwVar = new defpackage.bnw(defpackage.bos.b(borVarAk2, 38), defpackage.bos.a(borVarAk2, defpackage.bos.b(borVarAk2, 38)), defpackage.cfd.P(defpackage.cqg.h(defpackage.bos.b(borVarAk2, 43), 0.38f), defpackage.bos.b(borVarAk2, 38)), defpackage.cqg.h(defpackage.bos.a(borVarAk2, defpackage.bos.b(borVarAk2, 38)), 0.38f));
            borVarAk2.Y = bnwVar;
        }
        long j3 = jT != 16 ? jT : bnwVar.a;
        long j4 = jR != 16 ? jR : bnwVar.b;
        if (jP2 == 16) {
            jP2 = bnwVar.c;
        }
        long j5 = jP2;
        if (jH2 == 16) {
            jH2 = bnwVar.d;
        }
        return new defpackage.bnw(j3, j4, j5, jH2);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x011d  */
    /* JADX WARN: Code duplicated, block: B:103:0x0120  */
    /* JADX WARN: Code duplicated, block: B:106:0x0129  */
    /* JADX WARN: Code duplicated, block: B:108:0x0146  */
    /* JADX WARN: Code duplicated, block: B:118:0x0165 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x0167  */
    /* JADX WARN: Code duplicated, block: B:122:0x0170  */
    /* JADX WARN: Code duplicated, block: B:124:0x017b  */
    /* JADX WARN: Code duplicated, block: B:125:0x018c  */
    /* JADX WARN: Code duplicated, block: B:127:0x0191  */
    /* JADX WARN: Code duplicated, block: B:128:0x0199  */
    /* JADX WARN: Code duplicated, block: B:130:0x019d  */
    /* JADX WARN: Code duplicated, block: B:132:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:133:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:136:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:139:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x004d  */
    /* JADX WARN: Code duplicated, block: B:24:0x004f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:27:0x0055  */
    /* JADX WARN: Code duplicated, block: B:29:0x0059  */
    /* JADX WARN: Code duplicated, block: B:31:0x005f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x007a  */
    /* JADX WARN: Code duplicated, block: B:43:0x007e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0084  */
    /* JADX WARN: Code duplicated, block: B:54:0x009a  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:61:0x00af  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:68:0x00be  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:95:0x0106  */
    /* JADX WARN: Code duplicated, block: B:97:0x010c  */
    /* JADX WARN: Code duplicated, block: B:98:0x010f  */
    public static void ak(defpackage.aomy aomyVar, defpackage.cmw cmwVar, boolean z, defpackage.crd crdVar, defpackage.bni bniVar, bnm bnmVar, defpackage.amu amuVar, defpackage.ayy ayyVar, defpackage.aono aonoVar, defpackage.cav cavVar, int i, int i2) {
        int i3;
        defpackage.cmw cmwVar2;
        int i4;
        boolean z2;
        int i5;
        defpackage.crd crdVarD;
        bnm bnmVar2;
        int i6;
        defpackage.amu amuVar2;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z3;
        boolean z4;
        defpackage.amu amuVar3;
        defpackage.ayy ayyVar2;
        defpackage.cmw cmwVar3;
        defpackage.crd crdVar2;
        defpackage.bni bniVar2;
        bnm bnmVar3;
        defpackage.cdk cdkVarI;
        int i11;
        int i12;
        int i13;
        defpackage.bni bniVarA;
        bnm bnmVarG;
        defpackage.ayy ayyVar3;
        bnm bnmVar4;
        defpackage.cmw cmwVar4;
        defpackage.ayy ayyVar4;
        defpackage.crd crdVar3;
        defpackage.amu amuVar4;
        int i14;
        boolean z5;
        int i15;
        int i16;
        int i17;
        int i18;
        defpackage.aooh.f(aomyVar, "onClick");
        defpackage.aooh.f(aonoVar, "content");
        int i19 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1817036644);
        if (i19 == 0) {
            i3 = (true != cavVarB.D(aomyVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i20 = i2 & 2;
        if (i20 == 0) {
            if ((i & 48) == 0) {
                cmwVar2 = cmwVar;
                i3 |= true != cavVarB.B(cmwVar2) ? 16 : 32;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (i4 != 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                if (true != cavVarB.C(z)) {
                    i5 = 128;
                } else {
                    i5 = 256;
                }
                i3 |= i5;
            }
            if ((i & 3072) == 0) {
                i18 = 1024;
                if ((i2 & 8) == 0) {
                    crdVarD = crdVar;
                    if (cavVarB.B(crdVarD)) {
                        i18 = 2048;
                    }
                } else {
                    crdVarD = crdVar;
                }
                i3 |= i18;
            } else {
                crdVarD = crdVar;
            }
            if ((i & 24576) == 0) {
                i17 = 8192;
                if ((i2 & 16) == 0 && cavVarB.B(bniVar)) {
                    i17 = 16384;
                }
                i3 |= i17;
            }
            if ((196608 & i) == 0) {
                i16 = 65536;
                if ((i2 & 32) == 0) {
                    bnmVar2 = bnmVar;
                    if (cavVarB.B(bnmVar2)) {
                        i16 = 131072;
                    }
                } else {
                    bnmVar2 = bnmVar;
                }
                i3 |= i16;
            } else {
                bnmVar2 = bnmVar;
            }
            i6 = i2 & 64;
            if (i6 != 0) {
                if ((1572864 & i) == 0) {
                    amuVar2 = amuVar;
                    if (true != cavVarB.B(amuVar2)) {
                        i7 = 524288;
                    } else {
                        i7 = 1048576;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 128;
                if (i8 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (true != cavVarB.B(ayyVar)) {
                        i9 = 4194304;
                    } else {
                        i9 = 8388608;
                    }
                    i3 |= i9;
                }
                if ((i2 & 256) != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (true != cavVarB.B(null)) {
                        i10 = 33554432;
                    } else {
                        i10 = 67108864;
                    }
                    i3 |= i10;
                }
                if ((805306368 & i) == 0) {
                    if (true != cavVarB.D(aonoVar)) {
                        i15 = 268435456;
                    } else {
                        i15 = 536870912;
                    }
                    i3 |= i15;
                }
                if ((306783379 & i3) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (cavVarB.H(z3, i3 & 1)) {
                    i11 = i2 & 32;
                    i12 = i2 & 16;
                    i13 = i2 & 8;
                    ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
                    if ((i & 1) != 0 || cavVarB.E()) {
                        if (i20 != 0) {
                            cmwVar2 = defpackage.cmw.c;
                        }
                        boolean z6 = (!z2) | z;
                        if (i13 != 0) {
                            i3 &= -7169;
                            defpackage.ayy ayyVar5 = acpl.a;
                            crdVarD = acpl.d(cavVarB);
                        }
                        if (i12 != 0) {
                            defpackage.ayy ayyVar6 = acpl.a;
                            bniVarA = acpl.a(0L, 0L, cavVarB, 15);
                            i3 &= -57345;
                        } else {
                            bniVarA = bniVar;
                        }
                        if (i11 != 0) {
                            defpackage.ayy ayyVar7 = acpl.a;
                            i3 &= -458753;
                            bnmVarG = acpl.g();
                        } else {
                            bnmVarG = bnmVar;
                        }
                        defpackage.amu amuVar5 = i6 == 0 ? amuVar : null;
                        if (i8 != 0) {
                            defpackage.ayy ayyVar8 = acpl.a;
                            ayyVar3 = acpl.a;
                        } else {
                            ayyVar3 = ayyVar;
                        }
                        defpackage.cmw cmwVar5 = cmwVar2;
                        bnmVar4 = bnmVarG;
                        cmwVar4 = cmwVar5;
                        ayyVar4 = ayyVar3;
                        crdVar3 = crdVarD;
                        amuVar4 = amuVar5;
                        i14 = i3;
                        z5 = z6;
                    } else {
                        cavVarB.s();
                        if (i13 != 0) {
                            i3 &= -7169;
                        }
                        if (i12 != 0) {
                            i3 &= -57345;
                        }
                        if (i11 != 0) {
                            i3 &= -458753;
                        }
                        bniVarA = bniVar;
                        ayyVar4 = ayyVar;
                        i14 = i3;
                        cmwVar4 = cmwVar2;
                        crdVar3 = crdVarD;
                        bnmVar4 = bnmVar2;
                        amuVar4 = amuVar2;
                        z5 = z;
                    }
                    cavVarB.l();
                    defpackage.den.ap(aomyVar, cmwVar4, z5, crdVar3, bniVarA, bnmVar4, amuVar4, ayyVar4, aonoVar, cavVarB, 2147483646 & i14);
                    ayyVar2 = ayyVar4;
                    amuVar3 = amuVar4;
                    bnmVar3 = bnmVar4;
                    bniVar2 = bniVarA;
                    crdVar2 = crdVar3;
                    z4 = z5;
                    cmwVar3 = cmwVar4;
                } else {
                    cavVarB.s();
                    z4 = z;
                    amuVar3 = amuVar;
                    ayyVar2 = ayyVar;
                    cmwVar3 = cmwVar2;
                    crdVar2 = crdVarD;
                    bniVar2 = bniVar;
                    bnmVar3 = bnmVar;
                }
                cdkVarI = cavVarB.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new acpp(aomyVar, cmwVar3, z4, crdVar2, bniVar2, bnmVar3, amuVar3, ayyVar2, aonoVar, i, i2);
                }
            }
            i3 |= 1572864;
            amuVar2 = amuVar;
            i8 = i2 & 128;
            if (i8 != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (true != cavVarB.B(ayyVar)) {
                    i9 = 4194304;
                } else {
                    i9 = 8388608;
                }
                i3 |= i9;
            }
            if ((i2 & 256) != 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (true != cavVarB.B(null)) {
                    i10 = 33554432;
                } else {
                    i10 = 67108864;
                }
                i3 |= i10;
            }
            if ((805306368 & i) == 0) {
                if (true != cavVarB.D(aonoVar)) {
                    i15 = 268435456;
                } else {
                    i15 = 536870912;
                }
                i3 |= i15;
            }
            if ((306783379 & i3) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (cavVarB.H(z3, i3 & 1)) {
                i11 = i2 & 32;
                i12 = i2 & 16;
                i13 = i2 & 8;
                ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
                if ((i & 1) != 0) {
                    if (i20 != 0) {
                        cmwVar2 = defpackage.cmw.c;
                    }
                    boolean z7 = (!z2) | z;
                    if (i13 != 0) {
                        i3 &= -7169;
                        defpackage.ayy ayyVar9 = acpl.a;
                        crdVarD = acpl.d(cavVarB);
                    }
                    if (i12 != 0) {
                        defpackage.ayy ayyVar10 = acpl.a;
                        bniVarA = acpl.a(0L, 0L, cavVarB, 15);
                        i3 &= -57345;
                    } else {
                        bniVarA = bniVar;
                    }
                    if (i11 != 0) {
                        defpackage.ayy ayyVar11 = acpl.a;
                        i3 &= -458753;
                        bnmVarG = acpl.g();
                    } else {
                        bnmVarG = bnmVar;
                    }
                    if (i6 == 0) {
                    }
                    if (i8 != 0) {
                        defpackage.ayy ayyVar12 = acpl.a;
                        ayyVar3 = acpl.a;
                    } else {
                        ayyVar3 = ayyVar;
                    }
                    defpackage.cmw cmwVar6 = cmwVar2;
                    bnmVar4 = bnmVarG;
                    cmwVar4 = cmwVar6;
                    ayyVar4 = ayyVar3;
                    crdVar3 = crdVarD;
                    amuVar4 = amuVar5;
                    i14 = i3;
                    z5 = z7;
                } else {
                    if (i20 != 0) {
                        cmwVar2 = defpackage.cmw.c;
                    }
                    boolean z8 = (!z2) | z;
                    if (i13 != 0) {
                        i3 &= -7169;
                        defpackage.ayy ayyVar13 = acpl.a;
                        crdVarD = acpl.d(cavVarB);
                    }
                    if (i12 != 0) {
                        defpackage.ayy ayyVar14 = acpl.a;
                        bniVarA = acpl.a(0L, 0L, cavVarB, 15);
                        i3 &= -57345;
                    } else {
                        bniVarA = bniVar;
                    }
                    if (i11 != 0) {
                        defpackage.ayy ayyVar15 = acpl.a;
                        i3 &= -458753;
                        bnmVarG = acpl.g();
                    } else {
                        bnmVarG = bnmVar;
                    }
                    if (i6 == 0) {
                    }
                    if (i8 != 0) {
                        defpackage.ayy ayyVar16 = acpl.a;
                        ayyVar3 = acpl.a;
                    } else {
                        ayyVar3 = ayyVar;
                    }
                    defpackage.cmw cmwVar7 = cmwVar2;
                    bnmVar4 = bnmVarG;
                    cmwVar4 = cmwVar7;
                    ayyVar4 = ayyVar3;
                    crdVar3 = crdVarD;
                    amuVar4 = amuVar5;
                    i14 = i3;
                    z5 = z8;
                }
                cavVarB.l();
                defpackage.den.ap(aomyVar, cmwVar4, z5, crdVar3, bniVarA, bnmVar4, amuVar4, ayyVar4, aonoVar, cavVarB, 2147483646 & i14);
                ayyVar2 = ayyVar4;
                amuVar3 = amuVar4;
                bnmVar3 = bnmVar4;
                bniVar2 = bniVarA;
                crdVar2 = crdVar3;
                z4 = z5;
                cmwVar3 = cmwVar4;
            } else {
                cavVarB.s();
                z4 = z;
                amuVar3 = amuVar;
                ayyVar2 = ayyVar;
                cmwVar3 = cmwVar2;
                crdVar2 = crdVarD;
                bniVar2 = bniVar;
                bnmVar3 = bnmVar;
            }
            cdkVarI = cavVarB.I();
            if (cdkVarI != null) {
                cdkVarI.c = new acpp(aomyVar, cmwVar3, z4, crdVar2, bniVar2, bnmVar3, amuVar3, ayyVar2, aonoVar, i, i2);
            }
        }
        i3 |= 48;
        cmwVar2 = cmwVar;
        i4 = i2 & 4;
        if (i4 != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (true != cavVarB.C(z)) {
                i5 = 128;
            } else {
                i5 = 256;
            }
            i3 |= i5;
        }
        if ((i & 3072) == 0) {
            i18 = 1024;
            if ((i2 & 8) == 0) {
                crdVarD = crdVar;
                if (cavVarB.B(crdVarD)) {
                    i18 = 2048;
                }
            } else {
                crdVarD = crdVar;
            }
            i3 |= i18;
        } else {
            crdVarD = crdVar;
        }
        if ((i & 24576) == 0) {
            i17 = 8192;
            if ((i2 & 16) == 0) {
                i17 = 16384;
            }
            i3 |= i17;
        }
        if ((196608 & i) == 0) {
            i16 = 65536;
            if ((i2 & 32) == 0) {
                bnmVar2 = bnmVar;
                if (cavVarB.B(bnmVar2)) {
                    i16 = 131072;
                }
            } else {
                bnmVar2 = bnmVar;
            }
            i3 |= i16;
        } else {
            bnmVar2 = bnmVar;
        }
        i6 = i2 & 64;
        if (i6 != 0) {
            if ((1572864 & i) == 0) {
                amuVar2 = amuVar;
                if (true != cavVarB.B(amuVar2)) {
                    i7 = 524288;
                } else {
                    i7 = 1048576;
                }
                i3 |= i7;
            }
            i8 = i2 & 128;
            if (i8 != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (true != cavVarB.B(ayyVar)) {
                    i9 = 4194304;
                } else {
                    i9 = 8388608;
                }
                i3 |= i9;
            }
            if ((i2 & 256) != 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (true != cavVarB.B(null)) {
                    i10 = 33554432;
                } else {
                    i10 = 67108864;
                }
                i3 |= i10;
            }
            if ((805306368 & i) == 0) {
                if (true != cavVarB.D(aonoVar)) {
                    i15 = 268435456;
                } else {
                    i15 = 536870912;
                }
                i3 |= i15;
            }
            if ((306783379 & i3) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (cavVarB.H(z3, i3 & 1)) {
                i11 = i2 & 32;
                i12 = i2 & 16;
                i13 = i2 & 8;
                ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
                if ((i & 1) != 0) {
                    if (i20 != 0) {
                        cmwVar2 = defpackage.cmw.c;
                    }
                    boolean z9 = (!z2) | z;
                    if (i13 != 0) {
                        i3 &= -7169;
                        defpackage.ayy ayyVar17 = acpl.a;
                        crdVarD = acpl.d(cavVarB);
                    }
                    if (i12 != 0) {
                        defpackage.ayy ayyVar18 = acpl.a;
                        bniVarA = acpl.a(0L, 0L, cavVarB, 15);
                        i3 &= -57345;
                    } else {
                        bniVarA = bniVar;
                    }
                    if (i11 != 0) {
                        defpackage.ayy ayyVar19 = acpl.a;
                        i3 &= -458753;
                        bnmVarG = acpl.g();
                    } else {
                        bnmVarG = bnmVar;
                    }
                    if (i6 == 0) {
                    }
                    if (i8 != 0) {
                        defpackage.ayy ayyVar110 = acpl.a;
                        ayyVar3 = acpl.a;
                    } else {
                        ayyVar3 = ayyVar;
                    }
                    defpackage.cmw cmwVar8 = cmwVar2;
                    bnmVar4 = bnmVarG;
                    cmwVar4 = cmwVar8;
                    ayyVar4 = ayyVar3;
                    crdVar3 = crdVarD;
                    amuVar4 = amuVar5;
                    i14 = i3;
                    z5 = z9;
                } else {
                    if (i20 != 0) {
                        cmwVar2 = defpackage.cmw.c;
                    }
                    boolean z10 = (!z2) | z;
                    if (i13 != 0) {
                        i3 &= -7169;
                        defpackage.ayy ayyVar111 = acpl.a;
                        crdVarD = acpl.d(cavVarB);
                    }
                    if (i12 != 0) {
                        defpackage.ayy ayyVar112 = acpl.a;
                        bniVarA = acpl.a(0L, 0L, cavVarB, 15);
                        i3 &= -57345;
                    } else {
                        bniVarA = bniVar;
                    }
                    if (i11 != 0) {
                        defpackage.ayy ayyVar113 = acpl.a;
                        i3 &= -458753;
                        bnmVarG = acpl.g();
                    } else {
                        bnmVarG = bnmVar;
                    }
                    if (i6 == 0) {
                    }
                    if (i8 != 0) {
                        defpackage.ayy ayyVar114 = acpl.a;
                        ayyVar3 = acpl.a;
                    } else {
                        ayyVar3 = ayyVar;
                    }
                    defpackage.cmw cmwVar9 = cmwVar2;
                    bnmVar4 = bnmVarG;
                    cmwVar4 = cmwVar9;
                    ayyVar4 = ayyVar3;
                    crdVar3 = crdVarD;
                    amuVar4 = amuVar5;
                    i14 = i3;
                    z5 = z10;
                }
                cavVarB.l();
                defpackage.den.ap(aomyVar, cmwVar4, z5, crdVar3, bniVarA, bnmVar4, amuVar4, ayyVar4, aonoVar, cavVarB, 2147483646 & i14);
                ayyVar2 = ayyVar4;
                amuVar3 = amuVar4;
                bnmVar3 = bnmVar4;
                bniVar2 = bniVarA;
                crdVar2 = crdVar3;
                z4 = z5;
                cmwVar3 = cmwVar4;
            } else {
                cavVarB.s();
                z4 = z;
                amuVar3 = amuVar;
                ayyVar2 = ayyVar;
                cmwVar3 = cmwVar2;
                crdVar2 = crdVarD;
                bniVar2 = bniVar;
                bnmVar3 = bnmVar;
            }
            cdkVarI = cavVarB.I();
            if (cdkVarI != null) {
                cdkVarI.c = new acpp(aomyVar, cmwVar3, z4, crdVar2, bniVar2, bnmVar3, amuVar3, ayyVar2, aonoVar, i, i2);
            }
        }
        i3 |= 1572864;
        amuVar2 = amuVar;
        i8 = i2 & 128;
        if (i8 != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            if (true != cavVarB.B(ayyVar)) {
                i9 = 4194304;
            } else {
                i9 = 8388608;
            }
            i3 |= i9;
        }
        if ((i2 & 256) != 0) {
            i3 |= 100663296;
        } else if ((i & 100663296) == 0) {
            if (true != cavVarB.B(null)) {
                i10 = 33554432;
            } else {
                i10 = 67108864;
            }
            i3 |= i10;
        }
        if ((805306368 & i) == 0) {
            if (true != cavVarB.D(aonoVar)) {
                i15 = 268435456;
            } else {
                i15 = 536870912;
            }
            i3 |= i15;
        }
        if ((306783379 & i3) != 306783378) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (cavVarB.H(z3, i3 & 1)) {
            i11 = i2 & 32;
            i12 = i2 & 16;
            i13 = i2 & 8;
            ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
            if ((i & 1) != 0) {
                if (i20 != 0) {
                    cmwVar2 = defpackage.cmw.c;
                }
                boolean z11 = (!z2) | z;
                if (i13 != 0) {
                    i3 &= -7169;
                    defpackage.ayy ayyVar115 = acpl.a;
                    crdVarD = acpl.d(cavVarB);
                }
                if (i12 != 0) {
                    defpackage.ayy ayyVar116 = acpl.a;
                    bniVarA = acpl.a(0L, 0L, cavVarB, 15);
                    i3 &= -57345;
                } else {
                    bniVarA = bniVar;
                }
                if (i11 != 0) {
                    defpackage.ayy ayyVar117 = acpl.a;
                    i3 &= -458753;
                    bnmVarG = acpl.g();
                } else {
                    bnmVarG = bnmVar;
                }
                if (i6 == 0) {
                }
                if (i8 != 0) {
                    defpackage.ayy ayyVar118 = acpl.a;
                    ayyVar3 = acpl.a;
                } else {
                    ayyVar3 = ayyVar;
                }
                defpackage.cmw cmwVar10 = cmwVar2;
                bnmVar4 = bnmVarG;
                cmwVar4 = cmwVar10;
                ayyVar4 = ayyVar3;
                crdVar3 = crdVarD;
                amuVar4 = amuVar5;
                i14 = i3;
                z5 = z11;
            } else {
                if (i20 != 0) {
                    cmwVar2 = defpackage.cmw.c;
                }
                boolean z12 = (!z2) | z;
                if (i13 != 0) {
                    i3 &= -7169;
                    defpackage.ayy ayyVar119 = acpl.a;
                    crdVarD = acpl.d(cavVarB);
                }
                if (i12 != 0) {
                    defpackage.ayy ayyVar1110 = acpl.a;
                    bniVarA = acpl.a(0L, 0L, cavVarB, 15);
                    i3 &= -57345;
                } else {
                    bniVarA = bniVar;
                }
                if (i11 != 0) {
                    defpackage.ayy ayyVar1111 = acpl.a;
                    i3 &= -458753;
                    bnmVarG = acpl.g();
                } else {
                    bnmVarG = bnmVar;
                }
                if (i6 == 0) {
                }
                if (i8 != 0) {
                    defpackage.ayy ayyVar1112 = acpl.a;
                    ayyVar3 = acpl.a;
                } else {
                    ayyVar3 = ayyVar;
                }
                defpackage.cmw cmwVar11 = cmwVar2;
                bnmVar4 = bnmVarG;
                cmwVar4 = cmwVar11;
                ayyVar4 = ayyVar3;
                crdVar3 = crdVarD;
                amuVar4 = amuVar5;
                i14 = i3;
                z5 = z12;
            }
            cavVarB.l();
            defpackage.den.ap(aomyVar, cmwVar4, z5, crdVar3, bniVarA, bnmVar4, amuVar4, ayyVar4, aonoVar, cavVarB, 2147483646 & i14);
            ayyVar2 = ayyVar4;
            amuVar3 = amuVar4;
            bnmVar3 = bnmVar4;
            bniVar2 = bniVarA;
            crdVar2 = crdVar3;
            z4 = z5;
            cmwVar3 = cmwVar4;
        } else {
            cavVarB.s();
            z4 = z;
            amuVar3 = amuVar;
            ayyVar2 = ayyVar;
            cmwVar3 = cmwVar2;
            crdVar2 = crdVarD;
            bniVar2 = bniVar;
            bnmVar3 = bnmVar;
        }
        cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new acpp(aomyVar, cmwVar3, z4, crdVar2, bniVar2, bnmVar3, amuVar3, ayyVar2, aonoVar, i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004c  */
    /* JADX WARN: Code duplicated, block: B:24:0x004e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:27:0x0054  */
    /* JADX WARN: Code duplicated, block: B:29:0x0058  */
    /* JADX WARN: Code duplicated, block: B:31:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0061  */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x006e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0076  */
    /* JADX WARN: Code duplicated, block: B:41:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0083  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    /* JADX WARN: Code duplicated, block: B:50:0x0091  */
    /* JADX WARN: Code duplicated, block: B:51:0x0094  */
    /* JADX WARN: Code duplicated, block: B:53:0x0098  */
    /* JADX WARN: Code duplicated, block: B:56:0x009f  */
    /* JADX WARN: Code duplicated, block: B:59:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:80:0x00fc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:84:0x0107  */
    /* JADX WARN: Code duplicated, block: B:86:0x0112  */
    /* JADX WARN: Code duplicated, block: B:89:0x0148  */
    /* JADX WARN: Code duplicated, block: B:92:0x0159  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    public static void al(defpackage.aomy aomyVar, defpackage.cmw cmwVar, boolean z, defpackage.crd crdVar, defpackage.bni bniVar, bnm bnmVar, defpackage.ayy ayyVar, defpackage.aono aonoVar, defpackage.cav cavVar, int i, int i2) {
        int i3;
        defpackage.cmw cmwVar2;
        int i4;
        boolean z2;
        int i5;
        defpackage.crd crdVarD;
        defpackage.bni bniVarB;
        int i6;
        boolean z3;
        defpackage.ayy ayyVar2;
        boolean z4;
        defpackage.cmw cmwVar3;
        defpackage.crd crdVar2;
        defpackage.bni bniVar2;
        bnm bnmVar2;
        defpackage.cdk cdkVarI;
        int i7;
        int i8;
        boolean z5;
        int i9;
        bnm bnmVar3;
        defpackage.cmw cmwVar4;
        int i10;
        int i11;
        int i12;
        defpackage.aooh.f(aomyVar, "onClick");
        defpackage.aooh.f(aonoVar, "content");
        int i13 = i & 6;
        defpackage.cav cavVarB = cavVar.b(97925604);
        if (i13 == 0) {
            i3 = (true != cavVarB.D(aomyVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i14 = i2 & 2;
        if (i14 == 0) {
            if ((i & 48) == 0) {
                cmwVar2 = cmwVar;
                i3 |= true != cavVarB.B(cmwVar2) ? 16 : 32;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (i4 != 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                if (true != cavVarB.C(z)) {
                    i5 = 128;
                } else {
                    i5 = 256;
                }
                i3 |= i5;
            }
            if ((i & 3072) == 0) {
                i12 = 1024;
                if ((i2 & 8) == 0) {
                    crdVarD = crdVar;
                    if (cavVarB.B(crdVarD)) {
                        i12 = 2048;
                    }
                } else {
                    crdVarD = crdVar;
                }
                i3 |= i12;
            } else {
                crdVarD = crdVar;
            }
            if ((i & 24576) == 0) {
                i11 = 8192;
                if ((i2 & 16) == 0) {
                    bniVarB = bniVar;
                    if (cavVarB.B(bniVarB)) {
                        i11 = 16384;
                    }
                } else {
                    bniVarB = bniVar;
                }
                i3 |= i11;
            } else {
                bniVarB = bniVar;
            }
            if ((196608 & i) == 0) {
                i3 |= 65536;
            }
            i6 = i3 | 114819072;
            if ((805306368 & i) == 0) {
                if (true != cavVarB.D(aonoVar)) {
                    i10 = 268435456;
                } else {
                    i10 = 536870912;
                }
                i6 |= i10;
            }
            if ((306783379 & i6) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (cavVarB.H(z3, i6 & 1)) {
                i7 = i2 & 16;
                i8 = i2 & 8;
                ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
                if ((i & 1) != 0 || cavVarB.E()) {
                    if (i14 != 0) {
                        cmwVar2 = defpackage.cmw.c;
                    }
                    boolean z6 = (!z2) | z;
                    if (i8 != 0) {
                        i6 &= -7169;
                        defpackage.ayy ayyVar3 = acpl.a;
                        crdVarD = acpl.d(cavVarB);
                    }
                    if (i7 != 0) {
                        defpackage.ayy ayyVar4 = acpl.a;
                        i6 &= -57345;
                        bniVarB = acpl.b(0L, cavVarB, 15);
                    }
                    defpackage.ayy ayyVar5 = acpl.a;
                    defpackage.ayy ayyVar6 = defpackage.bnj.a;
                    int i15 = i6 & (-458753);
                    z5 = z6;
                    i9 = i15;
                    defpackage.cmw cmwVar5 = cmwVar2;
                    bnmVar3 = new bnm();
                    cmwVar4 = cmwVar5;
                    ayyVar2 = acpl.a;
                } else {
                    cavVarB.s();
                    if (i8 != 0) {
                        i6 &= -7169;
                    }
                    if (i7 != 0) {
                        i6 &= -57345;
                    }
                    ayyVar2 = ayyVar;
                    i9 = i6 & (-458753);
                    z5 = z;
                    cmwVar4 = cmwVar2;
                    bnmVar3 = bnmVar;
                }
                defpackage.crd crdVar3 = crdVarD;
                defpackage.bni bniVar3 = bniVarB;
                cavVarB.l();
                ak(aomyVar, cmwVar4, z5, crdVar3, bniVar3, bnmVar3, null, ayyVar2, aonoVar, cavVarB, i9 & 2147024894, 0);
                bnmVar2 = bnmVar3;
                bniVar2 = bniVar3;
                crdVar2 = crdVar3;
                z4 = z5;
                cmwVar3 = cmwVar4;
            } else {
                cavVarB.s();
                ayyVar2 = ayyVar;
                z4 = z;
                cmwVar3 = cmwVar2;
                crdVar2 = crdVarD;
                bniVar2 = bniVarB;
                bnmVar2 = bnmVar;
            }
            cdkVarI = cavVarB.I();
            if (cdkVarI != null) {
                cdkVarI.c = new acpq(aomyVar, cmwVar3, z4, crdVar2, bniVar2, bnmVar2, ayyVar2, aonoVar, i, i2, 0);
            }
        }
        i3 |= 48;
        cmwVar2 = cmwVar;
        i4 = i2 & 4;
        if (i4 != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (true != cavVarB.C(z)) {
                i5 = 128;
            } else {
                i5 = 256;
            }
            i3 |= i5;
        }
        if ((i & 3072) == 0) {
            i12 = 1024;
            if ((i2 & 8) == 0) {
                crdVarD = crdVar;
                if (cavVarB.B(crdVarD)) {
                    i12 = 2048;
                }
            } else {
                crdVarD = crdVar;
            }
            i3 |= i12;
        } else {
            crdVarD = crdVar;
        }
        if ((i & 24576) == 0) {
            i11 = 8192;
            if ((i2 & 16) == 0) {
                bniVarB = bniVar;
                if (cavVarB.B(bniVarB)) {
                    i11 = 16384;
                }
            } else {
                bniVarB = bniVar;
            }
            i3 |= i11;
        } else {
            bniVarB = bniVar;
        }
        if ((196608 & i) == 0) {
            i3 |= 65536;
        }
        i6 = i3 | 114819072;
        if ((805306368 & i) == 0) {
            if (true != cavVarB.D(aonoVar)) {
                i10 = 268435456;
            } else {
                i10 = 536870912;
            }
            i6 |= i10;
        }
        if ((306783379 & i6) != 306783378) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (cavVarB.H(z3, i6 & 1)) {
            i7 = i2 & 16;
            i8 = i2 & 8;
            ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
            if ((i & 1) != 0) {
                if (i14 != 0) {
                    cmwVar2 = defpackage.cmw.c;
                }
                boolean z7 = (!z2) | z;
                if (i8 != 0) {
                    i6 &= -7169;
                    defpackage.ayy ayyVar7 = acpl.a;
                    crdVarD = acpl.d(cavVarB);
                }
                if (i7 != 0) {
                    defpackage.ayy ayyVar8 = acpl.a;
                    i6 &= -57345;
                    bniVarB = acpl.b(0L, cavVarB, 15);
                }
                defpackage.ayy ayyVar9 = acpl.a;
                defpackage.ayy ayyVar10 = defpackage.bnj.a;
                int i16 = i6 & (-458753);
                z5 = z7;
                i9 = i16;
                defpackage.cmw cmwVar6 = cmwVar2;
                bnmVar3 = new bnm();
                cmwVar4 = cmwVar6;
                ayyVar2 = acpl.a;
            } else {
                if (i14 != 0) {
                    cmwVar2 = defpackage.cmw.c;
                }
                boolean z8 = (!z2) | z;
                if (i8 != 0) {
                    i6 &= -7169;
                    defpackage.ayy ayyVar11 = acpl.a;
                    crdVarD = acpl.d(cavVarB);
                }
                if (i7 != 0) {
                    defpackage.ayy ayyVar12 = acpl.a;
                    i6 &= -57345;
                    bniVarB = acpl.b(0L, cavVarB, 15);
                }
                defpackage.ayy ayyVar13 = acpl.a;
                defpackage.ayy ayyVar14 = defpackage.bnj.a;
                int i17 = i6 & (-458753);
                z5 = z8;
                i9 = i17;
                defpackage.cmw cmwVar7 = cmwVar2;
                bnmVar3 = new bnm();
                cmwVar4 = cmwVar7;
                ayyVar2 = acpl.a;
            }
            defpackage.crd crdVar4 = crdVarD;
            defpackage.bni bniVar4 = bniVarB;
            cavVarB.l();
            ak(aomyVar, cmwVar4, z5, crdVar4, bniVar4, bnmVar3, null, ayyVar2, aonoVar, cavVarB, i9 & 2147024894, 0);
            bnmVar2 = bnmVar3;
            bniVar2 = bniVar4;
            crdVar2 = crdVar4;
            z4 = z5;
            cmwVar3 = cmwVar4;
        } else {
            cavVarB.s();
            ayyVar2 = ayyVar;
            z4 = z;
            cmwVar3 = cmwVar2;
            crdVar2 = crdVarD;
            bniVar2 = bniVarB;
            bnmVar2 = bnmVar;
        }
        cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new acpq(aomyVar, cmwVar3, z4, crdVar2, bniVar2, bnmVar2, ayyVar2, aonoVar, i, i2, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0148 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:108:0x014a  */
    /* JADX WARN: Code duplicated, block: B:109:0x014d  */
    /* JADX WARN: Code duplicated, block: B:112:0x0154  */
    /* JADX WARN: Code duplicated, block: B:114:0x015f  */
    /* JADX WARN: Code duplicated, block: B:116:0x016d  */
    /* JADX WARN: Code duplicated, block: B:117:0x0178  */
    /* JADX WARN: Code duplicated, block: B:119:0x0196  */
    /* JADX WARN: Code duplicated, block: B:122:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x004d  */
    /* JADX WARN: Code duplicated, block: B:24:0x004f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:27:0x0055  */
    /* JADX WARN: Code duplicated, block: B:29:0x0059  */
    /* JADX WARN: Code duplicated, block: B:31:0x005f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x007a  */
    /* JADX WARN: Code duplicated, block: B:43:0x007e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0084  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x0095  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00af  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:67:0x00be  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:79:0x00df  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:93:0x010b  */
    /* JADX WARN: Code duplicated, block: B:94:0x010e  */
    /* JADX WARN: Code duplicated, block: B:97:0x0117  */
    public static void am(defpackage.aomy aomyVar, defpackage.cmw cmwVar, boolean z, defpackage.crd crdVar, defpackage.bni bniVar, defpackage.ayy ayyVar, defpackage.aono aonoVar, defpackage.cav cavVar, int i, int i2) {
        int i3;
        defpackage.cmw cmwVar2;
        int i4;
        boolean z2;
        int i5;
        defpackage.crd crdVarD;
        defpackage.bni bniVarF;
        int i6;
        int i7;
        int i8;
        defpackage.ayy ayyVar2;
        int i9;
        int i10;
        boolean z3;
        boolean z4;
        defpackage.cmw cmwVar3;
        defpackage.crd crdVar2;
        defpackage.ayy ayyVar3;
        defpackage.bni bniVar2;
        defpackage.cdk cdkVarI;
        int i11;
        int i12;
        defpackage.cmw cmwVar4;
        boolean z5;
        defpackage.cmw cmwVar5;
        int i13;
        defpackage.crd crdVar3;
        defpackage.ayy ayyVar4;
        boolean z6;
        defpackage.bni bniVar3;
        int i14;
        int i15;
        int i16;
        defpackage.aooh.f(aomyVar, "onClick");
        defpackage.aooh.f(aonoVar, "content");
        int i17 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1702119311);
        if (i17 == 0) {
            i3 = (true != cavVarB.D(aomyVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i18 = i2 & 2;
        if (i18 == 0) {
            if ((i & 48) == 0) {
                cmwVar2 = cmwVar;
                i3 |= true != cavVarB.B(cmwVar2) ? 16 : 32;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (i4 != 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                if (true != cavVarB.C(z)) {
                    i5 = 128;
                } else {
                    i5 = 256;
                }
                i3 |= i5;
            }
            if ((i & 3072) == 0) {
                i16 = 1024;
                if ((i2 & 8) == 0) {
                    crdVarD = crdVar;
                    if (cavVarB.B(crdVarD)) {
                        i16 = 2048;
                    }
                } else {
                    crdVarD = crdVar;
                }
                i3 |= i16;
            } else {
                crdVarD = crdVar;
            }
            if ((i & 24576) == 0) {
                i15 = 8192;
                if ((i2 & 16) == 0) {
                    bniVarF = bniVar;
                    if (cavVarB.B(bniVarF)) {
                        i15 = 16384;
                    }
                } else {
                    bniVarF = bniVar;
                }
                i3 |= i15;
            } else {
                bniVarF = bniVar;
            }
            if ((i2 & 32) != 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                if (true != cavVarB.B(null)) {
                    i6 = 65536;
                } else {
                    i6 = 131072;
                }
                i3 |= i6;
            }
            if ((i2 & 64) != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (true != cavVarB.B(null)) {
                    i7 = 524288;
                } else {
                    i7 = 1048576;
                }
                i3 |= i7;
            }
            i8 = i2 & 128;
            if (i8 != 0) {
                i3 |= 12582912;
                ayyVar2 = ayyVar;
            } else {
                ayyVar2 = ayyVar;
                if ((i & 12582912) == 0) {
                    if (true != cavVarB.B(ayyVar2)) {
                        i9 = 4194304;
                    } else {
                        i9 = 8388608;
                    }
                    i3 |= i9;
                }
            }
            i10 = i3 | 100663296;
            if ((805306368 & i) == 0) {
                if (true != cavVarB.D(aonoVar)) {
                    i14 = 268435456;
                } else {
                    i14 = 536870912;
                }
                i10 |= i14;
            }
            if ((306783379 & i10) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (cavVarB.H(z3, i10 & 1)) {
                i11 = i2 & 16;
                i12 = i2 & 8;
                ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
                if ((i & 1) != 0 || cavVarB.E()) {
                    if (i18 != 0) {
                        cmwVar4 = defpackage.cmw.c;
                    } else {
                        cmwVar4 = cmwVar2;
                    }
                    z5 = (!z2) | z;
                    if (i12 != 0) {
                        i10 &= -7169;
                        defpackage.ayy ayyVar5 = acpl.a;
                        crdVarD = acpl.d(cavVarB);
                    }
                    if (i11 != 0) {
                        defpackage.ayy ayyVar6 = acpl.a;
                        i10 &= -57345;
                        bniVarF = acpl.f(0L, cavVarB, 15);
                    }
                    if (i8 != 0) {
                        defpackage.ayy ayyVar7 = acpl.a;
                        ayyVar4 = acpl.b;
                        crdVar3 = crdVarD;
                        bniVar3 = bniVarF;
                        cmwVar5 = cmwVar4;
                        i13 = i10;
                        z6 = z5;
                    } else {
                        cmwVar5 = cmwVar4;
                        i13 = i10;
                        crdVar3 = crdVarD;
                        ayyVar4 = ayyVar2;
                        z6 = z5;
                        bniVar3 = bniVarF;
                    }
                } else {
                    cavVarB.s();
                    if (i12 != 0) {
                        i10 &= -7169;
                    }
                    if (i11 != 0) {
                        i10 &= -57345;
                    }
                    i13 = i10;
                    cmwVar5 = cmwVar2;
                    crdVar3 = crdVarD;
                    ayyVar4 = ayyVar2;
                    bniVar3 = bniVarF;
                    z6 = z;
                }
                cavVarB.l();
                ak(aomyVar, cmwVar5, z6, crdVar3, bniVar3, null, null, ayyVar4, aonoVar, cavVarB, i13 & 2147483646, 0);
                bniVar2 = bniVar3;
                ayyVar3 = ayyVar4;
                crdVar2 = crdVar3;
                z4 = z6;
                cmwVar3 = cmwVar5;
            } else {
                cavVarB.s();
                z4 = z;
                cmwVar3 = cmwVar2;
                crdVar2 = crdVarD;
                ayyVar3 = ayyVar2;
                bniVar2 = bniVarF;
            }
            cdkVarI = cavVarB.I();
            if (cdkVarI != null) {
                cdkVarI.c = new acpo(aomyVar, cmwVar3, z4, crdVar2, bniVar2, ayyVar3, aonoVar, i, i2, 0);
            }
        }
        i3 |= 48;
        cmwVar2 = cmwVar;
        i4 = i2 & 4;
        if (i4 != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (true != cavVarB.C(z)) {
                i5 = 128;
            } else {
                i5 = 256;
            }
            i3 |= i5;
        }
        if ((i & 3072) == 0) {
            i16 = 1024;
            if ((i2 & 8) == 0) {
                crdVarD = crdVar;
                if (cavVarB.B(crdVarD)) {
                    i16 = 2048;
                }
            } else {
                crdVarD = crdVar;
            }
            i3 |= i16;
        } else {
            crdVarD = crdVar;
        }
        if ((i & 24576) == 0) {
            i15 = 8192;
            if ((i2 & 16) == 0) {
                bniVarF = bniVar;
                if (cavVarB.B(bniVarF)) {
                    i15 = 16384;
                }
            } else {
                bniVarF = bniVar;
            }
            i3 |= i15;
        } else {
            bniVarF = bniVar;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            if (true != cavVarB.B(null)) {
                i6 = 65536;
            } else {
                i6 = 131072;
            }
            i3 |= i6;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            if (true != cavVarB.B(null)) {
                i7 = 524288;
            } else {
                i7 = 1048576;
            }
            i3 |= i7;
        }
        i8 = i2 & 128;
        if (i8 != 0) {
            i3 |= 12582912;
            ayyVar2 = ayyVar;
        } else {
            ayyVar2 = ayyVar;
            if ((i & 12582912) == 0) {
                if (true != cavVarB.B(ayyVar2)) {
                    i9 = 4194304;
                } else {
                    i9 = 8388608;
                }
                i3 |= i9;
            }
        }
        i10 = i3 | 100663296;
        if ((805306368 & i) == 0) {
            if (true != cavVarB.D(aonoVar)) {
                i14 = 268435456;
            } else {
                i14 = 536870912;
            }
            i10 |= i14;
        }
        if ((306783379 & i10) != 306783378) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (cavVarB.H(z3, i10 & 1)) {
            i11 = i2 & 16;
            i12 = i2 & 8;
            ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
            if ((i & 1) != 0) {
                if (i18 != 0) {
                    cmwVar4 = defpackage.cmw.c;
                } else {
                    cmwVar4 = cmwVar2;
                }
                z5 = (!z2) | z;
                if (i12 != 0) {
                    i10 &= -7169;
                    defpackage.ayy ayyVar8 = acpl.a;
                    crdVarD = acpl.d(cavVarB);
                }
                if (i11 != 0) {
                    defpackage.ayy ayyVar9 = acpl.a;
                    i10 &= -57345;
                    bniVarF = acpl.f(0L, cavVarB, 15);
                }
                if (i8 != 0) {
                    defpackage.ayy ayyVar10 = acpl.a;
                    ayyVar4 = acpl.b;
                    crdVar3 = crdVarD;
                    bniVar3 = bniVarF;
                    cmwVar5 = cmwVar4;
                    i13 = i10;
                    z6 = z5;
                } else {
                    cmwVar5 = cmwVar4;
                    i13 = i10;
                    crdVar3 = crdVarD;
                    ayyVar4 = ayyVar2;
                    z6 = z5;
                    bniVar3 = bniVarF;
                }
            } else {
                if (i18 != 0) {
                    cmwVar4 = defpackage.cmw.c;
                } else {
                    cmwVar4 = cmwVar2;
                }
                z5 = (!z2) | z;
                if (i12 != 0) {
                    i10 &= -7169;
                    defpackage.ayy ayyVar11 = acpl.a;
                    crdVarD = acpl.d(cavVarB);
                }
                if (i11 != 0) {
                    defpackage.ayy ayyVar12 = acpl.a;
                    i10 &= -57345;
                    bniVarF = acpl.f(0L, cavVarB, 15);
                }
                if (i8 != 0) {
                    defpackage.ayy ayyVar13 = acpl.a;
                    ayyVar4 = acpl.b;
                    crdVar3 = crdVarD;
                    bniVar3 = bniVarF;
                    cmwVar5 = cmwVar4;
                    i13 = i10;
                    z6 = z5;
                } else {
                    cmwVar5 = cmwVar4;
                    i13 = i10;
                    crdVar3 = crdVarD;
                    ayyVar4 = ayyVar2;
                    z6 = z5;
                    bniVar3 = bniVarF;
                }
            }
            cavVarB.l();
            ak(aomyVar, cmwVar5, z6, crdVar3, bniVar3, null, null, ayyVar4, aonoVar, cavVarB, i13 & 2147483646, 0);
            bniVar2 = bniVar3;
            ayyVar3 = ayyVar4;
            crdVar2 = crdVar3;
            z4 = z6;
            cmwVar3 = cmwVar5;
        } else {
            cavVarB.s();
            z4 = z;
            cmwVar3 = cmwVar2;
            crdVar2 = crdVarD;
            ayyVar3 = ayyVar2;
            bniVar2 = bniVarF;
        }
        cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new acpo(aomyVar, cmwVar3, z4, crdVar2, bniVar2, ayyVar3, aonoVar, i, i2, 0);
        }
    }

    public static void an(defpackage.aomy aomyVar, defpackage.cmw cmwVar, boolean z, defpackage.crd crdVar, defpackage.bni bniVar, defpackage.amu amuVar, defpackage.ayy ayyVar, defpackage.aono aonoVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.cav cavVar2;
        boolean z2;
        defpackage.amu amuVar2;
        defpackage.amu amuVarBl;
        boolean z3;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-229789338);
        if (i3 == 0) {
            i2 = (true != cavVarB.D(aomyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        int i4 = i2 | 384;
        if ((i & 3072) == 0) {
            i4 |= true != cavVarB.B(crdVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i4 |= true != cavVarB.B(bniVar) ? 8192 : 16384;
        }
        int i5 = 196608 | i4;
        if ((1572864 & i) == 0) {
            i5 = i4 | 720896;
        }
        if ((12582912 & i) == 0) {
            i5 |= true != cavVarB.B(ayyVar) ? 4194304 : 8388608;
        }
        int i6 = i5 | 100663296;
        if ((805306368 & i) == 0) {
            i6 |= true != cavVarB.D(aonoVar) ? 268435456 : 536870912;
        }
        if (cavVarB.H((306783379 & i6) != 306783378, i6 & 1)) {
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            cbtVar.Z(-127, null, 0, null);
            if ((i & 1) == 0 || cavVarB.E()) {
                defpackage.ayy ayyVar2 = acpl.a;
                cavVarB.u(-649899422);
                long jT = defpackage.abrz.t(24, cavVarB);
                cbtVar.W(false);
                amuVarBl = defpackage.den.bl(1.0f, jT);
                z3 = true;
            } else {
                cavVarB.s();
                z3 = z;
                amuVarBl = amuVar;
            }
            cavVarB.l();
            cavVar2 = cavVarB;
            ak(aomyVar, cmwVar, z3, crdVar, bniVar, null, amuVarBl, ayyVar, aonoVar, cavVar2, i6 & 2143813630, 0);
            z2 = z3;
            amuVar2 = amuVarBl;
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
            z2 = z;
            amuVar2 = amuVar;
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new lpi(aomyVar, cmwVar, z2, crdVar, bniVar, amuVar2, ayyVar, aonoVar, i, 2);
        }
    }

    public static void ao(defpackage.aono aonoVar, defpackage.cmw cmwVar, float f, defpackage.awa awaVar, defpackage.cmn cmnVar, defpackage.aonj aonjVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.aonj aonjVar2;
        defpackage.cav cavVar2;
        defpackage.cmw cmwVar2;
        defpackage.awa awaVar2;
        float f2;
        defpackage.aooh.f(aonjVar, "content");
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1224819777);
        if (i3 == 0) {
            i2 = (true != cavVarB.D(aonoVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 432;
        if ((i & 3072) == 0) {
            i4 |= true != cavVarB.B(awaVar) ? 1024 : 2048;
        }
        int i5 = i4 | 24576;
        if ((196608 & i) == 0) {
            i5 |= true != cavVarB.D(aonjVar) ? 65536 : 131072;
        }
        if (cavVarB.H((74899 & i5) != 74898, i5 & 1)) {
            defpackage.cmt cmtVar = defpackage.cmw.c;
            int i6 = acpm.a;
            defpackage.cmn cmnVar2 = defpackage.cmh.m;
            cavVar2 = cavVarB;
            defpackage.rd.t(aonoVar, cmtVar, awaVar, cmnVar2, aonjVar, cavVar2, i5 & 524286);
            aonjVar2 = aonjVar;
            cmwVar2 = cmtVar;
            awaVar2 = awaVar;
            f2 = 0.15f;
            cmnVar = cmnVar2;
        } else {
            aonjVar2 = aonjVar;
            cavVar2 = cavVarB;
            cavVar2.s();
            cmwVar2 = cmwVar;
            awaVar2 = awaVar;
            f2 = f;
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new acpn(aonoVar, cmwVar2, f2, awaVar2, cmnVar, aonjVar2, i);
        }
    }

    public static void ap(defpackage.aomy aomyVar, defpackage.aonn aonnVar, defpackage.cmw cmwVar, defpackage.aonn aonnVar2, defpackage.aonn aonnVar3, defpackage.aonn aonnVar4, defpackage.aonn aonnVar5, defpackage.crd crdVar, long j, float f, long j2, long j3, long j4, drh drhVar, defpackage.cav cavVar, int i, int i2) {
        int i3;
        defpackage.cmw cmwVar2;
        int i4;
        defpackage.cav cavVar2;
        defpackage.crd crdVar2;
        long j5;
        float f2;
        long j6;
        long j7;
        drh drhVar2;
        defpackage.crd crdVarA;
        long jT;
        long j8;
        long j9;
        float f3;
        drh drhVar3;
        defpackage.dkz dkzVar;
        defpackage.aooh.f(aonnVar, "confirmButton");
        int i5 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1793682263);
        if (i5 == 0) {
            i3 = (true != cavVarB.D(aomyVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != cavVarB.D(aonnVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            cmwVar2 = cmwVar;
            i3 |= true != cavVarB.B(cmwVar2) ? 128 : 256;
        } else {
            cmwVar2 = cmwVar;
        }
        if ((i & 3072) == 0) {
            i3 |= true != cavVarB.D(aonnVar2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != cavVarB.D(aonnVar3) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i3 |= true != cavVarB.D(aonnVar4) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != cavVarB.D(aonnVar5) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i3 |= 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= 33554432;
        }
        if ((i2 & 6) == 0) {
            i4 = (true != cavVarB.A(j2) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= 128;
        }
        int i6 = i3 | 805306368;
        int i7 = i4 | 3072;
        if (cavVarB.H(((306783379 & i6) == 306783378 && (i7 & 1171) == 1170) ? false : true, i6 & 1)) {
            int i8 = i7 & (-1009);
            int i9 = i6 >> 21;
            ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
            if ((i & 1) == 0 || cavVarB.E()) {
                crdVarA = defpackage.acqn.a(1, cavVarB);
                long jT2 = defpackage.abrz.t(37, cavVarB);
                long jT3 = defpackage.abrz.t(17, cavVarB);
                jT = defpackage.abrz.t(18, cavVarB);
                j8 = jT2;
                j9 = jT3;
                f3 = 6.0f;
                drhVar3 = new drh((byte[]) null);
            } else {
                cavVarB.s();
                crdVarA = crdVar;
                j8 = j;
                f3 = f;
                j9 = j3;
                jT = j4;
                drhVar3 = drhVar;
            }
            cavVarB.l();
            defpackage.dkz dkzVar2 = (defpackage.dkz) cavVarB.e(defpackage.bvt.a);
            defpackage.bwo bwoVarAn = defpackage.den.an(cavVarB);
            defpackage.aooh.f(bwoVarAn, "$this$fromToken");
            if (defpackage.a.x(9, 0)) {
                dkzVar = bwoVarAn.j;
            } else if (defpackage.a.x(9, 1)) {
                dkzVar = bwoVarAn.k;
            } else if (defpackage.a.x(9, 2)) {
                dkzVar = bwoVarAn.l;
            } else if (defpackage.a.x(9, 3)) {
                dkzVar = bwoVarAn.a;
            } else if (defpackage.a.x(9, 4)) {
                dkzVar = bwoVarAn.b;
            } else if (defpackage.a.x(9, 5)) {
                dkzVar = bwoVarAn.c;
            } else if (defpackage.a.x(9, 6)) {
                dkzVar = bwoVarAn.d;
            } else if (defpackage.a.x(9, 7)) {
                dkzVar = bwoVarAn.e;
            } else if (defpackage.a.x(9, 8)) {
                dkzVar = bwoVarAn.f;
            } else if (defpackage.a.x(9, 9)) {
                dkzVar = bwoVarAn.m;
            } else if (defpackage.a.x(9, 10)) {
                dkzVar = bwoVarAn.n;
            } else if (defpackage.a.x(9, 11)) {
                dkzVar = bwoVarAn.o;
            } else if (defpackage.a.x(9, 12)) {
                dkzVar = bwoVarAn.g;
            } else if (defpackage.a.x(9, 13)) {
                dkzVar = bwoVarAn.h;
            } else if (defpackage.a.x(9, 14)) {
                dkzVar = bwoVarAn.i;
            } else if (defpackage.a.x(9, 15)) {
                dkzVar = bwoVarAn.y;
            } else if (defpackage.a.x(9, 16)) {
                dkzVar = bwoVarAn.z;
            } else if (defpackage.a.x(9, 17)) {
                dkzVar = bwoVarAn.A;
            } else if (defpackage.a.x(9, 18)) {
                dkzVar = bwoVarAn.p;
            } else if (defpackage.a.x(9, 19)) {
                dkzVar = bwoVarAn.q;
            } else if (defpackage.a.x(9, 20)) {
                dkzVar = bwoVarAn.r;
            } else if (defpackage.a.x(9, 21)) {
                dkzVar = bwoVarAn.s;
            } else if (defpackage.a.x(9, 22)) {
                dkzVar = bwoVarAn.t;
            } else if (defpackage.a.x(9, 23)) {
                dkzVar = bwoVarAn.u;
            } else if (defpackage.a.x(9, 24)) {
                dkzVar = bwoVarAn.B;
            } else if (defpackage.a.x(9, 25)) {
                dkzVar = bwoVarAn.C;
            } else if (defpackage.a.x(9, 26)) {
                dkzVar = bwoVarAn.D;
            } else if (defpackage.a.x(9, 27)) {
                dkzVar = bwoVarAn.v;
            } else if (defpackage.a.x(9, 28)) {
                dkzVar = bwoVarAn.w;
            } else {
                dkzVar = defpackage.a.x(9, 29) ? bwoVarAn.x : bwoVarAn.j;
            }
            defpackage.dkz dkzVarL = dkzVar2.l(dkzVar);
            int i10 = (i9 & 896) | (i7 & 7168);
            cavVar2 = cavVarB;
            defpackage.crd crdVar3 = crdVarA;
            long j10 = jT;
            defpackage.cmw cmwVar3 = cmwVar2;
            defpackage.pf.i(aomyVar, defpackage.cfo.j(-1626889375, new zjn(dkzVarL, aonnVar, 15, (byte[]) null), cavVarB), cmwVar3, defpackage.cfo.j(569333919, new zjn(dkzVarL, aonnVar2, 16, (byte[]) null), cavVarB), aonnVar3, aonnVar4, aonnVar5, crdVar3, j8, j2, j9, j10, f3, drhVar3, cavVar2, (i6 & 14) | 3120 | (i6 & 896) | (57344 & i6) | (i6 & 458752) | (i6 & 3670016) | ((i8 << 27) & 1879048192), i10);
            crdVar2 = crdVar3;
            j5 = j8;
            j6 = j9;
            j7 = j10;
            f2 = f3;
            drhVar2 = drhVar3;
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
            crdVar2 = crdVar;
            j5 = j;
            f2 = f;
            j6 = j3;
            j7 = j4;
            drhVar2 = drhVar;
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new bmn(aomyVar, aonnVar, cmwVar, aonnVar2, aonnVar3, aonnVar4, aonnVar5, crdVar2, j5, f2, j2, j6, j7, drhVar2, i, i2, 2);
        }
    }

    public static int aq(int i, android.content.Context context) {
        return new defpackage.afsr(context).a(defpackage.agab.Y(context, 2130969105, 0), context.getResources().getDimension(i));
    }

    public static defpackage.acmc ar(java.lang.String str) {
        defpackage.apdi apdiVar = acot.a;
        defpackage.akzx akzxVarM = acos.a.m();
        akzxVarM.u();
        acos acosVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        acosVar.b |= 1;
        acosVar.c = str;
        akzxVarM.u();
        acos acosVar2 = akzxVarM.b;
        acosVar2.b |= 2;
        acosVar2.d = true;
        return new defpackage.acmc(apdiVar, akzxVarM.r());
    }

    public static void as(java.lang.RuntimeException runtimeException) {
        ((defpackage.aiob) ((defpackage.aiob) ((defpackage.aiob) acop.a.c()).k(runtimeException)).l("com/google/android/libraries/logging/ve/handlers/result/flogger/FloggerResultDaggerModule", "provideErrorHandler", 18, "FloggerResultDaggerModule.java")).t();
    }

    public static defpackage.aiwd at(defpackage.acni acniVar, boolean z) {
        java.util.List listB = acniVar.b();
        for (int i = !z ? 1 : 0; i < listB.size(); i++) {
            defpackage.acmi acmiVar = (defpackage.acmi) listB.get(i);
            defpackage.aiwc aiwcVar = acmiVar.d;
            if (aiwcVar == null) {
                aiwcVar = defpackage.aiwc.a;
            }
            if ((aiwcVar.b & 2048) != 0) {
                defpackage.aiwc aiwcVar2 = acmiVar.d;
                if (aiwcVar2 == null) {
                    aiwcVar2 = defpackage.aiwc.a;
                }
                defpackage.aiwd aiwdVar = aiwcVar2.e;
                return aiwdVar == null ? defpackage.aiwd.a : aiwdVar;
            }
        }
        return null;
    }

    public static void au(int i, boolean z, defpackage.akzz[] akzzVarArr, defpackage.acnk acnkVar, java.util.Map map, defpackage.akzx akzxVar, defpackage.akzx akzxVar2) {
        defpackage.akzz akzzVar = akzzVarArr[i];
        defpackage.apdi apdiVar = aivi.a;
        if (akzzVar.bU(apdiVar)) {
            z = true;
        } else if (z) {
            aivy aivyVar = akzzVar.b;
            akzzVar.bV(apdiVar, java.lang.Long.valueOf((((long) aivyVar.c) << 32) | (((long) aivyVar.d) & 4294967295L)));
        }
        boolean z2 = z;
        java.util.Iterator it = j$.util.DesugarCollections.unmodifiableList(akzzVar.b.e).iterator();
        while (it.hasNext()) {
            au(((java.lang.Integer) it.next()).intValue(), z2, akzzVarArr, acnkVar, map, akzxVar, akzxVar2);
        }
    }

    public static void av(defpackage.aiwd aiwdVar, acnj acnjVar, defpackage.acnk acnkVar, defpackage.akzx akzxVar) {
        if (acnkVar.b.size() == 1) {
            akzxVar.u();
            aiva aivaVar = akzxVar.b;
            aiva aivaVar2 = aiva.a;
            j$.util.Objects.requireNonNull(aiwdVar);
            aivaVar.e = aiwdVar;
            aivaVar.b |= 2;
            return;
        }
        defpackage.aiwc aiwcVar = defpackage.abrz.e(acnjVar).d;
        if (aiwcVar == null) {
            aiwcVar = defpackage.aiwc.a;
        }
        defpackage.aiwd aiwdVar2 = aiwcVar.e;
        if (aiwdVar2 == null) {
            aiwdVar2 = defpackage.aiwd.a;
        }
        akzxVar.u();
        aiva aivaVar3 = akzxVar.b;
        aiva aivaVar4 = aiva.a;
        j$.util.Objects.requireNonNull(aiwdVar2);
        aivaVar3.e = aiwdVar2;
        aivaVar3.b |= 2;
    }

    public static void aw(defpackage.akzz akzzVar, defpackage.akzz[] akzzVarArr) {
        if (akzzVarArr != null) {
            int iAM = defpackage.a.aM(akzzVar.b.d);
            if (iAM == 0) {
                iAM = 1;
            }
            defpackage.akzx akzxVarM = aivc.a.m();
            for (int i = iAM != 4 ? 0 : 1; i < akzzVarArr.length; i++) {
                aivy aivyVarR = akzzVarArr[i].r();
                akzxVarM.u();
                aivc aivcVar = akzxVarM.b;
                j$.util.Objects.requireNonNull(aivyVarR);
                defpackage.alat alatVar = aivcVar.b;
                if (!alatVar.c()) {
                    aivcVar.b = defpackage.alad.J(alatVar);
                }
                aivcVar.b.add(aivyVarR);
            }
            akzzVar.bV(aivd.a, akzxVarM.r());
        }
    }

    public static defpackage.ajcq ax() {
        return defpackage.aiql.z(akzo.a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0045  */
    public static void ay(acmd acmdVar, java.util.List list) {
        boolean z;
        java.lang.Object obj = acmdVar;
        while (obj != null) {
            acmd acmdVar2 = (acmd) obj;
            defpackage.acmi acmiVarA = acmdVar2.a();
            if (acmiVarA != null) {
                defpackage.aiwc aiwcVar = acmiVarA.d;
                if (aiwcVar == null) {
                    aiwcVar = defpackage.aiwc.a;
                }
                defpackage.ahvr.bZ((aiwcVar.b & 8) != 0, "Instrumented view has no VE ID.");
                list.add(acmiVarA);
            }
            java.lang.Object objC = acmdVar2.a.c();
            if (objC == null) {
                if (!acmdVar2.a.m()) {
                    defpackage.apdi apdiVar = acot.a;
                    acmiVarA.c(apdiVar);
                    z = acmiVarA.n.l((defpackage.alac) apdiVar.a);
                }
                defpackage.ahvr.cc(z, "Activity's content root (android.R.id.content) must be annotated with a VE. CVE root was: %s", obj);
                return;
            }
            obj = objC;
        }
    }

    public static void az(java.lang.String str, defpackage.cmw cmwVar, boolean z, defpackage.aonn aonnVar, defpackage.cav cavVar, int i, int i2) {
        int i3;
        defpackage.aonn aonnVar2;
        defpackage.cmw cmwVar2;
        boolean z2;
        defpackage.aooh.f(aonnVar, "content");
        int i4 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1980475390);
        if (i4 == 0) {
            i3 = (true != cavVarB.B(str) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        int i6 = i2 & 4;
        boolean z3 = i6 == 0;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= true != cavVarB.C(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != cavVarB.D(aonnVar) ? 1024 : 2048;
        }
        if (cavVarB.H((i3 & 1171) != 1170, i3 & 1)) {
            if (i5 != 0) {
                cmwVar = defpackage.cmw.c;
            }
            cmwVar2 = cmwVar;
            z2 = z3 & z;
            aonnVar2 = aonnVar;
            aA(new acjl(str), cmwVar2, z2, aonnVar2, cavVarB, i3 & 8176);
        } else {
            aonnVar2 = aonnVar;
            cavVarB.s();
            cmwVar2 = cmwVar;
            z2 = z;
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abdz(str, cmwVar2, z2, aonnVar2, i, i2, 5);
        }
    }

    private static java.lang.ClassLoader c() {
        java.lang.ClassLoader classLoader = defpackage.aaoo.class.getClassLoader();
        defpackage.aais.as(classLoader);
        return classLoader;
    }

    public static android.os.Parcelable d(android.os.Bundle bundle, java.lang.String str) {
        java.lang.ClassLoader classLoaderC = c();
        bundle.setClassLoader(classLoaderC);
        android.os.Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(classLoaderC);
        return bundle2.getParcelable(str);
    }

    public static void e(android.os.Bundle bundle, android.os.Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return;
        }
        android.os.Parcelable parcelableD = d(bundle, "MapOptions");
        if (parcelableD != null) {
            f(bundle2, "MapOptions", parcelableD);
        }
        android.os.Parcelable parcelableD2 = d(bundle, "StreetViewPanoramaOptions");
        if (parcelableD2 != null) {
            f(bundle2, "StreetViewPanoramaOptions", parcelableD2);
        }
        android.os.Parcelable parcelableD3 = d(bundle, "camera");
        if (parcelableD3 != null) {
            f(bundle2, "camera", parcelableD3);
        }
        if (bundle.containsKey("position")) {
            bundle2.putString("position", bundle.getString("position"));
        }
        if (bundle.containsKey("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT")) {
            bundle2.putBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", bundle.getBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", false));
        }
    }

    public static void f(android.os.Bundle bundle, java.lang.String str, android.os.Parcelable parcelable) {
        java.lang.ClassLoader classLoaderC = c();
        bundle.setClassLoader(classLoaderC);
        android.os.Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            bundle2 = new android.os.Bundle();
        }
        bundle2.setClassLoader(classLoaderC);
        bundle2.putParcelable(str, parcelable);
        bundle.putBundle("map_state", bundle2);
    }

    public static byte g(java.lang.Boolean bool) {
        if (bool != null) {
            return !bool.booleanValue() ? (byte) 0 : (byte) 1;
        }
        return (byte) -1;
    }

    public static java.lang.Boolean h(byte b2) {
        if (b2 == 0) {
            return java.lang.Boolean.FALSE;
        }
        if (b2 != 1) {
            return null;
        }
        return java.lang.Boolean.TRUE;
    }

    public static java.lang.String i(int i) {
        if (i == 100) {
            return "HIGH_ACCURACY";
        }
        if (i == 102) {
            return "BALANCED_POWER_ACCURACY";
        }
        if (i == 104) {
            return "LOW_POWER";
        }
        if (i == 105) {
            return "PASSIVE";
        }
        throw new java.lang.IllegalArgumentException();
    }

    public static java.lang.String j(java.io.File file, java.lang.String str) {
        return new java.io.File(file, str).getPath();
    }

    public static java.lang.String k(android.app.Activity activity) {
        android.view.ViewGroup viewGroup;
        java.lang.String string = activity.getTitle().toString();
        int identifier = activity.getResources().getIdentifier("action_bar", "id", activity.getPackageName());
        if (identifier == 0 || (viewGroup = (android.view.ViewGroup) activity.findViewById(identifier)) == null) {
            return string;
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            android.view.View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof android.widget.TextView) {
                return ((android.widget.TextView) childAt).getText().toString();
            }
        }
        return string;
    }

    public static android.os.Bundle l(java.util.List list) {
        if (list == null) {
            return null;
        }
        int size = list.size();
        android.os.Bundle bundle = new android.os.Bundle(size);
        for (int i = 0; i < size; i++) {
            android.util.Pair pair = (android.util.Pair) list.get(i);
            bundle.putString((java.lang.String) pair.first, (java.lang.String) pair.second);
        }
        return bundle;
    }

    @java.lang.Deprecated
    public static java.lang.String m() {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        long jAbs = java.lang.Math.abs(new java.security.SecureRandom().nextLong());
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(jCurrentTimeMillis);
        sb.append('-');
        sb.append(jAbs);
        return sb.toString();
    }

    public static void n(android.os.Bundle bundle) {
        if (!((java.lang.Boolean) aamd.c.a()).booleanValue() || bundle == null) {
            return;
        }
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        int iDataSize = parcelObtain.dataSize();
        parcelObtain.recycle();
        aayx aayxVar = aamd.b;
        if (iDataSize > ((java.lang.Integer) aayxVar.a()).intValue()) {
            throw new java.lang.IllegalStateException("Max allowed bundle size of " + aayxVar.a().toString() + " exceeded, you are passing in a bundle of " + iDataSize + " size.");
        }
    }

    public static void o(com.google.android.gms.feedback.FeedbackOptions feedbackOptions) {
        if (!((java.lang.Boolean) aamd.c.a()).booleanValue() || feedbackOptions == null) {
            return;
        }
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        aalv.a(feedbackOptions, parcelObtain, 0);
        int iDataSize = parcelObtain.dataSize();
        parcelObtain.recycle();
        aayx aayxVar = aamd.b;
        if (iDataSize > ((java.lang.Integer) aayxVar.a()).intValue()) {
            throw new java.lang.IllegalStateException("Max allowed feedback options size of " + aayxVar.a().toString() + " exceeded, you are passing in feedback options of " + iDataSize + " size.");
        }
    }

    public static void p(java.lang.Runnable runnable) {
        java.lang.Thread thread = new java.lang.Thread(runnable, "Feedback");
        thread.setPriority(4);
        thread.start();
    }

    public static void q(android.content.Context context) {
        android.content.Intent intentAddFlags = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.tachyon")).addFlags(268435456);
        android.util.Log.d("SetupDuoHelper", "Try to install Duo via Play store link.");
        try {
            context.startActivity(intentAddFlags);
        } catch (android.content.ActivityNotFoundException unused) {
            android.util.Log.e("SetupDuoHelper", "No activity to handle view intent.");
        }
    }

    public static defpackage.aacw r(java.lang.Exception exc, int i, java.lang.String str) {
        defpackage.aacw aacwVar = new defpackage.aacw(new com.google.android.gms.common.api.Status(i, str.concat(exc.getMessage() == null ? "" : ": ".concat(java.lang.String.valueOf(exc.getMessage()))), null, null));
        aacwVar.initCause(exc);
        return aacwVar;
    }

    public static defpackage.aacw s(android.os.RemoteException remoteException, java.lang.String str) {
        return r(remoteException, true != (remoteException instanceof android.os.DeadObjectException) ? 19 : 20, str);
    }

    public static ahwn t(android.content.Context context, byte[] bArr, ahwm ahwmVar) {
        j$.util.Optional optionalEmpty;
        defpackage.akzx akzxVarM = ahwn.a.m();
        defpackage.akzc akzcVarU = defpackage.akzc.u(bArr);
        akzxVarM.u();
        ahwn ahwnVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(akzcVarU);
        ahwnVar.b |= 2;
        ahwnVar.d = akzcVarU;
        akzxVarM.u();
        ahwn ahwnVar2 = akzxVarM.b;
        j$.util.Objects.requireNonNull(ahwmVar);
        ahwnVar2.e = ahwmVar;
        ahwnVar2.b |= 4;
        try {
            android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("dg_shared_preferences", 0);
            java.lang.String string = sharedPreferences.getString("client_uuid", "");
            if (string.isEmpty()) {
                java.util.UUID uuidRandomUUID = java.util.UUID.randomUUID();
                sharedPreferences.edit().putString("client_uuid", uuidRandomUUID.toString()).apply();
                optionalEmpty = j$.util.Optional.of(uuidRandomUUID);
            } else {
                optionalEmpty = j$.util.Optional.of(java.util.UUID.fromString(string));
            }
        } catch (java.lang.IllegalStateException unused) {
            optionalEmpty = j$.util.Optional.empty();
        }
        if (true == optionalEmpty.isPresent()) {
            java.util.UUID uuid = (java.util.UUID) optionalEmpty.get();
            optionalEmpty = j$.util.Optional.ofNullable(java.nio.ByteBuffer.wrap(new byte[16]).order(java.nio.ByteOrder.BIG_ENDIAN).putLong(uuid.getMostSignificantBits()).putLong(uuid.getLeastSignificantBits()).array());
        }
        xch xchVar = new xch(akzxVarM, 17);
        if (true == optionalEmpty.isPresent()) {
            java.lang.Object obj = optionalEmpty.get();
            java.lang.Object obj2 = xchVar.a;
            defpackage.akzc akzcVarU2 = defpackage.akzc.u((byte[]) obj);
            defpackage.akzx akzxVar = (defpackage.akzx) obj2;
            akzxVar.u();
            ahwn ahwnVar3 = akzxVar.b;
            j$.util.Objects.requireNonNull(akzcVarU2);
            ahwnVar3.b |= 16;
            ahwnVar3.f = akzcVarU2;
        }
        return akzxVarM.r();
    }

    public static byte[] u(ahwn ahwnVar) {
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            byte[] bArr = new byte[8];
            new java.util.Random().nextBytes(bArr);
            bArr[0] = 10;
            bArr[1] = 6;
            int i = 3;
            for (int i2 = 0; i2 < 8; i2++) {
                i ^= bArr[i2];
            }
            bArr[2] = (byte) (bArr[2] ^ ((byte) i));
            byteArrayOutputStream.write(bArr);
            defpackage.akzx akzxVarL = ahwnVar.L();
            akzxVarL.u();
            ahwn ahwnVar2 = akzxVarL.b;
            ahwnVar2.b &= -2;
            ahwnVar2.c = ahwn.a.c;
            akzxVarL.r().h(byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    public static void v(android.content.Context context, defpackage.aaoo aaooVar, long j, com.google.android.gms.googlehelp.GoogleHelp googleHelp) {
        googleHelp.B = true;
        aF(new aami(context, googleHelp, aaooVar, j, 1));
        aF(new aami(context, googleHelp, aaooVar, j, 0));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static ykj w(java.lang.String str) {
        switch (str.hashCode()) {
            case -908719937:
                if (str.equals("GIFT_CARD")) {
                    return ykj.e;
                }
                break;
            case -664540516:
                if (str.equals("PHISHING")) {
                    return ykj.f;
                }
                break;
            case 2402104:
                if (str.equals("NONE")) {
                    return ykj.b;
                }
                break;
            case 140722205:
                if (str.equals("NOT_AVAILABLE")) {
                    return ykj.d;
                }
                break;
            case 618719069:
                if (str.equals("SUSPICIOUS")) {
                    return ykj.g;
                }
                break;
            case 741441619:
                if (str.equals("RECURRENT_SPAM_PATTERN")) {
                    return ykj.i;
                }
                break;
            case 854821378:
                if (str.equals("NOT_SUPPORTED")) {
                    return ykj.c;
                }
                break;
        }
        try {
            return java.lang.Enum.valueOf(ykj.class, str);
        } catch (java.lang.IllegalArgumentException unused) {
            return ykj.a;
        }
    }

    public static int x(int i) {
        switch (i - 1) {
            case 0:
                return 3;
            case 1:
                return 4;
            case 2:
                return 5;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
                return 6;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return 9;
            default:
                return 10;
        }
    }

    public static int y(alez alezVar) {
        defpackage.aooh.f(alezVar, "<this>");
        switch (alezVar.ordinal()) {
            case 1:
                return 13;
            case 2:
            case 10:
            case 13:
            case 15:
            case 16:
            default:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return 6;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return 7;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return 8;
            case 9:
                return 9;
            case 11:
                return 14;
            case 12:
                return 10;
            case 14:
                return 12;
            case 17:
                return 11;
        }
    }

    public static int z(alez alezVar) {
        defpackage.aooh.f(alezVar, "<this>");
        int iOrdinal = alezVar.ordinal();
        if (iOrdinal == 2) {
            return 11;
        }
        if (iOrdinal == 3) {
            return 12;
        }
        if (iOrdinal == 8) {
            return 10;
        }
        if (iOrdinal == 18) {
            return 6;
        }
        switch (iOrdinal) {
            case 13:
                return 5;
            case 14:
                return 7;
            case 15:
                return 8;
            case 16:
                return 9;
            default:
                return 2;
        }
    }

    public java.util.List a() {
        return null;
    }

    public java.util.List b() {
        return null;
    }

    public aaoo(short[] sArr) {
    }
}
