package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class p5 extends j$.util.stream.d {
    public final j$.util.stream.n4 h;

    public p5(j$.util.stream.p5 p5Var, j$.util.Spliterator spliterator) {
        super(p5Var, spliterator);
        this.h = p5Var.h;
    }

    @Override // j$.util.stream.d
    public final java.lang.Object a() {
        j$.util.stream.a aVar = this.a;
        j$.util.stream.i5 i5VarQ = this.h.Q();
        aVar.O(this.b, i5VarQ);
        return i5VarQ;
    }

    @Override // j$.util.stream.d
    public final j$.util.stream.d e(j$.util.Spliterator spliterator) {
        return new j$.util.stream.p5(this, spliterator);
    }

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void onCompletion(java.util.concurrent.CountedCompleter countedCompleter) {
        j$.util.stream.d dVar = this.d;
        if (dVar != null) {
            j$.util.stream.i5 i5Var = (j$.util.stream.i5) ((j$.util.stream.p5) dVar).f;
            i5Var.B((j$.util.stream.i5) ((j$.util.stream.p5) this.e).f);
            this.f = i5Var;
        }
        super.onCompletion(countedCompleter);
    }

    public p5(j$.util.stream.n4 n4Var, j$.util.stream.a aVar, j$.util.Spliterator spliterator) {
        super(aVar, spliterator);
        this.h = n4Var;
    }
}
