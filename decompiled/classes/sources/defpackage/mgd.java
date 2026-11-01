package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class mgd {
    protected final java.lang.Object a;
    protected final java.lang.Object b;
    protected final java.lang.Object c;
    final /* synthetic */ defpackage.mgu d;

    public mgd(defpackage.mgu mguVar, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        j$.util.Objects.requireNonNull(mguVar);
        this.d = mguVar;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public final defpackage.mge a(java.util.function.Function function) {
        return new defpackage.mge(this.d, this.a, this.b, ((java.lang.Boolean) aa$.ExternalSyntheticApiModelOutline1.m(function, this.c)).booleanValue());
    }

    public final defpackage.mgq b(java.util.function.Function function) {
        return new defpackage.mgq(this.d, this.a, this.b, (j$.util.Optional) aa$.ExternalSyntheticApiModelOutline1.m(function, this.c));
    }

    public final java.lang.Object c(java.util.function.Function function) {
        defpackage.mfw mfwVar = new defpackage.mfw(new mgc(function));
        this.d.f(this.c, this.a, mfwVar);
        return this.b;
    }

    public final java.lang.Object d(java.util.function.Function function) {
        defpackage.mfw mfwVar = new defpackage.mfw(function);
        this.d.f(this.c, this.a, mfwVar);
        return this.b;
    }

    public final defpackage.mgd e(java.util.function.Function function) {
        return new defpackage.mgd(this.d, this.a, this.b, aa$.ExternalSyntheticApiModelOutline1.m(function, this.c), null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public mgd(defpackage.mgu mguVar, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, byte[] bArr) {
        this(mguVar, obj, obj2, obj3);
        j$.util.Objects.requireNonNull(mguVar);
    }
}
