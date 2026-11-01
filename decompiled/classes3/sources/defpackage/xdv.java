package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xdv extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;

    public xdv(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4) {
        super(amyzVar2, new defpackage.amzw(defpackage.xdv.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        defpackage.wxx wxxVar;
        j$.util.Optional optionalEmpty;
        defpackage.rea reaVar;
        defpackage.rgn rgnVar;
        defpackage.rgt rgtVar;
        int i;
        j$.util.Optional optionalOf;
        java.util.List list = (java.util.List) obj;
        j$.util.Optional optional = (j$.util.Optional) list.get(0);
        defpackage.xdh xdhVar = (defpackage.xdh) list.get(1);
        defpackage.zip zipVar = (defpackage.zip) list.get(2);
        if (optional.isPresent()) {
            defpackage.wya wyaVar = xdhVar.c;
            defpackage.rgo rgoVar = new defpackage.rgo();
            rgoVar.g = 2;
            rgoVar.a = defpackage.rea.CONTROLLER_ATLAS;
            int i2 = wyaVar.c;
            int iJ = wsc.j(i2);
            if (iJ == 0) {
                throw null;
            }
            switch (iJ - 1) {
                case 0:
                case 1:
                case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                    optionalOf = j$.util.Optional.empty();
                    break;
                case 2:
                    rgoVar.b = defpackage.rgn.b;
                    rgoVar.c = new defpackage.rgt(new defpackage.rgl(2132017394), defpackage.rgq.a);
                    rgoVar.f = 1;
                    rgoVar.a(2132017393);
                    break;
                case 3:
                    rgoVar.b = defpackage.rgn.a;
                    rgoVar.c = new defpackage.rgt(new defpackage.rgl(2132017411), defpackage.rgq.b);
                    rgoVar.f = 2;
                    rgoVar.a(2132017410);
                    break;
                case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                    rgoVar.b = defpackage.rgn.a;
                    rgoVar.c = new defpackage.rgt(new defpackage.rgl(2132017376), defpackage.rgq.a);
                    rgoVar.f = 2;
                    rgoVar.a(2132017375);
                    break;
                case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                    long epochMilli = (i2 == 7 ? (defpackage.wxr) wyaVar.d : defpackage.wxr.a).c - j$.time.Instant.now().toEpochMilli();
                    rgoVar.b = defpackage.rgn.a;
                    defpackage.rgr rgrVar = new defpackage.rgr(((int) epochMilli) / 1000);
                    j$.util.Objects.requireNonNull(rgrVar);
                    rgoVar.c = new defpackage.rgt(new defpackage.rgk(rgrVar), defpackage.rgq.a);
                    rgoVar.f = 3;
                    break;
                case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                    int iAe = a.ae((i2 == 8 ? (defpackage.wxs) wyaVar.d : defpackage.wxs.a).c);
                    if (iAe == 0) {
                        iAe = 1;
                    }
                    if (iAe - 1 == 0) {
                        rgoVar.b = defpackage.rgn.a;
                        rgoVar.c = new defpackage.rgt(new defpackage.rgl(2132017399), defpackage.rgq.b);
                        rgoVar.f = 2;
                        rgoVar.a(2132017398);
                    } else {
                        rgoVar.b = defpackage.rgn.a;
                        rgoVar.c = new defpackage.rgt(new defpackage.rgl(2132017397), defpackage.rgq.b);
                        rgoVar.f = 2;
                        rgoVar.a(2132017396);
                    }
                    break;
            }
            defpackage.wya wyaVar2 = ((defpackage.xdh) zipVar.b).c;
            int i3 = wyaVar2.c;
            if (wsc.j(i3) == 3 || wsc.j(i3) == 4) {
                if (wsc.j(i3) == 3) {
                    wxxVar = (i3 == 4 ? (defpackage.wxq) wyaVar2.d : defpackage.wxq.a).c;
                    if (wxxVar == null) {
                        wxxVar = defpackage.wxx.a;
                    }
                } else {
                    wxxVar = (i3 == 5 ? (defpackage.wxy) wyaVar2.d : defpackage.wxy.a).c;
                    if (wxxVar == null) {
                        wxxVar = defpackage.wxx.a;
                    }
                }
                j$.util.Optional optionalEmpty2 = j$.util.Optional.empty();
                int i4 = wxxVar.c;
                int iK = wsc.k(i4);
                int i5 = iK - 1;
                if (iK == 0) {
                    throw null;
                }
                if (i5 == 0) {
                    defpackage.ajwx ajwxVar = new defpackage.ajwx();
                    ajwxVar.e((i4 == 2 ? (defpackage.wxv) wxxVar.d : defpackage.wxv.a).c);
                    ajwxVar.b = 1;
                    ajwxVar.d(wxxVar.e);
                    optionalEmpty2 = j$.util.Optional.of(ajwxVar.c());
                } else if (i5 == 1) {
                    defpackage.ajwx ajwxVar2 = new defpackage.ajwx();
                    ajwxVar2.e((i4 == 3 ? (defpackage.wxw) wxxVar.d : defpackage.wxw.a).c);
                    ajwxVar2.b = wsc.k(zipVar.a.c) != 2 ? 1 : 3;
                    ajwxVar2.d(wxxVar.e);
                    optionalEmpty2 = j$.util.Optional.of(ajwxVar2.c());
                }
                zipVar.a = wxxVar;
                optionalEmpty = optionalEmpty2;
            } else {
                optionalEmpty = j$.util.Optional.empty();
            }
            j$.util.Objects.requireNonNull(rgoVar);
            defpackage.xch xchVar = new defpackage.xch(rgoVar, 4);
            if (true == optionalEmpty.isPresent()) {
                ((defpackage.rgo) xchVar.a).e = j$.util.Optional.of(optionalEmpty.get());
            }
            int i6 = rgoVar.g;
            if (i6 == 0 || (reaVar = rgoVar.a) == null || (rgnVar = rgoVar.b) == null || (rgtVar = rgoVar.c) == null || (i = rgoVar.f) == 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                if (rgoVar.g == 0) {
                    sb.append(" priority");
                }
                if (rgoVar.a == null) {
                    sb.append(" featureControllerKey");
                }
                if (rgoVar.b == null) {
                    sb.append(" assistantLogoState");
                }
                if (rgoVar.c == null) {
                    sb.append(" titleModel");
                }
                if (rgoVar.f == 0) {
                    sb.append(" returnToCallButtonStyle");
                }
                throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
            }
            optionalOf = j$.util.Optional.of(new defpackage.rgp(i6, reaVar, rgnVar, rgtVar, rgoVar.d, i, rgoVar.e));
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
