package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aitr {
    public final defpackage.aito a;
    public final defpackage.aito b;
    public final j$.util.Spliterator c;
    public final j$.util.Spliterator d;
    final /* synthetic */ defpackage.aits e;

    public aitr(defpackage.aits aitsVar) {
        j$.util.Objects.requireNonNull(aitsVar);
        this.e = aitsVar;
        this.a = new defpackage.aito();
        this.b = new defpackage.aito();
        this.c = aitsVar.a.spliterator();
        this.d = aitsVar.b.spliterator();
    }

    public final boolean a() {
        return this.c.tryAdvance(this.a) && this.d.tryAdvance(this.b);
    }

    public final boolean b(boolean z, java.util.function.BiPredicate biPredicate) {
        while (a()) {
            if (aa$.ExternalSyntheticApiModelOutline1.m(biPredicate, this.a.a, this.b.a) == z) {
                return z;
            }
        }
        return !z;
    }
}
