package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xri implements ahjr {
    public static final aimz a = aimz.i("com/android/voicemail/impl/PackageReplacedReceiver");
    public final android.content.Context b;
    private final ajct c;
    private final zrw d;
    private final zjs e;
    private final jna f;
    private final zjm g;
    private final ahbv h;
    private final zzx i;
    private final aogc j;

    public xri(android.content.Context context, ajct ajctVar, ahbv ahbvVar, zzx zzxVar, zjm zjmVar, jna jnaVar, aogc aogcVar, zrw zrwVar, zjs zjsVar) {
        this.b = context;
        this.c = ajctVar;
        this.h = ahbvVar;
        this.i = zzxVar;
        this.g = zjmVar;
        this.f = jnaVar;
        this.j = aogcVar;
        this.d = zrwVar;
        this.e = zjsVar;
    }

    public final ajcq a(android.content.Intent intent, int i) {
        aimz aimzVar = a;
        ainm ainmVarB = aimzVar.b();
        ainp ainpVar = zct.a;
        a.bI(ainmVarB, "package replaced, starting activation", "com/android/voicemail/impl/PackageReplacedReceiver", "onReceive", 'g', "PackageReplacedReceiver.java", ainpVar);
        if (this.i.m()) {
            aimzVar.b().l("com/android/voicemail/impl/PackageReplacedReceiver", "onReceive", 106, "PackageReplacedReceiver.java").v("In direct boot, ignoring");
            return ajcm.a;
        }
        ahbv ahbvVar = this.h;
        j$.util.Optional.empty();
        if (!ahbvVar.k()) {
            hgb.j(aimzVar.c(), "module disabled", "com/android/voicemail/impl/PackageReplacedReceiver", "onReceive", 'o', "PackageReplacedReceiver.java", ainpVar, zct.b);
            return ajcm.a;
        }
        java.util.Iterator it = this.e.s().iterator();
        if (it.hasNext()) {
            android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) it.next();
            zjm zjmVar = this.g;
            if (zjmVar.g().isPresent() && ((vda) zjmVar.g().get()).c(phoneAccountHandle).isPresent()) {
                agsm.d("com/android/voicemail/impl/PackageReplacedReceiver", "onReceive", 123, ((vee) ((defpackage.abtr) ((vda) zjmVar.g().get()).c(phoneAccountHandle).get()).d).g(phoneAccountHandle), zct.b, "failed to schedule activation form PackageReplacedReceiver", new java.lang.Object[0]);
            }
            aimzVar.b().l("com/android/voicemail/impl/PackageReplacedReceiver", "onReceive", 134, "PackageReplacedReceiver.java").v("Legacy VVM service fallback disabled");
            return ajcm.a;
        }
        jna jnaVar = this.f;
        zrw zrwVar = this.d;
        ajcq ajcqVarH = ahvr.H(aosv.F(zrwVar.d, 0, new defpackage.zqs(zrwVar, (aoln) null, 5, (byte[]) null), 3), new defpackage.xbh(this, 20), this.c);
        aogc aogcVar = this.j;
        akzx akzxVarM = jmz.a.m();
        akzxVarM.u();
        jmz jmzVar = akzxVarM.b;
        jmzVar.b |= 1;
        jmzVar.c = true;
        akzxVarM.u();
        jmz jmzVar2 = akzxVarM.b;
        jmzVar2.d = 6;
        jmzVar2.b |= 2;
        return jnaVar.c(ajcqVarH, aogcVar, akzxVarM.p());
    }
}
