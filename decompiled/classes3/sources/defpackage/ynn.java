package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ynn {
    public final aify a;
    public final float b;
    public final int c;
    public final float d;
    public final aify e;
    public final int f;
    public final int g;
    public final int h;
    public final boolean i;
    public final int j;
    public final defpackage.ymm k;
    public final defpackage.yno l;
    public final defpackage.yod m;

    public ynn(aify aifyVar, float f, int i, float f2, aify aifyVar2, int i2, int i3, int i4, boolean z, int i5, defpackage.ymm ymmVar, defpackage.yno ynoVar, defpackage.yod yodVar) {
        this.a = aifyVar;
        this.b = f;
        this.c = i;
        this.d = f2;
        this.e = aifyVar2;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = z;
        this.j = i5;
        this.k = ymmVar;
        this.l = ynoVar;
        this.m = yodVar;
    }

    public static defpackage.ynm a() {
        defpackage.ynm ynmVar = new defpackage.ynm();
        ynmVar.f(0.1f);
        ynmVar.g(3);
        ynmVar.c(aike.a);
        ynmVar.e(0);
        ynmVar.d(0);
        short s = ynmVar.h;
        ynmVar.c = true;
        ynmVar.b = 1;
        ynmVar.d = 123;
        ynmVar.e = defpackage.ymm.a;
        ynmVar.a = 1.0f;
        ynmVar.h = (short) (s | 8164);
        defpackage.yod yodVar = defpackage.yod.a;
        if (yodVar == null) {
            throw new java.lang.NullPointerException("Null tools");
        }
        ynmVar.g = yodVar;
        return ynmVar;
    }

    public final boolean equals(java.lang.Object obj) {
        defpackage.yno ynoVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ynn) {
            defpackage.ynn ynnVar = (defpackage.ynn) obj;
            if (ahvr.aP(this.a, ynnVar.a)) {
                if (java.lang.Float.floatToIntBits(this.b) == java.lang.Float.floatToIntBits(ynnVar.b) && this.c == ynnVar.c) {
                    if (java.lang.Float.floatToIntBits(this.d) == java.lang.Float.floatToIntBits(ynnVar.d) && ahvr.aP(this.e, ynnVar.e) && this.f == ynnVar.f && this.g == ynnVar.g && this.h == ynnVar.h && this.i == ynnVar.i && this.j == ynnVar.j && this.k.equals(ynnVar.k) && ((ynoVar = this.l) != null ? ynoVar.equals(ynnVar.l) : ynnVar.l == null) && this.m.equals(ynnVar.m)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ java.lang.Float.floatToIntBits(this.b)) * 1000003) ^ this.c) * 1000003) ^ java.lang.Float.floatToIntBits(this.d)) * 1000003) ^ this.e.hashCode();
        defpackage.yno ynoVar = this.l;
        return (((((((((((((((((iHashCode * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ this.h) * (-721379959)) ^ (true != this.i ? 1237 : 1231)) * 1071616587) ^ this.j) * 1000003) ^ 1001110) * 583896283) ^ (ynoVar == null ? 0 : ynoVar.hashCode())) * 1000003) ^ 1237) * (-721379959)) ^ this.m.hashCode();
    }

    public final java.lang.String toString() {
        defpackage.yod yodVar = this.m;
        defpackage.yno ynoVar = this.l;
        defpackage.ymm ymmVar = this.k;
        aify aifyVar = this.e;
        return "LlmRequest{messages=" + java.lang.String.valueOf(this.a) + ", temperature=" + this.b + ", topK=" + this.c + ", topP=" + this.d + ", stopTokensList=" + java.lang.String.valueOf(aifyVar) + ", targetReplyLengthMin=" + this.f + ", targetReplyLengthMax=" + this.g + ", numSamples=" + this.h + ", streamingCallback=null, shouldApplySafetyFilter=" + this.i + ", preferredImageWidth=0, preferredImageHeight=0, numSoftTokens=0, loraFile=null, drafterLoraFile=null, sessionStateFile=null, rngSeed=" + this.j + ", userProperties=" + java.lang.String.valueOf(ymmVar) + ", overrideRequestKind=0, llmPrefixParam=null, llmResponseSchema=" + java.lang.String.valueOf(ynoVar) + ", enableThinking=false, thinkingConfig=null, tools=" + java.lang.String.valueOf(yodVar) + '}';
    }

    public ynn() {
        throw null;
    }
}
