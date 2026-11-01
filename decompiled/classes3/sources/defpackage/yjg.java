package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class yjg extends defpackage.yjf {
    public float a;
    final /* synthetic */ defpackage.yjh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yjg(defpackage.yjh yjhVar) {
        super(yjhVar);
        j$.util.Objects.requireNonNull(yjhVar);
        this.b = yjhVar;
        this.a = 0.0f;
    }

    @Override // defpackage.yjf
    public final void a(java.lang.String str) {
        this.a += this.b.d.d.measureText(str);
    }
}
