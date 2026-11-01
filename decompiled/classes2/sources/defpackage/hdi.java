package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hdi implements defpackage.hdl {
    private final defpackage.hdb a;
    private final defpackage.hdb b;

    public hdi(defpackage.hdb hdbVar, defpackage.hdb hdbVar2) {
        this.a = hdbVar;
        this.b = hdbVar2;
    }

    @Override // defpackage.hdl
    public final defpackage.hbd a() {
        return new defpackage.hbq(this.a.a(), this.b.a());
    }

    @Override // defpackage.hdl
    public final java.util.List b() {
        throw new java.lang.UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // defpackage.hdl
    public final boolean c() {
        return this.a.c() && this.b.c();
    }
}
