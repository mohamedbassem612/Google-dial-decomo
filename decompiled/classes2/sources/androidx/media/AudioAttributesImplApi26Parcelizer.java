package androidx.media;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static androidx.media.AudioAttributesImplApi26 read(defpackage.gmg gmgVar) {
        androidx.media.AudioAttributesImplApi26 audioAttributesImplApi26 = new androidx.media.AudioAttributesImplApi26();
        audioAttributesImplApi26.a = (android.media.AudioAttributes) gmgVar.b(audioAttributesImplApi26.a, 1);
        audioAttributesImplApi26.b = gmgVar.a(audioAttributesImplApi26.b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(androidx.media.AudioAttributesImplApi26 audioAttributesImplApi26, defpackage.gmg gmgVar) {
        gmgVar.i(audioAttributesImplApi26.a, 1);
        gmgVar.h(audioAttributesImplApi26.b, 2);
    }
}
