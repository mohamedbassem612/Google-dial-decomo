package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class uiz extends aomd {
    /* synthetic */ java.lang.Object a;
    final /* synthetic */ ujb b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uiz(ujb ujbVar, aoln aolnVar) {
        super(aolnVar);
        this.b = ujbVar;
    }

    public final java.lang.Object b(java.lang.Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.g((android.telecom.Call.Details) null, this);
    }
}
