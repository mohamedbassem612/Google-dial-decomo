package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adon {
    private static final defpackage.aify j = defpackage.aify.q("en-US-Wavenet-F", "en-us-en-US-Wavenet-D");
    public final defpackage.aify a;
    public final java.lang.String b;
    public final defpackage.aihd c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final boolean f;
    public final boolean g;
    public final java.lang.String h;
    public final int i;

    public adon(defpackage.aify aifyVar, java.lang.String str, defpackage.aihd aihdVar, java.lang.String str2, java.lang.String str3, boolean z, boolean z2, java.lang.String str4, int i) {
        this.a = aifyVar;
        this.b = str;
        this.c = aihdVar;
        this.d = str2;
        this.e = str3;
        this.f = z;
        this.g = z2;
        this.h = str4;
        this.i = i;
    }

    public static defpackage.adom a() {
        defpackage.adom adomVar = new defpackage.adom();
        adomVar.a = defpackage.aify.n(j);
        adomVar.b = "en-US";
        adomVar.b(defpackage.aikn.a);
        adomVar.d = "incall_preview_audio_files";
        adomVar.c = "incall_audio_files";
        adomVar.c(false);
        adomVar.e = true;
        byte b = adomVar.h;
        adomVar.f = "call_screen_audio_messages";
        adomVar.g = 10;
        adomVar.h = (byte) (b | 6);
        return adomVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.adon) {
            defpackage.adon adonVar = (defpackage.adon) obj;
            if (defpackage.ahvr.aP(this.a, adonVar.a) && this.b.equals(adonVar.b) && this.c.equals(adonVar.c) && this.d.equals(adonVar.d) && this.e.equals(adonVar.e) && this.f == adonVar.f && this.g == adonVar.g && this.h.equals(adonVar.h) && this.i == adonVar.i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true == this.g ? 1231 : 1237)) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i;
    }

    public final java.lang.String toString() {
        defpackage.aihd aihdVar = this.c;
        return "TtsConfig{preferredVoiceIds=" + java.lang.String.valueOf(this.a) + ", preferredVoiceLocale=" + this.b + ", possibleAudioMessageTexts=" + java.lang.String.valueOf(aihdVar) + ", generatedVoiceSubDir=" + this.d + ", generatedVoicePreviewSubDir=" + this.e + ", superpacksEnabled=" + this.f + ", wifiRequiredForSuperpacksDownload=" + this.g + ", superpackName=" + this.h + ", superpackVersion=" + this.i + '}';
    }

    public adon() {
        throw null;
    }
}
