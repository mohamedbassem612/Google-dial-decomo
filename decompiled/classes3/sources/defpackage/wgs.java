package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class wgs extends aomd {
    int a;
    /* synthetic */ java.lang.Object b;
    final /* synthetic */ wgt c;
    int d;
    oko e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wgs(wgt wgtVar, aoln aolnVar) {
        super(aolnVar);
        this.c = wgtVar;
    }

    public final java.lang.Object b(java.lang.Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.d((android.telecom.PhoneAccountHandle) null, this);
    }
}
