package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class vae extends aomd {
    int a;
    /* synthetic */ java.lang.Object b;
    final /* synthetic */ vaf c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vae(vaf vafVar, aoln aolnVar) {
        super(aolnVar);
        this.c = vafVar;
    }

    public final java.lang.Object b(java.lang.Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b((android.telecom.PhoneAccountHandle) null, this);
    }
}
