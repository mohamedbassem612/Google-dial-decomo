package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adtm {
    public final java.lang.Long a;
    public final java.lang.Long b;
    public final java.lang.Long c = 0L;
    public final java.lang.Long d = 0L;
    public final java.lang.Long e = 0L;
    public final java.lang.Long f = 0L;
    public final java.lang.Long g = 0L;
    public final java.lang.Long h = 0L;
    public final int i = 2;

    public adtm(java.lang.Long l, java.lang.Long l2, int i) {
        this.a = l;
        this.b = l2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.adtm) {
            defpackage.adtm adtmVar = (defpackage.adtm) obj;
            if (j$.util.Objects.equals(this.a, adtmVar.a) && j$.util.Objects.equals(this.b, adtmVar.b)) {
                int i = adtmVar.i;
                if (j$.util.Objects.equals(this.c, adtmVar.c) && j$.util.Objects.equals(this.d, adtmVar.d) && j$.util.Objects.equals(this.e, adtmVar.e) && j$.util.Objects.equals(this.f, adtmVar.f) && j$.util.Objects.equals(this.g, adtmVar.g) && j$.util.Objects.equals(this.h, adtmVar.h)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, this.b, 2, this.c, this.d, this.e, this.f, this.g, this.h});
    }
}
