package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hxl extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    java.lang.Object a;
    java.lang.Object b;
    int c;
    final /* synthetic */ java.lang.Object d;
    final /* synthetic */ java.lang.Object e;
    final /* synthetic */ java.lang.Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hxl(defpackage.akr akrVar, java.lang.Object obj, alg algVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.d = akrVar;
        this.f = obj;
        this.e = algVar;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        if (this.$cid != 0) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:67:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v0, types: [hxw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [hxw, java.lang.Object] */
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object obj2;
        apdp apdpVar;
        defpackage.hxj hxjVar;
        defpackage.hxv hxvVar;
        defpackage.hxj hxjVar2;
        defpackage.hxh hxhVar;
        defpackage.hxj hxjVar3;
        defpackage.hxj hxjVar4;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object objG;
        java.lang.Object obj5;
        defpackage.akr akrVar;
        defpackage.akr akrVar2;
        if (this.$cid == 0) {
            aolu aoluVar = aolu.a;
            int i = this.c;
            try {
                if (i != 0) {
                    if (i == 1) {
                        obj2 = (defpackage.hxv) this.b;
                        apdpVar = (apdp) this.a;
                        aooc.af(obj);
                    } else if (i != 2) {
                        hxjVar3 = (defpackage.hxj) this.b;
                        hxjVar4 = (defpackage.hxj) this.a;
                        aooc.af(obj);
                    } else {
                        aooc.af(obj);
                        hxvVar = (defpackage.hxv) this.d;
                        hxjVar = new defpackage.hxj(hxvVar, new defpackage.bhp(hxvVar, (defpackage.hxw) this.e, (aoln) null, 5, (byte[]) null));
                        hxjVar2 = new defpackage.hxj(hxvVar, new defpackage.bhp(hxvVar, (defpackage.hxw) this.f, (aoln) null, 6, (char[]) null));
                        hxhVar = new defpackage.hxh(hxjVar, hxjVar2);
                        this.a = hxjVar;
                        this.b = hxjVar2;
                        this.c = 3;
                        if (hxvVar.i.a(hxhVar, this) != aoluVar) {
                            return aoluVar;
                        }
                        hxjVar3 = hxjVar2;
                        hxjVar4 = hxjVar;
                    }
                    return new defpackage.hxi((defpackage.hxv) this.d, hxjVar4, hxjVar3);
                }
                aooc.af(obj);
                java.lang.Object obj6 = this.d;
                apdp apdpVar2 = ((defpackage.hxv) obj6).l;
                this.a = apdpVar2;
                this.b = obj6;
                this.c = 1;
                if (apdpVar2.b(this) == aoluVar) {
                    return aoluVar;
                }
                obj2 = obj6;
                apdpVar = apdpVar2;
                if (((defpackage.hxv) obj2).g) {
                    defpackage.hxv.a.b().l("com/android/dialer/audio/audioinjector/AudioInjector", "playAudioLocalAndRemoteEvenIfMutedCall$<anonymous>$<anonymous>", 155, "AudioInjector.kt").v("playAudioLocalAndRemoteEvenIfMutedCall called after the call scope is removed");
                    ((defpackage.hxv) obj2).e.o(rmx.zG);
                    defpackage.hyc hycVar = defpackage.hyc.b;
                    defpackage.hxi hxiVar = new defpackage.hxi((defpackage.hxv) obj2, hycVar, hycVar);
                    apdpVar.d();
                    return hxiVar;
                }
                apdpVar.d();
                java.lang.Object obj7 = this.d;
                this.a = null;
                this.b = null;
                this.c = 2;
                if (((defpackage.hxv) obj7).d(this) == aoluVar) {
                    return aoluVar;
                }
                hxvVar = (defpackage.hxv) this.d;
                hxjVar = new defpackage.hxj(hxvVar, new defpackage.bhp(hxvVar, (defpackage.hxw) this.e, (aoln) null, 5, (byte[]) null));
                hxjVar2 = new defpackage.hxj(hxvVar, new defpackage.bhp(hxvVar, (defpackage.hxw) this.f, (aoln) null, 6, (char[]) null));
                hxhVar = new defpackage.hxh(hxjVar, hxjVar2);
                this.a = hxjVar;
                this.b = hxjVar2;
                this.c = 3;
                if (hxvVar.i.a(hxhVar, this) != aoluVar) {
                    return aoluVar;
                }
                hxjVar3 = hxjVar2;
                hxjVar4 = hxjVar;
                return new defpackage.hxi((defpackage.hxv) this.d, hxjVar4, hxjVar3);
            } catch (java.lang.Throwable th) {
                apdpVar.d();
                throw th;
            }
        }
        aolu aoluVar2 = aolu.a;
        int i2 = this.c;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    aooc.af(obj);
                    if (i2 == 2) {
                        obj5 = this.d;
                        this.a = null;
                        this.c = 3;
                        if (((defpackage.akr) obj5).l(this) == aoluVar2) {
                            return aoluVar2;
                        }
                    } else if (i2 != 3) {
                        if (i2 == 4) {
                            akrVar2 = (defpackage.akr) this.d;
                            akrVar2.c(this.f);
                            akrVar2.q(0.0f);
                            ((alg) this.e).m();
                            this.a = null;
                            this.c = 5;
                            if (akrVar2.k(this) == aoluVar2) {
                                return aoluVar2;
                            }
                        }
                    }
                    akrVar = (defpackage.akr) this.d;
                    if (!aooh.n(akrVar.a(), this.f)) {
                        if (akrVar.f() < 1.0f && akrVar.g == null) {
                            ais aisVar = defpackage.akr.a;
                            defpackage.akh akhVar = new defpackage.akh();
                            akhVar.b = null;
                            akhVar.c = false;
                            akhVar.d = akrVar.f();
                            akhVar.e.e(0, akrVar.f());
                            long j = akrVar.d;
                            akhVar.g = j;
                            akhVar.a = 0L;
                            akhVar.f = aisVar;
                            akhVar.h = aopc.j(j * (1.0d - ((double) akrVar.f())));
                            akrVar.g = akhVar;
                        }
                        this.a = null;
                        this.b = null;
                        this.c = 4;
                        if (akrVar.h(this) == aoluVar2) {
                            return aoluVar2;
                        }
                        akrVar2 = (defpackage.akr) this.d;
                        akrVar2.c(this.f);
                        akrVar2.q(0.0f);
                        ((alg) this.e).m();
                        this.a = null;
                        this.c = 5;
                        if (akrVar2.k(this) == aoluVar2) {
                            return aoluVar2;
                        }
                    }
                } else {
                    obj3 = this.b;
                    obj4 = this.a;
                    aooc.af(obj);
                }
                return aojh.a;
            }
            aooc.af(obj);
            java.lang.Object obj8 = this.d;
            java.lang.Object obj9 = this.f;
            defpackage.akr akrVar3 = (defpackage.akr) obj8;
            java.lang.Object objB = akrVar3.b();
            if (!aooh.n(obj9, objB)) {
                akrVar3.n();
                akrVar3.q(0.0f);
                alg algVar = (alg) this.e;
                algVar.z(obj9);
                algVar.s(0L);
                akrVar3.c(objB);
                akrVar3.s(obj9);
            }
            apdp apdpVar3 = akrVar3.j;
            this.a = apdpVar3;
            this.b = obj8;
            this.c = 1;
            if (apdpVar3.b(this) == aoluVar2) {
                return aoluVar2;
            }
            obj3 = obj8;
            obj4 = apdpVar3;
            java.lang.Object obj10 = ((defpackage.akr) obj3).b;
            ((apdp) obj4).d();
            if (aooh.n(this.f, obj10)) {
                akrVar = (defpackage.akr) this.d;
                if (!aooh.n(akrVar.a(), this.f)) {
                    if (akrVar.f() < 1.0f) {
                        ais aisVar2 = defpackage.akr.a;
                        defpackage.akh akhVar2 = new defpackage.akh();
                        akhVar2.b = null;
                        akhVar2.c = false;
                        akhVar2.d = akrVar.f();
                        akhVar2.e.e(0, akrVar.f());
                        long j2 = akrVar.d;
                        akhVar2.g = j2;
                        akhVar2.a = 0L;
                        akhVar2.f = aisVar2;
                        akhVar2.h = aopc.j(j2 * (1.0d - ((double) akrVar.f())));
                        akrVar.g = akhVar2;
                    }
                    this.a = null;
                    this.b = null;
                    this.c = 4;
                    if (akrVar.h(this) == aoluVar2) {
                        return aoluVar2;
                    }
                    akrVar2 = (defpackage.akr) this.d;
                    akrVar2.c(this.f);
                    akrVar2.q(0.0f);
                    ((alg) this.e).m();
                    this.a = null;
                    this.c = 5;
                    if (akrVar2.k(this) == aoluVar2) {
                        return aoluVar2;
                    }
                }
            } else {
                java.lang.Object obj11 = this.d;
                this.a = null;
                this.b = null;
                this.c = 2;
                defpackage.akr akrVar4 = (defpackage.akr) obj11;
                if (akrVar4.f == Long.MIN_VALUE) {
                    objG = cdh.d(u()).a(akrVar4.h, this);
                    if (objG != aolu.a) {
                        objG = aojh.a;
                    }
                } else {
                    objG = akrVar4.g(this);
                    if (objG != aolu.a) {
                        objG = aojh.a;
                    }
                }
                if (objG == aoluVar2) {
                    return aoluVar2;
                }
                obj5 = this.d;
                this.a = null;
                this.c = 3;
                if (((defpackage.akr) obj5).l(this) == aoluVar2) {
                    return aoluVar2;
                }
                akrVar = (defpackage.akr) this.d;
                if (!aooh.n(akrVar.a(), this.f)) {
                    if (akrVar.f() < 1.0f) {
                        ais aisVar3 = defpackage.akr.a;
                        defpackage.akh akhVar3 = new defpackage.akh();
                        akhVar3.b = null;
                        akhVar3.c = false;
                        akhVar3.d = akrVar.f();
                        akhVar3.e.e(0, akrVar.f());
                        long j3 = akrVar.d;
                        akhVar3.g = j3;
                        akhVar3.a = 0L;
                        akhVar3.f = aisVar3;
                        akhVar3.h = aopc.j(j3 * (1.0d - ((double) akrVar.f())));
                        akrVar.g = akhVar3;
                    }
                    this.a = null;
                    this.b = null;
                    this.c = 4;
                    if (akrVar.h(this) == aoluVar2) {
                        return aoluVar2;
                    }
                    akrVar2 = (defpackage.akr) this.d;
                    akrVar2.c(this.f);
                    akrVar2.q(0.0f);
                    ((alg) this.e).m();
                    this.a = null;
                    this.c = 5;
                    if (akrVar2.k(this) == aoluVar2) {
                        return aoluVar2;
                    }
                }
            }
            return aojh.a;
        } catch (java.lang.Throwable th2) {
            ((apdp) obj4).d();
            throw th2;
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [hxw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [hxw, java.lang.Object] */
    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        int i = this.$cid;
        java.lang.Object obj2 = this.d;
        if (i != 0) {
            return new defpackage.hxl((defpackage.akr) obj2, this.f, (alg) this.e, aolnVar, 1);
        }
        return new defpackage.hxl((defpackage.hxv) obj2, (defpackage.hxw) this.e, (defpackage.hxw) this.f, aolnVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hxl(defpackage.hxv hxvVar, defpackage.hxw hxwVar, defpackage.hxw hxwVar2, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.d = hxvVar;
        this.e = hxwVar;
        this.f = hxwVar2;
    }
}
