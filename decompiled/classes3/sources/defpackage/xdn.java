package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xdn extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amyz f;

    public xdn(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amyz amyzVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.xdn.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amyzVar3;
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        j$.util.Optional optionalOf;
        java.util.List list = (java.util.List) obj;
        long jLongValue = ((java.lang.Long) list.get(0)).longValue();
        j$.util.Optional optional = (j$.util.Optional) list.get(1);
        defpackage.wxm wxmVar = (defpackage.wxm) list.get(2);
        defpackage.xdh xdhVar = (defpackage.xdh) list.get(3);
        if (optional.isPresent()) {
            int iJ = wsc.j(xdhVar.c.c);
            if (iJ == 0) {
                throw null;
            }
            switch (iJ - 1) {
                case 0:
                case 1:
                case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                    amyz amyzVar = this.f;
                    wxmVar.c(jLongValue, defpackage.alex.ATLAS_UI_READY);
                    wxmVar.c(jLongValue, defpackage.alex.ATLAS_UI_HFM_BUTTON_SHOWN);
                    optionalOf = !((defpackage.qcr) amyzVar.a()).b() ? j$.util.Optional.of(defpackage.reb.ATLAS_PROMO) : j$.util.Optional.empty();
                    break;
                case 2:
                case 3:
                case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                    optionalOf = j$.util.Optional.of(defpackage.reb.ATLAS_TAKEOVER);
                    break;
                default:
                    optionalOf = j$.util.Optional.empty();
                    break;
            }
        } else {
            optionalOf = j$.util.Optional.empty();
        }
        return aiql.z(optionalOf);
    }

    protected final ajcq c() {
        amzg amzgVar = this.e;
        amzg amzgVar2 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar2.d(), amzgVar.d()});
    }
}
