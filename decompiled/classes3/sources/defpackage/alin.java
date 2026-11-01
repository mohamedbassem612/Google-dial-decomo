package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class alin {
    public final boolean a;
    public final java.lang.Object b;
    public final java.lang.Object c;

    public alin(android.telecom.PhoneAccountHandle phoneAccountHandle, defpackage.svi sviVar, boolean z) {
        this.c = phoneAccountHandle;
        this.b = sviVar;
        this.a = z;
    }

    public static java.util.List a(java.lang.String str) {
        return java.util.Arrays.asList(str.split(" "));
    }

    public alin(boolean z, java.lang.String str, java.lang.String str2) {
        this.a = z;
        this.b = str;
        this.c = str2;
    }
}
