package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class anty {
    private anty() {
    }

    public static /* synthetic */ java.lang.reflect.Field A(java.lang.Class cls, java.lang.String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ sun.misc.Unsafe B() throws java.lang.IllegalAccessException {
        for (java.lang.reflect.Field field : sun.misc.Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            java.lang.Object obj = field.get(null);
            if (sun.misc.Unsafe.class.isInstance(obj)) {
                return (sun.misc.Unsafe) sun.misc.Unsafe.class.cast(obj);
            }
        }
        return null;
    }

    public static /* synthetic */ int C(int[] iArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + iArr[i3];
        }
        return i2;
    }

    public static /* synthetic */ int D(java.lang.Object[] objArr, int i) {
        int iHashCode = 17;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode = (iHashCode * 31) + objArr[i2].hashCode();
        }
        return iHashCode;
    }

    public static /* synthetic */ boolean E(java.lang.Object[] objArr, java.lang.Object[] objArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (!objArr[i2].equals(objArr2[i2])) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean F(int[] iArr, int[] iArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ java.lang.String G(byte[] bArr) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(bArr.length);
        for (byte b : bArr) {
            if (b == 34) {
                sb.append("\\\"");
            } else if (b == 39) {
                sb.append("\\'");
            } else if (b != 92) {
                switch (b) {
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        sb.append("\\a");
                        break;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (b < 32 || b > 126) {
                            sb.append('\\');
                            sb.append((char) (((b >>> 6) & 3) + 48));
                            sb.append((char) (((b >>> 3) & 7) + 48));
                            sb.append((char) ((b & 7) + 48));
                        } else {
                            sb.append((char) b);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static /* synthetic */ boolean H(java.lang.Object obj, java.lang.Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static /* synthetic */ java.lang.reflect.Field I(java.lang.Class cls, java.lang.String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (java.lang.NoSuchFieldException e) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new java.lang.RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + java.util.Arrays.toString(declaredFields), e);
        }
    }

    public static /* synthetic */ java.lang.String J(java.lang.String str) {
        if (str.isEmpty()) {
            return str;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(java.lang.Character.toLowerCase(str.charAt(0)));
        for (int i = 1; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (java.lang.Character.isUpperCase(cCharAt)) {
                sb.append('_');
            }
            sb.append(java.lang.Character.toLowerCase(cCharAt));
        }
        return sb.toString();
    }

    public static /* synthetic */ boolean K(java.lang.Object obj, java.lang.Object obj2) {
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? java.util.Arrays.equals((byte[]) obj, (byte[]) obj2) : obj.equals(obj2);
    }

    public static /* synthetic */ int L(boolean z) {
        return z ? 1231 : 1237;
    }

    public static /* synthetic */ int M(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static /* synthetic */ int N(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    public static /* synthetic */ java.lang.Object O(java.lang.reflect.Method method, java.lang.Object obj, java.lang.Object[] objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (java.lang.reflect.InvocationTargetException e2) {
            java.lang.Throwable cause = e2.getCause();
            if (cause instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) cause);
            }
            if (cause instanceof java.lang.Error) {
                throw ((java.lang.Error) cause);
            }
            throw new java.lang.RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static /* synthetic */ int P(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new java.lang.IndexOutOfBoundsException(defpackage.a.bs(i, "Beginning index: ", " < 0"));
        }
        if (i2 < i) {
            throw new java.lang.IndexOutOfBoundsException(defpackage.a.bf(i2, i, "Beginning index larger than ending index: ", ", "));
        }
        throw new java.lang.IndexOutOfBoundsException(defpackage.a.bf(i3, i2, "End index: ", " >= "));
    }

    public static /* synthetic */ boolean Q(java.util.concurrent.atomic.AtomicReference atomicReference, java.lang.Object obj, java.lang.Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ int R(java.lang.Object obj) {
        j$.util.Objects.checkIndex(0, 3);
        if (obj == null) {
            return -1;
        }
        if (obj instanceof defpackage.adub) {
            return 0;
        }
        return obj instanceof defpackage.adtv ? 1 : -2;
    }

    public static /* synthetic */ int S(java.lang.Object obj) {
        j$.util.Objects.checkIndex(0, 3);
        if (obj == null) {
            return -1;
        }
        if (obj instanceof yus) {
            return 0;
        }
        return obj instanceof yut ? 1 : -2;
    }

    public static /* synthetic */ int T(java.lang.Object obj) {
        j$.util.Objects.checkIndex(0, 3);
        if (obj == null) {
            return -1;
        }
        if (obj instanceof yuz) {
            return 0;
        }
        return obj instanceof yux ? 1 : -2;
    }

    public static /* synthetic */ int U(java.lang.Object obj) {
        j$.util.Objects.checkIndex(0, 3);
        if (obj == null) {
            return -1;
        }
        if (obj instanceof ahad) {
            return 0;
        }
        return obj instanceof ahab ? 1 : -2;
    }

    public static /* synthetic */ int V(java.lang.Object obj) {
        j$.util.Objects.checkIndex(0, 3);
        if (obj == null) {
            return -1;
        }
        if (obj instanceof trh) {
            return 0;
        }
        return obj instanceof trf ? 1 : -2;
    }

    public static /* synthetic */ int W(java.lang.Object obj) {
        j$.util.Objects.checkIndex(0, 3);
        if (obj == null) {
            return -1;
        }
        if (obj instanceof rzm) {
            return 0;
        }
        return obj instanceof rzj ? 1 : -2;
    }

    public static /* synthetic */ int X(java.lang.Object obj) {
        j$.util.Objects.checkIndex(0, 3);
        if (obj == null) {
            return -1;
        }
        if (obj instanceof zfo) {
            return 0;
        }
        return obj instanceof zfq ? 1 : -2;
    }

    public static /* synthetic */ int Y(java.lang.Object obj) {
        j$.util.Objects.checkIndex(0, 3);
        if (obj == null) {
            return -1;
        }
        if (obj instanceof ytx) {
            return 0;
        }
        return obj instanceof ytw ? 1 : -2;
    }

    public static /* synthetic */ int Z(java.lang.Object obj) {
        j$.util.Objects.checkIndex(0, 3);
        if (obj instanceof jyk) {
            return 0;
        }
        return obj instanceof jyj ? 1 : -2;
    }

    public static /* synthetic */ android.app.Application aA(android.content.Context context) {
        if (context instanceof android.app.Application) {
            return (android.app.Application) context;
        }
        android.content.Context baseContext = context;
        while (baseContext instanceof android.content.ContextWrapper) {
            baseContext = ((android.content.ContextWrapper) baseContext).getBaseContext();
            if (baseContext instanceof android.app.Application) {
                return (android.app.Application) baseContext;
            }
        }
        throw new java.lang.IllegalStateException("Could not find an Application in the given context: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(context))));
    }

    public static /* synthetic */ int aB(double d) {
        long jDoubleToLongBits = java.lang.Double.doubleToLongBits(d);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public static /* synthetic */ double[] aC(double[] dArr, double[][] dArr2) {
        double d = dArr[0];
        double[] dArr3 = dArr2[0];
        double d2 = dArr3[0] * d;
        double d3 = dArr[1];
        double d4 = dArr3[1] * d3;
        double d5 = dArr[2];
        double d6 = dArr3[2] * d5;
        double[] dArr4 = dArr2[1];
        double d7 = dArr4[0] * d;
        double d8 = dArr4[1] * d3;
        double d9 = dArr4[2] * d5;
        double[] dArr5 = dArr2[2];
        return new double[]{d2 + d4 + d6, d7 + d8 + d9, (d * dArr5[0]) + (d3 * dArr5[1]) + (d5 * dArr5[2])};
    }

    public static /* synthetic */ boolean aD(java.lang.String str) {
        return !str.isEmpty();
    }

    public static /* synthetic */ java.lang.Object aE(java.lang.Object obj) {
        return (java.lang.String) ((java.util.Map.Entry) obj).getKey();
    }

    public static /* synthetic */ boolean aF(java.lang.String str, almz almzVar) {
        defpackage.apdi apdiVar = alol.f;
        almzVar.c(apdiVar);
        defpackage.akzs akzsVar = almzVar.n;
        defpackage.alac alacVar = (defpackage.alac) apdiVar.a;
        if (akzsVar.l(alacVar)) {
            almzVar.c(apdiVar);
            java.lang.Object objJ = almzVar.n.j(alacVar);
            if (objJ == null) {
                objJ = apdiVar.b;
            } else {
                apdiVar.c(objJ);
            }
            alsw alswVar = ((alol) objJ).e;
            if (alswVar == null) {
                alswVar = alsw.a;
            }
            if ((alswVar.b == 1 ? (alsn) alswVar.c : alsn.a).c.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ alsi aG(almz almzVar) {
        defpackage.apdi apdiVar = alox.b;
        almzVar.c(apdiVar);
        java.lang.Object objJ = almzVar.n.j((defpackage.alac) apdiVar.a);
        if (objJ == null) {
            objJ = apdiVar.b;
        } else {
            apdiVar.c(objJ);
        }
        alox aloxVar = (alox) objJ;
        defpackage.apdi apdiVar2 = alou.b;
        aloxVar.c(apdiVar2);
        defpackage.akzs akzsVar = aloxVar.n;
        defpackage.alac alacVar = (defpackage.alac) apdiVar2.a;
        if (!akzsVar.l(alacVar)) {
            return alsi.a;
        }
        aloxVar.c(apdiVar2);
        java.lang.Object objJ2 = aloxVar.n.j(alacVar);
        if (objJ2 == null) {
            objJ2 = apdiVar2.b;
        } else {
            apdiVar2.c(objJ2);
        }
        defpackage.akzz akzzVar = (defpackage.akzz) alsi.a.m();
        defpackage.apdi apdiVar3 = alwp.b;
        defpackage.akzz akzzVar2 = (defpackage.akzz) alwp.a.m();
        akzzVar2.bV(alxy.i, (alxy) objJ2);
        akzzVar.bV(apdiVar3, akzzVar2.r());
        return akzzVar.r();
    }

    public static /* synthetic */ boolean aH(almy almyVar) {
        almz almzVar = almyVar.h;
        if (almzVar == null) {
            almzVar = almz.a;
        }
        alnb alnbVarB = alnb.b(almzVar.c);
        if (alnbVarB == null) {
            alnbVarB = alnb.a;
        }
        if (!alnbVarB.equals(alnb.b)) {
            almz almzVar2 = almyVar.h;
            if (almzVar2 == null) {
                almzVar2 = almz.a;
            }
            alnb alnbVarB2 = alnb.b(almzVar2.c);
            if (alnbVarB2 == null) {
                alnbVarB2 = alnb.a;
            }
            return alnbVarB2.equals(alnb.o);
        }
        almz almzVar3 = almyVar.h;
        if (almzVar3 == null) {
            almzVar3 = almz.a;
        }
        defpackage.apdi apdiVar = alnj.f;
        almzVar3.c(apdiVar);
        java.lang.Object objJ = almzVar3.n.j((defpackage.alac) apdiVar.a);
        if (objJ == null) {
            objJ = apdiVar.b;
        } else {
            apdiVar.c(objJ);
        }
        alqu alquVar = ((alnj) objJ).c;
        if (alquVar == null) {
            alquVar = alqu.a;
        }
        return alquVar.c == 1;
    }

    public static /* synthetic */ void aI(java.lang.Object obj, java.lang.String str) {
        if (obj == null) {
            throw new java.lang.NullPointerException(str);
        }
    }

    public static /* synthetic */ void aJ(int i) {
        if (i == 0) {
            throw null;
        }
    }

    public static java.lang.String aK(aqaj aqajVar) {
        switch (aqajVar.ordinal()) {
            case 0:
                return "float";
            case 1:
                return "int";
            case 2:
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return "byte";
            case 3:
                return "long";
            case 4:
                return "string";
            case 5:
                return "bool";
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return "short";
            default:
                throw new java.lang.IllegalArgumentException(defpackage.a.bJ(aqajVar, "DataType error: DataType ", " is not supported yet"));
        }
    }

    public static void aL(long j, java.lang.String str) {
        if (j < 0) {
            throw new java.lang.IllegalArgumentException(str);
        }
    }

    public static boolean aM(double d, int i, int i2) {
        return d >= ((double) i) && d < ((double) i2);
    }

    public static int aN(java.lang.Boolean bool) {
        if (bool == null) {
            return 1;
        }
        return bool.booleanValue() ? 2 : 3;
    }

    public static void aO(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    public static boolean aP(byte b) {
        return b > -65;
    }

    public static boolean aQ(byte b) {
        return b >= 0;
    }

    public static java.lang.String aR(apxo apxoVar) {
        return G(apxoVar.i());
    }

    public static /* synthetic */ defpackage.aojh aS(defpackage.ajni ajniVar) {
        if (ajniVar == null) {
            defpackage.aooh.i("$this$error");
        }
        ajniVar.b = defpackage.mcd.NO_EXPANDED_VOICEMAIL_ENTRY_ERROR;
        ajniVar.c = defpackage.zar.ILLEGAL_STATE;
        return defpackage.aojh.a;
    }

    public static apjb aT(java.util.Map map) {
        return new apjb(defpackage.aigf.i(map));
    }

    public static defpackage.aoxh aU(defpackage.anmc anmcVar, anpk anpkVar, defpackage.anmb anmbVar, defpackage.anph anphVar, vqf vqfVar) {
        return new defpackage.aowy(new aoeb(anmbVar, anmcVar, anpkVar, anphVar, vqfVar, (defpackage.aoln) null));
    }

    public static /* synthetic */ int aa(java.lang.Object obj) {
        j$.util.Objects.checkIndex(0, 3);
        if (obj == null) {
            return -1;
        }
        if (obj instanceof jab) {
            return 0;
        }
        return obj instanceof izw ? 1 : -2;
    }

    public static /* synthetic */ int ab(java.lang.Object obj) {
        j$.util.Objects.checkIndex(0, 4);
        if (obj == null) {
            return -1;
        }
        if (obj instanceof zow) {
            return 0;
        }
        if (obj instanceof zou) {
            return 1;
        }
        return obj instanceof zov ? 2 : -2;
    }

    public static /* synthetic */ int ac(java.lang.Object obj) {
        j$.util.Objects.checkIndex(0, 4);
        if (obj == null) {
            return -1;
        }
        if (obj instanceof sjo) {
            return 0;
        }
        if (obj instanceof sjm) {
            return 1;
        }
        return obj instanceof sjn ? 2 : -2;
    }

    public static /* synthetic */ int ad(java.lang.Object obj) {
        j$.util.Objects.checkIndex(0, 4);
        if (obj == null) {
            return -1;
        }
        if (obj instanceof ytq) {
            return 0;
        }
        if (obj instanceof ytp) {
            return 1;
        }
        return obj instanceof yto ? 2 : -2;
    }

    public static /* synthetic */ int ae(java.lang.Object obj) {
        j$.util.Objects.checkIndex(0, 6);
        if (obj instanceof com.google.android.libraries.notifications.platform.registration.Gaia) {
            return 0;
        }
        if (obj instanceof com.google.android.libraries.notifications.platform.registration.DelegatedGaia) {
            return 1;
        }
        if (obj instanceof com.google.android.libraries.notifications.platform.registration.Fitbit) {
            return 2;
        }
        if (obj instanceof com.google.android.libraries.notifications.platform.registration.Zwieback) {
            return 3;
        }
        return obj instanceof com.google.android.libraries.notifications.platform.registration.YouTubeVisitor ? 4 : -2;
    }

    public static /* synthetic */ int af(java.lang.Object obj) {
        j$.util.Objects.checkIndex(0, 6);
        if (obj instanceof rsi) {
            return 0;
        }
        if (obj instanceof rsk) {
            return 1;
        }
        if (obj instanceof rsh) {
            return 2;
        }
        if (obj instanceof rsg) {
            return 3;
        }
        return obj instanceof rsj ? 4 : -2;
    }

    public static /* synthetic */ boolean ag(java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        while (!atomicReferenceFieldUpdater.compareAndSet(obj, obj2, obj3)) {
            if (atomicReferenceFieldUpdater.get(obj) != obj2) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean ah(long j, long j2) {
        return j == j2;
    }

    public static /* synthetic */ boolean ai(char c) {
        return c >= '0' && c <= '9';
    }

    public static /* synthetic */ void aj(java.util.concurrent.ExecutorService executorService) {
        if (executorService == aa$.ExternalSyntheticApiModelOutline1.m() || executorService.isTerminated()) {
            return;
        }
        executorService.shutdown();
        boolean zAwaitTermination = false;
        boolean z = false;
        while (!zAwaitTermination) {
            try {
                zAwaitTermination = executorService.awaitTermination(1L, java.util.concurrent.TimeUnit.DAYS);
            } catch (java.lang.InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                }
                z = true;
            }
        }
        if (z) {
            java.lang.Thread.currentThread().interrupt();
        }
    }

    public static /* synthetic */ void ak(java.util.concurrent.ExecutorService executorService) {
        if (executorService == aa$.ExternalSyntheticApiModelOutline1.m() || executorService.isTerminated()) {
            return;
        }
        executorService.shutdown();
        boolean zAwaitTermination = false;
        boolean z = false;
        while (!zAwaitTermination) {
            try {
                zAwaitTermination = executorService.awaitTermination(1L, java.util.concurrent.TimeUnit.DAYS);
            } catch (java.lang.InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                }
                z = true;
            }
        }
        if (z) {
            java.lang.Thread.currentThread().interrupt();
        }
    }

    public static /* synthetic */ boolean al() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static /* synthetic */ boolean am() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static /* synthetic */ boolean an() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static /* synthetic */ boolean ao(long j, int i) {
        if (j < -315576000000L || j > 315576000000L || i < -999999999 || i >= 1000000000) {
            return false;
        }
        return (j >= 0 && i >= 0) || (j <= 0 && i <= 0);
    }

    public static /* synthetic */ java.lang.String ap(int i) {
        switch (i) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return "STRING";
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return "NUMBER";
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return "BOOLEAN";
            case 9:
                return "NULL";
            default:
                return "END_DOCUMENT";
        }
    }

    public static /* synthetic */ boolean aq(java.util.concurrent.atomic.AtomicReference atomicReference, java.lang.Object obj) {
        while (!atomicReference.compareAndSet(null, obj)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean ar(java.util.concurrent.atomic.AtomicReference atomicReference, java.lang.Object obj) {
        while (!atomicReference.compareAndSet(obj, null)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ defpackage.albh at() {
        try {
            return (defpackage.yqa) defpackage.alad.y(defpackage.yqa.a, android.util.Base64.decode("CgYI2DYQj04", 3));
        } catch (java.lang.RuntimeException e) {
            throw e;
        } catch (java.lang.Exception e2) {
            throw new java.lang.RuntimeException(e2);
        }
    }

    public static /* synthetic */ defpackage.albh au() {
        try {
            return (defpackage.acux) defpackage.alad.y(defpackage.acux.a, android.util.Base64.decode("Cgt4YXR1LW1vZGVscw", 3));
        } catch (java.lang.RuntimeException e) {
            throw e;
        } catch (java.lang.Exception e2) {
            throw new java.lang.RuntimeException(e2);
        }
    }

    public static /* synthetic */ defpackage.albh av() {
        try {
            return (defpackage.acux) defpackage.alad.y(defpackage.acux.a, android.util.Base64.decode("CgxhdGxhcy1tb2RlbHMSpAESYmh0dHBzOi8vZGwuZ29vZ2xlLmNvbS9oZm0vWkpiM2xJODEybzM3UnFMTVFwYnlRRWo5ZjcwYU9FRm40SjJ5ckNwblNRWWlpSlBiS0hKQkFORHVjb0lONDA5Zy92MjUuemlwIMWr0QgqKDUxY2MzOTA3NGNiZmQ5NzBkMWIxYmJmMWMxZmEyMmJhYjgwMDdiYzg6D2RldGVjdGlvbl9tb2RlbBiAxgpQt/WviwZqCAgAEAIggPUk", 3));
        } catch (java.lang.RuntimeException e) {
            throw e;
        } catch (java.lang.Exception e2) {
            throw new java.lang.RuntimeException(e2);
        }
    }

    public static /* synthetic */ defpackage.albh aw() {
        try {
            return (defpackage.alfc) defpackage.alad.y(defpackage.alfc.a, android.util.Base64.decode("CgdHQl8rNDQz", 3));
        } catch (java.lang.RuntimeException e) {
            throw e;
        } catch (java.lang.Exception e2) {
            throw new java.lang.RuntimeException(e2);
        }
    }

    public static /* synthetic */ defpackage.albh ax() {
        try {
            return (defpackage.alfc) defpackage.alad.y(defpackage.alfc.a, android.util.Base64.decode("CgJVUwoCQ0EKAkFVCgJKUA", 3));
        } catch (java.lang.RuntimeException e) {
            throw e;
        } catch (java.lang.Exception e2) {
            throw new java.lang.RuntimeException(e2);
        }
    }

    public static /* synthetic */ defpackage.albh ay() {
        try {
            return defpackage.alfc.a;
        } catch (java.lang.RuntimeException e) {
            throw e;
        } catch (java.lang.Exception e2) {
            throw new java.lang.RuntimeException(e2);
        }
    }

    public static /* synthetic */ defpackage.albh az() {
        try {
            return defpackage.acux.a;
        } catch (java.lang.RuntimeException e) {
            throw e;
        } catch (java.lang.Exception e2) {
            throw new java.lang.RuntimeException(e2);
        }
    }

    static int m(android.os.Parcel parcel, defpackage.anqw anqwVar) {
        int i = anqwVar.o.r;
        java.lang.String strSubstring = anqwVar.p;
        if (strSubstring != null && strSubstring.length() > 1000) {
            strSubstring = strSubstring.substring(0, 1000);
        }
        int i2 = i << 16;
        if (strSubstring == null) {
            return i2;
        }
        int i3 = i2 | 32;
        parcel.writeString(strSubstring);
        return i3;
    }

    static defpackage.anqw n(int i, android.os.Parcel parcel) {
        int i2 = i >> 16;
        int i3 = i & 32;
        defpackage.anqw anqwVarC = defpackage.anqw.c(i2 & 255);
        return i3 != 0 ? anqwVarC.f(parcel.readString()) : anqwVarC;
    }

    static void o(android.os.Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(0);
        parcel.writeInt(i);
        parcel.setDataPosition(iDataPosition);
    }

    static boolean p(int i, int i2) {
        return (i & i2) != 0;
    }

    public static int q(java.lang.String[] strArr) {
        return strArr.length >> 1;
    }

    public static java.lang.String r(int i, java.lang.String[] strArr) {
        int i2 = i << 1;
        if (i2 < 0 || i2 >= strArr.length) {
            return null;
        }
        return strArr[i2];
    }

    public static java.lang.String s(int i, java.lang.String[] strArr) {
        int i2 = (i << 1) + 1;
        if (i2 < 0 || i2 >= strArr.length) {
            return null;
        }
        return strArr[i2];
    }

    public static /* synthetic */ java.lang.String t(int i) {
        return i != 1 ? "OUTBOUND" : "INBOUND";
    }

    public static defpackage.aoxh u(defpackage.aoxh aoxhVar, java.lang.Object obj) {
        defpackage.aooh.f(aoxhVar, "<this>");
        return new defpackage.aowy(new aoee(aoxhVar, obj, (defpackage.aoln) null));
    }

    public static java.lang.Object v(defpackage.anmc anmcVar, anpk anpkVar, java.lang.Object obj, defpackage.anmb anmbVar, defpackage.anph anphVar, defpackage.aoln aolnVar) {
        if (anpkVar.a == anpj.a) {
            return defpackage.aoov.ay(u(aU(anmcVar, anpkVar, anmbVar, anphVar, new vqf(obj)), anpkVar), aolnVar);
        }
        java.util.Objects.toString(anpkVar);
        throw new java.lang.IllegalArgumentException("Expected a unary RPC method, but got ".concat(anpkVar.toString()));
    }

    public static defpackage.anpc w(java.lang.String str, android.os.Parcelable.Creator creator) {
        anta antaVar = new anta(creator, false);
        int i = defpackage.anpc.d;
        return new anpd(str, antaVar);
    }

    public static defpackage.anqw x(anmv anmvVar) {
        defpackage.ahvr.cj(anmvVar, "context must not be null");
        if (!anmvVar.i()) {
            return null;
        }
        java.lang.Throwable thC = anmvVar.c();
        if (thC == null) {
            return defpackage.anqw.c.f("io.grpc.Context was cancelled without error");
        }
        if (thC instanceof java.util.concurrent.TimeoutException) {
            return defpackage.anqw.e.f(thC.getMessage()).e(thC);
        }
        defpackage.anqw anqwVarD = defpackage.anqw.d(thC);
        return (defpackage.anqt.UNKNOWN.equals(anqwVarD.o) && anqwVarD.q == thC) ? defpackage.anqw.c.f("Context cancelled").e(thC) : anqwVarD.e(thC);
    }

    public static /* synthetic */ java.lang.String y(java.lang.Iterable iterable) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.Iterator it = iterable.iterator();
        if (it.hasNext()) {
            sb.append((java.lang.CharSequence) it.next());
            while (it.hasNext()) {
                sb.append((java.lang.CharSequence) "|");
                sb.append((java.lang.CharSequence) it.next());
            }
        }
        return sb.toString();
    }

    public static /* synthetic */ int z(java.lang.String str, byte[] bArr, int i, int i2) {
        byte[] bytes = str.getBytes(java.nio.charset.StandardCharsets.UTF_8);
        int length = bytes.length;
        if (length - i > i2) {
            throw new java.lang.ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
        }
        java.lang.System.arraycopy(bytes, 0, bArr, i, length);
        return i + length;
    }

    public void a(defpackage.anqw anqwVar, defpackage.anph anphVar) {
        throw null;
    }

    public defpackage.anmg b() {
        throw null;
    }

    public void d(java.lang.Object obj) {
        throw null;
    }

    public anty(byte[] bArr, byte[] bArr2, byte[] bArr3) {
    }

    public void e() {
    }

    public void c(defpackage.anph anphVar) {
    }
}
