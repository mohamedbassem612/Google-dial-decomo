package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vka {
    public static final aimz a = aimz.i("com/android/dialer/voicemail/service/impl/vvmclients/omtp/protocol/standardomtp/StandardOmtpMailboxInitializer");
    public final android.content.Context b;
    public final vgu c;
    public final rlv d;
    public final ajcu e;
    public final vgj f;
    public final zjm g;
    public final rsr h;
    private final aoin i;

    public vka(android.content.Context context, zjm zjmVar, rsr rsrVar, vgj vgjVar, vgu vguVar, rlv rlvVar, ajcu ajcuVar, aoin aoinVar) {
        this.b = context;
        this.g = zjmVar;
        this.h = rsrVar;
        this.f = vgjVar;
        this.c = vguVar;
        this.d = rlvVar;
        this.e = ajcuVar;
        this.i = aoinVar;
    }

    public final ajcq a(android.telecom.PhoneAccountHandle phoneAccountHandle, defpackage.vgm vgmVar) {
        int i = 5;
        defpackage.vfm vfmVar = new defpackage.vfm(this, vgmVar, i);
        ajcu ajcuVar = this.e;
        return ahvr.Q(vfmVar, ajcuVar).i(new defpackage.vfv(this, phoneAccountHandle, 15), ajcuVar).i(new defpackage.vfv(this, phoneAccountHandle, 16), ajcuVar).j(((java.lang.Long) this.i.a()).longValue(), java.util.concurrent.TimeUnit.MILLISECONDS, ajcuVar).e(java.util.concurrent.TimeoutException.class, new defpackage.vju(i), ajcuVar);
    }
}
