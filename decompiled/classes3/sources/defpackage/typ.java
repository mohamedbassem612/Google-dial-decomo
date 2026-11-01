package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class typ implements defpackage.tww {
    public static final aimz a = aimz.i("com/android/dialer/sodatranscription/impl/ondevicegrpc/SodaOnDeviceGrpcSession");
    public static final java.util.Map b = ajsz.aO(new aoiu[]{new aoiu(java.util.Locale.JAPAN.toLanguageTag(), akff.l), new aoiu(java.util.Locale.FRANCE.toLanguageTag(), akff.g), new aoiu(java.util.Locale.ITALY.toLanguageTag(), akff.k), new aoiu(java.util.Locale.GERMANY.toLanguageTag(), akff.i), new aoiu(java.util.Locale.forLanguageTag("es-es").toLanguageTag(), akff.a("es-ES")), new aoiu(java.util.Locale.forLanguageTag("es-us").toLanguageTag(), akff.a("es-US")), new aoiu(java.util.Locale.forLanguageTag("en-au").toLanguageTag(), akff.a("en-AU")), new aoiu(java.util.Locale.forLanguageTag("en-ie").toLanguageTag(), akff.a("en-IE")), new aoiu(java.util.Locale.forLanguageTag("en-gb").toLanguageTag(), akff.e), new aoiu(java.util.Locale.forLanguageTag("hi-in").toLanguageTag(), akff.a("hi-IN")), new aoiu(java.util.Locale.forLanguageTag("en-in").toLanguageTag(), akff.a("en-IN")), new aoiu(java.util.Locale.forLanguageTag("fr-ca").toLanguageTag(), akff.h), new aoiu(java.util.Locale.forLanguageTag("en-ca").toLanguageTag(), akff.a("en-CA")), new aoiu(java.util.Locale.forLanguageTag("en-sg").toLanguageTag(), akff.a("en-SG")), new aoiu(java.util.Locale.forLanguageTag("pl-pl").toLanguageTag(), akff.o), new aoiu(java.util.Locale.forLanguageTag("pt-br").toLanguageTag(), akff.c), new aoiu(java.util.Locale.forLanguageTag("id-id").toLanguageTag(), akff.j)});
    public defpackage.ajxi A;
    private final apni B;
    public final android.content.Context c;
    public final aoss d;
    public final aolr e;
    public final aolr f;
    public final afcc g;
    public final ruc h;
    public final rlv i;
    public final aoin j;
    public final aoin k;
    public final defpackage.twd l;
    public defpackage.twh m;
    public final boolean n;
    public final aoin o;
    public aohy p;
    public java.nio.channels.FileChannel q;
    public android.os.ParcelFileDescriptor[] r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public final defpackage.tyk x;
    public final akzx y;
    public final ahda z;

    public typ(android.content.Context context, aoss aossVar, aolr aolrVar, aolr aolrVar2, afcc afccVar, apni apniVar, ruc rucVar, rlv rlvVar, aoin aoinVar, aoin aoinVar2, defpackage.twd twdVar, defpackage.twh twhVar, boolean z, aoin aoinVar3) {
        aooh.f(context, "appContext");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(aolrVar, "lightweightContext");
        aooh.f(aolrVar2, "backgroundContext");
        aooh.f(apniVar, "androidJobs");
        aooh.f(rucVar, "metrics");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(aoinVar, "enableAttributionSource");
        aooh.f(aoinVar2, "enableIgnoreStopOnCompletedGrpcSession");
        aooh.f(twdVar, "sodaConfig");
        aooh.f(twhVar, "listener");
        aooh.f(aoinVar3, "enableFixSodaPfdRaceCondition");
        this.c = context;
        this.d = aossVar;
        this.e = aolrVar;
        this.f = aolrVar2;
        this.g = afccVar;
        this.B = apniVar;
        this.h = rucVar;
        this.i = rlvVar;
        this.j = aoinVar;
        this.k = aoinVar2;
        this.l = twdVar;
        this.m = twhVar;
        this.n = z;
        this.o = aoinVar3;
        this.z = new ahda((byte[]) null);
        akzx akzxVarM = amrm.a.m();
        aooh.e(akzxVarM, "newBuilder(...)");
        this.y = akzxVarM;
        this.x = new defpackage.tyk(this);
    }

    @Override // defpackage.tww
    public final java.lang.Object a(aoln aolnVar) {
        java.lang.Object objA = ahvr.ag(this.d, this.z, new defpackage.txf(this, (aoln) null, 9, (byte[]) null)).a(aolnVar);
        return objA != aolu.a ? aojh.a : objA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.tww
    public final java.lang.Object b(defpackage.ajxi ajxiVar, aoln aolnVar) {
        defpackage.tyl tylVar;
        aeun aeunVar;
        if (aolnVar instanceof defpackage.tyl) {
            tylVar = (defpackage.tyl) aolnVar;
            int i = tylVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tylVar.c = i - Integer.MIN_VALUE;
            } else {
                tylVar = new defpackage.tyl(this, aolnVar);
            }
        } else {
            tylVar = new defpackage.tyl(this, aolnVar);
        }
        java.lang.Object obj = tylVar.a;
        defpackage.tyg tygVar = aolu.a;
        int i2 = tylVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            j$.util.Optional optionalA = this.h.a();
            aooh.e(optionalA, "startLocalTimer(...)");
            aeun aeunVar2 = (aeun) aooh.q(optionalA);
            akzx akzxVar = this.y;
            boolean z = this.l.h;
            akzxVar.u();
            amrm amrmVar = akzxVar.b;
            amrm amrmVar2 = amrm.a;
            amrmVar.b |= 8;
            amrmVar.g = z;
            aosy aosyVarAg = ahvr.ag(this.d, this.z, new defpackage.tym(this, ajxiVar, null));
            tylVar.d = aeunVar2;
            tylVar.c = 1;
            java.lang.Object objA = aosyVarAg.a(tylVar);
            if (objA != tygVar) {
                obj = objA;
                aeunVar = aeunVar2;
            }
            return tygVar;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        aeunVar = tylVar.d;
        aooc.af(obj);
        tygVar = (defpackage.tyg) obj;
        if (aeunVar != null) {
            this.h.p(aeunVar, ruc.bP);
        }
        return tygVar;
    }

    public final java.lang.Object c(akzc akzcVar, aoln aolnVar) {
        java.lang.Object objAj = aoov.aj(this.f, new defpackage.tyf(this, akzcVar, (aoln) null, 2), aolnVar);
        return objAj != aolu.a ? aojh.a : objAj;
    }

    public final java.lang.Object d(aoln aolnVar) {
        java.lang.Object objAj = aoov.aj(this.f, new defpackage.tlv(this, (aoln) null, 18), aolnVar);
        return objAj != aolu.a ? aojh.a : objAj;
    }

    public final java.lang.Object e(aoln aolnVar) {
        java.lang.Object objAj = aoov.aj(this.e, new defpackage.txf(this, (aoln) null, 8), aolnVar);
        return objAj != aolu.a ? aojh.a : objAj;
    }

    public final java.lang.Object f(aoln aolnVar) {
        java.lang.Object objAj = aoov.aj(this.e, new defpackage.txf(this, (aoln) null, 10, (char[]) null), aolnVar);
        return objAj != aolu.a ? aojh.a : objAj;
    }

    public final java.lang.String g(defpackage.twd twdVar) {
        if ((twdVar.b & 16) != 0) {
            java.lang.String str = twdVar.g;
            aooh.c(str);
            return str;
        }
        java.lang.String languageTag = gus.ae(this.c).toLanguageTag();
        aooh.e(languageTag, "toLanguageTag(...)");
        return languageTag;
    }

    public final void h(aonn aonnVar) {
        this.B.i(ahvr.ag(this.d, this.z, aonnVar));
    }
}
