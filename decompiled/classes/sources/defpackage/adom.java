package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adom {
    public defpackage.aify a;
    public java.lang.String b;
    public java.lang.String c;
    public java.lang.String d;
    public boolean e;
    public java.lang.String f;
    public int g;
    public byte h;
    private defpackage.aihd i;
    private boolean j;

    public final defpackage.adon a() {
        if (this.h == 7 && this.a != null && this.b != null && this.i != null && this.c != null && this.d != null && this.f != null) {
            return new defpackage.adon(this.a, this.b, this.i, this.c, this.d, this.j, this.e, this.f, this.g);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.a == null) {
            sb.append(" preferredVoiceIds");
        }
        if (this.b == null) {
            sb.append(" preferredVoiceLocale");
        }
        if (this.i == null) {
            sb.append(" possibleAudioMessageTexts");
        }
        if (this.c == null) {
            sb.append(" generatedVoiceSubDir");
        }
        if (this.d == null) {
            sb.append(" generatedVoicePreviewSubDir");
        }
        if ((this.h & 1) == 0) {
            sb.append(" superpacksEnabled");
        }
        if ((this.h & 2) == 0) {
            sb.append(" wifiRequiredForSuperpacksDownload");
        }
        if (this.f == null) {
            sb.append(" superpackName");
        }
        if ((this.h & 4) == 0) {
            sb.append(" superpackVersion");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(defpackage.aihd aihdVar) {
        if (aihdVar == null) {
            throw new java.lang.NullPointerException("Null possibleAudioMessageTexts");
        }
        this.i = aihdVar;
    }

    public final void c(boolean z) {
        this.j = z;
        this.h = (byte) (this.h | 1);
    }
}
