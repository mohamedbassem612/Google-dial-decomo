package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ojy extends aomh implements aonn {
    final /* synthetic */ android.content.Context a;
    final /* synthetic */ int b;
    final /* synthetic */ android.media.AudioAttributes c;
    final /* synthetic */ uss d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ojy(uss ussVar, android.content.Context context, int i, android.media.AudioAttributes audioAttributes, aoln aolnVar) {
        super(2, aolnVar);
        this.d = ussVar;
        this.a = context;
        this.b = i;
        this.c = audioAttributes;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        aooc.af(obj);
        mgv mgvVar = mgv.et;
        uss ussVar = this.d;
        zjv zjvVar = (zjv) ussVar.c;
        zjv.i(zjvVar, mgvVar, (java.util.List) null, (mhc) null, 0, 30);
        android.media.MediaPlayer mediaPlayerCreate = android.media.MediaPlayer.create(this.a, this.b, this.c, ((android.media.AudioManager) ussVar.f).generateAudioSessionId());
        aooh.e(mediaPlayerCreate, "create(...)");
        return new defpackage.oii(zjvVar, (mgu) ussVar.e, mediaPlayerCreate);
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.ojy(this.d, this.a, this.b, this.c, aolnVar);
    }
}
