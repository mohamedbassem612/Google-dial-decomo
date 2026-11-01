package j$.time.format;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public class s implements j$.time.format.e {
    public static volatile java.util.AbstractMap.SimpleImmutableEntry c;
    public static volatile java.util.AbstractMap.SimpleImmutableEntry d;
    public final j$.time.temporal.TemporalQuery a;
    public final java.lang.String b;

    public s(j$.time.temporal.TemporalQuery temporalQuery, java.lang.String str) {
        this.a = temporalQuery;
        this.b = str;
    }

    public static int b(j$.time.format.v vVar, java.lang.CharSequence charSequence, int i, int i2, j$.time.format.j jVar) {
        java.lang.String upperCase = charSequence.subSequence(i, i2).toString().toUpperCase();
        if (i2 >= charSequence.length()) {
            vVar.e(j$.time.ZoneId.z(upperCase, true));
            return i2;
        }
        if (charSequence.charAt(i2) == '0' || vVar.a(charSequence.charAt(i2), 'Z')) {
            vVar.e(j$.time.ZoneId.z(upperCase, true));
            return i2;
        }
        j$.time.format.v vVar2 = new j$.time.format.v(vVar.a);
        vVar2.b = vVar.b;
        vVar2.c = vVar.c;
        int iK = jVar.k(vVar2, charSequence, i2);
        try {
            if (iK < 0) {
                if (jVar != j$.time.format.j.e) {
                    vVar.e(j$.time.ZoneId.z(upperCase, true));
                }
                return ~i;
            }
            vVar.e(j$.time.ZoneId.B(upperCase, j$.time.ZoneOffset.Q((int) vVar2.d(j$.time.temporal.a.OFFSET_SECONDS).longValue())));
            i2 = iK;
            return i2;
        } catch (j$.time.DateTimeException unused) {
        }
    }

    public j$.time.format.m a(j$.time.format.v vVar) {
        java.util.Set<java.lang.String> set = j$.time.zone.g.d;
        int size = set.size();
        java.util.AbstractMap.SimpleImmutableEntry simpleImmutableEntry = vVar.b ? c : d;
        if (simpleImmutableEntry == null || ((java.lang.Integer) simpleImmutableEntry.getKey()).intValue() != size) {
            synchronized (this) {
                simpleImmutableEntry = vVar.b ? c : d;
                if (simpleImmutableEntry == null || ((java.lang.Integer) simpleImmutableEntry.getKey()).intValue() != size) {
                    java.lang.Integer numValueOf = java.lang.Integer.valueOf(size);
                    j$.time.format.m mVar = vVar.b ? new j$.time.format.m("", null, null) : new j$.time.format.l("", null, null);
                    for (java.lang.String str : set) {
                        mVar.a(str, str);
                    }
                    simpleImmutableEntry = new java.util.AbstractMap.SimpleImmutableEntry(numValueOf, mVar);
                    if (vVar.b) {
                        c = simpleImmutableEntry;
                    } else {
                        d = simpleImmutableEntry;
                    }
                }
            }
        }
        return (j$.time.format.m) simpleImmutableEntry.getValue();
    }

    @Override // j$.time.format.e
    public boolean h(j$.time.format.w wVar, java.lang.StringBuilder sb) {
        j$.time.ZoneId zoneId = (j$.time.ZoneId) wVar.b(this.a);
        if (zoneId == null) {
            return false;
        }
        sb.append(zoneId.t());
        return true;
    }

    @Override // j$.time.format.e
    public final int k(j$.time.format.v vVar, java.lang.CharSequence charSequence, int i) {
        int i2;
        int length = charSequence.length();
        if (i > length) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        if (i != length) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt == '+' || cCharAt == '-') {
                return b(vVar, charSequence, i, i, j$.time.format.j.e);
            }
            int i3 = i + 2;
            if (length >= i3) {
                char cCharAt2 = charSequence.charAt(i + 1);
                if (vVar.a(cCharAt, 'U') && vVar.a(cCharAt2, 'T')) {
                    int i4 = i + 3;
                    return (length < i4 || !vVar.a(charSequence.charAt(i3), 'C')) ? b(vVar, charSequence, i, i3, j$.time.format.j.f) : b(vVar, charSequence, i, i4, j$.time.format.j.f);
                }
                if (vVar.a(cCharAt, 'G') && length >= (i2 = i + 3) && vVar.a(cCharAt2, 'M') && vVar.a(charSequence.charAt(i3), 'T')) {
                    int i5 = i + 4;
                    if (length < i5 || !vVar.a(charSequence.charAt(i2), '0')) {
                        return b(vVar, charSequence, i, i2, j$.time.format.j.f);
                    }
                    vVar.e(j$.time.ZoneId.z("GMT0", true));
                    return i5;
                }
            }
            j$.time.format.m mVarA = a(vVar);
            java.text.ParsePosition parsePosition = new java.text.ParsePosition(i);
            java.lang.String strC = mVarA.c(charSequence, parsePosition);
            if (strC != null) {
                vVar.e(j$.time.ZoneId.z(strC, true));
                return parsePosition.getIndex();
            }
            if (vVar.a(cCharAt, 'Z')) {
                vVar.e(j$.time.ZoneOffset.UTC);
                return i + 1;
            }
        }
        return ~i;
    }

    public final java.lang.String toString() {
        return this.b;
    }
}
