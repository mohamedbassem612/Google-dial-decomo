package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class srx extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;
    private final amzg g;
    private final amzg h;
    private final amzg i;

    public srx(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6, amzg amzgVar7, amzg amzgVar8) {
        super(amyzVar2, new defpackage.amzw(defpackage.srx.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
        this.g = amzs.b(amzgVar6);
        this.h = amzs.b(amzgVar7);
        this.i = amzs.b(amzgVar8);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        android.content.Context context = (android.content.Context) list.get(0);
        aoss aossVar = (aoss) list.get(1);
        final j$.util.Optional optional = (j$.util.Optional) list.get(2);
        final j$.util.Optional optional2 = (j$.util.Optional) list.get(3);
        final boolean zBooleanValue = ((java.lang.Boolean) list.get(4)).booleanValue();
        final rmt rmtVar = (rmt) list.get(5);
        final sry sryVar = (sry) list.get(6);
        final j$.util.Optional optional3 = (j$.util.Optional) list.get(7);
        aooh.f(context, "appContext");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(optional, "displayName");
        aooh.f(optional2, "phoneLookupInfoName");
        aooh.f(rmtVar, "contactSourceType");
        aooh.f(sryVar, "prefixEligibility");
        aooh.f(optional3, "phoneAccountHandleOptional");
        return aiql.z(new defpackage.uyg(new defpackage.zka() { // from class: srw
            @Override // defpackage.zka
            public final boolean a() {
                android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) aooh.q(optional3);
                if (phoneAccountHandle != null) {
                    boolean z = zBooleanValue;
                    if (sryVar.a(rmtVar, phoneAccountHandle, z)) {
                        j$.util.Optional optional4 = optional;
                        if (optional4.isPresent() && aooh.n(optional4, optional2)) {
                            return true;
                        }
                    }
                }
                return false;
            }
        }, (ajas) new qat(aossVar, context, 9)));
    }

    protected final ajcq c() {
        amzg amzgVar = this.i;
        amzg amzgVar2 = this.h;
        amzg amzgVar3 = this.g;
        amzg amzgVar4 = this.f;
        amzg amzgVar5 = this.e;
        amzg amzgVar6 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar6.d(), amzgVar5.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
