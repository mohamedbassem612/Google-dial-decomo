package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class jay extends aomd {
    boolean a;
    /* synthetic */ java.lang.Object b;
    final /* synthetic */ jbm c;
    int d;
    android.telecom.PhoneAccountHandle e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jay(jbm jbmVar, aoln aolnVar) {
        super(aolnVar);
        this.c = jbmVar;
    }

    public final java.lang.Object b(java.lang.Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a((android.telecom.PhoneAccountHandle) null, false, this);
    }
}
