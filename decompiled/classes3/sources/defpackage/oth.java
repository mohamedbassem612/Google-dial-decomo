package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class oth implements java.util.function.UnaryOperator {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ oth(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                break;
            default:
                break;
        }
        return j$.util.function.Function.-CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r0v38, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v45, types: [ajcu, java.lang.Object] */
    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        java.lang.Object objOf;
        switch (this.$cid) {
            case 0:
                j$.util.Optional optional = (j$.util.Optional) obj;
                boolean zIsPresent = optional.isPresent();
                java.lang.Object obj2 = this.a;
                if (zIsPresent) {
                    defpackage.oti.a.b().l("com/android/dialer/incall/activity/lockholder/CallScopeLockHolder", "acquireInCallUiLock", 83, "CallScopeLockHolder.java").y("InCallUiLock already acquired for %s", ((defpackage.oti) obj2).e);
                    return optional;
                }
                j$.util.Optional optionalOfNullable = (j$.util.Optional) ((defpackage.oti) obj2).c.d.getAndSet(j$.util.Optional.empty());
                nzu nzuVar = new nzu(obj2, 15);
                if (true == optionalOfNullable.isPresent()) {
                    java.lang.Object obj3 = optionalOfNullable.get();
                    defpackage.qay qayVar = (defpackage.qay) obj3;
                    defpackage.oti otiVar = (defpackage.oti) nzuVar.a;
                    defpackage.oti.a.b().l("com/android/dialer/incall/activity/lockholder/CallScopeLockHolder", "acquireInCallUiLock", 91, "CallScopeLockHolder.java").y("transferring OnBindUiLockHolder's InCallUiLock to CallScopeLockHolder - %s", otiVar.e);
                    qayVar.a = otiVar.d();
                    optionalOfNullable = j$.util.Optional.ofNullable(j$.util.Optional.of(qayVar));
                }
                idb idbVar = new idb(obj2, 6);
                if (true != optionalOfNullable.isPresent()) {
                    defpackage.oti otiVar2 = (defpackage.oti) idbVar.a;
                    defpackage.oti.a.b().l("com/android/dialer/incall/activity/lockholder/CallScopeLockHolder", "acquireInCallUiLock", 100, "CallScopeLockHolder.java").y("acquiring InCallUiLock for %s", otiVar2.e);
                    objOf = j$.util.Optional.of(otiVar2.b.a(otiVar2.d()));
                } else {
                    objOf = optionalOfNullable.get();
                }
                return (j$.util.Optional) objOf;
            case 1:
                ajcq ajcqVar = (ajcq) obj;
                if (ajcqVar != null) {
                    return ajcqVar;
                }
                nza nzaVar = (nza) this.a;
                return nzaVar.b.e(nzaVar.c);
            case 2:
                j$.util.Optional optional2 = (j$.util.Optional) obj;
                boolean zIsPresent2 = optional2.isPresent();
                java.lang.Object obj4 = this.a;
                if (zIsPresent2) {
                    orq orqVar = new orq(obj4, 6);
                    if (true == optional2.isPresent()) {
                        java.lang.Object obj5 = optional2.get();
                        defpackage.qay qayVar2 = (defpackage.qay) obj5;
                        defpackage.oti otiVar3 = (defpackage.oti) orqVar.a;
                        defpackage.oti.a.b().l("com/android/dialer/incall/activity/lockholder/CallScopeLockHolder", "releaseInCallUiLock", 112, "CallScopeLockHolder.java").I("releasing InCallUiLock  %s for %s", qayVar2, otiVar3.e);
                        qayVar2.a();
                        if (j$.util.Collection.-EL.stream(otiVar3.b.c.keySet()).anyMatch(new jty(otiVar3.d(), 17))) {
                            otiVar3.d.a(mcd.av);
                        } else {
                            otiVar3.d.b(mce.V);
                        }
                    }
                } else {
                    defpackage.oti otiVar4 = (defpackage.oti) obj4;
                    defpackage.oti.a.b().l("com/android/dialer/incall/activity/lockholder/CallScopeLockHolder", "releaseInCallUiLock", 117, "CallScopeLockHolder.java").y("no InCallUiLock present to release for %s", otiVar4.e);
                    otiVar4.d.b(mce.W);
                }
                return j$.util.Optional.empty();
            case 3:
                j$.util.Optional optional3 = (j$.util.Optional) obj;
                aimz aimzVar = defpackage.otj.a;
                aimzVar.b().l("com/android/dialer/incall/activity/lockholder/OnBindUiLockHolder", "releaseInCallUiLock", 73, "OnBindUiLockHolder.java").y("InCallUiLock exists: %b", java.lang.Boolean.valueOf(optional3.isPresent()));
                orq orqVar2 = new orq(this.a, 7);
                if (true == optional3.isPresent()) {
                    java.lang.Object obj6 = optional3.get();
                    java.lang.Object obj7 = orqVar2.a;
                    aimzVar.b().l("com/android/dialer/incall/activity/lockholder/OnBindUiLockHolder", "releaseInCallUiLock", 76, "OnBindUiLockHolder.java").v("releasing InCallUiLock");
                    ((defpackage.otj) obj7).c.o(rmx.jL);
                    ((defpackage.qay) obj6).a();
                }
                return j$.util.Optional.empty();
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                j$.util.Optional optional4 = (j$.util.Optional) obj;
                if (optional4.isPresent()) {
                    defpackage.otj.a.b().l("com/android/dialer/incall/activity/lockholder/OnBindUiLockHolder", "acquireInCallUiLock", 50, "OnBindUiLockHolder.java").v("OnBindUiLockHolder is already holding a lock");
                    return optional4;
                }
                java.lang.Object obj8 = this.a;
                defpackage.otj.a.b().l("com/android/dialer/incall/activity/lockholder/OnBindUiLockHolder", "acquireInCallUiLock", 53, "OnBindUiLockHolder.java").v("acquiring InCallUiLock");
                return j$.util.Optional.of(((defpackage.otj) obj8).b.a("on bind"));
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                defpackage.pxk pxkVar = (defpackage.pxk) obj;
                if (pxkVar == null) {
                    return pxkVar;
                }
                if (pxkVar.a.equals(this.a)) {
                    return null;
                }
                return pxkVar;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                ajcq ajcqVar2 = (ajcq) obj;
                if (ajcqVar2 != null) {
                    return ajcqVar2;
                }
                java.lang.Object obj9 = this.a;
                defpackage.pmx pmxVar = new defpackage.pmx(obj9, 12);
                defpackage.uss ussVar = (defpackage.uss) obj9;
                return ussVar.f.b(pmxVar, ((java.lang.Long) ussVar.a.a()).longValue(), java.util.concurrent.TimeUnit.SECONDS);
            default:
                j$.util.Optional optional5 = (j$.util.Optional) obj;
                if (optional5.isPresent()) {
                    return optional5;
                }
                java.lang.Object obj10 = this.a;
                defpackage.qtm qtmVar = (defpackage.qtm) obj10;
                defpackage.qtm.a.b().l("com/android/dialer/incall/video/view/SurfaceTextureTracker", "start", 93, "SurfaceTextureTracker.java").y("%s started", qtmVar.b);
                qtmVar.d.set(0);
                qtmVar.e.set(0);
                qtmVar.f.set(-5);
                return j$.util.Optional.of(defpackage.ahus.t(new defpackage.qsu(obj10, 2), 1L, 1L, java.util.concurrent.TimeUnit.SECONDS, qtmVar.c));
        }
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                break;
            default:
                break;
        }
        return j$.util.function.Function.-CC.$default$compose(this, function);
    }
}
