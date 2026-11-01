package j$.util;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public class DesugarTimeZone {
    public static j$.time.ZoneId a(java.util.TimeZone timeZone) {
        java.lang.String id = timeZone.getID();
        java.util.Map map = j$.time.ZoneId.a;
        j$.util.Objects.requireNonNull(id, "zoneId");
        j$.util.Objects.requireNonNull(map, "aliasMap");
        java.lang.Object objRequireNonNull = (java.lang.String) map.get(id);
        if (objRequireNonNull == null) {
            objRequireNonNull = j$.util.Objects.requireNonNull(id, "defaultObj");
        }
        return j$.time.ZoneId.z((java.lang.String) objRequireNonNull, true);
    }

    public static java.util.TimeZone getTimeZone(java.lang.String str) {
        return java.util.TimeZone.getTimeZone(str);
    }
}
