package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class exl extends defpackage.erb {
    public final int c;
    public final java.lang.String d;
    public final int e;
    public final defpackage.eqg f;
    public final int g;
    public final defpackage.ffu h;
    final boolean i;

    /* JADX WARN: Illegal instructions before constructor call */
    public exl(int i, java.lang.Throwable th, int i2, java.lang.String str, int i3, defpackage.eqg eqgVar, int i4, defpackage.ffu ffuVar, boolean z) {
        java.lang.String str2;
        int i5;
        java.lang.String string;
        java.lang.String str3;
        if (i == 0) {
            str2 = str;
            i5 = i3;
            string = "Source error";
        } else if (i != 1) {
            string = "Unexpected runtime error";
            str2 = str;
            i5 = i3;
        } else {
            java.lang.String strValueOf = java.lang.String.valueOf(eqgVar);
            java.lang.String str4 = eum.a;
            if (i4 == 0) {
                str3 = "NO";
            } else if (i4 == 1) {
                str3 = "NO_UNSUPPORTED_SUBTYPE";
            } else if (i4 == 2) {
                str3 = "NO_UNSUPPORTED_DRM";
            } else if (i4 == 3) {
                str3 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i4 != 4) {
                    throw new java.lang.IllegalStateException();
                }
                str3 = "YES";
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            str2 = str;
            sb.append(str2);
            sb.append(" error, index=");
            i5 = i3;
            sb.append(i5);
            sb.append(", format=");
            sb.append(strValueOf);
            sb.append(", format_supported=");
            sb.append(str3);
            string = sb.toString();
        }
        this(string, th, i2, i, str2, i5, eqgVar, i4, ffuVar, android.os.SystemClock.elapsedRealtime(), z);
    }

    final defpackage.exl a(defpackage.ffu ffuVar) {
        java.lang.String message = getMessage();
        java.lang.String str = eum.a;
        return new defpackage.exl(message, getCause(), this.a, this.c, this.d, this.e, this.f, this.g, ffuVar, this.b, this.i);
    }

    private exl(java.lang.String str, java.lang.Throwable th, int i, int i2, java.lang.String str2, int i3, defpackage.eqg eqgVar, int i4, defpackage.ffu ffuVar, long j, boolean z) {
        boolean z2;
        super(str, th, i, j);
        if (!z) {
            z2 = true;
        } else if (i2 == 1) {
            i2 = 1;
            z2 = true;
        } else {
            z2 = false;
        }
        ahvr.bM(z2);
        ahvr.bM(th != null);
        this.c = i2;
        this.d = str2;
        this.e = i3;
        this.f = eqgVar;
        this.g = i4;
        this.h = ffuVar;
        this.i = z;
    }
}
