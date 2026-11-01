package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class pff implements defpackage.zpu {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/incall/bubble/dialerbubble/DialerBubbleController");
    public final defpackage.ahzi b;
    public final android.content.Context c;
    public final defpackage.ajct d;
    public final defpackage.rlv e;
    public j$.util.Optional f = j$.util.Optional.empty();
    public boolean g = false;
    public boolean h = false;
    int i = 0;
    public final defpackage.zof j = new nzx(this, 2);
    public final defpackage.zpy k;
    private final defpackage.zpm l;

    public pff(defpackage.zjm zjmVar, defpackage.zpm zpmVar, android.content.Context context, defpackage.zpy zpyVar, defpackage.rlv rlvVar, defpackage.ajct ajctVar) {
        this.l = zpmVar;
        this.c = context;
        this.e = rlvVar;
        this.k = zpyVar;
        this.d = ajctVar;
        this.b = defpackage.ahvr.bI(new defpackage.ahzm(zjmVar.g()));
    }

    @Override // defpackage.zpu
    public final void a() {
        defpackage.agsm.i(477, defpackage.ahvr.E(new lye(this, 18), this.d), "failed to execute onCallGraphUpdated", new java.lang.Object[0]);
    }

    public final j$.util.Optional b() {
        if (!this.f.isPresent() || !((pfh) this.f.orElseThrow()).a.isPresent()) {
            return j$.util.Optional.empty();
        }
        j$.util.Optional optionalE = this.l.e((java.lang.String) ((pfh) this.f.orElseThrow()).a.orElseThrow());
        return true == optionalE.isPresent() ? j$.util.Optional.ofNullable(((pfd) ((apqr) optionalE.get()).a(pfd.class)).ad()) : optionalE;
    }

    public final void c(wdf wdfVar) throws java.io.IOException {
        if (j$.util.Objects.equals(wdfVar, wdf.f)) {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/incall/bubble/dialerbubble/DialerBubbleController", "onPerformBubbleAction", 182, "DialerBubbleController.java")).v("bubble dismissed by the user, won't show up again for the rest of the phone call");
            j$.lang.Iterable.-EL.forEach(this.l.a(), new lct(5));
            return;
        }
        if (!((pfh) this.f.orElseThrow()).a.isPresent()) {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/incall/bubble/dialerbubble/DialerBubbleController", "onPerformBubbleAction", 198, "DialerBubbleController.java")).v("bubble action was performed with no callId");
            return;
        }
        j$.util.Optional optionalB = b();
        oys oysVar = new oys(wdfVar, 9);
        if (true == optionalB.isPresent()) {
            java.lang.Object obj = optionalB.get();
            java.lang.Object obj2 = oysVar.a;
            pgf pgfVar = (pgf) obj;
            ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/incall/bubble/dialerbubble/DialerBubbleController", "performAction", 207, "DialerBubbleController.java")).y("performing bubble action %s", obj2);
            int iOrdinal = ((wdf) obj2).ordinal();
            if (iOrdinal == 0) {
                pgfVar.c.n(defpackage.rmw.TIDEPODS_BUBBLE_RETURN_TO_CALL);
                defpackage.ruc rucVar = pgfVar.d;
                defpackage.aenj aenjVar = defpackage.ruc.O;
                rucVar.j(aenjVar);
                rucVar.k(aenjVar);
                defpackage.aenj aenjVar2 = defpackage.ruc.P;
                rucVar.j(aenjVar2);
                rucVar.k(aenjVar2);
                android.content.Context context = pgfVar.b;
                defpackage.ipc ipcVar = pgfVar.l;
                otc otcVarAo = defpackage.pez.ao();
                otcVarAo.e(false);
                otcVarAo.d(false);
                otcVarAo.b(false);
                defpackage.ahqx.l(context, ipcVar.bk(otcVarAo.a()));
                return;
            }
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    pgfVar.c.n(defpackage.rmw.TIDEPODS_BUBBLE_AUDIO_ROUTE_SELECTOR);
                    oyx oyxVar = pgfVar.k;
                    android.content.Intent intent = new android.content.Intent("android.intent.action.MAIN");
                    intent.setClassName((android.content.Context) oyxVar.a, "com.android.dialer.incall.audioroute.ui.TidepodsAudioRouteSelectorActivity");
                    intent.setFlags(402653184);
                    intent.putExtra("STARTED_FROM_BUBBLE", true);
                    defpackage.ahqx.l(pgfVar.b, intent);
                    return;
                }
                if (iOrdinal != 3) {
                    if (iOrdinal == 4) {
                        pgfVar.c.n(defpackage.rmw.TIDEPODS_BUBBLE_DISCONNECT);
                        defpackage.agsm.i(478, pgfVar.i.f(), "Failed to disconnect.", new java.lang.Object[0]);
                        return;
                    }
                    return;
                }
                if (pgfVar.e.g()) {
                    pgfVar.c.n(defpackage.rmw.TIDEPODS_BUBBLE_MUTE_OFF);
                    pgfVar.f.c(false, true);
                    return;
                } else {
                    pgfVar.c.n(defpackage.rmw.TIDEPODS_BUBBLE_MUTE_ON);
                    pgfVar.f.c(true, true);
                    return;
                }
            }
            defpackage.zmq zmqVar = pgfVar.f;
            j$.util.Optional optionalA = zmqVar.a();
            if (true == optionalA.isPresent()) {
                optionalA = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(((zmw) optionalA.get()).equals(zmw.b)));
            }
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            if (((java.lang.Boolean) optionalA.orElse(bool)).booleanValue()) {
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) pgf.a.d()).i(defpackage.zct.b)).l("com/android/dialer/incall/bubble/service/DialerBubbleActionController", "toggleSpeaker", 'v', "DialerBubbleActionController.java")).v("toggleSpeaker() called when bluetooth available. Probably should have shown audio route selector");
            }
            j$.util.Optional optionalA2 = zmqVar.a();
            if (true == optionalA2.isPresent()) {
                optionalA2 = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(((zmw) optionalA2.get()).equals(zmw.d)));
            }
            if (((java.lang.Boolean) optionalA2.orElse(bool)).booleanValue()) {
                pgfVar.c.n(defpackage.rmw.TIDEPODS_BUBBLE_SPEAKER_OFF);
                zmqVar.e(zmw.e);
            } else {
                pgfVar.c.n(defpackage.rmw.TIDEPODS_BUBBLE_SPEAKER_ON);
                zmqVar.e(zmw.d);
            }
        }
    }
}
