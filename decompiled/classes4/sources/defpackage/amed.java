package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amed {
    public byte a;

    public final void a() {
        if (this.a != 1) {
            throw new java.lang.IllegalStateException("Missing required properties: forcePrefix");
        }
    }

    public final void b() {
        this.a = (byte) (this.a | 1);
    }

    public final void c() {
        this.a = (byte) (this.a | 2);
    }

    public final void d() {
        this.a = (byte) (this.a | 4);
    }

    public final defpackage.amjk e() {
        if (this.a == 7) {
            return new defpackage.amjk();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if ((this.a & 1) == 0) {
            sb.append(" lowConfidenceItemsRatioThreshold");
        }
        if ((this.a & 2) == 0) {
            sb.append(" minLowConfidenceAnnotationSize");
        }
        if ((this.a & 4) == 0) {
            sb.append(" numFirstItemsToSkip");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
