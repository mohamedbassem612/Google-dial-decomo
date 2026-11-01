package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vfa implements ahjr {
    public static final aimz a = aimz.i("com/android/dialer/voicemail/service/impl/sms/receiver/AdnMessageReceiver");
    public final android.content.Context b;
    public final ajct c;
    public final ajct d;
    public final vew e;
    public final vdq f;
    public final rlv g;
    public final zjs h;
    public final okj i;
    public final zjv j;
    public final zjm k;

    public vfa(android.content.Context context, ajct ajctVar, ajct ajctVar2, zjm zjmVar, vew vewVar, vdq vdqVar, rlv rlvVar, zjs zjsVar, okj okjVar, zjv zjvVar) {
        this.b = context;
        this.c = ajctVar;
        this.d = ajctVar2;
        this.k = zjmVar;
        this.e = vewVar;
        this.f = vdqVar;
        this.g = rlvVar;
        this.h = zjsVar;
        this.i = okjVar;
        this.j = zjvVar;
    }

    public final ajcq a(android.content.Intent intent, int i) {
        a.b().l("com/android/dialer/voicemail/service/impl/sms/receiver/AdnMessageReceiver", "onReceive", 82, "AdnMessageReceiver.java").v("enter");
        this.g.o(rmx.gi);
        this.j.b(getClass(), intent, aify.p("android.telephony.extra.SUBSCRIPTION_INDEX"));
        ajcq ajcqVarF = ahvr.F(new defpackage.vez(this, intent, 0), this.c);
        defpackage.vec vecVar = new defpackage.vec(this, intent, 6);
        ajct ajctVar = this.d;
        return ahvr.B(ahvr.I(ajcqVarF, vecVar, ajctVar), java.lang.IllegalArgumentException.class, new defpackage.veb(this, 7), ajctVar);
    }
}
