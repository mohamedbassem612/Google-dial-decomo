package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class pw {
    public static final /* synthetic */ int b = 0;
    public final androidx.appsearch.safeparcel.GenericDocumentParcel a;

    static {
        new defpackage.pv("", "", "").a();
    }

    public pw(androidx.appsearch.safeparcel.GenericDocumentParcel genericDocumentParcel) {
        this.a = (androidx.appsearch.safeparcel.GenericDocumentParcel) j$.util.Objects.requireNonNull(genericDocumentParcel);
    }

    public static java.lang.Object e(java.lang.String str, java.lang.Object obj, java.lang.Class cls) {
        if (obj == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (java.lang.ClassCastException e) {
            android.util.Log.w("AppSearchGenericDocumen", a.bp((byte) 34, str, "Error casting to requested type for path \""), e);
            return null;
        }
    }

    public static void n(java.lang.String str, java.lang.String str2, int i) {
        if (i > 1) {
            android.util.Log.w("AppSearchGenericDocumen", "The value for \"" + str2 + "\" contains " + i + " elements. Only the first one will be returned from getProperty" + str + "(). Try getProperty" + str + "Array().");
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x008f  */
    private static java.lang.Object r(defpackage.qh qhVar, int i, java.util.Map map) {
        androidx.appsearch.safeparcel.GenericDocumentParcel[] genericDocumentParcelArr;
        j$.util.Objects.requireNonNull(qhVar);
        j$.util.Objects.requireNonNull(map);
        while (i < qhVar.a()) {
            defpackage.qg qgVarB = qhVar.b(i);
            java.lang.Object objCopyOfRange = map.get(qgVarB.a);
            if (objCopyOfRange == null) {
                return null;
            }
            int i2 = qgVarB.b;
            if (i2 != -1) {
                androidx.appsearch.safeparcel.PropertyParcel propertyParcel = (androidx.appsearch.safeparcel.PropertyParcel) objCopyOfRange;
                java.lang.String[] strArr = propertyParcel.b;
                if (strArr == null) {
                    long[] jArr = propertyParcel.c;
                    if (jArr == null) {
                        double[] dArr = propertyParcel.d;
                        if (dArr == null) {
                            boolean[] zArr = propertyParcel.e;
                            if (zArr == null) {
                                byte[][] bArr = propertyParcel.f;
                                if (bArr == null) {
                                    java.lang.Object[] objArr = propertyParcel.g;
                                    if (objArr == null) {
                                        defpackage.pu[] puVarArr = propertyParcel.h;
                                        if (puVarArr == null) {
                                            defpackage.pe[] peVarArr = propertyParcel.i;
                                            if (peVarArr == null) {
                                                java.util.Objects.toString(objCopyOfRange);
                                                throw new java.lang.IllegalStateException("Unsupported value type: ".concat(objCopyOfRange.toString()));
                                            }
                                            if (i2 < peVarArr.length) {
                                                objCopyOfRange = java.util.Arrays.copyOfRange(peVarArr, i2, i2 + 1);
                                            } else {
                                                objCopyOfRange = null;
                                            }
                                        } else if (i2 < puVarArr.length) {
                                            objCopyOfRange = java.util.Arrays.copyOfRange(puVarArr, i2, i2 + 1);
                                        } else {
                                            objCopyOfRange = null;
                                        }
                                    } else if (i2 < objArr.length) {
                                        objCopyOfRange = objArr[i2];
                                    } else {
                                        objCopyOfRange = null;
                                    }
                                } else if (i2 < bArr.length) {
                                    objCopyOfRange = java.util.Arrays.copyOfRange(bArr, i2, i2 + 1);
                                } else {
                                    objCopyOfRange = null;
                                }
                            } else if (i2 < zArr.length) {
                                objCopyOfRange = java.util.Arrays.copyOfRange(zArr, i2, i2 + 1);
                            } else {
                                objCopyOfRange = null;
                            }
                        } else if (i2 < dArr.length) {
                            objCopyOfRange = java.util.Arrays.copyOfRange(dArr, i2, i2 + 1);
                        } else {
                            objCopyOfRange = null;
                        }
                    } else if (i2 < jArr.length) {
                        objCopyOfRange = java.util.Arrays.copyOfRange(jArr, i2, i2 + 1);
                    } else {
                        objCopyOfRange = null;
                    }
                } else if (i2 < strArr.length) {
                    objCopyOfRange = java.util.Arrays.copyOfRange(strArr, i2, i2 + 1);
                } else {
                    objCopyOfRange = null;
                }
            }
            if (objCopyOfRange != null) {
                if (i == qhVar.a() - 1) {
                    if (objCopyOfRange instanceof androidx.appsearch.safeparcel.PropertyParcel) {
                        return ((androidx.appsearch.safeparcel.PropertyParcel) objCopyOfRange).a();
                    }
                } else if (objCopyOfRange instanceof androidx.appsearch.safeparcel.GenericDocumentParcel) {
                    i++;
                    map = ((androidx.appsearch.safeparcel.GenericDocumentParcel) objCopyOfRange).i;
                } else {
                    if (!(objCopyOfRange instanceof androidx.appsearch.safeparcel.PropertyParcel) || (genericDocumentParcelArr = ((androidx.appsearch.safeparcel.PropertyParcel) objCopyOfRange).g) == null) {
                        java.util.Objects.toString(qhVar);
                        android.util.Log.e("AppSearchGenericDocumen", "Failed to apply path to document; no nested value found: ".concat(qhVar.toString()));
                        return null;
                    }
                    int length = genericDocumentParcelArr.length;
                    if (length != 1) {
                        java.util.ArrayList arrayList = new java.util.ArrayList(length);
                        for (androidx.appsearch.safeparcel.GenericDocumentParcel genericDocumentParcel : genericDocumentParcelArr) {
                            java.lang.Object objR = r(qhVar, i + 1, genericDocumentParcel.i);
                            if (objR != null) {
                                arrayList.add(objR);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            return null;
                        }
                        java.lang.Object obj = arrayList.get(0);
                        if (obj instanceof java.lang.String[]) {
                            int length2 = 0;
                            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                                length2 += ((java.lang.String[]) arrayList.get(i3)).length;
                            }
                            java.lang.String[] strArr2 = new java.lang.String[length2];
                            int i4 = 0;
                            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                                java.lang.String[] strArr3 = (java.lang.String[]) arrayList.get(i5);
                                int length3 = strArr3.length;
                                java.lang.System.arraycopy(strArr3, 0, strArr2, i4, length3);
                                i4 += length3;
                            }
                            return strArr2;
                        }
                        if (obj instanceof long[]) {
                            int length4 = 0;
                            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                                length4 += ((long[]) arrayList.get(i6)).length;
                            }
                            long[] jArr2 = new long[length4];
                            int i7 = 0;
                            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                                long[] jArr3 = (long[]) arrayList.get(i8);
                                int length5 = jArr3.length;
                                java.lang.System.arraycopy(jArr3, 0, jArr2, i7, length5);
                                i7 += length5;
                            }
                            return jArr2;
                        }
                        if (obj instanceof double[]) {
                            int length6 = 0;
                            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                                length6 += ((double[]) arrayList.get(i9)).length;
                            }
                            double[] dArr2 = new double[length6];
                            int i10 = 0;
                            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                double[] dArr3 = (double[]) arrayList.get(i11);
                                int length7 = dArr3.length;
                                java.lang.System.arraycopy(dArr3, 0, dArr2, i10, length7);
                                i10 += length7;
                            }
                            return dArr2;
                        }
                        if (obj instanceof boolean[]) {
                            int length8 = 0;
                            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                length8 += ((boolean[]) arrayList.get(i12)).length;
                            }
                            boolean[] zArr2 = new boolean[length8];
                            int i13 = 0;
                            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                                boolean[] zArr3 = (boolean[]) arrayList.get(i14);
                                int length9 = zArr3.length;
                                java.lang.System.arraycopy(zArr3, 0, zArr2, i13, length9);
                                i13 += length9;
                            }
                            return zArr2;
                        }
                        if (obj instanceof byte[][]) {
                            int length10 = 0;
                            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                                length10 += ((byte[][]) arrayList.get(i15)).length;
                            }
                            byte[][] bArr2 = new byte[length10][];
                            int i16 = 0;
                            for (int i17 = 0; i17 < arrayList.size(); i17++) {
                                byte[][] bArr3 = (byte[][]) arrayList.get(i17);
                                int length11 = bArr3.length;
                                java.lang.System.arraycopy(bArr3, 0, bArr2, i16, length11);
                                i16 += length11;
                            }
                            return bArr2;
                        }
                        if (!(obj instanceof androidx.appsearch.safeparcel.GenericDocumentParcel[])) {
                            java.util.Objects.toString(obj);
                            throw new java.lang.IllegalStateException("Unexpected property type: ".concat(java.lang.String.valueOf(obj)));
                        }
                        int length12 = 0;
                        for (int i18 = 0; i18 < arrayList.size(); i18++) {
                            length12 += ((androidx.appsearch.safeparcel.GenericDocumentParcel[]) arrayList.get(i18)).length;
                        }
                        androidx.appsearch.safeparcel.GenericDocumentParcel[] genericDocumentParcelArr2 = new androidx.appsearch.safeparcel.GenericDocumentParcel[length12];
                        int i19 = 0;
                        for (int i20 = 0; i20 < arrayList.size(); i20++) {
                            androidx.appsearch.safeparcel.GenericDocumentParcel[] genericDocumentParcelArr3 = (androidx.appsearch.safeparcel.GenericDocumentParcel[]) arrayList.get(i20);
                            int length13 = genericDocumentParcelArr3.length;
                            java.lang.System.arraycopy(genericDocumentParcelArr3, 0, genericDocumentParcelArr2, i19, length13);
                            i19 += length13;
                        }
                        return genericDocumentParcelArr2;
                    }
                    i++;
                    map = genericDocumentParcelArr[0].i;
                }
            }
            return objCopyOfRange;
        }
        return null;
    }

    public final long a() {
        return this.a.d;
    }

    public final long b() {
        return this.a.e;
    }

    public final defpackage.pw c(java.lang.String str) {
        int length;
        dzk.x(str);
        defpackage.pw[] pwVarArrO = o(str);
        if (pwVarArrO == null || (length = pwVarArrO.length) == 0) {
            return null;
        }
        n("Document", str, length);
        return pwVarArrO[0];
    }

    public final java.lang.Object d(java.lang.String str) {
        java.lang.Object objR;
        j$.util.Objects.requireNonNull(str);
        java.util.Map map = this.a.i;
        if (str.isEmpty()) {
            objR = r(new defpackage.qh(str), 0, map);
            break;
        }
        int i = 0;
        while (true) {
            if (i >= str.length()) {
                androidx.appsearch.safeparcel.PropertyParcel propertyParcel = (androidx.appsearch.safeparcel.PropertyParcel) map.get(str);
                if (propertyParcel == null) {
                    objR = null;
                    break;
                }
                objR = propertyParcel.a();
                break;
            }
            char cCharAt = str.charAt(i);
            if (cCharAt == '.' || cCharAt == '[' || cCharAt == ']') {
                objR = r(new defpackage.qh(str), 0, map);
                break;
            }
            i++;
        }
        if (objR instanceof androidx.appsearch.safeparcel.GenericDocumentParcel) {
            return new defpackage.pw[]{new defpackage.pw((androidx.appsearch.safeparcel.GenericDocumentParcel) objR)};
        }
        if (!(objR instanceof androidx.appsearch.safeparcel.GenericDocumentParcel[])) {
            return objR;
        }
        androidx.appsearch.safeparcel.GenericDocumentParcel[] genericDocumentParcelArr = (androidx.appsearch.safeparcel.GenericDocumentParcel[]) objR;
        defpackage.pw[] pwVarArr = new defpackage.pw[genericDocumentParcelArr.length];
        for (int i2 = 0; i2 < genericDocumentParcelArr.length; i2++) {
            androidx.appsearch.safeparcel.GenericDocumentParcel genericDocumentParcel = genericDocumentParcelArr[i2];
            if (genericDocumentParcel == null) {
                android.util.Log.e("AppSearchGenericDocumen", "The inner parcel is null at " + i2 + ", for path: " + str);
            } else {
                pwVarArr[i2] = new defpackage.pw(genericDocumentParcel);
            }
        }
        return pwVarArr;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.pw) {
            return this.a.equals(((defpackage.pw) obj).a);
        }
        return false;
    }

    public final java.lang.Object f(java.lang.Class cls) {
        defpackage.pt ptVar = defpackage.pt.a;
        dzk.x(ptVar);
        java.util.Map map = ptVar.b;
        java.util.Map map2 = ptVar.c;
        defpackage.ps psVarB = defpackage.ps.b();
        if (!map.isEmpty()) {
            java.lang.Class clsA = androidx.appsearch.app.AppSearchDocumentClassMap.a(map, j(), cls);
            if (clsA != null) {
                cls = clsA;
            } else {
                java.util.List listK = map2.containsKey(j()) ? (java.util.List) map2.get(j()) : k();
                if (listK != null) {
                    for (int i = 0; i < listK.size(); i++) {
                        java.lang.Class clsA2 = androidx.appsearch.app.AppSearchDocumentClassMap.a(map, (java.lang.String) listK.get(i), cls);
                        if (clsA2 != null) {
                            cls = clsA2;
                        }
                    }
                    android.util.Log.w("AppSearchGenericDocumen", "Cannot find any compatible target class to deserialize. Perhaps the annotation processor was not run or the generated document class map was proguarded out?\nTry to deserialize to " + cls.getCanonicalName() + " directly.");
                } else {
                    android.util.Log.w("AppSearchGenericDocumen", "Cannot find any compatible target class to deserialize. Perhaps the annotation processor was not run or the generated document class map was proguarded out?\nTry to deserialize to " + cls.getCanonicalName() + " directly.");
                }
            }
        }
        return psVarB.a(cls).b(this);
    }

    public final java.lang.String g() {
        return this.a.b;
    }

    public final java.lang.String h() {
        return this.a.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String i(java.lang.String str) {
        int length;
        java.lang.String[] strArrP = p(str);
        if (strArrP == null || (length = strArrP.length) == 0) {
            return null;
        }
        n("String", str, length);
        return strArrP[0];
    }

    public final java.lang.String j() {
        return this.a.c;
    }

    @java.lang.Deprecated
    public final java.util.List k() {
        java.util.List list = this.a.h;
        if (list == null) {
            return null;
        }
        return j$.util.DesugarCollections.unmodifiableList(list);
    }

    public final java.util.Set l() {
        return j$.util.DesugarCollections.unmodifiableSet(this.a.i.keySet());
    }

    final void m(defpackage.sm smVar) {
        smVar.a("{\n");
        smVar.d();
        smVar.a("namespace: \"");
        smVar.a(h());
        smVar.a("\",\n");
        smVar.a("id: \"");
        smVar.a(g());
        smVar.a("\",\n");
        smVar.a("score: ");
        smVar.b(java.lang.Integer.valueOf(this.a.f));
        smVar.a(",\n");
        smVar.a("schemaType: \"");
        smVar.a(j());
        smVar.a("\",\n");
        java.util.List listK = k();
        if (listK != null) {
            smVar.a("parentTypes: ");
            smVar.b(listK);
            smVar.a("\n");
        }
        smVar.a("creationTimestampMillis: ");
        smVar.b(java.lang.Long.valueOf(a()));
        smVar.a(",\n");
        smVar.a("timeToLiveMillis: ");
        smVar.b(java.lang.Long.valueOf(b()));
        smVar.a(",\n");
        smVar.a("properties: {\n");
        java.lang.String[] strArr = (java.lang.String[]) l().toArray(new java.lang.String[0]);
        java.util.Arrays.sort(strArr);
        for (int i = 0; i < strArr.length; i++) {
            java.lang.Object objD = d(strArr[i]);
            dzk.x(objD);
            smVar.d();
            java.lang.String str = strArr[i];
            dzk.x(str);
            smVar.a("\"");
            smVar.a(str);
            smVar.a("\": [");
            if (objD instanceof defpackage.pw[]) {
                defpackage.pw[] pwVarArr = (defpackage.pw[]) objD;
                int i2 = 0;
                while (true) {
                    int length = pwVarArr.length;
                    if (i2 >= length) {
                        break;
                    }
                    smVar.a("\n");
                    smVar.d();
                    pwVarArr[i2].m(smVar);
                    if (i2 != length - 1) {
                        smVar.a(",");
                    }
                    smVar.a("\n");
                    smVar.c();
                    i2++;
                }
            } else {
                int length2 = java.lang.reflect.Array.getLength(objD);
                for (int i3 = 0; i3 < length2; i3++) {
                    java.lang.Object obj = java.lang.reflect.Array.get(objD, i3);
                    if (obj instanceof java.lang.String) {
                        smVar.a("\"");
                        smVar.a((java.lang.String) obj);
                        smVar.a("\"");
                    } else if (obj instanceof byte[]) {
                        smVar.a(java.util.Arrays.toString((byte[]) obj));
                    } else if (obj != null) {
                        smVar.a(obj.toString());
                    }
                    if (i3 != length2 - 1) {
                        smVar.a(", ");
                    }
                }
            }
            smVar.a("]");
            if (i != strArr.length - 1) {
                smVar.a(",\n");
            }
            smVar.c();
        }
        smVar.a("\n");
        smVar.a("}");
        smVar.c();
        smVar.a("\n");
        smVar.a("}");
    }

    public final defpackage.pw[] o(java.lang.String str) {
        dzk.x(str);
        return (defpackage.pw[]) e(str, d(str), defpackage.pw[].class);
    }

    public final java.lang.String[] p(java.lang.String str) {
        return (java.lang.String[]) e(str, d(str), java.lang.String[].class);
    }

    public final void q(java.lang.String str) {
        int length;
        long[] jArr = (long[]) e(str, d(str), long[].class);
        if (jArr == null || (length = jArr.length) == 0) {
            return;
        }
        n("Long", str, length);
        long j = jArr[0];
    }

    public final java.lang.String toString() {
        defpackage.sm smVar = new defpackage.sm();
        m(smVar);
        return smVar.toString();
    }
}
