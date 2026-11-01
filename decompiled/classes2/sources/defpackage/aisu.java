package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aisu implements java.lang.CharSequence {
    public final java.lang.String a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    private java.lang.String f;

    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean, int] */
    public aisu(java.lang.String str, int i, int i2, int i3, int i4) {
        this.a = str;
        this.b = i;
        int i5 = i + i2;
        this.c = i5;
        this.d = i3;
        this.e = i4;
        ahvr.ca((boolean) ((i ^ (-1)) >>> 31), "Invalid index: %s", i);
        ahvr.ca((boolean) ((i2 ^ (-1)) >>> 31), "Invalid length: %s", i2);
        ahvr.ca(i5 <= str.length(), "Invalid endIndex: %s", i5);
        ahvr.ca(i4 >= i5, "Invalid repetitionStartIndex: %s", i4);
    }

    static defpackage.aisu b(java.lang.String str, int i, int i2) {
        return new defpackage.aisu(str, i, i2, androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY, i + java.lang.Math.max(1, i2));
    }

    public final int a(int i) {
        int i2 = this.d;
        ahvr.cd(i2 > i, "Not true that backtrackIndex (%s) > fromIndex (%s)", i2, i);
        return i2;
    }

    public final boolean c(java.lang.String str) {
        return this.a.startsWith(str, this.c);
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        if (i < 0) {
            throw new java.lang.IndexOutOfBoundsException(a.bs(i, "Invalid index (", ") < 0"));
        }
        if (i < length()) {
            return this.a.charAt(this.b + i);
        }
        throw new java.lang.IndexOutOfBoundsException("Invalid index (" + i + ") >= length (" + length() + ')');
    }

    public final boolean isEmpty() {
        return length() == 0;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.c - this.b;
    }

    @Override // java.lang.CharSequence
    public final java.lang.CharSequence subSequence(int i, int i2) {
        if (i < 0) {
            throw new java.lang.IndexOutOfBoundsException(a.bs(i, "Invalid index: begin (", ") < 0"));
        }
        if (i2 <= length()) {
            if (i > i2) {
                throw new java.lang.IndexOutOfBoundsException(a.bv((byte) 41, i2, i, "Invalid index: begin (", ") > end ("));
            }
            return new defpackage.aisu(this.a, this.b + i, i2 - i, androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY, this.e);
        }
        throw new java.lang.IndexOutOfBoundsException("Invalid index: end (" + i2 + ") > length (" + length() + ')');
    }

    @Override // java.lang.CharSequence
    public final java.lang.String toString() {
        java.lang.String str = this.f;
        if (str != null) {
            return str;
        }
        java.lang.String strSubstring = this.a.substring(this.b, this.c);
        this.f = strSubstring;
        return strSubstring;
    }
}
