package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dev implements aonj {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;

    public dev(java.lang.Object obj, aosb aosbVar, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = aosbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v11, types: [aoln, aosb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v13, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v15, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [android.view.Choreographer$FrameCallback, java.lang.Object] */
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            ((android.view.Choreographer) ((ccx) this.a).b).removeFrameCallback(this.b);
            return aojh.a;
        }
        if (i == 1) {
            java.lang.Object obj2 = this.a;
            java.lang.Object obj3 = this.b;
            synchronized (((cce) obj3).a) {
                ((cce) obj3).b.remove(obj2);
            }
            return aojh.a;
        }
        if (i != 2) {
            if (i != 3) {
                return this.a.a(this.b.get(((java.lang.Number) obj).intValue()));
            }
            return this.a.a(this.b.get(((java.lang.Number) obj).intValue()));
        }
        aooh.f((defpackage.oii) obj, "it");
        defpackage.hyj.a.b().l("com/android/dialer/audio/audioinjector/audioplayer/LocalAudioPlayer$Companion", "playSuspending$<anonymous>$<anonymous>", 293, "LocalAudioPlayer.kt").v("onCompletion");
        defpackage.hgt.i((defpackage.oii) this.b);
        ?? r4 = this.a;
        if (!r4.i()) {
            r4.w(aojh.a);
        }
        return aojh.a;
    }

    public dev(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }
}
