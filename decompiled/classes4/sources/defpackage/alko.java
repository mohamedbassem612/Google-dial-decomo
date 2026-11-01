package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alko implements j$.util.stream.Collector {
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;
    public j$.util.Optional e = j$.util.Optional.empty();

    public alko(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final java.util.function.BiConsumer accumulator() {
        return new jwx(this, 13);
    }

    public final /* synthetic */ java.util.Set characteristics() {
        return aikn.a;
    }

    public final java.util.function.BinaryOperator combiner() {
        return new defpackage.vfd(3);
    }

    public final java.util.function.Function finisher() {
        return new defpackage.alki(4);
    }

    public final java.util.function.Supplier supplier() {
        return new defpackage.ahuq(7);
    }
}
