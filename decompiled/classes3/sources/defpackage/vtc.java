package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vtc extends amzm {
    private final amzg b;
    private final amzg c;

    public vtc(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.vtc.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) list.get(0);
        j$.util.Optional optionalG = ((zjm) list.get(1)).g();
        defpackage.vmu vmuVar = new defpackage.vmu(phoneAccountHandle, 10);
        if (true == optionalG.isPresent()) {
            optionalG = j$.util.Optional.ofNullable(((vda) optionalG.get()).a((android.telecom.PhoneAccountHandle) vmuVar.a));
        }
        return (ajcq) optionalG.orElse(aiql.z(j$.util.Optional.empty()));
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
