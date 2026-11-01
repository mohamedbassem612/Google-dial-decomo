package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class txv implements defpackage.tww {
    public static final aimz a = aimz.i("com/android/dialer/sodatranscription/impl/androidspeech/SodaAndroidSpeechSession");
    public static final java.util.Map b = ajsz.aO(new aoiu[]{new aoiu(java.util.Locale.JAPAN.toLanguageTag(), akff.l), new aoiu(java.util.Locale.FRANCE.toLanguageTag(), akff.g), new aoiu(java.util.Locale.ITALY.toLanguageTag(), akff.k), new aoiu(java.util.Locale.GERMANY.toLanguageTag(), akff.i), new aoiu(java.util.Locale.forLanguageTag("es-es").toLanguageTag(), akff.a("es-ES")), new aoiu(java.util.Locale.forLanguageTag("en-au").toLanguageTag(), akff.a("en-AU")), new aoiu(java.util.Locale.forLanguageTag("en-ie").toLanguageTag(), akff.a("en-IE")), new aoiu(java.util.Locale.forLanguageTag("en-gb").toLanguageTag(), akff.e), new aoiu(java.util.Locale.forLanguageTag("hi-in").toLanguageTag(), akff.a("hi-IN")), new aoiu(java.util.Locale.forLanguageTag("en-in").toLanguageTag(), akff.a("en-IN")), new aoiu(java.util.Locale.forLanguageTag("fr-ca").toLanguageTag(), akff.h), new aoiu(java.util.Locale.forLanguageTag("en-ca").toLanguageTag(), akff.a("en-CA"))});
    public final android.content.Context c;
    public final aoss d;
    public final aolr e;
    public final aolr f;
    public final ruc g;
    public final aoin h;
    public final defpackage.twd i;
    public defpackage.twh j;
    public final boolean k;
    public android.speech.SpeechRecognizer l;
    public java.nio.channels.FileChannel m;
    public android.os.ParcelFileDescriptor[] n;
    public boolean o;
    public boolean p;
    public final ahda q;
    public defpackage.ajxi r;
    public final apni s;

    public txv(android.content.Context context, aoss aossVar, aolr aolrVar, aolr aolrVar2, apni apniVar, ruc rucVar, aoin aoinVar, defpackage.twd twdVar, defpackage.twh twhVar, boolean z) {
        aooh.f(context, "context");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(aolrVar, "mainContext");
        aooh.f(aolrVar2, "backgroundContext");
        aooh.f(apniVar, "androidJobs");
        aooh.f(rucVar, "metrics");
        aooh.f(aoinVar, "enablePinRecognitionService");
        aooh.f(twdVar, "sodaConfig");
        aooh.f(twhVar, "listener");
        this.c = context;
        this.d = aossVar;
        this.e = aolrVar;
        this.f = aolrVar2;
        this.s = apniVar;
        this.g = rucVar;
        this.h = aoinVar;
        this.i = twdVar;
        this.j = twhVar;
        this.k = z;
        this.q = new ahda((byte[]) null);
    }

    private final java.lang.Object f(aoln aolnVar) {
        java.lang.Object objAj = aoov.aj(this.f, new defpackage.tlv(this, (aoln) null, 12), aolnVar);
        return objAj != aolu.a ? aojh.a : objAj;
    }

    @Override // defpackage.tww
    public final java.lang.Object a(aoln aolnVar) {
        java.lang.Object objA = ahvr.ag(this.d, this.q, new defpackage.txf(this, (aoln) null, 4)).a(aolnVar);
        return objA != aolu.a ? aojh.a : objA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.tww
    public final java.lang.Object b(defpackage.ajxi ajxiVar, aoln aolnVar) {
        defpackage.txs txsVar;
        aeun aeunVar;
        if (aolnVar instanceof defpackage.txs) {
            txsVar = (defpackage.txs) aolnVar;
            int i = txsVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                txsVar.c = i - Integer.MIN_VALUE;
            } else {
                txsVar = new defpackage.txs(this, aolnVar);
            }
        } else {
            txsVar = new defpackage.txs(this, aolnVar);
        }
        java.lang.Object obj = txsVar.a;
        defpackage.txp txpVar = aolu.a;
        int i2 = txsVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            j$.util.Optional optionalA = this.g.a();
            aooh.e(optionalA, "startLocalTimer(...)");
            aeun aeunVar2 = (aeun) aooh.q(optionalA);
            aosy aosyVarAg = ahvr.ag(this.d, this.q, new defpackage.txt(this, ajxiVar, null));
            txsVar.d = aeunVar2;
            txsVar.c = 1;
            java.lang.Object objA = aosyVarAg.a(txsVar);
            if (objA != txpVar) {
                obj = objA;
                aeunVar = aeunVar2;
            }
            return txpVar;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        aeunVar = txsVar.d;
        aooc.af(obj);
        txpVar = (defpackage.txp) obj;
        if (aeunVar != null) {
            this.g.p(aeunVar, ruc.bR);
        }
        return txpVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    /* JADX WARN: Code duplicated, block: B:26:0x0064  */
    /* JADX WARN: Code duplicated, block: B:27:0x006a  */
    /* JADX WARN: Code duplicated, block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(aoln aolnVar) {
        defpackage.txq txqVar;
        defpackage.ajxi ajxiVar;
        if (aolnVar instanceof defpackage.txq) {
            txqVar = (defpackage.txq) aolnVar;
            int i = txqVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                txqVar.c = i - Integer.MIN_VALUE;
            } else {
                txqVar = new defpackage.txq(this, aolnVar);
            }
        } else {
            txqVar = new defpackage.txq(this, aolnVar);
        }
        java.lang.Object obj = txqVar.a;
        aolu aoluVar = aolu.a;
        int i2 = txqVar.c;
        defpackage.ajxi ajxiVar2 = null;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(obj);
            } else if (i2 == 2) {
                aooc.af(obj);
                this.p = true;
                if (!this.o) {
                    ajxiVar = this.r;
                    if (ajxiVar == null) {
                        aooh.j("onCompleteListener");
                    } else {
                        ajxiVar2 = ajxiVar;
                    }
                    txqVar.c = 3;
                    if (ajxiVar2.b(txqVar) == aoluVar) {
                        return aoluVar;
                    }
                }
            } else {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(obj);
            }
            return aojh.a;
        }
        aooc.af(obj);
        aolr aolrVar = this.e;
        defpackage.tlv tlvVar = new defpackage.tlv(this, (aoln) null, 13, (byte[]) null);
        txqVar.c = 1;
        if (aoov.aj(aolrVar, tlvVar, txqVar) == aoluVar) {
            return aoluVar;
        }
        txqVar.c = 2;
        if (f(txqVar) == aoluVar) {
            return aoluVar;
        }
        this.p = true;
        if (!this.o) {
            ajxiVar = this.r;
            if (ajxiVar == null) {
                aooh.j("onCompleteListener");
            } else {
                ajxiVar2 = ajxiVar;
            }
            txqVar.c = 3;
            if (ajxiVar2.b(txqVar) == aoluVar) {
                return aoluVar;
            }
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(aoln aolnVar) {
        defpackage.txr txrVar;
        if (aolnVar instanceof defpackage.txr) {
            txrVar = (defpackage.txr) aolnVar;
            int i = txrVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                txrVar.c = i - Integer.MIN_VALUE;
            } else {
                txrVar = new defpackage.txr(this, aolnVar);
            }
        } else {
            txrVar = new defpackage.txr(this, aolnVar);
        }
        java.lang.Object objAj = txrVar.a;
        aolu aoluVar = aolu.a;
        int i2 = txrVar.c;
        if (i2 == 0) {
            aooc.af(objAj);
            aolr aolrVar = this.f;
            defpackage.tlv tlvVar = new defpackage.tlv(this, (aoln) null, 14, (char[]) null);
            txrVar.c = 1;
            objAj = aoov.aj(aolrVar, tlvVar, txrVar);
            if (objAj == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objAj);
        }
        aooh.e(objAj, "withContext(...)");
        return objAj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(aoln aolnVar) {
        defpackage.txu txuVar;
        if (aolnVar instanceof defpackage.txu) {
            txuVar = (defpackage.txu) aolnVar;
            int i = txuVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                txuVar.c = i - Integer.MIN_VALUE;
            } else {
                txuVar = new defpackage.txu(this, aolnVar);
            }
        } else {
            txuVar = new defpackage.txu(this, aolnVar);
        }
        java.lang.Object obj = txuVar.a;
        aolu aoluVar = aolu.a;
        int i2 = txuVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(obj);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(obj);
            }
            return aojh.a;
        }
        aooc.af(obj);
        aolr aolrVar = this.e;
        defpackage.tlv tlvVar = new defpackage.tlv(this, (aoln) null, 15, (short[]) null);
        txuVar.c = 1;
        if (aoov.aj(aolrVar, tlvVar, txuVar) == aoluVar) {
            return aoluVar;
        }
        txuVar.c = 2;
        if (f(txuVar) == aoluVar) {
            return aoluVar;
        }
        return aojh.a;
    }
}
