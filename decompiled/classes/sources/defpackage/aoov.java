package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class aoov {
    public aoov() {
    }

    public static java.lang.String A(java.lang.String str, java.lang.CharSequence charSequence) {
        if (str == null) {
            defpackage.aooh.i("<this>");
        }
        if (!L(str, charSequence)) {
            return str;
        }
        java.lang.String strSubstring = str.substring(0, str.length() - charSequence.length());
        defpackage.aooh.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static java.lang.String B(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (str == null) {
            defpackage.aooh.i("<this>");
        }
        if (str3 == null) {
            defpackage.aooh.i("missingDelimiterValue");
        }
        int iW = w(str, str2, 0, false);
        if (iW == -1) {
            return str3;
        }
        java.lang.String strSubstring = str.substring(iW + str2.length(), str.length());
        defpackage.aooh.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static java.lang.String C(java.lang.String str, char c, java.lang.String str2) {
        if (str == null) {
            defpackage.aooh.i("<this>");
        }
        if (str2 == null) {
            defpackage.aooh.i("missingDelimiterValue");
        }
        int iN = N(str, c, 0, 6);
        if (iN == -1) {
            return str2;
        }
        java.lang.String strSubstring = str.substring(iN + 1, str.length());
        defpackage.aooh.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static java.lang.String D(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        defpackage.aooh.f(str, "<this>");
        defpackage.aooh.f(str3, "missingDelimiterValue");
        int iAc = ac(str, str2);
        if (iAc == -1) {
            return str3;
        }
        java.lang.String strSubstring = str.substring(iAc + str2.length(), str.length());
        defpackage.aooh.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static java.util.List E(java.lang.CharSequence charSequence) {
        return defpackage.aooc.k(F(charSequence));
    }

    public static defpackage.aoql F(java.lang.CharSequence charSequence) {
        return new aoka(charSequence, 5);
    }

    public static boolean G(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, boolean z) {
        if (charSequence == null) {
            defpackage.aooh.i("<this>");
        }
        if (charSequence2 == null) {
            defpackage.aooh.i("other");
        }
        if (charSequence2 instanceof java.lang.String) {
            if (w(charSequence, (java.lang.String) charSequence2, 0, z) >= 0) {
                return true;
            }
        } else if (bo(charSequence, charSequence2, 0, charSequence.length(), z, false) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean H(java.lang.CharSequence charSequence) {
        if (charSequence == null) {
            defpackage.aooh.i("<this>");
        }
        for (int i = 0; i < charSequence.length(); i++) {
            if (!defpackage.aooh.s(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean I(java.lang.CharSequence charSequence, int i, java.lang.CharSequence charSequence2, int i2, int i3, boolean z) {
        defpackage.aooh.f(charSequence, "<this>");
        defpackage.aooh.f(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!defpackage.aooh.t(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static boolean J(java.lang.CharSequence charSequence, char c) {
        if (charSequence == null) {
            defpackage.aooh.i("<this>");
        }
        return M(charSequence, c, 0) >= 0;
    }

    public static boolean K(java.lang.CharSequence charSequence, char c) {
        defpackage.aooh.f(charSequence, "<this>");
        return charSequence.length() > 0 && defpackage.aooh.t(charSequence.charAt(v(charSequence)), c, false);
    }

    public static boolean L(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        if (charSequence == null) {
            defpackage.aooh.i("<this>");
        }
        return charSequence instanceof java.lang.String ? r((java.lang.String) charSequence, (java.lang.String) charSequence2, false) : I(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), false);
    }

    public static int M(java.lang.CharSequence charSequence, char c, int i) {
        if (charSequence == null) {
            defpackage.aooh.i("<this>");
        }
        if (charSequence instanceof java.lang.String) {
            return ((java.lang.String) charSequence).indexOf(c, i);
        }
        char[] cArr = {c};
        if (charSequence == null) {
            defpackage.aooh.i("<this>");
        }
        if (i < 0) {
            i = 0;
        }
        int iV = v(charSequence);
        if (i > iV) {
            return -1;
        }
        while (!defpackage.aooh.t(cArr[0], charSequence.charAt(i), false)) {
            if (i == iV) {
                return -1;
            }
            i++;
        }
        return i;
    }

    public static /* synthetic */ int N(java.lang.CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            if (charSequence == null) {
                defpackage.aooh.i("<this>");
            }
            i = charSequence.length() - 1;
        }
        if (charSequence == null) {
            defpackage.aooh.i("<this>");
        }
        if (charSequence instanceof java.lang.String) {
            return ((java.lang.String) charSequence).lastIndexOf(c, i);
        }
        char[] cArr = {c};
        if (charSequence == null) {
            defpackage.aooh.i("<this>");
        }
        int iV = v(charSequence);
        if (i > iV) {
            i = iV;
        }
        while (i >= 0) {
            if (defpackage.aooh.t(cArr[0], charSequence.charAt(i), false)) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public static java.lang.String O(java.lang.String str, int i) {
        java.lang.CharSequence charSequenceSubSequence;
        defpackage.aooh.f(str, "<this>");
        defpackage.aooh.f(str, "<this>");
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(i);
            int length = i - str.length();
            if (length > 0) {
                int i2 = 1;
                while (true) {
                    sb.append('0');
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            sb.append((java.lang.CharSequence) str);
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    public static java.lang.String P(java.lang.String str, char c, char c2) {
        if (str == null) {
            defpackage.aooh.i("<this>");
        }
        java.lang.String strReplace = str.replace(c, c2);
        defpackage.aooh.e(strReplace, "replace(...)");
        return strReplace;
    }

    public static java.lang.String Q(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        defpackage.aooh.f(str, "<this>");
        int iW = w(str, str2, 0, false);
        if (iW < 0) {
            return str;
        }
        int length = str2.length();
        int length2 = (str.length() - length) + str3.length();
        if (length2 < 0) {
            throw new java.lang.OutOfMemoryError();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length2);
        int i = 0;
        do {
            sb.append((java.lang.CharSequence) str, i, iW);
            sb.append(str3);
            i = iW + length;
            if (iW >= str.length()) {
                break;
            }
            iW = w(str, str2, iW + defpackage.aooc.t(length, 1), false);
        } while (iW > 0);
        sb.append((java.lang.CharSequence) str, i, str.length());
        return sb.toString();
    }

    public static java.util.List R(java.lang.CharSequence charSequence, char[] cArr) {
        defpackage.aooh.f(charSequence, "<this>");
        return bp(charSequence, java.lang.String.valueOf(cArr[0]), 0);
    }

    public static java.util.List S(java.lang.CharSequence charSequence, java.lang.String[] strArr, int i) {
        if (charSequence == null) {
            defpackage.aooh.i("<this>");
        }
        java.lang.String str = strArr[0];
        if (str.length() > 0) {
            return bp(charSequence, str, i);
        }
        java.util.List listAsList = java.util.Arrays.asList(strArr);
        defpackage.aooh.e(listAsList, "asList(...)");
        aoqp<defpackage.aopq> aoqpVar = new aoqp(new aoqx(charSequence, i, new abkv(listAsList, 13)));
        java.util.ArrayList arrayList = new java.util.ArrayList(10);
        for (defpackage.aopq aopqVar : aoqpVar) {
            if (charSequence == null) {
                defpackage.aooh.i("<this>");
            }
            if (aopqVar == null) {
                defpackage.aooh.i("range");
            }
            arrayList.add(charSequence.subSequence(aopqVar.c().intValue(), aopqVar.b().intValue() + 1).toString());
        }
        return arrayList;
    }

    public static boolean T(java.lang.CharSequence charSequence, char c) {
        if (charSequence == null) {
            defpackage.aooh.i("<this>");
        }
        return charSequence.length() > 0 && defpackage.aooh.t(charSequence.charAt(0), c, false);
    }

    public static java.lang.String U(java.lang.String str, java.lang.String str2) {
        defpackage.aooh.f(str, "<this>");
        defpackage.aooh.f(str2, "missingDelimiterValue");
        int iM = M(str, '/', 0);
        if (iM == -1) {
            return str2;
        }
        java.lang.String strSubstring = str.substring(0, iM);
        defpackage.aooh.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static java.lang.String V(java.lang.String str, java.lang.String str2) {
        defpackage.aooh.f(str, "<this>");
        defpackage.aooh.f(str2, "missingDelimiterValue");
        int iAc = ac(str, ".");
        if (iAc == -1) {
            return str2;
        }
        java.lang.String strSubstring = str.substring(0, iAc);
        defpackage.aooh.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static char W(java.lang.CharSequence charSequence) {
        if (charSequence.length() != 0) {
            return charSequence.charAt(charSequence.length() - 1);
        }
        throw new java.util.NoSuchElementException("Char sequence is empty.");
    }

    public static java.lang.CharSequence X(java.lang.CharSequence charSequence, int i) {
        defpackage.aooh.f(charSequence, "<this>");
        return charSequence.subSequence(0, defpackage.aooc.u(i, charSequence.length()));
    }

    public static java.lang.Character Y(java.lang.CharSequence charSequence, int i) {
        defpackage.aooh.f(charSequence, "<this>");
        if (i < 0 || i >= charSequence.length()) {
            return null;
        }
        return java.lang.Character.valueOf(charSequence.charAt(i));
    }

    public static java.lang.String Z(java.lang.String str, int i) {
        defpackage.aooh.f(str, "<this>");
        if (i < 0) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bs(i, "Requested character count ", " is less than zero."));
        }
        java.lang.String strSubstring = str.substring(defpackage.aooc.u(i, str.length()));
        defpackage.aooh.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static void a(java.lang.Object obj, java.lang.String str) {
        java.lang.ClassCastException classCastException = new java.lang.ClassCastException(defpackage.a.br(str, obj == null ? "null" : obj.getClass().getName(), " cannot be cast to "));
        defpackage.aooh.o(classCastException, defpackage.aoov.class.getName());
        throw classCastException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [aono] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    public static java.lang.Object aA(defpackage.aoxi aoxiVar, defpackage.aono aonoVar, java.lang.Throwable th, defpackage.aoln aolnVar) {
        defpackage.aoxp aoxpVar;
        if (aolnVar instanceof defpackage.aoxp) {
            aoxpVar = (defpackage.aoxp) aolnVar;
            int i = aoxpVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aoxpVar.c = i - Integer.MIN_VALUE;
            } else {
                aoxpVar = new defpackage.aoxp(aolnVar);
            }
        } else {
            aoxpVar = new defpackage.aoxp(aolnVar);
        }
        java.lang.Object obj = aoxpVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = aoxpVar.c;
        try {
            if (i2 == 0) {
                defpackage.aooc.af(obj);
                aoxpVar.a = th;
                aoxpVar.c = 1;
                java.lang.Object objA = aonoVar.a(aoxiVar, th, aoxpVar);
                th = th;
                if (objA == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                java.lang.Object obj2 = aoxpVar.a;
                defpackage.aooc.af(obj);
                th = obj2;
            }
            return defpackage.aojh.a;
        } catch (java.lang.Throwable th2) {
            if (th != 0 && th != th2) {
                aoil.b(th2, (java.lang.Throwable) th);
            }
            throw th2;
        }
    }

    public static void aB(defpackage.aoxi aoxiVar) throws java.lang.Throwable {
        if (aoxiVar instanceof defpackage.aozq) {
            throw ((defpackage.aozq) aoxiVar).a;
        }
    }

    public static defpackage.aoxh aC(defpackage.aoxh aoxhVar, defpackage.aolr aolrVar) {
        if (aolrVar.get(defpackage.aoub.d) != null) {
            java.util.Objects.toString(aolrVar);
            throw new java.lang.IllegalArgumentException("Flow context cannot contain job in it. Had ".concat(java.lang.String.valueOf(aolrVar)));
        }
        if (defpackage.aooh.n(aolrVar, defpackage.aols.a)) {
            return aoxhVar;
        }
        if (aoxhVar instanceof defpackage.apaj) {
            return defpackage.aosv.G((defpackage.apaj) aoxhVar, aolrVar, 0, 0, 6);
        }
        return new defpackage.aozx(aoxhVar, aolrVar, 0, 0, 12);
    }

    public static defpackage.aoxh aD(defpackage.aoxh aoxhVar, int i) {
        if (i < 0 && i != -2) {
            i = -1;
        }
        if (i == -1) {
            i = -1;
        }
        int i2 = i == -1 ? 2 : 1;
        if (i == -1) {
            i = 0;
        }
        int i3 = i;
        return aoxhVar instanceof defpackage.apaj ? defpackage.aosv.G((defpackage.apaj) aoxhVar, null, i3, i2, 1) : new defpackage.aozx(aoxhVar, null, i3, i2, 2);
    }

    public static java.lang.Object aE(defpackage.aoxh aoxhVar, defpackage.aoln aolnVar) {
        java.lang.Object objFM = aoxhVar.fM(defpackage.apal.a, aolnVar);
        return objFM != defpackage.aolu.a ? defpackage.aojh.a : objFM;
    }

    public static java.lang.Object aF(defpackage.aoxh aoxhVar, defpackage.aonn aonnVar, defpackage.aoln aolnVar) {
        int i = defpackage.aoyc.a;
        java.lang.Object objAE = aE(aD(new defpackage.apaa(new defpackage.gdd(aonnVar, (defpackage.aoln) null, 2), aoxhVar), 0), aolnVar);
        return objAE != defpackage.aolu.a ? defpackage.aojh.a : objAE;
    }

    public static java.lang.Object aG(defpackage.aoxi aoxiVar, defpackage.aoxh aoxhVar, defpackage.aoln aolnVar) throws java.lang.Throwable {
        aB(aoxiVar);
        java.lang.Object objFM = aoxhVar.fM(aoxiVar, aolnVar);
        return objFM != defpackage.aolu.a ? defpackage.aojh.a : objFM;
    }

    public static int aH(char c) {
        if (c >= '0' && c < ':') {
            return c - '0';
        }
        if (c >= 'a' && c < 'g') {
            return c - 'W';
        }
        if (c >= 'A' && c < 'G') {
            return c - '7';
        }
        throw new java.lang.IllegalArgumentException("Unexpected hex digit: " + c);
    }

    public static byte[] aI(java.lang.String str) {
        if (str == null) {
            defpackage.aooh.i("<this>");
        }
        byte[] bytes = str.getBytes(defpackage.aoqv.a);
        defpackage.aooh.e(bytes, "getBytes(...)");
        return bytes;
    }

    public static defpackage.apoz aK(defpackage.apqb apqbVar) {
        if (apqbVar == null) {
            defpackage.aooh.i("<this>");
        }
        return new defpackage.appv(apqbVar);
    }

    public static defpackage.apqb aL(java.io.OutputStream outputStream) {
        return new appo(outputStream, new defpackage.apqf());
    }

    public static defpackage.apqb aM(java.net.Socket socket) throws java.io.IOException {
        defpackage.aooh.f(socket, "<this>");
        defpackage.apqq apqqVar = new defpackage.apqq(socket);
        java.io.OutputStream outputStream = socket.getOutputStream();
        defpackage.aooh.e(outputStream, "getOutputStream(...)");
        return new apou(apqqVar, new appo(outputStream, apqqVar));
    }

    public static defpackage.apqd aN(java.io.InputStream inputStream) {
        defpackage.aooh.f(inputStream, "<this>");
        return new appk(inputStream, new defpackage.apqf());
    }

    public static defpackage.apqd aO(java.net.Socket socket) throws java.io.IOException {
        defpackage.aooh.f(socket, "<this>");
        defpackage.apqq apqqVar = new defpackage.apqq(socket);
        java.io.InputStream inputStream = socket.getInputStream();
        defpackage.aooh.e(inputStream, "getInputStream(...)");
        return new apov(apqqVar, new appk(inputStream, apqqVar));
    }

    public static defpackage.appb aP(java.lang.String str) {
        if ((str.length() & 1) != 0) {
            throw new java.lang.IllegalArgumentException("Unexpected hex string: ".concat(str));
        }
        int length = str.length() >> 1;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i << 1;
            bArr[i] = (byte) ((aH(str.charAt(i2)) << 4) + aH(str.charAt(i2 + 1)));
        }
        return new defpackage.appb(bArr);
    }

    public static defpackage.appb aQ(java.lang.String str) {
        if (str == null) {
            defpackage.aooh.i("<this>");
        }
        defpackage.appb appbVar = new defpackage.appb(aI(str));
        appbVar.d = str;
        return appbVar;
    }

    public static defpackage.appb aR(byte... bArr) {
        defpackage.aooh.f(bArr, "data");
        byte[] bArrCopyOf = java.util.Arrays.copyOf(bArr, bArr.length);
        defpackage.aooh.e(bArrCopyOf, "copyOf(...)");
        return new defpackage.appb(bArrCopyOf);
    }

    public static /* synthetic */ defpackage.appb aS(byte[] bArr) {
        int length = bArr.length;
        defpackage.aooh.f(bArr, "<this>");
        long j = length;
        aV(j, 0L, j);
        return new defpackage.appb(defpackage.ajsz.cy(bArr, 0, length));
    }

    public static java.lang.String aT(byte b) {
        char[] cArr = defpackage.apqi.a;
        return new java.lang.String(new char[]{cArr[(b >> 4) & 15], cArr[b & 15]});
    }

    public static java.lang.String aU(int i) {
        if (i == 0) {
            return "0";
        }
        char[] cArr = defpackage.apqi.a;
        int i2 = 0;
        char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
        while (i2 < 8 && cArr2[i2] == '0') {
            i2++;
        }
        if (i2 < 0) {
            throw new java.lang.IndexOutOfBoundsException(defpackage.a.bs(i2, "startIndex: ", ", endIndex: 8, size: 8"));
        }
        if (i2 <= 8) {
            return new java.lang.String(cArr2, i2, 8 - i2);
        }
        throw new java.lang.IllegalArgumentException(defpackage.a.bs(i2, "startIndex: ", " > endIndex: 8"));
    }

    public static void aV(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new java.lang.ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
        }
    }

    public static boolean aW(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        if (bArr == null) {
            defpackage.aooh.i("a");
        }
        if (bArr2 == null) {
            defpackage.aooh.i("b");
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    public static boolean aX() {
        defpackage.apnn apnnVar = defpackage.apnn.b;
        return android.os.Build.VERSION.SDK_INT >= 37;
    }

    public static java.util.List aY(java.util.List list) {
        if (list == null) {
            defpackage.aooh.i("protocols");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (((defpackage.apjf) obj) != defpackage.apjf.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList.size());
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((defpackage.apjf) it.next()).h);
        }
        return arrayList2;
    }

    public static int aZ(int i, int i2, int i3) throws java.io.IOException {
        if ((i2 & 8) != 0) {
            i--;
        }
        if (i3 <= i) {
            return i - i3;
        }
        throw new java.io.IOException(defpackage.a.bf(i, i3, "PROTOCOL_ERROR padding ", " > remaining length "));
    }

    public static java.lang.String aa(java.lang.String str, int i) {
        defpackage.aooh.f(str, "<this>");
        java.lang.String strSubstring = str.substring(0, defpackage.aooc.u(i, str.length()));
        defpackage.aooh.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static java.lang.String ab(java.lang.String str, int i) {
        defpackage.aooh.f(str, "<this>");
        int length = str.length();
        java.lang.String strSubstring = str.substring(length - defpackage.aooc.u(i, length));
        defpackage.aooh.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ int ac(java.lang.CharSequence charSequence, java.lang.String str) {
        int iV = v(charSequence);
        defpackage.aooh.f(charSequence, "<this>");
        return !(charSequence instanceof java.lang.String) ? bo(charSequence, str, iV, 0, false, true) : ((java.lang.String) charSequence).lastIndexOf(str, iV);
    }

    public static boolean ad(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            defpackage.aooh.i("<this>");
        }
        if (str2 == null) {
            defpackage.aooh.i("prefix");
        }
        return str.startsWith(str2);
    }

    public static defpackage.aora ae(java.util.regex.Matcher matcher, int i, java.lang.CharSequence charSequence) {
        if (matcher.find(i)) {
            return new defpackage.aord(matcher, charSequence);
        }
        return null;
    }

    public static defpackage.aosc af(defpackage.aoln aolnVar) {
        defpackage.aosc aoscVar;
        if (!(aolnVar instanceof defpackage.apbn)) {
            return new defpackage.aosc(aolnVar, 1);
        }
        defpackage.aorq aorqVar = ((defpackage.apbn) aolnVar).f;
        while (true) {
            java.lang.Object obj = aorqVar.a;
            if (obj == null) {
                aorqVar.c(defpackage.apbo.b);
                aoscVar = null;
                break;
            }
            if (obj instanceof defpackage.aosc) {
                if (aorqVar.d(obj, defpackage.apbo.b)) {
                    aoscVar = (defpackage.aosc) obj;
                    break;
                }
            } else if (obj != defpackage.apbo.b && !(obj instanceof java.lang.Throwable)) {
                java.util.Objects.toString(obj);
                throw new java.lang.IllegalStateException("Inconsistent state ".concat(obj.toString()));
            }
        }
        if (aoscVar == null) {
            return new defpackage.aosc(aolnVar, 2);
        }
        boolean z = defpackage.aosu.a;
        defpackage.aorq aorqVar2 = aoscVar.d;
        java.lang.Object obj2 = aorqVar2.a;
        if (obj2 instanceof defpackage.aosj) {
            java.lang.Object obj3 = ((defpackage.aosj) obj2).d;
        }
        aoscVar.c.b = 536870911;
        aorqVar2.c(defpackage.aort.a);
        return aoscVar;
    }

    public static /* synthetic */ int ag(java.lang.Object obj) {
        j$.util.Objects.checkIndex(0, 3);
        if (obj == null) {
            return -1;
        }
        if (obj instanceof defpackage.aout) {
            return 0;
        }
        return obj instanceof defpackage.aose ? 1 : -2;
    }

    public static java.lang.Object ah(defpackage.aolr aolrVar, defpackage.aonn aonnVar) throws java.lang.Throwable {
        defpackage.aotm aotmVarA;
        defpackage.aolr aolrVarB;
        long jM;
        if (((defpackage.aolo) aolrVar.get(defpackage.aolo.k)) == null) {
            java.lang.ThreadLocal threadLocal = defpackage.aovj.a;
            aotmVarA = defpackage.aovj.a();
            aolrVarB = defpackage.aosn.b(defpackage.aotv.a, aolrVar.plus(aotmVarA));
        } else {
            java.lang.ThreadLocal threadLocal2 = defpackage.aovj.a;
            aotmVarA = (defpackage.aotm) defpackage.aovj.a.get();
            aolrVarB = defpackage.aosn.b(defpackage.aotv.a, aolrVar);
        }
        defpackage.aorx aorxVar = new defpackage.aorx(aolrVarB, java.lang.Thread.currentThread(), aotmVarA);
        defpackage.aosv.e(1, aonnVar, aorxVar, aorxVar);
        defpackage.aotm aotmVar = aorxVar.c;
        if (aotmVar != null) {
            aotmVar.p(false);
        }
        while (true) {
            if (aotmVar != null) {
                try {
                    jM = aotmVar.m();
                } catch (java.lang.Throwable th) {
                    defpackage.aotm aotmVar2 = aorxVar.c;
                    if (aotmVar2 != null) {
                        aotmVar2.n(false);
                    }
                    throw th;
                }
            } else {
                jM = Long.MAX_VALUE;
            }
            if (aorxVar.x()) {
                break;
            }
            java.util.concurrent.locks.LockSupport.parkNanos(aorxVar, jM);
            if (java.lang.Thread.interrupted()) {
                aorxVar.N(new java.lang.InterruptedException(), null);
            }
        }
        defpackage.aotm aotmVar3 = aorxVar.c;
        if (aotmVar3 != null) {
            aotmVar3.n(false);
        }
        java.lang.Object objB = defpackage.aoum.b(aorxVar.E());
        defpackage.aosk aoskVar = objB instanceof defpackage.aosk ? (defpackage.aosk) objB : null;
        if (aoskVar == null) {
            return objB;
        }
        throw aoskVar.b;
    }

    public static java.lang.Object aj(defpackage.aolr aolrVar, defpackage.aonn aonnVar, defpackage.aoln aolnVar) {
        java.lang.Object objB;
        defpackage.aolr aolrVarU = aolnVar.u();
        defpackage.aolr aolrVarA = defpackage.aosn.a(aolrVarU, aolrVar);
        defpackage.aooc.Y(aolrVarA);
        if (aolrVarA == aolrVarU) {
            defpackage.apcj apcjVar = new defpackage.apcj(aolrVarA, aolnVar);
            objB = defpackage.aooh.aa(apcjVar, true, apcjVar, aonnVar);
        } else {
            defpackage.cch cchVar = defpackage.aolo.k;
            if (defpackage.aooh.n(aolrVarA.get(cchVar), aolrVarU.get(cchVar))) {
                defpackage.aovo aovoVar = new defpackage.aovo(aolrVarA, aolnVar);
                defpackage.aolr aolrVar2 = ((defpackage.aors) aovoVar).a;
                java.lang.Object objB2 = defpackage.apcp.b(aolrVar2, null);
                try {
                    java.lang.Object objAa = defpackage.aooh.aa(aovoVar, true, aovoVar, aonnVar);
                    defpackage.apcp.c(aolrVar2, objB2);
                    objB = objAa;
                } catch (java.lang.Throwable th) {
                    defpackage.apcp.c(aolrVar2, objB2);
                    throw th;
                }
            } else {
                defpackage.aote aoteVar = new defpackage.aote(aolrVarA, aolnVar);
                defpackage.aooh.ac(aonnVar, aoteVar, aoteVar);
                defpackage.aoro aoroVar = aoteVar.b;
                while (true) {
                    int i = aoroVar.b;
                    if (i != 0) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("Already suspended");
                        }
                        objB = defpackage.aoum.b(aoteVar.E());
                        if (!(objB instanceof defpackage.aosk)) {
                            break;
                        }
                        throw ((defpackage.aosk) objB).b;
                    }
                    if (aoroVar.c(0, 1)) {
                        objB = defpackage.aolu.a;
                        break;
                    }
                }
            }
        }
        if (objB == defpackage.aolu.a && aolnVar == null) {
            defpackage.aooh.i("frame");
        }
        return objB;
    }

    public static defpackage.aosy ak(defpackage.aoss aossVar, defpackage.aolr aolrVar, int i, defpackage.aonn aonnVar) {
        defpackage.aolr aolrVarB = defpackage.aosn.b(aossVar, aolrVar);
        aoun aounVar = i == 2 ? new aoun(aolrVarB, aonnVar) : new defpackage.aosz(aolrVarB, true);
        defpackage.aosv.e(i, aonnVar, aounVar, aounVar);
        return aounVar;
    }

    public static defpackage.aoub al(defpackage.aoss aossVar, defpackage.aolr aolrVar, int i, defpackage.aonn aonnVar) {
        defpackage.aolr aolrVarB = defpackage.aosn.b(aossVar, aolrVar);
        defpackage.aors aouoVar = i == 2 ? new defpackage.aouo(aolrVarB, aonnVar) : new defpackage.aovf(aolrVarB, true);
        defpackage.aosv.e(i, aonnVar, aouoVar, aouoVar);
        return aouoVar;
    }

    public static /* synthetic */ defpackage.aosy am(defpackage.aoss aossVar, int i, defpackage.aonn aonnVar, int i2) {
        defpackage.aols aolsVar = (i2 & 1) != 0 ? defpackage.aols.a : null;
        if ((i2 & 2) != 0) {
            i = 1;
        }
        return ak(aossVar, aolsVar, i, aonnVar);
    }

    public static /* synthetic */ defpackage.aoub an(defpackage.aoss aossVar, defpackage.aolr aolrVar, int i, defpackage.aonn aonnVar, int i2) {
        if ((i2 & 1) != 0) {
            aolrVar = defpackage.aols.a;
        }
        if ((i2 & 2) != 0) {
            i = 1;
        }
        return al(aossVar, aolrVar, i, aonnVar);
    }

    public static java.lang.Object ao(defpackage.aolr aolrVar, java.lang.Object obj, java.lang.Object obj2, defpackage.aonn aonnVar, defpackage.aoln aolnVar) {
        java.lang.Object objA;
        java.lang.Object objB = defpackage.apcp.b(aolrVar, obj2);
        try {
            defpackage.apas apasVar = new defpackage.apas(aolnVar, aolrVar);
            if (aonnVar instanceof defpackage.aomb) {
                f(aonnVar, 2);
                objA = aonnVar.a(obj, apasVar);
            } else {
                objA = defpackage.ajsz.an(aonnVar, obj, apasVar);
            }
            defpackage.apcp.c(aolrVar, objB);
            if (objA == defpackage.aolu.a && aolnVar == null) {
                defpackage.aooh.i("frame");
            }
            return objA;
        } catch (java.lang.Throwable th) {
            defpackage.apcp.c(aolrVar, objB);
            throw th;
        }
    }

    public static defpackage.aoxh ap(defpackage.aoxh aoxhVar, defpackage.aoxh aoxhVar2, defpackage.aoxh aoxhVar3, defpackage.aonp aonpVar) {
        return new hlh(new defpackage.aoxh[]{aoxhVar, aoxhVar2, aoxhVar3}, aonpVar, 18);
    }

    public static defpackage.aoxh aq(defpackage.aoxh aoxhVar, defpackage.aoxh aoxhVar2, defpackage.aoxh aoxhVar3, defpackage.aoxh aoxhVar4, defpackage.aoxh aoxhVar5, defpackage.aonr aonrVar) {
        return new defpackage.gdc(new defpackage.aoxh[]{aoxhVar, aoxhVar2, aoxhVar3, aoxhVar4, aoxhVar5}, aonrVar, 14);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static java.lang.Object ar(defpackage.aoxh aoxhVar, defpackage.aoss aossVar, defpackage.aoln aolnVar) {
        aoyl aoylVar;
        if (aolnVar instanceof aoyl) {
            aoylVar = (aoyl) aolnVar;
            int i = aoylVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                aoylVar.b = i - Integer.MIN_VALUE;
            } else {
                aoylVar = new aoyl(aolnVar);
            }
        } else {
            aoylVar = new aoyl(aolnVar);
        }
        java.lang.Object objFI = aoylVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = aoylVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(objFI);
            defpackage.aoza aozaVarBr = br(aoxhVar);
            defpackage.aosi aosiVar = new defpackage.aosi((defpackage.aoub) aossVar.c().get(defpackage.aoub.d));
            an(aossVar, aozaVarBr.c, 0, new ahgx(aozaVarBr.a, aosiVar, (defpackage.aoln) null, 3), 2);
            aoylVar.b = 1;
            objFI = aosiVar.fI(aoylVar);
            if (objFI == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objFI);
        }
        java.lang.Object obj = ((defpackage.aoiw) objFI).a;
        defpackage.aooc.af(obj);
        return obj;
    }

    public static defpackage.aozh as(defpackage.aoxh aoxhVar, defpackage.aoss aossVar, defpackage.aozc aozcVar, java.lang.Object obj) {
        defpackage.aoza aozaVarBr = br(aoxhVar);
        defpackage.aolr aolrVar = aozaVarBr.c;
        defpackage.aoxh aoxhVar2 = aozaVarBr.a;
        defpackage.aozj aozjVarA = defpackage.aozk.a(obj);
        return new defpackage.aoys(aozjVarA, bq(aossVar, aolrVar, aoxhVar2, aozjVarA, aozcVar, obj));
    }

    public static defpackage.aoyt at(defpackage.aoxh aoxhVar, defpackage.aoss aossVar, defpackage.aozc aozcVar) {
        defpackage.aoza aozaVarBr = br(aoxhVar);
        int i = aozaVarBr.b;
        int i2 = aozaVarBr.d;
        defpackage.aolr aolrVar = aozaVarBr.c;
        defpackage.aoxh aoxhVar2 = aozaVarBr.a;
        defpackage.aoyq aoyqVarB = defpackage.aoyx.b(1, i, i2);
        return new defpackage.aoyr(aoyqVarB, bq(aossVar, aolrVar, aoxhVar2, aoyqVarB, aozcVar, defpackage.aoyx.a));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005e  */
    /* JADX WARN: Code duplicated, block: B:30:0x006c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0074  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static java.lang.Object au(defpackage.aoxh aoxhVar, defpackage.aoln aolnVar) {
        defpackage.aoye aoyeVar;
        defpackage.aoot aootVar;
        defpackage.aozr e;
        defpackage.fza fzaVar;
        if (aolnVar instanceof defpackage.aoye) {
            aoyeVar = (defpackage.aoye) aolnVar;
            int i = aoyeVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                aoyeVar.b = i - Integer.MIN_VALUE;
            } else {
                aoyeVar = new defpackage.aoye(aolnVar);
            }
        } else {
            aoyeVar = new defpackage.aoye(aolnVar);
        }
        java.lang.Object obj = aoyeVar.a;
        java.lang.Object obj2 = defpackage.aolu.a;
        int i2 = aoyeVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.aoot aootVar2 = new defpackage.aoot();
            aootVar2.a = defpackage.apam.a;
            defpackage.fza fzaVar2 = new defpackage.fza(aootVar2, 14);
            try {
                aoyeVar.c = aootVar2;
                aoyeVar.d = fzaVar2;
                aoyeVar.b = 1;
                if (aoxhVar.fM(fzaVar2, aoyeVar) != obj2) {
                    aootVar = aootVar2;
                    obj2 = aootVar.a;
                    if (obj2 == defpackage.apam.a) {
                        throw new java.util.NoSuchElementException("Expected at least one element");
                    }
                }
            } catch (defpackage.aozr e2) {
                aootVar = aootVar2;
                e = e2;
                fzaVar = fzaVar2;
                if (e.a == fzaVar) {
                    throw e;
                }
                defpackage.aooc.Y(aoyeVar.u());
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fzaVar = aoyeVar.d;
            aootVar = aoyeVar.c;
            try {
                defpackage.aooc.af(obj);
            } catch (defpackage.aozr e3) {
                e = e3;
                if (e.a == fzaVar) {
                    throw e;
                }
                defpackage.aooc.Y(aoyeVar.u());
            }
            obj2 = aootVar.a;
            if (obj2 == defpackage.apam.a) {
                throw new java.util.NoSuchElementException("Expected at least one element");
            }
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005e  */
    /* JADX WARN: Code duplicated, block: B:30:0x006c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0074  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static java.lang.Object av(defpackage.aoxh aoxhVar, defpackage.aonn aonnVar, defpackage.aoln aolnVar) {
        defpackage.aoyf aoyfVar;
        defpackage.aoot aootVar;
        defpackage.aozr e;
        defpackage.gdb gdbVar;
        if (aolnVar instanceof defpackage.aoyf) {
            aoyfVar = (defpackage.aoyf) aolnVar;
            int i = aoyfVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                aoyfVar.b = i - Integer.MIN_VALUE;
            } else {
                aoyfVar = new defpackage.aoyf(aolnVar);
            }
        } else {
            aoyfVar = new defpackage.aoyf(aolnVar);
        }
        java.lang.Object obj = aoyfVar.a;
        java.lang.Object obj2 = defpackage.aolu.a;
        int i2 = aoyfVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.aoot aootVar2 = new defpackage.aoot();
            aootVar2.a = defpackage.apam.a;
            defpackage.gdb gdbVar2 = new defpackage.gdb(aonnVar, aootVar2, 8);
            try {
                aoyfVar.c = aootVar2;
                aoyfVar.d = gdbVar2;
                aoyfVar.b = 1;
                if (aoxhVar.fM(gdbVar2, aoyfVar) != obj2) {
                    aootVar = aootVar2;
                    obj2 = aootVar.a;
                    if (obj2 == defpackage.apam.a) {
                        throw new java.util.NoSuchElementException("Expected at least one element matching the predicate");
                    }
                }
            } catch (defpackage.aozr e2) {
                aootVar = aootVar2;
                e = e2;
                gdbVar = gdbVar2;
                if (e.a == gdbVar) {
                    throw e;
                }
                defpackage.aooc.Y(aoyfVar.u());
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gdbVar = aoyfVar.d;
            aootVar = aoyfVar.c;
            try {
                defpackage.aooc.af(obj);
            } catch (defpackage.aozr e3) {
                e = e3;
                if (e.a == gdbVar) {
                    throw e;
                }
                defpackage.aooc.Y(aoyfVar.u());
            }
            obj2 = aootVar.a;
            if (obj2 == defpackage.apam.a) {
                throw new java.util.NoSuchElementException("Expected at least one element matching the predicate");
            }
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static java.lang.Object aw(defpackage.aoxh aoxhVar, defpackage.aoln aolnVar) {
        aoyh aoyhVar;
        defpackage.aoot aootVar;
        defpackage.aozr e;
        cep cepVar;
        if (aolnVar instanceof aoyh) {
            aoyhVar = (aoyh) aolnVar;
            int i = aoyhVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                aoyhVar.b = i - Integer.MIN_VALUE;
            } else {
                aoyhVar = new aoyh(aolnVar);
            }
        } else {
            aoyhVar = new aoyh(aolnVar);
        }
        java.lang.Object obj = aoyhVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = aoyhVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.aoot aootVar2 = new defpackage.aoot();
            cep cepVar2 = new cep(aootVar2, 16);
            try {
                aoyhVar.c = aootVar2;
                aoyhVar.d = cepVar2;
                aoyhVar.b = 1;
                if (aoxhVar.fM(cepVar2, aoyhVar) == aoluVar) {
                    return aoluVar;
                }
                aootVar = aootVar2;
            } catch (defpackage.aozr e2) {
                aootVar = aootVar2;
                e = e2;
                cepVar = cepVar2;
                defpackage.aosv.H(e, cepVar);
                defpackage.aooc.Y(aoyhVar.u());
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cepVar = aoyhVar.d;
            aootVar = aoyhVar.c;
            try {
                defpackage.aooc.af(obj);
            } catch (defpackage.aozr e3) {
                e = e3;
                defpackage.aosv.H(e, cepVar);
                defpackage.aooc.Y(aoyhVar.u());
            }
        }
        return aootVar.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static java.lang.Object ax(defpackage.aoxh aoxhVar, defpackage.aonn aonnVar, defpackage.aoln aolnVar) {
        aoyi aoyiVar;
        defpackage.aoot aootVar;
        defpackage.aozr e;
        fyq fyqVar;
        if (aolnVar instanceof aoyi) {
            aoyiVar = (aoyi) aolnVar;
            int i = aoyiVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                aoyiVar.b = i - Integer.MIN_VALUE;
            } else {
                aoyiVar = new aoyi(aolnVar);
            }
        } else {
            aoyiVar = new aoyi(aolnVar);
        }
        java.lang.Object obj = aoyiVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = aoyiVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.aoot aootVar2 = new defpackage.aoot();
            fyq fyqVar2 = new fyq(aonnVar, aootVar2, 19);
            try {
                aoyiVar.c = aootVar2;
                aoyiVar.d = fyqVar2;
                aoyiVar.b = 1;
                if (aoxhVar.fM(fyqVar2, aoyiVar) == aoluVar) {
                    return aoluVar;
                }
                aootVar = aootVar2;
            } catch (defpackage.aozr e2) {
                aootVar = aootVar2;
                e = e2;
                fyqVar = fyqVar2;
                defpackage.aosv.H(e, fyqVar);
                defpackage.aooc.Y(aoyiVar.u());
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fyqVar = aoyiVar.d;
            aootVar = aoyiVar.c;
            try {
                defpackage.aooc.af(obj);
            } catch (defpackage.aozr e3) {
                e = e3;
                defpackage.aosv.H(e, fyqVar);
                defpackage.aooc.Y(aoyiVar.u());
            }
        }
        return aootVar.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static java.lang.Object ay(defpackage.aoxh aoxhVar, defpackage.aoln aolnVar) {
        aoyj aoyjVar;
        defpackage.aoot aootVar;
        if (aolnVar instanceof aoyj) {
            aoyjVar = (aoyj) aolnVar;
            int i = aoyjVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                aoyjVar.b = i - Integer.MIN_VALUE;
            } else {
                aoyjVar = new aoyj(aolnVar);
            }
        } else {
            aoyjVar = new aoyj(aolnVar);
        }
        java.lang.Object obj = aoyjVar.a;
        java.lang.Object obj2 = defpackage.aolu.a;
        int i2 = aoyjVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.aoot aootVar2 = new defpackage.aoot();
            aootVar2.a = defpackage.apam.a;
            cep cepVar = new cep(aootVar2, 17);
            aoyjVar.c = aootVar2;
            aoyjVar.b = 1;
            if (aoxhVar.fM(cepVar, aoyjVar) != obj2) {
                aootVar = aootVar2;
            }
            return obj2;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        aootVar = aoyjVar.c;
        defpackage.aooc.af(obj);
        obj2 = aootVar.a;
        if (obj2 == defpackage.apam.a) {
            throw new java.util.NoSuchElementException("Flow is empty");
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005b  */
    /* JADX WARN: Code duplicated, block: B:34:0x007c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0080  */
    /* JADX WARN: Code duplicated, block: B:38:0x0084  */
    /* JADX WARN: Code duplicated, block: B:40:0x0088  */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static java.lang.Object az(defpackage.aoxh aoxhVar, defpackage.aoxi aoxiVar, defpackage.aoln aolnVar) throws java.lang.Throwable {
        defpackage.aoxt aoxtVar;
        java.lang.Throwable th;
        defpackage.aoot aootVar;
        java.lang.Throwable th2;
        defpackage.aoub aoubVar;
        if (aolnVar instanceof defpackage.aoxt) {
            aoxtVar = (defpackage.aoxt) aolnVar;
            int i = aoxtVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                aoxtVar.b = i - Integer.MIN_VALUE;
            } else {
                aoxtVar = new defpackage.aoxt(aolnVar);
            }
        } else {
            aoxtVar = new defpackage.aoxt(aolnVar);
        }
        java.lang.Object obj = aoxtVar.a;
        java.lang.Object obj2 = defpackage.aolu.a;
        int i2 = aoxtVar.b;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aootVar = aoxtVar.c;
            try {
                defpackage.aooc.af(obj);
                return null;
            } catch (java.lang.Throwable th3) {
                th = th3;
                th2 = (java.lang.Throwable) aootVar.a;
                if (!bs(th, th2)) {
                    throw th;
                }
                aoubVar = (defpackage.aoub) aoxtVar.u().get(defpackage.aoub.d);
                if (aoubVar == null && aoubVar.v() && bs(th, aoubVar.o())) {
                    throw th;
                }
                if (th2 == null) {
                    return th;
                }
                if (th instanceof java.util.concurrent.CancellationException) {
                    aoil.b(th2, th);
                    throw th2;
                }
                aoil.b(th, th2);
                throw th;
            }
        }
        defpackage.aooc.af(obj);
        defpackage.aoot aootVar2 = new defpackage.aoot();
        try {
            defpackage.aoxi gdbVar = new defpackage.gdb(aoxiVar, aootVar2, 6);
            aoxtVar.c = aootVar2;
            aoxtVar.b = 1;
            if (aoxhVar.fM(gdbVar, aoxtVar) != obj2) {
                return null;
            }
            return obj2;
        } catch (java.lang.Throwable th4) {
            th = th4;
            aootVar = aootVar2;
            th2 = (java.lang.Throwable) aootVar.a;
            if (!bs(th, th2)) {
                throw th;
            }
            aoubVar = (defpackage.aoub) aoxtVar.u().get(defpackage.aoub.d);
            if (aoubVar == null) {
            }
            if (th2 == null) {
                return th;
            }
            if (th instanceof java.util.concurrent.CancellationException) {
                aoil.b(th2, th);
                throw th2;
            }
            aoil.b(th, th2);
            throw th;
        }
    }

    public static boolean b(java.lang.Object obj, int i) {
        int iDa;
        if (!(obj instanceof defpackage.aoio)) {
            return false;
        }
        if (obj instanceof defpackage.aooe) {
            iDa = ((defpackage.aooe) obj).da();
        } else if (obj instanceof defpackage.aomy) {
            iDa = 0;
        } else if (obj instanceof defpackage.aonj) {
            iDa = 1;
        } else if (obj instanceof defpackage.aonn) {
            iDa = 2;
        } else if (obj instanceof defpackage.aono) {
            iDa = 3;
        } else if (obj instanceof defpackage.aonp) {
            iDa = 4;
        } else if (obj instanceof defpackage.aonq) {
            iDa = 5;
        } else if (obj instanceof defpackage.aonr) {
            iDa = 6;
        } else if (obj instanceof defpackage.aons) {
            iDa = 7;
        } else if (obj instanceof defpackage.aont) {
            iDa = 8;
        } else if (obj instanceof defpackage.aonu) {
            iDa = 9;
        } else if (obj instanceof defpackage.aomz) {
            iDa = 10;
        } else if (obj instanceof defpackage.aona) {
            iDa = 11;
        } else if (obj instanceof defpackage.aonb) {
            iDa = 12;
        } else if (obj instanceof defpackage.aonc) {
            iDa = 13;
        } else if (obj instanceof defpackage.aond) {
            iDa = 14;
        } else if (obj instanceof defpackage.aone) {
            iDa = 15;
        } else if (obj instanceof defpackage.aonf) {
            iDa = 16;
        } else if (obj instanceof defpackage.aong) {
            iDa = 17;
        } else if (obj instanceof defpackage.aonh) {
            iDa = 18;
        } else if (obj instanceof defpackage.aoni) {
            iDa = 19;
        } else if (obj instanceof defpackage.aonk) {
            iDa = 20;
        } else if (obj instanceof defpackage.aonl) {
            iDa = 21;
        } else {
            iDa = obj instanceof defpackage.aonm ? 22 : -1;
        }
        return iDa == i;
    }

    public static defpackage.apme ba(int i) {
        for (defpackage.apme apmeVar : defpackage.apme.values()) {
            if (apmeVar.o == i) {
                return apmeVar;
            }
        }
        return null;
    }

    public static defpackage.aplu bb(java.lang.String str) throws java.net.ProtocolException {
        defpackage.apjf apjfVar;
        int i;
        java.lang.String strSubstring;
        if (str.startsWith("HTTP/1.")) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new java.net.ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt == 0) {
                apjfVar = defpackage.apjf.HTTP_1_0;
            } else {
                if (iCharAt != 1) {
                    throw new java.net.ProtocolException("Unexpected status line: ".concat(str));
                }
                apjfVar = defpackage.apjf.HTTP_1_1;
            }
        } else if (str.startsWith("ICY ")) {
            apjfVar = defpackage.apjf.HTTP_1_0;
            i = 4;
        } else {
            if (!str.startsWith("SOURCETABLE ")) {
                throw new java.net.ProtocolException("Unexpected status line: ".concat(str));
            }
            apjfVar = defpackage.apjf.HTTP_1_1;
            i = 12;
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new java.net.ProtocolException("Unexpected status line: ".concat(str));
        }
        java.lang.String strSubstring2 = str.substring(i, i2);
        defpackage.aooh.e(strSubstring2, "substring(...)");
        if (strSubstring2 == null) {
            defpackage.aooh.i("<this>");
        }
        java.lang.Integer numP = p(strSubstring2, 10);
        if (numP == null) {
            throw new java.net.ProtocolException("Unexpected status line: ".concat(str));
        }
        int length = str.length();
        int iIntValue = numP.intValue();
        if (length <= i2) {
            strSubstring = "";
        } else {
            if (str.charAt(i2) != ' ') {
                throw new java.net.ProtocolException("Unexpected status line: ".concat(str));
            }
            strSubstring = str.substring(i + 4);
            defpackage.aooh.e(strSubstring, "substring(...)");
        }
        return new defpackage.aplu(apjfVar, iIntValue, strSubstring);
    }

    public static java.lang.String bc(defpackage.apiw apiwVar) {
        java.lang.String strB = apiwVar.b();
        java.lang.String strC = apiwVar.c();
        return strC != null ? defpackage.a.bE(strC, (byte) 63, strB) : strB;
    }

    public static boolean bd(java.lang.String str) {
        if (str == null) {
            defpackage.aooh.i("method");
        }
        return (defpackage.aooh.n(str, "GET") || defpackage.aooh.n(str, "HEAD")) ? false : true;
    }

    public static java.lang.String be(defpackage.apiu apiuVar, int i) {
        java.lang.String str = (java.lang.String) defpackage.ajsz.cP(apiuVar.b, i << 1);
        if (str != null) {
            return str;
        }
        throw new java.lang.IndexOutOfBoundsException(defpackage.a.bw((byte) 93, i, "name["));
    }

    public static java.lang.String bf(defpackage.apiu apiuVar, int i) {
        java.lang.String str = (java.lang.String) defpackage.ajsz.cP(apiuVar.b, (i << 1) + 1);
        if (str != null) {
            return str;
        }
        throw new java.lang.IndexOutOfBoundsException(defpackage.a.bw((byte) 93, i, "value["));
    }

    public static java.util.Iterator bg(defpackage.apiu apiuVar) {
        int iA = apiuVar.a();
        defpackage.aoiu[] aoiuVarArr = new defpackage.aoiu[iA];
        for (int i = 0; i < iA; i++) {
            aoiuVarArr[i] = new defpackage.aoiu(be(apiuVar, i), bf(apiuVar, i));
        }
        return defpackage.aooc.H(aoiuVarArr);
    }

    public static void bh(java.lang.String str) {
        if (str == null) {
            defpackage.aooh.i("name");
        }
        if (str.length() <= 0) {
            throw new java.lang.IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt < '!' || cCharAt >= 127) {
                throw new java.lang.IllegalArgumentException("Unexpected char 0x" + bu(cCharAt) + " at " + i + " in header name: " + str);
            }
        }
    }

    public static void bi(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            defpackage.aooh.i("value");
        }
        if (str2 == null) {
            defpackage.aooh.i("name");
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && (cCharAt < ' ' || cCharAt >= 127)) {
                throw new java.lang.IllegalArgumentException("Unexpected char 0x" + bu(cCharAt) + " at " + i + " in " + str2 + " value" + (defpackage.apjv.l(str2) ? "" : ": ".concat(java.lang.String.valueOf(str))));
            }
        }
    }

    public static int bj(java.lang.String str, java.lang.String str2, int i) {
        while (i < str.length()) {
            if (J(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return str.length();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Collection] */
    public static defpackage.zzx bk(defpackage.apiu apiuVar) {
        defpackage.zzx zzxVar = new defpackage.zzx((byte[]) null, (short[]) null);
        ?? r1 = zzxVar.a;
        java.lang.String[] strArr = apiuVar.b;
        if (strArr == null) {
            defpackage.aooh.i("elements");
            defpackage.aooh.i("<this>");
        }
        java.util.List listAsList = java.util.Arrays.asList(strArr);
        defpackage.aooh.e(listAsList, "asList(...)");
        r1.addAll(listAsList);
        return zzxVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Collection] */
    public static defpackage.apiu bl(defpackage.zzx zzxVar) {
        return new defpackage.apiu((java.lang.String[]) zzxVar.a.toArray(new java.lang.String[0]));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    public static void bm(defpackage.zzx zzxVar, java.lang.String str, java.lang.String str2) {
        if (str == null) {
            defpackage.aooh.i("name");
        }
        if (str2 == null) {
            defpackage.aooh.i("value");
        }
        ?? r1 = zzxVar.a;
        r1.add(str);
        r1.add(x(str2).toString());
    }

    private static defpackage.aonj bn() {
        return "".length() == 0 ? new agkh(17) : new agkc(18, (byte[]) null);
    }

    private static int bo(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        defpackage.aopo aopoVar;
        int i3;
        if (z2) {
            if (charSequence == null) {
                defpackage.aooh.i("<this>");
            }
            int length = charSequence.length() - 1;
            if (i > length) {
                i = length;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            aopoVar = new defpackage.aopo(i, i2, -1);
        } else {
            if (i < 0) {
                i = 0;
            }
            int length2 = charSequence.length();
            if (i2 > length2) {
                i2 = length2;
            }
            aopoVar = new defpackage.aopq(i, i2);
        }
        if ((charSequence instanceof java.lang.String) && (charSequence2 instanceof java.lang.String)) {
            int i4 = aopoVar.a;
            int i5 = aopoVar.b;
            int i6 = aopoVar.c;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                i3 = i4;
                while (true) {
                    java.lang.String str = (java.lang.String) charSequence2;
                    boolean z3 = z;
                    if (t(str, 0, (java.lang.String) charSequence, i3, str.length(), z3)) {
                        break;
                    }
                    if (i3 == i5) {
                        return -1;
                    }
                    i3 += i6;
                    z = z3;
                }
            } else {
                return -1;
            }
        } else {
            int i7 = aopoVar.a;
            int i8 = aopoVar.b;
            int i9 = aopoVar.c;
            if ((i9 <= 0 || i7 > i8) && (i9 >= 0 || i8 > i7)) {
                return -1;
            }
            i3 = i7;
            while (true) {
                java.lang.CharSequence charSequence3 = charSequence;
                java.lang.CharSequence charSequence4 = charSequence2;
                if (I(charSequence4, 0, charSequence3, i3, charSequence2.length(), z)) {
                    break;
                }
                if (i3 == i8) {
                    return -1;
                }
                i3 += i9;
                charSequence2 = charSequence4;
                charSequence = charSequence3;
            }
        }
        return i3;
    }

    private static java.util.List bp(java.lang.CharSequence charSequence, java.lang.String str, int i) {
        int iW = w(charSequence, str, 0, false);
        if (iW != -1) {
            if (i != 1) {
                boolean z = i > 0;
                java.util.ArrayList arrayList = new java.util.ArrayList(z ? i : 10);
                int length = 0;
                do {
                    arrayList.add(charSequence.subSequence(length, iW).toString());
                    length = str.length() + iW;
                    if (z && arrayList.size() == i - 1) {
                        break;
                    }
                    iW = w(charSequence, str, length, false);
                } while (iW != -1);
                arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
                return arrayList;
            }
        }
        java.util.List listSingletonList = java.util.Collections.singletonList(charSequence.toString());
        defpackage.aooh.e(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    private static defpackage.aoub bq(defpackage.aoss aossVar, defpackage.aolr aolrVar, defpackage.aoxh aoxhVar, defpackage.aoyq aoyqVar, defpackage.aozc aozcVar, java.lang.Object obj) {
        boolean zN = defpackage.aooh.n(aozcVar, defpackage.aozb.a);
        return al(aossVar, aolrVar, true != zN ? 4 : 1, new defpackage.eeb(aozcVar, aoxhVar, aoyqVar, obj, (defpackage.aoln) null, 2));
    }

    private static defpackage.aoza br(defpackage.aoxh aoxhVar) {
        defpackage.aozv aozvVar;
        defpackage.aoxh aoxhVarF;
        boolean z = defpackage.aosu.a;
        int i = defpackage.aowi.f;
        int i2 = defpackage.aowh.a;
        if (i2 <= 1) {
            i2 = 1;
        }
        int i3 = i2 - 1;
        if (!(aoxhVar instanceof defpackage.aozv) || (aoxhVarF = (aozvVar = (defpackage.aozv) aoxhVar).f()) == null) {
            return new defpackage.aoza(aoxhVar, i3, 1, defpackage.aols.a);
        }
        int i4 = aozvVar.b;
        if (i4 != -3 && i4 != -2 && i4 != 0) {
            i3 = i4;
        } else if (aozvVar.c != 1 || i4 == 0) {
            i3 = 0;
        }
        return new defpackage.aoza(aoxhVarF, i3, aozvVar.c, aozvVar.a);
    }

    private static boolean bs(java.lang.Throwable th, java.lang.Throwable th2) {
        if (th2 != null) {
            boolean z = defpackage.apba.a;
            boolean z2 = defpackage.apba.a;
            if (!z2 && defpackage.aosu.b) {
                th2 = defpackage.apcl.c(th2);
            }
            if (!z2 && defpackage.aosu.b) {
                th = defpackage.apcl.c(th);
            }
            if (defpackage.aooh.n(th2, th)) {
                return true;
            }
        }
        return false;
    }

    private final void bt(long j, defpackage.apoy apoyVar, int i, java.util.List list, int i2, int i3, java.util.List list2) {
        int i4;
        long j2;
        java.util.List list3;
        int i5;
        int i6 = i;
        int i7 = i2;
        java.util.List list4 = list2;
        if (i7 >= i3) {
            throw new java.lang.IllegalArgumentException("Failed requirement.");
        }
        for (int i8 = i7; i8 < i3; i8++) {
            if (((defpackage.appb) list.get(i8)).c() < i6) {
                throw new java.lang.IllegalArgumentException("Failed requirement.");
            }
        }
        defpackage.appb appbVar = (defpackage.appb) list.get(i2);
        defpackage.appb appbVar2 = (defpackage.appb) list.get(i3 - 1);
        if (i6 == appbVar.c()) {
            int iIntValue = ((java.lang.Number) list4.get(i7)).intValue();
            i7++;
            i4 = iIntValue;
            appbVar = (defpackage.appb) list.get(i7);
        } else {
            i4 = -1;
        }
        int i9 = i7 + 1;
        long j3 = 4;
        if (appbVar.a(i6) == appbVar2.a(i6)) {
            int iMin = java.lang.Math.min(appbVar.c(), appbVar2.c());
            int i10 = 0;
            for (int i11 = i6; i11 < iMin && appbVar.a(i11) == appbVar2.a(i11); i11++) {
                i10++;
            }
            long j4 = j + (apoyVar.b / 4) + 2;
            long j5 = i10;
            apoyVar.P(-i10);
            apoyVar.P(i4);
            int i12 = i6 + i10;
            while (i6 < i12) {
                apoyVar.P(appbVar.a(i6) & 255);
                i6++;
            }
            if (i9 == i3) {
                if (i12 != ((defpackage.appb) list.get(i7)).c()) {
                    throw new java.lang.IllegalStateException("Check failed.");
                }
                apoyVar.P(((java.lang.Number) list4.get(i7)).intValue());
                return;
            } else {
                long j6 = j4 + j5 + 1;
                defpackage.apoy apoyVar2 = new defpackage.apoy();
                apoyVar.P(-((int) ((apoyVar2.b / 4) + j6)));
                bt(j6, apoyVar2, i12, list, i7, i3, list4);
                apoyVar.M(apoyVar2);
                return;
            }
        }
        int i13 = 1;
        while (i9 < i3) {
            if (((defpackage.appb) list.get(i9 - 1)).a(i6) != ((defpackage.appb) list.get(i9)).a(i6)) {
                i13++;
            }
            i9++;
        }
        long j7 = j + (apoyVar.b / 4) + 2;
        int i14 = i13 << 1;
        apoyVar.P(i13);
        apoyVar.P(i4);
        for (int i15 = i7; i15 < i3; i15++) {
            byte bA = ((defpackage.appb) list.get(i15)).a(i6);
            if (i15 == i7 || bA != ((defpackage.appb) list.get(i15 - 1)).a(i6)) {
                apoyVar.P(bA & 255);
            }
        }
        defpackage.apoy apoyVar3 = new defpackage.apoy();
        int i16 = i7;
        while (i16 < i3) {
            int i17 = i6 + 1;
            byte bA2 = ((defpackage.appb) list.get(i16)).a(i6);
            int i18 = i16 + 1;
            int i19 = i18;
            while (true) {
                if (i19 >= i3) {
                    j2 = j3;
                    i19 = i3;
                    break;
                } else {
                    j2 = j3;
                    if (bA2 != ((defpackage.appb) list.get(i19)).a(i6)) {
                        break;
                    }
                    i19++;
                    j3 = j2;
                }
            }
            if (i18 == i19 && i17 == ((defpackage.appb) list.get(i16)).c()) {
                apoyVar.P(((java.lang.Number) list4.get(i16)).intValue());
                int i20 = i19;
                list3 = list4;
                i5 = i20;
            } else {
                long j8 = ((long) i14) + j7;
                apoyVar.P(-((int) ((apoyVar3.b / j2) + j8)));
                int i21 = i19;
                list3 = list4;
                i5 = i21;
                bt(j8, apoyVar3, i17, list, i16, i5, list3);
            }
            i16 = i5;
            list4 = list3;
            i14 = i14;
            j3 = j2;
        }
        apoyVar.M(apoyVar3);
    }

    private static java.lang.String bu(char c) {
        java.lang.String string = java.lang.Integer.toString(c, 16);
        defpackage.aooh.e(string, "toString(...)");
        return string.length() < 2 ? "0".concat(java.lang.String.valueOf(string)) : string;
    }

    public static boolean c(java.lang.Object obj) {
        if (obj instanceof java.util.List) {
            return !(obj instanceof defpackage.aoow) || (obj instanceof defpackage.aooy);
        }
        return false;
    }

    public static boolean d(java.lang.Object obj) {
        if (obj instanceof java.util.Map.Entry) {
            return !(obj instanceof defpackage.aoow) || (obj instanceof aooz);
        }
        return false;
    }

    public static boolean e(java.lang.Object obj) {
        if (obj instanceof java.util.Set) {
            return !(obj instanceof defpackage.aoow) || (obj instanceof defpackage.aopb);
        }
        return false;
    }

    public static void f(java.lang.Object obj, int i) {
        if (obj == null || b(obj, i)) {
            return;
        }
        a(obj, defpackage.a.bj(i, "kotlin.jvm.functions.Function"));
    }

    public static void g(java.lang.Object obj) {
        if (!(obj instanceof defpackage.aoow) || (obj instanceof defpackage.aopa)) {
            return;
        }
        a(obj, "kotlin.collections.MutableMap");
    }

    public static int h(double d) {
        if (java.lang.Double.isNaN(d)) {
            throw new java.lang.IllegalArgumentException("Cannot round NaN value.");
        }
        if (d > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) java.lang.Math.round(d);
    }

    public static int i(float f) {
        if (java.lang.Float.isNaN(f)) {
            throw new java.lang.IllegalArgumentException("Cannot round NaN value.");
        }
        return java.lang.Math.round(f);
    }

    public static long j(double d) {
        if (java.lang.Double.isNaN(d)) {
            throw new java.lang.IllegalArgumentException("Cannot round NaN value.");
        }
        return java.lang.Math.round(d);
    }

    public static void k(java.lang.Appendable appendable, java.lang.Object obj, defpackage.aonj aonjVar) {
        if (aonjVar != null) {
            appendable.append((java.lang.CharSequence) aonjVar.a(obj));
            return;
        }
        if (obj == null || (obj instanceof java.lang.CharSequence)) {
            appendable.append((java.lang.CharSequence) obj);
        } else if (obj instanceof java.lang.Character) {
            appendable.append(((java.lang.Character) obj).charValue());
        } else {
            appendable.append(obj.toString());
        }
    }

    public static java.lang.String l(java.lang.String str) throws java.io.IOException {
        int length;
        java.lang.String str2;
        java.util.List listE = E(str);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listE) {
            if (!H((java.lang.String) obj)) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(defpackage.ajsz.bl(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            length = 0;
            if (!it.hasNext()) {
                break;
            }
            java.lang.String str3 = (java.lang.String) it.next();
            int length2 = str3.length();
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (!defpackage.aooh.s(str3.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = str3.length();
            }
            arrayList2.add(java.lang.Integer.valueOf(length));
        }
        java.lang.Integer num = (java.lang.Integer) defpackage.ajsz.bB(arrayList2);
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listE.size();
        defpackage.aonj aonjVarBn = bn();
        int iAZ = defpackage.ajsz.aZ(listE);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj2 : listE) {
            int i = length + 1;
            if (length < 0) {
                defpackage.ajsz.bh();
            }
            java.lang.String str4 = (java.lang.String) obj2;
            if ((length == 0 || length == iAZ) && H(str4)) {
                str4 = null;
            } else {
                java.lang.String strZ = Z(str4, iIntValue);
                if (strZ != null && (str2 = (java.lang.String) aonjVarBn.a(strZ)) != null) {
                    str4 = str2;
                }
            }
            if (str4 != null) {
                arrayList3.add(str4);
            }
            length = i;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length3);
        defpackage.ajsz.cq(arrayList3, sb, "\n", "", "", -1, "...", null);
        return sb.toString();
    }

    public static java.lang.String m(java.lang.String str) {
        return defpackage.aooc.o(new aoqt(F(str), new agkc(17), 2), "\n");
    }

    public static java.lang.String n(java.lang.String str) throws java.io.IOException {
        java.lang.String str2;
        if (H("|")) {
            throw new java.lang.IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        java.util.List listE = E(str);
        int length = str.length();
        listE.size();
        defpackage.aonj aonjVarBn = bn();
        int iAZ = defpackage.ajsz.aZ(listE);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 0;
        for (java.lang.Object obj : listE) {
            int i2 = i + 1;
            if (i < 0) {
                defpackage.ajsz.bh();
            }
            java.lang.String str3 = (java.lang.String) obj;
            java.lang.String strSubstring = null;
            if ((i == 0 || i == iAZ) && H(str3)) {
                str3 = null;
            } else {
                int length2 = str3.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!defpackage.aooh.s(str3.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                if (i3 != -1 && u(str3, "|", i3, false)) {
                    defpackage.aooh.d(str3, "null cannot be cast to non-null type java.lang.String");
                    strSubstring = str3.substring(i3 + 1);
                    defpackage.aooh.e(strSubstring, "substring(...)");
                }
                if (strSubstring != null && (str2 = (java.lang.String) aonjVarBn.a(strSubstring)) != null) {
                    str3 = str2;
                }
            }
            if (str3 != null) {
                arrayList.add(str3);
            }
            i = i2;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length);
        defpackage.ajsz.cq(arrayList, sb, "\n", "", "", -1, "...", null);
        return sb.toString();
    }

    public static java.lang.Integer o(java.lang.String str) {
        if (str == null) {
            defpackage.aooh.i("<this>");
        }
        return p(str, 10);
    }

    public static java.lang.Integer p(java.lang.String str, int i) {
        boolean z;
        int i2;
        int i3;
        if (str == null) {
            defpackage.aooh.i("<this>");
        }
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i4 = 0;
        char cCharAt = str.charAt(0);
        int i5 = -2147483647;
        if (cCharAt < '0') {
            i2 = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i5 = Integer.MIN_VALUE;
                z = true;
            }
        } else {
            z = false;
            i2 = 0;
        }
        int i6 = -59652323;
        while (i2 < length) {
            int iDigit = java.lang.Character.digit((int) str.charAt(i2), i);
            if (iDigit < 0) {
                return null;
            }
            if ((i4 < i6 && (i6 != -59652323 || i4 < (i6 = i5 / i))) || (i3 = i4 * i) < i5 + iDigit) {
                return null;
            }
            i4 = i3 - iDigit;
            i2++;
        }
        return z ? java.lang.Integer.valueOf(i4) : java.lang.Integer.valueOf(-i4);
    }

    public static java.lang.Long q(java.lang.String str) {
        int i;
        defpackage.aooh.f(str, "<this>");
        defpackage.aooh.f(str, "<this>");
        int length = str.length();
        if (length == 0) {
            return null;
        }
        boolean z = false;
        char cCharAt = str.charAt(0);
        long j = -9223372036854775807L;
        if (cCharAt < '0') {
            i = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt != '+') {
                if (cCharAt != '-') {
                    return null;
                }
                j = Long.MIN_VALUE;
                z = true;
            }
        } else {
            i = 0;
        }
        long j2 = 0;
        long j3 = -256204778801521550L;
        while (i < length) {
            int iDigit = java.lang.Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if (j2 < j3) {
                if (j3 != -256204778801521550L) {
                    return null;
                }
                j3 = -922337203685477580L;
                if (j2 < -922337203685477580L) {
                    return null;
                }
            }
            long j4 = j2 * 10;
            long j5 = iDigit;
            if (j4 < j + j5) {
                return null;
            }
            j2 = j4 - j5;
            i++;
        }
        return z ? java.lang.Long.valueOf(j2) : java.lang.Long.valueOf(-j2);
    }

    public static boolean r(java.lang.String str, java.lang.String str2, boolean z) {
        if (str == null) {
            defpackage.aooh.i("<this>");
        }
        if (str2 == null) {
            defpackage.aooh.i("suffix");
        }
        return !z ? str.endsWith(str2) : t(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    public static boolean s(java.lang.String str, java.lang.String str2, boolean z) {
        if (str == null) {
            return str2 == null;
        }
        return !z ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static boolean t(java.lang.String str, int i, java.lang.String str2, int i2, int i3, boolean z) {
        if (str == null) {
            defpackage.aooh.i("<this>");
        }
        if (str2 == null) {
            defpackage.aooh.i("other");
        }
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(true, i, str2, i2, i3);
    }

    public static boolean u(java.lang.String str, java.lang.String str2, int i, boolean z) {
        if (str == null) {
            defpackage.aooh.i("<this>");
        }
        return !z ? str.startsWith(str2, i) : t(str, i, str2, 0, str2.length(), true);
    }

    public static int v(java.lang.CharSequence charSequence) {
        if (charSequence == null) {
            defpackage.aooh.i("<this>");
        }
        return charSequence.length() - 1;
    }

    public static int w(java.lang.CharSequence charSequence, java.lang.String str, int i, boolean z) {
        if (charSequence == null) {
            defpackage.aooh.i("<this>");
        }
        if (str == null) {
            defpackage.aooh.i("string");
        }
        return (z || !(charSequence instanceof java.lang.String)) ? bo(charSequence, str, i, charSequence.length(), z, false) : ((java.lang.String) charSequence).indexOf(str, i);
    }

    public static java.lang.CharSequence x(java.lang.CharSequence charSequence) {
        if (charSequence == null) {
            defpackage.aooh.i("<this>");
        }
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zS = defpackage.aooh.s(charSequence.charAt(true != z ? i : length));
            if (z) {
                if (!zS) {
                    break;
                }
                length--;
            } else if (zS) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static java.lang.CharSequence y(java.lang.CharSequence charSequence) {
        defpackage.aooh.f(charSequence, "<this>");
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!defpackage.aooh.s(charSequence.charAt(i))) {
                return charSequence.subSequence(i, charSequence.length());
            }
        }
        return "";
    }

    public static java.lang.String z(java.lang.String str, java.lang.CharSequence charSequence) {
        java.lang.String str2;
        java.lang.CharSequence charSequence2;
        boolean zI;
        if (str == null) {
            defpackage.aooh.i("<this>");
        }
        if (charSequence == null) {
            defpackage.aooh.i("prefix");
        }
        if (str == null) {
            defpackage.aooh.i("<this>");
        }
        if (charSequence == null) {
            defpackage.aooh.i("prefix");
        }
        if ((str instanceof java.lang.String) && (charSequence instanceof java.lang.String)) {
            str2 = str;
            zI = ad(str, (java.lang.String) charSequence);
            charSequence2 = charSequence;
        } else {
            str2 = str;
            charSequence2 = charSequence;
            zI = I(str2, 0, charSequence2, 0, charSequence.length(), false);
        }
        if (!zI) {
            return str2;
        }
        java.lang.String strSubstring = str2.substring(charSequence2.length());
        defpackage.aooh.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final defpackage.appn aJ(defpackage.appb... appbVarArr) {
        java.util.List arrayList = new java.util.ArrayList(new defpackage.aojv(appbVarArr, false));
        defpackage.ajsz.bn(arrayList);
        int size = arrayList.size();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(-1);
        }
        int length = appbVarArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            arrayList2.set(defpackage.ajsz.bj(arrayList, appbVarArr[i2], arrayList.size()), java.lang.Integer.valueOf(i3));
            i2++;
            i3++;
        }
        if (((defpackage.appb) arrayList.get(0)).c() <= 0) {
            throw new java.lang.IllegalArgumentException("the empty byte string is not a supported option");
        }
        int i4 = 0;
        while (i4 < arrayList.size()) {
            defpackage.appb appbVar = (defpackage.appb) arrayList.get(i4);
            int i5 = i4 + 1;
            int i6 = i5;
            while (i6 < arrayList.size()) {
                defpackage.appb appbVar2 = (defpackage.appb) arrayList.get(i6);
                if (!appbVar2.m(appbVar)) {
                    break;
                }
                if (appbVar2.c() == appbVar.c()) {
                    java.util.Objects.toString(appbVar2);
                    throw new java.lang.IllegalArgumentException("duplicate option: ".concat(java.lang.String.valueOf(appbVar2)));
                }
                if (((java.lang.Number) arrayList2.get(i6)).intValue() > ((java.lang.Number) arrayList2.get(i4)).intValue()) {
                    arrayList.remove(i6);
                    ((java.lang.Number) arrayList2.remove(i6)).intValue();
                } else {
                    i6++;
                }
            }
            i4 = i5;
        }
        defpackage.apoy apoyVar = new defpackage.apoy();
        bt(0L, apoyVar, 0, arrayList, 0, arrayList.size(), arrayList2);
        int i7 = (int) (apoyVar.b / 4);
        int[] iArr = new int[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            iArr[i8] = apoyVar.f();
        }
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(appbVarArr, appbVarArr.length);
        defpackage.aooh.e(objArrCopyOf, "copyOf(...)");
        return new defpackage.appn((defpackage.appb[]) objArrCopyOf, iArr);
    }

    public aoov(byte[] bArr) {
    }
}
