package j$.time;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public abstract class ZoneId implements java.io.Serializable {
    public static final java.util.Map a;
    private static final long serialVersionUID = 8352817235686L;

    static {
        java.util.Map.Entry[] entryArr = {j$.com.android.tools.r8.a.E("ACT", "Australia/Darwin"), j$.com.android.tools.r8.a.E("AET", "Australia/Sydney"), j$.com.android.tools.r8.a.E("AGT", "America/Argentina/Buenos_Aires"), j$.com.android.tools.r8.a.E("ART", "Africa/Cairo"), j$.com.android.tools.r8.a.E("AST", "America/Anchorage"), j$.com.android.tools.r8.a.E("BET", "America/Sao_Paulo"), j$.com.android.tools.r8.a.E("BST", "Asia/Dhaka"), j$.com.android.tools.r8.a.E("CAT", "Africa/Harare"), j$.com.android.tools.r8.a.E("CNT", "America/St_Johns"), j$.com.android.tools.r8.a.E("CST", "America/Chicago"), j$.com.android.tools.r8.a.E("CTT", "Asia/Shanghai"), j$.com.android.tools.r8.a.E("EAT", "Africa/Addis_Ababa"), j$.com.android.tools.r8.a.E("ECT", "Europe/Paris"), j$.com.android.tools.r8.a.E("IET", "America/Indiana/Indianapolis"), j$.com.android.tools.r8.a.E("IST", "Asia/Kolkata"), j$.com.android.tools.r8.a.E("JST", "Asia/Tokyo"), j$.com.android.tools.r8.a.E("MIT", "Pacific/Apia"), j$.com.android.tools.r8.a.E("NET", "Asia/Yerevan"), j$.com.android.tools.r8.a.E("NST", "Pacific/Auckland"), j$.com.android.tools.r8.a.E("PLT", "Asia/Karachi"), j$.com.android.tools.r8.a.E("PNT", "America/Phoenix"), j$.com.android.tools.r8.a.E("PRT", "America/Puerto_Rico"), j$.com.android.tools.r8.a.E("PST", "America/Los_Angeles"), j$.com.android.tools.r8.a.E("SST", "Pacific/Guadalcanal"), j$.com.android.tools.r8.a.E("VST", "Asia/Ho_Chi_Minh"), j$.com.android.tools.r8.a.E("EST", "-05:00"), j$.com.android.tools.r8.a.E("MST", "-07:00"), j$.com.android.tools.r8.a.E("HST", "-10:00")};
        java.util.HashMap map = new java.util.HashMap(28);
        for (int i = 0; i < 28; i++) {
            java.util.Map.Entry entry = entryArr[i];
            java.lang.Object objRequireNonNull = j$.util.Objects.requireNonNull(entry.getKey());
            if (map.put(objRequireNonNull, j$.util.Objects.requireNonNull(entry.getValue())) != null) {
                throw new java.lang.IllegalArgumentException("duplicate key: " + objRequireNonNull);
            }
        }
        a = j$.util.DesugarCollections.unmodifiableMap(map);
    }

    public ZoneId() {
        if (getClass() != j$.time.ZoneOffset.class && getClass() != j$.time.w.class) {
            throw new java.lang.AssertionError("Invalid subclass");
        }
    }

    public static j$.time.ZoneId B(java.lang.String str, j$.time.ZoneOffset zoneOffset) {
        j$.util.Objects.requireNonNull(str, "prefix");
        j$.util.Objects.requireNonNull(zoneOffset, "offset");
        if (str.isEmpty()) {
            return zoneOffset;
        }
        if (!str.equals("GMT") && !str.equals("UTC") && !str.equals("UT")) {
            j$.time.g.b("prefix should be GMT, UTC or UT, is: ".concat(str));
            return null;
        }
        if (zoneOffset.getTotalSeconds() != 0) {
            str = str.concat(zoneOffset.c);
        }
        return new j$.time.w(str, zoneOffset.getRules());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v4, types: [j$.time.ZoneId] */
    /* JADX WARN: Type inference failed for: r3v9 */
    public static j$.time.ZoneId C(java.lang.String str, int i, boolean z) {
        java.lang.String strSubstring = str.substring(0, i);
        if (str.length() == i) {
            return B(strSubstring, j$.time.ZoneOffset.UTC);
        }
        if (str.charAt(i) != '+' && str.charAt(i) != '-') {
            return j$.time.w.N(str, z);
        }
        try {
            j$.time.ZoneOffset zoneOffsetO = j$.time.ZoneOffset.O(str.substring(i));
            str = zoneOffsetO == j$.time.ZoneOffset.UTC ? B(strSubstring, zoneOffsetO) : B(strSubstring, zoneOffsetO);
            return str;
        } catch (j$.time.DateTimeException e) {
            throw new j$.time.DateTimeException("Invalid ID for offset-based ZoneId: ".concat(str), e);
        }
    }

    public static j$.time.ZoneId r(j$.time.temporal.Temporal temporal) {
        j$.time.ZoneId zoneId = (j$.time.ZoneId) temporal.G(j$.time.temporal.m.e);
        if (zoneId != null) {
            return zoneId;
        }
        j$.time.g.h(j$.desugar.sun.nio.fs.h.b("Unable to obtain ZoneId from TemporalAccessor: ", java.lang.String.valueOf(temporal), " of type ", temporal.getClass().getName()));
        return null;
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    public static j$.time.ZoneId systemDefault() {
        return j$.util.DesugarTimeZone.a(java.util.TimeZone.getDefault());
    }

    private java.lang.Object writeReplace() {
        return new j$.time.r((byte) 7, this);
    }

    public static j$.time.ZoneId z(java.lang.String str, boolean z) {
        j$.util.Objects.requireNonNull(str, "zoneId");
        if (str.length() <= 1 || str.startsWith("+") || str.startsWith("-")) {
            return j$.time.ZoneOffset.O(str);
        }
        if (str.startsWith("UTC") || str.startsWith("GMT")) {
            return C(str, 3, z);
        }
        return str.startsWith("UT") ? C(str, 2, z) : j$.time.w.N(str, z);
    }

    public abstract void L(java.io.ObjectOutput objectOutput);

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j$.time.ZoneId) {
            return t().equals(((j$.time.ZoneId) obj).t());
        }
        return false;
    }

    public java.lang.String getDisplayName(j$.time.format.TextStyle textStyle, java.util.Locale locale) {
        j$.time.format.u uVar = new j$.time.format.u();
        uVar.c(new j$.time.format.t(textStyle, false));
        return uVar.q(locale, j$.time.format.c0.SMART, null).format(new j$.desugar.sun.nio.fs.g((byte) 3, this));
    }

    public abstract j$.time.zone.ZoneRules getRules();

    public int hashCode() {
        return t().hashCode();
    }

    public abstract java.lang.String t();

    public java.lang.String toString() {
        return t();
    }
}
