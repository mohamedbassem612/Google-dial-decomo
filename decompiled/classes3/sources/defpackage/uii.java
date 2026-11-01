package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class uii extends aomd {
    /* synthetic */ java.lang.Object a;
    final /* synthetic */ uij b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uii(uij uijVar, aoln aolnVar) {
        super(aolnVar);
        this.b = uijVar;
    }

    public final java.lang.Object b(java.lang.Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.d((android.telecom.Call.Details) null, this);
    }
}
