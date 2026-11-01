package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vje implements ajba {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ vje(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [aonn, java.lang.Object] */
    public final ajbg a(ajyk ajykVar, java.lang.Object obj) {
        ajbg ajbgVar;
        int i = this.$cid;
        if (i == 0) {
            return (ajbg) this.a.a(ajykVar, obj);
        }
        if (i == 1) {
            java.lang.Object obj2 = this.a;
            ajykVar.o(new defpackage.viw(obj2, 0), ((vix) obj2).d);
            ajbgVar = new ajbg(dff.m(new jnr(obj2, (android.net.NetworkRequest) obj, 5, (byte[]) null)));
        } else {
            if (i == 2) {
                return (ajbg) this.a.a(ajykVar, obj);
            }
            int i2 = 9;
            if (i == 3) {
                java.lang.Object obj3 = this.a;
                return ((defpackage.vgs) obj3).f(new defpackage.vdp(obj3, i2));
            }
            if (i != 4) {
                j$.util.Optional optionalOfNullable = (j$.util.Optional) obj;
                defpackage.vdj vdjVar = new defpackage.vdj(this.a, 9);
                if (true == optionalOfNullable.isPresent()) {
                    optionalOfNullable = j$.util.Optional.ofNullable(new ajbg(((vcc) optionalOfNullable.get()).f((android.telecom.PhoneAccountHandle) vdjVar.a)));
                }
                return (ajbg) optionalOfNullable.orElse(new ajbg(aiql.z(j$.util.Optional.empty())));
            }
            java.lang.Object obj4 = this.a;
            ((defpackage.vka) obj4).d.n(rmw.aI);
            ajbgVar = new ajbg(ajcm.a);
        }
        return ajbgVar;
    }
}
