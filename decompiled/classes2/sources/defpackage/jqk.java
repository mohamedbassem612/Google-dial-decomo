package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class jqk extends aomd {
    java.lang.Object a;
    /* synthetic */ java.lang.Object b;
    final /* synthetic */ jql c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jqk(jql jqlVar, aoln aolnVar) {
        super(aolnVar);
        this.c = jqlVar;
    }

    public final java.lang.Object b(java.lang.Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a((android.telecom.Call.Details) null, this);
    }
}
