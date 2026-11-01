package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class iet implements ajas {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ iet(iez iezVar, android.media.AudioDeviceInfo audioDeviceInfo, boolean z, int i) {
        this.$cid = i;
        this.b = iezVar;
        this.c = audioDeviceInfo;
        this.a = z;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00f2  */
    /* JADX WARN: Type inference failed for: r14v35, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ajcq a() {
        j$.util.Optional optionalEmpty;
        int i = this.$cid;
        if (i == 0) {
            boolean z = this.a;
            java.lang.Object obj = this.c;
            iez iezVar = (iez) this.b;
            return aosv.F(iezVar.c, 0, new defpackage.hyg(iezVar, (android.media.AudioDeviceInfo) obj, z, (aoln) null, 2), 3);
        }
        if (i == 1) {
            defpackage.iax iaxVar = (defpackage.iax) this.c;
            boolean z2 = iaxVar.k;
            boolean z3 = this.a;
            java.lang.Object obj2 = this.b;
            if (z2) {
                aimw aimwVarL = defpackage.iax.a.d().l("com/android/dialer/audio/impl/callaudiomanager/CallAudioImpl", "playInternal", 111, "CallAudioImpl.java");
                java.lang.String str = iaxVar.j;
                aimwVarL.I("rejecting playback of %s on invalidated call %s", obj2, str);
                defpackage.ibl iblVarD = ((defpackage.hgw) iaxVar.f.a()).d(aiql.z(defpackage.hxe.b), str, z3);
                iblVarD.c = 0;
                return aiql.z(iblVarD);
            }
            if (z3 || !((defpackage.hzc) iaxVar.b.get()).c) {
                defpackage.ibk ibkVar = (defpackage.ibk) iaxVar.e.a();
                return ibkVar.l.e(ahqx.b(new qwf(ibkVar, iaxVar.j, obj2, z3, 1)), ibkVar.d);
            }
            aimw aimwVarL2 = defpackage.iax.a.d().i(zct.b).l("com/android/dialer/audio/impl/callaudiomanager/CallAudioImpl", "playInternal", 127, "CallAudioImpl.java");
            java.lang.String str2 = iaxVar.j;
            aimwVarL2.I("rejecting playback of %s on muted call %s", obj2, str2);
            defpackage.ibl iblVarD2 = ((defpackage.hgw) iaxVar.f.a()).d(aiql.z(defpackage.hxe.d), str2, false);
            iblVarD2.c = 0;
            return aiql.z(iblVarD2);
        }
        if (i == 2) {
            int iOrdinal = ((defpackage.nmo) this.c).ordinal();
            if ((iOrdinal == 5 || iOrdinal == 11) && !this.a) {
                j$.util.Optional optionalE = ((tkl) this.b).e();
                aooh.e(optionalE, "getIsInCallUiShowing(...)");
                if (((java.lang.Boolean) aooh.p(optionalE, java.lang.Boolean.FALSE)).booleanValue()) {
                    optionalEmpty = j$.util.Optional.of(new syh(1));
                } else {
                    optionalEmpty = j$.util.Optional.empty();
                }
            } else {
                optionalEmpty = j$.util.Optional.empty();
            }
            return aiql.z(optionalEmpty);
        }
        java.lang.Object obj3 = this.c;
        if (i == 3) {
            rah rahVar = (rah) obj3;
            return ahvr.H(aosv.C(ahvr.ag(rahVar.b, rahVar.f, new pbw(rahVar, (aoln) null, 15, (char[]) null))), new defpackage.kxa(this.a, 3), (java.util.concurrent.Executor) this.b);
        }
        tzv tzvVar = (tzv) obj3;
        if (tzvVar.g()) {
            tzvVar.d.a(mcd.af);
            tzv.a.b().l("com/android/dialer/sonic/impl/service/SonicAudioPlayer", "playAudioForLocalOrRemote", 136, "SonicAudioPlayer.java").y("cannot play audio in state %s", tzvVar.h);
            return ajcm.a;
        }
        boolean z4 = this.a;
        java.lang.Object obj4 = this.b;
        ahrv ahrvVarG = ahrv.g(tzvVar.f.a((uab) obj4, 1));
        tct tctVar = new tct(obj3, 13);
        ajct ajctVar = tzvVar.b;
        ajcq ajcqVarI = ahrvVarG.i(tctVar, ajctVar);
        afpl afplVar = tzvVar.k;
        j$.util.Optional optionalOf = j$.util.Optional.of(obj4);
        ajcq ajcqVarI2 = ahvr.I(ahvr.H(afplVar.X(), new tbp(19), ajctVar), new qgk(5), ajctVar);
        return ahvr.ak(new ajcq[]{ajcqVarI, ajcqVarI2}).o(new piv(tzvVar, ajcqVarI2, ajcqVarI, z4, optionalOf, 2), ajctVar);
    }

    public /* synthetic */ iet(java.lang.Object obj, java.lang.Object obj2, boolean z, int i) {
        this.$cid = i;
        this.c = obj;
        this.b = obj2;
        this.a = z;
    }

    public /* synthetic */ iet(java.lang.Object obj, boolean z, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.c = obj;
        this.a = z;
        this.b = obj2;
    }
}
