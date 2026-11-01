package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class adyw extends aomd {
    long a;
    /* synthetic */ java.lang.Object b;
    final /* synthetic */ adzd c;
    int d;
    java.lang.String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adyw(adzd adzdVar, aoln aolnVar) {
        super(aolnVar);
        this.c = adzdVar;
    }

    public final java.lang.Object b(java.lang.Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.n((android.accounts.Account) null, (java.lang.String) null, this);
    }
}
