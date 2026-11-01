package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vta extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;
    private final amzg g;
    private final amzg h;
    private final amzg i;

    public vta(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6, amzg amzgVar7, amzg amzgVar8) {
        super(amyzVar2, new defpackage.amzw(defpackage.vta.class), amyzVar);
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
        android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) list.get(1);
        ahbv ahbvVar = (ahbv) list.get(2);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(3)).booleanValue();
        defpackage.vrr vrrVar = (defpackage.vrr) list.get(4);
        defpackage.vry vryVar = (defpackage.vry) list.get(5);
        ajct ajctVar = (ajct) list.get(6);
        int iOrdinal = vryVar.ordinal();
        amzg amzgVar = this.h;
        if (iOrdinal == 0) {
            if (vrrVar.equals(defpackage.vrr.a)) {
                return zBooleanValue ? aiql.z(j$.util.Optional.of(context.getResources().getString(2132020880))) : ahvr.H(amzgVar.d(), new defpackage.vmb(context, 19), ajctVar);
            }
            return aiql.z(j$.util.Optional.empty());
        }
        if (iOrdinal != 1) {
            return iOrdinal != 2 ? aiql.z(j$.util.Optional.empty()) : aiql.z(j$.util.Optional.of(context.getResources().getString(2132020879)));
        }
        if (!vrrVar.equals(defpackage.vrr.a)) {
            return ahbvVar.h(phoneAccountHandle) ? aiql.z(j$.util.Optional.of(context.getResources().getString(2132020878))) : aiql.z(j$.util.Optional.of(context.getResources().getString(2132020877)));
        }
        if (ahbvVar.h(phoneAccountHandle)) {
            return aiql.z(j$.util.Optional.of(context.getResources().getString(2132020878)));
        }
        return !zBooleanValue ? ahvr.H(amzgVar.d(), new defpackage.vmb(context, 17), ajctVar) : aiql.z(j$.util.Optional.of(context.getResources().getString(2132020880)));
    }

    protected final ajcq c() {
        amzg amzgVar = this.i;
        amzg amzgVar2 = this.g;
        amzg amzgVar3 = this.f;
        amzg amzgVar4 = this.e;
        amzg amzgVar5 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar5.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
