package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajjj extends defpackage.ajsz {
    public static final java.util.Set a = (java.util.Set) defpackage.ajne.a(new defpackage.ajhl(10));
    public final defpackage.ajjf b;
    public final defpackage.ajjg c;
    public final defpackage.ajjh d;
    public final defpackage.ajji e;
    public final ajst f;
    public final defpackage.ajsz g;

    public ajjj(defpackage.ajjf ajjfVar, defpackage.ajjg ajjgVar, defpackage.ajjh ajjhVar, defpackage.ajsz ajszVar, defpackage.ajji ajjiVar, ajst ajstVar) {
        super((byte[]) null);
        this.b = ajjfVar;
        this.c = ajjgVar;
        this.d = ajjhVar;
        this.g = ajszVar;
        this.e = ajjiVar;
        this.f = ajstVar;
    }

    @Override // defpackage.ajsz
    public final boolean dU() {
        return this.e != defpackage.ajji.c;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.ajjj)) {
            return false;
        }
        defpackage.ajjj ajjjVar = (defpackage.ajjj) obj;
        return j$.util.Objects.equals(ajjjVar.b, this.b) && j$.util.Objects.equals(ajjjVar.c, this.c) && j$.util.Objects.equals(ajjjVar.d, this.d) && j$.util.Objects.equals(ajjjVar.g, this.g) && j$.util.Objects.equals(ajjjVar.e, this.e) && j$.util.Objects.equals(ajjjVar.f, this.f);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{defpackage.ajjj.class, this.b, this.c, this.d, this.g, this.e, this.f});
    }

    public final java.lang.String toString() {
        return java.lang.String.format("EciesParameters(curveType=%s, hashType=%s, pointFormat=%s, demParameters=%s, variant=%s, salt=%s)", this.b, this.c, this.d, this.g, this.e, this.f);
    }
}
