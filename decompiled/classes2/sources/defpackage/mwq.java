package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mwq extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    java.lang.Object a;
    int b;
    final /* synthetic */ java.lang.Object c;
    final /* synthetic */ java.lang.Object d;
    final /* synthetic */ java.lang.Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mwq(defpackage.hys hysVar, defpackage.hxw hxwVar, android.speech.tts.TextToSpeech textToSpeech, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.e = hysVar;
        this.d = hxwVar;
        this.c = textToSpeech;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        if (i != 1) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX INFO: Thrown type has an unknown type hierarchy: aovk */
    /* JADX WARN: Code duplicated, block: B:100:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:104:0x020f  */
    /* JADX WARN: Code duplicated, block: B:107:0x0215  */
    /* JADX WARN: Code duplicated, block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0075 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0077  */
    /* JADX WARN: Code duplicated, block: B:25:0x007d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0082  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:87:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:92:0x01de  */
    /* JADX WARN: Code duplicated, block: B:95:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:98:0x01ed  */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x018d, code lost:
    
        if (r5 != 4) goto L111;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v69, types: [abxu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v8, types: [amzg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [hxw, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 561
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mwq.b(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [hxw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [amzg, java.lang.Object] */
    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.mwq mwqVar;
        int i = this.$cid;
        if (i == 0) {
            java.lang.Object obj2 = this.c;
            defpackage.ogj ogjVar = (defpackage.ogj) obj2;
            mwqVar = new defpackage.mwq(ogjVar, (kaw) this.d, (amzg) this.e, aolnVar, 0);
        } else {
            if (i != 1) {
                java.lang.Object obj3 = this.c;
                return new defpackage.mwq((ryf) obj3, (abxt) this.e, (sfb) this.d, aolnVar, 2);
            }
            mwqVar = new defpackage.mwq((defpackage.hys) this.e, (defpackage.hxw) this.d, (android.speech.tts.TextToSpeech) this.c, aolnVar, 1);
        }
        return mwqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mwq(defpackage.ogj ogjVar, kaw kawVar, amzg amzgVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = ogjVar;
        this.d = kawVar;
        this.e = amzgVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mwq(ryf ryfVar, abxt abxtVar, sfb sfbVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = ryfVar;
        this.e = abxtVar;
        this.d = sfbVar;
    }
}
