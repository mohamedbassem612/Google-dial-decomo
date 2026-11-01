package j$.nio.file.attribute;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public abstract class t {
    public static j$.nio.file.attribute.FileAttribute a(java.nio.file.attribute.FileAttribute fileAttribute) {
        j$.nio.file.attribute.FileAttribute pVar;
        if (fileAttribute == null) {
            return null;
        }
        if (d(fileAttribute.value())) {
            pVar = new j$.nio.file.attribute.r(fileAttribute);
        } else {
            if (fileAttribute instanceof j$.nio.file.attribute.q) {
                return ((j$.nio.file.attribute.q) fileAttribute).a;
            }
            pVar = new j$.nio.file.attribute.p(fileAttribute);
        }
        return pVar;
    }

    public static j$.nio.file.attribute.FileTime b(java.nio.file.attribute.FileTime fileTime) {
        if (fileTime != null) {
            return new j$.nio.file.attribute.FileTime(fileTime.toMillis(), java.util.concurrent.TimeUnit.MILLISECONDS, null);
        }
        return null;
    }

    public static java.nio.file.attribute.FileTime c(j$.nio.file.attribute.FileTime fileTime) {
        long millis;
        if (fileTime == null) {
            return null;
        }
        java.util.concurrent.TimeUnit timeUnit = fileTime.a;
        if (timeUnit != null) {
            millis = timeUnit.toMillis(fileTime.b);
        } else {
            long epochSecond = fileTime.c.getEpochSecond();
            int nano = fileTime.c.getNano();
            long j = epochSecond * 1000;
            if (((java.lang.Math.abs(epochSecond) | 1000) >>> 31) == 0 || j / 1000 == epochSecond) {
                millis = ((long) (nano / 1000000)) + j;
            } else {
                millis = epochSecond < 0 ? Long.MIN_VALUE : Long.MAX_VALUE;
            }
        }
        return java.nio.file.attribute.FileTime.fromMillis(millis);
    }

    public static boolean d(java.lang.Object obj) {
        if (obj instanceof java.util.Set) {
            java.util.Set set = (java.util.Set) obj;
            if (!set.isEmpty()) {
                java.lang.Object next = set.iterator().next();
                if ((next instanceof j$.nio.file.attribute.n0) || (next instanceof java.nio.file.attribute.PosixFilePermission)) {
                    return true;
                }
            }
        }
        return false;
    }
}
