package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class anxh implements defpackage.anwr {
    private final defpackage.anxm a;

    public anxh(defpackage.anxm anxmVar) {
        this.a = anxmVar == null ? defpackage.anxm.INTERNAL_ERROR : anxmVar;
    }

    @Override // defpackage.anwr
    public final java.lang.String a() {
        return "GOAWAY ".concat(java.lang.String.valueOf(this.a.name()));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return obj != null && getClass() == obj.getClass() && this.a == ((defpackage.anxh) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
