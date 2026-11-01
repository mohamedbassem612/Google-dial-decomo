package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class uxi extends aomh implements aonn {
    java.lang.Object a;
    long b;
    int c;
    final /* synthetic */ defpackage.uxk d;
    final /* synthetic */ android.speech.tts.TextToSpeech e;
    final /* synthetic */ java.lang.CharSequence f;
    final /* synthetic */ defpackage.uwu g;
    final /* synthetic */ akzx h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uxi(akzx akzxVar, defpackage.uxk uxkVar, android.speech.tts.TextToSpeech textToSpeech, java.lang.CharSequence charSequence, defpackage.uwu uwuVar, aoln aolnVar) {
        super(2, aolnVar);
        this.h = akzxVar;
        this.d = uxkVar;
        this.e = textToSpeech;
        this.f = charSequence;
        this.g = uwuVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aovk */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v6, types: [int] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v14 */
    public final java.lang.Object b(java.lang.Object obj) throws aovk {
        java.lang.String str;
        ?? r7;
        ?? r6;
        long j;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.Object obj2 = aolu.a;
        ?? r5 = "com/android/dialer/tts/internal/synthesis/TtsFileProvider";
        ?? r8 = "TtsFileProvider.kt";
        try {
            if (this.c == 0) {
                aooc.af(obj);
                akzx akzxVar = this.h;
                long j2 = akzxVar.b.f + 1;
                akzxVar.u();
                amsa amsaVar = akzxVar.b;
                amsaVar.c |= 2;
                amsaVar.f = j2;
                defpackage.uxk uxkVar = this.d;
                java.lang.String str4 = "ttsFileProvider_" + j$.time.Instant.now().toEpochMilli() + ".wav";
                java.io.File file = new java.io.File(uxkVar.c.getFilesDir(), "tts");
                defpackage.uxk.a.b().l("com/android/dialer/tts/internal/synthesis/TtsFileProvider", "getTtsAudioFile$<anonymous>", 68, "TtsFileProvider.kt").y("making file with name: %s", str4);
                java.io.File file2 = new java.io.File(file, str4);
                java.io.File parentFile = file2.getParentFile();
                if (parentFile == null) {
                    throw new java.lang.IllegalStateException("Parent file is null");
                }
                if (!parentFile.exists() && !parentFile.mkdirs()) {
                    throw new java.lang.IllegalStateException("Check failed.");
                }
                long epochMilli = j$.time.Instant.now().toEpochMilli();
                long j3 = defpackage.uxk.b;
                str = "getTtsAudioFile$<anonymous>";
                j = epochMilli;
                str2 = "com/android/dialer/tts/internal/synthesis/TtsFileProvider";
                str3 = "TtsFileProvider.kt";
                try {
                    defpackage.abve abveVar = new defpackage.abve(uxkVar, this.e, this.f, this.g, file2, akzxVar, (aoln) null, 1);
                    this.a = file2;
                    this.b = j;
                    this.c = 1;
                    if (aooh.L(j3, abveVar, this) != obj2) {
                        obj2 = file2;
                    }
                    return obj2;
                } catch (aovk e) {
                    e = e;
                    r6 = str2;
                    r7 = str3;
                    defpackage.uxk.a.b().l((java.lang.String) r6, str, 80, (java.lang.String) r7).v("TTS Timeout while synthesizing");
                    throw e;
                }
            }
            long j4 = this.b;
            java.lang.Object obj3 = this.a;
            aooc.af(obj);
            str = "getTtsAudioFile$<anonymous>";
            j = j4;
            str2 = "com/android/dialer/tts/internal/synthesis/TtsFileProvider";
            str3 = "TtsFileProvider.kt";
            obj2 = obj3;
            r5 = (java.io.File) obj2;
            r8 = (r5.length() > 0L ? 1 : (r5.length() == 0L ? 0 : -1));
            if (r8 == 0) {
                r5.delete();
                defpackage.uxk.a.b().l(str2, "checkFileSizeNonZero", 170, str3).v("Empty File error");
                throw new java.lang.IllegalStateException("generated 0 size audio file");
            }
            java.lang.CharSequence charSequence = this.f;
            akzx akzxVarM = defpackage.amrz.a.m();
            aooh.f(akzxVarM, "builder");
            long epochMilli2 = j$.time.Instant.now().toEpochMilli() - j;
            akzxVarM.u();
            defpackage.amrz amrzVar = (defpackage.amrz) akzxVarM.b;
            amrzVar.b |= 1;
            amrzVar.c = epochMilli2;
            long length = charSequence.length();
            akzxVarM.u();
            defpackage.amrz amrzVar2 = (defpackage.amrz) akzxVarM.b;
            amrzVar2.b |= 2;
            amrzVar2.d = length;
            alad aladVarP = akzxVarM.p();
            aooh.e(aladVarP, "build(...)");
            defpackage.amrz amrzVar3 = (defpackage.amrz) aladVarP;
            defpackage.uxk.a.b().l(str2, str, 90, str3).x("tts file synthesis completed in %s ms", amrzVar3.c);
            akzx akzxVar2 = this.h;
            akzxVar2.u();
            amsa amsaVar2 = akzxVar2.b;
            alal alalVar = amsa.a;
            j$.util.Objects.requireNonNull(amrzVar3);
            alat alatVar = amsaVar2.h;
            if (!alatVar.c()) {
                amsaVar2.h = alad.J(alatVar);
            }
            amsaVar2.h.add(amrzVar3);
            return obj2;
        } catch (aovk e2) {
            e = e2;
            str = "getTtsAudioFile$<anonymous>";
            r7 = r8;
            r6 = r5;
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.uxi(this.h, this.d, this.e, this.f, this.g, aolnVar);
    }
}
