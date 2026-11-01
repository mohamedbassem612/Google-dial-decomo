package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class aftl extends defpackage.afpf {
    final /* synthetic */ defpackage.aftn a;

    public aftl(defpackage.aftn aftnVar) {
        j$.util.Objects.requireNonNull(aftnVar);
        this.a = aftnVar;
    }

    @Override // defpackage.afpf
    /* JADX INFO: renamed from: a */
    public final android.graphics.Matrix evaluate(float f, android.graphics.Matrix matrix, android.graphics.Matrix matrix2) {
        this.a.y = f;
        return super.evaluate(f, matrix, matrix2);
    }

    @Override // defpackage.afpf, android.animation.TypeEvaluator
    public final /* bridge */ /* synthetic */ java.lang.Object evaluate(float f, java.lang.Object obj, java.lang.Object obj2) {
        return evaluate(f, (android.graphics.Matrix) obj, (android.graphics.Matrix) obj2);
    }
}
