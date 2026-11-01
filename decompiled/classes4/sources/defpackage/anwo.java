package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class anwo implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public anwo(defpackage.anwq anwqVar, int i, byte[] bArr) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(anwqVar);
        this.a = anwqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v16, types: [anyj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v27, types: [annr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v45, types: [anyj, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        long jNextLong;
        java.util.ArrayList arrayList;
        boolean z2 = true;
        switch (this.$cid) {
            case 0:
                ((defpackage.anwq) this.a).f.d();
                return;
            case 1:
                ((defpackage.anwq) this.a).u();
                return;
            case 2:
                ((defpackage.anwq) this.a).f.e();
                return;
            case 3:
                ((defpackage.anwp) this.a).a.e();
                return;
            case 4:
                ?? r15 = ((vqf) ((aprf) this.a).a).a;
                anqw anqwVarF = anqw.l.f("Keepalive failed. The connection is likely gone");
                defpackage.aodh aodhVar = defpackage.aodh.SUBCHANNEL_SHUTDOWN;
                r15.a(anqwVarF);
                return;
            case 5:
                defpackage.anyh anyhVar = (defpackage.anyh) this.a;
                anyhVar.v = null;
                anyhVar.d.a(2, "CONNECTING after backoff");
                anyhVar.d(anmm.a);
                anyhVar.i();
                return;
            case 6:
                defpackage.anyh anyhVar2 = (defpackage.anyh) this.a;
                if (anyhVar2.p.a == anmm.d) {
                    anyhVar2.d.a(2, "CONNECTING as requested");
                    anyhVar2.d(anmm.a);
                    anyhVar2.i();
                    return;
                }
                return;
            case 7:
                defpackage.anyh anyhVar3 = (defpackage.anyh) ((defpackage.alvh) this.a).b;
                anzu anzuVar = anyhVar3.k;
                anyhVar3.w = null;
                anyhVar3.k = null;
                anzuVar.q(anqw.l.f("InternalSubchannel closed transport due to address change"));
                return;
            case 8:
                ?? r16 = this.a;
                defpackage.anyh anyhVar4 = (defpackage.anyh) r16;
                anyhVar4.d.a(2, "Terminated");
                anzg anzgVar = ((defpackage.anut) anyhVar4.a.b).i;
                anzgVar.w.remove(r16);
                anno.c(anzgVar.J.e, (annr) r16);
                anzgVar.i();
                return;
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                defpackage.anyf anyfVar = (defpackage.anyf) this.a;
                defpackage.anyh anyhVar5 = anyfVar.c;
                anyhVar5.u = null;
                if (anyhVar5.q != null) {
                    ahvr.bZ(anyhVar5.o == null, "Unexpected non-null activeTransport");
                    anyfVar.a.q(anyhVar5.q);
                    return;
                }
                defpackage.anwc anwcVar = anyhVar5.n;
                defpackage.anwc anwcVar2 = anyfVar.a;
                if (anwcVar == anwcVar2) {
                    anyhVar5.o = anwcVar2;
                    anyhVar5.n = null;
                    defpackage.anye anyeVar = anyhVar5.h;
                    anyhVar5.r = anyeVar.a();
                    anyhVar5.d(anmm.b);
                    defpackage.aodn aodnVar = anyhVar5.s;
                    java.lang.String str = anyhVar5.t;
                    java.lang.String strG = defpackage.anyf.g(anyeVar.a());
                    java.lang.String strF = defpackage.anyf.f(anyeVar.a(), defpackage.anna.b);
                    java.lang.String strE = defpackage.anyf.e((defpackage.anqj) anyeVar.a().a(defpackage.anxi.a));
                    defpackage.anqd anqdVar = defpackage.aodn.c;
                    aify aifyVarP = aify.p(str);
                    aify aifyVarQ = aify.q(strG, strF);
                    anpm anpmVar = aodnVar.a;
                    anpmVar.a(anqdVar, aifyVarP, aifyVarQ);
                    anpmVar.b(defpackage.aodn.e, aify.p(str), aify.r(strE, strG, strF));
                    return;
                }
                return;
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                defpackage.anyf anyfVar2 = (defpackage.anyf) this.a;
                defpackage.anwc anwcVar3 = anyfVar2.a;
                defpackage.anyh anyhVar6 = anyfVar2.c;
                java.util.Collection collection = anyhVar6.l;
                collection.remove(anwcVar3);
                if (anyhVar6.p.a == anmm.e && collection.isEmpty()) {
                    anyhVar6.f();
                    return;
                }
                return;
            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                java.lang.Object obj = this.a;
                synchronized (obj) {
                    if (((defpackage.anyk) obj).k != 6) {
                        ((defpackage.anyk) obj).k = 6;
                    } else {
                        z2 = false;
                    }
                    break;
                }
                if (z2) {
                    java.lang.Object obj2 = this.a;
                    anqw anqwVarF2 = anqw.l.f("Keepalive failed. The connection is likely gone");
                    defpackage.aodh aodhVar2 = defpackage.aodh.SUBCHANNEL_SHUTDOWN;
                    ((defpackage.anyk) obj2).l.a.a(anqwVarF2);
                    return;
                }
                return;
            case 12:
                java.lang.Object obj3 = this.a;
                synchronized (obj3) {
                    ((defpackage.anyk) obj3).f = null;
                    int i = ((defpackage.anyk) obj3).k;
                    if (i == 2) {
                        ((defpackage.anyk) obj3).k = 4;
                        ((defpackage.anyk) obj3).e = ((defpackage.anyk) obj3).c.schedule(((defpackage.anyk) obj3).g, ((defpackage.anyk) obj3).j, java.util.concurrent.TimeUnit.NANOSECONDS);
                        z = true;
                    } else {
                        if (i == 3) {
                            ((defpackage.anyk) obj3).f = ((defpackage.anyk) obj3).c.schedule(((defpackage.anyk) obj3).h, ((defpackage.anyk) obj3).i - ((defpackage.anyk) obj3).d.a(java.util.concurrent.TimeUnit.NANOSECONDS), java.util.concurrent.TimeUnit.NANOSECONDS);
                            ((defpackage.anyk) obj3).k = 2;
                        }
                        z = false;
                    }
                    break;
                }
                if (z) {
                    vqf vqfVar = ((defpackage.anyk) this.a).l;
                    java.lang.Object obj4 = vqfVar.a;
                    aprf aprfVar = new aprf(vqfVar);
                    java.lang.Object obj5 = ((defpackage.aofk) obj4).m;
                    ajbm ajbmVar = ajbm.a;
                    synchronized (obj5) {
                        ahvr.bY(((defpackage.aofk) obj4).k != null);
                        if (((defpackage.aofk) obj4).u) {
                            ((defpackage.aofk) obj4).f();
                            defpackage.anxs.b(aprfVar, ajbmVar);
                            return;
                        }
                        defpackage.anxs anxsVar = ((defpackage.aofk) obj4).t;
                        if (anxsVar != null) {
                            jNextLong = 0;
                            z2 = false;
                        } else {
                            jNextLong = ((defpackage.aofk) obj4).h.nextLong();
                            ahzh ahzhVar = new ahzh();
                            ahzhVar.e();
                            defpackage.anxs anxsVar2 = new defpackage.anxs(jNextLong, ahzhVar);
                            ((defpackage.aofk) obj4).t = anxsVar2;
                            ((defpackage.aofk) obj4).I.e++;
                            anxsVar = anxsVar2;
                        }
                        if (z2) {
                            ((defpackage.aofk) obj4).k.e(false, (int) (jNextLong >>> 32), (int) jNextLong);
                        }
                        synchronized (anxsVar) {
                            if (anxsVar.d) {
                                defpackage.anxs.a(ajbmVar, anxsVar.e != null ? new defpackage.anwo(aprfVar, 4) : new defpackage.ahlo(6));
                                return;
                            } else {
                                anxsVar.c.put(aprfVar, ajbmVar);
                                return;
                            }
                        }
                    }
                }
                return;
            case 13:
                ((anzg) this.a).f(true);
                return;
            case 14:
                anzg anzgVar2 = (anzg) this.a;
                anzgVar2.I.a(2, "Entering SHUTDOWN state");
                anzgVar2.p.a(anmm.e);
                return;
            case 15:
                anzg anzgVar3 = (anzg) this.a;
                if (anzgVar3.C) {
                    return;
                }
                anzgVar3.C = true;
                anzgVar3.h();
                return;
            case 16:
                anzg anzgVar4 = ((defpackage.anyy) this.a).b;
                anzgVar4.n.c();
                if (anzgVar4.t) {
                    anzgVar4.s.b();
                    return;
                }
                return;
            case 17:
                anzd anzdVar = (anzd) this.a;
                anzg anzgVar5 = anzdVar.c;
                if (anzgVar5.x == null) {
                    java.util.concurrent.atomic.AtomicReference atomicReference = anzdVar.a;
                    if (atomicReference.get() == anzg.f) {
                        atomicReference.set(null);
                    }
                    anzgVar5.A.a(anzg.c);
                    return;
                }
                return;
            case 18:
                anzd anzdVar2 = (anzd) this.a;
                java.util.concurrent.atomic.AtomicReference atomicReference2 = anzdVar2.a;
                if (atomicReference2.get() == anzg.f) {
                    atomicReference2.set(null);
                }
                anzg anzgVar6 = anzdVar2.c;
                java.util.Collection collection2 = anzgVar6.x;
                if (collection2 != null) {
                    java.util.Iterator it = collection2.iterator();
                    while (it.hasNext()) {
                        ((defpackage.anzc) it.next()).dv("Channel is forcefully shutdown", (java.lang.Throwable) null);
                    }
                }
                anzf anzfVar = anzgVar6.A;
                anqw anqwVar = anzg.b;
                anzfVar.a(anqwVar);
                synchronized (anzfVar.a) {
                    arrayList = new java.util.ArrayList(anzfVar.b);
                    break;
                }
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((defpackage.anvp) arrayList.get(i2)).c(anqwVar);
                }
                anzfVar.d.z.r(anqwVar);
                return;
            case 19:
                ((anzd) this.a).c.g();
                return;
            default:
                java.lang.Object obj6 = this.a;
                anzg anzgVar7 = ((defpackage.anzc) obj6).m.c;
                java.util.Collection collection3 = anzgVar7.x;
                if (collection3 != null) {
                    collection3.remove(obj6);
                    if (anzgVar7.x.isEmpty()) {
                        anzgVar7.S.c(anzgVar7.y, false);
                        anzgVar7.x = null;
                        if (anzgVar7.B.get()) {
                            anzgVar7.A.a(anzg.c);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public anwo(aprf aprfVar, int i) {
        this.$cid = i;
        this.a = aprfVar;
    }

    public anwo(defpackage.anyh anyhVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(anyhVar);
        this.a = anyhVar;
    }

    public anwo(defpackage.anwq anwqVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(anwqVar);
        this.a = anwqVar;
    }

    public anwo(defpackage.anyh anyhVar, int i, byte[] bArr) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(anyhVar);
        this.a = anyhVar;
    }

    public anwo(defpackage.alvh alvhVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(alvhVar);
        this.a = alvhVar;
    }

    public anwo(defpackage.anwq anwqVar, int i, char[] cArr) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(anwqVar);
        this.a = anwqVar;
    }

    public anwo(defpackage.anwp anwpVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(anwpVar);
        this.a = anwpVar;
    }

    public anwo(defpackage.anyh anyhVar, int i, char[] cArr) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(anyhVar);
        this.a = anyhVar;
    }

    public anwo(defpackage.anyf anyfVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(anyfVar);
        this.a = anyfVar;
    }

    public anwo(defpackage.anyf anyfVar, int i, byte[] bArr) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(anyfVar);
        this.a = anyfVar;
    }

    public anwo(defpackage.anyk anykVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(anykVar);
        this.a = anykVar;
    }

    public anwo(defpackage.anyk anykVar, int i, byte[] bArr) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(anykVar);
        this.a = anykVar;
    }

    public anwo(anzg anzgVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(anzgVar);
        this.a = anzgVar;
    }

    public anwo(anzg anzgVar, int i, byte[] bArr) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(anzgVar);
        this.a = anzgVar;
    }

    public anwo(anzg anzgVar, int i, char[] cArr) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(anzgVar);
        this.a = anzgVar;
    }

    public anwo(defpackage.anyy anyyVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(anyyVar);
        this.a = anyyVar;
    }

    public anwo(anzd anzdVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(anzdVar);
        this.a = anzdVar;
    }

    public anwo(anzd anzdVar, int i, byte[] bArr) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(anzdVar);
        this.a = anzdVar;
    }

    public anwo(anzd anzdVar, int i, char[] cArr) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(anzdVar);
        this.a = anzdVar;
    }

    public anwo(defpackage.anzc anzcVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(anzcVar);
        this.a = anzcVar;
    }
}
