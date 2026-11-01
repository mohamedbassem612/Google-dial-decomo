package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahuk extends ahur {
    private final defpackage.ahui b;
    private final java.util.concurrent.atomic.AtomicInteger c = new java.util.concurrent.atomic.AtomicInteger(0);
    public final j$.util.concurrent.ConcurrentHashMap a = new j$.util.concurrent.ConcurrentHashMap();

    public ahuk(defpackage.ahui ahuiVar) {
        this.b = ahuiVar;
    }

    public final aohy a(aohy aohyVar) {
        return new defpackage.ahuj(this, aohyVar);
    }

    public final void c(defpackage.ahva ahvaVar, aohy aohyVar) {
        int i;
        defpackage.ahuo ahuoVar = (defpackage.ahuo) this.a.get(java.lang.Integer.valueOf(ahvaVar.d));
        if (ahuoVar == null) {
            aohyVar.f(new anqz(anqw.i.f("Session not available."), (anph) null));
            return;
        }
        if (ahuoVar.c() == 3) {
            aohyVar.f(new anqz(anqw.i.f("Session already ended"), (anph) null));
        }
        android.widget.RemoteViewsService.RemoteViewsFactory remoteViewsFactory = (android.widget.RemoteViewsService.RemoteViewsFactory) j$.util.concurrent.ConcurrentMap.-EL.computeIfAbsent(ahuoVar.c, java.lang.Integer.valueOf(ahvaVar.e), new defpackage.adci(15));
        if (remoteViewsFactory == null) {
            aohyVar.f(new anqz(anqw.j.f("Session doesn't support collection view"), (anph) null));
            ahuoVar.d(new defpackage.amwp(new defpackage.ahup("Session doesn't support collection view", 3)));
            return;
        }
        int i2 = ahvaVar.b;
        if (i2 != 0) {
            switch (i2) {
                case 3:
                    i = 1;
                    break;
                case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                    i = 2;
                    break;
                case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                    i = 3;
                    break;
                case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                    i = 4;
                    break;
                case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                    i = 5;
                    break;
                case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                    i = 6;
                    break;
                case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                    i = 7;
                    break;
                default:
                    i = 0;
                    break;
            }
        } else {
            i = 8;
        }
        if (i == 0) {
            throw null;
        }
        switch (i - 1) {
            case 0:
                remoteViewsFactory.onDestroy();
                aohyVar.g(defpackage.ahvf.a);
                aohyVar.e();
                return;
            case 1:
                akzx akzxVarM = defpackage.ahvf.a.m();
                akzx akzxVarM2 = defpackage.ahvb.a.m();
                int count = remoteViewsFactory.getCount();
                akzxVarM2.u();
                ((defpackage.ahvb) akzxVarM2.b).b = count;
                akzxVarM.u();
                defpackage.ahvf ahvfVar = (defpackage.ahvf) akzxVarM.b;
                defpackage.ahvb ahvbVar = (defpackage.ahvb) akzxVarM2.p();
                j$.util.Objects.requireNonNull(ahvbVar);
                ahvfVar.c = ahvbVar;
                ahvfVar.b = 1;
                aohyVar.g((defpackage.ahvf) akzxVarM.p());
                aohyVar.e();
                return;
            case 2:
                android.widget.RemoteViews viewAt = remoteViewsFactory.getViewAt((i2 == 5 ? (defpackage.ahuw) ahvaVar.c : defpackage.ahuw.a).b);
                if (viewAt != null) {
                    defpackage.ahun.b(viewAt);
                }
                aohyVar.g(defpackage.ahvf.a);
                aohyVar.e();
                return;
            case 3:
                android.widget.RemoteViews loadingView = remoteViewsFactory.getLoadingView();
                if (loadingView != null) {
                    defpackage.ahun.b(loadingView);
                }
                aohyVar.g(defpackage.ahvf.a);
                aohyVar.e();
                return;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                akzx akzxVarM3 = defpackage.ahvf.a.m();
                akzx akzxVarM4 = defpackage.ahvd.a.m();
                int viewTypeCount = remoteViewsFactory.getViewTypeCount();
                akzxVarM4.u();
                ((defpackage.ahvd) akzxVarM4.b).b = viewTypeCount;
                akzxVarM3.u();
                defpackage.ahvf ahvfVar2 = (defpackage.ahvf) akzxVarM3.b;
                defpackage.ahvd ahvdVar = (defpackage.ahvd) akzxVarM4.p();
                j$.util.Objects.requireNonNull(ahvdVar);
                ahvfVar2.c = ahvdVar;
                ahvfVar2.b = 2;
                aohyVar.g((defpackage.ahvf) akzxVarM3.p());
                aohyVar.e();
                return;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                int i3 = (i2 == 8 ? (defpackage.ahuu) ahvaVar.c : defpackage.ahuu.a).b;
                akzx akzxVarM5 = defpackage.ahvf.a.m();
                akzx akzxVarM6 = defpackage.ahvc.a.m();
                long itemId = remoteViewsFactory.getItemId(i3);
                akzxVarM6.u();
                ((defpackage.ahvc) akzxVarM6.b).b = itemId;
                akzxVarM5.u();
                defpackage.ahvf ahvfVar3 = (defpackage.ahvf) akzxVarM5.b;
                defpackage.ahvc ahvcVar = (defpackage.ahvc) akzxVarM6.p();
                j$.util.Objects.requireNonNull(ahvcVar);
                ahvfVar3.c = ahvcVar;
                ahvfVar3.b = 3;
                aohyVar.g((defpackage.ahvf) akzxVarM5.p());
                aohyVar.e();
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                akzx akzxVarM7 = defpackage.ahvf.a.m();
                akzx akzxVarM8 = defpackage.ahve.a.m();
                boolean zHasStableIds = remoteViewsFactory.hasStableIds();
                akzxVarM8.u();
                ((defpackage.ahve) akzxVarM8.b).b = zHasStableIds;
                akzxVarM7.u();
                defpackage.ahvf ahvfVar4 = (defpackage.ahvf) akzxVarM7.b;
                defpackage.ahve ahveVar = (defpackage.ahve) akzxVarM8.p();
                j$.util.Objects.requireNonNull(ahveVar);
                ahvfVar4.c = ahveVar;
                ahvfVar4.b = 4;
                aohyVar.g((defpackage.ahvf) akzxVarM7.p());
                aohyVar.e();
                return;
            default:
                android.util.Log.d("ActionsServiceGrpcImpl", "received CollectionRequest with unknown RequestData case.");
                aohyVar.e();
                return;
        }
    }

    public final void d(defpackage.ahvn ahvnVar, aohy aohyVar) {
        defpackage.ahuo ahuoVar = (defpackage.ahuo) this.a.get(java.lang.Integer.valueOf(ahvnVar.b));
        if (ahuoVar == null) {
            aohyVar.f(new anqz(anqw.i.f("Session not available."), (anph) null));
            return;
        }
        synchronized (ahuoVar.d) {
        }
        synchronized (ahuoVar.d) {
        }
        aohyVar.f(new anqz(anqw.k.f("No UI set."), (anph) null));
        ahuoVar.d(new defpackage.amwp(new defpackage.ahup("No UI set.", 2)));
    }

    public final void e(defpackage.ahvk ahvkVar, aohy aohyVar) {
        defpackage.ahvg ahvgVar;
        if ((ahvkVar.b & 1) == 0 || (ahvgVar = ahvkVar.c) == null) {
            ahvgVar = defpackage.ahvg.a;
        }
        int i = ahvgVar.b;
        defpackage.ahui ahuiVar = this.b;
        java.util.concurrent.atomic.AtomicInteger atomicInteger = this.c;
        defpackage.ahuo ahuoVarC = ahuiVar.c();
        int iIncrementAndGet = atomicInteger.incrementAndGet();
        akzx akzxVarM = defpackage.ahvl.a.m();
        akzxVarM.u();
        ((defpackage.ahvl) akzxVarM.b).c = iIncrementAndGet;
        akzx akzxVarM2 = defpackage.ahvj.a.m();
        akzxVarM2.u();
        ((defpackage.ahvj) akzxVarM2.b).c = 0;
        akzxVarM2.u();
        ((defpackage.ahvj) akzxVarM2.b).b = 0;
        akzxVarM.u();
        defpackage.ahvl ahvlVar = (defpackage.ahvl) akzxVarM.b;
        defpackage.ahvj ahvjVar = (defpackage.ahvj) akzxVarM2.p();
        j$.util.Objects.requireNonNull(ahvjVar);
        ahvlVar.d = ahvjVar;
        ahvlVar.b |= 1;
        defpackage.ahvl ahvlVar2 = (defpackage.ahvl) akzxVarM.p();
        this.a.put(java.lang.Integer.valueOf(iIncrementAndGet), ahuoVarC);
        aohyVar.g(ahvlVar2);
        aohyVar.e();
    }
}
