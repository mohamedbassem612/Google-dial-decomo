package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class ibj implements java.util.function.Consumer {
    public final /* synthetic */ defpackage.ibk a;
    public final /* synthetic */ defpackage.hxe b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ ibj(defpackage.ibk ibkVar, defpackage.hxe hxeVar, boolean z, boolean z2) {
        this.a = ibkVar;
        this.b = hxeVar;
        this.c = z;
        this.d = z2;
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        defpackage.hxe hxeVar = this.b;
        ((dsd) obj).b(hxeVar);
        if (this.c) {
            defpackage.ibk.a.b().l("com/android/dialer/audio/impl/callaudioplayer/CallAudioPlayer", "endCurrentPlayback", 193, "CallAudioPlayer.java").y("completer set to %s where it shouldn't be", hxeVar);
        }
        if (this.d && hxeVar.equals(defpackage.hxe.b)) {
            this.a.g.o(rmx.wc);
        }
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
    }
}
