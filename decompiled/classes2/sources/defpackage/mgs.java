package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mgs extends mgd {
    final /* synthetic */ mgu e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mgs(mgu mguVar, java.lang.Object obj, java.lang.Object obj2, java.lang.String str) {
        super(mguVar, obj, obj2, str);
        j$.util.Objects.requireNonNull(mguVar);
        this.e = mguVar;
    }

    public final java.lang.Object f() {
        java.lang.String str = (java.lang.String) this.c;
        mfw mfwVar = new mfw(new defpackage.mig(1));
        this.e.f(str, this.a, mfwVar);
        return this.b;
    }
}
