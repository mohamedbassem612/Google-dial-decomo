package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class sqi {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/phonelookup/composite/CompositePhoneLookup");
    public static final defpackage.aenj b = new defpackage.aenj("CompositePhoneLookup.lookup");
    public static final defpackage.aenj c = new defpackage.aenj("CompositePhoneLookup.getMostRecentInfo");
    public final android.content.Context d;
    public final defpackage.ajct e;
    public final defpackage.ruc f;
    public final defpackage.aoin g;
    public final defpackage.zzx h;
    public final defpackage.kaw i;

    public sqi(android.content.Context context, defpackage.kaw kawVar, defpackage.zzx zzxVar, defpackage.ajct ajctVar, defpackage.ruc rucVar, defpackage.aoin aoinVar) {
        this.d = context;
        this.i = kawVar;
        this.h = zzxVar;
        this.e = ajctVar;
        this.f = rucVar;
        this.g = aoinVar;
    }

    public final defpackage.ajcq a(defpackage.ajcq ajcqVar) {
        return defpackage.ahvr.H(ajcqVar, new rht(6), this.e);
    }

    public final defpackage.ajcq b(android.telecom.Call.Details details, defpackage.ajcq ajcqVar) {
        return !aa$.ExternalSyntheticApiModelOutline1.m((android.os.UserManager) this.d.getSystemService(android.os.UserManager.class)) ? defpackage.aiql.z(spn.a) : a(this.i.o(this.h.e(), new juo(this, details, ajcqVar, 20)));
    }

    public final void c(defpackage.ajcq ajcqVar, defpackage.aenj aenjVar) {
        defpackage.sqh sqhVar = new defpackage.sqh(this, aenjVar, 0);
        long j = defpackage.ahqx.a;
        ajcqVar.c(new defpackage.ajcc(ajcqVar, new defpackage.sqh(defpackage.ahns.c(false), sqhVar, 2)), this.e);
    }
}
