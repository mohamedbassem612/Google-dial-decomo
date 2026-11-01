package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajtg {
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;
    private final java.lang.String e;
    private final java.lang.String f;
    private final java.lang.String g;
    private final java.lang.String h;

    public ajtg(java.lang.String str) {
        defpackage.aais.ao(!defpackage.aait.a("1:747654520220:android:0000000000000000"), "ApplicationId must be set.");
        this.b = "1:747654520220:android:0000000000000000";
        this.a = "AIzaSyC8UYZpvA2eknNex0Pjid0_eTLJoDu6los";
        this.e = null;
        this.f = null;
        this.c = str;
        this.g = null;
        this.h = null;
        this.d = "chime-sdk";
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.ajtg)) {
            return false;
        }
        defpackage.ajtg ajtgVar = (defpackage.ajtg) obj;
        if (!j$.util.Objects.equals(this.b, ajtgVar.b) || !j$.util.Objects.equals(this.a, ajtgVar.a)) {
            return false;
        }
        java.lang.String str = ajtgVar.e;
        if (!j$.util.Objects.equals((java.lang.Object) null, (java.lang.Object) null)) {
            return false;
        }
        java.lang.String str2 = ajtgVar.f;
        if (!j$.util.Objects.equals((java.lang.Object) null, (java.lang.Object) null) || !j$.util.Objects.equals(this.c, ajtgVar.c)) {
            return false;
        }
        java.lang.String str3 = ajtgVar.g;
        if (!j$.util.Objects.equals((java.lang.Object) null, (java.lang.Object) null)) {
            return false;
        }
        java.lang.String str4 = ajtgVar.h;
        return j$.util.Objects.equals((java.lang.Object) null, (java.lang.Object) null) && j$.util.Objects.equals(this.d, ajtgVar.d);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.b, this.a, null, null, this.c, null, null, this.d});
    }

    public final java.lang.String toString() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.aehj.bX("applicationId", this.b, arrayList);
        defpackage.aehj.bX("apiKey", this.a, arrayList);
        defpackage.aehj.bX("databaseUrl", null, arrayList);
        defpackage.aehj.bX("gcmSenderId", this.c, arrayList);
        defpackage.aehj.bX("storageBucket", null, arrayList);
        defpackage.aehj.bX("recaptchaSiteKey", null, arrayList);
        defpackage.aehj.bX("projectId", this.d, arrayList);
        return defpackage.aehj.bW(arrayList, this);
    }
}
