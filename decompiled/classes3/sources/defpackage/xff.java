package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class xff {
    public xff(defpackage.xyx xyxVar) {
        j$.util.Objects.requireNonNull(xyxVar);
    }

    public static int A(java.util.List list, defpackage.xum xumVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int iA = xumVar.a((defpackage.xug) list.get(i));
            if (iA != -1) {
                return iA;
            }
        }
        return -1;
    }

    public static com.bumptech.glide.load.ImageHeaderParser$ImageType B(java.util.List list, java.nio.ByteBuffer byteBuffer) {
        return byteBuffer == null ? com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN : C(list, new defpackage.xuh(byteBuffer, 0));
    }

    public static com.bumptech.glide.load.ImageHeaderParser$ImageType C(java.util.List list, defpackage.xun xunVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            com.bumptech.glide.load.ImageHeaderParser$ImageType imageHeaderParser$ImageTypeA = xunVar.a((defpackage.xug) list.get(i));
            if (imageHeaderParser$ImageTypeA != com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN) {
                return imageHeaderParser$ImageTypeA;
            }
        }
        return com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static boolean D(java.util.List list, defpackage.xul xulVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (xulVar.a((defpackage.xug) list.get(i))) {
                return true;
            }
        }
        return false;
    }

    public static int E(java.util.List list, java.io.InputStream inputStream, defpackage.xxt xxtVar) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new defpackage.yby(inputStream, xxtVar);
        }
        inputStream.mark(5242880);
        return A(list, new defpackage.xuj(inputStream, xxtVar, 0));
    }

    public static int F(java.util.List list, java.nio.ByteBuffer byteBuffer, defpackage.xxt xxtVar) {
        if (byteBuffer == null) {
            return -1;
        }
        return A(list, new defpackage.xuj(byteBuffer, xxtVar, 1));
    }

    public static com.bumptech.glide.load.ImageHeaderParser$ImageType G(java.util.List list, java.io.InputStream inputStream, defpackage.xxt xxtVar) {
        if (inputStream == null) {
            return com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new defpackage.yby(inputStream, xxtVar);
        }
        inputStream.mark(5242880);
        return C(list, new defpackage.xuh(inputStream, 1));
    }

    public static ajcq H(defpackage.xsv xsvVar) {
        defpackage.xtr xtrVar = new defpackage.xtr();
        try {
            defpackage.xsv xsvVarA = xsvVar.a(xtrVar);
            defpackage.yen yenVar = new defpackage.yen();
            xsvVarA.l(yenVar, yenVar, xsvVarA, defpackage.yfu.b);
            synchronized (xtrVar) {
                xtrVar.a = yenVar;
            }
            if (xtrVar.isCancelled()) {
                yenVar.cancel(xtrVar.r());
            }
        } catch (java.lang.RuntimeException e) {
            xtrVar.p(e);
        }
        return ajan.f(xtrVar, new acen(1), defpackage.yfu.b);
    }

    private static int I(java.lang.Object obj) {
        j$.util.Objects.checkIndex(0, 12);
        if (obj == null) {
            return 0;
        }
        if (obj instanceof android.os.BaseBundle) {
            return m((android.os.BaseBundle) obj);
        }
        if (obj instanceof int[]) {
            return java.util.Arrays.hashCode((int[]) obj);
        }
        if (obj instanceof long[]) {
            return java.util.Arrays.hashCode((long[]) obj);
        }
        if (obj instanceof double[]) {
            return java.util.Arrays.hashCode((double[]) obj);
        }
        if (obj instanceof boolean[]) {
            return java.util.Arrays.hashCode((boolean[]) obj);
        }
        if (obj instanceof byte[]) {
            return java.util.Arrays.hashCode((byte[]) obj);
        }
        if (obj instanceof short[]) {
            return java.util.Arrays.hashCode((short[]) obj);
        }
        if (obj instanceof char[]) {
            return java.util.Arrays.hashCode((char[]) obj);
        }
        if (obj instanceof float[]) {
            return java.util.Arrays.hashCode((float[]) obj);
        }
        if (obj instanceof java.lang.Object[]) {
            return java.util.Arrays.hashCode((java.lang.Object[]) obj);
        }
        if (!(obj instanceof android.util.SparseArray)) {
            return obj.hashCode();
        }
        android.util.SparseArray sparseArray = (android.util.SparseArray) obj;
        int size = sparseArray.size();
        int iKeyAt = 0;
        for (int i = 0; i < size; i++) {
            iKeyAt = (((iKeyAt * 31) + sparseArray.keyAt(i)) * 31) + I(sparseArray.valueAt(i));
        }
        return iKeyAt;
    }

    private static boolean J(int i, int i2, java.nio.ByteBuffer byteBuffer) {
        return byteBuffer.remaining() - i >= i2;
    }

    public static android.os.PersistableBundle a(defpackage.xgr xgrVar) {
        android.os.PersistableBundle persistableBundleA = defpackage.xfc.a(xgrVar);
        persistableBundleA.putString("cc.TYPE", "Activity");
        return persistableBundleA;
    }

    public static java.lang.String b(defpackage.xiw xiwVar) {
        return aish.e.k(xiwVar.b().i());
    }

    public static int c(defpackage.xib xibVar) {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Integer.valueOf(xibVar.getNodeComponent().hashCode()), xibVar.getNodeName()});
    }

    public static boolean d(defpackage.xib xibVar, defpackage.xib xibVar2) {
        aooh.f(xibVar, "<this>");
        aooh.f(xibVar2, "other");
        aooh.f(xibVar, "<this>");
        aooh.f(xibVar2, "other");
        return aooh.n(xibVar.getNodeComponent(), xibVar2.getNodeComponent()) && aooh.n(xibVar.getNodeName(), xibVar2.getNodeName());
    }

    public static int e(android.os.PersistableBundle persistableBundle) {
        aooh.f(persistableBundle, "<this>");
        if (h(persistableBundle)) {
            return persistableBundle.getInt("PendingLargeDataIdentifier");
        }
        throw new java.lang.IllegalArgumentException(a.bg(persistableBundle, "This bundle ", " is not a pending bundle."));
    }

    public static android.os.PersistableBundle f(java.util.List list) {
        aooh.f(list, "chunks");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ajsz.bv(arrayList, ajsz.cv((byte[]) it.next()));
        }
        byte[] bArrCk = ajsz.ck(arrayList);
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        aooh.e(parcelObtain, "obtain(...)");
        try {
            try {
                parcelObtain.unmarshall(bArrCk, 0, bArrCk.length);
                parcelObtain.setDataPosition(0);
                android.os.PersistableBundle persistableBundle = parcelObtain.readPersistableBundle(android.os.PersistableBundle.class.getClassLoader());
                parcelObtain.recycle();
                if (persistableBundle != null) {
                    return persistableBundle;
                }
                throw new java.lang.IllegalArgumentException("Failed to reassemble full data from chunks of data.");
            } catch (java.lang.AssertionError e) {
                throw new java.lang.IllegalArgumentException("Failed to reassemble full data from chunks of data.", e);
            } catch (java.lang.Exception e2) {
                throw new java.lang.IllegalArgumentException("Failed to reassemble full data from chunks of data.", e2);
            }
        } catch (java.lang.Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    public static android.os.PersistableBundle g(android.os.PersistableBundle persistableBundle) {
        aooh.f(persistableBundle, "<this>");
        android.os.PersistableBundle persistableBundle2 = new android.os.PersistableBundle();
        persistableBundle2.putInt("PendingLargeDataIdentifier", m(persistableBundle));
        persistableBundle2.putInt("PendingLargeDataSizeInBytes", defpackage.xfh.f(persistableBundle));
        aooh.f(persistableBundle, "<this>");
        persistableBundle2.putInt("PendingLargeDataTotalChunks", j(persistableBundle).size());
        return persistableBundle2;
    }

    public static boolean h(android.os.PersistableBundle persistableBundle) {
        aooh.f(persistableBundle, "<this>");
        return persistableBundle.containsKey("PendingLargeDataIdentifier");
    }

    public static boolean i(android.os.PersistableBundle persistableBundle) {
        aooh.f(persistableBundle, "<this>");
        return defpackage.xfh.f(persistableBundle) >= 500000;
    }

    public static java.util.List j(android.os.PersistableBundle persistableBundle) {
        aooh.f(persistableBundle, "<this>");
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        aooh.e(parcelObtain, "obtain(...)");
        try {
            parcelObtain.writePersistableBundle(persistableBundle);
            byte[] bArrMarshall = parcelObtain.marshall();
            aooh.c(bArrMarshall);
            java.util.List listBP = ajsz.bP(ajsz.cv(bArrMarshall), 50000);
            java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(listBP, 10));
            java.util.Iterator it = listBP.iterator();
            while (it.hasNext()) {
                arrayList.add(ajsz.ck((java.util.List) it.next()));
            }
            parcelObtain.recycle();
            return arrayList;
        } catch (java.lang.Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    public static void k(android.content.ServiceConnection serviceConnection, android.content.Context context) {
        aooh.f(serviceConnection, "<this>");
        aooh.f(context, "context");
        try {
            context.unbindService(serviceConnection);
        } catch (java.lang.Exception e) {
            defpackage.xox.f("ServiceConnection", "Ignoring failure to unbind service.", e);
        }
    }

    public static boolean l(android.os.BaseBundle baseBundle, java.lang.Object obj) {
        boolean zEquals;
        if (baseBundle == null) {
            if (obj == null) {
                return true;
            }
        } else if (obj instanceof android.os.BaseBundle) {
            java.util.Set<java.lang.String> setKeySet = baseBundle.keySet();
            aooh.e(setKeySet, "keySet(...)");
            java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : setKeySet) {
                java.lang.String str = (java.lang.String) obj2;
                aooh.c(str);
                if (!aoov.ad(str, "_")) {
                    arrayList.add(obj2);
                }
            }
            android.os.BaseBundle baseBundle2 = (android.os.BaseBundle) obj;
            java.util.Set<java.lang.String> setKeySet2 = baseBundle2.keySet();
            aooh.e(setKeySet2, "keySet(...)");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj3 : setKeySet2) {
                java.lang.String str2 = (java.lang.String) obj3;
                aooh.c(str2);
                if (!aoov.ad(str2, "_")) {
                    arrayList2.add(obj3);
                }
            }
            if (arrayList2.size() == arrayList.size() && arrayList2.containsAll(arrayList)) {
                for (java.lang.String str3 : arrayList) {
                    java.lang.Object obj4 = baseBundle.get(str3);
                    java.lang.Object obj5 = baseBundle2.get(str3);
                    if (obj4 == null) {
                        if (obj5 != null) {
                        }
                    } else if (obj5 != null && obj4.getClass() == obj5.getClass()) {
                        j$.util.Objects.checkIndex(0, 11);
                        if (obj4 instanceof android.os.BaseBundle) {
                            zEquals = l((android.os.BaseBundle) obj4, (android.os.BaseBundle) obj5);
                        } else if (obj4 instanceof java.lang.Object[]) {
                            zEquals = ajsz.cu((java.lang.Object[]) obj4, (java.lang.Object[]) obj5);
                        } else if (obj4 instanceof int[]) {
                            zEquals = java.util.Arrays.equals((int[]) obj4, (int[]) obj5);
                        } else if (obj4 instanceof long[]) {
                            zEquals = java.util.Arrays.equals((long[]) obj4, (long[]) obj5);
                        } else if (obj4 instanceof double[]) {
                            zEquals = java.util.Arrays.equals((double[]) obj4, (double[]) obj5);
                        } else if (obj4 instanceof boolean[]) {
                            zEquals = java.util.Arrays.equals((boolean[]) obj4, (boolean[]) obj5);
                        } else if (obj4 instanceof byte[]) {
                            zEquals = java.util.Arrays.equals((byte[]) obj4, (byte[]) obj5);
                        } else if (obj4 instanceof short[]) {
                            zEquals = java.util.Arrays.equals((short[]) obj4, (short[]) obj5);
                        } else if (obj4 instanceof char[]) {
                            zEquals = java.util.Arrays.equals((char[]) obj4, (char[]) obj5);
                        } else {
                            zEquals = obj4 instanceof float[] ? java.util.Arrays.equals((float[]) obj4, (float[]) obj5) : aooh.n(obj4, obj5);
                        }
                        if (!zEquals) {
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static int m(android.os.BaseBundle baseBundle) {
        if (baseBundle == null) {
            return 0;
        }
        java.util.Set<java.lang.String> setKeySet = baseBundle.keySet();
        aooh.e(setKeySet, "keySet(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : setKeySet) {
            java.lang.String str = (java.lang.String) obj;
            aooh.c(str);
            if (!aoov.ad(str, "_")) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        for (java.lang.String str2 : ajsz.bW(arrayList)) {
            size = (size * 961) + str2.hashCode() + I(baseBundle.get(str2));
        }
        return size;
    }

    public static java.lang.String n(android.os.BaseBundle baseBundle) {
        aooh.f(baseBundle, "<this>");
        java.lang.Class<?> cls = baseBundle.getClass();
        aopu[] aopuVarArr = aoou.a;
        java.lang.String strC = new aooa(cls).c();
        if (strC == null) {
            java.lang.Class<? super java.lang.Object> superclass = baseBundle.getClass().getSuperclass();
            strC = superclass != null ? superclass.getSimpleName() : null;
        }
        java.util.Set<java.lang.String> setKeySet = baseBundle.keySet();
        aooh.e(setKeySet, "keySet(...)");
        return ajsz.cr(setKeySet, ",", java.lang.String.valueOf(strC).concat("{"), "}", new uph(baseBundle, 10), 24);
    }

    public static java.lang.String o(android.os.BaseBundle baseBundle) {
        aooh.f(baseBundle, "<this>");
        java.util.Set<java.lang.String> setKeySet = baseBundle.keySet();
        aooh.e(setKeySet, "keySet(...)");
        java.lang.Class<?> cls = baseBundle.getClass();
        aopu[] aopuVarArr = aoou.a;
        java.lang.String strValueOf = java.lang.String.valueOf(new aooa(cls).c());
        return ajsz.cr(setKeySet, ", ", strValueOf.concat("{"), "}", new defpackage.xms(baseBundle, 3), 24);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v14, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v17, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v20, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.CharSequence, java.lang.Object] */
    public static java.lang.String p(java.lang.Object obj) throws java.io.IOException {
        int i = 0;
        int i2 = 12;
        j$.util.Objects.checkIndex(0, 12);
        if (obj != null) {
            if (obj instanceof android.os.BaseBundle) {
                return o((android.os.BaseBundle) obj);
            }
            if (obj instanceof byte[]) {
                return "ByteArray(hash=" + java.util.Arrays.hashCode((byte[]) obj) + ')';
            }
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                defpackage.xgn xgnVar = new defpackage.xgn(9);
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append((java.lang.CharSequence) "[");
                int length = iArr.length;
                int i3 = 0;
                while (i < length) {
                    int i4 = iArr[i];
                    i3++;
                    if (i3 > 1) {
                        sb.append((java.lang.CharSequence) ", ");
                    }
                    sb.append((java.lang.CharSequence) xgnVar.a(java.lang.Integer.valueOf(i4)));
                    i++;
                }
                sb.append((java.lang.CharSequence) "]");
                return sb.toString();
            }
            if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                defpackage.xgn xgnVar2 = new defpackage.xgn(10);
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append((java.lang.CharSequence) "[");
                int length2 = jArr.length;
                int i5 = 0;
                while (i < length2) {
                    long j = jArr[i];
                    i5++;
                    if (i5 > 1) {
                        sb2.append((java.lang.CharSequence) ", ");
                    }
                    sb2.append((java.lang.CharSequence) xgnVar2.a(java.lang.Long.valueOf(j)));
                    i++;
                }
                sb2.append((java.lang.CharSequence) "]");
                return sb2.toString();
            }
            if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                defpackage.xgn xgnVar3 = new defpackage.xgn(11);
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                sb3.append((java.lang.CharSequence) "[");
                int length3 = dArr.length;
                int i6 = 0;
                while (i < length3) {
                    double d = dArr[i];
                    i6++;
                    if (i6 > 1) {
                        sb3.append((java.lang.CharSequence) ", ");
                    }
                    sb3.append((java.lang.CharSequence) xgnVar3.a(java.lang.Double.valueOf(d)));
                    i++;
                }
                sb3.append((java.lang.CharSequence) "]");
                return sb3.toString();
            }
            if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                defpackage.xgn xgnVar4 = new defpackage.xgn(i2);
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                sb4.append((java.lang.CharSequence) "[");
                int length4 = zArr.length;
                int i7 = 0;
                while (i < length4) {
                    boolean z = zArr[i];
                    i7++;
                    if (i7 > 1) {
                        sb4.append((java.lang.CharSequence) ", ");
                    }
                    sb4.append((java.lang.CharSequence) xgnVar4.a(java.lang.Boolean.valueOf(z)));
                    i++;
                }
                sb4.append((java.lang.CharSequence) "]");
                return sb4.toString();
            }
            if (obj instanceof short[]) {
                short[] sArr = (short[]) obj;
                defpackage.xgn xgnVar5 = new defpackage.xgn(13);
                java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                sb5.append((java.lang.CharSequence) "[");
                int length5 = sArr.length;
                int i8 = 0;
                while (i < length5) {
                    short s = sArr[i];
                    i8++;
                    if (i8 > 1) {
                        sb5.append((java.lang.CharSequence) ", ");
                    }
                    sb5.append((java.lang.CharSequence) xgnVar5.a(java.lang.Short.valueOf(s)));
                    i++;
                }
                sb5.append((java.lang.CharSequence) "]");
                return sb5.toString();
            }
            if (obj instanceof char[]) {
                char[] cArr = (char[]) obj;
                defpackage.xgn xgnVar6 = new defpackage.xgn(14);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append((java.lang.CharSequence) "[");
                int length6 = cArr.length;
                int i9 = 0;
                while (i < length6) {
                    char c = cArr[i];
                    i9++;
                    if (i9 > 1) {
                        sb6.append((java.lang.CharSequence) ", ");
                    }
                    sb6.append((java.lang.CharSequence) xgnVar6.a(java.lang.Character.valueOf(c)));
                    i++;
                }
                sb6.append((java.lang.CharSequence) "]");
                return sb6.toString();
            }
            if (obj instanceof float[]) {
                float[] fArr = (float[]) obj;
                defpackage.xgn xgnVar7 = new defpackage.xgn(15);
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append((java.lang.CharSequence) "[");
                int length7 = fArr.length;
                int i10 = 0;
                while (i < length7) {
                    float f = fArr[i];
                    i10++;
                    if (i10 > 1) {
                        sb7.append((java.lang.CharSequence) ", ");
                    }
                    sb7.append((java.lang.CharSequence) xgnVar7.a(java.lang.Float.valueOf(f)));
                    i++;
                }
                sb7.append((java.lang.CharSequence) "]");
                return sb7.toString();
            }
            if (obj instanceof java.lang.Object[]) {
                return ajsz.dj((java.lang.Object[]) obj, ", ", "[", "]", new defpackage.xgn(16), 24);
            }
            if (obj instanceof java.lang.Iterable) {
                return ajsz.cr((java.lang.Iterable) obj, ", ", "[", "]", new defpackage.xgn(8), 24);
            }
            java.lang.String name = obj.getClass().getName();
            if (name != null) {
                return name;
            }
        }
        return "null";
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ java.lang.Object q(defpackage.xoc xocVar, defpackage.xpb xpbVar, aoln aolnVar) {
        defpackage.xop xopVar;
        if (aolnVar instanceof defpackage.xop) {
            xopVar = (defpackage.xop) aolnVar;
            int i = xopVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                xopVar.b = i - Integer.MIN_VALUE;
            } else {
                xopVar = new defpackage.xop(aolnVar);
            }
        } else {
            xopVar = new defpackage.xop(aolnVar);
        }
        java.lang.Object objR = xopVar.a;
        aolu aoluVar = aolu.a;
        int i2 = xopVar.b;
        if (i2 == 0) {
            aooc.af(objR);
            xopVar.c = (defpackage.xlr) xpbVar;
            xopVar.b = 1;
            objR = r(xocVar, xopVar);
            if (objR == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            xpbVar = xopVar.c;
            aooc.af(objR);
        }
        return xpbVar.c((android.os.PersistableBundle) objR);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0044  */
    /* JADX WARN: Code duplicated, block: B:20:0x0055  */
    /* JADX WARN: Code duplicated, block: B:22:0x0059  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, xoc] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0055 -> B:21:0x0057). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static /* synthetic */ java.lang.Object r(defpackage.xoc r5, aoln r6) {
        /*
            boolean r0 = r6 instanceof defpackage.xoq
            if (r0 == 0) goto L13
            r0 = r6
            xoq r0 = (defpackage.xoq) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            xoq r0 = new xoq
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.c
            aolu r1 = aolu.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            byte[] r5 = r0.e
            java.lang.Object r2 = r0.b
            java.lang.Object r4 = r0.a
            aooc.af(r6)
            goto L57
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            aooc.af(r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r2 = r6
        L3e:
            byte[] r6 = r5.a()
            if (r6 == 0) goto L47
            r2.add(r6)
        L47:
            r0.a = r5
            r0.b = r2
            r0.e = r6
            r0.d = r3
            java.lang.Object r4 = aooh.J(r0)
            if (r4 == r1) goto L5f
            r4 = r5
            r5 = r6
        L57:
            if (r5 == 0) goto L5b
            r5 = r4
            goto L3e
        L5b:
            android.os.PersistableBundle r1 = f(r2)
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xff.r(xoc, aoln):java.lang.Object");
    }

    public static int s(int i, java.nio.ByteBuffer byteBuffer) {
        if (J(i, 4, byteBuffer)) {
            return byteBuffer.getInt(i);
        }
        return -1;
    }

    public static short t(int i, java.nio.ByteBuffer byteBuffer) {
        if (J(i, 2, byteBuffer)) {
            return byteBuffer.getShort(i);
        }
        return (short) -1;
    }

    public static /* synthetic */ java.lang.String u(int i) {
        switch (i) {
            case 1:
                return "INITIALIZE";
            case 2:
                return "RESOURCE_CACHE";
            case 3:
                return "DATA_CACHE";
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return "SOURCE";
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return "ENCODE";
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return "FINISHED";
            default:
                return "null";
        }
    }

    public static android.content.res.AssetFileDescriptor v(android.net.Uri uri, android.content.ContentResolver contentResolver) {
        return a$.ExternalSyntheticApiModelOutline0.m(contentResolver, uri, "r", (android.os.CancellationSignal) null);
    }

    public static boolean w() {
        return baa$.ExternalSyntheticApiModelOutline1.m(30) >= 17;
    }

    public static boolean x(android.net.Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static boolean y(int i, int i2) {
        return i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384;
    }

    public static boolean z(android.net.Uri uri) {
        return uri.getPathSegments().contains("video");
    }

    public xff(byte[] bArr, byte[] bArr2) {
    }
}
