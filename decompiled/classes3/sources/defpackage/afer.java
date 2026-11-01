package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afer {
    public final java.lang.String a;
    public final java.lang.String b;

    public afer(java.lang.String str, java.lang.String str2) {
        this.a = str;
        this.b = str2;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.b;
        java.lang.String str2 = this.a;
        if (str == null) {
            return defpackage.afes.a(str2);
        }
        return defpackage.afes.a(str2) + '=' + defpackage.afes.a(str);
    }
}
