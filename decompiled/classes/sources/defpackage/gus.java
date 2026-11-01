package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class gus {
    public gus(byte[] bArr) {
        java.util.List list = java.util.Collections.EMPTY_LIST;
        java.util.List list2 = java.util.Collections.EMPTY_LIST;
    }

    public static byte[] A(defpackage.grp grpVar) {
        int i;
        if (grpVar == null) {
            defpackage.aooh.i("data");
        }
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeShort(-21521);
                int i2 = 1;
                dataOutputStream.writeShort(1);
                java.util.Map map = grpVar.b;
                dataOutputStream.writeInt(map.size());
                for (java.util.Map.Entry entry : map.entrySet()) {
                    java.lang.String str = (java.lang.String) entry.getKey();
                    java.lang.Object value = entry.getValue();
                    if (value == null) {
                        dataOutputStream.writeByte(0);
                    } else if (value instanceof java.lang.Boolean) {
                        dataOutputStream.writeByte(i2);
                        dataOutputStream.writeBoolean(((java.lang.Boolean) value).booleanValue());
                    } else if (value instanceof java.lang.Byte) {
                        dataOutputStream.writeByte(2);
                        dataOutputStream.writeByte(((java.lang.Number) value).byteValue());
                    } else if (value instanceof java.lang.Integer) {
                        dataOutputStream.writeByte(3);
                        dataOutputStream.writeInt(((java.lang.Number) value).intValue());
                    } else if (value instanceof java.lang.Long) {
                        dataOutputStream.writeByte(4);
                        dataOutputStream.writeLong(((java.lang.Number) value).longValue());
                    } else if (value instanceof java.lang.Float) {
                        dataOutputStream.writeByte(5);
                        dataOutputStream.writeFloat(((java.lang.Number) value).floatValue());
                    } else if (value instanceof java.lang.Double) {
                        dataOutputStream.writeByte(6);
                        dataOutputStream.writeDouble(((java.lang.Number) value).doubleValue());
                    } else if (value instanceof java.lang.String) {
                        dataOutputStream.writeByte(7);
                        dataOutputStream.writeUTF((java.lang.String) value);
                    } else {
                        if (!(value instanceof java.lang.Object[])) {
                            java.lang.Class<?> cls = value.getClass();
                            defpackage.aopu[] aopuVarArr = defpackage.aoou.a;
                            throw new java.lang.IllegalArgumentException("Unsupported value type ".concat(java.lang.String.valueOf(new defpackage.aooa(cls).c())));
                        }
                        java.lang.Object[] objArr = (java.lang.Object[]) value;
                        java.lang.Class<?> cls2 = objArr.getClass();
                        defpackage.aopu[] aopuVarArr2 = defpackage.aoou.a;
                        defpackage.aooa aooaVar = new defpackage.aooa(cls2);
                        int i3 = 11;
                        int i4 = 10;
                        int i5 = 8;
                        if (defpackage.aooh.n(aooaVar, new defpackage.aooa(java.lang.Boolean[].class))) {
                            i = 8;
                        } else if (defpackage.aooh.n(aooaVar, new defpackage.aooa(java.lang.Byte[].class))) {
                            i = 9;
                        } else if (defpackage.aooh.n(aooaVar, new defpackage.aooa(java.lang.Integer[].class))) {
                            i = 10;
                        } else if (defpackage.aooh.n(aooaVar, new defpackage.aooa(java.lang.Long[].class))) {
                            i = 11;
                        } else if (defpackage.aooh.n(aooaVar, new defpackage.aooa(java.lang.Float[].class))) {
                            i = 12;
                        } else if (defpackage.aooh.n(aooaVar, new defpackage.aooa(java.lang.Double[].class))) {
                            i = 13;
                        } else {
                            if (!defpackage.aooh.n(aooaVar, new defpackage.aooa(java.lang.String[].class))) {
                                throw new java.lang.IllegalArgumentException("Unsupported value type ".concat(java.lang.String.valueOf(new defpackage.aooa(objArr.getClass()).b())));
                            }
                            i = 14;
                        }
                        dataOutputStream.writeByte(i);
                        int length = objArr.length;
                        dataOutputStream.writeInt(length);
                        int i6 = 0;
                        while (i6 < length) {
                            java.lang.Object obj = objArr[i6];
                            if (i == i5) {
                                java.lang.Boolean bool = obj instanceof java.lang.Boolean ? (java.lang.Boolean) obj : null;
                                dataOutputStream.writeBoolean(bool != null ? bool.booleanValue() : false);
                            } else if (i == 9) {
                                java.lang.Byte b = obj instanceof java.lang.Byte ? (java.lang.Byte) obj : null;
                                dataOutputStream.writeByte(b != null ? b.byteValue() : (byte) 0);
                            } else if (i == i4) {
                                java.lang.Integer num = obj instanceof java.lang.Integer ? (java.lang.Integer) obj : null;
                                dataOutputStream.writeInt(num != null ? num.intValue() : 0);
                            } else if (i == i3) {
                                java.lang.Long l = obj instanceof java.lang.Long ? (java.lang.Long) obj : null;
                                dataOutputStream.writeLong(l != null ? l.longValue() : 0L);
                            } else if (i == 12) {
                                java.lang.Float f = obj instanceof java.lang.Float ? (java.lang.Float) obj : null;
                                dataOutputStream.writeFloat(f != null ? f.floatValue() : 0.0f);
                            } else if (i == 13) {
                                java.lang.Double d = obj instanceof java.lang.Double ? (java.lang.Double) obj : null;
                                dataOutputStream.writeDouble(d != null ? d.doubleValue() : 0.0d);
                            } else {
                                java.lang.String str2 = obj instanceof java.lang.String ? (java.lang.String) obj : null;
                                dataOutputStream.writeUTF(str2 != null ? str2 : "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d");
                            }
                            i6++;
                            i3 = 11;
                            i4 = 10;
                            i5 = 8;
                        }
                    }
                    dataOutputStream.writeUTF(str);
                    i2 = 1;
                }
                dataOutputStream.flush();
                if (dataOutputStream.size() > 10240) {
                    throw new java.lang.IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                dataOutputStream.close();
                if (byteArray == null) {
                    defpackage.aooh.g();
                }
                return byteArray;
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    try {
                        dataOutputStream.close();
                        throw th2;
                    } catch (java.lang.Throwable th3) {
                        aoil.b(th, th3);
                        throw th2;
                    }
                }
            }
        } catch (java.io.IOException e) {
            java.lang.String str3 = defpackage.grq.a;
            defpackage.gsh.a();
            android.util.Log.e(str3, "Error in Data#toByteArray: ", e);
            return new byte[0];
        }
    }

    public static boolean B(java.lang.String str, defpackage.aomy aomyVar) {
        try {
            boolean zBooleanValue = ((java.lang.Boolean) aomyVar.a()).booleanValue();
            if (zBooleanValue) {
                return zBooleanValue;
            }
            android.util.Log.e("ReflectionGuard", str);
            return zBooleanValue;
        } catch (java.lang.ClassNotFoundException unused) {
            android.util.Log.e("ReflectionGuard", "ClassNotFound: ".concat(str));
            return false;
        } catch (java.lang.NoSuchFieldException unused2) {
            android.util.Log.e("ReflectionGuard", "NoSuchField: ".concat(str));
            return false;
        } catch (java.lang.NoSuchMethodException unused3) {
            android.util.Log.e("ReflectionGuard", "NoSuchMethod: ".concat(str));
            return false;
        }
    }

    public static boolean C(defpackage.aomy aomyVar) {
        try {
            aomyVar.a();
            return true;
        } catch (java.lang.ClassNotFoundException | java.lang.NoClassDefFoundError unused) {
            return false;
        }
    }

    public static boolean D(java.lang.reflect.Method method, java.lang.Class cls) {
        if (method == null) {
            defpackage.aooh.i("<this>");
        }
        if (cls == null) {
            defpackage.aooh.i("clazz");
        }
        return method.getReturnType().equals(cls);
    }

    public static boolean E(java.lang.reflect.Constructor constructor) {
        if (constructor == null) {
            defpackage.aooh.i("<this>");
        }
        return java.lang.reflect.Modifier.isPublic(constructor.getModifiers());
    }

    public static boolean F(java.lang.reflect.Field field) {
        if (field == null) {
            defpackage.aooh.i("<this>");
        }
        return java.lang.reflect.Modifier.isPublic(field.getModifiers());
    }

    public static boolean G(java.lang.reflect.Method method) {
        if (method == null) {
            defpackage.aooh.i("<this>");
        }
        return java.lang.reflect.Modifier.isPublic(method.getModifiers());
    }

    public static boolean H(java.lang.reflect.Method method, defpackage.aopu aopuVar) {
        defpackage.aooh.f(method, "<this>");
        return D(method, defpackage.aooc.I(aopuVar));
    }

    public static defpackage.grh I() {
        return android.os.Build.VERSION.SDK_INT >= 34 ? defpackage.gri.a : defpackage.gri.b;
    }

    public static defpackage.gre J() {
        return android.os.Build.VERSION.SDK_INT >= 34 ? defpackage.grf.a : grg.a;
    }

    public static defpackage.gpk K(final float f) {
        java.lang.Float fValueOf = java.lang.Float.valueOf(f);
        java.lang.String str = defpackage.gpl.a;
        defpackage.aooh.e(str, "access$getTAG$cp(...)");
        java.lang.Object objB = R(fValueOf, str, defpackage.gnh.a, defpackage.gmu.a).a("Ratio must be in range (0.0, 1.0). Use SplitType.expandContainers() instead of 0 or 1.", new defpackage.aonj() { // from class: gpj
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                ((java.lang.Float) obj).floatValue();
                float f2 = f;
                double d = f2;
                boolean z = false;
                if (d >= 0.0d && d <= 1.0d && defpackage.ajsz.cJ(new java.lang.Float[]{java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(1.0f)}, java.lang.Float.valueOf(f2)) < 0) {
                    z = true;
                }
                return java.lang.Boolean.valueOf(z);
            }
        }).b();
        if (objB == null) {
            defpackage.aooh.g();
        }
        float fFloatValue = ((java.lang.Number) objB).floatValue();
        return new defpackage.gpk("ratio:" + fFloatValue, fFloatValue);
    }

    public static androidx.window.extensions.embedding.ActivityEmbeddingComponent L() {
        java.lang.Object objNewProxyInstance = java.lang.reflect.Proxy.newProxyInstance(defpackage.gou.class.getClassLoader(), new java.lang.Class[]{goy$.ExternalSyntheticApiModelOutline3.m$7()}, new got());
        defpackage.aooh.d(objNewProxyInstance, "null cannot be cast to non-null type androidx.window.extensions.embedding.ActivityEmbeddingComponent");
        return goy$.ExternalSyntheticApiModelOutline3.m(objNewProxyInstance);
    }

    public static boolean M() {
        try {
            java.lang.ClassLoader classLoader = defpackage.gou.class.getClassLoader();
            if (classLoader == null) {
                return false;
            }
            defpackage.gne gneVar = new defpackage.gne(classLoader, null);
            androidx.window.extensions.WindowExtensions windowExtensionsM = ddz$.ExternalSyntheticApiModelOutline0.m();
            defpackage.aooh.e(windowExtensionsM, "getWindowExtensions(...)");
            return new defpackage.kgl(classLoader, gneVar, windowExtensionsM).z() != null;
        } catch (java.lang.NoClassDefFoundError unused) {
            android.util.Log.d("EmbeddingCompat", "Embedding extension version not found");
            return false;
        } catch (java.lang.UnsupportedOperationException unused2) {
            android.util.Log.d("EmbeddingCompat", "Stub Extension");
            return false;
        }
    }

    public static defpackage.goj N(defpackage.goh gohVar, defpackage.goi goiVar, defpackage.goi goiVar2, defpackage.goi goiVar3) {
        return new defpackage.goj(gohVar, goiVar, goiVar2, goiVar3);
    }

    public static java.lang.String O(defpackage.gow gowVar) {
        if (gowVar == null) {
            defpackage.aooh.i("rule");
        }
        return java.lang.String.valueOf(defpackage.goe.a).concat(java.lang.String.valueOf(java.lang.Integer.toHexString(gowVar.hashCode())));
    }

    public static void P(int i) {
        if ((i >>> 24) != 255) {
            throw new java.lang.IllegalArgumentException("Divider color must be opaque. Got: ".concat(java.lang.String.valueOf(java.lang.Integer.toHexString(i))));
        }
    }

    public static void Q(int i) {
        if (i != -1 && i < 0) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bj(i, "widthDp must be greater than or equal to 0 or WIDTH_SYSTEM_DEFAULT. Got: "));
        }
    }

    public static defpackage.gnf R(java.lang.Object obj, java.lang.String str, defpackage.gnh gnhVar, defpackage.gmu gmuVar) {
        if (obj == null) {
            defpackage.aooh.i("<this>");
        }
        if (str == null) {
            defpackage.aooh.i("tag");
        }
        if (gnhVar == null) {
            defpackage.aooh.i("verificationMode");
        }
        return new defpackage.gng(obj, str, gnhVar, gmuVar);
    }

    public static defpackage.gso S(defpackage.gus gusVar, final java.lang.String str, final java.util.concurrent.Executor executor, final defpackage.aomy aomyVar) {
        if (executor == null) {
            defpackage.aooh.i("executor");
        }
        final defpackage.eng engVar = new defpackage.eng(defpackage.gso.b);
        return new defpackage.gsp(defpackage.dff.m(new defpackage.dsf() { // from class: gsq
            @Override // defpackage.dsf
            public final java.lang.Object a(defpackage.dsd dsdVar) {
                executor.execute(new defpackage.gsr(str, aomyVar, engVar, dsdVar, 0));
                return defpackage.aojh.a;
            }
        }));
    }

    public static defpackage.ipc T(android.content.Context context) {
        if (context == null) {
            defpackage.aooh.i("context");
        }
        return new defpackage.ipc(defpackage.gol.a(context));
    }

    public static defpackage.ipc U(android.content.Context context) {
        if (context == null) {
            defpackage.aooh.i("context");
        }
        android.content.Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            defpackage.aooh.g();
        }
        return new defpackage.ipc(defpackage.gol.a(applicationContext), (byte[]) null);
    }

    public static defpackage.zzd V(android.content.Context context, java.lang.String str) {
        java.util.List list = defpackage.zzd.m;
        defpackage.zza zzaVar = new defpackage.zza(context, str);
        zzaVar.f = new defpackage.rma(0);
        return zzaVar.b();
    }

    public static defpackage.rkt W(defpackage.rll rllVar, java.lang.String... strArr) {
        defpackage.rlk rlkVar = defpackage.rlk.c;
        java.util.List listAsList = java.util.Arrays.asList(strArr);
        defpackage.aooh.e(listAsList, "asList(...)");
        return new defpackage.rle(rllVar, rlkVar, listAsList);
    }

    public static defpackage.rkt X(defpackage.rll rllVar, java.lang.String... strArr) {
        defpackage.rlk rlkVar = defpackage.rlk.a;
        java.util.List listAsList = java.util.Arrays.asList(strArr);
        defpackage.aooh.e(listAsList, "asList(...)");
        return new defpackage.rle(rllVar, rlkVar, listAsList);
    }

    public static defpackage.rkt Y(defpackage.rll rllVar, java.lang.String... strArr) {
        defpackage.rlk rlkVar = defpackage.rlk.d;
        java.util.List listAsList = java.util.Arrays.asList(strArr);
        defpackage.aooh.e(listAsList, "asList(...)");
        return new defpackage.rle(rllVar, rlkVar, listAsList);
    }

    public static defpackage.rkt Z(defpackage.rkx rkxVar, int i) {
        defpackage.rlb rlbVar = defpackage.rlb.d;
        java.util.List listSingletonList = java.util.Collections.singletonList(java.lang.Integer.valueOf(i));
        defpackage.aooh.e(listSingletonList, "singletonList(...)");
        return new defpackage.rle(rkxVar, rlbVar, listSingletonList);
    }

    public static java.lang.String aA(defpackage.mhc mhcVar, java.util.Map map) throws java.io.IOException {
        int i;
        if (mhcVar == null) {
            defpackage.aooh.i("<this>");
        }
        int i2 = mhcVar.b;
        switch (i2) {
            case 0:
                i = 10;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 4;
                break;
            case 5:
                i = 5;
                break;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                i = 6;
                break;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                i = 7;
                break;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                i = 8;
                break;
            case 9:
                i = 9;
                break;
            default:
                i = 0;
                break;
        }
        if (i == 0) {
            throw null;
        }
        switch (i - 1) {
            case 0:
                return java.lang.String.valueOf(i2 == 1 ? ((java.lang.Boolean) mhcVar.c).booleanValue() : false);
            case 1:
                java.lang.String str = i2 == 2 ? (java.lang.String) mhcVar.c : "";
                defpackage.aooh.e(str, "getStringValue(...)");
                return str;
            case 2:
                return java.lang.String.valueOf(i2 == 3 ? ((java.lang.Long) mhcVar.c).longValue() : 0L);
            case 3:
                return java.lang.String.valueOf(i2 == 4 ? ((java.lang.Float) mhcVar.c).floatValue() : 0.0f);
            case 4:
                return defpackage.aish.g.k((mhcVar.b == 5 ? (defpackage.akzc) mhcVar.c : defpackage.akzc.d).D());
            case 5:
                defpackage.alat<defpackage.mhc> alatVar = (i2 == 6 ? (defpackage.mha) mhcVar.c : defpackage.mha.a).b;
                defpackage.aooh.e(alatVar, "getValuesList(...)");
                java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.ajsz.bl(alatVar, 10));
                for (defpackage.mhc mhcVar2 : alatVar) {
                    if (mhcVar2 == null) {
                        defpackage.aooh.g();
                    }
                    arrayList.add(aA(mhcVar2, map));
                }
                return "[" + defpackage.ajsz.cr(arrayList, ",", null, null, null, 62) + ']';
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                java.util.Set<java.util.Map.Entry> setEntrySet = j$.util.DesugarCollections.unmodifiableMap((i2 == 7 ? (defpackage.mhb) mhcVar.c : defpackage.mhb.a).b).entrySet();
                java.util.ArrayList arrayList2 = new java.util.ArrayList(defpackage.ajsz.bl(setEntrySet, 10));
                for (java.util.Map.Entry entry : setEntrySet) {
                    java.lang.Object key = entry.getKey();
                    java.lang.Object value = entry.getValue();
                    defpackage.aooh.e(value, "<get-value>(...)");
                    arrayList2.add(key + " : " + aA((defpackage.mhc) value, map));
                }
                return "[" + defpackage.ajsz.cr(arrayList2, ",", null, null, null, 62) + ']';
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                java.lang.String str2 = i2 == 8 ? (java.lang.String) mhcVar.c : "";
                defpackage.aooh.e(str2, "getProguardedValue(...)");
                java.lang.String str3 = mhcVar.b == 8 ? (java.lang.String) mhcVar.c : "";
                defpackage.aooh.e(str3, "getProguardedValue(...)");
                java.lang.String str4 = (java.lang.String) j$.util.Map.-EL.getOrDefault(map, str2, str3);
                return defpackage.aoov.D(str4, ".", str4);
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                java.lang.String strK = defpackage.aish.e.k((mhcVar.b == 9 ? (defpackage.akyp) mhcVar.c : defpackage.akyp.a).c.D());
                java.lang.String str5 = (mhcVar.b == 9 ? (defpackage.akyp) mhcVar.c : defpackage.akyp.a).b;
                defpackage.aooh.e(str5, "getTypeUrl(...)");
                java.lang.String strD = defpackage.aoov.D(str5, "type.googleapis.com/", str5);
                java.lang.Object orDefault = j$.util.Map.-EL.getOrDefault(map, strD, strD);
                java.util.Objects.toString(orDefault);
                return defpackage.aoov.l("\n          [base64 encoded: " + strK + "\n          type URL:  " + "type.googleapis.com/".concat(java.lang.String.valueOf(orDefault)) + "]\n          ");
            case 9:
                return "<empty>";
            default:
                throw new defpackage.aois();
        }
    }

    public static defpackage.mhc aB(java.lang.Class cls) {
        if (cls == null) {
            defpackage.aooh.i("clazz");
        }
        defpackage.akzx akzxVarM = defpackage.mhc.a.m();
        java.lang.String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "";
        }
        akzxVarM.u();
        defpackage.mhc mhcVar = (defpackage.mhc) akzxVarM.b;
        j$.util.Objects.requireNonNull(canonicalName);
        mhcVar.b = 8;
        mhcVar.c = canonicalName;
        defpackage.alad aladVarP = akzxVarM.r();
        defpackage.aooh.e(aladVarP, "build(...)");
        return (defpackage.mhc) aladVarP;
    }

    public static defpackage.mgi aD(java.lang.Object obj, int i, defpackage.mgu mguVar) {
        return new defpackage.mgi(mguVar, obj, java.lang.Integer.valueOf(i), i);
    }

    public static defpackage.acme aE(defpackage.zar zarVar, j$.time.Duration duration) {
        if (zarVar == null) {
            defpackage.aooh.i("resultCode");
        }
        if (duration == null) {
            defpackage.aooh.i("duration");
        }
        defpackage.apdi apdiVar = defpackage.acmr.a;
        defpackage.akzx akzxVarM = defpackage.aivq.a.m();
        if (akzxVarM == null) {
            defpackage.aooh.i("builder");
        }
        defpackage.akzz akzzVar = (defpackage.akzz) defpackage.amjm.a.m();
        if (akzzVar == null) {
            defpackage.aooh.i("builder");
        }
        defpackage.akzx akzxVarM2 = defpackage.amjl.a.m();
        if (akzxVarM2 == null) {
            defpackage.aooh.i("builder");
        }
        int i = zarVar.s;
        akzxVarM2.u();
        defpackage.amjl amjlVar = (defpackage.amjl) akzxVarM2.b;
        amjlVar.b |= 1;
        amjlVar.c = i;
        defpackage.alad aladVarP = akzxVarM2.r();
        defpackage.aooh.e(aladVarP, "build(...)");
        defpackage.amjl amjlVar2 = (defpackage.amjl) aladVarP;
        if (amjlVar2 == null) {
            defpackage.aooh.i("value");
        }
        akzzVar.u();
        defpackage.amjm amjmVar = (defpackage.amjm) akzzVar.b;
        j$.util.Objects.requireNonNull(amjlVar2);
        amjmVar.c = amjlVar2;
        amjmVar.b |= 2;
        if (duration == null) {
            defpackage.aooh.i("<this>");
        }
        defpackage.akzm akzmVarF = defpackage.aldf.f(duration.getSeconds(), duration.getNano());
        defpackage.aooh.e(akzmVarF, "toProtoDuration(...)");
        if (akzmVarF == null) {
            defpackage.aooh.i("value");
        }
        akzzVar.u();
        defpackage.amjm amjmVar2 = (defpackage.amjm) akzzVar.b;
        j$.util.Objects.requireNonNull(akzmVarF);
        amjmVar2.d = akzmVarF;
        amjmVar2.b |= 4;
        defpackage.alad aladVarP2 = akzzVar.r();
        defpackage.aooh.e(aladVarP2, "build(...)");
        defpackage.amjm amjmVar3 = (defpackage.amjm) aladVarP2;
        if (amjmVar3 == null) {
            defpackage.aooh.i("value");
        }
        akzxVarM.u();
        defpackage.aivq aivqVar = (defpackage.aivq) akzxVarM.b;
        j$.util.Objects.requireNonNull(amjmVar3);
        aivqVar.c = amjmVar3;
        aivqVar.b |= 1;
        defpackage.alad aladVarP3 = akzxVarM.r();
        defpackage.aooh.e(aladVarP3, "build(...)");
        return new defpackage.acme(apdiVar, (defpackage.aivq) aladVarP3);
    }

    public static /* synthetic */ defpackage.aojh aF(defpackage.ajni ajniVar) {
        if (ajniVar == null) {
            defpackage.aooh.i("$this$error");
        }
        ajniVar.b = defpackage.mcd.ANDROID_AUTO_NO_VOICE_CONTROLLER_FOUND;
        ajniVar.c = defpackage.zar.ILLEGAL_STATE;
        return defpackage.aojh.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static void aG(boolean z, boolean z2, final defpackage.aonn aonnVar, defpackage.cav cavVar, int i, int i2) {
        int i3;
        ?? r0;
        defpackage.bsu bsuVar;
        char c;
        boolean z3 = z;
        final boolean z4 = z2;
        if (aonnVar == null) {
            defpackage.aooh.i("content");
        }
        defpackage.cav cavVarB = cavVar.b(-654200751);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != cavVarB.C(z3) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        boolean z5 = i5 == 0;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != cavVarB.C(z4) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != cavVarB.D(aonnVar) ? 128 : 256;
        }
        if (cavVarB.H((i3 & 147) != 146, i3 & 1)) {
            int i6 = (z3 ? 1 : 0) & (i4 ^ 1);
            z4 &= z5;
            defpackage.lpz lpzVar = defpackage.lqa.a;
            android.content.Context context = (android.content.Context) cavVarB.e(defpackage.dep.b);
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            java.lang.Object obj = defpackage.cau.a;
            if (objR == obj) {
                ((defpackage.lqc) defpackage.agab.aH(context, defpackage.lqc.class)).jl();
                objR = java.lang.Boolean.FALSE;
                cbtVar.ab(objR);
            }
            if (((java.lang.Boolean) objR).booleanValue()) {
                cavVarB.u(1267386348);
                cbtVar.W(false);
                bsuVar = null;
            } else {
                cavVarB.u(-1621683432);
                bsuVar = (defpackage.bsu) cavVarB.e(defpackage.bsw.b);
                cbtVar.W(false);
            }
            boolean zB = cavVarB.B(context) | ((i3 & 14) == 4);
            java.lang.Object objR2 = cbtVar.R();
            if (zB || objR2 == obj) {
                final boolean z6 = 1 == i6;
                c = 2;
                defpackage.abnc abncVar = new defpackage.abnc(new defpackage.ded(((defpackage.lqc) defpackage.agab.aH(context, defpackage.lqc.class)).om().a, 7, (byte[][]) null), new defpackage.aomy() { // from class: lpy
                    @Override // defpackage.aomy
                    public final java.lang.Object a() {
                        return java.lang.Boolean.valueOf(z6);
                    }
                }, 1073741307);
                cbtVar.ab(abncVar);
                objR2 = abncVar;
            } else {
                c = 2;
            }
            defpackage.cdj[] cdjVarArr = new defpackage.cdj[3];
            cdjVarArr[0] = defpackage.lqa.b.b(lpzVar);
            cdjVarArr[1] = defpackage.bsw.b.b(bsuVar);
            cdjVarArr[c] = defpackage.abnd.a.b((defpackage.abnc) objR2);
            defpackage.den.ac(cdjVarArr, defpackage.cfo.j(97740049, new defpackage.aonn() { // from class: lqe
                @Override // defpackage.aonn
                public final java.lang.Object a(java.lang.Object obj2, java.lang.Object obj3) {
                    android.content.res.Resources.Theme theme;
                    defpackage.cav cavVar2 = (defpackage.cav) obj2;
                    int iIntValue = ((java.lang.Integer) obj3).intValue();
                    int i7 = iIntValue & 3;
                    int i8 = 1;
                    int i9 = 0;
                    if (cavVar2.H(i7 != 2, iIntValue & 1)) {
                        boolean z7 = z4;
                        android.content.Context applicationContext = ((android.content.Context) cavVar2.e(defpackage.dep.b)).getApplicationContext();
                        boolean zB2 = cavVar2.B(applicationContext) | cavVar2.C(z7);
                        java.lang.Object objG = cavVar2.g();
                        if (zB2 || objG == defpackage.cau.a) {
                            if (z7) {
                                theme = new android.view.ContextThemeWrapper(applicationContext, 2132084699).getTheme();
                                if (theme == null) {
                                    defpackage.aooh.g();
                                }
                            } else {
                                theme = applicationContext.getTheme();
                                if (theme == null) {
                                    defpackage.aooh.g();
                                }
                            }
                            android.content.res.TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(new int[]{2130969105, 2130969053, 2130969115, 2130969057, 2130969113, 2130969054, 2130969106, 2130969112, 2130969107, 2130969108, 2130969109, 2130969110, 2130969111});
                            defpackage.aooh.e(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
                            defpackage.lqb lqbVar = new defpackage.lqb(typedArrayObtainStyledAttributes.getColor(0, 0), typedArrayObtainStyledAttributes.getColor(1, 0), typedArrayObtainStyledAttributes.getColor(2, 0), typedArrayObtainStyledAttributes.getColor(3, 0), typedArrayObtainStyledAttributes.getColor(4, 0), typedArrayObtainStyledAttributes.getColor(5, 0), typedArrayObtainStyledAttributes.getColor(6, 0), typedArrayObtainStyledAttributes.getColor(7, 0), typedArrayObtainStyledAttributes.getColor(8, 0), typedArrayObtainStyledAttributes.getColor(9, 0), typedArrayObtainStyledAttributes.getColor(10, 0), typedArrayObtainStyledAttributes.getColor(11, 0), typedArrayObtainStyledAttributes.getColor(12, 0));
                            typedArrayObtainStyledAttributes.recycle();
                            cavVar2.w(lqbVar);
                            objG = lqbVar;
                        }
                        defpackage.lqb lqbVar2 = (defpackage.lqb) objG;
                        defpackage.abnv abnvVar = new defpackage.abnv(z7, i8);
                        boolean zD = cavVar2.D(lqbVar2) | cavVar2.C(z7);
                        java.lang.Object objG2 = cavVar2.g();
                        if (zD || objG2 == defpackage.cau.a) {
                            objG2 = new defpackage.lqd(lqbVar2, z7, i9);
                            cavVar2.w(objG2);
                        }
                        defpackage.abny.c(abnvVar, null, null, (defpackage.aono) objG2, null, null, null, null, false, null, null, 0, aonnVar, cavVar2, 0, 0, 4086);
                    } else {
                        cavVar2.s();
                    }
                    return defpackage.aojh.a;
                }
            }, cavVarB), cavVarB, 48);
            r0 = i6;
        } else {
            cavVarB.s();
            r0 = z3;
        }
        boolean z7 = z4;
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new lqf(1 == r0, z7, aonnVar, i, i2);
        }
    }

    public static void aH(defpackage.bbh bbhVar, defpackage.aenj aenjVar, defpackage.cav cavVar, int i) {
        int i2;
        if (bbhVar == null) {
            defpackage.aooh.i("<this>");
        }
        defpackage.cav cavVarB = cavVar.b(-1379289768);
        if ((i & 6) == 0) {
            i2 = (true != cavVarB.B(bbhVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(aenjVar) ? 16 : 32;
        }
        if (cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            android.content.Context context = (android.content.Context) cavVarB.e(defpackage.dep.b);
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            java.lang.Object obj = defpackage.cau.a;
            if (objR == obj) {
                objR = ((defpackage.lpk) defpackage.agab.aH(context, defpackage.lpk.class)).bv();
                cbtVar.ab(objR);
            }
            defpackage.ruc rucVar = (defpackage.ruc) objR;
            boolean zD = ((i2 & 14) == 4) | cavVarB.D(rucVar);
            boolean z = (i2 & 112) == 32;
            java.lang.Object objR2 = cbtVar.R();
            if ((zD | z) || objR2 == obj) {
                objR2 = new defpackage.edj(bbhVar, rucVar, aenjVar, (defpackage.aoln) null, 5);
                cbtVar.ab(objR2);
            }
            defpackage.cbp.g(bbhVar, (defpackage.aonn) objR2, cavVarB);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new kcv(bbhVar, aenjVar, i, 11, (byte[]) null);
        }
    }

    @java.lang.Deprecated
    public static void aI() {
        if (!android.os.Looper.getMainLooper().equals(android.os.Looper.myLooper())) {
            throw new java.lang.IllegalStateException();
        }
    }

    @java.lang.Deprecated
    public static void aJ() {
        if (android.os.Looper.getMainLooper().equals(android.os.Looper.myLooper())) {
            throw new java.lang.IllegalStateException();
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02e9  */
    public static defpackage.akzx aK(spn spnVar) {
        java.lang.String str;
        boolean z;
        long j;
        boolean z2;
        boolean zL;
        sql sqlVar = new sql(spnVar);
        defpackage.akzx akzxVarM = kiw.a.m();
        java.lang.String strH = sqlVar.h();
        akzxVarM.u();
        kiw kiwVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(strH);
        kiwVar.b |= 1;
        kiwVar.c = strH;
        java.lang.String strE = sqlVar.e();
        akzxVarM.u();
        kiw kiwVar2 = akzxVarM.b;
        j$.util.Objects.requireNonNull(strE);
        kiwVar2.b |= 2;
        kiwVar2.d = strE;
        java.lang.String strJ = sqlVar.j();
        akzxVarM.u();
        kiw kiwVar3 = akzxVarM.b;
        j$.util.Objects.requireNonNull(strJ);
        kiwVar3.b |= 4;
        kiwVar3.e = strJ;
        sqk sqkVar = sqlVar.b;
        boolean z3 = false;
        switch (sqkVar.ordinal()) {
            case 0:
            case 3:
            case 4:
            case 5:
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                str = "";
                break;
            case 1:
                str = ((spd) sqlVar.c.orElseThrow()).e;
                break;
            case 2:
                str = ((spd) sqlVar.d.orElseThrow()).e;
                break;
            default:
                throw new java.lang.UnsupportedOperationException(java.lang.String.format("Unsupported name source: %s", sqkVar));
        }
        akzxVarM.u();
        kiw kiwVar4 = akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        kiwVar4.b |= 1048576;
        kiwVar4.x = str;
        long jA = sqlVar.a();
        akzxVarM.u();
        kiw kiwVar5 = akzxVarM.b;
        kiwVar5.b |= 8;
        kiwVar5.f = jA;
        java.lang.String strG = sqlVar.g();
        akzxVarM.u();
        kiw kiwVar6 = akzxVarM.b;
        j$.util.Objects.requireNonNull(strG);
        kiwVar6.b |= 16;
        kiwVar6.g = strG;
        java.lang.String strI = sqlVar.i();
        akzxVarM.u();
        kiw kiwVar7 = akzxVarM.b;
        j$.util.Objects.requireNonNull(strI);
        kiwVar7.b |= 32;
        kiwVar7.h = strI;
        boolean zO = sqlVar.o();
        akzxVarM.u();
        kiw kiwVar8 = akzxVarM.b;
        kiwVar8.b |= 64;
        kiwVar8.i = zO;
        boolean zN = sqlVar.n();
        akzxVarM.u();
        kiw kiwVar9 = akzxVarM.b;
        kiwVar9.b |= 128;
        kiwVar9.j = zN;
        boolean z4 = sqlVar.c() == defpackage.udj.SPAM_STATUS_SPAM;
        akzxVarM.u();
        kiw kiwVar10 = akzxVarM.b;
        kiwVar10.b |= 256;
        kiwVar10.k = z4;
        defpackage.udj udjVarC = sqlVar.c();
        akzxVarM.u();
        kiw kiwVar11 = akzxVarM.b;
        kiwVar11.l = udjVarC.f;
        kiwVar11.b |= 512;
        spn spnVar2 = sqlVar.a;
        spk spkVar = spnVar2.e;
        if (spkVar == null) {
            spkVar = spk.a;
        }
        int iAQ = defpackage.a.aQ(spkVar.e);
        if (iAQ == 0) {
            iAQ = 1;
        }
        akzxVarM.u();
        kiw kiwVar12 = akzxVarM.b;
        kiwVar12.m = iAQ - 1;
        kiwVar12.b |= 1024;
        spk spkVar2 = spnVar2.e;
        if (spkVar2 == null) {
            spkVar2 = spk.a;
        }
        int iAQ2 = defpackage.a.aQ(spkVar2.f);
        if (iAQ2 == 0) {
            iAQ2 = 1;
        }
        akzxVarM.u();
        kiw kiwVar13 = akzxVarM.b;
        kiwVar13.n = iAQ2 - 1;
        kiwVar13.b |= 2048;
        defpackage.rmt rmtVarB = sqlVar.b();
        akzxVarM.u();
        kiw kiwVar14 = akzxVarM.b;
        kiwVar14.o = rmtVarB.q;
        kiwVar14.b |= 4096;
        switch (sqkVar.ordinal()) {
            case 0:
            case 2:
            case 3:
            case 4:
            case 5:
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                z = false;
                break;
            case 1:
                z = ((spd) sqlVar.c.orElseThrow()).m;
                break;
            default:
                throw new java.lang.UnsupportedOperationException(java.lang.String.format("Unsupported name source: %s", sqkVar));
        }
        akzxVarM.u();
        kiw kiwVar15 = akzxVarM.b;
        kiwVar15.b |= 8192;
        kiwVar15.p = z;
        java.lang.String strF = sqlVar.f();
        akzxVarM.u();
        kiw kiwVar16 = akzxVarM.b;
        j$.util.Objects.requireNonNull(strF);
        kiwVar16.b |= 16384;
        kiwVar16.q = strF;
        boolean zP = sqlVar.p();
        akzxVarM.u();
        kiw kiwVar17 = akzxVarM.b;
        kiwVar17.b |= 32768;
        kiwVar17.r = zP;
        boolean zS = sqlVar.s();
        akzxVarM.u();
        kiw kiwVar18 = akzxVarM.b;
        kiwVar18.b |= 65536;
        kiwVar18.s = zS;
        switch (sqkVar.ordinal()) {
            case 0:
            case 2:
            case 3:
            case 4:
            case 5:
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                j = 0;
                break;
            case 1:
                j = ((spd) sqlVar.c.orElseThrow()).p;
                break;
            default:
                throw new java.lang.UnsupportedOperationException(java.lang.String.format("Unsupported name source: %s", sqkVar));
        }
        akzxVarM.u();
        kiw kiwVar19 = akzxVarM.b;
        kiwVar19.b |= 131072;
        kiwVar19.t = j;
        zag zagVarU = sqlVar.u();
        akzxVarM.u();
        kiw kiwVar20 = akzxVarM.b;
        j$.util.Objects.requireNonNull(zagVarU);
        kiwVar20.u = zagVarU;
        kiwVar20.b |= 262144;
        zhj zhjVar = spnVar2.l;
        if (zhjVar == null) {
            zhjVar = zhj.a;
        }
        zhi zhiVar = zhjVar.h;
        if (zhiVar == null) {
            zhiVar = zhi.a;
        }
        defpackage.aify aifyVarN = defpackage.aify.n(zhiVar.e);
        akzxVarM.u();
        kiw kiwVar21 = akzxVarM.b;
        defpackage.alat alatVar = kiwVar21.v;
        if (!alatVar.c()) {
            kiwVar21.v = defpackage.alad.J(alatVar);
        }
        defpackage.akyl.i(aifyVarN, kiwVar21.v);
        if (sqkVar != sqk.a) {
            z2 = false;
        } else {
            zhj zhjVar2 = spnVar2.l;
            if (zhjVar2 == null) {
                zhjVar2 = zhj.a;
            }
            zag zagVar = zhjVar2.g;
            if (zagVar == null) {
                zagVar = zag.a;
            }
            if (zagVar.d.equals(java.util.Locale.getDefault().toLanguageTag())) {
                spa spaVar = spnVar2.n;
                if (spaVar == null) {
                    spaVar = spa.a;
                }
                zag zagVar2 = (spaVar.c == 2 ? (zhj) spaVar.d : zhj.a).g;
                if (zagVar2 == null) {
                    zagVar2 = zag.a;
                }
                zai zaiVar = zagVar2.c;
                if (zaiVar == null) {
                    zaiVar = zai.a;
                }
                defpackage.alad aladVar = zai.a;
                if (zaiVar.equals(aladVar)) {
                    zhj zhjVar3 = spnVar2.l;
                    if (zhjVar3 == null) {
                        zhjVar3 = zhj.a;
                    }
                    zag zagVar3 = zhjVar3.g;
                    if (zagVar3 == null) {
                        zagVar3 = zag.a;
                    }
                    defpackage.alad aladVar2 = zagVar3.c;
                    if (aladVar2 == null) {
                        aladVar2 = aladVar;
                    }
                    if (aladVar2.equals(aladVar)) {
                        z2 = false;
                    } else {
                        spa spaVar2 = spnVar2.n;
                        if (spaVar2 == null) {
                            spaVar2 = spa.a;
                        }
                        defpackage.alat alatVar2 = (spaVar2.c == 1 ? (sox) spaVar2.d : sox.a).c;
                        zhj zhjVar4 = spnVar2.l;
                        if (zhjVar4 == null) {
                            zhjVar4 = zhj.a;
                        }
                        zag zagVar4 = zhjVar4.g;
                        if (zagVar4 == null) {
                            zagVar4 = zag.a;
                        }
                        defpackage.alad aladVar3 = zagVar4.c;
                        if (aladVar3 != null) {
                            aladVar = aladVar3;
                        }
                        if (alatVar2.contains(((zai) aladVar).b)) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                    }
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
        }
        akzxVarM.u();
        kiw kiwVar22 = akzxVarM.b;
        kiwVar22.b |= 524288;
        kiwVar22.w = z2;
        if (sqlVar.m()) {
            spa spaVar3 = spnVar2.n;
            if (spaVar3 == null) {
                spaVar3 = spa.a;
            }
            soy soyVar = spaVar3.e;
            if (soyVar == null) {
                soyVar = soy.a;
            }
            zL = soyVar.c;
        } else {
            zL = sqlVar.l();
        }
        akzxVarM.u();
        kiw kiwVar23 = akzxVarM.b;
        kiwVar23.b |= 2097152;
        kiwVar23.y = zL;
        zhj zhjVar5 = spnVar2.l;
        if (zhjVar5 == null) {
            zhjVar5 = zhj.a;
        }
        zhi zhiVar2 = zhjVar5.h;
        if (zhiVar2 == null) {
            zhiVar2 = zhi.a;
        }
        if (zhiVar2.d && !sqlVar.l() && !sqlVar.m()) {
            z3 = true;
        }
        akzxVarM.u();
        kiw kiwVar24 = akzxVarM.b;
        kiwVar24.b |= 4194304;
        kiwVar24.z = z3;
        spa spaVar4 = spnVar2.n;
        if (spaVar4 == null) {
            spaVar4 = spa.a;
        }
        boolean z5 = !(spaVar4.c == 1 ? (sox) spaVar4.d : sox.a).b.isEmpty();
        akzxVarM.u();
        kiw kiwVar25 = akzxVarM.b;
        kiwVar25.b |= 8388608;
        kiwVar25.A = z5;
        spa spaVar5 = spnVar2.n;
        if (spaVar5 == null) {
            spaVar5 = spa.a;
        }
        boolean z6 = !(spaVar5.c == 1 ? (sox) spaVar5.d : sox.a).c.isEmpty();
        akzxVarM.u();
        kiw kiwVar26 = akzxVarM.b;
        kiwVar26.b |= 16777216;
        kiwVar26.B = z6;
        defpackage.nwy nwyVar = spnVar.r;
        if (nwyVar == null) {
            nwyVar = defpackage.nwy.a;
        }
        nwx nwxVarB = nwx.b(nwyVar.d);
        if (nwxVarB == null) {
            nwxVarB = nwx.d;
        }
        akzxVarM.u();
        kiw kiwVar27 = akzxVarM.b;
        kiwVar27.C = nwxVarB.a();
        kiwVar27.b |= 33554432;
        return akzxVarM;
    }

    public static void aL(defpackage.kkk kkkVar, boolean z, defpackage.cmw cmwVar, defpackage.kkd kkdVar, defpackage.cav cavVar, final int i) {
        int i2;
        final defpackage.kkd kkdVar2;
        final defpackage.cmw cmwVar2;
        final boolean z2;
        final defpackage.kkk kkkVar2;
        if (kkkVar == null) {
            defpackage.aooh.i("data");
        }
        if (kkdVar == null) {
            defpackage.aooh.i("$this$");
        }
        defpackage.cav cavVarB = cavVar.b(1457431688);
        if ((i & 6) == 0) {
            i2 = (true != ((i & 8) == 0 ? cavVarB.B(kkkVar) : cavVarB.D(kkkVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.C(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != ((i & 4096) == 0 ? cavVarB.B(kkdVar) : cavVarB.D(kkdVar)) ? 1024 : 2048;
        }
        if (cavVarB.H((i2 & 1171) != 1170, i2 & 1)) {
            kkdVar.d(kkkVar, z, cmwVar, cavVarB, i2 & 8190);
            kkdVar2 = kkdVar;
            kkkVar2 = kkkVar;
            z2 = z;
            cmwVar2 = cmwVar;
        } else {
            kkdVar2 = kkdVar;
            cmwVar2 = cmwVar;
            z2 = z;
            kkkVar2 = kkkVar;
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.aonn() { // from class: kkb
                @Override // defpackage.aonn
                public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                    defpackage.cav cavVar2 = (defpackage.cav) obj;
                    ((java.lang.Integer) obj2).intValue();
                    int i3 = i | 1;
                    int i4 = 306783378 & i3;
                    int i5 = 613566756 & i3;
                    defpackage.gus.aL(kkkVar2, z2, cmwVar2, kkdVar2, cavVar2, (i3 & (-920350135)) | i4 | (i5 >> 1) | ((i4 << 1) & i5));
                    return defpackage.aojh.a;
                }
            };
        }
    }

    public static /* bridge */ /* synthetic */ int aM(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    public static /* synthetic */ defpackage.kaw aN(defpackage.akzx akzxVar) {
        if (akzxVar == null) {
            defpackage.aooh.i("builder");
        }
        return new defpackage.kaw(akzxVar);
    }

    public static /* synthetic */ defpackage.kaw aO(defpackage.akzx akzxVar) {
        if (akzxVar == null) {
            defpackage.aooh.i("builder");
        }
        return new defpackage.kaw(akzxVar);
    }

    public static /* synthetic */ defpackage.kaw aP(defpackage.akzx akzxVar) {
        if (akzxVar == null) {
            defpackage.aooh.i("builder");
        }
        return new defpackage.kaw(akzxVar);
    }

    public static /* synthetic */ defpackage.kaw aQ(defpackage.akzx akzxVar) {
        if (akzxVar == null) {
            defpackage.aooh.i("builder");
        }
        return new defpackage.kaw(akzxVar);
    }

    public static /* synthetic */ defpackage.kaw aR(defpackage.akzx akzxVar) {
        if (akzxVar == null) {
            defpackage.aooh.i("builder");
        }
        return new defpackage.kaw(akzxVar);
    }

    public static /* synthetic */ defpackage.kaw aS(defpackage.akzx akzxVar) {
        if (akzxVar == null) {
            defpackage.aooh.i("builder");
        }
        return new defpackage.kaw(akzxVar);
    }

    public static defpackage.kaw aT(android.content.Context context) {
        if (context == null) {
            defpackage.aooh.i("context");
        }
        return new defpackage.kaw(defpackage.gol.a(context));
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, rkt] */
    /* JADX WARN: Type inference failed for: r4v3, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Iterable, java.lang.Object] */
    public static boolean aU(defpackage.ipc ipcVar, defpackage.rln rlnVar) {
        java.lang.Object obj;
        if (rlnVar == null) {
            defpackage.aooh.i("snapshot");
            defpackage.aooh.i("snapshot");
        }
        java.util.Iterator it = ipcVar.a.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            defpackage.gou gouVar = (defpackage.gou) it.next();
            if (rlnVar == null) {
                defpackage.aooh.i("snapshot");
            }
            java.lang.Object obj2 = gouVar.e;
            if (((defpackage.ipc) gouVar.d).bf() && ((java.lang.Boolean) gouVar.c.a()).booleanValue() && gouVar.b.a(rlnVar)) {
                obj = obj2;
            }
        } while (obj == null);
        if (obj == null) {
            return false;
        }
        ((java.lang.Boolean) obj).booleanValue();
        return true;
    }

    public static defpackage.gou aV(defpackage.ipc ipcVar, defpackage.aoin aoinVar, java.lang.Long l, defpackage.rkt rktVar) {
        if (aoinVar == null) {
            defpackage.aooh.i("rolloutFlag");
        }
        if (rktVar == null) {
            defpackage.aooh.i("condition");
        }
        return new defpackage.gou(ipcVar, aoinVar, l, rktVar, java.lang.Boolean.TRUE);
    }

    public static defpackage.rkt aa(defpackage.rkt... rktVarArr) {
        java.util.List listAsList = java.util.Arrays.asList(rktVarArr);
        defpackage.aooh.e(listAsList, "asList(...)");
        return new defpackage.rks(listAsList, 1, null);
    }

    public static defpackage.rkt ab(defpackage.rkt... rktVarArr) {
        java.util.List listAsList = java.util.Arrays.asList(rktVarArr);
        defpackage.aooh.e(listAsList, "asList(...)");
        return new defpackage.rks(listAsList, 0);
    }

    public static defpackage.rkt ac(defpackage.rkt rktVar) {
        if (rktVar == null) {
            defpackage.aooh.i("condition");
        }
        return new defpackage.rks(rktVar, 2);
    }

    public static android.content.res.Resources ad(android.content.Context context, j$.util.Optional optional) {
        android.content.res.Configuration configuration = new android.content.res.Configuration(context.getResources().getConfiguration());
        orq orqVar = new orq(configuration, 0);
        optional.isPresent();
        ((android.content.res.Configuration) orqVar.a).setLocale((java.util.Locale) optional.get());
        return context.createConfigurationContext(configuration).getResources();
    }

    public static java.util.Locale ae(android.content.Context context) {
        android.os.LocaleList localeListM = aa$.ExternalSyntheticApiModelOutline1.m(context.getResources().getConfiguration());
        return !aa$.ExternalSyntheticApiModelOutline1.m(localeListM) ? aa$.ExternalSyntheticApiModelOutline1.m(localeListM, 0) : java.util.Locale.getDefault();
    }

    public static void af(com.google.android.libraries.surveys.SurveyMetadata surveyMetadata, afiy afiyVar) {
        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.oqi.a.d()).i(defpackage.zct.b)).l("com/android/dialer/hats/DialerHatsEventProcessor$1", "onPresentSurveyFailed", 85, "DialerHatsEventProcessor.java")).M("HaTS survey failed to present due to %s: survey id = %s, trigger id = %s", afiyVar, surveyMetadata.b, surveyMetadata.a);
    }

    public static void ag(com.google.android.libraries.surveys.SurveyMetadata surveyMetadata) {
        ((defpackage.aimw) ((defpackage.aimw) defpackage.oqi.a.b()).l("com/android/dialer/hats/DialerHatsEventProcessor$1", "onSurveyClosed", 74, "DialerHatsEventProcessor.java")).I("HaTS survey was closed: survey id = %s, trigger id = %s.", surveyMetadata.b, surveyMetadata.a);
    }

    public static void ah(com.google.android.libraries.surveys.SurveyMetadata surveyMetadata) {
        ((defpackage.aimw) ((defpackage.aimw) defpackage.oqi.a.b()).l("com/android/dialer/hats/DialerHatsEventProcessor$1", "onSurveyPrompted", 67, "DialerHatsEventProcessor.java")).I("HaTS survey was prompted: survey id = %s, trigger id = %s.", surveyMetadata.b, surveyMetadata.a);
    }

    public static defpackage.gou ai(defpackage.rkt rktVar) {
        return new defpackage.gou(defpackage.rkw.c, new defpackage.rkv(4), (java.lang.Long) null, rktVar, java.lang.Boolean.TRUE);
    }

    public static boolean aj(defpackage.olv olvVar) {
        defpackage.alcf alcfVar = olvVar.d;
        if (alcfVar == null) {
            alcfVar = defpackage.alcf.a;
        }
        long j = defpackage.aldi.c(alcfVar, defpackage.aldi.e(j$.time.Instant.now().toEpochMilli())).b;
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.DAYS;
        return j > 432000;
    }

    public static nwx ak(com.google.android.gms.duokit.RemoteUserReachability remoteUserReachability) {
        int i;
        defpackage.aooh.f(remoteUserReachability, "<this>");
        int i2 = remoteUserReachability.b;
        if (i2 == 2 || (i = remoteUserReachability.c) == 2) {
            return nwx.c;
        }
        return (i2 == 1 || i == 1) ? nwx.b : nwx.a;
    }

    public static nsp al(android.database.Cursor cursor) {
        defpackage.aooh.f(cursor, "cursor");
        int columnIndex = cursor.getColumnIndex("call_creation_time_millis");
        int columnIndex2 = cursor.getColumnIndex("last_modified_millis");
        int columnIndex3 = cursor.getColumnIndex("data");
        if (columnIndex < 0) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.nri.a.c()).m(defpackage.aioa.MEDIUM)).i(defpackage.zct.b).l("com/android/dialer/dobby/impl/storage/DobbyDatabase$Companion", "buildDobbySessionData", 744, "DobbyDatabase.kt")).v("failed to find Column COLUMN_CALL_CREATION_TIME_MILLIS in cursor");
            return null;
        }
        if (columnIndex2 < 0) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.nri.a.c()).m(defpackage.aioa.MEDIUM)).i(defpackage.zct.b).l("com/android/dialer/dobby/impl/storage/DobbyDatabase$Companion", "buildDobbySessionData", 752, "DobbyDatabase.kt")).v("failed to find Column COLUMN_LAST_MODIFIED_TIMESTAMP_MILLIS in cursor");
            return null;
        }
        if (columnIndex3 < 0) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.nri.a.c()).m(defpackage.aioa.MEDIUM)).i(defpackage.zct.b).l("com/android/dialer/dobby/impl/storage/DobbyDatabase$Companion", "buildDobbySessionData", 760, "DobbyDatabase.kt")).v("failed to find Column COLUMN_DATA in cursor");
            return null;
        }
        long j = cursor.getLong(columnIndex);
        long j2 = cursor.getLong(columnIndex2);
        byte[] blob = cursor.getBlob(columnIndex3);
        try {
            defpackage.akzx akzxVarM = nsp.a.m();
            defpackage.aooh.f(akzxVarM, "builder");
            akzxVarM.u();
            akzxVarM.b.c = j;
            akzxVarM.u();
            akzxVarM.b.d = j2;
            nsq nsqVarB = defpackage.alad.B(nsq.a, blob, defpackage.akzq.a());
            defpackage.aooh.e(nsqVarB, "parseFrom(...)");
            defpackage.aooh.f(nsqVarB, "value");
            akzxVarM.u();
            nsp nspVar = akzxVarM.b;
            j$.util.Objects.requireNonNull(nsqVarB);
            nspVar.e = nsqVarB;
            nspVar.b |= 1;
            nsp nspVarP = akzxVarM.r();
            defpackage.aooh.e(nspVarP, "build(...)");
            return nspVarP;
        } catch (defpackage.alaz e) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.nri.a.c()).i(defpackage.zct.b)).k(e).l("com/android/dialer/dobby/impl/storage/DobbyDatabase$Companion", "buildDobbySessionData", 781, "DobbyDatabase.kt")).v("failed to deserialize DobbySessionDetails proto");
            return null;
        }
    }

    public static void am(java.lang.String str) {
        defpackage.aooh.f(str, "filePath");
        if (str.length() != 0) {
            java.io.File file = new java.io.File(str);
            if (!file.exists()) {
                ((defpackage.aimw) defpackage.nri.a.b().l("com/android/dialer/dobby/impl/storage/DobbyDatabase$Companion", "deleteFile", 879, "DobbyDatabase.kt")).y("file %s doesn't exist", file.getName());
            } else {
                if (file.delete()) {
                    return;
                }
                ((defpackage.aimw) ((defpackage.aimw) defpackage.nri.a.d()).i(defpackage.zct.b).l("com/android/dialer/dobby/impl/storage/DobbyDatabase$Companion", "deleteFile", 884, "DobbyDatabase.kt")).y("unable to delete file %s", file.getName());
            }
        }
    }

    public static nsq an(nsp nspVar, nsq nsqVar) {
        defpackage.aooh.f(nsqVar, "source");
        if (nspVar == null) {
            return nsqVar;
        }
        nsq nsqVar2 = nspVar.e;
        if (nsqVar2 == null) {
            nsqVar2 = nsq.a;
        }
        defpackage.aooh.e(nsqVar2, "getData(...)");
        npw npwVarAn = defpackage.mni.an(nsqVar2.L());
        if ((nsqVar.b & 4) != 0) {
            nsl nslVar = nsqVar.e;
            if (nslVar == null) {
                nslVar = nsl.a;
            }
            defpackage.aooh.e(nslVar, "getAudioInfo(...)");
            npwVarAn.n(nslVar);
        }
        if ((nsqVar.b & 1) != 0) {
            nso nsoVar = nsqVar.c;
            if (nsoVar == null) {
                nsoVar = nso.a;
            }
            defpackage.aooh.e(nsoVar, "getLogsInfo(...)");
            npwVarAn.p(nsoVar);
        }
        if ((nsqVar.b & 2) != 0) {
            nss nssVar = nsqVar.d;
            if (nssVar == null) {
                nssVar = nss.a;
            }
            defpackage.aooh.e(nssVar, "getTranscriptInfo(...)");
            npwVarAn.q(nssVar);
        }
        if ((nsqVar.b & 8) != 0) {
            nsm nsmVar = ((defpackage.akzx) npwVarAn.a).b.f;
            if (nsmVar == null) {
                nsmVar = nsm.a;
            }
            defpackage.aooh.e(nsmVar, "getExtraData(...)");
            defpackage.akzx akzxVarP = nsmVar.L();
            nsm nsmVar2 = nsqVar.f;
            if (nsmVar2 == null) {
                nsmVar2 = nsm.a;
            }
            akzxVarP.z(nsmVar2);
            nsm nsmVarP = akzxVarP.r();
            defpackage.aooh.e(nsmVarP, "build(...)");
            npwVarAn.o(nsmVarP);
        }
        return npwVarAn.l();
    }

    public static void ao(java.util.List list, int i) {
        defpackage.aooh.f(list, "dobbySessionDataList");
        int i2 = i - 1;
        if (i2 == 0) {
            java.util.ArrayList<nsp> arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                nsq nsqVar = ((nsp) obj).e;
                if (nsqVar == null) {
                    nsqVar = nsq.a;
                }
                if ((nsqVar.b & 1) != 0) {
                    arrayList.add(obj);
                }
            }
            for (nsp nspVar : arrayList) {
                defpackage.aimz aimzVar = defpackage.nri.a;
                nsq nsqVar2 = nspVar.e;
                if (nsqVar2 == null) {
                    nsqVar2 = nsq.a;
                }
                nso nsoVar = nsqVar2.c;
                if (nsoVar == null) {
                    nsoVar = nso.a;
                }
                java.lang.String str = nsoVar.b;
                defpackage.aooh.e(str, "getLogPath(...)");
                am(str);
            }
            return;
        }
        if (i2 != 1) {
            java.util.ArrayList<nsp> arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj2 : list) {
                nsq nsqVar3 = ((nsp) obj2).e;
                if (nsqVar3 == null) {
                    nsqVar3 = nsq.a;
                }
                if ((nsqVar3.b & 2) != 0) {
                    arrayList2.add(obj2);
                }
            }
            for (nsp nspVar2 : arrayList2) {
                defpackage.aimz aimzVar2 = defpackage.nri.a;
                nsq nsqVar4 = nspVar2.e;
                if (nsqVar4 == null) {
                    nsqVar4 = nsq.a;
                }
                nss nssVar = nsqVar4.d;
                if (nssVar == null) {
                    nssVar = nss.a;
                }
                java.lang.String str2 = nssVar.c;
                defpackage.aooh.e(str2, "getTranscriptPath(...)");
                am(str2);
            }
            return;
        }
        java.util.ArrayList<nsp> arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj3 : list) {
            nsq nsqVar5 = ((nsp) obj3).e;
            if (nsqVar5 == null) {
                nsqVar5 = nsq.a;
            }
            if ((nsqVar5.b & 4) != 0) {
                arrayList3.add(obj3);
            }
        }
        for (nsp nspVar3 : arrayList3) {
            defpackage.aimz aimzVar3 = defpackage.nri.a;
            nsq nsqVar6 = nspVar3.e;
            if (nsqVar6 == null) {
                nsqVar6 = nsq.a;
            }
            nsl nslVar = nsqVar6.e;
            if (nslVar == null) {
                nslVar = nsl.a;
            }
            java.lang.String str3 = nslVar.c;
            defpackage.aooh.e(str3, "getAudioPath(...)");
            am(str3);
        }
    }

    public static nsq ap(nsp nspVar, nsm nsmVar) {
        defpackage.aooh.f(nsmVar, "newExtraData");
        npw npwVarAn = defpackage.mni.an(nsq.a.m());
        npwVarAn.o(nsmVar);
        return an(nspVar, npwVarAn.l());
    }

    public static defpackage.aify aq(defpackage.adag adagVar, java.lang.String str, long j) throws java.io.IOException {
        defpackage.aooh.f(str, "queryFormat");
        defpackage.adag adagVar2 = new defpackage.adag((byte[]) null);
        adagVar2.n(str);
        adagVar2.o(java.lang.Long.valueOf(j));
        defpackage.adag adagVarB = adagVar2.B();
        defpackage.aift aiftVar = new defpackage.aift(4);
        android.database.Cursor cursorY = adagVar.y(adagVarB);
        while (cursorY.moveToNext()) {
            try {
                defpackage.aimz aimzVar = defpackage.nri.a;
                defpackage.aooh.c(cursorY);
                nsp nspVarAl = al(cursorY);
                if (nspVarAl != null) {
                    aiftVar.i(nspVarAl);
                }
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    defpackage.ajsz.ak(cursorY, th);
                    throw th2;
                }
            }
        }
        defpackage.ajsz.ak(cursorY, null);
        defpackage.aify aifyVarH = aiftVar.g();
        defpackage.aooh.e(aifyVarH, "build(...)");
        return aifyVarH;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static defpackage.aify ar(defpackage.adag adagVar, java.util.List list) throws java.io.IOException {
        defpackage.aooh.f(list, "callCreationTimeList");
        defpackage.aift aiftVar = new defpackage.aift(4);
        defpackage.aooh.f(list, "callCreationTimeList");
        defpackage.aift aiftVar2 = new defpackage.aift(4);
        for (java.util.List list2 : defpackage.ahvr.bf(list, 999)) {
            defpackage.adag adagVar2 = new defpackage.adag((byte[]) null);
            adagVar2.n("SELECT * FROM dobby_session WHERE call_creation_time_millis IN (?");
            adagVar2.o((java.lang.Long) list2.get(0));
            int size = list2.size();
            for (int i = 1; i < size; i++) {
                adagVar2.n(", ?");
                adagVar2.o((java.lang.Long) list2.get(i));
            }
            adagVar2.n(")");
            aiftVar2.i(adagVar2.B());
        }
        defpackage.aify aifyVarH = aiftVar2.g();
        defpackage.aooh.e(aifyVarH, "build(...)");
        defpackage.ailk ailkVarY = aifyVarH.listIterator(0);
        defpackage.aooh.e(ailkVarY, "iterator(...)");
        while (ailkVarY.hasNext()) {
            android.database.Cursor cursorY = adagVar.y((defpackage.adag) ailkVarY.next());
            while (cursorY.moveToNext()) {
                try {
                    defpackage.aimz aimzVar = defpackage.nri.a;
                    defpackage.aooh.c(cursorY);
                    nsp nspVarAl = al(cursorY);
                    if (nspVarAl != null) {
                        aiftVar.i(nspVarAl);
                    }
                } catch (java.lang.Throwable th) {
                    try {
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        defpackage.ajsz.ak(cursorY, th);
                        throw th2;
                    }
                }
            }
            defpackage.ajsz.ak(cursorY, null);
        }
        defpackage.aify aifyVarH2 = aiftVar.g();
        defpackage.aooh.e(aifyVarH2, "build(...)");
        return aifyVarH2;
    }

    public static nsp as(defpackage.adag adagVar, long j) throws java.io.IOException {
        defpackage.adag adagVar2 = new defpackage.adag((byte[]) null);
        adagVar2.n(defpackage.nri.c);
        adagVar2.o(java.lang.Long.valueOf(j));
        android.database.Cursor cursorY = adagVar.y(adagVar2.B());
        nsp nspVarAl = null;
        while (cursorY.moveToNext()) {
            try {
                defpackage.aooh.c(cursorY);
                nspVarAl = al(cursorY);
                if (nspVarAl != null) {
                    break;
                }
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    defpackage.ajsz.ak(cursorY, th);
                    throw th2;
                }
            }
        }
        defpackage.ajsz.ak(cursorY, null);
        return nspVarAl;
    }

    public static defpackage.mhc at(float f) {
        defpackage.akzx akzxVarM = defpackage.mhc.a.m();
        akzxVarM.u();
        defpackage.mhc mhcVar = (defpackage.mhc) akzxVarM.b;
        mhcVar.b = 4;
        mhcVar.c = java.lang.Float.valueOf(f);
        defpackage.alad aladVarP = akzxVarM.r();
        defpackage.aooh.e(aladVarP, "build(...)");
        return (defpackage.mhc) aladVarP;
    }

    public static defpackage.mhc au(int i) {
        defpackage.akzx akzxVarM = defpackage.mhc.a.m();
        akzxVarM.u();
        defpackage.mhc mhcVar = (defpackage.mhc) akzxVarM.b;
        mhcVar.b = 3;
        mhcVar.c = java.lang.Long.valueOf(i);
        defpackage.alad aladVarP = akzxVarM.r();
        defpackage.aooh.e(aladVarP, "build(...)");
        return (defpackage.mhc) aladVarP;
    }

    public static defpackage.mhc av(long j) {
        defpackage.akzx akzxVarM = defpackage.mhc.a.m();
        akzxVarM.u();
        defpackage.mhc mhcVar = (defpackage.mhc) akzxVarM.b;
        mhcVar.b = 3;
        mhcVar.c = java.lang.Long.valueOf(j);
        defpackage.alad aladVarP = akzxVarM.r();
        defpackage.aooh.e(aladVarP, "build(...)");
        return (defpackage.mhc) aladVarP;
    }

    public static defpackage.mhc aw(java.lang.String str) {
        defpackage.akzx akzxVarM = defpackage.mhc.a.m();
        if (str == null) {
            defpackage.aooh.g();
        }
        akzxVarM.u();
        defpackage.mhc mhcVar = (defpackage.mhc) akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        mhcVar.b = 2;
        mhcVar.c = str;
        defpackage.alad aladVarP = akzxVarM.r();
        defpackage.aooh.e(aladVarP, "build(...)");
        return (defpackage.mhc) aladVarP;
    }

    public static defpackage.mhc ax(boolean z) {
        defpackage.akzx akzxVarM = defpackage.mhc.a.m();
        akzxVarM.u();
        defpackage.mhc mhcVar = (defpackage.mhc) akzxVarM.b;
        mhcVar.b = 1;
        mhcVar.c = java.lang.Boolean.valueOf(z);
        defpackage.alad aladVarP = akzxVarM.r();
        defpackage.aooh.e(aladVarP, "build(...)");
        return (defpackage.mhc) aladVarP;
    }

    public static defpackage.mhc ay(java.util.List list) {
        defpackage.akzx akzxVarM = defpackage.mhc.a.m();
        defpackage.akzx akzxVarM2 = defpackage.mha.a.m();
        if (list == null) {
            defpackage.aooh.g();
        }
        akzxVarM2.K(list);
        akzxVarM.u();
        defpackage.mhc mhcVar = (defpackage.mhc) akzxVarM.b;
        defpackage.mha mhaVar = (defpackage.mha) akzxVarM2.r();
        j$.util.Objects.requireNonNull(mhaVar);
        mhcVar.c = mhaVar;
        mhcVar.b = 6;
        defpackage.alad aladVarP = akzxVarM.r();
        defpackage.aooh.e(aladVarP, "build(...)");
        return (defpackage.mhc) aladVarP;
    }

    public static defpackage.mhc az(defpackage.mhc... mhcVarArr) {
        defpackage.akzx akzxVarM = defpackage.mhc.a.m();
        defpackage.akzx akzxVarM2 = defpackage.mha.a.m();
        akzxVarM2.K(java.util.Arrays.asList(java.util.Arrays.copyOf(mhcVarArr, mhcVarArr.length)));
        akzxVarM.u();
        defpackage.mhc mhcVar = (defpackage.mhc) akzxVarM.b;
        defpackage.mha mhaVar = (defpackage.mha) akzxVarM2.r();
        j$.util.Objects.requireNonNull(mhaVar);
        mhcVar.c = mhaVar;
        mhcVar.b = 6;
        defpackage.alad aladVarP = akzxVarM.r();
        defpackage.aooh.e(aladVarP, "build(...)");
        return (defpackage.mhc) aladVarP;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        if (r18 >= r8) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long b(boolean r3, int r4, defpackage.grj r5, long r6, long r8, int r10, boolean r11, long r12, long r14, long r16, long r18) {
        /*
            if (r5 != 0) goto L7
            java.lang.String r0 = "backoffPolicy"
            defpackage.aooh.i(r0)
        L7:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r2 = (r18 > r0 ? 1 : (r18 == r0 ? 0 : -1))
            if (r2 == 0) goto L1f
            if (r11 == 0) goto L1f
            if (r10 == 0) goto L1c
            r3 = 900000(0xdbba0, double:4.44659E-318)
            long r8 = r8 + r3
            int r3 = (r18 > r8 ? 1 : (r18 == r8 ? 0 : -1))
            if (r3 < 0) goto L4e
        L1c:
            r3 = r18
            goto L5a
        L1f:
            if (r3 == 0) goto L3b
            grj r3 = defpackage.grj.b
            if (r5 != r3) goto L28
            long r3 = (long) r4
            long r6 = r6 * r3
            goto L30
        L28:
            float r3 = (float) r6
            int r4 = r4 + (-1)
            float r3 = java.lang.Math.scalb(r3, r4)
            long r6 = (long) r3
        L30:
            r3 = 18000000(0x112a880, double:8.8931816E-317)
            int r5 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r5 <= 0) goto L38
            r6 = r3
        L38:
            long r3 = r8 + r6
            goto L5a
        L3b:
            if (r11 == 0) goto L50
            if (r10 != 0) goto L42
            long r8 = r8 + r12
            r10 = 0
            goto L44
        L42:
            long r8 = r8 + r16
        L44:
            int r3 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r3 == 0) goto L4e
            if (r10 != 0) goto L4e
            long r3 = r16 - r14
            long r3 = r3 + r8
            goto L5a
        L4e:
            r3 = r8
            goto L5a
        L50:
            r3 = -1
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 != 0) goto L58
            r3 = r0
            goto L5a
        L58:
            long r3 = r8 + r12
        L5a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gus.b(boolean, int, grj, long, long, int, boolean, long, long, long, long):long");
    }

    public static java.util.List c(defpackage.gwn gwnVar, java.lang.String str) {
        if (gwnVar == null) {
            defpackage.aooh.i("<this>");
        }
        if (str == null) {
            defpackage.aooh.i("id");
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.List listA = gwnVar.a(str);
        if (listA == null) {
            defpackage.aooh.i("<this>");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(listA);
        while (!arrayList.isEmpty()) {
            if (arrayList.isEmpty()) {
                throw new java.util.NoSuchElementException("List is empty.");
            }
            java.lang.String str2 = (java.lang.String) arrayList.remove(arrayList.size() - 1);
            linkedHashSet.add(str2);
            arrayList.addAll(gwnVar.a(str2));
        }
        return defpackage.ajsz.bZ(linkedHashSet);
    }

    public static defpackage.gxl d(defpackage.gxl gxlVar) {
        if (gxlVar == null) {
            defpackage.aooh.i("workSpec");
        }
        boolean zE = gxlVar.f.e("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", java.lang.String.class);
        boolean zE2 = gxlVar.f.e("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME", java.lang.String.class);
        boolean zE3 = gxlVar.f.e("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME", java.lang.String.class);
        if (zE || !zE2 || !zE3) {
            return gxlVar;
        }
        java.lang.String str = gxlVar.d;
        defpackage.ipc ipcVar = new defpackage.ipc((char[]) null);
        ipcVar.r(gxlVar.f);
        ipcVar.x("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", str);
        return defpackage.gxl.e(gxlVar, null, null, "androidx.work.multiprocess.RemoteListenableDelegatingWorker", ipcVar.q(), 0, 0L, 0, 0, 0L, 0, 33554411);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public static defpackage.gso e(java.util.UUID uuid, defpackage.guq guqVar) {
        defpackage.aooh.f(uuid, "id");
        defpackage.gus gusVar = guqVar.d.r;
        ?? r1 = guqVar.k.e;
        defpackage.aooh.e(r1, "getSerialTaskExecutor(...)");
        return S(gusVar, "CancelWorkById", r1, new bxq(guqVar, uuid, 20, (byte[]) null));
    }

    public static void f(defpackage.guq guqVar, java.lang.String str) {
        defpackage.gve gveVarA;
        androidx.work.impl.WorkDatabase workDatabase = guqVar.e;
        defpackage.aooh.e(workDatabase, "getWorkDatabase(...)");
        defpackage.gxm gxmVarD = workDatabase.D();
        defpackage.gwn gwnVarX = workDatabase.x();
        java.util.ArrayList arrayList = new java.util.ArrayList(new defpackage.aojv(new java.lang.String[]{str}, true));
        arrayList.addAll(c(gwnVarX, str));
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            defpackage.gsw gswVarB = gxmVarD.b((java.lang.String) next);
            if (gswVarB != null ? !gswVarB.a() : false) {
                arrayList2.add(next);
            }
        }
        defpackage.gxm gxmVarD2 = guqVar.e.D();
        java.util.Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            gxmVarD2.z((java.lang.String) it2.next());
        }
        defpackage.gtr gtrVar = guqVar.g;
        defpackage.aooh.e(gtrVar, "getProcessor(...)");
        synchronized (gtrVar.l) {
            defpackage.gsh.a().c(defpackage.gtr.a, defpackage.a.bx(str, "Processor cancelling "));
            gtrVar.i.add(str);
            gveVarA = gtrVar.a(str);
        }
        defpackage.gtr.e(str, gveVarA, 1);
        java.util.ListIterator listIterator = ((defpackage.aokv) guqVar.f).listIterator(0);
        while (listIterator.hasNext()) {
            ((defpackage.gtt) listIterator.next()).b(str);
        }
    }

    public static void g(java.lang.String str, defpackage.guq guqVar) {
        if (str == null) {
            defpackage.aooh.i("name");
        }
        androidx.work.impl.WorkDatabase workDatabase = guqVar.e;
        defpackage.aooh.e(workDatabase, "getWorkDatabase(...)");
        workDatabase.p(new defpackage.gsb(workDatabase, str, guqVar, 5, (byte[]) null));
    }

    public static void h(defpackage.guq guqVar) {
        defpackage.gtv.a(guqVar.d, guqVar.e, guqVar.f);
    }

    public static int i(defpackage.grj grjVar) {
        if (grjVar == null) {
            defpackage.aooh.i("backoffPolicy");
        }
        int iOrdinal = grjVar.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        if (iOrdinal != 1) {
            throw new defpackage.aois();
        }
        return 1;
    }

    public static int j(defpackage.gsi gsiVar) {
        if (gsiVar == null) {
            defpackage.aooh.i("networkType");
        }
        int iOrdinal = gsiVar.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        if (iOrdinal == 1) {
            return 1;
        }
        if (iOrdinal == 2) {
            return 2;
        }
        if (iOrdinal == 3) {
            return 3;
        }
        if (iOrdinal == 4) {
            return 4;
        }
        if (gsiVar == defpackage.gsi.f) {
            return 5;
        }
        throw new java.lang.IllegalArgumentException(defpackage.a.bg(gsiVar, "Could not convert ", " to int"));
    }

    public static int k(defpackage.gss gssVar) {
        if (gssVar == null) {
            defpackage.aooh.i("policy");
        }
        int iOrdinal = gssVar.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        if (iOrdinal != 1) {
            throw new defpackage.aois();
        }
        return 1;
    }

    public static int l(defpackage.gsw gswVar) {
        if (gswVar == null) {
            defpackage.aooh.i("state");
        }
        int iOrdinal = gswVar.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        if (iOrdinal == 1) {
            return 1;
        }
        if (iOrdinal == 2) {
            return 2;
        }
        if (iOrdinal == 3) {
            return 3;
        }
        if (iOrdinal == 4) {
            return 4;
        }
        if (iOrdinal != 5) {
            throw new defpackage.aois();
        }
        return 5;
    }

    public static defpackage.grj m(int i) {
        if (i == 0) {
            return defpackage.grj.a;
        }
        if (i == 1) {
            return defpackage.grj.b;
        }
        throw new java.lang.IllegalArgumentException(defpackage.a.bs(i, "Could not convert ", " to BackoffPolicy"));
    }

    public static defpackage.gsi n(int i) {
        if (i == 0) {
            return defpackage.gsi.a;
        }
        if (i == 1) {
            return defpackage.gsi.b;
        }
        if (i == 2) {
            return defpackage.gsi.c;
        }
        if (i == 3) {
            return defpackage.gsi.d;
        }
        if (i == 4) {
            return defpackage.gsi.e;
        }
        if (i == 5) {
            return defpackage.gsi.f;
        }
        throw new java.lang.IllegalArgumentException(defpackage.a.bs(i, "Could not convert ", " to NetworkType"));
    }

    public static defpackage.gss o(int i) {
        if (i == 0) {
            return defpackage.gss.a;
        }
        if (i == 1) {
            return defpackage.gss.b;
        }
        throw new java.lang.IllegalArgumentException(defpackage.a.bs(i, "Could not convert ", " to OutOfQuotaPolicy"));
    }

    public static defpackage.gsw p(int i) {
        if (i == 0) {
            return defpackage.gsw.a;
        }
        if (i == 1) {
            return defpackage.gsw.b;
        }
        if (i == 2) {
            return defpackage.gsw.c;
        }
        if (i == 3) {
            return defpackage.gsw.d;
        }
        if (i == 4) {
            return defpackage.gsw.e;
        }
        if (i == 5) {
            return defpackage.gsw.f;
        }
        throw new java.lang.IllegalArgumentException(defpackage.a.bs(i, "Could not convert ", " to State"));
    }

    public static defpackage.gyf q(byte[] bArr) throws java.io.IOException {
        if (bArr == null) {
            defpackage.aooh.i("bytes");
        }
        if (bArr.length == 0) {
            return new defpackage.gyf(null);
        }
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
        try {
            java.io.ObjectInputStream objectInputStream = new java.io.ObjectInputStream(byteArrayInputStream);
            try {
                int i = objectInputStream.readInt();
                int[] iArr = new int[i];
                for (int i2 = 0; i2 < i; i2++) {
                    iArr[i2] = objectInputStream.readInt();
                }
                int i3 = objectInputStream.readInt();
                int[] iArr2 = new int[i3];
                for (int i4 = 0; i4 < i3; i4++) {
                    iArr2[i4] = objectInputStream.readInt();
                }
                int[] iArr3 = defpackage.gye.a;
                android.net.NetworkRequest.Builder builder = new android.net.NetworkRequest.Builder();
                for (int i5 = 0; i5 < i3; i5++) {
                    int i6 = iArr2[i5];
                    try {
                        builder.addCapability(i6);
                    } catch (java.lang.IllegalArgumentException e) {
                        defpackage.gsh.a();
                        android.util.Log.w(defpackage.gyf.a, defpackage.a.bw((byte) 39, i6, "Ignoring adding capability '"), e);
                    }
                }
                for (int i7 : defpackage.gye.a) {
                    if (defpackage.ajsz.cI(iArr2, i7) < 0) {
                        try {
                            builder.removeCapability(i7);
                        } catch (java.lang.IllegalArgumentException e2) {
                            defpackage.gsh.a();
                            android.util.Log.w(defpackage.gyf.a, defpackage.a.bw((byte) 39, i7, "Ignoring removing default capability '"), e2);
                        }
                    }
                }
                for (int i8 = 0; i8 < i; i8++) {
                    builder.addTransportType(iArr[i8]);
                }
                android.net.NetworkRequest networkRequestBuild = builder.build();
                defpackage.aooh.e(networkRequestBuild, "build(...)");
                defpackage.gyf gyfVar = new defpackage.gyf(networkRequestBuild);
                objectInputStream.close();
                byteArrayInputStream.close();
                return gyfVar;
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    try {
                        objectInputStream.close();
                    } catch (java.lang.Throwable th3) {
                        aoil.b(th, th3);
                    }
                    throw th2;
                }
            }
        } catch (java.lang.Throwable th4) {
            try {
                throw th4;
            } catch (java.lang.Throwable th5) {
                try {
                    byteArrayInputStream.close();
                } catch (java.lang.Throwable th6) {
                    aoil.b(th4, th6);
                }
                throw th5;
            }
        }
    }

    public static java.util.Set r(byte[] bArr) throws java.io.IOException {
        if (bArr == null) {
            defpackage.aooh.i("bytes");
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        if (bArr.length != 0) {
            java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
            try {
                try {
                    java.io.ObjectInputStream objectInputStream = new java.io.ObjectInputStream(byteArrayInputStream);
                    try {
                        int i = objectInputStream.readInt();
                        for (int i2 = 0; i2 < i; i2++) {
                            android.net.Uri uri = android.net.Uri.parse(objectInputStream.readUTF());
                            boolean z = objectInputStream.readBoolean();
                            if (uri == null) {
                                defpackage.aooh.g();
                            }
                            linkedHashSet.add(new grm(uri, z));
                        }
                        objectInputStream.close();
                    } catch (java.lang.Throwable th) {
                        try {
                            throw th;
                        } catch (java.lang.Throwable th2) {
                            try {
                                objectInputStream.close();
                            } catch (java.lang.Throwable th3) {
                                aoil.b(th, th3);
                            }
                            throw th2;
                        }
                    }
                } catch (java.lang.Throwable th4) {
                    try {
                        throw th4;
                    } catch (java.lang.Throwable th5) {
                        try {
                            byteArrayInputStream.close();
                        } catch (java.lang.Throwable th6) {
                            aoil.b(th4, th6);
                        }
                        throw th5;
                    }
                }
            } catch (java.io.IOException e) {
                e.printStackTrace();
            }
            byteArrayInputStream.close();
        }
        return linkedHashSet;
    }

    public static byte[] s(defpackage.gyf gyfVar) throws java.io.IOException {
        int[] iArrCm;
        if (gyfVar == null) {
            defpackage.aooh.i("requestCompat");
        }
        java.lang.Object obj = gyfVar.b;
        if (obj == null) {
            return new byte[0];
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            java.io.ObjectOutputStream objectOutputStream = new java.io.ObjectOutputStream(byteArrayOutputStream);
            try {
                if (android.os.Build.VERSION.SDK_INT >= 31) {
                    iArrCm = mp$.ExternalSyntheticApiModelOutline0.m((android.net.NetworkRequest) obj);
                    defpackage.aooh.e(iArrCm, "getTransportTypes(...)");
                } else {
                    int[] iArr = {2, 0, 3, 6, 10, 9, 8, 4, 1, 5};
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (int i = 0; i < 10; i++) {
                        int i2 = iArr[i];
                        int[] iArr2 = defpackage.gye.a;
                        if (ft$.ExternalSyntheticApiModelOutline0.m((android.net.NetworkRequest) obj, i2)) {
                            arrayList.add(java.lang.Integer.valueOf(i2));
                        }
                    }
                    iArrCm = defpackage.ajsz.cm(arrayList);
                }
                int[] iArrN = defpackage.kcq.N((android.net.NetworkRequest) obj);
                objectOutputStream.writeInt(iArrCm.length);
                for (int i3 : iArrCm) {
                    objectOutputStream.writeInt(i3);
                }
                objectOutputStream.writeInt(iArrN.length);
                for (int i4 : iArrN) {
                    objectOutputStream.writeInt(i4);
                }
                objectOutputStream.close();
                byteArrayOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                defpackage.aooh.e(byteArray, "toByteArray(...)");
                return byteArray;
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    try {
                        objectOutputStream.close();
                    } catch (java.lang.Throwable th3) {
                        aoil.b(th, th3);
                    }
                    throw th2;
                }
            }
        } catch (java.lang.Throwable th4) {
            try {
                throw th4;
            } catch (java.lang.Throwable th5) {
                try {
                    byteArrayOutputStream.close();
                } catch (java.lang.Throwable th6) {
                    aoil.b(th4, th6);
                }
                throw th5;
            }
        }
    }

    public static byte[] t(java.util.Set set) throws java.io.IOException {
        if (set == null) {
            defpackage.aooh.i("triggers");
        }
        if (set.isEmpty()) {
            return new byte[0];
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            java.io.ObjectOutputStream objectOutputStream = new java.io.ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(set.size());
                java.util.Iterator it = set.iterator();
                while (it.hasNext()) {
                    grm grmVar = (grm) it.next();
                    objectOutputStream.writeUTF(grmVar.a.toString());
                    objectOutputStream.writeBoolean(grmVar.b);
                }
                objectOutputStream.close();
                byteArrayOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                defpackage.aooh.e(byteArray, "toByteArray(...)");
                return byteArray;
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    try {
                        objectOutputStream.close();
                    } catch (java.lang.Throwable th3) {
                        aoil.b(th, th3);
                    }
                    throw th2;
                }
            }
        } catch (java.lang.Throwable th4) {
            try {
                throw th4;
            } catch (java.lang.Throwable th5) {
                try {
                    byteArrayOutputStream.close();
                } catch (java.lang.Throwable th6) {
                    aoil.b(th4, th6);
                }
                throw th5;
            }
        }
    }

    public static defpackage.gxd u(defpackage.gxl gxlVar) {
        if (gxlVar == null) {
            defpackage.aooh.i("<this>");
        }
        return new defpackage.gxd(gxlVar.b, gxlVar.u);
    }

    public static java.io.File v(android.content.Context context) {
        if (context == null) {
            defpackage.aooh.i("context");
        }
        java.io.File databasePath = context.getDatabasePath("androidx.work.workdb");
        defpackage.aooh.e(databasePath, "getDatabasePath(...)");
        return databasePath;
    }

    public static defpackage.gsy w(android.content.Context context) {
        if (context == null) {
            defpackage.aooh.i("context");
        }
        return defpackage.guq.h(context);
    }

    public static defpackage.ajcq x(final java.util.concurrent.Executor executor, final java.lang.String str, final defpackage.aomy aomyVar) {
        defpackage.aooh.f(executor, "<this>");
        return defpackage.dff.m(new defpackage.dsf() { // from class: grz
            @Override // defpackage.dsf
            public final java.lang.Object a(defpackage.dsd dsdVar) {
                java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(false);
                dsdVar.a(new defpackage.ddv(atomicBoolean, 7), defpackage.gru.a);
                executor.execute(new defpackage.gsb(atomicBoolean, dsdVar, aomyVar, 0));
                return str;
            }
        });
    }

    public static defpackage.ajcq y(final defpackage.aolr aolrVar, int i, final defpackage.aonn aonnVar) {
        if (aolrVar == null) {
            defpackage.aooh.i("context");
        }
        final int i2 = 1;
        return defpackage.dff.m(new defpackage.dsf(i2, aonnVar) { // from class: gsa
            public final /* synthetic */ defpackage.aonn b;
            public final /* synthetic */ int c = 1;

            {
                this.b = aonnVar;
            }

            @Override // defpackage.dsf
            public final java.lang.Object a(defpackage.dsd dsdVar) {
                defpackage.aolr aolrVar2 = this.a;
                dsdVar.a(new defpackage.ddv((defpackage.aoub) aolrVar2.get(defpackage.aoub.d), 8), defpackage.gru.a);
                return defpackage.aoov.an(defpackage.aosv.n(aolrVar2), null, 1, new defpackage.fzq(this.b, dsdVar, (defpackage.aoln) null, 3), 1);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static defpackage.grp z(byte[] bArr) {
        if (bArr == null) {
            defpackage.aooh.i("bytes");
        }
        int length = bArr.length;
        if (length > 10240) {
            throw new java.lang.IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        }
        if (length == 0) {
            return defpackage.grp.a;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        try {
            java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
            byte[] bArr2 = new byte[2];
            byteArrayInputStream.read(bArr2);
            boolean z = bArr2[0] == -84 && bArr2[1] == -19;
            byteArrayInputStream.reset();
            if (z) {
                java.io.ObjectInputStream objectInputStream = new java.io.ObjectInputStream(byteArrayInputStream);
                try {
                    int i = objectInputStream.readInt();
                    for (int i2 = 0; i2 < i; i2++) {
                        linkedHashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                    }
                    objectInputStream.close();
                } catch (java.lang.Throwable th) {
                    try {
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        try {
                            objectInputStream.close();
                        } catch (java.lang.Throwable th3) {
                            aoil.b(th, th3);
                        }
                        throw th2;
                    }
                }
            } else {
                java.io.DataInputStream dataInputStream = new java.io.DataInputStream(byteArrayInputStream);
                try {
                    short s = dataInputStream.readShort();
                    if (s != -21521) {
                        throw new java.lang.IllegalStateException(defpackage.a.bj(s, "Magic number doesn't match: "));
                    }
                    short s2 = dataInputStream.readShort();
                    if (s2 != 1) {
                        throw new java.lang.IllegalStateException(defpackage.a.bj(s2, "Unsupported version number: "));
                    }
                    int i3 = dataInputStream.readInt();
                    for (int i4 = 0; i4 < i3; i4++) {
                        byte b = dataInputStream.readByte();
                        java.lang.Object utf = null;
                        if (b != 0) {
                            if (b == 1) {
                                utf = java.lang.Boolean.valueOf(dataInputStream.readBoolean());
                            } else if (b == 2) {
                                utf = java.lang.Byte.valueOf(dataInputStream.readByte());
                            } else if (b == 3) {
                                utf = java.lang.Integer.valueOf(dataInputStream.readInt());
                            } else if (b == 4) {
                                utf = java.lang.Long.valueOf(dataInputStream.readLong());
                            } else if (b == 5) {
                                utf = java.lang.Float.valueOf(dataInputStream.readFloat());
                            } else if (b == 6) {
                                utf = java.lang.Double.valueOf(dataInputStream.readDouble());
                            } else if (b == 7) {
                                utf = dataInputStream.readUTF();
                            } else if (b == 8) {
                                int i5 = dataInputStream.readInt();
                                java.lang.Boolean[] boolArr = new java.lang.Boolean[i5];
                                for (int i6 = 0; i6 < i5; i6++) {
                                    boolArr[i6] = java.lang.Boolean.valueOf(dataInputStream.readBoolean());
                                }
                                utf = (java.io.Serializable) boolArr;
                            } else if (b == 9) {
                                int i7 = dataInputStream.readInt();
                                java.lang.Byte[] bArr3 = new java.lang.Byte[i7];
                                for (int i8 = 0; i8 < i7; i8++) {
                                    bArr3[i8] = java.lang.Byte.valueOf(dataInputStream.readByte());
                                }
                                utf = (java.io.Serializable) bArr3;
                            } else if (b == 10) {
                                int i9 = dataInputStream.readInt();
                                java.lang.Integer[] numArr = new java.lang.Integer[i9];
                                for (int i10 = 0; i10 < i9; i10++) {
                                    numArr[i10] = java.lang.Integer.valueOf(dataInputStream.readInt());
                                }
                                utf = (java.io.Serializable) numArr;
                            } else if (b == 11) {
                                int i11 = dataInputStream.readInt();
                                java.lang.Long[] lArr = new java.lang.Long[i11];
                                for (int i12 = 0; i12 < i11; i12++) {
                                    lArr[i12] = java.lang.Long.valueOf(dataInputStream.readLong());
                                }
                                utf = (java.io.Serializable) lArr;
                            } else if (b == 12) {
                                int i13 = dataInputStream.readInt();
                                java.lang.Float[] fArr = new java.lang.Float[i13];
                                for (int i14 = 0; i14 < i13; i14++) {
                                    fArr[i14] = java.lang.Float.valueOf(dataInputStream.readFloat());
                                }
                                utf = (java.io.Serializable) fArr;
                            } else if (b == 13) {
                                int i15 = dataInputStream.readInt();
                                java.lang.Double[] dArr = new java.lang.Double[i15];
                                for (int i16 = 0; i16 < i15; i16++) {
                                    dArr[i16] = java.lang.Double.valueOf(dataInputStream.readDouble());
                                }
                                utf = (java.io.Serializable) dArr;
                            } else {
                                if (b != 14) {
                                    throw new java.lang.IllegalStateException(defpackage.a.bj(b, "Unsupported type "));
                                }
                                int i17 = dataInputStream.readInt();
                                java.lang.String[] strArr = new java.lang.String[i17];
                                for (int i18 = 0; i18 < i17; i18++) {
                                    java.lang.String utf2 = dataInputStream.readUTF();
                                    if (true == defpackage.aooh.n(utf2, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                                        utf2 = null;
                                    }
                                    strArr[i18] = utf2;
                                }
                                utf = (java.io.Serializable) strArr;
                            }
                        }
                        linkedHashMap.put(dataInputStream.readUTF(), utf);
                    }
                    dataInputStream.close();
                } catch (java.lang.Throwable th4) {
                    try {
                        throw th4;
                    } catch (java.lang.Throwable th5) {
                        try {
                            dataInputStream.close();
                        } catch (java.lang.Throwable th6) {
                            aoil.b(th4, th6);
                        }
                        throw th5;
                    }
                }
            }
        } catch (java.io.IOException e) {
            java.lang.String str = defpackage.grq.a;
            defpackage.gsh.a();
            android.util.Log.e(str, "Error in Data#fromByteArray: ", e);
        } catch (java.lang.ClassNotFoundException e2) {
            java.lang.String str2 = defpackage.grq.a;
            defpackage.gsh.a();
            android.util.Log.e(str2, "Error in Data#fromByteArray: ", e2);
        }
        return new defpackage.grp(linkedHashMap);
    }

    public gus(char[] cArr) {
    }

    public gus() {
    }
}
