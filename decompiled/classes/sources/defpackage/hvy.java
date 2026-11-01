package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class hvy {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/assistedemergencydialing/impl/tts/VoiceAssistAudioGeneratorImpl");
    public final defpackage.huy b;
    public final defpackage.aoss c;
    public final android.content.Context d;
    public final defpackage.zof e;
    public volatile boolean f;
    public android.speech.tts.TextToSpeech g;
    public final defpackage.apdp h;
    public final defpackage.gpd i;
    private final defpackage.aolr j;
    private final defpackage.apdp k;

    public hvy(defpackage.huy huyVar, defpackage.gpd gpdVar, defpackage.aolr aolrVar, defpackage.aoss aossVar, android.content.Context context) {
        defpackage.aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        defpackage.aooh.f(aolrVar, "backgroundContext");
        defpackage.aooh.f(aossVar, "lightweightScope");
        defpackage.aooh.f(context, "appContext");
        this.b = huyVar;
        this.i = gpdVar;
        this.j = aolrVar;
        this.c = aossVar;
        this.d = context;
        this.e = new nzx(this, 1);
        this.k = new defpackage.apdp();
        this.h = new defpackage.apdp();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(java.lang.CharSequence charSequence, defpackage.aoln aolnVar) throws java.lang.Throwable {
        hvt hvtVar;
        java.lang.CharSequence charSequence2;
        defpackage.apdp apdpVar;
        java.lang.Throwable th;
        defpackage.apdp apdpVar2;
        if (aolnVar instanceof hvt) {
            hvtVar = (hvt) aolnVar;
            int i = hvtVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                hvtVar.d = i - Integer.MIN_VALUE;
            } else {
                hvtVar = new hvt(this, aolnVar);
            }
        } else {
            hvtVar = new hvt(this, aolnVar);
        }
        java.lang.Object objAj = hvtVar.b;
        java.lang.Object obj = defpackage.aolu.a;
        int i2 = hvtVar.d;
        try {
            if (i2 == 0) {
                defpackage.aooc.af(objAj);
                defpackage.apdp apdpVar3 = this.k;
                hvtVar.a = charSequence;
                hvtVar.e = apdpVar3;
                hvtVar.d = 1;
                if (apdpVar3.b(hvtVar) != obj) {
                    charSequence2 = charSequence;
                    apdpVar = apdpVar3;
                }
                return obj;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                apdpVar2 = (defpackage.apdp) hvtVar.a;
                try {
                    defpackage.aooc.af(objAj);
                    obj = (java.io.File) objAj;
                    apdpVar2.d();
                    return obj;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    apdpVar2.d();
                    throw th;
                }
            }
            apdpVar = hvtVar.e;
            java.lang.CharSequence charSequence3 = (java.lang.CharSequence) hvtVar.a;
            defpackage.aooc.af(objAj);
            charSequence2 = charSequence3;
            defpackage.aolr aolrVar = this.j;
            defpackage.huk hukVar = new defpackage.huk(this, charSequence2, (defpackage.aoln) null, 3, (byte[]) null);
            hvtVar.a = apdpVar;
            hvtVar.e = null;
            hvtVar.d = 2;
            objAj = defpackage.aoov.aj(aolrVar, hukVar, hvtVar);
            if (objAj != obj) {
                apdpVar2 = apdpVar;
                obj = (java.io.File) objAj;
                apdpVar2.d();
            }
            return obj;
        } catch (java.lang.Throwable th3) {
            defpackage.apdp apdpVar4 = apdpVar;
            th = th3;
            apdpVar2 = apdpVar4;
            apdpVar2.d();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        if (r11.b(r2) != r4) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10, types: [apdp] */
    /* JADX WARN: Type inference failed for: r10v12, types: [apdp] */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [apdp] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v3, types: [apdp] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.aoln r11) throws java.lang.Throwable {
        /*
            r10 = this;
            java.lang.String r0 = "initialize$<anonymous>"
            java.lang.String r1 = "com/android/dialer/assistedemergencydialing/impl/tts/VoiceAssistAudioGeneratorImpl"
            boolean r2 = r11 instanceof hvv
            java.lang.String r3 = "VoiceAssistAudioGeneratorImpl.kt"
            if (r2 == 0) goto L19
            r2 = r11
            hvv r2 = (hvv) r2
            int r4 = r2.c
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r2.c = r4
            goto L1e
        L19:
            hvv r2 = new hvv
            r2.<init>(r10, r11)
        L1e:
            java.lang.Object r11 = r2.a
            aolu r4 = defpackage.aolu.a
            int r5 = r2.c
            r6 = 2
            r7 = 1
            if (r5 == 0) goto L41
            if (r5 == r7) goto L3a
            if (r5 != r6) goto L32
            apdp r10 = r2.d
            defpackage.aooc.af(r11)     // Catch: java.lang.Throwable -> L9d
            goto L95
        L32:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3a:
            apdp r5 = r2.d
            defpackage.aooc.af(r11)
            r11 = r5
            goto L50
        L41:
            defpackage.aooc.af(r11)
            apdp r11 = r10.k
            r2.d = r11
            r2.c = r7
            java.lang.Object r5 = r11.b(r2)
            if (r5 == r4) goto La7
        L50:
            aimz r5 = defpackage.hvy.a     // Catch: java.lang.Throwable -> L9f
            ainm r7 = r5.b()     // Catch: java.lang.Throwable -> L9f
            r8 = 63
            ainm r7 = r7.l(r1, r0, r8, r3)     // Catch: java.lang.Throwable -> L9f
            aimw r7 = (defpackage.aimw) r7     // Catch: java.lang.Throwable -> L9f
            java.lang.String r8 = "enter"
            r7.v(r8)     // Catch: java.lang.Throwable -> L9f
            boolean r7 = r10.f     // Catch: java.lang.Throwable -> L9f
            if (r7 == 0) goto L7e
            ainm r10 = r5.b()     // Catch: java.lang.Throwable -> L9f
            r2 = 65
            ainm r10 = r10.l(r1, r0, r2, r3)     // Catch: java.lang.Throwable -> L9f
            aimw r10 = (defpackage.aimw) r10     // Catch: java.lang.Throwable -> L9f
            java.lang.String r0 = "Already initialized. Returning."
            r10.v(r0)     // Catch: java.lang.Throwable -> L9f
            aojh r4 = defpackage.aojh.a     // Catch: java.lang.Throwable -> L9f
            r11.d()
            goto La7
        L7e:
            aolr r0 = r10.j     // Catch: java.lang.Throwable -> L9f
            hnt r1 = new hnt     // Catch: java.lang.Throwable -> L9f
            r3 = 9
            r5 = 0
            r1.<init>(r10, r5, r3, r5)     // Catch: java.lang.Throwable -> L9f
            r2.d = r11     // Catch: java.lang.Throwable -> L9f
            r2.c = r6     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r10 = defpackage.aoov.aj(r0, r1, r2)     // Catch: java.lang.Throwable -> L9f
            if (r10 == r4) goto La7
            r9 = r11
            r11 = r10
            r10 = r9
        L95:
            aojh r11 = (defpackage.aojh) r11     // Catch: java.lang.Throwable -> L9d
            r10.d()
            aojh r4 = defpackage.aojh.a
            goto La7
        L9d:
            r11 = move-exception
            goto La3
        L9f:
            r10 = move-exception
            r9 = r11
            r11 = r10
            r10 = r9
        La3:
            r10.d()
            throw r11
        La7:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hvy.b(aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(defpackage.aoln aolnVar) {
        hvx hvxVar;
        defpackage.apdp apdpVar;
        if (aolnVar instanceof hvx) {
            hvxVar = (hvx) aolnVar;
            int i = hvxVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hvxVar.c = i - Integer.MIN_VALUE;
            } else {
                hvxVar = new hvx(this, aolnVar);
            }
        } else {
            hvxVar = new hvx(this, aolnVar);
        }
        java.lang.Object obj = hvxVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = hvxVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.apdp apdpVar2 = this.k;
            hvxVar.d = apdpVar2;
            hvxVar.c = 1;
            if (apdpVar2.b(hvxVar) == aoluVar) {
                return aoluVar;
            }
            apdpVar = apdpVar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdpVar = hvxVar.d;
            defpackage.aooc.af(obj);
        }
        try {
            android.speech.tts.TextToSpeech textToSpeech = this.g;
            if (textToSpeech != null) {
                textToSpeech.shutdown();
            }
            this.f = false;
            return defpackage.aojh.a;
        } finally {
            apdpVar.d();
        }
    }
}
