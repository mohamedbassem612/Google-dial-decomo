package j$.time;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class w extends j$.time.ZoneId {
    public static final /* synthetic */ int d = 0;
    private static final long serialVersionUID = 8386373296231747096L;
    public final java.lang.String b;
    public final transient j$.time.zone.ZoneRules c;

    public w(java.lang.String str, j$.time.zone.ZoneRules zoneRules) {
        this.b = str;
        this.c = zoneRules;
    }

    public static j$.time.w N(java.lang.String str, boolean z) {
        j$.util.Objects.requireNonNull(str, "zoneId");
        int length = str.length();
        j$.time.zone.ZoneRules zoneRulesA = null;
        if (length < 2) {
            j$.time.g.h("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
            return null;
        }
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && ((cCharAt != '/' || i == 0) && ((cCharAt < '0' || cCharAt > '9' || i == 0) && ((cCharAt != '~' || i == 0) && ((cCharAt != '.' || i == 0) && ((cCharAt != '_' || i == 0) && ((cCharAt != '+' || i == 0) && (cCharAt != '-' || i == 0))))))))) {
                j$.time.g.h("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
                return null;
            }
        }
        try {
            zoneRulesA = j$.time.zone.g.a(str);
        } catch (j$.time.zone.e e) {
            if (z) {
                throw e;
            }
        }
        return new j$.time.w(str, zoneRulesA);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    private java.lang.Object writeReplace() {
        return new j$.time.r((byte) 7, this);
    }

    @Override // j$.time.ZoneId
    public final void L(java.io.ObjectOutput objectOutput) throws java.io.IOException {
        objectOutput.writeByte(7);
        objectOutput.writeUTF(this.b);
    }

    @Override // j$.time.ZoneId
    public final j$.time.zone.ZoneRules getRules() {
        j$.time.zone.ZoneRules zoneRules = this.c;
        return zoneRules == null ? j$.time.zone.g.a(this.b) : zoneRules;
    }

    @Override // j$.time.ZoneId
    public final java.lang.String t() {
        return this.b;
    }
}
