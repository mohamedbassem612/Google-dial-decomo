package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adrm {
    public int a;
    public int b;
    public int c;
    public java.lang.String d;
    public int e;
    public j$.util.Optional f;
    public long g;
    public aify h;
    public j$.util.Optional i;
    public short j;
    private int k;
    private boolean l;
    private j$.util.Optional m;

    public adrm(defpackage.adrn adrnVar) {
        this.f = j$.util.Optional.empty();
        this.m = j$.util.Optional.empty();
        this.i = j$.util.Optional.empty();
        this.a = adrnVar.a;
        this.k = adrnVar.b;
        this.b = adrnVar.c;
        this.c = adrnVar.d;
        this.d = adrnVar.f;
        this.e = adrnVar.g;
        this.l = adrnVar.h;
        this.f = adrnVar.i;
        this.g = adrnVar.j;
        this.h = adrnVar.k;
        this.m = adrnVar.l;
        this.i = adrnVar.m;
        this.j = (short) 4095;
    }

    public final defpackage.adrn a() {
        java.lang.String str;
        aify aifyVar;
        if (this.j == 4095 && (str = this.d) != null && (aifyVar = this.h) != null) {
            return new defpackage.adrn(this.a, this.k, this.b, this.c, str, this.e, this.l, this.f, this.g, aifyVar, this.m, this.i);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if ((this.j & 1) == 0) {
            sb.append(" audioEncoding");
        }
        if ((this.j & 2) == 0) {
            sb.append(" sampleSizeBits");
        }
        if ((this.j & 4) == 0) {
            sb.append(" sampleRateHz");
        }
        if ((this.j & 8) == 0) {
            sb.append(" requestDurationMs");
        }
        if ((this.j & 16) == 0) {
            sb.append(" maxBestResultsNumber");
        }
        if ((this.j & 32) == 0) {
            sb.append(" minConfidence");
        }
        if ((this.j & 64) == 0) {
            sb.append(" minStability");
        }
        if (this.d == null) {
            sb.append(" langCode");
        }
        if ((this.j & 128) == 0) {
            sb.append(" recordedAudioBufferSize");
        }
        if ((this.j & 256) == 0) {
            sb.append(" shouldRecordAudioData");
        }
        if ((this.j & 512) == 0) {
            sb.append(" shouldPropegateAudioLevelEvents");
        }
        if ((this.j & 1024) == 0) {
            sb.append(" shouldSaveResultDebugInformation");
        }
        if ((this.j & 2048) == 0) {
            sb.append(" forceFinalResultTimeoutInSeconds");
        }
        if (this.h == null) {
            sb.append(" audioEffects");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(defpackage.adpf adpfVar) {
        this.m = j$.util.Optional.of(adpfVar);
    }

    public final void c(int i) {
        this.k = i;
        this.j = (short) (this.j | 4);
    }

    public final void d(boolean z) {
        this.l = z;
        this.j = (short) (this.j | 256);
    }

    public adrm() {
        this.f = j$.util.Optional.empty();
        this.m = j$.util.Optional.empty();
        this.i = j$.util.Optional.empty();
    }
}
