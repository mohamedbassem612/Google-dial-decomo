package androidx.media;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class AudioAttributesCompatParcelizer {
    public static androidx.media.AudioAttributesCompat read(defpackage.gmg gmgVar) {
        androidx.media.AudioAttributesCompat audioAttributesCompat = new androidx.media.AudioAttributesCompat();
        audioAttributesCompat.a = (androidx.media.AudioAttributesImpl) gmgVar.t(audioAttributesCompat.a);
        return audioAttributesCompat;
    }

    public static void write(androidx.media.AudioAttributesCompat audioAttributesCompat, defpackage.gmg gmgVar) {
        gmgVar.u(audioAttributesCompat.a);
    }
}
