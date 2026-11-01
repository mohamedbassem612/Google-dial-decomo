package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class vgg {
    public static final defpackage.vcr a;
    public static final defpackage.aenj b;
    public static final defpackage.aimz c;
    public final android.content.Context d;
    public final defpackage.ajct e;
    public final defpackage.ajct f;
    public final defpackage.vgu g;
    public final defpackage.vdo h;
    public final defpackage.rlv i;
    public final defpackage.ruc j;
    public final defpackage.oko k;
    public final defpackage.aoin l;
    public final defpackage.aoin m;
    public final defpackage.aoin n;
    public final defpackage.vze o;
    public final defpackage.zjm p;
    public final defpackage.rsr q;
    private final defpackage.ajct r;
    private final defpackage.aoin s;

    static {
        defpackage.akzx akzxVarM = defpackage.vcr.a.m();
        defpackage.vcq vcqVar = defpackage.vcq.a;
        akzxVarM.u();
        defpackage.vcr vcrVar = (defpackage.vcr) akzxVarM.b;
        j$.util.Objects.requireNonNull(vcqVar);
        vcrVar.c = vcqVar;
        vcrVar.b = 1;
        a = (defpackage.vcr) akzxVarM.r();
        b = new defpackage.aenj("OMTP_VVM_SERVICE_SYNC_MEMORY_SNAPSHOT");
        c = defpackage.aimz.i("com/android/dialer/voicemail/service/impl/vvmclients/omtp/OmtpVvmSyncService");
    }

    public vgg(android.content.Context context, defpackage.ajct ajctVar, defpackage.ajct ajctVar2, defpackage.ajct ajctVar3, defpackage.vgu vguVar, defpackage.vdo vdoVar, defpackage.zjm zjmVar, defpackage.rlv rlvVar, defpackage.ruc rucVar, defpackage.rsr rsrVar, defpackage.vze vzeVar, defpackage.oko okoVar, defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3, defpackage.aoin aoinVar4) {
        this.d = context;
        this.e = ajctVar;
        this.r = ajctVar2;
        this.f = ajctVar3;
        this.g = vguVar;
        this.h = vdoVar;
        this.p = zjmVar;
        this.i = rlvVar;
        this.j = rucVar;
        this.q = rsrVar;
        this.o = vzeVar;
        this.k = okoVar;
        this.l = aoinVar;
        this.m = aoinVar2;
        this.s = aoinVar3;
        this.n = aoinVar4;
    }

    public final vgx a(vcn vcnVar, android.telecom.PhoneAccountHandle phoneAccountHandle) {
        ((defpackage.aimw) ((defpackage.aimw) c.b()).l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/OmtpVvmSyncService", "vvmMessageToServerVoicemail", 517, "OmtpVvmSyncService.java")).y("vvmMessageToServerVoicemail called with UID: %s", vcnVar.c);
        vgw vgwVar = new vgw();
        vgwVar.g(vcnVar.c);
        defpackage.alcf alcfVar = vcnVar.d;
        if (alcfVar == null) {
            alcfVar = defpackage.alcf.a;
        }
        vgwVar.b(j$.time.Duration.ofSeconds(alcfVar.b).toMillis());
        defpackage.akzm akzmVar = vcnVar.f;
        if (akzmVar == null) {
            akzmVar = defpackage.akzm.a;
        }
        vgwVar.c(akzmVar.b);
        vgwVar.d(vcnVar.e);
        vgwVar.h(this.d.getPackageName());
        vgwVar.f(phoneAccountHandle);
        vgwVar.e(false);
        return vgwVar.a();
    }

    public final defpackage.ajcq b(defpackage.aify aifyVar) {
        return this.h.c(aifyVar);
    }

    public final defpackage.ajcq c(vgs vgsVar, android.telecom.PhoneAccountHandle phoneAccountHandle, defpackage.aify aifyVar) {
        if (aifyVar.isEmpty()) {
            return defpackage.ajcm.a;
        }
        defpackage.ajcq ajcqVarF = defpackage.ahvr.F(new vez(this, phoneAccountHandle, 6), this.r);
        defpackage.ajcq ajcqVarE = e(phoneAccountHandle);
        defpackage.ahda ahdaVarAf = defpackage.ahvr.af(ajcqVarF, ajcqVarE);
        defpackage.vto vtoVar = new defpackage.vto(ajcqVarF, ajcqVarE, phoneAccountHandle, 1, (byte[]) null);
        defpackage.ajct ajctVar = this.e;
        return defpackage.ahvr.I(ahdaVarAf.f(vtoVar, ajctVar).h(new vft(6), ajctVar), new jsc(this, aifyVar, vgsVar, phoneAccountHandle, 11), ajctVar);
    }

    public final defpackage.ajcq d(vgs vgsVar, android.telecom.PhoneAccountHandle phoneAccountHandle, defpackage.aify aifyVar) {
        defpackage.ahrv ahrvVarG = defpackage.ahrv.g(e(phoneAccountHandle));
        vge vgeVar = new vge(phoneAccountHandle, 1);
        defpackage.ajct ajctVar = this.e;
        return ahrvVarG.i(vgeVar, ajctVar).i(new ved(this, aifyVar, vgsVar, 8), ajctVar);
    }

    public final defpackage.ajcq e(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return defpackage.ahvr.H(this.p.l(phoneAccountHandle), new vft(11), this.e);
    }

    public final defpackage.ajcq f(vgx vgxVar) {
        vdk vdkVar = new vdk();
        vdkVar.d(vgxVar.f);
        vdkVar.f(vgxVar.a);
        vdkVar.e(vgxVar.e);
        vdkVar.c(vgxVar.d);
        vdkVar.b(vgxVar.c);
        vdkVar.g(vgxVar.b);
        vdkVar.h(vgxVar.g);
        j$.util.Optional optional = vgxVar.h;
        if (optional == null) {
            throw new java.lang.NullPointerException("Null transcription");
        }
        defpackage.vdo vdoVar = this.h;
        vdkVar.a = optional;
        return defpackage.ahvr.H(vdoVar.d(vdkVar.a()), new vfp(this, vgxVar, 3, (byte[]) null), this.e);
    }

    public final defpackage.ajcq g(vgs vgsVar, android.telecom.PhoneAccountHandle phoneAccountHandle, vdg vdgVar) {
        java.lang.String string = ((java.lang.Boolean) this.n.a()).booleanValue() ? vdgVar.c : java.lang.Long.toString(vdgVar.b);
        if (((java.lang.Boolean) this.s.a()).booleanValue()) {
            ((defpackage.aimw) ((defpackage.aimw) c.b()).l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/OmtpVvmSyncService", "updateAudio", 765, "OmtpVvmSyncService.java")).y("Fetching voicemail payload via IMAP for ID: %s", string);
        }
        defpackage.ahrv ahrvVarG = defpackage.ahrv.g(vgsVar.f(new vez(vgsVar, string, 17, (byte[]) null)).h());
        vft vftVar = new vft(9);
        defpackage.ajct ajctVar = this.e;
        return ahrvVarG.e(vgv.class, vftVar, ajctVar).i(new ved(this, phoneAccountHandle, vdgVar, 14, (byte[]) null), ajctVar);
    }

    public final defpackage.ajcq h(vgs vgsVar, android.telecom.PhoneAccountHandle phoneAccountHandle) {
        java.lang.String strN = vgsVar.n(16);
        defpackage.aazc aazcVar = vgsVar.k;
        return defpackage.ahrv.g(vgsVar.f(new vgq(vgsVar, strN, android.os.SystemClock.elapsedRealtime(), 0)).h()).i(new ved(this, vgsVar, phoneAccountHandle, 9), this.e);
    }

    public final defpackage.ajcq i(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        this.i.n(defpackage.rmw.VVM_SYNC_STARTED);
        defpackage.ahru ahruVarA = this.g.a(phoneAccountHandle);
        vgf vgfVar = new vgf(this, phoneAccountHandle, 0);
        defpackage.ajct ajctVar = this.e;
        return ahruVarA.d(vgfVar, ajctVar).c(new vdh(this, 5), ajctVar).a(vcx.class, new defpackage.kwb(14), ajctVar).e();
    }

    public final defpackage.ajcq j(android.telecom.PhoneAccountHandle phoneAccountHandle, vcn vcnVar) {
        if (vcnVar.c.isEmpty()) {
            return i(phoneAccountHandle);
        }
        this.i.n(defpackage.rmw.VVM_SYNC_STARTED);
        defpackage.ahru ahruVarA = this.g.a(phoneAccountHandle);
        vgc vgcVar = new vgc(this, phoneAccountHandle, vcnVar, 1);
        defpackage.ajct ajctVar = this.e;
        return ahruVarA.d(vgcVar, ajctVar).c(new vdh(this, 4), ajctVar).a(vcx.class, new defpackage.kwb(13), ajctVar).e();
    }
}
