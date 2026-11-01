package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rel extends defpackage.rem {
    private final defpackage.rer a;

    public rel(defpackage.rer rerVar) {
        this.a = rerVar;
    }

    @Override // defpackage.ret
    public final defpackage.res b() {
        return defpackage.res.a;
    }

    @Override // defpackage.rem, defpackage.ret
    public final defpackage.rer c() {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.ret)) {
            return false;
        }
        defpackage.ret retVar = (defpackage.ret) obj;
        return defpackage.res.a == retVar.b() && this.a.equals(retVar.c());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "ErrorDialogSpec{materialSpec=" + this.a.toString() + '}';
    }
}
