package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class viu {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/network/impl/VvmNetworkCallbackImpl");
    public final defpackage.aoin b;
    public final defpackage.zjv c;

    public viu(defpackage.zjv zjvVar, defpackage.aoin aoinVar) {
        this.c = zjvVar;
        this.b = aoinVar;
    }

    public static void a(android.net.Network network, defpackage.dsd dsdVar) {
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/network/impl/VvmNetworkCallbackImpl", "onComplete", 128, "VvmNetworkCallbackImpl.java")).v("onComplete");
        dsdVar.b(network);
    }

    public static void b(java.lang.String str, defpackage.dsd dsdVar) {
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/network/impl/VvmNetworkCallbackImpl", "onFailed", 133, "VvmNetworkCallbackImpl.java")).y("onFailed: %s", str);
        dsdVar.d(new vis(str));
    }
}
