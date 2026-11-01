package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class oow implements qia {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ oow(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r11v3, types: [aonj, java.lang.Object] */
    public final void a() {
        switch (this.$cid) {
            case 0:
                java.lang.Object obj = this.a;
                defpackage.oox ooxVar = (defpackage.oox) obj;
                ooxVar.c.n(rmw.kI);
                agsm.i(413, ooxVar.d.b(), "Failed to answer gaming mode call.", new java.lang.Object[0]);
                j$.util.Optional optionalA = ooxVar.b.a();
                defpackage.orq orqVar = new defpackage.orq(new defpackage.opy(obj, 1), 1);
                if (true == optionalA.isPresent()) {
                    orqVar.a.a(optionalA.get());
                }
                break;
            case 1:
                defpackage.iwl.a.b().l("com/android/dialer/beesly/impl/notification/BeeslyNotificationController", "onRejectButtonClicked", 45, "BeeslyNotificationController.kt").v("user clicked beesly reject button from notification");
                defpackage.iwl iwlVar = (defpackage.iwl) this.a;
                iwlVar.l.i(aoov.an(iwlVar.f, (aolr) null, 0, new icp(iwlVar, (aoln) null, 11), 3));
                break;
            case 2:
                ((qjl) this.a).b(true);
                break;
            case 3:
                ((qjl) this.a).b(false);
                break;
            case 4:
                qpz.a.b().l("com/android/dialer/incall/video/notification/VideoNotificationController", "acceptVideoUpgradeRequest", 23, "VideoNotificationController.java").v("accept video upgrade request");
                agsm.i(641, ((qpz) this.a).b.b(), "failed to accept upgrade request", new java.lang.Object[0]);
                break;
            case 5:
                qpz.a.b().l("com/android/dialer/incall/video/notification/VideoNotificationController", "declineVideoUpgradeRequest", 29, "VideoNotificationController.java").v("decline video upgrade request");
                agsm.i(642, ((qpz) this.a).b.f(), "failed to reject upgrade request", new java.lang.Object[0]);
                break;
            case 6:
                vie vieVar = (vie) this.a;
                ((qbe) vieVar.a).a(qbc.fg);
                ((tcl) vieVar.f).a();
                agsm.i(851, ((defpackage.lev) vieVar.g).b(defpackage.lgj.d), "failed setting CallScreenUiType for REVELIO_TRANSCRIPT", new java.lang.Object[0]);
                java.lang.Object obj2 = vieVar.e;
                java.lang.Object obj3 = vieVar.c;
                otc otcVarAo = pez.ao();
                otcVarAo.e(false);
                otcVarAo.d(false);
                otcVarAo.b(false);
                android.content.Context context = (android.content.Context) obj2;
                ahqx.l(context, ((ipc) obj3).bk(otcVarAo.a()));
                break;
            case 7:
                java.lang.Object obj4 = this.a;
                vie vieVar2 = (vie) obj4;
                ((qbe) vieVar2.a).a(qbc.fi);
                agsm.i(850, ((szs) vieVar2.d).g(), "Failed to reject revelio call", new java.lang.Object[0]);
                break;
            case 8:
                java.lang.Object obj5 = this.a;
                vie vieVar3 = (vie) obj5;
                ((qbe) vieVar3.a).a(qbc.fh);
                ((ovb) vieVar3.b).a();
                agsm.i(849, ((szs) vieVar3.d).a(), "Failed to accept revelio call", new java.lang.Object[0]);
                break;
            case 9:
                otd otdVar = new otd(false, false, false, false, false, (qit) null, (abvz) null, (java.lang.String) null, (java.lang.Long) null, 511);
                sgi sgiVar = (sgi) this.a;
                ahqx.l((android.content.Context) sgiVar.a, ((ipc) sgiVar.b).bk(otdVar));
                break;
            default:
                agsm.i(1177, ((xcq) this.a).d(), "AtlasSession failed to deactivate.", new java.lang.Object[0]);
                break;
        }
    }
}
