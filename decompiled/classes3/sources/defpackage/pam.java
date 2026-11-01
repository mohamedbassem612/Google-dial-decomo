package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pam extends amzm {
    private final amzg b;
    private final amzg c;

    public pam(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.pam.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        j$.util.Optional optional = (j$.util.Optional) list.get(0);
        java.lang.String str = (java.lang.String) list.get(1);
        akzx akzxVarM = jxs.a.m();
        defpackage.oys oysVar = new defpackage.oys(akzxVarM, 7);
        if (true == optional.isPresent()) {
            java.lang.Object obj2 = optional.get();
            java.lang.Object obj3 = oysVar.a;
            oad oadVar = (oad) obj2;
            akzx akzxVarM2 = jxp.a.m();
            android.location.Location location = oadVar.a;
            double latitude = location.getLatitude();
            akzxVarM2.u();
            jxp jxpVar = akzxVarM2.b;
            jxpVar.b |= 1;
            jxpVar.c = latitude;
            double longitude = location.getLongitude();
            akzxVarM2.u();
            jxp jxpVar2 = akzxVarM2.b;
            jxpVar2.b |= 2;
            jxpVar2.d = longitude;
            jxp jxpVarP = akzxVarM2.p();
            akzx akzxVar = (akzx) obj3;
            akzxVar.u();
            jxs jxsVar = akzxVar.b;
            j$.util.Objects.requireNonNull(jxpVarP);
            jxsVar.c = jxpVarP;
            jxsVar.b |= 1;
            j$.util.Optional optional2 = oadVar.b;
            defpackage.oys oysVar2 = new defpackage.oys(obj3, 6);
            if (true == optional2.isPresent()) {
                java.lang.Object obj4 = optional2.get();
                java.lang.Object obj5 = oysVar2.a;
                java.lang.String str2 = ((opc) obj4).c;
                akzx akzxVar2 = (akzx) obj5;
                akzxVar2.u();
                jxs jxsVar2 = akzxVar2.b;
                j$.util.Objects.requireNonNull(str2);
                jxsVar2.b |= 2;
                jxsVar2.d = str2;
            }
        }
        akzxVarM.u();
        jxs jxsVar3 = akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        jxsVar3.b |= 4;
        jxsVar3.e = str;
        return aiql.z(akzxVarM.p());
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
