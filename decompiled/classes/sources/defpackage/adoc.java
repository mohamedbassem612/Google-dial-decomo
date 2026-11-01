package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adoc {
    public j$.util.Optional a;
    public java.lang.String b;
    public int c;
    public java.lang.String d;
    public byte e;
    public int f;
    private defpackage.ajcu g;
    private defpackage.adom h;
    private defpackage.adon i;
    private boolean j;
    private int k;

    public adoc(byte[] bArr) {
        this.a = j$.util.Optional.empty();
    }

    public final defpackage.adod a() {
        defpackage.ajcu ajcuVar;
        java.lang.String str;
        java.lang.String str2;
        defpackage.adom adomVar = this.h;
        if (adomVar != null) {
            this.i = adomVar.a();
        } else if (this.i == null) {
            this.i = defpackage.adon.a().a();
        }
        if (this.e == 15 && (ajcuVar = this.g) != null && this.f != 0 && (str = this.b) != null && (str2 = this.d) != null) {
            return new defpackage.adod(ajcuVar, this.a, str, this.c, str2, this.i, this.j, this.k);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.g == null) {
            sb.append(" scheduledExecutorService");
        }
        if (this.f == 0) {
            sb.append(" speechRecognizerType");
        }
        if (this.b == null) {
            sb.append(" superpackName");
        }
        if ((this.e & 1) == 0) {
            sb.append(" superpackVersion");
        }
        if (this.d == null) {
            sb.append(" modelConfigFileName");
        }
        if ((this.e & 2) == 0) {
            sb.append(" shouldRecordAudioData");
        }
        if ((this.e & 4) == 0) {
            sb.append(" shouldOverrideMuteQualcommCheck");
        }
        if ((this.e & 8) == 0) {
            sb.append(" requestedPlaybackProgressEventsRate");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final defpackage.adom b() {
        defpackage.adom adomVar = this.h;
        if (adomVar != null) {
            return adomVar;
        }
        defpackage.adom adomVarA = defpackage.adon.a();
        this.h = adomVarA;
        return adomVarA;
    }

    public final void c(int i) {
        this.k = i;
        this.e = (byte) (this.e | 8);
    }

    public final void d(defpackage.ajcu ajcuVar) {
        if (ajcuVar == null) {
            throw new java.lang.NullPointerException("Null scheduledExecutorService");
        }
        this.g = ajcuVar;
    }

    public final void e(boolean z) {
        this.j = z;
        this.e = (byte) (this.e | 2);
    }

    public adoc() {
        throw null;
    }
}
