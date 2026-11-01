package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ojz {
    public static final aimz a = aimz.i("com/android/dialer/externals/androidapis/media/impl/RingtoneProviderMixinImpl");
    public final android.content.Context b;

    public ojz(android.content.Context context) {
        this.b = context;
    }

    public final android.media.Ringtone a(android.net.Uri uri) {
        return android.media.RingtoneManager.getRingtone(this.b, uri);
    }
}
