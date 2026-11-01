package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class mri extends aomd {
    boolean a;
    /* synthetic */ java.lang.Object b;
    final /* synthetic */ defpackage.mrz c;
    int d;
    apdp e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mri(defpackage.mrz mrzVar, aoln aolnVar) {
        super(aolnVar);
        this.c = mrzVar;
    }

    public final java.lang.Object b(java.lang.Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(false, this);
    }
}
