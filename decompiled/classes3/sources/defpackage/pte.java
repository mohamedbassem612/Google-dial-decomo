package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class pte implements defpackage.znc {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ pte(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.znc
    public final void a() {
        j$.util.Optional optionalOf;
        int i = this.$cid;
        if (i == 0) {
            defpackage.ptf ptfVar = (defpackage.ptf) this.a;
            android.telecom.Call.Details details = ptfVar.a.getDetails();
            if (details != null) {
                boolean zHasProperty = android.os.Build.VERSION.SDK_INT >= 37 ? details.hasProperty(65536) : false;
                if (ptfVar.c.getAndSet(zHasProperty) || !zHasProperty) {
                    return;
                }
                java.util.concurrent.atomic.AtomicBoolean atomicBoolean = ptfVar.b;
                if (atomicBoolean.get()) {
                    atomicBoolean.set(false);
                    ptfVar.e.a(ajcm.a);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 1) {
            ((ibs) this.a).b();
            return;
        }
        int i2 = 8;
        if (i != 2) {
            java.lang.Object obj = this.a;
            if (i != 3) {
                ((defpackage.zqj) obj).a();
                return;
            }
            defpackage.pxg pxgVar = (defpackage.pxg) obj;
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(pxgVar.d.getDetails().getVideoState());
            java.lang.Integer num = (java.lang.Integer) pxgVar.f.getAndSet(numValueOf);
            if (numValueOf.equals(num)) {
                return;
            }
            defpackage.pxg.a.b().l("com/android/dialer/incall/core/video/impl/VideoStateMonitor", "onDetailsChanged", 61, "VideoStateMonitor.java").I("video state changed %s -> %s", num, numValueOf);
            j$.lang.Iterable.-EL.forEach(pxgVar.g.e(), new defpackage.oxs(obj, i2));
            return;
        }
        java.lang.Object obj2 = this.a;
        defpackage.pvj pvjVar = (defpackage.pvj) obj2;
        android.telecom.Call call = pvjVar.c;
        int i3 = 7;
        int i4 = 4;
        if (android.telecom.VideoProfile.isVideo(call.getDetails().getVideoState())) {
            optionalOf = j$.util.Optional.empty();
        } else {
            android.os.Bundle extras = call.getDetails().getExtras();
            if (extras == null) {
                a.bI(defpackage.pvj.a.d(), "call extras is null", "com/android/dialer/incall/core/video/impl/SessionModificationCause$Cause", "fromTelecomCall", 'h', "SessionModificationCause.java", zct.b);
                optionalOf = j$.util.Optional.empty();
            } else {
                int i5 = extras.getInt("SessionModificationCause", 0);
                if (i5 != 4) {
                    optionalOf = (i5 == 7 || i5 == 8) ? j$.util.Optional.of(defpackage.pvi.b) : j$.util.Optional.empty();
                } else {
                    optionalOf = j$.util.Optional.of(defpackage.pvi.a);
                }
            }
        }
        if (pvjVar.f.equals(optionalOf)) {
            return;
        }
        defpackage.pvj.a.b().l("com/android/dialer/incall/core/video/impl/SessionModificationCause", "onDetailsChanged", 141, "SessionModificationCause.java").y("session modification cause changed to %s", optionalOf);
        pvjVar.f = optionalOf;
        j$.util.Optional optional = pvjVar.f;
        defpackage.puo puoVar = new defpackage.puo(obj2, i4);
        if (true == optional.isPresent()) {
            java.lang.Object obj3 = optional.get();
            java.lang.Object obj4 = puoVar.a;
            agsm.i(534, ahvr.E(new defpackage.pmw(obj4, obj3, i3), ((defpackage.pvj) obj4).d), "unable to make toast", new java.lang.Object[0]);
        }
    }
}
