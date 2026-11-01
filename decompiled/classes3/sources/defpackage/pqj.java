package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class pqj implements java.util.function.Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ pqj(zmq zmqVar, int i, int i2) {
        this.$cid = i2;
        this.b = zmqVar;
        this.a = 4;
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            ((defpackage.pzo) obj).c(((defpackage.pqm) this.b).b, this.a);
            return;
        }
        int i2 = 1;
        if (i == 1) {
            ((defpackage.pzo) obj).a(((defpackage.pqm) this.b).b, this.a);
            return;
        }
        if (i != 2) {
            if (i == 3) {
                ((defpackage.wtk) this.b).t.b(((defpackage.wlc) obj).c, this.a);
                return;
            }
            if (i == 4) {
                ((defpackage.pzo) obj).b(((zmq) this.b).b(), 4);
                return;
            }
            if (i == 5) {
                ((defpackage.pzo) obj).d(((zmq) this.b).b(), this.a);
                return;
            }
            akzx akzxVarP = ((alww) obj).p();
            akzxVarP.u();
            alww alwwVar = akzxVarP.b;
            alwwVar.b |= 1;
            alwwVar.e = this.a;
            ((aift) this.b).i(akzxVarP.p());
            return;
        }
        int i3 = this.a;
        defpackage.vub vubVar = (defpackage.vub) obj;
        if (i3 == 0) {
            throw null;
        }
        int i4 = i3 - 1;
        java.lang.Object obj2 = this.b;
        if (i4 == 0) {
            ((defpackage.vxq) obj2).W.k(vubVar.f, vubVar.g);
            return;
        }
        if (i4 != 1) {
            if (i4 != 2) {
                ((defpackage.vxq) obj2).W.m(vubVar.f, vubVar.g);
                return;
            } else {
                ((defpackage.vxq) obj2).W.l(vubVar.f, vubVar.g);
                return;
            }
        }
        defpackage.vxq vxqVar = (defpackage.vxq) obj2;
        int i5 = 0;
        if (((defpackage.vub) vxqVar.E.orElseThrow()).g.equals("vvm_type_vvm3") && !((defpackage.vub) vxqVar.E.orElseThrow()).h) {
            defpackage.vxq.a.b().l("com/android/dialer/voicemail/tab/impl/ui/VisualVoicemailFragmentPeer", "showDeclineTosDialog", 1877, "VisualVoicemailFragmentPeer.java").v("PIN_NOT_SET, showing set PIN dialog");
            defpackage.afsn afsnVar = new defpackage.afsn(vxqVar.d.G(), 0);
            afsnVar.r(2132020711);
            ahpz ahpzVar = vxqVar.j;
            afsnVar.w(2132020712, new defpackage.ahpt(ahpzVar, 1037, "Clicked positive button in set PIN before decline dialog for voicemail", new defpackage.vxe(vxqVar, i2)));
            afsnVar.t(android.R.string.cancel, new defpackage.ahpt(ahpzVar, 1038, "Clicked negative button in set PIN before decline dialog for voicemail", new defpackage.rjt(3)));
            afsnVar.p(true);
            afsnVar.a();
            return;
        }
        defpackage.vxq.a.b().l("com/android/dialer/voicemail/tab/impl/ui/VisualVoicemailFragmentPeer", "showDeclineTosDialog", 1881, "VisualVoicemailFragmentPeer.java").v("showing decline ToS dialog");
        defpackage.afsn afsnVar2 = new defpackage.afsn(vxqVar.d.G(), 0);
        afsnVar2.x(2132020550);
        afsnVar2.r(true != ((defpackage.vub) vxqVar.E.orElseThrow()).g.equals("vvm_type_vvm3") ? 2132018304 : 2132020709);
        ahpz ahpzVar2 = vxqVar.j;
        afsnVar2.w(2132018303, new defpackage.ahpt(ahpzVar2, 1035, "Clicked positive button in decline ToS dialog for voicemail", new defpackage.vxe(vxqVar, i5)));
        afsnVar2.t(android.R.string.cancel, new defpackage.ahpt(ahpzVar2, 1036, "Clicked negative button in decline ToS dialog for voicemail", new defpackage.rjt(5)));
        afsnVar2.p(true);
        afsnVar2.a();
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        int i = this.$cid;
        if (i == 0) {
            return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
        }
        if (i == 1) {
            return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
        }
        if (i == 2) {
            return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
        }
        if (i == 3) {
            return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
        }
        if (i != 4) {
            return i != 5 ? j$.util.function.Consumer.-CC.$default$andThen(this, consumer) : j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
        }
        return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
    }

    public /* synthetic */ pqj(java.lang.Object obj, int i, int i2) {
        this.$cid = i2;
        this.b = obj;
        this.a = i;
    }
}
