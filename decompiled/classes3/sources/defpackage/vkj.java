package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vkj {
    public static final aimz a = aimz.i("com/android/dialer/voicemail/service/impl/vvmclients/omtp/protocol/vvm3/AccountSubscriber");
    public final java.util.concurrent.Executor b;
    public final java.util.concurrent.ScheduledExecutorService c;
    public final zrw d;
    public final okj e;
    public final oko f;
    public final vgj g;
    public final vix h;
    public final hgw i;
    public final rsr j;
    private final ajct k;
    private final aoin l;
    private final aogc m;

    public vkj(java.util.concurrent.ScheduledExecutorService scheduledExecutorService, ajct ajctVar, vgj vgjVar, hgw hgwVar, rsr rsrVar, zrw zrwVar, vix vixVar, okj okjVar, oko okoVar, aogc aogcVar, aoin aoinVar) {
        this.b = new ajdc(ajctVar);
        this.c = scheduledExecutorService;
        this.k = ajctVar;
        this.g = vgjVar;
        this.i = hgwVar;
        this.j = rsrVar;
        this.d = zrwVar;
        this.h = vixVar;
        this.e = okjVar;
        this.f = okoVar;
        this.m = aogcVar;
        this.l = aoinVar;
    }

    public static java.lang.String e(java.lang.String str, java.lang.String str2) {
        java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("<" + str2 + ">(.*)<\\/" + str2 + '>').matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        throw new defpackage.vki(a.bk(str2, "Tag ", " not found in xml response"));
    }

    public static java.lang.String f(java.lang.String str) {
        if (str.startsWith("+1")) {
            str = str.substring(2);
        }
        return str.startsWith("1") ? str.substring(1) : str;
    }

    public final ajcq a(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return ahvr.I(this.j.x(phoneAccountHandle), new defpackage.vfv(this, phoneAccountHandle, 18), this.c);
    }

    public final ajcq b(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return ahvr.I(this.e.f(phoneAccountHandle), new defpackage.vge(this, 8), this.c);
    }

    public final ajcq c(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        int i = 19;
        if (android.os.Build.VERSION.SDK_INT < 33) {
            return ahvr.F(new defpackage.vez(this, phoneAccountHandle, i), this.k);
        }
        if (((java.lang.Boolean) this.l.a()).booleanValue()) {
            return b(phoneAccountHandle);
        }
        zrw zrwVar = this.d;
        ajcq ajcqVarF = aosv.F(zrwVar.d, 0, new defpackage.zqs(zrwVar, (aoln) null, 11, (byte[][]) null), 3);
        defpackage.vge vgeVar = new defpackage.vge(this, 9);
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = this.c;
        return ahvr.I(ahvr.I(ajcqVarF, vgeVar, scheduledExecutorService), new defpackage.vfv(this, phoneAccountHandle, i), scheduledExecutorService);
    }

    public final ajcq d(java.lang.String str, java.lang.String str2, j$.util.Optional optional, long j) {
        defpackage.ajzk ajzkVar = new defpackage.ajzk();
        ajzkVar.f(str);
        ajzkVar.d("POST");
        ajzkVar.c(j);
        defpackage.qgz qgzVar = new defpackage.qgz(ajzkVar, str2, 15);
        if (true == optional.isPresent()) {
            java.lang.Object obj = optional.get();
            java.lang.Object obj2 = qgzVar.b;
            defpackage.ajzk ajzkVar2 = (defpackage.ajzk) obj2;
            ajzkVar2.e((java.lang.String) qgzVar.a, java.nio.ByteBuffer.wrap(((java.lang.String) obj).getBytes()));
        }
        ahrv ahrvVarH = ahrv.g(this.m.aL(new defpackage.ajzm(ajzkVar))).h(new defpackage.vju(11), this.k);
        defpackage.vju vjuVar = new defpackage.vju(12);
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = this.c;
        return ahrvVarH.e(defpackage.ajzi.class, vjuVar, scheduledExecutorService).j(30L, java.util.concurrent.TimeUnit.SECONDS, scheduledExecutorService);
    }
}
