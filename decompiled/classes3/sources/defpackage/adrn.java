package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adrn {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;
    public final java.lang.String f;
    public final int g;
    public final boolean h;
    public final j$.util.Optional i;
    public final long j;
    public final aify k;
    public final j$.util.Optional l;
    public final j$.util.Optional m;

    public adrn(int i, int i2, int i3, int i4, java.lang.String str, int i5, boolean z, j$.util.Optional optional, long j, aify aifyVar, j$.util.Optional optional2, j$.util.Optional optional3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = 0.0f;
        this.f = str;
        this.g = i5;
        this.h = z;
        this.i = optional;
        this.j = j;
        this.k = aifyVar;
        this.l = optional2;
        this.m = optional3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.adrn) {
            defpackage.adrn adrnVar = (defpackage.adrn) obj;
            if (this.a == adrnVar.a && this.b == adrnVar.b && this.c == adrnVar.c && this.d == adrnVar.d) {
                float f = adrnVar.e;
                if (this.f.equals(adrnVar.f) && this.g == adrnVar.g && this.h == adrnVar.h && this.i.equals(adrnVar.i) && this.j == adrnVar.j && ahvr.aP(this.k, adrnVar.k) && this.l.equals(adrnVar.l) && this.m.equals(adrnVar.m)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((((((((((((((this.a ^ (-721379959)) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 583896283) ^ this.f.hashCode()) * 1000003) ^ this.g) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ this.i.hashCode()) * 1000003;
        long j = this.j;
        return ((((((iHashCode ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode();
    }

    public final java.lang.String toString() {
        j$.util.Optional optional = this.m;
        j$.util.Optional optional2 = this.l;
        aify aifyVar = this.k;
        return "SpeechRecognitionConfig{audioEncoding=0, sampleSizeBits=" + this.a + ", sampleRateHz=" + this.b + ", requestDurationMs=" + this.c + ", maxBestResultsNumber=" + this.d + ", minConfidence=0.0, minStability=0.0, langCode=" + this.f + ", recordedAudioBufferSize=" + this.g + ", shouldRecordAudioData=" + this.h + ", shouldPropegateAudioLevelEvents=false, shouldSaveResultDebugInformation=false, pausableAudioInputStreamFactory=" + java.lang.String.valueOf(this.i) + ", forceFinalResultTimeoutInSeconds=" + this.j + ", audioEffects=" + java.lang.String.valueOf(aifyVar) + ", downlinkAudioRecordFactory=" + java.lang.String.valueOf(optional2) + ", asrModel=" + java.lang.String.valueOf(optional) + '}';
    }

    public adrn() {
        throw null;
    }
}
