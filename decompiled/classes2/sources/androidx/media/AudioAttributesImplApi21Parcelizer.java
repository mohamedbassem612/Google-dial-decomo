package androidx.media;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static androidx.media.AudioAttributesImplApi21 read(defpackage.gmg gmgVar) {
        androidx.media.AudioAttributesImplApi21 audioAttributesImplApi21 = new androidx.media.AudioAttributesImplApi21();
        audioAttributesImplApi21.a = (android.media.AudioAttributes) gmgVar.b(audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.b = gmgVar.a(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(androidx.media.AudioAttributesImplApi21 audioAttributesImplApi21, defpackage.gmg gmgVar) {
        gmgVar.i(audioAttributesImplApi21.a, 1);
        gmgVar.h(audioAttributesImplApi21.b, 2);
    }
}
