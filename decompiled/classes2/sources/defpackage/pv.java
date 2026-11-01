package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class pv {
    public final defpackage.sd a;
    public final defpackage.pv b;

    public pv(defpackage.pw pwVar) {
        int i = defpackage.pw.b;
        this.a = (defpackage.sd) j$.util.Objects.requireNonNull(new defpackage.sd(pwVar.a));
        this.b = this;
    }

    public static final void d(java.lang.String str) {
        if (str.isEmpty()) {
            throw new java.lang.IllegalArgumentException("Property name cannot be blank.");
        }
    }

    public final defpackage.pw a() {
        return new defpackage.pw(this.a.a());
    }

    public final void b(java.lang.String str) {
        dzk.x(str);
        j$.util.Objects.requireNonNull(str);
        this.a.c.remove(str);
    }

    public final void c(java.lang.String str, defpackage.pw... pwVarArr) {
        dzk.x(str);
        d(str);
        androidx.appsearch.safeparcel.GenericDocumentParcel[] genericDocumentParcelArr = new androidx.appsearch.safeparcel.GenericDocumentParcel[pwVarArr.length];
        for (int i = 0; i < pwVarArr.length; i++) {
            defpackage.pw pwVar = pwVarArr[i];
            if (pwVar == null) {
                throw new java.lang.IllegalArgumentException(a.bs(i, "The document at ", " is null."));
            }
            genericDocumentParcelArr[i] = pwVar.a;
        }
        defpackage.sd sdVar = this.a;
        defpackage.sk skVar = new defpackage.sk(str);
        skVar.d(genericDocumentParcelArr);
        sdVar.b(str, skVar.a());
    }

    public pv(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        dzk.x(str);
        dzk.x(str2);
        dzk.x(str3);
        this.b = this;
        this.a = new defpackage.sd(str, str2, str3);
    }
}
