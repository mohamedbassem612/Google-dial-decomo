package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aehe implements defpackage.xpa {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final int d;
    private final int e;

    public aehe(boolean z, boolean z2, int i, int i2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.d = i;
        this.e = i2;
        this.c = z3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.aehe) {
            defpackage.aehe aeheVar = (defpackage.aehe) obj;
            if (this.a == aeheVar.a && this.b == aeheVar.b && this.d == aeheVar.d && this.e == aeheVar.e && this.c == aeheVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((anty.L(this.a) * 31) + anty.L(this.b)) * 31) + this.d) * 31) + this.e) * 31) + anty.L(this.c);
    }

    @Override // defpackage.xpa
    public final android.os.PersistableBundle toPersistableBundle() {
        android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
        persistableBundle.putBoolean("DIALER_DOBBY_CONSENTED_KEY", this.a);
        persistableBundle.putBoolean("DIALER_SHARPIE_CONSENTED_KEY", this.b);
        persistableBundle.putInt("DOBBY_RESULT_CODE_KEY", this.d - 1);
        persistableBundle.putInt("SHARPIE_RESULT_CODE_KEY", this.e - 1);
        persistableBundle.putBoolean("IS_API_ERROR_KEY", this.c);
        return persistableBundle;
    }

    public final java.lang.String toString() {
        return "Data(dialerDobbyConsented=" + this.a + ", dialerSharpieConsented=" + this.b + ", dobbyResultCode=" + ((java.lang.Object) aehj.a(this.d)) + ", sharpieResultCode=" + ((java.lang.Object) aehj.a(this.e)) + ", isApiError=" + this.c + ')';
    }
}
