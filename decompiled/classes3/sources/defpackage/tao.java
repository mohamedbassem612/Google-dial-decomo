package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tao {
    public final defpackage.abwd a;
    public final java.lang.String b;
    public final j$.util.Optional c;
    private final java.lang.String d;

    public tao(java.lang.String str, defpackage.abwd abwdVar, java.lang.String str2, j$.util.Optional optional) {
        this.d = str;
        this.a = abwdVar;
        this.b = str2;
        this.c = optional;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.tao) {
            defpackage.tao taoVar = (defpackage.tao) obj;
            if (this.d.equals(taoVar.d) && this.a.equals(taoVar.a) && this.b.equals(taoVar.b) && this.c.equals(taoVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.d.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final java.lang.String toString() {
        j$.util.Optional optional = this.c;
        return "RevelioSummaryCenterFragmentModel{callId=" + this.d + ", photoInfo=" + java.lang.String.valueOf(this.a) + ", callerSaidText=" + this.b + ", summaryText=" + java.lang.String.valueOf(optional) + '}';
    }

    public tao() {
        throw null;
    }
}
