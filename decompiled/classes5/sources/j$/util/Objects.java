package j$.util;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class Objects {
    public static int checkIndex(int i, int i2) {
        java.lang.String str;
        if (i >= 0 && i < i2) {
            return i;
        }
        java.util.List listF = j$.com.android.tools.r8.a.F(new java.lang.Integer[]{java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)});
        if (listF != null) {
            switch (listF.size() != 2 ? "" : "checkIndex") {
                case "checkIndex":
                    str = java.lang.String.format("Index %d out of bounds for length %d", listF.get(0), listF.get(1));
                    break;
                case "checkFromToIndex":
                    str = java.lang.String.format("Range [%d, %d) out of bounds for length %d", listF.get(0), listF.get(1), listF.get(2));
                    break;
                case "checkFromIndexSize":
                    str = java.lang.String.format("Range [%d, %<d + %d) out of bounds for length %d", listF.get(0), listF.get(1), listF.get(2));
                    break;
                default:
                    str = java.lang.String.format("Range check failed: %s %s", "checkIndex", listF);
                    break;
            }
        } else {
            str = "Range check failed: checkIndex";
        }
        throw new java.lang.IndexOutOfBoundsException(str);
    }

    public static boolean equals(java.lang.Object obj, java.lang.Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int hash(java.lang.Object... objArr) {
        return java.util.Arrays.hashCode(objArr);
    }

    public static int hashCode(java.lang.Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static boolean nonNull(java.lang.Object obj) {
        return obj != null;
    }

    public static <T> T requireNonNull(T t, java.lang.String str) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException(str);
    }

    public static java.lang.String toString(java.lang.Object obj, java.lang.String str) {
        return obj != null ? obj.toString() : str;
    }

    public static java.lang.String toString(java.lang.Object obj) {
        return java.lang.String.valueOf(obj);
    }

    public static <T> T requireNonNull(T t) {
        t.getClass();
        return t;
    }
}
