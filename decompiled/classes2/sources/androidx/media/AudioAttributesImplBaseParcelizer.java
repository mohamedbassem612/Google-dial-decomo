package androidx.media;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class AudioAttributesImplBaseParcelizer {
    public static androidx.media.AudioAttributesImplBase read(defpackage.gmg gmgVar) {
        androidx.media.AudioAttributesImplBase audioAttributesImplBase = new androidx.media.AudioAttributesImplBase();
        audioAttributesImplBase.a = gmgVar.a(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.b = gmgVar.a(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = gmgVar.a(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = gmgVar.a(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(androidx.media.AudioAttributesImplBase audioAttributesImplBase, defpackage.gmg gmgVar) {
        gmgVar.h(audioAttributesImplBase.a, 1);
        gmgVar.h(audioAttributesImplBase.b, 2);
        gmgVar.h(audioAttributesImplBase.c, 3);
        gmgVar.h(audioAttributesImplBase.d, 4);
    }
}
