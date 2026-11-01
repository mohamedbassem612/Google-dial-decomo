package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class uiy extends aomd {
    java.lang.Object a;
    /* synthetic */ java.lang.Object b;
    final /* synthetic */ ujb c;
    int d;
    uin e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uiy(ujb ujbVar, aoln aolnVar) {
        super(aolnVar);
        this.c = ujbVar;
    }

    public final java.lang.Object b(java.lang.Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.f((android.telecom.Call.Details) null, this);
    }
}
