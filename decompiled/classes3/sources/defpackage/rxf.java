package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class rxf {
    public static final aimz a = aimz.i("com/android/dialer/oem/CequintPackageUtils");
    public static final java.util.List b;

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        b = arrayList;
        arrayList.add(0, new byte[]{26, 12, -8, -115, 91, -30, 106, -19, 80, -123, -2, -120, -96, -98, -20, 37, 30, -54, 22, -105, 80, -38, 33, -52, 24, -55, -104, -81, 38, -51, 6, 113});
        arrayList.add(1, new byte[]{-54, 47, -82, -12, 9, -17, 76, 121, -8, 76, -40, -105, -65, 26, 21, 15, -16, 94, 84, 116, -74, 74, -54, -51, 5, 126, 30, -104, -58, 31, 92, 69});
        arrayList.add(2, new byte[]{-26, 122, 14, -80, 118, 78, -61, 40, -73, -63, 27, 27, -48, -124, 40, -90, 22, -39, -13, -21, -80, 32, -89, -40, -33, 20, 114, -127, 76, 19, -13, -55});
        arrayList.add(3, new byte[]{26, -70, -94, -124, 12, 97, -106, 9, -111, 94, -111, -107, 61, 41, 60, -112, -20, -76, -119, 29, -64, -79, 35, 88, -104, -21, -26, -44, 9, -27, -114, -99});
        arrayList.add(4, new byte[]{39, -7, 109, -70, -73, 123, 49, -10, -107, 62, 76, -46, -62, -34, -2, 21, -11, -41, -57, -113, 7, 61, -41, 22, 32, 24, -17, 71, 107, 9, 124, 52});
    }

    public static byte[] a(byte[] bArr) {
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA256");
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (java.security.NoSuchAlgorithmException | java.security.NoSuchProviderException e) {
            a.bq(a.c(), "unable to get message digest", "com/android/dialer/oem/CequintPackageUtils", "getSHA256", (char) 307, "CequintPackageUtils.java", e, zct.b);
            return null;
        }
    }
}
