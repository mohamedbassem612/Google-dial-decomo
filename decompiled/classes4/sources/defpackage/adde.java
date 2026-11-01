package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class adde {
    public final java.lang.Integer a;
    public final defpackage.akwo c;
    private final java.lang.String d = null;
    public final java.lang.String b = "fake-token";

    public adde(java.lang.Integer num, defpackage.akwo akwoVar) {
        this.a = num;
        this.c = akwoVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.adde)) {
            return false;
        }
        defpackage.adde addeVar = (defpackage.adde) obj;
        if (!j$.util.Objects.equals(this.a, addeVar.a)) {
            return false;
        }
        java.lang.String str = addeVar.d;
        return j$.util.Objects.equals((java.lang.Object) null, (java.lang.Object) null) && j$.util.Objects.equals(this.b, addeVar.b) && j$.util.Objects.equals(this.c, addeVar.c);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, null, this.b, this.c});
    }
}
