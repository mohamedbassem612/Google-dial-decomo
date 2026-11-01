package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class scu extends aomd {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    java.lang.Object d;
    int e;
    /* synthetic */ java.lang.Object f;
    final /* synthetic */ scw g;
    int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public scu(scw scwVar, aoln aolnVar) {
        super(aolnVar);
        this.g = scwVar;
    }

    public final java.lang.Object b(java.lang.Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.f((android.accounts.Account[]) null, (java.util.Set) null, this);
    }
}
