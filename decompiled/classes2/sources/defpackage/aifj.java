package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aifj extends aigb {
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final defpackage.aifl c() {
        int i = this.c;
        if (i == 0) {
            return defpackage.aikd.b;
        }
        if (this.a != null) {
            if (this.d) {
                this.b = java.util.Arrays.copyOf(this.b, i << 1);
            }
            f(this.b, this.c, this.a);
        }
        this.d = true;
        return new defpackage.aikd(this.b, this.c);
    }

    @java.lang.Deprecated
    public final /* bridge */ /* synthetic */ aigf b() {
        throw new java.lang.UnsupportedOperationException("Not supported for bimaps");
    }

    public final void d(java.lang.Iterable iterable) {
        super.j(iterable);
    }
}
