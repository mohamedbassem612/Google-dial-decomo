package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ion extends aomd {
    public /* synthetic */ java.lang.Object a;
    public int b;
    final /* synthetic */ izg c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ion(izg izgVar, aoln aolnVar) {
        super(aolnVar);
        this.c = izgVar;
    }

    public final java.lang.Object b(java.lang.Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.b((android.telecom.PhoneAccountHandle) null, this);
    }
}
