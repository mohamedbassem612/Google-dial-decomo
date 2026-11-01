package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rek extends defpackage.rem {
    private final defpackage.rep a;

    public rek(defpackage.rep repVar) {
        this.a = repVar;
    }

    @Override // defpackage.rem, defpackage.ret
    public final defpackage.rep a() {
        return this.a;
    }

    @Override // defpackage.ret
    public final defpackage.res b() {
        return defpackage.res.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.ret)) {
            return false;
        }
        defpackage.ret retVar = (defpackage.ret) obj;
        return defpackage.res.b == retVar.b() && this.a.equals(retVar.a());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "ErrorDialogSpec{customSpec=" + this.a.toString() + '}';
    }
}
