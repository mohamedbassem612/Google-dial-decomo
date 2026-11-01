package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class fsu {
    public fsu(java.util.List list) {
        j$.util.DesugarCollections.unmodifiableList(list);
    }

    public static defpackage.gqd A(android.content.Context context, androidx.window.extensions.layout.WindowLayoutInfo windowLayoutInfo) {
        aooh.f(context, "context");
        aooh.f(windowLayoutInfo, "info");
        return z(new gqh().b(context), windowLayoutInfo);
    }

    public static float B(android.view.WindowMetrics windowMetrics, android.content.Context context) {
        aooh.f(windowMetrics, "windowMetrics");
        aooh.f(context, "context");
        try {
            return rp$.ExternalSyntheticApiModelOutline0.m(windowMetrics);
        } catch (java.lang.NoSuchMethodError unused) {
            return context.getResources().getDisplayMetrics().density;
        }
    }

    public static gmv C(gmv gmvVar, int i, int i2) {
        int i3 = gmvVar.e;
        int i4 = gmvVar.d;
        return new gmv(gmvVar.b + i, gmvVar.c + i2, i4 + i, i3 + i2);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static defpackage.goq D(android.os.Bundle bundle, java.lang.String str) {
        android.os.Bundle bundle2 = bundle.getBundle(str);
        aooh.c(bundle2);
        java.lang.String string = bundle2.getString("androidx.window.embedding.EmbeddingBounds.dimension_type");
        if (string != null) {
            switch (string.hashCode()) {
                case -1939100487:
                    if (string.equals("expanded")) {
                        return defpackage.goq.b;
                    }
                    break;
                case 99283243:
                    if (string.equals("hinge")) {
                        return defpackage.goq.c;
                    }
                    break;
                case 106680966:
                    if (string.equals("pixel")) {
                        defpackage.goq goqVar = defpackage.goq.b;
                        return new defpackage.goo(bundle2.getInt("androidx.window.embedding.EmbeddingBounds.dimension_value"));
                    }
                    break;
                case 108285963:
                    if (string.equals("ratio")) {
                        defpackage.goq goqVar2 = defpackage.goq.b;
                        return new defpackage.gop(bundle2.getFloat("androidx.window.embedding.EmbeddingBounds.dimension_value"));
                    }
                    break;
            }
        }
        throw new java.lang.IllegalArgumentException("Illegal type ".concat(java.lang.String.valueOf(string)));
    }

    public static java.util.Set E(java.util.List list, java.util.List list2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            int iIntValue = ((java.lang.Number) it.next()).intValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(ajsz.bl(list2, 10));
            java.util.Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new defpackage.gnk(iIntValue, ((java.lang.Number) it2.next()).intValue()));
            }
            ajsz.bv(arrayList, arrayList2);
        }
        return ajsz.cf(arrayList);
    }

    public static android.view.animation.Interpolator H(android.content.Context context, int i) {
        android.view.animation.Interpolator interpolatorLoadInterpolator = android.view.animation.AnimationUtils.loadInterpolator(context, i);
        anty.aI(interpolatorLoadInterpolator, "Failed to parse interpolator, no start tag found");
        return interpolatorLoadInterpolator;
    }

    public static void I(gkc gkcVar, java.lang.Throwable th) throws java.lang.Throwable {
        gjx gjxVar = ((gjw) gkcVar).c;
        java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
        long id = threadCurrentThread.getId();
        gjz gjzVarA = gjxVar.a;
        gjz gjzVar = gjxVar.b;
        if (gjzVarA == null || ((gka) gjzVarA).a != id) {
            if (gjzVar == null || ((gka) gjzVar).a != id) {
                android.system.Os.gettid();
                threadCurrentThread.getName();
                gjzVarA = gjxVar.a(id);
                gjxVar.b = gjxVar.a;
                gjxVar.a = gjzVarA;
            } else {
                gjzVarA = gjzVar;
            }
        }
        boolean z = gjzVarA.c.e;
        for (java.lang.StackTraceElement stackTraceElement : th.getStackTrace()) {
            stackTraceElement.getClassName();
            stackTraceElement.getMethodName();
            stackTraceElement.getFileName();
            stackTraceElement.getLineNumber();
        }
        throw th;
    }

    public static void J(int i, java.lang.String str) {
        throw new android.database.SQLException(a.bj(i, "Error code: ").concat(", message: ".concat(str)));
    }

    public static java.util.ArrayList K(java.util.Collection collection) {
        aooh.f(collection, "<this>");
        return collection instanceof java.util.ArrayList ? (java.util.ArrayList) collection : new java.util.ArrayList(collection);
    }

    public static int L(android.os.Bundle bundle) {
        int iHashCode;
        java.util.Iterator<java.lang.String> it = bundle.keySet().iterator();
        int i = 1;
        while (it.hasNext()) {
            java.lang.Object obj = bundle.get(it.next());
            if (obj instanceof android.os.Bundle) {
                iHashCode = L((android.os.Bundle) obj);
            } else if (obj instanceof java.lang.Object[]) {
                iHashCode = java.util.Arrays.deepHashCode((java.lang.Object[]) obj);
            } else if (obj instanceof byte[]) {
                iHashCode = java.util.Arrays.hashCode((byte[]) obj);
            } else if (obj instanceof short[]) {
                iHashCode = java.util.Arrays.hashCode((short[]) obj);
            } else if (obj instanceof int[]) {
                iHashCode = java.util.Arrays.hashCode((int[]) obj);
            } else if (obj instanceof long[]) {
                iHashCode = java.util.Arrays.hashCode((long[]) obj);
            } else if (obj instanceof float[]) {
                iHashCode = java.util.Arrays.hashCode((float[]) obj);
            } else if (obj instanceof double[]) {
                iHashCode = java.util.Arrays.hashCode((double[]) obj);
            } else if (obj instanceof char[]) {
                iHashCode = java.util.Arrays.hashCode((char[]) obj);
            } else if (obj instanceof boolean[]) {
                iHashCode = java.util.Arrays.hashCode((boolean[]) obj);
            } else {
                iHashCode = obj != null ? obj.hashCode() : 0;
            }
            i = (i * 31) + iHashCode;
        }
        return i;
    }

    public static boolean M(android.os.Bundle bundle, android.os.Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        if (bundle.size() == bundle2.size()) {
            for (java.lang.String str : bundle.keySet()) {
                java.lang.Object obj = bundle.get(str);
                java.lang.Object obj2 = bundle2.get(str);
                if (obj != obj2 && !aooh.n(obj, obj2)) {
                    if (obj != null && obj2 != null) {
                        if ((obj instanceof android.os.Bundle) && (obj2 instanceof android.os.Bundle)) {
                            if (!M((android.os.Bundle) obj, (android.os.Bundle) obj2)) {
                            }
                        } else if ((obj instanceof java.lang.Object[]) && (obj2 instanceof java.lang.Object[])) {
                            if (!ajsz.cu((java.lang.Object[]) obj, (java.lang.Object[]) obj2)) {
                            }
                        } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                            if (!java.util.Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                            }
                        } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                            if (!java.util.Arrays.equals((short[]) obj, (short[]) obj2)) {
                            }
                        } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                            if (!java.util.Arrays.equals((int[]) obj, (int[]) obj2)) {
                            }
                        } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                            if (!java.util.Arrays.equals((long[]) obj, (long[]) obj2)) {
                            }
                        } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                            if (!java.util.Arrays.equals((float[]) obj, (float[]) obj2)) {
                            }
                        } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                            if (!java.util.Arrays.equals((double[]) obj, (double[]) obj2)) {
                            }
                        } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                            if (!java.util.Arrays.equals((char[]) obj, (char[]) obj2)) {
                            }
                        } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                            if (!java.util.Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                            }
                        } else if (!aooh.n(obj, obj2)) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    private static void N(defpackage.frj frjVar, int i, java.util.function.Consumer consumer) {
        long jC = frjVar.c(i);
        java.util.List listE = frjVar.e(jC);
        if (listE.isEmpty()) {
            return;
        }
        if (i == frjVar.a() - 1) {
            throw new java.lang.IllegalStateException();
        }
        long jC2 = frjVar.c(i + 1) - frjVar.c(i);
        if (jC2 > 0) {
            aa$.ExternalSyntheticApiModelOutline1.m(consumer, new defpackage.frf(listE, jC, jC2));
        }
    }

    public static defpackage.frj a(defpackage.frt frtVar, byte[] bArr, int i) {
        aift aiftVar = new aift(4);
        defpackage.frs frsVar = defpackage.frs.a;
        j$.util.Objects.requireNonNull(aiftVar);
        frtVar.b(bArr, 0, i, frsVar, new defpackage.fcg(aiftVar, 3));
        return new defpackage.frg(aiftVar.h());
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    /* JADX WARN: Code duplicated, block: B:21:0x0053  */
    public static void b(defpackage.frj frjVar, defpackage.frs frsVar, java.util.function.Consumer consumer) {
        int i;
        boolean z;
        long j = frsVar.b;
        if (j == -9223372036854775807L) {
            i = 0;
        } else {
            int iB = frjVar.b(j);
            if (iB == -1) {
                iB = frjVar.a();
            }
            if (iB > 0) {
                int i2 = iB - 1;
                if (frjVar.c(i2) == j) {
                    i = i2;
                } else {
                    i = iB;
                }
            } else {
                i = iB;
            }
        }
        if (j == -9223372036854775807L || i >= frjVar.a()) {
            z = false;
        } else {
            java.util.List listE = frjVar.e(j);
            long jC = frjVar.c(i);
            if (listE.isEmpty() || j >= jC) {
                z = false;
            } else {
                aa$.ExternalSyntheticApiModelOutline1.m(consumer, new defpackage.frf(listE, j, jC - j));
                z = true;
            }
        }
        for (int i3 = i; i3 < frjVar.a(); i3++) {
            N(frjVar, i3, consumer);
        }
        if (frsVar.c) {
            if (z) {
                i--;
            }
            for (int i4 = 0; i4 < i; i4++) {
                N(frjVar, i4, consumer);
            }
            if (z) {
                aa$.ExternalSyntheticApiModelOutline1.m(consumer, new defpackage.frf(frjVar.e(j), frjVar.c(i), j - frjVar.c(i)));
            }
        }
    }

    public static byte[] c(java.util.List list, long j) {
        defpackage.etw etwVar = new defpackage.etw(7);
        java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((android.os.Bundle) aa$.ExternalSyntheticApiModelOutline1.m(etwVar, it.next()));
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j);
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }

    public static int d(defpackage.etv etvVar, int i, int i2, int i3) {
        ahvr.bM(java.lang.Math.max(java.lang.Math.max(i, i2), i3) <= 31);
        int i4 = (1 << i) - 1;
        int i5 = (1 << i2) - 1;
        h(h(i4, i5), 1 << i3);
        if (etvVar.a() < i) {
            return -1;
        }
        int iD = etvVar.d(i);
        if (iD == i4) {
            if (etvVar.a() < i2) {
                return -1;
            }
            int iD2 = etvVar.d(i2);
            iD += iD2;
            if (iD2 == i5) {
                if (etvVar.a() >= i3) {
                    return iD + etvVar.d(i3);
                }
                return -1;
            }
        }
        return iD;
    }

    public static void e(defpackage.etv etvVar) {
        etvVar.n(3);
        etvVar.n(8);
        boolean zP = etvVar.p();
        boolean zP2 = etvVar.p();
        if (zP) {
            etvVar.n(5);
        }
        if (zP2) {
            etvVar.n(6);
        }
    }

    public static void f(defpackage.etv etvVar) {
        int iD;
        int iD2 = etvVar.d(2);
        if (iD2 == 0) {
            etvVar.n(6);
            return;
        }
        int iD3 = d(etvVar, 5, 8, 16) + 1;
        if (iD2 == 1) {
            etvVar.n(iD3 * 7);
            return;
        }
        if (iD2 == 2) {
            boolean zP = etvVar.p();
            int i = true != zP ? 5 : 1;
            int i2 = true == zP ? 7 : 5;
            int i3 = true == zP ? 8 : 6;
            int i4 = 0;
            while (i4 < iD3) {
                if (etvVar.p()) {
                    etvVar.n(7);
                    iD = 0;
                } else {
                    if (etvVar.d(2) == 3 && etvVar.d(i2) * i != 0) {
                        etvVar.m();
                    }
                    iD = etvVar.d(i3) * i;
                    if (iD != 0 && iD != 180) {
                        etvVar.m();
                    }
                    etvVar.m();
                }
                if (iD != 0 && iD != 180 && etvVar.p()) {
                    i4++;
                }
                i4++;
            }
        }
    }

    public static boolean g(defpackage.etv etvVar) {
        etvVar.n(3);
        boolean zP = etvVar.p();
        if (zP) {
            etvVar.n(13);
        }
        return zP;
    }

    public static /* synthetic */ int h(int i, int i2) {
        long j = ((long) i) + ((long) i2);
        int i3 = (int) j;
        if (j == i3) {
            return i3;
        }
        throw new java.lang.ArithmeticException();
    }

    public static defpackage.fta i(defpackage.fta ftaVar, java.lang.String[] strArr, java.util.Map map) {
        int i = 0;
        if (ftaVar == null) {
            if (strArr == null) {
                return null;
            }
            int length = strArr.length;
            if (length == 1) {
                return (defpackage.fta) map.get(strArr[0]);
            }
            if (length <= 1) {
                return ftaVar;
            }
            defpackage.fta ftaVar2 = new defpackage.fta();
            while (i < length) {
                ftaVar2.b((defpackage.fta) map.get(strArr[i]));
                i++;
            }
            return ftaVar2;
        }
        if (strArr == null) {
            return ftaVar;
        }
        if (strArr.length == 1) {
            ftaVar.b((defpackage.fta) map.get(strArr[0]));
            return ftaVar;
        }
        int length2 = strArr.length;
        if (length2 <= 1) {
            return ftaVar;
        }
        while (i < length2) {
            ftaVar.b((defpackage.fta) map.get(strArr[i]));
            i++;
        }
        return ftaVar;
    }

    public static byte[] j(byte[] bArr, java.util.UUID uuid) {
        alic alicVarT = t(bArr);
        if (alicVarT != null) {
            java.lang.Object obj = alicVarT.b;
            if (uuid.equals(obj)) {
                return (byte[]) alicVarT.c;
            }
            defpackage.etr.f("PsshAtomUtil", "UUID mismatch. Expected: " + uuid.toString() + ", got: " + obj.toString() + '.');
        }
        return null;
    }

    public static java.lang.String k(java.util.List list) {
        java.util.Iterator it = list.iterator();
        java.lang.String str = null;
        boolean z = false;
        while (it.hasNext()) {
            java.lang.String str2 = ((defpackage.fqq) it.next()).a.g.p;
            if (defpackage.eqz.i(str2)) {
                return "video/mp4";
            }
            if (defpackage.eqz.f(str2)) {
                z = true;
            } else if (defpackage.eqz.g(str2)) {
                if (j$.util.Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (j$.util.Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        if (z) {
            return "audio/mp4";
        }
        return str == null ? "application/mp4" : str;
    }

    public static int l(defpackage.etx etxVar) {
        int i = etxVar.i();
        if (etxVar.i() == 1684108385) {
            etxVar.R(8);
            int i2 = i - 16;
            if (i2 == 1) {
                return etxVar.n();
            }
            if (i2 == 2) {
                return etxVar.s();
            }
            if (i2 == 3) {
                return etxVar.p();
            }
            if (i2 == 4 && (etxVar.h() & 128) == 0) {
                return etxVar.q();
            }
        }
        defpackage.etr.f("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static defpackage.foj m(int i, java.lang.String str, defpackage.etx etxVar, boolean z, boolean z2) {
        int iL = l(etxVar);
        if (z2) {
            iL = java.lang.Math.min(1, iL);
        }
        if (iL >= 0) {
            return z ? new defpackage.foo(str, null, aify.p(java.lang.Integer.toString(iL))) : new defpackage.fof("und", str, java.lang.Integer.toString(iL));
        }
        defpackage.etr.f("MetadataUtil", "Failed to parse uint8 attribute: ".concat(defpackage.euu.e(i)));
        return null;
    }

    public static defpackage.foo n(int i, java.lang.String str, defpackage.etx etxVar) {
        int i2 = etxVar.i();
        if (etxVar.i() == 1684108385 && i2 >= 22) {
            etxVar.R(10);
            int iS = etxVar.s();
            if (iS > 0) {
                java.lang.String strValueOf = java.lang.String.valueOf(iS);
                int iS2 = etxVar.s();
                if (iS2 > 0) {
                    strValueOf = strValueOf + '/' + iS2;
                }
                return new defpackage.foo(str, null, aify.p(strValueOf));
            }
        }
        defpackage.etr.f("MetadataUtil", "Failed to parse index/count attribute: ".concat(defpackage.euu.e(i)));
        return null;
    }

    public static defpackage.foo o(int i, java.lang.String str, defpackage.etx etxVar) {
        int i2 = etxVar.i();
        if (etxVar.i() == 1684108385) {
            etxVar.R(8);
            return new defpackage.foo(str, null, aify.p(etxVar.B(i2 - 16)));
        }
        defpackage.etr.f("MetadataUtil", "Failed to parse text attribute: ".concat(defpackage.euu.e(i)));
        return null;
    }

    public static void p(int i, defpackage.fls flsVar, defpackage.eqf eqfVar) {
        if (i == 1 && flsVar.a()) {
            eqfVar.J = flsVar.a;
            eqfVar.K = flsVar.b;
        }
    }

    public static void q(int i, defpackage.eqy eqyVar, defpackage.eqf eqfVar, defpackage.eqy eqyVar2, defpackage.eqy... eqyVarArr) {
        if (eqyVar2 == null) {
            eqyVar2 = new defpackage.eqy(-9223372036854775807L, new defpackage.eqx[0]);
        }
        if (eqyVar != null) {
            aike aikeVarF = eqyVar.f(defpackage.euq.class);
            int i2 = aikeVarF.d;
            for (int i3 = 0; i3 < i2; i3++) {
                defpackage.euq euqVar = (defpackage.euq) aikeVarF.get(i3);
                if (!euqVar.a.equals("com.android.capture.fps") || i == 2) {
                    eqyVar2 = eqyVar2.d(euqVar);
                }
            }
        }
        for (defpackage.eqy eqyVar3 : eqyVarArr) {
            eqyVar2 = eqyVar2.e(eqyVar3);
        }
        if (eqyVar2.a() > 0) {
            eqfVar.k = eqyVar2;
        }
    }

    public static long r(defpackage.flv flvVar, long j, int i, int i2) {
        if (j != -1 && j != 0) {
            long j2 = j * ((long) flvVar.g);
            if (i != -1 && i2 != -1) {
                j2 -= (long) (i + i2);
            }
            if (j2 > 0) {
                return eum.y(j2 - 1, flvVar.d);
            }
        }
        return -9223372036854775807L;
    }

    public static int s(long j, long j2) {
        if (j > 0 && j2 > 0) {
            long jA = eum.A(j, 8000000L, j2, java.math.RoundingMode.HALF_UP);
            if (jA > 0 && jA <= 2147483647L) {
                return (int) jA;
            }
        }
        return -2147483647;
    }

    public static alic t(byte[] bArr) {
        defpackage.etx etxVar = new defpackage.etx(bArr);
        if (etxVar.d < 32) {
            return null;
        }
        etxVar.Q(0);
        int iD = etxVar.d();
        int i = etxVar.i();
        if (i != iD) {
            defpackage.etr.f("PsshAtomUtil", a.bf(iD, i, "Advertised atom size (", ") does not match buffer size: "));
            return null;
        }
        int i2 = etxVar.i();
        if (i2 != 1886614376) {
            defpackage.etr.f("PsshAtomUtil", a.bj(i2, "Atom type is not pssh: "));
            return null;
        }
        int i3 = etxVar.i();
        int i4 = defpackage.fpz.a;
        int i5 = (i3 >> 24) & 255;
        if (i5 > 1) {
            defpackage.etr.f("PsshAtomUtil", a.bj(i5, "Unsupported pssh version: "));
            return null;
        }
        java.util.UUID uuid = new java.util.UUID(etxVar.v(), etxVar.v());
        if (i5 == 1) {
            int iQ = etxVar.q();
            java.util.UUID[] uuidArr = new java.util.UUID[iQ];
            for (int i6 = 0; i6 < iQ; i6++) {
                uuidArr[i6] = new java.util.UUID(etxVar.v(), etxVar.v());
            }
        }
        int iQ2 = etxVar.q();
        int iD2 = etxVar.d();
        if (iQ2 != iD2) {
            defpackage.etr.f("PsshAtomUtil", a.bf(iD2, iQ2, "Atom data size (", ") does not match the bytes left: "));
            return null;
        }
        byte[] bArr2 = new byte[iQ2];
        etxVar.L(bArr2, 0, iQ2);
        return new alic(uuid, i5, bArr2);
    }

    public static ajcq u(java.util.concurrent.Executor executor, aomy aomyVar) {
        return dff.m(new defpackage.jnr(executor, aomyVar, 1));
    }

    public static android.os.IBinder v(android.app.Activity activity) {
        android.view.Window window;
        android.view.WindowManager.LayoutParams attributes;
        if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
            return null;
        }
        return attributes.token;
    }

    public static defpackage.gni w() {
        java.lang.String strGroup;
        try {
            java.lang.String apiVersion = androidx.window.sidecar.SidecarProvider.getApiVersion();
            if (android.text.TextUtils.isEmpty(apiVersion)) {
                return null;
            }
            defpackage.gni gniVar = defpackage.gni.a;
            if (apiVersion == null || aoov.H(apiVersion)) {
                return null;
            }
            java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(apiVersion);
            if (!matcher.matches() || (strGroup = matcher.group(1)) == null) {
                return null;
            }
            int i = java.lang.Integer.parseInt(strGroup);
            java.lang.String strGroup2 = matcher.group(2);
            if (strGroup2 == null) {
                return null;
            }
            int i2 = java.lang.Integer.parseInt(strGroup2);
            java.lang.String strGroup3 = matcher.group(3);
            if (strGroup3 == null) {
                return null;
            }
            int i3 = java.lang.Integer.parseInt(strGroup3);
            java.lang.String strGroup4 = matcher.group(4) != null ? matcher.group(4) : "";
            aooh.c(strGroup4);
            return new defpackage.gni(i, i2, i3, strGroup4);
        } catch (java.lang.NoClassDefFoundError | java.lang.UnsupportedOperationException unused) {
            return null;
        }
    }

    public static int x(androidx.window.sidecar.SidecarDeviceState sidecarDeviceState) {
        int iIntValue;
        aooh.f(sidecarDeviceState, "sidecarDeviceState");
        aooh.f(sidecarDeviceState, "sidecarDeviceState");
        try {
            try {
                iIntValue = sidecarDeviceState.posture;
            } catch (java.lang.NoSuchFieldError unused) {
                java.lang.Object objInvoke = androidx.window.sidecar.SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                aooh.d(objInvoke, "null cannot be cast to non-null type kotlin.Int");
                iIntValue = ((java.lang.Integer) objInvoke).intValue();
            }
        } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused2) {
            iIntValue = 0;
        }
        if (iIntValue < 0 || iIntValue > 4) {
            return 0;
        }
        return iIntValue;
    }

    public static java.util.List y(androidx.window.sidecar.SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        try {
            try {
                java.util.List list = sidecarWindowLayoutInfo.displayFeatures;
                return list == null ? aokc.a : list;
            } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
                return aokc.a;
            }
        } catch (java.lang.NoSuchFieldError unused2) {
            java.lang.Object objInvoke = androidx.window.sidecar.SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null);
            aooh.d(objInvoke, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
            return (java.util.List) objInvoke;
        }
        return aokc.a;
    }

    public static defpackage.gqd z(gqe gqeVar, androidx.window.extensions.layout.WindowLayoutInfo windowLayoutInfo) {
        defpackage.gpx gpxVar;
        defpackage.gpw gpwVar;
        aooh.f(windowLayoutInfo, "info");
        java.util.List<androidx.window.extensions.layout.FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        aooh.e(displayFeatures, "getDisplayFeatures(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (androidx.window.extensions.layout.FoldingFeature foldingFeature : displayFeatures) {
            defpackage.gpy gpyVar = null;
            if (foldingFeature instanceof androidx.window.extensions.layout.FoldingFeature) {
                androidx.window.extensions.layout.FoldingFeature foldingFeature2 = foldingFeature;
                aooh.f(foldingFeature2, "oemFeature");
                int type = foldingFeature2.getType();
                if (type == 1) {
                    gpxVar = defpackage.gpx.a;
                } else if (type == 2) {
                    gpxVar = defpackage.gpx.b;
                }
                int state = foldingFeature2.getState();
                if (state == 1) {
                    gpwVar = defpackage.gpw.a;
                } else if (state == 2) {
                    gpwVar = defpackage.gpw.b;
                }
                android.graphics.Rect bounds = foldingFeature2.getBounds();
                aooh.e(bounds, "getBounds(...)");
                gmv gmvVar = new gmv(bounds);
                android.graphics.Rect rectA = gqeVar.a();
                if ((gmvVar.a() != 0 || gmvVar.b() != 0) && ((gmvVar.b() == rectA.width() || gmvVar.a() == rectA.height()) && ((gmvVar.b() >= rectA.width() || gmvVar.a() >= rectA.height()) && (gmvVar.b() != rectA.width() || gmvVar.a() != rectA.height())))) {
                    android.graphics.Rect bounds2 = foldingFeature2.getBounds();
                    aooh.e(bounds2, "getBounds(...)");
                    gpyVar = new defpackage.gpy(new gmv(bounds2), gpxVar, gpwVar);
                }
            }
            if (gpyVar != null) {
                arrayList.add(gpyVar);
            }
        }
        int i = gmz.a;
        int engagementModeFlags = gmz.a() >= 10 ? windowLayoutInfo.getEngagementModeFlags() : 3;
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        if ((engagementModeFlags & 1) != 0) {
            linkedHashSet.add(defpackage.gqc.a);
        }
        if ((engagementModeFlags & 2) != 0) {
            linkedHashSet.add(defpackage.gqc.b);
        }
        return new defpackage.gqd(arrayList, ajsz.cf(linkedHashSet));
    }

    public boolean F() {
        return false;
    }

    public boolean G(int[] iArr) {
        return false;
    }

    public fsu(short[] sArr) {
    }

    public fsu() {
    }
}
