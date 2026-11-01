package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class msf extends aomd {
    public java.lang.Object a;
    public java.lang.Object b;
    public /* synthetic */ java.lang.Object c;
    public int d;
    public java.lang.String e;
    public nok f;
    final /* synthetic */ rdp g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public msf(rdp rdpVar, aoln aolnVar) {
        super(aolnVar);
        this.g = rdpVar;
    }

    public final java.lang.Object b(java.lang.Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return this.g.e((android.telecom.Call.Details) null, (java.lang.String) null, this);
    }
}
