package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public class b3 extends j$.util.stream.d {
    public final j$.util.stream.a h;
    public final java.util.function.LongFunction i;
    public final java.util.function.BinaryOperator j;

    public b3(j$.util.stream.b3 b3Var, j$.util.Spliterator spliterator) {
        super(b3Var, spliterator);
        this.h = b3Var.h;
        this.i = b3Var.i;
        this.j = b3Var.j;
    }

    @Override // j$.util.stream.d
    public final java.lang.Object a() {
        j$.util.stream.m2 m2Var = (j$.util.stream.m2) this.i.apply(this.h.q(this.b));
        this.h.O(this.b, m2Var);
        return m2Var.build();
    }

    @Override // j$.util.stream.d
    public final j$.util.stream.d e(j$.util.Spliterator spliterator) {
        return new j$.util.stream.b3(this, spliterator);
    }

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void onCompletion(java.util.concurrent.CountedCompleter countedCompleter) {
        j$.util.stream.d dVar = this.d;
        if (dVar != null) {
            this.f = (j$.util.stream.u2) this.j.apply((j$.util.stream.u2) ((j$.util.stream.b3) dVar).f, (j$.util.stream.u2) ((j$.util.stream.b3) this.e).f);
        }
        super.onCompletion(countedCompleter);
    }

    public b3(j$.util.stream.a aVar, j$.util.Spliterator spliterator, java.util.function.LongFunction longFunction, java.util.function.BinaryOperator binaryOperator) {
        super(aVar, spliterator);
        this.h = aVar;
        this.i = longFunction;
        this.j = binaryOperator;
    }
}
