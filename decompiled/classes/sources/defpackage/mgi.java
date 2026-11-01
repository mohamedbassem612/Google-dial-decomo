package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class mgi extends defpackage.mgd {
    final /* synthetic */ defpackage.mgu e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mgi(defpackage.mgu mguVar, java.lang.Object obj, java.lang.Object obj2, int i) {
        super(mguVar, obj, obj2, java.lang.Integer.valueOf(i));
        j$.util.Objects.requireNonNull(mguVar);
        this.e = mguVar;
    }

    public final int f() {
        java.lang.Integer num = (java.lang.Integer) this.c;
        this.e.f(num, this.a, new defpackage.mgh(0));
        return num.intValue();
    }
}
