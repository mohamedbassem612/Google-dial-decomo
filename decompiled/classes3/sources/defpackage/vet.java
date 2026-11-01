package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vet implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public vet(defpackage.xsx xsxVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(xsxVar);
        this.a = xsxVar;
    }

    /* JADX INFO: Infinite loop detected, blocks: 8, insns: 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, wvs] */
    /* JADX WARN: Type inference failed for: r6v45, types: [java.lang.Object, ydm] */
    /* JADX WARN: Type inference failed for: r6v46, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r6v47, types: [java.lang.Object, ylj] */
    /* JADX WARN: Type inference failed for: r6v49, types: [java.lang.Object, ylj] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$cid) {
            case 0:
                ((vew) this.a).b();
                return;
            case 1:
                defpackage.uzs.b((androidx.preference.Preference) this.a);
                return;
            case 2:
                j$.util.Optional optional = ((vew) this.a).e;
                if (true == optional.isPresent()) {
                    throw new java.lang.IllegalStateException(java.lang.String.format("existing sms listener: %d", java.lang.Integer.valueOf(java.lang.System.identityHashCode(optional.get()))));
                }
                return;
            case 3:
                java.lang.Object obj = this.a;
                vix vixVar = (vix) obj;
                if (vixVar.i != null) {
                    try {
                        ((android.net.ConnectivityManager) ((vix) obj).b.getSystemService(android.net.ConnectivityManager.class)).unregisterNetworkCallback(((vix) obj).i);
                        break;
                    } catch (java.lang.IllegalArgumentException unused) {
                        vix.a.b().l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/network/impl/VvmNetworkRequestImpl", "releaseNetworkCallback", 339, "VvmNetworkRequestImpl.java").v("NetworkCallback was not registered; not releasing callback");
                    }
                    vixVar.i = null;
                    return;
                }
                return;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                defpackage.vkt vktVar = (defpackage.vkt) this.a;
                vktVar.b = j$.util.Optional.empty();
                vktVar.c = j$.util.Optional.empty();
                return;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                defpackage.vqn vqnVar = (defpackage.vqn) this.a;
                vqnVar.f(false);
                vqnVar.o.f();
                vqnVar.e(0);
                vqnVar.k.f(false);
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                ((defpackage.vxq) this.a).l(mce.dT);
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                defpackage.vxq vxqVar = (defpackage.vxq) this.a;
                aenj aenjVar = vxqVar.y() ? defpackage.rua.c : rtz.c;
                ruc rucVar = vxqVar.l;
                defpackage.vwz vwzVar = vxqVar.d;
                rucVar.h(aenjVar, vwzVar);
                rucVar.f(vxqVar.y() ? ruc.w : ruc.v);
                if (vwzVar.aH()) {
                    return;
                }
                vxqVar.l(mce.s);
                return;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                ((defpackage.vxq) this.a).k(mcd.ap);
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                ((defpackage.vxq) this.a).l(mce.t);
                return;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                android.view.animation.Interpolator interpolator = defpackage.vxt.a;
                ((android.widget.FrameLayout) this.a).setTranslationY(0.0f);
                return;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                defpackage.wdk wdkVar = (defpackage.wdk) this.a;
                wdkVar.b.removeViewImmediate(wdkVar.f);
                wdkVar.f = null;
                return;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                defpackage.wit witVar = (defpackage.wit) this.a;
                witVar.d = j$.util.Optional.empty();
                witVar.c.clear();
                return;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                defpackage.wwb.a.b().l("com/android/incallui/atlas/detection/techniques/asr/AsrModelResultThrottledEmitFn", "flushThrottledResults", 104, "AsrModelResultThrottledEmitFn.java").v("flush throttled results");
                defpackage.wwb wwbVar = (defpackage.wwb) this.a;
                j$.util.Optional optional2 = wwbVar.d;
                defpackage.wvs wvsVar = wwbVar.b;
                j$.util.Objects.requireNonNull(wvsVar);
                defpackage.wlm wlmVar = new defpackage.wlm(wvsVar, 20);
                if (true == optional2.isPresent()) {
                    wlmVar.a.a(optional2.get());
                }
                wwbVar.d = j$.util.Optional.empty();
                return;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                ((defpackage.xan) this.a).c(true);
                return;
            case 15:
                ?? r6 = this.a;
                ((defpackage.xsx) r6).c.a(r6);
                return;
            case 16:
                android.os.Process.setThreadPriority(10);
                this.a.run();
                return;
            case 17:
                break;
            case 18:
                java.lang.String str = defpackage.ymr.a;
                ?? r7 = this.a;
                if (r7 != 0) {
                    try {
                        r7.a();
                        return;
                    } catch (android.os.RemoteException e) {
                        android.util.Log.w(defpackage.ymr.a, "Failed to cancel preparation of inference engine", e);
                        return;
                    }
                }
                return;
            case 19:
                java.lang.String str2 = defpackage.ymr.a;
                ?? r8 = this.a;
                if (r8 != 0) {
                    try {
                        r8.a();
                        return;
                    } catch (android.os.RemoteException e2) {
                        android.util.Log.w(defpackage.ymr.a, "Failed to cancel inference", e2);
                        return;
                    }
                }
                return;
            default:
                android.util.Log.i(defpackage.yna.a, "Cleaning up due to autoUnbind.");
                ((defpackage.yna) this.a).l();
                return;
        }
        while (true) {
            java.lang.Object obj2 = this.a;
            boolean z = ((defpackage.xvx) obj2).c;
            try {
                ((defpackage.xvx) obj2).c((defpackage.xvw) ((defpackage.xvx) obj2).b.remove());
                defpackage.xvv xvvVar = ((defpackage.xvx) obj2).d;
            } catch (java.lang.InterruptedException unused2) {
                java.lang.Thread.currentThread().interrupt();
            }
        }
    }

    public /* synthetic */ vet(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public vet(defpackage.xyl xylVar, java.lang.Runnable runnable, int i) {
        this.$cid = i;
        this.a = runnable;
        j$.util.Objects.requireNonNull(xylVar);
    }

    public vet(defpackage.xvx xvxVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(xvxVar);
        this.a = xvxVar;
    }
}
