package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class alvh implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public alvh(defpackage.amzj amzjVar, defpackage.amzo amzoVar, int i) {
        this.$cid = i;
        this.a = amzoVar;
        j$.util.Objects.requireNonNull(amzjVar);
        this.b = amzjVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [anmj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [aodl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v10, types: [amzo, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        anzu anzuVar;
        boolean z = false;
        int i = 0;
        z = false;
        switch (this.$cid) {
            case 0:
                defpackage.alvi alviVar = (defpackage.alvi) this.a;
                if (alviVar.b.c == defpackage.alvd.h) {
                    java.lang.Object obj = this.b;
                    defpackage.alvi.a.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenTakeAMessageProcessor", "onPlaySuggestionTimeout", 367, "AgenticCallScreenTakeAMessageProcessor.kt").v("Timeout waiting for suggestion to finish playing. Transitioning to recording.");
                    alviVar.d = null;
                    defpackage.allj alljVar = alviVar.c;
                    xtq xtqVarO = defpackage.alpv.o(defpackage.almz.a.m());
                    xtqVarO.ah(defpackage.alnb.EVENT_STOP_BOT_SPEECH);
                    defpackage.almy almyVar = (defpackage.almy) obj;
                    alljVar.a(xtqVarO.ag(), almyVar);
                    akzm akzmVar = almyVar.d;
                    if (akzmVar == null) {
                        akzmVar = akzm.a;
                    }
                    aooh.e(akzmVar, "getAudioRelativeTimestamp(...)");
                    alviVar.g(almyVar, (aooc.av(akzmVar).toNanos() + alviVar.f.toNanos()) / 1000);
                }
                break;
            case 1:
                defpackage.alvi alviVar2 = (defpackage.alvi) this.a;
                if (alviVar2.b.c == defpackage.alvd.i) {
                    java.lang.Object obj2 = this.b;
                    defpackage.alvi.a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenTakeAMessageProcessor", "onTimeout", 442, "AgenticCallScreenTakeAMessageProcessor.kt").v("Max message duration timeout reached. Finishing flow.");
                    alviVar2.c((defpackage.almy) obj2);
                }
                break;
            case 2:
                defpackage.alvi alviVar3 = (defpackage.alvi) this.a;
                if (alviVar3.b.c == defpackage.alvd.i && !alviVar3.e) {
                    java.lang.Object obj3 = this.b;
                    defpackage.alvi.a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenTakeAMessageProcessor", "onShortSilenceTimeout", 404, "AgenticCallScreenTakeAMessageProcessor.kt").v("Short silence timeout reached without speech. Finishing flow.");
                    alviVar3.c((defpackage.almy) obj3);
                    break;
                }
                break;
            case 3:
                defpackage.alzs alzsVar = (defpackage.alzs) this.a;
                boolean z2 = alzsVar.c;
                java.lang.Object obj4 = this.b;
                if (!z2) {
                    alzsVar.a.f((defpackage.almy) obj4);
                } else {
                    defpackage.almy almyVar2 = (defpackage.almy) obj4;
                    alzsVar.a.m(alzsVar.e.c(2, almyVar2, defpackage.alsz.BOT), almyVar2);
                    alzsVar.d = true;
                }
                break;
            case 4:
                defpackage.amzi amziVar = ((defpackage.amzj) this.b).a;
                if (amziVar.isCancelled()) {
                    if ((amziVar instanceof defpackage.amzi) && amziVar.d()) {
                        z = true;
                    }
                    this.a.a(z);
                }
                break;
            case 5:
                ((defpackage.ants) this.a).b((anqw) this.b);
                break;
            case 6:
                ((defpackage.ants) this.a).b((anqw) this.b);
                break;
            case 7:
                anqw anqwVar = (anqw) this.b;
                ((defpackage.anwl) this.a).g.dv(anqwVar.p, anqwVar.q);
                break;
            case 8:
                ((defpackage.anwl) this.b).g.dy(this.a);
                break;
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                ((defpackage.anwk) this.a).f((anph) this.b);
                break;
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                ((defpackage.anwk) this.b).g(this.a);
                break;
            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                ((defpackage.anwq) this.a).f.h(this.b);
                break;
            case 12:
                ((defpackage.anwq) this.a).f.j((anmy) this.b);
                break;
            case 13:
                ((defpackage.anwq) this.a).f.i((anmw) this.b);
                break;
            case 14:
                ((defpackage.anwq) this.b).f.n((java.io.InputStream) this.a);
                break;
            case 15:
                ((defpackage.anwq) this.a).f.c((anqw) this.b);
                break;
            case 16:
                ((defpackage.anwp) this.b).a.d(this.a);
                break;
            case 17:
                ((defpackage.anwp) this.a).a.c((anph) this.b);
                break;
            case 18:
                ((defpackage.anws) this.a).b.m((defpackage.anpt) this.b);
                break;
            case 19:
                java.util.List list = java.util.Collections.EMPTY_LIST;
                defpackage.anws anwsVar = (defpackage.anws) this.b;
                anwsVar.b.m(new defpackage.anpt(defpackage.anqy.b(anqw.l.f("Unable to resolve host ".concat(java.lang.String.valueOf(anwsVar.a.j))).e((java.lang.Throwable) this.a)), defpackage.anlw.a, null));
                break;
            default:
                ?? r0 = this.a;
                defpackage.anyh anyhVar = (defpackage.anyh) this.b;
                defpackage.anye anyeVar = anyhVar.h;
                java.net.SocketAddress socketAddressB = anyeVar.b();
                anyeVar.a = r0;
                anyeVar.c();
                anyhVar.i = r0;
                anmm anmmVar = anyhVar.p.a;
                anmm anmmVar2 = anmm.b;
                if (anmmVar == anmmVar2 || anyhVar.p.a == anmm.a) {
                    while (true) {
                        if (i < anyeVar.a.size()) {
                            int iIndexOf = ((defpackage.anna) anyeVar.a.get(i)).e.indexOf(socketAddressB);
                            if (iIndexOf == -1) {
                                i++;
                            } else {
                                anyeVar.b = i;
                                anyeVar.c = iIndexOf;
                            }
                        } else if (anyhVar.p.a == anmmVar2) {
                            anzuVar = anyhVar.o;
                            anyhVar.o = null;
                            anyeVar.c();
                            anyhVar.d(anmm.d);
                        } else {
                            anyhVar.n.q(anqw.l.f("InternalSubchannel closed pending transport due to address change"));
                            anyhVar.n = null;
                            anyeVar.c();
                            anyhVar.i();
                        }
                        anzuVar = null;
                    }
                } else {
                    anzuVar = null;
                }
                if (anzuVar != null) {
                    if (anyhVar.w != null) {
                        anyhVar.k.q(anqw.l.f("InternalSubchannel closed transport early due to address change"));
                        anyhVar.w.j();
                        anyhVar.w = null;
                    }
                    anyhVar.k = anzuVar;
                    anyhVar.w = anyhVar.g.d(new defpackage.anwo(this, 7), 5L, java.util.concurrent.TimeUnit.SECONDS, anyhVar.b);
                }
                break;
        }
    }

    public /* synthetic */ alvh(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ alvh(defpackage.anws anwsVar, java.io.IOException iOException, int i) {
        this.$cid = i;
        this.b = anwsVar;
        this.a = iOException;
    }

    public alvh(defpackage.anyh anyhVar, java.util.List list, int i) {
        this.$cid = i;
        this.a = list;
        j$.util.Objects.requireNonNull(anyhVar);
        this.b = anyhVar;
    }

    public alvh(defpackage.anwl anwlVar, anqw anqwVar, int i) {
        this.$cid = i;
        this.b = anqwVar;
        j$.util.Objects.requireNonNull(anwlVar);
        this.a = anwlVar;
    }

    public alvh(defpackage.anwl anwlVar, java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
        j$.util.Objects.requireNonNull(anwlVar);
        this.b = anwlVar;
    }

    public alvh(defpackage.anwk anwkVar, anph anphVar, int i) {
        this.$cid = i;
        this.b = anphVar;
        j$.util.Objects.requireNonNull(anwkVar);
        this.a = anwkVar;
    }

    public alvh(defpackage.anwk anwkVar, java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
        j$.util.Objects.requireNonNull(anwkVar);
        this.b = anwkVar;
    }

    public alvh(defpackage.anwq anwqVar, anmj anmjVar, int i) {
        this.$cid = i;
        this.b = anmjVar;
        j$.util.Objects.requireNonNull(anwqVar);
        this.a = anwqVar;
    }

    public alvh(defpackage.anwq anwqVar, anmy anmyVar, int i) {
        this.$cid = i;
        this.b = anmyVar;
        j$.util.Objects.requireNonNull(anwqVar);
        this.a = anwqVar;
    }

    public alvh(defpackage.anwq anwqVar, anmw anmwVar, int i) {
        this.$cid = i;
        this.b = anmwVar;
        j$.util.Objects.requireNonNull(anwqVar);
        this.a = anwqVar;
    }

    public alvh(defpackage.anwq anwqVar, java.io.InputStream inputStream, int i) {
        this.$cid = i;
        this.a = inputStream;
        j$.util.Objects.requireNonNull(anwqVar);
        this.b = anwqVar;
    }

    public alvh(defpackage.anwq anwqVar, anqw anqwVar, int i) {
        this.$cid = i;
        this.b = anqwVar;
        j$.util.Objects.requireNonNull(anwqVar);
        this.a = anwqVar;
    }

    public alvh(defpackage.anwp anwpVar, defpackage.aodl aodlVar, int i) {
        this.$cid = i;
        this.a = aodlVar;
        j$.util.Objects.requireNonNull(anwpVar);
        this.b = anwpVar;
    }

    public alvh(defpackage.anwp anwpVar, anph anphVar, int i) {
        this.$cid = i;
        this.b = anphVar;
        j$.util.Objects.requireNonNull(anwpVar);
        this.a = anwpVar;
    }
}
