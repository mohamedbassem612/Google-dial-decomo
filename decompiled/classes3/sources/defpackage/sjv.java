package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sjv extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    final /* synthetic */ int a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sjv(java.lang.String str, nsa nsaVar, int i, aoln aolnVar, int i2) {
        super(2, aolnVar);
        this.$cid = i2;
        this.b = str;
        this.c = nsaVar;
        this.a = i;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        if (this.$cid != 0) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        short[] sArr;
        if (this.$cid == 0) {
            aooc.af(obj);
            try {
                android.content.Context context = ((sjy) this.b).c;
                java.lang.Object obj2 = this.c;
                long length = defpackage.afax.b(context, (android.net.Uri) obj2, "r", pez.aw((android.net.Uri) obj2)).getLength();
                boolean z = length > ((long) this.a);
                java.lang.Object obj3 = this.b;
                akzx akzxVarM = ampk.a.m();
                aooh.f(akzxVarM, "builder");
                akzxVarM.u();
                ampk ampkVar = akzxVarM.b;
                ampkVar.b |= 2;
                ampkVar.d = length;
                akzxVarM.u();
                ampk ampkVar2 = akzxVarM.b;
                ampkVar2.b |= 1;
                ampkVar2.c = z;
                ampk ampkVarP = akzxVarM.p();
                aooh.e(ampkVarP, "build(...)");
                ((sjy) obj3).f.l(ampkVarP);
                return java.lang.Boolean.valueOf(z);
            } catch (java.lang.Exception e) {
                sjy.b.d().k(e).l("com/android/dialer/patrick/onboarding/imageprocessor/CallingCardImageProcessor", "isFileSizeTooLarge$<anonymous>", 102, "CallingCardImageProcessor.kt").v("Failed to get file size");
                return java.lang.Boolean.FALSE;
            }
        }
        aooc.af(obj);
        java.lang.Object obj4 = this.b;
        java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(new java.io.FileInputStream((java.lang.String) obj4));
        int i = this.a;
        java.lang.Object obj5 = this.c;
        try {
            idn idnVarD = hgu.d(new java.io.File((java.lang.String) obj4));
            idm idmVar = idnVarD.c;
            if (idmVar == null) {
                idmVar = idm.a;
            }
            if (idmVar.d != 1) {
                nsa.a.d().i(zct.b).l("com/android/dialer/dobby/impl/storage/DobbyWavAudioParser", "readAndResampleWavAudioFile$<anonymous>$<anonymous>", 34, "DobbyWavAudioParser.kt").v("2-channel WAV files are not supported");
                sArr = null;
            } else {
                idm idmVar2 = idnVarD.c;
                int i2 = (idmVar2 == null ? idm.a : idmVar2).c + 28;
                if (idmVar2 == null) {
                    idmVar2 = idm.a;
                }
                byte[] bArrD = ((nsa) obj5).b.a(akzc.F(bufferedInputStream).x(i2), idmVar2.e, i).D();
                sArr = new short[bArrD.length >> 1];
                java.nio.ByteBuffer.wrap(bArrD).order(java.nio.ByteOrder.LITTLE_ENDIAN).asShortBuffer().get(sArr);
            }
            ajsz.ak(bufferedInputStream, (java.lang.Throwable) null);
            return sArr;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                ajsz.ak(bufferedInputStream, th);
                throw th2;
            }
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        int i = this.$cid;
        java.lang.Object obj2 = this.b;
        if (i != 0) {
            return new defpackage.sjv((java.lang.String) obj2, (nsa) this.c, this.a, aolnVar, 1);
        }
        return new defpackage.sjv((sjy) obj2, (android.net.Uri) this.c, this.a, aolnVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sjv(sjy sjyVar, android.net.Uri uri, int i, aoln aolnVar, int i2) {
        super(2, aolnVar);
        this.$cid = i2;
        this.b = sjyVar;
        this.c = uri;
        this.a = i;
    }
}
